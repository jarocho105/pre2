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

//import com.bydan.erp.tesoreria.util.PagosAutomaticosConstantesFunciones;
import com.bydan.erp.tesoreria.util.report.PagosAutomaticosParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.report.PagosAutomaticosParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.report.PagosAutomaticosBean;
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
public class PagosAutomaticosBeanSwingJInternalFrame extends PagosAutomaticosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PagosAutomaticosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PagosAutomaticos> pagosautomaticosValidator = new ClassValidator<PagosAutomaticos>(PagosAutomaticos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PagosAutomaticos pagosautomaticos;	
	public PagosAutomaticos pagosautomaticosAux;
	public PagosAutomaticos pagosautomaticosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PagosAutomaticos pagosautomaticosTotales;
	public Long idPagosAutomaticosActual;
	public Long iIdNuevoPagosAutomaticos=0L;
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
	
	public Boolean isPermisoTodoPagosAutomaticos;
	public Boolean isPermisoNuevoPagosAutomaticos;
	public Boolean isPermisoActualizarPagosAutomaticos;
	public Boolean isPermisoActualizarOriginalPagosAutomaticos;
	public Boolean isPermisoEliminarPagosAutomaticos;
	public Boolean isPermisoGuardarCambiosPagosAutomaticos;
	public Boolean isPermisoConsultaPagosAutomaticos;
	public Boolean isPermisoBusquedaPagosAutomaticos;
	public Boolean isPermisoReportePagosAutomaticos;
	public Boolean isPermisoPaginacionMedioPagosAutomaticos;
	public Boolean isPermisoPaginacionAltoPagosAutomaticos;
	public Boolean isPermisoPaginacionTodoPagosAutomaticos;
	public Boolean isPermisoCopiarPagosAutomaticos;
	public Boolean isPermisoVerFormPagosAutomaticos;
	public Boolean isPermisoDuplicarPagosAutomaticos;
	public Boolean isPermisoOrdenPagosAutomaticos;
	
	
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
	
	public PagosAutomaticosParameterReturnGeneral pagosautomaticosReturnGeneral;
	public PagosAutomaticosParameterReturnGeneral pagosautomaticosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPagosAutomaticos=false;
	public Boolean esParaAccionDesdeFormularioPagosAutomaticos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PagosAutomaticosSessionBeanAdditional pagosautomaticosSessionBeanAdditional=null;
	
	public PagosAutomaticosSessionBeanAdditional getPagosAutomaticosSessionBeanAdditional() {
		return this.pagosautomaticosSessionBeanAdditional;
	}
	
	public void setPagosAutomaticosSessionBeanAdditional(PagosAutomaticosSessionBeanAdditional pagosautomaticosSessionBeanAdditional) {
		try {
			this.pagosautomaticosSessionBeanAdditional=pagosautomaticosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PagosAutomaticosBeanSwingJInternalFrameAdditional pagosautomaticosBeanSwingJInternalFrameAdditional=null;
	//public class PagosAutomaticosBeanSwingJInternalFrame
	
	public PagosAutomaticosBeanSwingJInternalFrameAdditional getPagosAutomaticosBeanSwingJInternalFrameAdditional() {
		return this.pagosautomaticosBeanSwingJInternalFrameAdditional;
	}
	
	public void setPagosAutomaticosBeanSwingJInternalFrameAdditional(PagosAutomaticosBeanSwingJInternalFrameAdditional pagosautomaticosBeanSwingJInternalFrameAdditional) {
		try {
			this.pagosautomaticosBeanSwingJInternalFrameAdditional=pagosautomaticosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PagosAutomaticosLogic pagosautomaticosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PagosAutomaticos pagosautomaticosBean;
	public PagosAutomaticosConstantesFunciones pagosautomaticosConstantesFunciones;
	//public PagosAutomaticosParameterReturnGeneral pagosautomaticosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<PagosAutomaticos> pagosautomaticoss;	
	//public List<PagosAutomaticos> pagosautomaticossEliminados;
	//public List<PagosAutomaticos> pagosautomaticossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPagosAutomaticos=false;
	public Boolean isVisibilidadCeldaDuplicarPagosAutomaticos=true;
	public Boolean isVisibilidadCeldaCopiarPagosAutomaticos=true;
	public Boolean isVisibilidadCeldaVerFormPagosAutomaticos=true;
	public Boolean isVisibilidadCeldaOrdenPagosAutomaticos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPagosAutomaticos=false;
	public Boolean isVisibilidadCeldaModificarPagosAutomaticos=false;
	public Boolean isVisibilidadCeldaActualizarPagosAutomaticos=false;
	public Boolean isVisibilidadCeldaEliminarPagosAutomaticos=false;
	public Boolean isVisibilidadCeldaCancelarPagosAutomaticos=false;
	public Boolean isVisibilidadCeldaGuardarPagosAutomaticos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPagosAutomaticos=false;	
	
	
	public Boolean isVisibilidadBusquedaPagosAutomaticos=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoPagosAutomaticos() {
		return this.iIdNuevoPagosAutomaticos;
	}

	public void setiIdNuevoPagosAutomaticos(Long iIdNuevoPagosAutomaticos) {
		this.iIdNuevoPagosAutomaticos = iIdNuevoPagosAutomaticos;
	}
	
	public Long getidPagosAutomaticosActual() {
		return this.idPagosAutomaticosActual;
	}

	public void setidPagosAutomaticosActual(Long idPagosAutomaticosActual) {
		this.idPagosAutomaticosActual = idPagosAutomaticosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PagosAutomaticos getpagosautomaticos() {
		return this.pagosautomaticos;
	}

	public void setpagosautomaticos(PagosAutomaticos pagosautomaticos) {
		this.pagosautomaticos = pagosautomaticos;
	}
	
	public PagosAutomaticos getpagosautomaticosAux() {
		return this.pagosautomaticosAux;
	}

	public void setpagosautomaticosAux(PagosAutomaticos pagosautomaticosAux) {
		this.pagosautomaticosAux = pagosautomaticosAux;
	}				
	
	public PagosAutomaticos getpagosautomaticosAnterior() {
		return this.pagosautomaticosAnterior;
	}

	public void setpagosautomaticosAnterior(PagosAutomaticos pagosautomaticosAnterior) {
		this.pagosautomaticosAnterior = pagosautomaticosAnterior;
	}	
	
	public PagosAutomaticos getpagosautomaticosTotales() {
		return this.pagosautomaticosTotales;
	}

	public void setpagosautomaticosTotales(PagosAutomaticos pagosautomaticosTotales) {
		this.pagosautomaticosTotales = pagosautomaticosTotales;
	}	
	
	public PagosAutomaticos getpagosautomaticosBean() {
		return this.pagosautomaticosBean;
	}

	public void setpagosautomaticosBean(PagosAutomaticos pagosautomaticosBean) {
		this.pagosautomaticosBean = pagosautomaticosBean;
	}	
	
	public PagosAutomaticosParameterReturnGeneral getpagosautomaticosReturnGeneral() {
		return this.pagosautomaticosReturnGeneral;
	}

	public void setpagosautomaticosReturnGeneral(PagosAutomaticosParameterReturnGeneral pagosautomaticosReturnGeneral) {
		this.pagosautomaticosReturnGeneral = pagosautomaticosReturnGeneral;
	}	
	
	
	public Date fecha_corteBusquedaPagosAutomaticos=new Date();

	public Date getfecha_corteBusquedaPagosAutomaticos() {
		return this.fecha_corteBusquedaPagosAutomaticos;
	}

	public void setfecha_corteBusquedaPagosAutomaticos(Date fecha_corteBusquedaPagosAutomaticos) {
		this.fecha_corteBusquedaPagosAutomaticos = fecha_corteBusquedaPagosAutomaticos;
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
	
	
	public PagosAutomaticosLogic getPagosAutomaticosLogic()	{		
		return pagosautomaticosLogic;
	}

	public void setPagosAutomaticosLogic(PagosAutomaticosLogic pagosautomaticosLogic) {
		this.pagosautomaticosLogic = pagosautomaticosLogic;
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
	
	public Boolean getIsEsNuevoPagosAutomaticos() {
		return isEsNuevoPagosAutomaticos;
	}

	public void setIsEsNuevoPagosAutomaticos(Boolean isEsNuevoPagosAutomaticos) {
		this.isEsNuevoPagosAutomaticos = isEsNuevoPagosAutomaticos;
	}

	public Boolean getEsParaAccionDesdeFormularioPagosAutomaticos() {
		return esParaAccionDesdeFormularioPagosAutomaticos;
	}
	
	public void setEsParaAccionDesdeFormularioPagosAutomaticos(Boolean esParaAccionDesdeFormularioPagosAutomaticos) {
		this.esParaAccionDesdeFormularioPagosAutomaticos = esParaAccionDesdeFormularioPagosAutomaticos;
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

			if(this.pagosautomaticosSessionBean==null) {
				this.pagosautomaticosSessionBean=new PagosAutomaticosSessionBean();
			}

			if(!this.pagosautomaticosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(pagosautomaticosSessionBean.getlidEmpresaActual());
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

					if(this.pagosautomaticos!=null) {
						this.pagosautomaticos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) {
						this.jInternalFrameDetalleFormPagosAutomaticos.jComboBoxid_empresaPagosAutomaticos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPagosAutomaticos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) {
						if(this.jInternalFrameDetalleFormPagosAutomaticos.jComboBoxid_empresaPagosAutomaticos.getItemCount()>0) {
							this.jInternalFrameDetalleFormPagosAutomaticos.jComboBoxid_empresaPagosAutomaticos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPagosAutomaticosGenerico)throws Exception
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
				jComboBoxid_empresaPagosAutomaticosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPagosAutomaticosGenerico!=null && jComboBoxid_empresaPagosAutomaticosGenerico.getItemCount()>0) {
					jComboBoxid_empresaPagosAutomaticosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(PagosAutomaticos pagosautomaticos,JComboBox jComboBoxid_empresaPagosAutomaticosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPagosAutomaticosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPagosAutomaticos.jComboBoxid_empresaPagosAutomaticos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPagosAutomaticosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				pagosautomaticos.setid_empresa(empresaAux.getId());
				pagosautomaticos.setempresa_descripcion(PagosAutomaticosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				pagosautomaticos.setEmpresa(empresaAux);			}
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

					if(!PagosAutomaticosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) { 
							this.jInternalFrameDetalleFormPagosAutomaticos.jComboBoxid_empresaPagosAutomaticos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPagosAutomaticos.jComboBoxid_empresaPagosAutomaticos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) { 
					}

					if(!PagosAutomaticosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) {
							this.jInternalFrameDetalleFormPagosAutomaticos.jComboBoxid_empresaPagosAutomaticos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) {
							this.jInternalFrameDetalleFormPagosAutomaticos.jComboBoxid_empresaPagosAutomaticos.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesPagosAutomaticos() throws Exception {
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
		
	public PagosAutomaticosParameterReturnGeneral getPagosAutomaticosParameterGeneral() {
		return this.pagosautomaticosParameterGeneral;
	}
	
	public void setPagosAutomaticosParameterGeneral(PagosAutomaticosParameterReturnGeneral pagosautomaticosParameterGeneral) {
		this.pagosautomaticosParameterGeneral = pagosautomaticosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPagosAutomaticos() {
		return isPermisoTodoPagosAutomaticos;
	}

	public void setIsPermisoTodoPagosAutomaticos(Boolean isPermisoTodoPagosAutomaticos) {
		this.isPermisoTodoPagosAutomaticos = isPermisoTodoPagosAutomaticos;
	}

	public Boolean getIsPermisoNuevoPagosAutomaticos() {
		return isPermisoNuevoPagosAutomaticos;
	}

	public void setIsPermisoNuevoPagosAutomaticos(Boolean isPermisoNuevoPagosAutomaticos) {
		this.isPermisoNuevoPagosAutomaticos = isPermisoNuevoPagosAutomaticos;
	}

	public Boolean getIsPermisoActualizarPagosAutomaticos() {
		return isPermisoActualizarPagosAutomaticos;
	}

	public void setIsPermisoActualizarPagosAutomaticos(Boolean isPermisoActualizarPagosAutomaticos) {
		this.isPermisoActualizarPagosAutomaticos = isPermisoActualizarPagosAutomaticos;
	}

	public Boolean getIsPermisoEliminarPagosAutomaticos() {
		return isPermisoEliminarPagosAutomaticos;
	}

	public void setIsPermisoEliminarPagosAutomaticos(Boolean isPermisoEliminarPagosAutomaticos) {
		this.isPermisoEliminarPagosAutomaticos = isPermisoEliminarPagosAutomaticos;
	}

	public Boolean getIsPermisoGuardarCambiosPagosAutomaticos() {
		return isPermisoGuardarCambiosPagosAutomaticos;
	}

	public void setIsPermisoGuardarCambiosPagosAutomaticos(Boolean isPermisoGuardarCambiosPagosAutomaticos) {
		this.isPermisoGuardarCambiosPagosAutomaticos = isPermisoGuardarCambiosPagosAutomaticos;
	}
	
	public Boolean getIsPermisoConsultaPagosAutomaticos() {
		return isPermisoConsultaPagosAutomaticos;
	}

	public void setIsPermisoConsultaPagosAutomaticos(Boolean isPermisoConsultaPagosAutomaticos) {
		this.isPermisoConsultaPagosAutomaticos = isPermisoConsultaPagosAutomaticos;
	}

	public Boolean getIsPermisoBusquedaPagosAutomaticos() {
		return isPermisoBusquedaPagosAutomaticos;
	}

	public void setIsPermisoBusquedaPagosAutomaticos(Boolean isPermisoBusquedaPagosAutomaticos) {
		this.isPermisoBusquedaPagosAutomaticos = isPermisoBusquedaPagosAutomaticos;
	}

	public Boolean getIsPermisoReportePagosAutomaticos() {
		return isPermisoReportePagosAutomaticos;
	}

	public void setIsPermisoReportePagosAutomaticos(Boolean isPermisoReportePagosAutomaticos) {
		this.isPermisoReportePagosAutomaticos = isPermisoReportePagosAutomaticos;
	}
	
	public Boolean getIsPermisoPaginacionMedioPagosAutomaticos() {
		return isPermisoPaginacionMedioPagosAutomaticos;
	}

	public void setIsPermisoPaginacionMedioPagosAutomaticos(Boolean isPermisoPaginacionMedioPagosAutomaticos) {
		this.isPermisoPaginacionMedioPagosAutomaticos = isPermisoPaginacionMedioPagosAutomaticos;
	}
	
	public Boolean getIsPermisoPaginacionTodoPagosAutomaticos() {
		return isPermisoPaginacionTodoPagosAutomaticos;
	}

	public void setIsPermisoPaginacionTodoPagosAutomaticos(Boolean isPermisoPaginacionTodoPagosAutomaticos) {
		this.isPermisoPaginacionTodoPagosAutomaticos = isPermisoPaginacionTodoPagosAutomaticos;
	}
	
	public Boolean getIsPermisoPaginacionAltoPagosAutomaticos() {
		return isPermisoPaginacionAltoPagosAutomaticos;
	}

	public void setIsPermisoPaginacionAltoPagosAutomaticos(Boolean isPermisoPaginacionAltoPagosAutomaticos) {
		this.isPermisoPaginacionAltoPagosAutomaticos = isPermisoPaginacionAltoPagosAutomaticos;
	}
	
	public Boolean getIsPermisoCopiarPagosAutomaticos() {
		return isPermisoCopiarPagosAutomaticos;
	}

	public void setIsPermisoCopiarPagosAutomaticos(Boolean isPermisoCopiarPagosAutomaticos) {
		this.isPermisoCopiarPagosAutomaticos = isPermisoCopiarPagosAutomaticos;
	}
	
	public Boolean getIsPermisoVerFormPagosAutomaticos() {
		return isPermisoVerFormPagosAutomaticos;
	}

	public void setIsPermisoVerFormPagosAutomaticos(Boolean isPermisoVerFormPagosAutomaticos) {
		this.isPermisoVerFormPagosAutomaticos = isPermisoVerFormPagosAutomaticos;
	}
	
	public Boolean getIsPermisoDuplicarPagosAutomaticos() {
		return isPermisoDuplicarPagosAutomaticos;
	}

	public void setIsPermisoDuplicarPagosAutomaticos(Boolean isPermisoDuplicarPagosAutomaticos) {
		this.isPermisoDuplicarPagosAutomaticos = isPermisoDuplicarPagosAutomaticos;
	}
	
	public Boolean getIsPermisoOrdenPagosAutomaticos() {
		return isPermisoOrdenPagosAutomaticos;
	}

	public void setIsPermisoOrdenPagosAutomaticos(Boolean isPermisoOrdenPagosAutomaticos) {
		this.isPermisoOrdenPagosAutomaticos = isPermisoOrdenPagosAutomaticos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPagosAutomaticos() {
		return isVisibilidadCeldaNuevoPagosAutomaticos;
	}

	public void setIsVisibilidadCeldaNuevoPagosAutomaticos(Boolean isVisibilidadCeldaNuevoPagosAutomaticos) {
		this.isVisibilidadCeldaNuevoPagosAutomaticos = isVisibilidadCeldaNuevoPagosAutomaticos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPagosAutomaticos() {
		return isVisibilidadCeldaDuplicarPagosAutomaticos;
	}

	public void setIsVisibilidadCeldaDuplicarPagosAutomaticos(Boolean isVisibilidadCeldaDuplicarPagosAutomaticos) {
		this.isVisibilidadCeldaDuplicarPagosAutomaticos = isVisibilidadCeldaDuplicarPagosAutomaticos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPagosAutomaticos() {
		return isVisibilidadCeldaCopiarPagosAutomaticos;
	}

	public void setIsVisibilidadCeldaCopiarPagosAutomaticos(Boolean isVisibilidadCeldaCopiarPagosAutomaticos) {
		this.isVisibilidadCeldaCopiarPagosAutomaticos = isVisibilidadCeldaCopiarPagosAutomaticos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPagosAutomaticos() {
		return isVisibilidadCeldaVerFormPagosAutomaticos;
	}

	public void setIsVisibilidadCeldaVerFormPagosAutomaticos(Boolean isVisibilidadCeldaVerFormPagosAutomaticos) {
		this.isVisibilidadCeldaVerFormPagosAutomaticos = isVisibilidadCeldaVerFormPagosAutomaticos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPagosAutomaticos() {
		return isVisibilidadCeldaOrdenPagosAutomaticos;
	}

	public void setIsVisibilidadCeldaOrdenPagosAutomaticos(Boolean isVisibilidadCeldaOrdenPagosAutomaticos) {
		this.isVisibilidadCeldaOrdenPagosAutomaticos = isVisibilidadCeldaOrdenPagosAutomaticos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPagosAutomaticos() {
		return isVisibilidadCeldaNuevoRelacionesPagosAutomaticos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPagosAutomaticos(Boolean isVisibilidadCeldaNuevoRelacionesPagosAutomaticos) {
		this.isVisibilidadCeldaNuevoRelacionesPagosAutomaticos = isVisibilidadCeldaNuevoRelacionesPagosAutomaticos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPagosAutomaticos() {
		return isVisibilidadCeldaModificarPagosAutomaticos;
	}

	public void setIsVisibilidadCeldaModificarPagosAutomaticos(Boolean isVisibilidadCeldaModificarPagosAutomaticos) {
		this.isVisibilidadCeldaModificarPagosAutomaticos = isVisibilidadCeldaModificarPagosAutomaticos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPagosAutomaticos() {
		return isVisibilidadCeldaActualizarPagosAutomaticos;
	}

	public void setIsVisibilidadCeldaActualizarPagosAutomaticos(Boolean isVisibilidadCeldaActualizarPagosAutomaticos) {
		this.isVisibilidadCeldaActualizarPagosAutomaticos = isVisibilidadCeldaActualizarPagosAutomaticos;
	}

	public Boolean getIsVisibilidadCeldaEliminarPagosAutomaticos() {
		return isVisibilidadCeldaEliminarPagosAutomaticos;
	}

	public void setIsVisibilidadCeldaEliminarPagosAutomaticos(Boolean isVisibilidadCeldaEliminarPagosAutomaticos) {
		this.isVisibilidadCeldaEliminarPagosAutomaticos = isVisibilidadCeldaEliminarPagosAutomaticos;
	}

	public Boolean getIsVisibilidadCeldaCancelarPagosAutomaticos() {
		return isVisibilidadCeldaCancelarPagosAutomaticos;
	}

	public void setIsVisibilidadCeldaCancelarPagosAutomaticos(Boolean isVisibilidadCeldaCancelarPagosAutomaticos) {
		this.isVisibilidadCeldaCancelarPagosAutomaticos = isVisibilidadCeldaCancelarPagosAutomaticos;
	}

	public Boolean getIsVisibilidadCeldaGuardarPagosAutomaticos() {
		return isVisibilidadCeldaGuardarPagosAutomaticos;
	}

	public void setIsVisibilidadCeldaGuardarPagosAutomaticos(Boolean isVisibilidadCeldaGuardarPagosAutomaticos) {
		this.isVisibilidadCeldaGuardarPagosAutomaticos = isVisibilidadCeldaGuardarPagosAutomaticos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPagosAutomaticos() {
		return isVisibilidadCeldaGuardarCambiosPagosAutomaticos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPagosAutomaticos(Boolean isVisibilidadCeldaGuardarCambiosPagosAutomaticos) {
		this.isVisibilidadCeldaGuardarCambiosPagosAutomaticos = isVisibilidadCeldaGuardarCambiosPagosAutomaticos;
	}
		
	public PagosAutomaticosSessionBean getpagosautomaticosSessionBean() {
		return this.pagosautomaticosSessionBean;
	}
	
	public void setpagosautomaticosSessionBean(PagosAutomaticosSessionBean pagosautomaticosSessionBean) {
		this.pagosautomaticosSessionBean=pagosautomaticosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPagosAutomaticos() {
		return this.isVisibilidadBusquedaPagosAutomaticos;
	}

	public void setisVisibilidadBusquedaPagosAutomaticos(Boolean isVisibilidadBusquedaPagosAutomaticos) {
		this.isVisibilidadBusquedaPagosAutomaticos=isVisibilidadBusquedaPagosAutomaticos;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(PagosAutomaticos pagosautomaticos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(pagosautomaticos,null);
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
	
	public void bugActualizarReferenciaActual(PagosAutomaticos pagosautomaticos,PagosAutomaticos pagosautomaticosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPagosAutomaticos(pagosautomaticos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		pagosautomaticosAux.setId(pagosautomaticos.getId());
		pagosautomaticosAux.setVersionRow(pagosautomaticos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(PagosAutomaticos pagosautomaticosLocal) throws Exception {
		
		if(this.pagosautomaticosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PagosAutomaticos pagosautomaticosLocal) throws Exception {	
		if(this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				pagosautomaticosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPagosAutomaticosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = pagosautomaticosValidator.getInvalidValues(this.pagosautomaticos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PagosAutomaticos pagosautomaticos,List<PagosAutomaticos> pagosautomaticoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(PagosAutomaticos pagosautomaticos,List<PagosAutomaticos> pagosautomaticoss) throws Exception {
		try	{			
			PagosAutomaticosConstantesFunciones.actualizarSelectedLista(pagosautomaticos,pagosautomaticoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PagosAutomaticos> pagosautomaticossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				pagosautomaticossLocal=this.pagosautomaticosLogic.getPagosAutomaticoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				pagosautomaticossLocal=this.pagosautomaticoss;
			}
			//ARCHITECTURE
		
			for(PagosAutomaticos pagosautomaticosLocal:pagosautomaticossLocal) {
				if(this.permiteMantenimiento(pagosautomaticosLocal) && pagosautomaticosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PagosAutomaticosConstantesFunciones.getPagosAutomaticosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PagosAutomaticosConstantesFunciones.NOMBRECLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelnombre_clientePagosAutomaticos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutomaticosConstantesFunciones.NUMEROFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelnumero_facturaPagosAutomaticos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutomaticosConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelfecha_emisionPagosAutomaticos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutomaticosConstantesFunciones.FECHAVENCIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelfecha_vencimientoPagosAutomaticos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutomaticosConstantesFunciones.NOMBREBANCO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelnombre_bancoPagosAutomaticos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutomaticosConstantesFunciones.VALORPORPAGAR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelvalor_por_pagarPagosAutomaticos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutomaticosConstantesFunciones.VALORCANCELADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelvalor_canceladoPagosAutomaticos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutomaticosConstantesFunciones.NUMEROCUENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelnumero_cuentaPagosAutomaticos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutomaticosConstantesFunciones.ESTAAUTORIZADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelesta_autorizadoPagosAutomaticos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutomaticosConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutomaticos.jLabeldescripcionPagosAutomaticos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutomaticosConstantesFunciones.FECHACORTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelfecha_corte_datoPagosAutomaticos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutomaticosConstantesFunciones.ESTADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelestadoPagosAutomaticos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutomaticosConstantesFunciones.CODIGOCUENTACONCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelcodigo_cuenta_con_clientePagosAutomaticos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PagosAutomaticosConstantesFunciones.CODIGOCUENTACONBANCO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelcodigo_cuenta_con_bancoPagosAutomaticos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelnombre_clientePagosAutomaticos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelnumero_facturaPagosAutomaticos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelfecha_emisionPagosAutomaticos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelfecha_vencimientoPagosAutomaticos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelnombre_bancoPagosAutomaticos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelvalor_por_pagarPagosAutomaticos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelvalor_canceladoPagosAutomaticos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelnumero_cuentaPagosAutomaticos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelesta_autorizadoPagosAutomaticos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutomaticos.jLabeldescripcionPagosAutomaticos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelfecha_corte_datoPagosAutomaticos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelestadoPagosAutomaticos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelcodigo_cuenta_con_clientePagosAutomaticos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelcodigo_cuenta_con_bancoPagosAutomaticos,"");
		
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
		this.iIdNuevoPagosAutomaticos--;	
		
		
		this.pagosautomaticosAux=new PagosAutomaticos();
		
		this.pagosautomaticosAux.setId(this.iIdNuevoPagosAutomaticos);
		this.pagosautomaticosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.pagosautomaticosLogic.getPagosAutomaticoss().add(this.pagosautomaticosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.pagosautomaticoss.add(this.pagosautomaticosAux);
		}
		//ARCHITECTURE
		
		this.pagosautomaticos=this.pagosautomaticosAux;
		
		if(PagosAutomaticosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPagosAutomaticos(this.pagosautomaticos);
			this.setVariablesObjetoActualToFormularioForeignKeyPagosAutomaticos(this.pagosautomaticos);
		}
				
		//this.setDefaultControlesPagosAutomaticos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPagosAutomaticos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPagosAutomaticos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPagosAutomaticos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPagosAutomaticos(this.pagosautomaticosBean,this.pagosautomaticos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPagosAutomaticos(this.pagosautomaticosReturnGeneral,this.pagosautomaticosBean,false);
		
		if(this.pagosautomaticosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPagosAutomaticos(this.pagosautomaticosReturnGeneral.getPagosAutomaticos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPagosAutomaticos(this.pagosautomaticosReturnGeneral.getPagosAutomaticos());
		}
		
		if(this.pagosautomaticosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPagosAutomaticos(this.pagosautomaticosReturnGeneral.getPagosAutomaticos(),classes);//this.pagosautomaticosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.pagosautomaticos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPagosAutomaticos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPagosAutomaticos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PagosAutomaticosBeanSwingJInternalFrameAdditional.RecargarFormPagosAutomaticos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPagosAutomaticos(false);
						
			if(pagosautomaticosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PagosAutomaticosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPagosAutomaticos();
			}
			
			this.actualizarVisualTableDatosPagosAutomaticos();
			
			this.jTableDatosPagosAutomaticos.setRowSelectionInterval(this.getIndiceNuevoPagosAutomaticos(), this.getIndiceNuevoPagosAutomaticos());
			
			this.seleccionarFilaTablaPagosAutomaticosActual();
						
			this.actualizarEstadoCeldasBotonesPagosAutomaticos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPagosAutomaticos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPagosAutomaticos.jDateChooserfecha_cortePagosAutomaticos.setEnabled(isHabilitar && this.pagosautomaticosConstantesFunciones.activarfecha_cortePagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreanombre_clientePagosAutomaticos.setEnabled(isHabilitar && this.pagosautomaticosConstantesFunciones.activarnombre_clientePagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldnumero_facturaPagosAutomaticos.setEnabled(isHabilitar && this.pagosautomaticosConstantesFunciones.activarnumero_facturaPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jDateChooserfecha_emisionPagosAutomaticos.setEnabled(isHabilitar && this.pagosautomaticosConstantesFunciones.activarfecha_emisionPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jDateChooserfecha_vencimientoPagosAutomaticos.setEnabled(isHabilitar && this.pagosautomaticosConstantesFunciones.activarfecha_vencimientoPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreanombre_bancoPagosAutomaticos.setEnabled(isHabilitar && this.pagosautomaticosConstantesFunciones.activarnombre_bancoPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldvalor_por_pagarPagosAutomaticos.setEnabled(isHabilitar && this.pagosautomaticosConstantesFunciones.activarvalor_por_pagarPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldvalor_canceladoPagosAutomaticos.setEnabled(isHabilitar && this.pagosautomaticosConstantesFunciones.activarvalor_canceladoPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldnumero_cuentaPagosAutomaticos.setEnabled(isHabilitar && this.pagosautomaticosConstantesFunciones.activarnumero_cuentaPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jCheckBoxesta_autorizadoPagosAutomaticos.setEnabled(isHabilitar && this.pagosautomaticosConstantesFunciones.activaresta_autorizadoPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreadescripcionPagosAutomaticos.setEnabled(isHabilitar && this.pagosautomaticosConstantesFunciones.activardescripcionPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jDateChooserfecha_corte_datoPagosAutomaticos.setEnabled(isHabilitar && this.pagosautomaticosConstantesFunciones.activarfecha_corte_datoPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreaestadoPagosAutomaticos.setEnabled(isHabilitar && this.pagosautomaticosConstantesFunciones.activarestadoPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldcodigo_cuenta_con_clientePagosAutomaticos.setEnabled(isHabilitar && this.pagosautomaticosConstantesFunciones.activarcodigo_cuenta_con_clientePagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldcodigo_cuenta_con_bancoPagosAutomaticos.setEnabled(isHabilitar && this.pagosautomaticosConstantesFunciones.activarcodigo_cuenta_con_bancoPagosAutomaticos);	
		//
		this.jInternalFrameDetalleFormPagosAutomaticos.jComboBoxid_empresaPagosAutomaticos.setEnabled(isHabilitar && this.pagosautomaticosConstantesFunciones.activarid_empresaPagosAutomaticos);
	};
	
	public void setDefaultControlesPagosAutomaticos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPagosAutomaticos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.pagosautomaticosSessionBean.setConGuardarRelaciones(true);			
			this.pagosautomaticosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPagosAutomaticos.jTabbedPaneRelacionesPagosAutomaticos.setVisible(true);
			
					
		} else {
			//this.pagosautomaticosSessionBean.setConGuardarRelaciones(false);			
			this.pagosautomaticosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPagosAutomaticos.jTabbedPaneRelacionesPagosAutomaticos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPagosAutomaticos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PagosAutomaticos pagosautomaticosAux:this.pagosautomaticosLogic.getPagosAutomaticoss()) {
				if(pagosautomaticosAux.getId().equals(this.iIdNuevoPagosAutomaticos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PagosAutomaticos pagosautomaticosAux:this.pagosautomaticoss) {
				if(pagosautomaticosAux.getId().equals(this.iIdNuevoPagosAutomaticos)) {
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
	
	public int getIndiceActualPagosAutomaticos(PagosAutomaticos pagosautomaticos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PagosAutomaticos pagosautomaticosAux:this.pagosautomaticosLogic.getPagosAutomaticoss()) {
				if(pagosautomaticosAux.getId().equals(pagosautomaticos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PagosAutomaticos pagosautomaticosAux:this.pagosautomaticoss) {
				if(pagosautomaticosAux.getId().equals(pagosautomaticos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPagosAutomaticos(PagosAutomaticos pagosautomaticosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PagosAutomaticos pagosautomaticosAux:this.pagosautomaticosLogic.getPagosAutomaticoss()) {
				if(pagosautomaticosAux.getPagosAutomaticosOriginal().getId().equals(pagosautomaticosOriginal.getId())) {
					existe=true;
					pagosautomaticosOriginal.setId(pagosautomaticosAux.getId());
					pagosautomaticosOriginal.setVersionRow(pagosautomaticosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PagosAutomaticos pagosautomaticosAux:this.pagosautomaticoss) {
				if(pagosautomaticosAux.getPagosAutomaticosOriginal().getId().equals(pagosautomaticosOriginal.getId())) {
					existe=true;
					pagosautomaticosOriginal.setId(pagosautomaticosAux.getId());
					pagosautomaticosOriginal.setVersionRow(pagosautomaticosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPagosAutomaticos(Boolean esParaCancelar) throws Exception {
		pagosautomaticossAux=new ArrayList<PagosAutomaticos>();
		pagosautomaticosAux=new PagosAutomaticos();
		
		if(!this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PagosAutomaticos pagosautomaticosAux:this.pagosautomaticosLogic.getPagosAutomaticoss()) {
					if(pagosautomaticosAux.getId()<0) {
						pagosautomaticossAux.add(pagosautomaticosAux);
					}		
				}
				this.iIdNuevoPagosAutomaticos=0L;
				this.pagosautomaticosLogic.getPagosAutomaticoss().removeAll(pagosautomaticossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PagosAutomaticos pagosautomaticosAux:this.pagosautomaticoss) {
					if(pagosautomaticosAux.getId()<0) {
						pagosautomaticossAux.add(pagosautomaticosAux);
					}		
				}
				this.iIdNuevoPagosAutomaticos=0L;
				this.pagosautomaticoss.removeAll(pagosautomaticossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPagosAutomaticos 
					&& this.pagosautomaticosLogic.getPagosAutomaticoss().size()>0
					) {
					pagosautomaticosAux=this.pagosautomaticosLogic.getPagosAutomaticoss().get(this.pagosautomaticosLogic.getPagosAutomaticoss().size() - 1);
				
					if(pagosautomaticosAux.getId()<0) {
						this.pagosautomaticosLogic.getPagosAutomaticoss().remove(pagosautomaticosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPagosAutomaticos && this.pagosautomaticoss.size()>0) {
					pagosautomaticosAux=this.pagosautomaticoss.get(this.pagosautomaticoss.size() - 1);
				
					if(pagosautomaticosAux.getId()<0) {
						this.pagosautomaticoss.remove(pagosautomaticosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPagosAutomaticos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(pagosautomaticos.getId()<0) {
				this.pagosautomaticosLogic.getPagosAutomaticoss().remove(this.pagosautomaticos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(pagosautomaticos.getId()<0) {
				this.pagosautomaticoss.remove(this.pagosautomaticos);
			}
		}			
	}
	
	public void setEstadosInicialesPagosAutomaticos(List<PagosAutomaticos> pagosautomaticossAux) throws Exception {
		PagosAutomaticosConstantesFunciones.setEstadosInicialesPagosAutomaticos(pagosautomaticossAux);
	}
	
	public void setEstadosInicialesPagosAutomaticos(PagosAutomaticos pagosautomaticosAux) throws Exception {
		PagosAutomaticosConstantesFunciones.setEstadosInicialesPagosAutomaticos(pagosautomaticosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPagosAutomaticosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPagosAutomaticos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPagosAutomaticosActual()) {
				if(!this.isEsNuevoPagosAutomaticos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPagosAutomaticos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPagosAutomaticos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPagosAutomaticosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Pagos Automaticos ?", "MANTENIMIENTO DE Pagos Automaticos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPagosAutomaticos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PagosAutomaticos pagosautomaticos) throws Exception {
		PagosAutomaticosConstantesFunciones.seleccionarAsignar(this.pagosautomaticos,pagosautomaticos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPagosAutomaticos=this.isPermisoActualizarOriginalPagosAutomaticos;
			
			
			this.seleccionarAsignar(pagosautomaticos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesPagosAutomaticos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.pagosautomaticosSessionBean.setsFuncionBusquedaRapida(this.pagosautomaticosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPagosAutomaticos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPagosAutomaticos(esParaCancelar);				
				this.cancelarNuevoPagosAutomaticos(esParaCancelar);								
			}
			
			this.pagosautomaticos=new PagosAutomaticos();
			
			this.inicializarPagosAutomaticos();
			
			this.actualizarEstadoCeldasBotonesPagosAutomaticos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPagosAutomaticos() throws Exception {
		try {
			PagosAutomaticosConstantesFunciones.inicializarPagosAutomaticos(this.pagosautomaticos);
			
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
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.pagosautomaticosLogic.getPagosAutomaticoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePagosAutomaticoss(String sAccionBusqueda,List<PagosAutomaticos> pagosautomaticossParaReportes) throws Exception {
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
					sPathReporteFinal="PagosAutomaticos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PagosAutomaticosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PagosAutomaticosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PagosAutomaticos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Pagos Automaticoses");		
		parameters.put("busquedapor", PagosAutomaticosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePagosAutomaticos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PagosAutomaticosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PagosAutomaticosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePagosAutomaticos=new JRBeanArrayDataSource(PagosAutomaticosJInternalFrame.TraerPagosAutomaticosBeans(pagosautomaticossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePagosAutomaticos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PagosAutomaticosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PagosAutomaticosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PagosAutomaticosBean.TraerPagosAutomaticosBeans(pagosautomaticossParaReportes).toArray()));
							
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
				this.generarExcelReportePagosAutomaticoss(sAccionBusqueda,sTipoArchivoReporte,pagosautomaticossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPagosAutomaticoss(sAccionBusqueda,sTipoArchivoReporte,pagosautomaticossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPagosAutomaticosActionPerformed(null);
					//this.generarExcelReportePagosAutomaticoss(sAccionBusqueda,sTipoArchivoReporte,pagosautomaticossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPagosAutomaticoss(sAccionBusqueda,sTipoArchivoReporte,pagosautomaticossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPagosAutomaticoss(sAccionBusqueda,sTipoArchivoReporte,pagosautomaticossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPagosAutomaticoss(sAccionBusqueda,sTipoArchivoReporte,pagosautomaticossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePagosAutomaticoss(String sAccionBusqueda,String sTipoArchivoReporte,List<PagosAutomaticos> pagosautomaticossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pagosautomaticos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PagosAutomaticoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPagosAutomaticos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PagosAutomaticos pagosautomaticos : pagosautomaticossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PagosAutomaticosConstantesFunciones.generarExcelReporteDataPagosAutomaticos("NORMAL",row,workbook,pagosautomaticos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Automaticos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPagosAutomaticos(String sTipo,Row row,Workbook workbook) {
		
		PagosAutomaticosConstantesFunciones.generarExcelReporteHeaderPagosAutomaticos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPagosAutomaticoss(String sAccionBusqueda,String sTipoArchivoReporte,List<PagosAutomaticos> pagosautomaticossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pagosautomaticos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PagosAutomaticoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PagosAutomaticos pagosautomaticos : pagosautomaticossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PagosAutomaticosConstantesFunciones.getPagosAutomaticosDescripcion(pagosautomaticos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutomaticosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautomaticos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutomaticosConstantesFunciones.LABEL_FECHACORTE0))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_FECHACORTE0);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautomaticos.getfecha_corte());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutomaticosConstantesFunciones.LABEL_NOMBRECLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_NOMBRECLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautomaticos.getnombre_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutomaticosConstantesFunciones.LABEL_NUMEROFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_NUMEROFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautomaticos.getnumero_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutomaticosConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautomaticos.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutomaticosConstantesFunciones.LABEL_FECHAVENCIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_FECHAVENCIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautomaticos.getfecha_vencimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutomaticosConstantesFunciones.LABEL_NOMBREBANCO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_NOMBREBANCO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautomaticos.getnombre_banco());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutomaticosConstantesFunciones.LABEL_VALORPORPAGAR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_VALORPORPAGAR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautomaticos.getvalor_por_pagar());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutomaticosConstantesFunciones.LABEL_VALORCANCELADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_VALORCANCELADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautomaticos.getvalor_cancelado());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutomaticosConstantesFunciones.LABEL_NUMEROCUENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_NUMEROCUENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautomaticos.getnumero_cuenta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutomaticosConstantesFunciones.LABEL_ESTAAUTORIZADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_ESTAAUTORIZADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(pagosautomaticos.getesta_autorizado()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutomaticosConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautomaticos.getdescripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutomaticosConstantesFunciones.LABEL_FECHACORTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_FECHACORTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautomaticos.getfecha_corte_dato());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutomaticosConstantesFunciones.LABEL_ESTADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_ESTADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautomaticos.getestado());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautomaticos.getcodigo_cuenta_con_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pagosautomaticos.getcodigo_cuenta_con_banco());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Automaticos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPagosAutomaticoss(String sAccionBusqueda,String sTipoArchivoReporte,List<PagosAutomaticos> pagosautomaticossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PagosAutomaticos> pagosautomaticossRespaldo=null;
		
		classes=PagosAutomaticosConstantesFunciones.getClassesRelationshipsOfPagosAutomaticos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.pagosautomaticosLogic.setDatosCliente(this.datosCliente);
		this.pagosautomaticosLogic.setDatosDeep(this.datosDeep);
		this.pagosautomaticosLogic.setIsConDeep(true);
		
		pagosautomaticossRespaldo=this.pagosautomaticosLogic.getPagosAutomaticoss();
		
		this.pagosautomaticosLogic.setPagosAutomaticoss(pagosautomaticossParaReportes);	
		this.pagosautomaticosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		pagosautomaticossParaReportes=this.pagosautomaticosLogic.getPagosAutomaticoss();
		this.pagosautomaticosLogic.setPagosAutomaticoss(pagosautomaticossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pagosautomaticos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PagosAutomaticoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPagosAutomaticos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PagosAutomaticos pagosautomaticos : pagosautomaticossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPagosAutomaticos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PagosAutomaticosConstantesFunciones.generarExcelReporteDataPagosAutomaticos("NORMAL",row,workbook,pagosautomaticos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PagosAutomaticosConstantesFunciones.getPagosAutomaticosDescripcion(pagosautomaticos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Automaticos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPagosAutomaticos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPagosAutomaticos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPagosAutomaticos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPagosAutomaticos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPagosAutomaticos() throws Exception {		
		this.startProcessPagosAutomaticos(true);
	}
	
	public void startProcessPagosAutomaticos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPagosAutomaticos ,this.jPanelParametrosReportesPagosAutomaticos, this.jScrollPanelDatosPagosAutomaticos,this.jPanelPaginacionPagosAutomaticos, this.jScrollPanelDatosEdicionPagosAutomaticos, this.jPanelAccionesPagosAutomaticos,this.jPanelAccionesFormularioPagosAutomaticos,this.jmenuBarPagosAutomaticos,this.jmenuBarDetallePagosAutomaticos,this.jTtoolBarPagosAutomaticos,this.jTtoolBarDetallePagosAutomaticos);		
		
		final JTabbedPane jTabbedPaneBusquedasPagosAutomaticos=this.jTabbedPaneBusquedasPagosAutomaticos; 
		
		final JPanel jPanelParametrosReportesPagosAutomaticos=this.jPanelParametrosReportesPagosAutomaticos;
		//final JScrollPane jScrollPanelDatosPagosAutomaticos=this.jScrollPanelDatosPagosAutomaticos;
		final JTable jTableDatosPagosAutomaticos=this.jTableDatosPagosAutomaticos;		
		final JPanel jPanelPaginacionPagosAutomaticos=this.jPanelPaginacionPagosAutomaticos;
		//final JScrollPane jScrollPanelDatosEdicionPagosAutomaticos=this.jScrollPanelDatosEdicionPagosAutomaticos;
		final JPanel jPanelAccionesPagosAutomaticos=this.jPanelAccionesPagosAutomaticos;
		
		JPanel jPanelCamposAuxiliarPagosAutomaticos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPagosAutomaticos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) {
			jPanelCamposAuxiliarPagosAutomaticos=this.jInternalFrameDetalleFormPagosAutomaticos.jPanelCamposPagosAutomaticos;
			jPanelAccionesFormularioAuxiliarPagosAutomaticos=this.jInternalFrameDetalleFormPagosAutomaticos.jPanelAccionesFormularioPagosAutomaticos;
		}
		
		final JPanel jPanelCamposPagosAutomaticos=jPanelCamposAuxiliarPagosAutomaticos;
		final JPanel jPanelAccionesFormularioPagosAutomaticos=jPanelAccionesFormularioAuxiliarPagosAutomaticos;
		
		
		final JMenuBar jmenuBarPagosAutomaticos=this.jmenuBarPagosAutomaticos;
		final JToolBar jTtoolBarPagosAutomaticos=this.jTtoolBarPagosAutomaticos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPagosAutomaticos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPagosAutomaticos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) {
			jmenuBarDetalleAuxiliarPagosAutomaticos=this.jInternalFrameDetalleFormPagosAutomaticos.jmenuBarDetallePagosAutomaticos;
			jTtoolBarDetalleAuxiliarPagosAutomaticos=this.jInternalFrameDetalleFormPagosAutomaticos.jTtoolBarDetallePagosAutomaticos;
		}
		
		final JMenuBar jmenuBarDetallePagosAutomaticos=jmenuBarDetalleAuxiliarPagosAutomaticos;
		final JToolBar jTtoolBarDetallePagosAutomaticos=jTtoolBarDetalleAuxiliarPagosAutomaticos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPagosAutomaticos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPagosAutomaticos;
			processRunnable.jTableDatos=jTableDatosPagosAutomaticos;
			processRunnable.jPanelCampos=jPanelCamposPagosAutomaticos;
			processRunnable.jPanelPaginacion=jPanelPaginacionPagosAutomaticos;
			processRunnable.jPanelAcciones=jPanelAccionesPagosAutomaticos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPagosAutomaticos;
			
			
			processRunnable.jmenuBar=jmenuBarPagosAutomaticos;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePagosAutomaticos;
			processRunnable.jTtoolBar=jTtoolBarPagosAutomaticos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePagosAutomaticos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPagosAutomaticos ,jPanelParametrosReportesPagosAutomaticos,jTableDatosPagosAutomaticos, /*jScrollPanelDatosPagosAutomaticos,*/jPanelCamposPagosAutomaticos,jPanelPaginacionPagosAutomaticos, /*jScrollPanelDatosEdicionPagosAutomaticos,*/ jPanelAccionesPagosAutomaticos,jPanelAccionesFormularioPagosAutomaticos,jmenuBarPagosAutomaticos,jmenuBarDetallePagosAutomaticos,jTtoolBarPagosAutomaticos,jTtoolBarDetallePagosAutomaticos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPagosAutomaticos ,jPanelParametrosReportesPagosAutomaticos, jScrollPanelDatosPagosAutomaticos,jPanelPaginacionPagosAutomaticos, jScrollPanelDatosEdicionPagosAutomaticos, jPanelAccionesPagosAutomaticos,jPanelAccionesFormularioPagosAutomaticos,jmenuBarPagosAutomaticos,jmenuBarDetallePagosAutomaticos,jTtoolBarPagosAutomaticos,jTtoolBarDetallePagosAutomaticos);
						
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
	
	public void finishProcessPagosAutomaticos() {// throws Exception 
		this.finishProcessPagosAutomaticos(true);
	}
	
	public void finishProcessPagosAutomaticos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPagosAutomaticos ,this.jPanelParametrosReportesPagosAutomaticos, this.jScrollPanelDatosPagosAutomaticos,this.jPanelPaginacionPagosAutomaticos, this.jScrollPanelDatosEdicionPagosAutomaticos, this.jPanelAccionesPagosAutomaticos,this.jPanelAccionesFormularioPagosAutomaticos,this.jmenuBarPagosAutomaticos,this.jmenuBarDetallePagosAutomaticos,this.jTtoolBarPagosAutomaticos,this.jTtoolBarDetallePagosAutomaticos);		
		
		final JTabbedPane jTabbedPaneBusquedasPagosAutomaticos=this.jTabbedPaneBusquedasPagosAutomaticos; 
		
		final JPanel jPanelParametrosReportesPagosAutomaticos=this.jPanelParametrosReportesPagosAutomaticos;
		//final JScrollPane jScrollPanelDatosPagosAutomaticos=this.jScrollPanelDatosPagosAutomaticos;
		final JTable jTableDatosPagosAutomaticos=this.jTableDatosPagosAutomaticos;		
		final JPanel jPanelPaginacionPagosAutomaticos=this.jPanelPaginacionPagosAutomaticos;
		//final JScrollPane jScrollPanelDatosEdicionPagosAutomaticos=this.jScrollPanelDatosEdicionPagosAutomaticos;
		final JPanel jPanelAccionesPagosAutomaticos=this.jPanelAccionesPagosAutomaticos;
		
		JPanel jPanelCamposAuxiliarPagosAutomaticos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPagosAutomaticos=new JPanel();
		
		if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) {
			jPanelCamposAuxiliarPagosAutomaticos=this.jInternalFrameDetalleFormPagosAutomaticos.jPanelCamposPagosAutomaticos;
			jPanelAccionesFormularioAuxiliarPagosAutomaticos=this.jInternalFrameDetalleFormPagosAutomaticos.jPanelAccionesFormularioPagosAutomaticos;
		}
		
		final JPanel jPanelCamposPagosAutomaticos=jPanelCamposAuxiliarPagosAutomaticos;
		final JPanel jPanelAccionesFormularioPagosAutomaticos=jPanelAccionesFormularioAuxiliarPagosAutomaticos;
		
		
		final JMenuBar jmenuBarPagosAutomaticos=this.jmenuBarPagosAutomaticos;		
		final JToolBar jTtoolBarPagosAutomaticos=this.jTtoolBarPagosAutomaticos;
				
		JMenuBar jmenuBarDetalleAuxiliarPagosAutomaticos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPagosAutomaticos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) {
			jmenuBarDetalleAuxiliarPagosAutomaticos=this.jInternalFrameDetalleFormPagosAutomaticos.jmenuBarDetallePagosAutomaticos;
			jTtoolBarDetalleAuxiliarPagosAutomaticos=this.jInternalFrameDetalleFormPagosAutomaticos.jTtoolBarDetallePagosAutomaticos;		
		}
		
		final JMenuBar jmenuBarDetallePagosAutomaticos=jmenuBarDetalleAuxiliarPagosAutomaticos;
		final JToolBar jTtoolBarDetallePagosAutomaticos=jTtoolBarDetalleAuxiliarPagosAutomaticos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPagosAutomaticos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPagosAutomaticos;
			processRunnable.jTableDatos=jTableDatosPagosAutomaticos;
			processRunnable.jPanelCampos=jPanelCamposPagosAutomaticos;
			processRunnable.jPanelPaginacion=jPanelPaginacionPagosAutomaticos;
			processRunnable.jPanelAcciones=jPanelAccionesPagosAutomaticos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPagosAutomaticos;
			
			
			processRunnable.jmenuBar=jmenuBarPagosAutomaticos;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePagosAutomaticos;
			processRunnable.jTtoolBar=jTtoolBarPagosAutomaticos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePagosAutomaticos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPagosAutomaticos ,jPanelParametrosReportesPagosAutomaticos, jTableDatosPagosAutomaticos,/*jScrollPanelDatosPagosAutomaticos,*/jPanelCamposPagosAutomaticos,jPanelPaginacionPagosAutomaticos, /*jScrollPanelDatosEdicionPagosAutomaticos,*/ jPanelAccionesPagosAutomaticos,jPanelAccionesFormularioPagosAutomaticos,jmenuBarPagosAutomaticos,jmenuBarDetallePagosAutomaticos,jTtoolBarPagosAutomaticos,jTtoolBarDetallePagosAutomaticos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPagosAutomaticos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPagosAutomaticos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPagosAutomaticos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPagosAutomaticos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPagosAutomaticos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePagosAutomaticos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPagosAutomaticos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPagosAutomaticos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePagosAutomaticos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.pagosautomaticosConstantesFunciones.getsFinalQueryPagosAutomaticos();
		String  finalQueryPaginacionTodos=this.pagosautomaticosConstantesFunciones.getsFinalQueryPagosAutomaticos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PagosAutomaticosConstantesFunciones.getArrayColumnasGlobalesNoPagosAutomaticos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PagosAutomaticosConstantesFunciones.getArrayColumnasGlobalesPagosAutomaticos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PagosAutomaticosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.pagosautomaticossEliminados= new ArrayList<PagosAutomaticos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPagosAutomaticos();
		
				///*PagosAutomaticosSessionBean*/this.pagosautomaticosSessionBean=new PagosAutomaticosSessionBean();
			
			if(this.pagosautomaticosSessionBean==null) {
				this.pagosautomaticosSessionBean=new PagosAutomaticosSessionBean();
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
					this.iNumeroPaginacion=PagosAutomaticosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PagosAutomaticosConstantesFunciones.getClassesForeignKeysOfPagosAutomaticos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/pagosautomaticos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			pagosautomaticossAux= new ArrayList<PagosAutomaticos>();
			
				
			pagosautomaticosLogic.setDatosCliente(this.datosCliente);
			pagosautomaticosLogic.setDatosDeep(this.datosDeep);
			pagosautomaticosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPagosAutomaticos")) {
				this.sDetalleReporte=PagosAutomaticosConstantesFunciones.getDetalleIndiceBusquedaPagosAutomaticos(fecha_corteBusquedaPagosAutomaticos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					pagosautomaticosLogic.getPagosAutomaticossBusquedaPagosAutomaticos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_corteBusquedaPagosAutomaticos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PagosAutomaticosConstantesFunciones.getDetalleIndiceBusquedaPagosAutomaticos(fecha_corteBusquedaPagosAutomaticos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PagosAutomaticosConstantesFunciones.getDetalleIndiceBusquedaPagosAutomaticos(fecha_corteBusquedaPagosAutomaticos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=pagosautomaticosLogic.getPagosAutomaticoss()==null||pagosautomaticosLogic.getPagosAutomaticoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=pagosautomaticoss==null|| pagosautomaticoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						pagosautomaticossAux=new ArrayList<PagosAutomaticos>();
						pagosautomaticossAux.addAll(pagosautomaticosLogic.getPagosAutomaticoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pagosautomaticossAux=new ArrayList<PagosAutomaticos>();
							pagosautomaticossAux.addAll(pagosautomaticoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							pagosautomaticosLogic.getPagosAutomaticossBusquedaPagosAutomaticos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_corteBusquedaPagosAutomaticos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PagosAutomaticosConstantesFunciones.getDetalleIndiceBusquedaPagosAutomaticos(fecha_corteBusquedaPagosAutomaticos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PagosAutomaticosConstantesFunciones.getDetalleIndiceBusquedaPagosAutomaticos(fecha_corteBusquedaPagosAutomaticos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePagosAutomaticoss("BusquedaPagosAutomaticos",pagosautomaticosLogic.getPagosAutomaticoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePagosAutomaticoss("BusquedaPagosAutomaticos",pagosautomaticoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						pagosautomaticosLogic.setPagosAutomaticoss(new ArrayList<PagosAutomaticos>());
						pagosautomaticosLogic.getPagosAutomaticoss().addAll(pagosautomaticossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pagosautomaticoss=new ArrayList<PagosAutomaticos>();
							pagosautomaticoss.addAll(pagosautomaticossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPagosAutomaticos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPagosAutomaticos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=pagosautomaticosLogic.getPagosAutomaticoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=pagosautomaticoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=pagosautomaticosLogic.getPagosAutomaticoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=pagosautomaticoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PagosAutomaticos pagosautomaticos) {
		Boolean permite=true;
		
		if(this.pagosautomaticos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PagosAutomaticosConstantesFunciones.getOrderByListaPagosAutomaticos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PagosAutomaticosConstantesFunciones.getOrderByListaPagosAutomaticos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PagosAutomaticos pagosautomaticos:pagosautomaticosLogic.getPagosAutomaticoss()) {
				if(pagosautomaticos.getsType().equals(Constantes2.S_TOTALES)) {
					pagosautomaticosTotales=pagosautomaticos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PagosAutomaticos pagosautomaticos:this.pagosautomaticoss) {
				if(pagosautomaticos.getsType().equals(Constantes2.S_TOTALES)) {
					pagosautomaticosTotales=pagosautomaticos;
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
			this.pagosautomaticosAux=new PagosAutomaticos();
			this.pagosautomaticosAux.setsType(Constantes2.S_TOTALES);
			this.pagosautomaticosAux.setIsNew(false);
			this.pagosautomaticosAux.setIsChanged(false);
			this.pagosautomaticosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//PagosAutomaticosConstantesFunciones.TotalizarValoresFilaPagosAutomaticos(this.pagosautomaticosLogic.getPagosAutomaticoss(),this.pagosautomaticosAux);
				
				//this.pagosautomaticosLogic.getPagosAutomaticoss().add(this.pagosautomaticosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PagosAutomaticosConstantesFunciones.TotalizarValoresFilaPagosAutomaticos(this.pagosautomaticoss,this.pagosautomaticosAux);
				
				this.pagosautomaticoss.add(this.pagosautomaticosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		pagosautomaticosTotales=new PagosAutomaticos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.pagosautomaticosLogic.getPagosAutomaticoss().remove(pagosautomaticosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.pagosautomaticoss.remove(pagosautomaticosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		pagosautomaticosTotales=new PagosAutomaticos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PagosAutomaticos pagosautomaticos:pagosautomaticosLogic.getPagosAutomaticoss()) {
				if(pagosautomaticos.getsType().equals(Constantes2.S_TOTALES)) {
					pagosautomaticosTotales=pagosautomaticos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PagosAutomaticosConstantesFunciones.TotalizarValoresFilaPagosAutomaticos(this.pagosautomaticosLogic.getPagosAutomaticoss(),pagosautomaticosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PagosAutomaticos pagosautomaticos:this.pagosautomaticoss) {
				if(pagosautomaticos.getsType().equals(Constantes2.S_TOTALES)) {
					pagosautomaticosTotales=pagosautomaticos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PagosAutomaticosConstantesFunciones.TotalizarValoresFilaPagosAutomaticos(this.pagosautomaticoss,pagosautomaticosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPagosAutomaticossBusquedaPagosAutomaticos()throws Exception {
		try {
			sAccionBusqueda="BusquedaPagosAutomaticos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPagosAutomaticossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPagosAutomaticossBusquedaPagosAutomaticos(String sFinalQuery,Date fecha_corte)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//pagosautomaticosLogic.getPagosAutomaticossBusquedaPagosAutomaticos(sFinalQuery,this.pagination,fecha_corte);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPagosAutomaticossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//pagosautomaticosLogic.getPagosAutomaticossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosPagosAutomaticos() {
		this.isPermisoTodoPagosAutomaticos=false;
		this.isPermisoNuevoPagosAutomaticos=false;
		this.isPermisoActualizarPagosAutomaticos=false;
		this.isPermisoActualizarOriginalPagosAutomaticos=false;
		this.isPermisoEliminarPagosAutomaticos=false;
		this.isPermisoGuardarCambiosPagosAutomaticos=false;
		this.isPermisoConsultaPagosAutomaticos=true;
		this.isPermisoBusquedaPagosAutomaticos=true;
		this.isPermisoReportePagosAutomaticos=true;
		this.isPermisoOrdenPagosAutomaticos=false;		
		this.isPermisoPaginacionMedioPagosAutomaticos=false;		
		this.isPermisoPaginacionAltoPagosAutomaticos=false;		
		this.isPermisoPaginacionTodoPagosAutomaticos=false;		
		this.isPermisoCopiarPagosAutomaticos=false;		
		this.isPermisoVerFormPagosAutomaticos=false;		
		this.isPermisoDuplicarPagosAutomaticos=false;
		this.isPermisoOrdenPagosAutomaticos=false;
	}
	
	public void setPermisosUsuarioPagosAutomaticos(Boolean isPermiso) {
		this.isPermisoTodoPagosAutomaticos=isPermiso;
		this.isPermisoNuevoPagosAutomaticos=isPermiso;
		this.isPermisoActualizarPagosAutomaticos=isPermiso;
		this.isPermisoActualizarOriginalPagosAutomaticos=isPermiso;
		this.isPermisoEliminarPagosAutomaticos=isPermiso;
		this.isPermisoGuardarCambiosPagosAutomaticos=isPermiso;
		this.isPermisoConsultaPagosAutomaticos=isPermiso;
		this.isPermisoBusquedaPagosAutomaticos=isPermiso;
		this.isPermisoReportePagosAutomaticos=isPermiso;
		this.isPermisoOrdenPagosAutomaticos=isPermiso;		
		this.isPermisoPaginacionMedioPagosAutomaticos=isPermiso;		
		this.isPermisoPaginacionAltoPagosAutomaticos=isPermiso;		
		this.isPermisoPaginacionTodoPagosAutomaticos=isPermiso;		
		this.isPermisoCopiarPagosAutomaticos=isPermiso;		
		this.isPermisoVerFormPagosAutomaticos=isPermiso;		
		this.isPermisoDuplicarPagosAutomaticos=isPermiso;
		this.isPermisoOrdenPagosAutomaticos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPagosAutomaticos(Boolean isPermiso) {
		//this.isPermisoTodoPagosAutomaticos=isPermiso;
		this.isPermisoNuevoPagosAutomaticos=isPermiso;
		this.isPermisoActualizarPagosAutomaticos=isPermiso;
		this.isPermisoActualizarOriginalPagosAutomaticos=isPermiso;
		this.isPermisoEliminarPagosAutomaticos=isPermiso;
		this.isPermisoGuardarCambiosPagosAutomaticos=isPermiso;
		//this.isPermisoConsultaPagosAutomaticos=isPermiso;
		//this.isPermisoBusquedaPagosAutomaticos=isPermiso;
		//this.isPermisoReportePagosAutomaticos=isPermiso;
		//this.isPermisoOrdenPagosAutomaticos=isPermiso;		
		//this.isPermisoPaginacionMedioPagosAutomaticos=isPermiso;		
		//this.isPermisoPaginacionAltoPagosAutomaticos=isPermiso;		
		//this.isPermisoPaginacionTodoPagosAutomaticos=isPermiso;		
		//this.isPermisoCopiarPagosAutomaticos=isPermiso;		
		//this.isPermisoDuplicarPagosAutomaticos=isPermiso;
		//this.isPermisoOrdenPagosAutomaticos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPagosAutomaticosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PagosAutomaticosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPagosAutomaticos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPagosAutomaticosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPagosAutomaticosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPagosAutomaticosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPagosAutomaticosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPagosAutomaticos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PagosAutomaticosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PagosAutomaticosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPagosAutomaticos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPagosAutomaticos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPagosAutomaticos=this.isPermisoActualizarPagosAutomaticos;
			this.isPermisoEliminarPagosAutomaticos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPagosAutomaticos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPagosAutomaticos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPagosAutomaticos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPagosAutomaticos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePagosAutomaticos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPagosAutomaticos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPagosAutomaticos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPagosAutomaticos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPagosAutomaticos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPagosAutomaticos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPagosAutomaticos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPagosAutomaticos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPagosAutomaticos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPagosAutomaticos.setToolTipText(this.jTableDatosPagosAutomaticos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPagosAutomaticos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPagosAutomaticos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PagosAutomaticosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PagosAutomaticosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPagosAutomaticos() throws Exception {
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
	public void inicializarCombosForeignKeyPagosAutomaticosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPagosAutomaticosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PagosAutomaticosJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyPagosAutomaticos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.pagosautomaticosSessionBean==null) {
				this.pagosautomaticosSessionBean=new PagosAutomaticosSessionBean();
			}

			if(!this.pagosautomaticosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyPagosAutomaticos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPagosAutomaticos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPagosAutomaticos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPagosAutomaticos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPagosAutomaticos(PagosAutomaticos pagosautomaticos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPagosAutomaticos(PagosAutomaticos pagosautomaticos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPagosAutomaticos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPagosAutomaticos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPagosAutomaticos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPagosAutomaticos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPagosAutomaticos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPagosAutomaticos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPagosAutomaticos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPagosAutomaticos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPagosAutomaticos.jComboBoxid_empresaPagosAutomaticos!=null && this.jInternalFrameDetalleFormPagosAutomaticos.jComboBoxid_empresaPagosAutomaticos.getItemCount()>0) {
				this.jInternalFrameDetalleFormPagosAutomaticos.jComboBoxid_empresaPagosAutomaticos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public PagosAutomaticosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PagosAutomaticosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PagosAutomaticosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.pagosautomaticosSessionBean=new PagosAutomaticosSessionBean(); 
		this.pagosautomaticosConstantesFunciones=new PagosAutomaticosConstantesFunciones(); 
		this.pagosautomaticosBean=new PagosAutomaticos();//(this.pagosautomaticosConstantesFunciones); 		
		this.pagosautomaticosReturnGeneral=new PagosAutomaticosParameterReturnGeneral(); 
		
		this.pagosautomaticosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pagosautomaticosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PagosAutomaticosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PagosAutomaticosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PagosAutomaticosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPagosAutomaticos(true);
			
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
			
			this.pagosautomaticosConstantesFunciones=new PagosAutomaticosConstantesFunciones(); 
			this.pagosautomaticosBean=new PagosAutomaticos();//this.pagosautomaticosConstantesFunciones); 			
			this.pagosautomaticosReturnGeneral=new PagosAutomaticosParameterReturnGeneral(); 
		
			PagosAutomaticosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Pagos Automaticos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.pagosautomaticos=new PagosAutomaticos();
			this.pagosautomaticoss = new ArrayList<PagosAutomaticos>();
			this.pagosautomaticossAux = new ArrayList<PagosAutomaticos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic=new PagosAutomaticosLogic();
				this.pagosautomaticosLogic.getNewConnexionToDeep("");
			}
			
			//this.pagosautomaticosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.pagosautomaticosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPagosAutomaticos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPagosAutomaticos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPagosAutomaticos);	
					}
					
					if(this.jInternalFrameImportacionPagosAutomaticos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPagosAutomaticos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPagosAutomaticos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPagosAutomaticos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPagosAutomaticos);
				this.jInternalFrameDetalleFormPagosAutomaticos.setVisible(false);
				this.jInternalFrameDetalleFormPagosAutomaticos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPagosAutomaticos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPagosAutomaticos);
					this.jInternalFrameReporteDinamicoPagosAutomaticos.setVisible(false);
					this.jInternalFrameReporteDinamicoPagosAutomaticos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPagosAutomaticos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPagosAutomaticos);
					this.jInternalFrameImportacionPagosAutomaticos.setVisible(false);
					this.jInternalFrameImportacionPagosAutomaticos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPagosAutomaticos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPagosAutomaticos);
					this.jInternalFrameOrderByPagosAutomaticos.setVisible(false);
					this.jInternalFrameOrderByPagosAutomaticos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPagosAutomaticosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PagosAutomaticosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.pagosautomaticosReturnGeneral=new PagosAutomaticosParameterReturnGeneral();
			
			this.pagosautomaticosParameterGeneral=new PagosAutomaticosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.pagosautomaticosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PagosAutomaticosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PagosAutomaticosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.pagosautomaticosSessionBean.getEsGuardarRelacionado(),this.pagosautomaticosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PagosAutomaticosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.pagosautomaticosSessionBean.getEsGuardarRelacionado(),this.pagosautomaticosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPagosAutomaticos=false;
			this.isVisibilidadCeldaDuplicarPagosAutomaticos=true;
			this.isVisibilidadCeldaCopiarPagosAutomaticos=true;
			this.isVisibilidadCeldaVerFormPagosAutomaticos=true;
			this.isVisibilidadCeldaOrdenPagosAutomaticos=true;
			this.isVisibilidadCeldaNuevoRelacionesPagosAutomaticos=false;
			this.isVisibilidadCeldaModificarPagosAutomaticos=false;
			this.isVisibilidadCeldaActualizarPagosAutomaticos=false;
			this.isVisibilidadCeldaEliminarPagosAutomaticos=false;
			this.isVisibilidadCeldaCancelarPagosAutomaticos=false;
			this.isVisibilidadCeldaGuardarPagosAutomaticos=false;
			this.isVisibilidadCeldaGuardarCambiosPagosAutomaticos=false;
			
			
			this.isVisibilidadBusquedaPagosAutomaticos=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPagosAutomaticos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPagosAutomaticos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPagosAutomaticos(false);
			
			this.setPermisosUsuarioPagosAutomaticos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.pagosautomaticosSessionBean.getEsGuardarRelacionado() 
				|| (this.pagosautomaticosSessionBean.getEsGuardarRelacionado() && this.pagosautomaticosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPagosAutomaticosClasesRelacionadas();
			}
			
			if(this.pagosautomaticosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPagosAutomaticosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PagosAutomaticosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPagosAutomaticos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPagosAutomaticos();
			}
			
			if(!this.isPermisoBusquedaPagosAutomaticos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPagosAutomaticos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PagosAutomaticosConstantesFunciones.getTiposSeleccionarPagosAutomaticos());
				
				this.tiposColumnasSelect=PagosAutomaticosConstantesFunciones.getTiposSeleccionarPagosAutomaticos(true);
				
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
			//if(!this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPagosAutomaticos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioPagosAutomaticos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioPagosAutomaticos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPagosAutomaticos() ;
			
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
				pagosautomaticosImplementable= (PagosAutomaticosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PagosAutomaticosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				pagosautomaticosImplementableHome= (PagosAutomaticosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PagosAutomaticosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.pagosautomaticoss= new ArrayList<PagosAutomaticos>();
			this.pagosautomaticossEliminados= new ArrayList<PagosAutomaticos>();
						
			this.isEsNuevoPagosAutomaticos=false;
			this.esParaAccionDesdeFormularioPagosAutomaticos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPagosAutomaticos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPagosAutomaticos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PagosAutomaticosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PagosAutomaticosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPagosAutomaticos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPagosAutomaticos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPagosAutomaticos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPagosAutomaticos();
			}
			
			PagosAutomaticosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPagosAutomaticos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPagosAutomaticos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPagosAutomaticos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPagosAutomaticos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PagosAutomaticos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPagosAutomaticos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPagosAutomaticos")) {
				iIndex=this.jInternalFrameDetalleFormPagosAutomaticos.jTabbedPaneRelacionesPagosAutomaticos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPagosAutomaticos.jTabbedPaneRelacionesPagosAutomaticos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPagosAutomaticos();	
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
	
	public void cargarCombosForeignKeyPagosAutomaticos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPagosAutomaticos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPagosAutomaticos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPagosAutomaticosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPagosAutomaticos();
		
		this.cargarCombosFrameForeignKeyPagosAutomaticos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPagosAutomaticos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPagosAutomaticos();
		}
	}
	
	
	
	public void jButtonNuevoPagosAutomaticosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.pagosautomaticosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPagosAutomaticos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
			
			
			if(jTableDatosPagosAutomaticos.getRowCount()>=1) {
				jTableDatosPagosAutomaticos.removeRowSelectionInterval(0, jTableDatosPagosAutomaticos.getRowCount()-1);						
			}
			
			this.isEsNuevoPagosAutomaticos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPagosAutomaticos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPagosAutomaticos(true);			
			//this.pagosautomaticos=new PagosAutomaticos();
			//this.pagosautomaticos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPagosAutomaticos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPagosAutomaticos() ;
			
			if(PagosAutomaticosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePagosAutomaticos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.pagosautomaticos);	
			this.actualizarInformacion("INFO_PADRE",false,this.pagosautomaticos);				
			
			PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
			
			if(this.pagosautomaticosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PagosAutomaticos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPagosAutomaticosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PagosAutomaticos> pagosautomaticossSeleccionados=new ArrayList<PagosAutomaticos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPagosAutomaticos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPagosAutomaticos.getSelectedRows().length;			
			}
			
			pagosautomaticossSeleccionados=this.getPagosAutomaticossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPagosAutomaticos--;			
				//PagosAutomaticos pagosautomaticosAux= new PagosAutomaticos();			
				//pagosautomaticosAux.setId(this.iIdNuevoPagosAutomaticos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PagosAutomaticos pagosautomaticosOrigen=new PagosAutomaticos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PagosAutomaticos pagosautomaticosOrigen : pagosautomaticossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							pagosautomaticosOrigen =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pagosautomaticosOrigen =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPagosAutomaticos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.pagosautomaticos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPagosAutomaticos(pagosautomaticosOrigen,this.pagosautomaticos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.pagosautomaticosLogic.getPagosAutomaticoss().add(this.pagosautomaticosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.pagosautomaticoss.add(this.pagosautomaticosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPagosAutomaticos(false);
				
				this.jTableDatosPagosAutomaticos.setRowSelectionInterval(this.getIndiceNuevoPagosAutomaticos(), this.getIndiceNuevoPagosAutomaticos());
				
				int iLastRow =  this.jTableDatosPagosAutomaticos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPagosAutomaticos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPagosAutomaticos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPagosAutomaticos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPagosAutomaticosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PagosAutomaticos> pagosautomaticossSeleccionados=new ArrayList<PagosAutomaticos>();									
		
			PagosAutomaticos pagosautomaticosOrigen=new PagosAutomaticos();
			PagosAutomaticos pagosautomaticosDestino=new PagosAutomaticos();
				
			pagosautomaticossSeleccionados=this.getPagosAutomaticossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPagosAutomaticos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || pagosautomaticossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPagosAutomaticos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						pagosautomaticosOrigen =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						pagosautomaticosOrigen =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						pagosautomaticosDestino =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						pagosautomaticosDestino =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				pagosautomaticosOrigen =pagosautomaticossSeleccionados.get(0);
				pagosautomaticosDestino =pagosautomaticossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPagosAutomaticos(pagosautomaticosOrigen,pagosautomaticosDestino,true,false);
				
				pagosautomaticosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(pagosautomaticosDestino,pagosautomaticosLogic.getPagosAutomaticoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(pagosautomaticosDestino,pagosautomaticoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPagosAutomaticos(false);
				
				//this.jTableDatosPagosAutomaticos.setRowSelectionInterval(this.getIndiceNuevoPagosAutomaticos(), this.getIndiceNuevoPagosAutomaticos());
				
				int iLastRow =  this.jTableDatosPagosAutomaticos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPagosAutomaticos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPagosAutomaticos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPagosAutomaticos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPagosAutomaticosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPagosAutomaticos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPagosAutomaticos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPagosAutomaticosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPagosAutomaticos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPagosAutomaticos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPagosAutomaticos.setVisible(!isVisible);
			this.jPanelPaginacionPagosAutomaticos.setVisible(!isVisible);
			this.jPanelAccionesPagosAutomaticos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPagosAutomaticosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePagosAutomaticos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPagosAutomaticosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPagosAutomaticos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPagosAutomaticosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPagosAutomaticos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPagosAutomaticosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPagosAutomaticos();
			
			this.abrirFrameOrderByPagosAutomaticos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPagosAutomaticosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPagosAutomaticos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePagosAutomaticos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPagosAutomaticos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPagosAutomaticos.isMaximum()) {
					this.jInternalFrameDetalleFormPagosAutomaticos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPagosAutomaticos.setSize(this.jInternalFrameDetalleFormPagosAutomaticos.iWidthFormulario,this.jInternalFrameDetalleFormPagosAutomaticos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPagosAutomaticos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPagosAutomaticos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPagosAutomaticos.isMaximum()) {
						this.jInternalFrameDetalleFormPagosAutomaticos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPagosAutomaticos.jContentPaneDetallePagosAutomaticos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPagosAutomaticos.jTabbedPaneRelacionesPagosAutomaticos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPagosAutomaticos.jContentPaneDetallePagosAutomaticos.getWidth(),PagosAutomaticosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPagosAutomaticos.jTabbedPaneRelacionesPagosAutomaticos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPagosAutomaticos.jContentPaneDetallePagosAutomaticos.getWidth(),PagosAutomaticosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPagosAutomaticos.jTabbedPaneRelacionesPagosAutomaticos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPagosAutomaticos.jContentPaneDetallePagosAutomaticos.getWidth(),PagosAutomaticosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPagosAutomaticos.setVisible(true);
	        this.jInternalFrameDetalleFormPagosAutomaticos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPagosAutomaticos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPagosAutomaticos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPagosAutomaticos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPagosAutomaticos,false,this);
				} else {
					this.jInternalFrameOrderByPagosAutomaticos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPagosAutomaticos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPagosAutomaticos);
				this.jInternalFrameOrderByPagosAutomaticos.setVisible(false);
				this.jInternalFrameOrderByPagosAutomaticos.setSelected(false);
				
				this.jInternalFrameOrderByPagosAutomaticos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPagosAutomaticos"));
				
				this.inicializarActualizarBindingTablaOrderByPagosAutomaticos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPagosAutomaticos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPagosAutomaticos==null) {
				
				this.jInternalFrameImportacionPagosAutomaticos=new ImportacionJInternalFrame(PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPagosAutomaticos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPagosAutomaticos);
				this.jInternalFrameImportacionPagosAutomaticos.setVisible(false);
				this.jInternalFrameImportacionPagosAutomaticos.setSelected(false);


				this.jInternalFrameImportacionPagosAutomaticos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPagosAutomaticos"));
				this.jInternalFrameImportacionPagosAutomaticos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPagosAutomaticos"));
				this.jInternalFrameImportacionPagosAutomaticos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPagosAutomaticos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPagosAutomaticos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPagosAutomaticos==null) {
				this.jInternalFrameReporteDinamicoPagosAutomaticos=new ReporteDinamicoJInternalFrame(PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPagosAutomaticos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPagosAutomaticos);
				this.jInternalFrameReporteDinamicoPagosAutomaticos.setVisible(false);
				this.jInternalFrameReporteDinamicoPagosAutomaticos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPagosAutomaticos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPagosAutomaticos"));
				this.jInternalFrameReporteDinamicoPagosAutomaticos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPagosAutomaticos"));
				this.jInternalFrameReporteDinamicoPagosAutomaticos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPagosAutomaticos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPagosAutomaticos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePagosAutomaticos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPagosAutomaticos);
			
	       	this.jInternalFrameDetalleFormPagosAutomaticos.setVisible(false);
	        this.jInternalFrameDetalleFormPagosAutomaticos.setSelected(false);
			
			//this.jInternalFrameDetalleFormPagosAutomaticos.dispose();
			//this.jInternalFrameDetalleFormPagosAutomaticos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPagosAutomaticos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPagosAutomaticos.setVisible(true);
	        this.jInternalFrameReporteDinamicoPagosAutomaticos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPagosAutomaticos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPagosAutomaticos.setVisible(true);
	        this.jInternalFrameImportacionPagosAutomaticos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPagosAutomaticos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPagosAutomaticos.setVisible(true);
	        this.jInternalFrameOrderByPagosAutomaticos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPagosAutomaticos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPagosAutomaticos.setVisible(false);
	        this.jInternalFrameOrderByPagosAutomaticos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPagosAutomaticos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPagosAutomaticos.setVisible(false);
	        this.jInternalFrameReporteDinamicoPagosAutomaticos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPagosAutomaticos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPagosAutomaticos.setVisible(false);
	        this.jInternalFrameImportacionPagosAutomaticos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPagosAutomaticosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPagosAutomaticos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPagosAutomaticos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPagosAutomaticos(true);
			//this.isEsNuevoPagosAutomaticos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPagosAutomaticos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPagosAutomaticos(false) ;
			
			if(pagosautomaticosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PagosAutomaticosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePagosAutomaticos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPagosAutomaticos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPagosAutomaticosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPagosAutomaticos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPagosAutomaticos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPagosAutomaticos(true);
			//this.isEsNuevoPagosAutomaticos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.pagosautomaticos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPagosAutomaticos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPagosAutomaticos(false) ;
			
			if(PagosAutomaticosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePagosAutomaticos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPagosAutomaticos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarPagosAutomaticosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPagosAutomaticos(false);
			
			//if(!this.isEsNuevoPagosAutomaticos) {								
				int intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PagosAutomaticosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.pagosautomaticos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
				
			}
			
			if(this.permiteMantenimiento(this.pagosautomaticos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPagosAutomaticos=true;
					this.inicializarActualizarBindingTablaPagosAutomaticos(false);
					this.isEsNuevoPagosAutomaticos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPagosAutomaticos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPagosAutomaticos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPagosAutomaticos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPagosAutomaticos(false);
				
				this.habilitarDeshabilitarControlesPagosAutomaticos(false);
			
												
				
				if(PagosAutomaticosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePagosAutomaticos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPagosAutomaticosActionPerformed(evt,pagosautomaticosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPagosAutomaticos(this.pagosautomaticos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPagosAutomaticos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,pagosautomaticosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.pagosautomaticos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PagosAutomaticos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutomaticos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPagosAutomaticosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
				this.pagosautomaticos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
				this.pagosautomaticos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.pagosautomaticos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PagosAutomaticosModel) this.jTableDatosPagosAutomaticos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPagosAutomaticos=true;
				this.inicializarActualizarBindingTablaPagosAutomaticos(false);
				this.isEsNuevoPagosAutomaticos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPagosAutomaticos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPagosAutomaticos(false);
				
				this.habilitarDeshabilitarControlesPagosAutomaticos(false);
				
				
				
				if(PagosAutomaticosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePagosAutomaticos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPagosAutomaticosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPagosAutomaticos.getRowCount()>=1) {
				jTableDatosPagosAutomaticos.removeRowSelectionInterval(0, jTableDatosPagosAutomaticos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPagosAutomaticos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPagosAutomaticos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPagosAutomaticos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPagosAutomaticos(false) ;
			
			this.isEsNuevoPagosAutomaticos=false;
			
			if(PagosAutomaticosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePagosAutomaticos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPagosAutomaticosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPagosAutomaticos(false);
				
				//SI ES MANUAL
				if(PagosAutomaticosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPagosAutomaticos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPagosAutomaticosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPagosAutomaticos--;			
			//PagosAutomaticos pagosautomaticosAux= new PagosAutomaticos();			
			//pagosautomaticosAux.setId(this.iIdNuevoPagosAutomaticos);
			
			if(this.jInternalFrameDetalleFormPagosAutomaticos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPagosAutomaticos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
			
			this.pagosautomaticos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.pagosautomaticosLogic.getPagosAutomaticoss().add(this.pagosautomaticosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.pagosautomaticoss.add(this.pagosautomaticosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPagosAutomaticos(false);
			
			this.jTableDatosPagosAutomaticos.setRowSelectionInterval(this.getIndiceNuevoPagosAutomaticos(), this.getIndiceNuevoPagosAutomaticos());
			
			int iLastRow =  this.jTableDatosPagosAutomaticos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPagosAutomaticos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPagosAutomaticos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPagosAutomaticos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPagosAutomaticosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPagosAutomaticos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPagosAutomaticos(false);
			
			//SI ES MANUAL
			if(PagosAutomaticosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPagosAutomaticos();
			}
			
			//this.abrirFrameTreePagosAutomaticos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPagosAutomaticosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPagosAutomaticosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPagosAutomaticos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPagosAutomaticos.setFileImportacion(this.jInternalFrameImportacionPagosAutomaticos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPagosAutomaticos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPagosAutomaticos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPagosAutomaticos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPagosAutomaticos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPagosAutomaticosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PagosAutomaticos> pagosautomaticossSeleccionados=new ArrayList<PagosAutomaticos>();		

		pagosautomaticossSeleccionados=this.getPagosAutomaticossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPagosAutomaticos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPagosAutomaticos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PagosAutomaticosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PagosAutomaticosBaseDesign.jrxml";
			
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
			
			this.generarReportePagosAutomaticoss("Todos",pagosautomaticossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Automaticos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPagosAutomaticos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPagosAutomaticos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PagosAutomaticosConstantesFunciones.LABEL_NOMBRECLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutomaticosConstantesFunciones.LABEL_NUMEROFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutomaticosConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutomaticosConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVencimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVencimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVencimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVencimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutomaticosConstantesFunciones.LABEL_NOMBREBANCO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreBanco_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreBanco_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreBanco_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreBanco_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutomaticosConstantesFunciones.LABEL_VALORPORPAGAR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorPorPagar_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorPorPagar_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorPorPagar_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorPorPagar_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutomaticosConstantesFunciones.LABEL_VALORCANCELADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorCancelado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorCancelado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorCancelado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorCancelado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutomaticosConstantesFunciones.LABEL_NUMEROCUENTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCuenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCuenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCuenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCuenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutomaticosConstantesFunciones.LABEL_ESTAAUTORIZADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taAutorizado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taAutorizado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taAutorizado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taAutorizado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutomaticosConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutomaticosConstantesFunciones.LABEL_FECHACORTE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaCorte_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaCorte_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaCorte_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaCorte_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutomaticosConstantesFunciones.LABEL_ESTADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoCuentaConCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoCuentaConCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoCuentaConCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoCuentaConCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO:
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
		
		if(this.jInternalFrameReporteDinamicoPagosAutomaticos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPagosAutomaticos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPagosAutomaticos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PagosAutomaticosConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoria="nombre_cliente";
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoria="numero_factura";
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoria="fecha_vencimiento";
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_NOMBREBANCO:
					sNombreCampoCategoria="nombre_banco";
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_VALORPORPAGAR:
					sNombreCampoCategoria="valor_por_pagar";
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_VALORCANCELADO:
					sNombreCampoCategoria="valor_cancelado";
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_NUMEROCUENTA:
					sNombreCampoCategoria="numero_cuenta";
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_ESTAAUTORIZADO:
					sNombreCampoCategoria="esta_autorizado";
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_FECHACORTE:
					sNombreCampoCategoria="fecha_corte_dato";
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_ESTADO:
					sNombreCampoCategoria="estado";
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE:
					sNombreCampoCategoria="codigo_cuenta_con_cliente";
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO:
					sNombreCampoCategoria="codigo_cuenta_con_banco";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPagosAutomaticos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PagosAutomaticosConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoriaValor="nombre_cliente";
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoriaValor="numero_factura";
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoriaValor="fecha_vencimiento";
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_NOMBREBANCO:
					sNombreCampoCategoriaValor="nombre_banco";
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_VALORPORPAGAR:
					sNombreCampoCategoriaValor="valor_por_pagar";
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_VALORCANCELADO:
					sNombreCampoCategoriaValor="valor_cancelado";
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_NUMEROCUENTA:
					sNombreCampoCategoriaValor="numero_cuenta";
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_ESTAAUTORIZADO:
					sNombreCampoCategoriaValor="esta_autorizado";
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_FECHACORTE:
					sNombreCampoCategoriaValor="fecha_corte_dato";
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_ESTADO:
					sNombreCampoCategoriaValor="estado";
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE:
					sNombreCampoCategoriaValor="codigo_cuenta_con_cliente";
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO:
					sNombreCampoCategoriaValor="codigo_cuenta_con_banco";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPagosAutomaticos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPagosAutomaticos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PagosAutomaticosConstantesFunciones.LABEL_NOMBRECLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cliente");
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_NUMEROFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_factura");
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Vencimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_vencimiento");
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_NOMBREBANCO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Banco",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_banco");
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_VALORPORPAGAR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Por Pagar",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_por_pagar");
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_VALORCANCELADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Cancelado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_cancelado");
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_NUMEROCUENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Cuenta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_cuenta");
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_ESTAAUTORIZADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Esta Autorizado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esta_autorizado");
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_FECHACORTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Corte",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_corte_dato");
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_ESTADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"estado");
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Cuenta Con Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_cuenta_con_cliente");
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO:
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
	
	public void jButtonGenerarExcelReporteDinamicoPagosAutomaticosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PagosAutomaticos> pagosautomaticossSeleccionados=new ArrayList<PagosAutomaticos>();		
		
		pagosautomaticossSeleccionados=this.getPagosAutomaticossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pagosautomaticos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PagosAutomaticoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPagosAutomaticos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPagosAutomaticos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PagosAutomaticosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(PagosAutomaticos pagosautomaticos:pagosautomaticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautomaticos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_FECHACORTE0:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_FECHACORTE0);
					iRow++;

					for(PagosAutomaticos pagosautomaticos:pagosautomaticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautomaticos.getfecha_corte());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_NOMBRECLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_NOMBRECLIENTE);
					iRow++;

					for(PagosAutomaticos pagosautomaticos:pagosautomaticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautomaticos.getnombre_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_NUMEROFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_NUMEROFACTURA);
					iRow++;

					for(PagosAutomaticos pagosautomaticos:pagosautomaticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautomaticos.getnumero_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(PagosAutomaticos pagosautomaticos:pagosautomaticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautomaticos.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_FECHAVENCIMIENTO);
					iRow++;

					for(PagosAutomaticos pagosautomaticos:pagosautomaticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautomaticos.getfecha_vencimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_NOMBREBANCO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_NOMBREBANCO);
					iRow++;

					for(PagosAutomaticos pagosautomaticos:pagosautomaticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautomaticos.getnombre_banco());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_VALORPORPAGAR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_VALORPORPAGAR);
					iRow++;

					for(PagosAutomaticos pagosautomaticos:pagosautomaticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautomaticos.getvalor_por_pagar());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_VALORCANCELADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_VALORCANCELADO);
					iRow++;

					for(PagosAutomaticos pagosautomaticos:pagosautomaticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautomaticos.getvalor_cancelado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_NUMEROCUENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_NUMEROCUENTA);
					iRow++;

					for(PagosAutomaticos pagosautomaticos:pagosautomaticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautomaticos.getnumero_cuenta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_ESTAAUTORIZADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_ESTAAUTORIZADO);
					iRow++;

					for(PagosAutomaticos pagosautomaticos:pagosautomaticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautomaticos.getesta_autorizado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(PagosAutomaticos pagosautomaticos:pagosautomaticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautomaticos.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_FECHACORTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_FECHACORTE);
					iRow++;

					for(PagosAutomaticos pagosautomaticos:pagosautomaticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautomaticos.getfecha_corte_dato());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_ESTADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_ESTADO);
					iRow++;

					for(PagosAutomaticos pagosautomaticos:pagosautomaticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautomaticos.getestado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE);
					iRow++;

					for(PagosAutomaticos pagosautomaticos:pagosautomaticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautomaticos.getcodigo_cuenta_con_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO);
					iRow++;

					for(PagosAutomaticos pagosautomaticos:pagosautomaticossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pagosautomaticos.getcodigo_cuenta_con_banco());
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
			//	this.getFilaCabeceraExportarExcelPagosAutomaticos(row);				
			//	iRow++;
			//}				
			
			//for(PagosAutomaticos pagosautomaticosAux:pagosautomaticossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPagosAutomaticos(pagosautomaticosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Automaticos",JOptionPane.INFORMATION_MESSAGE);
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
				this.pagosautomaticosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPagosAutomaticos(false);
			
			//SI ES MANUAL
			if(PagosAutomaticosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPagosAutomaticos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPagosAutomaticosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPagosAutomaticos(false);
			
			//SI ES MANUAL
			if(PagosAutomaticosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPagosAutomaticos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPagosAutomaticosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPagosAutomaticos(false);
			
			//SI ES MANUAL
			if(PagosAutomaticosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPagosAutomaticos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPagosAutomaticos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPagosAutomaticos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPagosAutomaticos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPagosAutomaticos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPagosAutomaticos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPagosAutomaticos.setMinimumSize(dimensionMinimum);
		this.jTableDatosPagosAutomaticos.setMaximumSize(dimensionMaximum);
		this.jTableDatosPagosAutomaticos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPagosAutomaticos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPagosAutomaticos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPagosAutomaticos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPagosAutomaticos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPagosAutomaticos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPagosAutomaticos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPagosAutomaticos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPagosAutomaticos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PagosAutomaticosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PagosAutomaticosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPagosAutomaticos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPagosAutomaticos();
		
		this.inicializarActualizarBindingBotonesManualPagosAutomaticos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPagosAutomaticos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPagosAutomaticos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPagosAutomaticos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPagosAutomaticos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPagosAutomaticos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPagosAutomaticos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePagosAutomaticos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPagosAutomaticos.jCheckBoxPostAccionNuevoPagosAutomaticos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPagosAutomaticos.jCheckBoxPostAccionSinCerrarPagosAutomaticos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPagosAutomaticos.jCheckBoxPostAccionSinMensajePagosAutomaticos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPagosAutomaticos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPagosAutomaticos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePagosAutomaticos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) {
				this.jInternalFrameDetalleFormPagosAutomaticos.jCheckBoxPostAccionNuevoPagosAutomaticos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPagosAutomaticos.jCheckBoxPostAccionSinCerrarPagosAutomaticos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPagosAutomaticos.jCheckBoxPostAccionSinMensajePagosAutomaticos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPagosAutomaticos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPagosAutomaticos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPagosAutomaticos.jComboBoxTiposAccionesFormularioPagosAutomaticos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPagosAutomaticos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPagosAutomaticos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPagosAutomaticos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPagosAutomaticos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPagosAutomaticos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPagosAutomaticos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPagosAutomaticos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPagosAutomaticos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPagosAutomaticos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPagosAutomaticos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPagosAutomaticos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPagosAutomaticos(Boolean esInicializar) throws Exception {
		try	{	
			if(PagosAutomaticosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPagosAutomaticos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPagosAutomaticos() throws Exception {
		try	{
			if(PagosAutomaticosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPagosAutomaticos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePagosAutomaticos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPagosAutomaticos.jComboBoxTiposAccionesFormularioPagosAutomaticos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPagosAutomaticos.jComboBoxTiposAccionesFormularioPagosAutomaticos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPagosAutomaticos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPagosAutomaticos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPagosAutomaticos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPagosAutomaticos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPagosAutomaticos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPagosAutomaticos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPagosAutomaticos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPagosAutomaticos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPagosAutomaticos.addItem(reporte);
			}
			
			
			if(!this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPagosAutomaticos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPagosAutomaticos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPagosAutomaticos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPagosAutomaticos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPagosAutomaticos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPagosAutomaticos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPagosAutomaticos.jComboBoxTiposAccionesFormularioPagosAutomaticos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPagosAutomaticos.jComboBoxTiposAccionesFormularioPagosAutomaticos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPagosAutomaticos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPagosAutomaticos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPagosAutomaticos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPagosAutomaticos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPagosAutomaticos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPagosAutomaticos!=null) {
				this.jInternalFrameReporteDinamicoPagosAutomaticos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPagosAutomaticos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPagosAutomaticos!=null) {
				this.jInternalFrameReporteDinamicoPagosAutomaticos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPagosAutomaticos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPagosAutomaticos!=null) {
				
				if(this.jInternalFrameReporteDinamicoPagosAutomaticos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPagosAutomaticos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPagosAutomaticos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPagosAutomaticos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPagosAutomaticos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPagosAutomaticos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoPagosAutomaticos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPagosAutomaticos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=PagosAutomaticosConstantesFunciones.getTiposSeleccionarPagosAutomaticos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPagosAutomaticos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoPagosAutomaticos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoPagosAutomaticos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=PagosAutomaticosConstantesFunciones.getTiposSeleccionarPagosAutomaticos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoPagosAutomaticos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoPagosAutomaticos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoPagosAutomaticos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=PagosAutomaticosConstantesFunciones.getTiposSeleccionarPagosAutomaticos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPagosAutomaticos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoPagosAutomaticos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoPagosAutomaticos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoPagosAutomaticos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPagosAutomaticos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_corteBusquedaPagosAutomaticos=new Date(this.jDateChooserfecha_corteBusquedaPagosAutomaticosPagosAutomaticos.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPagosAutomaticos(Boolean esInicializar) throws Exception {				
		if(PagosAutomaticosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPagosAutomaticos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPagosAutomaticos() throws Exception {
		this.inicializarActualizarBindingTablaPagosAutomaticos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPagosAutomaticos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPagosAutomaticos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPagosAutomaticos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPagosAutomaticos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PagosAutomaticosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPagosAutomaticos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPagosAutomaticos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PagosAutomaticosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPagosAutomaticosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutomaticosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PagosAutomaticosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPagosAutomaticos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPagosAutomaticos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PagosAutomaticosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPagosAutomaticos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPagosAutomaticos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=pagosautomaticosLogic.getPagosAutomaticoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=pagosautomaticoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PagosAutomaticosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPagosAutomaticos.setModel(new PagosAutomaticosModel(this.pagosautomaticosLogic.getPagosAutomaticoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPagosAutomaticos.setModel(new PagosAutomaticosModel(this.pagosautomaticoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPagosAutomaticos!=null && this.jInternalFrameOrderByPagosAutomaticos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPagosAutomaticos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPagosAutomaticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutomaticos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PagosAutomaticosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO,pagosautomaticosConstantesFunciones.resaltarSeleccionarPagosAutomaticos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO,pagosautomaticosConstantesFunciones.resaltarSeleccionarPagosAutomaticos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPagosAutomaticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutomaticos,PagosAutomaticosConstantesFunciones.LABEL_ID));

		if(this.pagosautomaticosConstantesFunciones.mostraridPagosAutomaticos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutomaticosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.pagosautomaticosConstantesFunciones.resaltaridPagosAutomaticos,this.pagosautomaticosConstantesFunciones.activaridPagosAutomaticos,iSizeTabla,this,true,"idPagosAutomaticos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautomaticosConstantesFunciones.resaltaridPagosAutomaticos,this.pagosautomaticosConstantesFunciones.activaridPagosAutomaticos,this,true,"idPagosAutomaticos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutomaticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutomaticos,PagosAutomaticosConstantesFunciones.LABEL_NOMBRECLIENTE));

		if(this.pagosautomaticosConstantesFunciones.mostrarnombre_clientePagosAutomaticos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutomaticosConstantesFunciones.LABEL_NOMBRECLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagosautomaticosConstantesFunciones.resaltarnombre_clientePagosAutomaticos,this.pagosautomaticosConstantesFunciones.activarnombre_clientePagosAutomaticos,iSizeTabla,this,true,"nombre_clientePagosAutomaticos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautomaticosConstantesFunciones.resaltarnombre_clientePagosAutomaticos,this.pagosautomaticosConstantesFunciones.activarnombre_clientePagosAutomaticos,this,true,"nombre_clientePagosAutomaticos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosAutomaticosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutomaticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutomaticos,PagosAutomaticosConstantesFunciones.LABEL_NUMEROFACTURA));

		if(this.pagosautomaticosConstantesFunciones.mostrarnumero_facturaPagosAutomaticos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutomaticosConstantesFunciones.LABEL_NUMEROFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagosautomaticosConstantesFunciones.resaltarnumero_facturaPagosAutomaticos,this.pagosautomaticosConstantesFunciones.activarnumero_facturaPagosAutomaticos,iSizeTabla,this,true,"numero_facturaPagosAutomaticos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautomaticosConstantesFunciones.resaltarnumero_facturaPagosAutomaticos,this.pagosautomaticosConstantesFunciones.activarnumero_facturaPagosAutomaticos,this,true,"numero_facturaPagosAutomaticos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosAutomaticosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutomaticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutomaticos,PagosAutomaticosConstantesFunciones.LABEL_FECHAEMISION));

		if(this.pagosautomaticosConstantesFunciones.mostrarfecha_emisionPagosAutomaticos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutomaticosConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.pagosautomaticosConstantesFunciones.resaltarfecha_emisionPagosAutomaticos,this.pagosautomaticosConstantesFunciones.activarfecha_emisionPagosAutomaticos,iSizeTabla,this,true,"fecha_emisionPagosAutomaticos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.pagosautomaticosConstantesFunciones.resaltarfecha_emisionPagosAutomaticos,this.pagosautomaticosConstantesFunciones.activarfecha_emisionPagosAutomaticos,this,true,"fecha_emisionPagosAutomaticos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PagosAutomaticosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutomaticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutomaticos,PagosAutomaticosConstantesFunciones.LABEL_FECHAVENCIMIENTO));

		if(this.pagosautomaticosConstantesFunciones.mostrarfecha_vencimientoPagosAutomaticos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutomaticosConstantesFunciones.LABEL_FECHAVENCIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.pagosautomaticosConstantesFunciones.resaltarfecha_vencimientoPagosAutomaticos,this.pagosautomaticosConstantesFunciones.activarfecha_vencimientoPagosAutomaticos,iSizeTabla,this,true,"fecha_vencimientoPagosAutomaticos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.pagosautomaticosConstantesFunciones.resaltarfecha_vencimientoPagosAutomaticos,this.pagosautomaticosConstantesFunciones.activarfecha_vencimientoPagosAutomaticos,this,true,"fecha_vencimientoPagosAutomaticos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PagosAutomaticosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutomaticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutomaticos,PagosAutomaticosConstantesFunciones.LABEL_NOMBREBANCO));

		if(this.pagosautomaticosConstantesFunciones.mostrarnombre_bancoPagosAutomaticos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutomaticosConstantesFunciones.LABEL_NOMBREBANCO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagosautomaticosConstantesFunciones.resaltarnombre_bancoPagosAutomaticos,this.pagosautomaticosConstantesFunciones.activarnombre_bancoPagosAutomaticos,iSizeTabla,this,true,"nombre_bancoPagosAutomaticos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautomaticosConstantesFunciones.resaltarnombre_bancoPagosAutomaticos,this.pagosautomaticosConstantesFunciones.activarnombre_bancoPagosAutomaticos,this,true,"nombre_bancoPagosAutomaticos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosAutomaticosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutomaticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutomaticos,PagosAutomaticosConstantesFunciones.LABEL_VALORPORPAGAR));

		if(this.pagosautomaticosConstantesFunciones.mostrarvalor_por_pagarPagosAutomaticos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutomaticosConstantesFunciones.LABEL_VALORPORPAGAR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.pagosautomaticosConstantesFunciones.resaltarvalor_por_pagarPagosAutomaticos,this.pagosautomaticosConstantesFunciones.activarvalor_por_pagarPagosAutomaticos,iSizeTabla,this,true,"valor_por_pagarPagosAutomaticos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautomaticosConstantesFunciones.resaltarvalor_por_pagarPagosAutomaticos,this.pagosautomaticosConstantesFunciones.activarvalor_por_pagarPagosAutomaticos,this,true,"valor_por_pagarPagosAutomaticos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PagosAutomaticosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutomaticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutomaticos,PagosAutomaticosConstantesFunciones.LABEL_VALORCANCELADO));

		if(this.pagosautomaticosConstantesFunciones.mostrarvalor_canceladoPagosAutomaticos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutomaticosConstantesFunciones.LABEL_VALORCANCELADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.pagosautomaticosConstantesFunciones.resaltarvalor_canceladoPagosAutomaticos,this.pagosautomaticosConstantesFunciones.activarvalor_canceladoPagosAutomaticos,iSizeTabla,this,true,"valor_canceladoPagosAutomaticos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautomaticosConstantesFunciones.resaltarvalor_canceladoPagosAutomaticos,this.pagosautomaticosConstantesFunciones.activarvalor_canceladoPagosAutomaticos,this,true,"valor_canceladoPagosAutomaticos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PagosAutomaticosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutomaticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutomaticos,PagosAutomaticosConstantesFunciones.LABEL_NUMEROCUENTA));

		if(this.pagosautomaticosConstantesFunciones.mostrarnumero_cuentaPagosAutomaticos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutomaticosConstantesFunciones.LABEL_NUMEROCUENTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagosautomaticosConstantesFunciones.resaltarnumero_cuentaPagosAutomaticos,this.pagosautomaticosConstantesFunciones.activarnumero_cuentaPagosAutomaticos,iSizeTabla,this,true,"numero_cuentaPagosAutomaticos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautomaticosConstantesFunciones.resaltarnumero_cuentaPagosAutomaticos,this.pagosautomaticosConstantesFunciones.activarnumero_cuentaPagosAutomaticos,this,true,"numero_cuentaPagosAutomaticos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosAutomaticosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutomaticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutomaticos,PagosAutomaticosConstantesFunciones.LABEL_ESTAAUTORIZADO));

		if(this.pagosautomaticosConstantesFunciones.mostraresta_autorizadoPagosAutomaticos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutomaticosConstantesFunciones.LABEL_ESTAAUTORIZADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.pagosautomaticosConstantesFunciones.resaltaresta_autorizadoPagosAutomaticos,this.pagosautomaticosConstantesFunciones.activaresta_autorizadoPagosAutomaticos,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.pagosautomaticosConstantesFunciones.resaltaresta_autorizadoPagosAutomaticos,this.pagosautomaticosConstantesFunciones.activaresta_autorizadoPagosAutomaticos,this,true,"esta_autorizadoPagosAutomaticos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PagosAutomaticosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutomaticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutomaticos,PagosAutomaticosConstantesFunciones.LABEL_DESCRIPCION));

		if(this.pagosautomaticosConstantesFunciones.mostrardescripcionPagosAutomaticos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutomaticosConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagosautomaticosConstantesFunciones.resaltardescripcionPagosAutomaticos,this.pagosautomaticosConstantesFunciones.activardescripcionPagosAutomaticos,iSizeTabla,this,true,"descripcionPagosAutomaticos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautomaticosConstantesFunciones.resaltardescripcionPagosAutomaticos,this.pagosautomaticosConstantesFunciones.activardescripcionPagosAutomaticos,this,true,"descripcionPagosAutomaticos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosAutomaticosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutomaticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutomaticos,PagosAutomaticosConstantesFunciones.LABEL_FECHACORTE));

		if(this.pagosautomaticosConstantesFunciones.mostrarfecha_corte_datoPagosAutomaticos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutomaticosConstantesFunciones.LABEL_FECHACORTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.pagosautomaticosConstantesFunciones.resaltarfecha_corte_datoPagosAutomaticos,this.pagosautomaticosConstantesFunciones.activarfecha_corte_datoPagosAutomaticos,iSizeTabla,this,true,"fecha_corte_datoPagosAutomaticos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.pagosautomaticosConstantesFunciones.resaltarfecha_corte_datoPagosAutomaticos,this.pagosautomaticosConstantesFunciones.activarfecha_corte_datoPagosAutomaticos,this,true,"fecha_corte_datoPagosAutomaticos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PagosAutomaticosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutomaticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutomaticos,PagosAutomaticosConstantesFunciones.LABEL_ESTADO));

		if(this.pagosautomaticosConstantesFunciones.mostrarestadoPagosAutomaticos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutomaticosConstantesFunciones.LABEL_ESTADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagosautomaticosConstantesFunciones.resaltarestadoPagosAutomaticos,this.pagosautomaticosConstantesFunciones.activarestadoPagosAutomaticos,iSizeTabla,this,true,"estadoPagosAutomaticos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautomaticosConstantesFunciones.resaltarestadoPagosAutomaticos,this.pagosautomaticosConstantesFunciones.activarestadoPagosAutomaticos,this,true,"estadoPagosAutomaticos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosAutomaticosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutomaticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutomaticos,PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE));

		if(this.pagosautomaticosConstantesFunciones.mostrarcodigo_cuenta_con_clientePagosAutomaticos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagosautomaticosConstantesFunciones.resaltarcodigo_cuenta_con_clientePagosAutomaticos,this.pagosautomaticosConstantesFunciones.activarcodigo_cuenta_con_clientePagosAutomaticos,iSizeTabla,this,true,"codigo_cuenta_con_clientePagosAutomaticos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautomaticosConstantesFunciones.resaltarcodigo_cuenta_con_clientePagosAutomaticos,this.pagosautomaticosConstantesFunciones.activarcodigo_cuenta_con_clientePagosAutomaticos,this,true,"codigo_cuenta_con_clientePagosAutomaticos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosAutomaticosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPagosAutomaticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPagosAutomaticos,PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO));

		if(this.pagosautomaticosConstantesFunciones.mostrarcodigo_cuenta_con_bancoPagosAutomaticos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pagosautomaticosConstantesFunciones.resaltarcodigo_cuenta_con_bancoPagosAutomaticos,this.pagosautomaticosConstantesFunciones.activarcodigo_cuenta_con_bancoPagosAutomaticos,iSizeTabla,this,true,"codigo_cuenta_con_bancoPagosAutomaticos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pagosautomaticosConstantesFunciones.resaltarcodigo_cuenta_con_bancoPagosAutomaticos,this.pagosautomaticosConstantesFunciones.activarcodigo_cuenta_con_bancoPagosAutomaticos,this,true,"codigo_cuenta_con_bancoPagosAutomaticos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PagosAutomaticosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.pagosautomaticosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.pagosautomaticosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.pagosautomaticosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPagosAutomaticos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.pagosautomaticosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.pagosautomaticosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPagosAutomaticos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPagosAutomaticos && this.isPermisoGuardarCambiosPagosAutomaticos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.pagosautomaticosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.pagosautomaticosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPagosAutomaticos.addColumn(tableColumn);
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
			
			this.jTableDatosPagosAutomaticos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPagosAutomaticos && this.isPermisoGuardarCambiosPagosAutomaticos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPagosAutomaticos && this.isPermisoGuardarCambiosPagosAutomaticos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPagosAutomaticos.moveColumn(this.jTableDatosPagosAutomaticos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPagosAutomaticos.moveColumn(this.jTableDatosPagosAutomaticos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPagosAutomaticos.moveColumn(this.jTableDatosPagosAutomaticos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPagosAutomaticos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPagosAutomaticos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPagosAutomaticos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PagosAutomaticosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPagosAutomaticos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPagosAutomaticos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PagosAutomaticosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PagosAutomaticosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPagosAutomaticos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPagosAutomaticos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPagosAutomaticos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=pagosautomaticosLogic.getPagosAutomaticoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=pagosautomaticoss.size()-1;
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
		//this.jTableDatosPagosAutomaticos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPagosAutomaticos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPagosAutomaticos();
			
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
				
				//this.isEsNuevoPagosAutomaticos=false;
					
				PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
			
				if(this.pagosautomaticosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPagosAutomaticos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPagosAutomaticos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPagosAutomaticos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.pagosautomaticos.getsType().equals("DUPLICADO")
				   || this.pagosautomaticos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPagosAutomaticos=true;
				
				} else {
					this.isEsNuevoPagosAutomaticos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {
					if(this.pagosautomaticos.getId()>=0 && !this.pagosautomaticos.getIsNew()) {						
						this.isEsNuevoPagosAutomaticos=false;
						
					} else {
						this.isEsNuevoPagosAutomaticos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPagosAutomaticos(esRelaciones);						
				
				this.seleccionarPagosAutomaticos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.pagosautomaticos.getId()<0) {
					this.isEsNuevoPagosAutomaticos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPagosAutomaticos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPagosAutomaticos(evt,rowIndex);
				}	
				
				if(this.pagosautomaticosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PagosAutomaticos: " + this.dDif); 
					}
				}								
				
				PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPagosAutomaticos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.pagosautomaticos)) {
					if(this.pagosautomaticos.getId()>0) {
						this.pagosautomaticos.setIsDeleted(true);
						
						this.pagosautomaticossEliminados.add(this.pagosautomaticos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.pagosautomaticosLogic.getPagosAutomaticoss().remove(this.pagosautomaticos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.pagosautomaticoss.remove(this.pagosautomaticos);				
					}
					
					
					((PagosAutomaticosModel) this.jTableDatosPagosAutomaticos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPagosAutomaticos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPagosAutomaticos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPagosAutomaticos) {
			
			if(this.jInternalFrameDetalleFormPagosAutomaticos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPagosAutomaticos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPagosAutomaticos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PagosAutomaticosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPagosAutomaticos(this.pagosautomaticos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPagosAutomaticos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPagosAutomaticos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPagosAutomaticos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPagosAutomaticos(PagosAutomaticos pagosautomaticos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPagosAutomaticos(pagosautomaticos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPagosAutomaticos(PagosAutomaticos pagosautomaticos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPagosAutomaticos(pagosautomaticos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPagosAutomaticos(pagosautomaticos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPagosAutomaticos(pagosautomaticos);
	}
	
	public void setVariablesObjetoActualToFormularioPagosAutomaticos(PagosAutomaticos pagosautomaticos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPagosAutomaticos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPagosAutomaticos.jLabelidPagosAutomaticos.setText(pagosautomaticos.getId().toString());
			this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreanombre_clientePagosAutomaticos.setText(pagosautomaticos.getnombre_cliente());
			this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldnumero_facturaPagosAutomaticos.setText(pagosautomaticos.getnumero_factura());
			this.jInternalFrameDetalleFormPagosAutomaticos.jDateChooserfecha_emisionPagosAutomaticos.setDate(pagosautomaticos.getfecha_emision());
			this.jInternalFrameDetalleFormPagosAutomaticos.jDateChooserfecha_vencimientoPagosAutomaticos.setDate(pagosautomaticos.getfecha_vencimiento());
			this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreanombre_bancoPagosAutomaticos.setText(pagosautomaticos.getnombre_banco());
			this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldvalor_por_pagarPagosAutomaticos.setText(pagosautomaticos.getvalor_por_pagar().toString());
			this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldvalor_canceladoPagosAutomaticos.setText(pagosautomaticos.getvalor_cancelado().toString());
			this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldnumero_cuentaPagosAutomaticos.setText(pagosautomaticos.getnumero_cuenta());
			this.jInternalFrameDetalleFormPagosAutomaticos.jCheckBoxesta_autorizadoPagosAutomaticos.setSelected(pagosautomaticos.getesta_autorizado());
			this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreadescripcionPagosAutomaticos.setText(pagosautomaticos.getdescripcion());
			this.jInternalFrameDetalleFormPagosAutomaticos.jDateChooserfecha_corte_datoPagosAutomaticos.setDate(pagosautomaticos.getfecha_corte_dato());
			this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreaestadoPagosAutomaticos.setText(pagosautomaticos.getestado());
			this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldcodigo_cuenta_con_clientePagosAutomaticos.setText(pagosautomaticos.getcodigo_cuenta_con_cliente());
			this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldcodigo_cuenta_con_bancoPagosAutomaticos.setText(pagosautomaticos.getcodigo_cuenta_con_banco());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PagosAutomaticos pagosautomaticosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,pagosautomaticosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PagosAutomaticos pagosautomaticosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				pagosautomaticosLocal=this.pagosautomaticos;
			} else {
				pagosautomaticosLocal=this.pagosautomaticosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(pagosautomaticosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPagosAutomaticos(pagosautomaticosLocal,true);
					
					if(pagosautomaticosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(pagosautomaticosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(pagosautomaticosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPagosAutomaticos(PagosAutomaticos pagosautomaticos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPagosAutomaticos(pagosautomaticos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(pagosautomaticos);
	}
	
	public void setVariablesFormularioToObjetoActualPagosAutomaticos(PagosAutomaticos pagosautomaticos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPagosAutomaticos(pagosautomaticos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPagosAutomaticos(PagosAutomaticos pagosautomaticos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPagosAutomaticos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPagosAutomaticos.jLabelidPagosAutomaticos.getText()==null || this.jInternalFrameDetalleFormPagosAutomaticos.jLabelidPagosAutomaticos.getText()=="" || this.jInternalFrameDetalleFormPagosAutomaticos.jLabelidPagosAutomaticos.getText()=="Id") {
				this.jInternalFrameDetalleFormPagosAutomaticos.jLabelidPagosAutomaticos.setText("0");
			}

			if(conColumnasBase) {pagosautomaticos.setId(Long.parseLong(this.jInternalFrameDetalleFormPagosAutomaticos.jLabelidPagosAutomaticos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutomaticosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelIdPagosAutomaticos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautomaticos.setnombre_cliente(this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreanombre_clientePagosAutomaticos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutomaticosConstantesFunciones.LABEL_NOMBRECLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelnombre_clientePagosAutomaticos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautomaticos.setnumero_factura(this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldnumero_facturaPagosAutomaticos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutomaticosConstantesFunciones.LABEL_NUMEROFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelnumero_facturaPagosAutomaticos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautomaticos.setfecha_emision(this.jInternalFrameDetalleFormPagosAutomaticos.jDateChooserfecha_emisionPagosAutomaticos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutomaticosConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelfecha_emisionPagosAutomaticos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautomaticos.setfecha_vencimiento(this.jInternalFrameDetalleFormPagosAutomaticos.jDateChooserfecha_vencimientoPagosAutomaticos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutomaticosConstantesFunciones.LABEL_FECHAVENCIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelfecha_vencimientoPagosAutomaticos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautomaticos.setnombre_banco(this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreanombre_bancoPagosAutomaticos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutomaticosConstantesFunciones.LABEL_NOMBREBANCO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelnombre_bancoPagosAutomaticos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautomaticos.setvalor_por_pagar(Double.parseDouble(this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldvalor_por_pagarPagosAutomaticos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutomaticosConstantesFunciones.LABEL_VALORPORPAGAR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelvalor_por_pagarPagosAutomaticos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautomaticos.setvalor_cancelado(Double.parseDouble(this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldvalor_canceladoPagosAutomaticos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutomaticosConstantesFunciones.LABEL_VALORCANCELADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelvalor_canceladoPagosAutomaticos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautomaticos.setnumero_cuenta(this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldnumero_cuentaPagosAutomaticos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutomaticosConstantesFunciones.LABEL_NUMEROCUENTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelnumero_cuentaPagosAutomaticos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautomaticos.setesta_autorizado(this.jInternalFrameDetalleFormPagosAutomaticos.jCheckBoxesta_autorizadoPagosAutomaticos.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutomaticosConstantesFunciones.LABEL_ESTAAUTORIZADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelesta_autorizadoPagosAutomaticos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautomaticos.setdescripcion(this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreadescripcionPagosAutomaticos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutomaticosConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutomaticos.jLabeldescripcionPagosAutomaticos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautomaticos.setfecha_corte_dato(this.jInternalFrameDetalleFormPagosAutomaticos.jDateChooserfecha_corte_datoPagosAutomaticos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutomaticosConstantesFunciones.LABEL_FECHACORTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelfecha_corte_datoPagosAutomaticos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautomaticos.setestado(this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreaestadoPagosAutomaticos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutomaticosConstantesFunciones.LABEL_ESTADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelestadoPagosAutomaticos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautomaticos.setcodigo_cuenta_con_cliente(this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldcodigo_cuenta_con_clientePagosAutomaticos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelcodigo_cuenta_con_clientePagosAutomaticos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pagosautomaticos.setcodigo_cuenta_con_banco(this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldcodigo_cuenta_con_bancoPagosAutomaticos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPagosAutomaticos.jLabelcodigo_cuenta_con_bancoPagosAutomaticos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPagosAutomaticos(PagosAutomaticos pagosautomaticosBean,PagosAutomaticos pagosautomaticos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPagosAutomaticos(PagosAutomaticos pagosautomaticosOrigen,PagosAutomaticos pagosautomaticos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && pagosautomaticosOrigen.getId()!=null && !pagosautomaticosOrigen.getId().equals(0L))) {pagosautomaticos.setId(pagosautomaticosOrigen.getId());}}
			if(conDefault || (!conDefault && pagosautomaticosOrigen.getfecha_corte()!=null && !pagosautomaticosOrigen.getfecha_corte().equals(new Date()))) {pagosautomaticos.setfecha_corte(pagosautomaticosOrigen.getfecha_corte());}
			if(conDefault || (!conDefault && pagosautomaticosOrigen.getnombre_cliente()!=null && !pagosautomaticosOrigen.getnombre_cliente().equals(""))) {pagosautomaticos.setnombre_cliente(pagosautomaticosOrigen.getnombre_cliente());}
			if(conDefault || (!conDefault && pagosautomaticosOrigen.getnumero_factura()!=null && !pagosautomaticosOrigen.getnumero_factura().equals(""))) {pagosautomaticos.setnumero_factura(pagosautomaticosOrigen.getnumero_factura());}
			if(conDefault || (!conDefault && pagosautomaticosOrigen.getfecha_emision()!=null && !pagosautomaticosOrigen.getfecha_emision().equals(new Date()))) {pagosautomaticos.setfecha_emision(pagosautomaticosOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && pagosautomaticosOrigen.getfecha_vencimiento()!=null && !pagosautomaticosOrigen.getfecha_vencimiento().equals(new Date()))) {pagosautomaticos.setfecha_vencimiento(pagosautomaticosOrigen.getfecha_vencimiento());}
			if(conDefault || (!conDefault && pagosautomaticosOrigen.getnombre_banco()!=null && !pagosautomaticosOrigen.getnombre_banco().equals(""))) {pagosautomaticos.setnombre_banco(pagosautomaticosOrigen.getnombre_banco());}
			if(conDefault || (!conDefault && pagosautomaticosOrigen.getvalor_por_pagar()!=null && !pagosautomaticosOrigen.getvalor_por_pagar().equals(0.0))) {pagosautomaticos.setvalor_por_pagar(pagosautomaticosOrigen.getvalor_por_pagar());}
			if(conDefault || (!conDefault && pagosautomaticosOrigen.getvalor_cancelado()!=null && !pagosautomaticosOrigen.getvalor_cancelado().equals(0.0))) {pagosautomaticos.setvalor_cancelado(pagosautomaticosOrigen.getvalor_cancelado());}
			if(conDefault || (!conDefault && pagosautomaticosOrigen.getnumero_cuenta()!=null && !pagosautomaticosOrigen.getnumero_cuenta().equals(""))) {pagosautomaticos.setnumero_cuenta(pagosautomaticosOrigen.getnumero_cuenta());}
			if(conDefault || (!conDefault && pagosautomaticosOrigen.getesta_autorizado()!=null && !pagosautomaticosOrigen.getesta_autorizado().equals(false))) {pagosautomaticos.setesta_autorizado(pagosautomaticosOrigen.getesta_autorizado());}
			if(conDefault || (!conDefault && pagosautomaticosOrigen.getdescripcion()!=null && !pagosautomaticosOrigen.getdescripcion().equals(""))) {pagosautomaticos.setdescripcion(pagosautomaticosOrigen.getdescripcion());}
			if(conDefault || (!conDefault && pagosautomaticosOrigen.getfecha_corte_dato()!=null && !pagosautomaticosOrigen.getfecha_corte_dato().equals(new Date()))) {pagosautomaticos.setfecha_corte_dato(pagosautomaticosOrigen.getfecha_corte_dato());}
			if(conDefault || (!conDefault && pagosautomaticosOrigen.getestado()!=null && !pagosautomaticosOrigen.getestado().equals(""))) {pagosautomaticos.setestado(pagosautomaticosOrigen.getestado());}
			if(conDefault || (!conDefault && pagosautomaticosOrigen.getcodigo_cuenta_con_cliente()!=null && !pagosautomaticosOrigen.getcodigo_cuenta_con_cliente().equals(""))) {pagosautomaticos.setcodigo_cuenta_con_cliente(pagosautomaticosOrigen.getcodigo_cuenta_con_cliente());}
			if(conDefault || (!conDefault && pagosautomaticosOrigen.getcodigo_cuenta_con_banco()!=null && !pagosautomaticosOrigen.getcodigo_cuenta_con_banco().equals(""))) {pagosautomaticos.setcodigo_cuenta_con_banco(pagosautomaticosOrigen.getcodigo_cuenta_con_banco());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPagosAutomaticos(PagosAutomaticos pagosautomaticos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPagosAutomaticos.jLabelidPagosAutomaticos.setText(pagosautomaticos.getId().toString());
			this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreanombre_clientePagosAutomaticos.setText(pagosautomaticos.getnombre_cliente());
			this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldnumero_facturaPagosAutomaticos.setText(pagosautomaticos.getnumero_factura());
			this.jInternalFrameDetalleFormPagosAutomaticos.jDateChooserfecha_emisionPagosAutomaticos.setDate(pagosautomaticos.getfecha_emision());
			this.jInternalFrameDetalleFormPagosAutomaticos.jDateChooserfecha_vencimientoPagosAutomaticos.setDate(pagosautomaticos.getfecha_vencimiento());
			this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreanombre_bancoPagosAutomaticos.setText(pagosautomaticos.getnombre_banco());
			this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldvalor_por_pagarPagosAutomaticos.setText(pagosautomaticos.getvalor_por_pagar().toString());
			this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldvalor_canceladoPagosAutomaticos.setText(pagosautomaticos.getvalor_cancelado().toString());
			this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldnumero_cuentaPagosAutomaticos.setText(pagosautomaticos.getnumero_cuenta());
			this.jInternalFrameDetalleFormPagosAutomaticos.jCheckBoxesta_autorizadoPagosAutomaticos.setSelected(pagosautomaticos.getesta_autorizado());
			this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreadescripcionPagosAutomaticos.setText(pagosautomaticos.getdescripcion());
			this.jInternalFrameDetalleFormPagosAutomaticos.jDateChooserfecha_corte_datoPagosAutomaticos.setDate(pagosautomaticos.getfecha_corte_dato());
			this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreaestadoPagosAutomaticos.setText(pagosautomaticos.getestado());
			this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldcodigo_cuenta_con_clientePagosAutomaticos.setText(pagosautomaticos.getcodigo_cuenta_con_cliente());
			this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldcodigo_cuenta_con_bancoPagosAutomaticos.setText(pagosautomaticos.getcodigo_cuenta_con_banco());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPagosAutomaticos(PagosAutomaticosBean pagosautomaticosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPagosAutomaticos.jLabelidPagosAutomaticos.setText(pagosautomaticosBean.getId().toString());
			this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreanombre_clientePagosAutomaticos.setText(pagosautomaticosBean.getnombre_cliente());
			this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldnumero_facturaPagosAutomaticos.setText(pagosautomaticosBean.getnumero_factura());
			this.jInternalFrameDetalleFormPagosAutomaticos.jDateChooserfecha_emisionPagosAutomaticos.setDate(pagosautomaticosBean.getfecha_emision());
			this.jInternalFrameDetalleFormPagosAutomaticos.jDateChooserfecha_vencimientoPagosAutomaticos.setDate(pagosautomaticosBean.getfecha_vencimiento());
			this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreanombre_bancoPagosAutomaticos.setText(pagosautomaticosBean.getnombre_banco());
			this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldvalor_por_pagarPagosAutomaticos.setText(pagosautomaticosBean.getvalor_por_pagar().toString());
			this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldvalor_canceladoPagosAutomaticos.setText(pagosautomaticosBean.getvalor_cancelado().toString());
			this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldnumero_cuentaPagosAutomaticos.setText(pagosautomaticosBean.getnumero_cuenta());
			this.jInternalFrameDetalleFormPagosAutomaticos.jCheckBoxesta_autorizadoPagosAutomaticos.setSelected(pagosautomaticosBean.getesta_autorizado());
			this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreadescripcionPagosAutomaticos.setText(pagosautomaticosBean.getdescripcion());
			this.jInternalFrameDetalleFormPagosAutomaticos.jDateChooserfecha_corte_datoPagosAutomaticos.setDate(pagosautomaticosBean.getfecha_corte_dato());
			this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreaestadoPagosAutomaticos.setText(pagosautomaticosBean.getestado());
			this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldcodigo_cuenta_con_clientePagosAutomaticos.setText(pagosautomaticosBean.getcodigo_cuenta_con_cliente());
			this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldcodigo_cuenta_con_bancoPagosAutomaticos.setText(pagosautomaticosBean.getcodigo_cuenta_con_banco());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPagosAutomaticos(PagosAutomaticosParameterReturnGeneral pagosautomaticosReturnGeneral,PagosAutomaticosBean pagosautomaticosBean,Boolean conDefault) throws Exception { 
		try {
			PagosAutomaticos pagosautomaticosLocal=new PagosAutomaticos();
			
			pagosautomaticosLocal=pagosautomaticosReturnGeneral.getPagosAutomaticos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && pagosautomaticosLocal.getId()!=null && !pagosautomaticosLocal.getId().equals(0L))) {pagosautomaticosBean.setId(pagosautomaticosLocal.getId());}}
			if(conDefault || (!conDefault && pagosautomaticosLocal.getnombre_cliente()!=null && !pagosautomaticosLocal.getnombre_cliente().equals(""))) {pagosautomaticosBean.setnombre_cliente(pagosautomaticosLocal.getnombre_cliente());}
			if(conDefault || (!conDefault && pagosautomaticosLocal.getnumero_factura()!=null && !pagosautomaticosLocal.getnumero_factura().equals(""))) {pagosautomaticosBean.setnumero_factura(pagosautomaticosLocal.getnumero_factura());}
			if(conDefault || (!conDefault && pagosautomaticosLocal.getfecha_emision()!=null && !pagosautomaticosLocal.getfecha_emision().equals(new Date()))) {pagosautomaticosBean.setfecha_emision(pagosautomaticosLocal.getfecha_emision());}
			if(conDefault || (!conDefault && pagosautomaticosLocal.getfecha_vencimiento()!=null && !pagosautomaticosLocal.getfecha_vencimiento().equals(new Date()))) {pagosautomaticosBean.setfecha_vencimiento(pagosautomaticosLocal.getfecha_vencimiento());}
			if(conDefault || (!conDefault && pagosautomaticosLocal.getnombre_banco()!=null && !pagosautomaticosLocal.getnombre_banco().equals(""))) {pagosautomaticosBean.setnombre_banco(pagosautomaticosLocal.getnombre_banco());}
			if(conDefault || (!conDefault && pagosautomaticosLocal.getvalor_por_pagar()!=null && !pagosautomaticosLocal.getvalor_por_pagar().equals(0.0))) {pagosautomaticosBean.setvalor_por_pagar(pagosautomaticosLocal.getvalor_por_pagar());}
			if(conDefault || (!conDefault && pagosautomaticosLocal.getvalor_cancelado()!=null && !pagosautomaticosLocal.getvalor_cancelado().equals(0.0))) {pagosautomaticosBean.setvalor_cancelado(pagosautomaticosLocal.getvalor_cancelado());}
			if(conDefault || (!conDefault && pagosautomaticosLocal.getnumero_cuenta()!=null && !pagosautomaticosLocal.getnumero_cuenta().equals(""))) {pagosautomaticosBean.setnumero_cuenta(pagosautomaticosLocal.getnumero_cuenta());}
			if(conDefault || (!conDefault && pagosautomaticosLocal.getesta_autorizado()!=null && !pagosautomaticosLocal.getesta_autorizado().equals(false))) {pagosautomaticosBean.setesta_autorizado(pagosautomaticosLocal.getesta_autorizado());}
			if(conDefault || (!conDefault && pagosautomaticosLocal.getdescripcion()!=null && !pagosautomaticosLocal.getdescripcion().equals(""))) {pagosautomaticosBean.setdescripcion(pagosautomaticosLocal.getdescripcion());}
			if(conDefault || (!conDefault && pagosautomaticosLocal.getfecha_corte_dato()!=null && !pagosautomaticosLocal.getfecha_corte_dato().equals(new Date()))) {pagosautomaticosBean.setfecha_corte_dato(pagosautomaticosLocal.getfecha_corte_dato());}
			if(conDefault || (!conDefault && pagosautomaticosLocal.getestado()!=null && !pagosautomaticosLocal.getestado().equals(""))) {pagosautomaticosBean.setestado(pagosautomaticosLocal.getestado());}
			if(conDefault || (!conDefault && pagosautomaticosLocal.getcodigo_cuenta_con_cliente()!=null && !pagosautomaticosLocal.getcodigo_cuenta_con_cliente().equals(""))) {pagosautomaticosBean.setcodigo_cuenta_con_cliente(pagosautomaticosLocal.getcodigo_cuenta_con_cliente());}
			if(conDefault || (!conDefault && pagosautomaticosLocal.getcodigo_cuenta_con_banco()!=null && !pagosautomaticosLocal.getcodigo_cuenta_con_banco().equals(""))) {pagosautomaticosBean.setcodigo_cuenta_con_banco(pagosautomaticosLocal.getcodigo_cuenta_con_banco());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPagosAutomaticosGenerico(Long idPagosAutomaticosSeleccionado,JComboBox jComboBoxPagosAutomaticos,List<PagosAutomaticos> pagosautomaticossLocal)throws Exception {
		try {
			PagosAutomaticos  pagosautomaticosTemp=null;

			for(PagosAutomaticos pagosautomaticosAux:pagosautomaticossLocal) {
				if(pagosautomaticosAux.getId()!=null && pagosautomaticosAux.getId().equals(idPagosAutomaticosSeleccionado)) {
					pagosautomaticosTemp=pagosautomaticosAux;
					break;
				}
			}

			jComboBoxPagosAutomaticos.setSelectedItem(pagosautomaticosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPagosAutomaticosGenerico(JComboBox jComboBoxPagosAutomaticos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPagosAutomaticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPagosAutomaticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPagosAutomaticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPagosAutomaticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPagosAutomaticos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPagosAutomaticos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPagosAutomaticos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPagosAutomaticos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPagosAutomaticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPagosAutomaticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			pagosautomaticos=(PagosAutomaticos) pagosautomaticosLogic.getPagosAutomaticoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			pagosautomaticos =(PagosAutomaticos) pagosautomaticoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!pagosautomaticos.getIsNew() && !pagosautomaticos.getIsChanged() && !pagosautomaticos.getIsDeleted()) {
				sDescripcion=pagosautomaticos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=pagosautomaticos.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PagosAutomaticos pagosautomaticosRow=new PagosAutomaticos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			pagosautomaticosRow=(PagosAutomaticos) pagosautomaticosLogic.getPagosAutomaticoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			pagosautomaticosRow=(PagosAutomaticos) pagosautomaticoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPagosAutomaticos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPagosAutomaticos.setVisible((this.isVisibilidadCeldaNuevoPagosAutomaticos && this.isPermisoNuevoPagosAutomaticos));			
			this.jButtonDuplicarPagosAutomaticos.setVisible((this.isVisibilidadCeldaDuplicarPagosAutomaticos && this.isPermisoDuplicarPagosAutomaticos));			
			this.jButtonCopiarPagosAutomaticos.setVisible((this.isVisibilidadCeldaCopiarPagosAutomaticos && this.isPermisoCopiarPagosAutomaticos));
			this.jButtonVerFormPagosAutomaticos.setVisible((this.isVisibilidadCeldaVerFormPagosAutomaticos && this.isPermisoVerFormPagosAutomaticos));
			
			this.jButtonAbrirOrderByPagosAutomaticos.setVisible((this.isVisibilidadCeldaOrdenPagosAutomaticos && this.isPermisoOrdenPagosAutomaticos));			
			
			this.jButtonNuevoRelacionesPagosAutomaticos.setVisible((this.isVisibilidadCeldaNuevoRelacionesPagosAutomaticos && this.isPermisoNuevoPagosAutomaticos));			
			this.jButtonNuevoGuardarCambiosPagosAutomaticos.setVisible((this.isVisibilidadCeldaNuevoPagosAutomaticos && this.isPermisoNuevoPagosAutomaticos && this.isPermisoGuardarCambiosPagosAutomaticos));
			
			if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) {
			this.jInternalFrameDetalleFormPagosAutomaticos.jButtonModificarPagosAutomaticos.setVisible((this.isVisibilidadCeldaModificarPagosAutomaticos && this.isPermisoActualizarPagosAutomaticos));	
			this.jInternalFrameDetalleFormPagosAutomaticos.jButtonActualizarPagosAutomaticos.setVisible((this.isVisibilidadCeldaActualizarPagosAutomaticos && this.isPermisoActualizarPagosAutomaticos));	
			this.jInternalFrameDetalleFormPagosAutomaticos.jButtonEliminarPagosAutomaticos.setVisible((this.isVisibilidadCeldaEliminarPagosAutomaticos && this.isPermisoEliminarPagosAutomaticos));
			this.jInternalFrameDetalleFormPagosAutomaticos.jButtonCancelarPagosAutomaticos.setVisible(this.isVisibilidadCeldaCancelarPagosAutomaticos);							
			this.jInternalFrameDetalleFormPagosAutomaticos.jButtonGuardarCambiosPagosAutomaticos.setVisible((this.isVisibilidadCeldaGuardarPagosAutomaticos && this.isPermisoGuardarCambiosPagosAutomaticos));			
			
			}
						
			this.jButtonGuardarCambiosTablaPagosAutomaticos.setVisible((this.isVisibilidadCeldaGuardarCambiosPagosAutomaticos && this.isPermisoGuardarCambiosPagosAutomaticos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPagosAutomaticos.setVisible((this.isVisibilidadCeldaNuevoPagosAutomaticos && this.isPermisoNuevoPagosAutomaticos));						
			this.jButtonDuplicarToolBarPagosAutomaticos.setVisible((this.isVisibilidadCeldaDuplicarPagosAutomaticos && this.isPermisoDuplicarPagosAutomaticos));						
			this.jButtonCopiarToolBarPagosAutomaticos.setVisible((this.isVisibilidadCeldaCopiarPagosAutomaticos && this.isPermisoCopiarPagosAutomaticos));			
			this.jButtonVerFormToolBarPagosAutomaticos.setVisible((this.isVisibilidadCeldaVerFormPagosAutomaticos && this.isPermisoVerFormPagosAutomaticos));			
			this.jButtonAbrirOrderByToolBarPagosAutomaticos.setVisible((this.isVisibilidadCeldaOrdenPagosAutomaticos && this.isPermisoOrdenPagosAutomaticos));
			this.jButtonNuevoRelacionesToolBarPagosAutomaticos.setVisible((this.isVisibilidadCeldaNuevoRelacionesPagosAutomaticos && this.isPermisoNuevoPagosAutomaticos));			
			this.jButtonNuevoGuardarCambiosToolBarPagosAutomaticos.setVisible((this.isVisibilidadCeldaNuevoPagosAutomaticos && this.isPermisoNuevoPagosAutomaticos && this.isPermisoGuardarCambiosPagosAutomaticos));			
			
			if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) {
			this.jInternalFrameDetalleFormPagosAutomaticos.jButtonModificarToolBarPagosAutomaticos.setVisible((this.isVisibilidadCeldaModificarPagosAutomaticos && this.isPermisoActualizarPagosAutomaticos));	
			this.jInternalFrameDetalleFormPagosAutomaticos.jButtonActualizarToolBarPagosAutomaticos.setVisible((this.isVisibilidadCeldaActualizarPagosAutomaticos  && this.isPermisoActualizarPagosAutomaticos));	
			this.jInternalFrameDetalleFormPagosAutomaticos.jButtonEliminarToolBarPagosAutomaticos.setVisible((this.isVisibilidadCeldaEliminarPagosAutomaticos && this.isPermisoEliminarPagosAutomaticos));
			this.jInternalFrameDetalleFormPagosAutomaticos.jButtonCancelarToolBarPagosAutomaticos.setVisible(this.isVisibilidadCeldaCancelarPagosAutomaticos);				
			this.jInternalFrameDetalleFormPagosAutomaticos.jButtonGuardarCambiosToolBarPagosAutomaticos.setVisible((this.isVisibilidadCeldaGuardarPagosAutomaticos && this.isPermisoGuardarCambiosPagosAutomaticos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPagosAutomaticos.setVisible((this.isVisibilidadCeldaGuardarCambiosPagosAutomaticos && this.isPermisoGuardarCambiosPagosAutomaticos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPagosAutomaticos.setVisible((this.isVisibilidadCeldaNuevoPagosAutomaticos && this.isPermisoNuevoPagosAutomaticos));			
			this.jMenuItemDuplicarPagosAutomaticos.setVisible((this.isVisibilidadCeldaDuplicarPagosAutomaticos && this.isPermisoDuplicarPagosAutomaticos));			
			this.jMenuItemCopiarPagosAutomaticos.setVisible((this.isVisibilidadCeldaCopiarPagosAutomaticos && this.isPermisoCopiarPagosAutomaticos));			
			this.jMenuItemVerFormPagosAutomaticos.setVisible((this.isVisibilidadCeldaVerFormPagosAutomaticos && this.isPermisoVerFormPagosAutomaticos));			
			this.jMenuItemAbrirOrderByPagosAutomaticos.setVisible((this.isVisibilidadCeldaOrdenPagosAutomaticos && this.isPermisoOrdenPagosAutomaticos));			
			//this.jMenuItemMostrarOcultarPagosAutomaticos.setVisible((this.isVisibilidadCeldaOrdenPagosAutomaticos && this.isPermisoOrdenPagosAutomaticos));
			this.jMenuItemDetalleAbrirOrderByPagosAutomaticos.setVisible((this.isVisibilidadCeldaOrdenPagosAutomaticos && this.isPermisoOrdenPagosAutomaticos));			
			//this.jMenuItemDetalleMostrarOcultarPagosAutomaticos.setVisible((this.isVisibilidadCeldaOrdenPagosAutomaticos && this.isPermisoOrdenPagosAutomaticos));			
			this.jMenuItemNuevoRelacionesPagosAutomaticos.setVisible((this.isVisibilidadCeldaNuevoRelacionesPagosAutomaticos && this.isPermisoNuevoPagosAutomaticos));			
			this.jMenuItemNuevoGuardarCambiosPagosAutomaticos.setVisible((this.isVisibilidadCeldaNuevoPagosAutomaticos && this.isPermisoNuevoPagosAutomaticos && this.isPermisoGuardarCambiosPagosAutomaticos));									
			
			if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) {
			this.jInternalFrameDetalleFormPagosAutomaticos.jMenuItemModificarPagosAutomaticos.setVisible((this.isVisibilidadCeldaModificarPagosAutomaticos && this.isPermisoActualizarPagosAutomaticos));	
			this.jInternalFrameDetalleFormPagosAutomaticos.jMenuItemActualizarPagosAutomaticos.setVisible((this.isVisibilidadCeldaActualizarPagosAutomaticos && this.isPermisoActualizarPagosAutomaticos));	
			this.jInternalFrameDetalleFormPagosAutomaticos.jMenuItemEliminarPagosAutomaticos.setVisible((this.isVisibilidadCeldaEliminarPagosAutomaticos && this.isPermisoEliminarPagosAutomaticos));
			this.jInternalFrameDetalleFormPagosAutomaticos.jMenuItemCancelarPagosAutomaticos.setVisible(this.isVisibilidadCeldaCancelarPagosAutomaticos);				
			}
			
			this.jMenuItemGuardarCambiosPagosAutomaticos.setVisible((this.isVisibilidadCeldaGuardarPagosAutomaticos && this.isPermisoGuardarCambiosPagosAutomaticos));						
			this.jMenuItemGuardarCambiosTablaPagosAutomaticos.setVisible((this.isVisibilidadCeldaGuardarCambiosPagosAutomaticos && this.isPermisoGuardarCambiosPagosAutomaticos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPagosAutomaticos=this.jButtonNuevoPagosAutomaticos.isVisible();
			this.isVisibilidadCeldaDuplicarPagosAutomaticos=this.jButtonDuplicarPagosAutomaticos.isVisible();
			this.isVisibilidadCeldaCopiarPagosAutomaticos=this.jButtonCopiarPagosAutomaticos.isVisible();
			this.isVisibilidadCeldaVerFormPagosAutomaticos=this.jButtonVerFormPagosAutomaticos.isVisible();
			
			this.isVisibilidadCeldaOrdenPagosAutomaticos=this.jButtonAbrirOrderByPagosAutomaticos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPagosAutomaticos=this.jButtonNuevoRelacionesPagosAutomaticos.isVisible();
			this.isVisibilidadCeldaModificarPagosAutomaticos=this.jButtonModificarPagosAutomaticos.isVisible();
			
			if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) {
			this.isVisibilidadCeldaActualizarPagosAutomaticos=this.jInternalFrameDetalleFormPagosAutomaticos.jButtonActualizarPagosAutomaticos.isVisible();
			this.isVisibilidadCeldaEliminarPagosAutomaticos=this.jInternalFrameDetalleFormPagosAutomaticos.jButtonEliminarPagosAutomaticos.isVisible();
			this.isVisibilidadCeldaCancelarPagosAutomaticos=this.jInternalFrameDetalleFormPagosAutomaticos.jButtonCancelarPagosAutomaticos.isVisible();
			this.isVisibilidadCeldaGuardarPagosAutomaticos=this.jInternalFrameDetalleFormPagosAutomaticos.jButtonGuardarCambiosPagosAutomaticos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPagosAutomaticos=this.jButtonGuardarCambiosTablaPagosAutomaticos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPagosAutomaticos=this.jButtonNuevoToolBarPagosAutomaticos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPagosAutomaticos=this.jButtonNuevoRelacionesToolBarPagosAutomaticos.isVisible();
			
			if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) {
			this.isVisibilidadCeldaModificarPagosAutomaticos=this.jInternalFrameDetalleFormPagosAutomaticos.jButtonModificarToolBarPagosAutomaticos.isVisible();
			this.isVisibilidadCeldaActualizarPagosAutomaticos=this.jInternalFrameDetalleFormPagosAutomaticos.jButtonActualizarToolBarPagosAutomaticos.isVisible();
			this.isVisibilidadCeldaEliminarPagosAutomaticos=this.jInternalFrameDetalleFormPagosAutomaticos.jButtonEliminarToolBarPagosAutomaticos.isVisible();
			this.isVisibilidadCeldaCancelarPagosAutomaticos=this.jInternalFrameDetalleFormPagosAutomaticos.jButtonCancelarToolBarPagosAutomaticos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPagosAutomaticos=this.jButtonGuardarCambiosToolBarPagosAutomaticos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPagosAutomaticos=this.jButtonGuardarCambiosTablaToolBarPagosAutomaticos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPagosAutomaticos=this.jMenuItemNuevoPagosAutomaticos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPagosAutomaticos=this.jMenuItemNuevoRelacionesPagosAutomaticos.isVisible();
			
			if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) {
			this.isVisibilidadCeldaModificarPagosAutomaticos=this.jInternalFrameDetalleFormPagosAutomaticos.jMenuItemModificarPagosAutomaticos.isVisible();
			this.isVisibilidadCeldaActualizarPagosAutomaticos=this.jInternalFrameDetalleFormPagosAutomaticos.jMenuItemActualizarPagosAutomaticos.isVisible();
			this.isVisibilidadCeldaEliminarPagosAutomaticos=this.jInternalFrameDetalleFormPagosAutomaticos.jMenuItemEliminarPagosAutomaticos.isVisible();
			this.isVisibilidadCeldaCancelarPagosAutomaticos=this.jInternalFrameDetalleFormPagosAutomaticos.jMenuItemCancelarPagosAutomaticos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPagosAutomaticos=this.jMenuItemGuardarCambiosPagosAutomaticos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPagosAutomaticos=this.jMenuItemGuardarCambiosTablaPagosAutomaticos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPagosAutomaticos(Boolean esInicializar) {
		if(PagosAutomaticosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.pagosautomaticosSessionBean.getConGuardarRelaciones()) {
				//if(this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPagosAutomaticos();
			}
			
			this.inicializarActualizarBindingBotonesManualPagosAutomaticos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPagosAutomaticos() {
		this.jButtonNuevoPagosAutomaticos.setVisible(this.isPermisoNuevoPagosAutomaticos);			
		this.jButtonDuplicarPagosAutomaticos.setVisible(this.isPermisoDuplicarPagosAutomaticos);			
		this.jButtonCopiarPagosAutomaticos.setVisible(this.isPermisoCopiarPagosAutomaticos);			
		this.jButtonVerFormPagosAutomaticos.setVisible(this.isPermisoVerFormPagosAutomaticos);			
		
		this.jButtonAbrirOrderByPagosAutomaticos.setVisible(this.isPermisoOrdenPagosAutomaticos);					
		
		this.jButtonNuevoRelacionesPagosAutomaticos.setVisible(this.isPermisoNuevoPagosAutomaticos);			
		
		if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutomaticos.jButtonModificarPagosAutomaticos.setVisible(this.isPermisoActualizarPagosAutomaticos);	
			this.jInternalFrameDetalleFormPagosAutomaticos.jButtonActualizarPagosAutomaticos.setVisible(this.isPermisoActualizarPagosAutomaticos);	
			this.jInternalFrameDetalleFormPagosAutomaticos.jButtonEliminarPagosAutomaticos.setVisible(this.isPermisoEliminarPagosAutomaticos);
			this.jInternalFrameDetalleFormPagosAutomaticos.jButtonCancelarPagosAutomaticos.setVisible(this.isVisibilidadCeldaCancelarPagosAutomaticos);						
			this.jInternalFrameDetalleFormPagosAutomaticos.jButtonGuardarCambiosPagosAutomaticos.setVisible(this.isPermisoGuardarCambiosPagosAutomaticos);							
		}
		
		this.jButtonGuardarCambiosTablaPagosAutomaticos.setVisible(this.isPermisoActualizarPagosAutomaticos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePagosAutomaticos() {
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonModificarPagosAutomaticos.setVisible(this.isPermisoActualizarPagosAutomaticos);	
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonActualizarPagosAutomaticos.setVisible(this.isPermisoActualizarPagosAutomaticos);	
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonEliminarPagosAutomaticos.setVisible(this.isPermisoEliminarPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonCancelarPagosAutomaticos.setVisible(this.isVisibilidadCeldaCancelarPagosAutomaticos);							
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonGuardarCambiosPagosAutomaticos.setVisible((this.isVisibilidadCeldaGuardarPagosAutomaticos && this.isPermisoGuardarCambiosPagosAutomaticos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPagosAutomaticos() {
		if(PagosAutomaticosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPagosAutomaticos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPagosAutomaticos() {
	}
	
	public void jTableDatosPagosAutomaticosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPagosAutomaticos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPagosAutomaticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.getpagosautomaticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautomaticos==null) {
						this.pagosautomaticos = new PagosAutomaticos();
					}

					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.pagosautomaticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
				}

				if(this.pagosautomaticos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.pagosautomaticos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutomaticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPagosAutomaticosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPagosAutomaticos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPagosAutomaticos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPagosAutomaticos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.getpagosautomaticos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.pagosautomaticosLogic.getConnexion());

				if(this.pagosautomaticos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.pagosautomaticos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPagosAutomaticos=(TitledBorder)this.jScrollPanelDatosPagosAutomaticos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPagosAutomaticos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPagosAutomaticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.getpagosautomaticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautomaticos==null) {
						this.pagosautomaticos = new PagosAutomaticos();
					}

					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.pagosautomaticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
				}

				if(this.pagosautomaticos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.pagosautomaticos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutomaticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_cortePagosAutomaticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.getpagosautomaticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautomaticos==null) {
						this.pagosautomaticos = new PagosAutomaticos();
					}

					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.pagosautomaticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
				}

				if(this.pagosautomaticos.getfecha_corte()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_corte = '"+Funciones2.getStringPostgresDate(this.pagosautomaticos.getfecha_corte())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutomaticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_clientePagosAutomaticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.getpagosautomaticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautomaticos==null) {
						this.pagosautomaticos = new PagosAutomaticos();
					}

					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.pagosautomaticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
				}

				if(this.pagosautomaticos.getnombre_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cliente like '%"+this.pagosautomaticos.getnombre_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutomaticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_facturaPagosAutomaticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.getpagosautomaticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautomaticos==null) {
						this.pagosautomaticos = new PagosAutomaticos();
					}

					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.pagosautomaticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
				}

				if(this.pagosautomaticos.getnumero_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_factura like '%"+this.pagosautomaticos.getnumero_factura()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutomaticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionPagosAutomaticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.getpagosautomaticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautomaticos==null) {
						this.pagosautomaticos = new PagosAutomaticos();
					}

					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.pagosautomaticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
				}

				if(this.pagosautomaticos.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.pagosautomaticos.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutomaticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_vencimientoPagosAutomaticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.getpagosautomaticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautomaticos==null) {
						this.pagosautomaticos = new PagosAutomaticos();
					}

					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.pagosautomaticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
				}

				if(this.pagosautomaticos.getfecha_vencimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vencimiento = '"+Funciones2.getStringPostgresDate(this.pagosautomaticos.getfecha_vencimiento())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutomaticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_bancoPagosAutomaticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.getpagosautomaticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautomaticos==null) {
						this.pagosautomaticos = new PagosAutomaticos();
					}

					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.pagosautomaticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
				}

				if(this.pagosautomaticos.getnombre_banco()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_banco like '%"+this.pagosautomaticos.getnombre_banco()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutomaticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_por_pagarPagosAutomaticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.getpagosautomaticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautomaticos==null) {
						this.pagosautomaticos = new PagosAutomaticos();
					}

					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.pagosautomaticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
				}

				if(this.pagosautomaticos.getvalor_por_pagar()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_por_pagar = "+this.pagosautomaticos.getvalor_por_pagar().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutomaticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_canceladoPagosAutomaticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.getpagosautomaticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautomaticos==null) {
						this.pagosautomaticos = new PagosAutomaticos();
					}

					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.pagosautomaticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
				}

				if(this.pagosautomaticos.getvalor_cancelado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_cancelado = "+this.pagosautomaticos.getvalor_cancelado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutomaticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_cuentaPagosAutomaticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.getpagosautomaticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautomaticos==null) {
						this.pagosautomaticos = new PagosAutomaticos();
					}

					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.pagosautomaticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
				}

				if(this.pagosautomaticos.getnumero_cuenta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_cuenta like '%"+this.pagosautomaticos.getnumero_cuenta()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutomaticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_autorizadoPagosAutomaticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.getpagosautomaticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautomaticos==null) {
						this.pagosautomaticos = new PagosAutomaticos();
					}

					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.pagosautomaticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
				}

				if(this.pagosautomaticos.getesta_autorizado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_autorizado = "+this.pagosautomaticos.getesta_autorizado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutomaticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionPagosAutomaticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.getpagosautomaticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautomaticos==null) {
						this.pagosautomaticos = new PagosAutomaticos();
					}

					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.pagosautomaticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
				}

				if(this.pagosautomaticos.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.pagosautomaticos.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutomaticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_corte_datoPagosAutomaticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.getpagosautomaticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautomaticos==null) {
						this.pagosautomaticos = new PagosAutomaticos();
					}

					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.pagosautomaticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
				}

				if(this.pagosautomaticos.getfecha_corte_dato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_corte_dato = '"+Funciones2.getStringPostgresDate(this.pagosautomaticos.getfecha_corte_dato())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutomaticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonestadoPagosAutomaticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.getpagosautomaticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautomaticos==null) {
						this.pagosautomaticos = new PagosAutomaticos();
					}

					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.pagosautomaticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
				}

				if(this.pagosautomaticos.getestado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where estado like '%"+this.pagosautomaticos.getestado()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutomaticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_cuenta_con_clientePagosAutomaticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.getpagosautomaticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautomaticos==null) {
						this.pagosautomaticos = new PagosAutomaticos();
					}

					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.pagosautomaticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
				}

				if(this.pagosautomaticos.getcodigo_cuenta_con_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_cuenta_con_cliente like '%"+this.pagosautomaticos.getcodigo_cuenta_con_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutomaticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_cuenta_con_bancoPagosAutomaticosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.getpagosautomaticos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pagosautomaticos==null) {
						this.pagosautomaticos = new PagosAutomaticos();
					}

					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.pagosautomaticos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);
				}

				if(this.pagosautomaticos.getcodigo_cuenta_con_banco()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_cuenta_con_banco like '%"+this.pagosautomaticos.getcodigo_cuenta_con_banco()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPagosAutomaticos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPagosAutomaticosPagosAutomaticosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPagosAutomaticos(false,false);

			this.getPagosAutomaticossBusquedaPagosAutomaticos();

			this.inicializarActualizarBindingPagosAutomaticos(false);

			//if(PagosAutomaticosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPagosAutomaticos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaPagosAutomaticosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPagosAutomaticos(false,false);

			this.getPagosAutomaticossFK_IdEmpresa();

			this.inicializarActualizarBindingPagosAutomaticos(false);

			//if(PagosAutomaticosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPagosAutomaticos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pagosautomaticosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePagosAutomaticos() {
		if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) {
			this.jInternalFrameDetalleFormPagosAutomaticos.setVisible(false);	    			
			this.jInternalFrameDetalleFormPagosAutomaticos.dispose();
			this.jInternalFrameDetalleFormPagosAutomaticos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPagosAutomaticos!=null) {
			this.jInternalFrameReporteDinamicoPagosAutomaticos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPagosAutomaticos.dispose();
			this.jInternalFrameReporteDinamicoPagosAutomaticos=null;
		}
		
		if(this.jInternalFrameImportacionPagosAutomaticos!=null) {
			this.jInternalFrameImportacionPagosAutomaticos.setVisible(false);	    			
			this.jInternalFrameImportacionPagosAutomaticos.dispose();
			this.jInternalFrameImportacionPagosAutomaticos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPagosAutomaticos();
			
			PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
			
			
			if(sTipo.equals("NuevoPagosAutomaticos")) {
				jButtonNuevoPagosAutomaticosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPagosAutomaticos")) {
				jButtonDuplicarPagosAutomaticosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPagosAutomaticos")) {
				jButtonCopiarPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("VerFormPagosAutomaticos")) {
				jButtonVerFormPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPagosAutomaticos")) {
				jButtonNuevoPagosAutomaticosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPagosAutomaticos")) {
				jButtonDuplicarPagosAutomaticosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPagosAutomaticos")) {
				jButtonNuevoPagosAutomaticosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPagosAutomaticos")) {
				jButtonDuplicarPagosAutomaticosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPagosAutomaticos")) {
				jButtonNuevoPagosAutomaticosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPagosAutomaticos")) {
				jButtonNuevoPagosAutomaticosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPagosAutomaticos")) {
				jButtonNuevoPagosAutomaticosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPagosAutomaticos")) {
				jButtonModificarPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPagosAutomaticos")) {
				jButtonModificarPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPagosAutomaticos")) {
				jButtonModificarPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPagosAutomaticos")) {
				jButtonActualizarPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPagosAutomaticos")) {
				jButtonActualizarPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPagosAutomaticos")) {
				jButtonActualizarPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("EliminarPagosAutomaticos")) {
				jButtonEliminarPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPagosAutomaticos")) {
				jButtonEliminarPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPagosAutomaticos")) {
				jButtonEliminarPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("CancelarPagosAutomaticos")) {
				jButtonCancelarPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPagosAutomaticos")) {
				jButtonCancelarPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPagosAutomaticos")) {
				jButtonCancelarPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("CerrarPagosAutomaticos")) {
				jButtonCerrarPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPagosAutomaticos")) {
				jButtonCerrarPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPagosAutomaticos")) {
				jButtonCerrarPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPagosAutomaticos")) {
				jButtonMostrarOcultarPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPagosAutomaticos")) {
				jButtonCancelarPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPagosAutomaticos")) {
				jButtonGuardarCambiosPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPagosAutomaticos")) {
				jButtonGuardarCambiosPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPagosAutomaticos")) {
				jButtonCopiarPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPagosAutomaticos")) {
				jButtonVerFormPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPagosAutomaticos")) {
				jButtonGuardarCambiosPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPagosAutomaticos")) {
				jButtonCopiarPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPagosAutomaticos")) {
				jButtonVerFormPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPagosAutomaticos")) {
				jButtonGuardarCambiosPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPagosAutomaticos")) {
				jButtonGuardarCambiosPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPagosAutomaticos")) {
				jButtonGuardarCambiosPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPagosAutomaticos")) {
				jButtonRecargarInformacionPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPagosAutomaticos")) {
				jButtonRecargarInformacionPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPagosAutomaticos")) {
				jButtonRecargarInformacionPagosAutomaticosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPagosAutomaticos")) {
				jButtonAnterioresPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPagosAutomaticos")) {
				jButtonAnterioresPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePagosAutomaticos")) {
				jButtonAnterioresPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPagosAutomaticos")) {
				jButtonSiguientesPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPagosAutomaticos")) {
				jButtonSiguientesPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPagosAutomaticos")) {
				jButtonSiguientesPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPagosAutomaticos") || sTipo.equals("MenuItemDetalleAbrirOrderByPagosAutomaticos")) {
				jButtonAbrirOrderByPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPagosAutomaticos") || sTipo.equals("MenuItemDetalleMostrarOcultarPagosAutomaticos")) {
				jButtonMostrarOcultarPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPagosAutomaticos")) {
				jButtonNuevoGuardarCambiosPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPagosAutomaticos")) {
				jButtonNuevoGuardarCambiosPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPagosAutomaticos")) {
				jButtonNuevoGuardarCambiosPagosAutomaticosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPagosAutomaticos")) {
				jButtonCerrarReporteDinamicoPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPagosAutomaticos")) {
				jButtonGenerarReporteDinamicoPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPagosAutomaticos")) {
				
				jButtonGenerarExcelReporteDinamicoPagosAutomaticosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPagosAutomaticos")) {
				jButtonCerrarImportacionPagosAutomaticosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPagosAutomaticos")) {
				
				jButtonGenerarImportacionPagosAutomaticosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPagosAutomaticos")) {
				
				jButtonAbrirImportacionPagosAutomaticosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPagosAutomaticos")) {
				jComboBoxTiposAccionesPagosAutomaticosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPagosAutomaticos")) {
				jComboBoxTiposRelacionesPagosAutomaticosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPagosAutomaticos")) {
				jComboBoxTiposAccionesPagosAutomaticosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPagosAutomaticos")) {
				
				jComboBoxTiposSeleccionarPagosAutomaticosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPagosAutomaticos")) {
				jTextFieldValorCampoGeneralPagosAutomaticosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPagosAutomaticos")) {
				jButtonAbrirOrderByPagosAutomaticosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPagosAutomaticos")) {
				jButtonAbrirOrderByPagosAutomaticosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPagosAutomaticos")) {
				jButtonCerrarOrderByPagosAutomaticosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPagosAutomaticosBusqueda")) {
				this.jButtonidPagosAutomaticosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPagosAutomaticosUpdate")) {
				this.jButtonid_empresaPagosAutomaticosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPagosAutomaticosBusqueda")) {
				this.jButtonid_empresaPagosAutomaticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_cortePagosAutomaticosBusqueda")) {
				this.jButtonfecha_cortePagosAutomaticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clientePagosAutomaticosBusqueda")) {
				this.jButtonnombre_clientePagosAutomaticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaPagosAutomaticosBusqueda")) {
				this.jButtonnumero_facturaPagosAutomaticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionPagosAutomaticosBusqueda")) {
				this.jButtonfecha_emisionPagosAutomaticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoPagosAutomaticosBusqueda")) {
				this.jButtonfecha_vencimientoPagosAutomaticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bancoPagosAutomaticosBusqueda")) {
				this.jButtonnombre_bancoPagosAutomaticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_por_pagarPagosAutomaticosBusqueda")) {
				this.jButtonvalor_por_pagarPagosAutomaticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_canceladoPagosAutomaticosBusqueda")) {
				this.jButtonvalor_canceladoPagosAutomaticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuentaPagosAutomaticosBusqueda")) {
				this.jButtonnumero_cuentaPagosAutomaticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_autorizadoPagosAutomaticosBusqueda")) {
				this.jButtonesta_autorizadoPagosAutomaticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionPagosAutomaticosBusqueda")) {
				this.jButtondescripcionPagosAutomaticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_corte_datoPagosAutomaticosBusqueda")) {
				this.jButtonfecha_corte_datoPagosAutomaticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estadoPagosAutomaticosBusqueda")) {
				this.jButtonestadoPagosAutomaticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_cuenta_con_clientePagosAutomaticosBusqueda")) {
				this.jButtoncodigo_cuenta_con_clientePagosAutomaticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_cuenta_con_bancoPagosAutomaticosBusqueda")) {
				this.jButtoncodigo_cuenta_con_bancoPagosAutomaticosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPagosAutomaticosPagosAutomaticos")) {
				this.jButtonBusquedaPagosAutomaticosPagosAutomaticosActionPerformed(evt);
			}
			
			;
			
			
			PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPagosAutomaticos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPagosAutomaticosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautomaticos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautomaticos);
				
				PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
				
				


				
				PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosAutomaticos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutomaticos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PagosAutomaticos pagosautomaticosLocal=null;
			
			if(!this.getEsControlTabla()) {
				pagosautomaticosLocal=this.pagosautomaticos;
			} else {
				pagosautomaticosLocal=this.pagosautomaticosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautomaticos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautomaticos);
				
				PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
							
				
				


				
				PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosAutomaticos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutomaticos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosAutomaticosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosAnterior =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagosautomaticosAnterior =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
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
			
			PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
			
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
			
			


			
			PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPagosAutomaticosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautomaticos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautomaticos);
				
				PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
								
						
				


				
				PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosAutomaticos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutomaticos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautomaticos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautomaticos);
				
				PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
								
				
				


				
				PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosAutomaticos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutomaticos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosAutomaticosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosAnterior =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagosautomaticosAnterior =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautomaticos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautomaticos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosAutomaticosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosAnterior =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagosautomaticosAnterior =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosAutomaticosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautomaticos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.pagosautomaticos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautomaticos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautomaticos);
				
				PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
							
				
				


				
				PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosAutomaticos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutomaticos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPagosAutomaticosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautomaticosAnterior =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.pagosautomaticosAnterior =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
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
			
			PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
			
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
			
			


			
			PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosAutomaticosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautomaticos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.pagosautomaticos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautomaticos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautomaticos);
				
				PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
								
				
				


				
				PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosAutomaticos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutomaticos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosAutomaticosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosAnterior =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagosautomaticosAnterior =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosAutomaticosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautomaticos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.pagosautomaticos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPagosAutomaticosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautomaticos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautomaticos);
				
				PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPagosAutomaticos")) {
					jCheckBoxSeleccionarTodosPagosAutomaticosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPagosAutomaticos")) {
					jCheckBoxSeleccionadosPagosAutomaticosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPagosAutomaticos")) {
					
				}
				
				


				
				
				PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosAutomaticos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutomaticos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautomaticos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.pagosautomaticos);
				
				PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
												
				
				


				
				
				PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosAutomaticos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutomaticos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPagosAutomaticosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pagosautomaticosAnterior =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.pagosautomaticosAnterior =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPagosAutomaticosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautomaticos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautomaticos);
				
				PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
				
				
				PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
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
			
			PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
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
			
			


			
			PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPagosAutomaticosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautomaticos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautomaticos);
				
				PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosAutomaticos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutomaticos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pagosautomaticos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pagosautomaticos);
				
				PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
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
				
				


				
				PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PagosAutomaticos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PagosAutomaticos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPagosAutomaticosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pagosautomaticosAnterior =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pagosautomaticosAnterior =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPagosAutomaticos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPagosAutomaticosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPagosAutomaticos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.pagosautomaticos =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.pagosautomaticos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPagosAutomaticos")) {
				
				}
				
				PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPagosAutomaticos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPagosAutomaticos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPagosAutomaticos")) {
			
			}
			
			PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPagosAutomaticos();
			
			PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
			
			if(sTipo.equals("NuevoPagosAutomaticos")) {
				jButtonNuevoPagosAutomaticosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPagosAutomaticos")) {
				jButtonDuplicarPagosAutomaticosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPagosAutomaticos")) {
				jButtonCopiarPagosAutomaticosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPagosAutomaticos")) {
				jButtonVerFormPagosAutomaticosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPagosAutomaticos")) {
				jButtonNuevoPagosAutomaticosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPagosAutomaticos")) {
				jButtonModificarPagosAutomaticosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPagosAutomaticos")) {
				jButtonActualizarPagosAutomaticosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPagosAutomaticos")) {
				jButtonEliminarPagosAutomaticosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPagosAutomaticos")) {
				jButtonGuardarCambiosPagosAutomaticosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPagosAutomaticos")) {
				jButtonCancelarPagosAutomaticosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPagosAutomaticos")) {
				jButtonCerrarPagosAutomaticosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPagosAutomaticos")) {
				jButtonGuardarCambiosPagosAutomaticosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPagosAutomaticos")) {
				jButtonNuevoGuardarCambiosPagosAutomaticosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPagosAutomaticos")) {
				jButtonAbrirOrderByPagosAutomaticosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPagosAutomaticos")) {
				jButtonRecargarInformacionPagosAutomaticosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPagosAutomaticos")) {
				jButtonAnterioresPagosAutomaticosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPagosAutomaticos")) {
				jButtonSiguientesPagosAutomaticosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPagosAutomaticosBusqueda")) {
				this.jButtonidPagosAutomaticosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPagosAutomaticosUpdate")) {
				this.jButtonid_empresaPagosAutomaticosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPagosAutomaticosBusqueda")) {
				this.jButtonid_empresaPagosAutomaticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_cortePagosAutomaticosBusqueda")) {
				this.jButtonfecha_cortePagosAutomaticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clientePagosAutomaticosBusqueda")) {
				this.jButtonnombre_clientePagosAutomaticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaPagosAutomaticosBusqueda")) {
				this.jButtonnumero_facturaPagosAutomaticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionPagosAutomaticosBusqueda")) {
				this.jButtonfecha_emisionPagosAutomaticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoPagosAutomaticosBusqueda")) {
				this.jButtonfecha_vencimientoPagosAutomaticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bancoPagosAutomaticosBusqueda")) {
				this.jButtonnombre_bancoPagosAutomaticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_por_pagarPagosAutomaticosBusqueda")) {
				this.jButtonvalor_por_pagarPagosAutomaticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_canceladoPagosAutomaticosBusqueda")) {
				this.jButtonvalor_canceladoPagosAutomaticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuentaPagosAutomaticosBusqueda")) {
				this.jButtonnumero_cuentaPagosAutomaticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_autorizadoPagosAutomaticosBusqueda")) {
				this.jButtonesta_autorizadoPagosAutomaticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionPagosAutomaticosBusqueda")) {
				this.jButtondescripcionPagosAutomaticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_corte_datoPagosAutomaticosBusqueda")) {
				this.jButtonfecha_corte_datoPagosAutomaticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estadoPagosAutomaticosBusqueda")) {
				this.jButtonestadoPagosAutomaticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_cuenta_con_clientePagosAutomaticosBusqueda")) {
				this.jButtoncodigo_cuenta_con_clientePagosAutomaticosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_cuenta_con_bancoPagosAutomaticosBusqueda")) {
				this.jButtoncodigo_cuenta_con_bancoPagosAutomaticosBusquedaActionPerformed(evt);
			}
			
			PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPagosAutomaticos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePagosAutomaticos")) {
				closingInternalFramePagosAutomaticos();
				
			} else if(sTipo.equals("jButtonCancelarPagosAutomaticos")) {
				JInternalFrameBase jInternalFrameDetalleFormPagosAutomaticos = (JInternalFrameBase)evt.getSource();
	            	
	            PagosAutomaticosBeanSwingJInternalFrame jInternalFrameParent=(PagosAutomaticosBeanSwingJInternalFrame)jInternalFrameDetalleFormPagosAutomaticos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPagosAutomaticosActionPerformed(null);
			}
			
			PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.pagosautomaticos,new Object(),this.pagosautomaticosParameterGeneral,this.pagosautomaticosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPagosAutomaticos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPagosAutomaticos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPagosAutomaticos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.pagosautomaticos)) {
			if(!esControlTabla) {
				if(PagosAutomaticosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.pagosautomaticos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);			
				}
				
				if(this.pagosautomaticosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPagosAutomaticos(this.pagosautomaticos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPagosAutomaticos(this.pagosautomaticosReturnGeneral,this.pagosautomaticosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.pagosautomaticosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPagosAutomaticos(classes,this.pagosautomaticosReturnGeneral,this.pagosautomaticosBean,false);
					}
						
					if(this.pagosautomaticosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPagosAutomaticos(this.pagosautomaticosReturnGeneral.getPagosAutomaticos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPagosAutomaticos(this.pagosautomaticosReturnGeneral.getPagosAutomaticos());	
					}
						
					if(this.pagosautomaticosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPagosAutomaticos(this.pagosautomaticosReturnGeneral.getPagosAutomaticos(),classes);//this.pagosautomaticosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPagosAutomaticos(this.pagosautomaticos,classes);//this.pagosautomaticosBean);									
				}
			
				if(PagosAutomaticosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPagosAutomaticos(this.pagosautomaticos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPagosAutomaticos(this.pagosautomaticos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.pagosautomaticosAnterior!=null) {
						this.pagosautomaticos=this.pagosautomaticosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.pagosautomaticosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.pagosautomaticosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.pagosautomaticosReturnGeneral.getPagosAutomaticos(),pagosautomaticosLogic.getPagosAutomaticoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.pagosautomaticosReturnGeneral.getPagosAutomaticos(),this.pagosautomaticoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPagosAutomaticos.repaint();
				
				//((AbstractTableModel) this.jTableDatosPagosAutomaticos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPagosAutomaticos();
			}
		}
	}
	
	public void actualizarVisualTableDatosPagosAutomaticos() throws Exception {
		
		PagosAutomaticosModel pagosautomaticosModel=(PagosAutomaticosModel)this.jTableDatosPagosAutomaticos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			pagosautomaticosModel.pagosautomaticoss=this.pagosautomaticosLogic.getPagosAutomaticoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			pagosautomaticosModel.pagosautomaticoss=this.pagosautomaticoss;
		}
		
		
		((PagosAutomaticosModel) this.jTableDatosPagosAutomaticos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPagosAutomaticos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpagosautomaticosAnterior(),this.pagosautomaticosLogic.getPagosAutomaticoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpagosautomaticosAnterior(),this.pagosautomaticoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPagosAutomaticos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPagosAutomaticos(PagosAutomaticos pagosautomaticos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
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
										
				PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.pagosautomaticos,new Object(),generalEntityParameterGeneral,this.pagosautomaticosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.pagosautomaticosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PagosAutomaticosConstantesFunciones.getClassesRelationshipsOfPagosAutomaticos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PagosAutomaticosConstantesFunciones.getClassesRelationshipsFromStringsOfPagosAutomaticos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPagosAutomaticos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PagosAutomaticosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.pagosautomaticos,new Object(),generalEntityParameterGeneral,this.pagosautomaticosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPagosAutomaticos(PagosAutomaticosBean pagosautomaticosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPagosAutomaticos(ArrayList<Classe> classes,PagosAutomaticosReturnGeneral pagosautomaticosReturnGeneral,PagosAutomaticosBean pagosautomaticosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPagosAutomaticos(PagosAutomaticos pagosautomaticos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.pagosautomaticos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPagosAutomaticos = new PagosAutomaticosDetalleFormJInternalFrame(jDesktopPane,this.pagosautomaticosSessionBean.getConGuardarRelaciones(),this.pagosautomaticosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.setVisible(false);
		this.jInternalFrameDetalleFormPagosAutomaticos.setSelected(false);						
		
		this.jInternalFrameDetalleFormPagosAutomaticos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPagosAutomaticos.pagosautomaticosLogic=this.pagosautomaticosLogic;
		
		this.cargarCombosFrameForeignKeyPagosAutomaticos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePagosAutomaticos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePagosAutomaticos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPagosAutomaticos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPagosAutomaticos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPagosAutomaticos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPagosAutomaticos"));
		
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonModificarPagosAutomaticos.addActionListener(new ButtonActionListener(this,"ModificarPagosAutomaticos"));

		
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonModificarToolBarPagosAutomaticos.addActionListener(new ButtonActionListener(this,"ModificarToolBarPagosAutomaticos"));
					
		this.jInternalFrameDetalleFormPagosAutomaticos.jMenuItemModificarPagosAutomaticos.addActionListener(new ButtonActionListener(this,"MenuItemModificarPagosAutomaticos"));		
		
		
		
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonActualizarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"ActualizarPagosAutomaticos"));
		
		
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonActualizarToolBarPagosAutomaticos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPagosAutomaticos"));
						
		this.jInternalFrameDetalleFormPagosAutomaticos.jMenuItemActualizarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPagosAutomaticos"));		
		
		
		
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonEliminarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"EliminarPagosAutomaticos"));
		
		
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonEliminarToolBarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"EliminarToolBarPagosAutomaticos"));
								
		this.jInternalFrameDetalleFormPagosAutomaticos.jMenuItemEliminarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPagosAutomaticos"));		
		
		
		
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonCancelarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"CancelarPagosAutomaticos"));
		
		
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonCancelarToolBarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"CancelarToolBarPagosAutomaticos"));
					
		this.jInternalFrameDetalleFormPagosAutomaticos.jMenuItemCancelarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPagosAutomaticos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPagosAutomaticos.jMenuItemDetalleCerrarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPagosAutomaticos"));		
		
		
		
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonGuardarCambiosToolBarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPagosAutomaticos"));
		
		
		
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonGuardarCambiosToolBarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPagosAutomaticos"));
		
		
		
		this.jInternalFrameDetalleFormPagosAutomaticos.jComboBoxTiposAccionesFormularioPagosAutomaticos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPagosAutomaticos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonidPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"idPagosAutomaticosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonid_empresaPagosAutomaticosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPagosAutomaticosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonid_empresaPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonfecha_cortePagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_cortePagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonnombre_clientePagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clientePagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonnumero_facturaPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonfecha_emisionPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonfecha_vencimientoPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonnombre_bancoPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bancoPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonvalor_por_pagarPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"valor_por_pagarPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonvalor_canceladoPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"valor_canceladoPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonnumero_cuentaPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuentaPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonesta_autorizadoPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"esta_autorizadoPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtondescripcionPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonfecha_corte_datoPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_corte_datoPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonestadoPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"estadoPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtoncodigo_cuenta_con_clientePagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuenta_con_clientePagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtoncodigo_cuenta_con_bancoPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuenta_con_bancoPagosAutomaticosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPagosAutomaticos.jTabbedPaneRelacionesPagosAutomaticos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPagosAutomaticos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePagosAutomaticos"));
		
		if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutomaticos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPagosAutomaticos"));
		}
		
		this.jTableDatosPagosAutomaticos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPagosAutomaticos"));
		
		this.jTableDatosPagosAutomaticos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPagosAutomaticos"));
		
		this.jButtonNuevoPagosAutomaticos.addActionListener(new ButtonActionListener(this,"NuevoPagosAutomaticos"));
		
		this.jButtonDuplicarPagosAutomaticos.addActionListener(new ButtonActionListener(this,"DuplicarPagosAutomaticos"));
		
		this.jButtonCopiarPagosAutomaticos.addActionListener(new ButtonActionListener(this,"CopiarPagosAutomaticos"));
		
		this.jButtonVerFormPagosAutomaticos.addActionListener(new ButtonActionListener(this,"VerFormPagosAutomaticos"));
		
		
		this.jButtonNuevoToolBarPagosAutomaticos.addActionListener(new ButtonActionListener(this,"NuevoToolBarPagosAutomaticos"));
			
		this.jButtonDuplicarToolBarPagosAutomaticos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPagosAutomaticos"));
			
		this.jMenuItemNuevoPagosAutomaticos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPagosAutomaticos"));
			
		this.jMenuItemDuplicarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPagosAutomaticos"));		
		
		
		this.jButtonNuevoRelacionesPagosAutomaticos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPagosAutomaticos"));
		
		
		this.jButtonNuevoRelacionesToolBarPagosAutomaticos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPagosAutomaticos"));
			
		this.jMenuItemNuevoRelacionesPagosAutomaticos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPagosAutomaticos"));		
		
		
		if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutomaticos.jButtonModificarPagosAutomaticos.addActionListener(new ButtonActionListener(this,"ModificarPagosAutomaticos"));
		}
		
		
		if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutomaticos.jButtonModificarToolBarPagosAutomaticos.addActionListener(new ButtonActionListener(this,"ModificarToolBarPagosAutomaticos"));
			
			this.jInternalFrameDetalleFormPagosAutomaticos.jMenuItemModificarPagosAutomaticos.addActionListener(new ButtonActionListener(this,"MenuItemModificarPagosAutomaticos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPagosAutomaticos.jButtonActualizarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"ActualizarPagosAutomaticos"));
		}
		
		
		if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutomaticos.jButtonActualizarToolBarPagosAutomaticos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPagosAutomaticos"));
				
			this.jInternalFrameDetalleFormPagosAutomaticos.jMenuItemActualizarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPagosAutomaticos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutomaticos.jButtonEliminarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"EliminarPagosAutomaticos"));
		}
		
		
		if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutomaticos.jButtonEliminarToolBarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"EliminarToolBarPagosAutomaticos"));
						
			this.jInternalFrameDetalleFormPagosAutomaticos.jMenuItemEliminarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPagosAutomaticos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutomaticos.jButtonCancelarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"CancelarPagosAutomaticos"));
		}
		
		
		if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutomaticos.jButtonCancelarToolBarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"CancelarToolBarPagosAutomaticos"));
			
			this.jInternalFrameDetalleFormPagosAutomaticos.jMenuItemCancelarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPagosAutomaticos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPagosAutomaticos"));		
		
		
		this.jButtonCerrarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"CerrarPagosAutomaticos"));
		
		
		this.jButtonCerrarToolBarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"CerrarToolBarPagosAutomaticos"));
			
		this.jMenuItemCerrarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPagosAutomaticos"));
			
		if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutomaticos.jMenuItemDetalleCerrarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPagosAutomaticos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutomaticos.jButtonGuardarCambiosPagosAutomaticos.addActionListener (new ButtonActionListener(this,"GuardarCambiosPagosAutomaticos"));
		}
		
		
		if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutomaticos.jButtonGuardarCambiosToolBarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPagosAutomaticos"));
		}
		
		this.jButtonCopiarToolBarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"CopiarToolBarPagosAutomaticos"));
			
		this.jButtonVerFormToolBarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"VerFormToolBarPagosAutomaticos"));
		
		this.jMenuItemGuardarCambiosPagosAutomaticos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPagosAutomaticos"));
			
		this.jMenuItemCopiarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPagosAutomaticos"));		
		
		this.jMenuItemVerFormPagosAutomaticos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPagosAutomaticos"));		
		
		
		this.jButtonGuardarCambiosTablaPagosAutomaticos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPagosAutomaticos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPagosAutomaticos"));
			
		this.jMenuItemGuardarCambiosTablaPagosAutomaticos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPagosAutomaticos"));		
		
		
		
		this.jButtonRecargarInformacionPagosAutomaticos.addActionListener (new ButtonActionListener(this,"RecargarInformacionPagosAutomaticos"));
					
		this.jButtonRecargarInformacionToolBarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPagosAutomaticos"));
		
		this.jMenuItemRecargarInformacionPagosAutomaticos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPagosAutomaticos"));		
		
		
		
		this.jButtonAnterioresPagosAutomaticos.addActionListener (new ButtonActionListener(this,"AnterioresPagosAutomaticos"));
		
		
		this.jButtonAnterioresToolBarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPagosAutomaticos"));
		
		this.jMenuItemAnterioresPagosAutomaticos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPagosAutomaticos"));		
		
		
		this.jButtonSiguientesPagosAutomaticos.addActionListener (new ButtonActionListener(this,"SiguientesPagosAutomaticos"));
		
		
		this.jButtonSiguientesToolBarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPagosAutomaticos"));
			
		this.jMenuItemSiguientesPagosAutomaticos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPagosAutomaticos"));
			
		this.jMenuItemAbrirOrderByPagosAutomaticos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPagosAutomaticos"));
			
		this.jMenuItemMostrarOcultarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPagosAutomaticos"));
			
		this.jMenuItemDetalleAbrirOrderByPagosAutomaticos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPagosAutomaticos"));
			
		this.jMenuItemDetalleMostarOcultarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPagosAutomaticos"));		
		
		
		this.jButtonNuevoGuardarCambiosPagosAutomaticos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPagosAutomaticos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPagosAutomaticos"));
			
		this.jMenuItemNuevoGuardarCambiosPagosAutomaticos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPagosAutomaticos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPagosAutomaticos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPagosAutomaticos"));

		this.jCheckBoxSeleccionadosPagosAutomaticos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPagosAutomaticos"));
		
		if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutomaticos.jComboBoxTiposAccionesFormularioPagosAutomaticos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPagosAutomaticos"));
		}
		
		
		this.jComboBoxTiposRelacionesPagosAutomaticos.addActionListener (new ButtonActionListener(this,"TiposRelacionesPagosAutomaticos"));
			
		this.jComboBoxTiposAccionesPagosAutomaticos.addActionListener (new ButtonActionListener(this,"TiposAccionesPagosAutomaticos"));
					
		this.jComboBoxTiposSeleccionarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPagosAutomaticos"));
			
		this.jTextFieldValorCampoGeneralPagosAutomaticos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPagosAutomaticos"));		
		
		
		if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonidPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"idPagosAutomaticosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonid_empresaPagosAutomaticosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPagosAutomaticosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonid_empresaPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonfecha_cortePagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_cortePagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonnombre_clientePagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clientePagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonnumero_facturaPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonfecha_emisionPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonfecha_vencimientoPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonnombre_bancoPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bancoPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonvalor_por_pagarPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"valor_por_pagarPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonvalor_canceladoPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"valor_canceladoPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonnumero_cuentaPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuentaPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonesta_autorizadoPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"esta_autorizadoPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtondescripcionPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonfecha_corte_datoPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_corte_datoPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonestadoPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"estadoPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtoncodigo_cuenta_con_clientePagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuenta_con_clientePagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtoncodigo_cuenta_con_bancoPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuenta_con_bancoPagosAutomaticosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPagosAutomaticosPagosAutomaticos.addActionListener(new ButtonActionListener(this,"BusquedaPagosAutomaticosPagosAutomaticos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPagosAutomaticos!=null) {
				this.jInternalFrameReporteDinamicoPagosAutomaticos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPagosAutomaticos"));
				this.jInternalFrameReporteDinamicoPagosAutomaticos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPagosAutomaticos"));
				this.jInternalFrameReporteDinamicoPagosAutomaticos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPagosAutomaticos"));
			}
			
			//this.jButtonCerrarReporteDinamicoPagosAutomaticos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPagosAutomaticos"));				
			//this.jButtonGenerarReporteDinamicoPagosAutomaticos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPagosAutomaticos"));
			//this.jButtonGenerarExcelReporteDinamicoPagosAutomaticos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPagosAutomaticos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPagosAutomaticos!=null) {
				this.jInternalFrameImportacionPagosAutomaticos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPagosAutomaticos"));
				this.jInternalFrameImportacionPagosAutomaticos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPagosAutomaticos"));
				this.jInternalFrameImportacionPagosAutomaticos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPagosAutomaticos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPagosAutomaticos.addActionListener (new ButtonActionListener(this,"AbrirOrderByPagosAutomaticos"));
			
			this.jButtonAbrirOrderByToolBarPagosAutomaticos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPagosAutomaticos"));			
			
			if(this.jInternalFrameOrderByPagosAutomaticos!=null) {
				this.jInternalFrameOrderByPagosAutomaticos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPagosAutomaticos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPagosAutomaticos.jTabbedPaneRelacionesPagosAutomaticos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPagosAutomaticos"));
		
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
            		closingInternalFramePagosAutomaticos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPagosAutomaticos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPagosAutomaticos = (JInternalFrameBase)event.getSource();
	            	
	            PagosAutomaticosBeanSwingJInternalFrame jInternalFrameParent=(PagosAutomaticosBeanSwingJInternalFrame)jInternalFrameDetalleFormPagosAutomaticos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPagosAutomaticosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPagosAutomaticos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPagosAutomaticosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPagosAutomaticos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPagosAutomaticos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPagosAutomaticosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPagosAutomaticosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPagosAutomaticosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPagosAutomaticos";
		inputMap = this.jButtonNuevoPagosAutomaticos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPagosAutomaticos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPagosAutomaticosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPagosAutomaticosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPagosAutomaticosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPagosAutomaticosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPagosAutomaticos";
		inputMap = this.jButtonNuevoRelacionesPagosAutomaticos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPagosAutomaticos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPagosAutomaticosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPagosAutomaticos";
		inputMap = this.jButtonModificarPagosAutomaticos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPagosAutomaticos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPagosAutomaticosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPagosAutomaticos";
		inputMap = this.jButtonActualizarPagosAutomaticos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPagosAutomaticos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPagosAutomaticosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPagosAutomaticos";
		inputMap = this.jButtonEliminarPagosAutomaticos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPagosAutomaticos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPagosAutomaticosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPagosAutomaticos";
		inputMap = this.jButtonCancelarPagosAutomaticos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPagosAutomaticos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPagosAutomaticosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPagosAutomaticos";
		inputMap = this.jButtonCerrarPagosAutomaticos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPagosAutomaticos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPagosAutomaticosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonGuardarCambiosPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPagosAutomaticos";
		inputMap = this.jInternalFrameDetalleFormPagosAutomaticos.jButtonGuardarCambiosPagosAutomaticos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonGuardarCambiosPagosAutomaticos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPagosAutomaticosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPagosAutomaticos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPagosAutomaticosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPagosAutomaticos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPagosAutomaticosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPagosAutomaticos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPagosAutomaticosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPagosAutomaticos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPagosAutomaticosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonidPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"idPagosAutomaticosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonid_empresaPagosAutomaticosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPagosAutomaticosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonid_empresaPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonfecha_cortePagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_cortePagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonnombre_clientePagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clientePagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonnumero_facturaPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonfecha_emisionPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonfecha_vencimientoPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonnombre_bancoPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bancoPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonvalor_por_pagarPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"valor_por_pagarPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonvalor_canceladoPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"valor_canceladoPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonnumero_cuentaPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuentaPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonesta_autorizadoPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"esta_autorizadoPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtondescripcionPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonfecha_corte_datoPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_corte_datoPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtonestadoPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"estadoPagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtoncodigo_cuenta_con_clientePagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuenta_con_clientePagosAutomaticosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPagosAutomaticos.jButtoncodigo_cuenta_con_bancoPagosAutomaticosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuenta_con_bancoPagosAutomaticosBusqueda"));
		
		
		this.jButtonBusquedaPagosAutomaticosPagosAutomaticos.addActionListener(new ButtonActionListener(this,"BusquedaPagosAutomaticosPagosAutomaticos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPagosAutomaticos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPagosAutomaticosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPagosAutomaticosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPagosAutomaticos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPagosAutomaticos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PagosAutomaticos pagosautomaticosAux:this.pagosautomaticosLogic.getPagosAutomaticoss()) {
					pagosautomaticosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PagosAutomaticos pagosautomaticosAux:pagosautomaticoss) {
					pagosautomaticosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPagosAutomaticosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPagosAutomaticos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PagosAutomaticos pagosautomaticosAux:this.pagosautomaticosLogic.getPagosAutomaticoss()) {
						pagosautomaticosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PagosAutomaticos pagosautomaticosAux:pagosautomaticoss) {
						pagosautomaticosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PagosAutomaticos pagosautomaticosAux:this.pagosautomaticosLogic.getPagosAutomaticoss()) {
					
						if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_ESTAAUTORIZADO)) {
							existe=true;
							pagosautomaticosAux.setesta_autorizado(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PagosAutomaticos pagosautomaticosAux:pagosautomaticoss) {
						
						if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_ESTAAUTORIZADO)) {
							existe=true;
							pagosautomaticosAux.setesta_autorizado(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPagosAutomaticos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPagosAutomaticos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPagosAutomaticos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPagosAutomaticos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPagosAutomaticosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPagosAutomaticos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPagosAutomaticos.getSelectedRows();
			
			PagosAutomaticos pagosautomaticosLocal=new PagosAutomaticos();
			
			//this.seleccionarTodosPagosAutomaticos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					pagosautomaticosLocal =(PagosAutomaticos) this.pagosautomaticosLogic.getPagosAutomaticoss().toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					pagosautomaticosLocal =(PagosAutomaticos) this.pagosautomaticoss.toArray()[this.jTableDatosPagosAutomaticos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				pagosautomaticosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PagosAutomaticos pagosautomaticosAux:this.pagosautomaticosLogic.getPagosAutomaticoss()) {
						pagosautomaticosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PagosAutomaticos pagosautomaticosAux:pagosautomaticoss) {
						pagosautomaticosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPagosAutomaticos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPagosAutomaticos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPagosAutomaticos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPagosAutomaticos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPagosAutomaticosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPagosAutomaticosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPagosAutomaticosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPagosAutomaticos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPagosAutomaticos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PagosAutomaticos pagosautomaticosAux:this.pagosautomaticosLogic.getPagosAutomaticoss()) {
				
						if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_FECHACORTE0)) {
							existe=true;
							pagosautomaticosAux.setfecha_corte(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							pagosautomaticosAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							pagosautomaticosAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							pagosautomaticosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							pagosautomaticosAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_NOMBREBANCO)) {
							existe=true;
							pagosautomaticosAux.setnombre_banco(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_VALORPORPAGAR)) {
							existe=true;
							pagosautomaticosAux.setvalor_por_pagar(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_VALORCANCELADO)) {
							existe=true;
							pagosautomaticosAux.setvalor_cancelado(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_NUMEROCUENTA)) {
							existe=true;
							pagosautomaticosAux.setnumero_cuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							pagosautomaticosAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_FECHACORTE)) {
							existe=true;
							pagosautomaticosAux.setfecha_corte_dato(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_ESTADO)) {
							existe=true;
							pagosautomaticosAux.setestado(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE)) {
							existe=true;
							pagosautomaticosAux.setcodigo_cuenta_con_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO)) {
							existe=true;
							pagosautomaticosAux.setcodigo_cuenta_con_banco(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PagosAutomaticos pagosautomaticosAux:pagosautomaticoss) {
					
						if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_FECHACORTE0)) {
							existe=true;
							pagosautomaticosAux.setfecha_corte(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							pagosautomaticosAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							pagosautomaticosAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							pagosautomaticosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							pagosautomaticosAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_NOMBREBANCO)) {
							existe=true;
							pagosautomaticosAux.setnombre_banco(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_VALORPORPAGAR)) {
							existe=true;
							pagosautomaticosAux.setvalor_por_pagar(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_VALORCANCELADO)) {
							existe=true;
							pagosautomaticosAux.setvalor_cancelado(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_NUMEROCUENTA)) {
							existe=true;
							pagosautomaticosAux.setnumero_cuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							pagosautomaticosAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_FECHACORTE)) {
							existe=true;
							pagosautomaticosAux.setfecha_corte_dato(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_ESTADO)) {
							existe=true;
							pagosautomaticosAux.setestado(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE)) {
							existe=true;
							pagosautomaticosAux.setcodigo_cuenta_con_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO)) {
							existe=true;
							pagosautomaticosAux.setcodigo_cuenta_con_banco(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPagosAutomaticos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPagosAutomaticosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPagosAutomaticos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPagosAutomaticos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPagosAutomaticos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPagosAutomaticos.jComboBoxTiposAccionesFormularioPagosAutomaticos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePagosAutomaticos) {				
					conSplash=true;//false;										
					
					//this.startProcessPagosAutomaticos(conSplash);
				
					this.generarReportePagosAutomaticossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPagosAutomaticos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPagosAutomaticos.jComboBoxTiposAccionesFormularioPagosAutomaticos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPagosAutomaticossSeleccionados();
				//this.jComboBoxTiposAccionesPagosAutomaticos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPagosAutomaticossSeleccionados(false);
				//this.jComboBoxTiposAccionesPagosAutomaticos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPagosAutomaticossSeleccionados(true);
				//this.jComboBoxTiposAccionesPagosAutomaticos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPagosAutomaticos();
				
				this.exportarPagosAutomaticossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPagosAutomaticos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPagosAutomaticos.jComboBoxTiposAccionesFormularioPagosAutomaticos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPagosAutomaticoss();
				//this.importarPagosAutomaticoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPagosAutomaticos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPagosAutomaticos.jComboBoxTiposAccionesFormularioPagosAutomaticos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPagosAutomaticos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPagosAutomaticossSeleccionados();
				//this.jComboBoxTiposAccionesPagosAutomaticos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Pagos Automaticos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPagosAutomaticos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPagosAutomaticos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPagosAutomaticos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Pagos Automaticos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPagosAutomaticos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPagosAutomaticos.jComboBoxTiposAccionesFormularioPagosAutomaticos.setSelectedIndex(0);					
				}	
			} 			
			else if(PagosAutomaticosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePagosAutomaticos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPagosAutomaticos(conSplash);
					
						//this.actualizarParametrosGeneralPagosAutomaticos();
						
						this.generarReporteProcesoAccionPagosAutomaticossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPagosAutomaticos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPagosAutomaticos.jComboBoxTiposAccionesFormularioPagosAutomaticos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PagosAutomaticosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Pagos AutomaticosES SELECCIONADOS?", "MANTENIMIENTO DE Pagos Automaticos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPagosAutomaticos();
				
						this.actualizarParametrosGeneralPagosAutomaticos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.pagosautomaticosReturnGeneral=pagosautomaticosLogic.procesarAccionPagosAutomaticossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.pagosautomaticosLogic.getPagosAutomaticoss(),this.pagosautomaticosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPagosAutomaticosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPagosAutomaticos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPagosAutomaticos.jComboBoxTiposAccionesFormularioPagosAutomaticos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPagosAutomaticos();
					
					PagosAutomaticosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPagosAutomaticosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPagosAutomaticos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPagosAutomaticos.jComboBoxTiposAccionesFormularioPagosAutomaticos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPagosAutomaticos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPagosAutomaticosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPagosAutomaticos();
			
			if(this.jInternalFrameDetalleFormPagosAutomaticos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PagosAutomaticos> pagosautomaticossSeleccionados=new ArrayList<PagosAutomaticos>();		
			PagosAutomaticos pagosautomaticos=new PagosAutomaticos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPagosAutomaticos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPagosAutomaticos.getSelectedItem();
			
			
			
			
			pagosautomaticossSeleccionados=this.getPagosAutomaticossSeleccionados(true);
			//this.sTipoAccion;
			
			if(pagosautomaticossSeleccionados.size()==1) {
				for(PagosAutomaticos pagosautomaticosAux:pagosautomaticossSeleccionados) {
					pagosautomaticos=pagosautomaticosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPagosAutomaticos();
			
      		//this.finishProcessPagosAutomaticos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPagosAutomaticosReturnGeneral() throws Exception {
		if(this.pagosautomaticosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.pagosautomaticosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.pagosautomaticosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.pagosautomaticosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.pagosautomaticosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.pagosautomaticosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPagosAutomaticos(false);
		}
		
		if(this.pagosautomaticosReturnGeneral.getConRetornoLista() || this.pagosautomaticosReturnGeneral.getConRetornoObjeto()) {
			if(this.pagosautomaticosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.pagosautomaticosLogic.setPagosAutomaticoss(this.pagosautomaticosReturnGeneral.getPagosAutomaticoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingPagosAutomaticos(false);
		}
	}
	
	public void actualizarParametrosGeneralPagosAutomaticos() throws Exception {
		
		
	}
	
	public ArrayList<PagosAutomaticos> getPagosAutomaticossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PagosAutomaticos> pagosautomaticossSeleccionados=new ArrayList<PagosAutomaticos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPagosAutomaticos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PagosAutomaticos pagosautomaticosAux:pagosautomaticosLogic.getPagosAutomaticoss()) {
					if(pagosautomaticosAux.getIsSelected()) {
						pagosautomaticossSeleccionados.add(pagosautomaticosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PagosAutomaticos pagosautomaticosAux:this.pagosautomaticoss) {
					if(pagosautomaticosAux.getIsSelected()) {
						pagosautomaticossSeleccionados.add(pagosautomaticosAux);				
					}
				}
			}
			
			if(pagosautomaticossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						pagosautomaticossSeleccionados.addAll(this.pagosautomaticosLogic.getPagosAutomaticoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						pagosautomaticossSeleccionados.addAll(this.pagosautomaticoss);				
					}
				}
			}
		} else {
			pagosautomaticossSeleccionados.add(this.pagosautomaticos);
		}
		
		return pagosautomaticossSeleccionados;
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
	
	public void generarReportePagosAutomaticossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPagosAutomaticossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPagosAutomaticossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPagosAutomaticossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPagosAutomaticossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Pagos Automaticos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPagosAutomaticossSeleccionados() throws Exception {
		ArrayList<PagosAutomaticos> pagosautomaticossSeleccionados=new ArrayList<PagosAutomaticos>();		
		
		pagosautomaticossSeleccionados=this.getPagosAutomaticossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePagosAutomaticoss("Todos",pagosautomaticossSeleccionados);
		
	}	
	
	public void generarReporteNormalPagosAutomaticossSeleccionados() throws Exception {
		ArrayList<PagosAutomaticos> pagosautomaticossSeleccionados=new ArrayList<PagosAutomaticos>();		
		
		pagosautomaticossSeleccionados=this.getPagosAutomaticossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePagosAutomaticoss("Todos",pagosautomaticossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPagosAutomaticossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PagosAutomaticos> pagosautomaticossSeleccionados=new ArrayList<PagosAutomaticos>();
		
		pagosautomaticossSeleccionados=this.getPagosAutomaticossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePagosAutomaticoss("Todos",pagosautomaticossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPagosAutomaticossSeleccionados() throws Exception {
		ArrayList<PagosAutomaticos> pagosautomaticossSeleccionados=new ArrayList<PagosAutomaticos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPagosAutomaticos();
		
		
		pagosautomaticossSeleccionados=this.getPagosAutomaticossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPagosAutomaticos();
		
		
		//this.generarReportePagosAutomaticoss("Todos",pagosautomaticossSeleccionados ,pagosautomaticosImplementable,pagosautomaticosImplementableHome);
	}
	
	public void mostrarImportacionPagosAutomaticoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPagosAutomaticos();
		
		this.abrirFrameImportacionPagosAutomaticos();		
		
			
		//this.generarReportePagosAutomaticoss("Todos",pagosautomaticossSeleccionados ,pagosautomaticosImplementable,pagosautomaticosImplementableHome);
	}
	
	public void importarPagosAutomaticoss() throws Exception {		
	
	}
	
	public void exportarPagosAutomaticossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPagosAutomaticossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPagosAutomaticossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPagosAutomaticossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Pagos Automaticos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPagosAutomaticossSeleccionados() throws Exception {
		ArrayList<PagosAutomaticos> pagosautomaticossSeleccionados=new ArrayList<PagosAutomaticos>();		
		
		pagosautomaticossSeleccionados=this.getPagosAutomaticossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pagosautomaticos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPagosAutomaticos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PagosAutomaticos pagosautomaticosAux:pagosautomaticossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPagosAutomaticos(pagosautomaticosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//pagosautomaticosAux.setsDetalleGeneralEntityReporte(pagosautomaticosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Automaticos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPagosAutomaticos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PagosAutomaticosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutomaticosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutomaticosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutomaticosConstantesFunciones.LABEL_FECHACORTE0;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutomaticosConstantesFunciones.LABEL_NOMBRECLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutomaticosConstantesFunciones.LABEL_NUMEROFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutomaticosConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutomaticosConstantesFunciones.LABEL_FECHAVENCIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutomaticosConstantesFunciones.LABEL_NOMBREBANCO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutomaticosConstantesFunciones.LABEL_VALORPORPAGAR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutomaticosConstantesFunciones.LABEL_VALORCANCELADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutomaticosConstantesFunciones.LABEL_NUMEROCUENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutomaticosConstantesFunciones.LABEL_ESTAAUTORIZADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutomaticosConstantesFunciones.LABEL_DESCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutomaticosConstantesFunciones.LABEL_FECHACORTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutomaticosConstantesFunciones.LABEL_ESTADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPagosAutomaticos(PagosAutomaticos pagosautomaticos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=pagosautomaticos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautomaticos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautomaticos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautomaticos.getfecha_corte().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautomaticos.getnombre_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautomaticos.getnumero_factura();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautomaticos.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautomaticos.getfecha_vencimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautomaticos.getnombre_banco();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautomaticos.getvalor_por_pagar().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautomaticos.getvalor_cancelado().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautomaticos.getnumero_cuenta();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautomaticos.getesta_autorizado().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautomaticos.getdescripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautomaticos.getfecha_corte_dato().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautomaticos.getestado();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautomaticos.getcodigo_cuenta_con_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pagosautomaticos.getcodigo_cuenta_con_banco();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPagosAutomaticossSeleccionados() throws Exception {
		ArrayList<PagosAutomaticos> pagosautomaticossSeleccionados=new ArrayList<PagosAutomaticos>();		
		
		pagosautomaticossSeleccionados=this.getPagosAutomaticossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pagosautomaticos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PagosAutomaticoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPagosAutomaticos(row);				
				iRow++;
			}				
			
			for(PagosAutomaticos pagosautomaticosAux:pagosautomaticossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPagosAutomaticos(pagosautomaticosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Automaticos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPagosAutomaticossSeleccionados() throws Exception {
		ArrayList<PagosAutomaticos> pagosautomaticossSeleccionados=new ArrayList<PagosAutomaticos>();		
		
		pagosautomaticossSeleccionados=this.getPagosAutomaticossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pagosautomaticos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("pagosautomaticoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("pagosautomaticos");
			//elementRoot.appendChild(element);
		
			for(PagosAutomaticos pagosautomaticosAux:pagosautomaticossSeleccionados) {
				element = document.createElement("pagosautomaticos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPagosAutomaticos(pagosautomaticosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pagos Automaticos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPagosAutomaticos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_FECHACORTE0);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_NOMBRECLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_NUMEROFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_NOMBREBANCO);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_VALORPORPAGAR);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_VALORCANCELADO);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_NUMEROCUENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_ESTAAUTORIZADO);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_DESCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_FECHACORTE);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_ESTADO);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPagosAutomaticos(PagosAutomaticos pagosautomaticos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautomaticos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautomaticos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautomaticos.getfecha_corte());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautomaticos.getnombre_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautomaticos.getnumero_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautomaticos.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautomaticos.getfecha_vencimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautomaticos.getnombre_banco());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautomaticos.getvalor_por_pagar());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautomaticos.getvalor_cancelado());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautomaticos.getnumero_cuenta());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautomaticos.getesta_autorizado());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautomaticos.getdescripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautomaticos.getfecha_corte_dato());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautomaticos.getestado());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautomaticos.getcodigo_cuenta_con_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(pagosautomaticos.getcodigo_cuenta_con_banco());				
	}
	
	public void setFilaDatosExportarXmlPagosAutomaticos(PagosAutomaticos pagosautomaticos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PagosAutomaticosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(pagosautomaticos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PagosAutomaticosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(pagosautomaticos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PagosAutomaticosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(pagosautomaticos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementfecha_corte = document.createElement(PagosAutomaticosConstantesFunciones.FECHACORTE0);
		elementfecha_corte.appendChild(document.createTextNode(pagosautomaticos.getfecha_corte().toString().trim()));
		element.appendChild(elementfecha_corte);

		Element elementnombre_cliente = document.createElement(PagosAutomaticosConstantesFunciones.NOMBRECLIENTE);
		elementnombre_cliente.appendChild(document.createTextNode(pagosautomaticos.getnombre_cliente().trim()));
		element.appendChild(elementnombre_cliente);

		Element elementnumero_factura = document.createElement(PagosAutomaticosConstantesFunciones.NUMEROFACTURA);
		elementnumero_factura.appendChild(document.createTextNode(pagosautomaticos.getnumero_factura().trim()));
		element.appendChild(elementnumero_factura);

		Element elementfecha_emision = document.createElement(PagosAutomaticosConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(pagosautomaticos.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementfecha_vencimiento = document.createElement(PagosAutomaticosConstantesFunciones.FECHAVENCIMIENTO);
		elementfecha_vencimiento.appendChild(document.createTextNode(pagosautomaticos.getfecha_vencimiento().toString().trim()));
		element.appendChild(elementfecha_vencimiento);

		Element elementnombre_banco = document.createElement(PagosAutomaticosConstantesFunciones.NOMBREBANCO);
		elementnombre_banco.appendChild(document.createTextNode(pagosautomaticos.getnombre_banco().trim()));
		element.appendChild(elementnombre_banco);

		Element elementvalor_por_pagar = document.createElement(PagosAutomaticosConstantesFunciones.VALORPORPAGAR);
		elementvalor_por_pagar.appendChild(document.createTextNode(pagosautomaticos.getvalor_por_pagar().toString().trim()));
		element.appendChild(elementvalor_por_pagar);

		Element elementvalor_cancelado = document.createElement(PagosAutomaticosConstantesFunciones.VALORCANCELADO);
		elementvalor_cancelado.appendChild(document.createTextNode(pagosautomaticos.getvalor_cancelado().toString().trim()));
		element.appendChild(elementvalor_cancelado);

		Element elementnumero_cuenta = document.createElement(PagosAutomaticosConstantesFunciones.NUMEROCUENTA);
		elementnumero_cuenta.appendChild(document.createTextNode(pagosautomaticos.getnumero_cuenta().trim()));
		element.appendChild(elementnumero_cuenta);

		Element elementesta_autorizado = document.createElement(PagosAutomaticosConstantesFunciones.ESTAAUTORIZADO);
		elementesta_autorizado.appendChild(document.createTextNode(pagosautomaticos.getesta_autorizado().toString().trim()));
		element.appendChild(elementesta_autorizado);

		Element elementdescripcion = document.createElement(PagosAutomaticosConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(pagosautomaticos.getdescripcion().trim()));
		element.appendChild(elementdescripcion);

		Element elementfecha_corte_dato = document.createElement(PagosAutomaticosConstantesFunciones.FECHACORTE);
		elementfecha_corte_dato.appendChild(document.createTextNode(pagosautomaticos.getfecha_corte_dato().toString().trim()));
		element.appendChild(elementfecha_corte_dato);

		Element elementestado = document.createElement(PagosAutomaticosConstantesFunciones.ESTADO);
		elementestado.appendChild(document.createTextNode(pagosautomaticos.getestado().trim()));
		element.appendChild(elementestado);

		Element elementcodigo_cuenta_con_cliente = document.createElement(PagosAutomaticosConstantesFunciones.CODIGOCUENTACONCLIENTE);
		elementcodigo_cuenta_con_cliente.appendChild(document.createTextNode(pagosautomaticos.getcodigo_cuenta_con_cliente().trim()));
		element.appendChild(elementcodigo_cuenta_con_cliente);

		Element elementcodigo_cuenta_con_banco = document.createElement(PagosAutomaticosConstantesFunciones.CODIGOCUENTACONBANCO);
		elementcodigo_cuenta_con_banco.appendChild(document.createTextNode(pagosautomaticos.getcodigo_cuenta_con_banco().trim()));
		element.appendChild(elementcodigo_cuenta_con_banco);
	}
	
	public void generarReporteGroupGenericoPagosAutomaticossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PagosAutomaticos> pagosautomaticossSeleccionados=new ArrayList<PagosAutomaticos>();
		
		pagosautomaticossSeleccionados=this.getPagosAutomaticossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPagosAutomaticos(pagosautomaticossSeleccionados);
		
		this.generarReportePagosAutomaticoss("Todos",pagosautomaticossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPagosAutomaticos(ArrayList<PagosAutomaticos> pagosautomaticossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PagosAutomaticos pagosautomaticosAux:pagosautomaticossSeleccionados) {
				pagosautomaticosAux.setsDetalleGeneralEntityReporte(pagosautomaticosAux.toString());
			
				if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					pagosautomaticosAux.setsDescripcionGeneralEntityReporte1(pagosautomaticosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_FECHACORTE0)) {
					existe=true;
					pagosautomaticosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(pagosautomaticosAux.getfecha_corte()));
				}
				 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_NOMBRECLIENTE)) {
					existe=true;
					pagosautomaticosAux.setsDescripcionGeneralEntityReporte1(pagosautomaticosAux.getnombre_cliente());
				}
				 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_NUMEROFACTURA)) {
					existe=true;
					pagosautomaticosAux.setsDescripcionGeneralEntityReporte1(pagosautomaticosAux.getnumero_factura());
				}
				 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					pagosautomaticosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(pagosautomaticosAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
					existe=true;
					pagosautomaticosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(pagosautomaticosAux.getfecha_vencimiento()));
				}
				 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_NOMBREBANCO)) {
					existe=true;
					pagosautomaticosAux.setsDescripcionGeneralEntityReporte1(pagosautomaticosAux.getnombre_banco());
				}
				 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_NUMEROCUENTA)) {
					existe=true;
					pagosautomaticosAux.setsDescripcionGeneralEntityReporte1(pagosautomaticosAux.getnumero_cuenta());
				}
				 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_ESTAAUTORIZADO)) {
					existe=true;
					pagosautomaticosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(pagosautomaticosAux.getesta_autorizado()));
				}
				 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					pagosautomaticosAux.setsDescripcionGeneralEntityReporte1(pagosautomaticosAux.getdescripcion());
				}
				 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_FECHACORTE)) {
					existe=true;
					pagosautomaticosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(pagosautomaticosAux.getfecha_corte_dato()));
				}
				 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_ESTADO)) {
					existe=true;
					pagosautomaticosAux.setsDescripcionGeneralEntityReporte1(pagosautomaticosAux.getestado());
				}
				 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE)) {
					existe=true;
					pagosautomaticosAux.setsDescripcionGeneralEntityReporte1(pagosautomaticosAux.getcodigo_cuenta_con_cliente());
				}
				 else if(sTipoSeleccionar.equals(PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO)) {
					existe=true;
					pagosautomaticosAux.setsDescripcionGeneralEntityReporte1(pagosautomaticosAux.getcodigo_cuenta_con_banco());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PagosAutomaticosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPagosAutomaticos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPagosAutomaticos=true;
				this.isVisibilidadCeldaNuevoRelacionesPagosAutomaticos=true;
				this.isVisibilidadCeldaGuardarCambiosPagosAutomaticos=true;
			}
			
			this.isVisibilidadCeldaModificarPagosAutomaticos=false;
			this.isVisibilidadCeldaActualizarPagosAutomaticos=false;
			this.isVisibilidadCeldaEliminarPagosAutomaticos=false;
			this.isVisibilidadCeldaCancelarPagosAutomaticos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPagosAutomaticos=true;
				} else {
					this.isVisibilidadCeldaGuardarPagosAutomaticos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPagosAutomaticos=false;
			this.isVisibilidadCeldaNuevoRelacionesPagosAutomaticos=false;
			this.isVisibilidadCeldaGuardarCambiosPagosAutomaticos=false;
			this.isVisibilidadCeldaModificarPagosAutomaticos=false;
			this.isVisibilidadCeldaActualizarPagosAutomaticos=true;
			this.isVisibilidadCeldaEliminarPagosAutomaticos=false;
			this.isVisibilidadCeldaCancelarPagosAutomaticos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPagosAutomaticos=true;
				} else {
					this.isVisibilidadCeldaGuardarPagosAutomaticos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPagosAutomaticos=false;
			this.isVisibilidadCeldaNuevoRelacionesPagosAutomaticos=false;
			this.isVisibilidadCeldaGuardarCambiosPagosAutomaticos=false;
			this.isVisibilidadCeldaModificarPagosAutomaticos=false;
			this.isVisibilidadCeldaActualizarPagosAutomaticos=true;
			this.isVisibilidadCeldaEliminarPagosAutomaticos=true;
			this.isVisibilidadCeldaCancelarPagosAutomaticos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPagosAutomaticos=true;
				} else {
					this.isVisibilidadCeldaGuardarPagosAutomaticos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPagosAutomaticos=false;
			this.isVisibilidadCeldaNuevoRelacionesPagosAutomaticos=false;
			this.isVisibilidadCeldaGuardarCambiosPagosAutomaticos=false;
			this.isVisibilidadCeldaModificarPagosAutomaticos=false;
			this.isVisibilidadCeldaActualizarPagosAutomaticos=true;
			this.isVisibilidadCeldaEliminarPagosAutomaticos=false;
			this.isVisibilidadCeldaCancelarPagosAutomaticos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPagosAutomaticos=false;
				} else {
					this.isVisibilidadCeldaGuardarPagosAutomaticos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPagosAutomaticos=true;
			this.isVisibilidadCeldaNuevoRelacionesPagosAutomaticos=true;
			this.isVisibilidadCeldaGuardarCambiosPagosAutomaticos=true;
			this.isVisibilidadCeldaModificarPagosAutomaticos=false;
			this.isVisibilidadCeldaActualizarPagosAutomaticos=false;
			this.isVisibilidadCeldaEliminarPagosAutomaticos=false;
			this.isVisibilidadCeldaCancelarPagosAutomaticos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPagosAutomaticos=true;
				} else {
					this.isVisibilidadCeldaGuardarPagosAutomaticos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPagosAutomaticos=false;
			this.isVisibilidadCeldaNuevoRelacionesPagosAutomaticos=false;
			this.isVisibilidadCeldaGuardarCambiosPagosAutomaticos=false;
			this.isVisibilidadCeldaActualizarPagosAutomaticos=false;
			this.isVisibilidadCeldaEliminarPagosAutomaticos=false;
			this.isVisibilidadCeldaCancelarPagosAutomaticos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPagosAutomaticos=false;
				} else {
					this.isVisibilidadCeldaGuardarPagosAutomaticos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPagosAutomaticos=false;
			this.isVisibilidadCeldaNuevoRelacionesPagosAutomaticos=false;
			this.isVisibilidadCeldaGuardarCambiosPagosAutomaticos=false;
			this.isVisibilidadCeldaModificarPagosAutomaticos=true;
			this.isVisibilidadCeldaActualizarPagosAutomaticos=false;
			this.isVisibilidadCeldaEliminarPagosAutomaticos=false;
			this.isVisibilidadCeldaCancelarPagosAutomaticos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPagosAutomaticos=false;
				} else {
					this.isVisibilidadCeldaGuardarPagosAutomaticos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PagosAutomaticosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPagosAutomaticos=true;
			this.isVisibilidadCeldaNuevoRelacionesPagosAutomaticos=true;
			this.isVisibilidadCeldaGuardarCambiosPagosAutomaticos=true;
		} else {
			this.actualizarEstadoPanelsPagosAutomaticos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPagosAutomaticos=false;
			//this.isVisibilidadCeldaVerFormPagosAutomaticos=false;
			this.isVisibilidadCeldaDuplicarPagosAutomaticos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!pagosautomaticosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPagosAutomaticos=false;
		} else {
			this.isVisibilidadCeldaNuevoPagosAutomaticos=false;
			this.isVisibilidadCeldaGuardarCambiosPagosAutomaticos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(pagosautomaticosSessionBean.getEsGuardarRelacionado()) {
			if(!pagosautomaticosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPagosAutomaticos=false;												
			}
			
			this.jButtonCerrarPagosAutomaticos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPagosAutomaticos=false;
		}
		
		if(!this.permiteMantenimiento(this.pagosautomaticos)) {
			this.isVisibilidadCeldaActualizarPagosAutomaticos=false;
			this.isVisibilidadCeldaEliminarPagosAutomaticos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoPagosAutomaticos=false;
		this.isVisibilidadCeldaNuevoRelacionesPagosAutomaticos=false;
		this.isVisibilidadCeldaGuardarCambiosPagosAutomaticos=false;
		//this.isVisibilidadCeldaModificarPagosAutomaticos=true;
		this.isVisibilidadCeldaActualizarPagosAutomaticos=false;
		this.isVisibilidadCeldaEliminarPagosAutomaticos=false;
		//this.isVisibilidadCeldaCancelarPagosAutomaticos=true;			
		this.isVisibilidadCeldaGuardarPagosAutomaticos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPagosAutomaticos() {
	}
	
	public void actualizarEstadoPanelsPagosAutomaticos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPagosAutomaticos!=null) {
				this.jScrollPanelDatosEdicionPagosAutomaticos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosAutomaticos!=null) {
				this.jTabbedPaneBusquedasPagosAutomaticos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPagosAutomaticos!=null) {
				this.jScrollPanelDatosPagosAutomaticos.setVisible(true);
			}
			
			if(this.jPanelPaginacionPagosAutomaticos!=null) {
				this.jPanelPaginacionPagosAutomaticos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPagosAutomaticos!=null) {
				this.jPanelParametrosReportesPagosAutomaticos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPagosAutomaticos!=null) {
				this.jScrollPanelDatosEdicionPagosAutomaticos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosAutomaticos!=null) {
				this.jTabbedPaneBusquedasPagosAutomaticos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPagosAutomaticos!=null) {
				this.jScrollPanelDatosPagosAutomaticos.setVisible(false);
			}
			
			if(this.jPanelPaginacionPagosAutomaticos!=null) {
				this.jPanelPaginacionPagosAutomaticos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPagosAutomaticos!=null) {
				this.jPanelParametrosReportesPagosAutomaticos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPagosAutomaticos!=null) {
				this.jScrollPanelDatosEdicionPagosAutomaticos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosAutomaticos!=null) {
				this.jTabbedPaneBusquedasPagosAutomaticos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPagosAutomaticos!=null) {
				this.jScrollPanelDatosPagosAutomaticos.setVisible(false);
			}
			
			if(this.jPanelPaginacionPagosAutomaticos!=null) {
				this.jPanelPaginacionPagosAutomaticos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPagosAutomaticos!=null) {
				this.jPanelParametrosReportesPagosAutomaticos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPagosAutomaticos!=null) {
				this.jScrollPanelDatosEdicionPagosAutomaticos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosAutomaticos!=null) {
				this.jTabbedPaneBusquedasPagosAutomaticos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPagosAutomaticos!=null) {
				this.jScrollPanelDatosPagosAutomaticos.setVisible(false);
			}
			
			if(this.jPanelPaginacionPagosAutomaticos!=null) {
				this.jPanelPaginacionPagosAutomaticos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPagosAutomaticos!=null) {
				this.jPanelParametrosReportesPagosAutomaticos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPagosAutomaticos!=null) {
				this.jScrollPanelDatosEdicionPagosAutomaticos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosAutomaticos!=null) {
				this.jTabbedPaneBusquedasPagosAutomaticos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPagosAutomaticos!=null) {
				this.jScrollPanelDatosPagosAutomaticos.setVisible(true);
			}
			
			if(this.jPanelPaginacionPagosAutomaticos!=null) {
				this.jPanelPaginacionPagosAutomaticos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPagosAutomaticos!=null) {
				this.jPanelParametrosReportesPagosAutomaticos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPagosAutomaticos!=null) {
				this.jScrollPanelDatosEdicionPagosAutomaticos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosAutomaticos!=null) {
				this.jTabbedPaneBusquedasPagosAutomaticos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPagosAutomaticos!=null) {
				this.jScrollPanelDatosPagosAutomaticos.setVisible(true);
			}
			
			if(this.jPanelPaginacionPagosAutomaticos!=null) {
				this.jPanelPaginacionPagosAutomaticos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPagosAutomaticos!=null) {
				this.jPanelParametrosReportesPagosAutomaticos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPagosAutomaticos!=null) {
				this.jScrollPanelDatosEdicionPagosAutomaticos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosAutomaticos!=null) {
				this.jTabbedPaneBusquedasPagosAutomaticos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPagosAutomaticos!=null) {
				this.jScrollPanelDatosPagosAutomaticos.setVisible(true);
			}
			
			if(this.jPanelPaginacionPagosAutomaticos!=null) {
				this.jPanelPaginacionPagosAutomaticos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPagosAutomaticos!=null) {
				this.jPanelParametrosReportesPagosAutomaticos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPagosAutomaticos!=null) {
					this.jTabbedPaneBusquedasPagosAutomaticos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPagosAutomaticos!=null) {
				this.jPanelParametrosReportesPagosAutomaticos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPagosAutomaticos!=null) {
				this.jTabbedPaneBusquedasPagosAutomaticos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPagosAutomaticos!=null) {
				this.jPanelParametrosReportesPagosAutomaticos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPagosAutomaticos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPagosAutomaticos) {this.jTabbedPaneBusquedasPagosAutomaticos.remove(jPanelBusquedaPagosAutomaticosPagosAutomaticos);}
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
			
			this.inicializarActualizarBindingTablaPagosAutomaticos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPagosAutomaticos() {
		this.updateBorderResaltarBusquedasFormularioPagosAutomaticos();
		this.updateVisibilidadBusquedasFormularioPagosAutomaticos();
		this.updateHabilitarBusquedasFormularioPagosAutomaticos();
	}
	
	public void updateBorderResaltarBusquedasFormularioPagosAutomaticos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPagosAutomaticos.getComponents().length>0) {
	

		if(this.pagosautomaticosConstantesFunciones.resaltarBusquedaPagosAutomaticosPagosAutomaticos!=null) {
			index= this.jTabbedPaneBusquedasPagosAutomaticos.indexOfComponent(this.jPanelBusquedaPagosAutomaticosPagosAutomaticos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPagosAutomaticos.getComponent(index);
				jPanel.setBorder(this.pagosautomaticosConstantesFunciones.resaltarBusquedaPagosAutomaticosPagosAutomaticos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPagosAutomaticos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPagosAutomaticos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPagosAutomaticos.indexOfComponent(this.jPanelBusquedaPagosAutomaticosPagosAutomaticos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPagosAutomaticos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.pagosautomaticosConstantesFunciones.mostrarBusquedaPagosAutomaticosPagosAutomaticos);
			if(!this.pagosautomaticosConstantesFunciones.mostrarBusquedaPagosAutomaticosPagosAutomaticos && index>-1) {
				this.jTabbedPaneBusquedasPagosAutomaticos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPagosAutomaticos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPagosAutomaticos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPagosAutomaticos.indexOfComponent(this.jPanelBusquedaPagosAutomaticosPagosAutomaticos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPagosAutomaticos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.pagosautomaticosConstantesFunciones.activarBusquedaPagosAutomaticosPagosAutomaticos);
				this.jTabbedPaneBusquedasPagosAutomaticos.setEnabledAt(index,this.pagosautomaticosConstantesFunciones.activarBusquedaPagosAutomaticosPagosAutomaticos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPagosAutomaticos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPagosAutomaticos")) {
			index= this.jTabbedPaneBusquedasPagosAutomaticos.indexOfComponent(this.jPanelBusquedaPagosAutomaticosPagosAutomaticos);

			this.jTabbedPaneBusquedasPagosAutomaticos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPagosAutomaticos.getComponent(index);

			this.pagosautomaticosConstantesFunciones.setResaltarBusquedaPagosAutomaticosPagosAutomaticos(resaltar);

			jPanel.setBorder(this.pagosautomaticosConstantesFunciones.resaltarBusquedaPagosAutomaticosPagosAutomaticos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPagosAutomaticos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPagosAutomaticos() throws Exception {

		if(this.jInternalFrameDetalleFormPagosAutomaticos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPagosAutomaticos();
		this.updateVisibilidadResaltarControlesFormularioPagosAutomaticos();
		this.updateHabilitarResaltarControlesFormularioPagosAutomaticos();
		
	}
	
	public void updateBorderResaltarControlesFormularioPagosAutomaticos() throws Exception {
		if(this.jInternalFrameDetalleFormPagosAutomaticos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.pagosautomaticosConstantesFunciones.resaltaridPagosAutomaticos!=null && this.jInternalFrameDetalleFormPagosAutomaticos!=null) {this.jInternalFrameDetalleFormPagosAutomaticos.jLabelidPagosAutomaticos.setBorder(this.pagosautomaticosConstantesFunciones.resaltaridPagosAutomaticos);}
		if(this.pagosautomaticosConstantesFunciones.resaltarid_empresaPagosAutomaticos!=null && this.jInternalFrameDetalleFormPagosAutomaticos!=null) {this.jInternalFrameDetalleFormPagosAutomaticos.jComboBoxid_empresaPagosAutomaticos.setBorder(this.pagosautomaticosConstantesFunciones.resaltarid_empresaPagosAutomaticos);}
		if(this.pagosautomaticosConstantesFunciones.resaltarfecha_cortePagosAutomaticos!=null && this.jInternalFrameDetalleFormPagosAutomaticos!=null) {this.jInternalFrameDetalleFormPagosAutomaticos.jDateChooserfecha_cortePagosAutomaticos.setBorder(this.pagosautomaticosConstantesFunciones.resaltarfecha_cortePagosAutomaticos);}
		if(this.pagosautomaticosConstantesFunciones.resaltarnombre_clientePagosAutomaticos!=null && this.jInternalFrameDetalleFormPagosAutomaticos!=null) {this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreanombre_clientePagosAutomaticos.setBorder(this.pagosautomaticosConstantesFunciones.resaltarnombre_clientePagosAutomaticos);}
		if(this.pagosautomaticosConstantesFunciones.resaltarnumero_facturaPagosAutomaticos!=null && this.jInternalFrameDetalleFormPagosAutomaticos!=null) {this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldnumero_facturaPagosAutomaticos.setBorder(this.pagosautomaticosConstantesFunciones.resaltarnumero_facturaPagosAutomaticos);}
		if(this.pagosautomaticosConstantesFunciones.resaltarfecha_emisionPagosAutomaticos!=null && this.jInternalFrameDetalleFormPagosAutomaticos!=null) {this.jInternalFrameDetalleFormPagosAutomaticos.jDateChooserfecha_emisionPagosAutomaticos.setBorder(this.pagosautomaticosConstantesFunciones.resaltarfecha_emisionPagosAutomaticos);}
		if(this.pagosautomaticosConstantesFunciones.resaltarfecha_vencimientoPagosAutomaticos!=null && this.jInternalFrameDetalleFormPagosAutomaticos!=null) {this.jInternalFrameDetalleFormPagosAutomaticos.jDateChooserfecha_vencimientoPagosAutomaticos.setBorder(this.pagosautomaticosConstantesFunciones.resaltarfecha_vencimientoPagosAutomaticos);}
		if(this.pagosautomaticosConstantesFunciones.resaltarnombre_bancoPagosAutomaticos!=null && this.jInternalFrameDetalleFormPagosAutomaticos!=null) {this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreanombre_bancoPagosAutomaticos.setBorder(this.pagosautomaticosConstantesFunciones.resaltarnombre_bancoPagosAutomaticos);}
		if(this.pagosautomaticosConstantesFunciones.resaltarvalor_por_pagarPagosAutomaticos!=null && this.jInternalFrameDetalleFormPagosAutomaticos!=null) {this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldvalor_por_pagarPagosAutomaticos.setBorder(this.pagosautomaticosConstantesFunciones.resaltarvalor_por_pagarPagosAutomaticos);}
		if(this.pagosautomaticosConstantesFunciones.resaltarvalor_canceladoPagosAutomaticos!=null && this.jInternalFrameDetalleFormPagosAutomaticos!=null) {this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldvalor_canceladoPagosAutomaticos.setBorder(this.pagosautomaticosConstantesFunciones.resaltarvalor_canceladoPagosAutomaticos);}
		if(this.pagosautomaticosConstantesFunciones.resaltarnumero_cuentaPagosAutomaticos!=null && this.jInternalFrameDetalleFormPagosAutomaticos!=null) {this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldnumero_cuentaPagosAutomaticos.setBorder(this.pagosautomaticosConstantesFunciones.resaltarnumero_cuentaPagosAutomaticos);}
		if(this.pagosautomaticosConstantesFunciones.resaltaresta_autorizadoPagosAutomaticos!=null && this.jInternalFrameDetalleFormPagosAutomaticos!=null) {this.jInternalFrameDetalleFormPagosAutomaticos.jCheckBoxesta_autorizadoPagosAutomaticos.setBorderPainted(true);this.jInternalFrameDetalleFormPagosAutomaticos.jCheckBoxesta_autorizadoPagosAutomaticos.setBorder(this.pagosautomaticosConstantesFunciones.resaltaresta_autorizadoPagosAutomaticos);}
		if(this.pagosautomaticosConstantesFunciones.resaltardescripcionPagosAutomaticos!=null && this.jInternalFrameDetalleFormPagosAutomaticos!=null) {this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreadescripcionPagosAutomaticos.setBorder(this.pagosautomaticosConstantesFunciones.resaltardescripcionPagosAutomaticos);}
		if(this.pagosautomaticosConstantesFunciones.resaltarfecha_corte_datoPagosAutomaticos!=null && this.jInternalFrameDetalleFormPagosAutomaticos!=null) {this.jInternalFrameDetalleFormPagosAutomaticos.jDateChooserfecha_corte_datoPagosAutomaticos.setBorder(this.pagosautomaticosConstantesFunciones.resaltarfecha_corte_datoPagosAutomaticos);}
		if(this.pagosautomaticosConstantesFunciones.resaltarestadoPagosAutomaticos!=null && this.jInternalFrameDetalleFormPagosAutomaticos!=null) {this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreaestadoPagosAutomaticos.setBorder(this.pagosautomaticosConstantesFunciones.resaltarestadoPagosAutomaticos);}
		if(this.pagosautomaticosConstantesFunciones.resaltarcodigo_cuenta_con_clientePagosAutomaticos!=null && this.jInternalFrameDetalleFormPagosAutomaticos!=null) {this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldcodigo_cuenta_con_clientePagosAutomaticos.setBorder(this.pagosautomaticosConstantesFunciones.resaltarcodigo_cuenta_con_clientePagosAutomaticos);}
		if(this.pagosautomaticosConstantesFunciones.resaltarcodigo_cuenta_con_bancoPagosAutomaticos!=null && this.jInternalFrameDetalleFormPagosAutomaticos!=null) {this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldcodigo_cuenta_con_bancoPagosAutomaticos.setBorder(this.pagosautomaticosConstantesFunciones.resaltarcodigo_cuenta_con_bancoPagosAutomaticos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPagosAutomaticos() throws Exception {		
		if(this.jInternalFrameDetalleFormPagosAutomaticos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) {
	
		//this.jInternalFrameDetalleFormPagosAutomaticos.jLabelidPagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostraridPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jPanelidPagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostraridPagosAutomaticos);
		//this.jInternalFrameDetalleFormPagosAutomaticos.jComboBoxid_empresaPagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostrarid_empresaPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jPanelid_empresaPagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostrarid_empresaPagosAutomaticos);
		//this.jInternalFrameDetalleFormPagosAutomaticos.jDateChooserfecha_cortePagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostrarfecha_cortePagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jPanelfecha_cortePagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostrarfecha_cortePagosAutomaticos);
		//this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreanombre_clientePagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostrarnombre_clientePagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jPanelnombre_clientePagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostrarnombre_clientePagosAutomaticos);
		//this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldnumero_facturaPagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostrarnumero_facturaPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jPanelnumero_facturaPagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostrarnumero_facturaPagosAutomaticos);
		//this.jInternalFrameDetalleFormPagosAutomaticos.jDateChooserfecha_emisionPagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostrarfecha_emisionPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jPanelfecha_emisionPagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostrarfecha_emisionPagosAutomaticos);
		//this.jInternalFrameDetalleFormPagosAutomaticos.jDateChooserfecha_vencimientoPagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostrarfecha_vencimientoPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jPanelfecha_vencimientoPagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostrarfecha_vencimientoPagosAutomaticos);
		//this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreanombre_bancoPagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostrarnombre_bancoPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jPanelnombre_bancoPagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostrarnombre_bancoPagosAutomaticos);
		//this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldvalor_por_pagarPagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostrarvalor_por_pagarPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jPanelvalor_por_pagarPagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostrarvalor_por_pagarPagosAutomaticos);
		//this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldvalor_canceladoPagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostrarvalor_canceladoPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jPanelvalor_canceladoPagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostrarvalor_canceladoPagosAutomaticos);
		//this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldnumero_cuentaPagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostrarnumero_cuentaPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jPanelnumero_cuentaPagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostrarnumero_cuentaPagosAutomaticos);
		//this.jInternalFrameDetalleFormPagosAutomaticos.jCheckBoxesta_autorizadoPagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostraresta_autorizadoPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jPanelesta_autorizadoPagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostraresta_autorizadoPagosAutomaticos);
		//this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreadescripcionPagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostrardescripcionPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jPaneldescripcionPagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostrardescripcionPagosAutomaticos);
		//this.jInternalFrameDetalleFormPagosAutomaticos.jDateChooserfecha_corte_datoPagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostrarfecha_corte_datoPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jPanelfecha_corte_datoPagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostrarfecha_corte_datoPagosAutomaticos);
		//this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreaestadoPagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostrarestadoPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jPanelestadoPagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostrarestadoPagosAutomaticos);
		//this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldcodigo_cuenta_con_clientePagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostrarcodigo_cuenta_con_clientePagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jPanelcodigo_cuenta_con_clientePagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostrarcodigo_cuenta_con_clientePagosAutomaticos);
		//this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldcodigo_cuenta_con_bancoPagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostrarcodigo_cuenta_con_bancoPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jPanelcodigo_cuenta_con_bancoPagosAutomaticos.setVisible(this.pagosautomaticosConstantesFunciones.mostrarcodigo_cuenta_con_bancoPagosAutomaticos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPagosAutomaticos() throws Exception {
		if(this.jInternalFrameDetalleFormPagosAutomaticos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPagosAutomaticos!=null) {
	
		this.jInternalFrameDetalleFormPagosAutomaticos.jLabelidPagosAutomaticos.setEnabled(this.pagosautomaticosConstantesFunciones.activaridPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jComboBoxid_empresaPagosAutomaticos.setEnabled(this.pagosautomaticosConstantesFunciones.activarid_empresaPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jDateChooserfecha_cortePagosAutomaticos.setEnabled(this.pagosautomaticosConstantesFunciones.activarfecha_cortePagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreanombre_clientePagosAutomaticos.setEnabled(this.pagosautomaticosConstantesFunciones.activarnombre_clientePagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldnumero_facturaPagosAutomaticos.setEnabled(this.pagosautomaticosConstantesFunciones.activarnumero_facturaPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jDateChooserfecha_emisionPagosAutomaticos.setEnabled(this.pagosautomaticosConstantesFunciones.activarfecha_emisionPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jDateChooserfecha_vencimientoPagosAutomaticos.setEnabled(this.pagosautomaticosConstantesFunciones.activarfecha_vencimientoPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreanombre_bancoPagosAutomaticos.setEnabled(this.pagosautomaticosConstantesFunciones.activarnombre_bancoPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldvalor_por_pagarPagosAutomaticos.setEnabled(this.pagosautomaticosConstantesFunciones.activarvalor_por_pagarPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldvalor_canceladoPagosAutomaticos.setEnabled(this.pagosautomaticosConstantesFunciones.activarvalor_canceladoPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldnumero_cuentaPagosAutomaticos.setEnabled(this.pagosautomaticosConstantesFunciones.activarnumero_cuentaPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jCheckBoxesta_autorizadoPagosAutomaticos.setEnabled(this.pagosautomaticosConstantesFunciones.activaresta_autorizadoPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreadescripcionPagosAutomaticos.setEnabled(this.pagosautomaticosConstantesFunciones.activardescripcionPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jDateChooserfecha_corte_datoPagosAutomaticos.setEnabled(this.pagosautomaticosConstantesFunciones.activarfecha_corte_datoPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jTextAreaestadoPagosAutomaticos.setEnabled(this.pagosautomaticosConstantesFunciones.activarestadoPagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldcodigo_cuenta_con_clientePagosAutomaticos.setEnabled(this.pagosautomaticosConstantesFunciones.activarcodigo_cuenta_con_clientePagosAutomaticos);
		this.jInternalFrameDetalleFormPagosAutomaticos.jTextFieldcodigo_cuenta_con_bancoPagosAutomaticos.setEnabled(this.pagosautomaticosConstantesFunciones.activarcodigo_cuenta_con_bancoPagosAutomaticos);
		}
	}
	
		
}