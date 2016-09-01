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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.contabilidad.util.ListadosPlanCuentasConstantesFunciones;
import com.bydan.erp.contabilidad.util.report.ListadosPlanCuentasParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.report.ListadosPlanCuentasParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.report.ListadosPlanCuentasBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.contabilidad.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.contabilidad.util.*;

import com.bydan.erp.contabilidad.util.report.*;
import com.bydan.erp.contabilidad.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.report.*;
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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.report.*;

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
public class ListadosPlanCuentasBeanSwingJInternalFrame extends ListadosPlanCuentasJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ListadosPlanCuentasBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ListadosPlanCuentas> listadosplancuentasValidator = new ClassValidator<ListadosPlanCuentas>(ListadosPlanCuentas.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ListadosPlanCuentas listadosplancuentas;	
	public ListadosPlanCuentas listadosplancuentasAux;
	public ListadosPlanCuentas listadosplancuentasAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ListadosPlanCuentas listadosplancuentasTotales;
	public Long idListadosPlanCuentasActual;
	public Long iIdNuevoListadosPlanCuentas=0L;
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
	
	public Boolean isPermisoTodoListadosPlanCuentas;
	public Boolean isPermisoNuevoListadosPlanCuentas;
	public Boolean isPermisoActualizarListadosPlanCuentas;
	public Boolean isPermisoActualizarOriginalListadosPlanCuentas;
	public Boolean isPermisoEliminarListadosPlanCuentas;
	public Boolean isPermisoGuardarCambiosListadosPlanCuentas;
	public Boolean isPermisoConsultaListadosPlanCuentas;
	public Boolean isPermisoBusquedaListadosPlanCuentas;
	public Boolean isPermisoReporteListadosPlanCuentas;
	public Boolean isPermisoPaginacionMedioListadosPlanCuentas;
	public Boolean isPermisoPaginacionAltoListadosPlanCuentas;
	public Boolean isPermisoPaginacionTodoListadosPlanCuentas;
	public Boolean isPermisoCopiarListadosPlanCuentas;
	public Boolean isPermisoVerFormListadosPlanCuentas;
	public Boolean isPermisoDuplicarListadosPlanCuentas;
	public Boolean isPermisoOrdenListadosPlanCuentas;
	
	
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
	
	public ListadosPlanCuentasParameterReturnGeneral listadosplancuentasReturnGeneral;
	public ListadosPlanCuentasParameterReturnGeneral listadosplancuentasParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoListadosPlanCuentas=false;
	public Boolean esParaAccionDesdeFormularioListadosPlanCuentas=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ListadosPlanCuentasSessionBeanAdditional listadosplancuentasSessionBeanAdditional=null;
	
	public ListadosPlanCuentasSessionBeanAdditional getListadosPlanCuentasSessionBeanAdditional() {
		return this.listadosplancuentasSessionBeanAdditional;
	}
	
	public void setListadosPlanCuentasSessionBeanAdditional(ListadosPlanCuentasSessionBeanAdditional listadosplancuentasSessionBeanAdditional) {
		try {
			this.listadosplancuentasSessionBeanAdditional=listadosplancuentasSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ListadosPlanCuentasBeanSwingJInternalFrameAdditional listadosplancuentasBeanSwingJInternalFrameAdditional=null;
	//public class ListadosPlanCuentasBeanSwingJInternalFrame
	
	public ListadosPlanCuentasBeanSwingJInternalFrameAdditional getListadosPlanCuentasBeanSwingJInternalFrameAdditional() {
		return this.listadosplancuentasBeanSwingJInternalFrameAdditional;
	}
	
	public void setListadosPlanCuentasBeanSwingJInternalFrameAdditional(ListadosPlanCuentasBeanSwingJInternalFrameAdditional listadosplancuentasBeanSwingJInternalFrameAdditional) {
		try {
			this.listadosplancuentasBeanSwingJInternalFrameAdditional=listadosplancuentasBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ListadosPlanCuentasLogic listadosplancuentasLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ListadosPlanCuentas listadosplancuentasBean;
	public ListadosPlanCuentasConstantesFunciones listadosplancuentasConstantesFunciones;
	//public ListadosPlanCuentasParameterReturnGeneral listadosplancuentasReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<ListadosPlanCuentas> listadosplancuentass;	
	//public List<ListadosPlanCuentas> listadosplancuentassEliminados;
	//public List<ListadosPlanCuentas> listadosplancuentassAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoListadosPlanCuentas=false;
	public Boolean isVisibilidadCeldaDuplicarListadosPlanCuentas=true;
	public Boolean isVisibilidadCeldaCopiarListadosPlanCuentas=true;
	public Boolean isVisibilidadCeldaVerFormListadosPlanCuentas=true;
	public Boolean isVisibilidadCeldaOrdenListadosPlanCuentas=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesListadosPlanCuentas=false;
	public Boolean isVisibilidadCeldaModificarListadosPlanCuentas=false;
	public Boolean isVisibilidadCeldaActualizarListadosPlanCuentas=false;
	public Boolean isVisibilidadCeldaEliminarListadosPlanCuentas=false;
	public Boolean isVisibilidadCeldaCancelarListadosPlanCuentas=false;
	public Boolean isVisibilidadCeldaGuardarListadosPlanCuentas=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosListadosPlanCuentas=false;	
	
	
	public Boolean isVisibilidadBusquedaListadosPlanCuentas=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoListadosPlanCuentas() {
		return this.iIdNuevoListadosPlanCuentas;
	}

	public void setiIdNuevoListadosPlanCuentas(Long iIdNuevoListadosPlanCuentas) {
		this.iIdNuevoListadosPlanCuentas = iIdNuevoListadosPlanCuentas;
	}
	
	public Long getidListadosPlanCuentasActual() {
		return this.idListadosPlanCuentasActual;
	}

	public void setidListadosPlanCuentasActual(Long idListadosPlanCuentasActual) {
		this.idListadosPlanCuentasActual = idListadosPlanCuentasActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ListadosPlanCuentas getlistadosplancuentas() {
		return this.listadosplancuentas;
	}

	public void setlistadosplancuentas(ListadosPlanCuentas listadosplancuentas) {
		this.listadosplancuentas = listadosplancuentas;
	}
	
	public ListadosPlanCuentas getlistadosplancuentasAux() {
		return this.listadosplancuentasAux;
	}

	public void setlistadosplancuentasAux(ListadosPlanCuentas listadosplancuentasAux) {
		this.listadosplancuentasAux = listadosplancuentasAux;
	}				
	
	public ListadosPlanCuentas getlistadosplancuentasAnterior() {
		return this.listadosplancuentasAnterior;
	}

	public void setlistadosplancuentasAnterior(ListadosPlanCuentas listadosplancuentasAnterior) {
		this.listadosplancuentasAnterior = listadosplancuentasAnterior;
	}	
	
	public ListadosPlanCuentas getlistadosplancuentasTotales() {
		return this.listadosplancuentasTotales;
	}

	public void setlistadosplancuentasTotales(ListadosPlanCuentas listadosplancuentasTotales) {
		this.listadosplancuentasTotales = listadosplancuentasTotales;
	}	
	
	public ListadosPlanCuentas getlistadosplancuentasBean() {
		return this.listadosplancuentasBean;
	}

	public void setlistadosplancuentasBean(ListadosPlanCuentas listadosplancuentasBean) {
		this.listadosplancuentasBean = listadosplancuentasBean;
	}	
	
	public ListadosPlanCuentasParameterReturnGeneral getlistadosplancuentasReturnGeneral() {
		return this.listadosplancuentasReturnGeneral;
	}

	public void setlistadosplancuentasReturnGeneral(ListadosPlanCuentasParameterReturnGeneral listadosplancuentasReturnGeneral) {
		this.listadosplancuentasReturnGeneral = listadosplancuentasReturnGeneral;
	}	
	
	
	public Long idBusquedaListadosPlanCuentas=0L;

	public Long getidBusquedaListadosPlanCuentas() {
		return this.idBusquedaListadosPlanCuentas;
	}

	public void setidBusquedaListadosPlanCuentas(Long idBusquedaListadosPlanCuentas) {
		this.idBusquedaListadosPlanCuentas = idBusquedaListadosPlanCuentas;
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
	
	
	public ListadosPlanCuentasLogic getListadosPlanCuentasLogic()	{		
		return listadosplancuentasLogic;
	}

	public void setListadosPlanCuentasLogic(ListadosPlanCuentasLogic listadosplancuentasLogic) {
		this.listadosplancuentasLogic = listadosplancuentasLogic;
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
	
	public Boolean getIsEsNuevoListadosPlanCuentas() {
		return isEsNuevoListadosPlanCuentas;
	}

	public void setIsEsNuevoListadosPlanCuentas(Boolean isEsNuevoListadosPlanCuentas) {
		this.isEsNuevoListadosPlanCuentas = isEsNuevoListadosPlanCuentas;
	}

	public Boolean getEsParaAccionDesdeFormularioListadosPlanCuentas() {
		return esParaAccionDesdeFormularioListadosPlanCuentas;
	}
	
	public void setEsParaAccionDesdeFormularioListadosPlanCuentas(Boolean esParaAccionDesdeFormularioListadosPlanCuentas) {
		this.esParaAccionDesdeFormularioListadosPlanCuentas = esParaAccionDesdeFormularioListadosPlanCuentas;
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

			if(this.listadosplancuentasSessionBean==null) {
				this.listadosplancuentasSessionBean=new ListadosPlanCuentasSessionBean();
			}

			if(!this.listadosplancuentasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(listadosplancuentasSessionBean.getlidEmpresaActual());
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

					if(this.listadosplancuentas!=null) {
						this.listadosplancuentas.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {
						this.jInternalFrameDetalleFormListadosPlanCuentas.jComboBoxid_empresaListadosPlanCuentas.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaListadosPlanCuentas.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {
						if(this.jInternalFrameDetalleFormListadosPlanCuentas.jComboBoxid_empresaListadosPlanCuentas.getItemCount()>0) {
							this.jInternalFrameDetalleFormListadosPlanCuentas.jComboBoxid_empresaListadosPlanCuentas.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaListadosPlanCuentasGenerico)throws Exception
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
				jComboBoxid_empresaListadosPlanCuentasGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaListadosPlanCuentasGenerico!=null && jComboBoxid_empresaListadosPlanCuentasGenerico.getItemCount()>0) {
					jComboBoxid_empresaListadosPlanCuentasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ListadosPlanCuentas listadosplancuentas,JComboBox jComboBoxid_empresaListadosPlanCuentasGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaListadosPlanCuentasGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormListadosPlanCuentas.jComboBoxid_empresaListadosPlanCuentas.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaListadosPlanCuentasGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				listadosplancuentas.setid_empresa(empresaAux.getId());
				listadosplancuentas.setempresa_descripcion(ListadosPlanCuentasConstantesFunciones.getEmpresaDescripcion(empresaAux));
				listadosplancuentas.setEmpresa(empresaAux);			}
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

					if(!ListadosPlanCuentasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) { 
							this.jInternalFrameDetalleFormListadosPlanCuentas.jComboBoxid_empresaListadosPlanCuentas.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormListadosPlanCuentas.jComboBoxid_empresaListadosPlanCuentas.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) { 
					}

					if(!ListadosPlanCuentasJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {
							this.jInternalFrameDetalleFormListadosPlanCuentas.jComboBoxid_empresaListadosPlanCuentas.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {
							this.jInternalFrameDetalleFormListadosPlanCuentas.jComboBoxid_empresaListadosPlanCuentas.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesListadosPlanCuentas() throws Exception {
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
		
	public ListadosPlanCuentasParameterReturnGeneral getListadosPlanCuentasParameterGeneral() {
		return this.listadosplancuentasParameterGeneral;
	}
	
	public void setListadosPlanCuentasParameterGeneral(ListadosPlanCuentasParameterReturnGeneral listadosplancuentasParameterGeneral) {
		this.listadosplancuentasParameterGeneral = listadosplancuentasParameterGeneral;
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
	
	public Boolean getIsPermisoTodoListadosPlanCuentas() {
		return isPermisoTodoListadosPlanCuentas;
	}

	public void setIsPermisoTodoListadosPlanCuentas(Boolean isPermisoTodoListadosPlanCuentas) {
		this.isPermisoTodoListadosPlanCuentas = isPermisoTodoListadosPlanCuentas;
	}

	public Boolean getIsPermisoNuevoListadosPlanCuentas() {
		return isPermisoNuevoListadosPlanCuentas;
	}

	public void setIsPermisoNuevoListadosPlanCuentas(Boolean isPermisoNuevoListadosPlanCuentas) {
		this.isPermisoNuevoListadosPlanCuentas = isPermisoNuevoListadosPlanCuentas;
	}

	public Boolean getIsPermisoActualizarListadosPlanCuentas() {
		return isPermisoActualizarListadosPlanCuentas;
	}

	public void setIsPermisoActualizarListadosPlanCuentas(Boolean isPermisoActualizarListadosPlanCuentas) {
		this.isPermisoActualizarListadosPlanCuentas = isPermisoActualizarListadosPlanCuentas;
	}

	public Boolean getIsPermisoEliminarListadosPlanCuentas() {
		return isPermisoEliminarListadosPlanCuentas;
	}

	public void setIsPermisoEliminarListadosPlanCuentas(Boolean isPermisoEliminarListadosPlanCuentas) {
		this.isPermisoEliminarListadosPlanCuentas = isPermisoEliminarListadosPlanCuentas;
	}

	public Boolean getIsPermisoGuardarCambiosListadosPlanCuentas() {
		return isPermisoGuardarCambiosListadosPlanCuentas;
	}

	public void setIsPermisoGuardarCambiosListadosPlanCuentas(Boolean isPermisoGuardarCambiosListadosPlanCuentas) {
		this.isPermisoGuardarCambiosListadosPlanCuentas = isPermisoGuardarCambiosListadosPlanCuentas;
	}
	
	public Boolean getIsPermisoConsultaListadosPlanCuentas() {
		return isPermisoConsultaListadosPlanCuentas;
	}

	public void setIsPermisoConsultaListadosPlanCuentas(Boolean isPermisoConsultaListadosPlanCuentas) {
		this.isPermisoConsultaListadosPlanCuentas = isPermisoConsultaListadosPlanCuentas;
	}

	public Boolean getIsPermisoBusquedaListadosPlanCuentas() {
		return isPermisoBusquedaListadosPlanCuentas;
	}

	public void setIsPermisoBusquedaListadosPlanCuentas(Boolean isPermisoBusquedaListadosPlanCuentas) {
		this.isPermisoBusquedaListadosPlanCuentas = isPermisoBusquedaListadosPlanCuentas;
	}

	public Boolean getIsPermisoReporteListadosPlanCuentas() {
		return isPermisoReporteListadosPlanCuentas;
	}

	public void setIsPermisoReporteListadosPlanCuentas(Boolean isPermisoReporteListadosPlanCuentas) {
		this.isPermisoReporteListadosPlanCuentas = isPermisoReporteListadosPlanCuentas;
	}
	
	public Boolean getIsPermisoPaginacionMedioListadosPlanCuentas() {
		return isPermisoPaginacionMedioListadosPlanCuentas;
	}

	public void setIsPermisoPaginacionMedioListadosPlanCuentas(Boolean isPermisoPaginacionMedioListadosPlanCuentas) {
		this.isPermisoPaginacionMedioListadosPlanCuentas = isPermisoPaginacionMedioListadosPlanCuentas;
	}
	
	public Boolean getIsPermisoPaginacionTodoListadosPlanCuentas() {
		return isPermisoPaginacionTodoListadosPlanCuentas;
	}

	public void setIsPermisoPaginacionTodoListadosPlanCuentas(Boolean isPermisoPaginacionTodoListadosPlanCuentas) {
		this.isPermisoPaginacionTodoListadosPlanCuentas = isPermisoPaginacionTodoListadosPlanCuentas;
	}
	
	public Boolean getIsPermisoPaginacionAltoListadosPlanCuentas() {
		return isPermisoPaginacionAltoListadosPlanCuentas;
	}

	public void setIsPermisoPaginacionAltoListadosPlanCuentas(Boolean isPermisoPaginacionAltoListadosPlanCuentas) {
		this.isPermisoPaginacionAltoListadosPlanCuentas = isPermisoPaginacionAltoListadosPlanCuentas;
	}
	
	public Boolean getIsPermisoCopiarListadosPlanCuentas() {
		return isPermisoCopiarListadosPlanCuentas;
	}

	public void setIsPermisoCopiarListadosPlanCuentas(Boolean isPermisoCopiarListadosPlanCuentas) {
		this.isPermisoCopiarListadosPlanCuentas = isPermisoCopiarListadosPlanCuentas;
	}
	
	public Boolean getIsPermisoVerFormListadosPlanCuentas() {
		return isPermisoVerFormListadosPlanCuentas;
	}

	public void setIsPermisoVerFormListadosPlanCuentas(Boolean isPermisoVerFormListadosPlanCuentas) {
		this.isPermisoVerFormListadosPlanCuentas = isPermisoVerFormListadosPlanCuentas;
	}
	
	public Boolean getIsPermisoDuplicarListadosPlanCuentas() {
		return isPermisoDuplicarListadosPlanCuentas;
	}

	public void setIsPermisoDuplicarListadosPlanCuentas(Boolean isPermisoDuplicarListadosPlanCuentas) {
		this.isPermisoDuplicarListadosPlanCuentas = isPermisoDuplicarListadosPlanCuentas;
	}
	
	public Boolean getIsPermisoOrdenListadosPlanCuentas() {
		return isPermisoOrdenListadosPlanCuentas;
	}

	public void setIsPermisoOrdenListadosPlanCuentas(Boolean isPermisoOrdenListadosPlanCuentas) {
		this.isPermisoOrdenListadosPlanCuentas = isPermisoOrdenListadosPlanCuentas;
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
	
	public Boolean getIsVisibilidadCeldaNuevoListadosPlanCuentas() {
		return isVisibilidadCeldaNuevoListadosPlanCuentas;
	}

	public void setIsVisibilidadCeldaNuevoListadosPlanCuentas(Boolean isVisibilidadCeldaNuevoListadosPlanCuentas) {
		this.isVisibilidadCeldaNuevoListadosPlanCuentas = isVisibilidadCeldaNuevoListadosPlanCuentas;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarListadosPlanCuentas() {
		return isVisibilidadCeldaDuplicarListadosPlanCuentas;
	}

	public void setIsVisibilidadCeldaDuplicarListadosPlanCuentas(Boolean isVisibilidadCeldaDuplicarListadosPlanCuentas) {
		this.isVisibilidadCeldaDuplicarListadosPlanCuentas = isVisibilidadCeldaDuplicarListadosPlanCuentas;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarListadosPlanCuentas() {
		return isVisibilidadCeldaCopiarListadosPlanCuentas;
	}

	public void setIsVisibilidadCeldaCopiarListadosPlanCuentas(Boolean isVisibilidadCeldaCopiarListadosPlanCuentas) {
		this.isVisibilidadCeldaCopiarListadosPlanCuentas = isVisibilidadCeldaCopiarListadosPlanCuentas;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormListadosPlanCuentas() {
		return isVisibilidadCeldaVerFormListadosPlanCuentas;
	}

	public void setIsVisibilidadCeldaVerFormListadosPlanCuentas(Boolean isVisibilidadCeldaVerFormListadosPlanCuentas) {
		this.isVisibilidadCeldaVerFormListadosPlanCuentas = isVisibilidadCeldaVerFormListadosPlanCuentas;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenListadosPlanCuentas() {
		return isVisibilidadCeldaOrdenListadosPlanCuentas;
	}

	public void setIsVisibilidadCeldaOrdenListadosPlanCuentas(Boolean isVisibilidadCeldaOrdenListadosPlanCuentas) {
		this.isVisibilidadCeldaOrdenListadosPlanCuentas = isVisibilidadCeldaOrdenListadosPlanCuentas;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesListadosPlanCuentas() {
		return isVisibilidadCeldaNuevoRelacionesListadosPlanCuentas;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesListadosPlanCuentas(Boolean isVisibilidadCeldaNuevoRelacionesListadosPlanCuentas) {
		this.isVisibilidadCeldaNuevoRelacionesListadosPlanCuentas = isVisibilidadCeldaNuevoRelacionesListadosPlanCuentas;
	}
	
	public Boolean getIsVisibilidadCeldaModificarListadosPlanCuentas() {
		return isVisibilidadCeldaModificarListadosPlanCuentas;
	}

	public void setIsVisibilidadCeldaModificarListadosPlanCuentas(Boolean isVisibilidadCeldaModificarListadosPlanCuentas) {
		this.isVisibilidadCeldaModificarListadosPlanCuentas = isVisibilidadCeldaModificarListadosPlanCuentas;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarListadosPlanCuentas() {
		return isVisibilidadCeldaActualizarListadosPlanCuentas;
	}

	public void setIsVisibilidadCeldaActualizarListadosPlanCuentas(Boolean isVisibilidadCeldaActualizarListadosPlanCuentas) {
		this.isVisibilidadCeldaActualizarListadosPlanCuentas = isVisibilidadCeldaActualizarListadosPlanCuentas;
	}

	public Boolean getIsVisibilidadCeldaEliminarListadosPlanCuentas() {
		return isVisibilidadCeldaEliminarListadosPlanCuentas;
	}

	public void setIsVisibilidadCeldaEliminarListadosPlanCuentas(Boolean isVisibilidadCeldaEliminarListadosPlanCuentas) {
		this.isVisibilidadCeldaEliminarListadosPlanCuentas = isVisibilidadCeldaEliminarListadosPlanCuentas;
	}

	public Boolean getIsVisibilidadCeldaCancelarListadosPlanCuentas() {
		return isVisibilidadCeldaCancelarListadosPlanCuentas;
	}

	public void setIsVisibilidadCeldaCancelarListadosPlanCuentas(Boolean isVisibilidadCeldaCancelarListadosPlanCuentas) {
		this.isVisibilidadCeldaCancelarListadosPlanCuentas = isVisibilidadCeldaCancelarListadosPlanCuentas;
	}

	public Boolean getIsVisibilidadCeldaGuardarListadosPlanCuentas() {
		return isVisibilidadCeldaGuardarListadosPlanCuentas;
	}

	public void setIsVisibilidadCeldaGuardarListadosPlanCuentas(Boolean isVisibilidadCeldaGuardarListadosPlanCuentas) {
		this.isVisibilidadCeldaGuardarListadosPlanCuentas = isVisibilidadCeldaGuardarListadosPlanCuentas;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosListadosPlanCuentas() {
		return isVisibilidadCeldaGuardarCambiosListadosPlanCuentas;
	}

	public void setIsVisibilidadCeldaGuardarCambiosListadosPlanCuentas(Boolean isVisibilidadCeldaGuardarCambiosListadosPlanCuentas) {
		this.isVisibilidadCeldaGuardarCambiosListadosPlanCuentas = isVisibilidadCeldaGuardarCambiosListadosPlanCuentas;
	}
		
	public ListadosPlanCuentasSessionBean getlistadosplancuentasSessionBean() {
		return this.listadosplancuentasSessionBean;
	}
	
	public void setlistadosplancuentasSessionBean(ListadosPlanCuentasSessionBean listadosplancuentasSessionBean) {
		this.listadosplancuentasSessionBean=listadosplancuentasSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaListadosPlanCuentas() {
		return this.isVisibilidadBusquedaListadosPlanCuentas;
	}

	public void setisVisibilidadBusquedaListadosPlanCuentas(Boolean isVisibilidadBusquedaListadosPlanCuentas) {
		this.isVisibilidadBusquedaListadosPlanCuentas=isVisibilidadBusquedaListadosPlanCuentas;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysListadosPlanCuentas(ListadosPlanCuentas listadosplancuentas)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(listadosplancuentas,null);
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
	
	public void bugActualizarReferenciaActual(ListadosPlanCuentas listadosplancuentas,ListadosPlanCuentas listadosplancuentasAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalListadosPlanCuentas(listadosplancuentas);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		listadosplancuentasAux.setId(listadosplancuentas.getId());
		listadosplancuentasAux.setVersionRow(listadosplancuentas.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ListadosPlanCuentas listadosplancuentasLocal) throws Exception {
		
		if(this.listadosplancuentasSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ListadosPlanCuentas listadosplancuentasLocal) throws Exception {	
		if(this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				listadosplancuentasLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarListadosPlanCuentasActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosListadosPlanCuentas.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = listadosplancuentasValidator.getInvalidValues(this.listadosplancuentas);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ListadosPlanCuentas listadosplancuentas,List<ListadosPlanCuentas> listadosplancuentass) throws Exception {
	}		
	
	public void actualizarSelectedLista(ListadosPlanCuentas listadosplancuentas,List<ListadosPlanCuentas> listadosplancuentass) throws Exception {
		try	{			
			ListadosPlanCuentasConstantesFunciones.actualizarSelectedLista(listadosplancuentas,listadosplancuentass);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ListadosPlanCuentas> listadosplancuentassLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				listadosplancuentassLocal=this.listadosplancuentasLogic.getListadosPlanCuentass();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				listadosplancuentassLocal=this.listadosplancuentass;
			}
			//ARCHITECTURE
		
			for(ListadosPlanCuentas listadosplancuentasLocal:listadosplancuentassLocal) {
				if(this.permiteMantenimiento(listadosplancuentasLocal) && listadosplancuentasLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ListadosPlanCuentasConstantesFunciones.getListadosPlanCuentasLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ListadosPlanCuentasConstantesFunciones.NOMBREMONEDA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosPlanCuentas.jLabelnombre_monedaListadosPlanCuentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosPlanCuentasConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosPlanCuentas.jLabelcodigoListadosPlanCuentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosPlanCuentasConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosPlanCuentas.jLabelnombreListadosPlanCuentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosPlanCuentasConstantesFunciones.NOMBRENIVELCUENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosPlanCuentas.jLabelnombre_nivel_cuentaListadosPlanCuentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosPlanCuentasConstantesFunciones.ESMOVIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosPlanCuentas.jLabeles_movimientoListadosPlanCuentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosPlanCuentasConstantesFunciones.ESCENTROCOSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosPlanCuentas.jLabeles_centro_costoListadosPlanCuentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosPlanCuentasConstantesFunciones.ESCENTROACTIVIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosPlanCuentas.jLabeles_centro_actividadListadosPlanCuentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosPlanCuentasConstantesFunciones.ESPARAF52)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosPlanCuentas.jLabeles_para_f52ListadosPlanCuentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosPlanCuentasConstantesFunciones.ORDEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosPlanCuentas.jLabelordenListadosPlanCuentas,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosPlanCuentas.jLabelnombre_monedaListadosPlanCuentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosPlanCuentas.jLabelcodigoListadosPlanCuentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosPlanCuentas.jLabelnombreListadosPlanCuentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosPlanCuentas.jLabelnombre_nivel_cuentaListadosPlanCuentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosPlanCuentas.jLabeles_movimientoListadosPlanCuentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosPlanCuentas.jLabeles_centro_costoListadosPlanCuentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosPlanCuentas.jLabeles_centro_actividadListadosPlanCuentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosPlanCuentas.jLabeles_para_f52ListadosPlanCuentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosPlanCuentas.jLabelordenListadosPlanCuentas,"");
		
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
		this.iIdNuevoListadosPlanCuentas--;	
		
		
		this.listadosplancuentasAux=new ListadosPlanCuentas();
		
		this.listadosplancuentasAux.setId(this.iIdNuevoListadosPlanCuentas);
		this.listadosplancuentasAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.listadosplancuentasLogic.getListadosPlanCuentass().add(this.listadosplancuentasAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.listadosplancuentass.add(this.listadosplancuentasAux);
		}
		//ARCHITECTURE
		
		this.listadosplancuentas=this.listadosplancuentasAux;
		
		if(ListadosPlanCuentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioListadosPlanCuentas(this.listadosplancuentas);
			this.setVariablesObjetoActualToFormularioForeignKeyListadosPlanCuentas(this.listadosplancuentas);
		}
				
		//this.setDefaultControlesListadosPlanCuentas();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyListadosPlanCuentas();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyListadosPlanCuentas();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyListadosPlanCuentas();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualListadosPlanCuentas(this.listadosplancuentasBean,this.listadosplancuentas,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysListadosPlanCuentas(this.listadosplancuentas);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanListadosPlanCuentas(this.listadosplancuentasReturnGeneral,this.listadosplancuentasBean,false);
		
		if(this.listadosplancuentasReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyListadosPlanCuentas(this.listadosplancuentasReturnGeneral.getListadosPlanCuentas());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioListadosPlanCuentas(this.listadosplancuentasReturnGeneral.getListadosPlanCuentas());
		}
		
		if(this.listadosplancuentasReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioListadosPlanCuentas(this.listadosplancuentasReturnGeneral.getListadosPlanCuentas(),classes);//this.listadosplancuentasBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualListadosPlanCuentas(this.listadosplancuentas,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyListadosPlanCuentas();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyListadosPlanCuentas();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ListadosPlanCuentasBeanSwingJInternalFrameAdditional.RecargarFormListadosPlanCuentas(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingListadosPlanCuentas(false);
						
			if(listadosplancuentasSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ListadosPlanCuentasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualListadosPlanCuentas();
			}
			
			this.actualizarVisualTableDatosListadosPlanCuentas();
			
			this.jTableDatosListadosPlanCuentas.setRowSelectionInterval(this.getIndiceNuevoListadosPlanCuentas(), this.getIndiceNuevoListadosPlanCuentas());
			
			this.seleccionarFilaTablaListadosPlanCuentasActual();
						
			this.actualizarEstadoCeldasBotonesListadosPlanCuentas("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesListadosPlanCuentas(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormListadosPlanCuentas.jTextFieldnombre_monedaListadosPlanCuentas.setEnabled(isHabilitar && this.listadosplancuentasConstantesFunciones.activarnombre_monedaListadosPlanCuentas);
		this.jInternalFrameDetalleFormListadosPlanCuentas.jTextFieldcodigoListadosPlanCuentas.setEnabled(isHabilitar && this.listadosplancuentasConstantesFunciones.activarcodigoListadosPlanCuentas);
		this.jInternalFrameDetalleFormListadosPlanCuentas.jTextAreanombreListadosPlanCuentas.setEnabled(isHabilitar && this.listadosplancuentasConstantesFunciones.activarnombreListadosPlanCuentas);
		this.jInternalFrameDetalleFormListadosPlanCuentas.jTextAreanombre_nivel_cuentaListadosPlanCuentas.setEnabled(isHabilitar && this.listadosplancuentasConstantesFunciones.activarnombre_nivel_cuentaListadosPlanCuentas);
		this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_movimientoListadosPlanCuentas.setEnabled(isHabilitar && this.listadosplancuentasConstantesFunciones.activares_movimientoListadosPlanCuentas);
		this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_centro_costoListadosPlanCuentas.setEnabled(isHabilitar && this.listadosplancuentasConstantesFunciones.activares_centro_costoListadosPlanCuentas);
		this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_centro_actividadListadosPlanCuentas.setEnabled(isHabilitar && this.listadosplancuentasConstantesFunciones.activares_centro_actividadListadosPlanCuentas);
		this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_para_f52ListadosPlanCuentas.setEnabled(isHabilitar && this.listadosplancuentasConstantesFunciones.activares_para_f52ListadosPlanCuentas);
		this.jInternalFrameDetalleFormListadosPlanCuentas.jTextFieldordenListadosPlanCuentas.setEnabled(isHabilitar && this.listadosplancuentasConstantesFunciones.activarordenListadosPlanCuentas);	
		//
		this.jInternalFrameDetalleFormListadosPlanCuentas.jComboBoxid_empresaListadosPlanCuentas.setEnabled(isHabilitar && this.listadosplancuentasConstantesFunciones.activarid_empresaListadosPlanCuentas);
	};
	
	public void setDefaultControlesListadosPlanCuentas() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoListadosPlanCuentas(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.listadosplancuentasSessionBean.setConGuardarRelaciones(true);			
			this.listadosplancuentasSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormListadosPlanCuentas.jTabbedPaneRelacionesListadosPlanCuentas.setVisible(true);
			
					
		} else {
			//this.listadosplancuentasSessionBean.setConGuardarRelaciones(false);			
			this.listadosplancuentasSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormListadosPlanCuentas.jTabbedPaneRelacionesListadosPlanCuentas.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoListadosPlanCuentas() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadosPlanCuentas listadosplancuentasAux:this.listadosplancuentasLogic.getListadosPlanCuentass()) {
				if(listadosplancuentasAux.getId().equals(this.iIdNuevoListadosPlanCuentas)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadosPlanCuentas listadosplancuentasAux:this.listadosplancuentass) {
				if(listadosplancuentasAux.getId().equals(this.iIdNuevoListadosPlanCuentas)) {
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
	
	public int getIndiceActualListadosPlanCuentas(ListadosPlanCuentas listadosplancuentas,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadosPlanCuentas listadosplancuentasAux:this.listadosplancuentasLogic.getListadosPlanCuentass()) {
				if(listadosplancuentasAux.getId().equals(listadosplancuentas.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadosPlanCuentas listadosplancuentasAux:this.listadosplancuentass) {
				if(listadosplancuentasAux.getId().equals(listadosplancuentas.getId())) {
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
	
	public void setCamposBaseDesdeOriginalListadosPlanCuentas(ListadosPlanCuentas listadosplancuentasOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadosPlanCuentas listadosplancuentasAux:this.listadosplancuentasLogic.getListadosPlanCuentass()) {
				if(listadosplancuentasAux.getListadosPlanCuentasOriginal().getId().equals(listadosplancuentasOriginal.getId())) {
					existe=true;
					listadosplancuentasOriginal.setId(listadosplancuentasAux.getId());
					listadosplancuentasOriginal.setVersionRow(listadosplancuentasAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadosPlanCuentas listadosplancuentasAux:this.listadosplancuentass) {
				if(listadosplancuentasAux.getListadosPlanCuentasOriginal().getId().equals(listadosplancuentasOriginal.getId())) {
					existe=true;
					listadosplancuentasOriginal.setId(listadosplancuentasAux.getId());
					listadosplancuentasOriginal.setVersionRow(listadosplancuentasAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosListadosPlanCuentas(Boolean esParaCancelar) throws Exception {
		listadosplancuentassAux=new ArrayList<ListadosPlanCuentas>();
		listadosplancuentasAux=new ListadosPlanCuentas();
		
		if(!this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ListadosPlanCuentas listadosplancuentasAux:this.listadosplancuentasLogic.getListadosPlanCuentass()) {
					if(listadosplancuentasAux.getId()<0) {
						listadosplancuentassAux.add(listadosplancuentasAux);
					}		
				}
				this.iIdNuevoListadosPlanCuentas=0L;
				this.listadosplancuentasLogic.getListadosPlanCuentass().removeAll(listadosplancuentassAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadosPlanCuentas listadosplancuentasAux:this.listadosplancuentass) {
					if(listadosplancuentasAux.getId()<0) {
						listadosplancuentassAux.add(listadosplancuentasAux);
					}		
				}
				this.iIdNuevoListadosPlanCuentas=0L;
				this.listadosplancuentass.removeAll(listadosplancuentassAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoListadosPlanCuentas 
					&& this.listadosplancuentasLogic.getListadosPlanCuentass().size()>0
					) {
					listadosplancuentasAux=this.listadosplancuentasLogic.getListadosPlanCuentass().get(this.listadosplancuentasLogic.getListadosPlanCuentass().size() - 1);
				
					if(listadosplancuentasAux.getId()<0) {
						this.listadosplancuentasLogic.getListadosPlanCuentass().remove(listadosplancuentasAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoListadosPlanCuentas && this.listadosplancuentass.size()>0) {
					listadosplancuentasAux=this.listadosplancuentass.get(this.listadosplancuentass.size() - 1);
				
					if(listadosplancuentasAux.getId()<0) {
						this.listadosplancuentass.remove(listadosplancuentasAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoListadosPlanCuentas(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(listadosplancuentas.getId()<0) {
				this.listadosplancuentasLogic.getListadosPlanCuentass().remove(this.listadosplancuentas);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(listadosplancuentas.getId()<0) {
				this.listadosplancuentass.remove(this.listadosplancuentas);
			}
		}			
	}
	
	public void setEstadosInicialesListadosPlanCuentas(List<ListadosPlanCuentas> listadosplancuentassAux) throws Exception {
		ListadosPlanCuentasConstantesFunciones.setEstadosInicialesListadosPlanCuentas(listadosplancuentassAux);
	}
	
	public void setEstadosInicialesListadosPlanCuentas(ListadosPlanCuentas listadosplancuentasAux) throws Exception {
		ListadosPlanCuentasConstantesFunciones.setEstadosInicialesListadosPlanCuentas(listadosplancuentasAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarListadosPlanCuentasActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesListadosPlanCuentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarListadosPlanCuentasActual()) {
				if(!this.isEsNuevoListadosPlanCuentas) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesListadosPlanCuentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoListadosPlanCuentas=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarListadosPlanCuentasActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Listados Plan Cuentas ?", "MANTENIMIENTO DE Listados Plan Cuentas", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesListadosPlanCuentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ListadosPlanCuentas listadosplancuentas) throws Exception {
		ListadosPlanCuentasConstantesFunciones.seleccionarAsignar(this.listadosplancuentas,listadosplancuentas);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarListadosPlanCuentas=this.isPermisoActualizarOriginalListadosPlanCuentas;
			
			
			this.seleccionarAsignar(listadosplancuentas);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesListadosPlanCuentas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.listadosplancuentasSessionBean.setsFuncionBusquedaRapida(this.listadosplancuentasSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoListadosPlanCuentas) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosListadosPlanCuentas(esParaCancelar);				
				this.cancelarNuevoListadosPlanCuentas(esParaCancelar);								
			}
			
			this.listadosplancuentas=new ListadosPlanCuentas();
			
			this.inicializarListadosPlanCuentas();
			
			this.actualizarEstadoCeldasBotonesListadosPlanCuentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarListadosPlanCuentas() throws Exception {
		try {
			ListadosPlanCuentasConstantesFunciones.inicializarListadosPlanCuentas(this.listadosplancuentas);
			
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
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.listadosplancuentasLogic.getListadosPlanCuentass().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteListadosPlanCuentass(String sAccionBusqueda,List<ListadosPlanCuentas> listadosplancuentassParaReportes) throws Exception {
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
					sPathReporteFinal="ListadosPlanCuentas"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ListadosPlanCuentasMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ListadosPlanCuentasMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ListadosPlanCuentas"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Listados Plan Cuentases");		
		parameters.put("busquedapor", ListadosPlanCuentasConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceListadosPlanCuentas=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ListadosPlanCuentasConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ListadosPlanCuentasConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceListadosPlanCuentas=new JRBeanArrayDataSource(ListadosPlanCuentasJInternalFrame.TraerListadosPlanCuentasBeans(listadosplancuentassParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceListadosPlanCuentas);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ListadosPlanCuentasConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ListadosPlanCuentasConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ListadosPlanCuentasBean.TraerListadosPlanCuentasBeans(listadosplancuentassParaReportes).toArray()));
							
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
				this.generarExcelReporteListadosPlanCuentass(sAccionBusqueda,sTipoArchivoReporte,listadosplancuentassParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalListadosPlanCuentass(sAccionBusqueda,sTipoArchivoReporte,listadosplancuentassParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoListadosPlanCuentasActionPerformed(null);
					//this.generarExcelReporteListadosPlanCuentass(sAccionBusqueda,sTipoArchivoReporte,listadosplancuentassParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalListadosPlanCuentass(sAccionBusqueda,sTipoArchivoReporte,listadosplancuentassParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesListadosPlanCuentass(sAccionBusqueda,sTipoArchivoReporte,listadosplancuentassParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesListadosPlanCuentass(sAccionBusqueda,sTipoArchivoReporte,listadosplancuentassParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteListadosPlanCuentass(String sAccionBusqueda,String sTipoArchivoReporte,List<ListadosPlanCuentas> listadosplancuentassParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadosplancuentas";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ListadosPlanCuentass");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderListadosPlanCuentas("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ListadosPlanCuentas listadosplancuentas : listadosplancuentassParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ListadosPlanCuentasConstantesFunciones.generarExcelReporteDataListadosPlanCuentas("NORMAL",row,workbook,listadosplancuentas,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Plan Cuentas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderListadosPlanCuentas(String sTipo,Row row,Workbook workbook) {
		
		ListadosPlanCuentasConstantesFunciones.generarExcelReporteHeaderListadosPlanCuentas(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalListadosPlanCuentass(String sAccionBusqueda,String sTipoArchivoReporte,List<ListadosPlanCuentas> listadosplancuentassParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadosplancuentas_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ListadosPlanCuentass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ListadosPlanCuentas listadosplancuentas : listadosplancuentassParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ListadosPlanCuentasConstantesFunciones.getListadosPlanCuentasDescripcion(listadosplancuentas));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosPlanCuentasConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosplancuentas.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosPlanCuentasConstantesFunciones.LABEL_NOMBREMONEDA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_NOMBREMONEDA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosplancuentas.getnombre_moneda());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosPlanCuentasConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosplancuentas.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosplancuentas.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRENIVELCUENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRENIVELCUENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosplancuentas.getnombre_nivel_cuenta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosPlanCuentasConstantesFunciones.LABEL_ESMOVIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_ESMOVIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(listadosplancuentas.getes_movimiento()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROCOSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROCOSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(listadosplancuentas.getes_centro_costo()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROACTIVIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROACTIVIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(listadosplancuentas.getes_centro_actividad()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosPlanCuentasConstantesFunciones.LABEL_ESPARAF52))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_ESPARAF52);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(listadosplancuentas.getes_para_f52()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosPlanCuentasConstantesFunciones.LABEL_ORDEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_ORDEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosplancuentas.getorden());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Plan Cuentas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesListadosPlanCuentass(String sAccionBusqueda,String sTipoArchivoReporte,List<ListadosPlanCuentas> listadosplancuentassParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ListadosPlanCuentas> listadosplancuentassRespaldo=null;
		
		classes=ListadosPlanCuentasConstantesFunciones.getClassesRelationshipsOfListadosPlanCuentas(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.listadosplancuentasLogic.setDatosCliente(this.datosCliente);
		this.listadosplancuentasLogic.setDatosDeep(this.datosDeep);
		this.listadosplancuentasLogic.setIsConDeep(true);
		
		listadosplancuentassRespaldo=this.listadosplancuentasLogic.getListadosPlanCuentass();
		
		this.listadosplancuentasLogic.setListadosPlanCuentass(listadosplancuentassParaReportes);	
		this.listadosplancuentasLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		listadosplancuentassParaReportes=this.listadosplancuentasLogic.getListadosPlanCuentass();
		this.listadosplancuentasLogic.setListadosPlanCuentass(listadosplancuentassRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadosplancuentas_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ListadosPlanCuentass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderListadosPlanCuentas("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ListadosPlanCuentas listadosplancuentas : listadosplancuentassParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderListadosPlanCuentas("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ListadosPlanCuentasConstantesFunciones.generarExcelReporteDataListadosPlanCuentas("NORMAL",row,workbook,listadosplancuentas,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ListadosPlanCuentasConstantesFunciones.getListadosPlanCuentasDescripcion(listadosplancuentas));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Plan Cuentas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessListadosPlanCuentas() throws Exception {		
		this.startProcessListadosPlanCuentas(true);
	}
	
	public void startProcessListadosPlanCuentas(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasListadosPlanCuentas ,this.jPanelParametrosReportesListadosPlanCuentas, this.jScrollPanelDatosListadosPlanCuentas,this.jPanelPaginacionListadosPlanCuentas, this.jScrollPanelDatosEdicionListadosPlanCuentas, this.jPanelAccionesListadosPlanCuentas,this.jPanelAccionesFormularioListadosPlanCuentas,this.jmenuBarListadosPlanCuentas,this.jmenuBarDetalleListadosPlanCuentas,this.jTtoolBarListadosPlanCuentas,this.jTtoolBarDetalleListadosPlanCuentas);		
		
		final JTabbedPane jTabbedPaneBusquedasListadosPlanCuentas=this.jTabbedPaneBusquedasListadosPlanCuentas; 
		
		final JPanel jPanelParametrosReportesListadosPlanCuentas=this.jPanelParametrosReportesListadosPlanCuentas;
		//final JScrollPane jScrollPanelDatosListadosPlanCuentas=this.jScrollPanelDatosListadosPlanCuentas;
		final JTable jTableDatosListadosPlanCuentas=this.jTableDatosListadosPlanCuentas;		
		final JPanel jPanelPaginacionListadosPlanCuentas=this.jPanelPaginacionListadosPlanCuentas;
		//final JScrollPane jScrollPanelDatosEdicionListadosPlanCuentas=this.jScrollPanelDatosEdicionListadosPlanCuentas;
		final JPanel jPanelAccionesListadosPlanCuentas=this.jPanelAccionesListadosPlanCuentas;
		
		JPanel jPanelCamposAuxiliarListadosPlanCuentas=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarListadosPlanCuentas=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {
			jPanelCamposAuxiliarListadosPlanCuentas=this.jInternalFrameDetalleFormListadosPlanCuentas.jPanelCamposListadosPlanCuentas;
			jPanelAccionesFormularioAuxiliarListadosPlanCuentas=this.jInternalFrameDetalleFormListadosPlanCuentas.jPanelAccionesFormularioListadosPlanCuentas;
		}
		
		final JPanel jPanelCamposListadosPlanCuentas=jPanelCamposAuxiliarListadosPlanCuentas;
		final JPanel jPanelAccionesFormularioListadosPlanCuentas=jPanelAccionesFormularioAuxiliarListadosPlanCuentas;
		
		
		final JMenuBar jmenuBarListadosPlanCuentas=this.jmenuBarListadosPlanCuentas;
		final JToolBar jTtoolBarListadosPlanCuentas=this.jTtoolBarListadosPlanCuentas;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarListadosPlanCuentas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarListadosPlanCuentas=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {
			jmenuBarDetalleAuxiliarListadosPlanCuentas=this.jInternalFrameDetalleFormListadosPlanCuentas.jmenuBarDetalleListadosPlanCuentas;
			jTtoolBarDetalleAuxiliarListadosPlanCuentas=this.jInternalFrameDetalleFormListadosPlanCuentas.jTtoolBarDetalleListadosPlanCuentas;
		}
		
		final JMenuBar jmenuBarDetalleListadosPlanCuentas=jmenuBarDetalleAuxiliarListadosPlanCuentas;
		final JToolBar jTtoolBarDetalleListadosPlanCuentas=jTtoolBarDetalleAuxiliarListadosPlanCuentas;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasListadosPlanCuentas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesListadosPlanCuentas;
			processRunnable.jTableDatos=jTableDatosListadosPlanCuentas;
			processRunnable.jPanelCampos=jPanelCamposListadosPlanCuentas;
			processRunnable.jPanelPaginacion=jPanelPaginacionListadosPlanCuentas;
			processRunnable.jPanelAcciones=jPanelAccionesListadosPlanCuentas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioListadosPlanCuentas;
			
			
			processRunnable.jmenuBar=jmenuBarListadosPlanCuentas;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleListadosPlanCuentas;
			processRunnable.jTtoolBar=jTtoolBarListadosPlanCuentas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleListadosPlanCuentas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasListadosPlanCuentas ,jPanelParametrosReportesListadosPlanCuentas,jTableDatosListadosPlanCuentas, /*jScrollPanelDatosListadosPlanCuentas,*/jPanelCamposListadosPlanCuentas,jPanelPaginacionListadosPlanCuentas, /*jScrollPanelDatosEdicionListadosPlanCuentas,*/ jPanelAccionesListadosPlanCuentas,jPanelAccionesFormularioListadosPlanCuentas,jmenuBarListadosPlanCuentas,jmenuBarDetalleListadosPlanCuentas,jTtoolBarListadosPlanCuentas,jTtoolBarDetalleListadosPlanCuentas);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasListadosPlanCuentas ,jPanelParametrosReportesListadosPlanCuentas, jScrollPanelDatosListadosPlanCuentas,jPanelPaginacionListadosPlanCuentas, jScrollPanelDatosEdicionListadosPlanCuentas, jPanelAccionesListadosPlanCuentas,jPanelAccionesFormularioListadosPlanCuentas,jmenuBarListadosPlanCuentas,jmenuBarDetalleListadosPlanCuentas,jTtoolBarListadosPlanCuentas,jTtoolBarDetalleListadosPlanCuentas);
						
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
	
	public void finishProcessListadosPlanCuentas() {// throws Exception 
		this.finishProcessListadosPlanCuentas(true);
	}
	
	public void finishProcessListadosPlanCuentas(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasListadosPlanCuentas ,this.jPanelParametrosReportesListadosPlanCuentas, this.jScrollPanelDatosListadosPlanCuentas,this.jPanelPaginacionListadosPlanCuentas, this.jScrollPanelDatosEdicionListadosPlanCuentas, this.jPanelAccionesListadosPlanCuentas,this.jPanelAccionesFormularioListadosPlanCuentas,this.jmenuBarListadosPlanCuentas,this.jmenuBarDetalleListadosPlanCuentas,this.jTtoolBarListadosPlanCuentas,this.jTtoolBarDetalleListadosPlanCuentas);		
		
		final JTabbedPane jTabbedPaneBusquedasListadosPlanCuentas=this.jTabbedPaneBusquedasListadosPlanCuentas; 
		
		final JPanel jPanelParametrosReportesListadosPlanCuentas=this.jPanelParametrosReportesListadosPlanCuentas;
		//final JScrollPane jScrollPanelDatosListadosPlanCuentas=this.jScrollPanelDatosListadosPlanCuentas;
		final JTable jTableDatosListadosPlanCuentas=this.jTableDatosListadosPlanCuentas;		
		final JPanel jPanelPaginacionListadosPlanCuentas=this.jPanelPaginacionListadosPlanCuentas;
		//final JScrollPane jScrollPanelDatosEdicionListadosPlanCuentas=this.jScrollPanelDatosEdicionListadosPlanCuentas;
		final JPanel jPanelAccionesListadosPlanCuentas=this.jPanelAccionesListadosPlanCuentas;
		
		JPanel jPanelCamposAuxiliarListadosPlanCuentas=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarListadosPlanCuentas=new JPanel();
		
		if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {
			jPanelCamposAuxiliarListadosPlanCuentas=this.jInternalFrameDetalleFormListadosPlanCuentas.jPanelCamposListadosPlanCuentas;
			jPanelAccionesFormularioAuxiliarListadosPlanCuentas=this.jInternalFrameDetalleFormListadosPlanCuentas.jPanelAccionesFormularioListadosPlanCuentas;
		}
		
		final JPanel jPanelCamposListadosPlanCuentas=jPanelCamposAuxiliarListadosPlanCuentas;
		final JPanel jPanelAccionesFormularioListadosPlanCuentas=jPanelAccionesFormularioAuxiliarListadosPlanCuentas;
		
		
		final JMenuBar jmenuBarListadosPlanCuentas=this.jmenuBarListadosPlanCuentas;		
		final JToolBar jTtoolBarListadosPlanCuentas=this.jTtoolBarListadosPlanCuentas;
				
		JMenuBar jmenuBarDetalleAuxiliarListadosPlanCuentas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarListadosPlanCuentas=new JToolBar();
		
		if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {
			jmenuBarDetalleAuxiliarListadosPlanCuentas=this.jInternalFrameDetalleFormListadosPlanCuentas.jmenuBarDetalleListadosPlanCuentas;
			jTtoolBarDetalleAuxiliarListadosPlanCuentas=this.jInternalFrameDetalleFormListadosPlanCuentas.jTtoolBarDetalleListadosPlanCuentas;		
		}
		
		final JMenuBar jmenuBarDetalleListadosPlanCuentas=jmenuBarDetalleAuxiliarListadosPlanCuentas;
		final JToolBar jTtoolBarDetalleListadosPlanCuentas=jTtoolBarDetalleAuxiliarListadosPlanCuentas;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasListadosPlanCuentas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesListadosPlanCuentas;
			processRunnable.jTableDatos=jTableDatosListadosPlanCuentas;
			processRunnable.jPanelCampos=jPanelCamposListadosPlanCuentas;
			processRunnable.jPanelPaginacion=jPanelPaginacionListadosPlanCuentas;
			processRunnable.jPanelAcciones=jPanelAccionesListadosPlanCuentas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioListadosPlanCuentas;
			
			
			processRunnable.jmenuBar=jmenuBarListadosPlanCuentas;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleListadosPlanCuentas;
			processRunnable.jTtoolBar=jTtoolBarListadosPlanCuentas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleListadosPlanCuentas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasListadosPlanCuentas ,jPanelParametrosReportesListadosPlanCuentas, jTableDatosListadosPlanCuentas,/*jScrollPanelDatosListadosPlanCuentas,*/jPanelCamposListadosPlanCuentas,jPanelPaginacionListadosPlanCuentas, /*jScrollPanelDatosEdicionListadosPlanCuentas,*/ jPanelAccionesListadosPlanCuentas,jPanelAccionesFormularioListadosPlanCuentas,jmenuBarListadosPlanCuentas,jmenuBarDetalleListadosPlanCuentas,jTtoolBarListadosPlanCuentas,jTtoolBarDetalleListadosPlanCuentas));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesListadosPlanCuentas(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarListadosPlanCuentas(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuListadosPlanCuentas(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarListadosPlanCuentas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarListadosPlanCuentas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleListadosPlanCuentas,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuListadosPlanCuentas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarListadosPlanCuentas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleListadosPlanCuentas,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.listadosplancuentasConstantesFunciones.getsFinalQueryListadosPlanCuentas();
		String  finalQueryPaginacionTodos=this.listadosplancuentasConstantesFunciones.getsFinalQueryListadosPlanCuentas();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ListadosPlanCuentasConstantesFunciones.getArrayColumnasGlobalesNoListadosPlanCuentas(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ListadosPlanCuentasConstantesFunciones.getArrayColumnasGlobalesListadosPlanCuentas(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ListadosPlanCuentasConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.listadosplancuentassEliminados= new ArrayList<ListadosPlanCuentas>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessListadosPlanCuentas();
		
				///*ListadosPlanCuentasSessionBean*/this.listadosplancuentasSessionBean=new ListadosPlanCuentasSessionBean();
			
			if(this.listadosplancuentasSessionBean==null) {
				this.listadosplancuentasSessionBean=new ListadosPlanCuentasSessionBean();
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
					this.iNumeroPaginacion=ListadosPlanCuentasConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ListadosPlanCuentasConstantesFunciones.getClassesForeignKeysOfListadosPlanCuentas(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/listadosplancuentas."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			listadosplancuentassAux= new ArrayList<ListadosPlanCuentas>();
			
				
			listadosplancuentasLogic.setDatosCliente(this.datosCliente);
			listadosplancuentasLogic.setDatosDeep(this.datosDeep);
			listadosplancuentasLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaListadosPlanCuentas")) {
				this.sDetalleReporte=ListadosPlanCuentasConstantesFunciones.getDetalleIndiceBusquedaListadosPlanCuentas(idBusquedaListadosPlanCuentas);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					listadosplancuentasLogic.getListadosPlanCuentassBusquedaListadosPlanCuentas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaListadosPlanCuentas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ListadosPlanCuentasConstantesFunciones.getDetalleIndiceBusquedaListadosPlanCuentas(idBusquedaListadosPlanCuentas);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ListadosPlanCuentasConstantesFunciones.getDetalleIndiceBusquedaListadosPlanCuentas(idBusquedaListadosPlanCuentas);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=listadosplancuentasLogic.getListadosPlanCuentass()==null||listadosplancuentasLogic.getListadosPlanCuentass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=listadosplancuentass==null|| listadosplancuentass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						listadosplancuentassAux=new ArrayList<ListadosPlanCuentas>();
						listadosplancuentassAux.addAll(listadosplancuentasLogic.getListadosPlanCuentass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							listadosplancuentassAux=new ArrayList<ListadosPlanCuentas>();
							listadosplancuentassAux.addAll(listadosplancuentass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							listadosplancuentasLogic.getListadosPlanCuentassBusquedaListadosPlanCuentas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaListadosPlanCuentas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ListadosPlanCuentasConstantesFunciones.getDetalleIndiceBusquedaListadosPlanCuentas(idBusquedaListadosPlanCuentas);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ListadosPlanCuentasConstantesFunciones.getDetalleIndiceBusquedaListadosPlanCuentas(idBusquedaListadosPlanCuentas);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteListadosPlanCuentass("BusquedaListadosPlanCuentas",listadosplancuentasLogic.getListadosPlanCuentass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteListadosPlanCuentass("BusquedaListadosPlanCuentas",listadosplancuentass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						listadosplancuentasLogic.setListadosPlanCuentass(new ArrayList<ListadosPlanCuentas>());
						listadosplancuentasLogic.getListadosPlanCuentass().addAll(listadosplancuentassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							listadosplancuentass=new ArrayList<ListadosPlanCuentas>();
							listadosplancuentass.addAll(listadosplancuentassAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesListadosPlanCuentas();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessListadosPlanCuentas();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=listadosplancuentasLogic.getListadosPlanCuentass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=listadosplancuentass.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=listadosplancuentasLogic.getListadosPlanCuentass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=listadosplancuentass.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ListadosPlanCuentas listadosplancuentas) {
		Boolean permite=true;
		
		if(this.listadosplancuentas.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ListadosPlanCuentasConstantesFunciones.getOrderByListaListadosPlanCuentas();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ListadosPlanCuentasConstantesFunciones.getOrderByListaListadosPlanCuentas();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadosPlanCuentas listadosplancuentas:listadosplancuentasLogic.getListadosPlanCuentass()) {
				if(listadosplancuentas.getsType().equals(Constantes2.S_TOTALES)) {
					listadosplancuentasTotales=listadosplancuentas;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadosPlanCuentas listadosplancuentas:this.listadosplancuentass) {
				if(listadosplancuentas.getsType().equals(Constantes2.S_TOTALES)) {
					listadosplancuentasTotales=listadosplancuentas;
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
			this.listadosplancuentasAux=new ListadosPlanCuentas();
			this.listadosplancuentasAux.setsType(Constantes2.S_TOTALES);
			this.listadosplancuentasAux.setIsNew(false);
			this.listadosplancuentasAux.setIsChanged(false);
			this.listadosplancuentasAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ListadosPlanCuentasConstantesFunciones.TotalizarValoresFilaListadosPlanCuentas(this.listadosplancuentasLogic.getListadosPlanCuentass(),this.listadosplancuentasAux);
				
				//this.listadosplancuentasLogic.getListadosPlanCuentass().add(this.listadosplancuentasAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ListadosPlanCuentasConstantesFunciones.TotalizarValoresFilaListadosPlanCuentas(this.listadosplancuentass,this.listadosplancuentasAux);
				
				this.listadosplancuentass.add(this.listadosplancuentasAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		listadosplancuentasTotales=new ListadosPlanCuentas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.listadosplancuentasLogic.getListadosPlanCuentass().remove(listadosplancuentasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.listadosplancuentass.remove(listadosplancuentasTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		listadosplancuentasTotales=new ListadosPlanCuentas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadosPlanCuentas listadosplancuentas:listadosplancuentasLogic.getListadosPlanCuentass()) {
				if(listadosplancuentas.getsType().equals(Constantes2.S_TOTALES)) {
					listadosplancuentasTotales=listadosplancuentas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ListadosPlanCuentasConstantesFunciones.TotalizarValoresFilaListadosPlanCuentas(this.listadosplancuentasLogic.getListadosPlanCuentass(),listadosplancuentasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadosPlanCuentas listadosplancuentas:this.listadosplancuentass) {
				if(listadosplancuentas.getsType().equals(Constantes2.S_TOTALES)) {
					listadosplancuentasTotales=listadosplancuentas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ListadosPlanCuentasConstantesFunciones.TotalizarValoresFilaListadosPlanCuentas(this.listadosplancuentass,listadosplancuentasTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getListadosPlanCuentassBusquedaListadosPlanCuentas()throws Exception {
		try {
			sAccionBusqueda="BusquedaListadosPlanCuentas";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getListadosPlanCuentassFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getListadosPlanCuentassBusquedaListadosPlanCuentas(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//listadosplancuentasLogic.getListadosPlanCuentassBusquedaListadosPlanCuentas(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getListadosPlanCuentassFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//listadosplancuentasLogic.getListadosPlanCuentassFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosListadosPlanCuentas() {
		this.isPermisoTodoListadosPlanCuentas=false;
		this.isPermisoNuevoListadosPlanCuentas=false;
		this.isPermisoActualizarListadosPlanCuentas=false;
		this.isPermisoActualizarOriginalListadosPlanCuentas=false;
		this.isPermisoEliminarListadosPlanCuentas=false;
		this.isPermisoGuardarCambiosListadosPlanCuentas=false;
		this.isPermisoConsultaListadosPlanCuentas=true;
		this.isPermisoBusquedaListadosPlanCuentas=true;
		this.isPermisoReporteListadosPlanCuentas=true;
		this.isPermisoOrdenListadosPlanCuentas=false;		
		this.isPermisoPaginacionMedioListadosPlanCuentas=false;		
		this.isPermisoPaginacionAltoListadosPlanCuentas=false;		
		this.isPermisoPaginacionTodoListadosPlanCuentas=false;		
		this.isPermisoCopiarListadosPlanCuentas=false;		
		this.isPermisoVerFormListadosPlanCuentas=false;		
		this.isPermisoDuplicarListadosPlanCuentas=false;
		this.isPermisoOrdenListadosPlanCuentas=false;
	}
	
	public void setPermisosUsuarioListadosPlanCuentas(Boolean isPermiso) {
		this.isPermisoTodoListadosPlanCuentas=isPermiso;
		this.isPermisoNuevoListadosPlanCuentas=isPermiso;
		this.isPermisoActualizarListadosPlanCuentas=isPermiso;
		this.isPermisoActualizarOriginalListadosPlanCuentas=isPermiso;
		this.isPermisoEliminarListadosPlanCuentas=isPermiso;
		this.isPermisoGuardarCambiosListadosPlanCuentas=isPermiso;
		this.isPermisoConsultaListadosPlanCuentas=isPermiso;
		this.isPermisoBusquedaListadosPlanCuentas=isPermiso;
		this.isPermisoReporteListadosPlanCuentas=isPermiso;
		this.isPermisoOrdenListadosPlanCuentas=isPermiso;		
		this.isPermisoPaginacionMedioListadosPlanCuentas=isPermiso;		
		this.isPermisoPaginacionAltoListadosPlanCuentas=isPermiso;		
		this.isPermisoPaginacionTodoListadosPlanCuentas=isPermiso;		
		this.isPermisoCopiarListadosPlanCuentas=isPermiso;		
		this.isPermisoVerFormListadosPlanCuentas=isPermiso;		
		this.isPermisoDuplicarListadosPlanCuentas=isPermiso;
		this.isPermisoOrdenListadosPlanCuentas=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioListadosPlanCuentas(Boolean isPermiso) {
		//this.isPermisoTodoListadosPlanCuentas=isPermiso;
		this.isPermisoNuevoListadosPlanCuentas=isPermiso;
		this.isPermisoActualizarListadosPlanCuentas=isPermiso;
		this.isPermisoActualizarOriginalListadosPlanCuentas=isPermiso;
		this.isPermisoEliminarListadosPlanCuentas=isPermiso;
		this.isPermisoGuardarCambiosListadosPlanCuentas=isPermiso;
		//this.isPermisoConsultaListadosPlanCuentas=isPermiso;
		//this.isPermisoBusquedaListadosPlanCuentas=isPermiso;
		//this.isPermisoReporteListadosPlanCuentas=isPermiso;
		//this.isPermisoOrdenListadosPlanCuentas=isPermiso;		
		//this.isPermisoPaginacionMedioListadosPlanCuentas=isPermiso;		
		//this.isPermisoPaginacionAltoListadosPlanCuentas=isPermiso;		
		//this.isPermisoPaginacionTodoListadosPlanCuentas=isPermiso;		
		//this.isPermisoCopiarListadosPlanCuentas=isPermiso;		
		//this.isPermisoDuplicarListadosPlanCuentas=isPermiso;
		//this.isPermisoOrdenListadosPlanCuentas=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioListadosPlanCuentasClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ListadosPlanCuentasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebListadosPlanCuentas(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioListadosPlanCuentasClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioListadosPlanCuentasClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionListadosPlanCuentasClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioListadosPlanCuentasClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioListadosPlanCuentas() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ListadosPlanCuentasJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ListadosPlanCuentasConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoListadosPlanCuentas=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarListadosPlanCuentas=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalListadosPlanCuentas=this.isPermisoActualizarListadosPlanCuentas;
			this.isPermisoEliminarListadosPlanCuentas=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosListadosPlanCuentas=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaListadosPlanCuentas=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaListadosPlanCuentas=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoListadosPlanCuentas=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteListadosPlanCuentas=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenListadosPlanCuentas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioListadosPlanCuentas=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoListadosPlanCuentas=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoListadosPlanCuentas=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarListadosPlanCuentas=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormListadosPlanCuentas=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarListadosPlanCuentas=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenListadosPlanCuentas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosListadosPlanCuentas.setToolTipText(this.jTableDatosListadosPlanCuentas.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioListadosPlanCuentas(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioListadosPlanCuentas(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ListadosPlanCuentasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ListadosPlanCuentasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioListadosPlanCuentas() throws Exception {
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
	public void inicializarCombosForeignKeyListadosPlanCuentasListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyListadosPlanCuentasListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ListadosPlanCuentasJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyListadosPlanCuentas()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.listadosplancuentasSessionBean==null) {
				this.listadosplancuentasSessionBean=new ListadosPlanCuentasSessionBean();
			}

			if(!this.listadosplancuentasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyListadosPlanCuentas()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyListadosPlanCuentas(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyListadosPlanCuentas()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyListadosPlanCuentas();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyListadosPlanCuentas(ListadosPlanCuentas listadosplancuentas)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyListadosPlanCuentas(ListadosPlanCuentas listadosplancuentas,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyListadosPlanCuentas()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyListadosPlanCuentas()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyListadosPlanCuentas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyListadosPlanCuentas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroListadosPlanCuentas()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyListadosPlanCuentas()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyListadosPlanCuentas(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyListadosPlanCuentas()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormListadosPlanCuentas.jComboBoxid_empresaListadosPlanCuentas!=null && this.jInternalFrameDetalleFormListadosPlanCuentas.jComboBoxid_empresaListadosPlanCuentas.getItemCount()>0) {
				this.jInternalFrameDetalleFormListadosPlanCuentas.jComboBoxid_empresaListadosPlanCuentas.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public ListadosPlanCuentasBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ListadosPlanCuentasBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ListadosPlanCuentasBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.listadosplancuentasSessionBean=new ListadosPlanCuentasSessionBean(); 
		this.listadosplancuentasConstantesFunciones=new ListadosPlanCuentasConstantesFunciones(); 
		this.listadosplancuentasBean=new ListadosPlanCuentas();//(this.listadosplancuentasConstantesFunciones); 		
		this.listadosplancuentasReturnGeneral=new ListadosPlanCuentasParameterReturnGeneral(); 
		
		this.listadosplancuentasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.listadosplancuentasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ListadosPlanCuentasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ListadosPlanCuentasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ListadosPlanCuentasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessListadosPlanCuentas(true);
			
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
			
			this.listadosplancuentasConstantesFunciones=new ListadosPlanCuentasConstantesFunciones(); 
			this.listadosplancuentasBean=new ListadosPlanCuentas();//this.listadosplancuentasConstantesFunciones); 			
			this.listadosplancuentasReturnGeneral=new ListadosPlanCuentasParameterReturnGeneral(); 
		
			ListadosPlanCuentasBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Listados Plan Cuentas Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.listadosplancuentas=new ListadosPlanCuentas();
			this.listadosplancuentass = new ArrayList<ListadosPlanCuentas>();
			this.listadosplancuentassAux = new ArrayList<ListadosPlanCuentas>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic=new ListadosPlanCuentasLogic();
				this.listadosplancuentasLogic.getNewConnexionToDeep("");
			}
			
			//this.listadosplancuentasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.listadosplancuentasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormListadosPlanCuentas);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoListadosPlanCuentas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoListadosPlanCuentas);	
					}
					
					if(this.jInternalFrameImportacionListadosPlanCuentas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionListadosPlanCuentas);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByListadosPlanCuentas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByListadosPlanCuentas);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormListadosPlanCuentas);
				this.jInternalFrameDetalleFormListadosPlanCuentas.setVisible(false);
				this.jInternalFrameDetalleFormListadosPlanCuentas.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoListadosPlanCuentas!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoListadosPlanCuentas);
					this.jInternalFrameReporteDinamicoListadosPlanCuentas.setVisible(false);
					this.jInternalFrameReporteDinamicoListadosPlanCuentas.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionListadosPlanCuentas!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionListadosPlanCuentas);
					this.jInternalFrameImportacionListadosPlanCuentas.setVisible(false);
					this.jInternalFrameImportacionListadosPlanCuentas.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByListadosPlanCuentas!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByListadosPlanCuentas);
					this.jInternalFrameOrderByListadosPlanCuentas.setVisible(false);
					this.jInternalFrameOrderByListadosPlanCuentas.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idListadosPlanCuentasActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ListadosPlanCuentasConstantesFunciones.INUMEROPAGINACION;
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
			
			this.listadosplancuentasReturnGeneral=new ListadosPlanCuentasParameterReturnGeneral();
			
			this.listadosplancuentasParameterGeneral=new ListadosPlanCuentasParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.listadosplancuentasLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ListadosPlanCuentasJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ListadosPlanCuentasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.listadosplancuentasSessionBean.getEsGuardarRelacionado(),this.listadosplancuentasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ListadosPlanCuentasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.listadosplancuentasSessionBean.getEsGuardarRelacionado(),this.listadosplancuentasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoListadosPlanCuentas=false;
			this.isVisibilidadCeldaDuplicarListadosPlanCuentas=true;
			this.isVisibilidadCeldaCopiarListadosPlanCuentas=true;
			this.isVisibilidadCeldaVerFormListadosPlanCuentas=true;
			this.isVisibilidadCeldaOrdenListadosPlanCuentas=true;
			this.isVisibilidadCeldaNuevoRelacionesListadosPlanCuentas=false;
			this.isVisibilidadCeldaModificarListadosPlanCuentas=false;
			this.isVisibilidadCeldaActualizarListadosPlanCuentas=false;
			this.isVisibilidadCeldaEliminarListadosPlanCuentas=false;
			this.isVisibilidadCeldaCancelarListadosPlanCuentas=false;
			this.isVisibilidadCeldaGuardarListadosPlanCuentas=false;
			this.isVisibilidadCeldaGuardarCambiosListadosPlanCuentas=false;
			
			
			this.isVisibilidadBusquedaListadosPlanCuentas=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesListadosPlanCuentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosListadosPlanCuentas();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioListadosPlanCuentas(false);
			
			this.setPermisosUsuarioListadosPlanCuentas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.listadosplancuentasSessionBean.getEsGuardarRelacionado() 
				|| (this.listadosplancuentasSessionBean.getEsGuardarRelacionado() && this.listadosplancuentasSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioListadosPlanCuentasClasesRelacionadas();
			}
			
			if(this.listadosplancuentasSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioListadosPlanCuentasClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ListadosPlanCuentasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosListadosPlanCuentas();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualListadosPlanCuentas();
			}
			
			if(!this.isPermisoBusquedaListadosPlanCuentas) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasListadosPlanCuentas.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ListadosPlanCuentasConstantesFunciones.getTiposSeleccionarListadosPlanCuentas());
				
				this.tiposColumnasSelect=ListadosPlanCuentasConstantesFunciones.getTiposSeleccionarListadosPlanCuentas(true);
				
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
			//if(!this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioListadosPlanCuentas();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioListadosPlanCuentas(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioListadosPlanCuentas(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesListadosPlanCuentas() ;
			
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
				listadosplancuentasImplementable= (ListadosPlanCuentasImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ListadosPlanCuentasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				listadosplancuentasImplementableHome= (ListadosPlanCuentasImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ListadosPlanCuentasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.listadosplancuentass= new ArrayList<ListadosPlanCuentas>();
			this.listadosplancuentassEliminados= new ArrayList<ListadosPlanCuentas>();
						
			this.isEsNuevoListadosPlanCuentas=false;
			this.esParaAccionDesdeFormularioListadosPlanCuentas=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyListadosPlanCuentas(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroListadosPlanCuentas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ListadosPlanCuentasBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ListadosPlanCuentasConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesListadosPlanCuentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingListadosPlanCuentas(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioListadosPlanCuentas();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioListadosPlanCuentas();
			}
			
			ListadosPlanCuentasBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasListadosPlanCuentas.getTabCount(); i++) {
					this.jTabbedPaneBusquedasListadosPlanCuentas.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasListadosPlanCuentas.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessListadosPlanCuentas(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ListadosPlanCuentas: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectListadosPlanCuentas() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesListadosPlanCuentas")) {
				iIndex=this.jInternalFrameDetalleFormListadosPlanCuentas.jTabbedPaneRelacionesListadosPlanCuentas.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormListadosPlanCuentas.jTabbedPaneRelacionesListadosPlanCuentas.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosListadosPlanCuentas.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessListadosPlanCuentas();	
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
	
	public void cargarCombosForeignKeyListadosPlanCuentas(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyListadosPlanCuentas(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyListadosPlanCuentas(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyListadosPlanCuentasListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyListadosPlanCuentas();
		
		this.cargarCombosFrameForeignKeyListadosPlanCuentas();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyListadosPlanCuentas();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyListadosPlanCuentas();
		}
	}
	
	
	
	public void jButtonNuevoListadosPlanCuentasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.listadosplancuentasSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormListadosPlanCuentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
			
			
			if(jTableDatosListadosPlanCuentas.getRowCount()>=1) {
				jTableDatosListadosPlanCuentas.removeRowSelectionInterval(0, jTableDatosListadosPlanCuentas.getRowCount()-1);						
			}
			
			this.isEsNuevoListadosPlanCuentas=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoListadosPlanCuentas(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesListadosPlanCuentas(true);			
			//this.listadosplancuentas=new ListadosPlanCuentas();
			//this.listadosplancuentas.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesListadosPlanCuentas(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadosPlanCuentas() ;
			
			if(ListadosPlanCuentasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleListadosPlanCuentas(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.listadosplancuentas);	
			this.actualizarInformacion("INFO_PADRE",false,this.listadosplancuentas);				
			
			ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
			
			if(this.listadosplancuentasSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ListadosPlanCuentas: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarListadosPlanCuentasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ListadosPlanCuentas> listadosplancuentassSeleccionados=new ArrayList<ListadosPlanCuentas>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosListadosPlanCuentas.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosListadosPlanCuentas.getSelectedRows().length;			
			}
			
			listadosplancuentassSeleccionados=this.getListadosPlanCuentassSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoListadosPlanCuentas--;			
				//ListadosPlanCuentas listadosplancuentasAux= new ListadosPlanCuentas();			
				//listadosplancuentasAux.setId(this.iIdNuevoListadosPlanCuentas);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ListadosPlanCuentas listadosplancuentasOrigen=new ListadosPlanCuentas();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ListadosPlanCuentas listadosplancuentasOrigen : listadosplancuentassSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosListadosPlanCuentas.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							listadosplancuentasOrigen =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							listadosplancuentasOrigen =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaListadosPlanCuentas();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.listadosplancuentas.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosListadosPlanCuentas(listadosplancuentasOrigen,this.listadosplancuentas,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysListadosPlanCuentas(this.listadosplancuentas);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.listadosplancuentasLogic.getListadosPlanCuentass().add(this.listadosplancuentasAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.listadosplancuentass.add(this.listadosplancuentasAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaListadosPlanCuentas(false);
				
				this.jTableDatosListadosPlanCuentas.setRowSelectionInterval(this.getIndiceNuevoListadosPlanCuentas(), this.getIndiceNuevoListadosPlanCuentas());
				
				int iLastRow =  this.jTableDatosListadosPlanCuentas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosListadosPlanCuentas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosListadosPlanCuentas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaListadosPlanCuentas(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarListadosPlanCuentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ListadosPlanCuentas> listadosplancuentassSeleccionados=new ArrayList<ListadosPlanCuentas>();									
		
			ListadosPlanCuentas listadosplancuentasOrigen=new ListadosPlanCuentas();
			ListadosPlanCuentas listadosplancuentasDestino=new ListadosPlanCuentas();
				
			listadosplancuentassSeleccionados=this.getListadosPlanCuentassSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosListadosPlanCuentas.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || listadosplancuentassSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosListadosPlanCuentas.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						listadosplancuentasOrigen =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						listadosplancuentasOrigen =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						listadosplancuentasDestino =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						listadosplancuentasDestino =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				listadosplancuentasOrigen =listadosplancuentassSeleccionados.get(0);
				listadosplancuentasDestino =listadosplancuentassSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosListadosPlanCuentas(listadosplancuentasOrigen,listadosplancuentasDestino,true,false);
				
				listadosplancuentasDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(listadosplancuentasDestino,listadosplancuentasLogic.getListadosPlanCuentass());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(listadosplancuentasDestino,listadosplancuentass);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaListadosPlanCuentas(false);
				
				//this.jTableDatosListadosPlanCuentas.setRowSelectionInterval(this.getIndiceNuevoListadosPlanCuentas(), this.getIndiceNuevoListadosPlanCuentas());
				
				int iLastRow =  this.jTableDatosListadosPlanCuentas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosListadosPlanCuentas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosListadosPlanCuentas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaListadosPlanCuentas(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormListadosPlanCuentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormListadosPlanCuentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormListadosPlanCuentas.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarListadosPlanCuentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesListadosPlanCuentas.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasListadosPlanCuentas.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesListadosPlanCuentas.setVisible(!isVisible);
			this.jPanelPaginacionListadosPlanCuentas.setVisible(!isVisible);
			this.jPanelAccionesListadosPlanCuentas.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarListadosPlanCuentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameListadosPlanCuentas();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoListadosPlanCuentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoListadosPlanCuentas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionListadosPlanCuentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionListadosPlanCuentas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByListadosPlanCuentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByListadosPlanCuentas();
			
			this.abrirFrameOrderByListadosPlanCuentas();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByListadosPlanCuentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByListadosPlanCuentas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleListadosPlanCuentas(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormListadosPlanCuentas);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormListadosPlanCuentas.isMaximum()) {
					this.jInternalFrameDetalleFormListadosPlanCuentas.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormListadosPlanCuentas.setSize(this.jInternalFrameDetalleFormListadosPlanCuentas.iWidthFormulario,this.jInternalFrameDetalleFormListadosPlanCuentas.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormListadosPlanCuentas.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormListadosPlanCuentas.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormListadosPlanCuentas.isMaximum()) {
						this.jInternalFrameDetalleFormListadosPlanCuentas.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormListadosPlanCuentas.jContentPaneDetalleListadosPlanCuentas.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormListadosPlanCuentas.jTabbedPaneRelacionesListadosPlanCuentas.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormListadosPlanCuentas.jContentPaneDetalleListadosPlanCuentas.getWidth(),ListadosPlanCuentasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormListadosPlanCuentas.jTabbedPaneRelacionesListadosPlanCuentas.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormListadosPlanCuentas.jContentPaneDetalleListadosPlanCuentas.getWidth(),ListadosPlanCuentasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormListadosPlanCuentas.jTabbedPaneRelacionesListadosPlanCuentas.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormListadosPlanCuentas.jContentPaneDetalleListadosPlanCuentas.getWidth(),ListadosPlanCuentasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormListadosPlanCuentas.setVisible(true);
	        this.jInternalFrameDetalleFormListadosPlanCuentas.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByListadosPlanCuentas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByListadosPlanCuentas==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByListadosPlanCuentas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadosPlanCuentas,false,this);
				} else {
					this.jInternalFrameOrderByListadosPlanCuentas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadosPlanCuentas,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByListadosPlanCuentas);
				this.jInternalFrameOrderByListadosPlanCuentas.setVisible(false);
				this.jInternalFrameOrderByListadosPlanCuentas.setSelected(false);
				
				this.jInternalFrameOrderByListadosPlanCuentas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByListadosPlanCuentas"));
				
				this.inicializarActualizarBindingTablaOrderByListadosPlanCuentas();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionListadosPlanCuentas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionListadosPlanCuentas==null) {
				
				this.jInternalFrameImportacionListadosPlanCuentas=new ImportacionJInternalFrame(ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionListadosPlanCuentas);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionListadosPlanCuentas);
				this.jInternalFrameImportacionListadosPlanCuentas.setVisible(false);
				this.jInternalFrameImportacionListadosPlanCuentas.setSelected(false);


				this.jInternalFrameImportacionListadosPlanCuentas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionListadosPlanCuentas"));
				this.jInternalFrameImportacionListadosPlanCuentas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionListadosPlanCuentas"));
				this.jInternalFrameImportacionListadosPlanCuentas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionListadosPlanCuentas"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoListadosPlanCuentas() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoListadosPlanCuentas==null) {
				this.jInternalFrameReporteDinamicoListadosPlanCuentas=new ReporteDinamicoJInternalFrame(ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoListadosPlanCuentas);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoListadosPlanCuentas);
				this.jInternalFrameReporteDinamicoListadosPlanCuentas.setVisible(false);
				this.jInternalFrameReporteDinamicoListadosPlanCuentas.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoListadosPlanCuentas"));
				this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoListadosPlanCuentas"));
				this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoListadosPlanCuentas"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualListadosPlanCuentas();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleListadosPlanCuentas() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormListadosPlanCuentas);
			
	       	this.jInternalFrameDetalleFormListadosPlanCuentas.setVisible(false);
	        this.jInternalFrameDetalleFormListadosPlanCuentas.setSelected(false);
			
			//this.jInternalFrameDetalleFormListadosPlanCuentas.dispose();
			//this.jInternalFrameDetalleFormListadosPlanCuentas=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoListadosPlanCuentas() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoListadosPlanCuentas.setVisible(true);
	        this.jInternalFrameReporteDinamicoListadosPlanCuentas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionListadosPlanCuentas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionListadosPlanCuentas.setVisible(true);
	        this.jInternalFrameImportacionListadosPlanCuentas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByListadosPlanCuentas() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByListadosPlanCuentas.setVisible(true);
	        this.jInternalFrameOrderByListadosPlanCuentas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByListadosPlanCuentas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByListadosPlanCuentas.setVisible(false);
	        this.jInternalFrameOrderByListadosPlanCuentas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoListadosPlanCuentas() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoListadosPlanCuentas.setVisible(false);
	        this.jInternalFrameReporteDinamicoListadosPlanCuentas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionListadosPlanCuentas() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionListadosPlanCuentas.setVisible(false);
	        this.jInternalFrameImportacionListadosPlanCuentas.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarListadosPlanCuentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarListadosPlanCuentas(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarListadosPlanCuentas(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosListadosPlanCuentas.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesListadosPlanCuentas(true);
			//this.isEsNuevoListadosPlanCuentas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesListadosPlanCuentas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesListadosPlanCuentas(false) ;
			
			if(listadosplancuentasSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ListadosPlanCuentasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleListadosPlanCuentas(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadosPlanCuentas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaListadosPlanCuentasActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosListadosPlanCuentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarListadosPlanCuentas(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormListadosPlanCuentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosListadosPlanCuentas.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesListadosPlanCuentas(true);
			//this.isEsNuevoListadosPlanCuentas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.listadosplancuentas.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesListadosPlanCuentas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesListadosPlanCuentas(false) ;
			
			if(ListadosPlanCuentasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleListadosPlanCuentas(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadosPlanCuentas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarListadosPlanCuentasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesListadosPlanCuentas(false);
			
			//if(!this.isEsNuevoListadosPlanCuentas) {								
				int intSelectedRow = this.jTableDatosListadosPlanCuentas.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ListadosPlanCuentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualListadosPlanCuentas(this.listadosplancuentas,true);
				this.setVariablesFormularioToObjetoActualForeignKeysListadosPlanCuentas(this.listadosplancuentas);
				
			}
			
			if(this.permiteMantenimiento(this.listadosplancuentas)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoListadosPlanCuentas=true;
					this.inicializarActualizarBindingTablaListadosPlanCuentas(false);
					this.isEsNuevoListadosPlanCuentas=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoListadosPlanCuentas=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoListadosPlanCuentas=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesListadosPlanCuentas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualListadosPlanCuentas(false);
				
				this.habilitarDeshabilitarControlesListadosPlanCuentas(false);
			
												
				
				if(ListadosPlanCuentasJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleListadosPlanCuentas();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoListadosPlanCuentasActionPerformed(evt,listadosplancuentasSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualListadosPlanCuentas(this.listadosplancuentas,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosListadosPlanCuentas.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,listadosplancuentasSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.listadosplancuentas.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ListadosPlanCuentas.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosPlanCuentas.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarListadosPlanCuentasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosListadosPlanCuentas.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
				this.listadosplancuentas.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
				this.listadosplancuentas.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.listadosplancuentas)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ListadosPlanCuentasModel) this.jTableDatosListadosPlanCuentas.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoListadosPlanCuentas=true;
				this.inicializarActualizarBindingTablaListadosPlanCuentas(false);
				this.isEsNuevoListadosPlanCuentas=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesListadosPlanCuentas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualListadosPlanCuentas(false);
				
				this.habilitarDeshabilitarControlesListadosPlanCuentas(false);
				
				
				
				if(ListadosPlanCuentasJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleListadosPlanCuentas();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarListadosPlanCuentasActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosListadosPlanCuentas.getRowCount()>=1) {
				jTableDatosListadosPlanCuentas.removeRowSelectionInterval(0, jTableDatosListadosPlanCuentas.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesListadosPlanCuentas(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaListadosPlanCuentas(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesListadosPlanCuentas(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadosPlanCuentas(false) ;
			
			this.isEsNuevoListadosPlanCuentas=false;
			
			if(ListadosPlanCuentasJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleListadosPlanCuentas();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosListadosPlanCuentasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingListadosPlanCuentas(false);
				
				//SI ES MANUAL
				if(ListadosPlanCuentasJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualListadosPlanCuentas();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosListadosPlanCuentasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoListadosPlanCuentas--;			
			//ListadosPlanCuentas listadosplancuentasAux= new ListadosPlanCuentas();			
			//listadosplancuentasAux.setId(this.iIdNuevoListadosPlanCuentas);
			
			if(this.jInternalFrameDetalleFormListadosPlanCuentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaListadosPlanCuentas();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysListadosPlanCuentas(this.listadosplancuentas);
			
			this.listadosplancuentas.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.listadosplancuentasLogic.getListadosPlanCuentass().add(this.listadosplancuentasAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.listadosplancuentass.add(this.listadosplancuentasAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaListadosPlanCuentas(false);
			
			this.jTableDatosListadosPlanCuentas.setRowSelectionInterval(this.getIndiceNuevoListadosPlanCuentas(), this.getIndiceNuevoListadosPlanCuentas());
			
			int iLastRow =  this.jTableDatosListadosPlanCuentas.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosListadosPlanCuentas.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosListadosPlanCuentas.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaListadosPlanCuentas(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionListadosPlanCuentasActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingListadosPlanCuentas(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadosPlanCuentas(false);
			
			//SI ES MANUAL
			if(ListadosPlanCuentasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualListadosPlanCuentas();
			}
			
			//this.abrirFrameTreeListadosPlanCuentas();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionListadosPlanCuentasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionListadosPlanCuentasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionListadosPlanCuentas.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionListadosPlanCuentas.setFileImportacion(this.jInternalFrameImportacionListadosPlanCuentas.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionListadosPlanCuentas.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionListadosPlanCuentas.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionListadosPlanCuentas.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionListadosPlanCuentas.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoListadosPlanCuentasActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ListadosPlanCuentas> listadosplancuentassSeleccionados=new ArrayList<ListadosPlanCuentas>();		

		listadosplancuentassSeleccionados=this.getListadosPlanCuentassSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ListadosPlanCuentasBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ListadosPlanCuentasBaseDesign.jrxml";
			
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
			
			this.generarReporteListadosPlanCuentass("Todos",listadosplancuentassSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Plan Cuentas",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ListadosPlanCuentasConstantesFunciones.LABEL_NOMBREMONEDA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreMoneda_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreMoneda_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreMoneda_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreMoneda_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRENIVELCUENTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreNivelCuenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreNivelCuenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreNivelCuenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreNivelCuenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_ESMOVIMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Movimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Movimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Movimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Movimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROCOSTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CentroCosto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CentroCosto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CentroCosto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CentroCosto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROACTIVIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CentroActividad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CentroActividad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CentroActividad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CentroActividad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_ESPARAF52:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ParaF52_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ParaF52_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ParaF52_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ParaF52_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_ORDEN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_den_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_den_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_den_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_den_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ListadosPlanCuentasConstantesFunciones.LABEL_NOMBREMONEDA:
					sNombreCampoCategoria="nombre_moneda";
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRENIVELCUENTA:
					sNombreCampoCategoria="nombre_nivel_cuenta";
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_ESMOVIMIENTO:
					sNombreCampoCategoria="es_movimiento";
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROCOSTO:
					sNombreCampoCategoria="es_centro_costo";
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROACTIVIDAD:
					sNombreCampoCategoria="es_centro_actividad";
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_ESPARAF52:
					sNombreCampoCategoria="es_para_f52";
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_ORDEN:
					sNombreCampoCategoria="orden";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ListadosPlanCuentasConstantesFunciones.LABEL_NOMBREMONEDA:
					sNombreCampoCategoriaValor="nombre_moneda";
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRENIVELCUENTA:
					sNombreCampoCategoriaValor="nombre_nivel_cuenta";
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_ESMOVIMIENTO:
					sNombreCampoCategoriaValor="es_movimiento";
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROCOSTO:
					sNombreCampoCategoriaValor="es_centro_costo";
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROACTIVIDAD:
					sNombreCampoCategoriaValor="es_centro_actividad";
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_ESPARAF52:
					sNombreCampoCategoriaValor="es_para_f52";
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_ORDEN:
					sNombreCampoCategoriaValor="orden";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ListadosPlanCuentasConstantesFunciones.LABEL_NOMBREMONEDA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Moneda",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_moneda");
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRENIVELCUENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Nivel Cuenta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_nivel_cuenta");
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_ESMOVIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Movimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_movimiento");
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROCOSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Centro Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_centro_costo");
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROACTIVIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Centro Activad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_centro_actividad");
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_ESPARAF52:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Para F52",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_para_f52");
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_ORDEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Orden",sNombreCampoCategoria,sNombreCampoCategoriaValor,"orden");
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
	
	public void jButtonGenerarExcelReporteDinamicoListadosPlanCuentasActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ListadosPlanCuentas> listadosplancuentassSeleccionados=new ArrayList<ListadosPlanCuentas>();		
		
		listadosplancuentassSeleccionados=this.getListadosPlanCuentassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadosplancuentas";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ListadosPlanCuentass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ListadosPlanCuentasConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ListadosPlanCuentas listadosplancuentas:listadosplancuentassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosplancuentas.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_NOMBREMONEDA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_NOMBREMONEDA);
					iRow++;

					for(ListadosPlanCuentas listadosplancuentas:listadosplancuentassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosplancuentas.getnombre_moneda());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ListadosPlanCuentas listadosplancuentas:listadosplancuentassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosplancuentas.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ListadosPlanCuentas listadosplancuentas:listadosplancuentassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosplancuentas.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRENIVELCUENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRENIVELCUENTA);
					iRow++;

					for(ListadosPlanCuentas listadosplancuentas:listadosplancuentassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosplancuentas.getnombre_nivel_cuenta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_ESMOVIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_ESMOVIMIENTO);
					iRow++;

					for(ListadosPlanCuentas listadosplancuentas:listadosplancuentassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosplancuentas.getes_movimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROCOSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROCOSTO);
					iRow++;

					for(ListadosPlanCuentas listadosplancuentas:listadosplancuentassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosplancuentas.getes_centro_costo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROACTIVIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROACTIVIDAD);
					iRow++;

					for(ListadosPlanCuentas listadosplancuentas:listadosplancuentassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosplancuentas.getes_centro_actividad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_ESPARAF52:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_ESPARAF52);
					iRow++;

					for(ListadosPlanCuentas listadosplancuentas:listadosplancuentassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosplancuentas.getes_para_f52());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosPlanCuentasConstantesFunciones.LABEL_ORDEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_ORDEN);
					iRow++;

					for(ListadosPlanCuentas listadosplancuentas:listadosplancuentassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosplancuentas.getorden());
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
			//	this.getFilaCabeceraExportarExcelListadosPlanCuentas(row);				
			//	iRow++;
			//}				
			
			//for(ListadosPlanCuentas listadosplancuentasAux:listadosplancuentassSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelListadosPlanCuentas(listadosplancuentasAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Plan Cuentas",JOptionPane.INFORMATION_MESSAGE);
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
				this.listadosplancuentasLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadosPlanCuentas(false);
			
			//SI ES MANUAL
			if(ListadosPlanCuentasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualListadosPlanCuentas();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresListadosPlanCuentasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadosPlanCuentas(false);
			
			//SI ES MANUAL
			if(ListadosPlanCuentasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualListadosPlanCuentas();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesListadosPlanCuentasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadosPlanCuentas(false);
			
			//SI ES MANUAL
			if(ListadosPlanCuentasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualListadosPlanCuentas();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaListadosPlanCuentas() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosListadosPlanCuentas.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosListadosPlanCuentas.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosListadosPlanCuentas.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosListadosPlanCuentas.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosListadosPlanCuentas.setMinimumSize(dimensionMinimum);
		this.jTableDatosListadosPlanCuentas.setMaximumSize(dimensionMaximum);
		this.jTableDatosListadosPlanCuentas.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingListadosPlanCuentas(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingListadosPlanCuentas(esInicializar,true);
	}
	
	public void inicializarActualizarBindingListadosPlanCuentas(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaListadosPlanCuentas(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesListadosPlanCuentas(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasListadosPlanCuentas(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesListadosPlanCuentas(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesListadosPlanCuentas(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ListadosPlanCuentasJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ListadosPlanCuentasJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualListadosPlanCuentas() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaListadosPlanCuentas();
		
		this.inicializarActualizarBindingBotonesManualListadosPlanCuentas(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualListadosPlanCuentas();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesListadosPlanCuentas() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualListadosPlanCuentas(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualListadosPlanCuentas(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosListadosPlanCuentas.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosListadosPlanCuentas.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteListadosPlanCuentas.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxPostAccionNuevoListadosPlanCuentas.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxPostAccionSinCerrarListadosPlanCuentas.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxPostAccionSinMensajeListadosPlanCuentas.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosListadosPlanCuentas.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosListadosPlanCuentas.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteListadosPlanCuentas.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {
				this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxPostAccionNuevoListadosPlanCuentas.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxPostAccionSinCerrarListadosPlanCuentas.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxPostAccionSinMensajeListadosPlanCuentas.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionListadosPlanCuentas.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionListadosPlanCuentas.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormListadosPlanCuentas.jComboBoxTiposAccionesFormularioListadosPlanCuentas.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesListadosPlanCuentas.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoListadosPlanCuentas!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesListadosPlanCuentas.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesListadosPlanCuentas.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarListadosPlanCuentas.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesListadosPlanCuentas.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoListadosPlanCuentas!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesListadosPlanCuentas.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralListadosPlanCuentas.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesListadosPlanCuentas(Boolean esInicializar) throws Exception {
		try	{	
			if(ListadosPlanCuentasJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualListadosPlanCuentas(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesListadosPlanCuentas() throws Exception {
		try	{
			if(ListadosPlanCuentasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualListadosPlanCuentas();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleListadosPlanCuentas() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormListadosPlanCuentas.jComboBoxTiposAccionesFormularioListadosPlanCuentas.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormListadosPlanCuentas.jComboBoxTiposAccionesFormularioListadosPlanCuentas.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualListadosPlanCuentas() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesListadosPlanCuentas.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesListadosPlanCuentas.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesListadosPlanCuentas.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesListadosPlanCuentas.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesListadosPlanCuentas.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesListadosPlanCuentas.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionListadosPlanCuentas.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionListadosPlanCuentas.addItem(reporte);
			}
			
			
			if(!this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionListadosPlanCuentas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionListadosPlanCuentas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesListadosPlanCuentas.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesListadosPlanCuentas.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesListadosPlanCuentas.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesListadosPlanCuentas.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormListadosPlanCuentas.jComboBoxTiposAccionesFormularioListadosPlanCuentas.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormListadosPlanCuentas.jComboBoxTiposAccionesFormularioListadosPlanCuentas.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarListadosPlanCuentas.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarListadosPlanCuentas.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarListadosPlanCuentas.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualListadosPlanCuentas();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualListadosPlanCuentas() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoListadosPlanCuentas!=null) {
				this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoListadosPlanCuentas!=null) {
				this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoListadosPlanCuentas!=null) {
				
				if(this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualListadosPlanCuentas()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		//this.idBusquedaListadosPlanCuentas=Long.parseLong(this.jLabelidListadosPlanCuentasBusquedaListadosPlanCuentas.getText());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasListadosPlanCuentas(Boolean esInicializar) throws Exception {				
		if(ListadosPlanCuentasJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualListadosPlanCuentas();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaListadosPlanCuentas() throws Exception {
		this.inicializarActualizarBindingTablaListadosPlanCuentas(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByListadosPlanCuentas() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByListadosPlanCuentas.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByListadosPlanCuentas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByListadosPlanCuentas.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ListadosPlanCuentasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByListadosPlanCuentas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByListadosPlanCuentas.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ListadosPlanCuentasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosListadosPlanCuentasOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosPlanCuentasOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ListadosPlanCuentasPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByListadosPlanCuentas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByListadosPlanCuentas.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ListadosPlanCuentasPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByListadosPlanCuentas.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaListadosPlanCuentas(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=listadosplancuentasLogic.getListadosPlanCuentass().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=listadosplancuentass.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ListadosPlanCuentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosListadosPlanCuentas.setModel(new ListadosPlanCuentasModel(this.listadosplancuentasLogic.getListadosPlanCuentass(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosListadosPlanCuentas.setModel(new ListadosPlanCuentasModel(this.listadosplancuentass,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByListadosPlanCuentas!=null && this.jInternalFrameOrderByListadosPlanCuentas.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByListadosPlanCuentas();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosListadosPlanCuentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosPlanCuentas,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ListadosPlanCuentasPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO,listadosplancuentasConstantesFunciones.resaltarSeleccionarListadosPlanCuentas,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ListadosPlanCuentasConstantesFunciones.SCLASSWEBTITULO,listadosplancuentasConstantesFunciones.resaltarSeleccionarListadosPlanCuentas,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosListadosPlanCuentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosPlanCuentas,ListadosPlanCuentasConstantesFunciones.LABEL_NOMBREMONEDA));

		if(this.listadosplancuentasConstantesFunciones.mostrarnombre_monedaListadosPlanCuentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosPlanCuentasConstantesFunciones.LABEL_NOMBREMONEDA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadosplancuentasConstantesFunciones.resaltarnombre_monedaListadosPlanCuentas,this.listadosplancuentasConstantesFunciones.activarnombre_monedaListadosPlanCuentas,this,true,"nombre_monedaListadosPlanCuentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadosplancuentasConstantesFunciones.resaltarnombre_monedaListadosPlanCuentas,this.listadosplancuentasConstantesFunciones.activarnombre_monedaListadosPlanCuentas,this,true,"nombre_monedaListadosPlanCuentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadosPlanCuentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosPlanCuentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosPlanCuentas,ListadosPlanCuentasConstantesFunciones.LABEL_CODIGO));

		if(this.listadosplancuentasConstantesFunciones.mostrarcodigoListadosPlanCuentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosPlanCuentasConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadosplancuentasConstantesFunciones.resaltarcodigoListadosPlanCuentas,this.listadosplancuentasConstantesFunciones.activarcodigoListadosPlanCuentas,this,true,"codigoListadosPlanCuentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadosplancuentasConstantesFunciones.resaltarcodigoListadosPlanCuentas,this.listadosplancuentasConstantesFunciones.activarcodigoListadosPlanCuentas,this,true,"codigoListadosPlanCuentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadosPlanCuentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosPlanCuentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosPlanCuentas,ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRE));

		if(this.listadosplancuentasConstantesFunciones.mostrarnombreListadosPlanCuentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadosplancuentasConstantesFunciones.resaltarnombreListadosPlanCuentas,this.listadosplancuentasConstantesFunciones.activarnombreListadosPlanCuentas,this,true,"nombreListadosPlanCuentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadosplancuentasConstantesFunciones.resaltarnombreListadosPlanCuentas,this.listadosplancuentasConstantesFunciones.activarnombreListadosPlanCuentas,this,true,"nombreListadosPlanCuentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadosPlanCuentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosPlanCuentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosPlanCuentas,ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRENIVELCUENTA));

		if(this.listadosplancuentasConstantesFunciones.mostrarnombre_nivel_cuentaListadosPlanCuentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRENIVELCUENTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadosplancuentasConstantesFunciones.resaltarnombre_nivel_cuentaListadosPlanCuentas,this.listadosplancuentasConstantesFunciones.activarnombre_nivel_cuentaListadosPlanCuentas,this,true,"nombre_nivel_cuentaListadosPlanCuentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadosplancuentasConstantesFunciones.resaltarnombre_nivel_cuentaListadosPlanCuentas,this.listadosplancuentasConstantesFunciones.activarnombre_nivel_cuentaListadosPlanCuentas,this,true,"nombre_nivel_cuentaListadosPlanCuentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadosPlanCuentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosPlanCuentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosPlanCuentas,ListadosPlanCuentasConstantesFunciones.LABEL_ESMOVIMIENTO));

		if(this.listadosplancuentasConstantesFunciones.mostrares_movimientoListadosPlanCuentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosPlanCuentasConstantesFunciones.LABEL_ESMOVIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.listadosplancuentasConstantesFunciones.resaltares_movimientoListadosPlanCuentas,this.listadosplancuentasConstantesFunciones.activares_movimientoListadosPlanCuentas));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.listadosplancuentasConstantesFunciones.resaltares_movimientoListadosPlanCuentas,this.listadosplancuentasConstantesFunciones.activares_movimientoListadosPlanCuentas,this,true,"es_movimientoListadosPlanCuentas","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ListadosPlanCuentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosPlanCuentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosPlanCuentas,ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROCOSTO));

		if(this.listadosplancuentasConstantesFunciones.mostrares_centro_costoListadosPlanCuentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROCOSTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.listadosplancuentasConstantesFunciones.resaltares_centro_costoListadosPlanCuentas,this.listadosplancuentasConstantesFunciones.activares_centro_costoListadosPlanCuentas));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.listadosplancuentasConstantesFunciones.resaltares_centro_costoListadosPlanCuentas,this.listadosplancuentasConstantesFunciones.activares_centro_costoListadosPlanCuentas,this,true,"es_centro_costoListadosPlanCuentas","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ListadosPlanCuentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosPlanCuentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosPlanCuentas,ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROACTIVIDAD));

		if(this.listadosplancuentasConstantesFunciones.mostrares_centro_actividadListadosPlanCuentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROACTIVIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.listadosplancuentasConstantesFunciones.resaltares_centro_actividadListadosPlanCuentas,this.listadosplancuentasConstantesFunciones.activares_centro_actividadListadosPlanCuentas));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.listadosplancuentasConstantesFunciones.resaltares_centro_actividadListadosPlanCuentas,this.listadosplancuentasConstantesFunciones.activares_centro_actividadListadosPlanCuentas,this,true,"es_centro_actividadListadosPlanCuentas","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ListadosPlanCuentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosPlanCuentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosPlanCuentas,ListadosPlanCuentasConstantesFunciones.LABEL_ESPARAF52));

		if(this.listadosplancuentasConstantesFunciones.mostrares_para_f52ListadosPlanCuentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosPlanCuentasConstantesFunciones.LABEL_ESPARAF52,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.listadosplancuentasConstantesFunciones.resaltares_para_f52ListadosPlanCuentas,this.listadosplancuentasConstantesFunciones.activares_para_f52ListadosPlanCuentas));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.listadosplancuentasConstantesFunciones.resaltares_para_f52ListadosPlanCuentas,this.listadosplancuentasConstantesFunciones.activares_para_f52ListadosPlanCuentas,this,true,"es_para_f52ListadosPlanCuentas","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ListadosPlanCuentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosPlanCuentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosPlanCuentas,ListadosPlanCuentasConstantesFunciones.LABEL_ORDEN));

		if(this.listadosplancuentasConstantesFunciones.mostrarordenListadosPlanCuentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosPlanCuentasConstantesFunciones.LABEL_ORDEN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.listadosplancuentasConstantesFunciones.resaltarordenListadosPlanCuentas,this.listadosplancuentasConstantesFunciones.activarordenListadosPlanCuentas,this,true,"ordenListadosPlanCuentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadosplancuentasConstantesFunciones.resaltarordenListadosPlanCuentas,this.listadosplancuentasConstantesFunciones.activarordenListadosPlanCuentas,this,true,"ordenListadosPlanCuentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ListadosPlanCuentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.listadosplancuentasSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.listadosplancuentasSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.listadosplancuentasSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosListadosPlanCuentas.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.listadosplancuentasSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.listadosplancuentasSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosListadosPlanCuentas.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarListadosPlanCuentas && this.isPermisoGuardarCambiosListadosPlanCuentas) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.listadosplancuentasSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.listadosplancuentasSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosListadosPlanCuentas.addColumn(tableColumn);
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
			
			this.jTableDatosListadosPlanCuentas.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarListadosPlanCuentas && this.isPermisoGuardarCambiosListadosPlanCuentas) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarListadosPlanCuentas && this.isPermisoGuardarCambiosListadosPlanCuentas) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosListadosPlanCuentas.moveColumn(this.jTableDatosListadosPlanCuentas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosListadosPlanCuentas.moveColumn(this.jTableDatosListadosPlanCuentas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosListadosPlanCuentas.moveColumn(this.jTableDatosListadosPlanCuentas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosListadosPlanCuentas.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosListadosPlanCuentas.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosListadosPlanCuentas,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ListadosPlanCuentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosListadosPlanCuentas.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosListadosPlanCuentas.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ListadosPlanCuentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ListadosPlanCuentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosListadosPlanCuentas.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosListadosPlanCuentas.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosListadosPlanCuentas.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=listadosplancuentasLogic.getListadosPlanCuentass().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=listadosplancuentass.size()-1;
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
		//this.jTableDatosListadosPlanCuentas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosListadosPlanCuentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosListadosPlanCuentas();
			
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
				
				//this.isEsNuevoListadosPlanCuentas=false;
					
				ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
			
				if(this.listadosplancuentasSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormListadosPlanCuentas==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosListadosPlanCuentas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosListadosPlanCuentas.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.listadosplancuentas.getsType().equals("DUPLICADO")
				   || this.listadosplancuentas.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoListadosPlanCuentas=true;
				
				} else {
					this.isEsNuevoListadosPlanCuentas=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {
					if(this.listadosplancuentas.getId()>=0 && !this.listadosplancuentas.getIsNew()) {						
						this.isEsNuevoListadosPlanCuentas=false;
						
					} else {
						this.isEsNuevoListadosPlanCuentas=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoListadosPlanCuentas(esRelaciones);						
				
				this.seleccionarListadosPlanCuentas(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.listadosplancuentas.getId()<0) {
					this.isEsNuevoListadosPlanCuentas=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarListadosPlanCuentas(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarListadosPlanCuentas(evt,rowIndex);
				}	
				
				if(this.listadosplancuentasSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ListadosPlanCuentas: " + this.dDif); 
					}
				}								
				
				ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarListadosPlanCuentas(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.listadosplancuentas)) {
					if(this.listadosplancuentas.getId()>0) {
						this.listadosplancuentas.setIsDeleted(true);
						
						this.listadosplancuentassEliminados.add(this.listadosplancuentas);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.listadosplancuentasLogic.getListadosPlanCuentass().remove(this.listadosplancuentas);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.listadosplancuentass.remove(this.listadosplancuentas);				
					}
					
					
					((ListadosPlanCuentasModel) this.jTableDatosListadosPlanCuentas.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaListadosPlanCuentas(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarListadosPlanCuentas(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoListadosPlanCuentas) {
			
			if(this.jInternalFrameDetalleFormListadosPlanCuentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosListadosPlanCuentas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosListadosPlanCuentas.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ListadosPlanCuentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioListadosPlanCuentas(this.listadosplancuentas);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesListadosPlanCuentas("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesListadosPlanCuentas(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualListadosPlanCuentas() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoListadosPlanCuentas(ListadosPlanCuentas listadosplancuentas) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoListadosPlanCuentas(listadosplancuentas,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoListadosPlanCuentas(ListadosPlanCuentas listadosplancuentas,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioListadosPlanCuentas(listadosplancuentas);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyListadosPlanCuentas(listadosplancuentas,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyListadosPlanCuentas(listadosplancuentas);
	}
	
	public void setVariablesObjetoActualToFormularioListadosPlanCuentas(ListadosPlanCuentas listadosplancuentas) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormListadosPlanCuentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormListadosPlanCuentas.jTextFieldnombre_monedaListadosPlanCuentas.setText(listadosplancuentas.getnombre_moneda());
			this.jInternalFrameDetalleFormListadosPlanCuentas.jTextFieldcodigoListadosPlanCuentas.setText(listadosplancuentas.getcodigo());
			this.jInternalFrameDetalleFormListadosPlanCuentas.jTextAreanombreListadosPlanCuentas.setText(listadosplancuentas.getnombre());
			this.jInternalFrameDetalleFormListadosPlanCuentas.jTextAreanombre_nivel_cuentaListadosPlanCuentas.setText(listadosplancuentas.getnombre_nivel_cuenta());
			this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_movimientoListadosPlanCuentas.setSelected(listadosplancuentas.getes_movimiento());
			this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_centro_costoListadosPlanCuentas.setSelected(listadosplancuentas.getes_centro_costo());
			this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_centro_actividadListadosPlanCuentas.setSelected(listadosplancuentas.getes_centro_actividad());
			this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_para_f52ListadosPlanCuentas.setSelected(listadosplancuentas.getes_para_f52());
			this.jInternalFrameDetalleFormListadosPlanCuentas.jTextFieldordenListadosPlanCuentas.setText(listadosplancuentas.getorden().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ListadosPlanCuentas listadosplancuentasLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,listadosplancuentasLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ListadosPlanCuentas listadosplancuentasLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				listadosplancuentasLocal=this.listadosplancuentas;
			} else {
				listadosplancuentasLocal=this.listadosplancuentasAnterior;
			}
		}
		
		if(this.permiteMantenimiento(listadosplancuentasLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoListadosPlanCuentas(listadosplancuentasLocal,true);
					
					if(listadosplancuentasSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(listadosplancuentasLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(listadosplancuentasLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoListadosPlanCuentas(ListadosPlanCuentas listadosplancuentas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualListadosPlanCuentas(listadosplancuentas,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysListadosPlanCuentas(listadosplancuentas);
	}
	
	public void setVariablesFormularioToObjetoActualListadosPlanCuentas(ListadosPlanCuentas listadosplancuentas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualListadosPlanCuentas(listadosplancuentas,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualListadosPlanCuentas(ListadosPlanCuentas listadosplancuentas,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormListadosPlanCuentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			listadosplancuentas.setnombre_moneda(this.jInternalFrameDetalleFormListadosPlanCuentas.jTextFieldnombre_monedaListadosPlanCuentas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosPlanCuentasConstantesFunciones.LABEL_NOMBREMONEDA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosPlanCuentas.jLabelnombre_monedaListadosPlanCuentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosplancuentas.setcodigo(this.jInternalFrameDetalleFormListadosPlanCuentas.jTextFieldcodigoListadosPlanCuentas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosPlanCuentasConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosPlanCuentas.jLabelcodigoListadosPlanCuentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosplancuentas.setnombre(this.jInternalFrameDetalleFormListadosPlanCuentas.jTextAreanombreListadosPlanCuentas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosPlanCuentas.jLabelnombreListadosPlanCuentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosplancuentas.setnombre_nivel_cuenta(this.jInternalFrameDetalleFormListadosPlanCuentas.jTextAreanombre_nivel_cuentaListadosPlanCuentas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRENIVELCUENTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosPlanCuentas.jLabelnombre_nivel_cuentaListadosPlanCuentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosplancuentas.setes_movimiento(this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_movimientoListadosPlanCuentas.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosPlanCuentasConstantesFunciones.LABEL_ESMOVIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosPlanCuentas.jLabeles_movimientoListadosPlanCuentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosplancuentas.setes_centro_costo(this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_centro_costoListadosPlanCuentas.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROCOSTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosPlanCuentas.jLabeles_centro_costoListadosPlanCuentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosplancuentas.setes_centro_actividad(this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_centro_actividadListadosPlanCuentas.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROACTIVIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosPlanCuentas.jLabeles_centro_actividadListadosPlanCuentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosplancuentas.setes_para_f52(this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_para_f52ListadosPlanCuentas.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosPlanCuentasConstantesFunciones.LABEL_ESPARAF52+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosPlanCuentas.jLabeles_para_f52ListadosPlanCuentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosplancuentas.setorden(Integer.parseInt(this.jInternalFrameDetalleFormListadosPlanCuentas.jTextFieldordenListadosPlanCuentas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosPlanCuentasConstantesFunciones.LABEL_ORDEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosPlanCuentas.jLabelordenListadosPlanCuentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualListadosPlanCuentas(ListadosPlanCuentas listadosplancuentasBean,ListadosPlanCuentas listadosplancuentas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosListadosPlanCuentas(ListadosPlanCuentas listadosplancuentasOrigen,ListadosPlanCuentas listadosplancuentas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && listadosplancuentasOrigen.getId()!=null && !listadosplancuentasOrigen.getId().equals(0L))) {listadosplancuentas.setId(listadosplancuentasOrigen.getId());}}
			if(conDefault || (!conDefault && listadosplancuentasOrigen.getnombre_moneda()!=null && !listadosplancuentasOrigen.getnombre_moneda().equals(""))) {listadosplancuentas.setnombre_moneda(listadosplancuentasOrigen.getnombre_moneda());}
			if(conDefault || (!conDefault && listadosplancuentasOrigen.getcodigo()!=null && !listadosplancuentasOrigen.getcodigo().equals(""))) {listadosplancuentas.setcodigo(listadosplancuentasOrigen.getcodigo());}
			if(conDefault || (!conDefault && listadosplancuentasOrigen.getnombre()!=null && !listadosplancuentasOrigen.getnombre().equals(""))) {listadosplancuentas.setnombre(listadosplancuentasOrigen.getnombre());}
			if(conDefault || (!conDefault && listadosplancuentasOrigen.getnombre_nivel_cuenta()!=null && !listadosplancuentasOrigen.getnombre_nivel_cuenta().equals(""))) {listadosplancuentas.setnombre_nivel_cuenta(listadosplancuentasOrigen.getnombre_nivel_cuenta());}
			if(conDefault || (!conDefault && listadosplancuentasOrigen.getes_movimiento()!=null && !listadosplancuentasOrigen.getes_movimiento().equals(false))) {listadosplancuentas.setes_movimiento(listadosplancuentasOrigen.getes_movimiento());}
			if(conDefault || (!conDefault && listadosplancuentasOrigen.getes_centro_costo()!=null && !listadosplancuentasOrigen.getes_centro_costo().equals(false))) {listadosplancuentas.setes_centro_costo(listadosplancuentasOrigen.getes_centro_costo());}
			if(conDefault || (!conDefault && listadosplancuentasOrigen.getes_centro_actividad()!=null && !listadosplancuentasOrigen.getes_centro_actividad().equals(false))) {listadosplancuentas.setes_centro_actividad(listadosplancuentasOrigen.getes_centro_actividad());}
			if(conDefault || (!conDefault && listadosplancuentasOrigen.getes_para_f52()!=null && !listadosplancuentasOrigen.getes_para_f52().equals(false))) {listadosplancuentas.setes_para_f52(listadosplancuentasOrigen.getes_para_f52());}
			if(conDefault || (!conDefault && listadosplancuentasOrigen.getorden()!=null && !listadosplancuentasOrigen.getorden().equals(0))) {listadosplancuentas.setorden(listadosplancuentasOrigen.getorden());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioListadosPlanCuentas(ListadosPlanCuentas listadosplancuentas) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormListadosPlanCuentas.jTextFieldnombre_monedaListadosPlanCuentas.setText(listadosplancuentas.getnombre_moneda());
			this.jInternalFrameDetalleFormListadosPlanCuentas.jTextFieldcodigoListadosPlanCuentas.setText(listadosplancuentas.getcodigo());
			this.jInternalFrameDetalleFormListadosPlanCuentas.jTextAreanombreListadosPlanCuentas.setText(listadosplancuentas.getnombre());
			this.jInternalFrameDetalleFormListadosPlanCuentas.jTextAreanombre_nivel_cuentaListadosPlanCuentas.setText(listadosplancuentas.getnombre_nivel_cuenta());
			this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_movimientoListadosPlanCuentas.setSelected(listadosplancuentas.getes_movimiento());
			this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_centro_costoListadosPlanCuentas.setSelected(listadosplancuentas.getes_centro_costo());
			this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_centro_actividadListadosPlanCuentas.setSelected(listadosplancuentas.getes_centro_actividad());
			this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_para_f52ListadosPlanCuentas.setSelected(listadosplancuentas.getes_para_f52());
			this.jInternalFrameDetalleFormListadosPlanCuentas.jTextFieldordenListadosPlanCuentas.setText(listadosplancuentas.getorden().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioListadosPlanCuentas(ListadosPlanCuentasBean listadosplancuentasBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormListadosPlanCuentas.jTextFieldnombre_monedaListadosPlanCuentas.setText(listadosplancuentasBean.getnombre_moneda());
			this.jInternalFrameDetalleFormListadosPlanCuentas.jTextFieldcodigoListadosPlanCuentas.setText(listadosplancuentasBean.getcodigo());
			this.jInternalFrameDetalleFormListadosPlanCuentas.jTextAreanombreListadosPlanCuentas.setText(listadosplancuentasBean.getnombre());
			this.jInternalFrameDetalleFormListadosPlanCuentas.jTextAreanombre_nivel_cuentaListadosPlanCuentas.setText(listadosplancuentasBean.getnombre_nivel_cuenta());
			this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_movimientoListadosPlanCuentas.setSelected(listadosplancuentasBean.getes_movimiento());
			this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_centro_costoListadosPlanCuentas.setSelected(listadosplancuentasBean.getes_centro_costo());
			this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_centro_actividadListadosPlanCuentas.setSelected(listadosplancuentasBean.getes_centro_actividad());
			this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_para_f52ListadosPlanCuentas.setSelected(listadosplancuentasBean.getes_para_f52());
			this.jInternalFrameDetalleFormListadosPlanCuentas.jTextFieldordenListadosPlanCuentas.setText(listadosplancuentasBean.getorden().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanListadosPlanCuentas(ListadosPlanCuentasParameterReturnGeneral listadosplancuentasReturnGeneral,ListadosPlanCuentasBean listadosplancuentasBean,Boolean conDefault) throws Exception { 
		try {
			ListadosPlanCuentas listadosplancuentasLocal=new ListadosPlanCuentas();
			
			listadosplancuentasLocal=listadosplancuentasReturnGeneral.getListadosPlanCuentas();
			
			
			if(conDefault || (!conDefault && listadosplancuentasLocal.getnombre_moneda()!=null && !listadosplancuentasLocal.getnombre_moneda().equals(""))) {listadosplancuentasBean.setnombre_moneda(listadosplancuentasLocal.getnombre_moneda());}
			if(conDefault || (!conDefault && listadosplancuentasLocal.getcodigo()!=null && !listadosplancuentasLocal.getcodigo().equals(""))) {listadosplancuentasBean.setcodigo(listadosplancuentasLocal.getcodigo());}
			if(conDefault || (!conDefault && listadosplancuentasLocal.getnombre()!=null && !listadosplancuentasLocal.getnombre().equals(""))) {listadosplancuentasBean.setnombre(listadosplancuentasLocal.getnombre());}
			if(conDefault || (!conDefault && listadosplancuentasLocal.getnombre_nivel_cuenta()!=null && !listadosplancuentasLocal.getnombre_nivel_cuenta().equals(""))) {listadosplancuentasBean.setnombre_nivel_cuenta(listadosplancuentasLocal.getnombre_nivel_cuenta());}
			if(conDefault || (!conDefault && listadosplancuentasLocal.getes_movimiento()!=null && !listadosplancuentasLocal.getes_movimiento().equals(false))) {listadosplancuentasBean.setes_movimiento(listadosplancuentasLocal.getes_movimiento());}
			if(conDefault || (!conDefault && listadosplancuentasLocal.getes_centro_costo()!=null && !listadosplancuentasLocal.getes_centro_costo().equals(false))) {listadosplancuentasBean.setes_centro_costo(listadosplancuentasLocal.getes_centro_costo());}
			if(conDefault || (!conDefault && listadosplancuentasLocal.getes_centro_actividad()!=null && !listadosplancuentasLocal.getes_centro_actividad().equals(false))) {listadosplancuentasBean.setes_centro_actividad(listadosplancuentasLocal.getes_centro_actividad());}
			if(conDefault || (!conDefault && listadosplancuentasLocal.getes_para_f52()!=null && !listadosplancuentasLocal.getes_para_f52().equals(false))) {listadosplancuentasBean.setes_para_f52(listadosplancuentasLocal.getes_para_f52());}
			if(conDefault || (!conDefault && listadosplancuentasLocal.getorden()!=null && !listadosplancuentasLocal.getorden().equals(0))) {listadosplancuentasBean.setorden(listadosplancuentasLocal.getorden());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxListadosPlanCuentasGenerico(Long idListadosPlanCuentasSeleccionado,JComboBox jComboBoxListadosPlanCuentas,List<ListadosPlanCuentas> listadosplancuentassLocal)throws Exception {
		try {
			ListadosPlanCuentas  listadosplancuentasTemp=null;

			for(ListadosPlanCuentas listadosplancuentasAux:listadosplancuentassLocal) {
				if(listadosplancuentasAux.getId()!=null && listadosplancuentasAux.getId().equals(idListadosPlanCuentasSeleccionado)) {
					listadosplancuentasTemp=listadosplancuentasAux;
					break;
				}
			}

			jComboBoxListadosPlanCuentas.setSelectedItem(listadosplancuentasTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxListadosPlanCuentasGenerico(JComboBox jComboBoxListadosPlanCuentas,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxListadosPlanCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxListadosPlanCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxListadosPlanCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxListadosPlanCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxListadosPlanCuentas.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxListadosPlanCuentas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxListadosPlanCuentas.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxListadosPlanCuentas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxListadosPlanCuentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxListadosPlanCuentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			listadosplancuentas=(ListadosPlanCuentas) listadosplancuentasLogic.getListadosPlanCuentass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			listadosplancuentas =(ListadosPlanCuentas) listadosplancuentass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!listadosplancuentas.getIsNew() && !listadosplancuentas.getIsChanged() && !listadosplancuentas.getIsDeleted()) {
				sDescripcion=listadosplancuentas.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=listadosplancuentas.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ListadosPlanCuentas listadosplancuentasRow=new ListadosPlanCuentas();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			listadosplancuentasRow=(ListadosPlanCuentas) listadosplancuentasLogic.getListadosPlanCuentass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			listadosplancuentasRow=(ListadosPlanCuentas) listadosplancuentass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualListadosPlanCuentas(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoListadosPlanCuentas.setVisible((this.isVisibilidadCeldaNuevoListadosPlanCuentas && this.isPermisoNuevoListadosPlanCuentas));			
			this.jButtonDuplicarListadosPlanCuentas.setVisible((this.isVisibilidadCeldaDuplicarListadosPlanCuentas && this.isPermisoDuplicarListadosPlanCuentas));			
			this.jButtonCopiarListadosPlanCuentas.setVisible((this.isVisibilidadCeldaCopiarListadosPlanCuentas && this.isPermisoCopiarListadosPlanCuentas));
			this.jButtonVerFormListadosPlanCuentas.setVisible((this.isVisibilidadCeldaVerFormListadosPlanCuentas && this.isPermisoVerFormListadosPlanCuentas));
			
			this.jButtonAbrirOrderByListadosPlanCuentas.setVisible((this.isVisibilidadCeldaOrdenListadosPlanCuentas && this.isPermisoOrdenListadosPlanCuentas));			
			
			this.jButtonNuevoRelacionesListadosPlanCuentas.setVisible((this.isVisibilidadCeldaNuevoRelacionesListadosPlanCuentas && this.isPermisoNuevoListadosPlanCuentas));			
			this.jButtonNuevoGuardarCambiosListadosPlanCuentas.setVisible((this.isVisibilidadCeldaNuevoListadosPlanCuentas && this.isPermisoNuevoListadosPlanCuentas && this.isPermisoGuardarCambiosListadosPlanCuentas));
			
			if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {
			this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonModificarListadosPlanCuentas.setVisible((this.isVisibilidadCeldaModificarListadosPlanCuentas && this.isPermisoActualizarListadosPlanCuentas));	
			this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonActualizarListadosPlanCuentas.setVisible((this.isVisibilidadCeldaActualizarListadosPlanCuentas && this.isPermisoActualizarListadosPlanCuentas));	
			this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonEliminarListadosPlanCuentas.setVisible((this.isVisibilidadCeldaEliminarListadosPlanCuentas && this.isPermisoEliminarListadosPlanCuentas));
			this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonCancelarListadosPlanCuentas.setVisible(this.isVisibilidadCeldaCancelarListadosPlanCuentas);							
			this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonGuardarCambiosListadosPlanCuentas.setVisible((this.isVisibilidadCeldaGuardarListadosPlanCuentas && this.isPermisoGuardarCambiosListadosPlanCuentas));			
			
			}
						
			this.jButtonGuardarCambiosTablaListadosPlanCuentas.setVisible((this.isVisibilidadCeldaGuardarCambiosListadosPlanCuentas && this.isPermisoGuardarCambiosListadosPlanCuentas));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarListadosPlanCuentas.setVisible((this.isVisibilidadCeldaNuevoListadosPlanCuentas && this.isPermisoNuevoListadosPlanCuentas));						
			this.jButtonDuplicarToolBarListadosPlanCuentas.setVisible((this.isVisibilidadCeldaDuplicarListadosPlanCuentas && this.isPermisoDuplicarListadosPlanCuentas));						
			this.jButtonCopiarToolBarListadosPlanCuentas.setVisible((this.isVisibilidadCeldaCopiarListadosPlanCuentas && this.isPermisoCopiarListadosPlanCuentas));			
			this.jButtonVerFormToolBarListadosPlanCuentas.setVisible((this.isVisibilidadCeldaVerFormListadosPlanCuentas && this.isPermisoVerFormListadosPlanCuentas));			
			this.jButtonAbrirOrderByToolBarListadosPlanCuentas.setVisible((this.isVisibilidadCeldaOrdenListadosPlanCuentas && this.isPermisoOrdenListadosPlanCuentas));
			this.jButtonNuevoRelacionesToolBarListadosPlanCuentas.setVisible((this.isVisibilidadCeldaNuevoRelacionesListadosPlanCuentas && this.isPermisoNuevoListadosPlanCuentas));			
			this.jButtonNuevoGuardarCambiosToolBarListadosPlanCuentas.setVisible((this.isVisibilidadCeldaNuevoListadosPlanCuentas && this.isPermisoNuevoListadosPlanCuentas && this.isPermisoGuardarCambiosListadosPlanCuentas));			
			
			if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {
			this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonModificarToolBarListadosPlanCuentas.setVisible((this.isVisibilidadCeldaModificarListadosPlanCuentas && this.isPermisoActualizarListadosPlanCuentas));	
			this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonActualizarToolBarListadosPlanCuentas.setVisible((this.isVisibilidadCeldaActualizarListadosPlanCuentas  && this.isPermisoActualizarListadosPlanCuentas));	
			this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonEliminarToolBarListadosPlanCuentas.setVisible((this.isVisibilidadCeldaEliminarListadosPlanCuentas && this.isPermisoEliminarListadosPlanCuentas));
			this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonCancelarToolBarListadosPlanCuentas.setVisible(this.isVisibilidadCeldaCancelarListadosPlanCuentas);				
			this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonGuardarCambiosToolBarListadosPlanCuentas.setVisible((this.isVisibilidadCeldaGuardarListadosPlanCuentas && this.isPermisoGuardarCambiosListadosPlanCuentas));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarListadosPlanCuentas.setVisible((this.isVisibilidadCeldaGuardarCambiosListadosPlanCuentas && this.isPermisoGuardarCambiosListadosPlanCuentas));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoListadosPlanCuentas.setVisible((this.isVisibilidadCeldaNuevoListadosPlanCuentas && this.isPermisoNuevoListadosPlanCuentas));			
			this.jMenuItemDuplicarListadosPlanCuentas.setVisible((this.isVisibilidadCeldaDuplicarListadosPlanCuentas && this.isPermisoDuplicarListadosPlanCuentas));			
			this.jMenuItemCopiarListadosPlanCuentas.setVisible((this.isVisibilidadCeldaCopiarListadosPlanCuentas && this.isPermisoCopiarListadosPlanCuentas));			
			this.jMenuItemVerFormListadosPlanCuentas.setVisible((this.isVisibilidadCeldaVerFormListadosPlanCuentas && this.isPermisoVerFormListadosPlanCuentas));			
			this.jMenuItemAbrirOrderByListadosPlanCuentas.setVisible((this.isVisibilidadCeldaOrdenListadosPlanCuentas && this.isPermisoOrdenListadosPlanCuentas));			
			//this.jMenuItemMostrarOcultarListadosPlanCuentas.setVisible((this.isVisibilidadCeldaOrdenListadosPlanCuentas && this.isPermisoOrdenListadosPlanCuentas));
			this.jMenuItemDetalleAbrirOrderByListadosPlanCuentas.setVisible((this.isVisibilidadCeldaOrdenListadosPlanCuentas && this.isPermisoOrdenListadosPlanCuentas));			
			//this.jMenuItemDetalleMostrarOcultarListadosPlanCuentas.setVisible((this.isVisibilidadCeldaOrdenListadosPlanCuentas && this.isPermisoOrdenListadosPlanCuentas));			
			this.jMenuItemNuevoRelacionesListadosPlanCuentas.setVisible((this.isVisibilidadCeldaNuevoRelacionesListadosPlanCuentas && this.isPermisoNuevoListadosPlanCuentas));			
			this.jMenuItemNuevoGuardarCambiosListadosPlanCuentas.setVisible((this.isVisibilidadCeldaNuevoListadosPlanCuentas && this.isPermisoNuevoListadosPlanCuentas && this.isPermisoGuardarCambiosListadosPlanCuentas));									
			
			if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {
			this.jInternalFrameDetalleFormListadosPlanCuentas.jMenuItemModificarListadosPlanCuentas.setVisible((this.isVisibilidadCeldaModificarListadosPlanCuentas && this.isPermisoActualizarListadosPlanCuentas));	
			this.jInternalFrameDetalleFormListadosPlanCuentas.jMenuItemActualizarListadosPlanCuentas.setVisible((this.isVisibilidadCeldaActualizarListadosPlanCuentas && this.isPermisoActualizarListadosPlanCuentas));	
			this.jInternalFrameDetalleFormListadosPlanCuentas.jMenuItemEliminarListadosPlanCuentas.setVisible((this.isVisibilidadCeldaEliminarListadosPlanCuentas && this.isPermisoEliminarListadosPlanCuentas));
			this.jInternalFrameDetalleFormListadosPlanCuentas.jMenuItemCancelarListadosPlanCuentas.setVisible(this.isVisibilidadCeldaCancelarListadosPlanCuentas);				
			}
			
			this.jMenuItemGuardarCambiosListadosPlanCuentas.setVisible((this.isVisibilidadCeldaGuardarListadosPlanCuentas && this.isPermisoGuardarCambiosListadosPlanCuentas));						
			this.jMenuItemGuardarCambiosTablaListadosPlanCuentas.setVisible((this.isVisibilidadCeldaGuardarCambiosListadosPlanCuentas && this.isPermisoGuardarCambiosListadosPlanCuentas));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoListadosPlanCuentas=this.jButtonNuevoListadosPlanCuentas.isVisible();
			this.isVisibilidadCeldaDuplicarListadosPlanCuentas=this.jButtonDuplicarListadosPlanCuentas.isVisible();
			this.isVisibilidadCeldaCopiarListadosPlanCuentas=this.jButtonCopiarListadosPlanCuentas.isVisible();
			this.isVisibilidadCeldaVerFormListadosPlanCuentas=this.jButtonVerFormListadosPlanCuentas.isVisible();
			
			this.isVisibilidadCeldaOrdenListadosPlanCuentas=this.jButtonAbrirOrderByListadosPlanCuentas.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesListadosPlanCuentas=this.jButtonNuevoRelacionesListadosPlanCuentas.isVisible();
			this.isVisibilidadCeldaModificarListadosPlanCuentas=this.jButtonModificarListadosPlanCuentas.isVisible();
			
			if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {
			this.isVisibilidadCeldaActualizarListadosPlanCuentas=this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonActualizarListadosPlanCuentas.isVisible();
			this.isVisibilidadCeldaEliminarListadosPlanCuentas=this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonEliminarListadosPlanCuentas.isVisible();
			this.isVisibilidadCeldaCancelarListadosPlanCuentas=this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonCancelarListadosPlanCuentas.isVisible();
			this.isVisibilidadCeldaGuardarListadosPlanCuentas=this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonGuardarCambiosListadosPlanCuentas.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosListadosPlanCuentas=this.jButtonGuardarCambiosTablaListadosPlanCuentas.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoListadosPlanCuentas=this.jButtonNuevoToolBarListadosPlanCuentas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesListadosPlanCuentas=this.jButtonNuevoRelacionesToolBarListadosPlanCuentas.isVisible();
			
			if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {
			this.isVisibilidadCeldaModificarListadosPlanCuentas=this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonModificarToolBarListadosPlanCuentas.isVisible();
			this.isVisibilidadCeldaActualizarListadosPlanCuentas=this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonActualizarToolBarListadosPlanCuentas.isVisible();
			this.isVisibilidadCeldaEliminarListadosPlanCuentas=this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonEliminarToolBarListadosPlanCuentas.isVisible();
			this.isVisibilidadCeldaCancelarListadosPlanCuentas=this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonCancelarToolBarListadosPlanCuentas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarListadosPlanCuentas=this.jButtonGuardarCambiosToolBarListadosPlanCuentas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosListadosPlanCuentas=this.jButtonGuardarCambiosTablaToolBarListadosPlanCuentas.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoListadosPlanCuentas=this.jMenuItemNuevoListadosPlanCuentas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesListadosPlanCuentas=this.jMenuItemNuevoRelacionesListadosPlanCuentas.isVisible();
			
			if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {
			this.isVisibilidadCeldaModificarListadosPlanCuentas=this.jInternalFrameDetalleFormListadosPlanCuentas.jMenuItemModificarListadosPlanCuentas.isVisible();
			this.isVisibilidadCeldaActualizarListadosPlanCuentas=this.jInternalFrameDetalleFormListadosPlanCuentas.jMenuItemActualizarListadosPlanCuentas.isVisible();
			this.isVisibilidadCeldaEliminarListadosPlanCuentas=this.jInternalFrameDetalleFormListadosPlanCuentas.jMenuItemEliminarListadosPlanCuentas.isVisible();
			this.isVisibilidadCeldaCancelarListadosPlanCuentas=this.jInternalFrameDetalleFormListadosPlanCuentas.jMenuItemCancelarListadosPlanCuentas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarListadosPlanCuentas=this.jMenuItemGuardarCambiosListadosPlanCuentas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosListadosPlanCuentas=this.jMenuItemGuardarCambiosTablaListadosPlanCuentas.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesListadosPlanCuentas(Boolean esInicializar) {
		if(ListadosPlanCuentasJInternalFrame.ISBINDING_MANUAL) {			
			if(this.listadosplancuentasSessionBean.getConGuardarRelaciones()) {
				//if(this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesListadosPlanCuentas();
			}
			
			this.inicializarActualizarBindingBotonesManualListadosPlanCuentas(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualListadosPlanCuentas() {
		this.jButtonNuevoListadosPlanCuentas.setVisible(this.isPermisoNuevoListadosPlanCuentas);			
		this.jButtonDuplicarListadosPlanCuentas.setVisible(this.isPermisoDuplicarListadosPlanCuentas);			
		this.jButtonCopiarListadosPlanCuentas.setVisible(this.isPermisoCopiarListadosPlanCuentas);			
		this.jButtonVerFormListadosPlanCuentas.setVisible(this.isPermisoVerFormListadosPlanCuentas);			
		
		this.jButtonAbrirOrderByListadosPlanCuentas.setVisible(this.isPermisoOrdenListadosPlanCuentas);					
		
		this.jButtonNuevoRelacionesListadosPlanCuentas.setVisible(this.isPermisoNuevoListadosPlanCuentas);			
		
		if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonModificarListadosPlanCuentas.setVisible(this.isPermisoActualizarListadosPlanCuentas);	
			this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonActualizarListadosPlanCuentas.setVisible(this.isPermisoActualizarListadosPlanCuentas);	
			this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonEliminarListadosPlanCuentas.setVisible(this.isPermisoEliminarListadosPlanCuentas);
			this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonCancelarListadosPlanCuentas.setVisible(this.isVisibilidadCeldaCancelarListadosPlanCuentas);						
			this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonGuardarCambiosListadosPlanCuentas.setVisible(this.isPermisoGuardarCambiosListadosPlanCuentas);							
		}
		
		this.jButtonGuardarCambiosTablaListadosPlanCuentas.setVisible(this.isPermisoActualizarListadosPlanCuentas);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleListadosPlanCuentas() {
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonModificarListadosPlanCuentas.setVisible(this.isPermisoActualizarListadosPlanCuentas);	
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonActualizarListadosPlanCuentas.setVisible(this.isPermisoActualizarListadosPlanCuentas);	
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonEliminarListadosPlanCuentas.setVisible(this.isPermisoEliminarListadosPlanCuentas);
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonCancelarListadosPlanCuentas.setVisible(this.isVisibilidadCeldaCancelarListadosPlanCuentas);							
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonGuardarCambiosListadosPlanCuentas.setVisible((this.isVisibilidadCeldaGuardarListadosPlanCuentas && this.isPermisoGuardarCambiosListadosPlanCuentas));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosListadosPlanCuentas() {
		if(ListadosPlanCuentasJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualListadosPlanCuentas();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesListadosPlanCuentas() {
	}
	
	public void jTableDatosListadosPlanCuentasListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarListadosPlanCuentas(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidListadosPlanCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosPlanCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosPlanCuentas(this.getlistadosplancuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosPlanCuentas(this.listadosplancuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosplancuentas==null) {
						this.listadosplancuentas = new ListadosPlanCuentas();
					}

					this.setVariablesFormularioToObjetoActualListadosPlanCuentas(this.listadosplancuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosPlanCuentas(this.listadosplancuentas);
				}

				if(this.listadosplancuentas.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.listadosplancuentas.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosPlanCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaListadosPlanCuentasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebListadosPlanCuentas(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosPlanCuentas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosListadosPlanCuentas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosListadosPlanCuentas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualListadosPlanCuentas(this.getlistadosplancuentas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysListadosPlanCuentas(this.listadosplancuentas);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.listadosplancuentasLogic.getConnexion());

				if(this.listadosplancuentas.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.listadosplancuentas.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderListadosPlanCuentas=(TitledBorder)this.jScrollPanelDatosListadosPlanCuentas.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderListadosPlanCuentas.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaListadosPlanCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosPlanCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosPlanCuentas(this.getlistadosplancuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosPlanCuentas(this.listadosplancuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosplancuentas==null) {
						this.listadosplancuentas = new ListadosPlanCuentas();
					}

					this.setVariablesFormularioToObjetoActualListadosPlanCuentas(this.listadosplancuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosPlanCuentas(this.listadosplancuentas);
				}

				if(this.listadosplancuentas.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.listadosplancuentas.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosPlanCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_monedaListadosPlanCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosPlanCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosPlanCuentas(this.getlistadosplancuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosPlanCuentas(this.listadosplancuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosplancuentas==null) {
						this.listadosplancuentas = new ListadosPlanCuentas();
					}

					this.setVariablesFormularioToObjetoActualListadosPlanCuentas(this.listadosplancuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosPlanCuentas(this.listadosplancuentas);
				}

				if(this.listadosplancuentas.getnombre_moneda()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_moneda like '%"+this.listadosplancuentas.getnombre_moneda()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosPlanCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoListadosPlanCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosPlanCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosPlanCuentas(this.getlistadosplancuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosPlanCuentas(this.listadosplancuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosplancuentas==null) {
						this.listadosplancuentas = new ListadosPlanCuentas();
					}

					this.setVariablesFormularioToObjetoActualListadosPlanCuentas(this.listadosplancuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosPlanCuentas(this.listadosplancuentas);
				}

				if(this.listadosplancuentas.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.listadosplancuentas.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosPlanCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreListadosPlanCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosPlanCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosPlanCuentas(this.getlistadosplancuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosPlanCuentas(this.listadosplancuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosplancuentas==null) {
						this.listadosplancuentas = new ListadosPlanCuentas();
					}

					this.setVariablesFormularioToObjetoActualListadosPlanCuentas(this.listadosplancuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosPlanCuentas(this.listadosplancuentas);
				}

				if(this.listadosplancuentas.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.listadosplancuentas.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosPlanCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_nivel_cuentaListadosPlanCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosPlanCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosPlanCuentas(this.getlistadosplancuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosPlanCuentas(this.listadosplancuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosplancuentas==null) {
						this.listadosplancuentas = new ListadosPlanCuentas();
					}

					this.setVariablesFormularioToObjetoActualListadosPlanCuentas(this.listadosplancuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosPlanCuentas(this.listadosplancuentas);
				}

				if(this.listadosplancuentas.getnombre_nivel_cuenta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_nivel_cuenta like '%"+this.listadosplancuentas.getnombre_nivel_cuenta()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosPlanCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_movimientoListadosPlanCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosPlanCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosPlanCuentas(this.getlistadosplancuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosPlanCuentas(this.listadosplancuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosplancuentas==null) {
						this.listadosplancuentas = new ListadosPlanCuentas();
					}

					this.setVariablesFormularioToObjetoActualListadosPlanCuentas(this.listadosplancuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosPlanCuentas(this.listadosplancuentas);
				}

				if(this.listadosplancuentas.getes_movimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_movimiento = "+this.listadosplancuentas.getes_movimiento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosPlanCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_centro_costoListadosPlanCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosPlanCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosPlanCuentas(this.getlistadosplancuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosPlanCuentas(this.listadosplancuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosplancuentas==null) {
						this.listadosplancuentas = new ListadosPlanCuentas();
					}

					this.setVariablesFormularioToObjetoActualListadosPlanCuentas(this.listadosplancuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosPlanCuentas(this.listadosplancuentas);
				}

				if(this.listadosplancuentas.getes_centro_costo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_centro_costo = "+this.listadosplancuentas.getes_centro_costo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosPlanCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_centro_actividadListadosPlanCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosPlanCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosPlanCuentas(this.getlistadosplancuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosPlanCuentas(this.listadosplancuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosplancuentas==null) {
						this.listadosplancuentas = new ListadosPlanCuentas();
					}

					this.setVariablesFormularioToObjetoActualListadosPlanCuentas(this.listadosplancuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosPlanCuentas(this.listadosplancuentas);
				}

				if(this.listadosplancuentas.getes_centro_actividad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_centro_actividad = "+this.listadosplancuentas.getes_centro_actividad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosPlanCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_para_f52ListadosPlanCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosPlanCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosPlanCuentas(this.getlistadosplancuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosPlanCuentas(this.listadosplancuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosplancuentas==null) {
						this.listadosplancuentas = new ListadosPlanCuentas();
					}

					this.setVariablesFormularioToObjetoActualListadosPlanCuentas(this.listadosplancuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosPlanCuentas(this.listadosplancuentas);
				}

				if(this.listadosplancuentas.getes_para_f52()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_para_f52 = "+this.listadosplancuentas.getes_para_f52().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosPlanCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonordenListadosPlanCuentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosPlanCuentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosPlanCuentas(this.getlistadosplancuentas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosPlanCuentas(this.listadosplancuentas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosplancuentas==null) {
						this.listadosplancuentas = new ListadosPlanCuentas();
					}

					this.setVariablesFormularioToObjetoActualListadosPlanCuentas(this.listadosplancuentas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosPlanCuentas(this.listadosplancuentas);
				}

				if(this.listadosplancuentas.getorden()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where orden = "+this.listadosplancuentas.getorden().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosPlanCuentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaListadosPlanCuentasListadosPlanCuentasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingListadosPlanCuentas(false,false);

			this.getListadosPlanCuentassBusquedaListadosPlanCuentas();

			this.inicializarActualizarBindingListadosPlanCuentas(false);

			//if(ListadosPlanCuentasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingListadosPlanCuentas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaListadosPlanCuentasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingListadosPlanCuentas(false,false);

			this.getListadosPlanCuentassFK_IdEmpresa();

			this.inicializarActualizarBindingListadosPlanCuentas(false);

			//if(ListadosPlanCuentasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingListadosPlanCuentas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosplancuentasLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameListadosPlanCuentas() {
		if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {
			this.jInternalFrameDetalleFormListadosPlanCuentas.setVisible(false);	    			
			this.jInternalFrameDetalleFormListadosPlanCuentas.dispose();
			this.jInternalFrameDetalleFormListadosPlanCuentas=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoListadosPlanCuentas!=null) {
			this.jInternalFrameReporteDinamicoListadosPlanCuentas.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoListadosPlanCuentas.dispose();
			this.jInternalFrameReporteDinamicoListadosPlanCuentas=null;
		}
		
		if(this.jInternalFrameImportacionListadosPlanCuentas!=null) {
			this.jInternalFrameImportacionListadosPlanCuentas.setVisible(false);	    			
			this.jInternalFrameImportacionListadosPlanCuentas.dispose();
			this.jInternalFrameImportacionListadosPlanCuentas=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessListadosPlanCuentas();
			
			ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
			
			
			if(sTipo.equals("NuevoListadosPlanCuentas")) {
				jButtonNuevoListadosPlanCuentasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarListadosPlanCuentas")) {
				jButtonDuplicarListadosPlanCuentasActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarListadosPlanCuentas")) {
				jButtonCopiarListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("VerFormListadosPlanCuentas")) {
				jButtonVerFormListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarListadosPlanCuentas")) {
				jButtonNuevoListadosPlanCuentasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarListadosPlanCuentas")) {
				jButtonDuplicarListadosPlanCuentasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoListadosPlanCuentas")) {
				jButtonNuevoListadosPlanCuentasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarListadosPlanCuentas")) {
				jButtonDuplicarListadosPlanCuentasActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesListadosPlanCuentas")) {
				jButtonNuevoListadosPlanCuentasActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarListadosPlanCuentas")) {
				jButtonNuevoListadosPlanCuentasActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesListadosPlanCuentas")) {
				jButtonNuevoListadosPlanCuentasActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarListadosPlanCuentas")) {
				jButtonModificarListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarListadosPlanCuentas")) {
				jButtonModificarListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarListadosPlanCuentas")) {
				jButtonModificarListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarListadosPlanCuentas")) {
				jButtonActualizarListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarListadosPlanCuentas")) {
				jButtonActualizarListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarListadosPlanCuentas")) {
				jButtonActualizarListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("EliminarListadosPlanCuentas")) {
				jButtonEliminarListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarListadosPlanCuentas")) {
				jButtonEliminarListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarListadosPlanCuentas")) {
				jButtonEliminarListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("CancelarListadosPlanCuentas")) {
				jButtonCancelarListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarListadosPlanCuentas")) {
				jButtonCancelarListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarListadosPlanCuentas")) {
				jButtonCancelarListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("CerrarListadosPlanCuentas")) {
				jButtonCerrarListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarListadosPlanCuentas")) {
				jButtonCerrarListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarListadosPlanCuentas")) {
				jButtonCerrarListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarListadosPlanCuentas")) {
				jButtonMostrarOcultarListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarListadosPlanCuentas")) {
				jButtonCancelarListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosListadosPlanCuentas")) {
				jButtonGuardarCambiosListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarListadosPlanCuentas")) {
				jButtonGuardarCambiosListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarListadosPlanCuentas")) {
				jButtonCopiarListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarListadosPlanCuentas")) {
				jButtonVerFormListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosListadosPlanCuentas")) {
				jButtonGuardarCambiosListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarListadosPlanCuentas")) {
				jButtonCopiarListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormListadosPlanCuentas")) {
				jButtonVerFormListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaListadosPlanCuentas")) {
				jButtonGuardarCambiosListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarListadosPlanCuentas")) {
				jButtonGuardarCambiosListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaListadosPlanCuentas")) {
				jButtonGuardarCambiosListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionListadosPlanCuentas")) {
				jButtonRecargarInformacionListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarListadosPlanCuentas")) {
				jButtonRecargarInformacionListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionListadosPlanCuentas")) {
				jButtonRecargarInformacionListadosPlanCuentasActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresListadosPlanCuentas")) {
				jButtonAnterioresListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarListadosPlanCuentas")) {
				jButtonAnterioresListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreListadosPlanCuentas")) {
				jButtonAnterioresListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesListadosPlanCuentas")) {
				jButtonSiguientesListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarListadosPlanCuentas")) {
				jButtonSiguientesListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesListadosPlanCuentas")) {
				jButtonSiguientesListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByListadosPlanCuentas") || sTipo.equals("MenuItemDetalleAbrirOrderByListadosPlanCuentas")) {
				jButtonAbrirOrderByListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarListadosPlanCuentas") || sTipo.equals("MenuItemDetalleMostrarOcultarListadosPlanCuentas")) {
				jButtonMostrarOcultarListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosListadosPlanCuentas")) {
				jButtonNuevoGuardarCambiosListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarListadosPlanCuentas")) {
				jButtonNuevoGuardarCambiosListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosListadosPlanCuentas")) {
				jButtonNuevoGuardarCambiosListadosPlanCuentasActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoListadosPlanCuentas")) {
				jButtonCerrarReporteDinamicoListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoListadosPlanCuentas")) {
				jButtonGenerarReporteDinamicoListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoListadosPlanCuentas")) {
				
				jButtonGenerarExcelReporteDinamicoListadosPlanCuentasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionListadosPlanCuentas")) {
				jButtonCerrarImportacionListadosPlanCuentasActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionListadosPlanCuentas")) {
				
				jButtonGenerarImportacionListadosPlanCuentasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionListadosPlanCuentas")) {
				
				jButtonAbrirImportacionListadosPlanCuentasActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesListadosPlanCuentas")) {
				jComboBoxTiposAccionesListadosPlanCuentasActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesListadosPlanCuentas")) {
				jComboBoxTiposRelacionesListadosPlanCuentasActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioListadosPlanCuentas")) {
				jComboBoxTiposAccionesListadosPlanCuentasActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarListadosPlanCuentas")) {
				
				jComboBoxTiposSeleccionarListadosPlanCuentasActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralListadosPlanCuentas")) {
				jTextFieldValorCampoGeneralListadosPlanCuentasActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByListadosPlanCuentas")) {
				jButtonAbrirOrderByListadosPlanCuentasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarListadosPlanCuentas")) {
				jButtonAbrirOrderByListadosPlanCuentasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByListadosPlanCuentas")) {
				jButtonCerrarOrderByListadosPlanCuentasActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idListadosPlanCuentasBusqueda")) {
				this.jButtonidListadosPlanCuentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaListadosPlanCuentasUpdate")) {
				this.jButtonid_empresaListadosPlanCuentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaListadosPlanCuentasBusqueda")) {
				this.jButtonid_empresaListadosPlanCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_monedaListadosPlanCuentasBusqueda")) {
				this.jButtonnombre_monedaListadosPlanCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoListadosPlanCuentasBusqueda")) {
				this.jButtoncodigoListadosPlanCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreListadosPlanCuentasBusqueda")) {
				this.jButtonnombreListadosPlanCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_nivel_cuentaListadosPlanCuentasBusqueda")) {
				this.jButtonnombre_nivel_cuentaListadosPlanCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_movimientoListadosPlanCuentasBusqueda")) {
				this.jButtones_movimientoListadosPlanCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_centro_costoListadosPlanCuentasBusqueda")) {
				this.jButtones_centro_costoListadosPlanCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_centro_actividadListadosPlanCuentasBusqueda")) {
				this.jButtones_centro_actividadListadosPlanCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_para_f52ListadosPlanCuentasBusqueda")) {
				this.jButtones_para_f52ListadosPlanCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ordenListadosPlanCuentasBusqueda")) {
				this.jButtonordenListadosPlanCuentasBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaListadosPlanCuentasListadosPlanCuentas")) {
				this.jButtonBusquedaListadosPlanCuentasListadosPlanCuentasActionPerformed(evt);
			}
			
			;
			
			
			ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessListadosPlanCuentas();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosPlanCuentasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosplancuentas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosplancuentas);
				
				ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
				
				


				
				ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosPlanCuentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosPlanCuentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ListadosPlanCuentas listadosplancuentasLocal=null;
			
			if(!this.getEsControlTabla()) {
				listadosplancuentasLocal=this.listadosplancuentas;
			} else {
				listadosplancuentasLocal=this.listadosplancuentasAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosplancuentas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosplancuentas);
				
				ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
							
				
				


				
				ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosPlanCuentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosPlanCuentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosPlanCuentasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadosPlanCuentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasAnterior =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadosplancuentasAnterior =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
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
			
			ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
			
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
			
			


			
			ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosPlanCuentasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosplancuentas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosplancuentas);
				
				ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
								
						
				


				
				ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosPlanCuentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosPlanCuentas.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosplancuentas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosplancuentas);
				
				ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
								
				
				


				
				ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosPlanCuentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosPlanCuentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosPlanCuentasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadosPlanCuentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasAnterior =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadosplancuentasAnterior =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosplancuentas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosplancuentas);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosPlanCuentasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadosPlanCuentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasAnterior =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadosplancuentasAnterior =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosPlanCuentasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosplancuentas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.listadosplancuentas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosplancuentas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosplancuentas);
				
				ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
							
				
				


				
				ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosPlanCuentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosPlanCuentas.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosPlanCuentasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosListadosPlanCuentas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosplancuentasAnterior =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.listadosplancuentasAnterior =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
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
			
			ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
			
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
			
			


			
			ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosPlanCuentasActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosplancuentas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.listadosplancuentas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosplancuentas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosplancuentas);
				
				ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
								
				
				


				
				ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosPlanCuentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosPlanCuentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosPlanCuentasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadosPlanCuentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasAnterior =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadosplancuentasAnterior =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosPlanCuentasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosplancuentas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.listadosplancuentas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosPlanCuentasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosplancuentas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosplancuentas);
				
				ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosListadosPlanCuentas")) {
					jCheckBoxSeleccionarTodosListadosPlanCuentasItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosListadosPlanCuentas")) {
					jCheckBoxSeleccionadosListadosPlanCuentasItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarListadosPlanCuentas")) {
					
				}
				
				


				
				
				ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosPlanCuentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosPlanCuentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosplancuentas);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.listadosplancuentas);
				
				ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
												
				
				


				
				
				ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosPlanCuentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosPlanCuentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosPlanCuentasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosListadosPlanCuentas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosplancuentasAnterior =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.listadosplancuentasAnterior =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosPlanCuentasActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosplancuentas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosplancuentas);
				
				ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
				
				
				ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
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
			
			ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
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
			
			


			
			ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosPlanCuentasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosplancuentas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosplancuentas);
				
				ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosPlanCuentas.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosPlanCuentas.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosplancuentas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosplancuentas);
				
				ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
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
				
				


				
				ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosPlanCuentas.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosPlanCuentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosPlanCuentasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadosPlanCuentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosplancuentasAnterior =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadosplancuentasAnterior =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarListadosPlanCuentas")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosListadosPlanCuentasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosListadosPlanCuentas.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.listadosplancuentas =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.listadosplancuentas);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarListadosPlanCuentas")) {
				
				}
				
				ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarListadosPlanCuentas")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosListadosPlanCuentas.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarListadosPlanCuentas")) {
			
			}
			
			ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessListadosPlanCuentas();
			
			ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
			
			if(sTipo.equals("NuevoListadosPlanCuentas")) {
				jButtonNuevoListadosPlanCuentasActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarListadosPlanCuentas")) {
				jButtonDuplicarListadosPlanCuentasActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarListadosPlanCuentas")) {
				jButtonCopiarListadosPlanCuentasActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormListadosPlanCuentas")) {
				jButtonVerFormListadosPlanCuentasActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesListadosPlanCuentas")) {
				jButtonNuevoListadosPlanCuentasActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarListadosPlanCuentas")) {
				jButtonModificarListadosPlanCuentasActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarListadosPlanCuentas")) {
				jButtonActualizarListadosPlanCuentasActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarListadosPlanCuentas")) {
				jButtonEliminarListadosPlanCuentasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaListadosPlanCuentas")) {
				jButtonGuardarCambiosListadosPlanCuentasActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarListadosPlanCuentas")) {
				jButtonCancelarListadosPlanCuentasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarListadosPlanCuentas")) {
				jButtonCerrarListadosPlanCuentasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosListadosPlanCuentas")) {
				jButtonGuardarCambiosListadosPlanCuentasActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosListadosPlanCuentas")) {
				jButtonNuevoGuardarCambiosListadosPlanCuentasActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByListadosPlanCuentas")) {
				jButtonAbrirOrderByListadosPlanCuentasActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionListadosPlanCuentas")) {
				jButtonRecargarInformacionListadosPlanCuentasActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresListadosPlanCuentas")) {
				jButtonAnterioresListadosPlanCuentasActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesListadosPlanCuentas")) {
				jButtonSiguientesListadosPlanCuentasActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idListadosPlanCuentasBusqueda")) {
				this.jButtonidListadosPlanCuentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaListadosPlanCuentasUpdate")) {
				this.jButtonid_empresaListadosPlanCuentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaListadosPlanCuentasBusqueda")) {
				this.jButtonid_empresaListadosPlanCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_monedaListadosPlanCuentasBusqueda")) {
				this.jButtonnombre_monedaListadosPlanCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoListadosPlanCuentasBusqueda")) {
				this.jButtoncodigoListadosPlanCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreListadosPlanCuentasBusqueda")) {
				this.jButtonnombreListadosPlanCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_nivel_cuentaListadosPlanCuentasBusqueda")) {
				this.jButtonnombre_nivel_cuentaListadosPlanCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_movimientoListadosPlanCuentasBusqueda")) {
				this.jButtones_movimientoListadosPlanCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_centro_costoListadosPlanCuentasBusqueda")) {
				this.jButtones_centro_costoListadosPlanCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_centro_actividadListadosPlanCuentasBusqueda")) {
				this.jButtones_centro_actividadListadosPlanCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_para_f52ListadosPlanCuentasBusqueda")) {
				this.jButtones_para_f52ListadosPlanCuentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ordenListadosPlanCuentasBusqueda")) {
				this.jButtonordenListadosPlanCuentasBusquedaActionPerformed(evt);
			}
			
			ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessListadosPlanCuentas();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameListadosPlanCuentas")) {
				closingInternalFrameListadosPlanCuentas();
				
			} else if(sTipo.equals("jButtonCancelarListadosPlanCuentas")) {
				JInternalFrameBase jInternalFrameDetalleFormListadosPlanCuentas = (JInternalFrameBase)evt.getSource();
	            	
	            ListadosPlanCuentasBeanSwingJInternalFrame jInternalFrameParent=(ListadosPlanCuentasBeanSwingJInternalFrame)jInternalFrameDetalleFormListadosPlanCuentas.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarListadosPlanCuentasActionPerformed(null);
			}
			
			ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.listadosplancuentas,new Object(),this.listadosplancuentasParameterGeneral,this.listadosplancuentasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormListadosPlanCuentas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormListadosPlanCuentas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormListadosPlanCuentas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.listadosplancuentas)) {
			if(!esControlTabla) {
				if(ListadosPlanCuentasJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualListadosPlanCuentas(this.listadosplancuentas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosPlanCuentas(this.listadosplancuentas);			
				}
				
				if(this.listadosplancuentasSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualListadosPlanCuentas(this.listadosplancuentas,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanListadosPlanCuentas(this.listadosplancuentasReturnGeneral,this.listadosplancuentasBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.listadosplancuentasSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanListadosPlanCuentas(classes,this.listadosplancuentasReturnGeneral,this.listadosplancuentasBean,false);
					}
						
					if(this.listadosplancuentasReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyListadosPlanCuentas(this.listadosplancuentasReturnGeneral.getListadosPlanCuentas());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioListadosPlanCuentas(this.listadosplancuentasReturnGeneral.getListadosPlanCuentas());	
					}
						
					if(this.listadosplancuentasReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioListadosPlanCuentas(this.listadosplancuentasReturnGeneral.getListadosPlanCuentas(),classes);//this.listadosplancuentasBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioListadosPlanCuentas(this.listadosplancuentas,classes);//this.listadosplancuentasBean);									
				}
			
				if(ListadosPlanCuentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualListadosPlanCuentas(this.listadosplancuentas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosPlanCuentas(this.listadosplancuentas);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.listadosplancuentasAnterior!=null) {
						this.listadosplancuentas=this.listadosplancuentasAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.listadosplancuentasSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.listadosplancuentasSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.listadosplancuentasReturnGeneral.getListadosPlanCuentas(),listadosplancuentasLogic.getListadosPlanCuentass());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.listadosplancuentasReturnGeneral.getListadosPlanCuentas(),this.listadosplancuentass);
				}
				//ARCHITECTURE
				
				//this.jTableDatosListadosPlanCuentas.repaint();
				
				//((AbstractTableModel) this.jTableDatosListadosPlanCuentas.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosListadosPlanCuentas();
			}
		}
	}
	
	public void actualizarVisualTableDatosListadosPlanCuentas() throws Exception {
		
		ListadosPlanCuentasModel listadosplancuentasModel=(ListadosPlanCuentasModel)this.jTableDatosListadosPlanCuentas.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			listadosplancuentasModel.listadosplancuentass=this.listadosplancuentasLogic.getListadosPlanCuentass();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			listadosplancuentasModel.listadosplancuentass=this.listadosplancuentass;
		}
		
		
		((ListadosPlanCuentasModel) this.jTableDatosListadosPlanCuentas.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaListadosPlanCuentas() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getlistadosplancuentasAnterior(),this.listadosplancuentasLogic.getListadosPlanCuentass());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getlistadosplancuentasAnterior(),this.listadosplancuentass);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosListadosPlanCuentas();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioListadosPlanCuentas(ListadosPlanCuentas listadosplancuentas,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
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
										
				ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.listadosplancuentas,new Object(),generalEntityParameterGeneral,this.listadosplancuentasReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.listadosplancuentasSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ListadosPlanCuentasConstantesFunciones.getClassesRelationshipsOfListadosPlanCuentas(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ListadosPlanCuentasConstantesFunciones.getClassesRelationshipsFromStringsOfListadosPlanCuentas(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormListadosPlanCuentas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ListadosPlanCuentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.listadosplancuentas,new Object(),generalEntityParameterGeneral,this.listadosplancuentasReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioListadosPlanCuentas(ListadosPlanCuentasBean listadosplancuentasBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanListadosPlanCuentas(ArrayList<Classe> classes,ListadosPlanCuentasReturnGeneral listadosplancuentasReturnGeneral,ListadosPlanCuentasBean listadosplancuentasBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualListadosPlanCuentas(ListadosPlanCuentas listadosplancuentas,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.listadosplancuentas)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormListadosPlanCuentas = new ListadosPlanCuentasDetalleFormJInternalFrame(jDesktopPane,this.listadosplancuentasSessionBean.getConGuardarRelaciones(),this.listadosplancuentasSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormListadosPlanCuentas);
		this.jInternalFrameDetalleFormListadosPlanCuentas.setVisible(false);
		this.jInternalFrameDetalleFormListadosPlanCuentas.setSelected(false);						
		
		this.jInternalFrameDetalleFormListadosPlanCuentas.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormListadosPlanCuentas.listadosplancuentasLogic=this.listadosplancuentasLogic;
		
		this.cargarCombosFrameForeignKeyListadosPlanCuentas("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleListadosPlanCuentas();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleListadosPlanCuentas();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyListadosPlanCuentas("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyListadosPlanCuentas();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormListadosPlanCuentas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarListadosPlanCuentas"));
		
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonModificarListadosPlanCuentas.addActionListener(new ButtonActionListener(this,"ModificarListadosPlanCuentas"));

		
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonModificarToolBarListadosPlanCuentas.addActionListener(new ButtonActionListener(this,"ModificarToolBarListadosPlanCuentas"));
					
		this.jInternalFrameDetalleFormListadosPlanCuentas.jMenuItemModificarListadosPlanCuentas.addActionListener(new ButtonActionListener(this,"MenuItemModificarListadosPlanCuentas"));		
		
		
		
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonActualizarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"ActualizarListadosPlanCuentas"));
		
		
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonActualizarToolBarListadosPlanCuentas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarListadosPlanCuentas"));
						
		this.jInternalFrameDetalleFormListadosPlanCuentas.jMenuItemActualizarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarListadosPlanCuentas"));		
		
		
		
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonEliminarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"EliminarListadosPlanCuentas"));
		
		
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonEliminarToolBarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"EliminarToolBarListadosPlanCuentas"));
								
		this.jInternalFrameDetalleFormListadosPlanCuentas.jMenuItemEliminarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarListadosPlanCuentas"));		
		
		
		
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonCancelarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"CancelarListadosPlanCuentas"));
		
		
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonCancelarToolBarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"CancelarToolBarListadosPlanCuentas"));
					
		this.jInternalFrameDetalleFormListadosPlanCuentas.jMenuItemCancelarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarListadosPlanCuentas"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormListadosPlanCuentas.jMenuItemDetalleCerrarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarListadosPlanCuentas"));		
		
		
		
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonGuardarCambiosToolBarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarListadosPlanCuentas"));
		
		
		
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonGuardarCambiosToolBarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarListadosPlanCuentas"));
		
		
		
		this.jInternalFrameDetalleFormListadosPlanCuentas.jComboBoxTiposAccionesFormularioListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioListadosPlanCuentas"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonidListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"idListadosPlanCuentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonid_empresaListadosPlanCuentasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaListadosPlanCuentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonid_empresaListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaListadosPlanCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonnombre_monedaListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_monedaListadosPlanCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtoncodigoListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"codigoListadosPlanCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonnombreListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"nombreListadosPlanCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonnombre_nivel_cuentaListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_nivel_cuentaListadosPlanCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtones_movimientoListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"es_movimientoListadosPlanCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtones_centro_costoListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"es_centro_costoListadosPlanCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtones_centro_actividadListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"es_centro_actividadListadosPlanCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtones_para_f52ListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"es_para_f52ListadosPlanCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonordenListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"ordenListadosPlanCuentasBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormListadosPlanCuentas.jTabbedPaneRelacionesListadosPlanCuentas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesListadosPlanCuentas"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameListadosPlanCuentas"));
		
		if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosPlanCuentas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarListadosPlanCuentas"));
		}
		
		this.jTableDatosListadosPlanCuentas.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarListadosPlanCuentas"));
		
		this.jTableDatosListadosPlanCuentas.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarListadosPlanCuentas"));
		
		this.jButtonNuevoListadosPlanCuentas.addActionListener(new ButtonActionListener(this,"NuevoListadosPlanCuentas"));
		
		this.jButtonDuplicarListadosPlanCuentas.addActionListener(new ButtonActionListener(this,"DuplicarListadosPlanCuentas"));
		
		this.jButtonCopiarListadosPlanCuentas.addActionListener(new ButtonActionListener(this,"CopiarListadosPlanCuentas"));
		
		this.jButtonVerFormListadosPlanCuentas.addActionListener(new ButtonActionListener(this,"VerFormListadosPlanCuentas"));
		
		
		this.jButtonNuevoToolBarListadosPlanCuentas.addActionListener(new ButtonActionListener(this,"NuevoToolBarListadosPlanCuentas"));
			
		this.jButtonDuplicarToolBarListadosPlanCuentas.addActionListener(new ButtonActionListener(this,"DuplicarToolBarListadosPlanCuentas"));
			
		this.jMenuItemNuevoListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoListadosPlanCuentas"));
			
		this.jMenuItemDuplicarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarListadosPlanCuentas"));		
		
		
		this.jButtonNuevoRelacionesListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"NuevoRelacionesListadosPlanCuentas"));
		
		
		this.jButtonNuevoRelacionesToolBarListadosPlanCuentas.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarListadosPlanCuentas"));
			
		this.jMenuItemNuevoRelacionesListadosPlanCuentas.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesListadosPlanCuentas"));		
		
		
		if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonModificarListadosPlanCuentas.addActionListener(new ButtonActionListener(this,"ModificarListadosPlanCuentas"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonModificarToolBarListadosPlanCuentas.addActionListener(new ButtonActionListener(this,"ModificarToolBarListadosPlanCuentas"));
			
			this.jInternalFrameDetalleFormListadosPlanCuentas.jMenuItemModificarListadosPlanCuentas.addActionListener(new ButtonActionListener(this,"MenuItemModificarListadosPlanCuentas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonActualizarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"ActualizarListadosPlanCuentas"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonActualizarToolBarListadosPlanCuentas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarListadosPlanCuentas"));
				
			this.jInternalFrameDetalleFormListadosPlanCuentas.jMenuItemActualizarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarListadosPlanCuentas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonEliminarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"EliminarListadosPlanCuentas"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonEliminarToolBarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"EliminarToolBarListadosPlanCuentas"));
						
			this.jInternalFrameDetalleFormListadosPlanCuentas.jMenuItemEliminarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarListadosPlanCuentas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonCancelarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"CancelarListadosPlanCuentas"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonCancelarToolBarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"CancelarToolBarListadosPlanCuentas"));
			
			this.jInternalFrameDetalleFormListadosPlanCuentas.jMenuItemCancelarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarListadosPlanCuentas"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarListadosPlanCuentas"));		
		
		
		this.jButtonCerrarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"CerrarListadosPlanCuentas"));
		
		
		this.jButtonCerrarToolBarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"CerrarToolBarListadosPlanCuentas"));
			
		this.jMenuItemCerrarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"MenuItemCerrarListadosPlanCuentas"));
			
		if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosPlanCuentas.jMenuItemDetalleCerrarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarListadosPlanCuentas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonGuardarCambiosListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosListadosPlanCuentas"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonGuardarCambiosToolBarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarListadosPlanCuentas"));
		}
		
		this.jButtonCopiarToolBarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"CopiarToolBarListadosPlanCuentas"));
			
		this.jButtonVerFormToolBarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"VerFormToolBarListadosPlanCuentas"));
		
		this.jMenuItemGuardarCambiosListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosListadosPlanCuentas"));
			
		this.jMenuItemCopiarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"MenuItemCopiarListadosPlanCuentas"));		
		
		this.jMenuItemVerFormListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"MenuItemVerFormListadosPlanCuentas"));		
		
		
		this.jButtonGuardarCambiosTablaListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaListadosPlanCuentas"));
		
		
		this.jButtonGuardarCambiosTablaToolBarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarListadosPlanCuentas"));
			
		this.jMenuItemGuardarCambiosTablaListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaListadosPlanCuentas"));		
		
		
		
		this.jButtonRecargarInformacionListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"RecargarInformacionListadosPlanCuentas"));
					
		this.jButtonRecargarInformacionToolBarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarListadosPlanCuentas"));
		
		this.jMenuItemRecargarInformacionListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionListadosPlanCuentas"));		
		
		
		
		this.jButtonAnterioresListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"AnterioresListadosPlanCuentas"));
		
		
		this.jButtonAnterioresToolBarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"AnterioresToolBarListadosPlanCuentas"));
		
		this.jMenuItemAnterioresListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresListadosPlanCuentas"));		
		
		
		this.jButtonSiguientesListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"SiguientesListadosPlanCuentas"));
		
		
		this.jButtonSiguientesToolBarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"SiguientesToolBarListadosPlanCuentas"));
			
		this.jMenuItemSiguientesListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesListadosPlanCuentas"));
			
		this.jMenuItemAbrirOrderByListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByListadosPlanCuentas"));
			
		this.jMenuItemMostrarOcultarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarListadosPlanCuentas"));
			
		this.jMenuItemDetalleAbrirOrderByListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByListadosPlanCuentas"));
			
		this.jMenuItemDetalleMostarOcultarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarListadosPlanCuentas"));		
		
		
		this.jButtonNuevoGuardarCambiosListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosListadosPlanCuentas"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarListadosPlanCuentas"));
			
		this.jMenuItemNuevoGuardarCambiosListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosListadosPlanCuentas"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosListadosPlanCuentas.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosListadosPlanCuentas"));

		this.jCheckBoxSeleccionadosListadosPlanCuentas.addItemListener(new CheckBoxItemListener(this,"SeleccionadosListadosPlanCuentas"));
		
		if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosPlanCuentas.jComboBoxTiposAccionesFormularioListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioListadosPlanCuentas"));
		}
		
		
		this.jComboBoxTiposRelacionesListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"TiposRelacionesListadosPlanCuentas"));
			
		this.jComboBoxTiposAccionesListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"TiposAccionesListadosPlanCuentas"));
					
		this.jComboBoxTiposSeleccionarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"TiposSeleccionarListadosPlanCuentas"));
			
		this.jTextFieldValorCampoGeneralListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralListadosPlanCuentas"));		
		
		
		if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonidListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"idListadosPlanCuentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonid_empresaListadosPlanCuentasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaListadosPlanCuentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonid_empresaListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaListadosPlanCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonnombre_monedaListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_monedaListadosPlanCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtoncodigoListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"codigoListadosPlanCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonnombreListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"nombreListadosPlanCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonnombre_nivel_cuentaListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_nivel_cuentaListadosPlanCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtones_movimientoListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"es_movimientoListadosPlanCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtones_centro_costoListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"es_centro_costoListadosPlanCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtones_centro_actividadListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"es_centro_actividadListadosPlanCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtones_para_f52ListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"es_para_f52ListadosPlanCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonordenListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"ordenListadosPlanCuentasBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaListadosPlanCuentasListadosPlanCuentas.addActionListener(new ButtonActionListener(this,"BusquedaListadosPlanCuentasListadosPlanCuentas"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoListadosPlanCuentas!=null) {
				this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoListadosPlanCuentas"));
				this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoListadosPlanCuentas"));
				this.jInternalFrameReporteDinamicoListadosPlanCuentas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoListadosPlanCuentas"));
			}
			
			//this.jButtonCerrarReporteDinamicoListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoListadosPlanCuentas"));				
			//this.jButtonGenerarReporteDinamicoListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoListadosPlanCuentas"));
			//this.jButtonGenerarExcelReporteDinamicoListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoListadosPlanCuentas"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionListadosPlanCuentas!=null) {
				this.jInternalFrameImportacionListadosPlanCuentas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionListadosPlanCuentas"));
				this.jInternalFrameImportacionListadosPlanCuentas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionListadosPlanCuentas"));
				this.jInternalFrameImportacionListadosPlanCuentas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionListadosPlanCuentas"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"AbrirOrderByListadosPlanCuentas"));
			
			this.jButtonAbrirOrderByToolBarListadosPlanCuentas.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarListadosPlanCuentas"));			
			
			if(this.jInternalFrameOrderByListadosPlanCuentas!=null) {
				this.jInternalFrameOrderByListadosPlanCuentas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByListadosPlanCuentas"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosPlanCuentas.jTabbedPaneRelacionesListadosPlanCuentas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesListadosPlanCuentas"));
		
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
            		closingInternalFrameListadosPlanCuentas();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormListadosPlanCuentas.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormListadosPlanCuentas = (JInternalFrameBase)event.getSource();
	            	
	            ListadosPlanCuentasBeanSwingJInternalFrame jInternalFrameParent=(ListadosPlanCuentasBeanSwingJInternalFrame)jInternalFrameDetalleFormListadosPlanCuentas.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarListadosPlanCuentasActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosListadosPlanCuentas.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosListadosPlanCuentasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosListadosPlanCuentas.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosListadosPlanCuentas.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadosPlanCuentasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadosPlanCuentasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadosPlanCuentasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoListadosPlanCuentas";
		inputMap = this.jButtonNuevoListadosPlanCuentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoListadosPlanCuentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoListadosPlanCuentasActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadosPlanCuentasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadosPlanCuentasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadosPlanCuentasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesListadosPlanCuentas";
		inputMap = this.jButtonNuevoRelacionesListadosPlanCuentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesListadosPlanCuentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoListadosPlanCuentasActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarListadosPlanCuentas";
		inputMap = this.jButtonModificarListadosPlanCuentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarListadosPlanCuentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarListadosPlanCuentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarListadosPlanCuentas";
		inputMap = this.jButtonActualizarListadosPlanCuentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarListadosPlanCuentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarListadosPlanCuentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarListadosPlanCuentas";
		inputMap = this.jButtonEliminarListadosPlanCuentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarListadosPlanCuentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarListadosPlanCuentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarListadosPlanCuentas";
		inputMap = this.jButtonCancelarListadosPlanCuentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarListadosPlanCuentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarListadosPlanCuentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarListadosPlanCuentas";
		inputMap = this.jButtonCerrarListadosPlanCuentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarListadosPlanCuentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarListadosPlanCuentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonGuardarCambiosListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosListadosPlanCuentas";
		inputMap = this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonGuardarCambiosListadosPlanCuentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonGuardarCambiosListadosPlanCuentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosListadosPlanCuentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosListadosPlanCuentas.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosListadosPlanCuentasItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesListadosPlanCuentas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesListadosPlanCuentasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarListadosPlanCuentas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarListadosPlanCuentasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralListadosPlanCuentas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralListadosPlanCuentasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonidListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"idListadosPlanCuentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonid_empresaListadosPlanCuentasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaListadosPlanCuentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonid_empresaListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaListadosPlanCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonnombre_monedaListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_monedaListadosPlanCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtoncodigoListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"codigoListadosPlanCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonnombreListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"nombreListadosPlanCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonnombre_nivel_cuentaListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_nivel_cuentaListadosPlanCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtones_movimientoListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"es_movimientoListadosPlanCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtones_centro_costoListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"es_centro_costoListadosPlanCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtones_centro_actividadListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"es_centro_actividadListadosPlanCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtones_para_f52ListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"es_para_f52ListadosPlanCuentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosPlanCuentas.jButtonordenListadosPlanCuentasBusqueda.addActionListener(new ButtonActionListener(this,"ordenListadosPlanCuentasBusqueda"));
		
		
		this.jButtonBusquedaListadosPlanCuentasListadosPlanCuentas.addActionListener(new ButtonActionListener(this,"BusquedaListadosPlanCuentasListadosPlanCuentas"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionListadosPlanCuentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionListadosPlanCuentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarListadosPlanCuentasActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarListadosPlanCuentas.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosListadosPlanCuentas(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ListadosPlanCuentas listadosplancuentasAux:this.listadosplancuentasLogic.getListadosPlanCuentass()) {
					listadosplancuentasAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadosPlanCuentas listadosplancuentasAux:listadosplancuentass) {
					listadosplancuentasAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosListadosPlanCuentasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingListadosPlanCuentas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ListadosPlanCuentas listadosplancuentasAux:this.listadosplancuentasLogic.getListadosPlanCuentass()) {
						listadosplancuentasAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ListadosPlanCuentas listadosplancuentasAux:listadosplancuentass) {
						listadosplancuentasAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ListadosPlanCuentas listadosplancuentasAux:this.listadosplancuentasLogic.getListadosPlanCuentass()) {
					
						if(sTipoSeleccionar.equals(ListadosPlanCuentasConstantesFunciones.LABEL_ESMOVIMIENTO)) {
							existe=true;
							listadosplancuentasAux.setes_movimiento(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROCOSTO)) {
							existe=true;
							listadosplancuentasAux.setes_centro_costo(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROACTIVIDAD)) {
							existe=true;
							listadosplancuentasAux.setes_centro_actividad(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ListadosPlanCuentasConstantesFunciones.LABEL_ESPARAF52)) {
							existe=true;
							listadosplancuentasAux.setes_para_f52(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ListadosPlanCuentas listadosplancuentasAux:listadosplancuentass) {
						
						if(sTipoSeleccionar.equals(ListadosPlanCuentasConstantesFunciones.LABEL_ESMOVIMIENTO)) {
							existe=true;
							listadosplancuentasAux.setes_movimiento(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROCOSTO)) {
							existe=true;
							listadosplancuentasAux.setes_centro_costo(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROACTIVIDAD)) {
							existe=true;
							listadosplancuentasAux.setes_centro_actividad(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(ListadosPlanCuentasConstantesFunciones.LABEL_ESPARAF52)) {
							existe=true;
							listadosplancuentasAux.setes_para_f52(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaListadosPlanCuentas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosListadosPlanCuentas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosListadosPlanCuentas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosListadosPlanCuentas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosListadosPlanCuentasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingListadosPlanCuentas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosListadosPlanCuentas.getSelectedRows();
			
			ListadosPlanCuentas listadosplancuentasLocal=new ListadosPlanCuentas();
			
			//this.seleccionarTodosListadosPlanCuentas(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					listadosplancuentasLocal =(ListadosPlanCuentas) this.listadosplancuentasLogic.getListadosPlanCuentass().toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					listadosplancuentasLocal =(ListadosPlanCuentas) this.listadosplancuentass.toArray()[this.jTableDatosListadosPlanCuentas.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				listadosplancuentasLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ListadosPlanCuentas listadosplancuentasAux:this.listadosplancuentasLogic.getListadosPlanCuentass()) {
						listadosplancuentasAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ListadosPlanCuentas listadosplancuentasAux:listadosplancuentass) {
						listadosplancuentasAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaListadosPlanCuentas(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosListadosPlanCuentas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosListadosPlanCuentas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosListadosPlanCuentas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualListadosPlanCuentasItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarListadosPlanCuentasParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralListadosPlanCuentasActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingListadosPlanCuentas(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralListadosPlanCuentas.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ListadosPlanCuentas listadosplancuentasAux:this.listadosplancuentasLogic.getListadosPlanCuentass()) {
				
						if(sTipoSeleccionar.equals(ListadosPlanCuentasConstantesFunciones.LABEL_NOMBREMONEDA)) {
							existe=true;
							listadosplancuentasAux.setnombre_moneda(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosPlanCuentasConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							listadosplancuentasAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							listadosplancuentasAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRENIVELCUENTA)) {
							existe=true;
							listadosplancuentasAux.setnombre_nivel_cuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosPlanCuentasConstantesFunciones.LABEL_ORDEN)) {
							existe=true;
							listadosplancuentasAux.setorden(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadosPlanCuentas listadosplancuentasAux:listadosplancuentass) {
					
						if(sTipoSeleccionar.equals(ListadosPlanCuentasConstantesFunciones.LABEL_NOMBREMONEDA)) {
							existe=true;
							listadosplancuentasAux.setnombre_moneda(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosPlanCuentasConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							listadosplancuentasAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							listadosplancuentasAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRENIVELCUENTA)) {
							existe=true;
							listadosplancuentasAux.setnombre_nivel_cuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosPlanCuentasConstantesFunciones.LABEL_ORDEN)) {
							existe=true;
							listadosplancuentasAux.setorden(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaListadosPlanCuentas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesListadosPlanCuentasActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingListadosPlanCuentas(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioListadosPlanCuentas=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesListadosPlanCuentas.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormListadosPlanCuentas.jComboBoxTiposAccionesFormularioListadosPlanCuentas.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteListadosPlanCuentas) {				
					conSplash=true;//false;										
					
					//this.startProcessListadosPlanCuentas(conSplash);
				
					this.generarReporteListadosPlanCuentassSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadosPlanCuentas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadosPlanCuentas.jComboBoxTiposAccionesFormularioListadosPlanCuentas.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoListadosPlanCuentassSeleccionados();
				//this.jComboBoxTiposAccionesListadosPlanCuentas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoListadosPlanCuentassSeleccionados(false);
				//this.jComboBoxTiposAccionesListadosPlanCuentas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoListadosPlanCuentassSeleccionados(true);
				//this.jComboBoxTiposAccionesListadosPlanCuentas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessListadosPlanCuentas();
				
				this.exportarListadosPlanCuentassSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadosPlanCuentas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadosPlanCuentas.jComboBoxTiposAccionesFormularioListadosPlanCuentas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionListadosPlanCuentass();
				//this.importarListadosPlanCuentass();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadosPlanCuentas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadosPlanCuentas.jComboBoxTiposAccionesFormularioListadosPlanCuentas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessListadosPlanCuentas();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelListadosPlanCuentassSeleccionados();
				//this.jComboBoxTiposAccionesListadosPlanCuentas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Listados Plan Cuentas", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessListadosPlanCuentas();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoListadosPlanCuentas)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyListadosPlanCuentas(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Listados Plan Cuentas",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadosPlanCuentas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadosPlanCuentas.jComboBoxTiposAccionesFormularioListadosPlanCuentas.setSelectedIndex(0);					
				}	
			} 			
			else if(ListadosPlanCuentasBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteListadosPlanCuentas) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessListadosPlanCuentas(conSplash);
					
						//this.actualizarParametrosGeneralListadosPlanCuentas();
						
						this.generarReporteProcesoAccionListadosPlanCuentassSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesListadosPlanCuentas.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormListadosPlanCuentas.jComboBoxTiposAccionesFormularioListadosPlanCuentas.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ListadosPlanCuentasBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Listados Plan CuentasES SELECCIONADOS?", "MANTENIMIENTO DE Listados Plan Cuentas", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessListadosPlanCuentas();
				
						this.actualizarParametrosGeneralListadosPlanCuentas();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.listadosplancuentasReturnGeneral=listadosplancuentasLogic.procesarAccionListadosPlanCuentassWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.listadosplancuentasLogic.getListadosPlanCuentass(),this.listadosplancuentasParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarListadosPlanCuentasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesListadosPlanCuentas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormListadosPlanCuentas.jComboBoxTiposAccionesFormularioListadosPlanCuentas.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralListadosPlanCuentas();
					
					ListadosPlanCuentasBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarListadosPlanCuentasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesListadosPlanCuentas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormListadosPlanCuentas.jComboBoxTiposAccionesFormularioListadosPlanCuentas.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessListadosPlanCuentas(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesListadosPlanCuentasActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessListadosPlanCuentas();
			
			if(this.jInternalFrameDetalleFormListadosPlanCuentas==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ListadosPlanCuentas> listadosplancuentassSeleccionados=new ArrayList<ListadosPlanCuentas>();		
			ListadosPlanCuentas listadosplancuentas=new ListadosPlanCuentas();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingListadosPlanCuentas(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesListadosPlanCuentas.getSelectedItem();
			
			
			
			
			listadosplancuentassSeleccionados=this.getListadosPlanCuentassSeleccionados(true);
			//this.sTipoAccion;
			
			if(listadosplancuentassSeleccionados.size()==1) {
				for(ListadosPlanCuentas listadosplancuentasAux:listadosplancuentassSeleccionados) {
					listadosplancuentas=listadosplancuentasAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessListadosPlanCuentas();
			
      		//this.finishProcessListadosPlanCuentas(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarListadosPlanCuentasReturnGeneral() throws Exception {
		if(this.listadosplancuentasReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.listadosplancuentasReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.listadosplancuentasReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.listadosplancuentasReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.listadosplancuentasReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.listadosplancuentasReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingListadosPlanCuentas(false);
		}
		
		if(this.listadosplancuentasReturnGeneral.getConRetornoLista() || this.listadosplancuentasReturnGeneral.getConRetornoObjeto()) {
			if(this.listadosplancuentasReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.listadosplancuentasLogic.setListadosPlanCuentass(this.listadosplancuentasReturnGeneral.getListadosPlanCuentass());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingListadosPlanCuentas(false);
		}
	}
	
	public void actualizarParametrosGeneralListadosPlanCuentas() throws Exception {
		
		
	}
	
	public ArrayList<ListadosPlanCuentas> getListadosPlanCuentassSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ListadosPlanCuentas> listadosplancuentassSeleccionados=new ArrayList<ListadosPlanCuentas>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioListadosPlanCuentas) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ListadosPlanCuentas listadosplancuentasAux:listadosplancuentasLogic.getListadosPlanCuentass()) {
					if(listadosplancuentasAux.getIsSelected()) {
						listadosplancuentassSeleccionados.add(listadosplancuentasAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadosPlanCuentas listadosplancuentasAux:this.listadosplancuentass) {
					if(listadosplancuentasAux.getIsSelected()) {
						listadosplancuentassSeleccionados.add(listadosplancuentasAux);				
					}
				}
			}
			
			if(listadosplancuentassSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						listadosplancuentassSeleccionados.addAll(this.listadosplancuentasLogic.getListadosPlanCuentass());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						listadosplancuentassSeleccionados.addAll(this.listadosplancuentass);				
					}
				}
			}
		} else {
			listadosplancuentassSeleccionados.add(this.listadosplancuentas);
		}
		
		return listadosplancuentassSeleccionados;
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
	
	public void generarReporteListadosPlanCuentassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalListadosPlanCuentassSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoListadosPlanCuentassSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoListadosPlanCuentassSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoListadosPlanCuentassSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Listados Plan Cuentas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesListadosPlanCuentassSeleccionados() throws Exception {
		ArrayList<ListadosPlanCuentas> listadosplancuentassSeleccionados=new ArrayList<ListadosPlanCuentas>();		
		
		listadosplancuentassSeleccionados=this.getListadosPlanCuentassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteListadosPlanCuentass("Todos",listadosplancuentassSeleccionados);
		
	}	
	
	public void generarReporteNormalListadosPlanCuentassSeleccionados() throws Exception {
		ArrayList<ListadosPlanCuentas> listadosplancuentassSeleccionados=new ArrayList<ListadosPlanCuentas>();		
		
		listadosplancuentassSeleccionados=this.getListadosPlanCuentassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteListadosPlanCuentass("Todos",listadosplancuentassSeleccionados);
	}		
	
	public void generarReporteProcesoAccionListadosPlanCuentassSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ListadosPlanCuentas> listadosplancuentassSeleccionados=new ArrayList<ListadosPlanCuentas>();
		
		listadosplancuentassSeleccionados=this.getListadosPlanCuentassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteListadosPlanCuentass("Todos",listadosplancuentassSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoListadosPlanCuentassSeleccionados() throws Exception {
		ArrayList<ListadosPlanCuentas> listadosplancuentassSeleccionados=new ArrayList<ListadosPlanCuentas>();		
		
		
		this.abrirInicializarFrameReporteDinamicoListadosPlanCuentas();
		
		
		listadosplancuentassSeleccionados=this.getListadosPlanCuentassSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoListadosPlanCuentas();
		
		
		//this.generarReporteListadosPlanCuentass("Todos",listadosplancuentassSeleccionados ,listadosplancuentasImplementable,listadosplancuentasImplementableHome);
	}
	
	public void mostrarImportacionListadosPlanCuentass() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionListadosPlanCuentas();
		
		this.abrirFrameImportacionListadosPlanCuentas();		
		
			
		//this.generarReporteListadosPlanCuentass("Todos",listadosplancuentassSeleccionados ,listadosplancuentasImplementable,listadosplancuentasImplementableHome);
	}
	
	public void importarListadosPlanCuentass() throws Exception {		
	
	}
	
	public void exportarListadosPlanCuentassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelListadosPlanCuentassSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoListadosPlanCuentassSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlListadosPlanCuentassSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Listados Plan Cuentas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoListadosPlanCuentassSeleccionados() throws Exception {
		ArrayList<ListadosPlanCuentas> listadosplancuentassSeleccionados=new ArrayList<ListadosPlanCuentas>();		
		
		listadosplancuentassSeleccionados=this.getListadosPlanCuentassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadosplancuentas."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarListadosPlanCuentas(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ListadosPlanCuentas listadosplancuentasAux:listadosplancuentassSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarListadosPlanCuentas(listadosplancuentasAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//listadosplancuentasAux.setsDetalleGeneralEntityReporte(listadosplancuentasAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Plan Cuentas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarListadosPlanCuentas(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ListadosPlanCuentasConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosPlanCuentasConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosPlanCuentasConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosPlanCuentasConstantesFunciones.LABEL_NOMBREMONEDA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosPlanCuentasConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRENIVELCUENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosPlanCuentasConstantesFunciones.LABEL_ESMOVIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROCOSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROACTIVIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosPlanCuentasConstantesFunciones.LABEL_ESPARAF52;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosPlanCuentasConstantesFunciones.LABEL_ORDEN;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarListadosPlanCuentas(ListadosPlanCuentas listadosplancuentas,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=listadosplancuentas.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosplancuentas.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosplancuentas.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosplancuentas.getnombre_moneda();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosplancuentas.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosplancuentas.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosplancuentas.getnombre_nivel_cuenta();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosplancuentas.getes_movimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosplancuentas.getes_centro_costo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosplancuentas.getes_centro_actividad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosplancuentas.getes_para_f52().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosplancuentas.getorden().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelListadosPlanCuentassSeleccionados() throws Exception {
		ArrayList<ListadosPlanCuentas> listadosplancuentassSeleccionados=new ArrayList<ListadosPlanCuentas>();		
		
		listadosplancuentassSeleccionados=this.getListadosPlanCuentassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadosplancuentas.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ListadosPlanCuentass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelListadosPlanCuentas(row);				
				iRow++;
			}				
			
			for(ListadosPlanCuentas listadosplancuentasAux:listadosplancuentassSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelListadosPlanCuentas(listadosplancuentasAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Plan Cuentas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlListadosPlanCuentassSeleccionados() throws Exception {
		ArrayList<ListadosPlanCuentas> listadosplancuentassSeleccionados=new ArrayList<ListadosPlanCuentas>();		
		
		listadosplancuentassSeleccionados=this.getListadosPlanCuentassSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadosplancuentas.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("listadosplancuentass");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("listadosplancuentas");
			//elementRoot.appendChild(element);
		
			for(ListadosPlanCuentas listadosplancuentasAux:listadosplancuentassSeleccionados) {
				element = document.createElement("listadosplancuentas");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlListadosPlanCuentas(listadosplancuentasAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Plan Cuentas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelListadosPlanCuentas(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_NOMBREMONEDA);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRENIVELCUENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_ESMOVIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROCOSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROACTIVIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_ESPARAF52);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosPlanCuentasConstantesFunciones.LABEL_ORDEN);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelListadosPlanCuentas(ListadosPlanCuentas listadosplancuentas,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(listadosplancuentas.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosplancuentas.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosplancuentas.getnombre_moneda());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosplancuentas.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosplancuentas.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosplancuentas.getnombre_nivel_cuenta());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosplancuentas.getes_movimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosplancuentas.getes_centro_costo());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosplancuentas.getes_centro_actividad());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosplancuentas.getes_para_f52());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosplancuentas.getorden());				
	}
	
	public void setFilaDatosExportarXmlListadosPlanCuentas(ListadosPlanCuentas listadosplancuentas,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ListadosPlanCuentasConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(listadosplancuentas.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ListadosPlanCuentasConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(listadosplancuentas.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ListadosPlanCuentasConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(listadosplancuentas.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre_moneda = document.createElement(ListadosPlanCuentasConstantesFunciones.NOMBREMONEDA);
		elementnombre_moneda.appendChild(document.createTextNode(listadosplancuentas.getnombre_moneda().trim()));
		element.appendChild(elementnombre_moneda);

		Element elementcodigo = document.createElement(ListadosPlanCuentasConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(listadosplancuentas.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(ListadosPlanCuentasConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(listadosplancuentas.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementnombre_nivel_cuenta = document.createElement(ListadosPlanCuentasConstantesFunciones.NOMBRENIVELCUENTA);
		elementnombre_nivel_cuenta.appendChild(document.createTextNode(listadosplancuentas.getnombre_nivel_cuenta().trim()));
		element.appendChild(elementnombre_nivel_cuenta);

		Element elementes_movimiento = document.createElement(ListadosPlanCuentasConstantesFunciones.ESMOVIMIENTO);
		elementes_movimiento.appendChild(document.createTextNode(listadosplancuentas.getes_movimiento().toString().trim()));
		element.appendChild(elementes_movimiento);

		Element elementes_centro_costo = document.createElement(ListadosPlanCuentasConstantesFunciones.ESCENTROCOSTO);
		elementes_centro_costo.appendChild(document.createTextNode(listadosplancuentas.getes_centro_costo().toString().trim()));
		element.appendChild(elementes_centro_costo);

		Element elementes_centro_actividad = document.createElement(ListadosPlanCuentasConstantesFunciones.ESCENTROACTIVIDAD);
		elementes_centro_actividad.appendChild(document.createTextNode(listadosplancuentas.getes_centro_actividad().toString().trim()));
		element.appendChild(elementes_centro_actividad);

		Element elementes_para_f52 = document.createElement(ListadosPlanCuentasConstantesFunciones.ESPARAF52);
		elementes_para_f52.appendChild(document.createTextNode(listadosplancuentas.getes_para_f52().toString().trim()));
		element.appendChild(elementes_para_f52);

		Element elementorden = document.createElement(ListadosPlanCuentasConstantesFunciones.ORDEN);
		elementorden.appendChild(document.createTextNode(listadosplancuentas.getorden().toString().trim()));
		element.appendChild(elementorden);
	}
	
	public void generarReporteGroupGenericoListadosPlanCuentassSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ListadosPlanCuentas> listadosplancuentassSeleccionados=new ArrayList<ListadosPlanCuentas>();
		
		listadosplancuentassSeleccionados=this.getListadosPlanCuentassSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoListadosPlanCuentas(listadosplancuentassSeleccionados);
		
		this.generarReporteListadosPlanCuentass("Todos",listadosplancuentassSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoListadosPlanCuentas(ArrayList<ListadosPlanCuentas> listadosplancuentassSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ListadosPlanCuentas listadosplancuentasAux:listadosplancuentassSeleccionados) {
				listadosplancuentasAux.setsDetalleGeneralEntityReporte(listadosplancuentasAux.toString());
			
				if(sTipoSeleccionar.equals(ListadosPlanCuentasConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					listadosplancuentasAux.setsDescripcionGeneralEntityReporte1(listadosplancuentasAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ListadosPlanCuentasConstantesFunciones.LABEL_NOMBREMONEDA)) {
					existe=true;
					listadosplancuentasAux.setsDescripcionGeneralEntityReporte1(listadosplancuentasAux.getnombre_moneda());
				}
				 else if(sTipoSeleccionar.equals(ListadosPlanCuentasConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					listadosplancuentasAux.setsDescripcionGeneralEntityReporte1(listadosplancuentasAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					listadosplancuentasAux.setsDescripcionGeneralEntityReporte1(listadosplancuentasAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(ListadosPlanCuentasConstantesFunciones.LABEL_NOMBRENIVELCUENTA)) {
					existe=true;
					listadosplancuentasAux.setsDescripcionGeneralEntityReporte1(listadosplancuentasAux.getnombre_nivel_cuenta());
				}
				 else if(sTipoSeleccionar.equals(ListadosPlanCuentasConstantesFunciones.LABEL_ESMOVIMIENTO)) {
					existe=true;
					listadosplancuentasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(listadosplancuentasAux.getes_movimiento()));
				}
				 else if(sTipoSeleccionar.equals(ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROCOSTO)) {
					existe=true;
					listadosplancuentasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(listadosplancuentasAux.getes_centro_costo()));
				}
				 else if(sTipoSeleccionar.equals(ListadosPlanCuentasConstantesFunciones.LABEL_ESCENTROACTIVIDAD)) {
					existe=true;
					listadosplancuentasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(listadosplancuentasAux.getes_centro_actividad()));
				}
				 else if(sTipoSeleccionar.equals(ListadosPlanCuentasConstantesFunciones.LABEL_ESPARAF52)) {
					existe=true;
					listadosplancuentasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(listadosplancuentasAux.getes_para_f52()));
				}
				 else if(sTipoSeleccionar.equals(ListadosPlanCuentasConstantesFunciones.LABEL_ORDEN)) {
					existe=true;
					listadosplancuentasAux.setsDescripcionGeneralEntityReporte1(listadosplancuentasAux.getorden().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosPlanCuentasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesListadosPlanCuentas(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoListadosPlanCuentas=true;
				this.isVisibilidadCeldaNuevoRelacionesListadosPlanCuentas=true;
				this.isVisibilidadCeldaGuardarCambiosListadosPlanCuentas=true;
			}
			
			this.isVisibilidadCeldaModificarListadosPlanCuentas=false;
			this.isVisibilidadCeldaActualizarListadosPlanCuentas=false;
			this.isVisibilidadCeldaEliminarListadosPlanCuentas=false;
			this.isVisibilidadCeldaCancelarListadosPlanCuentas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosPlanCuentas=true;
				} else {
					this.isVisibilidadCeldaGuardarListadosPlanCuentas=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoListadosPlanCuentas=false;
			this.isVisibilidadCeldaNuevoRelacionesListadosPlanCuentas=false;
			this.isVisibilidadCeldaGuardarCambiosListadosPlanCuentas=false;
			this.isVisibilidadCeldaModificarListadosPlanCuentas=false;
			this.isVisibilidadCeldaActualizarListadosPlanCuentas=true;
			this.isVisibilidadCeldaEliminarListadosPlanCuentas=false;
			this.isVisibilidadCeldaCancelarListadosPlanCuentas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosPlanCuentas=true;
				} else {
					this.isVisibilidadCeldaGuardarListadosPlanCuentas=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoListadosPlanCuentas=false;
			this.isVisibilidadCeldaNuevoRelacionesListadosPlanCuentas=false;
			this.isVisibilidadCeldaGuardarCambiosListadosPlanCuentas=false;
			this.isVisibilidadCeldaModificarListadosPlanCuentas=false;
			this.isVisibilidadCeldaActualizarListadosPlanCuentas=true;
			this.isVisibilidadCeldaEliminarListadosPlanCuentas=true;
			this.isVisibilidadCeldaCancelarListadosPlanCuentas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosPlanCuentas=true;
				} else {
					this.isVisibilidadCeldaGuardarListadosPlanCuentas=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoListadosPlanCuentas=false;
			this.isVisibilidadCeldaNuevoRelacionesListadosPlanCuentas=false;
			this.isVisibilidadCeldaGuardarCambiosListadosPlanCuentas=false;
			this.isVisibilidadCeldaModificarListadosPlanCuentas=false;
			this.isVisibilidadCeldaActualizarListadosPlanCuentas=true;
			this.isVisibilidadCeldaEliminarListadosPlanCuentas=false;
			this.isVisibilidadCeldaCancelarListadosPlanCuentas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosPlanCuentas=false;
				} else {
					this.isVisibilidadCeldaGuardarListadosPlanCuentas=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoListadosPlanCuentas=true;
			this.isVisibilidadCeldaNuevoRelacionesListadosPlanCuentas=true;
			this.isVisibilidadCeldaGuardarCambiosListadosPlanCuentas=true;
			this.isVisibilidadCeldaModificarListadosPlanCuentas=false;
			this.isVisibilidadCeldaActualizarListadosPlanCuentas=false;
			this.isVisibilidadCeldaEliminarListadosPlanCuentas=false;
			this.isVisibilidadCeldaCancelarListadosPlanCuentas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosPlanCuentas=true;
				} else {
					this.isVisibilidadCeldaGuardarListadosPlanCuentas=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoListadosPlanCuentas=false;
			this.isVisibilidadCeldaNuevoRelacionesListadosPlanCuentas=false;
			this.isVisibilidadCeldaGuardarCambiosListadosPlanCuentas=false;
			this.isVisibilidadCeldaActualizarListadosPlanCuentas=false;
			this.isVisibilidadCeldaEliminarListadosPlanCuentas=false;
			this.isVisibilidadCeldaCancelarListadosPlanCuentas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosPlanCuentas=false;
				} else {
					this.isVisibilidadCeldaGuardarListadosPlanCuentas=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoListadosPlanCuentas=false;
			this.isVisibilidadCeldaNuevoRelacionesListadosPlanCuentas=false;
			this.isVisibilidadCeldaGuardarCambiosListadosPlanCuentas=false;
			this.isVisibilidadCeldaModificarListadosPlanCuentas=true;
			this.isVisibilidadCeldaActualizarListadosPlanCuentas=false;
			this.isVisibilidadCeldaEliminarListadosPlanCuentas=false;
			this.isVisibilidadCeldaCancelarListadosPlanCuentas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosPlanCuentas=false;
				} else {
					this.isVisibilidadCeldaGuardarListadosPlanCuentas=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ListadosPlanCuentasJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoListadosPlanCuentas=true;
			this.isVisibilidadCeldaNuevoRelacionesListadosPlanCuentas=true;
			this.isVisibilidadCeldaGuardarCambiosListadosPlanCuentas=true;
		} else {
			this.actualizarEstadoPanelsListadosPlanCuentas(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarListadosPlanCuentas=false;
			//this.isVisibilidadCeldaVerFormListadosPlanCuentas=false;
			this.isVisibilidadCeldaDuplicarListadosPlanCuentas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!listadosplancuentasSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesListadosPlanCuentas=false;
		} else {
			this.isVisibilidadCeldaNuevoListadosPlanCuentas=false;
			this.isVisibilidadCeldaGuardarCambiosListadosPlanCuentas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(listadosplancuentasSessionBean.getEsGuardarRelacionado()) {
			if(!listadosplancuentasSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesListadosPlanCuentas=false;												
			}
			
			this.jButtonCerrarListadosPlanCuentas.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesListadosPlanCuentas=false;
		}
		
		if(!this.permiteMantenimiento(this.listadosplancuentas)) {
			this.isVisibilidadCeldaActualizarListadosPlanCuentas=false;
			this.isVisibilidadCeldaEliminarListadosPlanCuentas=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoListadosPlanCuentas=false;
		this.isVisibilidadCeldaNuevoRelacionesListadosPlanCuentas=false;
		this.isVisibilidadCeldaGuardarCambiosListadosPlanCuentas=false;
		//this.isVisibilidadCeldaModificarListadosPlanCuentas=true;
		this.isVisibilidadCeldaActualizarListadosPlanCuentas=false;
		this.isVisibilidadCeldaEliminarListadosPlanCuentas=false;
		//this.isVisibilidadCeldaCancelarListadosPlanCuentas=true;			
		this.isVisibilidadCeldaGuardarListadosPlanCuentas=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesListadosPlanCuentas() {
	}
	
	public void actualizarEstadoPanelsListadosPlanCuentas(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionListadosPlanCuentas!=null) {
				this.jScrollPanelDatosEdicionListadosPlanCuentas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosPlanCuentas!=null) {
				this.jTabbedPaneBusquedasListadosPlanCuentas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadosPlanCuentas!=null) {
				this.jScrollPanelDatosListadosPlanCuentas.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadosPlanCuentas!=null) {
				this.jPanelPaginacionListadosPlanCuentas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadosPlanCuentas!=null) {
				this.jPanelParametrosReportesListadosPlanCuentas.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionListadosPlanCuentas!=null) {
				this.jScrollPanelDatosEdicionListadosPlanCuentas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosPlanCuentas!=null) {
				this.jTabbedPaneBusquedasListadosPlanCuentas.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosListadosPlanCuentas!=null) {
				this.jScrollPanelDatosListadosPlanCuentas.setVisible(false);
			}
			
			if(this.jPanelPaginacionListadosPlanCuentas!=null) {
				this.jPanelPaginacionListadosPlanCuentas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesListadosPlanCuentas!=null) {
				this.jPanelParametrosReportesListadosPlanCuentas.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionListadosPlanCuentas!=null) {
				this.jScrollPanelDatosEdicionListadosPlanCuentas.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosPlanCuentas!=null) {
				this.jTabbedPaneBusquedasListadosPlanCuentas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosListadosPlanCuentas!=null) {
				this.jScrollPanelDatosListadosPlanCuentas.setVisible(false);
			}
			
			if(this.jPanelPaginacionListadosPlanCuentas!=null) {
				this.jPanelPaginacionListadosPlanCuentas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesListadosPlanCuentas!=null) {
				this.jPanelParametrosReportesListadosPlanCuentas.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionListadosPlanCuentas!=null) {
				this.jScrollPanelDatosEdicionListadosPlanCuentas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosPlanCuentas!=null) {
				this.jTabbedPaneBusquedasListadosPlanCuentas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosListadosPlanCuentas!=null) {
				this.jScrollPanelDatosListadosPlanCuentas.setVisible(false);
			}
			
			if(this.jPanelPaginacionListadosPlanCuentas!=null) {
				this.jPanelPaginacionListadosPlanCuentas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesListadosPlanCuentas!=null) {
				this.jPanelParametrosReportesListadosPlanCuentas.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionListadosPlanCuentas!=null) {
				this.jScrollPanelDatosEdicionListadosPlanCuentas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosPlanCuentas!=null) {
				this.jTabbedPaneBusquedasListadosPlanCuentas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadosPlanCuentas!=null) {
				this.jScrollPanelDatosListadosPlanCuentas.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadosPlanCuentas!=null) {
				this.jPanelPaginacionListadosPlanCuentas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadosPlanCuentas!=null) {
				this.jPanelParametrosReportesListadosPlanCuentas.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionListadosPlanCuentas!=null) {
				this.jScrollPanelDatosEdicionListadosPlanCuentas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosPlanCuentas!=null) {
				this.jTabbedPaneBusquedasListadosPlanCuentas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadosPlanCuentas!=null) {
				this.jScrollPanelDatosListadosPlanCuentas.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadosPlanCuentas!=null) {
				this.jPanelPaginacionListadosPlanCuentas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadosPlanCuentas!=null) {
				this.jPanelParametrosReportesListadosPlanCuentas.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionListadosPlanCuentas!=null) {
				this.jScrollPanelDatosEdicionListadosPlanCuentas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosPlanCuentas!=null) {
				this.jTabbedPaneBusquedasListadosPlanCuentas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadosPlanCuentas!=null) {
				this.jScrollPanelDatosListadosPlanCuentas.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadosPlanCuentas!=null) {
				this.jPanelPaginacionListadosPlanCuentas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadosPlanCuentas!=null) {
				this.jPanelParametrosReportesListadosPlanCuentas.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasListadosPlanCuentas!=null) {
					this.jTabbedPaneBusquedasListadosPlanCuentas.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesListadosPlanCuentas!=null) {
				this.jPanelParametrosReportesListadosPlanCuentas.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.listadosplancuentasSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosPlanCuentas!=null) {
				this.jTabbedPaneBusquedasListadosPlanCuentas.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesListadosPlanCuentas!=null) {
				this.jPanelParametrosReportesListadosPlanCuentas.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaListadosPlanCuentas=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaListadosPlanCuentas) {this.jTabbedPaneBusquedasListadosPlanCuentas.remove(jPanelBusquedaListadosPlanCuentasListadosPlanCuentas);}
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
			
			this.inicializarActualizarBindingTablaListadosPlanCuentas(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioListadosPlanCuentas() {
		this.updateBorderResaltarBusquedasFormularioListadosPlanCuentas();
		this.updateVisibilidadBusquedasFormularioListadosPlanCuentas();
		this.updateHabilitarBusquedasFormularioListadosPlanCuentas();
	}
	
	public void updateBorderResaltarBusquedasFormularioListadosPlanCuentas() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasListadosPlanCuentas.getComponents().length>0) {
	

		if(this.listadosplancuentasConstantesFunciones.resaltarBusquedaListadosPlanCuentasListadosPlanCuentas!=null) {
			index= this.jTabbedPaneBusquedasListadosPlanCuentas.indexOfComponent(this.jPanelBusquedaListadosPlanCuentasListadosPlanCuentas);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasListadosPlanCuentas.getComponent(index);
				jPanel.setBorder(this.listadosplancuentasConstantesFunciones.resaltarBusquedaListadosPlanCuentasListadosPlanCuentas);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioListadosPlanCuentas() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasListadosPlanCuentas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasListadosPlanCuentas.indexOfComponent(this.jPanelBusquedaListadosPlanCuentasListadosPlanCuentas);
			jPanel=(JPanel)this.jTabbedPaneBusquedasListadosPlanCuentas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.listadosplancuentasConstantesFunciones.mostrarBusquedaListadosPlanCuentasListadosPlanCuentas);
			if(!this.listadosplancuentasConstantesFunciones.mostrarBusquedaListadosPlanCuentasListadosPlanCuentas && index>-1) {
				this.jTabbedPaneBusquedasListadosPlanCuentas.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioListadosPlanCuentas() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasListadosPlanCuentas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasListadosPlanCuentas.indexOfComponent(this.jPanelBusquedaListadosPlanCuentasListadosPlanCuentas);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasListadosPlanCuentas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.listadosplancuentasConstantesFunciones.activarBusquedaListadosPlanCuentasListadosPlanCuentas);
				this.jTabbedPaneBusquedasListadosPlanCuentas.setEnabledAt(index,this.listadosplancuentasConstantesFunciones.activarBusquedaListadosPlanCuentasListadosPlanCuentas);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaListadosPlanCuentas(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaListadosPlanCuentas")) {
			index= this.jTabbedPaneBusquedasListadosPlanCuentas.indexOfComponent(this.jPanelBusquedaListadosPlanCuentasListadosPlanCuentas);

			this.jTabbedPaneBusquedasListadosPlanCuentas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasListadosPlanCuentas.getComponent(index);

			this.listadosplancuentasConstantesFunciones.setResaltarBusquedaListadosPlanCuentasListadosPlanCuentas(resaltar);

			jPanel.setBorder(this.listadosplancuentasConstantesFunciones.resaltarBusquedaListadosPlanCuentasListadosPlanCuentas);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarListadosPlanCuentas.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioListadosPlanCuentas() throws Exception {

		if(this.jInternalFrameDetalleFormListadosPlanCuentas==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioListadosPlanCuentas();
		this.updateVisibilidadResaltarControlesFormularioListadosPlanCuentas();
		this.updateHabilitarResaltarControlesFormularioListadosPlanCuentas();
		
	}
	
	public void updateBorderResaltarControlesFormularioListadosPlanCuentas() throws Exception {
		if(this.jInternalFrameDetalleFormListadosPlanCuentas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.listadosplancuentasConstantesFunciones.resaltaridListadosPlanCuentas!=null && this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {this.jInternalFrameDetalleFormListadosPlanCuentas.jLabelidListadosPlanCuentas.setBorder(this.listadosplancuentasConstantesFunciones.resaltaridListadosPlanCuentas);}
		if(this.listadosplancuentasConstantesFunciones.resaltarid_empresaListadosPlanCuentas!=null && this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {this.jInternalFrameDetalleFormListadosPlanCuentas.jComboBoxid_empresaListadosPlanCuentas.setBorder(this.listadosplancuentasConstantesFunciones.resaltarid_empresaListadosPlanCuentas);}
		if(this.listadosplancuentasConstantesFunciones.resaltarnombre_monedaListadosPlanCuentas!=null && this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {this.jInternalFrameDetalleFormListadosPlanCuentas.jTextFieldnombre_monedaListadosPlanCuentas.setBorder(this.listadosplancuentasConstantesFunciones.resaltarnombre_monedaListadosPlanCuentas);}
		if(this.listadosplancuentasConstantesFunciones.resaltarcodigoListadosPlanCuentas!=null && this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {this.jInternalFrameDetalleFormListadosPlanCuentas.jTextFieldcodigoListadosPlanCuentas.setBorder(this.listadosplancuentasConstantesFunciones.resaltarcodigoListadosPlanCuentas);}
		if(this.listadosplancuentasConstantesFunciones.resaltarnombreListadosPlanCuentas!=null && this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {this.jInternalFrameDetalleFormListadosPlanCuentas.jTextAreanombreListadosPlanCuentas.setBorder(this.listadosplancuentasConstantesFunciones.resaltarnombreListadosPlanCuentas);}
		if(this.listadosplancuentasConstantesFunciones.resaltarnombre_nivel_cuentaListadosPlanCuentas!=null && this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {this.jInternalFrameDetalleFormListadosPlanCuentas.jTextAreanombre_nivel_cuentaListadosPlanCuentas.setBorder(this.listadosplancuentasConstantesFunciones.resaltarnombre_nivel_cuentaListadosPlanCuentas);}
		if(this.listadosplancuentasConstantesFunciones.resaltares_movimientoListadosPlanCuentas!=null && this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_movimientoListadosPlanCuentas.setBorderPainted(true);this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_movimientoListadosPlanCuentas.setBorder(this.listadosplancuentasConstantesFunciones.resaltares_movimientoListadosPlanCuentas);}
		if(this.listadosplancuentasConstantesFunciones.resaltares_centro_costoListadosPlanCuentas!=null && this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_centro_costoListadosPlanCuentas.setBorderPainted(true);this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_centro_costoListadosPlanCuentas.setBorder(this.listadosplancuentasConstantesFunciones.resaltares_centro_costoListadosPlanCuentas);}
		if(this.listadosplancuentasConstantesFunciones.resaltares_centro_actividadListadosPlanCuentas!=null && this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_centro_actividadListadosPlanCuentas.setBorderPainted(true);this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_centro_actividadListadosPlanCuentas.setBorder(this.listadosplancuentasConstantesFunciones.resaltares_centro_actividadListadosPlanCuentas);}
		if(this.listadosplancuentasConstantesFunciones.resaltares_para_f52ListadosPlanCuentas!=null && this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_para_f52ListadosPlanCuentas.setBorderPainted(true);this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_para_f52ListadosPlanCuentas.setBorder(this.listadosplancuentasConstantesFunciones.resaltares_para_f52ListadosPlanCuentas);}
		if(this.listadosplancuentasConstantesFunciones.resaltarordenListadosPlanCuentas!=null && this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {this.jInternalFrameDetalleFormListadosPlanCuentas.jTextFieldordenListadosPlanCuentas.setBorder(this.listadosplancuentasConstantesFunciones.resaltarordenListadosPlanCuentas);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioListadosPlanCuentas() throws Exception {		
		if(this.jInternalFrameDetalleFormListadosPlanCuentas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {
	
		//this.jInternalFrameDetalleFormListadosPlanCuentas.jLabelidListadosPlanCuentas.setVisible(this.listadosplancuentasConstantesFunciones.mostraridListadosPlanCuentas);
		this.jInternalFrameDetalleFormListadosPlanCuentas.jPanelidListadosPlanCuentas.setVisible(this.listadosplancuentasConstantesFunciones.mostraridListadosPlanCuentas);
		//this.jInternalFrameDetalleFormListadosPlanCuentas.jComboBoxid_empresaListadosPlanCuentas.setVisible(this.listadosplancuentasConstantesFunciones.mostrarid_empresaListadosPlanCuentas);
		this.jInternalFrameDetalleFormListadosPlanCuentas.jPanelid_empresaListadosPlanCuentas.setVisible(this.listadosplancuentasConstantesFunciones.mostrarid_empresaListadosPlanCuentas);
		//this.jInternalFrameDetalleFormListadosPlanCuentas.jTextFieldnombre_monedaListadosPlanCuentas.setVisible(this.listadosplancuentasConstantesFunciones.mostrarnombre_monedaListadosPlanCuentas);
		this.jInternalFrameDetalleFormListadosPlanCuentas.jPanelnombre_monedaListadosPlanCuentas.setVisible(this.listadosplancuentasConstantesFunciones.mostrarnombre_monedaListadosPlanCuentas);
		//this.jInternalFrameDetalleFormListadosPlanCuentas.jTextFieldcodigoListadosPlanCuentas.setVisible(this.listadosplancuentasConstantesFunciones.mostrarcodigoListadosPlanCuentas);
		this.jInternalFrameDetalleFormListadosPlanCuentas.jPanelcodigoListadosPlanCuentas.setVisible(this.listadosplancuentasConstantesFunciones.mostrarcodigoListadosPlanCuentas);
		//this.jInternalFrameDetalleFormListadosPlanCuentas.jTextAreanombreListadosPlanCuentas.setVisible(this.listadosplancuentasConstantesFunciones.mostrarnombreListadosPlanCuentas);
		this.jInternalFrameDetalleFormListadosPlanCuentas.jPanelnombreListadosPlanCuentas.setVisible(this.listadosplancuentasConstantesFunciones.mostrarnombreListadosPlanCuentas);
		//this.jInternalFrameDetalleFormListadosPlanCuentas.jTextAreanombre_nivel_cuentaListadosPlanCuentas.setVisible(this.listadosplancuentasConstantesFunciones.mostrarnombre_nivel_cuentaListadosPlanCuentas);
		this.jInternalFrameDetalleFormListadosPlanCuentas.jPanelnombre_nivel_cuentaListadosPlanCuentas.setVisible(this.listadosplancuentasConstantesFunciones.mostrarnombre_nivel_cuentaListadosPlanCuentas);
		//this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_movimientoListadosPlanCuentas.setVisible(this.listadosplancuentasConstantesFunciones.mostrares_movimientoListadosPlanCuentas);
		this.jInternalFrameDetalleFormListadosPlanCuentas.jPaneles_movimientoListadosPlanCuentas.setVisible(this.listadosplancuentasConstantesFunciones.mostrares_movimientoListadosPlanCuentas);
		//this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_centro_costoListadosPlanCuentas.setVisible(this.listadosplancuentasConstantesFunciones.mostrares_centro_costoListadosPlanCuentas);
		this.jInternalFrameDetalleFormListadosPlanCuentas.jPaneles_centro_costoListadosPlanCuentas.setVisible(this.listadosplancuentasConstantesFunciones.mostrares_centro_costoListadosPlanCuentas);
		//this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_centro_actividadListadosPlanCuentas.setVisible(this.listadosplancuentasConstantesFunciones.mostrares_centro_actividadListadosPlanCuentas);
		this.jInternalFrameDetalleFormListadosPlanCuentas.jPaneles_centro_actividadListadosPlanCuentas.setVisible(this.listadosplancuentasConstantesFunciones.mostrares_centro_actividadListadosPlanCuentas);
		//this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_para_f52ListadosPlanCuentas.setVisible(this.listadosplancuentasConstantesFunciones.mostrares_para_f52ListadosPlanCuentas);
		this.jInternalFrameDetalleFormListadosPlanCuentas.jPaneles_para_f52ListadosPlanCuentas.setVisible(this.listadosplancuentasConstantesFunciones.mostrares_para_f52ListadosPlanCuentas);
		//this.jInternalFrameDetalleFormListadosPlanCuentas.jTextFieldordenListadosPlanCuentas.setVisible(this.listadosplancuentasConstantesFunciones.mostrarordenListadosPlanCuentas);
		this.jInternalFrameDetalleFormListadosPlanCuentas.jPanelordenListadosPlanCuentas.setVisible(this.listadosplancuentasConstantesFunciones.mostrarordenListadosPlanCuentas);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioListadosPlanCuentas() throws Exception {
		if(this.jInternalFrameDetalleFormListadosPlanCuentas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormListadosPlanCuentas!=null) {
	
		this.jInternalFrameDetalleFormListadosPlanCuentas.jLabelidListadosPlanCuentas.setEnabled(this.listadosplancuentasConstantesFunciones.activaridListadosPlanCuentas);
		this.jInternalFrameDetalleFormListadosPlanCuentas.jComboBoxid_empresaListadosPlanCuentas.setEnabled(this.listadosplancuentasConstantesFunciones.activarid_empresaListadosPlanCuentas);
		this.jInternalFrameDetalleFormListadosPlanCuentas.jTextFieldnombre_monedaListadosPlanCuentas.setEnabled(this.listadosplancuentasConstantesFunciones.activarnombre_monedaListadosPlanCuentas);
		this.jInternalFrameDetalleFormListadosPlanCuentas.jTextFieldcodigoListadosPlanCuentas.setEnabled(this.listadosplancuentasConstantesFunciones.activarcodigoListadosPlanCuentas);
		this.jInternalFrameDetalleFormListadosPlanCuentas.jTextAreanombreListadosPlanCuentas.setEnabled(this.listadosplancuentasConstantesFunciones.activarnombreListadosPlanCuentas);
		this.jInternalFrameDetalleFormListadosPlanCuentas.jTextAreanombre_nivel_cuentaListadosPlanCuentas.setEnabled(this.listadosplancuentasConstantesFunciones.activarnombre_nivel_cuentaListadosPlanCuentas);
		this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_movimientoListadosPlanCuentas.setEnabled(this.listadosplancuentasConstantesFunciones.activares_movimientoListadosPlanCuentas);
		this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_centro_costoListadosPlanCuentas.setEnabled(this.listadosplancuentasConstantesFunciones.activares_centro_costoListadosPlanCuentas);
		this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_centro_actividadListadosPlanCuentas.setEnabled(this.listadosplancuentasConstantesFunciones.activares_centro_actividadListadosPlanCuentas);
		this.jInternalFrameDetalleFormListadosPlanCuentas.jCheckBoxes_para_f52ListadosPlanCuentas.setEnabled(this.listadosplancuentasConstantesFunciones.activares_para_f52ListadosPlanCuentas);
		this.jInternalFrameDetalleFormListadosPlanCuentas.jTextFieldordenListadosPlanCuentas.setEnabled(this.listadosplancuentasConstantesFunciones.activarordenListadosPlanCuentas);
		}
	}
	
		
}