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

//import com.bydan.erp.contabilidad.util.ListadosCentrosCostosConstantesFunciones;
import com.bydan.erp.contabilidad.util.report.ListadosCentrosCostosParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.report.ListadosCentrosCostosParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.report.ListadosCentrosCostosBean;
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
public class ListadosCentrosCostosBeanSwingJInternalFrame extends ListadosCentrosCostosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ListadosCentrosCostosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ListadosCentrosCostos> listadoscentroscostosValidator = new ClassValidator<ListadosCentrosCostos>(ListadosCentrosCostos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ListadosCentrosCostos listadoscentroscostos;	
	public ListadosCentrosCostos listadoscentroscostosAux;
	public ListadosCentrosCostos listadoscentroscostosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ListadosCentrosCostos listadoscentroscostosTotales;
	public Long idListadosCentrosCostosActual;
	public Long iIdNuevoListadosCentrosCostos=0L;
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
	
	public Boolean isPermisoTodoListadosCentrosCostos;
	public Boolean isPermisoNuevoListadosCentrosCostos;
	public Boolean isPermisoActualizarListadosCentrosCostos;
	public Boolean isPermisoActualizarOriginalListadosCentrosCostos;
	public Boolean isPermisoEliminarListadosCentrosCostos;
	public Boolean isPermisoGuardarCambiosListadosCentrosCostos;
	public Boolean isPermisoConsultaListadosCentrosCostos;
	public Boolean isPermisoBusquedaListadosCentrosCostos;
	public Boolean isPermisoReporteListadosCentrosCostos;
	public Boolean isPermisoPaginacionMedioListadosCentrosCostos;
	public Boolean isPermisoPaginacionAltoListadosCentrosCostos;
	public Boolean isPermisoPaginacionTodoListadosCentrosCostos;
	public Boolean isPermisoCopiarListadosCentrosCostos;
	public Boolean isPermisoVerFormListadosCentrosCostos;
	public Boolean isPermisoDuplicarListadosCentrosCostos;
	public Boolean isPermisoOrdenListadosCentrosCostos;
	
	
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
	
	public ListadosCentrosCostosParameterReturnGeneral listadoscentroscostosReturnGeneral;
	public ListadosCentrosCostosParameterReturnGeneral listadoscentroscostosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoListadosCentrosCostos=false;
	public Boolean esParaAccionDesdeFormularioListadosCentrosCostos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ListadosCentrosCostosSessionBeanAdditional listadoscentroscostosSessionBeanAdditional=null;
	
	public ListadosCentrosCostosSessionBeanAdditional getListadosCentrosCostosSessionBeanAdditional() {
		return this.listadoscentroscostosSessionBeanAdditional;
	}
	
	public void setListadosCentrosCostosSessionBeanAdditional(ListadosCentrosCostosSessionBeanAdditional listadoscentroscostosSessionBeanAdditional) {
		try {
			this.listadoscentroscostosSessionBeanAdditional=listadoscentroscostosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ListadosCentrosCostosBeanSwingJInternalFrameAdditional listadoscentroscostosBeanSwingJInternalFrameAdditional=null;
	//public class ListadosCentrosCostosBeanSwingJInternalFrame
	
	public ListadosCentrosCostosBeanSwingJInternalFrameAdditional getListadosCentrosCostosBeanSwingJInternalFrameAdditional() {
		return this.listadoscentroscostosBeanSwingJInternalFrameAdditional;
	}
	
	public void setListadosCentrosCostosBeanSwingJInternalFrameAdditional(ListadosCentrosCostosBeanSwingJInternalFrameAdditional listadoscentroscostosBeanSwingJInternalFrameAdditional) {
		try {
			this.listadoscentroscostosBeanSwingJInternalFrameAdditional=listadoscentroscostosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ListadosCentrosCostosLogic listadoscentroscostosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ListadosCentrosCostos listadoscentroscostosBean;
	public ListadosCentrosCostosConstantesFunciones listadoscentroscostosConstantesFunciones;
	//public ListadosCentrosCostosParameterReturnGeneral listadoscentroscostosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<ListadosCentrosCostos> listadoscentroscostoss;	
	//public List<ListadosCentrosCostos> listadoscentroscostossEliminados;
	//public List<ListadosCentrosCostos> listadoscentroscostossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoListadosCentrosCostos=false;
	public Boolean isVisibilidadCeldaDuplicarListadosCentrosCostos=true;
	public Boolean isVisibilidadCeldaCopiarListadosCentrosCostos=true;
	public Boolean isVisibilidadCeldaVerFormListadosCentrosCostos=true;
	public Boolean isVisibilidadCeldaOrdenListadosCentrosCostos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesListadosCentrosCostos=false;
	public Boolean isVisibilidadCeldaModificarListadosCentrosCostos=false;
	public Boolean isVisibilidadCeldaActualizarListadosCentrosCostos=false;
	public Boolean isVisibilidadCeldaEliminarListadosCentrosCostos=false;
	public Boolean isVisibilidadCeldaCancelarListadosCentrosCostos=false;
	public Boolean isVisibilidadCeldaGuardarListadosCentrosCostos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosListadosCentrosCostos=false;	
	
	
	public Boolean isVisibilidadBusquedaListadosCentrosCostos=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoListadosCentrosCostos() {
		return this.iIdNuevoListadosCentrosCostos;
	}

	public void setiIdNuevoListadosCentrosCostos(Long iIdNuevoListadosCentrosCostos) {
		this.iIdNuevoListadosCentrosCostos = iIdNuevoListadosCentrosCostos;
	}
	
	public Long getidListadosCentrosCostosActual() {
		return this.idListadosCentrosCostosActual;
	}

	public void setidListadosCentrosCostosActual(Long idListadosCentrosCostosActual) {
		this.idListadosCentrosCostosActual = idListadosCentrosCostosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ListadosCentrosCostos getlistadoscentroscostos() {
		return this.listadoscentroscostos;
	}

	public void setlistadoscentroscostos(ListadosCentrosCostos listadoscentroscostos) {
		this.listadoscentroscostos = listadoscentroscostos;
	}
	
	public ListadosCentrosCostos getlistadoscentroscostosAux() {
		return this.listadoscentroscostosAux;
	}

	public void setlistadoscentroscostosAux(ListadosCentrosCostos listadoscentroscostosAux) {
		this.listadoscentroscostosAux = listadoscentroscostosAux;
	}				
	
	public ListadosCentrosCostos getlistadoscentroscostosAnterior() {
		return this.listadoscentroscostosAnterior;
	}

	public void setlistadoscentroscostosAnterior(ListadosCentrosCostos listadoscentroscostosAnterior) {
		this.listadoscentroscostosAnterior = listadoscentroscostosAnterior;
	}	
	
	public ListadosCentrosCostos getlistadoscentroscostosTotales() {
		return this.listadoscentroscostosTotales;
	}

	public void setlistadoscentroscostosTotales(ListadosCentrosCostos listadoscentroscostosTotales) {
		this.listadoscentroscostosTotales = listadoscentroscostosTotales;
	}	
	
	public ListadosCentrosCostos getlistadoscentroscostosBean() {
		return this.listadoscentroscostosBean;
	}

	public void setlistadoscentroscostosBean(ListadosCentrosCostos listadoscentroscostosBean) {
		this.listadoscentroscostosBean = listadoscentroscostosBean;
	}	
	
	public ListadosCentrosCostosParameterReturnGeneral getlistadoscentroscostosReturnGeneral() {
		return this.listadoscentroscostosReturnGeneral;
	}

	public void setlistadoscentroscostosReturnGeneral(ListadosCentrosCostosParameterReturnGeneral listadoscentroscostosReturnGeneral) {
		this.listadoscentroscostosReturnGeneral = listadoscentroscostosReturnGeneral;
	}	
	
	
	public Long idBusquedaListadosCentrosCostos=0L;

	public Long getidBusquedaListadosCentrosCostos() {
		return this.idBusquedaListadosCentrosCostos;
	}

	public void setidBusquedaListadosCentrosCostos(Long idBusquedaListadosCentrosCostos) {
		this.idBusquedaListadosCentrosCostos = idBusquedaListadosCentrosCostos;
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
	
	
	public ListadosCentrosCostosLogic getListadosCentrosCostosLogic()	{		
		return listadoscentroscostosLogic;
	}

	public void setListadosCentrosCostosLogic(ListadosCentrosCostosLogic listadoscentroscostosLogic) {
		this.listadoscentroscostosLogic = listadoscentroscostosLogic;
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
	
	public Boolean getIsEsNuevoListadosCentrosCostos() {
		return isEsNuevoListadosCentrosCostos;
	}

	public void setIsEsNuevoListadosCentrosCostos(Boolean isEsNuevoListadosCentrosCostos) {
		this.isEsNuevoListadosCentrosCostos = isEsNuevoListadosCentrosCostos;
	}

	public Boolean getEsParaAccionDesdeFormularioListadosCentrosCostos() {
		return esParaAccionDesdeFormularioListadosCentrosCostos;
	}
	
	public void setEsParaAccionDesdeFormularioListadosCentrosCostos(Boolean esParaAccionDesdeFormularioListadosCentrosCostos) {
		this.esParaAccionDesdeFormularioListadosCentrosCostos = esParaAccionDesdeFormularioListadosCentrosCostos;
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

			if(this.listadoscentroscostosSessionBean==null) {
				this.listadoscentroscostosSessionBean=new ListadosCentrosCostosSessionBean();
			}

			if(!this.listadoscentroscostosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(listadoscentroscostosSessionBean.getlidEmpresaActual());
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

					if(this.listadoscentroscostos!=null) {
						this.listadoscentroscostos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) {
						this.jInternalFrameDetalleFormListadosCentrosCostos.jComboBoxid_empresaListadosCentrosCostos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaListadosCentrosCostos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) {
						if(this.jInternalFrameDetalleFormListadosCentrosCostos.jComboBoxid_empresaListadosCentrosCostos.getItemCount()>0) {
							this.jInternalFrameDetalleFormListadosCentrosCostos.jComboBoxid_empresaListadosCentrosCostos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaListadosCentrosCostosGenerico)throws Exception
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
				jComboBoxid_empresaListadosCentrosCostosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaListadosCentrosCostosGenerico!=null && jComboBoxid_empresaListadosCentrosCostosGenerico.getItemCount()>0) {
					jComboBoxid_empresaListadosCentrosCostosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ListadosCentrosCostos listadoscentroscostos,JComboBox jComboBoxid_empresaListadosCentrosCostosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaListadosCentrosCostosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormListadosCentrosCostos.jComboBoxid_empresaListadosCentrosCostos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaListadosCentrosCostosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				listadoscentroscostos.setid_empresa(empresaAux.getId());
				listadoscentroscostos.setempresa_descripcion(ListadosCentrosCostosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				listadoscentroscostos.setEmpresa(empresaAux);			}
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

					if(!ListadosCentrosCostosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) { 
							this.jInternalFrameDetalleFormListadosCentrosCostos.jComboBoxid_empresaListadosCentrosCostos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormListadosCentrosCostos.jComboBoxid_empresaListadosCentrosCostos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) { 
					}

					if(!ListadosCentrosCostosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) {
							this.jInternalFrameDetalleFormListadosCentrosCostos.jComboBoxid_empresaListadosCentrosCostos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) {
							this.jInternalFrameDetalleFormListadosCentrosCostos.jComboBoxid_empresaListadosCentrosCostos.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesListadosCentrosCostos() throws Exception {
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
		
	public ListadosCentrosCostosParameterReturnGeneral getListadosCentrosCostosParameterGeneral() {
		return this.listadoscentroscostosParameterGeneral;
	}
	
	public void setListadosCentrosCostosParameterGeneral(ListadosCentrosCostosParameterReturnGeneral listadoscentroscostosParameterGeneral) {
		this.listadoscentroscostosParameterGeneral = listadoscentroscostosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoListadosCentrosCostos() {
		return isPermisoTodoListadosCentrosCostos;
	}

	public void setIsPermisoTodoListadosCentrosCostos(Boolean isPermisoTodoListadosCentrosCostos) {
		this.isPermisoTodoListadosCentrosCostos = isPermisoTodoListadosCentrosCostos;
	}

	public Boolean getIsPermisoNuevoListadosCentrosCostos() {
		return isPermisoNuevoListadosCentrosCostos;
	}

	public void setIsPermisoNuevoListadosCentrosCostos(Boolean isPermisoNuevoListadosCentrosCostos) {
		this.isPermisoNuevoListadosCentrosCostos = isPermisoNuevoListadosCentrosCostos;
	}

	public Boolean getIsPermisoActualizarListadosCentrosCostos() {
		return isPermisoActualizarListadosCentrosCostos;
	}

	public void setIsPermisoActualizarListadosCentrosCostos(Boolean isPermisoActualizarListadosCentrosCostos) {
		this.isPermisoActualizarListadosCentrosCostos = isPermisoActualizarListadosCentrosCostos;
	}

	public Boolean getIsPermisoEliminarListadosCentrosCostos() {
		return isPermisoEliminarListadosCentrosCostos;
	}

	public void setIsPermisoEliminarListadosCentrosCostos(Boolean isPermisoEliminarListadosCentrosCostos) {
		this.isPermisoEliminarListadosCentrosCostos = isPermisoEliminarListadosCentrosCostos;
	}

	public Boolean getIsPermisoGuardarCambiosListadosCentrosCostos() {
		return isPermisoGuardarCambiosListadosCentrosCostos;
	}

	public void setIsPermisoGuardarCambiosListadosCentrosCostos(Boolean isPermisoGuardarCambiosListadosCentrosCostos) {
		this.isPermisoGuardarCambiosListadosCentrosCostos = isPermisoGuardarCambiosListadosCentrosCostos;
	}
	
	public Boolean getIsPermisoConsultaListadosCentrosCostos() {
		return isPermisoConsultaListadosCentrosCostos;
	}

	public void setIsPermisoConsultaListadosCentrosCostos(Boolean isPermisoConsultaListadosCentrosCostos) {
		this.isPermisoConsultaListadosCentrosCostos = isPermisoConsultaListadosCentrosCostos;
	}

	public Boolean getIsPermisoBusquedaListadosCentrosCostos() {
		return isPermisoBusquedaListadosCentrosCostos;
	}

	public void setIsPermisoBusquedaListadosCentrosCostos(Boolean isPermisoBusquedaListadosCentrosCostos) {
		this.isPermisoBusquedaListadosCentrosCostos = isPermisoBusquedaListadosCentrosCostos;
	}

	public Boolean getIsPermisoReporteListadosCentrosCostos() {
		return isPermisoReporteListadosCentrosCostos;
	}

	public void setIsPermisoReporteListadosCentrosCostos(Boolean isPermisoReporteListadosCentrosCostos) {
		this.isPermisoReporteListadosCentrosCostos = isPermisoReporteListadosCentrosCostos;
	}
	
	public Boolean getIsPermisoPaginacionMedioListadosCentrosCostos() {
		return isPermisoPaginacionMedioListadosCentrosCostos;
	}

	public void setIsPermisoPaginacionMedioListadosCentrosCostos(Boolean isPermisoPaginacionMedioListadosCentrosCostos) {
		this.isPermisoPaginacionMedioListadosCentrosCostos = isPermisoPaginacionMedioListadosCentrosCostos;
	}
	
	public Boolean getIsPermisoPaginacionTodoListadosCentrosCostos() {
		return isPermisoPaginacionTodoListadosCentrosCostos;
	}

	public void setIsPermisoPaginacionTodoListadosCentrosCostos(Boolean isPermisoPaginacionTodoListadosCentrosCostos) {
		this.isPermisoPaginacionTodoListadosCentrosCostos = isPermisoPaginacionTodoListadosCentrosCostos;
	}
	
	public Boolean getIsPermisoPaginacionAltoListadosCentrosCostos() {
		return isPermisoPaginacionAltoListadosCentrosCostos;
	}

	public void setIsPermisoPaginacionAltoListadosCentrosCostos(Boolean isPermisoPaginacionAltoListadosCentrosCostos) {
		this.isPermisoPaginacionAltoListadosCentrosCostos = isPermisoPaginacionAltoListadosCentrosCostos;
	}
	
	public Boolean getIsPermisoCopiarListadosCentrosCostos() {
		return isPermisoCopiarListadosCentrosCostos;
	}

	public void setIsPermisoCopiarListadosCentrosCostos(Boolean isPermisoCopiarListadosCentrosCostos) {
		this.isPermisoCopiarListadosCentrosCostos = isPermisoCopiarListadosCentrosCostos;
	}
	
	public Boolean getIsPermisoVerFormListadosCentrosCostos() {
		return isPermisoVerFormListadosCentrosCostos;
	}

	public void setIsPermisoVerFormListadosCentrosCostos(Boolean isPermisoVerFormListadosCentrosCostos) {
		this.isPermisoVerFormListadosCentrosCostos = isPermisoVerFormListadosCentrosCostos;
	}
	
	public Boolean getIsPermisoDuplicarListadosCentrosCostos() {
		return isPermisoDuplicarListadosCentrosCostos;
	}

	public void setIsPermisoDuplicarListadosCentrosCostos(Boolean isPermisoDuplicarListadosCentrosCostos) {
		this.isPermisoDuplicarListadosCentrosCostos = isPermisoDuplicarListadosCentrosCostos;
	}
	
	public Boolean getIsPermisoOrdenListadosCentrosCostos() {
		return isPermisoOrdenListadosCentrosCostos;
	}

	public void setIsPermisoOrdenListadosCentrosCostos(Boolean isPermisoOrdenListadosCentrosCostos) {
		this.isPermisoOrdenListadosCentrosCostos = isPermisoOrdenListadosCentrosCostos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoListadosCentrosCostos() {
		return isVisibilidadCeldaNuevoListadosCentrosCostos;
	}

	public void setIsVisibilidadCeldaNuevoListadosCentrosCostos(Boolean isVisibilidadCeldaNuevoListadosCentrosCostos) {
		this.isVisibilidadCeldaNuevoListadosCentrosCostos = isVisibilidadCeldaNuevoListadosCentrosCostos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarListadosCentrosCostos() {
		return isVisibilidadCeldaDuplicarListadosCentrosCostos;
	}

	public void setIsVisibilidadCeldaDuplicarListadosCentrosCostos(Boolean isVisibilidadCeldaDuplicarListadosCentrosCostos) {
		this.isVisibilidadCeldaDuplicarListadosCentrosCostos = isVisibilidadCeldaDuplicarListadosCentrosCostos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarListadosCentrosCostos() {
		return isVisibilidadCeldaCopiarListadosCentrosCostos;
	}

	public void setIsVisibilidadCeldaCopiarListadosCentrosCostos(Boolean isVisibilidadCeldaCopiarListadosCentrosCostos) {
		this.isVisibilidadCeldaCopiarListadosCentrosCostos = isVisibilidadCeldaCopiarListadosCentrosCostos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormListadosCentrosCostos() {
		return isVisibilidadCeldaVerFormListadosCentrosCostos;
	}

	public void setIsVisibilidadCeldaVerFormListadosCentrosCostos(Boolean isVisibilidadCeldaVerFormListadosCentrosCostos) {
		this.isVisibilidadCeldaVerFormListadosCentrosCostos = isVisibilidadCeldaVerFormListadosCentrosCostos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenListadosCentrosCostos() {
		return isVisibilidadCeldaOrdenListadosCentrosCostos;
	}

	public void setIsVisibilidadCeldaOrdenListadosCentrosCostos(Boolean isVisibilidadCeldaOrdenListadosCentrosCostos) {
		this.isVisibilidadCeldaOrdenListadosCentrosCostos = isVisibilidadCeldaOrdenListadosCentrosCostos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesListadosCentrosCostos() {
		return isVisibilidadCeldaNuevoRelacionesListadosCentrosCostos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesListadosCentrosCostos(Boolean isVisibilidadCeldaNuevoRelacionesListadosCentrosCostos) {
		this.isVisibilidadCeldaNuevoRelacionesListadosCentrosCostos = isVisibilidadCeldaNuevoRelacionesListadosCentrosCostos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarListadosCentrosCostos() {
		return isVisibilidadCeldaModificarListadosCentrosCostos;
	}

	public void setIsVisibilidadCeldaModificarListadosCentrosCostos(Boolean isVisibilidadCeldaModificarListadosCentrosCostos) {
		this.isVisibilidadCeldaModificarListadosCentrosCostos = isVisibilidadCeldaModificarListadosCentrosCostos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarListadosCentrosCostos() {
		return isVisibilidadCeldaActualizarListadosCentrosCostos;
	}

	public void setIsVisibilidadCeldaActualizarListadosCentrosCostos(Boolean isVisibilidadCeldaActualizarListadosCentrosCostos) {
		this.isVisibilidadCeldaActualizarListadosCentrosCostos = isVisibilidadCeldaActualizarListadosCentrosCostos;
	}

	public Boolean getIsVisibilidadCeldaEliminarListadosCentrosCostos() {
		return isVisibilidadCeldaEliminarListadosCentrosCostos;
	}

	public void setIsVisibilidadCeldaEliminarListadosCentrosCostos(Boolean isVisibilidadCeldaEliminarListadosCentrosCostos) {
		this.isVisibilidadCeldaEliminarListadosCentrosCostos = isVisibilidadCeldaEliminarListadosCentrosCostos;
	}

	public Boolean getIsVisibilidadCeldaCancelarListadosCentrosCostos() {
		return isVisibilidadCeldaCancelarListadosCentrosCostos;
	}

	public void setIsVisibilidadCeldaCancelarListadosCentrosCostos(Boolean isVisibilidadCeldaCancelarListadosCentrosCostos) {
		this.isVisibilidadCeldaCancelarListadosCentrosCostos = isVisibilidadCeldaCancelarListadosCentrosCostos;
	}

	public Boolean getIsVisibilidadCeldaGuardarListadosCentrosCostos() {
		return isVisibilidadCeldaGuardarListadosCentrosCostos;
	}

	public void setIsVisibilidadCeldaGuardarListadosCentrosCostos(Boolean isVisibilidadCeldaGuardarListadosCentrosCostos) {
		this.isVisibilidadCeldaGuardarListadosCentrosCostos = isVisibilidadCeldaGuardarListadosCentrosCostos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosListadosCentrosCostos() {
		return isVisibilidadCeldaGuardarCambiosListadosCentrosCostos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosListadosCentrosCostos(Boolean isVisibilidadCeldaGuardarCambiosListadosCentrosCostos) {
		this.isVisibilidadCeldaGuardarCambiosListadosCentrosCostos = isVisibilidadCeldaGuardarCambiosListadosCentrosCostos;
	}
		
	public ListadosCentrosCostosSessionBean getlistadoscentroscostosSessionBean() {
		return this.listadoscentroscostosSessionBean;
	}
	
	public void setlistadoscentroscostosSessionBean(ListadosCentrosCostosSessionBean listadoscentroscostosSessionBean) {
		this.listadoscentroscostosSessionBean=listadoscentroscostosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaListadosCentrosCostos() {
		return this.isVisibilidadBusquedaListadosCentrosCostos;
	}

	public void setisVisibilidadBusquedaListadosCentrosCostos(Boolean isVisibilidadBusquedaListadosCentrosCostos) {
		this.isVisibilidadBusquedaListadosCentrosCostos=isVisibilidadBusquedaListadosCentrosCostos;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysListadosCentrosCostos(ListadosCentrosCostos listadoscentroscostos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(listadoscentroscostos,null);
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
	
	public void bugActualizarReferenciaActual(ListadosCentrosCostos listadoscentroscostos,ListadosCentrosCostos listadoscentroscostosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalListadosCentrosCostos(listadoscentroscostos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		listadoscentroscostosAux.setId(listadoscentroscostos.getId());
		listadoscentroscostosAux.setVersionRow(listadoscentroscostos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ListadosCentrosCostos listadoscentroscostosLocal) throws Exception {
		
		if(this.listadoscentroscostosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ListadosCentrosCostos listadoscentroscostosLocal) throws Exception {	
		if(this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				listadoscentroscostosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarListadosCentrosCostosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosListadosCentrosCostos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostosLogic.getListadosCentrosCostoss().toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostoss.toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = listadoscentroscostosValidator.getInvalidValues(this.listadoscentroscostos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ListadosCentrosCostos listadoscentroscostos,List<ListadosCentrosCostos> listadoscentroscostoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(ListadosCentrosCostos listadoscentroscostos,List<ListadosCentrosCostos> listadoscentroscostoss) throws Exception {
		try	{			
			ListadosCentrosCostosConstantesFunciones.actualizarSelectedLista(listadoscentroscostos,listadoscentroscostoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ListadosCentrosCostos> listadoscentroscostossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				listadoscentroscostossLocal=this.listadoscentroscostosLogic.getListadosCentrosCostoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				listadoscentroscostossLocal=this.listadoscentroscostoss;
			}
			//ARCHITECTURE
		
			for(ListadosCentrosCostos listadoscentroscostosLocal:listadoscentroscostossLocal) {
				if(this.permiteMantenimiento(listadoscentroscostosLocal) && listadoscentroscostosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ListadosCentrosCostosConstantesFunciones.getListadosCentrosCostosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ListadosCentrosCostosConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosCentrosCostos.jLabelcodigoListadosCentrosCostos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosCentrosCostosConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosCentrosCostos.jLabelnombreListadosCentrosCostos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosCentrosCostosConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosCentrosCostos.jLabelporcentajeListadosCentrosCostos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosCentrosCostosConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosCentrosCostos.jLabelvalorListadosCentrosCostos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosCentrosCostos.jLabelcodigoListadosCentrosCostos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosCentrosCostos.jLabelnombreListadosCentrosCostos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosCentrosCostos.jLabelporcentajeListadosCentrosCostos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosCentrosCostos.jLabelvalorListadosCentrosCostos,"");
		
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
		this.iIdNuevoListadosCentrosCostos--;	
		
		
		this.listadoscentroscostosAux=new ListadosCentrosCostos();
		
		this.listadoscentroscostosAux.setId(this.iIdNuevoListadosCentrosCostos);
		this.listadoscentroscostosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.listadoscentroscostosLogic.getListadosCentrosCostoss().add(this.listadoscentroscostosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.listadoscentroscostoss.add(this.listadoscentroscostosAux);
		}
		//ARCHITECTURE
		
		this.listadoscentroscostos=this.listadoscentroscostosAux;
		
		if(ListadosCentrosCostosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioListadosCentrosCostos(this.listadoscentroscostos);
			this.setVariablesObjetoActualToFormularioForeignKeyListadosCentrosCostos(this.listadoscentroscostos);
		}
				
		//this.setDefaultControlesListadosCentrosCostos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyListadosCentrosCostos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyListadosCentrosCostos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyListadosCentrosCostos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualListadosCentrosCostos(this.listadoscentroscostosBean,this.listadoscentroscostos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosCostos(this.listadoscentroscostos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanListadosCentrosCostos(this.listadoscentroscostosReturnGeneral,this.listadoscentroscostosBean,false);
		
		if(this.listadoscentroscostosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyListadosCentrosCostos(this.listadoscentroscostosReturnGeneral.getListadosCentrosCostos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioListadosCentrosCostos(this.listadoscentroscostosReturnGeneral.getListadosCentrosCostos());
		}
		
		if(this.listadoscentroscostosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioListadosCentrosCostos(this.listadoscentroscostosReturnGeneral.getListadosCentrosCostos(),classes);//this.listadoscentroscostosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualListadosCentrosCostos(this.listadoscentroscostos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyListadosCentrosCostos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyListadosCentrosCostos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ListadosCentrosCostosBeanSwingJInternalFrameAdditional.RecargarFormListadosCentrosCostos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingListadosCentrosCostos(false);
						
			if(listadoscentroscostosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ListadosCentrosCostosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualListadosCentrosCostos();
			}
			
			this.actualizarVisualTableDatosListadosCentrosCostos();
			
			this.jTableDatosListadosCentrosCostos.setRowSelectionInterval(this.getIndiceNuevoListadosCentrosCostos(), this.getIndiceNuevoListadosCentrosCostos());
			
			this.seleccionarFilaTablaListadosCentrosCostosActual();
						
			this.actualizarEstadoCeldasBotonesListadosCentrosCostos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesListadosCentrosCostos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormListadosCentrosCostos.jTextFieldcodigoListadosCentrosCostos.setEnabled(isHabilitar && this.listadoscentroscostosConstantesFunciones.activarcodigoListadosCentrosCostos);
		this.jInternalFrameDetalleFormListadosCentrosCostos.jTextAreanombreListadosCentrosCostos.setEnabled(isHabilitar && this.listadoscentroscostosConstantesFunciones.activarnombreListadosCentrosCostos);
		this.jInternalFrameDetalleFormListadosCentrosCostos.jTextFieldporcentajeListadosCentrosCostos.setEnabled(isHabilitar && this.listadoscentroscostosConstantesFunciones.activarporcentajeListadosCentrosCostos);
		this.jInternalFrameDetalleFormListadosCentrosCostos.jTextFieldvalorListadosCentrosCostos.setEnabled(isHabilitar && this.listadoscentroscostosConstantesFunciones.activarvalorListadosCentrosCostos);	
		//
		this.jInternalFrameDetalleFormListadosCentrosCostos.jComboBoxid_empresaListadosCentrosCostos.setEnabled(isHabilitar && this.listadoscentroscostosConstantesFunciones.activarid_empresaListadosCentrosCostos);
	};
	
	public void setDefaultControlesListadosCentrosCostos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoListadosCentrosCostos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.listadoscentroscostosSessionBean.setConGuardarRelaciones(true);			
			this.listadoscentroscostosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormListadosCentrosCostos.jTabbedPaneRelacionesListadosCentrosCostos.setVisible(true);
			
					
		} else {
			//this.listadoscentroscostosSessionBean.setConGuardarRelaciones(false);			
			this.listadoscentroscostosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormListadosCentrosCostos.jTabbedPaneRelacionesListadosCentrosCostos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoListadosCentrosCostos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadosCentrosCostos listadoscentroscostosAux:this.listadoscentroscostosLogic.getListadosCentrosCostoss()) {
				if(listadoscentroscostosAux.getId().equals(this.iIdNuevoListadosCentrosCostos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadosCentrosCostos listadoscentroscostosAux:this.listadoscentroscostoss) {
				if(listadoscentroscostosAux.getId().equals(this.iIdNuevoListadosCentrosCostos)) {
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
	
	public int getIndiceActualListadosCentrosCostos(ListadosCentrosCostos listadoscentroscostos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadosCentrosCostos listadoscentroscostosAux:this.listadoscentroscostosLogic.getListadosCentrosCostoss()) {
				if(listadoscentroscostosAux.getId().equals(listadoscentroscostos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadosCentrosCostos listadoscentroscostosAux:this.listadoscentroscostoss) {
				if(listadoscentroscostosAux.getId().equals(listadoscentroscostos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalListadosCentrosCostos(ListadosCentrosCostos listadoscentroscostosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadosCentrosCostos listadoscentroscostosAux:this.listadoscentroscostosLogic.getListadosCentrosCostoss()) {
				if(listadoscentroscostosAux.getListadosCentrosCostosOriginal().getId().equals(listadoscentroscostosOriginal.getId())) {
					existe=true;
					listadoscentroscostosOriginal.setId(listadoscentroscostosAux.getId());
					listadoscentroscostosOriginal.setVersionRow(listadoscentroscostosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadosCentrosCostos listadoscentroscostosAux:this.listadoscentroscostoss) {
				if(listadoscentroscostosAux.getListadosCentrosCostosOriginal().getId().equals(listadoscentroscostosOriginal.getId())) {
					existe=true;
					listadoscentroscostosOriginal.setId(listadoscentroscostosAux.getId());
					listadoscentroscostosOriginal.setVersionRow(listadoscentroscostosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosListadosCentrosCostos(Boolean esParaCancelar) throws Exception {
		listadoscentroscostossAux=new ArrayList<ListadosCentrosCostos>();
		listadoscentroscostosAux=new ListadosCentrosCostos();
		
		if(!this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ListadosCentrosCostos listadoscentroscostosAux:this.listadoscentroscostosLogic.getListadosCentrosCostoss()) {
					if(listadoscentroscostosAux.getId()<0) {
						listadoscentroscostossAux.add(listadoscentroscostosAux);
					}		
				}
				this.iIdNuevoListadosCentrosCostos=0L;
				this.listadoscentroscostosLogic.getListadosCentrosCostoss().removeAll(listadoscentroscostossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadosCentrosCostos listadoscentroscostosAux:this.listadoscentroscostoss) {
					if(listadoscentroscostosAux.getId()<0) {
						listadoscentroscostossAux.add(listadoscentroscostosAux);
					}		
				}
				this.iIdNuevoListadosCentrosCostos=0L;
				this.listadoscentroscostoss.removeAll(listadoscentroscostossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoListadosCentrosCostos 
					&& this.listadoscentroscostosLogic.getListadosCentrosCostoss().size()>0
					) {
					listadoscentroscostosAux=this.listadoscentroscostosLogic.getListadosCentrosCostoss().get(this.listadoscentroscostosLogic.getListadosCentrosCostoss().size() - 1);
				
					if(listadoscentroscostosAux.getId()<0) {
						this.listadoscentroscostosLogic.getListadosCentrosCostoss().remove(listadoscentroscostosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoListadosCentrosCostos && this.listadoscentroscostoss.size()>0) {
					listadoscentroscostosAux=this.listadoscentroscostoss.get(this.listadoscentroscostoss.size() - 1);
				
					if(listadoscentroscostosAux.getId()<0) {
						this.listadoscentroscostoss.remove(listadoscentroscostosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoListadosCentrosCostos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(listadoscentroscostos.getId()<0) {
				this.listadoscentroscostosLogic.getListadosCentrosCostoss().remove(this.listadoscentroscostos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(listadoscentroscostos.getId()<0) {
				this.listadoscentroscostoss.remove(this.listadoscentroscostos);
			}
		}			
	}
	
	public void setEstadosInicialesListadosCentrosCostos(List<ListadosCentrosCostos> listadoscentroscostossAux) throws Exception {
		ListadosCentrosCostosConstantesFunciones.setEstadosInicialesListadosCentrosCostos(listadoscentroscostossAux);
	}
	
	public void setEstadosInicialesListadosCentrosCostos(ListadosCentrosCostos listadoscentroscostosAux) throws Exception {
		ListadosCentrosCostosConstantesFunciones.setEstadosInicialesListadosCentrosCostos(listadoscentroscostosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarListadosCentrosCostosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesListadosCentrosCostos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarListadosCentrosCostosActual()) {
				if(!this.isEsNuevoListadosCentrosCostos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesListadosCentrosCostos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoListadosCentrosCostos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarListadosCentrosCostosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Listados Centros Costos ?", "MANTENIMIENTO DE Listados Centros Costos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesListadosCentrosCostos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ListadosCentrosCostos listadoscentroscostos) throws Exception {
		ListadosCentrosCostosConstantesFunciones.seleccionarAsignar(this.listadoscentroscostos,listadoscentroscostos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarListadosCentrosCostos=this.isPermisoActualizarOriginalListadosCentrosCostos;
			
			
			this.seleccionarAsignar(listadoscentroscostos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesListadosCentrosCostos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.listadoscentroscostosSessionBean.setsFuncionBusquedaRapida(this.listadoscentroscostosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoListadosCentrosCostos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosListadosCentrosCostos(esParaCancelar);				
				this.cancelarNuevoListadosCentrosCostos(esParaCancelar);								
			}
			
			this.listadoscentroscostos=new ListadosCentrosCostos();
			
			this.inicializarListadosCentrosCostos();
			
			this.actualizarEstadoCeldasBotonesListadosCentrosCostos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarListadosCentrosCostos() throws Exception {
		try {
			ListadosCentrosCostosConstantesFunciones.inicializarListadosCentrosCostos(this.listadoscentroscostos);
			
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
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.listadoscentroscostosLogic.getListadosCentrosCostoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteListadosCentrosCostoss(String sAccionBusqueda,List<ListadosCentrosCostos> listadoscentroscostossParaReportes) throws Exception {
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
					sPathReporteFinal="ListadosCentrosCostos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ListadosCentrosCostosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ListadosCentrosCostosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ListadosCentrosCostos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Listados Centros Costoses");		
		parameters.put("busquedapor", ListadosCentrosCostosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceListadosCentrosCostos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ListadosCentrosCostosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ListadosCentrosCostosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceListadosCentrosCostos=new JRBeanArrayDataSource(ListadosCentrosCostosJInternalFrame.TraerListadosCentrosCostosBeans(listadoscentroscostossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceListadosCentrosCostos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ListadosCentrosCostosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ListadosCentrosCostosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ListadosCentrosCostosBean.TraerListadosCentrosCostosBeans(listadoscentroscostossParaReportes).toArray()));
							
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
				this.generarExcelReporteListadosCentrosCostoss(sAccionBusqueda,sTipoArchivoReporte,listadoscentroscostossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalListadosCentrosCostoss(sAccionBusqueda,sTipoArchivoReporte,listadoscentroscostossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoListadosCentrosCostosActionPerformed(null);
					//this.generarExcelReporteListadosCentrosCostoss(sAccionBusqueda,sTipoArchivoReporte,listadoscentroscostossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalListadosCentrosCostoss(sAccionBusqueda,sTipoArchivoReporte,listadoscentroscostossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesListadosCentrosCostoss(sAccionBusqueda,sTipoArchivoReporte,listadoscentroscostossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesListadosCentrosCostoss(sAccionBusqueda,sTipoArchivoReporte,listadoscentroscostossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteListadosCentrosCostoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ListadosCentrosCostos> listadoscentroscostossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadoscentroscostos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ListadosCentrosCostoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderListadosCentrosCostos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ListadosCentrosCostos listadoscentroscostos : listadoscentroscostossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ListadosCentrosCostosConstantesFunciones.generarExcelReporteDataListadosCentrosCostos("NORMAL",row,workbook,listadoscentroscostos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Centros Costos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderListadosCentrosCostos(String sTipo,Row row,Workbook workbook) {
		
		ListadosCentrosCostosConstantesFunciones.generarExcelReporteHeaderListadosCentrosCostos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalListadosCentrosCostoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ListadosCentrosCostos> listadoscentroscostossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadoscentroscostos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ListadosCentrosCostoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ListadosCentrosCostos listadoscentroscostos : listadoscentroscostossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ListadosCentrosCostosConstantesFunciones.getListadosCentrosCostosDescripcion(listadoscentroscostos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosCentrosCostosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosCentrosCostosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadoscentroscostos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosCentrosCostosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosCentrosCostosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadoscentroscostos.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosCentrosCostosConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosCentrosCostosConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadoscentroscostos.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosCentrosCostosConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosCentrosCostosConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadoscentroscostos.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosCentrosCostosConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosCentrosCostosConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadoscentroscostos.getvalor());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Centros Costos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesListadosCentrosCostoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ListadosCentrosCostos> listadoscentroscostossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ListadosCentrosCostos> listadoscentroscostossRespaldo=null;
		
		classes=ListadosCentrosCostosConstantesFunciones.getClassesRelationshipsOfListadosCentrosCostos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.listadoscentroscostosLogic.setDatosCliente(this.datosCliente);
		this.listadoscentroscostosLogic.setDatosDeep(this.datosDeep);
		this.listadoscentroscostosLogic.setIsConDeep(true);
		
		listadoscentroscostossRespaldo=this.listadoscentroscostosLogic.getListadosCentrosCostoss();
		
		this.listadoscentroscostosLogic.setListadosCentrosCostoss(listadoscentroscostossParaReportes);	
		this.listadoscentroscostosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		listadoscentroscostossParaReportes=this.listadoscentroscostosLogic.getListadosCentrosCostoss();
		this.listadoscentroscostosLogic.setListadosCentrosCostoss(listadoscentroscostossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadoscentroscostos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ListadosCentrosCostoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderListadosCentrosCostos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ListadosCentrosCostos listadoscentroscostos : listadoscentroscostossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderListadosCentrosCostos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ListadosCentrosCostosConstantesFunciones.generarExcelReporteDataListadosCentrosCostos("NORMAL",row,workbook,listadoscentroscostos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ListadosCentrosCostosConstantesFunciones.getListadosCentrosCostosDescripcion(listadoscentroscostos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Centros Costos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessListadosCentrosCostos() throws Exception {		
		this.startProcessListadosCentrosCostos(true);
	}
	
	public void startProcessListadosCentrosCostos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasListadosCentrosCostos ,this.jPanelParametrosReportesListadosCentrosCostos, this.jScrollPanelDatosListadosCentrosCostos,this.jPanelPaginacionListadosCentrosCostos, this.jScrollPanelDatosEdicionListadosCentrosCostos, this.jPanelAccionesListadosCentrosCostos,this.jPanelAccionesFormularioListadosCentrosCostos,this.jmenuBarListadosCentrosCostos,this.jmenuBarDetalleListadosCentrosCostos,this.jTtoolBarListadosCentrosCostos,this.jTtoolBarDetalleListadosCentrosCostos);		
		
		final JTabbedPane jTabbedPaneBusquedasListadosCentrosCostos=this.jTabbedPaneBusquedasListadosCentrosCostos; 
		
		final JPanel jPanelParametrosReportesListadosCentrosCostos=this.jPanelParametrosReportesListadosCentrosCostos;
		//final JScrollPane jScrollPanelDatosListadosCentrosCostos=this.jScrollPanelDatosListadosCentrosCostos;
		final JTable jTableDatosListadosCentrosCostos=this.jTableDatosListadosCentrosCostos;		
		final JPanel jPanelPaginacionListadosCentrosCostos=this.jPanelPaginacionListadosCentrosCostos;
		//final JScrollPane jScrollPanelDatosEdicionListadosCentrosCostos=this.jScrollPanelDatosEdicionListadosCentrosCostos;
		final JPanel jPanelAccionesListadosCentrosCostos=this.jPanelAccionesListadosCentrosCostos;
		
		JPanel jPanelCamposAuxiliarListadosCentrosCostos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarListadosCentrosCostos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) {
			jPanelCamposAuxiliarListadosCentrosCostos=this.jInternalFrameDetalleFormListadosCentrosCostos.jPanelCamposListadosCentrosCostos;
			jPanelAccionesFormularioAuxiliarListadosCentrosCostos=this.jInternalFrameDetalleFormListadosCentrosCostos.jPanelAccionesFormularioListadosCentrosCostos;
		}
		
		final JPanel jPanelCamposListadosCentrosCostos=jPanelCamposAuxiliarListadosCentrosCostos;
		final JPanel jPanelAccionesFormularioListadosCentrosCostos=jPanelAccionesFormularioAuxiliarListadosCentrosCostos;
		
		
		final JMenuBar jmenuBarListadosCentrosCostos=this.jmenuBarListadosCentrosCostos;
		final JToolBar jTtoolBarListadosCentrosCostos=this.jTtoolBarListadosCentrosCostos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarListadosCentrosCostos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarListadosCentrosCostos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) {
			jmenuBarDetalleAuxiliarListadosCentrosCostos=this.jInternalFrameDetalleFormListadosCentrosCostos.jmenuBarDetalleListadosCentrosCostos;
			jTtoolBarDetalleAuxiliarListadosCentrosCostos=this.jInternalFrameDetalleFormListadosCentrosCostos.jTtoolBarDetalleListadosCentrosCostos;
		}
		
		final JMenuBar jmenuBarDetalleListadosCentrosCostos=jmenuBarDetalleAuxiliarListadosCentrosCostos;
		final JToolBar jTtoolBarDetalleListadosCentrosCostos=jTtoolBarDetalleAuxiliarListadosCentrosCostos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasListadosCentrosCostos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesListadosCentrosCostos;
			processRunnable.jTableDatos=jTableDatosListadosCentrosCostos;
			processRunnable.jPanelCampos=jPanelCamposListadosCentrosCostos;
			processRunnable.jPanelPaginacion=jPanelPaginacionListadosCentrosCostos;
			processRunnable.jPanelAcciones=jPanelAccionesListadosCentrosCostos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioListadosCentrosCostos;
			
			
			processRunnable.jmenuBar=jmenuBarListadosCentrosCostos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleListadosCentrosCostos;
			processRunnable.jTtoolBar=jTtoolBarListadosCentrosCostos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleListadosCentrosCostos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasListadosCentrosCostos ,jPanelParametrosReportesListadosCentrosCostos,jTableDatosListadosCentrosCostos, /*jScrollPanelDatosListadosCentrosCostos,*/jPanelCamposListadosCentrosCostos,jPanelPaginacionListadosCentrosCostos, /*jScrollPanelDatosEdicionListadosCentrosCostos,*/ jPanelAccionesListadosCentrosCostos,jPanelAccionesFormularioListadosCentrosCostos,jmenuBarListadosCentrosCostos,jmenuBarDetalleListadosCentrosCostos,jTtoolBarListadosCentrosCostos,jTtoolBarDetalleListadosCentrosCostos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasListadosCentrosCostos ,jPanelParametrosReportesListadosCentrosCostos, jScrollPanelDatosListadosCentrosCostos,jPanelPaginacionListadosCentrosCostos, jScrollPanelDatosEdicionListadosCentrosCostos, jPanelAccionesListadosCentrosCostos,jPanelAccionesFormularioListadosCentrosCostos,jmenuBarListadosCentrosCostos,jmenuBarDetalleListadosCentrosCostos,jTtoolBarListadosCentrosCostos,jTtoolBarDetalleListadosCentrosCostos);
						
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
	
	public void finishProcessListadosCentrosCostos() {// throws Exception 
		this.finishProcessListadosCentrosCostos(true);
	}
	
	public void finishProcessListadosCentrosCostos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasListadosCentrosCostos ,this.jPanelParametrosReportesListadosCentrosCostos, this.jScrollPanelDatosListadosCentrosCostos,this.jPanelPaginacionListadosCentrosCostos, this.jScrollPanelDatosEdicionListadosCentrosCostos, this.jPanelAccionesListadosCentrosCostos,this.jPanelAccionesFormularioListadosCentrosCostos,this.jmenuBarListadosCentrosCostos,this.jmenuBarDetalleListadosCentrosCostos,this.jTtoolBarListadosCentrosCostos,this.jTtoolBarDetalleListadosCentrosCostos);		
		
		final JTabbedPane jTabbedPaneBusquedasListadosCentrosCostos=this.jTabbedPaneBusquedasListadosCentrosCostos; 
		
		final JPanel jPanelParametrosReportesListadosCentrosCostos=this.jPanelParametrosReportesListadosCentrosCostos;
		//final JScrollPane jScrollPanelDatosListadosCentrosCostos=this.jScrollPanelDatosListadosCentrosCostos;
		final JTable jTableDatosListadosCentrosCostos=this.jTableDatosListadosCentrosCostos;		
		final JPanel jPanelPaginacionListadosCentrosCostos=this.jPanelPaginacionListadosCentrosCostos;
		//final JScrollPane jScrollPanelDatosEdicionListadosCentrosCostos=this.jScrollPanelDatosEdicionListadosCentrosCostos;
		final JPanel jPanelAccionesListadosCentrosCostos=this.jPanelAccionesListadosCentrosCostos;
		
		JPanel jPanelCamposAuxiliarListadosCentrosCostos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarListadosCentrosCostos=new JPanel();
		
		if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) {
			jPanelCamposAuxiliarListadosCentrosCostos=this.jInternalFrameDetalleFormListadosCentrosCostos.jPanelCamposListadosCentrosCostos;
			jPanelAccionesFormularioAuxiliarListadosCentrosCostos=this.jInternalFrameDetalleFormListadosCentrosCostos.jPanelAccionesFormularioListadosCentrosCostos;
		}
		
		final JPanel jPanelCamposListadosCentrosCostos=jPanelCamposAuxiliarListadosCentrosCostos;
		final JPanel jPanelAccionesFormularioListadosCentrosCostos=jPanelAccionesFormularioAuxiliarListadosCentrosCostos;
		
		
		final JMenuBar jmenuBarListadosCentrosCostos=this.jmenuBarListadosCentrosCostos;		
		final JToolBar jTtoolBarListadosCentrosCostos=this.jTtoolBarListadosCentrosCostos;
				
		JMenuBar jmenuBarDetalleAuxiliarListadosCentrosCostos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarListadosCentrosCostos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) {
			jmenuBarDetalleAuxiliarListadosCentrosCostos=this.jInternalFrameDetalleFormListadosCentrosCostos.jmenuBarDetalleListadosCentrosCostos;
			jTtoolBarDetalleAuxiliarListadosCentrosCostos=this.jInternalFrameDetalleFormListadosCentrosCostos.jTtoolBarDetalleListadosCentrosCostos;		
		}
		
		final JMenuBar jmenuBarDetalleListadosCentrosCostos=jmenuBarDetalleAuxiliarListadosCentrosCostos;
		final JToolBar jTtoolBarDetalleListadosCentrosCostos=jTtoolBarDetalleAuxiliarListadosCentrosCostos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasListadosCentrosCostos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesListadosCentrosCostos;
			processRunnable.jTableDatos=jTableDatosListadosCentrosCostos;
			processRunnable.jPanelCampos=jPanelCamposListadosCentrosCostos;
			processRunnable.jPanelPaginacion=jPanelPaginacionListadosCentrosCostos;
			processRunnable.jPanelAcciones=jPanelAccionesListadosCentrosCostos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioListadosCentrosCostos;
			
			
			processRunnable.jmenuBar=jmenuBarListadosCentrosCostos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleListadosCentrosCostos;
			processRunnable.jTtoolBar=jTtoolBarListadosCentrosCostos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleListadosCentrosCostos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasListadosCentrosCostos ,jPanelParametrosReportesListadosCentrosCostos, jTableDatosListadosCentrosCostos,/*jScrollPanelDatosListadosCentrosCostos,*/jPanelCamposListadosCentrosCostos,jPanelPaginacionListadosCentrosCostos, /*jScrollPanelDatosEdicionListadosCentrosCostos,*/ jPanelAccionesListadosCentrosCostos,jPanelAccionesFormularioListadosCentrosCostos,jmenuBarListadosCentrosCostos,jmenuBarDetalleListadosCentrosCostos,jTtoolBarListadosCentrosCostos,jTtoolBarDetalleListadosCentrosCostos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesListadosCentrosCostos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarListadosCentrosCostos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuListadosCentrosCostos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarListadosCentrosCostos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarListadosCentrosCostos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleListadosCentrosCostos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuListadosCentrosCostos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarListadosCentrosCostos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleListadosCentrosCostos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.listadoscentroscostosConstantesFunciones.getsFinalQueryListadosCentrosCostos();
		String  finalQueryPaginacionTodos=this.listadoscentroscostosConstantesFunciones.getsFinalQueryListadosCentrosCostos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ListadosCentrosCostosConstantesFunciones.getArrayColumnasGlobalesNoListadosCentrosCostos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ListadosCentrosCostosConstantesFunciones.getArrayColumnasGlobalesListadosCentrosCostos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ListadosCentrosCostosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.listadoscentroscostossEliminados= new ArrayList<ListadosCentrosCostos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessListadosCentrosCostos();
		
				///*ListadosCentrosCostosSessionBean*/this.listadoscentroscostosSessionBean=new ListadosCentrosCostosSessionBean();
			
			if(this.listadoscentroscostosSessionBean==null) {
				this.listadoscentroscostosSessionBean=new ListadosCentrosCostosSessionBean();
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
					this.iNumeroPaginacion=ListadosCentrosCostosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ListadosCentrosCostosConstantesFunciones.getClassesForeignKeysOfListadosCentrosCostos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/listadoscentroscostos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			listadoscentroscostossAux= new ArrayList<ListadosCentrosCostos>();
			
				
			listadoscentroscostosLogic.setDatosCliente(this.datosCliente);
			listadoscentroscostosLogic.setDatosDeep(this.datosDeep);
			listadoscentroscostosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaListadosCentrosCostos")) {
				this.sDetalleReporte=ListadosCentrosCostosConstantesFunciones.getDetalleIndiceBusquedaListadosCentrosCostos(idBusquedaListadosCentrosCostos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					listadoscentroscostosLogic.getListadosCentrosCostossBusquedaListadosCentrosCostos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaListadosCentrosCostos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ListadosCentrosCostosConstantesFunciones.getDetalleIndiceBusquedaListadosCentrosCostos(idBusquedaListadosCentrosCostos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ListadosCentrosCostosConstantesFunciones.getDetalleIndiceBusquedaListadosCentrosCostos(idBusquedaListadosCentrosCostos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=listadoscentroscostosLogic.getListadosCentrosCostoss()==null||listadoscentroscostosLogic.getListadosCentrosCostoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=listadoscentroscostoss==null|| listadoscentroscostoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						listadoscentroscostossAux=new ArrayList<ListadosCentrosCostos>();
						listadoscentroscostossAux.addAll(listadoscentroscostosLogic.getListadosCentrosCostoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							listadoscentroscostossAux=new ArrayList<ListadosCentrosCostos>();
							listadoscentroscostossAux.addAll(listadoscentroscostoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							listadoscentroscostosLogic.getListadosCentrosCostossBusquedaListadosCentrosCostos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaListadosCentrosCostos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ListadosCentrosCostosConstantesFunciones.getDetalleIndiceBusquedaListadosCentrosCostos(idBusquedaListadosCentrosCostos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ListadosCentrosCostosConstantesFunciones.getDetalleIndiceBusquedaListadosCentrosCostos(idBusquedaListadosCentrosCostos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteListadosCentrosCostoss("BusquedaListadosCentrosCostos",listadoscentroscostosLogic.getListadosCentrosCostoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteListadosCentrosCostoss("BusquedaListadosCentrosCostos",listadoscentroscostoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						listadoscentroscostosLogic.setListadosCentrosCostoss(new ArrayList<ListadosCentrosCostos>());
						listadoscentroscostosLogic.getListadosCentrosCostoss().addAll(listadoscentroscostossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							listadoscentroscostoss=new ArrayList<ListadosCentrosCostos>();
							listadoscentroscostoss.addAll(listadoscentroscostossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesListadosCentrosCostos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessListadosCentrosCostos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=listadoscentroscostosLogic.getListadosCentrosCostoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=listadoscentroscostoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=listadoscentroscostosLogic.getListadosCentrosCostoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=listadoscentroscostoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ListadosCentrosCostos listadoscentroscostos) {
		Boolean permite=true;
		
		if(this.listadoscentroscostos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ListadosCentrosCostosConstantesFunciones.getOrderByListaListadosCentrosCostos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ListadosCentrosCostosConstantesFunciones.getOrderByListaListadosCentrosCostos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadosCentrosCostos listadoscentroscostos:listadoscentroscostosLogic.getListadosCentrosCostoss()) {
				if(listadoscentroscostos.getsType().equals(Constantes2.S_TOTALES)) {
					listadoscentroscostosTotales=listadoscentroscostos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadosCentrosCostos listadoscentroscostos:this.listadoscentroscostoss) {
				if(listadoscentroscostos.getsType().equals(Constantes2.S_TOTALES)) {
					listadoscentroscostosTotales=listadoscentroscostos;
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
			this.listadoscentroscostosAux=new ListadosCentrosCostos();
			this.listadoscentroscostosAux.setsType(Constantes2.S_TOTALES);
			this.listadoscentroscostosAux.setIsNew(false);
			this.listadoscentroscostosAux.setIsChanged(false);
			this.listadoscentroscostosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ListadosCentrosCostosConstantesFunciones.TotalizarValoresFilaListadosCentrosCostos(this.listadoscentroscostosLogic.getListadosCentrosCostoss(),this.listadoscentroscostosAux);
				
				//this.listadoscentroscostosLogic.getListadosCentrosCostoss().add(this.listadoscentroscostosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ListadosCentrosCostosConstantesFunciones.TotalizarValoresFilaListadosCentrosCostos(this.listadoscentroscostoss,this.listadoscentroscostosAux);
				
				this.listadoscentroscostoss.add(this.listadoscentroscostosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		listadoscentroscostosTotales=new ListadosCentrosCostos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.listadoscentroscostosLogic.getListadosCentrosCostoss().remove(listadoscentroscostosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.listadoscentroscostoss.remove(listadoscentroscostosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		listadoscentroscostosTotales=new ListadosCentrosCostos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadosCentrosCostos listadoscentroscostos:listadoscentroscostosLogic.getListadosCentrosCostoss()) {
				if(listadoscentroscostos.getsType().equals(Constantes2.S_TOTALES)) {
					listadoscentroscostosTotales=listadoscentroscostos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ListadosCentrosCostosConstantesFunciones.TotalizarValoresFilaListadosCentrosCostos(this.listadoscentroscostosLogic.getListadosCentrosCostoss(),listadoscentroscostosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadosCentrosCostos listadoscentroscostos:this.listadoscentroscostoss) {
				if(listadoscentroscostos.getsType().equals(Constantes2.S_TOTALES)) {
					listadoscentroscostosTotales=listadoscentroscostos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ListadosCentrosCostosConstantesFunciones.TotalizarValoresFilaListadosCentrosCostos(this.listadoscentroscostoss,listadoscentroscostosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getListadosCentrosCostossBusquedaListadosCentrosCostos()throws Exception {
		try {
			sAccionBusqueda="BusquedaListadosCentrosCostos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getListadosCentrosCostossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getListadosCentrosCostossBusquedaListadosCentrosCostos(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//listadoscentroscostosLogic.getListadosCentrosCostossBusquedaListadosCentrosCostos(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getListadosCentrosCostossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//listadoscentroscostosLogic.getListadosCentrosCostossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosListadosCentrosCostos() {
		this.isPermisoTodoListadosCentrosCostos=false;
		this.isPermisoNuevoListadosCentrosCostos=false;
		this.isPermisoActualizarListadosCentrosCostos=false;
		this.isPermisoActualizarOriginalListadosCentrosCostos=false;
		this.isPermisoEliminarListadosCentrosCostos=false;
		this.isPermisoGuardarCambiosListadosCentrosCostos=false;
		this.isPermisoConsultaListadosCentrosCostos=true;
		this.isPermisoBusquedaListadosCentrosCostos=true;
		this.isPermisoReporteListadosCentrosCostos=true;
		this.isPermisoOrdenListadosCentrosCostos=false;		
		this.isPermisoPaginacionMedioListadosCentrosCostos=false;		
		this.isPermisoPaginacionAltoListadosCentrosCostos=false;		
		this.isPermisoPaginacionTodoListadosCentrosCostos=false;		
		this.isPermisoCopiarListadosCentrosCostos=false;		
		this.isPermisoVerFormListadosCentrosCostos=false;		
		this.isPermisoDuplicarListadosCentrosCostos=false;
		this.isPermisoOrdenListadosCentrosCostos=false;
	}
	
	public void setPermisosUsuarioListadosCentrosCostos(Boolean isPermiso) {
		this.isPermisoTodoListadosCentrosCostos=isPermiso;
		this.isPermisoNuevoListadosCentrosCostos=isPermiso;
		this.isPermisoActualizarListadosCentrosCostos=isPermiso;
		this.isPermisoActualizarOriginalListadosCentrosCostos=isPermiso;
		this.isPermisoEliminarListadosCentrosCostos=isPermiso;
		this.isPermisoGuardarCambiosListadosCentrosCostos=isPermiso;
		this.isPermisoConsultaListadosCentrosCostos=isPermiso;
		this.isPermisoBusquedaListadosCentrosCostos=isPermiso;
		this.isPermisoReporteListadosCentrosCostos=isPermiso;
		this.isPermisoOrdenListadosCentrosCostos=isPermiso;		
		this.isPermisoPaginacionMedioListadosCentrosCostos=isPermiso;		
		this.isPermisoPaginacionAltoListadosCentrosCostos=isPermiso;		
		this.isPermisoPaginacionTodoListadosCentrosCostos=isPermiso;		
		this.isPermisoCopiarListadosCentrosCostos=isPermiso;		
		this.isPermisoVerFormListadosCentrosCostos=isPermiso;		
		this.isPermisoDuplicarListadosCentrosCostos=isPermiso;
		this.isPermisoOrdenListadosCentrosCostos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioListadosCentrosCostos(Boolean isPermiso) {
		//this.isPermisoTodoListadosCentrosCostos=isPermiso;
		this.isPermisoNuevoListadosCentrosCostos=isPermiso;
		this.isPermisoActualizarListadosCentrosCostos=isPermiso;
		this.isPermisoActualizarOriginalListadosCentrosCostos=isPermiso;
		this.isPermisoEliminarListadosCentrosCostos=isPermiso;
		this.isPermisoGuardarCambiosListadosCentrosCostos=isPermiso;
		//this.isPermisoConsultaListadosCentrosCostos=isPermiso;
		//this.isPermisoBusquedaListadosCentrosCostos=isPermiso;
		//this.isPermisoReporteListadosCentrosCostos=isPermiso;
		//this.isPermisoOrdenListadosCentrosCostos=isPermiso;		
		//this.isPermisoPaginacionMedioListadosCentrosCostos=isPermiso;		
		//this.isPermisoPaginacionAltoListadosCentrosCostos=isPermiso;		
		//this.isPermisoPaginacionTodoListadosCentrosCostos=isPermiso;		
		//this.isPermisoCopiarListadosCentrosCostos=isPermiso;		
		//this.isPermisoDuplicarListadosCentrosCostos=isPermiso;
		//this.isPermisoOrdenListadosCentrosCostos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioListadosCentrosCostosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ListadosCentrosCostosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebListadosCentrosCostos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioListadosCentrosCostosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioListadosCentrosCostosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionListadosCentrosCostosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioListadosCentrosCostosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioListadosCentrosCostos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ListadosCentrosCostosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ListadosCentrosCostosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoListadosCentrosCostos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarListadosCentrosCostos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalListadosCentrosCostos=this.isPermisoActualizarListadosCentrosCostos;
			this.isPermisoEliminarListadosCentrosCostos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosListadosCentrosCostos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaListadosCentrosCostos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaListadosCentrosCostos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoListadosCentrosCostos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteListadosCentrosCostos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenListadosCentrosCostos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioListadosCentrosCostos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoListadosCentrosCostos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoListadosCentrosCostos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarListadosCentrosCostos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormListadosCentrosCostos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarListadosCentrosCostos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenListadosCentrosCostos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosListadosCentrosCostos.setToolTipText(this.jTableDatosListadosCentrosCostos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioListadosCentrosCostos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioListadosCentrosCostos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ListadosCentrosCostosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ListadosCentrosCostosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioListadosCentrosCostos() throws Exception {
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
	public void inicializarCombosForeignKeyListadosCentrosCostosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyListadosCentrosCostosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ListadosCentrosCostosJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyListadosCentrosCostos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.listadoscentroscostosSessionBean==null) {
				this.listadoscentroscostosSessionBean=new ListadosCentrosCostosSessionBean();
			}

			if(!this.listadoscentroscostosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyListadosCentrosCostos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyListadosCentrosCostos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyListadosCentrosCostos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyListadosCentrosCostos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyListadosCentrosCostos(ListadosCentrosCostos listadoscentroscostos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyListadosCentrosCostos(ListadosCentrosCostos listadoscentroscostos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyListadosCentrosCostos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyListadosCentrosCostos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyListadosCentrosCostos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyListadosCentrosCostos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroListadosCentrosCostos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyListadosCentrosCostos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyListadosCentrosCostos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyListadosCentrosCostos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormListadosCentrosCostos.jComboBoxid_empresaListadosCentrosCostos!=null && this.jInternalFrameDetalleFormListadosCentrosCostos.jComboBoxid_empresaListadosCentrosCostos.getItemCount()>0) {
				this.jInternalFrameDetalleFormListadosCentrosCostos.jComboBoxid_empresaListadosCentrosCostos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public ListadosCentrosCostosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ListadosCentrosCostosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ListadosCentrosCostosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.listadoscentroscostosSessionBean=new ListadosCentrosCostosSessionBean(); 
		this.listadoscentroscostosConstantesFunciones=new ListadosCentrosCostosConstantesFunciones(); 
		this.listadoscentroscostosBean=new ListadosCentrosCostos();//(this.listadoscentroscostosConstantesFunciones); 		
		this.listadoscentroscostosReturnGeneral=new ListadosCentrosCostosParameterReturnGeneral(); 
		
		this.listadoscentroscostosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.listadoscentroscostosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ListadosCentrosCostosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ListadosCentrosCostosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ListadosCentrosCostosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessListadosCentrosCostos(true);
			
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
			
			this.listadoscentroscostosConstantesFunciones=new ListadosCentrosCostosConstantesFunciones(); 
			this.listadoscentroscostosBean=new ListadosCentrosCostos();//this.listadoscentroscostosConstantesFunciones); 			
			this.listadoscentroscostosReturnGeneral=new ListadosCentrosCostosParameterReturnGeneral(); 
		
			ListadosCentrosCostosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Listados Centros Costos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.listadoscentroscostos=new ListadosCentrosCostos();
			this.listadoscentroscostoss = new ArrayList<ListadosCentrosCostos>();
			this.listadoscentroscostossAux = new ArrayList<ListadosCentrosCostos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic=new ListadosCentrosCostosLogic();
				this.listadoscentroscostosLogic.getNewConnexionToDeep("");
			}
			
			//this.listadoscentroscostosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.listadoscentroscostosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormListadosCentrosCostos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoListadosCentrosCostos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoListadosCentrosCostos);	
					}
					
					if(this.jInternalFrameImportacionListadosCentrosCostos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionListadosCentrosCostos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByListadosCentrosCostos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByListadosCentrosCostos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormListadosCentrosCostos);
				this.jInternalFrameDetalleFormListadosCentrosCostos.setVisible(false);
				this.jInternalFrameDetalleFormListadosCentrosCostos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoListadosCentrosCostos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoListadosCentrosCostos);
					this.jInternalFrameReporteDinamicoListadosCentrosCostos.setVisible(false);
					this.jInternalFrameReporteDinamicoListadosCentrosCostos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionListadosCentrosCostos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionListadosCentrosCostos);
					this.jInternalFrameImportacionListadosCentrosCostos.setVisible(false);
					this.jInternalFrameImportacionListadosCentrosCostos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByListadosCentrosCostos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByListadosCentrosCostos);
					this.jInternalFrameOrderByListadosCentrosCostos.setVisible(false);
					this.jInternalFrameOrderByListadosCentrosCostos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idListadosCentrosCostosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ListadosCentrosCostosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.listadoscentroscostosReturnGeneral=new ListadosCentrosCostosParameterReturnGeneral();
			
			this.listadoscentroscostosParameterGeneral=new ListadosCentrosCostosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.listadoscentroscostosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ListadosCentrosCostosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ListadosCentrosCostosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.listadoscentroscostosSessionBean.getEsGuardarRelacionado(),this.listadoscentroscostosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ListadosCentrosCostosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.listadoscentroscostosSessionBean.getEsGuardarRelacionado(),this.listadoscentroscostosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoListadosCentrosCostos=false;
			this.isVisibilidadCeldaDuplicarListadosCentrosCostos=true;
			this.isVisibilidadCeldaCopiarListadosCentrosCostos=true;
			this.isVisibilidadCeldaVerFormListadosCentrosCostos=true;
			this.isVisibilidadCeldaOrdenListadosCentrosCostos=true;
			this.isVisibilidadCeldaNuevoRelacionesListadosCentrosCostos=false;
			this.isVisibilidadCeldaModificarListadosCentrosCostos=false;
			this.isVisibilidadCeldaActualizarListadosCentrosCostos=false;
			this.isVisibilidadCeldaEliminarListadosCentrosCostos=false;
			this.isVisibilidadCeldaCancelarListadosCentrosCostos=false;
			this.isVisibilidadCeldaGuardarListadosCentrosCostos=false;
			this.isVisibilidadCeldaGuardarCambiosListadosCentrosCostos=false;
			
			
			this.isVisibilidadBusquedaListadosCentrosCostos=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesListadosCentrosCostos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosListadosCentrosCostos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioListadosCentrosCostos(false);
			
			this.setPermisosUsuarioListadosCentrosCostos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.listadoscentroscostosSessionBean.getEsGuardarRelacionado() 
				|| (this.listadoscentroscostosSessionBean.getEsGuardarRelacionado() && this.listadoscentroscostosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioListadosCentrosCostosClasesRelacionadas();
			}
			
			if(this.listadoscentroscostosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioListadosCentrosCostosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ListadosCentrosCostosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosListadosCentrosCostos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualListadosCentrosCostos();
			}
			
			if(!this.isPermisoBusquedaListadosCentrosCostos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasListadosCentrosCostos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ListadosCentrosCostosConstantesFunciones.getTiposSeleccionarListadosCentrosCostos());
				
				this.tiposColumnasSelect=ListadosCentrosCostosConstantesFunciones.getTiposSeleccionarListadosCentrosCostos(true);
				
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
			//if(!this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioListadosCentrosCostos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioListadosCentrosCostos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioListadosCentrosCostos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesListadosCentrosCostos() ;
			
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
				listadoscentroscostosImplementable= (ListadosCentrosCostosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ListadosCentrosCostosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				listadoscentroscostosImplementableHome= (ListadosCentrosCostosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ListadosCentrosCostosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.listadoscentroscostoss= new ArrayList<ListadosCentrosCostos>();
			this.listadoscentroscostossEliminados= new ArrayList<ListadosCentrosCostos>();
						
			this.isEsNuevoListadosCentrosCostos=false;
			this.esParaAccionDesdeFormularioListadosCentrosCostos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyListadosCentrosCostos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroListadosCentrosCostos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ListadosCentrosCostosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ListadosCentrosCostosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesListadosCentrosCostos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingListadosCentrosCostos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioListadosCentrosCostos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioListadosCentrosCostos();
			}
			
			ListadosCentrosCostosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasListadosCentrosCostos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasListadosCentrosCostos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasListadosCentrosCostos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessListadosCentrosCostos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ListadosCentrosCostos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectListadosCentrosCostos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesListadosCentrosCostos")) {
				iIndex=this.jInternalFrameDetalleFormListadosCentrosCostos.jTabbedPaneRelacionesListadosCentrosCostos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormListadosCentrosCostos.jTabbedPaneRelacionesListadosCentrosCostos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosListadosCentrosCostos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessListadosCentrosCostos();	
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
	
	public void cargarCombosForeignKeyListadosCentrosCostos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyListadosCentrosCostos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyListadosCentrosCostos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyListadosCentrosCostosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyListadosCentrosCostos();
		
		this.cargarCombosFrameForeignKeyListadosCentrosCostos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyListadosCentrosCostos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyListadosCentrosCostos();
		}
	}
	
	
	
	public void jButtonNuevoListadosCentrosCostosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.listadoscentroscostosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormListadosCentrosCostos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
			
			
			if(jTableDatosListadosCentrosCostos.getRowCount()>=1) {
				jTableDatosListadosCentrosCostos.removeRowSelectionInterval(0, jTableDatosListadosCentrosCostos.getRowCount()-1);						
			}
			
			this.isEsNuevoListadosCentrosCostos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoListadosCentrosCostos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesListadosCentrosCostos(true);			
			//this.listadoscentroscostos=new ListadosCentrosCostos();
			//this.listadoscentroscostos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesListadosCentrosCostos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadosCentrosCostos() ;
			
			if(ListadosCentrosCostosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleListadosCentrosCostos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.listadoscentroscostos);	
			this.actualizarInformacion("INFO_PADRE",false,this.listadoscentroscostos);				
			
			ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
			
			if(this.listadoscentroscostosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ListadosCentrosCostos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarListadosCentrosCostosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ListadosCentrosCostos> listadoscentroscostossSeleccionados=new ArrayList<ListadosCentrosCostos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosListadosCentrosCostos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosListadosCentrosCostos.getSelectedRows().length;			
			}
			
			listadoscentroscostossSeleccionados=this.getListadosCentrosCostossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoListadosCentrosCostos--;			
				//ListadosCentrosCostos listadoscentroscostosAux= new ListadosCentrosCostos();			
				//listadoscentroscostosAux.setId(this.iIdNuevoListadosCentrosCostos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ListadosCentrosCostos listadoscentroscostosOrigen=new ListadosCentrosCostos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ListadosCentrosCostos listadoscentroscostosOrigen : listadoscentroscostossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosListadosCentrosCostos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							listadoscentroscostosOrigen =(ListadosCentrosCostos) this.listadoscentroscostosLogic.getListadosCentrosCostoss().toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							listadoscentroscostosOrigen =(ListadosCentrosCostos) this.listadoscentroscostoss.toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaListadosCentrosCostos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.listadoscentroscostos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosListadosCentrosCostos(listadoscentroscostosOrigen,this.listadoscentroscostos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosCostos(this.listadoscentroscostos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.listadoscentroscostosLogic.getListadosCentrosCostoss().add(this.listadoscentroscostosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.listadoscentroscostoss.add(this.listadoscentroscostosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaListadosCentrosCostos(false);
				
				this.jTableDatosListadosCentrosCostos.setRowSelectionInterval(this.getIndiceNuevoListadosCentrosCostos(), this.getIndiceNuevoListadosCentrosCostos());
				
				int iLastRow =  this.jTableDatosListadosCentrosCostos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosListadosCentrosCostos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosListadosCentrosCostos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaListadosCentrosCostos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarListadosCentrosCostosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ListadosCentrosCostos> listadoscentroscostossSeleccionados=new ArrayList<ListadosCentrosCostos>();									
		
			ListadosCentrosCostos listadoscentroscostosOrigen=new ListadosCentrosCostos();
			ListadosCentrosCostos listadoscentroscostosDestino=new ListadosCentrosCostos();
				
			listadoscentroscostossSeleccionados=this.getListadosCentrosCostossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosListadosCentrosCostos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || listadoscentroscostossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosListadosCentrosCostos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						listadoscentroscostosOrigen =(ListadosCentrosCostos) this.listadoscentroscostosLogic.getListadosCentrosCostoss().toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						listadoscentroscostosOrigen =(ListadosCentrosCostos) this.listadoscentroscostoss.toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						listadoscentroscostosDestino =(ListadosCentrosCostos) this.listadoscentroscostosLogic.getListadosCentrosCostoss().toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						listadoscentroscostosDestino =(ListadosCentrosCostos) this.listadoscentroscostoss.toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				listadoscentroscostosOrigen =listadoscentroscostossSeleccionados.get(0);
				listadoscentroscostosDestino =listadoscentroscostossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosListadosCentrosCostos(listadoscentroscostosOrigen,listadoscentroscostosDestino,true,false);
				
				listadoscentroscostosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(listadoscentroscostosDestino,listadoscentroscostosLogic.getListadosCentrosCostoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(listadoscentroscostosDestino,listadoscentroscostoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaListadosCentrosCostos(false);
				
				//this.jTableDatosListadosCentrosCostos.setRowSelectionInterval(this.getIndiceNuevoListadosCentrosCostos(), this.getIndiceNuevoListadosCentrosCostos());
				
				int iLastRow =  this.jTableDatosListadosCentrosCostos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosListadosCentrosCostos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosListadosCentrosCostos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaListadosCentrosCostos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormListadosCentrosCostosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormListadosCentrosCostos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormListadosCentrosCostos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarListadosCentrosCostosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesListadosCentrosCostos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasListadosCentrosCostos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesListadosCentrosCostos.setVisible(!isVisible);
			this.jPanelPaginacionListadosCentrosCostos.setVisible(!isVisible);
			this.jPanelAccionesListadosCentrosCostos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarListadosCentrosCostosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameListadosCentrosCostos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoListadosCentrosCostosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoListadosCentrosCostos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionListadosCentrosCostosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionListadosCentrosCostos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByListadosCentrosCostosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByListadosCentrosCostos();
			
			this.abrirFrameOrderByListadosCentrosCostos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByListadosCentrosCostosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByListadosCentrosCostos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleListadosCentrosCostos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormListadosCentrosCostos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormListadosCentrosCostos.isMaximum()) {
					this.jInternalFrameDetalleFormListadosCentrosCostos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormListadosCentrosCostos.setSize(this.jInternalFrameDetalleFormListadosCentrosCostos.iWidthFormulario,this.jInternalFrameDetalleFormListadosCentrosCostos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormListadosCentrosCostos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormListadosCentrosCostos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormListadosCentrosCostos.isMaximum()) {
						this.jInternalFrameDetalleFormListadosCentrosCostos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormListadosCentrosCostos.jContentPaneDetalleListadosCentrosCostos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormListadosCentrosCostos.jTabbedPaneRelacionesListadosCentrosCostos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormListadosCentrosCostos.jContentPaneDetalleListadosCentrosCostos.getWidth(),ListadosCentrosCostosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormListadosCentrosCostos.jTabbedPaneRelacionesListadosCentrosCostos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormListadosCentrosCostos.jContentPaneDetalleListadosCentrosCostos.getWidth(),ListadosCentrosCostosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormListadosCentrosCostos.jTabbedPaneRelacionesListadosCentrosCostos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormListadosCentrosCostos.jContentPaneDetalleListadosCentrosCostos.getWidth(),ListadosCentrosCostosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormListadosCentrosCostos.setVisible(true);
	        this.jInternalFrameDetalleFormListadosCentrosCostos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByListadosCentrosCostos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByListadosCentrosCostos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByListadosCentrosCostos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadosCentrosCostos,false,this);
				} else {
					this.jInternalFrameOrderByListadosCentrosCostos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadosCentrosCostos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByListadosCentrosCostos);
				this.jInternalFrameOrderByListadosCentrosCostos.setVisible(false);
				this.jInternalFrameOrderByListadosCentrosCostos.setSelected(false);
				
				this.jInternalFrameOrderByListadosCentrosCostos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByListadosCentrosCostos"));
				
				this.inicializarActualizarBindingTablaOrderByListadosCentrosCostos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionListadosCentrosCostos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionListadosCentrosCostos==null) {
				
				this.jInternalFrameImportacionListadosCentrosCostos=new ImportacionJInternalFrame(ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionListadosCentrosCostos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionListadosCentrosCostos);
				this.jInternalFrameImportacionListadosCentrosCostos.setVisible(false);
				this.jInternalFrameImportacionListadosCentrosCostos.setSelected(false);


				this.jInternalFrameImportacionListadosCentrosCostos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionListadosCentrosCostos"));
				this.jInternalFrameImportacionListadosCentrosCostos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionListadosCentrosCostos"));
				this.jInternalFrameImportacionListadosCentrosCostos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionListadosCentrosCostos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoListadosCentrosCostos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoListadosCentrosCostos==null) {
				this.jInternalFrameReporteDinamicoListadosCentrosCostos=new ReporteDinamicoJInternalFrame(ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoListadosCentrosCostos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoListadosCentrosCostos);
				this.jInternalFrameReporteDinamicoListadosCentrosCostos.setVisible(false);
				this.jInternalFrameReporteDinamicoListadosCentrosCostos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoListadosCentrosCostos"));
				this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoListadosCentrosCostos"));
				this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoListadosCentrosCostos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualListadosCentrosCostos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleListadosCentrosCostos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormListadosCentrosCostos);
			
	       	this.jInternalFrameDetalleFormListadosCentrosCostos.setVisible(false);
	        this.jInternalFrameDetalleFormListadosCentrosCostos.setSelected(false);
			
			//this.jInternalFrameDetalleFormListadosCentrosCostos.dispose();
			//this.jInternalFrameDetalleFormListadosCentrosCostos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoListadosCentrosCostos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoListadosCentrosCostos.setVisible(true);
	        this.jInternalFrameReporteDinamicoListadosCentrosCostos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionListadosCentrosCostos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionListadosCentrosCostos.setVisible(true);
	        this.jInternalFrameImportacionListadosCentrosCostos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByListadosCentrosCostos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByListadosCentrosCostos.setVisible(true);
	        this.jInternalFrameOrderByListadosCentrosCostos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByListadosCentrosCostos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByListadosCentrosCostos.setVisible(false);
	        this.jInternalFrameOrderByListadosCentrosCostos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoListadosCentrosCostos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoListadosCentrosCostos.setVisible(false);
	        this.jInternalFrameReporteDinamicoListadosCentrosCostos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionListadosCentrosCostos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionListadosCentrosCostos.setVisible(false);
	        this.jInternalFrameImportacionListadosCentrosCostos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarListadosCentrosCostosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarListadosCentrosCostos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarListadosCentrosCostos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosListadosCentrosCostos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesListadosCentrosCostos(true);
			//this.isEsNuevoListadosCentrosCostos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostosLogic.getListadosCentrosCostoss().toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostoss.toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesListadosCentrosCostos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesListadosCentrosCostos(false) ;
			
			if(listadoscentroscostosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ListadosCentrosCostosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleListadosCentrosCostos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadosCentrosCostos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaListadosCentrosCostosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosListadosCentrosCostos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostosLogic.getListadosCentrosCostoss().toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostoss.toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarListadosCentrosCostos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormListadosCentrosCostos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosListadosCentrosCostos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesListadosCentrosCostos(true);
			//this.isEsNuevoListadosCentrosCostos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostosLogic.getListadosCentrosCostoss().toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostoss.toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.listadoscentroscostos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesListadosCentrosCostos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesListadosCentrosCostos(false) ;
			
			if(ListadosCentrosCostosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleListadosCentrosCostos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadosCentrosCostos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarListadosCentrosCostosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesListadosCentrosCostos(false);
			
			//if(!this.isEsNuevoListadosCentrosCostos) {								
				int intSelectedRow = this.jTableDatosListadosCentrosCostos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostosLogic.getListadosCentrosCostoss().toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostoss.toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ListadosCentrosCostosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualListadosCentrosCostos(this.listadoscentroscostos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosCostos(this.listadoscentroscostos);
				
			}
			
			if(this.permiteMantenimiento(this.listadoscentroscostos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoListadosCentrosCostos=true;
					this.inicializarActualizarBindingTablaListadosCentrosCostos(false);
					this.isEsNuevoListadosCentrosCostos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoListadosCentrosCostos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoListadosCentrosCostos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesListadosCentrosCostos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualListadosCentrosCostos(false);
				
				this.habilitarDeshabilitarControlesListadosCentrosCostos(false);
			
												
				
				if(ListadosCentrosCostosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleListadosCentrosCostos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoListadosCentrosCostosActionPerformed(evt,listadoscentroscostosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualListadosCentrosCostos(this.listadoscentroscostos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosListadosCentrosCostos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,listadoscentroscostosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.listadoscentroscostos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ListadosCentrosCostos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosCentrosCostos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarListadosCentrosCostosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosListadosCentrosCostos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostosLogic.getListadosCentrosCostoss().toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
				this.listadoscentroscostos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostoss.toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
				this.listadoscentroscostos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.listadoscentroscostos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ListadosCentrosCostosModel) this.jTableDatosListadosCentrosCostos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoListadosCentrosCostos=true;
				this.inicializarActualizarBindingTablaListadosCentrosCostos(false);
				this.isEsNuevoListadosCentrosCostos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesListadosCentrosCostos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualListadosCentrosCostos(false);
				
				this.habilitarDeshabilitarControlesListadosCentrosCostos(false);
				
				
				
				if(ListadosCentrosCostosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleListadosCentrosCostos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarListadosCentrosCostosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosListadosCentrosCostos.getRowCount()>=1) {
				jTableDatosListadosCentrosCostos.removeRowSelectionInterval(0, jTableDatosListadosCentrosCostos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesListadosCentrosCostos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaListadosCentrosCostos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesListadosCentrosCostos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadosCentrosCostos(false) ;
			
			this.isEsNuevoListadosCentrosCostos=false;
			
			if(ListadosCentrosCostosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleListadosCentrosCostos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosListadosCentrosCostosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingListadosCentrosCostos(false);
				
				//SI ES MANUAL
				if(ListadosCentrosCostosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualListadosCentrosCostos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosListadosCentrosCostosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoListadosCentrosCostos--;			
			//ListadosCentrosCostos listadoscentroscostosAux= new ListadosCentrosCostos();			
			//listadoscentroscostosAux.setId(this.iIdNuevoListadosCentrosCostos);
			
			if(this.jInternalFrameDetalleFormListadosCentrosCostos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaListadosCentrosCostos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosCostos(this.listadoscentroscostos);
			
			this.listadoscentroscostos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.listadoscentroscostosLogic.getListadosCentrosCostoss().add(this.listadoscentroscostosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.listadoscentroscostoss.add(this.listadoscentroscostosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaListadosCentrosCostos(false);
			
			this.jTableDatosListadosCentrosCostos.setRowSelectionInterval(this.getIndiceNuevoListadosCentrosCostos(), this.getIndiceNuevoListadosCentrosCostos());
			
			int iLastRow =  this.jTableDatosListadosCentrosCostos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosListadosCentrosCostos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosListadosCentrosCostos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaListadosCentrosCostos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionListadosCentrosCostosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingListadosCentrosCostos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadosCentrosCostos(false);
			
			//SI ES MANUAL
			if(ListadosCentrosCostosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualListadosCentrosCostos();
			}
			
			//this.abrirFrameTreeListadosCentrosCostos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionListadosCentrosCostosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionListadosCentrosCostosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionListadosCentrosCostos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionListadosCentrosCostos.setFileImportacion(this.jInternalFrameImportacionListadosCentrosCostos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionListadosCentrosCostos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionListadosCentrosCostos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionListadosCentrosCostos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionListadosCentrosCostos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoListadosCentrosCostosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ListadosCentrosCostos> listadoscentroscostossSeleccionados=new ArrayList<ListadosCentrosCostos>();		

		listadoscentroscostossSeleccionados=this.getListadosCentrosCostossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ListadosCentrosCostosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ListadosCentrosCostosBaseDesign.jrxml";
			
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
			
			this.generarReporteListadosCentrosCostoss("Todos",listadoscentroscostossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Centros Costos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ListadosCentrosCostosConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosCentrosCostosConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosCentrosCostosConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosCentrosCostosConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ListadosCentrosCostosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ListadosCentrosCostosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ListadosCentrosCostosConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case ListadosCentrosCostosConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ListadosCentrosCostosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ListadosCentrosCostosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ListadosCentrosCostosConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case ListadosCentrosCostosConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ListadosCentrosCostosConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ListadosCentrosCostosConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ListadosCentrosCostosConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case ListadosCentrosCostosConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
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
	
	public void jButtonGenerarExcelReporteDinamicoListadosCentrosCostosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ListadosCentrosCostos> listadoscentroscostossSeleccionados=new ArrayList<ListadosCentrosCostos>();		
		
		listadoscentroscostossSeleccionados=this.getListadosCentrosCostossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadoscentroscostos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ListadosCentrosCostoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ListadosCentrosCostosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosCentrosCostosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ListadosCentrosCostos listadoscentroscostos:listadoscentroscostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadoscentroscostos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosCentrosCostosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosCentrosCostosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ListadosCentrosCostos listadoscentroscostos:listadoscentroscostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadoscentroscostos.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosCentrosCostosConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosCentrosCostosConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ListadosCentrosCostos listadoscentroscostos:listadoscentroscostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadoscentroscostos.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosCentrosCostosConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosCentrosCostosConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(ListadosCentrosCostos listadoscentroscostos:listadoscentroscostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadoscentroscostos.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosCentrosCostosConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosCentrosCostosConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(ListadosCentrosCostos listadoscentroscostos:listadoscentroscostossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadoscentroscostos.getvalor());
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
			//	this.getFilaCabeceraExportarExcelListadosCentrosCostos(row);				
			//	iRow++;
			//}				
			
			//for(ListadosCentrosCostos listadoscentroscostosAux:listadoscentroscostossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelListadosCentrosCostos(listadoscentroscostosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Centros Costos",JOptionPane.INFORMATION_MESSAGE);
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
				this.listadoscentroscostosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadosCentrosCostos(false);
			
			//SI ES MANUAL
			if(ListadosCentrosCostosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualListadosCentrosCostos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresListadosCentrosCostosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadosCentrosCostos(false);
			
			//SI ES MANUAL
			if(ListadosCentrosCostosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualListadosCentrosCostos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesListadosCentrosCostosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadosCentrosCostos(false);
			
			//SI ES MANUAL
			if(ListadosCentrosCostosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualListadosCentrosCostos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaListadosCentrosCostos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosListadosCentrosCostos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosListadosCentrosCostos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosListadosCentrosCostos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosListadosCentrosCostos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosListadosCentrosCostos.setMinimumSize(dimensionMinimum);
		this.jTableDatosListadosCentrosCostos.setMaximumSize(dimensionMaximum);
		this.jTableDatosListadosCentrosCostos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingListadosCentrosCostos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingListadosCentrosCostos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingListadosCentrosCostos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaListadosCentrosCostos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesListadosCentrosCostos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasListadosCentrosCostos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesListadosCentrosCostos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesListadosCentrosCostos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ListadosCentrosCostosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ListadosCentrosCostosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualListadosCentrosCostos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaListadosCentrosCostos();
		
		this.inicializarActualizarBindingBotonesManualListadosCentrosCostos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualListadosCentrosCostos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesListadosCentrosCostos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualListadosCentrosCostos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualListadosCentrosCostos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosListadosCentrosCostos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosListadosCentrosCostos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteListadosCentrosCostos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormListadosCentrosCostos.jCheckBoxPostAccionNuevoListadosCentrosCostos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormListadosCentrosCostos.jCheckBoxPostAccionSinCerrarListadosCentrosCostos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormListadosCentrosCostos.jCheckBoxPostAccionSinMensajeListadosCentrosCostos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosListadosCentrosCostos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosListadosCentrosCostos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteListadosCentrosCostos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) {
				this.jInternalFrameDetalleFormListadosCentrosCostos.jCheckBoxPostAccionNuevoListadosCentrosCostos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormListadosCentrosCostos.jCheckBoxPostAccionSinCerrarListadosCentrosCostos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormListadosCentrosCostos.jCheckBoxPostAccionSinMensajeListadosCentrosCostos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionListadosCentrosCostos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionListadosCentrosCostos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormListadosCentrosCostos.jComboBoxTiposAccionesFormularioListadosCentrosCostos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesListadosCentrosCostos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoListadosCentrosCostos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesListadosCentrosCostos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesListadosCentrosCostos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarListadosCentrosCostos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesListadosCentrosCostos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoListadosCentrosCostos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesListadosCentrosCostos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralListadosCentrosCostos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesListadosCentrosCostos(Boolean esInicializar) throws Exception {
		try	{	
			if(ListadosCentrosCostosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualListadosCentrosCostos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesListadosCentrosCostos() throws Exception {
		try	{
			if(ListadosCentrosCostosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualListadosCentrosCostos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleListadosCentrosCostos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormListadosCentrosCostos.jComboBoxTiposAccionesFormularioListadosCentrosCostos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormListadosCentrosCostos.jComboBoxTiposAccionesFormularioListadosCentrosCostos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualListadosCentrosCostos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesListadosCentrosCostos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesListadosCentrosCostos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesListadosCentrosCostos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesListadosCentrosCostos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesListadosCentrosCostos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesListadosCentrosCostos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionListadosCentrosCostos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionListadosCentrosCostos.addItem(reporte);
			}
			
			
			if(!this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionListadosCentrosCostos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionListadosCentrosCostos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesListadosCentrosCostos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesListadosCentrosCostos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesListadosCentrosCostos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesListadosCentrosCostos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormListadosCentrosCostos.jComboBoxTiposAccionesFormularioListadosCentrosCostos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormListadosCentrosCostos.jComboBoxTiposAccionesFormularioListadosCentrosCostos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarListadosCentrosCostos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarListadosCentrosCostos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarListadosCentrosCostos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualListadosCentrosCostos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualListadosCentrosCostos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoListadosCentrosCostos!=null) {
				this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoListadosCentrosCostos!=null) {
				this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoListadosCentrosCostos!=null) {
				
				if(this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ListadosCentrosCostosConstantesFunciones.getTiposSeleccionarListadosCentrosCostos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ListadosCentrosCostosConstantesFunciones.getTiposSeleccionarListadosCentrosCostos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ListadosCentrosCostosConstantesFunciones.getTiposSeleccionarListadosCentrosCostos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualListadosCentrosCostos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		//this.idBusquedaListadosCentrosCostos=Long.parseLong(this.jLabelidListadosCentrosCostosBusquedaListadosCentrosCostos.getText());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasListadosCentrosCostos(Boolean esInicializar) throws Exception {				
		if(ListadosCentrosCostosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualListadosCentrosCostos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaListadosCentrosCostos() throws Exception {
		this.inicializarActualizarBindingTablaListadosCentrosCostos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByListadosCentrosCostos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByListadosCentrosCostos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByListadosCentrosCostos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByListadosCentrosCostos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ListadosCentrosCostosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByListadosCentrosCostos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByListadosCentrosCostos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ListadosCentrosCostosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosListadosCentrosCostosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosCentrosCostosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ListadosCentrosCostosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByListadosCentrosCostos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByListadosCentrosCostos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ListadosCentrosCostosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByListadosCentrosCostos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaListadosCentrosCostos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=listadoscentroscostosLogic.getListadosCentrosCostoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=listadoscentroscostoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ListadosCentrosCostosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosListadosCentrosCostos.setModel(new ListadosCentrosCostosModel(this.listadoscentroscostosLogic.getListadosCentrosCostoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosListadosCentrosCostos.setModel(new ListadosCentrosCostosModel(this.listadoscentroscostoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByListadosCentrosCostos!=null && this.jInternalFrameOrderByListadosCentrosCostos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByListadosCentrosCostos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosListadosCentrosCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosCentrosCostos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ListadosCentrosCostosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO,listadoscentroscostosConstantesFunciones.resaltarSeleccionarListadosCentrosCostos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ListadosCentrosCostosConstantesFunciones.SCLASSWEBTITULO,listadoscentroscostosConstantesFunciones.resaltarSeleccionarListadosCentrosCostos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosListadosCentrosCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosCentrosCostos,ListadosCentrosCostosConstantesFunciones.LABEL_CODIGO));

		if(this.listadoscentroscostosConstantesFunciones.mostrarcodigoListadosCentrosCostos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosCentrosCostosConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadoscentroscostosConstantesFunciones.resaltarcodigoListadosCentrosCostos,this.listadoscentroscostosConstantesFunciones.activarcodigoListadosCentrosCostos,iSizeTabla,this,true,"codigoListadosCentrosCostos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadoscentroscostosConstantesFunciones.resaltarcodigoListadosCentrosCostos,this.listadoscentroscostosConstantesFunciones.activarcodigoListadosCentrosCostos,this,true,"codigoListadosCentrosCostos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadosCentrosCostosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosCentrosCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosCentrosCostos,ListadosCentrosCostosConstantesFunciones.LABEL_NOMBRE));

		if(this.listadoscentroscostosConstantesFunciones.mostrarnombreListadosCentrosCostos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosCentrosCostosConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadoscentroscostosConstantesFunciones.resaltarnombreListadosCentrosCostos,this.listadoscentroscostosConstantesFunciones.activarnombreListadosCentrosCostos,iSizeTabla,this,true,"nombreListadosCentrosCostos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadoscentroscostosConstantesFunciones.resaltarnombreListadosCentrosCostos,this.listadoscentroscostosConstantesFunciones.activarnombreListadosCentrosCostos,this,true,"nombreListadosCentrosCostos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadosCentrosCostosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosCentrosCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosCentrosCostos,ListadosCentrosCostosConstantesFunciones.LABEL_PORCENTAJE));

		if(this.listadoscentroscostosConstantesFunciones.mostrarporcentajeListadosCentrosCostos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosCentrosCostosConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.listadoscentroscostosConstantesFunciones.resaltarporcentajeListadosCentrosCostos,this.listadoscentroscostosConstantesFunciones.activarporcentajeListadosCentrosCostos,iSizeTabla,this,true,"porcentajeListadosCentrosCostos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadoscentroscostosConstantesFunciones.resaltarporcentajeListadosCentrosCostos,this.listadoscentroscostosConstantesFunciones.activarporcentajeListadosCentrosCostos,this,true,"porcentajeListadosCentrosCostos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ListadosCentrosCostosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosCentrosCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosCentrosCostos,ListadosCentrosCostosConstantesFunciones.LABEL_VALOR));

		if(this.listadoscentroscostosConstantesFunciones.mostrarvalorListadosCentrosCostos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosCentrosCostosConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.listadoscentroscostosConstantesFunciones.resaltarvalorListadosCentrosCostos,this.listadoscentroscostosConstantesFunciones.activarvalorListadosCentrosCostos,iSizeTabla,this,true,"valorListadosCentrosCostos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadoscentroscostosConstantesFunciones.resaltarvalorListadosCentrosCostos,this.listadoscentroscostosConstantesFunciones.activarvalorListadosCentrosCostos,this,true,"valorListadosCentrosCostos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ListadosCentrosCostosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.listadoscentroscostosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.listadoscentroscostosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosListadosCentrosCostos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.listadoscentroscostosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.listadoscentroscostosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosListadosCentrosCostos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarListadosCentrosCostos && this.isPermisoGuardarCambiosListadosCentrosCostos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.listadoscentroscostosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.listadoscentroscostosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosListadosCentrosCostos.addColumn(tableColumn);
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
			
			this.jTableDatosListadosCentrosCostos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarListadosCentrosCostos && this.isPermisoGuardarCambiosListadosCentrosCostos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarListadosCentrosCostos && this.isPermisoGuardarCambiosListadosCentrosCostos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosListadosCentrosCostos.moveColumn(this.jTableDatosListadosCentrosCostos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosListadosCentrosCostos.moveColumn(this.jTableDatosListadosCentrosCostos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosListadosCentrosCostos.moveColumn(this.jTableDatosListadosCentrosCostos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosListadosCentrosCostos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosListadosCentrosCostos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosListadosCentrosCostos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ListadosCentrosCostosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosListadosCentrosCostos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosListadosCentrosCostos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ListadosCentrosCostosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ListadosCentrosCostosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosListadosCentrosCostos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosListadosCentrosCostos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosListadosCentrosCostos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=listadoscentroscostosLogic.getListadosCentrosCostoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=listadoscentroscostoss.size()-1;
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
		//this.jTableDatosListadosCentrosCostos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosListadosCentrosCostos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosListadosCentrosCostos();
			
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
				
				//this.isEsNuevoListadosCentrosCostos=false;
					
				ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
			
				if(this.listadoscentroscostosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormListadosCentrosCostos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosListadosCentrosCostos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosListadosCentrosCostos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostosLogic.getListadosCentrosCostoss().toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostoss.toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.listadoscentroscostos.getsType().equals("DUPLICADO")
				   || this.listadoscentroscostos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoListadosCentrosCostos=true;
				
				} else {
					this.isEsNuevoListadosCentrosCostos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {
					if(this.listadoscentroscostos.getId()>=0 && !this.listadoscentroscostos.getIsNew()) {						
						this.isEsNuevoListadosCentrosCostos=false;
						
					} else {
						this.isEsNuevoListadosCentrosCostos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoListadosCentrosCostos(esRelaciones);						
				
				this.seleccionarListadosCentrosCostos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.listadoscentroscostos.getId()<0) {
					this.isEsNuevoListadosCentrosCostos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarListadosCentrosCostos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarListadosCentrosCostos(evt,rowIndex);
				}	
				
				if(this.listadoscentroscostosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ListadosCentrosCostos: " + this.dDif); 
					}
				}								
				
				ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarListadosCentrosCostos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.listadoscentroscostos)) {
					if(this.listadoscentroscostos.getId()>0) {
						this.listadoscentroscostos.setIsDeleted(true);
						
						this.listadoscentroscostossEliminados.add(this.listadoscentroscostos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.listadoscentroscostosLogic.getListadosCentrosCostoss().remove(this.listadoscentroscostos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.listadoscentroscostoss.remove(this.listadoscentroscostos);				
					}
					
					
					((ListadosCentrosCostosModel) this.jTableDatosListadosCentrosCostos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaListadosCentrosCostos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarListadosCentrosCostos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoListadosCentrosCostos) {
			
			if(this.jInternalFrameDetalleFormListadosCentrosCostos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosListadosCentrosCostos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosListadosCentrosCostos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostosLogic.getListadosCentrosCostoss().toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostoss.toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ListadosCentrosCostosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioListadosCentrosCostos(this.listadoscentroscostos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesListadosCentrosCostos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesListadosCentrosCostos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualListadosCentrosCostos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoListadosCentrosCostos(ListadosCentrosCostos listadoscentroscostos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoListadosCentrosCostos(listadoscentroscostos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoListadosCentrosCostos(ListadosCentrosCostos listadoscentroscostos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioListadosCentrosCostos(listadoscentroscostos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyListadosCentrosCostos(listadoscentroscostos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyListadosCentrosCostos(listadoscentroscostos);
	}
	
	public void setVariablesObjetoActualToFormularioListadosCentrosCostos(ListadosCentrosCostos listadoscentroscostos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormListadosCentrosCostos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormListadosCentrosCostos.jTextFieldcodigoListadosCentrosCostos.setText(listadoscentroscostos.getcodigo());
			this.jInternalFrameDetalleFormListadosCentrosCostos.jTextAreanombreListadosCentrosCostos.setText(listadoscentroscostos.getnombre());
			this.jInternalFrameDetalleFormListadosCentrosCostos.jTextFieldporcentajeListadosCentrosCostos.setText(listadoscentroscostos.getporcentaje().toString());
			this.jInternalFrameDetalleFormListadosCentrosCostos.jTextFieldvalorListadosCentrosCostos.setText(listadoscentroscostos.getvalor().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ListadosCentrosCostos listadoscentroscostosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,listadoscentroscostosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ListadosCentrosCostos listadoscentroscostosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				listadoscentroscostosLocal=this.listadoscentroscostos;
			} else {
				listadoscentroscostosLocal=this.listadoscentroscostosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(listadoscentroscostosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoListadosCentrosCostos(listadoscentroscostosLocal,true);
					
					if(listadoscentroscostosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(listadoscentroscostosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(listadoscentroscostosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoListadosCentrosCostos(ListadosCentrosCostos listadoscentroscostos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualListadosCentrosCostos(listadoscentroscostos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosCostos(listadoscentroscostos);
	}
	
	public void setVariablesFormularioToObjetoActualListadosCentrosCostos(ListadosCentrosCostos listadoscentroscostos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualListadosCentrosCostos(listadoscentroscostos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualListadosCentrosCostos(ListadosCentrosCostos listadoscentroscostos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormListadosCentrosCostos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			listadoscentroscostos.setcodigo(this.jInternalFrameDetalleFormListadosCentrosCostos.jTextFieldcodigoListadosCentrosCostos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosCentrosCostosConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosCentrosCostos.jLabelcodigoListadosCentrosCostos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadoscentroscostos.setnombre(this.jInternalFrameDetalleFormListadosCentrosCostos.jTextAreanombreListadosCentrosCostos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosCentrosCostosConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosCentrosCostos.jLabelnombreListadosCentrosCostos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadoscentroscostos.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormListadosCentrosCostos.jTextFieldporcentajeListadosCentrosCostos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosCentrosCostosConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosCentrosCostos.jLabelporcentajeListadosCentrosCostos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadoscentroscostos.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormListadosCentrosCostos.jTextFieldvalorListadosCentrosCostos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosCentrosCostosConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosCentrosCostos.jLabelvalorListadosCentrosCostos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualListadosCentrosCostos(ListadosCentrosCostos listadoscentroscostosBean,ListadosCentrosCostos listadoscentroscostos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosListadosCentrosCostos(ListadosCentrosCostos listadoscentroscostosOrigen,ListadosCentrosCostos listadoscentroscostos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && listadoscentroscostosOrigen.getId()!=null && !listadoscentroscostosOrigen.getId().equals(0L))) {listadoscentroscostos.setId(listadoscentroscostosOrigen.getId());}}
			if(conDefault || (!conDefault && listadoscentroscostosOrigen.getcodigo()!=null && !listadoscentroscostosOrigen.getcodigo().equals(""))) {listadoscentroscostos.setcodigo(listadoscentroscostosOrigen.getcodigo());}
			if(conDefault || (!conDefault && listadoscentroscostosOrigen.getnombre()!=null && !listadoscentroscostosOrigen.getnombre().equals(""))) {listadoscentroscostos.setnombre(listadoscentroscostosOrigen.getnombre());}
			if(conDefault || (!conDefault && listadoscentroscostosOrigen.getporcentaje()!=null && !listadoscentroscostosOrigen.getporcentaje().equals(0.0))) {listadoscentroscostos.setporcentaje(listadoscentroscostosOrigen.getporcentaje());}
			if(conDefault || (!conDefault && listadoscentroscostosOrigen.getvalor()!=null && !listadoscentroscostosOrigen.getvalor().equals(0.0))) {listadoscentroscostos.setvalor(listadoscentroscostosOrigen.getvalor());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioListadosCentrosCostos(ListadosCentrosCostos listadoscentroscostos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormListadosCentrosCostos.jTextFieldcodigoListadosCentrosCostos.setText(listadoscentroscostos.getcodigo());
			this.jInternalFrameDetalleFormListadosCentrosCostos.jTextAreanombreListadosCentrosCostos.setText(listadoscentroscostos.getnombre());
			this.jInternalFrameDetalleFormListadosCentrosCostos.jTextFieldporcentajeListadosCentrosCostos.setText(listadoscentroscostos.getporcentaje().toString());
			this.jInternalFrameDetalleFormListadosCentrosCostos.jTextFieldvalorListadosCentrosCostos.setText(listadoscentroscostos.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioListadosCentrosCostos(ListadosCentrosCostosBean listadoscentroscostosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormListadosCentrosCostos.jTextFieldcodigoListadosCentrosCostos.setText(listadoscentroscostosBean.getcodigo());
			this.jInternalFrameDetalleFormListadosCentrosCostos.jTextAreanombreListadosCentrosCostos.setText(listadoscentroscostosBean.getnombre());
			this.jInternalFrameDetalleFormListadosCentrosCostos.jTextFieldporcentajeListadosCentrosCostos.setText(listadoscentroscostosBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormListadosCentrosCostos.jTextFieldvalorListadosCentrosCostos.setText(listadoscentroscostosBean.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanListadosCentrosCostos(ListadosCentrosCostosParameterReturnGeneral listadoscentroscostosReturnGeneral,ListadosCentrosCostosBean listadoscentroscostosBean,Boolean conDefault) throws Exception { 
		try {
			ListadosCentrosCostos listadoscentroscostosLocal=new ListadosCentrosCostos();
			
			listadoscentroscostosLocal=listadoscentroscostosReturnGeneral.getListadosCentrosCostos();
			
			
			if(conDefault || (!conDefault && listadoscentroscostosLocal.getcodigo()!=null && !listadoscentroscostosLocal.getcodigo().equals(""))) {listadoscentroscostosBean.setcodigo(listadoscentroscostosLocal.getcodigo());}
			if(conDefault || (!conDefault && listadoscentroscostosLocal.getnombre()!=null && !listadoscentroscostosLocal.getnombre().equals(""))) {listadoscentroscostosBean.setnombre(listadoscentroscostosLocal.getnombre());}
			if(conDefault || (!conDefault && listadoscentroscostosLocal.getporcentaje()!=null && !listadoscentroscostosLocal.getporcentaje().equals(0.0))) {listadoscentroscostosBean.setporcentaje(listadoscentroscostosLocal.getporcentaje());}
			if(conDefault || (!conDefault && listadoscentroscostosLocal.getvalor()!=null && !listadoscentroscostosLocal.getvalor().equals(0.0))) {listadoscentroscostosBean.setvalor(listadoscentroscostosLocal.getvalor());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxListadosCentrosCostosGenerico(Long idListadosCentrosCostosSeleccionado,JComboBox jComboBoxListadosCentrosCostos,List<ListadosCentrosCostos> listadoscentroscostossLocal)throws Exception {
		try {
			ListadosCentrosCostos  listadoscentroscostosTemp=null;

			for(ListadosCentrosCostos listadoscentroscostosAux:listadoscentroscostossLocal) {
				if(listadoscentroscostosAux.getId()!=null && listadoscentroscostosAux.getId().equals(idListadosCentrosCostosSeleccionado)) {
					listadoscentroscostosTemp=listadoscentroscostosAux;
					break;
				}
			}

			jComboBoxListadosCentrosCostos.setSelectedItem(listadoscentroscostosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxListadosCentrosCostosGenerico(JComboBox jComboBoxListadosCentrosCostos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxListadosCentrosCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxListadosCentrosCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxListadosCentrosCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxListadosCentrosCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxListadosCentrosCostos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxListadosCentrosCostos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxListadosCentrosCostos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxListadosCentrosCostos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxListadosCentrosCostos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxListadosCentrosCostos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			listadoscentroscostos=(ListadosCentrosCostos) listadoscentroscostosLogic.getListadosCentrosCostoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			listadoscentroscostos =(ListadosCentrosCostos) listadoscentroscostoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!listadoscentroscostos.getIsNew() && !listadoscentroscostos.getIsChanged() && !listadoscentroscostos.getIsDeleted()) {
				sDescripcion=listadoscentroscostos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=listadoscentroscostos.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ListadosCentrosCostos listadoscentroscostosRow=new ListadosCentrosCostos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			listadoscentroscostosRow=(ListadosCentrosCostos) listadoscentroscostosLogic.getListadosCentrosCostoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			listadoscentroscostosRow=(ListadosCentrosCostos) listadoscentroscostoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualListadosCentrosCostos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoListadosCentrosCostos.setVisible((this.isVisibilidadCeldaNuevoListadosCentrosCostos && this.isPermisoNuevoListadosCentrosCostos));			
			this.jButtonDuplicarListadosCentrosCostos.setVisible((this.isVisibilidadCeldaDuplicarListadosCentrosCostos && this.isPermisoDuplicarListadosCentrosCostos));			
			this.jButtonCopiarListadosCentrosCostos.setVisible((this.isVisibilidadCeldaCopiarListadosCentrosCostos && this.isPermisoCopiarListadosCentrosCostos));
			this.jButtonVerFormListadosCentrosCostos.setVisible((this.isVisibilidadCeldaVerFormListadosCentrosCostos && this.isPermisoVerFormListadosCentrosCostos));
			
			this.jButtonAbrirOrderByListadosCentrosCostos.setVisible((this.isVisibilidadCeldaOrdenListadosCentrosCostos && this.isPermisoOrdenListadosCentrosCostos));			
			
			this.jButtonNuevoRelacionesListadosCentrosCostos.setVisible((this.isVisibilidadCeldaNuevoRelacionesListadosCentrosCostos && this.isPermisoNuevoListadosCentrosCostos));			
			this.jButtonNuevoGuardarCambiosListadosCentrosCostos.setVisible((this.isVisibilidadCeldaNuevoListadosCentrosCostos && this.isPermisoNuevoListadosCentrosCostos && this.isPermisoGuardarCambiosListadosCentrosCostos));
			
			if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) {
			this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonModificarListadosCentrosCostos.setVisible((this.isVisibilidadCeldaModificarListadosCentrosCostos && this.isPermisoActualizarListadosCentrosCostos));	
			this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonActualizarListadosCentrosCostos.setVisible((this.isVisibilidadCeldaActualizarListadosCentrosCostos && this.isPermisoActualizarListadosCentrosCostos));	
			this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonEliminarListadosCentrosCostos.setVisible((this.isVisibilidadCeldaEliminarListadosCentrosCostos && this.isPermisoEliminarListadosCentrosCostos));
			this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonCancelarListadosCentrosCostos.setVisible(this.isVisibilidadCeldaCancelarListadosCentrosCostos);							
			this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonGuardarCambiosListadosCentrosCostos.setVisible((this.isVisibilidadCeldaGuardarListadosCentrosCostos && this.isPermisoGuardarCambiosListadosCentrosCostos));			
			
			}
						
			this.jButtonGuardarCambiosTablaListadosCentrosCostos.setVisible((this.isVisibilidadCeldaGuardarCambiosListadosCentrosCostos && this.isPermisoGuardarCambiosListadosCentrosCostos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarListadosCentrosCostos.setVisible((this.isVisibilidadCeldaNuevoListadosCentrosCostos && this.isPermisoNuevoListadosCentrosCostos));						
			this.jButtonDuplicarToolBarListadosCentrosCostos.setVisible((this.isVisibilidadCeldaDuplicarListadosCentrosCostos && this.isPermisoDuplicarListadosCentrosCostos));						
			this.jButtonCopiarToolBarListadosCentrosCostos.setVisible((this.isVisibilidadCeldaCopiarListadosCentrosCostos && this.isPermisoCopiarListadosCentrosCostos));			
			this.jButtonVerFormToolBarListadosCentrosCostos.setVisible((this.isVisibilidadCeldaVerFormListadosCentrosCostos && this.isPermisoVerFormListadosCentrosCostos));			
			this.jButtonAbrirOrderByToolBarListadosCentrosCostos.setVisible((this.isVisibilidadCeldaOrdenListadosCentrosCostos && this.isPermisoOrdenListadosCentrosCostos));
			this.jButtonNuevoRelacionesToolBarListadosCentrosCostos.setVisible((this.isVisibilidadCeldaNuevoRelacionesListadosCentrosCostos && this.isPermisoNuevoListadosCentrosCostos));			
			this.jButtonNuevoGuardarCambiosToolBarListadosCentrosCostos.setVisible((this.isVisibilidadCeldaNuevoListadosCentrosCostos && this.isPermisoNuevoListadosCentrosCostos && this.isPermisoGuardarCambiosListadosCentrosCostos));			
			
			if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) {
			this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonModificarToolBarListadosCentrosCostos.setVisible((this.isVisibilidadCeldaModificarListadosCentrosCostos && this.isPermisoActualizarListadosCentrosCostos));	
			this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonActualizarToolBarListadosCentrosCostos.setVisible((this.isVisibilidadCeldaActualizarListadosCentrosCostos  && this.isPermisoActualizarListadosCentrosCostos));	
			this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonEliminarToolBarListadosCentrosCostos.setVisible((this.isVisibilidadCeldaEliminarListadosCentrosCostos && this.isPermisoEliminarListadosCentrosCostos));
			this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonCancelarToolBarListadosCentrosCostos.setVisible(this.isVisibilidadCeldaCancelarListadosCentrosCostos);				
			this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonGuardarCambiosToolBarListadosCentrosCostos.setVisible((this.isVisibilidadCeldaGuardarListadosCentrosCostos && this.isPermisoGuardarCambiosListadosCentrosCostos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarListadosCentrosCostos.setVisible((this.isVisibilidadCeldaGuardarCambiosListadosCentrosCostos && this.isPermisoGuardarCambiosListadosCentrosCostos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoListadosCentrosCostos.setVisible((this.isVisibilidadCeldaNuevoListadosCentrosCostos && this.isPermisoNuevoListadosCentrosCostos));			
			this.jMenuItemDuplicarListadosCentrosCostos.setVisible((this.isVisibilidadCeldaDuplicarListadosCentrosCostos && this.isPermisoDuplicarListadosCentrosCostos));			
			this.jMenuItemCopiarListadosCentrosCostos.setVisible((this.isVisibilidadCeldaCopiarListadosCentrosCostos && this.isPermisoCopiarListadosCentrosCostos));			
			this.jMenuItemVerFormListadosCentrosCostos.setVisible((this.isVisibilidadCeldaVerFormListadosCentrosCostos && this.isPermisoVerFormListadosCentrosCostos));			
			this.jMenuItemAbrirOrderByListadosCentrosCostos.setVisible((this.isVisibilidadCeldaOrdenListadosCentrosCostos && this.isPermisoOrdenListadosCentrosCostos));			
			//this.jMenuItemMostrarOcultarListadosCentrosCostos.setVisible((this.isVisibilidadCeldaOrdenListadosCentrosCostos && this.isPermisoOrdenListadosCentrosCostos));
			this.jMenuItemDetalleAbrirOrderByListadosCentrosCostos.setVisible((this.isVisibilidadCeldaOrdenListadosCentrosCostos && this.isPermisoOrdenListadosCentrosCostos));			
			//this.jMenuItemDetalleMostrarOcultarListadosCentrosCostos.setVisible((this.isVisibilidadCeldaOrdenListadosCentrosCostos && this.isPermisoOrdenListadosCentrosCostos));			
			this.jMenuItemNuevoRelacionesListadosCentrosCostos.setVisible((this.isVisibilidadCeldaNuevoRelacionesListadosCentrosCostos && this.isPermisoNuevoListadosCentrosCostos));			
			this.jMenuItemNuevoGuardarCambiosListadosCentrosCostos.setVisible((this.isVisibilidadCeldaNuevoListadosCentrosCostos && this.isPermisoNuevoListadosCentrosCostos && this.isPermisoGuardarCambiosListadosCentrosCostos));									
			
			if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) {
			this.jInternalFrameDetalleFormListadosCentrosCostos.jMenuItemModificarListadosCentrosCostos.setVisible((this.isVisibilidadCeldaModificarListadosCentrosCostos && this.isPermisoActualizarListadosCentrosCostos));	
			this.jInternalFrameDetalleFormListadosCentrosCostos.jMenuItemActualizarListadosCentrosCostos.setVisible((this.isVisibilidadCeldaActualizarListadosCentrosCostos && this.isPermisoActualizarListadosCentrosCostos));	
			this.jInternalFrameDetalleFormListadosCentrosCostos.jMenuItemEliminarListadosCentrosCostos.setVisible((this.isVisibilidadCeldaEliminarListadosCentrosCostos && this.isPermisoEliminarListadosCentrosCostos));
			this.jInternalFrameDetalleFormListadosCentrosCostos.jMenuItemCancelarListadosCentrosCostos.setVisible(this.isVisibilidadCeldaCancelarListadosCentrosCostos);				
			}
			
			this.jMenuItemGuardarCambiosListadosCentrosCostos.setVisible((this.isVisibilidadCeldaGuardarListadosCentrosCostos && this.isPermisoGuardarCambiosListadosCentrosCostos));						
			this.jMenuItemGuardarCambiosTablaListadosCentrosCostos.setVisible((this.isVisibilidadCeldaGuardarCambiosListadosCentrosCostos && this.isPermisoGuardarCambiosListadosCentrosCostos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoListadosCentrosCostos=this.jButtonNuevoListadosCentrosCostos.isVisible();
			this.isVisibilidadCeldaDuplicarListadosCentrosCostos=this.jButtonDuplicarListadosCentrosCostos.isVisible();
			this.isVisibilidadCeldaCopiarListadosCentrosCostos=this.jButtonCopiarListadosCentrosCostos.isVisible();
			this.isVisibilidadCeldaVerFormListadosCentrosCostos=this.jButtonVerFormListadosCentrosCostos.isVisible();
			
			this.isVisibilidadCeldaOrdenListadosCentrosCostos=this.jButtonAbrirOrderByListadosCentrosCostos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesListadosCentrosCostos=this.jButtonNuevoRelacionesListadosCentrosCostos.isVisible();
			this.isVisibilidadCeldaModificarListadosCentrosCostos=this.jButtonModificarListadosCentrosCostos.isVisible();
			
			if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) {
			this.isVisibilidadCeldaActualizarListadosCentrosCostos=this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonActualizarListadosCentrosCostos.isVisible();
			this.isVisibilidadCeldaEliminarListadosCentrosCostos=this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonEliminarListadosCentrosCostos.isVisible();
			this.isVisibilidadCeldaCancelarListadosCentrosCostos=this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonCancelarListadosCentrosCostos.isVisible();
			this.isVisibilidadCeldaGuardarListadosCentrosCostos=this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonGuardarCambiosListadosCentrosCostos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosListadosCentrosCostos=this.jButtonGuardarCambiosTablaListadosCentrosCostos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoListadosCentrosCostos=this.jButtonNuevoToolBarListadosCentrosCostos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesListadosCentrosCostos=this.jButtonNuevoRelacionesToolBarListadosCentrosCostos.isVisible();
			
			if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) {
			this.isVisibilidadCeldaModificarListadosCentrosCostos=this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonModificarToolBarListadosCentrosCostos.isVisible();
			this.isVisibilidadCeldaActualizarListadosCentrosCostos=this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonActualizarToolBarListadosCentrosCostos.isVisible();
			this.isVisibilidadCeldaEliminarListadosCentrosCostos=this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonEliminarToolBarListadosCentrosCostos.isVisible();
			this.isVisibilidadCeldaCancelarListadosCentrosCostos=this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonCancelarToolBarListadosCentrosCostos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarListadosCentrosCostos=this.jButtonGuardarCambiosToolBarListadosCentrosCostos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosListadosCentrosCostos=this.jButtonGuardarCambiosTablaToolBarListadosCentrosCostos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoListadosCentrosCostos=this.jMenuItemNuevoListadosCentrosCostos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesListadosCentrosCostos=this.jMenuItemNuevoRelacionesListadosCentrosCostos.isVisible();
			
			if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) {
			this.isVisibilidadCeldaModificarListadosCentrosCostos=this.jInternalFrameDetalleFormListadosCentrosCostos.jMenuItemModificarListadosCentrosCostos.isVisible();
			this.isVisibilidadCeldaActualizarListadosCentrosCostos=this.jInternalFrameDetalleFormListadosCentrosCostos.jMenuItemActualizarListadosCentrosCostos.isVisible();
			this.isVisibilidadCeldaEliminarListadosCentrosCostos=this.jInternalFrameDetalleFormListadosCentrosCostos.jMenuItemEliminarListadosCentrosCostos.isVisible();
			this.isVisibilidadCeldaCancelarListadosCentrosCostos=this.jInternalFrameDetalleFormListadosCentrosCostos.jMenuItemCancelarListadosCentrosCostos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarListadosCentrosCostos=this.jMenuItemGuardarCambiosListadosCentrosCostos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosListadosCentrosCostos=this.jMenuItemGuardarCambiosTablaListadosCentrosCostos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesListadosCentrosCostos(Boolean esInicializar) {
		if(ListadosCentrosCostosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.listadoscentroscostosSessionBean.getConGuardarRelaciones()) {
				//if(this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesListadosCentrosCostos();
			}
			
			this.inicializarActualizarBindingBotonesManualListadosCentrosCostos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualListadosCentrosCostos() {
		this.jButtonNuevoListadosCentrosCostos.setVisible(this.isPermisoNuevoListadosCentrosCostos);			
		this.jButtonDuplicarListadosCentrosCostos.setVisible(this.isPermisoDuplicarListadosCentrosCostos);			
		this.jButtonCopiarListadosCentrosCostos.setVisible(this.isPermisoCopiarListadosCentrosCostos);			
		this.jButtonVerFormListadosCentrosCostos.setVisible(this.isPermisoVerFormListadosCentrosCostos);			
		
		this.jButtonAbrirOrderByListadosCentrosCostos.setVisible(this.isPermisoOrdenListadosCentrosCostos);					
		
		this.jButtonNuevoRelacionesListadosCentrosCostos.setVisible(this.isPermisoNuevoListadosCentrosCostos);			
		
		if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonModificarListadosCentrosCostos.setVisible(this.isPermisoActualizarListadosCentrosCostos);	
			this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonActualizarListadosCentrosCostos.setVisible(this.isPermisoActualizarListadosCentrosCostos);	
			this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonEliminarListadosCentrosCostos.setVisible(this.isPermisoEliminarListadosCentrosCostos);
			this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonCancelarListadosCentrosCostos.setVisible(this.isVisibilidadCeldaCancelarListadosCentrosCostos);						
			this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonGuardarCambiosListadosCentrosCostos.setVisible(this.isPermisoGuardarCambiosListadosCentrosCostos);							
		}
		
		this.jButtonGuardarCambiosTablaListadosCentrosCostos.setVisible(this.isPermisoActualizarListadosCentrosCostos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleListadosCentrosCostos() {
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonModificarListadosCentrosCostos.setVisible(this.isPermisoActualizarListadosCentrosCostos);	
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonActualizarListadosCentrosCostos.setVisible(this.isPermisoActualizarListadosCentrosCostos);	
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonEliminarListadosCentrosCostos.setVisible(this.isPermisoEliminarListadosCentrosCostos);
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonCancelarListadosCentrosCostos.setVisible(this.isVisibilidadCeldaCancelarListadosCentrosCostos);							
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonGuardarCambiosListadosCentrosCostos.setVisible((this.isVisibilidadCeldaGuardarListadosCentrosCostos && this.isPermisoGuardarCambiosListadosCentrosCostos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosListadosCentrosCostos() {
		if(ListadosCentrosCostosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualListadosCentrosCostos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesListadosCentrosCostos() {
	}
	
	public void jTableDatosListadosCentrosCostosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarListadosCentrosCostos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidListadosCentrosCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosCentrosCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosCentrosCostos(this.getlistadoscentroscostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosCostos(this.listadoscentroscostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostosLogic.getListadosCentrosCostoss().toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostoss.toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoscentroscostos==null) {
						this.listadoscentroscostos = new ListadosCentrosCostos();
					}

					this.setVariablesFormularioToObjetoActualListadosCentrosCostos(this.listadoscentroscostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosCostos(this.listadoscentroscostos);
				}

				if(this.listadoscentroscostos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.listadoscentroscostos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosCentrosCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaListadosCentrosCostosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebListadosCentrosCostos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosCentrosCostos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosListadosCentrosCostos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosListadosCentrosCostos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostosLogic.getListadosCentrosCostoss().toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostoss.toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualListadosCentrosCostos(this.getlistadoscentroscostos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosCostos(this.listadoscentroscostos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.listadoscentroscostosLogic.getConnexion());

				if(this.listadoscentroscostos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.listadoscentroscostos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderListadosCentrosCostos=(TitledBorder)this.jScrollPanelDatosListadosCentrosCostos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderListadosCentrosCostos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaListadosCentrosCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosCentrosCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosCentrosCostos(this.getlistadoscentroscostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosCostos(this.listadoscentroscostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostosLogic.getListadosCentrosCostoss().toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostoss.toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoscentroscostos==null) {
						this.listadoscentroscostos = new ListadosCentrosCostos();
					}

					this.setVariablesFormularioToObjetoActualListadosCentrosCostos(this.listadoscentroscostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosCostos(this.listadoscentroscostos);
				}

				if(this.listadoscentroscostos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.listadoscentroscostos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosCentrosCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoListadosCentrosCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosCentrosCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosCentrosCostos(this.getlistadoscentroscostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosCostos(this.listadoscentroscostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostosLogic.getListadosCentrosCostoss().toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostoss.toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoscentroscostos==null) {
						this.listadoscentroscostos = new ListadosCentrosCostos();
					}

					this.setVariablesFormularioToObjetoActualListadosCentrosCostos(this.listadoscentroscostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosCostos(this.listadoscentroscostos);
				}

				if(this.listadoscentroscostos.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.listadoscentroscostos.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosCentrosCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreListadosCentrosCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosCentrosCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosCentrosCostos(this.getlistadoscentroscostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosCostos(this.listadoscentroscostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostosLogic.getListadosCentrosCostoss().toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostoss.toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoscentroscostos==null) {
						this.listadoscentroscostos = new ListadosCentrosCostos();
					}

					this.setVariablesFormularioToObjetoActualListadosCentrosCostos(this.listadoscentroscostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosCostos(this.listadoscentroscostos);
				}

				if(this.listadoscentroscostos.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.listadoscentroscostos.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosCentrosCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeListadosCentrosCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosCentrosCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosCentrosCostos(this.getlistadoscentroscostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosCostos(this.listadoscentroscostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostosLogic.getListadosCentrosCostoss().toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostoss.toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoscentroscostos==null) {
						this.listadoscentroscostos = new ListadosCentrosCostos();
					}

					this.setVariablesFormularioToObjetoActualListadosCentrosCostos(this.listadoscentroscostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosCostos(this.listadoscentroscostos);
				}

				if(this.listadoscentroscostos.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.listadoscentroscostos.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosCentrosCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorListadosCentrosCostosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosCentrosCostos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosCentrosCostos(this.getlistadoscentroscostos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosCostos(this.listadoscentroscostos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostosLogic.getListadosCentrosCostoss().toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostoss.toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoscentroscostos==null) {
						this.listadoscentroscostos = new ListadosCentrosCostos();
					}

					this.setVariablesFormularioToObjetoActualListadosCentrosCostos(this.listadoscentroscostos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosCostos(this.listadoscentroscostos);
				}

				if(this.listadoscentroscostos.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.listadoscentroscostos.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosCentrosCostos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaListadosCentrosCostosListadosCentrosCostosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingListadosCentrosCostos(false,false);

			this.getListadosCentrosCostossBusquedaListadosCentrosCostos();

			this.inicializarActualizarBindingListadosCentrosCostos(false);

			//if(ListadosCentrosCostosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingListadosCentrosCostos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaListadosCentrosCostosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingListadosCentrosCostos(false,false);

			this.getListadosCentrosCostossFK_IdEmpresa();

			this.inicializarActualizarBindingListadosCentrosCostos(false);

			//if(ListadosCentrosCostosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingListadosCentrosCostos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoscentroscostosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameListadosCentrosCostos() {
		if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) {
			this.jInternalFrameDetalleFormListadosCentrosCostos.setVisible(false);	    			
			this.jInternalFrameDetalleFormListadosCentrosCostos.dispose();
			this.jInternalFrameDetalleFormListadosCentrosCostos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoListadosCentrosCostos!=null) {
			this.jInternalFrameReporteDinamicoListadosCentrosCostos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoListadosCentrosCostos.dispose();
			this.jInternalFrameReporteDinamicoListadosCentrosCostos=null;
		}
		
		if(this.jInternalFrameImportacionListadosCentrosCostos!=null) {
			this.jInternalFrameImportacionListadosCentrosCostos.setVisible(false);	    			
			this.jInternalFrameImportacionListadosCentrosCostos.dispose();
			this.jInternalFrameImportacionListadosCentrosCostos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessListadosCentrosCostos();
			
			ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
			
			
			if(sTipo.equals("NuevoListadosCentrosCostos")) {
				jButtonNuevoListadosCentrosCostosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarListadosCentrosCostos")) {
				jButtonDuplicarListadosCentrosCostosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarListadosCentrosCostos")) {
				jButtonCopiarListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("VerFormListadosCentrosCostos")) {
				jButtonVerFormListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarListadosCentrosCostos")) {
				jButtonNuevoListadosCentrosCostosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarListadosCentrosCostos")) {
				jButtonDuplicarListadosCentrosCostosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoListadosCentrosCostos")) {
				jButtonNuevoListadosCentrosCostosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarListadosCentrosCostos")) {
				jButtonDuplicarListadosCentrosCostosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesListadosCentrosCostos")) {
				jButtonNuevoListadosCentrosCostosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarListadosCentrosCostos")) {
				jButtonNuevoListadosCentrosCostosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesListadosCentrosCostos")) {
				jButtonNuevoListadosCentrosCostosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarListadosCentrosCostos")) {
				jButtonModificarListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarListadosCentrosCostos")) {
				jButtonModificarListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarListadosCentrosCostos")) {
				jButtonModificarListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarListadosCentrosCostos")) {
				jButtonActualizarListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarListadosCentrosCostos")) {
				jButtonActualizarListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarListadosCentrosCostos")) {
				jButtonActualizarListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("EliminarListadosCentrosCostos")) {
				jButtonEliminarListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarListadosCentrosCostos")) {
				jButtonEliminarListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarListadosCentrosCostos")) {
				jButtonEliminarListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("CancelarListadosCentrosCostos")) {
				jButtonCancelarListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarListadosCentrosCostos")) {
				jButtonCancelarListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarListadosCentrosCostos")) {
				jButtonCancelarListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("CerrarListadosCentrosCostos")) {
				jButtonCerrarListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarListadosCentrosCostos")) {
				jButtonCerrarListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarListadosCentrosCostos")) {
				jButtonCerrarListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarListadosCentrosCostos")) {
				jButtonMostrarOcultarListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarListadosCentrosCostos")) {
				jButtonCancelarListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosListadosCentrosCostos")) {
				jButtonGuardarCambiosListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarListadosCentrosCostos")) {
				jButtonGuardarCambiosListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarListadosCentrosCostos")) {
				jButtonCopiarListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarListadosCentrosCostos")) {
				jButtonVerFormListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosListadosCentrosCostos")) {
				jButtonGuardarCambiosListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarListadosCentrosCostos")) {
				jButtonCopiarListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormListadosCentrosCostos")) {
				jButtonVerFormListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaListadosCentrosCostos")) {
				jButtonGuardarCambiosListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarListadosCentrosCostos")) {
				jButtonGuardarCambiosListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaListadosCentrosCostos")) {
				jButtonGuardarCambiosListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionListadosCentrosCostos")) {
				jButtonRecargarInformacionListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarListadosCentrosCostos")) {
				jButtonRecargarInformacionListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionListadosCentrosCostos")) {
				jButtonRecargarInformacionListadosCentrosCostosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresListadosCentrosCostos")) {
				jButtonAnterioresListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarListadosCentrosCostos")) {
				jButtonAnterioresListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreListadosCentrosCostos")) {
				jButtonAnterioresListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesListadosCentrosCostos")) {
				jButtonSiguientesListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarListadosCentrosCostos")) {
				jButtonSiguientesListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesListadosCentrosCostos")) {
				jButtonSiguientesListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByListadosCentrosCostos") || sTipo.equals("MenuItemDetalleAbrirOrderByListadosCentrosCostos")) {
				jButtonAbrirOrderByListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarListadosCentrosCostos") || sTipo.equals("MenuItemDetalleMostrarOcultarListadosCentrosCostos")) {
				jButtonMostrarOcultarListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosListadosCentrosCostos")) {
				jButtonNuevoGuardarCambiosListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarListadosCentrosCostos")) {
				jButtonNuevoGuardarCambiosListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosListadosCentrosCostos")) {
				jButtonNuevoGuardarCambiosListadosCentrosCostosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoListadosCentrosCostos")) {
				jButtonCerrarReporteDinamicoListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoListadosCentrosCostos")) {
				jButtonGenerarReporteDinamicoListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoListadosCentrosCostos")) {
				
				jButtonGenerarExcelReporteDinamicoListadosCentrosCostosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionListadosCentrosCostos")) {
				jButtonCerrarImportacionListadosCentrosCostosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionListadosCentrosCostos")) {
				
				jButtonGenerarImportacionListadosCentrosCostosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionListadosCentrosCostos")) {
				
				jButtonAbrirImportacionListadosCentrosCostosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesListadosCentrosCostos")) {
				jComboBoxTiposAccionesListadosCentrosCostosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesListadosCentrosCostos")) {
				jComboBoxTiposRelacionesListadosCentrosCostosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioListadosCentrosCostos")) {
				jComboBoxTiposAccionesListadosCentrosCostosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarListadosCentrosCostos")) {
				
				jComboBoxTiposSeleccionarListadosCentrosCostosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralListadosCentrosCostos")) {
				jTextFieldValorCampoGeneralListadosCentrosCostosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByListadosCentrosCostos")) {
				jButtonAbrirOrderByListadosCentrosCostosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarListadosCentrosCostos")) {
				jButtonAbrirOrderByListadosCentrosCostosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByListadosCentrosCostos")) {
				jButtonCerrarOrderByListadosCentrosCostosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idListadosCentrosCostosBusqueda")) {
				this.jButtonidListadosCentrosCostosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaListadosCentrosCostosUpdate")) {
				this.jButtonid_empresaListadosCentrosCostosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaListadosCentrosCostosBusqueda")) {
				this.jButtonid_empresaListadosCentrosCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoListadosCentrosCostosBusqueda")) {
				this.jButtoncodigoListadosCentrosCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreListadosCentrosCostosBusqueda")) {
				this.jButtonnombreListadosCentrosCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeListadosCentrosCostosBusqueda")) {
				this.jButtonporcentajeListadosCentrosCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorListadosCentrosCostosBusqueda")) {
				this.jButtonvalorListadosCentrosCostosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaListadosCentrosCostosListadosCentrosCostos")) {
				this.jButtonBusquedaListadosCentrosCostosListadosCentrosCostosActionPerformed(evt);
			}
			
			;
			
			
			ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessListadosCentrosCostos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosCentrosCostosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoscentroscostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoscentroscostos);
				
				ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
				
				


				
				ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosCentrosCostos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosCentrosCostos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ListadosCentrosCostos listadoscentroscostosLocal=null;
			
			if(!this.getEsControlTabla()) {
				listadoscentroscostosLocal=this.listadoscentroscostos;
			} else {
				listadoscentroscostosLocal=this.listadoscentroscostosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoscentroscostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoscentroscostos);
				
				ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
							
				
				


				
				ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosCentrosCostos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosCentrosCostos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosCentrosCostosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadosCentrosCostos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostosAnterior =(ListadosCentrosCostos) this.listadoscentroscostosLogic.getListadosCentrosCostoss().toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoscentroscostosAnterior =(ListadosCentrosCostos) this.listadoscentroscostoss.toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
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
			
			ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
			
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
			
			


			
			ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosCentrosCostosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoscentroscostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoscentroscostos);
				
				ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
								
						
				


				
				ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosCentrosCostos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosCentrosCostos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoscentroscostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoscentroscostos);
				
				ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
								
				
				


				
				ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosCentrosCostos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosCentrosCostos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosCentrosCostosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadosCentrosCostos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostosAnterior =(ListadosCentrosCostos) this.listadoscentroscostosLogic.getListadosCentrosCostoss().toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoscentroscostosAnterior =(ListadosCentrosCostos) this.listadoscentroscostoss.toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoscentroscostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoscentroscostos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosCentrosCostosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadosCentrosCostos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostosAnterior =(ListadosCentrosCostos) this.listadoscentroscostosLogic.getListadosCentrosCostoss().toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoscentroscostosAnterior =(ListadosCentrosCostos) this.listadoscentroscostoss.toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosCentrosCostosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoscentroscostos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.listadoscentroscostos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoscentroscostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoscentroscostos);
				
				ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
							
				
				


				
				ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosCentrosCostos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosCentrosCostos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosCentrosCostosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosListadosCentrosCostos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoscentroscostosAnterior =(ListadosCentrosCostos) this.listadoscentroscostosLogic.getListadosCentrosCostoss().toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.listadoscentroscostosAnterior =(ListadosCentrosCostos) this.listadoscentroscostoss.toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
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
			
			ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
			
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
			
			


			
			ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosCentrosCostosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoscentroscostos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.listadoscentroscostos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoscentroscostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoscentroscostos);
				
				ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
								
				
				


				
				ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosCentrosCostos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosCentrosCostos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosCentrosCostosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadosCentrosCostos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostosAnterior =(ListadosCentrosCostos) this.listadoscentroscostosLogic.getListadosCentrosCostoss().toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoscentroscostosAnterior =(ListadosCentrosCostos) this.listadoscentroscostoss.toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosCentrosCostosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoscentroscostos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.listadoscentroscostos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosCentrosCostosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoscentroscostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoscentroscostos);
				
				ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosListadosCentrosCostos")) {
					jCheckBoxSeleccionarTodosListadosCentrosCostosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosListadosCentrosCostos")) {
					jCheckBoxSeleccionadosListadosCentrosCostosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarListadosCentrosCostos")) {
					
				}
				
				


				
				
				ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosCentrosCostos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosCentrosCostos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoscentroscostos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.listadoscentroscostos);
				
				ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
												
				
				


				
				
				ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosCentrosCostos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosCentrosCostos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosCentrosCostosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosListadosCentrosCostos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoscentroscostosAnterior =(ListadosCentrosCostos) this.listadoscentroscostosLogic.getListadosCentrosCostoss().toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.listadoscentroscostosAnterior =(ListadosCentrosCostos) this.listadoscentroscostoss.toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosCentrosCostosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoscentroscostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoscentroscostos);
				
				ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
				
				
				ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
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
			
			ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
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
			
			


			
			ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosCentrosCostosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoscentroscostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoscentroscostos);
				
				ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosCentrosCostos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosCentrosCostos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoscentroscostos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoscentroscostos);
				
				ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
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
				
				


				
				ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosCentrosCostos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosCentrosCostos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosCentrosCostosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadosCentrosCostos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoscentroscostosAnterior =(ListadosCentrosCostos) this.listadoscentroscostosLogic.getListadosCentrosCostoss().toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoscentroscostosAnterior =(ListadosCentrosCostos) this.listadoscentroscostoss.toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarListadosCentrosCostos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosListadosCentrosCostosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosListadosCentrosCostos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostosLogic.getListadosCentrosCostoss().toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.listadoscentroscostos =(ListadosCentrosCostos) this.listadoscentroscostoss.toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.listadoscentroscostos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarListadosCentrosCostos")) {
				
				}
				
				ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarListadosCentrosCostos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosListadosCentrosCostos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarListadosCentrosCostos")) {
			
			}
			
			ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessListadosCentrosCostos();
			
			ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
			
			if(sTipo.equals("NuevoListadosCentrosCostos")) {
				jButtonNuevoListadosCentrosCostosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarListadosCentrosCostos")) {
				jButtonDuplicarListadosCentrosCostosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarListadosCentrosCostos")) {
				jButtonCopiarListadosCentrosCostosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormListadosCentrosCostos")) {
				jButtonVerFormListadosCentrosCostosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesListadosCentrosCostos")) {
				jButtonNuevoListadosCentrosCostosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarListadosCentrosCostos")) {
				jButtonModificarListadosCentrosCostosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarListadosCentrosCostos")) {
				jButtonActualizarListadosCentrosCostosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarListadosCentrosCostos")) {
				jButtonEliminarListadosCentrosCostosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaListadosCentrosCostos")) {
				jButtonGuardarCambiosListadosCentrosCostosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarListadosCentrosCostos")) {
				jButtonCancelarListadosCentrosCostosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarListadosCentrosCostos")) {
				jButtonCerrarListadosCentrosCostosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosListadosCentrosCostos")) {
				jButtonGuardarCambiosListadosCentrosCostosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosListadosCentrosCostos")) {
				jButtonNuevoGuardarCambiosListadosCentrosCostosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByListadosCentrosCostos")) {
				jButtonAbrirOrderByListadosCentrosCostosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionListadosCentrosCostos")) {
				jButtonRecargarInformacionListadosCentrosCostosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresListadosCentrosCostos")) {
				jButtonAnterioresListadosCentrosCostosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesListadosCentrosCostos")) {
				jButtonSiguientesListadosCentrosCostosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idListadosCentrosCostosBusqueda")) {
				this.jButtonidListadosCentrosCostosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaListadosCentrosCostosUpdate")) {
				this.jButtonid_empresaListadosCentrosCostosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaListadosCentrosCostosBusqueda")) {
				this.jButtonid_empresaListadosCentrosCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoListadosCentrosCostosBusqueda")) {
				this.jButtoncodigoListadosCentrosCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreListadosCentrosCostosBusqueda")) {
				this.jButtonnombreListadosCentrosCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeListadosCentrosCostosBusqueda")) {
				this.jButtonporcentajeListadosCentrosCostosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorListadosCentrosCostosBusqueda")) {
				this.jButtonvalorListadosCentrosCostosBusquedaActionPerformed(evt);
			}
			
			ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessListadosCentrosCostos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameListadosCentrosCostos")) {
				closingInternalFrameListadosCentrosCostos();
				
			} else if(sTipo.equals("jButtonCancelarListadosCentrosCostos")) {
				JInternalFrameBase jInternalFrameDetalleFormListadosCentrosCostos = (JInternalFrameBase)evt.getSource();
	            	
	            ListadosCentrosCostosBeanSwingJInternalFrame jInternalFrameParent=(ListadosCentrosCostosBeanSwingJInternalFrame)jInternalFrameDetalleFormListadosCentrosCostos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarListadosCentrosCostosActionPerformed(null);
			}
			
			ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.listadoscentroscostos,new Object(),this.listadoscentroscostosParameterGeneral,this.listadoscentroscostosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormListadosCentrosCostos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormListadosCentrosCostos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormListadosCentrosCostos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.listadoscentroscostos)) {
			if(!esControlTabla) {
				if(ListadosCentrosCostosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualListadosCentrosCostos(this.listadoscentroscostos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosCostos(this.listadoscentroscostos);			
				}
				
				if(this.listadoscentroscostosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualListadosCentrosCostos(this.listadoscentroscostos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanListadosCentrosCostos(this.listadoscentroscostosReturnGeneral,this.listadoscentroscostosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.listadoscentroscostosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanListadosCentrosCostos(classes,this.listadoscentroscostosReturnGeneral,this.listadoscentroscostosBean,false);
					}
						
					if(this.listadoscentroscostosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyListadosCentrosCostos(this.listadoscentroscostosReturnGeneral.getListadosCentrosCostos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioListadosCentrosCostos(this.listadoscentroscostosReturnGeneral.getListadosCentrosCostos());	
					}
						
					if(this.listadoscentroscostosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioListadosCentrosCostos(this.listadoscentroscostosReturnGeneral.getListadosCentrosCostos(),classes);//this.listadoscentroscostosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioListadosCentrosCostos(this.listadoscentroscostos,classes);//this.listadoscentroscostosBean);									
				}
			
				if(ListadosCentrosCostosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualListadosCentrosCostos(this.listadoscentroscostos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosCentrosCostos(this.listadoscentroscostos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.listadoscentroscostosAnterior!=null) {
						this.listadoscentroscostos=this.listadoscentroscostosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.listadoscentroscostosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.listadoscentroscostosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.listadoscentroscostosReturnGeneral.getListadosCentrosCostos(),listadoscentroscostosLogic.getListadosCentrosCostoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.listadoscentroscostosReturnGeneral.getListadosCentrosCostos(),this.listadoscentroscostoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosListadosCentrosCostos.repaint();
				
				//((AbstractTableModel) this.jTableDatosListadosCentrosCostos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosListadosCentrosCostos();
			}
		}
	}
	
	public void actualizarVisualTableDatosListadosCentrosCostos() throws Exception {
		
		ListadosCentrosCostosModel listadoscentroscostosModel=(ListadosCentrosCostosModel)this.jTableDatosListadosCentrosCostos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			listadoscentroscostosModel.listadoscentroscostoss=this.listadoscentroscostosLogic.getListadosCentrosCostoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			listadoscentroscostosModel.listadoscentroscostoss=this.listadoscentroscostoss;
		}
		
		
		((ListadosCentrosCostosModel) this.jTableDatosListadosCentrosCostos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaListadosCentrosCostos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getlistadoscentroscostosAnterior(),this.listadoscentroscostosLogic.getListadosCentrosCostoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getlistadoscentroscostosAnterior(),this.listadoscentroscostoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosListadosCentrosCostos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioListadosCentrosCostos(ListadosCentrosCostos listadoscentroscostos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
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
										
				ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.listadoscentroscostos,new Object(),generalEntityParameterGeneral,this.listadoscentroscostosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.listadoscentroscostosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ListadosCentrosCostosConstantesFunciones.getClassesRelationshipsOfListadosCentrosCostos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ListadosCentrosCostosConstantesFunciones.getClassesRelationshipsFromStringsOfListadosCentrosCostos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormListadosCentrosCostos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ListadosCentrosCostosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.listadoscentroscostos,new Object(),generalEntityParameterGeneral,this.listadoscentroscostosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioListadosCentrosCostos(ListadosCentrosCostosBean listadoscentroscostosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanListadosCentrosCostos(ArrayList<Classe> classes,ListadosCentrosCostosReturnGeneral listadoscentroscostosReturnGeneral,ListadosCentrosCostosBean listadoscentroscostosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualListadosCentrosCostos(ListadosCentrosCostos listadoscentroscostos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.listadoscentroscostos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormListadosCentrosCostos = new ListadosCentrosCostosDetalleFormJInternalFrame(jDesktopPane,this.listadoscentroscostosSessionBean.getConGuardarRelaciones(),this.listadoscentroscostosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormListadosCentrosCostos);
		this.jInternalFrameDetalleFormListadosCentrosCostos.setVisible(false);
		this.jInternalFrameDetalleFormListadosCentrosCostos.setSelected(false);						
		
		this.jInternalFrameDetalleFormListadosCentrosCostos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormListadosCentrosCostos.listadoscentroscostosLogic=this.listadoscentroscostosLogic;
		
		this.cargarCombosFrameForeignKeyListadosCentrosCostos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleListadosCentrosCostos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleListadosCentrosCostos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyListadosCentrosCostos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyListadosCentrosCostos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormListadosCentrosCostos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarListadosCentrosCostos"));
		
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonModificarListadosCentrosCostos.addActionListener(new ButtonActionListener(this,"ModificarListadosCentrosCostos"));

		
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonModificarToolBarListadosCentrosCostos.addActionListener(new ButtonActionListener(this,"ModificarToolBarListadosCentrosCostos"));
					
		this.jInternalFrameDetalleFormListadosCentrosCostos.jMenuItemModificarListadosCentrosCostos.addActionListener(new ButtonActionListener(this,"MenuItemModificarListadosCentrosCostos"));		
		
		
		
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonActualizarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"ActualizarListadosCentrosCostos"));
		
		
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonActualizarToolBarListadosCentrosCostos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarListadosCentrosCostos"));
						
		this.jInternalFrameDetalleFormListadosCentrosCostos.jMenuItemActualizarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarListadosCentrosCostos"));		
		
		
		
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonEliminarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"EliminarListadosCentrosCostos"));
		
		
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonEliminarToolBarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"EliminarToolBarListadosCentrosCostos"));
								
		this.jInternalFrameDetalleFormListadosCentrosCostos.jMenuItemEliminarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarListadosCentrosCostos"));		
		
		
		
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonCancelarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"CancelarListadosCentrosCostos"));
		
		
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonCancelarToolBarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"CancelarToolBarListadosCentrosCostos"));
					
		this.jInternalFrameDetalleFormListadosCentrosCostos.jMenuItemCancelarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarListadosCentrosCostos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormListadosCentrosCostos.jMenuItemDetalleCerrarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarListadosCentrosCostos"));		
		
		
		
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonGuardarCambiosToolBarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarListadosCentrosCostos"));
		
		
		
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonGuardarCambiosToolBarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarListadosCentrosCostos"));
		
		
		
		this.jInternalFrameDetalleFormListadosCentrosCostos.jComboBoxTiposAccionesFormularioListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioListadosCentrosCostos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonidListadosCentrosCostosBusqueda.addActionListener(new ButtonActionListener(this,"idListadosCentrosCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonid_empresaListadosCentrosCostosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaListadosCentrosCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonid_empresaListadosCentrosCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaListadosCentrosCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtoncodigoListadosCentrosCostosBusqueda.addActionListener(new ButtonActionListener(this,"codigoListadosCentrosCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonnombreListadosCentrosCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombreListadosCentrosCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonporcentajeListadosCentrosCostosBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeListadosCentrosCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonvalorListadosCentrosCostosBusqueda.addActionListener(new ButtonActionListener(this,"valorListadosCentrosCostosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormListadosCentrosCostos.jTabbedPaneRelacionesListadosCentrosCostos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesListadosCentrosCostos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameListadosCentrosCostos"));
		
		if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosCentrosCostos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarListadosCentrosCostos"));
		}
		
		this.jTableDatosListadosCentrosCostos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarListadosCentrosCostos"));
		
		this.jTableDatosListadosCentrosCostos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarListadosCentrosCostos"));
		
		this.jButtonNuevoListadosCentrosCostos.addActionListener(new ButtonActionListener(this,"NuevoListadosCentrosCostos"));
		
		this.jButtonDuplicarListadosCentrosCostos.addActionListener(new ButtonActionListener(this,"DuplicarListadosCentrosCostos"));
		
		this.jButtonCopiarListadosCentrosCostos.addActionListener(new ButtonActionListener(this,"CopiarListadosCentrosCostos"));
		
		this.jButtonVerFormListadosCentrosCostos.addActionListener(new ButtonActionListener(this,"VerFormListadosCentrosCostos"));
		
		
		this.jButtonNuevoToolBarListadosCentrosCostos.addActionListener(new ButtonActionListener(this,"NuevoToolBarListadosCentrosCostos"));
			
		this.jButtonDuplicarToolBarListadosCentrosCostos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarListadosCentrosCostos"));
			
		this.jMenuItemNuevoListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoListadosCentrosCostos"));
			
		this.jMenuItemDuplicarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarListadosCentrosCostos"));		
		
		
		this.jButtonNuevoRelacionesListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesListadosCentrosCostos"));
		
		
		this.jButtonNuevoRelacionesToolBarListadosCentrosCostos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarListadosCentrosCostos"));
			
		this.jMenuItemNuevoRelacionesListadosCentrosCostos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesListadosCentrosCostos"));		
		
		
		if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonModificarListadosCentrosCostos.addActionListener(new ButtonActionListener(this,"ModificarListadosCentrosCostos"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonModificarToolBarListadosCentrosCostos.addActionListener(new ButtonActionListener(this,"ModificarToolBarListadosCentrosCostos"));
			
			this.jInternalFrameDetalleFormListadosCentrosCostos.jMenuItemModificarListadosCentrosCostos.addActionListener(new ButtonActionListener(this,"MenuItemModificarListadosCentrosCostos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonActualizarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"ActualizarListadosCentrosCostos"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonActualizarToolBarListadosCentrosCostos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarListadosCentrosCostos"));
				
			this.jInternalFrameDetalleFormListadosCentrosCostos.jMenuItemActualizarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarListadosCentrosCostos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonEliminarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"EliminarListadosCentrosCostos"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonEliminarToolBarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"EliminarToolBarListadosCentrosCostos"));
						
			this.jInternalFrameDetalleFormListadosCentrosCostos.jMenuItemEliminarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarListadosCentrosCostos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonCancelarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"CancelarListadosCentrosCostos"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonCancelarToolBarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"CancelarToolBarListadosCentrosCostos"));
			
			this.jInternalFrameDetalleFormListadosCentrosCostos.jMenuItemCancelarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarListadosCentrosCostos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarListadosCentrosCostos"));		
		
		
		this.jButtonCerrarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"CerrarListadosCentrosCostos"));
		
		
		this.jButtonCerrarToolBarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"CerrarToolBarListadosCentrosCostos"));
			
		this.jMenuItemCerrarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarListadosCentrosCostos"));
			
		if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosCentrosCostos.jMenuItemDetalleCerrarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarListadosCentrosCostos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonGuardarCambiosListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"GuardarCambiosListadosCentrosCostos"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonGuardarCambiosToolBarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarListadosCentrosCostos"));
		}
		
		this.jButtonCopiarToolBarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"CopiarToolBarListadosCentrosCostos"));
			
		this.jButtonVerFormToolBarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"VerFormToolBarListadosCentrosCostos"));
		
		this.jMenuItemGuardarCambiosListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosListadosCentrosCostos"));
			
		this.jMenuItemCopiarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarListadosCentrosCostos"));		
		
		this.jMenuItemVerFormListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormListadosCentrosCostos"));		
		
		
		this.jButtonGuardarCambiosTablaListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaListadosCentrosCostos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarListadosCentrosCostos"));
			
		this.jMenuItemGuardarCambiosTablaListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaListadosCentrosCostos"));		
		
		
		
		this.jButtonRecargarInformacionListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"RecargarInformacionListadosCentrosCostos"));
					
		this.jButtonRecargarInformacionToolBarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarListadosCentrosCostos"));
		
		this.jMenuItemRecargarInformacionListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionListadosCentrosCostos"));		
		
		
		
		this.jButtonAnterioresListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"AnterioresListadosCentrosCostos"));
		
		
		this.jButtonAnterioresToolBarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarListadosCentrosCostos"));
		
		this.jMenuItemAnterioresListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresListadosCentrosCostos"));		
		
		
		this.jButtonSiguientesListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"SiguientesListadosCentrosCostos"));
		
		
		this.jButtonSiguientesToolBarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarListadosCentrosCostos"));
			
		this.jMenuItemSiguientesListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesListadosCentrosCostos"));
			
		this.jMenuItemAbrirOrderByListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByListadosCentrosCostos"));
			
		this.jMenuItemMostrarOcultarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarListadosCentrosCostos"));
			
		this.jMenuItemDetalleAbrirOrderByListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByListadosCentrosCostos"));
			
		this.jMenuItemDetalleMostarOcultarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarListadosCentrosCostos"));		
		
		
		this.jButtonNuevoGuardarCambiosListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosListadosCentrosCostos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarListadosCentrosCostos"));
			
		this.jMenuItemNuevoGuardarCambiosListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosListadosCentrosCostos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosListadosCentrosCostos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosListadosCentrosCostos"));

		this.jCheckBoxSeleccionadosListadosCentrosCostos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosListadosCentrosCostos"));
		
		if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosCentrosCostos.jComboBoxTiposAccionesFormularioListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioListadosCentrosCostos"));
		}
		
		
		this.jComboBoxTiposRelacionesListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"TiposRelacionesListadosCentrosCostos"));
			
		this.jComboBoxTiposAccionesListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"TiposAccionesListadosCentrosCostos"));
					
		this.jComboBoxTiposSeleccionarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarListadosCentrosCostos"));
			
		this.jTextFieldValorCampoGeneralListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralListadosCentrosCostos"));		
		
		
		if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonidListadosCentrosCostosBusqueda.addActionListener(new ButtonActionListener(this,"idListadosCentrosCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonid_empresaListadosCentrosCostosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaListadosCentrosCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonid_empresaListadosCentrosCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaListadosCentrosCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtoncodigoListadosCentrosCostosBusqueda.addActionListener(new ButtonActionListener(this,"codigoListadosCentrosCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonnombreListadosCentrosCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombreListadosCentrosCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonporcentajeListadosCentrosCostosBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeListadosCentrosCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonvalorListadosCentrosCostosBusqueda.addActionListener(new ButtonActionListener(this,"valorListadosCentrosCostosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaListadosCentrosCostosListadosCentrosCostos.addActionListener(new ButtonActionListener(this,"BusquedaListadosCentrosCostosListadosCentrosCostos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoListadosCentrosCostos!=null) {
				this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoListadosCentrosCostos"));
				this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoListadosCentrosCostos"));
				this.jInternalFrameReporteDinamicoListadosCentrosCostos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoListadosCentrosCostos"));
			}
			
			//this.jButtonCerrarReporteDinamicoListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoListadosCentrosCostos"));				
			//this.jButtonGenerarReporteDinamicoListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoListadosCentrosCostos"));
			//this.jButtonGenerarExcelReporteDinamicoListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoListadosCentrosCostos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionListadosCentrosCostos!=null) {
				this.jInternalFrameImportacionListadosCentrosCostos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionListadosCentrosCostos"));
				this.jInternalFrameImportacionListadosCentrosCostos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionListadosCentrosCostos"));
				this.jInternalFrameImportacionListadosCentrosCostos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionListadosCentrosCostos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"AbrirOrderByListadosCentrosCostos"));
			
			this.jButtonAbrirOrderByToolBarListadosCentrosCostos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarListadosCentrosCostos"));			
			
			if(this.jInternalFrameOrderByListadosCentrosCostos!=null) {
				this.jInternalFrameOrderByListadosCentrosCostos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByListadosCentrosCostos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosCentrosCostos.jTabbedPaneRelacionesListadosCentrosCostos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesListadosCentrosCostos"));
		
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
            		closingInternalFrameListadosCentrosCostos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormListadosCentrosCostos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormListadosCentrosCostos = (JInternalFrameBase)event.getSource();
	            	
	            ListadosCentrosCostosBeanSwingJInternalFrame jInternalFrameParent=(ListadosCentrosCostosBeanSwingJInternalFrame)jInternalFrameDetalleFormListadosCentrosCostos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarListadosCentrosCostosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosListadosCentrosCostos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosListadosCentrosCostosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosListadosCentrosCostos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosListadosCentrosCostos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadosCentrosCostosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadosCentrosCostosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadosCentrosCostosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoListadosCentrosCostos";
		inputMap = this.jButtonNuevoListadosCentrosCostos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoListadosCentrosCostos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoListadosCentrosCostosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadosCentrosCostosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadosCentrosCostosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadosCentrosCostosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesListadosCentrosCostos";
		inputMap = this.jButtonNuevoRelacionesListadosCentrosCostos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesListadosCentrosCostos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoListadosCentrosCostosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarListadosCentrosCostos";
		inputMap = this.jButtonModificarListadosCentrosCostos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarListadosCentrosCostos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarListadosCentrosCostosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarListadosCentrosCostos";
		inputMap = this.jButtonActualizarListadosCentrosCostos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarListadosCentrosCostos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarListadosCentrosCostosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarListadosCentrosCostos";
		inputMap = this.jButtonEliminarListadosCentrosCostos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarListadosCentrosCostos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarListadosCentrosCostosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarListadosCentrosCostos";
		inputMap = this.jButtonCancelarListadosCentrosCostos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarListadosCentrosCostos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarListadosCentrosCostosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarListadosCentrosCostos";
		inputMap = this.jButtonCerrarListadosCentrosCostos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarListadosCentrosCostos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarListadosCentrosCostosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonGuardarCambiosListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosListadosCentrosCostos";
		inputMap = this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonGuardarCambiosListadosCentrosCostos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonGuardarCambiosListadosCentrosCostos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosListadosCentrosCostosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosListadosCentrosCostos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosListadosCentrosCostosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesListadosCentrosCostos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesListadosCentrosCostosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarListadosCentrosCostos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarListadosCentrosCostosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralListadosCentrosCostos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralListadosCentrosCostosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonidListadosCentrosCostosBusqueda.addActionListener(new ButtonActionListener(this,"idListadosCentrosCostosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonid_empresaListadosCentrosCostosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaListadosCentrosCostosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonid_empresaListadosCentrosCostosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaListadosCentrosCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtoncodigoListadosCentrosCostosBusqueda.addActionListener(new ButtonActionListener(this,"codigoListadosCentrosCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonnombreListadosCentrosCostosBusqueda.addActionListener(new ButtonActionListener(this,"nombreListadosCentrosCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonporcentajeListadosCentrosCostosBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeListadosCentrosCostosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosCentrosCostos.jButtonvalorListadosCentrosCostosBusqueda.addActionListener(new ButtonActionListener(this,"valorListadosCentrosCostosBusqueda"));
		
		
		this.jButtonBusquedaListadosCentrosCostosListadosCentrosCostos.addActionListener(new ButtonActionListener(this,"BusquedaListadosCentrosCostosListadosCentrosCostos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionListadosCentrosCostos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionListadosCentrosCostosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarListadosCentrosCostosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarListadosCentrosCostos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosListadosCentrosCostos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ListadosCentrosCostos listadoscentroscostosAux:this.listadoscentroscostosLogic.getListadosCentrosCostoss()) {
					listadoscentroscostosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadosCentrosCostos listadoscentroscostosAux:listadoscentroscostoss) {
					listadoscentroscostosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosListadosCentrosCostosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingListadosCentrosCostos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ListadosCentrosCostos listadoscentroscostosAux:this.listadoscentroscostosLogic.getListadosCentrosCostoss()) {
						listadoscentroscostosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ListadosCentrosCostos listadoscentroscostosAux:listadoscentroscostoss) {
						listadoscentroscostosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ListadosCentrosCostos listadoscentroscostosAux:this.listadoscentroscostosLogic.getListadosCentrosCostoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ListadosCentrosCostos listadoscentroscostosAux:listadoscentroscostoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaListadosCentrosCostos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosListadosCentrosCostos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosListadosCentrosCostos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosListadosCentrosCostos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosListadosCentrosCostosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingListadosCentrosCostos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosListadosCentrosCostos.getSelectedRows();
			
			ListadosCentrosCostos listadoscentroscostosLocal=new ListadosCentrosCostos();
			
			//this.seleccionarTodosListadosCentrosCostos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					listadoscentroscostosLocal =(ListadosCentrosCostos) this.listadoscentroscostosLogic.getListadosCentrosCostoss().toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					listadoscentroscostosLocal =(ListadosCentrosCostos) this.listadoscentroscostoss.toArray()[this.jTableDatosListadosCentrosCostos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				listadoscentroscostosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ListadosCentrosCostos listadoscentroscostosAux:this.listadoscentroscostosLogic.getListadosCentrosCostoss()) {
						listadoscentroscostosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ListadosCentrosCostos listadoscentroscostosAux:listadoscentroscostoss) {
						listadoscentroscostosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaListadosCentrosCostos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosListadosCentrosCostos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosListadosCentrosCostos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosListadosCentrosCostos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualListadosCentrosCostosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarListadosCentrosCostosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralListadosCentrosCostosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingListadosCentrosCostos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralListadosCentrosCostos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ListadosCentrosCostos listadoscentroscostosAux:this.listadoscentroscostosLogic.getListadosCentrosCostoss()) {
				
						if(sTipoSeleccionar.equals(ListadosCentrosCostosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							listadoscentroscostosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosCentrosCostosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							listadoscentroscostosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosCentrosCostosConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							listadoscentroscostosAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadosCentrosCostosConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							listadoscentroscostosAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadosCentrosCostos listadoscentroscostosAux:listadoscentroscostoss) {
					
						if(sTipoSeleccionar.equals(ListadosCentrosCostosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							listadoscentroscostosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosCentrosCostosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							listadoscentroscostosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosCentrosCostosConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							listadoscentroscostosAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadosCentrosCostosConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							listadoscentroscostosAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaListadosCentrosCostos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesListadosCentrosCostosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingListadosCentrosCostos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioListadosCentrosCostos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesListadosCentrosCostos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormListadosCentrosCostos.jComboBoxTiposAccionesFormularioListadosCentrosCostos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteListadosCentrosCostos) {				
					conSplash=true;//false;										
					
					//this.startProcessListadosCentrosCostos(conSplash);
				
					this.generarReporteListadosCentrosCostossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadosCentrosCostos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadosCentrosCostos.jComboBoxTiposAccionesFormularioListadosCentrosCostos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoListadosCentrosCostossSeleccionados();
				//this.jComboBoxTiposAccionesListadosCentrosCostos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoListadosCentrosCostossSeleccionados(false);
				//this.jComboBoxTiposAccionesListadosCentrosCostos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoListadosCentrosCostossSeleccionados(true);
				//this.jComboBoxTiposAccionesListadosCentrosCostos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessListadosCentrosCostos();
				
				this.exportarListadosCentrosCostossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadosCentrosCostos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadosCentrosCostos.jComboBoxTiposAccionesFormularioListadosCentrosCostos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionListadosCentrosCostoss();
				//this.importarListadosCentrosCostoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadosCentrosCostos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadosCentrosCostos.jComboBoxTiposAccionesFormularioListadosCentrosCostos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessListadosCentrosCostos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelListadosCentrosCostossSeleccionados();
				//this.jComboBoxTiposAccionesListadosCentrosCostos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Listados Centros Costos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessListadosCentrosCostos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoListadosCentrosCostos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyListadosCentrosCostos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Listados Centros Costos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadosCentrosCostos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadosCentrosCostos.jComboBoxTiposAccionesFormularioListadosCentrosCostos.setSelectedIndex(0);					
				}	
			} 			
			else if(ListadosCentrosCostosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteListadosCentrosCostos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessListadosCentrosCostos(conSplash);
					
						//this.actualizarParametrosGeneralListadosCentrosCostos();
						
						this.generarReporteProcesoAccionListadosCentrosCostossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesListadosCentrosCostos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormListadosCentrosCostos.jComboBoxTiposAccionesFormularioListadosCentrosCostos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ListadosCentrosCostosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Listados Centros CostosES SELECCIONADOS?", "MANTENIMIENTO DE Listados Centros Costos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessListadosCentrosCostos();
				
						this.actualizarParametrosGeneralListadosCentrosCostos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.listadoscentroscostosReturnGeneral=listadoscentroscostosLogic.procesarAccionListadosCentrosCostossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.listadoscentroscostosLogic.getListadosCentrosCostoss(),this.listadoscentroscostosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarListadosCentrosCostosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesListadosCentrosCostos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormListadosCentrosCostos.jComboBoxTiposAccionesFormularioListadosCentrosCostos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralListadosCentrosCostos();
					
					ListadosCentrosCostosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarListadosCentrosCostosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesListadosCentrosCostos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormListadosCentrosCostos.jComboBoxTiposAccionesFormularioListadosCentrosCostos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessListadosCentrosCostos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesListadosCentrosCostosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessListadosCentrosCostos();
			
			if(this.jInternalFrameDetalleFormListadosCentrosCostos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ListadosCentrosCostos> listadoscentroscostossSeleccionados=new ArrayList<ListadosCentrosCostos>();		
			ListadosCentrosCostos listadoscentroscostos=new ListadosCentrosCostos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingListadosCentrosCostos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesListadosCentrosCostos.getSelectedItem();
			
			
			
			
			listadoscentroscostossSeleccionados=this.getListadosCentrosCostossSeleccionados(true);
			//this.sTipoAccion;
			
			if(listadoscentroscostossSeleccionados.size()==1) {
				for(ListadosCentrosCostos listadoscentroscostosAux:listadoscentroscostossSeleccionados) {
					listadoscentroscostos=listadoscentroscostosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessListadosCentrosCostos();
			
      		//this.finishProcessListadosCentrosCostos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarListadosCentrosCostosReturnGeneral() throws Exception {
		if(this.listadoscentroscostosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.listadoscentroscostosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.listadoscentroscostosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.listadoscentroscostosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.listadoscentroscostosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.listadoscentroscostosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingListadosCentrosCostos(false);
		}
		
		if(this.listadoscentroscostosReturnGeneral.getConRetornoLista() || this.listadoscentroscostosReturnGeneral.getConRetornoObjeto()) {
			if(this.listadoscentroscostosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.listadoscentroscostosLogic.setListadosCentrosCostoss(this.listadoscentroscostosReturnGeneral.getListadosCentrosCostoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingListadosCentrosCostos(false);
		}
	}
	
	public void actualizarParametrosGeneralListadosCentrosCostos() throws Exception {
		
		
	}
	
	public ArrayList<ListadosCentrosCostos> getListadosCentrosCostossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ListadosCentrosCostos> listadoscentroscostossSeleccionados=new ArrayList<ListadosCentrosCostos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioListadosCentrosCostos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ListadosCentrosCostos listadoscentroscostosAux:listadoscentroscostosLogic.getListadosCentrosCostoss()) {
					if(listadoscentroscostosAux.getIsSelected()) {
						listadoscentroscostossSeleccionados.add(listadoscentroscostosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadosCentrosCostos listadoscentroscostosAux:this.listadoscentroscostoss) {
					if(listadoscentroscostosAux.getIsSelected()) {
						listadoscentroscostossSeleccionados.add(listadoscentroscostosAux);				
					}
				}
			}
			
			if(listadoscentroscostossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						listadoscentroscostossSeleccionados.addAll(this.listadoscentroscostosLogic.getListadosCentrosCostoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						listadoscentroscostossSeleccionados.addAll(this.listadoscentroscostoss);				
					}
				}
			}
		} else {
			listadoscentroscostossSeleccionados.add(this.listadoscentroscostos);
		}
		
		return listadoscentroscostossSeleccionados;
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
	
	public void generarReporteListadosCentrosCostossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalListadosCentrosCostossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoListadosCentrosCostossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoListadosCentrosCostossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoListadosCentrosCostossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Listados Centros Costos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesListadosCentrosCostossSeleccionados() throws Exception {
		ArrayList<ListadosCentrosCostos> listadoscentroscostossSeleccionados=new ArrayList<ListadosCentrosCostos>();		
		
		listadoscentroscostossSeleccionados=this.getListadosCentrosCostossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteListadosCentrosCostoss("Todos",listadoscentroscostossSeleccionados);
		
	}	
	
	public void generarReporteNormalListadosCentrosCostossSeleccionados() throws Exception {
		ArrayList<ListadosCentrosCostos> listadoscentroscostossSeleccionados=new ArrayList<ListadosCentrosCostos>();		
		
		listadoscentroscostossSeleccionados=this.getListadosCentrosCostossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteListadosCentrosCostoss("Todos",listadoscentroscostossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionListadosCentrosCostossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ListadosCentrosCostos> listadoscentroscostossSeleccionados=new ArrayList<ListadosCentrosCostos>();
		
		listadoscentroscostossSeleccionados=this.getListadosCentrosCostossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteListadosCentrosCostoss("Todos",listadoscentroscostossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoListadosCentrosCostossSeleccionados() throws Exception {
		ArrayList<ListadosCentrosCostos> listadoscentroscostossSeleccionados=new ArrayList<ListadosCentrosCostos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoListadosCentrosCostos();
		
		
		listadoscentroscostossSeleccionados=this.getListadosCentrosCostossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoListadosCentrosCostos();
		
		
		//this.generarReporteListadosCentrosCostoss("Todos",listadoscentroscostossSeleccionados ,listadoscentroscostosImplementable,listadoscentroscostosImplementableHome);
	}
	
	public void mostrarImportacionListadosCentrosCostoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionListadosCentrosCostos();
		
		this.abrirFrameImportacionListadosCentrosCostos();		
		
			
		//this.generarReporteListadosCentrosCostoss("Todos",listadoscentroscostossSeleccionados ,listadoscentroscostosImplementable,listadoscentroscostosImplementableHome);
	}
	
	public void importarListadosCentrosCostoss() throws Exception {		
	
	}
	
	public void exportarListadosCentrosCostossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelListadosCentrosCostossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoListadosCentrosCostossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlListadosCentrosCostossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Listados Centros Costos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoListadosCentrosCostossSeleccionados() throws Exception {
		ArrayList<ListadosCentrosCostos> listadoscentroscostossSeleccionados=new ArrayList<ListadosCentrosCostos>();		
		
		listadoscentroscostossSeleccionados=this.getListadosCentrosCostossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadoscentroscostos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarListadosCentrosCostos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ListadosCentrosCostos listadoscentroscostosAux:listadoscentroscostossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarListadosCentrosCostos(listadoscentroscostosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//listadoscentroscostosAux.setsDetalleGeneralEntityReporte(listadoscentroscostosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Centros Costos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarListadosCentrosCostos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ListadosCentrosCostosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosCentrosCostosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosCentrosCostosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosCentrosCostosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosCentrosCostosConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosCentrosCostosConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosCentrosCostosConstantesFunciones.LABEL_VALOR;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarListadosCentrosCostos(ListadosCentrosCostos listadoscentroscostos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=listadoscentroscostos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoscentroscostos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoscentroscostos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoscentroscostos.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoscentroscostos.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoscentroscostos.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoscentroscostos.getvalor().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelListadosCentrosCostossSeleccionados() throws Exception {
		ArrayList<ListadosCentrosCostos> listadoscentroscostossSeleccionados=new ArrayList<ListadosCentrosCostos>();		
		
		listadoscentroscostossSeleccionados=this.getListadosCentrosCostossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadoscentroscostos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ListadosCentrosCostoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelListadosCentrosCostos(row);				
				iRow++;
			}				
			
			for(ListadosCentrosCostos listadoscentroscostosAux:listadoscentroscostossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelListadosCentrosCostos(listadoscentroscostosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Centros Costos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlListadosCentrosCostossSeleccionados() throws Exception {
		ArrayList<ListadosCentrosCostos> listadoscentroscostossSeleccionados=new ArrayList<ListadosCentrosCostos>();		
		
		listadoscentroscostossSeleccionados=this.getListadosCentrosCostossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadoscentroscostos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("listadoscentroscostoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("listadoscentroscostos");
			//elementRoot.appendChild(element);
		
			for(ListadosCentrosCostos listadoscentroscostosAux:listadoscentroscostossSeleccionados) {
				element = document.createElement("listadoscentroscostos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlListadosCentrosCostos(listadoscentroscostosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Centros Costos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelListadosCentrosCostos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosCentrosCostosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosCentrosCostosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ListadosCentrosCostosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosCentrosCostosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosCentrosCostosConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosCentrosCostosConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosCentrosCostosConstantesFunciones.LABEL_VALOR);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelListadosCentrosCostos(ListadosCentrosCostos listadoscentroscostos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(listadoscentroscostos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(listadoscentroscostos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(listadoscentroscostos.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(listadoscentroscostos.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(listadoscentroscostos.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(listadoscentroscostos.getvalor());				
	}
	
	public void setFilaDatosExportarXmlListadosCentrosCostos(ListadosCentrosCostos listadoscentroscostos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ListadosCentrosCostosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(listadoscentroscostos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ListadosCentrosCostosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(listadoscentroscostos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ListadosCentrosCostosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(listadoscentroscostos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(ListadosCentrosCostosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(listadoscentroscostos.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(ListadosCentrosCostosConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(listadoscentroscostos.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementporcentaje = document.createElement(ListadosCentrosCostosConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(listadoscentroscostos.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementvalor = document.createElement(ListadosCentrosCostosConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(listadoscentroscostos.getvalor().toString().trim()));
		element.appendChild(elementvalor);
	}
	
	public void generarReporteGroupGenericoListadosCentrosCostossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ListadosCentrosCostos> listadoscentroscostossSeleccionados=new ArrayList<ListadosCentrosCostos>();
		
		listadoscentroscostossSeleccionados=this.getListadosCentrosCostossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoListadosCentrosCostos(listadoscentroscostossSeleccionados);
		
		this.generarReporteListadosCentrosCostoss("Todos",listadoscentroscostossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoListadosCentrosCostos(ArrayList<ListadosCentrosCostos> listadoscentroscostossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ListadosCentrosCostos listadoscentroscostosAux:listadoscentroscostossSeleccionados) {
				listadoscentroscostosAux.setsDetalleGeneralEntityReporte(listadoscentroscostosAux.toString());
			
				if(sTipoSeleccionar.equals(ListadosCentrosCostosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					listadoscentroscostosAux.setsDescripcionGeneralEntityReporte1(listadoscentroscostosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ListadosCentrosCostosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					listadoscentroscostosAux.setsDescripcionGeneralEntityReporte1(listadoscentroscostosAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ListadosCentrosCostosConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					listadoscentroscostosAux.setsDescripcionGeneralEntityReporte1(listadoscentroscostosAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosCentrosCostosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesListadosCentrosCostos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoListadosCentrosCostos=true;
				this.isVisibilidadCeldaNuevoRelacionesListadosCentrosCostos=true;
				this.isVisibilidadCeldaGuardarCambiosListadosCentrosCostos=true;
			}
			
			this.isVisibilidadCeldaModificarListadosCentrosCostos=false;
			this.isVisibilidadCeldaActualizarListadosCentrosCostos=false;
			this.isVisibilidadCeldaEliminarListadosCentrosCostos=false;
			this.isVisibilidadCeldaCancelarListadosCentrosCostos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosCentrosCostos=true;
				} else {
					this.isVisibilidadCeldaGuardarListadosCentrosCostos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoListadosCentrosCostos=false;
			this.isVisibilidadCeldaNuevoRelacionesListadosCentrosCostos=false;
			this.isVisibilidadCeldaGuardarCambiosListadosCentrosCostos=false;
			this.isVisibilidadCeldaModificarListadosCentrosCostos=false;
			this.isVisibilidadCeldaActualizarListadosCentrosCostos=true;
			this.isVisibilidadCeldaEliminarListadosCentrosCostos=false;
			this.isVisibilidadCeldaCancelarListadosCentrosCostos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosCentrosCostos=true;
				} else {
					this.isVisibilidadCeldaGuardarListadosCentrosCostos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoListadosCentrosCostos=false;
			this.isVisibilidadCeldaNuevoRelacionesListadosCentrosCostos=false;
			this.isVisibilidadCeldaGuardarCambiosListadosCentrosCostos=false;
			this.isVisibilidadCeldaModificarListadosCentrosCostos=false;
			this.isVisibilidadCeldaActualizarListadosCentrosCostos=true;
			this.isVisibilidadCeldaEliminarListadosCentrosCostos=true;
			this.isVisibilidadCeldaCancelarListadosCentrosCostos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosCentrosCostos=true;
				} else {
					this.isVisibilidadCeldaGuardarListadosCentrosCostos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoListadosCentrosCostos=false;
			this.isVisibilidadCeldaNuevoRelacionesListadosCentrosCostos=false;
			this.isVisibilidadCeldaGuardarCambiosListadosCentrosCostos=false;
			this.isVisibilidadCeldaModificarListadosCentrosCostos=false;
			this.isVisibilidadCeldaActualizarListadosCentrosCostos=true;
			this.isVisibilidadCeldaEliminarListadosCentrosCostos=false;
			this.isVisibilidadCeldaCancelarListadosCentrosCostos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosCentrosCostos=false;
				} else {
					this.isVisibilidadCeldaGuardarListadosCentrosCostos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoListadosCentrosCostos=true;
			this.isVisibilidadCeldaNuevoRelacionesListadosCentrosCostos=true;
			this.isVisibilidadCeldaGuardarCambiosListadosCentrosCostos=true;
			this.isVisibilidadCeldaModificarListadosCentrosCostos=false;
			this.isVisibilidadCeldaActualizarListadosCentrosCostos=false;
			this.isVisibilidadCeldaEliminarListadosCentrosCostos=false;
			this.isVisibilidadCeldaCancelarListadosCentrosCostos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosCentrosCostos=true;
				} else {
					this.isVisibilidadCeldaGuardarListadosCentrosCostos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoListadosCentrosCostos=false;
			this.isVisibilidadCeldaNuevoRelacionesListadosCentrosCostos=false;
			this.isVisibilidadCeldaGuardarCambiosListadosCentrosCostos=false;
			this.isVisibilidadCeldaActualizarListadosCentrosCostos=false;
			this.isVisibilidadCeldaEliminarListadosCentrosCostos=false;
			this.isVisibilidadCeldaCancelarListadosCentrosCostos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosCentrosCostos=false;
				} else {
					this.isVisibilidadCeldaGuardarListadosCentrosCostos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoListadosCentrosCostos=false;
			this.isVisibilidadCeldaNuevoRelacionesListadosCentrosCostos=false;
			this.isVisibilidadCeldaGuardarCambiosListadosCentrosCostos=false;
			this.isVisibilidadCeldaModificarListadosCentrosCostos=true;
			this.isVisibilidadCeldaActualizarListadosCentrosCostos=false;
			this.isVisibilidadCeldaEliminarListadosCentrosCostos=false;
			this.isVisibilidadCeldaCancelarListadosCentrosCostos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosCentrosCostos=false;
				} else {
					this.isVisibilidadCeldaGuardarListadosCentrosCostos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ListadosCentrosCostosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoListadosCentrosCostos=true;
			this.isVisibilidadCeldaNuevoRelacionesListadosCentrosCostos=true;
			this.isVisibilidadCeldaGuardarCambiosListadosCentrosCostos=true;
		} else {
			this.actualizarEstadoPanelsListadosCentrosCostos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarListadosCentrosCostos=false;
			//this.isVisibilidadCeldaVerFormListadosCentrosCostos=false;
			this.isVisibilidadCeldaDuplicarListadosCentrosCostos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!listadoscentroscostosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesListadosCentrosCostos=false;
		} else {
			this.isVisibilidadCeldaNuevoListadosCentrosCostos=false;
			this.isVisibilidadCeldaGuardarCambiosListadosCentrosCostos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {
			if(!listadoscentroscostosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesListadosCentrosCostos=false;												
			}
			
			this.jButtonCerrarListadosCentrosCostos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesListadosCentrosCostos=false;
		}
		
		if(!this.permiteMantenimiento(this.listadoscentroscostos)) {
			this.isVisibilidadCeldaActualizarListadosCentrosCostos=false;
			this.isVisibilidadCeldaEliminarListadosCentrosCostos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoListadosCentrosCostos=false;
		this.isVisibilidadCeldaNuevoRelacionesListadosCentrosCostos=false;
		this.isVisibilidadCeldaGuardarCambiosListadosCentrosCostos=false;
		//this.isVisibilidadCeldaModificarListadosCentrosCostos=true;
		this.isVisibilidadCeldaActualizarListadosCentrosCostos=false;
		this.isVisibilidadCeldaEliminarListadosCentrosCostos=false;
		//this.isVisibilidadCeldaCancelarListadosCentrosCostos=true;			
		this.isVisibilidadCeldaGuardarListadosCentrosCostos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesListadosCentrosCostos() {
	}
	
	public void actualizarEstadoPanelsListadosCentrosCostos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionListadosCentrosCostos!=null) {
				this.jScrollPanelDatosEdicionListadosCentrosCostos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosCentrosCostos!=null) {
				this.jTabbedPaneBusquedasListadosCentrosCostos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadosCentrosCostos!=null) {
				this.jScrollPanelDatosListadosCentrosCostos.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadosCentrosCostos!=null) {
				this.jPanelPaginacionListadosCentrosCostos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadosCentrosCostos!=null) {
				this.jPanelParametrosReportesListadosCentrosCostos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionListadosCentrosCostos!=null) {
				this.jScrollPanelDatosEdicionListadosCentrosCostos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosCentrosCostos!=null) {
				this.jTabbedPaneBusquedasListadosCentrosCostos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosListadosCentrosCostos!=null) {
				this.jScrollPanelDatosListadosCentrosCostos.setVisible(false);
			}
			
			if(this.jPanelPaginacionListadosCentrosCostos!=null) {
				this.jPanelPaginacionListadosCentrosCostos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesListadosCentrosCostos!=null) {
				this.jPanelParametrosReportesListadosCentrosCostos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionListadosCentrosCostos!=null) {
				this.jScrollPanelDatosEdicionListadosCentrosCostos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosCentrosCostos!=null) {
				this.jTabbedPaneBusquedasListadosCentrosCostos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosListadosCentrosCostos!=null) {
				this.jScrollPanelDatosListadosCentrosCostos.setVisible(false);
			}
			
			if(this.jPanelPaginacionListadosCentrosCostos!=null) {
				this.jPanelPaginacionListadosCentrosCostos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesListadosCentrosCostos!=null) {
				this.jPanelParametrosReportesListadosCentrosCostos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionListadosCentrosCostos!=null) {
				this.jScrollPanelDatosEdicionListadosCentrosCostos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosCentrosCostos!=null) {
				this.jTabbedPaneBusquedasListadosCentrosCostos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosListadosCentrosCostos!=null) {
				this.jScrollPanelDatosListadosCentrosCostos.setVisible(false);
			}
			
			if(this.jPanelPaginacionListadosCentrosCostos!=null) {
				this.jPanelPaginacionListadosCentrosCostos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesListadosCentrosCostos!=null) {
				this.jPanelParametrosReportesListadosCentrosCostos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionListadosCentrosCostos!=null) {
				this.jScrollPanelDatosEdicionListadosCentrosCostos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosCentrosCostos!=null) {
				this.jTabbedPaneBusquedasListadosCentrosCostos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadosCentrosCostos!=null) {
				this.jScrollPanelDatosListadosCentrosCostos.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadosCentrosCostos!=null) {
				this.jPanelPaginacionListadosCentrosCostos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadosCentrosCostos!=null) {
				this.jPanelParametrosReportesListadosCentrosCostos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionListadosCentrosCostos!=null) {
				this.jScrollPanelDatosEdicionListadosCentrosCostos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosCentrosCostos!=null) {
				this.jTabbedPaneBusquedasListadosCentrosCostos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadosCentrosCostos!=null) {
				this.jScrollPanelDatosListadosCentrosCostos.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadosCentrosCostos!=null) {
				this.jPanelPaginacionListadosCentrosCostos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadosCentrosCostos!=null) {
				this.jPanelParametrosReportesListadosCentrosCostos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionListadosCentrosCostos!=null) {
				this.jScrollPanelDatosEdicionListadosCentrosCostos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosCentrosCostos!=null) {
				this.jTabbedPaneBusquedasListadosCentrosCostos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadosCentrosCostos!=null) {
				this.jScrollPanelDatosListadosCentrosCostos.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadosCentrosCostos!=null) {
				this.jPanelPaginacionListadosCentrosCostos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadosCentrosCostos!=null) {
				this.jPanelParametrosReportesListadosCentrosCostos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasListadosCentrosCostos!=null) {
					this.jTabbedPaneBusquedasListadosCentrosCostos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesListadosCentrosCostos!=null) {
				this.jPanelParametrosReportesListadosCentrosCostos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.listadoscentroscostosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosCentrosCostos!=null) {
				this.jTabbedPaneBusquedasListadosCentrosCostos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesListadosCentrosCostos!=null) {
				this.jPanelParametrosReportesListadosCentrosCostos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaListadosCentrosCostos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaListadosCentrosCostos) {this.jTabbedPaneBusquedasListadosCentrosCostos.remove(jPanelBusquedaListadosCentrosCostosListadosCentrosCostos);}
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
			
			this.inicializarActualizarBindingTablaListadosCentrosCostos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioListadosCentrosCostos() {
		this.updateBorderResaltarBusquedasFormularioListadosCentrosCostos();
		this.updateVisibilidadBusquedasFormularioListadosCentrosCostos();
		this.updateHabilitarBusquedasFormularioListadosCentrosCostos();
	}
	
	public void updateBorderResaltarBusquedasFormularioListadosCentrosCostos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasListadosCentrosCostos.getComponents().length>0) {
	

		if(this.listadoscentroscostosConstantesFunciones.resaltarBusquedaListadosCentrosCostosListadosCentrosCostos!=null) {
			index= this.jTabbedPaneBusquedasListadosCentrosCostos.indexOfComponent(this.jPanelBusquedaListadosCentrosCostosListadosCentrosCostos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasListadosCentrosCostos.getComponent(index);
				jPanel.setBorder(this.listadoscentroscostosConstantesFunciones.resaltarBusquedaListadosCentrosCostosListadosCentrosCostos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioListadosCentrosCostos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasListadosCentrosCostos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasListadosCentrosCostos.indexOfComponent(this.jPanelBusquedaListadosCentrosCostosListadosCentrosCostos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasListadosCentrosCostos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.listadoscentroscostosConstantesFunciones.mostrarBusquedaListadosCentrosCostosListadosCentrosCostos);
			if(!this.listadoscentroscostosConstantesFunciones.mostrarBusquedaListadosCentrosCostosListadosCentrosCostos && index>-1) {
				this.jTabbedPaneBusquedasListadosCentrosCostos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioListadosCentrosCostos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasListadosCentrosCostos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasListadosCentrosCostos.indexOfComponent(this.jPanelBusquedaListadosCentrosCostosListadosCentrosCostos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasListadosCentrosCostos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.listadoscentroscostosConstantesFunciones.activarBusquedaListadosCentrosCostosListadosCentrosCostos);
				this.jTabbedPaneBusquedasListadosCentrosCostos.setEnabledAt(index,this.listadoscentroscostosConstantesFunciones.activarBusquedaListadosCentrosCostosListadosCentrosCostos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaListadosCentrosCostos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaListadosCentrosCostos")) {
			index= this.jTabbedPaneBusquedasListadosCentrosCostos.indexOfComponent(this.jPanelBusquedaListadosCentrosCostosListadosCentrosCostos);

			this.jTabbedPaneBusquedasListadosCentrosCostos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasListadosCentrosCostos.getComponent(index);

			this.listadoscentroscostosConstantesFunciones.setResaltarBusquedaListadosCentrosCostosListadosCentrosCostos(resaltar);

			jPanel.setBorder(this.listadoscentroscostosConstantesFunciones.resaltarBusquedaListadosCentrosCostosListadosCentrosCostos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarListadosCentrosCostos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioListadosCentrosCostos() throws Exception {

		if(this.jInternalFrameDetalleFormListadosCentrosCostos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioListadosCentrosCostos();
		this.updateVisibilidadResaltarControlesFormularioListadosCentrosCostos();
		this.updateHabilitarResaltarControlesFormularioListadosCentrosCostos();
		
	}
	
	public void updateBorderResaltarControlesFormularioListadosCentrosCostos() throws Exception {
		if(this.jInternalFrameDetalleFormListadosCentrosCostos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.listadoscentroscostosConstantesFunciones.resaltaridListadosCentrosCostos!=null && this.jInternalFrameDetalleFormListadosCentrosCostos!=null) {this.jInternalFrameDetalleFormListadosCentrosCostos.jLabelidListadosCentrosCostos.setBorder(this.listadoscentroscostosConstantesFunciones.resaltaridListadosCentrosCostos);}
		if(this.listadoscentroscostosConstantesFunciones.resaltarid_empresaListadosCentrosCostos!=null && this.jInternalFrameDetalleFormListadosCentrosCostos!=null) {this.jInternalFrameDetalleFormListadosCentrosCostos.jComboBoxid_empresaListadosCentrosCostos.setBorder(this.listadoscentroscostosConstantesFunciones.resaltarid_empresaListadosCentrosCostos);}
		if(this.listadoscentroscostosConstantesFunciones.resaltarcodigoListadosCentrosCostos!=null && this.jInternalFrameDetalleFormListadosCentrosCostos!=null) {this.jInternalFrameDetalleFormListadosCentrosCostos.jTextFieldcodigoListadosCentrosCostos.setBorder(this.listadoscentroscostosConstantesFunciones.resaltarcodigoListadosCentrosCostos);}
		if(this.listadoscentroscostosConstantesFunciones.resaltarnombreListadosCentrosCostos!=null && this.jInternalFrameDetalleFormListadosCentrosCostos!=null) {this.jInternalFrameDetalleFormListadosCentrosCostos.jTextAreanombreListadosCentrosCostos.setBorder(this.listadoscentroscostosConstantesFunciones.resaltarnombreListadosCentrosCostos);}
		if(this.listadoscentroscostosConstantesFunciones.resaltarporcentajeListadosCentrosCostos!=null && this.jInternalFrameDetalleFormListadosCentrosCostos!=null) {this.jInternalFrameDetalleFormListadosCentrosCostos.jTextFieldporcentajeListadosCentrosCostos.setBorder(this.listadoscentroscostosConstantesFunciones.resaltarporcentajeListadosCentrosCostos);}
		if(this.listadoscentroscostosConstantesFunciones.resaltarvalorListadosCentrosCostos!=null && this.jInternalFrameDetalleFormListadosCentrosCostos!=null) {this.jInternalFrameDetalleFormListadosCentrosCostos.jTextFieldvalorListadosCentrosCostos.setBorder(this.listadoscentroscostosConstantesFunciones.resaltarvalorListadosCentrosCostos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioListadosCentrosCostos() throws Exception {		
		if(this.jInternalFrameDetalleFormListadosCentrosCostos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) {
	
		//this.jInternalFrameDetalleFormListadosCentrosCostos.jLabelidListadosCentrosCostos.setVisible(this.listadoscentroscostosConstantesFunciones.mostraridListadosCentrosCostos);
		this.jInternalFrameDetalleFormListadosCentrosCostos.jPanelidListadosCentrosCostos.setVisible(this.listadoscentroscostosConstantesFunciones.mostraridListadosCentrosCostos);
		//this.jInternalFrameDetalleFormListadosCentrosCostos.jComboBoxid_empresaListadosCentrosCostos.setVisible(this.listadoscentroscostosConstantesFunciones.mostrarid_empresaListadosCentrosCostos);
		this.jInternalFrameDetalleFormListadosCentrosCostos.jPanelid_empresaListadosCentrosCostos.setVisible(this.listadoscentroscostosConstantesFunciones.mostrarid_empresaListadosCentrosCostos);
		//this.jInternalFrameDetalleFormListadosCentrosCostos.jTextFieldcodigoListadosCentrosCostos.setVisible(this.listadoscentroscostosConstantesFunciones.mostrarcodigoListadosCentrosCostos);
		this.jInternalFrameDetalleFormListadosCentrosCostos.jPanelcodigoListadosCentrosCostos.setVisible(this.listadoscentroscostosConstantesFunciones.mostrarcodigoListadosCentrosCostos);
		//this.jInternalFrameDetalleFormListadosCentrosCostos.jTextAreanombreListadosCentrosCostos.setVisible(this.listadoscentroscostosConstantesFunciones.mostrarnombreListadosCentrosCostos);
		this.jInternalFrameDetalleFormListadosCentrosCostos.jPanelnombreListadosCentrosCostos.setVisible(this.listadoscentroscostosConstantesFunciones.mostrarnombreListadosCentrosCostos);
		//this.jInternalFrameDetalleFormListadosCentrosCostos.jTextFieldporcentajeListadosCentrosCostos.setVisible(this.listadoscentroscostosConstantesFunciones.mostrarporcentajeListadosCentrosCostos);
		this.jInternalFrameDetalleFormListadosCentrosCostos.jPanelporcentajeListadosCentrosCostos.setVisible(this.listadoscentroscostosConstantesFunciones.mostrarporcentajeListadosCentrosCostos);
		//this.jInternalFrameDetalleFormListadosCentrosCostos.jTextFieldvalorListadosCentrosCostos.setVisible(this.listadoscentroscostosConstantesFunciones.mostrarvalorListadosCentrosCostos);
		this.jInternalFrameDetalleFormListadosCentrosCostos.jPanelvalorListadosCentrosCostos.setVisible(this.listadoscentroscostosConstantesFunciones.mostrarvalorListadosCentrosCostos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioListadosCentrosCostos() throws Exception {
		if(this.jInternalFrameDetalleFormListadosCentrosCostos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormListadosCentrosCostos!=null) {
	
		this.jInternalFrameDetalleFormListadosCentrosCostos.jLabelidListadosCentrosCostos.setEnabled(this.listadoscentroscostosConstantesFunciones.activaridListadosCentrosCostos);
		this.jInternalFrameDetalleFormListadosCentrosCostos.jComboBoxid_empresaListadosCentrosCostos.setEnabled(this.listadoscentroscostosConstantesFunciones.activarid_empresaListadosCentrosCostos);
		this.jInternalFrameDetalleFormListadosCentrosCostos.jTextFieldcodigoListadosCentrosCostos.setEnabled(this.listadoscentroscostosConstantesFunciones.activarcodigoListadosCentrosCostos);
		this.jInternalFrameDetalleFormListadosCentrosCostos.jTextAreanombreListadosCentrosCostos.setEnabled(this.listadoscentroscostosConstantesFunciones.activarnombreListadosCentrosCostos);
		this.jInternalFrameDetalleFormListadosCentrosCostos.jTextFieldporcentajeListadosCentrosCostos.setEnabled(this.listadoscentroscostosConstantesFunciones.activarporcentajeListadosCentrosCostos);
		this.jInternalFrameDetalleFormListadosCentrosCostos.jTextFieldvalorListadosCentrosCostos.setEnabled(this.listadoscentroscostosConstantesFunciones.activarvalorListadosCentrosCostos);
		}
	}
	
		
}