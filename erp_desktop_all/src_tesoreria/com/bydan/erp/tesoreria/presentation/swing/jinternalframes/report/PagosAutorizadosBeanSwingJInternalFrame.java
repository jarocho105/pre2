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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.tesoreria.util.PagosAutorizadosConstantesFunciones;
import com.bydan.erp.tesoreria.util.report.PagosAutorizadosParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.report.PagosAutorizadosParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.report.PagosAutorizadosBean;
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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.tesoreria.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.tesoreria.util.*;

import com.bydan.erp.tesoreria.util.report.*;
import com.bydan.erp.tesoreria.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.report.*;
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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;

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
public class PagosAutorizadosBeanSwingJInternalFrame extends PagosAutorizadosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PagosAutorizadosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PagosAutorizados> pagosautorizadosValidator = new ClassValidator<PagosAutorizados>(PagosAutorizados.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PagosAutorizados pagosautorizados;	
	public PagosAutorizados pagosautorizadosAux;
	public PagosAutorizados pagosautorizadosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PagosAutorizados pagosautorizadosTotales;
	public Long idPagosAutorizadosActual;
	public Long iIdNuevoPagosAutorizados=0L;
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
	
	public Boolean isPermisoTodoPagosAutorizados;
	public Boolean isPermisoNuevoPagosAutorizados;
	public Boolean isPermisoActualizarPagosAutorizados;
	public Boolean isPermisoActualizarOriginalPagosAutorizados;
	public Boolean isPermisoEliminarPagosAutorizados;
	public Boolean isPermisoGuardarCambiosPagosAutorizados;
	public Boolean isPermisoConsultaPagosAutorizados;
	public Boolean isPermisoBusquedaPagosAutorizados;
	public Boolean isPermisoReportePagosAutorizados;
	public Boolean isPermisoPaginacionMedioPagosAutorizados;
	public Boolean isPermisoPaginacionAltoPagosAutorizados;
	public Boolean isPermisoPaginacionTodoPagosAutorizados;
	public Boolean isPermisoCopiarPagosAutorizados;
	public Boolean isPermisoVerFormPagosAutorizados;
	public Boolean isPermisoDuplicarPagosAutorizados;
	public Boolean isPermisoOrdenPagosAutorizados;
	
	
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
	
	public PagosAutorizadosParameterReturnGeneral pagosautorizadosReturnGeneral;
	public PagosAutorizadosParameterReturnGeneral pagosautorizadosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPagosAutorizados=false;
	public Boolean esParaAccionDesdeFormularioPagosAutorizados=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PagosAutorizadosSessionBeanAdditional pagosautorizadosSessionBeanAdditional=null;
	
	public PagosAutorizadosSessionBeanAdditional getPagosAutorizadosSessionBeanAdditional() {
		return this.pagosautorizadosSessionBeanAdditional;
	}
	
	public void setPagosAutorizadosSessionBeanAdditional(PagosAutorizadosSessionBeanAdditional pagosautorizadosSessionBeanAdditional) {
		try {
			this.pagosautorizadosSessionBeanAdditional=pagosautorizadosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PagosAutorizadosBeanSwingJInternalFrameAdditional pagosautorizadosBeanSwingJInternalFrameAdditional=null;
	//public class PagosAutorizadosBeanSwingJInternalFrame
	
	public PagosAutorizadosBeanSwingJInternalFrameAdditional getPagosAutorizadosBeanSwingJInternalFrameAdditional() {
		return this.pagosautorizadosBeanSwingJInternalFrameAdditional;
	}
	
	public void setPagosAutorizadosBeanSwingJInternalFrameAdditional(PagosAutorizadosBeanSwingJInternalFrameAdditional pagosautorizadosBeanSwingJInternalFrameAdditional) {
		try {
			this.pagosautorizadosBeanSwingJInternalFrameAdditional=pagosautorizadosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PagosAutorizadosLogic pagosautorizadosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PagosAutorizados pagosautorizadosBean;
	public PagosAutorizadosConstantesFunciones pagosautorizadosConstantesFunciones;
	//public PagosAutorizadosParameterReturnGeneral pagosautorizadosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<PagosAutorizados> pagosautorizadoss;	
	//public List<PagosAutorizados> pagosautorizadossEliminados;
	//public List<PagosAutorizados> pagosautorizadossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPagosAutorizados=false;
	public Boolean isVisibilidadCeldaDuplicarPagosAutorizados=true;
	public Boolean isVisibilidadCeldaCopiarPagosAutorizados=true;
	public Boolean isVisibilidadCeldaVerFormPagosAutorizados=true;
	public Boolean isVisibilidadCeldaOrdenPagosAutorizados=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPagosAutorizados=false;
	public Boolean isVisibilidadCeldaModificarPagosAutorizados=false;
	public Boolean isVisibilidadCeldaActualizarPagosAutorizados=false;
	public Boolean isVisibilidadCeldaEliminarPagosAutorizados=false;
	public Boolean isVisibilidadCeldaCancelarPagosAutorizados=false;
	public Boolean isVisibilidadCeldaGuardarPagosAutorizados=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPagosAutorizados=false;	
	
	
	public Boolean isVisibilidadBusquedaPagosAutorizados=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoPagosAutorizados() {
		return this.iIdNuevoPagosAutorizados;
	}

	public void setiIdNuevoPagosAutorizados(Long iIdNuevoPagosAutorizados) {
		this.iIdNuevoPagosAutorizados = iIdNuevoPagosAutorizados;
	}
	
	public Long getidPagosAutorizadosActual() {
		return this.idPagosAutorizadosActual;
	}

	public void setidPagosAutorizadosActual(Long idPagosAutorizadosActual) {
		this.idPagosAutorizadosActual = idPagosAutorizadosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PagosAutorizados getpagosautorizados() {
		return this.pagosautorizados;
	}

	public void setpagosautorizados(PagosAutorizados pagosautorizados) {
		this.pagosautorizados = pagosautorizados;
	}
	
	public PagosAutorizados getpagosautorizadosAux() {
		return this.pagosautorizadosAux;
	}

	public void setpagosautorizadosAux(PagosAutorizados pagosautorizadosAux) {
		this.pagosautorizadosAux = pagosautorizadosAux;
	}				
	
	public PagosAutorizados getpagosautorizadosAnterior() {
		return this.pagosautorizadosAnterior;
	}

	public void setpagosautorizadosAnterior(PagosAutorizados pagosautorizadosAnterior) {
		this.pagosautorizadosAnterior = pagosautorizadosAnterior;
	}	
	
	public PagosAutorizados getpagosautorizadosTotales() {
		return this.pagosautorizadosTotales;
	}

	public void setpagosautorizadosTotales(PagosAutorizados pagosautorizadosTotales) {
		this.pagosautorizadosTotales = pagosautorizadosTotales;
	}	
	
	public PagosAutorizados getpagosautorizadosBean() {
		return this.pagosautorizadosBean;
	}

	public void setpagosautorizadosBean(PagosAutorizados pagosautorizadosBean) {
		this.pagosautorizadosBean = pagosautorizadosBean;
	}	
	
	public PagosAutorizadosParameterReturnGeneral getpagosautorizadosReturnGeneral() {
		return this.pagosautorizadosReturnGeneral;
	}

	public void setpagosautorizadosReturnGeneral(PagosAutorizadosParameterReturnGeneral pagosautorizadosReturnGeneral) {
		this.pagosautorizadosReturnGeneral = pagosautorizadosReturnGeneral;
	}	
	
	
	public Date fecha_corteBusquedaPagosAutorizados=new Date();

	public Date getfecha_corteBusquedaPagosAutorizados() {
		return this.fecha_corteBusquedaPagosAutorizados;
	}

	public void setfecha_corteBusquedaPagosAutorizados(Date fecha_corteBusquedaPagosAutorizados) {
		this.fecha_corteBusquedaPagosAutorizados = fecha_corteBusquedaPagosAutorizados;
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
	
	
	public PagosAutorizadosLogic getPagosAutorizadosLogic()	{		
		return pagosautorizadosLogic;
	}

	public void setPagosAutorizadosLogic(PagosAutorizadosLogic pagosautorizadosLogic) {
		this.pagosautorizadosLogic = pagosautorizadosLogic;
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
	
	public Boolean getIsEsNuevoPagosAutorizados() {
		return isEsNuevoPagosAutorizados;
	}

	public void setIsEsNuevoPagosAutorizados(Boolean isEsNuevoPagosAutorizados) {
		this.isEsNuevoPagosAutorizados = isEsNuevoPagosAutorizados;
	}

	public Boolean getEsParaAccionDesdeFormularioPagosAutorizados() {
		return esParaAccionDesdeFormularioPagosAutorizados;
	}
	
	public void setEsParaAccionDesdeFormularioPagosAutorizados(Boolean esParaAccionDesdeFormularioPagosAutorizados) {
		this.esParaAccionDesdeFormularioPagosAutorizados = esParaAccionDesdeFormularioPagosAutorizados;
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

			if(this.pagosautorizadosSessionBean==null) {
				this.pagosautorizadosSessionBean=new PagosAutorizadosSessionBean();
			}

			if(!this.pagosautorizadosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(pagosautorizadosSessionBean.getlidEmpresaActual());
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

					if(this.pagosautorizados!=null) {
						this.pagosautorizados.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPagosAutorizados!=null) {
						this.jInternalFrameDetalleFormPagosAutorizados.jComboBoxid_empresaPagosAutorizados.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPagosAutorizados.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPagosAutorizados!=null) {
						if(this.jInternalFrameDetalleFormPagosAutorizados.jComboBoxid_empresaPagosAutorizados.getItemCount()>0) {
							this.jInternalFrameDetalleFormPagosAutorizados.jComboBoxid_empresaPagosAutorizados.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPagosAutorizadosGenerico)throws Exception
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
				jComboBoxid_empresaPagosAutorizadosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPagosAutorizadosGenerico!=null && jComboBoxid_empresaPagosAutorizadosGenerico.getItemCount()>0) {
					jComboBoxid_empresaPagosAutorizadosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(PagosAutorizados pagosautorizados,JComboBox jComboBoxid_empresaPagosAutorizadosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPagosAutorizadosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPagosAutorizados.jComboBoxid_empresaPagosAutorizados.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPagosAutorizadosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				pagosautorizados.setid_empresa(empresaAux.getId());
				pagosautorizados.setempresa_descripcion(PagosAutorizadosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				pagosautorizados.setEmpresa(empresaAux);			}
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

					if(!PagosAutorizadosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPagosAutorizados!=null) { 
							this.jInternalFrameDetalleFormPagosAutorizados.jComboBoxid_empresaPagosAutorizados.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPagosAutorizados.jComboBoxid_empresaPagosAutorizados.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPagosAutorizados!=null) { 
					}

					if(!PagosAutorizadosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormPagosAutorizados!=null) {
							this.jInternalFrameDetalleFormPagosAutorizados.jComboBoxid_empresaPagosAutorizados.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPagosAutorizados!=null) {
							this.jInternalFrameDetalleFormPagosAutorizados.jComboBoxid_empresaPagosAutorizados.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesPagosAutorizados() throws Exception {
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
		
	public PagosAutorizadosParameterReturnGeneral getPagosAutorizadosParameterGeneral() {
		return this.pagosautorizadosParameterGeneral;
	}
	
	public void setPagosAutorizadosParameterGeneral(PagosAutorizadosParameterReturnGeneral pagosautorizadosParameterGeneral) {
		this.pagosautorizadosParameterGeneral = pagosautorizadosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPagosAutorizados() {
		return isPermisoTodoPagosAutorizados;
	}

	public void setIsPermisoTodoPagosAutorizados(Boolean isPermisoTodoPagosAutorizados) {
		this.isPermisoTodoPagosAutorizados = isPermisoTodoPagosAutorizados;
	}

	public Boolean getIsPermisoNuevoPagosAutorizados() {
		return isPermisoNuevoPagosAutorizados;
	}

	public void setIsPermisoNuevoPagosAutorizados(Boolean isPermisoNuevoPagosAutorizados) {
		this.isPermisoNuevoPagosAutorizados = isPermisoNuevoPagosAutorizados;
	}

	public Boolean getIsPermisoActualizarPagosAutorizados() {
		return isPermisoActualizarPagosAutorizados;
	}

	public void setIsPermisoActualizarPagosAutorizados(Boolean isPermisoActualizarPagosAutorizados) {
		this.isPermisoActualizarPagosAutorizados = isPermisoActualizarPagosAutorizados;
	}

	public Boolean getIsPermisoEliminarPagosAutorizados() {
		return isPermisoEliminarPagosAutorizados;
	}

	public void setIsPermisoEliminarPagosAutorizados(Boolean isPermisoEliminarPagosAutorizados) {
		this.isPermisoEliminarPagosAutorizados = isPermisoEliminarPagosAutorizados;
	}

	public Boolean getIsPermisoGuardarCambiosPagosAutorizados() {
		return isPermisoGuardarCambiosPagosAutorizados;
	}

	public void setIsPermisoGuardarCambiosPagosAutorizados(Boolean isPermisoGuardarCambiosPagosAutorizados) {
		this.isPermisoGuardarCambiosPagosAutorizados = isPermisoGuardarCambiosPagosAutorizados;
	}
	
	public Boolean getIsPermisoConsultaPagosAutorizados() {
		return isPermisoConsultaPagosAutorizados;
	}

	public void setIsPermisoConsultaPagosAutorizados(Boolean isPermisoConsultaPagosAutorizados) {
		this.isPermisoConsultaPagosAutorizados = isPermisoConsultaPagosAutorizados;
	}

	public Boolean getIsPermisoBusquedaPagosAutorizados() {
		return isPermisoBusquedaPagosAutorizados;
	}

	public void setIsPermisoBusquedaPagosAutorizados(Boolean isPermisoBusquedaPagosAutorizados) {
		this.isPermisoBusquedaPagosAutorizados = isPermisoBusquedaPagosAutorizados;
	}

	public Boolean getIsPermisoReportePagosAutorizados() {
		return isPermisoReportePagosAutorizados;
	}

	public void setIsPermisoReportePagosAutorizados(Boolean isPermisoReportePagosAutorizados) {
		this.isPermisoReportePagosAutorizados = isPermisoReportePagosAutorizados;
	}
	
	public Boolean getIsPermisoPaginacionMedioPagosAutorizados() {
		return isPermisoPaginacionMedioPagosAutorizados;
	}

	public void setIsPermisoPaginacionMedioPagosAutorizados(Boolean isPermisoPaginacionMedioPagosAutorizados) {
		this.isPermisoPaginacionMedioPagosAutorizados = isPermisoPaginacionMedioPagosAutorizados;
	}
	
	public Boolean getIsPermisoPaginacionTodoPagosAutorizados() {
		return isPermisoPaginacionTodoPagosAutorizados;
	}

	public void setIsPermisoPaginacionTodoPagosAutorizados(Boolean isPermisoPaginacionTodoPagosAutorizados) {
		this.isPermisoPaginacionTodoPagosAutorizados = isPermisoPaginacionTodoPagosAutorizados;
	}
	
	public Boolean getIsPermisoPaginacionAltoPagosAutorizados() {
		return isPermisoPaginacionAltoPagosAutorizados;
	}

	public void setIsPermisoPaginacionAltoPagosAutorizados(Boolean isPermisoPaginacionAltoPagosAutorizados) {
		this.isPermisoPaginacionAltoPagosAutorizados = isPermisoPaginacionAltoPagosAutorizados;
	}
	
	public Boolean getIsPermisoCopiarPagosAutorizados() {
		return isPermisoCopiarPagosAutorizados;
	}

	public void setIsPermisoCopiarPagosAutorizados(Boolean isPermisoCopiarPagosAutorizados) {
		this.isPermisoCopiarPagosAutorizados = isPermisoCopiarPagosAutorizados;
	}
	
	public Boolean getIsPermisoVerFormPagosAutorizados() {
		return isPermisoVerFormPagosAutorizados;
	}

	public void setIsPermisoVerFormPagosAutorizados(Boolean isPermisoVerFormPagosAutorizados) {
		this.isPermisoVerFormPagosAutorizados = isPermisoVerFormPagosAutorizados;
	}
	
	public Boolean getIsPermisoDuplicarPagosAutorizados() {
		return isPermisoDuplicarPagosAutorizados;
	}

	public void setIsPermisoDuplicarPagosAutorizados(Boolean isPermisoDuplicarPagosAutorizados) {
		this.isPermisoDuplicarPagosAutorizados = isPermisoDuplicarPagosAutorizados;
	}
	
	public Boolean getIsPermisoOrdenPagosAutorizados() {
		return isPermisoOrdenPagosAutorizados;
	}

	public void setIsPermisoOrdenPagosAutorizados(Boolean isPermisoOrdenPagosAutorizados) {
		this.isPermisoOrdenPagosAutorizados = isPermisoOrdenPagosAutorizados;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPagosAutorizados() {
		return isVisibilidadCeldaNuevoPagosAutorizados;
	}

	public void setIsVisibilidadCeldaNuevoPagosAutorizados(Boolean isVisibilidadCeldaNuevoPagosAutorizados) {
		this.isVisibilidadCeldaNuevoPagosAutorizados = isVisibilidadCeldaNuevoPagosAutorizados;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPagosAutorizados() {
		return isVisibilidadCeldaDuplicarPagosAutorizados;
	}

	public void setIsVisibilidadCeldaDuplicarPagosAutorizados(Boolean isVisibilidadCeldaDuplicarPagosAutorizados) {
		this.isVisibilidadCeldaDuplicarPagosAutorizados = isVisibilidadCeldaDuplicarPagosAutorizados;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPagosAutorizados() {
		return isVisibilidadCeldaCopiarPagosAutorizados;
	}

	public void setIsVisibilidadCeldaCopiarPagosAutorizados(Boolean isVisibilidadCeldaCopiarPagosAutorizados) {
		this.isVisibilidadCeldaCopiarPagosAutorizados = isVisibilidadCeldaCopiarPagosAutorizados;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPagosAutorizados() {
		return isVisibilidadCeldaVerFormPagosAutorizados;
	}

	public void setIsVisibilidadCeldaVerFormPagosAutorizados(Boolean isVisibilidadCeldaVerFormPagosAutorizados) {
		this.isVisibilidadCeldaVerFormPagosAutorizados = isVisibilidadCeldaVerFormPagosAutorizados;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPagosAutorizados() {
		return isVisibilidadCeldaOrdenPagosAutorizados;
	}

	public void setIsVisibilidadCeldaOrdenPagosAutorizados(Boolean isVisibilidadCeldaOrdenPagosAutorizados) {
		this.isVisibilidadCeldaOrdenPagosAutorizados = isVisibilidadCeldaOrdenPagosAutorizados;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPagosAutorizados() {
		return isVisibilidadCeldaNuevoRelacionesPagosAutorizados;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPagosAutorizados(Boolean isVisibilidadCeldaNuevoRelacionesPagosAutorizados) {
		this.isVisibilidadCeldaNuevoRelacionesPagosAutorizados = isVisibilidadCeldaNuevoRelacionesPagosAutorizados;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPagosAutorizados() {
		return isVisibilidadCeldaModificarPagosAutorizados;
	}

	public void setIsVisibilidadCeldaModificarPagosAutorizados(Boolean isVisibilidadCeldaModificarPagosAutorizados) {
		this.isVisibilidadCeldaModificarPagosAutorizados = isVisibilidadCeldaModificarPagosAutorizados;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPagosAutorizados() {
		return isVisibilidadCeldaActualizarPagosAutorizados;
	}

	public void setIsVisibilidadCeldaActualizarPagosAutorizados(Boolean isVisibilidadCeldaActualizarPagosAutorizados) {
		this.isVisibilidadCeldaActualizarPagosAutorizados = isVisibilidadCeldaActualizarPagosAutorizados;
	}

	public Boolean getIsVisibilidadCeldaEliminarPagosAutorizados() {
		return isVisibilidadCeldaEliminarPagosAutorizados;
	}

	public void setIsVisibilidadCeldaEliminarPagosAutorizados(Boolean isVisibilidadCeldaEliminarPagosAutorizados) {
		this.isVisibilidadCeldaEliminarPagosAutorizados = isVisibilidadCeldaEliminarPagosAutorizados;
	}

	public Boolean getIsVisibilidadCeldaCancelarPagosAutorizados() {
		return isVisibilidadCeldaCancelarPagosAutorizados;
	}

	public void setIsVisibilidadCeldaCancelarPagosAutorizados(Boolean isVisibilidadCeldaCancelarPagosAutorizados) {
		this.isVisibilidadCeldaCancelarPagosAutorizados = isVisibilidadCeldaCancelarPagosAutorizados;
	}

	public Boolean getIsVisibilidadCeldaGuardarPagosAutorizados() {
		return isVisibilidadCeldaGuardarPagosAutorizados;
	}

	public void setIsVisibilidadCeldaGuardarPagosAutorizados(Boolean isVisibilidadCeldaGuardarPagosAutorizados) {
		this.isVisibilidadCeldaGuardarPagosAutorizados = isVisibilidadCeldaGuardarPagosAutorizados;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPagosAutorizados() {
		return isVisibilidadCeldaGuardarCambiosPagosAutorizados;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPagosAutorizados(Boolean isVisibilidadCeldaGuardarCambiosPagosAutorizados) {
		this.isVisibilidadCeldaGuardarCambiosPagosAutorizados = isVisibilidadCeldaGuardarCambiosPagosAutorizados;
	}
		
	public PagosAutorizadosSessionBean getpagosautorizadosSessionBean() {
		return this.pagosautorizadosSessionBean;
	}
	
	public void setpagosautorizadosSessionBean(PagosAutorizadosSessionBean pagosautorizadosSessionBean) {
		this.pagosautorizadosSessionBean=pagosautorizadosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPagosAutorizados() {
		return this.isVisibilidadBusquedaPagosAutorizados;
	}

	public void setisVisibilidadBusquedaPagosAutorizados(Boolean isVisibilidadBusquedaPagosAutorizados) {
		this.isVisibilidadBusquedaPagosAutorizados=isVisibilidadBusquedaPagosAutorizados;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(PagosAutorizados pagosautorizados)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(pagosautorizados,null);
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
	
	public void bugActualizarReferenciaActual(PagosAutorizados pagosautorizados,PagosAutorizados pagosautorizadosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPagosAutorizados(pagosautorizados);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		pagosautorizadosAux.setId(pagosautorizados.getId());
		pagosautorizadosAux.setVersionRow(pagosautorizados.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(PagosAutorizados pagosautorizadosLocal) throws Exception {
		
		if(this.pagosautorizadosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PagosAutorizados pagosautorizadosLocal) throws Exception {	
		if(this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				pagosautorizadosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPagosAutorizadosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.pagosautorizados =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.pagosautorizados =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = pagosautorizadosValidator.getInvalidValues(this.pagosautorizados);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PagosAutorizados pagosautorizados,List<PagosAutorizados> pagosautorizadoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(PagosAutorizados pagosautorizados,List<PagosAutorizados> pagosautorizadoss) throws Exception {
		try	{			
			PagosAutorizadosConstantesFunciones.actualizarSelectedLista(pagosautorizados,pagosautorizadoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PagosAutorizados> pagosautorizadossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				pagosautorizadossLocal=this.pagosautorizadosLogic.getPagosAutorizadoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				pagosautorizadossLocal=this.pagosautorizadoss;
			}
			//ARCHITECTURE
		
			for(PagosAutorizados pagosautorizadosLocal:pagosautorizadossLocal) {
				if(this.permiteMantenimiento(pagosautorizadosLocal) && pagosautorizadosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PagosAutorizadosConstantesFunciones.getPagosAutorizadosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PagosAutorizadosConstantesFunciones.NOMBRECLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizados.jLabelnombre_clientePagosAutorizados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutorizadosConstantesFunciones.NUMEROFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizados.jLabelnumero_facturaPagosAutorizados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutorizadosConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizados.jLabelfecha_emisionPagosAutorizados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutorizadosConstantesFunciones.FECHAVENCIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizados.jLabelfecha_vencimientoPagosAutorizados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutorizadosConstantesFunciones.NOMBREBANCO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizados.jLabelnombre_bancoPagosAutorizados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutorizadosConstantesFunciones.VALORPORPAGAR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizados.jLabelvalor_por_pagarPagosAutorizados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutorizadosConstantesFunciones.VALORCANCELADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizados.jLabelvalor_canceladoPagosAutorizados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutorizadosConstantesFunciones.NUMEROCUENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizados.jLabelnumero_cuentaPagosAutorizados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutorizadosConstantesFunciones.ESTAAUTORIZADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizados.jLabelesta_autorizadoPagosAutorizados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutorizadosConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizados.jLabeldescripcionPagosAutorizados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutorizadosConstantesFunciones.FECHACORTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizados.jLabelfecha_corte_datoPagosAutorizados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutorizadosConstantesFunciones.ESTADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizados.jLabelestadoPagosAutorizados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutorizadosConstantesFunciones.CODIGOCUENTACONCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizados.jLabelcodigo_cuenta_con_clientePagosAutorizados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutorizadosConstantesFunciones.CODIGOCUENTACONBANCO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizados.jLabelcodigo_cuenta_con_bancoPagosAutorizados,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPagosAutorizados!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutorizados.jLabelnombre_clientePagosAutorizados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutorizados.jLabelnumero_facturaPagosAutorizados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutorizados.jLabelfecha_emisionPagosAutorizados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutorizados.jLabelfecha_vencimientoPagosAutorizados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutorizados.jLabelnombre_bancoPagosAutorizados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutorizados.jLabelvalor_por_pagarPagosAutorizados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutorizados.jLabelvalor_canceladoPagosAutorizados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutorizados.jLabelnumero_cuentaPagosAutorizados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutorizados.jLabelesta_autorizadoPagosAutorizados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutorizados.jLabeldescripcionPagosAutorizados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutorizados.jLabelfecha_corte_datoPagosAutorizados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutorizados.jLabelestadoPagosAutorizados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutorizados.jLabelcodigo_cuenta_con_clientePagosAutorizados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutorizados.jLabelcodigo_cuenta_con_bancoPagosAutorizados,"");
		
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
		this.iIdNuevoPagosAutorizados--;	
		
		
		this.pagosautorizadosAux=new PagosAutorizados();
		
		this.pagosautorizadosAux.setId(this.iIdNuevoPagosAutorizados);
		this.pagosautorizadosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.pagosautorizadosLogic.getPagosAutorizadoss().add(this.pagosautorizadosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.pagosautorizadoss.add(this.pagosautorizadosAux);
		}
		//ARCHITECTURE
		
		this.pagosautorizados=this.pagosautorizadosAux;
		
		if(PagosAutorizadosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPagosAutorizados(this.pagosautorizados);
			this.setVariablesObjetoActualToFormularioForeignKeyPagosAutorizados(this.pagosautorizados);
		}
				
		//this.setDefaultControlesPagosAutorizados();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPagosAutorizados();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPagosAutorizados();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPagosAutorizados();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPagosAutorizados(this.pagosautorizadosBean,this.pagosautorizados,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPagosAutorizados(this.pagosautorizadosReturnGeneral,this.pagosautorizadosBean,false);
		
		if(this.pagosautorizadosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPagosAutorizados(this.pagosautorizadosReturnGeneral.getPagosAutorizados());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPagosAutorizados(this.pagosautorizadosReturnGeneral.getPagosAutorizados());
		}
		
		if(this.pagosautorizadosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPagosAutorizados(this.pagosautorizadosReturnGeneral.getPagosAutorizados(),classes);//this.pagosautorizadosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPagosAutorizados(this.pagosautorizados,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPagosAutorizados();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPagosAutorizados();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PagosAutorizadosBeanSwingJInternalFrameAdditional.RecargarFormPagosAutorizados(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPagosAutorizados(false);
						
			if(pagosautorizadosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PagosAutorizadosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPagosAutorizados();
			}
			
			this.actualizarVisualTableDatosPagosAutorizados();
			
			this.jTableDatosPagosAutorizados.setRowSelectionInterval(this.getIndiceNuevoPagosAutorizados(), this.getIndiceNuevoPagosAutorizados());
			
			this.seleccionarFilaTablaPagosAutorizadosActual();
						
			this.actualizarEstadoCeldasBotonesPagosAutorizados("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPagosAutorizados(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPagosAutorizados.jDateChooserfecha_cortePagosAutorizados.setEnabled(isHabilitar && this.pagosautorizadosConstantesFunciones.activarfecha_cortePagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jTextAreanombre_clientePagosAutorizados.setEnabled(isHabilitar && this.pagosautorizadosConstantesFunciones.activarnombre_clientePagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldnumero_facturaPagosAutorizados.setEnabled(isHabilitar && this.pagosautorizadosConstantesFunciones.activarnumero_facturaPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jDateChooserfecha_emisionPagosAutorizados.setEnabled(isHabilitar && this.pagosautorizadosConstantesFunciones.activarfecha_emisionPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jDateChooserfecha_vencimientoPagosAutorizados.setEnabled(isHabilitar && this.pagosautorizadosConstantesFunciones.activarfecha_vencimientoPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jTextAreanombre_bancoPagosAutorizados.setEnabled(isHabilitar && this.pagosautorizadosConstantesFunciones.activarnombre_bancoPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldvalor_por_pagarPagosAutorizados.setEnabled(isHabilitar && this.pagosautorizadosConstantesFunciones.activarvalor_por_pagarPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldvalor_canceladoPagosAutorizados.setEnabled(isHabilitar && this.pagosautorizadosConstantesFunciones.activarvalor_canceladoPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldnumero_cuentaPagosAutorizados.setEnabled(isHabilitar && this.pagosautorizadosConstantesFunciones.activarnumero_cuentaPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jCheckBoxesta_autorizadoPagosAutorizados.setEnabled(isHabilitar && this.pagosautorizadosConstantesFunciones.activaresta_autorizadoPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jTextAreadescripcionPagosAutorizados.setEnabled(isHabilitar && this.pagosautorizadosConstantesFunciones.activardescripcionPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jDateChooserfecha_corte_datoPagosAutorizados.setEnabled(isHabilitar && this.pagosautorizadosConstantesFunciones.activarfecha_corte_datoPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jTextAreaestadoPagosAutorizados.setEnabled(isHabilitar && this.pagosautorizadosConstantesFunciones.activarestadoPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldcodigo_cuenta_con_clientePagosAutorizados.setEnabled(isHabilitar && this.pagosautorizadosConstantesFunciones.activarcodigo_cuenta_con_clientePagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldcodigo_cuenta_con_bancoPagosAutorizados.setEnabled(isHabilitar && this.pagosautorizadosConstantesFunciones.activarcodigo_cuenta_con_bancoPagosAutorizados);	
		//
		this.jInternalFrameDetalleFormPagosAutorizados.jComboBoxid_empresaPagosAutorizados.setEnabled(isHabilitar && this.pagosautorizadosConstantesFunciones.activarid_empresaPagosAutorizados);
	};
	
	public void setDefaultControlesPagosAutorizados() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPagosAutorizados(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.pagosautorizadosSessionBean.setConGuardarRelaciones(true);			
			this.pagosautorizadosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPagosAutorizados.jTabbedPaneRelacionesPagosAutorizados.setVisible(true);
			
					
		} else {
			//this.pagosautorizadosSessionBean.setConGuardarRelaciones(false);			
			this.pagosautorizadosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPagosAutorizados.jTabbedPaneRelacionesPagosAutorizados.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPagosAutorizados() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PagosAutorizados pagosautorizadosAux:this.pagosautorizadosLogic.getPagosAutorizadoss()) {
				if(pagosautorizadosAux.getId().equals(this.iIdNuevoPagosAutorizados)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PagosAutorizados pagosautorizadosAux:this.pagosautorizadoss) {
				if(pagosautorizadosAux.getId().equals(this.iIdNuevoPagosAutorizados)) {
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
	
	public int getIndiceActualPagosAutorizados(PagosAutorizados pagosautorizados,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PagosAutorizados pagosautorizadosAux:this.pagosautorizadosLogic.getPagosAutorizadoss()) {
				if(pagosautorizadosAux.getId().equals(pagosautorizados.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PagosAutorizados pagosautorizadosAux:this.pagosautorizadoss) {
				if(pagosautorizadosAux.getId().equals(pagosautorizados.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPagosAutorizados(PagosAutorizados pagosautorizadosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PagosAutorizados pagosautorizadosAux:this.pagosautorizadosLogic.getPagosAutorizadoss()) {
				if(pagosautorizadosAux.getPagosAutorizadosOriginal().getId().equals(pagosautorizadosOriginal.getId())) {
					existe=true;
					pagosautorizadosOriginal.setId(pagosautorizadosAux.getId());
					pagosautorizadosOriginal.setVersionRow(pagosautorizadosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PagosAutorizados pagosautorizadosAux:this.pagosautorizadoss) {
				if(pagosautorizadosAux.getPagosAutorizadosOriginal().getId().equals(pagosautorizadosOriginal.getId())) {
					existe=true;
					pagosautorizadosOriginal.setId(pagosautorizadosAux.getId());
					pagosautorizadosOriginal.setVersionRow(pagosautorizadosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPagosAutorizados(Boolean esParaCancelar) throws Exception {
		pagosautorizadossAux=new ArrayList<PagosAutorizados>();
		pagosautorizadosAux=new PagosAutorizados();
		
		if(!this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PagosAutorizados pagosautorizadosAux:this.pagosautorizadosLogic.getPagosAutorizadoss()) {
					if(pagosautorizadosAux.getId()<0) {
						pagosautorizadossAux.add(pagosautorizadosAux);
					}		
				}
				this.iIdNuevoPagosAutorizados=0L;
				this.pagosautorizadosLogic.getPagosAutorizadoss().removeAll(pagosautorizadossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PagosAutorizados pagosautorizadosAux:this.pagosautorizadoss) {
					if(pagosautorizadosAux.getId()<0) {
						pagosautorizadossAux.add(pagosautorizadosAux);
					}		
				}
				this.iIdNuevoPagosAutorizados=0L;
				this.pagosautorizadoss.removeAll(pagosautorizadossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPagosAutorizados 
					&& this.pagosautorizadosLogic.getPagosAutorizadoss().size()>0
					) {
					pagosautorizadosAux=this.pagosautorizadosLogic.getPagosAutorizadoss().get(this.pagosautorizadosLogic.getPagosAutorizadoss().size() - 1);
				
					if(pagosautorizadosAux.getId()<0) {
						this.pagosautorizadosLogic.getPagosAutorizadoss().remove(pagosautorizadosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPagosAutorizados && this.pagosautorizadoss.size()>0) {
					pagosautorizadosAux=this.pagosautorizadoss.get(this.pagosautorizadoss.size() - 1);
				
					if(pagosautorizadosAux.getId()<0) {
						this.pagosautorizadoss.remove(pagosautorizadosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPagosAutorizados(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(pagosautorizados.getId()<0) {
				this.pagosautorizadosLogic.getPagosAutorizadoss().remove(this.pagosautorizados);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(pagosautorizados.getId()<0) {
				this.pagosautorizadoss.remove(this.pagosautorizados);
			}
		}			
	}
	
	public void setEstadosInicialesPagosAutorizados(List<PagosAutorizados> pagosautorizadossAux) throws Exception {
		PagosAutorizadosConstantesFunciones.setEstadosInicialesPagosAutorizados(pagosautorizadossAux);
	}
	
	public void setEstadosInicialesPagosAutorizados(PagosAutorizados pagosautorizadosAux) throws Exception {
		PagosAutorizadosConstantesFunciones.setEstadosInicialesPagosAutorizados(pagosautorizadosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPagosAutorizadosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPagosAutorizados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPagosAutorizadosActual()) {
				if(!this.isEsNuevoPagosAutorizados) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPagosAutorizados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPagosAutorizados=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPagosAutorizadosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Pagos Autorizados ?", "MANTENIMIENTO DE Pagos Autorizados", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPagosAutorizados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PagosAutorizados pagosautorizados) throws Exception {
		PagosAutorizadosConstantesFunciones.seleccionarAsignar(this.pagosautorizados,pagosautorizados);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPagosAutorizados=this.isPermisoActualizarOriginalPagosAutorizados;
			
			
			this.seleccionarAsignar(pagosautorizados);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesPagosAutorizados("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.pagosautorizadosSessionBean.setsFuncionBusquedaRapida(this.pagosautorizadosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPagosAutorizados) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPagosAutorizados(esParaCancelar);				
				this.cancelarNuevoPagosAutorizados(esParaCancelar);								
			}
			
			this.pagosautorizados=new PagosAutorizados();
			
			this.inicializarPagosAutorizados();
			
			this.actualizarEstadoCeldasBotonesPagosAutorizados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPagosAutorizados() throws Exception {
		try {
			PagosAutorizadosConstantesFunciones.inicializarPagosAutorizados(this.pagosautorizados);
			
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
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.pagosautorizadosLogic.getPagosAutorizadoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePagosAutorizadoss(String sAccionBusqueda,List<PagosAutorizados> pagosautorizadossParaReportes) throws Exception {
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
					sPathReporteFinal="PagosAutorizados"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PagosAutorizadosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PagosAutorizadosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PagosAutorizados"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Pagos Autorizadoses");		
		parameters.put("busquedapor", PagosAutorizadosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePagosAutorizados=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PagosAutorizadosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PagosAutorizadosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePagosAutorizados=new JRBeanArrayDataSource(PagosAutorizadosJInternalFrame.TraerPagosAutorizadosBeans(pagosautorizadossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePagosAutorizados);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PagosAutorizadosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PagosAutorizadosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PagosAutorizadosBean.TraerPagosAutorizadosBeans(pagosautorizadossParaReportes).toArray()));
							
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
				this.generarExcelReportePagosAutorizadoss(sAccionBusqueda,sTipoArchivoReporte,pagosautorizadossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPagosAutorizadoss(sAccionBusqueda,sTipoArchivoReporte,pagosautorizadossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPagosAutorizadosActionPerformed(null);
					//this.generarExcelReportePagosAutorizadoss(sAccionBusqueda,sTipoArchivoReporte,pagosautorizadossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPagosAutorizadoss(sAccionBusqueda,sTipoArchivoReporte,pagosautorizadossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPagosAutorizadoss(sAccionBusqueda,sTipoArchivoReporte,pagosautorizadossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPagosAutorizadoss(sAccionBusqueda,sTipoArchivoReporte,pagosautorizadossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePagosAutorizadoss(String sAccionBusqueda,String sTipoArchivoReporte,List<PagosAutorizados> pagosautorizadossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pagosautorizados";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PagosAutorizadoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPagosAutorizados("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PagosAutorizados pagosautorizados : pagosautorizadossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PagosAutorizadosConstantesFunciones.generarExcelReporteDataPagosAutorizados("NORMAL",row,workbook,pagosautorizados,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Autorizados",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPagosAutorizados(String sTipo,Row row,Workbook workbook) {
		
		PagosAutorizadosConstantesFunciones.generarExcelReporteHeaderPagosAutorizados(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPagosAutorizadoss(String sAccionBusqueda,String sTipoArchivoReporte,List<PagosAutorizados> pagosautorizadossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pagosautorizados_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PagosAutorizadoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PagosAutorizados pagosautorizados : pagosautorizadossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PagosAutorizadosConstantesFunciones.getPagosAutorizadosDescripcion(pagosautorizados));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutorizadosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautorizados.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutorizadosConstantesFunciones.LABEL_FECHACORTE0))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_FECHACORTE0);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautorizados.getfecha_corte());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautorizados.getnombre_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautorizados.getnumero_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutorizadosConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautorizados.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutorizadosConstantesFunciones.LABEL_FECHAVENCIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_FECHAVENCIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautorizados.getfecha_vencimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautorizados.getnombre_banco());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutorizadosConstantesFunciones.LABEL_VALORPORPAGAR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_VALORPORPAGAR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautorizados.getvalor_por_pagar());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutorizadosConstantesFunciones.LABEL_VALORCANCELADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_VALORCANCELADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautorizados.getvalor_cancelado());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautorizados.getnumero_cuenta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutorizadosConstantesFunciones.LABEL_ESTAAUTORIZADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_ESTAAUTORIZADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(pagosautorizados.getesta_autorizado()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutorizadosConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautorizados.getdescripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutorizadosConstantesFunciones.LABEL_FECHACORTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_FECHACORTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautorizados.getfecha_corte_dato());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutorizadosConstantesFunciones.LABEL_ESTADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_ESTADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautorizados.getestado());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautorizados.getcodigo_cuenta_con_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautorizados.getcodigo_cuenta_con_banco());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Autorizados",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPagosAutorizadoss(String sAccionBusqueda,String sTipoArchivoReporte,List<PagosAutorizados> pagosautorizadossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PagosAutorizados> pagosautorizadossRespaldo=null;
		
		classes=PagosAutorizadosConstantesFunciones.getClassesRelationshipsOfPagosAutorizados(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.pagosautorizadosLogic.setDatosCliente(this.datosCliente);
		this.pagosautorizadosLogic.setDatosDeep(this.datosDeep);
		this.pagosautorizadosLogic.setIsConDeep(true);
		
		pagosautorizadossRespaldo=this.pagosautorizadosLogic.getPagosAutorizadoss();
		
		this.pagosautorizadosLogic.setPagosAutorizadoss(pagosautorizadossParaReportes);	
		this.pagosautorizadosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		pagosautorizadossParaReportes=this.pagosautorizadosLogic.getPagosAutorizadoss();
		this.pagosautorizadosLogic.setPagosAutorizadoss(pagosautorizadossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pagosautorizados_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PagosAutorizadoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPagosAutorizados("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PagosAutorizados pagosautorizados : pagosautorizadossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPagosAutorizados("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PagosAutorizadosConstantesFunciones.generarExcelReporteDataPagosAutorizados("NORMAL",row,workbook,pagosautorizados,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PagosAutorizadosConstantesFunciones.getPagosAutorizadosDescripcion(pagosautorizados));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Autorizados",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPagosAutorizados.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPagosAutorizados.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPagosAutorizados.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPagosAutorizados.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPagosAutorizados() throws Exception {		
		this.startProcessPagosAutorizados(true);
	}
	
	public void startProcessPagosAutorizados(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPagosAutorizados ,this.jPanelParametrosReportesPagosAutorizados, this.jScrollPanelDatosPagosAutorizados,this.jPanelPaginacionPagosAutorizados, this.jScrollPanelDatosEdicionPagosAutorizados, this.jPanelAccionesPagosAutorizados,this.jPanelAccionesFormularioPagosAutorizados,this.jmenuBarPagosAutorizados,this.jmenuBarDetallePagosAutorizados,this.jTtoolBarPagosAutorizados,this.jTtoolBarDetallePagosAutorizados);		
		
		final JTabbedPane jTabbedPaneBusquedasPagosAutorizados=this.jTabbedPaneBusquedasPagosAutorizados; 
		
		final JPanel jPanelParametrosReportesPagosAutorizados=this.jPanelParametrosReportesPagosAutorizados;
		//final JScrollPane jScrollPanelDatosPagosAutorizados=this.jScrollPanelDatosPagosAutorizados;
		final JTable jTableDatosPagosAutorizados=this.jTableDatosPagosAutorizados;		
		final JPanel jPanelPaginacionPagosAutorizados=this.jPanelPaginacionPagosAutorizados;
		//final JScrollPane jScrollPanelDatosEdicionPagosAutorizados=this.jScrollPanelDatosEdicionPagosAutorizados;
		final JPanel jPanelAccionesPagosAutorizados=this.jPanelAccionesPagosAutorizados;
		
		JPanel jPanelCamposAuxiliarPagosAutorizados=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPagosAutorizados=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPagosAutorizados!=null) {
			jPanelCamposAuxiliarPagosAutorizados=this.jInternalFrameDetalleFormPagosAutorizados.jPanelCamposPagosAutorizados;
			jPanelAccionesFormularioAuxiliarPagosAutorizados=this.jInternalFrameDetalleFormPagosAutorizados.jPanelAccionesFormularioPagosAutorizados;
		}
		
		final JPanel jPanelCamposPagosAutorizados=jPanelCamposAuxiliarPagosAutorizados;
		final JPanel jPanelAccionesFormularioPagosAutorizados=jPanelAccionesFormularioAuxiliarPagosAutorizados;
		
		
		final JMenuBar jmenuBarPagosAutorizados=this.jmenuBarPagosAutorizados;
		final JToolBar jTtoolBarPagosAutorizados=this.jTtoolBarPagosAutorizados;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPagosAutorizados=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPagosAutorizados=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPagosAutorizados!=null) {
			jmenuBarDetalleAuxiliarPagosAutorizados=this.jInternalFrameDetalleFormPagosAutorizados.jmenuBarDetallePagosAutorizados;
			jTtoolBarDetalleAuxiliarPagosAutorizados=this.jInternalFrameDetalleFormPagosAutorizados.jTtoolBarDetallePagosAutorizados;
		}
		
		final JMenuBar jmenuBarDetallePagosAutorizados=jmenuBarDetalleAuxiliarPagosAutorizados;
		final JToolBar jTtoolBarDetallePagosAutorizados=jTtoolBarDetalleAuxiliarPagosAutorizados;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPagosAutorizados;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPagosAutorizados;
			processRunnable.jTableDatos=jTableDatosPagosAutorizados;
			processRunnable.jPanelCampos=jPanelCamposPagosAutorizados;
			processRunnable.jPanelPaginacion=jPanelPaginacionPagosAutorizados;
			processRunnable.jPanelAcciones=jPanelAccionesPagosAutorizados;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPagosAutorizados;
			
			
			processRunnable.jmenuBar=jmenuBarPagosAutorizados;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePagosAutorizados;
			processRunnable.jTtoolBar=jTtoolBarPagosAutorizados;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePagosAutorizados;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPagosAutorizados ,jPanelParametrosReportesPagosAutorizados,jTableDatosPagosAutorizados, /*jScrollPanelDatosPagosAutorizados,*/jPanelCamposPagosAutorizados,jPanelPaginacionPagosAutorizados, /*jScrollPanelDatosEdicionPagosAutorizados,*/ jPanelAccionesPagosAutorizados,jPanelAccionesFormularioPagosAutorizados,jmenuBarPagosAutorizados,jmenuBarDetallePagosAutorizados,jTtoolBarPagosAutorizados,jTtoolBarDetallePagosAutorizados);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPagosAutorizados ,jPanelParametrosReportesPagosAutorizados, jScrollPanelDatosPagosAutorizados,jPanelPaginacionPagosAutorizados, jScrollPanelDatosEdicionPagosAutorizados, jPanelAccionesPagosAutorizados,jPanelAccionesFormularioPagosAutorizados,jmenuBarPagosAutorizados,jmenuBarDetallePagosAutorizados,jTtoolBarPagosAutorizados,jTtoolBarDetallePagosAutorizados);
						
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
	
	public void finishProcessPagosAutorizados() {// throws Exception 
		this.finishProcessPagosAutorizados(true);
	}
	
	public void finishProcessPagosAutorizados(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPagosAutorizados ,this.jPanelParametrosReportesPagosAutorizados, this.jScrollPanelDatosPagosAutorizados,this.jPanelPaginacionPagosAutorizados, this.jScrollPanelDatosEdicionPagosAutorizados, this.jPanelAccionesPagosAutorizados,this.jPanelAccionesFormularioPagosAutorizados,this.jmenuBarPagosAutorizados,this.jmenuBarDetallePagosAutorizados,this.jTtoolBarPagosAutorizados,this.jTtoolBarDetallePagosAutorizados);		
		
		final JTabbedPane jTabbedPaneBusquedasPagosAutorizados=this.jTabbedPaneBusquedasPagosAutorizados; 
		
		final JPanel jPanelParametrosReportesPagosAutorizados=this.jPanelParametrosReportesPagosAutorizados;
		//final JScrollPane jScrollPanelDatosPagosAutorizados=this.jScrollPanelDatosPagosAutorizados;
		final JTable jTableDatosPagosAutorizados=this.jTableDatosPagosAutorizados;		
		final JPanel jPanelPaginacionPagosAutorizados=this.jPanelPaginacionPagosAutorizados;
		//final JScrollPane jScrollPanelDatosEdicionPagosAutorizados=this.jScrollPanelDatosEdicionPagosAutorizados;
		final JPanel jPanelAccionesPagosAutorizados=this.jPanelAccionesPagosAutorizados;
		
		JPanel jPanelCamposAuxiliarPagosAutorizados=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPagosAutorizados=new JPanel();
		
		if(this.jInternalFrameDetalleFormPagosAutorizados!=null) {
			jPanelCamposAuxiliarPagosAutorizados=this.jInternalFrameDetalleFormPagosAutorizados.jPanelCamposPagosAutorizados;
			jPanelAccionesFormularioAuxiliarPagosAutorizados=this.jInternalFrameDetalleFormPagosAutorizados.jPanelAccionesFormularioPagosAutorizados;
		}
		
		final JPanel jPanelCamposPagosAutorizados=jPanelCamposAuxiliarPagosAutorizados;
		final JPanel jPanelAccionesFormularioPagosAutorizados=jPanelAccionesFormularioAuxiliarPagosAutorizados;
		
		
		final JMenuBar jmenuBarPagosAutorizados=this.jmenuBarPagosAutorizados;		
		final JToolBar jTtoolBarPagosAutorizados=this.jTtoolBarPagosAutorizados;
				
		JMenuBar jmenuBarDetalleAuxiliarPagosAutorizados=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPagosAutorizados=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPagosAutorizados!=null) {
			jmenuBarDetalleAuxiliarPagosAutorizados=this.jInternalFrameDetalleFormPagosAutorizados.jmenuBarDetallePagosAutorizados;
			jTtoolBarDetalleAuxiliarPagosAutorizados=this.jInternalFrameDetalleFormPagosAutorizados.jTtoolBarDetallePagosAutorizados;		
		}
		
		final JMenuBar jmenuBarDetallePagosAutorizados=jmenuBarDetalleAuxiliarPagosAutorizados;
		final JToolBar jTtoolBarDetallePagosAutorizados=jTtoolBarDetalleAuxiliarPagosAutorizados;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPagosAutorizados;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPagosAutorizados;
			processRunnable.jTableDatos=jTableDatosPagosAutorizados;
			processRunnable.jPanelCampos=jPanelCamposPagosAutorizados;
			processRunnable.jPanelPaginacion=jPanelPaginacionPagosAutorizados;
			processRunnable.jPanelAcciones=jPanelAccionesPagosAutorizados;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPagosAutorizados;
			
			
			processRunnable.jmenuBar=jmenuBarPagosAutorizados;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePagosAutorizados;
			processRunnable.jTtoolBar=jTtoolBarPagosAutorizados;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePagosAutorizados;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPagosAutorizados ,jPanelParametrosReportesPagosAutorizados, jTableDatosPagosAutorizados,/*jScrollPanelDatosPagosAutorizados,*/jPanelCamposPagosAutorizados,jPanelPaginacionPagosAutorizados, /*jScrollPanelDatosEdicionPagosAutorizados,*/ jPanelAccionesPagosAutorizados,jPanelAccionesFormularioPagosAutorizados,jmenuBarPagosAutorizados,jmenuBarDetallePagosAutorizados,jTtoolBarPagosAutorizados,jTtoolBarDetallePagosAutorizados));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPagosAutorizados(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPagosAutorizados(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPagosAutorizados(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPagosAutorizados(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPagosAutorizados,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePagosAutorizados,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPagosAutorizados(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPagosAutorizados,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePagosAutorizados,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.pagosautorizadosConstantesFunciones.getsFinalQueryPagosAutorizados();
		String  finalQueryPaginacionTodos=this.pagosautorizadosConstantesFunciones.getsFinalQueryPagosAutorizados();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PagosAutorizadosConstantesFunciones.getArrayColumnasGlobalesNoPagosAutorizados(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PagosAutorizadosConstantesFunciones.getArrayColumnasGlobalesPagosAutorizados(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PagosAutorizadosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.pagosautorizadossEliminados= new ArrayList<PagosAutorizados>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPagosAutorizados();
		
				///*PagosAutorizadosSessionBean*/this.pagosautorizadosSessionBean=new PagosAutorizadosSessionBean();
			
			if(this.pagosautorizadosSessionBean==null) {
				this.pagosautorizadosSessionBean=new PagosAutorizadosSessionBean();
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
					this.iNumeroPaginacion=PagosAutorizadosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PagosAutorizadosConstantesFunciones.getClassesForeignKeysOfPagosAutorizados(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/pagosautorizados."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			pagosautorizadossAux= new ArrayList<PagosAutorizados>();
			
				
			pagosautorizadosLogic.setDatosCliente(this.datosCliente);
			pagosautorizadosLogic.setDatosDeep(this.datosDeep);
			pagosautorizadosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPagosAutorizados")) {
				this.sDetalleReporte=PagosAutorizadosConstantesFunciones.getDetalleIndiceBusquedaPagosAutorizados(fecha_corteBusquedaPagosAutorizados);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					pagosautorizadosLogic.getPagosAutorizadossBusquedaPagosAutorizados(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_corteBusquedaPagosAutorizados);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PagosAutorizadosConstantesFunciones.getDetalleIndiceBusquedaPagosAutorizados(fecha_corteBusquedaPagosAutorizados);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PagosAutorizadosConstantesFunciones.getDetalleIndiceBusquedaPagosAutorizados(fecha_corteBusquedaPagosAutorizados);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=pagosautorizadosLogic.getPagosAutorizadoss()==null||pagosautorizadosLogic.getPagosAutorizadoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=pagosautorizadoss==null|| pagosautorizadoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						pagosautorizadossAux=new ArrayList<PagosAutorizados>();
						pagosautorizadossAux.addAll(pagosautorizadosLogic.getPagosAutorizadoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pagosautorizadossAux=new ArrayList<PagosAutorizados>();
							pagosautorizadossAux.addAll(pagosautorizadoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							pagosautorizadosLogic.getPagosAutorizadossBusquedaPagosAutorizados(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_corteBusquedaPagosAutorizados);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PagosAutorizadosConstantesFunciones.getDetalleIndiceBusquedaPagosAutorizados(fecha_corteBusquedaPagosAutorizados);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PagosAutorizadosConstantesFunciones.getDetalleIndiceBusquedaPagosAutorizados(fecha_corteBusquedaPagosAutorizados);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePagosAutorizadoss("BusquedaPagosAutorizados",pagosautorizadosLogic.getPagosAutorizadoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePagosAutorizadoss("BusquedaPagosAutorizados",pagosautorizadoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						pagosautorizadosLogic.setPagosAutorizadoss(new ArrayList<PagosAutorizados>());
						pagosautorizadosLogic.getPagosAutorizadoss().addAll(pagosautorizadossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pagosautorizadoss=new ArrayList<PagosAutorizados>();
							pagosautorizadoss.addAll(pagosautorizadossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPagosAutorizados();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPagosAutorizados();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=pagosautorizadosLogic.getPagosAutorizadoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=pagosautorizadoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=pagosautorizadosLogic.getPagosAutorizadoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=pagosautorizadoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PagosAutorizados pagosautorizados) {
		Boolean permite=true;
		
		if(this.pagosautorizados.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PagosAutorizadosConstantesFunciones.getOrderByListaPagosAutorizados();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PagosAutorizadosConstantesFunciones.getOrderByListaPagosAutorizados();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PagosAutorizados pagosautorizados:pagosautorizadosLogic.getPagosAutorizadoss()) {
				if(pagosautorizados.getsType().equals(Constantes2.S_TOTALES)) {
					pagosautorizadosTotales=pagosautorizados;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PagosAutorizados pagosautorizados:this.pagosautorizadoss) {
				if(pagosautorizados.getsType().equals(Constantes2.S_TOTALES)) {
					pagosautorizadosTotales=pagosautorizados;
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
			this.pagosautorizadosAux=new PagosAutorizados();
			this.pagosautorizadosAux.setsType(Constantes2.S_TOTALES);
			this.pagosautorizadosAux.setIsNew(false);
			this.pagosautorizadosAux.setIsChanged(false);
			this.pagosautorizadosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//PagosAutorizadosConstantesFunciones.TotalizarValoresFilaPagosAutorizados(this.pagosautorizadosLogic.getPagosAutorizadoss(),this.pagosautorizadosAux);
				
				//this.pagosautorizadosLogic.getPagosAutorizadoss().add(this.pagosautorizadosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PagosAutorizadosConstantesFunciones.TotalizarValoresFilaPagosAutorizados(this.pagosautorizadoss,this.pagosautorizadosAux);
				
				this.pagosautorizadoss.add(this.pagosautorizadosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		pagosautorizadosTotales=new PagosAutorizados();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.pagosautorizadosLogic.getPagosAutorizadoss().remove(pagosautorizadosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.pagosautorizadoss.remove(pagosautorizadosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		pagosautorizadosTotales=new PagosAutorizados();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PagosAutorizados pagosautorizados:pagosautorizadosLogic.getPagosAutorizadoss()) {
				if(pagosautorizados.getsType().equals(Constantes2.S_TOTALES)) {
					pagosautorizadosTotales=pagosautorizados;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PagosAutorizadosConstantesFunciones.TotalizarValoresFilaPagosAutorizados(this.pagosautorizadosLogic.getPagosAutorizadoss(),pagosautorizadosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PagosAutorizados pagosautorizados:this.pagosautorizadoss) {
				if(pagosautorizados.getsType().equals(Constantes2.S_TOTALES)) {
					pagosautorizadosTotales=pagosautorizados;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PagosAutorizadosConstantesFunciones.TotalizarValoresFilaPagosAutorizados(this.pagosautorizadoss,pagosautorizadosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPagosAutorizadossBusquedaPagosAutorizados()throws Exception {
		try {
			sAccionBusqueda="BusquedaPagosAutorizados";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPagosAutorizadossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPagosAutorizadossBusquedaPagosAutorizados(String sFinalQuery,Date fecha_corte)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//pagosautorizadosLogic.getPagosAutorizadossBusquedaPagosAutorizados(sFinalQuery,this.pagination,fecha_corte);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPagosAutorizadossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//pagosautorizadosLogic.getPagosAutorizadossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosPagosAutorizados() {
		this.isPermisoTodoPagosAutorizados=false;
		this.isPermisoNuevoPagosAutorizados=false;
		this.isPermisoActualizarPagosAutorizados=false;
		this.isPermisoActualizarOriginalPagosAutorizados=false;
		this.isPermisoEliminarPagosAutorizados=false;
		this.isPermisoGuardarCambiosPagosAutorizados=false;
		this.isPermisoConsultaPagosAutorizados=true;
		this.isPermisoBusquedaPagosAutorizados=true;
		this.isPermisoReportePagosAutorizados=true;
		this.isPermisoOrdenPagosAutorizados=false;		
		this.isPermisoPaginacionMedioPagosAutorizados=false;		
		this.isPermisoPaginacionAltoPagosAutorizados=false;		
		this.isPermisoPaginacionTodoPagosAutorizados=false;		
		this.isPermisoCopiarPagosAutorizados=false;		
		this.isPermisoVerFormPagosAutorizados=false;		
		this.isPermisoDuplicarPagosAutorizados=false;
		this.isPermisoOrdenPagosAutorizados=false;
	}
	
	public void setPermisosUsuarioPagosAutorizados(Boolean isPermiso) {
		this.isPermisoTodoPagosAutorizados=isPermiso;
		this.isPermisoNuevoPagosAutorizados=isPermiso;
		this.isPermisoActualizarPagosAutorizados=isPermiso;
		this.isPermisoActualizarOriginalPagosAutorizados=isPermiso;
		this.isPermisoEliminarPagosAutorizados=isPermiso;
		this.isPermisoGuardarCambiosPagosAutorizados=isPermiso;
		this.isPermisoConsultaPagosAutorizados=isPermiso;
		this.isPermisoBusquedaPagosAutorizados=isPermiso;
		this.isPermisoReportePagosAutorizados=isPermiso;
		this.isPermisoOrdenPagosAutorizados=isPermiso;		
		this.isPermisoPaginacionMedioPagosAutorizados=isPermiso;		
		this.isPermisoPaginacionAltoPagosAutorizados=isPermiso;		
		this.isPermisoPaginacionTodoPagosAutorizados=isPermiso;		
		this.isPermisoCopiarPagosAutorizados=isPermiso;		
		this.isPermisoVerFormPagosAutorizados=isPermiso;		
		this.isPermisoDuplicarPagosAutorizados=isPermiso;
		this.isPermisoOrdenPagosAutorizados=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPagosAutorizados(Boolean isPermiso) {
		//this.isPermisoTodoPagosAutorizados=isPermiso;
		this.isPermisoNuevoPagosAutorizados=isPermiso;
		this.isPermisoActualizarPagosAutorizados=isPermiso;
		this.isPermisoActualizarOriginalPagosAutorizados=isPermiso;
		this.isPermisoEliminarPagosAutorizados=isPermiso;
		this.isPermisoGuardarCambiosPagosAutorizados=isPermiso;
		//this.isPermisoConsultaPagosAutorizados=isPermiso;
		//this.isPermisoBusquedaPagosAutorizados=isPermiso;
		//this.isPermisoReportePagosAutorizados=isPermiso;
		//this.isPermisoOrdenPagosAutorizados=isPermiso;		
		//this.isPermisoPaginacionMedioPagosAutorizados=isPermiso;		
		//this.isPermisoPaginacionAltoPagosAutorizados=isPermiso;		
		//this.isPermisoPaginacionTodoPagosAutorizados=isPermiso;		
		//this.isPermisoCopiarPagosAutorizados=isPermiso;		
		//this.isPermisoDuplicarPagosAutorizados=isPermiso;
		//this.isPermisoOrdenPagosAutorizados=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPagosAutorizadosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PagosAutorizadosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPagosAutorizados(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPagosAutorizadosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPagosAutorizadosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPagosAutorizadosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPagosAutorizadosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPagosAutorizados() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PagosAutorizadosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PagosAutorizadosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPagosAutorizados=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPagosAutorizados=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPagosAutorizados=this.isPermisoActualizarPagosAutorizados;
			this.isPermisoEliminarPagosAutorizados=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPagosAutorizados=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPagosAutorizados=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPagosAutorizados=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPagosAutorizados=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePagosAutorizados=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPagosAutorizados=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPagosAutorizados=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPagosAutorizados=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPagosAutorizados=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPagosAutorizados=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPagosAutorizados=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPagosAutorizados=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPagosAutorizados=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPagosAutorizados.setToolTipText(this.jTableDatosPagosAutorizados.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPagosAutorizados(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPagosAutorizados(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PagosAutorizadosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PagosAutorizadosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPagosAutorizados() throws Exception {
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
	public void inicializarCombosForeignKeyPagosAutorizadosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPagosAutorizadosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PagosAutorizadosJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyPagosAutorizados()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.pagosautorizadosSessionBean==null) {
				this.pagosautorizadosSessionBean=new PagosAutorizadosSessionBean();
			}

			if(!this.pagosautorizadosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyPagosAutorizados()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPagosAutorizados(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPagosAutorizados()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPagosAutorizados();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPagosAutorizados(PagosAutorizados pagosautorizados)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPagosAutorizados(PagosAutorizados pagosautorizados,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPagosAutorizados()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPagosAutorizados()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPagosAutorizados()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPagosAutorizados()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPagosAutorizados()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPagosAutorizados()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPagosAutorizados(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPagosAutorizados()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPagosAutorizados.jComboBoxid_empresaPagosAutorizados!=null && this.jInternalFrameDetalleFormPagosAutorizados.jComboBoxid_empresaPagosAutorizados.getItemCount()>0) {
				this.jInternalFrameDetalleFormPagosAutorizados.jComboBoxid_empresaPagosAutorizados.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public PagosAutorizadosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PagosAutorizadosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PagosAutorizadosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.pagosautorizadosSessionBean=new PagosAutorizadosSessionBean(); 
		this.pagosautorizadosConstantesFunciones=new PagosAutorizadosConstantesFunciones(); 
		this.pagosautorizadosBean=new PagosAutorizados();//(this.pagosautorizadosConstantesFunciones); 		
		this.pagosautorizadosReturnGeneral=new PagosAutorizadosParameterReturnGeneral(); 
		
		this.pagosautorizadosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pagosautorizadosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PagosAutorizadosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PagosAutorizadosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PagosAutorizadosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPagosAutorizados(true);
			
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
			
			this.pagosautorizadosConstantesFunciones=new PagosAutorizadosConstantesFunciones(); 
			this.pagosautorizadosBean=new PagosAutorizados();//this.pagosautorizadosConstantesFunciones); 			
			this.pagosautorizadosReturnGeneral=new PagosAutorizadosParameterReturnGeneral(); 
		
			PagosAutorizadosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Pagos Autorizados Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.pagosautorizados=new PagosAutorizados();
			this.pagosautorizadoss = new ArrayList<PagosAutorizados>();
			this.pagosautorizadossAux = new ArrayList<PagosAutorizados>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic=new PagosAutorizadosLogic();
				this.pagosautorizadosLogic.getNewConnexionToDeep("");
			}
			
			//this.pagosautorizadosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.pagosautorizadosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPagosAutorizados);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPagosAutorizados!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPagosAutorizados);	
					}
					
					if(this.jInternalFrameImportacionPagosAutorizados!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPagosAutorizados);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPagosAutorizados!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPagosAutorizados);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPagosAutorizados!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPagosAutorizados);
				this.jInternalFrameDetalleFormPagosAutorizados.setVisible(false);
				this.jInternalFrameDetalleFormPagosAutorizados.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPagosAutorizados!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPagosAutorizados);
					this.jInternalFrameReporteDinamicoPagosAutorizados.setVisible(false);
					this.jInternalFrameReporteDinamicoPagosAutorizados.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPagosAutorizados!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPagosAutorizados);
					this.jInternalFrameImportacionPagosAutorizados.setVisible(false);
					this.jInternalFrameImportacionPagosAutorizados.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPagosAutorizados!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPagosAutorizados);
					this.jInternalFrameOrderByPagosAutorizados.setVisible(false);
					this.jInternalFrameOrderByPagosAutorizados.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPagosAutorizadosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PagosAutorizadosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.pagosautorizadosReturnGeneral=new PagosAutorizadosParameterReturnGeneral();
			
			this.pagosautorizadosParameterGeneral=new PagosAutorizadosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.pagosautorizadosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PagosAutorizadosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PagosAutorizadosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.pagosautorizadosSessionBean.getEsGuardarRelacionado(),this.pagosautorizadosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PagosAutorizadosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.pagosautorizadosSessionBean.getEsGuardarRelacionado(),this.pagosautorizadosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPagosAutorizados=false;
			this.isVisibilidadCeldaDuplicarPagosAutorizados=true;
			this.isVisibilidadCeldaCopiarPagosAutorizados=true;
			this.isVisibilidadCeldaVerFormPagosAutorizados=true;
			this.isVisibilidadCeldaOrdenPagosAutorizados=true;
			this.isVisibilidadCeldaNuevoRelacionesPagosAutorizados=false;
			this.isVisibilidadCeldaModificarPagosAutorizados=false;
			this.isVisibilidadCeldaActualizarPagosAutorizados=false;
			this.isVisibilidadCeldaEliminarPagosAutorizados=false;
			this.isVisibilidadCeldaCancelarPagosAutorizados=false;
			this.isVisibilidadCeldaGuardarPagosAutorizados=false;
			this.isVisibilidadCeldaGuardarCambiosPagosAutorizados=false;
			
			
			this.isVisibilidadBusquedaPagosAutorizados=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPagosAutorizados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPagosAutorizados();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPagosAutorizados(false);
			
			this.setPermisosUsuarioPagosAutorizados();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.pagosautorizadosSessionBean.getEsGuardarRelacionado() 
				|| (this.pagosautorizadosSessionBean.getEsGuardarRelacionado() && this.pagosautorizadosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPagosAutorizadosClasesRelacionadas();
			}
			
			if(this.pagosautorizadosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPagosAutorizadosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PagosAutorizadosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPagosAutorizados();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPagosAutorizados();
			}
			
			if(!this.isPermisoBusquedaPagosAutorizados) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPagosAutorizados.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PagosAutorizadosConstantesFunciones.getTiposSeleccionarPagosAutorizados());
				
				this.tiposColumnasSelect=PagosAutorizadosConstantesFunciones.getTiposSeleccionarPagosAutorizados(true);
				
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
			//if(!this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPagosAutorizados();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioPagosAutorizados(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioPagosAutorizados(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPagosAutorizados() ;
			
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
				pagosautorizadosImplementable= (PagosAutorizadosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PagosAutorizadosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				pagosautorizadosImplementableHome= (PagosAutorizadosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PagosAutorizadosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.pagosautorizadoss= new ArrayList<PagosAutorizados>();
			this.pagosautorizadossEliminados= new ArrayList<PagosAutorizados>();
						
			this.isEsNuevoPagosAutorizados=false;
			this.esParaAccionDesdeFormularioPagosAutorizados=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPagosAutorizados(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPagosAutorizados();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PagosAutorizadosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PagosAutorizadosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPagosAutorizados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPagosAutorizados(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPagosAutorizados!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPagosAutorizados();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPagosAutorizados();
			}
			
			PagosAutorizadosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPagosAutorizados.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPagosAutorizados.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPagosAutorizados.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPagosAutorizados(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PagosAutorizados: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPagosAutorizados() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPagosAutorizados")) {
				iIndex=this.jInternalFrameDetalleFormPagosAutorizados.jTabbedPaneRelacionesPagosAutorizados.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPagosAutorizados.jTabbedPaneRelacionesPagosAutorizados.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPagosAutorizados();	
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
	
	public void cargarCombosForeignKeyPagosAutorizados(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPagosAutorizados(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPagosAutorizados(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPagosAutorizadosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPagosAutorizados();
		
		this.cargarCombosFrameForeignKeyPagosAutorizados();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPagosAutorizados();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPagosAutorizados();
		}
	}
	
	
	
	public void jButtonNuevoPagosAutorizadosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.pagosautorizadosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPagosAutorizados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
			
			
			if(jTableDatosPagosAutorizados.getRowCount()>=1) {
				jTableDatosPagosAutorizados.removeRowSelectionInterval(0, jTableDatosPagosAutorizados.getRowCount()-1);						
			}
			
			this.isEsNuevoPagosAutorizados=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPagosAutorizados(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPagosAutorizados(true);			
			//this.pagosautorizados=new PagosAutorizados();
			//this.pagosautorizados.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPagosAutorizados(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPagosAutorizados() ;
			
			if(PagosAutorizadosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePagosAutorizados(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.pagosautorizados);	
			this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizados);				
			
			PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
			
			if(this.pagosautorizadosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PagosAutorizados: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPagosAutorizadosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PagosAutorizados> pagosautorizadossSeleccionados=new ArrayList<PagosAutorizados>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPagosAutorizados.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPagosAutorizados.getSelectedRows().length;			
			}
			
			pagosautorizadossSeleccionados=this.getPagosAutorizadossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPagosAutorizados--;			
				//PagosAutorizados pagosautorizadosAux= new PagosAutorizados();			
				//pagosautorizadosAux.setId(this.iIdNuevoPagosAutorizados);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PagosAutorizados pagosautorizadosOrigen=new PagosAutorizados();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PagosAutorizados pagosautorizadosOrigen : pagosautorizadossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							pagosautorizadosOrigen =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pagosautorizadosOrigen =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPagosAutorizados();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.pagosautorizados.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPagosAutorizados(pagosautorizadosOrigen,this.pagosautorizados,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.pagosautorizadosLogic.getPagosAutorizadoss().add(this.pagosautorizadosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.pagosautorizadoss.add(this.pagosautorizadosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPagosAutorizados(false);
				
				this.jTableDatosPagosAutorizados.setRowSelectionInterval(this.getIndiceNuevoPagosAutorizados(), this.getIndiceNuevoPagosAutorizados());
				
				int iLastRow =  this.jTableDatosPagosAutorizados.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPagosAutorizados.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPagosAutorizados.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPagosAutorizados(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PagosAutorizados> pagosautorizadossSeleccionados=new ArrayList<PagosAutorizados>();									
		
			PagosAutorizados pagosautorizadosOrigen=new PagosAutorizados();
			PagosAutorizados pagosautorizadosDestino=new PagosAutorizados();
				
			pagosautorizadossSeleccionados=this.getPagosAutorizadossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPagosAutorizados.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || pagosautorizadossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPagosAutorizados.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						pagosautorizadosOrigen =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						pagosautorizadosOrigen =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						pagosautorizadosDestino =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						pagosautorizadosDestino =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				pagosautorizadosOrigen =pagosautorizadossSeleccionados.get(0);
				pagosautorizadosDestino =pagosautorizadossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPagosAutorizados(pagosautorizadosOrigen,pagosautorizadosDestino,true,false);
				
				pagosautorizadosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(pagosautorizadosDestino,pagosautorizadosLogic.getPagosAutorizadoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(pagosautorizadosDestino,pagosautorizadoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPagosAutorizados(false);
				
				//this.jTableDatosPagosAutorizados.setRowSelectionInterval(this.getIndiceNuevoPagosAutorizados(), this.getIndiceNuevoPagosAutorizados());
				
				int iLastRow =  this.jTableDatosPagosAutorizados.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPagosAutorizados.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPagosAutorizados.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPagosAutorizados(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPagosAutorizados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPagosAutorizados.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPagosAutorizados.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPagosAutorizados.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPagosAutorizados.setVisible(!isVisible);
			this.jPanelPaginacionPagosAutorizados.setVisible(!isVisible);
			this.jPanelAccionesPagosAutorizados.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePagosAutorizados();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPagosAutorizados();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPagosAutorizados();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPagosAutorizados();
			
			this.abrirFrameOrderByPagosAutorizados();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPagosAutorizados();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePagosAutorizados(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPagosAutorizados);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPagosAutorizados.isMaximum()) {
					this.jInternalFrameDetalleFormPagosAutorizados.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPagosAutorizados.setSize(this.jInternalFrameDetalleFormPagosAutorizados.iWidthFormulario,this.jInternalFrameDetalleFormPagosAutorizados.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPagosAutorizados.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPagosAutorizados.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPagosAutorizados.isMaximum()) {
						this.jInternalFrameDetalleFormPagosAutorizados.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPagosAutorizados.jContentPaneDetallePagosAutorizados.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPagosAutorizados.jTabbedPaneRelacionesPagosAutorizados.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPagosAutorizados.jContentPaneDetallePagosAutorizados.getWidth(),PagosAutorizadosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPagosAutorizados.jTabbedPaneRelacionesPagosAutorizados.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPagosAutorizados.jContentPaneDetallePagosAutorizados.getWidth(),PagosAutorizadosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPagosAutorizados.jTabbedPaneRelacionesPagosAutorizados.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPagosAutorizados.jContentPaneDetallePagosAutorizados.getWidth(),PagosAutorizadosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPagosAutorizados.setVisible(true);
	        this.jInternalFrameDetalleFormPagosAutorizados.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPagosAutorizados() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPagosAutorizados==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPagosAutorizados=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPagosAutorizados,false,this);
				} else {
					this.jInternalFrameOrderByPagosAutorizados=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPagosAutorizados,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPagosAutorizados);
				this.jInternalFrameOrderByPagosAutorizados.setVisible(false);
				this.jInternalFrameOrderByPagosAutorizados.setSelected(false);
				
				this.jInternalFrameOrderByPagosAutorizados.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPagosAutorizados"));
				
				this.inicializarActualizarBindingTablaOrderByPagosAutorizados();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPagosAutorizados() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPagosAutorizados==null) {
				
				this.jInternalFrameImportacionPagosAutorizados=new ImportacionJInternalFrame(PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPagosAutorizados);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPagosAutorizados);
				this.jInternalFrameImportacionPagosAutorizados.setVisible(false);
				this.jInternalFrameImportacionPagosAutorizados.setSelected(false);


				this.jInternalFrameImportacionPagosAutorizados.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPagosAutorizados"));
				this.jInternalFrameImportacionPagosAutorizados.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPagosAutorizados"));
				this.jInternalFrameImportacionPagosAutorizados.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPagosAutorizados"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPagosAutorizados() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPagosAutorizados==null) {
				this.jInternalFrameReporteDinamicoPagosAutorizados=new ReporteDinamicoJInternalFrame(PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPagosAutorizados);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPagosAutorizados);
				this.jInternalFrameReporteDinamicoPagosAutorizados.setVisible(false);
				this.jInternalFrameReporteDinamicoPagosAutorizados.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPagosAutorizados.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPagosAutorizados"));
				this.jInternalFrameReporteDinamicoPagosAutorizados.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPagosAutorizados"));
				this.jInternalFrameReporteDinamicoPagosAutorizados.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPagosAutorizados"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPagosAutorizados();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePagosAutorizados() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPagosAutorizados);
			
	       	this.jInternalFrameDetalleFormPagosAutorizados.setVisible(false);
	        this.jInternalFrameDetalleFormPagosAutorizados.setSelected(false);
			
			//this.jInternalFrameDetalleFormPagosAutorizados.dispose();
			//this.jInternalFrameDetalleFormPagosAutorizados=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPagosAutorizados() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPagosAutorizados.setVisible(true);
	        this.jInternalFrameReporteDinamicoPagosAutorizados.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPagosAutorizados() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPagosAutorizados.setVisible(true);
	        this.jInternalFrameImportacionPagosAutorizados.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPagosAutorizados() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPagosAutorizados.setVisible(true);
	        this.jInternalFrameOrderByPagosAutorizados.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPagosAutorizados() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPagosAutorizados.setVisible(false);
	        this.jInternalFrameOrderByPagosAutorizados.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPagosAutorizados() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPagosAutorizados.setVisible(false);
	        this.jInternalFrameReporteDinamicoPagosAutorizados.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPagosAutorizados() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPagosAutorizados.setVisible(false);
	        this.jInternalFrameImportacionPagosAutorizados.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPagosAutorizados(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPagosAutorizados(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPagosAutorizados(true);
			//this.isEsNuevoPagosAutorizados=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizados =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.pagosautorizados =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPagosAutorizados("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPagosAutorizados(false) ;
			
			if(pagosautorizadosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PagosAutorizadosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePagosAutorizados(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPagosAutorizados(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPagosAutorizadosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizados =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagosautorizados =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPagosAutorizados(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPagosAutorizados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPagosAutorizados(true);
			//this.isEsNuevoPagosAutorizados=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizados =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.pagosautorizados =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.pagosautorizados.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPagosAutorizados("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPagosAutorizados(false) ;
			
			if(PagosAutorizadosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePagosAutorizados(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPagosAutorizados(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPagosAutorizados(false);
			
			//if(!this.isEsNuevoPagosAutorizados) {								
				int intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizados =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pagosautorizados =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PagosAutorizadosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPagosAutorizados(this.pagosautorizados,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
				
			}
			
			if(this.permiteMantenimiento(this.pagosautorizados)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPagosAutorizados=true;
					this.inicializarActualizarBindingTablaPagosAutorizados(false);
					this.isEsNuevoPagosAutorizados=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPagosAutorizados=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPagosAutorizados=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPagosAutorizados(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPagosAutorizados(false);
				
				this.habilitarDeshabilitarControlesPagosAutorizados(false);
			
												
				
				if(PagosAutorizadosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePagosAutorizados();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPagosAutorizadosActionPerformed(evt,pagosautorizadosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPagosAutorizados(this.pagosautorizados,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPagosAutorizados.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,pagosautorizadosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.pagosautorizados.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PagosAutorizados.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutorizados.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizados =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				this.pagosautorizados.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.pagosautorizados =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				this.pagosautorizados.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.pagosautorizados)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PagosAutorizadosModel) this.jTableDatosPagosAutorizados.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPagosAutorizados=true;
				this.inicializarActualizarBindingTablaPagosAutorizados(false);
				this.isEsNuevoPagosAutorizados=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPagosAutorizados(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPagosAutorizados(false);
				
				this.habilitarDeshabilitarControlesPagosAutorizados(false);
				
				
				
				if(PagosAutorizadosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePagosAutorizados();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPagosAutorizados.getRowCount()>=1) {
				jTableDatosPagosAutorizados.removeRowSelectionInterval(0, jTableDatosPagosAutorizados.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPagosAutorizados(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPagosAutorizados(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPagosAutorizados(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPagosAutorizados(false) ;
			
			this.isEsNuevoPagosAutorizados=false;
			
			if(PagosAutorizadosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePagosAutorizados();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPagosAutorizados(false);
				
				//SI ES MANUAL
				if(PagosAutorizadosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPagosAutorizados();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPagosAutorizados--;			
			//PagosAutorizados pagosautorizadosAux= new PagosAutorizados();			
			//pagosautorizadosAux.setId(this.iIdNuevoPagosAutorizados);
			
			if(this.jInternalFrameDetalleFormPagosAutorizados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPagosAutorizados();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
			
			this.pagosautorizados.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.pagosautorizadosLogic.getPagosAutorizadoss().add(this.pagosautorizadosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.pagosautorizadoss.add(this.pagosautorizadosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPagosAutorizados(false);
			
			this.jTableDatosPagosAutorizados.setRowSelectionInterval(this.getIndiceNuevoPagosAutorizados(), this.getIndiceNuevoPagosAutorizados());
			
			int iLastRow =  this.jTableDatosPagosAutorizados.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPagosAutorizados.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPagosAutorizados.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPagosAutorizados(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPagosAutorizados(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPagosAutorizados(false);
			
			//SI ES MANUAL
			if(PagosAutorizadosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPagosAutorizados();
			}
			
			//this.abrirFrameTreePagosAutorizados();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPagosAutorizados.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPagosAutorizados.setFileImportacion(this.jInternalFrameImportacionPagosAutorizados.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPagosAutorizados.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPagosAutorizados.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPagosAutorizados.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPagosAutorizados.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PagosAutorizados> pagosautorizadossSeleccionados=new ArrayList<PagosAutorizados>();		

		pagosautorizadossSeleccionados=this.getPagosAutorizadossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPagosAutorizados.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPagosAutorizados.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PagosAutorizadosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PagosAutorizadosBaseDesign.jrxml";
			
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
			
			this.generarReportePagosAutorizadoss("Todos",pagosautorizadossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Autorizados",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPagosAutorizados.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPagosAutorizados.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutorizadosConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutorizadosConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVencimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVencimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVencimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVencimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreBanco_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreBanco_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreBanco_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreBanco_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutorizadosConstantesFunciones.LABEL_VALORPORPAGAR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorPorPagar_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorPorPagar_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorPorPagar_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorPorPagar_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutorizadosConstantesFunciones.LABEL_VALORCANCELADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorCancelado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorCancelado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorCancelado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorCancelado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCuenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCuenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCuenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCuenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutorizadosConstantesFunciones.LABEL_ESTAAUTORIZADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taAutorizado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taAutorizado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taAutorizado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taAutorizado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutorizadosConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutorizadosConstantesFunciones.LABEL_FECHACORTE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaCorte_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaCorte_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaCorte_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaCorte_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutorizadosConstantesFunciones.LABEL_ESTADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoCuentaConCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoCuentaConCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoCuentaConCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoCuentaConCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoCuentaConBanco_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoCuentaConBanco_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoCuentaConBanco_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoCuentaConBanco_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoPagosAutorizados.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPagosAutorizados.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPagosAutorizados.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoria="nombre_cliente";
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoria="numero_factura";
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoria="fecha_vencimiento";
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO:
					sNombreCampoCategoria="nombre_banco";
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_VALORPORPAGAR:
					sNombreCampoCategoria="valor_por_pagar";
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_VALORCANCELADO:
					sNombreCampoCategoria="valor_cancelado";
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA:
					sNombreCampoCategoria="numero_cuenta";
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_ESTAAUTORIZADO:
					sNombreCampoCategoria="esta_autorizado";
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_FECHACORTE:
					sNombreCampoCategoria="fecha_corte_dato";
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_ESTADO:
					sNombreCampoCategoria="estado";
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE:
					sNombreCampoCategoria="codigo_cuenta_con_cliente";
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO:
					sNombreCampoCategoria="codigo_cuenta_con_banco";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPagosAutorizados.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoriaValor="nombre_cliente";
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoriaValor="numero_factura";
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoriaValor="fecha_vencimiento";
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO:
					sNombreCampoCategoriaValor="nombre_banco";
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_VALORPORPAGAR:
					sNombreCampoCategoriaValor="valor_por_pagar";
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_VALORCANCELADO:
					sNombreCampoCategoriaValor="valor_cancelado";
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA:
					sNombreCampoCategoriaValor="numero_cuenta";
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_ESTAAUTORIZADO:
					sNombreCampoCategoriaValor="esta_autorizado";
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_FECHACORTE:
					sNombreCampoCategoriaValor="fecha_corte_dato";
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_ESTADO:
					sNombreCampoCategoriaValor="estado";
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE:
					sNombreCampoCategoriaValor="codigo_cuenta_con_cliente";
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO:
					sNombreCampoCategoriaValor="codigo_cuenta_con_banco";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPagosAutorizados.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPagosAutorizados.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cliente");
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_factura");
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Vencimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_vencimiento");
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Banco",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_banco");
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_VALORPORPAGAR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Por Pagar",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_por_pagar");
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_VALORCANCELADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Cancelado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_cancelado");
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Cuenta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_cuenta");
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_ESTAAUTORIZADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Esta Autorizado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esta_autorizado");
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_FECHACORTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Corte",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_corte_dato");
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_ESTADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"estado");
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Cuenta Con Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_cuenta_con_cliente");
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Cuenta Con Banco",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_cuenta_con_banco");
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
	
	public void jButtonGenerarExcelReporteDinamicoPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PagosAutorizados> pagosautorizadossSeleccionados=new ArrayList<PagosAutorizados>();		
		
		pagosautorizadossSeleccionados=this.getPagosAutorizadossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pagosautorizados";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PagosAutorizadoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPagosAutorizados.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPagosAutorizados.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PagosAutorizadosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(PagosAutorizados pagosautorizados:pagosautorizadossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautorizados.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_FECHACORTE0:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_FECHACORTE0);
					iRow++;

					for(PagosAutorizados pagosautorizados:pagosautorizadossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautorizados.getfecha_corte());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE);
					iRow++;

					for(PagosAutorizados pagosautorizados:pagosautorizadossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautorizados.getnombre_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA);
					iRow++;

					for(PagosAutorizados pagosautorizados:pagosautorizadossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautorizados.getnumero_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(PagosAutorizados pagosautorizados:pagosautorizadossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautorizados.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_FECHAVENCIMIENTO);
					iRow++;

					for(PagosAutorizados pagosautorizados:pagosautorizadossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautorizados.getfecha_vencimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO);
					iRow++;

					for(PagosAutorizados pagosautorizados:pagosautorizadossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautorizados.getnombre_banco());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_VALORPORPAGAR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_VALORPORPAGAR);
					iRow++;

					for(PagosAutorizados pagosautorizados:pagosautorizadossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautorizados.getvalor_por_pagar());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_VALORCANCELADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_VALORCANCELADO);
					iRow++;

					for(PagosAutorizados pagosautorizados:pagosautorizadossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautorizados.getvalor_cancelado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA);
					iRow++;

					for(PagosAutorizados pagosautorizados:pagosautorizadossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautorizados.getnumero_cuenta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_ESTAAUTORIZADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_ESTAAUTORIZADO);
					iRow++;

					for(PagosAutorizados pagosautorizados:pagosautorizadossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautorizados.getesta_autorizado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(PagosAutorizados pagosautorizados:pagosautorizadossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautorizados.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_FECHACORTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_FECHACORTE);
					iRow++;

					for(PagosAutorizados pagosautorizados:pagosautorizadossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautorizados.getfecha_corte_dato());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_ESTADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_ESTADO);
					iRow++;

					for(PagosAutorizados pagosautorizados:pagosautorizadossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautorizados.getestado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE);
					iRow++;

					for(PagosAutorizados pagosautorizados:pagosautorizadossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautorizados.getcodigo_cuenta_con_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO);
					iRow++;

					for(PagosAutorizados pagosautorizados:pagosautorizadossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautorizados.getcodigo_cuenta_con_banco());
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
			//	this.getFilaCabeceraExportarExcelPagosAutorizados(row);				
			//	iRow++;
			//}				
			
			//for(PagosAutorizados pagosautorizadosAux:pagosautorizadossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPagosAutorizados(pagosautorizadosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Autorizados",JOptionPane.INFORMATION_MESSAGE);
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
				this.pagosautorizadosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPagosAutorizados(false);
			
			//SI ES MANUAL
			if(PagosAutorizadosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPagosAutorizados();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPagosAutorizados(false);
			
			//SI ES MANUAL
			if(PagosAutorizadosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPagosAutorizados();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPagosAutorizados(false);
			
			//SI ES MANUAL
			if(PagosAutorizadosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPagosAutorizados();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPagosAutorizados() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPagosAutorizados.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPagosAutorizados.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPagosAutorizados.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPagosAutorizados.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPagosAutorizados.setMinimumSize(dimensionMinimum);
		this.jTableDatosPagosAutorizados.setMaximumSize(dimensionMaximum);
		this.jTableDatosPagosAutorizados.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPagosAutorizados(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPagosAutorizados(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPagosAutorizados(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPagosAutorizados(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPagosAutorizados(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPagosAutorizados(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPagosAutorizados(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPagosAutorizados(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PagosAutorizadosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PagosAutorizadosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPagosAutorizados() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPagosAutorizados();
		
		this.inicializarActualizarBindingBotonesManualPagosAutorizados(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPagosAutorizados();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPagosAutorizados() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPagosAutorizados(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPagosAutorizados(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPagosAutorizados.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPagosAutorizados.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePagosAutorizados.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPagosAutorizados!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPagosAutorizados.jCheckBoxPostAccionNuevoPagosAutorizados.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPagosAutorizados.jCheckBoxPostAccionSinCerrarPagosAutorizados.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPagosAutorizados.jCheckBoxPostAccionSinMensajePagosAutorizados.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPagosAutorizados.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPagosAutorizados.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePagosAutorizados.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPagosAutorizados!=null) {
				this.jInternalFrameDetalleFormPagosAutorizados.jCheckBoxPostAccionNuevoPagosAutorizados.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPagosAutorizados.jCheckBoxPostAccionSinCerrarPagosAutorizados.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPagosAutorizados.jCheckBoxPostAccionSinMensajePagosAutorizados.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPagosAutorizados.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPagosAutorizados.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPagosAutorizados!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPagosAutorizados.jComboBoxTiposAccionesFormularioPagosAutorizados.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPagosAutorizados.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPagosAutorizados!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPagosAutorizados.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPagosAutorizados.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPagosAutorizados.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPagosAutorizados.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPagosAutorizados.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPagosAutorizados!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPagosAutorizados.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPagosAutorizados.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPagosAutorizados.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPagosAutorizados(Boolean esInicializar) throws Exception {
		try	{	
			if(PagosAutorizadosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPagosAutorizados(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPagosAutorizados() throws Exception {
		try	{
			if(PagosAutorizadosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPagosAutorizados();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePagosAutorizados() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPagosAutorizados.jComboBoxTiposAccionesFormularioPagosAutorizados.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPagosAutorizados.jComboBoxTiposAccionesFormularioPagosAutorizados.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPagosAutorizados() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPagosAutorizados.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPagosAutorizados.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPagosAutorizados.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPagosAutorizados.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPagosAutorizados.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPagosAutorizados.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPagosAutorizados.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPagosAutorizados.addItem(reporte);
			}
			
			
			if(!this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPagosAutorizados.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPagosAutorizados.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPagosAutorizados.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPagosAutorizados.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPagosAutorizados.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPagosAutorizados.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPagosAutorizados.jComboBoxTiposAccionesFormularioPagosAutorizados.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPagosAutorizados.jComboBoxTiposAccionesFormularioPagosAutorizados.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPagosAutorizados.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPagosAutorizados.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPagosAutorizados.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPagosAutorizados();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPagosAutorizados() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPagosAutorizados!=null) {
				this.jInternalFrameReporteDinamicoPagosAutorizados.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPagosAutorizados.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPagosAutorizados!=null) {
				this.jInternalFrameReporteDinamicoPagosAutorizados.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPagosAutorizados.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPagosAutorizados!=null) {
				
				if(this.jInternalFrameReporteDinamicoPagosAutorizados.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPagosAutorizados.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPagosAutorizados.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPagosAutorizados.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPagosAutorizados.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPagosAutorizados.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoPagosAutorizados.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPagosAutorizados.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=PagosAutorizadosConstantesFunciones.getTiposSeleccionarPagosAutorizados(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPagosAutorizados.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoPagosAutorizados.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoPagosAutorizados.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=PagosAutorizadosConstantesFunciones.getTiposSeleccionarPagosAutorizados(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPagosAutorizados.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoPagosAutorizados.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPagosAutorizados.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=PagosAutorizadosConstantesFunciones.getTiposSeleccionarPagosAutorizados(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPagosAutorizados.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoPagosAutorizados.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoPagosAutorizados.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoPagosAutorizados.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPagosAutorizados()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_corteBusquedaPagosAutorizados=new Date(this.jDateChooserfecha_corteBusquedaPagosAutorizadosPagosAutorizados.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPagosAutorizados(Boolean esInicializar) throws Exception {				
		if(PagosAutorizadosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPagosAutorizados();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPagosAutorizados() throws Exception {
		this.inicializarActualizarBindingTablaPagosAutorizados(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPagosAutorizados() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPagosAutorizados.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPagosAutorizados.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPagosAutorizados.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PagosAutorizadosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPagosAutorizados.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPagosAutorizados.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PagosAutorizadosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPagosAutorizadosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizadosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PagosAutorizadosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPagosAutorizados.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPagosAutorizados.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PagosAutorizadosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPagosAutorizados.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPagosAutorizados(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=pagosautorizadosLogic.getPagosAutorizadoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=pagosautorizadoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PagosAutorizadosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPagosAutorizados.setModel(new PagosAutorizadosModel(this.pagosautorizadosLogic.getPagosAutorizadoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPagosAutorizados.setModel(new PagosAutorizadosModel(this.pagosautorizadoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPagosAutorizados!=null && this.jInternalFrameOrderByPagosAutorizados.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPagosAutorizados();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPagosAutorizados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizados,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PagosAutorizadosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO,pagosautorizadosConstantesFunciones.resaltarSeleccionarPagosAutorizados,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO,pagosautorizadosConstantesFunciones.resaltarSeleccionarPagosAutorizados,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPagosAutorizados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizados,PagosAutorizadosConstantesFunciones.LABEL_ID));

		if(this.pagosautorizadosConstantesFunciones.mostraridPagosAutorizados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutorizadosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.pagosautorizadosConstantesFunciones.resaltaridPagosAutorizados,this.pagosautorizadosConstantesFunciones.activaridPagosAutorizados,iSizeTabla,this,true,"idPagosAutorizados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautorizadosConstantesFunciones.resaltaridPagosAutorizados,this.pagosautorizadosConstantesFunciones.activaridPagosAutorizados,this,true,"idPagosAutorizados","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutorizados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizados,PagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE));

		if(this.pagosautorizadosConstantesFunciones.mostrarnombre_clientePagosAutorizados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagosautorizadosConstantesFunciones.resaltarnombre_clientePagosAutorizados,this.pagosautorizadosConstantesFunciones.activarnombre_clientePagosAutorizados,iSizeTabla,this,true,"nombre_clientePagosAutorizados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautorizadosConstantesFunciones.resaltarnombre_clientePagosAutorizados,this.pagosautorizadosConstantesFunciones.activarnombre_clientePagosAutorizados,this,true,"nombre_clientePagosAutorizados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosAutorizadosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutorizados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizados,PagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA));

		if(this.pagosautorizadosConstantesFunciones.mostrarnumero_facturaPagosAutorizados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagosautorizadosConstantesFunciones.resaltarnumero_facturaPagosAutorizados,this.pagosautorizadosConstantesFunciones.activarnumero_facturaPagosAutorizados,iSizeTabla,this,true,"numero_facturaPagosAutorizados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautorizadosConstantesFunciones.resaltarnumero_facturaPagosAutorizados,this.pagosautorizadosConstantesFunciones.activarnumero_facturaPagosAutorizados,this,true,"numero_facturaPagosAutorizados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosAutorizadosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutorizados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizados,PagosAutorizadosConstantesFunciones.LABEL_FECHAEMISION));

		if(this.pagosautorizadosConstantesFunciones.mostrarfecha_emisionPagosAutorizados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutorizadosConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.pagosautorizadosConstantesFunciones.resaltarfecha_emisionPagosAutorizados,this.pagosautorizadosConstantesFunciones.activarfecha_emisionPagosAutorizados,iSizeTabla,this,true,"fecha_emisionPagosAutorizados","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.pagosautorizadosConstantesFunciones.resaltarfecha_emisionPagosAutorizados,this.pagosautorizadosConstantesFunciones.activarfecha_emisionPagosAutorizados,this,true,"fecha_emisionPagosAutorizados","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PagosAutorizadosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutorizados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizados,PagosAutorizadosConstantesFunciones.LABEL_FECHAVENCIMIENTO));

		if(this.pagosautorizadosConstantesFunciones.mostrarfecha_vencimientoPagosAutorizados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutorizadosConstantesFunciones.LABEL_FECHAVENCIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.pagosautorizadosConstantesFunciones.resaltarfecha_vencimientoPagosAutorizados,this.pagosautorizadosConstantesFunciones.activarfecha_vencimientoPagosAutorizados,iSizeTabla,this,true,"fecha_vencimientoPagosAutorizados","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.pagosautorizadosConstantesFunciones.resaltarfecha_vencimientoPagosAutorizados,this.pagosautorizadosConstantesFunciones.activarfecha_vencimientoPagosAutorizados,this,true,"fecha_vencimientoPagosAutorizados","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PagosAutorizadosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutorizados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizados,PagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO));

		if(this.pagosautorizadosConstantesFunciones.mostrarnombre_bancoPagosAutorizados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagosautorizadosConstantesFunciones.resaltarnombre_bancoPagosAutorizados,this.pagosautorizadosConstantesFunciones.activarnombre_bancoPagosAutorizados,iSizeTabla,this,true,"nombre_bancoPagosAutorizados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautorizadosConstantesFunciones.resaltarnombre_bancoPagosAutorizados,this.pagosautorizadosConstantesFunciones.activarnombre_bancoPagosAutorizados,this,true,"nombre_bancoPagosAutorizados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosAutorizadosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutorizados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizados,PagosAutorizadosConstantesFunciones.LABEL_VALORPORPAGAR));

		if(this.pagosautorizadosConstantesFunciones.mostrarvalor_por_pagarPagosAutorizados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutorizadosConstantesFunciones.LABEL_VALORPORPAGAR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.pagosautorizadosConstantesFunciones.resaltarvalor_por_pagarPagosAutorizados,this.pagosautorizadosConstantesFunciones.activarvalor_por_pagarPagosAutorizados,iSizeTabla,this,true,"valor_por_pagarPagosAutorizados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautorizadosConstantesFunciones.resaltarvalor_por_pagarPagosAutorizados,this.pagosautorizadosConstantesFunciones.activarvalor_por_pagarPagosAutorizados,this,true,"valor_por_pagarPagosAutorizados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PagosAutorizadosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutorizados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizados,PagosAutorizadosConstantesFunciones.LABEL_VALORCANCELADO));

		if(this.pagosautorizadosConstantesFunciones.mostrarvalor_canceladoPagosAutorizados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutorizadosConstantesFunciones.LABEL_VALORCANCELADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.pagosautorizadosConstantesFunciones.resaltarvalor_canceladoPagosAutorizados,this.pagosautorizadosConstantesFunciones.activarvalor_canceladoPagosAutorizados,iSizeTabla,this,true,"valor_canceladoPagosAutorizados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautorizadosConstantesFunciones.resaltarvalor_canceladoPagosAutorizados,this.pagosautorizadosConstantesFunciones.activarvalor_canceladoPagosAutorizados,this,true,"valor_canceladoPagosAutorizados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PagosAutorizadosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutorizados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizados,PagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA));

		if(this.pagosautorizadosConstantesFunciones.mostrarnumero_cuentaPagosAutorizados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagosautorizadosConstantesFunciones.resaltarnumero_cuentaPagosAutorizados,this.pagosautorizadosConstantesFunciones.activarnumero_cuentaPagosAutorizados,iSizeTabla,this,true,"numero_cuentaPagosAutorizados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautorizadosConstantesFunciones.resaltarnumero_cuentaPagosAutorizados,this.pagosautorizadosConstantesFunciones.activarnumero_cuentaPagosAutorizados,this,true,"numero_cuentaPagosAutorizados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosAutorizadosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutorizados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizados,PagosAutorizadosConstantesFunciones.LABEL_ESTAAUTORIZADO));

		if(this.pagosautorizadosConstantesFunciones.mostraresta_autorizadoPagosAutorizados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutorizadosConstantesFunciones.LABEL_ESTAAUTORIZADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.pagosautorizadosConstantesFunciones.resaltaresta_autorizadoPagosAutorizados,this.pagosautorizadosConstantesFunciones.activaresta_autorizadoPagosAutorizados,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.pagosautorizadosConstantesFunciones.resaltaresta_autorizadoPagosAutorizados,this.pagosautorizadosConstantesFunciones.activaresta_autorizadoPagosAutorizados,this,true,"esta_autorizadoPagosAutorizados","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PagosAutorizadosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutorizados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizados,PagosAutorizadosConstantesFunciones.LABEL_DESCRIPCION));

		if(this.pagosautorizadosConstantesFunciones.mostrardescripcionPagosAutorizados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutorizadosConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagosautorizadosConstantesFunciones.resaltardescripcionPagosAutorizados,this.pagosautorizadosConstantesFunciones.activardescripcionPagosAutorizados,iSizeTabla,this,true,"descripcionPagosAutorizados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautorizadosConstantesFunciones.resaltardescripcionPagosAutorizados,this.pagosautorizadosConstantesFunciones.activardescripcionPagosAutorizados,this,true,"descripcionPagosAutorizados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosAutorizadosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutorizados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizados,PagosAutorizadosConstantesFunciones.LABEL_FECHACORTE));

		if(this.pagosautorizadosConstantesFunciones.mostrarfecha_corte_datoPagosAutorizados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutorizadosConstantesFunciones.LABEL_FECHACORTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.pagosautorizadosConstantesFunciones.resaltarfecha_corte_datoPagosAutorizados,this.pagosautorizadosConstantesFunciones.activarfecha_corte_datoPagosAutorizados,iSizeTabla,this,true,"fecha_corte_datoPagosAutorizados","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.pagosautorizadosConstantesFunciones.resaltarfecha_corte_datoPagosAutorizados,this.pagosautorizadosConstantesFunciones.activarfecha_corte_datoPagosAutorizados,this,true,"fecha_corte_datoPagosAutorizados","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PagosAutorizadosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutorizados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizados,PagosAutorizadosConstantesFunciones.LABEL_ESTADO));

		if(this.pagosautorizadosConstantesFunciones.mostrarestadoPagosAutorizados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutorizadosConstantesFunciones.LABEL_ESTADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagosautorizadosConstantesFunciones.resaltarestadoPagosAutorizados,this.pagosautorizadosConstantesFunciones.activarestadoPagosAutorizados,iSizeTabla,this,true,"estadoPagosAutorizados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautorizadosConstantesFunciones.resaltarestadoPagosAutorizados,this.pagosautorizadosConstantesFunciones.activarestadoPagosAutorizados,this,true,"estadoPagosAutorizados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosAutorizadosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutorizados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizados,PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE));

		if(this.pagosautorizadosConstantesFunciones.mostrarcodigo_cuenta_con_clientePagosAutorizados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagosautorizadosConstantesFunciones.resaltarcodigo_cuenta_con_clientePagosAutorizados,this.pagosautorizadosConstantesFunciones.activarcodigo_cuenta_con_clientePagosAutorizados,iSizeTabla,this,true,"codigo_cuenta_con_clientePagosAutorizados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautorizadosConstantesFunciones.resaltarcodigo_cuenta_con_clientePagosAutorizados,this.pagosautorizadosConstantesFunciones.activarcodigo_cuenta_con_clientePagosAutorizados,this,true,"codigo_cuenta_con_clientePagosAutorizados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosAutorizadosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutorizados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizados,PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO));

		if(this.pagosautorizadosConstantesFunciones.mostrarcodigo_cuenta_con_bancoPagosAutorizados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagosautorizadosConstantesFunciones.resaltarcodigo_cuenta_con_bancoPagosAutorizados,this.pagosautorizadosConstantesFunciones.activarcodigo_cuenta_con_bancoPagosAutorizados,iSizeTabla,this,true,"codigo_cuenta_con_bancoPagosAutorizados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautorizadosConstantesFunciones.resaltarcodigo_cuenta_con_bancoPagosAutorizados,this.pagosautorizadosConstantesFunciones.activarcodigo_cuenta_con_bancoPagosAutorizados,this,true,"codigo_cuenta_con_bancoPagosAutorizados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosAutorizadosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.pagosautorizadosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.pagosautorizadosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.pagosautorizadosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPagosAutorizados.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.pagosautorizadosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.pagosautorizadosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPagosAutorizados.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPagosAutorizados && this.isPermisoGuardarCambiosPagosAutorizados) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.pagosautorizadosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.pagosautorizadosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPagosAutorizados.addColumn(tableColumn);
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
			
			this.jTableDatosPagosAutorizados.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPagosAutorizados && this.isPermisoGuardarCambiosPagosAutorizados) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPagosAutorizados && this.isPermisoGuardarCambiosPagosAutorizados) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPagosAutorizados.moveColumn(this.jTableDatosPagosAutorizados.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPagosAutorizados.moveColumn(this.jTableDatosPagosAutorizados.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPagosAutorizados.moveColumn(this.jTableDatosPagosAutorizados.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPagosAutorizados.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPagosAutorizados.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPagosAutorizados,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PagosAutorizadosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPagosAutorizados.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPagosAutorizados.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PagosAutorizadosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PagosAutorizadosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPagosAutorizados.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPagosAutorizados.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPagosAutorizados.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=pagosautorizadosLogic.getPagosAutorizadoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=pagosautorizadoss.size()-1;
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
		//this.jTableDatosPagosAutorizados.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPagosAutorizados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPagosAutorizados();
			
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
				
				//this.isEsNuevoPagosAutorizados=false;
					
				PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
			
				if(this.pagosautorizadosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPagosAutorizados==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPagosAutorizados.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPagosAutorizados.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizados =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagosautorizados =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.pagosautorizados.getsType().equals("DUPLICADO")
				   || this.pagosautorizados.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPagosAutorizados=true;
				
				} else {
					this.isEsNuevoPagosAutorizados=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {
					if(this.pagosautorizados.getId()>=0 && !this.pagosautorizados.getIsNew()) {						
						this.isEsNuevoPagosAutorizados=false;
						
					} else {
						this.isEsNuevoPagosAutorizados=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPagosAutorizados(esRelaciones);						
				
				this.seleccionarPagosAutorizados(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.pagosautorizados.getId()<0) {
					this.isEsNuevoPagosAutorizados=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPagosAutorizados(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPagosAutorizados(evt,rowIndex);
				}	
				
				if(this.pagosautorizadosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PagosAutorizados: " + this.dDif); 
					}
				}								
				
				PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPagosAutorizados(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.pagosautorizados)) {
					if(this.pagosautorizados.getId()>0) {
						this.pagosautorizados.setIsDeleted(true);
						
						this.pagosautorizadossEliminados.add(this.pagosautorizados);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.pagosautorizadosLogic.getPagosAutorizadoss().remove(this.pagosautorizados);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.pagosautorizadoss.remove(this.pagosautorizados);				
					}
					
					
					((PagosAutorizadosModel) this.jTableDatosPagosAutorizados.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPagosAutorizados(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPagosAutorizados(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPagosAutorizados) {
			
			if(this.jInternalFrameDetalleFormPagosAutorizados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPagosAutorizados.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPagosAutorizados.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizados =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagosautorizados =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PagosAutorizadosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPagosAutorizados(this.pagosautorizados);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPagosAutorizados("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPagosAutorizados(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPagosAutorizados() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPagosAutorizados(PagosAutorizados pagosautorizados) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPagosAutorizados(pagosautorizados,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPagosAutorizados(PagosAutorizados pagosautorizados,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPagosAutorizados(pagosautorizados);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPagosAutorizados(pagosautorizados,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPagosAutorizados(pagosautorizados);
	}
	
	public void setVariablesObjetoActualToFormularioPagosAutorizados(PagosAutorizados pagosautorizados) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPagosAutorizados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPagosAutorizados.jLabelidPagosAutorizados.setText(pagosautorizados.getId().toString());
			this.jInternalFrameDetalleFormPagosAutorizados.jTextAreanombre_clientePagosAutorizados.setText(pagosautorizados.getnombre_cliente());
			this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldnumero_facturaPagosAutorizados.setText(pagosautorizados.getnumero_factura());
			this.jInternalFrameDetalleFormPagosAutorizados.jDateChooserfecha_emisionPagosAutorizados.setDate(pagosautorizados.getfecha_emision());
			this.jInternalFrameDetalleFormPagosAutorizados.jDateChooserfecha_vencimientoPagosAutorizados.setDate(pagosautorizados.getfecha_vencimiento());
			this.jInternalFrameDetalleFormPagosAutorizados.jTextAreanombre_bancoPagosAutorizados.setText(pagosautorizados.getnombre_banco());
			this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldvalor_por_pagarPagosAutorizados.setText(pagosautorizados.getvalor_por_pagar().toString());
			this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldvalor_canceladoPagosAutorizados.setText(pagosautorizados.getvalor_cancelado().toString());
			this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldnumero_cuentaPagosAutorizados.setText(pagosautorizados.getnumero_cuenta());
			this.jInternalFrameDetalleFormPagosAutorizados.jCheckBoxesta_autorizadoPagosAutorizados.setSelected(pagosautorizados.getesta_autorizado());
			this.jInternalFrameDetalleFormPagosAutorizados.jTextAreadescripcionPagosAutorizados.setText(pagosautorizados.getdescripcion());
			this.jInternalFrameDetalleFormPagosAutorizados.jDateChooserfecha_corte_datoPagosAutorizados.setDate(pagosautorizados.getfecha_corte_dato());
			this.jInternalFrameDetalleFormPagosAutorizados.jTextAreaestadoPagosAutorizados.setText(pagosautorizados.getestado());
			this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldcodigo_cuenta_con_clientePagosAutorizados.setText(pagosautorizados.getcodigo_cuenta_con_cliente());
			this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldcodigo_cuenta_con_bancoPagosAutorizados.setText(pagosautorizados.getcodigo_cuenta_con_banco());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PagosAutorizados pagosautorizadosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,pagosautorizadosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PagosAutorizados pagosautorizadosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				pagosautorizadosLocal=this.pagosautorizados;
			} else {
				pagosautorizadosLocal=this.pagosautorizadosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(pagosautorizadosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPagosAutorizados(pagosautorizadosLocal,true);
					
					if(pagosautorizadosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(pagosautorizadosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(pagosautorizadosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPagosAutorizados(PagosAutorizados pagosautorizados,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPagosAutorizados(pagosautorizados,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(pagosautorizados);
	}
	
	public void setVariablesFormularioToObjetoActualPagosAutorizados(PagosAutorizados pagosautorizados,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPagosAutorizados(pagosautorizados,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPagosAutorizados(PagosAutorizados pagosautorizados,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPagosAutorizados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPagosAutorizados.jLabelidPagosAutorizados.getText()==null || this.jInternalFrameDetalleFormPagosAutorizados.jLabelidPagosAutorizados.getText()=="" || this.jInternalFrameDetalleFormPagosAutorizados.jLabelidPagosAutorizados.getText()=="Id") {
				this.jInternalFrameDetalleFormPagosAutorizados.jLabelidPagosAutorizados.setText("0");
			}

			if(conColumnasBase) {pagosautorizados.setId(Long.parseLong(this.jInternalFrameDetalleFormPagosAutorizados.jLabelidPagosAutorizados.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutorizadosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizados.jLabelIdPagosAutorizados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautorizados.setnombre_cliente(this.jInternalFrameDetalleFormPagosAutorizados.jTextAreanombre_clientePagosAutorizados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizados.jLabelnombre_clientePagosAutorizados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautorizados.setnumero_factura(this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldnumero_facturaPagosAutorizados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizados.jLabelnumero_facturaPagosAutorizados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautorizados.setfecha_emision(this.jInternalFrameDetalleFormPagosAutorizados.jDateChooserfecha_emisionPagosAutorizados.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutorizadosConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizados.jLabelfecha_emisionPagosAutorizados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautorizados.setfecha_vencimiento(this.jInternalFrameDetalleFormPagosAutorizados.jDateChooserfecha_vencimientoPagosAutorizados.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutorizadosConstantesFunciones.LABEL_FECHAVENCIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizados.jLabelfecha_vencimientoPagosAutorizados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautorizados.setnombre_banco(this.jInternalFrameDetalleFormPagosAutorizados.jTextAreanombre_bancoPagosAutorizados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizados.jLabelnombre_bancoPagosAutorizados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautorizados.setvalor_por_pagar(Double.parseDouble(this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldvalor_por_pagarPagosAutorizados.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutorizadosConstantesFunciones.LABEL_VALORPORPAGAR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizados.jLabelvalor_por_pagarPagosAutorizados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautorizados.setvalor_cancelado(Double.parseDouble(this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldvalor_canceladoPagosAutorizados.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutorizadosConstantesFunciones.LABEL_VALORCANCELADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizados.jLabelvalor_canceladoPagosAutorizados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautorizados.setnumero_cuenta(this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldnumero_cuentaPagosAutorizados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizados.jLabelnumero_cuentaPagosAutorizados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautorizados.setesta_autorizado(this.jInternalFrameDetalleFormPagosAutorizados.jCheckBoxesta_autorizadoPagosAutorizados.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutorizadosConstantesFunciones.LABEL_ESTAAUTORIZADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizados.jLabelesta_autorizadoPagosAutorizados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautorizados.setdescripcion(this.jInternalFrameDetalleFormPagosAutorizados.jTextAreadescripcionPagosAutorizados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutorizadosConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizados.jLabeldescripcionPagosAutorizados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautorizados.setfecha_corte_dato(this.jInternalFrameDetalleFormPagosAutorizados.jDateChooserfecha_corte_datoPagosAutorizados.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutorizadosConstantesFunciones.LABEL_FECHACORTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizados.jLabelfecha_corte_datoPagosAutorizados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautorizados.setestado(this.jInternalFrameDetalleFormPagosAutorizados.jTextAreaestadoPagosAutorizados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutorizadosConstantesFunciones.LABEL_ESTADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizados.jLabelestadoPagosAutorizados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautorizados.setcodigo_cuenta_con_cliente(this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldcodigo_cuenta_con_clientePagosAutorizados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizados.jLabelcodigo_cuenta_con_clientePagosAutorizados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautorizados.setcodigo_cuenta_con_banco(this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldcodigo_cuenta_con_bancoPagosAutorizados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutorizados.jLabelcodigo_cuenta_con_bancoPagosAutorizados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPagosAutorizados(PagosAutorizados pagosautorizadosBean,PagosAutorizados pagosautorizados,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPagosAutorizados(PagosAutorizados pagosautorizadosOrigen,PagosAutorizados pagosautorizados,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && pagosautorizadosOrigen.getId()!=null && !pagosautorizadosOrigen.getId().equals(0L))) {pagosautorizados.setId(pagosautorizadosOrigen.getId());}}
			if(conDefault || (!conDefault && pagosautorizadosOrigen.getfecha_corte()!=null && !pagosautorizadosOrigen.getfecha_corte().equals(new Date()))) {pagosautorizados.setfecha_corte(pagosautorizadosOrigen.getfecha_corte());}
			if(conDefault || (!conDefault && pagosautorizadosOrigen.getnombre_cliente()!=null && !pagosautorizadosOrigen.getnombre_cliente().equals(""))) {pagosautorizados.setnombre_cliente(pagosautorizadosOrigen.getnombre_cliente());}
			if(conDefault || (!conDefault && pagosautorizadosOrigen.getnumero_factura()!=null && !pagosautorizadosOrigen.getnumero_factura().equals(""))) {pagosautorizados.setnumero_factura(pagosautorizadosOrigen.getnumero_factura());}
			if(conDefault || (!conDefault && pagosautorizadosOrigen.getfecha_emision()!=null && !pagosautorizadosOrigen.getfecha_emision().equals(new Date()))) {pagosautorizados.setfecha_emision(pagosautorizadosOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && pagosautorizadosOrigen.getfecha_vencimiento()!=null && !pagosautorizadosOrigen.getfecha_vencimiento().equals(new Date()))) {pagosautorizados.setfecha_vencimiento(pagosautorizadosOrigen.getfecha_vencimiento());}
			if(conDefault || (!conDefault && pagosautorizadosOrigen.getnombre_banco()!=null && !pagosautorizadosOrigen.getnombre_banco().equals(""))) {pagosautorizados.setnombre_banco(pagosautorizadosOrigen.getnombre_banco());}
			if(conDefault || (!conDefault && pagosautorizadosOrigen.getvalor_por_pagar()!=null && !pagosautorizadosOrigen.getvalor_por_pagar().equals(0.0))) {pagosautorizados.setvalor_por_pagar(pagosautorizadosOrigen.getvalor_por_pagar());}
			if(conDefault || (!conDefault && pagosautorizadosOrigen.getvalor_cancelado()!=null && !pagosautorizadosOrigen.getvalor_cancelado().equals(0.0))) {pagosautorizados.setvalor_cancelado(pagosautorizadosOrigen.getvalor_cancelado());}
			if(conDefault || (!conDefault && pagosautorizadosOrigen.getnumero_cuenta()!=null && !pagosautorizadosOrigen.getnumero_cuenta().equals(""))) {pagosautorizados.setnumero_cuenta(pagosautorizadosOrigen.getnumero_cuenta());}
			if(conDefault || (!conDefault && pagosautorizadosOrigen.getesta_autorizado()!=null && !pagosautorizadosOrigen.getesta_autorizado().equals(false))) {pagosautorizados.setesta_autorizado(pagosautorizadosOrigen.getesta_autorizado());}
			if(conDefault || (!conDefault && pagosautorizadosOrigen.getdescripcion()!=null && !pagosautorizadosOrigen.getdescripcion().equals(""))) {pagosautorizados.setdescripcion(pagosautorizadosOrigen.getdescripcion());}
			if(conDefault || (!conDefault && pagosautorizadosOrigen.getfecha_corte_dato()!=null && !pagosautorizadosOrigen.getfecha_corte_dato().equals(new Date()))) {pagosautorizados.setfecha_corte_dato(pagosautorizadosOrigen.getfecha_corte_dato());}
			if(conDefault || (!conDefault && pagosautorizadosOrigen.getestado()!=null && !pagosautorizadosOrigen.getestado().equals(""))) {pagosautorizados.setestado(pagosautorizadosOrigen.getestado());}
			if(conDefault || (!conDefault && pagosautorizadosOrigen.getcodigo_cuenta_con_cliente()!=null && !pagosautorizadosOrigen.getcodigo_cuenta_con_cliente().equals(""))) {pagosautorizados.setcodigo_cuenta_con_cliente(pagosautorizadosOrigen.getcodigo_cuenta_con_cliente());}
			if(conDefault || (!conDefault && pagosautorizadosOrigen.getcodigo_cuenta_con_banco()!=null && !pagosautorizadosOrigen.getcodigo_cuenta_con_banco().equals(""))) {pagosautorizados.setcodigo_cuenta_con_banco(pagosautorizadosOrigen.getcodigo_cuenta_con_banco());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPagosAutorizados(PagosAutorizados pagosautorizados) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPagosAutorizados.jLabelidPagosAutorizados.setText(pagosautorizados.getId().toString());
			this.jInternalFrameDetalleFormPagosAutorizados.jTextAreanombre_clientePagosAutorizados.setText(pagosautorizados.getnombre_cliente());
			this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldnumero_facturaPagosAutorizados.setText(pagosautorizados.getnumero_factura());
			this.jInternalFrameDetalleFormPagosAutorizados.jDateChooserfecha_emisionPagosAutorizados.setDate(pagosautorizados.getfecha_emision());
			this.jInternalFrameDetalleFormPagosAutorizados.jDateChooserfecha_vencimientoPagosAutorizados.setDate(pagosautorizados.getfecha_vencimiento());
			this.jInternalFrameDetalleFormPagosAutorizados.jTextAreanombre_bancoPagosAutorizados.setText(pagosautorizados.getnombre_banco());
			this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldvalor_por_pagarPagosAutorizados.setText(pagosautorizados.getvalor_por_pagar().toString());
			this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldvalor_canceladoPagosAutorizados.setText(pagosautorizados.getvalor_cancelado().toString());
			this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldnumero_cuentaPagosAutorizados.setText(pagosautorizados.getnumero_cuenta());
			this.jInternalFrameDetalleFormPagosAutorizados.jCheckBoxesta_autorizadoPagosAutorizados.setSelected(pagosautorizados.getesta_autorizado());
			this.jInternalFrameDetalleFormPagosAutorizados.jTextAreadescripcionPagosAutorizados.setText(pagosautorizados.getdescripcion());
			this.jInternalFrameDetalleFormPagosAutorizados.jDateChooserfecha_corte_datoPagosAutorizados.setDate(pagosautorizados.getfecha_corte_dato());
			this.jInternalFrameDetalleFormPagosAutorizados.jTextAreaestadoPagosAutorizados.setText(pagosautorizados.getestado());
			this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldcodigo_cuenta_con_clientePagosAutorizados.setText(pagosautorizados.getcodigo_cuenta_con_cliente());
			this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldcodigo_cuenta_con_bancoPagosAutorizados.setText(pagosautorizados.getcodigo_cuenta_con_banco());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPagosAutorizados(PagosAutorizadosBean pagosautorizadosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPagosAutorizados.jLabelidPagosAutorizados.setText(pagosautorizadosBean.getId().toString());
			this.jInternalFrameDetalleFormPagosAutorizados.jTextAreanombre_clientePagosAutorizados.setText(pagosautorizadosBean.getnombre_cliente());
			this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldnumero_facturaPagosAutorizados.setText(pagosautorizadosBean.getnumero_factura());
			this.jInternalFrameDetalleFormPagosAutorizados.jDateChooserfecha_emisionPagosAutorizados.setDate(pagosautorizadosBean.getfecha_emision());
			this.jInternalFrameDetalleFormPagosAutorizados.jDateChooserfecha_vencimientoPagosAutorizados.setDate(pagosautorizadosBean.getfecha_vencimiento());
			this.jInternalFrameDetalleFormPagosAutorizados.jTextAreanombre_bancoPagosAutorizados.setText(pagosautorizadosBean.getnombre_banco());
			this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldvalor_por_pagarPagosAutorizados.setText(pagosautorizadosBean.getvalor_por_pagar().toString());
			this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldvalor_canceladoPagosAutorizados.setText(pagosautorizadosBean.getvalor_cancelado().toString());
			this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldnumero_cuentaPagosAutorizados.setText(pagosautorizadosBean.getnumero_cuenta());
			this.jInternalFrameDetalleFormPagosAutorizados.jCheckBoxesta_autorizadoPagosAutorizados.setSelected(pagosautorizadosBean.getesta_autorizado());
			this.jInternalFrameDetalleFormPagosAutorizados.jTextAreadescripcionPagosAutorizados.setText(pagosautorizadosBean.getdescripcion());
			this.jInternalFrameDetalleFormPagosAutorizados.jDateChooserfecha_corte_datoPagosAutorizados.setDate(pagosautorizadosBean.getfecha_corte_dato());
			this.jInternalFrameDetalleFormPagosAutorizados.jTextAreaestadoPagosAutorizados.setText(pagosautorizadosBean.getestado());
			this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldcodigo_cuenta_con_clientePagosAutorizados.setText(pagosautorizadosBean.getcodigo_cuenta_con_cliente());
			this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldcodigo_cuenta_con_bancoPagosAutorizados.setText(pagosautorizadosBean.getcodigo_cuenta_con_banco());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPagosAutorizados(PagosAutorizadosParameterReturnGeneral pagosautorizadosReturnGeneral,PagosAutorizadosBean pagosautorizadosBean,Boolean conDefault) throws Exception { 
		try {
			PagosAutorizados pagosautorizadosLocal=new PagosAutorizados();
			
			pagosautorizadosLocal=pagosautorizadosReturnGeneral.getPagosAutorizados();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && pagosautorizadosLocal.getId()!=null && !pagosautorizadosLocal.getId().equals(0L))) {pagosautorizadosBean.setId(pagosautorizadosLocal.getId());}}
			if(conDefault || (!conDefault && pagosautorizadosLocal.getnombre_cliente()!=null && !pagosautorizadosLocal.getnombre_cliente().equals(""))) {pagosautorizadosBean.setnombre_cliente(pagosautorizadosLocal.getnombre_cliente());}
			if(conDefault || (!conDefault && pagosautorizadosLocal.getnumero_factura()!=null && !pagosautorizadosLocal.getnumero_factura().equals(""))) {pagosautorizadosBean.setnumero_factura(pagosautorizadosLocal.getnumero_factura());}
			if(conDefault || (!conDefault && pagosautorizadosLocal.getfecha_emision()!=null && !pagosautorizadosLocal.getfecha_emision().equals(new Date()))) {pagosautorizadosBean.setfecha_emision(pagosautorizadosLocal.getfecha_emision());}
			if(conDefault || (!conDefault && pagosautorizadosLocal.getfecha_vencimiento()!=null && !pagosautorizadosLocal.getfecha_vencimiento().equals(new Date()))) {pagosautorizadosBean.setfecha_vencimiento(pagosautorizadosLocal.getfecha_vencimiento());}
			if(conDefault || (!conDefault && pagosautorizadosLocal.getnombre_banco()!=null && !pagosautorizadosLocal.getnombre_banco().equals(""))) {pagosautorizadosBean.setnombre_banco(pagosautorizadosLocal.getnombre_banco());}
			if(conDefault || (!conDefault && pagosautorizadosLocal.getvalor_por_pagar()!=null && !pagosautorizadosLocal.getvalor_por_pagar().equals(0.0))) {pagosautorizadosBean.setvalor_por_pagar(pagosautorizadosLocal.getvalor_por_pagar());}
			if(conDefault || (!conDefault && pagosautorizadosLocal.getvalor_cancelado()!=null && !pagosautorizadosLocal.getvalor_cancelado().equals(0.0))) {pagosautorizadosBean.setvalor_cancelado(pagosautorizadosLocal.getvalor_cancelado());}
			if(conDefault || (!conDefault && pagosautorizadosLocal.getnumero_cuenta()!=null && !pagosautorizadosLocal.getnumero_cuenta().equals(""))) {pagosautorizadosBean.setnumero_cuenta(pagosautorizadosLocal.getnumero_cuenta());}
			if(conDefault || (!conDefault && pagosautorizadosLocal.getesta_autorizado()!=null && !pagosautorizadosLocal.getesta_autorizado().equals(false))) {pagosautorizadosBean.setesta_autorizado(pagosautorizadosLocal.getesta_autorizado());}
			if(conDefault || (!conDefault && pagosautorizadosLocal.getdescripcion()!=null && !pagosautorizadosLocal.getdescripcion().equals(""))) {pagosautorizadosBean.setdescripcion(pagosautorizadosLocal.getdescripcion());}
			if(conDefault || (!conDefault && pagosautorizadosLocal.getfecha_corte_dato()!=null && !pagosautorizadosLocal.getfecha_corte_dato().equals(new Date()))) {pagosautorizadosBean.setfecha_corte_dato(pagosautorizadosLocal.getfecha_corte_dato());}
			if(conDefault || (!conDefault && pagosautorizadosLocal.getestado()!=null && !pagosautorizadosLocal.getestado().equals(""))) {pagosautorizadosBean.setestado(pagosautorizadosLocal.getestado());}
			if(conDefault || (!conDefault && pagosautorizadosLocal.getcodigo_cuenta_con_cliente()!=null && !pagosautorizadosLocal.getcodigo_cuenta_con_cliente().equals(""))) {pagosautorizadosBean.setcodigo_cuenta_con_cliente(pagosautorizadosLocal.getcodigo_cuenta_con_cliente());}
			if(conDefault || (!conDefault && pagosautorizadosLocal.getcodigo_cuenta_con_banco()!=null && !pagosautorizadosLocal.getcodigo_cuenta_con_banco().equals(""))) {pagosautorizadosBean.setcodigo_cuenta_con_banco(pagosautorizadosLocal.getcodigo_cuenta_con_banco());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPagosAutorizadosGenerico(Long idPagosAutorizadosSeleccionado,JComboBox jComboBoxPagosAutorizados,List<PagosAutorizados> pagosautorizadossLocal)throws Exception {
		try {
			PagosAutorizados  pagosautorizadosTemp=null;

			for(PagosAutorizados pagosautorizadosAux:pagosautorizadossLocal) {
				if(pagosautorizadosAux.getId()!=null && pagosautorizadosAux.getId().equals(idPagosAutorizadosSeleccionado)) {
					pagosautorizadosTemp=pagosautorizadosAux;
					break;
				}
			}

			jComboBoxPagosAutorizados.setSelectedItem(pagosautorizadosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPagosAutorizadosGenerico(JComboBox jComboBoxPagosAutorizados,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPagosAutorizados.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPagosAutorizados.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPagosAutorizados.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPagosAutorizados.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			pagosautorizados=(PagosAutorizados) pagosautorizadosLogic.getPagosAutorizadoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			pagosautorizados =(PagosAutorizados) pagosautorizadoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!pagosautorizados.getIsNew() && !pagosautorizados.getIsChanged() && !pagosautorizados.getIsDeleted()) {
				sDescripcion=pagosautorizados.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=pagosautorizados.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PagosAutorizados pagosautorizadosRow=new PagosAutorizados();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			pagosautorizadosRow=(PagosAutorizados) pagosautorizadosLogic.getPagosAutorizadoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			pagosautorizadosRow=(PagosAutorizados) pagosautorizadoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPagosAutorizados(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPagosAutorizados.setVisible((this.isVisibilidadCeldaNuevoPagosAutorizados && this.isPermisoNuevoPagosAutorizados));			
			this.jButtonDuplicarPagosAutorizados.setVisible((this.isVisibilidadCeldaDuplicarPagosAutorizados && this.isPermisoDuplicarPagosAutorizados));			
			this.jButtonCopiarPagosAutorizados.setVisible((this.isVisibilidadCeldaCopiarPagosAutorizados && this.isPermisoCopiarPagosAutorizados));
			this.jButtonVerFormPagosAutorizados.setVisible((this.isVisibilidadCeldaVerFormPagosAutorizados && this.isPermisoVerFormPagosAutorizados));
			
			this.jButtonAbrirOrderByPagosAutorizados.setVisible((this.isVisibilidadCeldaOrdenPagosAutorizados && this.isPermisoOrdenPagosAutorizados));			
			
			this.jButtonNuevoRelacionesPagosAutorizados.setVisible((this.isVisibilidadCeldaNuevoRelacionesPagosAutorizados && this.isPermisoNuevoPagosAutorizados));			
			this.jButtonNuevoGuardarCambiosPagosAutorizados.setVisible((this.isVisibilidadCeldaNuevoPagosAutorizados && this.isPermisoNuevoPagosAutorizados && this.isPermisoGuardarCambiosPagosAutorizados));
			
			if(this.jInternalFrameDetalleFormPagosAutorizados!=null) {
			this.jInternalFrameDetalleFormPagosAutorizados.jButtonModificarPagosAutorizados.setVisible((this.isVisibilidadCeldaModificarPagosAutorizados && this.isPermisoActualizarPagosAutorizados));	
			this.jInternalFrameDetalleFormPagosAutorizados.jButtonActualizarPagosAutorizados.setVisible((this.isVisibilidadCeldaActualizarPagosAutorizados && this.isPermisoActualizarPagosAutorizados));	
			this.jInternalFrameDetalleFormPagosAutorizados.jButtonEliminarPagosAutorizados.setVisible((this.isVisibilidadCeldaEliminarPagosAutorizados && this.isPermisoEliminarPagosAutorizados));
			this.jInternalFrameDetalleFormPagosAutorizados.jButtonCancelarPagosAutorizados.setVisible(this.isVisibilidadCeldaCancelarPagosAutorizados);							
			this.jInternalFrameDetalleFormPagosAutorizados.jButtonGuardarCambiosPagosAutorizados.setVisible((this.isVisibilidadCeldaGuardarPagosAutorizados && this.isPermisoGuardarCambiosPagosAutorizados));			
			
			}
						
			this.jButtonGuardarCambiosTablaPagosAutorizados.setVisible((this.isVisibilidadCeldaGuardarCambiosPagosAutorizados && this.isPermisoGuardarCambiosPagosAutorizados));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPagosAutorizados.setVisible((this.isVisibilidadCeldaNuevoPagosAutorizados && this.isPermisoNuevoPagosAutorizados));						
			this.jButtonDuplicarToolBarPagosAutorizados.setVisible((this.isVisibilidadCeldaDuplicarPagosAutorizados && this.isPermisoDuplicarPagosAutorizados));						
			this.jButtonCopiarToolBarPagosAutorizados.setVisible((this.isVisibilidadCeldaCopiarPagosAutorizados && this.isPermisoCopiarPagosAutorizados));			
			this.jButtonVerFormToolBarPagosAutorizados.setVisible((this.isVisibilidadCeldaVerFormPagosAutorizados && this.isPermisoVerFormPagosAutorizados));			
			this.jButtonAbrirOrderByToolBarPagosAutorizados.setVisible((this.isVisibilidadCeldaOrdenPagosAutorizados && this.isPermisoOrdenPagosAutorizados));
			this.jButtonNuevoRelacionesToolBarPagosAutorizados.setVisible((this.isVisibilidadCeldaNuevoRelacionesPagosAutorizados && this.isPermisoNuevoPagosAutorizados));			
			this.jButtonNuevoGuardarCambiosToolBarPagosAutorizados.setVisible((this.isVisibilidadCeldaNuevoPagosAutorizados && this.isPermisoNuevoPagosAutorizados && this.isPermisoGuardarCambiosPagosAutorizados));			
			
			if(this.jInternalFrameDetalleFormPagosAutorizados!=null) {
			this.jInternalFrameDetalleFormPagosAutorizados.jButtonModificarToolBarPagosAutorizados.setVisible((this.isVisibilidadCeldaModificarPagosAutorizados && this.isPermisoActualizarPagosAutorizados));	
			this.jInternalFrameDetalleFormPagosAutorizados.jButtonActualizarToolBarPagosAutorizados.setVisible((this.isVisibilidadCeldaActualizarPagosAutorizados  && this.isPermisoActualizarPagosAutorizados));	
			this.jInternalFrameDetalleFormPagosAutorizados.jButtonEliminarToolBarPagosAutorizados.setVisible((this.isVisibilidadCeldaEliminarPagosAutorizados && this.isPermisoEliminarPagosAutorizados));
			this.jInternalFrameDetalleFormPagosAutorizados.jButtonCancelarToolBarPagosAutorizados.setVisible(this.isVisibilidadCeldaCancelarPagosAutorizados);				
			this.jInternalFrameDetalleFormPagosAutorizados.jButtonGuardarCambiosToolBarPagosAutorizados.setVisible((this.isVisibilidadCeldaGuardarPagosAutorizados && this.isPermisoGuardarCambiosPagosAutorizados));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPagosAutorizados.setVisible((this.isVisibilidadCeldaGuardarCambiosPagosAutorizados && this.isPermisoGuardarCambiosPagosAutorizados));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPagosAutorizados.setVisible((this.isVisibilidadCeldaNuevoPagosAutorizados && this.isPermisoNuevoPagosAutorizados));			
			this.jMenuItemDuplicarPagosAutorizados.setVisible((this.isVisibilidadCeldaDuplicarPagosAutorizados && this.isPermisoDuplicarPagosAutorizados));			
			this.jMenuItemCopiarPagosAutorizados.setVisible((this.isVisibilidadCeldaCopiarPagosAutorizados && this.isPermisoCopiarPagosAutorizados));			
			this.jMenuItemVerFormPagosAutorizados.setVisible((this.isVisibilidadCeldaVerFormPagosAutorizados && this.isPermisoVerFormPagosAutorizados));			
			this.jMenuItemAbrirOrderByPagosAutorizados.setVisible((this.isVisibilidadCeldaOrdenPagosAutorizados && this.isPermisoOrdenPagosAutorizados));			
			//this.jMenuItemMostrarOcultarPagosAutorizados.setVisible((this.isVisibilidadCeldaOrdenPagosAutorizados && this.isPermisoOrdenPagosAutorizados));
			this.jMenuItemDetalleAbrirOrderByPagosAutorizados.setVisible((this.isVisibilidadCeldaOrdenPagosAutorizados && this.isPermisoOrdenPagosAutorizados));			
			//this.jMenuItemDetalleMostrarOcultarPagosAutorizados.setVisible((this.isVisibilidadCeldaOrdenPagosAutorizados && this.isPermisoOrdenPagosAutorizados));			
			this.jMenuItemNuevoRelacionesPagosAutorizados.setVisible((this.isVisibilidadCeldaNuevoRelacionesPagosAutorizados && this.isPermisoNuevoPagosAutorizados));			
			this.jMenuItemNuevoGuardarCambiosPagosAutorizados.setVisible((this.isVisibilidadCeldaNuevoPagosAutorizados && this.isPermisoNuevoPagosAutorizados && this.isPermisoGuardarCambiosPagosAutorizados));									
			
			if(this.jInternalFrameDetalleFormPagosAutorizados!=null) {
			this.jInternalFrameDetalleFormPagosAutorizados.jMenuItemModificarPagosAutorizados.setVisible((this.isVisibilidadCeldaModificarPagosAutorizados && this.isPermisoActualizarPagosAutorizados));	
			this.jInternalFrameDetalleFormPagosAutorizados.jMenuItemActualizarPagosAutorizados.setVisible((this.isVisibilidadCeldaActualizarPagosAutorizados && this.isPermisoActualizarPagosAutorizados));	
			this.jInternalFrameDetalleFormPagosAutorizados.jMenuItemEliminarPagosAutorizados.setVisible((this.isVisibilidadCeldaEliminarPagosAutorizados && this.isPermisoEliminarPagosAutorizados));
			this.jInternalFrameDetalleFormPagosAutorizados.jMenuItemCancelarPagosAutorizados.setVisible(this.isVisibilidadCeldaCancelarPagosAutorizados);				
			}
			
			this.jMenuItemGuardarCambiosPagosAutorizados.setVisible((this.isVisibilidadCeldaGuardarPagosAutorizados && this.isPermisoGuardarCambiosPagosAutorizados));						
			this.jMenuItemGuardarCambiosTablaPagosAutorizados.setVisible((this.isVisibilidadCeldaGuardarCambiosPagosAutorizados && this.isPermisoGuardarCambiosPagosAutorizados));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPagosAutorizados=this.jButtonNuevoPagosAutorizados.isVisible();
			this.isVisibilidadCeldaDuplicarPagosAutorizados=this.jButtonDuplicarPagosAutorizados.isVisible();
			this.isVisibilidadCeldaCopiarPagosAutorizados=this.jButtonCopiarPagosAutorizados.isVisible();
			this.isVisibilidadCeldaVerFormPagosAutorizados=this.jButtonVerFormPagosAutorizados.isVisible();
			
			this.isVisibilidadCeldaOrdenPagosAutorizados=this.jButtonAbrirOrderByPagosAutorizados.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPagosAutorizados=this.jButtonNuevoRelacionesPagosAutorizados.isVisible();
			this.isVisibilidadCeldaModificarPagosAutorizados=this.jButtonModificarPagosAutorizados.isVisible();
			
			if(this.jInternalFrameDetalleFormPagosAutorizados!=null) {
			this.isVisibilidadCeldaActualizarPagosAutorizados=this.jInternalFrameDetalleFormPagosAutorizados.jButtonActualizarPagosAutorizados.isVisible();
			this.isVisibilidadCeldaEliminarPagosAutorizados=this.jInternalFrameDetalleFormPagosAutorizados.jButtonEliminarPagosAutorizados.isVisible();
			this.isVisibilidadCeldaCancelarPagosAutorizados=this.jInternalFrameDetalleFormPagosAutorizados.jButtonCancelarPagosAutorizados.isVisible();
			this.isVisibilidadCeldaGuardarPagosAutorizados=this.jInternalFrameDetalleFormPagosAutorizados.jButtonGuardarCambiosPagosAutorizados.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPagosAutorizados=this.jButtonGuardarCambiosTablaPagosAutorizados.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPagosAutorizados=this.jButtonNuevoToolBarPagosAutorizados.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPagosAutorizados=this.jButtonNuevoRelacionesToolBarPagosAutorizados.isVisible();
			
			if(this.jInternalFrameDetalleFormPagosAutorizados!=null) {
			this.isVisibilidadCeldaModificarPagosAutorizados=this.jInternalFrameDetalleFormPagosAutorizados.jButtonModificarToolBarPagosAutorizados.isVisible();
			this.isVisibilidadCeldaActualizarPagosAutorizados=this.jInternalFrameDetalleFormPagosAutorizados.jButtonActualizarToolBarPagosAutorizados.isVisible();
			this.isVisibilidadCeldaEliminarPagosAutorizados=this.jInternalFrameDetalleFormPagosAutorizados.jButtonEliminarToolBarPagosAutorizados.isVisible();
			this.isVisibilidadCeldaCancelarPagosAutorizados=this.jInternalFrameDetalleFormPagosAutorizados.jButtonCancelarToolBarPagosAutorizados.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPagosAutorizados=this.jButtonGuardarCambiosToolBarPagosAutorizados.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPagosAutorizados=this.jButtonGuardarCambiosTablaToolBarPagosAutorizados.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPagosAutorizados=this.jMenuItemNuevoPagosAutorizados.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPagosAutorizados=this.jMenuItemNuevoRelacionesPagosAutorizados.isVisible();
			
			if(this.jInternalFrameDetalleFormPagosAutorizados!=null) {
			this.isVisibilidadCeldaModificarPagosAutorizados=this.jInternalFrameDetalleFormPagosAutorizados.jMenuItemModificarPagosAutorizados.isVisible();
			this.isVisibilidadCeldaActualizarPagosAutorizados=this.jInternalFrameDetalleFormPagosAutorizados.jMenuItemActualizarPagosAutorizados.isVisible();
			this.isVisibilidadCeldaEliminarPagosAutorizados=this.jInternalFrameDetalleFormPagosAutorizados.jMenuItemEliminarPagosAutorizados.isVisible();
			this.isVisibilidadCeldaCancelarPagosAutorizados=this.jInternalFrameDetalleFormPagosAutorizados.jMenuItemCancelarPagosAutorizados.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPagosAutorizados=this.jMenuItemGuardarCambiosPagosAutorizados.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPagosAutorizados=this.jMenuItemGuardarCambiosTablaPagosAutorizados.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPagosAutorizados(Boolean esInicializar) {
		if(PagosAutorizadosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.pagosautorizadosSessionBean.getConGuardarRelaciones()) {
				//if(this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPagosAutorizados();
			}
			
			this.inicializarActualizarBindingBotonesManualPagosAutorizados(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPagosAutorizados() {
		this.jButtonNuevoPagosAutorizados.setVisible(this.isPermisoNuevoPagosAutorizados);			
		this.jButtonDuplicarPagosAutorizados.setVisible(this.isPermisoDuplicarPagosAutorizados);			
		this.jButtonCopiarPagosAutorizados.setVisible(this.isPermisoCopiarPagosAutorizados);			
		this.jButtonVerFormPagosAutorizados.setVisible(this.isPermisoVerFormPagosAutorizados);			
		
		this.jButtonAbrirOrderByPagosAutorizados.setVisible(this.isPermisoOrdenPagosAutorizados);					
		
		this.jButtonNuevoRelacionesPagosAutorizados.setVisible(this.isPermisoNuevoPagosAutorizados);			
		
		if(this.jInternalFrameDetalleFormPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutorizados.jButtonModificarPagosAutorizados.setVisible(this.isPermisoActualizarPagosAutorizados);	
			this.jInternalFrameDetalleFormPagosAutorizados.jButtonActualizarPagosAutorizados.setVisible(this.isPermisoActualizarPagosAutorizados);	
			this.jInternalFrameDetalleFormPagosAutorizados.jButtonEliminarPagosAutorizados.setVisible(this.isPermisoEliminarPagosAutorizados);
			this.jInternalFrameDetalleFormPagosAutorizados.jButtonCancelarPagosAutorizados.setVisible(this.isVisibilidadCeldaCancelarPagosAutorizados);						
			this.jInternalFrameDetalleFormPagosAutorizados.jButtonGuardarCambiosPagosAutorizados.setVisible(this.isPermisoGuardarCambiosPagosAutorizados);							
		}
		
		this.jButtonGuardarCambiosTablaPagosAutorizados.setVisible(this.isPermisoActualizarPagosAutorizados);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePagosAutorizados() {
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonModificarPagosAutorizados.setVisible(this.isPermisoActualizarPagosAutorizados);	
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonActualizarPagosAutorizados.setVisible(this.isPermisoActualizarPagosAutorizados);	
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonEliminarPagosAutorizados.setVisible(this.isPermisoEliminarPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonCancelarPagosAutorizados.setVisible(this.isVisibilidadCeldaCancelarPagosAutorizados);							
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonGuardarCambiosPagosAutorizados.setVisible((this.isVisibilidadCeldaGuardarPagosAutorizados && this.isPermisoGuardarCambiosPagosAutorizados));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPagosAutorizados() {
		if(PagosAutorizadosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPagosAutorizados();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPagosAutorizados() {
	}
	
	public void jTableDatosPagosAutorizadosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPagosAutorizados(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPagosAutorizadosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.getpagosautorizados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizados==null) {
						this.pagosautorizados = new PagosAutorizados();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.pagosautorizados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
				}

				if(this.pagosautorizados.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.pagosautorizados.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPagosAutorizadosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPagosAutorizados(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPagosAutorizados.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPagosAutorizados.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizados =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pagosautorizados =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPagosAutorizados(this.getpagosautorizados(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.pagosautorizadosLogic.getConnexion());

				if(this.pagosautorizados.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.pagosautorizados.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPagosAutorizados=(TitledBorder)this.jScrollPanelDatosPagosAutorizados.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPagosAutorizados.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPagosAutorizadosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.getpagosautorizados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizados==null) {
						this.pagosautorizados = new PagosAutorizados();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.pagosautorizados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
				}

				if(this.pagosautorizados.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.pagosautorizados.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_cortePagosAutorizadosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.getpagosautorizados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizados==null) {
						this.pagosautorizados = new PagosAutorizados();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.pagosautorizados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
				}

				if(this.pagosautorizados.getfecha_corte()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_corte = '"+Funciones2.getStringPostgresDate(this.pagosautorizados.getfecha_corte())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_clientePagosAutorizadosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.getpagosautorizados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizados==null) {
						this.pagosautorizados = new PagosAutorizados();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.pagosautorizados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
				}

				if(this.pagosautorizados.getnombre_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cliente like '%"+this.pagosautorizados.getnombre_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_facturaPagosAutorizadosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.getpagosautorizados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizados==null) {
						this.pagosautorizados = new PagosAutorizados();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.pagosautorizados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
				}

				if(this.pagosautorizados.getnumero_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_factura like '%"+this.pagosautorizados.getnumero_factura()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionPagosAutorizadosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.getpagosautorizados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizados==null) {
						this.pagosautorizados = new PagosAutorizados();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.pagosautorizados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
				}

				if(this.pagosautorizados.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.pagosautorizados.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_vencimientoPagosAutorizadosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.getpagosautorizados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizados==null) {
						this.pagosautorizados = new PagosAutorizados();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.pagosautorizados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
				}

				if(this.pagosautorizados.getfecha_vencimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vencimiento = '"+Funciones2.getStringPostgresDate(this.pagosautorizados.getfecha_vencimiento())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_bancoPagosAutorizadosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.getpagosautorizados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizados==null) {
						this.pagosautorizados = new PagosAutorizados();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.pagosautorizados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
				}

				if(this.pagosautorizados.getnombre_banco()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_banco like '%"+this.pagosautorizados.getnombre_banco()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_por_pagarPagosAutorizadosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.getpagosautorizados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizados==null) {
						this.pagosautorizados = new PagosAutorizados();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.pagosautorizados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
				}

				if(this.pagosautorizados.getvalor_por_pagar()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_por_pagar = "+this.pagosautorizados.getvalor_por_pagar().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_canceladoPagosAutorizadosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.getpagosautorizados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizados==null) {
						this.pagosautorizados = new PagosAutorizados();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.pagosautorizados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
				}

				if(this.pagosautorizados.getvalor_cancelado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_cancelado = "+this.pagosautorizados.getvalor_cancelado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_cuentaPagosAutorizadosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.getpagosautorizados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizados==null) {
						this.pagosautorizados = new PagosAutorizados();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.pagosautorizados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
				}

				if(this.pagosautorizados.getnumero_cuenta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_cuenta like '%"+this.pagosautorizados.getnumero_cuenta()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_autorizadoPagosAutorizadosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.getpagosautorizados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizados==null) {
						this.pagosautorizados = new PagosAutorizados();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.pagosautorizados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
				}

				if(this.pagosautorizados.getesta_autorizado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_autorizado = "+this.pagosautorizados.getesta_autorizado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionPagosAutorizadosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.getpagosautorizados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizados==null) {
						this.pagosautorizados = new PagosAutorizados();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.pagosautorizados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
				}

				if(this.pagosautorizados.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.pagosautorizados.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_corte_datoPagosAutorizadosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.getpagosautorizados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizados==null) {
						this.pagosautorizados = new PagosAutorizados();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.pagosautorizados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
				}

				if(this.pagosautorizados.getfecha_corte_dato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_corte_dato = '"+Funciones2.getStringPostgresDate(this.pagosautorizados.getfecha_corte_dato())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonestadoPagosAutorizadosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.getpagosautorizados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizados==null) {
						this.pagosautorizados = new PagosAutorizados();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.pagosautorizados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
				}

				if(this.pagosautorizados.getestado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where estado like '%"+this.pagosautorizados.getestado()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_cuenta_con_clientePagosAutorizadosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.getpagosautorizados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizados==null) {
						this.pagosautorizados = new PagosAutorizados();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.pagosautorizados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
				}

				if(this.pagosautorizados.getcodigo_cuenta_con_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_cuenta_con_cliente like '%"+this.pagosautorizados.getcodigo_cuenta_con_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_cuenta_con_bancoPagosAutorizadosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.getpagosautorizados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautorizados =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautorizados==null) {
						this.pagosautorizados = new PagosAutorizados();
					}

					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.pagosautorizados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);
				}

				if(this.pagosautorizados.getcodigo_cuenta_con_banco()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_cuenta_con_banco like '%"+this.pagosautorizados.getcodigo_cuenta_con_banco()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutorizados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPagosAutorizadosPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPagosAutorizados(false,false);

			this.getPagosAutorizadossBusquedaPagosAutorizados();

			this.inicializarActualizarBindingPagosAutorizados(false);

			//if(PagosAutorizadosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPagosAutorizados(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaPagosAutorizadosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPagosAutorizados(false,false);

			this.getPagosAutorizadossFK_IdEmpresa();

			this.inicializarActualizarBindingPagosAutorizados(false);

			//if(PagosAutorizadosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPagosAutorizados(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautorizadosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePagosAutorizados() {
		if(this.jInternalFrameDetalleFormPagosAutorizados!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPagosAutorizados!=null) {
			this.jInternalFrameDetalleFormPagosAutorizados.setVisible(false);	    			
			this.jInternalFrameDetalleFormPagosAutorizados.dispose();
			this.jInternalFrameDetalleFormPagosAutorizados=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPagosAutorizados!=null) {
			this.jInternalFrameReporteDinamicoPagosAutorizados.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPagosAutorizados.dispose();
			this.jInternalFrameReporteDinamicoPagosAutorizados=null;
		}
		
		if(this.jInternalFrameImportacionPagosAutorizados!=null) {
			this.jInternalFrameImportacionPagosAutorizados.setVisible(false);	    			
			this.jInternalFrameImportacionPagosAutorizados.dispose();
			this.jInternalFrameImportacionPagosAutorizados=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPagosAutorizados();
			
			PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
			
			
			if(sTipo.equals("NuevoPagosAutorizados")) {
				jButtonNuevoPagosAutorizadosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPagosAutorizados")) {
				jButtonDuplicarPagosAutorizadosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPagosAutorizados")) {
				jButtonCopiarPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("VerFormPagosAutorizados")) {
				jButtonVerFormPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPagosAutorizados")) {
				jButtonNuevoPagosAutorizadosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPagosAutorizados")) {
				jButtonDuplicarPagosAutorizadosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPagosAutorizados")) {
				jButtonNuevoPagosAutorizadosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPagosAutorizados")) {
				jButtonDuplicarPagosAutorizadosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPagosAutorizados")) {
				jButtonNuevoPagosAutorizadosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPagosAutorizados")) {
				jButtonNuevoPagosAutorizadosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPagosAutorizados")) {
				jButtonNuevoPagosAutorizadosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPagosAutorizados")) {
				jButtonModificarPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPagosAutorizados")) {
				jButtonModificarPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPagosAutorizados")) {
				jButtonModificarPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPagosAutorizados")) {
				jButtonActualizarPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPagosAutorizados")) {
				jButtonActualizarPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPagosAutorizados")) {
				jButtonActualizarPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("EliminarPagosAutorizados")) {
				jButtonEliminarPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPagosAutorizados")) {
				jButtonEliminarPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPagosAutorizados")) {
				jButtonEliminarPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("CancelarPagosAutorizados")) {
				jButtonCancelarPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPagosAutorizados")) {
				jButtonCancelarPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPagosAutorizados")) {
				jButtonCancelarPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("CerrarPagosAutorizados")) {
				jButtonCerrarPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPagosAutorizados")) {
				jButtonCerrarPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPagosAutorizados")) {
				jButtonCerrarPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPagosAutorizados")) {
				jButtonMostrarOcultarPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPagosAutorizados")) {
				jButtonCancelarPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPagosAutorizados")) {
				jButtonGuardarCambiosPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPagosAutorizados")) {
				jButtonGuardarCambiosPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPagosAutorizados")) {
				jButtonCopiarPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPagosAutorizados")) {
				jButtonVerFormPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPagosAutorizados")) {
				jButtonGuardarCambiosPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPagosAutorizados")) {
				jButtonCopiarPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPagosAutorizados")) {
				jButtonVerFormPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPagosAutorizados")) {
				jButtonGuardarCambiosPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPagosAutorizados")) {
				jButtonGuardarCambiosPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPagosAutorizados")) {
				jButtonGuardarCambiosPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPagosAutorizados")) {
				jButtonRecargarInformacionPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPagosAutorizados")) {
				jButtonRecargarInformacionPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPagosAutorizados")) {
				jButtonRecargarInformacionPagosAutorizadosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPagosAutorizados")) {
				jButtonAnterioresPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPagosAutorizados")) {
				jButtonAnterioresPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePagosAutorizados")) {
				jButtonAnterioresPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPagosAutorizados")) {
				jButtonSiguientesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPagosAutorizados")) {
				jButtonSiguientesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPagosAutorizados")) {
				jButtonSiguientesPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPagosAutorizados") || sTipo.equals("MenuItemDetalleAbrirOrderByPagosAutorizados")) {
				jButtonAbrirOrderByPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPagosAutorizados") || sTipo.equals("MenuItemDetalleMostrarOcultarPagosAutorizados")) {
				jButtonMostrarOcultarPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPagosAutorizados")) {
				jButtonNuevoGuardarCambiosPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPagosAutorizados")) {
				jButtonNuevoGuardarCambiosPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPagosAutorizados")) {
				jButtonNuevoGuardarCambiosPagosAutorizadosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPagosAutorizados")) {
				jButtonCerrarReporteDinamicoPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPagosAutorizados")) {
				jButtonGenerarReporteDinamicoPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPagosAutorizados")) {
				
				jButtonGenerarExcelReporteDinamicoPagosAutorizadosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPagosAutorizados")) {
				jButtonCerrarImportacionPagosAutorizadosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPagosAutorizados")) {
				
				jButtonGenerarImportacionPagosAutorizadosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPagosAutorizados")) {
				
				jButtonAbrirImportacionPagosAutorizadosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPagosAutorizados")) {
				jComboBoxTiposAccionesPagosAutorizadosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPagosAutorizados")) {
				jComboBoxTiposRelacionesPagosAutorizadosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPagosAutorizados")) {
				jComboBoxTiposAccionesPagosAutorizadosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPagosAutorizados")) {
				
				jComboBoxTiposSeleccionarPagosAutorizadosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPagosAutorizados")) {
				jTextFieldValorCampoGeneralPagosAutorizadosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPagosAutorizados")) {
				jButtonAbrirOrderByPagosAutorizadosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPagosAutorizados")) {
				jButtonAbrirOrderByPagosAutorizadosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPagosAutorizados")) {
				jButtonCerrarOrderByPagosAutorizadosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPagosAutorizadosBusqueda")) {
				this.jButtonidPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPagosAutorizadosUpdate")) {
				this.jButtonid_empresaPagosAutorizadosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPagosAutorizadosBusqueda")) {
				this.jButtonid_empresaPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_cortePagosAutorizadosBusqueda")) {
				this.jButtonfecha_cortePagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clientePagosAutorizadosBusqueda")) {
				this.jButtonnombre_clientePagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaPagosAutorizadosBusqueda")) {
				this.jButtonnumero_facturaPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionPagosAutorizadosBusqueda")) {
				this.jButtonfecha_emisionPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoPagosAutorizadosBusqueda")) {
				this.jButtonfecha_vencimientoPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bancoPagosAutorizadosBusqueda")) {
				this.jButtonnombre_bancoPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_por_pagarPagosAutorizadosBusqueda")) {
				this.jButtonvalor_por_pagarPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_canceladoPagosAutorizadosBusqueda")) {
				this.jButtonvalor_canceladoPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuentaPagosAutorizadosBusqueda")) {
				this.jButtonnumero_cuentaPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_autorizadoPagosAutorizadosBusqueda")) {
				this.jButtonesta_autorizadoPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionPagosAutorizadosBusqueda")) {
				this.jButtondescripcionPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_corte_datoPagosAutorizadosBusqueda")) {
				this.jButtonfecha_corte_datoPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estadoPagosAutorizadosBusqueda")) {
				this.jButtonestadoPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_cuenta_con_clientePagosAutorizadosBusqueda")) {
				this.jButtoncodigo_cuenta_con_clientePagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_cuenta_con_bancoPagosAutorizadosBusqueda")) {
				this.jButtoncodigo_cuenta_con_bancoPagosAutorizadosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPagosAutorizadosPagosAutorizados")) {
				this.jButtonBusquedaPagosAutorizadosPagosAutorizadosActionPerformed(evt);
			}
			
			;
			
			
			PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPagosAutorizados();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPagosAutorizadosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautorizados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizados);
				
				PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
				
				


				
				PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosAutorizados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutorizados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PagosAutorizados pagosautorizadosLocal=null;
			
			if(!this.getEsControlTabla()) {
				pagosautorizadosLocal=this.pagosautorizados;
			} else {
				pagosautorizadosLocal=this.pagosautorizadosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautorizados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizados);
				
				PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
							
				
				


				
				PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosAutorizados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutorizados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosAutorizadosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosAnterior =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagosautorizadosAnterior =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
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
			
			PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
			
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
			
			


			
			PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPagosAutorizadosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautorizados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizados);
				
				PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
								
						
				


				
				PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosAutorizados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutorizados.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautorizados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizados);
				
				PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
								
				
				


				
				PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosAutorizados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutorizados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosAutorizadosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosAnterior =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagosautorizadosAnterior =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautorizados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizados);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosAutorizadosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosAnterior =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagosautorizadosAnterior =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosAutorizadosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautorizados);
			
			this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizados);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautorizados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizados);
				
				PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
							
				
				


				
				PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosAutorizados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutorizados.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPagosAutorizadosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizadosAnterior =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.pagosautorizadosAnterior =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
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
			
			PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
			
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
			
			


			
			PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosAutorizadosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautorizados);
			
			this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizados);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautorizados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizados);
				
				PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
								
				
				


				
				PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosAutorizados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutorizados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosAutorizadosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosAnterior =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagosautorizadosAnterior =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosAutorizadosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautorizados);
			
			this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizados);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPagosAutorizadosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautorizados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizados);
				
				PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPagosAutorizados")) {
					jCheckBoxSeleccionarTodosPagosAutorizadosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPagosAutorizados")) {
					jCheckBoxSeleccionadosPagosAutorizadosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPagosAutorizados")) {
					
				}
				
				


				
				
				PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosAutorizados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutorizados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautorizados);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizados);
				
				PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
												
				
				


				
				
				PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosAutorizados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutorizados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPagosAutorizadosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautorizadosAnterior =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.pagosautorizadosAnterior =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPagosAutorizadosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautorizados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizados);
				
				PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
				
				
				PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
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
			
			PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
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
			
			


			
			PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPagosAutorizadosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautorizados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizados);
				
				PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosAutorizados.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutorizados.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautorizados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautorizados);
				
				PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
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
				
				


				
				PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosAutorizados.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutorizados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosAutorizadosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautorizadosAnterior =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagosautorizadosAnterior =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPagosAutorizados")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPagosAutorizadosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPagosAutorizados.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.pagosautorizados =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.pagosautorizados =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.pagosautorizados);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPagosAutorizados")) {
				
				}
				
				PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPagosAutorizados")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPagosAutorizados.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPagosAutorizados")) {
			
			}
			
			PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPagosAutorizados();
			
			PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
			
			if(sTipo.equals("NuevoPagosAutorizados")) {
				jButtonNuevoPagosAutorizadosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPagosAutorizados")) {
				jButtonDuplicarPagosAutorizadosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPagosAutorizados")) {
				jButtonCopiarPagosAutorizadosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPagosAutorizados")) {
				jButtonVerFormPagosAutorizadosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPagosAutorizados")) {
				jButtonNuevoPagosAutorizadosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPagosAutorizados")) {
				jButtonModificarPagosAutorizadosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPagosAutorizados")) {
				jButtonActualizarPagosAutorizadosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPagosAutorizados")) {
				jButtonEliminarPagosAutorizadosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPagosAutorizados")) {
				jButtonGuardarCambiosPagosAutorizadosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPagosAutorizados")) {
				jButtonCancelarPagosAutorizadosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPagosAutorizados")) {
				jButtonCerrarPagosAutorizadosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPagosAutorizados")) {
				jButtonGuardarCambiosPagosAutorizadosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPagosAutorizados")) {
				jButtonNuevoGuardarCambiosPagosAutorizadosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPagosAutorizados")) {
				jButtonAbrirOrderByPagosAutorizadosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPagosAutorizados")) {
				jButtonRecargarInformacionPagosAutorizadosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPagosAutorizados")) {
				jButtonAnterioresPagosAutorizadosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPagosAutorizados")) {
				jButtonSiguientesPagosAutorizadosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPagosAutorizadosBusqueda")) {
				this.jButtonidPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPagosAutorizadosUpdate")) {
				this.jButtonid_empresaPagosAutorizadosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPagosAutorizadosBusqueda")) {
				this.jButtonid_empresaPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_cortePagosAutorizadosBusqueda")) {
				this.jButtonfecha_cortePagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clientePagosAutorizadosBusqueda")) {
				this.jButtonnombre_clientePagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaPagosAutorizadosBusqueda")) {
				this.jButtonnumero_facturaPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionPagosAutorizadosBusqueda")) {
				this.jButtonfecha_emisionPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoPagosAutorizadosBusqueda")) {
				this.jButtonfecha_vencimientoPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bancoPagosAutorizadosBusqueda")) {
				this.jButtonnombre_bancoPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_por_pagarPagosAutorizadosBusqueda")) {
				this.jButtonvalor_por_pagarPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_canceladoPagosAutorizadosBusqueda")) {
				this.jButtonvalor_canceladoPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuentaPagosAutorizadosBusqueda")) {
				this.jButtonnumero_cuentaPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_autorizadoPagosAutorizadosBusqueda")) {
				this.jButtonesta_autorizadoPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionPagosAutorizadosBusqueda")) {
				this.jButtondescripcionPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_corte_datoPagosAutorizadosBusqueda")) {
				this.jButtonfecha_corte_datoPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estadoPagosAutorizadosBusqueda")) {
				this.jButtonestadoPagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_cuenta_con_clientePagosAutorizadosBusqueda")) {
				this.jButtoncodigo_cuenta_con_clientePagosAutorizadosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_cuenta_con_bancoPagosAutorizadosBusqueda")) {
				this.jButtoncodigo_cuenta_con_bancoPagosAutorizadosBusquedaActionPerformed(evt);
			}
			
			PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPagosAutorizados();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePagosAutorizados")) {
				closingInternalFramePagosAutorizados();
				
			} else if(sTipo.equals("jButtonCancelarPagosAutorizados")) {
				JInternalFrameBase jInternalFrameDetalleFormPagosAutorizados = (JInternalFrameBase)evt.getSource();
	            	
	            PagosAutorizadosBeanSwingJInternalFrame jInternalFrameParent=(PagosAutorizadosBeanSwingJInternalFrame)jInternalFrameDetalleFormPagosAutorizados.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPagosAutorizadosActionPerformed(null);
			}
			
			PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.pagosautorizados,new Object(),this.pagosautorizadosParameterGeneral,this.pagosautorizadosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPagosAutorizados(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPagosAutorizados(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPagosAutorizados(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.pagosautorizados)) {
			if(!esControlTabla) {
				if(PagosAutorizadosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.pagosautorizados,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);			
				}
				
				if(this.pagosautorizadosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPagosAutorizados(this.pagosautorizados,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPagosAutorizados(this.pagosautorizadosReturnGeneral,this.pagosautorizadosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.pagosautorizadosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPagosAutorizados(classes,this.pagosautorizadosReturnGeneral,this.pagosautorizadosBean,false);
					}
						
					if(this.pagosautorizadosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPagosAutorizados(this.pagosautorizadosReturnGeneral.getPagosAutorizados());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPagosAutorizados(this.pagosautorizadosReturnGeneral.getPagosAutorizados());	
					}
						
					if(this.pagosautorizadosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPagosAutorizados(this.pagosautorizadosReturnGeneral.getPagosAutorizados(),classes);//this.pagosautorizadosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPagosAutorizados(this.pagosautorizados,classes);//this.pagosautorizadosBean);									
				}
			
				if(PagosAutorizadosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPagosAutorizados(this.pagosautorizados,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutorizados(this.pagosautorizados);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.pagosautorizadosAnterior!=null) {
						this.pagosautorizados=this.pagosautorizadosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.pagosautorizadosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.pagosautorizadosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.pagosautorizadosReturnGeneral.getPagosAutorizados(),pagosautorizadosLogic.getPagosAutorizadoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.pagosautorizadosReturnGeneral.getPagosAutorizados(),this.pagosautorizadoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPagosAutorizados.repaint();
				
				//((AbstractTableModel) this.jTableDatosPagosAutorizados.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPagosAutorizados();
			}
		}
	}
	
	public void actualizarVisualTableDatosPagosAutorizados() throws Exception {
		
		PagosAutorizadosModel pagosautorizadosModel=(PagosAutorizadosModel)this.jTableDatosPagosAutorizados.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			pagosautorizadosModel.pagosautorizadoss=this.pagosautorizadosLogic.getPagosAutorizadoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			pagosautorizadosModel.pagosautorizadoss=this.pagosautorizadoss;
		}
		
		
		((PagosAutorizadosModel) this.jTableDatosPagosAutorizados.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPagosAutorizados() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpagosautorizadosAnterior(),this.pagosautorizadosLogic.getPagosAutorizadoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpagosautorizadosAnterior(),this.pagosautorizadoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPagosAutorizados();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPagosAutorizados(PagosAutorizados pagosautorizados,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
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
										
				PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.pagosautorizados,new Object(),generalEntityParameterGeneral,this.pagosautorizadosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.pagosautorizadosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PagosAutorizadosConstantesFunciones.getClassesRelationshipsOfPagosAutorizados(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PagosAutorizadosConstantesFunciones.getClassesRelationshipsFromStringsOfPagosAutorizados(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPagosAutorizados(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PagosAutorizadosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.pagosautorizados,new Object(),generalEntityParameterGeneral,this.pagosautorizadosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPagosAutorizados(PagosAutorizadosBean pagosautorizadosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPagosAutorizados(ArrayList<Classe> classes,PagosAutorizadosReturnGeneral pagosautorizadosReturnGeneral,PagosAutorizadosBean pagosautorizadosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPagosAutorizados(PagosAutorizados pagosautorizados,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.pagosautorizados)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPagosAutorizados = new PagosAutorizadosDetalleFormJInternalFrame(jDesktopPane,this.pagosautorizadosSessionBean.getConGuardarRelaciones(),this.pagosautorizadosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.setVisible(false);
		this.jInternalFrameDetalleFormPagosAutorizados.setSelected(false);						
		
		this.jInternalFrameDetalleFormPagosAutorizados.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPagosAutorizados.pagosautorizadosLogic=this.pagosautorizadosLogic;
		
		this.cargarCombosFrameForeignKeyPagosAutorizados("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePagosAutorizados();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePagosAutorizados();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPagosAutorizados("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPagosAutorizados();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPagosAutorizados.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPagosAutorizados"));
		
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonModificarPagosAutorizados.addActionListener(new ButtonActionListener(this,"ModificarPagosAutorizados"));

		
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonModificarToolBarPagosAutorizados.addActionListener(new ButtonActionListener(this,"ModificarToolBarPagosAutorizados"));
					
		this.jInternalFrameDetalleFormPagosAutorizados.jMenuItemModificarPagosAutorizados.addActionListener(new ButtonActionListener(this,"MenuItemModificarPagosAutorizados"));		
		
		
		
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonActualizarPagosAutorizados.addActionListener (new ButtonActionListener(this,"ActualizarPagosAutorizados"));
		
		
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonActualizarToolBarPagosAutorizados.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPagosAutorizados"));
						
		this.jInternalFrameDetalleFormPagosAutorizados.jMenuItemActualizarPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPagosAutorizados"));		
		
		
		
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonEliminarPagosAutorizados.addActionListener (new ButtonActionListener(this,"EliminarPagosAutorizados"));
		
		
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonEliminarToolBarPagosAutorizados.addActionListener (new ButtonActionListener(this,"EliminarToolBarPagosAutorizados"));
								
		this.jInternalFrameDetalleFormPagosAutorizados.jMenuItemEliminarPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPagosAutorizados"));		
		
		
		
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonCancelarPagosAutorizados.addActionListener (new ButtonActionListener(this,"CancelarPagosAutorizados"));
		
		
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonCancelarToolBarPagosAutorizados.addActionListener (new ButtonActionListener(this,"CancelarToolBarPagosAutorizados"));
					
		this.jInternalFrameDetalleFormPagosAutorizados.jMenuItemCancelarPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPagosAutorizados"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPagosAutorizados.jMenuItemDetalleCerrarPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPagosAutorizados"));		
		
		
		
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonGuardarCambiosToolBarPagosAutorizados.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPagosAutorizados"));
		
		
		
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonGuardarCambiosToolBarPagosAutorizados.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPagosAutorizados"));
		
		
		
		this.jInternalFrameDetalleFormPagosAutorizados.jComboBoxTiposAccionesFormularioPagosAutorizados.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPagosAutorizados"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonidPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"idPagosAutorizadosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonid_empresaPagosAutorizadosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPagosAutorizadosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonid_empresaPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonfecha_cortePagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_cortePagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonnombre_clientePagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clientePagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonnumero_facturaPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonfecha_emisionPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonfecha_vencimientoPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonnombre_bancoPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bancoPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonvalor_por_pagarPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"valor_por_pagarPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonvalor_canceladoPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"valor_canceladoPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonnumero_cuentaPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuentaPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonesta_autorizadoPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"esta_autorizadoPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtondescripcionPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonfecha_corte_datoPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_corte_datoPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonestadoPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"estadoPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtoncodigo_cuenta_con_clientePagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuenta_con_clientePagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtoncodigo_cuenta_con_bancoPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuenta_con_bancoPagosAutorizadosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPagosAutorizados.jTabbedPaneRelacionesPagosAutorizados.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPagosAutorizados"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePagosAutorizados"));
		
		if(this.jInternalFrameDetalleFormPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutorizados.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPagosAutorizados"));
		}
		
		this.jTableDatosPagosAutorizados.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPagosAutorizados"));
		
		this.jTableDatosPagosAutorizados.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPagosAutorizados"));
		
		this.jButtonNuevoPagosAutorizados.addActionListener(new ButtonActionListener(this,"NuevoPagosAutorizados"));
		
		this.jButtonDuplicarPagosAutorizados.addActionListener(new ButtonActionListener(this,"DuplicarPagosAutorizados"));
		
		this.jButtonCopiarPagosAutorizados.addActionListener(new ButtonActionListener(this,"CopiarPagosAutorizados"));
		
		this.jButtonVerFormPagosAutorizados.addActionListener(new ButtonActionListener(this,"VerFormPagosAutorizados"));
		
		
		this.jButtonNuevoToolBarPagosAutorizados.addActionListener(new ButtonActionListener(this,"NuevoToolBarPagosAutorizados"));
			
		this.jButtonDuplicarToolBarPagosAutorizados.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPagosAutorizados"));
			
		this.jMenuItemNuevoPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPagosAutorizados"));
			
		this.jMenuItemDuplicarPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPagosAutorizados"));		
		
		
		this.jButtonNuevoRelacionesPagosAutorizados.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPagosAutorizados"));
		
		
		this.jButtonNuevoRelacionesToolBarPagosAutorizados.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPagosAutorizados"));
			
		this.jMenuItemNuevoRelacionesPagosAutorizados.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPagosAutorizados"));		
		
		
		if(this.jInternalFrameDetalleFormPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutorizados.jButtonModificarPagosAutorizados.addActionListener(new ButtonActionListener(this,"ModificarPagosAutorizados"));
		}
		
		
		if(this.jInternalFrameDetalleFormPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutorizados.jButtonModificarToolBarPagosAutorizados.addActionListener(new ButtonActionListener(this,"ModificarToolBarPagosAutorizados"));
			
			this.jInternalFrameDetalleFormPagosAutorizados.jMenuItemModificarPagosAutorizados.addActionListener(new ButtonActionListener(this,"MenuItemModificarPagosAutorizados"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPagosAutorizados.jButtonActualizarPagosAutorizados.addActionListener (new ButtonActionListener(this,"ActualizarPagosAutorizados"));
		}
		
		
		if(this.jInternalFrameDetalleFormPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutorizados.jButtonActualizarToolBarPagosAutorizados.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPagosAutorizados"));
				
			this.jInternalFrameDetalleFormPagosAutorizados.jMenuItemActualizarPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPagosAutorizados"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutorizados.jButtonEliminarPagosAutorizados.addActionListener (new ButtonActionListener(this,"EliminarPagosAutorizados"));
		}
		
		
		if(this.jInternalFrameDetalleFormPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutorizados.jButtonEliminarToolBarPagosAutorizados.addActionListener (new ButtonActionListener(this,"EliminarToolBarPagosAutorizados"));
						
			this.jInternalFrameDetalleFormPagosAutorizados.jMenuItemEliminarPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPagosAutorizados"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutorizados.jButtonCancelarPagosAutorizados.addActionListener (new ButtonActionListener(this,"CancelarPagosAutorizados"));
		}
		
		
		if(this.jInternalFrameDetalleFormPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutorizados.jButtonCancelarToolBarPagosAutorizados.addActionListener (new ButtonActionListener(this,"CancelarToolBarPagosAutorizados"));
			
			this.jInternalFrameDetalleFormPagosAutorizados.jMenuItemCancelarPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPagosAutorizados"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPagosAutorizados.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPagosAutorizados"));		
		
		
		this.jButtonCerrarPagosAutorizados.addActionListener (new ButtonActionListener(this,"CerrarPagosAutorizados"));
		
		
		this.jButtonCerrarToolBarPagosAutorizados.addActionListener (new ButtonActionListener(this,"CerrarToolBarPagosAutorizados"));
			
		this.jMenuItemCerrarPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPagosAutorizados"));
			
		if(this.jInternalFrameDetalleFormPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutorizados.jMenuItemDetalleCerrarPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPagosAutorizados"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutorizados.jButtonGuardarCambiosPagosAutorizados.addActionListener (new ButtonActionListener(this,"GuardarCambiosPagosAutorizados"));
		}
		
		
		if(this.jInternalFrameDetalleFormPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutorizados.jButtonGuardarCambiosToolBarPagosAutorizados.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPagosAutorizados"));
		}
		
		this.jButtonCopiarToolBarPagosAutorizados.addActionListener (new ButtonActionListener(this,"CopiarToolBarPagosAutorizados"));
			
		this.jButtonVerFormToolBarPagosAutorizados.addActionListener (new ButtonActionListener(this,"VerFormToolBarPagosAutorizados"));
		
		this.jMenuItemGuardarCambiosPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPagosAutorizados"));
			
		this.jMenuItemCopiarPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPagosAutorizados"));		
		
		this.jMenuItemVerFormPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPagosAutorizados"));		
		
		
		this.jButtonGuardarCambiosTablaPagosAutorizados.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPagosAutorizados"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPagosAutorizados.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPagosAutorizados"));
			
		this.jMenuItemGuardarCambiosTablaPagosAutorizados.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPagosAutorizados"));		
		
		
		
		this.jButtonRecargarInformacionPagosAutorizados.addActionListener (new ButtonActionListener(this,"RecargarInformacionPagosAutorizados"));
					
		this.jButtonRecargarInformacionToolBarPagosAutorizados.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPagosAutorizados"));
		
		this.jMenuItemRecargarInformacionPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPagosAutorizados"));		
		
		
		
		this.jButtonAnterioresPagosAutorizados.addActionListener (new ButtonActionListener(this,"AnterioresPagosAutorizados"));
		
		
		this.jButtonAnterioresToolBarPagosAutorizados.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPagosAutorizados"));
		
		this.jMenuItemAnterioresPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPagosAutorizados"));		
		
		
		this.jButtonSiguientesPagosAutorizados.addActionListener (new ButtonActionListener(this,"SiguientesPagosAutorizados"));
		
		
		this.jButtonSiguientesToolBarPagosAutorizados.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPagosAutorizados"));
			
		this.jMenuItemSiguientesPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPagosAutorizados"));
			
		this.jMenuItemAbrirOrderByPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPagosAutorizados"));
			
		this.jMenuItemMostrarOcultarPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPagosAutorizados"));
			
		this.jMenuItemDetalleAbrirOrderByPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPagosAutorizados"));
			
		this.jMenuItemDetalleMostarOcultarPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPagosAutorizados"));		
		
		
		this.jButtonNuevoGuardarCambiosPagosAutorizados.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPagosAutorizados"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPagosAutorizados.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPagosAutorizados"));
			
		this.jMenuItemNuevoGuardarCambiosPagosAutorizados.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPagosAutorizados"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPagosAutorizados.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPagosAutorizados"));

		this.jCheckBoxSeleccionadosPagosAutorizados.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPagosAutorizados"));
		
		if(this.jInternalFrameDetalleFormPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutorizados.jComboBoxTiposAccionesFormularioPagosAutorizados.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPagosAutorizados"));
		}
		
		
		this.jComboBoxTiposRelacionesPagosAutorizados.addActionListener (new ButtonActionListener(this,"TiposRelacionesPagosAutorizados"));
			
		this.jComboBoxTiposAccionesPagosAutorizados.addActionListener (new ButtonActionListener(this,"TiposAccionesPagosAutorizados"));
					
		this.jComboBoxTiposSeleccionarPagosAutorizados.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPagosAutorizados"));
			
		this.jTextFieldValorCampoGeneralPagosAutorizados.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPagosAutorizados"));		
		
		
		if(this.jInternalFrameDetalleFormPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonidPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"idPagosAutorizadosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonid_empresaPagosAutorizadosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPagosAutorizadosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonid_empresaPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonfecha_cortePagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_cortePagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonnombre_clientePagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clientePagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonnumero_facturaPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonfecha_emisionPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonfecha_vencimientoPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonnombre_bancoPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bancoPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonvalor_por_pagarPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"valor_por_pagarPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonvalor_canceladoPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"valor_canceladoPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonnumero_cuentaPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuentaPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonesta_autorizadoPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"esta_autorizadoPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtondescripcionPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonfecha_corte_datoPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_corte_datoPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonestadoPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"estadoPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtoncodigo_cuenta_con_clientePagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuenta_con_clientePagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtoncodigo_cuenta_con_bancoPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuenta_con_bancoPagosAutorizadosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPagosAutorizadosPagosAutorizados.addActionListener(new ButtonActionListener(this,"BusquedaPagosAutorizadosPagosAutorizados"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPagosAutorizados!=null) {
				this.jInternalFrameReporteDinamicoPagosAutorizados.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPagosAutorizados"));
				this.jInternalFrameReporteDinamicoPagosAutorizados.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPagosAutorizados"));
				this.jInternalFrameReporteDinamicoPagosAutorizados.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPagosAutorizados"));
			}
			
			//this.jButtonCerrarReporteDinamicoPagosAutorizados.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPagosAutorizados"));				
			//this.jButtonGenerarReporteDinamicoPagosAutorizados.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPagosAutorizados"));
			//this.jButtonGenerarExcelReporteDinamicoPagosAutorizados.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPagosAutorizados"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPagosAutorizados!=null) {
				this.jInternalFrameImportacionPagosAutorizados.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPagosAutorizados"));
				this.jInternalFrameImportacionPagosAutorizados.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPagosAutorizados"));
				this.jInternalFrameImportacionPagosAutorizados.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPagosAutorizados"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPagosAutorizados.addActionListener (new ButtonActionListener(this,"AbrirOrderByPagosAutorizados"));
			
			this.jButtonAbrirOrderByToolBarPagosAutorizados.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPagosAutorizados"));			
			
			if(this.jInternalFrameOrderByPagosAutorizados!=null) {
				this.jInternalFrameOrderByPagosAutorizados.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPagosAutorizados"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPagosAutorizados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutorizados.jTabbedPaneRelacionesPagosAutorizados.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPagosAutorizados"));
		
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
            		closingInternalFramePagosAutorizados();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPagosAutorizados.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPagosAutorizados = (JInternalFrameBase)event.getSource();
	            	
	            PagosAutorizadosBeanSwingJInternalFrame jInternalFrameParent=(PagosAutorizadosBeanSwingJInternalFrame)jInternalFrameDetalleFormPagosAutorizados.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPagosAutorizadosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPagosAutorizados.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPagosAutorizadosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPagosAutorizados.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPagosAutorizados.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPagosAutorizadosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPagosAutorizadosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPagosAutorizadosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPagosAutorizados";
		inputMap = this.jButtonNuevoPagosAutorizados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPagosAutorizados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPagosAutorizadosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPagosAutorizadosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPagosAutorizadosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPagosAutorizadosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPagosAutorizados";
		inputMap = this.jButtonNuevoRelacionesPagosAutorizados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPagosAutorizados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPagosAutorizadosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPagosAutorizados";
		inputMap = this.jButtonModificarPagosAutorizados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPagosAutorizados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPagosAutorizadosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPagosAutorizados";
		inputMap = this.jButtonActualizarPagosAutorizados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPagosAutorizados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPagosAutorizadosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPagosAutorizados";
		inputMap = this.jButtonEliminarPagosAutorizados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPagosAutorizados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPagosAutorizadosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPagosAutorizados";
		inputMap = this.jButtonCancelarPagosAutorizados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPagosAutorizados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPagosAutorizadosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPagosAutorizados";
		inputMap = this.jButtonCerrarPagosAutorizados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPagosAutorizados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPagosAutorizadosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonGuardarCambiosPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPagosAutorizados";
		inputMap = this.jInternalFrameDetalleFormPagosAutorizados.jButtonGuardarCambiosPagosAutorizados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonGuardarCambiosPagosAutorizados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPagosAutorizadosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPagosAutorizados.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPagosAutorizadosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPagosAutorizados.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPagosAutorizadosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPagosAutorizados.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPagosAutorizadosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPagosAutorizados.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPagosAutorizadosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonidPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"idPagosAutorizadosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonid_empresaPagosAutorizadosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPagosAutorizadosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonid_empresaPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonfecha_cortePagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_cortePagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonnombre_clientePagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clientePagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonnumero_facturaPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonfecha_emisionPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonfecha_vencimientoPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonnombre_bancoPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bancoPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonvalor_por_pagarPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"valor_por_pagarPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonvalor_canceladoPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"valor_canceladoPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonnumero_cuentaPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuentaPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonesta_autorizadoPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"esta_autorizadoPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtondescripcionPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonfecha_corte_datoPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_corte_datoPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtonestadoPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"estadoPagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtoncodigo_cuenta_con_clientePagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuenta_con_clientePagosAutorizadosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutorizados.jButtoncodigo_cuenta_con_bancoPagosAutorizadosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuenta_con_bancoPagosAutorizadosBusqueda"));
		
		
		this.jButtonBusquedaPagosAutorizadosPagosAutorizados.addActionListener(new ButtonActionListener(this,"BusquedaPagosAutorizadosPagosAutorizados"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPagosAutorizados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPagosAutorizadosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPagosAutorizadosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPagosAutorizados.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPagosAutorizados(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PagosAutorizados pagosautorizadosAux:this.pagosautorizadosLogic.getPagosAutorizadoss()) {
					pagosautorizadosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PagosAutorizados pagosautorizadosAux:pagosautorizadoss) {
					pagosautorizadosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPagosAutorizadosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPagosAutorizados(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PagosAutorizados pagosautorizadosAux:this.pagosautorizadosLogic.getPagosAutorizadoss()) {
						pagosautorizadosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PagosAutorizados pagosautorizadosAux:pagosautorizadoss) {
						pagosautorizadosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PagosAutorizados pagosautorizadosAux:this.pagosautorizadosLogic.getPagosAutorizadoss()) {
					
						if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_ESTAAUTORIZADO)) {
							existe=true;
							pagosautorizadosAux.setesta_autorizado(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PagosAutorizados pagosautorizadosAux:pagosautorizadoss) {
						
						if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_ESTAAUTORIZADO)) {
							existe=true;
							pagosautorizadosAux.setesta_autorizado(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPagosAutorizados(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPagosAutorizados.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPagosAutorizados.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizados,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPagosAutorizadosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPagosAutorizados(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPagosAutorizados.getSelectedRows();
			
			PagosAutorizados pagosautorizadosLocal=new PagosAutorizados();
			
			//this.seleccionarTodosPagosAutorizados(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					pagosautorizadosLocal =(PagosAutorizados) this.pagosautorizadosLogic.getPagosAutorizadoss().toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					pagosautorizadosLocal =(PagosAutorizados) this.pagosautorizadoss.toArray()[this.jTableDatosPagosAutorizados.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				pagosautorizadosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PagosAutorizados pagosautorizadosAux:this.pagosautorizadosLogic.getPagosAutorizadoss()) {
						pagosautorizadosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PagosAutorizados pagosautorizadosAux:pagosautorizadoss) {
						pagosautorizadosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPagosAutorizados(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPagosAutorizados.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPagosAutorizados.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPagosAutorizados,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPagosAutorizadosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPagosAutorizadosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPagosAutorizadosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPagosAutorizados(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPagosAutorizados.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PagosAutorizados pagosautorizadosAux:this.pagosautorizadosLogic.getPagosAutorizadoss()) {
				
						if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_FECHACORTE0)) {
							existe=true;
							pagosautorizadosAux.setfecha_corte(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							pagosautorizadosAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							pagosautorizadosAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							pagosautorizadosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							pagosautorizadosAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO)) {
							existe=true;
							pagosautorizadosAux.setnombre_banco(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_VALORPORPAGAR)) {
							existe=true;
							pagosautorizadosAux.setvalor_por_pagar(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_VALORCANCELADO)) {
							existe=true;
							pagosautorizadosAux.setvalor_cancelado(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA)) {
							existe=true;
							pagosautorizadosAux.setnumero_cuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							pagosautorizadosAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_FECHACORTE)) {
							existe=true;
							pagosautorizadosAux.setfecha_corte_dato(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_ESTADO)) {
							existe=true;
							pagosautorizadosAux.setestado(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE)) {
							existe=true;
							pagosautorizadosAux.setcodigo_cuenta_con_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO)) {
							existe=true;
							pagosautorizadosAux.setcodigo_cuenta_con_banco(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PagosAutorizados pagosautorizadosAux:pagosautorizadoss) {
					
						if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_FECHACORTE0)) {
							existe=true;
							pagosautorizadosAux.setfecha_corte(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							pagosautorizadosAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							pagosautorizadosAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							pagosautorizadosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							pagosautorizadosAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO)) {
							existe=true;
							pagosautorizadosAux.setnombre_banco(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_VALORPORPAGAR)) {
							existe=true;
							pagosautorizadosAux.setvalor_por_pagar(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_VALORCANCELADO)) {
							existe=true;
							pagosautorizadosAux.setvalor_cancelado(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA)) {
							existe=true;
							pagosautorizadosAux.setnumero_cuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							pagosautorizadosAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_FECHACORTE)) {
							existe=true;
							pagosautorizadosAux.setfecha_corte_dato(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_ESTADO)) {
							existe=true;
							pagosautorizadosAux.setestado(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE)) {
							existe=true;
							pagosautorizadosAux.setcodigo_cuenta_con_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO)) {
							existe=true;
							pagosautorizadosAux.setcodigo_cuenta_con_banco(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPagosAutorizados(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPagosAutorizadosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPagosAutorizados(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPagosAutorizados=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPagosAutorizados.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPagosAutorizados.jComboBoxTiposAccionesFormularioPagosAutorizados.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePagosAutorizados) {				
					conSplash=true;//false;										
					
					//this.startProcessPagosAutorizados(conSplash);
				
					this.generarReportePagosAutorizadossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPagosAutorizados.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPagosAutorizados.jComboBoxTiposAccionesFormularioPagosAutorizados.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPagosAutorizadossSeleccionados();
				//this.jComboBoxTiposAccionesPagosAutorizados.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPagosAutorizadossSeleccionados(false);
				//this.jComboBoxTiposAccionesPagosAutorizados.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPagosAutorizadossSeleccionados(true);
				//this.jComboBoxTiposAccionesPagosAutorizados.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPagosAutorizados();
				
				this.exportarPagosAutorizadossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPagosAutorizados.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPagosAutorizados.jComboBoxTiposAccionesFormularioPagosAutorizados.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPagosAutorizadoss();
				//this.importarPagosAutorizadoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPagosAutorizados.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPagosAutorizados.jComboBoxTiposAccionesFormularioPagosAutorizados.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPagosAutorizados();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPagosAutorizadossSeleccionados();
				//this.jComboBoxTiposAccionesPagosAutorizados.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Pagos Autorizados", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPagosAutorizados();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPagosAutorizados)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPagosAutorizados(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Pagos Autorizados",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPagosAutorizados.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPagosAutorizados.jComboBoxTiposAccionesFormularioPagosAutorizados.setSelectedIndex(0);					
				}	
			} 			
			else if(PagosAutorizadosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePagosAutorizados) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPagosAutorizados(conSplash);
					
						//this.actualizarParametrosGeneralPagosAutorizados();
						
						this.generarReporteProcesoAccionPagosAutorizadossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPagosAutorizados.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPagosAutorizados.jComboBoxTiposAccionesFormularioPagosAutorizados.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PagosAutorizadosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Pagos AutorizadosES SELECCIONADOS?", "MANTENIMIENTO DE Pagos Autorizados", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPagosAutorizados();
				
						this.actualizarParametrosGeneralPagosAutorizados();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.pagosautorizadosReturnGeneral=pagosautorizadosLogic.procesarAccionPagosAutorizadossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.pagosautorizadosLogic.getPagosAutorizadoss(),this.pagosautorizadosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPagosAutorizadosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPagosAutorizados.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPagosAutorizados.jComboBoxTiposAccionesFormularioPagosAutorizados.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPagosAutorizados();
					
					PagosAutorizadosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPagosAutorizadosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPagosAutorizados.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPagosAutorizados.jComboBoxTiposAccionesFormularioPagosAutorizados.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPagosAutorizados(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPagosAutorizadosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPagosAutorizados();
			
			if(this.jInternalFrameDetalleFormPagosAutorizados==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PagosAutorizados> pagosautorizadossSeleccionados=new ArrayList<PagosAutorizados>();		
			PagosAutorizados pagosautorizados=new PagosAutorizados();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPagosAutorizados(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPagosAutorizados.getSelectedItem();
			
			
			
			
			pagosautorizadossSeleccionados=this.getPagosAutorizadossSeleccionados(true);
			//this.sTipoAccion;
			
			if(pagosautorizadossSeleccionados.size()==1) {
				for(PagosAutorizados pagosautorizadosAux:pagosautorizadossSeleccionados) {
					pagosautorizados=pagosautorizadosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPagosAutorizados();
			
      		//this.finishProcessPagosAutorizados(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPagosAutorizadosReturnGeneral() throws Exception {
		if(this.pagosautorizadosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.pagosautorizadosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.pagosautorizadosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.pagosautorizadosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.pagosautorizadosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.pagosautorizadosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPagosAutorizados(false);
		}
		
		if(this.pagosautorizadosReturnGeneral.getConRetornoLista() || this.pagosautorizadosReturnGeneral.getConRetornoObjeto()) {
			if(this.pagosautorizadosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.pagosautorizadosLogic.setPagosAutorizadoss(this.pagosautorizadosReturnGeneral.getPagosAutorizadoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingPagosAutorizados(false);
		}
	}
	
	public void actualizarParametrosGeneralPagosAutorizados() throws Exception {
		
		
	}
	
	public ArrayList<PagosAutorizados> getPagosAutorizadossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PagosAutorizados> pagosautorizadossSeleccionados=new ArrayList<PagosAutorizados>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPagosAutorizados) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PagosAutorizados pagosautorizadosAux:pagosautorizadosLogic.getPagosAutorizadoss()) {
					if(pagosautorizadosAux.getIsSelected()) {
						pagosautorizadossSeleccionados.add(pagosautorizadosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PagosAutorizados pagosautorizadosAux:this.pagosautorizadoss) {
					if(pagosautorizadosAux.getIsSelected()) {
						pagosautorizadossSeleccionados.add(pagosautorizadosAux);				
					}
				}
			}
			
			if(pagosautorizadossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						pagosautorizadossSeleccionados.addAll(this.pagosautorizadosLogic.getPagosAutorizadoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						pagosautorizadossSeleccionados.addAll(this.pagosautorizadoss);				
					}
				}
			}
		} else {
			pagosautorizadossSeleccionados.add(this.pagosautorizados);
		}
		
		return pagosautorizadossSeleccionados;
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
	
	public void generarReportePagosAutorizadossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPagosAutorizadossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPagosAutorizadossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPagosAutorizadossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPagosAutorizadossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Pagos Autorizados",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPagosAutorizadossSeleccionados() throws Exception {
		ArrayList<PagosAutorizados> pagosautorizadossSeleccionados=new ArrayList<PagosAutorizados>();		
		
		pagosautorizadossSeleccionados=this.getPagosAutorizadossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePagosAutorizadoss("Todos",pagosautorizadossSeleccionados);
		
	}	
	
	public void generarReporteNormalPagosAutorizadossSeleccionados() throws Exception {
		ArrayList<PagosAutorizados> pagosautorizadossSeleccionados=new ArrayList<PagosAutorizados>();		
		
		pagosautorizadossSeleccionados=this.getPagosAutorizadossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePagosAutorizadoss("Todos",pagosautorizadossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPagosAutorizadossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PagosAutorizados> pagosautorizadossSeleccionados=new ArrayList<PagosAutorizados>();
		
		pagosautorizadossSeleccionados=this.getPagosAutorizadossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePagosAutorizadoss("Todos",pagosautorizadossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPagosAutorizadossSeleccionados() throws Exception {
		ArrayList<PagosAutorizados> pagosautorizadossSeleccionados=new ArrayList<PagosAutorizados>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPagosAutorizados();
		
		
		pagosautorizadossSeleccionados=this.getPagosAutorizadossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPagosAutorizados();
		
		
		//this.generarReportePagosAutorizadoss("Todos",pagosautorizadossSeleccionados ,pagosautorizadosImplementable,pagosautorizadosImplementableHome);
	}
	
	public void mostrarImportacionPagosAutorizadoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPagosAutorizados();
		
		this.abrirFrameImportacionPagosAutorizados();		
		
			
		//this.generarReportePagosAutorizadoss("Todos",pagosautorizadossSeleccionados ,pagosautorizadosImplementable,pagosautorizadosImplementableHome);
	}
	
	public void importarPagosAutorizadoss() throws Exception {		
	
	}
	
	public void exportarPagosAutorizadossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPagosAutorizadossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPagosAutorizadossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPagosAutorizadossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Pagos Autorizados",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPagosAutorizadossSeleccionados() throws Exception {
		ArrayList<PagosAutorizados> pagosautorizadossSeleccionados=new ArrayList<PagosAutorizados>();		
		
		pagosautorizadossSeleccionados=this.getPagosAutorizadossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pagosautorizados."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPagosAutorizados(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PagosAutorizados pagosautorizadosAux:pagosautorizadossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPagosAutorizados(pagosautorizadosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//pagosautorizadosAux.setsDetalleGeneralEntityReporte(pagosautorizadosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Autorizados",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPagosAutorizados(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PagosAutorizadosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosConstantesFunciones.LABEL_FECHACORTE0;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosConstantesFunciones.LABEL_FECHAVENCIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosConstantesFunciones.LABEL_VALORPORPAGAR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosConstantesFunciones.LABEL_VALORCANCELADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosConstantesFunciones.LABEL_ESTAAUTORIZADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosConstantesFunciones.LABEL_DESCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosConstantesFunciones.LABEL_FECHACORTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosConstantesFunciones.LABEL_ESTADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPagosAutorizados(PagosAutorizados pagosautorizados,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=pagosautorizados.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizados.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizados.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizados.getfecha_corte().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizados.getnombre_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizados.getnumero_factura();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizados.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizados.getfecha_vencimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizados.getnombre_banco();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizados.getvalor_por_pagar().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizados.getvalor_cancelado().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizados.getnumero_cuenta();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizados.getesta_autorizado().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizados.getdescripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizados.getfecha_corte_dato().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizados.getestado();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizados.getcodigo_cuenta_con_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautorizados.getcodigo_cuenta_con_banco();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPagosAutorizadossSeleccionados() throws Exception {
		ArrayList<PagosAutorizados> pagosautorizadossSeleccionados=new ArrayList<PagosAutorizados>();		
		
		pagosautorizadossSeleccionados=this.getPagosAutorizadossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pagosautorizados.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PagosAutorizadoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPagosAutorizados(row);				
				iRow++;
			}				
			
			for(PagosAutorizados pagosautorizadosAux:pagosautorizadossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPagosAutorizados(pagosautorizadosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Autorizados",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPagosAutorizadossSeleccionados() throws Exception {
		ArrayList<PagosAutorizados> pagosautorizadossSeleccionados=new ArrayList<PagosAutorizados>();		
		
		pagosautorizadossSeleccionados=this.getPagosAutorizadossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pagosautorizados.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("pagosautorizadoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("pagosautorizados");
			//elementRoot.appendChild(element);
		
			for(PagosAutorizados pagosautorizadosAux:pagosautorizadossSeleccionados) {
				element = document.createElement("pagosautorizados");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPagosAutorizados(pagosautorizadosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Autorizados",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPagosAutorizados(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_FECHACORTE0);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_VALORPORPAGAR);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_VALORCANCELADO);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_ESTAAUTORIZADO);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_DESCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_FECHACORTE);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_ESTADO);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPagosAutorizados(PagosAutorizados pagosautorizados,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizados.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizados.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizados.getfecha_corte());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizados.getnombre_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizados.getnumero_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizados.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizados.getfecha_vencimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizados.getnombre_banco());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizados.getvalor_por_pagar());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizados.getvalor_cancelado());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizados.getnumero_cuenta());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizados.getesta_autorizado());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizados.getdescripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizados.getfecha_corte_dato());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizados.getestado());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizados.getcodigo_cuenta_con_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautorizados.getcodigo_cuenta_con_banco());				
	}
	
	public void setFilaDatosExportarXmlPagosAutorizados(PagosAutorizados pagosautorizados,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PagosAutorizadosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(pagosautorizados.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PagosAutorizadosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(pagosautorizados.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PagosAutorizadosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(pagosautorizados.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementfecha_corte = document.createElement(PagosAutorizadosConstantesFunciones.FECHACORTE0);
		elementfecha_corte.appendChild(document.createTextNode(pagosautorizados.getfecha_corte().toString().trim()));
		element.appendChild(elementfecha_corte);

		Element elementnombre_cliente = document.createElement(PagosAutorizadosConstantesFunciones.NOMBRECLIENTE);
		elementnombre_cliente.appendChild(document.createTextNode(pagosautorizados.getnombre_cliente().trim()));
		element.appendChild(elementnombre_cliente);

		Element elementnumero_factura = document.createElement(PagosAutorizadosConstantesFunciones.NUMEROFACTURA);
		elementnumero_factura.appendChild(document.createTextNode(pagosautorizados.getnumero_factura().trim()));
		element.appendChild(elementnumero_factura);

		Element elementfecha_emision = document.createElement(PagosAutorizadosConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(pagosautorizados.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementfecha_vencimiento = document.createElement(PagosAutorizadosConstantesFunciones.FECHAVENCIMIENTO);
		elementfecha_vencimiento.appendChild(document.createTextNode(pagosautorizados.getfecha_vencimiento().toString().trim()));
		element.appendChild(elementfecha_vencimiento);

		Element elementnombre_banco = document.createElement(PagosAutorizadosConstantesFunciones.NOMBREBANCO);
		elementnombre_banco.appendChild(document.createTextNode(pagosautorizados.getnombre_banco().trim()));
		element.appendChild(elementnombre_banco);

		Element elementvalor_por_pagar = document.createElement(PagosAutorizadosConstantesFunciones.VALORPORPAGAR);
		elementvalor_por_pagar.appendChild(document.createTextNode(pagosautorizados.getvalor_por_pagar().toString().trim()));
		element.appendChild(elementvalor_por_pagar);

		Element elementvalor_cancelado = document.createElement(PagosAutorizadosConstantesFunciones.VALORCANCELADO);
		elementvalor_cancelado.appendChild(document.createTextNode(pagosautorizados.getvalor_cancelado().toString().trim()));
		element.appendChild(elementvalor_cancelado);

		Element elementnumero_cuenta = document.createElement(PagosAutorizadosConstantesFunciones.NUMEROCUENTA);
		elementnumero_cuenta.appendChild(document.createTextNode(pagosautorizados.getnumero_cuenta().trim()));
		element.appendChild(elementnumero_cuenta);

		Element elementesta_autorizado = document.createElement(PagosAutorizadosConstantesFunciones.ESTAAUTORIZADO);
		elementesta_autorizado.appendChild(document.createTextNode(pagosautorizados.getesta_autorizado().toString().trim()));
		element.appendChild(elementesta_autorizado);

		Element elementdescripcion = document.createElement(PagosAutorizadosConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(pagosautorizados.getdescripcion().trim()));
		element.appendChild(elementdescripcion);

		Element elementfecha_corte_dato = document.createElement(PagosAutorizadosConstantesFunciones.FECHACORTE);
		elementfecha_corte_dato.appendChild(document.createTextNode(pagosautorizados.getfecha_corte_dato().toString().trim()));
		element.appendChild(elementfecha_corte_dato);

		Element elementestado = document.createElement(PagosAutorizadosConstantesFunciones.ESTADO);
		elementestado.appendChild(document.createTextNode(pagosautorizados.getestado().trim()));
		element.appendChild(elementestado);

		Element elementcodigo_cuenta_con_cliente = document.createElement(PagosAutorizadosConstantesFunciones.CODIGOCUENTACONCLIENTE);
		elementcodigo_cuenta_con_cliente.appendChild(document.createTextNode(pagosautorizados.getcodigo_cuenta_con_cliente().trim()));
		element.appendChild(elementcodigo_cuenta_con_cliente);

		Element elementcodigo_cuenta_con_banco = document.createElement(PagosAutorizadosConstantesFunciones.CODIGOCUENTACONBANCO);
		elementcodigo_cuenta_con_banco.appendChild(document.createTextNode(pagosautorizados.getcodigo_cuenta_con_banco().trim()));
		element.appendChild(elementcodigo_cuenta_con_banco);
	}
	
	public void generarReporteGroupGenericoPagosAutorizadossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PagosAutorizados> pagosautorizadossSeleccionados=new ArrayList<PagosAutorizados>();
		
		pagosautorizadossSeleccionados=this.getPagosAutorizadossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPagosAutorizados(pagosautorizadossSeleccionados);
		
		this.generarReportePagosAutorizadoss("Todos",pagosautorizadossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPagosAutorizados(ArrayList<PagosAutorizados> pagosautorizadossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PagosAutorizados pagosautorizadosAux:pagosautorizadossSeleccionados) {
				pagosautorizadosAux.setsDetalleGeneralEntityReporte(pagosautorizadosAux.toString());
			
				if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					pagosautorizadosAux.setsDescripcionGeneralEntityReporte1(pagosautorizadosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_FECHACORTE0)) {
					existe=true;
					pagosautorizadosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(pagosautorizadosAux.getfecha_corte()));
				}
				 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE)) {
					existe=true;
					pagosautorizadosAux.setsDescripcionGeneralEntityReporte1(pagosautorizadosAux.getnombre_cliente());
				}
				 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA)) {
					existe=true;
					pagosautorizadosAux.setsDescripcionGeneralEntityReporte1(pagosautorizadosAux.getnumero_factura());
				}
				 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					pagosautorizadosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(pagosautorizadosAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
					existe=true;
					pagosautorizadosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(pagosautorizadosAux.getfecha_vencimiento()));
				}
				 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO)) {
					existe=true;
					pagosautorizadosAux.setsDescripcionGeneralEntityReporte1(pagosautorizadosAux.getnombre_banco());
				}
				 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA)) {
					existe=true;
					pagosautorizadosAux.setsDescripcionGeneralEntityReporte1(pagosautorizadosAux.getnumero_cuenta());
				}
				 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_ESTAAUTORIZADO)) {
					existe=true;
					pagosautorizadosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(pagosautorizadosAux.getesta_autorizado()));
				}
				 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					pagosautorizadosAux.setsDescripcionGeneralEntityReporte1(pagosautorizadosAux.getdescripcion());
				}
				 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_FECHACORTE)) {
					existe=true;
					pagosautorizadosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(pagosautorizadosAux.getfecha_corte_dato()));
				}
				 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_ESTADO)) {
					existe=true;
					pagosautorizadosAux.setsDescripcionGeneralEntityReporte1(pagosautorizadosAux.getestado());
				}
				 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE)) {
					existe=true;
					pagosautorizadosAux.setsDescripcionGeneralEntityReporte1(pagosautorizadosAux.getcodigo_cuenta_con_cliente());
				}
				 else if(sTipoSeleccionar.equals(PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO)) {
					existe=true;
					pagosautorizadosAux.setsDescripcionGeneralEntityReporte1(pagosautorizadosAux.getcodigo_cuenta_con_banco());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutorizadosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPagosAutorizados(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPagosAutorizados=true;
				this.isVisibilidadCeldaNuevoRelacionesPagosAutorizados=true;
				this.isVisibilidadCeldaGuardarCambiosPagosAutorizados=true;
			}
			
			this.isVisibilidadCeldaModificarPagosAutorizados=false;
			this.isVisibilidadCeldaActualizarPagosAutorizados=false;
			this.isVisibilidadCeldaEliminarPagosAutorizados=false;
			this.isVisibilidadCeldaCancelarPagosAutorizados=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPagosAutorizados=true;
				} else {
					this.isVisibilidadCeldaGuardarPagosAutorizados=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPagosAutorizados=false;
			this.isVisibilidadCeldaNuevoRelacionesPagosAutorizados=false;
			this.isVisibilidadCeldaGuardarCambiosPagosAutorizados=false;
			this.isVisibilidadCeldaModificarPagosAutorizados=false;
			this.isVisibilidadCeldaActualizarPagosAutorizados=true;
			this.isVisibilidadCeldaEliminarPagosAutorizados=false;
			this.isVisibilidadCeldaCancelarPagosAutorizados=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPagosAutorizados=true;
				} else {
					this.isVisibilidadCeldaGuardarPagosAutorizados=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPagosAutorizados=false;
			this.isVisibilidadCeldaNuevoRelacionesPagosAutorizados=false;
			this.isVisibilidadCeldaGuardarCambiosPagosAutorizados=false;
			this.isVisibilidadCeldaModificarPagosAutorizados=false;
			this.isVisibilidadCeldaActualizarPagosAutorizados=true;
			this.isVisibilidadCeldaEliminarPagosAutorizados=true;
			this.isVisibilidadCeldaCancelarPagosAutorizados=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPagosAutorizados=true;
				} else {
					this.isVisibilidadCeldaGuardarPagosAutorizados=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPagosAutorizados=false;
			this.isVisibilidadCeldaNuevoRelacionesPagosAutorizados=false;
			this.isVisibilidadCeldaGuardarCambiosPagosAutorizados=false;
			this.isVisibilidadCeldaModificarPagosAutorizados=false;
			this.isVisibilidadCeldaActualizarPagosAutorizados=true;
			this.isVisibilidadCeldaEliminarPagosAutorizados=false;
			this.isVisibilidadCeldaCancelarPagosAutorizados=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPagosAutorizados=false;
				} else {
					this.isVisibilidadCeldaGuardarPagosAutorizados=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPagosAutorizados=true;
			this.isVisibilidadCeldaNuevoRelacionesPagosAutorizados=true;
			this.isVisibilidadCeldaGuardarCambiosPagosAutorizados=true;
			this.isVisibilidadCeldaModificarPagosAutorizados=false;
			this.isVisibilidadCeldaActualizarPagosAutorizados=false;
			this.isVisibilidadCeldaEliminarPagosAutorizados=false;
			this.isVisibilidadCeldaCancelarPagosAutorizados=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPagosAutorizados=true;
				} else {
					this.isVisibilidadCeldaGuardarPagosAutorizados=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPagosAutorizados=false;
			this.isVisibilidadCeldaNuevoRelacionesPagosAutorizados=false;
			this.isVisibilidadCeldaGuardarCambiosPagosAutorizados=false;
			this.isVisibilidadCeldaActualizarPagosAutorizados=false;
			this.isVisibilidadCeldaEliminarPagosAutorizados=false;
			this.isVisibilidadCeldaCancelarPagosAutorizados=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPagosAutorizados=false;
				} else {
					this.isVisibilidadCeldaGuardarPagosAutorizados=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPagosAutorizados=false;
			this.isVisibilidadCeldaNuevoRelacionesPagosAutorizados=false;
			this.isVisibilidadCeldaGuardarCambiosPagosAutorizados=false;
			this.isVisibilidadCeldaModificarPagosAutorizados=true;
			this.isVisibilidadCeldaActualizarPagosAutorizados=false;
			this.isVisibilidadCeldaEliminarPagosAutorizados=false;
			this.isVisibilidadCeldaCancelarPagosAutorizados=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPagosAutorizados=false;
				} else {
					this.isVisibilidadCeldaGuardarPagosAutorizados=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PagosAutorizadosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPagosAutorizados=true;
			this.isVisibilidadCeldaNuevoRelacionesPagosAutorizados=true;
			this.isVisibilidadCeldaGuardarCambiosPagosAutorizados=true;
		} else {
			this.actualizarEstadoPanelsPagosAutorizados(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPagosAutorizados=false;
			//this.isVisibilidadCeldaVerFormPagosAutorizados=false;
			this.isVisibilidadCeldaDuplicarPagosAutorizados=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!pagosautorizadosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPagosAutorizados=false;
		} else {
			this.isVisibilidadCeldaNuevoPagosAutorizados=false;
			this.isVisibilidadCeldaGuardarCambiosPagosAutorizados=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(pagosautorizadosSessionBean.getEsGuardarRelacionado()) {
			if(!pagosautorizadosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPagosAutorizados=false;												
			}
			
			this.jButtonCerrarPagosAutorizados.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPagosAutorizados=false;
		}
		
		if(!this.permiteMantenimiento(this.pagosautorizados)) {
			this.isVisibilidadCeldaActualizarPagosAutorizados=false;
			this.isVisibilidadCeldaEliminarPagosAutorizados=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoPagosAutorizados=false;
		this.isVisibilidadCeldaNuevoRelacionesPagosAutorizados=false;
		this.isVisibilidadCeldaGuardarCambiosPagosAutorizados=false;
		//this.isVisibilidadCeldaModificarPagosAutorizados=true;
		this.isVisibilidadCeldaActualizarPagosAutorizados=false;
		this.isVisibilidadCeldaEliminarPagosAutorizados=false;
		//this.isVisibilidadCeldaCancelarPagosAutorizados=true;			
		this.isVisibilidadCeldaGuardarPagosAutorizados=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPagosAutorizados() {
	}
	
	public void actualizarEstadoPanelsPagosAutorizados(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPagosAutorizados!=null) {
				this.jScrollPanelDatosEdicionPagosAutorizados.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosAutorizados!=null) {
				this.jTabbedPaneBusquedasPagosAutorizados.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPagosAutorizados!=null) {
				this.jScrollPanelDatosPagosAutorizados.setVisible(true);
			}
			
			if(this.jPanelPaginacionPagosAutorizados!=null) {
				this.jPanelPaginacionPagosAutorizados.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPagosAutorizados!=null) {
				this.jPanelParametrosReportesPagosAutorizados.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPagosAutorizados!=null) {
				this.jScrollPanelDatosEdicionPagosAutorizados.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosAutorizados!=null) {
				this.jTabbedPaneBusquedasPagosAutorizados.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPagosAutorizados!=null) {
				this.jScrollPanelDatosPagosAutorizados.setVisible(false);
			}
			
			if(this.jPanelPaginacionPagosAutorizados!=null) {
				this.jPanelPaginacionPagosAutorizados.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPagosAutorizados!=null) {
				this.jPanelParametrosReportesPagosAutorizados.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPagosAutorizados!=null) {
				this.jScrollPanelDatosEdicionPagosAutorizados.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosAutorizados!=null) {
				this.jTabbedPaneBusquedasPagosAutorizados.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPagosAutorizados!=null) {
				this.jScrollPanelDatosPagosAutorizados.setVisible(false);
			}
			
			if(this.jPanelPaginacionPagosAutorizados!=null) {
				this.jPanelPaginacionPagosAutorizados.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPagosAutorizados!=null) {
				this.jPanelParametrosReportesPagosAutorizados.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPagosAutorizados!=null) {
				this.jScrollPanelDatosEdicionPagosAutorizados.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosAutorizados!=null) {
				this.jTabbedPaneBusquedasPagosAutorizados.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPagosAutorizados!=null) {
				this.jScrollPanelDatosPagosAutorizados.setVisible(false);
			}
			
			if(this.jPanelPaginacionPagosAutorizados!=null) {
				this.jPanelPaginacionPagosAutorizados.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPagosAutorizados!=null) {
				this.jPanelParametrosReportesPagosAutorizados.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPagosAutorizados!=null) {
				this.jScrollPanelDatosEdicionPagosAutorizados.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosAutorizados!=null) {
				this.jTabbedPaneBusquedasPagosAutorizados.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPagosAutorizados!=null) {
				this.jScrollPanelDatosPagosAutorizados.setVisible(true);
			}
			
			if(this.jPanelPaginacionPagosAutorizados!=null) {
				this.jPanelPaginacionPagosAutorizados.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPagosAutorizados!=null) {
				this.jPanelParametrosReportesPagosAutorizados.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPagosAutorizados!=null) {
				this.jScrollPanelDatosEdicionPagosAutorizados.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosAutorizados!=null) {
				this.jTabbedPaneBusquedasPagosAutorizados.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPagosAutorizados!=null) {
				this.jScrollPanelDatosPagosAutorizados.setVisible(true);
			}
			
			if(this.jPanelPaginacionPagosAutorizados!=null) {
				this.jPanelPaginacionPagosAutorizados.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPagosAutorizados!=null) {
				this.jPanelParametrosReportesPagosAutorizados.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPagosAutorizados!=null) {
				this.jScrollPanelDatosEdicionPagosAutorizados.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosAutorizados!=null) {
				this.jTabbedPaneBusquedasPagosAutorizados.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPagosAutorizados!=null) {
				this.jScrollPanelDatosPagosAutorizados.setVisible(true);
			}
			
			if(this.jPanelPaginacionPagosAutorizados!=null) {
				this.jPanelPaginacionPagosAutorizados.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPagosAutorizados!=null) {
				this.jPanelParametrosReportesPagosAutorizados.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPagosAutorizados!=null) {
					this.jTabbedPaneBusquedasPagosAutorizados.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPagosAutorizados!=null) {
				this.jPanelParametrosReportesPagosAutorizados.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosAutorizados!=null) {
				this.jTabbedPaneBusquedasPagosAutorizados.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPagosAutorizados!=null) {
				this.jPanelParametrosReportesPagosAutorizados.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPagosAutorizados=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPagosAutorizados) {this.jTabbedPaneBusquedasPagosAutorizados.remove(jPanelBusquedaPagosAutorizadosPagosAutorizados);}
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
			
			this.inicializarActualizarBindingTablaPagosAutorizados(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPagosAutorizados() {
		this.updateBorderResaltarBusquedasFormularioPagosAutorizados();
		this.updateVisibilidadBusquedasFormularioPagosAutorizados();
		this.updateHabilitarBusquedasFormularioPagosAutorizados();
	}
	
	public void updateBorderResaltarBusquedasFormularioPagosAutorizados() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPagosAutorizados.getComponents().length>0) {
	

		if(this.pagosautorizadosConstantesFunciones.resaltarBusquedaPagosAutorizadosPagosAutorizados!=null) {
			index= this.jTabbedPaneBusquedasPagosAutorizados.indexOfComponent(this.jPanelBusquedaPagosAutorizadosPagosAutorizados);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPagosAutorizados.getComponent(index);
				jPanel.setBorder(this.pagosautorizadosConstantesFunciones.resaltarBusquedaPagosAutorizadosPagosAutorizados);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPagosAutorizados() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPagosAutorizados.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPagosAutorizados.indexOfComponent(this.jPanelBusquedaPagosAutorizadosPagosAutorizados);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPagosAutorizados.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.pagosautorizadosConstantesFunciones.mostrarBusquedaPagosAutorizadosPagosAutorizados);
			if(!this.pagosautorizadosConstantesFunciones.mostrarBusquedaPagosAutorizadosPagosAutorizados && index>-1) {
				this.jTabbedPaneBusquedasPagosAutorizados.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPagosAutorizados() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPagosAutorizados.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPagosAutorizados.indexOfComponent(this.jPanelBusquedaPagosAutorizadosPagosAutorizados);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPagosAutorizados.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.pagosautorizadosConstantesFunciones.activarBusquedaPagosAutorizadosPagosAutorizados);
				this.jTabbedPaneBusquedasPagosAutorizados.setEnabledAt(index,this.pagosautorizadosConstantesFunciones.activarBusquedaPagosAutorizadosPagosAutorizados);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPagosAutorizados(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPagosAutorizados")) {
			index= this.jTabbedPaneBusquedasPagosAutorizados.indexOfComponent(this.jPanelBusquedaPagosAutorizadosPagosAutorizados);

			this.jTabbedPaneBusquedasPagosAutorizados.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPagosAutorizados.getComponent(index);

			this.pagosautorizadosConstantesFunciones.setResaltarBusquedaPagosAutorizadosPagosAutorizados(resaltar);

			jPanel.setBorder(this.pagosautorizadosConstantesFunciones.resaltarBusquedaPagosAutorizadosPagosAutorizados);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPagosAutorizados.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPagosAutorizados() throws Exception {

		if(this.jInternalFrameDetalleFormPagosAutorizados==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPagosAutorizados();
		this.updateVisibilidadResaltarControlesFormularioPagosAutorizados();
		this.updateHabilitarResaltarControlesFormularioPagosAutorizados();
		
	}
	
	public void updateBorderResaltarControlesFormularioPagosAutorizados() throws Exception {
		if(this.jInternalFrameDetalleFormPagosAutorizados==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.pagosautorizadosConstantesFunciones.resaltaridPagosAutorizados!=null && this.jInternalFrameDetalleFormPagosAutorizados!=null) {this.jInternalFrameDetalleFormPagosAutorizados.jLabelidPagosAutorizados.setBorder(this.pagosautorizadosConstantesFunciones.resaltaridPagosAutorizados);}
		if(this.pagosautorizadosConstantesFunciones.resaltarid_empresaPagosAutorizados!=null && this.jInternalFrameDetalleFormPagosAutorizados!=null) {this.jInternalFrameDetalleFormPagosAutorizados.jComboBoxid_empresaPagosAutorizados.setBorder(this.pagosautorizadosConstantesFunciones.resaltarid_empresaPagosAutorizados);}
		if(this.pagosautorizadosConstantesFunciones.resaltarfecha_cortePagosAutorizados!=null && this.jInternalFrameDetalleFormPagosAutorizados!=null) {this.jInternalFrameDetalleFormPagosAutorizados.jDateChooserfecha_cortePagosAutorizados.setBorder(this.pagosautorizadosConstantesFunciones.resaltarfecha_cortePagosAutorizados);}
		if(this.pagosautorizadosConstantesFunciones.resaltarnombre_clientePagosAutorizados!=null && this.jInternalFrameDetalleFormPagosAutorizados!=null) {this.jInternalFrameDetalleFormPagosAutorizados.jTextAreanombre_clientePagosAutorizados.setBorder(this.pagosautorizadosConstantesFunciones.resaltarnombre_clientePagosAutorizados);}
		if(this.pagosautorizadosConstantesFunciones.resaltarnumero_facturaPagosAutorizados!=null && this.jInternalFrameDetalleFormPagosAutorizados!=null) {this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldnumero_facturaPagosAutorizados.setBorder(this.pagosautorizadosConstantesFunciones.resaltarnumero_facturaPagosAutorizados);}
		if(this.pagosautorizadosConstantesFunciones.resaltarfecha_emisionPagosAutorizados!=null && this.jInternalFrameDetalleFormPagosAutorizados!=null) {this.jInternalFrameDetalleFormPagosAutorizados.jDateChooserfecha_emisionPagosAutorizados.setBorder(this.pagosautorizadosConstantesFunciones.resaltarfecha_emisionPagosAutorizados);}
		if(this.pagosautorizadosConstantesFunciones.resaltarfecha_vencimientoPagosAutorizados!=null && this.jInternalFrameDetalleFormPagosAutorizados!=null) {this.jInternalFrameDetalleFormPagosAutorizados.jDateChooserfecha_vencimientoPagosAutorizados.setBorder(this.pagosautorizadosConstantesFunciones.resaltarfecha_vencimientoPagosAutorizados);}
		if(this.pagosautorizadosConstantesFunciones.resaltarnombre_bancoPagosAutorizados!=null && this.jInternalFrameDetalleFormPagosAutorizados!=null) {this.jInternalFrameDetalleFormPagosAutorizados.jTextAreanombre_bancoPagosAutorizados.setBorder(this.pagosautorizadosConstantesFunciones.resaltarnombre_bancoPagosAutorizados);}
		if(this.pagosautorizadosConstantesFunciones.resaltarvalor_por_pagarPagosAutorizados!=null && this.jInternalFrameDetalleFormPagosAutorizados!=null) {this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldvalor_por_pagarPagosAutorizados.setBorder(this.pagosautorizadosConstantesFunciones.resaltarvalor_por_pagarPagosAutorizados);}
		if(this.pagosautorizadosConstantesFunciones.resaltarvalor_canceladoPagosAutorizados!=null && this.jInternalFrameDetalleFormPagosAutorizados!=null) {this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldvalor_canceladoPagosAutorizados.setBorder(this.pagosautorizadosConstantesFunciones.resaltarvalor_canceladoPagosAutorizados);}
		if(this.pagosautorizadosConstantesFunciones.resaltarnumero_cuentaPagosAutorizados!=null && this.jInternalFrameDetalleFormPagosAutorizados!=null) {this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldnumero_cuentaPagosAutorizados.setBorder(this.pagosautorizadosConstantesFunciones.resaltarnumero_cuentaPagosAutorizados);}
		if(this.pagosautorizadosConstantesFunciones.resaltaresta_autorizadoPagosAutorizados!=null && this.jInternalFrameDetalleFormPagosAutorizados!=null) {this.jInternalFrameDetalleFormPagosAutorizados.jCheckBoxesta_autorizadoPagosAutorizados.setBorderPainted(true);this.jInternalFrameDetalleFormPagosAutorizados.jCheckBoxesta_autorizadoPagosAutorizados.setBorder(this.pagosautorizadosConstantesFunciones.resaltaresta_autorizadoPagosAutorizados);}
		if(this.pagosautorizadosConstantesFunciones.resaltardescripcionPagosAutorizados!=null && this.jInternalFrameDetalleFormPagosAutorizados!=null) {this.jInternalFrameDetalleFormPagosAutorizados.jTextAreadescripcionPagosAutorizados.setBorder(this.pagosautorizadosConstantesFunciones.resaltardescripcionPagosAutorizados);}
		if(this.pagosautorizadosConstantesFunciones.resaltarfecha_corte_datoPagosAutorizados!=null && this.jInternalFrameDetalleFormPagosAutorizados!=null) {this.jInternalFrameDetalleFormPagosAutorizados.jDateChooserfecha_corte_datoPagosAutorizados.setBorder(this.pagosautorizadosConstantesFunciones.resaltarfecha_corte_datoPagosAutorizados);}
		if(this.pagosautorizadosConstantesFunciones.resaltarestadoPagosAutorizados!=null && this.jInternalFrameDetalleFormPagosAutorizados!=null) {this.jInternalFrameDetalleFormPagosAutorizados.jTextAreaestadoPagosAutorizados.setBorder(this.pagosautorizadosConstantesFunciones.resaltarestadoPagosAutorizados);}
		if(this.pagosautorizadosConstantesFunciones.resaltarcodigo_cuenta_con_clientePagosAutorizados!=null && this.jInternalFrameDetalleFormPagosAutorizados!=null) {this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldcodigo_cuenta_con_clientePagosAutorizados.setBorder(this.pagosautorizadosConstantesFunciones.resaltarcodigo_cuenta_con_clientePagosAutorizados);}
		if(this.pagosautorizadosConstantesFunciones.resaltarcodigo_cuenta_con_bancoPagosAutorizados!=null && this.jInternalFrameDetalleFormPagosAutorizados!=null) {this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldcodigo_cuenta_con_bancoPagosAutorizados.setBorder(this.pagosautorizadosConstantesFunciones.resaltarcodigo_cuenta_con_bancoPagosAutorizados);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPagosAutorizados() throws Exception {		
		if(this.jInternalFrameDetalleFormPagosAutorizados==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPagosAutorizados!=null) {
	
		//this.jInternalFrameDetalleFormPagosAutorizados.jLabelidPagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostraridPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jPanelidPagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostraridPagosAutorizados);
		//this.jInternalFrameDetalleFormPagosAutorizados.jComboBoxid_empresaPagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostrarid_empresaPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jPanelid_empresaPagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostrarid_empresaPagosAutorizados);
		//this.jInternalFrameDetalleFormPagosAutorizados.jDateChooserfecha_cortePagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostrarfecha_cortePagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jPanelfecha_cortePagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostrarfecha_cortePagosAutorizados);
		//this.jInternalFrameDetalleFormPagosAutorizados.jTextAreanombre_clientePagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostrarnombre_clientePagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jPanelnombre_clientePagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostrarnombre_clientePagosAutorizados);
		//this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldnumero_facturaPagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostrarnumero_facturaPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jPanelnumero_facturaPagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostrarnumero_facturaPagosAutorizados);
		//this.jInternalFrameDetalleFormPagosAutorizados.jDateChooserfecha_emisionPagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostrarfecha_emisionPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jPanelfecha_emisionPagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostrarfecha_emisionPagosAutorizados);
		//this.jInternalFrameDetalleFormPagosAutorizados.jDateChooserfecha_vencimientoPagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostrarfecha_vencimientoPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jPanelfecha_vencimientoPagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostrarfecha_vencimientoPagosAutorizados);
		//this.jInternalFrameDetalleFormPagosAutorizados.jTextAreanombre_bancoPagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostrarnombre_bancoPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jPanelnombre_bancoPagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostrarnombre_bancoPagosAutorizados);
		//this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldvalor_por_pagarPagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostrarvalor_por_pagarPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jPanelvalor_por_pagarPagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostrarvalor_por_pagarPagosAutorizados);
		//this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldvalor_canceladoPagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostrarvalor_canceladoPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jPanelvalor_canceladoPagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostrarvalor_canceladoPagosAutorizados);
		//this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldnumero_cuentaPagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostrarnumero_cuentaPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jPanelnumero_cuentaPagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostrarnumero_cuentaPagosAutorizados);
		//this.jInternalFrameDetalleFormPagosAutorizados.jCheckBoxesta_autorizadoPagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostraresta_autorizadoPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jPanelesta_autorizadoPagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostraresta_autorizadoPagosAutorizados);
		//this.jInternalFrameDetalleFormPagosAutorizados.jTextAreadescripcionPagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostrardescripcionPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jPaneldescripcionPagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostrardescripcionPagosAutorizados);
		//this.jInternalFrameDetalleFormPagosAutorizados.jDateChooserfecha_corte_datoPagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostrarfecha_corte_datoPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jPanelfecha_corte_datoPagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostrarfecha_corte_datoPagosAutorizados);
		//this.jInternalFrameDetalleFormPagosAutorizados.jTextAreaestadoPagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostrarestadoPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jPanelestadoPagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostrarestadoPagosAutorizados);
		//this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldcodigo_cuenta_con_clientePagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostrarcodigo_cuenta_con_clientePagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jPanelcodigo_cuenta_con_clientePagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostrarcodigo_cuenta_con_clientePagosAutorizados);
		//this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldcodigo_cuenta_con_bancoPagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostrarcodigo_cuenta_con_bancoPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jPanelcodigo_cuenta_con_bancoPagosAutorizados.setVisible(this.pagosautorizadosConstantesFunciones.mostrarcodigo_cuenta_con_bancoPagosAutorizados);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPagosAutorizados() throws Exception {
		if(this.jInternalFrameDetalleFormPagosAutorizados==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPagosAutorizados!=null) {
	
		this.jInternalFrameDetalleFormPagosAutorizados.jLabelidPagosAutorizados.setEnabled(this.pagosautorizadosConstantesFunciones.activaridPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jComboBoxid_empresaPagosAutorizados.setEnabled(this.pagosautorizadosConstantesFunciones.activarid_empresaPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jDateChooserfecha_cortePagosAutorizados.setEnabled(this.pagosautorizadosConstantesFunciones.activarfecha_cortePagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jTextAreanombre_clientePagosAutorizados.setEnabled(this.pagosautorizadosConstantesFunciones.activarnombre_clientePagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldnumero_facturaPagosAutorizados.setEnabled(this.pagosautorizadosConstantesFunciones.activarnumero_facturaPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jDateChooserfecha_emisionPagosAutorizados.setEnabled(this.pagosautorizadosConstantesFunciones.activarfecha_emisionPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jDateChooserfecha_vencimientoPagosAutorizados.setEnabled(this.pagosautorizadosConstantesFunciones.activarfecha_vencimientoPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jTextAreanombre_bancoPagosAutorizados.setEnabled(this.pagosautorizadosConstantesFunciones.activarnombre_bancoPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldvalor_por_pagarPagosAutorizados.setEnabled(this.pagosautorizadosConstantesFunciones.activarvalor_por_pagarPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldvalor_canceladoPagosAutorizados.setEnabled(this.pagosautorizadosConstantesFunciones.activarvalor_canceladoPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldnumero_cuentaPagosAutorizados.setEnabled(this.pagosautorizadosConstantesFunciones.activarnumero_cuentaPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jCheckBoxesta_autorizadoPagosAutorizados.setEnabled(this.pagosautorizadosConstantesFunciones.activaresta_autorizadoPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jTextAreadescripcionPagosAutorizados.setEnabled(this.pagosautorizadosConstantesFunciones.activardescripcionPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jDateChooserfecha_corte_datoPagosAutorizados.setEnabled(this.pagosautorizadosConstantesFunciones.activarfecha_corte_datoPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jTextAreaestadoPagosAutorizados.setEnabled(this.pagosautorizadosConstantesFunciones.activarestadoPagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldcodigo_cuenta_con_clientePagosAutorizados.setEnabled(this.pagosautorizadosConstantesFunciones.activarcodigo_cuenta_con_clientePagosAutorizados);
		this.jInternalFrameDetalleFormPagosAutorizados.jTextFieldcodigo_cuenta_con_bancoPagosAutorizados.setEnabled(this.pagosautorizadosConstantesFunciones.activarcodigo_cuenta_con_bancoPagosAutorizados);
		}
	}
	
		
}