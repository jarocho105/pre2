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

//import com.bydan.erp.activosfijos.util.ListadoActivosFijosConstantesFunciones;
import com.bydan.erp.activosfijos.util.report.ListadoActivosFijosParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.report.ListadoActivosFijosParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.report.ListadoActivosFijosBean;
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
public class ListadoActivosFijosBeanSwingJInternalFrame extends ListadoActivosFijosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ListadoActivosFijosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ListadoActivosFijos> listadoactivosfijosValidator = new ClassValidator<ListadoActivosFijos>(ListadoActivosFijos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ListadoActivosFijos listadoactivosfijos;	
	public ListadoActivosFijos listadoactivosfijosAux;
	public ListadoActivosFijos listadoactivosfijosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ListadoActivosFijos listadoactivosfijosTotales;
	public Long idListadoActivosFijosActual;
	public Long iIdNuevoListadoActivosFijos=0L;
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
	
	public Boolean isPermisoTodoListadoActivosFijos;
	public Boolean isPermisoNuevoListadoActivosFijos;
	public Boolean isPermisoActualizarListadoActivosFijos;
	public Boolean isPermisoActualizarOriginalListadoActivosFijos;
	public Boolean isPermisoEliminarListadoActivosFijos;
	public Boolean isPermisoGuardarCambiosListadoActivosFijos;
	public Boolean isPermisoConsultaListadoActivosFijos;
	public Boolean isPermisoBusquedaListadoActivosFijos;
	public Boolean isPermisoReporteListadoActivosFijos;
	public Boolean isPermisoPaginacionMedioListadoActivosFijos;
	public Boolean isPermisoPaginacionAltoListadoActivosFijos;
	public Boolean isPermisoPaginacionTodoListadoActivosFijos;
	public Boolean isPermisoCopiarListadoActivosFijos;
	public Boolean isPermisoVerFormListadoActivosFijos;
	public Boolean isPermisoDuplicarListadoActivosFijos;
	public Boolean isPermisoOrdenListadoActivosFijos;
	
	
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
	
	public ListadoActivosFijosParameterReturnGeneral listadoactivosfijosReturnGeneral;
	public ListadoActivosFijosParameterReturnGeneral listadoactivosfijosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoListadoActivosFijos=false;
	public Boolean esParaAccionDesdeFormularioListadoActivosFijos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ListadoActivosFijosSessionBeanAdditional listadoactivosfijosSessionBeanAdditional=null;
	
	public ListadoActivosFijosSessionBeanAdditional getListadoActivosFijosSessionBeanAdditional() {
		return this.listadoactivosfijosSessionBeanAdditional;
	}
	
	public void setListadoActivosFijosSessionBeanAdditional(ListadoActivosFijosSessionBeanAdditional listadoactivosfijosSessionBeanAdditional) {
		try {
			this.listadoactivosfijosSessionBeanAdditional=listadoactivosfijosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ListadoActivosFijosBeanSwingJInternalFrameAdditional listadoactivosfijosBeanSwingJInternalFrameAdditional=null;
	//public class ListadoActivosFijosBeanSwingJInternalFrame
	
	public ListadoActivosFijosBeanSwingJInternalFrameAdditional getListadoActivosFijosBeanSwingJInternalFrameAdditional() {
		return this.listadoactivosfijosBeanSwingJInternalFrameAdditional;
	}
	
	public void setListadoActivosFijosBeanSwingJInternalFrameAdditional(ListadoActivosFijosBeanSwingJInternalFrameAdditional listadoactivosfijosBeanSwingJInternalFrameAdditional) {
		try {
			this.listadoactivosfijosBeanSwingJInternalFrameAdditional=listadoactivosfijosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ListadoActivosFijosLogic listadoactivosfijosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ListadoActivosFijos listadoactivosfijosBean;
	public ListadoActivosFijosConstantesFunciones listadoactivosfijosConstantesFunciones;
	//public ListadoActivosFijosParameterReturnGeneral listadoactivosfijosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<ListadoActivosFijos> listadoactivosfijoss;	
	//public List<ListadoActivosFijos> listadoactivosfijossEliminados;
	//public List<ListadoActivosFijos> listadoactivosfijossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoListadoActivosFijos=false;
	public Boolean isVisibilidadCeldaDuplicarListadoActivosFijos=true;
	public Boolean isVisibilidadCeldaCopiarListadoActivosFijos=true;
	public Boolean isVisibilidadCeldaVerFormListadoActivosFijos=true;
	public Boolean isVisibilidadCeldaOrdenListadoActivosFijos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesListadoActivosFijos=false;
	public Boolean isVisibilidadCeldaModificarListadoActivosFijos=false;
	public Boolean isVisibilidadCeldaActualizarListadoActivosFijos=false;
	public Boolean isVisibilidadCeldaEliminarListadoActivosFijos=false;
	public Boolean isVisibilidadCeldaCancelarListadoActivosFijos=false;
	public Boolean isVisibilidadCeldaGuardarListadoActivosFijos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosListadoActivosFijos=false;	
	
	
	public Boolean isVisibilidadBusquedaListadoActivosFijos=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoListadoActivosFijos() {
		return this.iIdNuevoListadoActivosFijos;
	}

	public void setiIdNuevoListadoActivosFijos(Long iIdNuevoListadoActivosFijos) {
		this.iIdNuevoListadoActivosFijos = iIdNuevoListadoActivosFijos;
	}
	
	public Long getidListadoActivosFijosActual() {
		return this.idListadoActivosFijosActual;
	}

	public void setidListadoActivosFijosActual(Long idListadoActivosFijosActual) {
		this.idListadoActivosFijosActual = idListadoActivosFijosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ListadoActivosFijos getlistadoactivosfijos() {
		return this.listadoactivosfijos;
	}

	public void setlistadoactivosfijos(ListadoActivosFijos listadoactivosfijos) {
		this.listadoactivosfijos = listadoactivosfijos;
	}
	
	public ListadoActivosFijos getlistadoactivosfijosAux() {
		return this.listadoactivosfijosAux;
	}

	public void setlistadoactivosfijosAux(ListadoActivosFijos listadoactivosfijosAux) {
		this.listadoactivosfijosAux = listadoactivosfijosAux;
	}				
	
	public ListadoActivosFijos getlistadoactivosfijosAnterior() {
		return this.listadoactivosfijosAnterior;
	}

	public void setlistadoactivosfijosAnterior(ListadoActivosFijos listadoactivosfijosAnterior) {
		this.listadoactivosfijosAnterior = listadoactivosfijosAnterior;
	}	
	
	public ListadoActivosFijos getlistadoactivosfijosTotales() {
		return this.listadoactivosfijosTotales;
	}

	public void setlistadoactivosfijosTotales(ListadoActivosFijos listadoactivosfijosTotales) {
		this.listadoactivosfijosTotales = listadoactivosfijosTotales;
	}	
	
	public ListadoActivosFijos getlistadoactivosfijosBean() {
		return this.listadoactivosfijosBean;
	}

	public void setlistadoactivosfijosBean(ListadoActivosFijos listadoactivosfijosBean) {
		this.listadoactivosfijosBean = listadoactivosfijosBean;
	}	
	
	public ListadoActivosFijosParameterReturnGeneral getlistadoactivosfijosReturnGeneral() {
		return this.listadoactivosfijosReturnGeneral;
	}

	public void setlistadoactivosfijosReturnGeneral(ListadoActivosFijosParameterReturnGeneral listadoactivosfijosReturnGeneral) {
		this.listadoactivosfijosReturnGeneral = listadoactivosfijosReturnGeneral;
	}	
	
	
	public Long idBusquedaListadoActivosFijos=0L;

	public Long getidBusquedaListadoActivosFijos() {
		return this.idBusquedaListadoActivosFijos;
	}

	public void setidBusquedaListadoActivosFijos(Long idBusquedaListadoActivosFijos) {
		this.idBusquedaListadoActivosFijos = idBusquedaListadoActivosFijos;
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
	
	
	public ListadoActivosFijosLogic getListadoActivosFijosLogic()	{		
		return listadoactivosfijosLogic;
	}

	public void setListadoActivosFijosLogic(ListadoActivosFijosLogic listadoactivosfijosLogic) {
		this.listadoactivosfijosLogic = listadoactivosfijosLogic;
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
	
	public Boolean getIsEsNuevoListadoActivosFijos() {
		return isEsNuevoListadoActivosFijos;
	}

	public void setIsEsNuevoListadoActivosFijos(Boolean isEsNuevoListadoActivosFijos) {
		this.isEsNuevoListadoActivosFijos = isEsNuevoListadoActivosFijos;
	}

	public Boolean getEsParaAccionDesdeFormularioListadoActivosFijos() {
		return esParaAccionDesdeFormularioListadoActivosFijos;
	}
	
	public void setEsParaAccionDesdeFormularioListadoActivosFijos(Boolean esParaAccionDesdeFormularioListadoActivosFijos) {
		this.esParaAccionDesdeFormularioListadoActivosFijos = esParaAccionDesdeFormularioListadoActivosFijos;
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

			if(this.listadoactivosfijosSessionBean==null) {
				this.listadoactivosfijosSessionBean=new ListadoActivosFijosSessionBean();
			}

			if(!this.listadoactivosfijosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(listadoactivosfijosSessionBean.getlidEmpresaActual());
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

					if(this.listadoactivosfijos!=null) {
						this.listadoactivosfijos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) {
						this.jInternalFrameDetalleFormListadoActivosFijos.jComboBoxid_empresaListadoActivosFijos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaListadoActivosFijos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) {
						if(this.jInternalFrameDetalleFormListadoActivosFijos.jComboBoxid_empresaListadoActivosFijos.getItemCount()>0) {
							this.jInternalFrameDetalleFormListadoActivosFijos.jComboBoxid_empresaListadoActivosFijos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaListadoActivosFijosGenerico)throws Exception
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
				jComboBoxid_empresaListadoActivosFijosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaListadoActivosFijosGenerico!=null && jComboBoxid_empresaListadoActivosFijosGenerico.getItemCount()>0) {
					jComboBoxid_empresaListadoActivosFijosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ListadoActivosFijos listadoactivosfijos,JComboBox jComboBoxid_empresaListadoActivosFijosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaListadoActivosFijosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormListadoActivosFijos.jComboBoxid_empresaListadoActivosFijos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaListadoActivosFijosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				listadoactivosfijos.setid_empresa(empresaAux.getId());
				listadoactivosfijos.setempresa_descripcion(ListadoActivosFijosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				listadoactivosfijos.setEmpresa(empresaAux);			}
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

					if(!ListadoActivosFijosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) { 
							this.jInternalFrameDetalleFormListadoActivosFijos.jComboBoxid_empresaListadoActivosFijos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormListadoActivosFijos.jComboBoxid_empresaListadoActivosFijos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) { 
					}

					if(!ListadoActivosFijosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) {
							this.jInternalFrameDetalleFormListadoActivosFijos.jComboBoxid_empresaListadoActivosFijos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) {
							this.jInternalFrameDetalleFormListadoActivosFijos.jComboBoxid_empresaListadoActivosFijos.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesListadoActivosFijos() throws Exception {
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
		
	public ListadoActivosFijosParameterReturnGeneral getListadoActivosFijosParameterGeneral() {
		return this.listadoactivosfijosParameterGeneral;
	}
	
	public void setListadoActivosFijosParameterGeneral(ListadoActivosFijosParameterReturnGeneral listadoactivosfijosParameterGeneral) {
		this.listadoactivosfijosParameterGeneral = listadoactivosfijosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoListadoActivosFijos() {
		return isPermisoTodoListadoActivosFijos;
	}

	public void setIsPermisoTodoListadoActivosFijos(Boolean isPermisoTodoListadoActivosFijos) {
		this.isPermisoTodoListadoActivosFijos = isPermisoTodoListadoActivosFijos;
	}

	public Boolean getIsPermisoNuevoListadoActivosFijos() {
		return isPermisoNuevoListadoActivosFijos;
	}

	public void setIsPermisoNuevoListadoActivosFijos(Boolean isPermisoNuevoListadoActivosFijos) {
		this.isPermisoNuevoListadoActivosFijos = isPermisoNuevoListadoActivosFijos;
	}

	public Boolean getIsPermisoActualizarListadoActivosFijos() {
		return isPermisoActualizarListadoActivosFijos;
	}

	public void setIsPermisoActualizarListadoActivosFijos(Boolean isPermisoActualizarListadoActivosFijos) {
		this.isPermisoActualizarListadoActivosFijos = isPermisoActualizarListadoActivosFijos;
	}

	public Boolean getIsPermisoEliminarListadoActivosFijos() {
		return isPermisoEliminarListadoActivosFijos;
	}

	public void setIsPermisoEliminarListadoActivosFijos(Boolean isPermisoEliminarListadoActivosFijos) {
		this.isPermisoEliminarListadoActivosFijos = isPermisoEliminarListadoActivosFijos;
	}

	public Boolean getIsPermisoGuardarCambiosListadoActivosFijos() {
		return isPermisoGuardarCambiosListadoActivosFijos;
	}

	public void setIsPermisoGuardarCambiosListadoActivosFijos(Boolean isPermisoGuardarCambiosListadoActivosFijos) {
		this.isPermisoGuardarCambiosListadoActivosFijos = isPermisoGuardarCambiosListadoActivosFijos;
	}
	
	public Boolean getIsPermisoConsultaListadoActivosFijos() {
		return isPermisoConsultaListadoActivosFijos;
	}

	public void setIsPermisoConsultaListadoActivosFijos(Boolean isPermisoConsultaListadoActivosFijos) {
		this.isPermisoConsultaListadoActivosFijos = isPermisoConsultaListadoActivosFijos;
	}

	public Boolean getIsPermisoBusquedaListadoActivosFijos() {
		return isPermisoBusquedaListadoActivosFijos;
	}

	public void setIsPermisoBusquedaListadoActivosFijos(Boolean isPermisoBusquedaListadoActivosFijos) {
		this.isPermisoBusquedaListadoActivosFijos = isPermisoBusquedaListadoActivosFijos;
	}

	public Boolean getIsPermisoReporteListadoActivosFijos() {
		return isPermisoReporteListadoActivosFijos;
	}

	public void setIsPermisoReporteListadoActivosFijos(Boolean isPermisoReporteListadoActivosFijos) {
		this.isPermisoReporteListadoActivosFijos = isPermisoReporteListadoActivosFijos;
	}
	
	public Boolean getIsPermisoPaginacionMedioListadoActivosFijos() {
		return isPermisoPaginacionMedioListadoActivosFijos;
	}

	public void setIsPermisoPaginacionMedioListadoActivosFijos(Boolean isPermisoPaginacionMedioListadoActivosFijos) {
		this.isPermisoPaginacionMedioListadoActivosFijos = isPermisoPaginacionMedioListadoActivosFijos;
	}
	
	public Boolean getIsPermisoPaginacionTodoListadoActivosFijos() {
		return isPermisoPaginacionTodoListadoActivosFijos;
	}

	public void setIsPermisoPaginacionTodoListadoActivosFijos(Boolean isPermisoPaginacionTodoListadoActivosFijos) {
		this.isPermisoPaginacionTodoListadoActivosFijos = isPermisoPaginacionTodoListadoActivosFijos;
	}
	
	public Boolean getIsPermisoPaginacionAltoListadoActivosFijos() {
		return isPermisoPaginacionAltoListadoActivosFijos;
	}

	public void setIsPermisoPaginacionAltoListadoActivosFijos(Boolean isPermisoPaginacionAltoListadoActivosFijos) {
		this.isPermisoPaginacionAltoListadoActivosFijos = isPermisoPaginacionAltoListadoActivosFijos;
	}
	
	public Boolean getIsPermisoCopiarListadoActivosFijos() {
		return isPermisoCopiarListadoActivosFijos;
	}

	public void setIsPermisoCopiarListadoActivosFijos(Boolean isPermisoCopiarListadoActivosFijos) {
		this.isPermisoCopiarListadoActivosFijos = isPermisoCopiarListadoActivosFijos;
	}
	
	public Boolean getIsPermisoVerFormListadoActivosFijos() {
		return isPermisoVerFormListadoActivosFijos;
	}

	public void setIsPermisoVerFormListadoActivosFijos(Boolean isPermisoVerFormListadoActivosFijos) {
		this.isPermisoVerFormListadoActivosFijos = isPermisoVerFormListadoActivosFijos;
	}
	
	public Boolean getIsPermisoDuplicarListadoActivosFijos() {
		return isPermisoDuplicarListadoActivosFijos;
	}

	public void setIsPermisoDuplicarListadoActivosFijos(Boolean isPermisoDuplicarListadoActivosFijos) {
		this.isPermisoDuplicarListadoActivosFijos = isPermisoDuplicarListadoActivosFijos;
	}
	
	public Boolean getIsPermisoOrdenListadoActivosFijos() {
		return isPermisoOrdenListadoActivosFijos;
	}

	public void setIsPermisoOrdenListadoActivosFijos(Boolean isPermisoOrdenListadoActivosFijos) {
		this.isPermisoOrdenListadoActivosFijos = isPermisoOrdenListadoActivosFijos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoListadoActivosFijos() {
		return isVisibilidadCeldaNuevoListadoActivosFijos;
	}

	public void setIsVisibilidadCeldaNuevoListadoActivosFijos(Boolean isVisibilidadCeldaNuevoListadoActivosFijos) {
		this.isVisibilidadCeldaNuevoListadoActivosFijos = isVisibilidadCeldaNuevoListadoActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarListadoActivosFijos() {
		return isVisibilidadCeldaDuplicarListadoActivosFijos;
	}

	public void setIsVisibilidadCeldaDuplicarListadoActivosFijos(Boolean isVisibilidadCeldaDuplicarListadoActivosFijos) {
		this.isVisibilidadCeldaDuplicarListadoActivosFijos = isVisibilidadCeldaDuplicarListadoActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarListadoActivosFijos() {
		return isVisibilidadCeldaCopiarListadoActivosFijos;
	}

	public void setIsVisibilidadCeldaCopiarListadoActivosFijos(Boolean isVisibilidadCeldaCopiarListadoActivosFijos) {
		this.isVisibilidadCeldaCopiarListadoActivosFijos = isVisibilidadCeldaCopiarListadoActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormListadoActivosFijos() {
		return isVisibilidadCeldaVerFormListadoActivosFijos;
	}

	public void setIsVisibilidadCeldaVerFormListadoActivosFijos(Boolean isVisibilidadCeldaVerFormListadoActivosFijos) {
		this.isVisibilidadCeldaVerFormListadoActivosFijos = isVisibilidadCeldaVerFormListadoActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenListadoActivosFijos() {
		return isVisibilidadCeldaOrdenListadoActivosFijos;
	}

	public void setIsVisibilidadCeldaOrdenListadoActivosFijos(Boolean isVisibilidadCeldaOrdenListadoActivosFijos) {
		this.isVisibilidadCeldaOrdenListadoActivosFijos = isVisibilidadCeldaOrdenListadoActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesListadoActivosFijos() {
		return isVisibilidadCeldaNuevoRelacionesListadoActivosFijos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesListadoActivosFijos(Boolean isVisibilidadCeldaNuevoRelacionesListadoActivosFijos) {
		this.isVisibilidadCeldaNuevoRelacionesListadoActivosFijos = isVisibilidadCeldaNuevoRelacionesListadoActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarListadoActivosFijos() {
		return isVisibilidadCeldaModificarListadoActivosFijos;
	}

	public void setIsVisibilidadCeldaModificarListadoActivosFijos(Boolean isVisibilidadCeldaModificarListadoActivosFijos) {
		this.isVisibilidadCeldaModificarListadoActivosFijos = isVisibilidadCeldaModificarListadoActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarListadoActivosFijos() {
		return isVisibilidadCeldaActualizarListadoActivosFijos;
	}

	public void setIsVisibilidadCeldaActualizarListadoActivosFijos(Boolean isVisibilidadCeldaActualizarListadoActivosFijos) {
		this.isVisibilidadCeldaActualizarListadoActivosFijos = isVisibilidadCeldaActualizarListadoActivosFijos;
	}

	public Boolean getIsVisibilidadCeldaEliminarListadoActivosFijos() {
		return isVisibilidadCeldaEliminarListadoActivosFijos;
	}

	public void setIsVisibilidadCeldaEliminarListadoActivosFijos(Boolean isVisibilidadCeldaEliminarListadoActivosFijos) {
		this.isVisibilidadCeldaEliminarListadoActivosFijos = isVisibilidadCeldaEliminarListadoActivosFijos;
	}

	public Boolean getIsVisibilidadCeldaCancelarListadoActivosFijos() {
		return isVisibilidadCeldaCancelarListadoActivosFijos;
	}

	public void setIsVisibilidadCeldaCancelarListadoActivosFijos(Boolean isVisibilidadCeldaCancelarListadoActivosFijos) {
		this.isVisibilidadCeldaCancelarListadoActivosFijos = isVisibilidadCeldaCancelarListadoActivosFijos;
	}

	public Boolean getIsVisibilidadCeldaGuardarListadoActivosFijos() {
		return isVisibilidadCeldaGuardarListadoActivosFijos;
	}

	public void setIsVisibilidadCeldaGuardarListadoActivosFijos(Boolean isVisibilidadCeldaGuardarListadoActivosFijos) {
		this.isVisibilidadCeldaGuardarListadoActivosFijos = isVisibilidadCeldaGuardarListadoActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosListadoActivosFijos() {
		return isVisibilidadCeldaGuardarCambiosListadoActivosFijos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosListadoActivosFijos(Boolean isVisibilidadCeldaGuardarCambiosListadoActivosFijos) {
		this.isVisibilidadCeldaGuardarCambiosListadoActivosFijos = isVisibilidadCeldaGuardarCambiosListadoActivosFijos;
	}
		
	public ListadoActivosFijosSessionBean getlistadoactivosfijosSessionBean() {
		return this.listadoactivosfijosSessionBean;
	}
	
	public void setlistadoactivosfijosSessionBean(ListadoActivosFijosSessionBean listadoactivosfijosSessionBean) {
		this.listadoactivosfijosSessionBean=listadoactivosfijosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaListadoActivosFijos() {
		return this.isVisibilidadBusquedaListadoActivosFijos;
	}

	public void setisVisibilidadBusquedaListadoActivosFijos(Boolean isVisibilidadBusquedaListadoActivosFijos) {
		this.isVisibilidadBusquedaListadoActivosFijos=isVisibilidadBusquedaListadoActivosFijos;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysListadoActivosFijos(ListadoActivosFijos listadoactivosfijos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(listadoactivosfijos,null);
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
	
	public void bugActualizarReferenciaActual(ListadoActivosFijos listadoactivosfijos,ListadoActivosFijos listadoactivosfijosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalListadoActivosFijos(listadoactivosfijos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		listadoactivosfijosAux.setId(listadoactivosfijos.getId());
		listadoactivosfijosAux.setVersionRow(listadoactivosfijos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ListadoActivosFijos listadoactivosfijosLocal) throws Exception {
		
		if(this.listadoactivosfijosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ListadoActivosFijos listadoactivosfijosLocal) throws Exception {	
		if(this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				listadoactivosfijosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarListadoActivosFijosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosListadoActivosFijos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = listadoactivosfijosValidator.getInvalidValues(this.listadoactivosfijos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ListadoActivosFijos listadoactivosfijos,List<ListadoActivosFijos> listadoactivosfijoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(ListadoActivosFijos listadoactivosfijos,List<ListadoActivosFijos> listadoactivosfijoss) throws Exception {
		try	{			
			ListadoActivosFijosConstantesFunciones.actualizarSelectedLista(listadoactivosfijos,listadoactivosfijoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ListadoActivosFijos> listadoactivosfijossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				listadoactivosfijossLocal=this.listadoactivosfijosLogic.getListadoActivosFijoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				listadoactivosfijossLocal=this.listadoactivosfijoss;
			}
			//ARCHITECTURE
		
			for(ListadoActivosFijos listadoactivosfijosLocal:listadoactivosfijossLocal) {
				if(this.permiteMantenimiento(listadoactivosfijosLocal) && listadoactivosfijosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ListadoActivosFijosConstantesFunciones.getListadoActivosFijosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ListadoActivosFijosConstantesFunciones.CODIGOSUBGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoActivosFijos.jLabelcodigo_sub_grupoListadoActivosFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadoActivosFijosConstantesFunciones.NOMBRESUBGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoActivosFijos.jLabelnombre_sub_grupoListadoActivosFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadoActivosFijosConstantesFunciones.CODIGODETALLEGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoActivosFijos.jLabelcodigo_detalle_grupoListadoActivosFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadoActivosFijosConstantesFunciones.NOMBREDETALLEGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoActivosFijos.jLabelnombre_detalle_grupoListadoActivosFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadoActivosFijosConstantesFunciones.CLAVE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoActivosFijos.jLabelclaveListadoActivosFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadoActivosFijosConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoActivosFijos.jLabelnombreListadoActivosFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadoActivosFijosConstantesFunciones.FECHACOMPRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoActivosFijos.jLabelfecha_compraListadoActivosFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadoActivosFijosConstantesFunciones.VIDAUTIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoActivosFijos.jLabelvida_utilListadoActivosFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadoActivosFijosConstantesFunciones.COSTODECOMPRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoActivosFijos.jLabelcosto_de_compraListadoActivosFijos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadoActivosFijos.jLabelcodigo_sub_grupoListadoActivosFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadoActivosFijos.jLabelnombre_sub_grupoListadoActivosFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadoActivosFijos.jLabelcodigo_detalle_grupoListadoActivosFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadoActivosFijos.jLabelnombre_detalle_grupoListadoActivosFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadoActivosFijos.jLabelclaveListadoActivosFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadoActivosFijos.jLabelnombreListadoActivosFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadoActivosFijos.jLabelfecha_compraListadoActivosFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadoActivosFijos.jLabelvida_utilListadoActivosFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadoActivosFijos.jLabelcosto_de_compraListadoActivosFijos,"");
		
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
		this.iIdNuevoListadoActivosFijos--;	
		
		
		this.listadoactivosfijosAux=new ListadoActivosFijos();
		
		this.listadoactivosfijosAux.setId(this.iIdNuevoListadoActivosFijos);
		this.listadoactivosfijosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.listadoactivosfijosLogic.getListadoActivosFijoss().add(this.listadoactivosfijosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.listadoactivosfijoss.add(this.listadoactivosfijosAux);
		}
		//ARCHITECTURE
		
		this.listadoactivosfijos=this.listadoactivosfijosAux;
		
		if(ListadoActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioListadoActivosFijos(this.listadoactivosfijos);
			this.setVariablesObjetoActualToFormularioForeignKeyListadoActivosFijos(this.listadoactivosfijos);
		}
				
		//this.setDefaultControlesListadoActivosFijos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyListadoActivosFijos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyListadoActivosFijos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyListadoActivosFijos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualListadoActivosFijos(this.listadoactivosfijosBean,this.listadoactivosfijos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysListadoActivosFijos(this.listadoactivosfijos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanListadoActivosFijos(this.listadoactivosfijosReturnGeneral,this.listadoactivosfijosBean,false);
		
		if(this.listadoactivosfijosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyListadoActivosFijos(this.listadoactivosfijosReturnGeneral.getListadoActivosFijos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioListadoActivosFijos(this.listadoactivosfijosReturnGeneral.getListadoActivosFijos());
		}
		
		if(this.listadoactivosfijosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioListadoActivosFijos(this.listadoactivosfijosReturnGeneral.getListadoActivosFijos(),classes);//this.listadoactivosfijosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualListadoActivosFijos(this.listadoactivosfijos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyListadoActivosFijos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyListadoActivosFijos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ListadoActivosFijosBeanSwingJInternalFrameAdditional.RecargarFormListadoActivosFijos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingListadoActivosFijos(false);
						
			if(listadoactivosfijosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ListadoActivosFijosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualListadoActivosFijos();
			}
			
			this.actualizarVisualTableDatosListadoActivosFijos();
			
			this.jTableDatosListadoActivosFijos.setRowSelectionInterval(this.getIndiceNuevoListadoActivosFijos(), this.getIndiceNuevoListadoActivosFijos());
			
			this.seleccionarFilaTablaListadoActivosFijosActual();
						
			this.actualizarEstadoCeldasBotonesListadoActivosFijos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesListadoActivosFijos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldcodigo_sub_grupoListadoActivosFijos.setEnabled(isHabilitar && this.listadoactivosfijosConstantesFunciones.activarcodigo_sub_grupoListadoActivosFijos);
		this.jInternalFrameDetalleFormListadoActivosFijos.jTextAreanombre_sub_grupoListadoActivosFijos.setEnabled(isHabilitar && this.listadoactivosfijosConstantesFunciones.activarnombre_sub_grupoListadoActivosFijos);
		this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldcodigo_detalle_grupoListadoActivosFijos.setEnabled(isHabilitar && this.listadoactivosfijosConstantesFunciones.activarcodigo_detalle_grupoListadoActivosFijos);
		this.jInternalFrameDetalleFormListadoActivosFijos.jTextAreanombre_detalle_grupoListadoActivosFijos.setEnabled(isHabilitar && this.listadoactivosfijosConstantesFunciones.activarnombre_detalle_grupoListadoActivosFijos);
		this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldclaveListadoActivosFijos.setEnabled(isHabilitar && this.listadoactivosfijosConstantesFunciones.activarclaveListadoActivosFijos);
		this.jInternalFrameDetalleFormListadoActivosFijos.jTextAreanombreListadoActivosFijos.setEnabled(isHabilitar && this.listadoactivosfijosConstantesFunciones.activarnombreListadoActivosFijos);
		this.jInternalFrameDetalleFormListadoActivosFijos.jDateChooserfecha_compraListadoActivosFijos.setEnabled(isHabilitar && this.listadoactivosfijosConstantesFunciones.activarfecha_compraListadoActivosFijos);
		this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldvida_utilListadoActivosFijos.setEnabled(isHabilitar && this.listadoactivosfijosConstantesFunciones.activarvida_utilListadoActivosFijos);
		this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldcosto_de_compraListadoActivosFijos.setEnabled(isHabilitar && this.listadoactivosfijosConstantesFunciones.activarcosto_de_compraListadoActivosFijos);	
		//
		this.jInternalFrameDetalleFormListadoActivosFijos.jComboBoxid_empresaListadoActivosFijos.setEnabled(isHabilitar && this.listadoactivosfijosConstantesFunciones.activarid_empresaListadoActivosFijos);
	};
	
	public void setDefaultControlesListadoActivosFijos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoListadoActivosFijos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.listadoactivosfijosSessionBean.setConGuardarRelaciones(true);			
			this.listadoactivosfijosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormListadoActivosFijos.jTabbedPaneRelacionesListadoActivosFijos.setVisible(true);
			
					
		} else {
			//this.listadoactivosfijosSessionBean.setConGuardarRelaciones(false);			
			this.listadoactivosfijosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormListadoActivosFijos.jTabbedPaneRelacionesListadoActivosFijos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoListadoActivosFijos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadoActivosFijos listadoactivosfijosAux:this.listadoactivosfijosLogic.getListadoActivosFijoss()) {
				if(listadoactivosfijosAux.getId().equals(this.iIdNuevoListadoActivosFijos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadoActivosFijos listadoactivosfijosAux:this.listadoactivosfijoss) {
				if(listadoactivosfijosAux.getId().equals(this.iIdNuevoListadoActivosFijos)) {
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
	
	public int getIndiceActualListadoActivosFijos(ListadoActivosFijos listadoactivosfijos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadoActivosFijos listadoactivosfijosAux:this.listadoactivosfijosLogic.getListadoActivosFijoss()) {
				if(listadoactivosfijosAux.getId().equals(listadoactivosfijos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadoActivosFijos listadoactivosfijosAux:this.listadoactivosfijoss) {
				if(listadoactivosfijosAux.getId().equals(listadoactivosfijos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalListadoActivosFijos(ListadoActivosFijos listadoactivosfijosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadoActivosFijos listadoactivosfijosAux:this.listadoactivosfijosLogic.getListadoActivosFijoss()) {
				if(listadoactivosfijosAux.getListadoActivosFijosOriginal().getId().equals(listadoactivosfijosOriginal.getId())) {
					existe=true;
					listadoactivosfijosOriginal.setId(listadoactivosfijosAux.getId());
					listadoactivosfijosOriginal.setVersionRow(listadoactivosfijosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadoActivosFijos listadoactivosfijosAux:this.listadoactivosfijoss) {
				if(listadoactivosfijosAux.getListadoActivosFijosOriginal().getId().equals(listadoactivosfijosOriginal.getId())) {
					existe=true;
					listadoactivosfijosOriginal.setId(listadoactivosfijosAux.getId());
					listadoactivosfijosOriginal.setVersionRow(listadoactivosfijosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosListadoActivosFijos(Boolean esParaCancelar) throws Exception {
		listadoactivosfijossAux=new ArrayList<ListadoActivosFijos>();
		listadoactivosfijosAux=new ListadoActivosFijos();
		
		if(!this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ListadoActivosFijos listadoactivosfijosAux:this.listadoactivosfijosLogic.getListadoActivosFijoss()) {
					if(listadoactivosfijosAux.getId()<0) {
						listadoactivosfijossAux.add(listadoactivosfijosAux);
					}		
				}
				this.iIdNuevoListadoActivosFijos=0L;
				this.listadoactivosfijosLogic.getListadoActivosFijoss().removeAll(listadoactivosfijossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadoActivosFijos listadoactivosfijosAux:this.listadoactivosfijoss) {
					if(listadoactivosfijosAux.getId()<0) {
						listadoactivosfijossAux.add(listadoactivosfijosAux);
					}		
				}
				this.iIdNuevoListadoActivosFijos=0L;
				this.listadoactivosfijoss.removeAll(listadoactivosfijossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoListadoActivosFijos 
					&& this.listadoactivosfijosLogic.getListadoActivosFijoss().size()>0
					) {
					listadoactivosfijosAux=this.listadoactivosfijosLogic.getListadoActivosFijoss().get(this.listadoactivosfijosLogic.getListadoActivosFijoss().size() - 1);
				
					if(listadoactivosfijosAux.getId()<0) {
						this.listadoactivosfijosLogic.getListadoActivosFijoss().remove(listadoactivosfijosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoListadoActivosFijos && this.listadoactivosfijoss.size()>0) {
					listadoactivosfijosAux=this.listadoactivosfijoss.get(this.listadoactivosfijoss.size() - 1);
				
					if(listadoactivosfijosAux.getId()<0) {
						this.listadoactivosfijoss.remove(listadoactivosfijosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoListadoActivosFijos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(listadoactivosfijos.getId()<0) {
				this.listadoactivosfijosLogic.getListadoActivosFijoss().remove(this.listadoactivosfijos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(listadoactivosfijos.getId()<0) {
				this.listadoactivosfijoss.remove(this.listadoactivosfijos);
			}
		}			
	}
	
	public void setEstadosInicialesListadoActivosFijos(List<ListadoActivosFijos> listadoactivosfijossAux) throws Exception {
		ListadoActivosFijosConstantesFunciones.setEstadosInicialesListadoActivosFijos(listadoactivosfijossAux);
	}
	
	public void setEstadosInicialesListadoActivosFijos(ListadoActivosFijos listadoactivosfijosAux) throws Exception {
		ListadoActivosFijosConstantesFunciones.setEstadosInicialesListadoActivosFijos(listadoactivosfijosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarListadoActivosFijosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesListadoActivosFijos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarListadoActivosFijosActual()) {
				if(!this.isEsNuevoListadoActivosFijos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesListadoActivosFijos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoListadoActivosFijos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarListadoActivosFijosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Listado Activos Fijos ?", "MANTENIMIENTO DE Listado Activos Fijos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesListadoActivosFijos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ListadoActivosFijos listadoactivosfijos) throws Exception {
		ListadoActivosFijosConstantesFunciones.seleccionarAsignar(this.listadoactivosfijos,listadoactivosfijos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarListadoActivosFijos=this.isPermisoActualizarOriginalListadoActivosFijos;
			
			
			this.seleccionarAsignar(listadoactivosfijos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesListadoActivosFijos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.listadoactivosfijosSessionBean.setsFuncionBusquedaRapida(this.listadoactivosfijosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoListadoActivosFijos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosListadoActivosFijos(esParaCancelar);				
				this.cancelarNuevoListadoActivosFijos(esParaCancelar);								
			}
			
			this.listadoactivosfijos=new ListadoActivosFijos();
			
			this.inicializarListadoActivosFijos();
			
			this.actualizarEstadoCeldasBotonesListadoActivosFijos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarListadoActivosFijos() throws Exception {
		try {
			ListadoActivosFijosConstantesFunciones.inicializarListadoActivosFijos(this.listadoactivosfijos);
			
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
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.listadoactivosfijosLogic.getListadoActivosFijoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteListadoActivosFijoss(String sAccionBusqueda,List<ListadoActivosFijos> listadoactivosfijossParaReportes) throws Exception {
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
					sPathReporteFinal="ListadoActivosFijos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ListadoActivosFijosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ListadoActivosFijosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ListadoActivosFijos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Listado Activos Fijoses");		
		parameters.put("busquedapor", ListadoActivosFijosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceListadoActivosFijos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ListadoActivosFijosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ListadoActivosFijosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceListadoActivosFijos=new JRBeanArrayDataSource(ListadoActivosFijosJInternalFrame.TraerListadoActivosFijosBeans(listadoactivosfijossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceListadoActivosFijos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ListadoActivosFijosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ListadoActivosFijosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ListadoActivosFijosBean.TraerListadoActivosFijosBeans(listadoactivosfijossParaReportes).toArray()));
							
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
				this.generarExcelReporteListadoActivosFijoss(sAccionBusqueda,sTipoArchivoReporte,listadoactivosfijossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalListadoActivosFijoss(sAccionBusqueda,sTipoArchivoReporte,listadoactivosfijossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoListadoActivosFijosActionPerformed(null);
					//this.generarExcelReporteListadoActivosFijoss(sAccionBusqueda,sTipoArchivoReporte,listadoactivosfijossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalListadoActivosFijoss(sAccionBusqueda,sTipoArchivoReporte,listadoactivosfijossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesListadoActivosFijoss(sAccionBusqueda,sTipoArchivoReporte,listadoactivosfijossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesListadoActivosFijoss(sAccionBusqueda,sTipoArchivoReporte,listadoactivosfijossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteListadoActivosFijoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ListadoActivosFijos> listadoactivosfijossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadoactivosfijos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ListadoActivosFijoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderListadoActivosFijos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ListadoActivosFijos listadoactivosfijos : listadoactivosfijossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ListadoActivosFijosConstantesFunciones.generarExcelReporteDataListadoActivosFijos("NORMAL",row,workbook,listadoactivosfijos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listado Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderListadoActivosFijos(String sTipo,Row row,Workbook workbook) {
		
		ListadoActivosFijosConstantesFunciones.generarExcelReporteHeaderListadoActivosFijos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalListadoActivosFijoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ListadoActivosFijos> listadoactivosfijossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadoactivosfijos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ListadoActivosFijoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ListadoActivosFijos listadoactivosfijos : listadoactivosfijossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ListadoActivosFijosConstantesFunciones.getListadoActivosFijosDescripcion(listadoactivosfijos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoActivosFijosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadoactivosfijos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadoactivosfijos.getcodigo_sub_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadoactivosfijos.getnombre_sub_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadoactivosfijos.getcodigo_detalle_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadoactivosfijos.getnombre_detalle_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoActivosFijosConstantesFunciones.LABEL_CLAVE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_CLAVE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadoactivosfijos.getclave());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoActivosFijosConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadoactivosfijos.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoActivosFijosConstantesFunciones.LABEL_FECHACOMPRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_FECHACOMPRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadoactivosfijos.getfecha_compra());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoActivosFijosConstantesFunciones.LABEL_VIDAUTIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_VIDAUTIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadoactivosfijos.getvida_util());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadoActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadoactivosfijos.getcosto_de_compra());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listado Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesListadoActivosFijoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ListadoActivosFijos> listadoactivosfijossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ListadoActivosFijos> listadoactivosfijossRespaldo=null;
		
		classes=ListadoActivosFijosConstantesFunciones.getClassesRelationshipsOfListadoActivosFijos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.listadoactivosfijosLogic.setDatosCliente(this.datosCliente);
		this.listadoactivosfijosLogic.setDatosDeep(this.datosDeep);
		this.listadoactivosfijosLogic.setIsConDeep(true);
		
		listadoactivosfijossRespaldo=this.listadoactivosfijosLogic.getListadoActivosFijoss();
		
		this.listadoactivosfijosLogic.setListadoActivosFijoss(listadoactivosfijossParaReportes);	
		this.listadoactivosfijosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		listadoactivosfijossParaReportes=this.listadoactivosfijosLogic.getListadoActivosFijoss();
		this.listadoactivosfijosLogic.setListadoActivosFijoss(listadoactivosfijossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadoactivosfijos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ListadoActivosFijoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderListadoActivosFijos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ListadoActivosFijos listadoactivosfijos : listadoactivosfijossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderListadoActivosFijos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ListadoActivosFijosConstantesFunciones.generarExcelReporteDataListadoActivosFijos("NORMAL",row,workbook,listadoactivosfijos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ListadoActivosFijosConstantesFunciones.getListadoActivosFijosDescripcion(listadoactivosfijos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listado Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoListadoActivosFijos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadoActivosFijos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoListadoActivosFijos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadoActivosFijos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessListadoActivosFijos() throws Exception {		
		this.startProcessListadoActivosFijos(true);
	}
	
	public void startProcessListadoActivosFijos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasListadoActivosFijos ,this.jPanelParametrosReportesListadoActivosFijos, this.jScrollPanelDatosListadoActivosFijos,this.jPanelPaginacionListadoActivosFijos, this.jScrollPanelDatosEdicionListadoActivosFijos, this.jPanelAccionesListadoActivosFijos,this.jPanelAccionesFormularioListadoActivosFijos,this.jmenuBarListadoActivosFijos,this.jmenuBarDetalleListadoActivosFijos,this.jTtoolBarListadoActivosFijos,this.jTtoolBarDetalleListadoActivosFijos);		
		
		final JTabbedPane jTabbedPaneBusquedasListadoActivosFijos=this.jTabbedPaneBusquedasListadoActivosFijos; 
		
		final JPanel jPanelParametrosReportesListadoActivosFijos=this.jPanelParametrosReportesListadoActivosFijos;
		//final JScrollPane jScrollPanelDatosListadoActivosFijos=this.jScrollPanelDatosListadoActivosFijos;
		final JTable jTableDatosListadoActivosFijos=this.jTableDatosListadoActivosFijos;		
		final JPanel jPanelPaginacionListadoActivosFijos=this.jPanelPaginacionListadoActivosFijos;
		//final JScrollPane jScrollPanelDatosEdicionListadoActivosFijos=this.jScrollPanelDatosEdicionListadoActivosFijos;
		final JPanel jPanelAccionesListadoActivosFijos=this.jPanelAccionesListadoActivosFijos;
		
		JPanel jPanelCamposAuxiliarListadoActivosFijos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarListadoActivosFijos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) {
			jPanelCamposAuxiliarListadoActivosFijos=this.jInternalFrameDetalleFormListadoActivosFijos.jPanelCamposListadoActivosFijos;
			jPanelAccionesFormularioAuxiliarListadoActivosFijos=this.jInternalFrameDetalleFormListadoActivosFijos.jPanelAccionesFormularioListadoActivosFijos;
		}
		
		final JPanel jPanelCamposListadoActivosFijos=jPanelCamposAuxiliarListadoActivosFijos;
		final JPanel jPanelAccionesFormularioListadoActivosFijos=jPanelAccionesFormularioAuxiliarListadoActivosFijos;
		
		
		final JMenuBar jmenuBarListadoActivosFijos=this.jmenuBarListadoActivosFijos;
		final JToolBar jTtoolBarListadoActivosFijos=this.jTtoolBarListadoActivosFijos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarListadoActivosFijos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarListadoActivosFijos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) {
			jmenuBarDetalleAuxiliarListadoActivosFijos=this.jInternalFrameDetalleFormListadoActivosFijos.jmenuBarDetalleListadoActivosFijos;
			jTtoolBarDetalleAuxiliarListadoActivosFijos=this.jInternalFrameDetalleFormListadoActivosFijos.jTtoolBarDetalleListadoActivosFijos;
		}
		
		final JMenuBar jmenuBarDetalleListadoActivosFijos=jmenuBarDetalleAuxiliarListadoActivosFijos;
		final JToolBar jTtoolBarDetalleListadoActivosFijos=jTtoolBarDetalleAuxiliarListadoActivosFijos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasListadoActivosFijos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesListadoActivosFijos;
			processRunnable.jTableDatos=jTableDatosListadoActivosFijos;
			processRunnable.jPanelCampos=jPanelCamposListadoActivosFijos;
			processRunnable.jPanelPaginacion=jPanelPaginacionListadoActivosFijos;
			processRunnable.jPanelAcciones=jPanelAccionesListadoActivosFijos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioListadoActivosFijos;
			
			
			processRunnable.jmenuBar=jmenuBarListadoActivosFijos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleListadoActivosFijos;
			processRunnable.jTtoolBar=jTtoolBarListadoActivosFijos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleListadoActivosFijos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasListadoActivosFijos ,jPanelParametrosReportesListadoActivosFijos,jTableDatosListadoActivosFijos, /*jScrollPanelDatosListadoActivosFijos,*/jPanelCamposListadoActivosFijos,jPanelPaginacionListadoActivosFijos, /*jScrollPanelDatosEdicionListadoActivosFijos,*/ jPanelAccionesListadoActivosFijos,jPanelAccionesFormularioListadoActivosFijos,jmenuBarListadoActivosFijos,jmenuBarDetalleListadoActivosFijos,jTtoolBarListadoActivosFijos,jTtoolBarDetalleListadoActivosFijos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasListadoActivosFijos ,jPanelParametrosReportesListadoActivosFijos, jScrollPanelDatosListadoActivosFijos,jPanelPaginacionListadoActivosFijos, jScrollPanelDatosEdicionListadoActivosFijos, jPanelAccionesListadoActivosFijos,jPanelAccionesFormularioListadoActivosFijos,jmenuBarListadoActivosFijos,jmenuBarDetalleListadoActivosFijos,jTtoolBarListadoActivosFijos,jTtoolBarDetalleListadoActivosFijos);
						
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
	
	public void finishProcessListadoActivosFijos() {// throws Exception 
		this.finishProcessListadoActivosFijos(true);
	}
	
	public void finishProcessListadoActivosFijos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasListadoActivosFijos ,this.jPanelParametrosReportesListadoActivosFijos, this.jScrollPanelDatosListadoActivosFijos,this.jPanelPaginacionListadoActivosFijos, this.jScrollPanelDatosEdicionListadoActivosFijos, this.jPanelAccionesListadoActivosFijos,this.jPanelAccionesFormularioListadoActivosFijos,this.jmenuBarListadoActivosFijos,this.jmenuBarDetalleListadoActivosFijos,this.jTtoolBarListadoActivosFijos,this.jTtoolBarDetalleListadoActivosFijos);		
		
		final JTabbedPane jTabbedPaneBusquedasListadoActivosFijos=this.jTabbedPaneBusquedasListadoActivosFijos; 
		
		final JPanel jPanelParametrosReportesListadoActivosFijos=this.jPanelParametrosReportesListadoActivosFijos;
		//final JScrollPane jScrollPanelDatosListadoActivosFijos=this.jScrollPanelDatosListadoActivosFijos;
		final JTable jTableDatosListadoActivosFijos=this.jTableDatosListadoActivosFijos;		
		final JPanel jPanelPaginacionListadoActivosFijos=this.jPanelPaginacionListadoActivosFijos;
		//final JScrollPane jScrollPanelDatosEdicionListadoActivosFijos=this.jScrollPanelDatosEdicionListadoActivosFijos;
		final JPanel jPanelAccionesListadoActivosFijos=this.jPanelAccionesListadoActivosFijos;
		
		JPanel jPanelCamposAuxiliarListadoActivosFijos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarListadoActivosFijos=new JPanel();
		
		if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) {
			jPanelCamposAuxiliarListadoActivosFijos=this.jInternalFrameDetalleFormListadoActivosFijos.jPanelCamposListadoActivosFijos;
			jPanelAccionesFormularioAuxiliarListadoActivosFijos=this.jInternalFrameDetalleFormListadoActivosFijos.jPanelAccionesFormularioListadoActivosFijos;
		}
		
		final JPanel jPanelCamposListadoActivosFijos=jPanelCamposAuxiliarListadoActivosFijos;
		final JPanel jPanelAccionesFormularioListadoActivosFijos=jPanelAccionesFormularioAuxiliarListadoActivosFijos;
		
		
		final JMenuBar jmenuBarListadoActivosFijos=this.jmenuBarListadoActivosFijos;		
		final JToolBar jTtoolBarListadoActivosFijos=this.jTtoolBarListadoActivosFijos;
				
		JMenuBar jmenuBarDetalleAuxiliarListadoActivosFijos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarListadoActivosFijos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) {
			jmenuBarDetalleAuxiliarListadoActivosFijos=this.jInternalFrameDetalleFormListadoActivosFijos.jmenuBarDetalleListadoActivosFijos;
			jTtoolBarDetalleAuxiliarListadoActivosFijos=this.jInternalFrameDetalleFormListadoActivosFijos.jTtoolBarDetalleListadoActivosFijos;		
		}
		
		final JMenuBar jmenuBarDetalleListadoActivosFijos=jmenuBarDetalleAuxiliarListadoActivosFijos;
		final JToolBar jTtoolBarDetalleListadoActivosFijos=jTtoolBarDetalleAuxiliarListadoActivosFijos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasListadoActivosFijos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesListadoActivosFijos;
			processRunnable.jTableDatos=jTableDatosListadoActivosFijos;
			processRunnable.jPanelCampos=jPanelCamposListadoActivosFijos;
			processRunnable.jPanelPaginacion=jPanelPaginacionListadoActivosFijos;
			processRunnable.jPanelAcciones=jPanelAccionesListadoActivosFijos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioListadoActivosFijos;
			
			
			processRunnable.jmenuBar=jmenuBarListadoActivosFijos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleListadoActivosFijos;
			processRunnable.jTtoolBar=jTtoolBarListadoActivosFijos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleListadoActivosFijos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasListadoActivosFijos ,jPanelParametrosReportesListadoActivosFijos, jTableDatosListadoActivosFijos,/*jScrollPanelDatosListadoActivosFijos,*/jPanelCamposListadoActivosFijos,jPanelPaginacionListadoActivosFijos, /*jScrollPanelDatosEdicionListadoActivosFijos,*/ jPanelAccionesListadoActivosFijos,jPanelAccionesFormularioListadoActivosFijos,jmenuBarListadoActivosFijos,jmenuBarDetalleListadoActivosFijos,jTtoolBarListadoActivosFijos,jTtoolBarDetalleListadoActivosFijos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesListadoActivosFijos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarListadoActivosFijos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuListadoActivosFijos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarListadoActivosFijos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarListadoActivosFijos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleListadoActivosFijos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuListadoActivosFijos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarListadoActivosFijos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleListadoActivosFijos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.listadoactivosfijosConstantesFunciones.getsFinalQueryListadoActivosFijos();
		String  finalQueryPaginacionTodos=this.listadoactivosfijosConstantesFunciones.getsFinalQueryListadoActivosFijos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ListadoActivosFijosConstantesFunciones.getArrayColumnasGlobalesNoListadoActivosFijos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ListadoActivosFijosConstantesFunciones.getArrayColumnasGlobalesListadoActivosFijos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ListadoActivosFijosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.listadoactivosfijossEliminados= new ArrayList<ListadoActivosFijos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessListadoActivosFijos();
		
				///*ListadoActivosFijosSessionBean*/this.listadoactivosfijosSessionBean=new ListadoActivosFijosSessionBean();
			
			if(this.listadoactivosfijosSessionBean==null) {
				this.listadoactivosfijosSessionBean=new ListadoActivosFijosSessionBean();
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
					this.iNumeroPaginacion=ListadoActivosFijosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ListadoActivosFijosConstantesFunciones.getClassesForeignKeysOfListadoActivosFijos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/listadoactivosfijos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			listadoactivosfijossAux= new ArrayList<ListadoActivosFijos>();
			
				
			listadoactivosfijosLogic.setDatosCliente(this.datosCliente);
			listadoactivosfijosLogic.setDatosDeep(this.datosDeep);
			listadoactivosfijosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaListadoActivosFijos")) {
				this.sDetalleReporte=ListadoActivosFijosConstantesFunciones.getDetalleIndiceBusquedaListadoActivosFijos(idBusquedaListadoActivosFijos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					listadoactivosfijosLogic.getListadoActivosFijossBusquedaListadoActivosFijos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaListadoActivosFijos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ListadoActivosFijosConstantesFunciones.getDetalleIndiceBusquedaListadoActivosFijos(idBusquedaListadoActivosFijos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ListadoActivosFijosConstantesFunciones.getDetalleIndiceBusquedaListadoActivosFijos(idBusquedaListadoActivosFijos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=listadoactivosfijosLogic.getListadoActivosFijoss()==null||listadoactivosfijosLogic.getListadoActivosFijoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=listadoactivosfijoss==null|| listadoactivosfijoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						listadoactivosfijossAux=new ArrayList<ListadoActivosFijos>();
						listadoactivosfijossAux.addAll(listadoactivosfijosLogic.getListadoActivosFijoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							listadoactivosfijossAux=new ArrayList<ListadoActivosFijos>();
							listadoactivosfijossAux.addAll(listadoactivosfijoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							listadoactivosfijosLogic.getListadoActivosFijossBusquedaListadoActivosFijos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaListadoActivosFijos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ListadoActivosFijosConstantesFunciones.getDetalleIndiceBusquedaListadoActivosFijos(idBusquedaListadoActivosFijos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ListadoActivosFijosConstantesFunciones.getDetalleIndiceBusquedaListadoActivosFijos(idBusquedaListadoActivosFijos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteListadoActivosFijoss("BusquedaListadoActivosFijos",listadoactivosfijosLogic.getListadoActivosFijoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteListadoActivosFijoss("BusquedaListadoActivosFijos",listadoactivosfijoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						listadoactivosfijosLogic.setListadoActivosFijoss(new ArrayList<ListadoActivosFijos>());
						listadoactivosfijosLogic.getListadoActivosFijoss().addAll(listadoactivosfijossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							listadoactivosfijoss=new ArrayList<ListadoActivosFijos>();
							listadoactivosfijoss.addAll(listadoactivosfijossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesListadoActivosFijos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessListadoActivosFijos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=listadoactivosfijosLogic.getListadoActivosFijoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=listadoactivosfijoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=listadoactivosfijosLogic.getListadoActivosFijoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=listadoactivosfijoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ListadoActivosFijos listadoactivosfijos) {
		Boolean permite=true;
		
		if(this.listadoactivosfijos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ListadoActivosFijosConstantesFunciones.getOrderByListaListadoActivosFijos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ListadoActivosFijosConstantesFunciones.getOrderByListaListadoActivosFijos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadoActivosFijos listadoactivosfijos:listadoactivosfijosLogic.getListadoActivosFijoss()) {
				if(listadoactivosfijos.getsType().equals(Constantes2.S_TOTALES)) {
					listadoactivosfijosTotales=listadoactivosfijos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadoActivosFijos listadoactivosfijos:this.listadoactivosfijoss) {
				if(listadoactivosfijos.getsType().equals(Constantes2.S_TOTALES)) {
					listadoactivosfijosTotales=listadoactivosfijos;
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
			this.listadoactivosfijosAux=new ListadoActivosFijos();
			this.listadoactivosfijosAux.setsType(Constantes2.S_TOTALES);
			this.listadoactivosfijosAux.setIsNew(false);
			this.listadoactivosfijosAux.setIsChanged(false);
			this.listadoactivosfijosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ListadoActivosFijosConstantesFunciones.TotalizarValoresFilaListadoActivosFijos(this.listadoactivosfijosLogic.getListadoActivosFijoss(),this.listadoactivosfijosAux);
				
				//this.listadoactivosfijosLogic.getListadoActivosFijoss().add(this.listadoactivosfijosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ListadoActivosFijosConstantesFunciones.TotalizarValoresFilaListadoActivosFijos(this.listadoactivosfijoss,this.listadoactivosfijosAux);
				
				this.listadoactivosfijoss.add(this.listadoactivosfijosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		listadoactivosfijosTotales=new ListadoActivosFijos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.listadoactivosfijosLogic.getListadoActivosFijoss().remove(listadoactivosfijosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.listadoactivosfijoss.remove(listadoactivosfijosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		listadoactivosfijosTotales=new ListadoActivosFijos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadoActivosFijos listadoactivosfijos:listadoactivosfijosLogic.getListadoActivosFijoss()) {
				if(listadoactivosfijos.getsType().equals(Constantes2.S_TOTALES)) {
					listadoactivosfijosTotales=listadoactivosfijos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ListadoActivosFijosConstantesFunciones.TotalizarValoresFilaListadoActivosFijos(this.listadoactivosfijosLogic.getListadoActivosFijoss(),listadoactivosfijosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadoActivosFijos listadoactivosfijos:this.listadoactivosfijoss) {
				if(listadoactivosfijos.getsType().equals(Constantes2.S_TOTALES)) {
					listadoactivosfijosTotales=listadoactivosfijos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ListadoActivosFijosConstantesFunciones.TotalizarValoresFilaListadoActivosFijos(this.listadoactivosfijoss,listadoactivosfijosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getListadoActivosFijossBusquedaListadoActivosFijos()throws Exception {
		try {
			sAccionBusqueda="BusquedaListadoActivosFijos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getListadoActivosFijossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getListadoActivosFijossBusquedaListadoActivosFijos(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//listadoactivosfijosLogic.getListadoActivosFijossBusquedaListadoActivosFijos(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getListadoActivosFijossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//listadoactivosfijosLogic.getListadoActivosFijossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosListadoActivosFijos() {
		this.isPermisoTodoListadoActivosFijos=false;
		this.isPermisoNuevoListadoActivosFijos=false;
		this.isPermisoActualizarListadoActivosFijos=false;
		this.isPermisoActualizarOriginalListadoActivosFijos=false;
		this.isPermisoEliminarListadoActivosFijos=false;
		this.isPermisoGuardarCambiosListadoActivosFijos=false;
		this.isPermisoConsultaListadoActivosFijos=true;
		this.isPermisoBusquedaListadoActivosFijos=true;
		this.isPermisoReporteListadoActivosFijos=true;
		this.isPermisoOrdenListadoActivosFijos=false;		
		this.isPermisoPaginacionMedioListadoActivosFijos=false;		
		this.isPermisoPaginacionAltoListadoActivosFijos=false;		
		this.isPermisoPaginacionTodoListadoActivosFijos=false;		
		this.isPermisoCopiarListadoActivosFijos=false;		
		this.isPermisoVerFormListadoActivosFijos=false;		
		this.isPermisoDuplicarListadoActivosFijos=false;
		this.isPermisoOrdenListadoActivosFijos=false;
	}
	
	public void setPermisosUsuarioListadoActivosFijos(Boolean isPermiso) {
		this.isPermisoTodoListadoActivosFijos=isPermiso;
		this.isPermisoNuevoListadoActivosFijos=isPermiso;
		this.isPermisoActualizarListadoActivosFijos=isPermiso;
		this.isPermisoActualizarOriginalListadoActivosFijos=isPermiso;
		this.isPermisoEliminarListadoActivosFijos=isPermiso;
		this.isPermisoGuardarCambiosListadoActivosFijos=isPermiso;
		this.isPermisoConsultaListadoActivosFijos=isPermiso;
		this.isPermisoBusquedaListadoActivosFijos=isPermiso;
		this.isPermisoReporteListadoActivosFijos=isPermiso;
		this.isPermisoOrdenListadoActivosFijos=isPermiso;		
		this.isPermisoPaginacionMedioListadoActivosFijos=isPermiso;		
		this.isPermisoPaginacionAltoListadoActivosFijos=isPermiso;		
		this.isPermisoPaginacionTodoListadoActivosFijos=isPermiso;		
		this.isPermisoCopiarListadoActivosFijos=isPermiso;		
		this.isPermisoVerFormListadoActivosFijos=isPermiso;		
		this.isPermisoDuplicarListadoActivosFijos=isPermiso;
		this.isPermisoOrdenListadoActivosFijos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioListadoActivosFijos(Boolean isPermiso) {
		//this.isPermisoTodoListadoActivosFijos=isPermiso;
		this.isPermisoNuevoListadoActivosFijos=isPermiso;
		this.isPermisoActualizarListadoActivosFijos=isPermiso;
		this.isPermisoActualizarOriginalListadoActivosFijos=isPermiso;
		this.isPermisoEliminarListadoActivosFijos=isPermiso;
		this.isPermisoGuardarCambiosListadoActivosFijos=isPermiso;
		//this.isPermisoConsultaListadoActivosFijos=isPermiso;
		//this.isPermisoBusquedaListadoActivosFijos=isPermiso;
		//this.isPermisoReporteListadoActivosFijos=isPermiso;
		//this.isPermisoOrdenListadoActivosFijos=isPermiso;		
		//this.isPermisoPaginacionMedioListadoActivosFijos=isPermiso;		
		//this.isPermisoPaginacionAltoListadoActivosFijos=isPermiso;		
		//this.isPermisoPaginacionTodoListadoActivosFijos=isPermiso;		
		//this.isPermisoCopiarListadoActivosFijos=isPermiso;		
		//this.isPermisoDuplicarListadoActivosFijos=isPermiso;
		//this.isPermisoOrdenListadoActivosFijos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioListadoActivosFijosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ListadoActivosFijosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebListadoActivosFijos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioListadoActivosFijosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioListadoActivosFijosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionListadoActivosFijosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioListadoActivosFijosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioListadoActivosFijos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ListadoActivosFijosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ListadoActivosFijosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoListadoActivosFijos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarListadoActivosFijos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalListadoActivosFijos=this.isPermisoActualizarListadoActivosFijos;
			this.isPermisoEliminarListadoActivosFijos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosListadoActivosFijos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaListadoActivosFijos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaListadoActivosFijos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoListadoActivosFijos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteListadoActivosFijos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenListadoActivosFijos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioListadoActivosFijos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoListadoActivosFijos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoListadoActivosFijos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarListadoActivosFijos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormListadoActivosFijos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarListadoActivosFijos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenListadoActivosFijos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosListadoActivosFijos.setToolTipText(this.jTableDatosListadoActivosFijos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioListadoActivosFijos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioListadoActivosFijos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ListadoActivosFijosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ListadoActivosFijosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioListadoActivosFijos() throws Exception {
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
	public void inicializarCombosForeignKeyListadoActivosFijosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyListadoActivosFijosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ListadoActivosFijosJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyListadoActivosFijos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.listadoactivosfijosSessionBean==null) {
				this.listadoactivosfijosSessionBean=new ListadoActivosFijosSessionBean();
			}

			if(!this.listadoactivosfijosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyListadoActivosFijos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyListadoActivosFijos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyListadoActivosFijos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyListadoActivosFijos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyListadoActivosFijos(ListadoActivosFijos listadoactivosfijos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyListadoActivosFijos(ListadoActivosFijos listadoactivosfijos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyListadoActivosFijos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyListadoActivosFijos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyListadoActivosFijos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyListadoActivosFijos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroListadoActivosFijos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyListadoActivosFijos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyListadoActivosFijos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyListadoActivosFijos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormListadoActivosFijos.jComboBoxid_empresaListadoActivosFijos!=null && this.jInternalFrameDetalleFormListadoActivosFijos.jComboBoxid_empresaListadoActivosFijos.getItemCount()>0) {
				this.jInternalFrameDetalleFormListadoActivosFijos.jComboBoxid_empresaListadoActivosFijos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public ListadoActivosFijosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ListadoActivosFijosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ListadoActivosFijosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.listadoactivosfijosSessionBean=new ListadoActivosFijosSessionBean(); 
		this.listadoactivosfijosConstantesFunciones=new ListadoActivosFijosConstantesFunciones(); 
		this.listadoactivosfijosBean=new ListadoActivosFijos();//(this.listadoactivosfijosConstantesFunciones); 		
		this.listadoactivosfijosReturnGeneral=new ListadoActivosFijosParameterReturnGeneral(); 
		
		this.listadoactivosfijosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.listadoactivosfijosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ListadoActivosFijosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ListadoActivosFijosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ListadoActivosFijosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessListadoActivosFijos(true);
			
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
			
			this.listadoactivosfijosConstantesFunciones=new ListadoActivosFijosConstantesFunciones(); 
			this.listadoactivosfijosBean=new ListadoActivosFijos();//this.listadoactivosfijosConstantesFunciones); 			
			this.listadoactivosfijosReturnGeneral=new ListadoActivosFijosParameterReturnGeneral(); 
		
			ListadoActivosFijosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Listado Activos Fijos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.listadoactivosfijos=new ListadoActivosFijos();
			this.listadoactivosfijoss = new ArrayList<ListadoActivosFijos>();
			this.listadoactivosfijossAux = new ArrayList<ListadoActivosFijos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic=new ListadoActivosFijosLogic();
				this.listadoactivosfijosLogic.getNewConnexionToDeep("");
			}
			
			//this.listadoactivosfijosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.listadoactivosfijosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormListadoActivosFijos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoListadoActivosFijos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoListadoActivosFijos);	
					}
					
					if(this.jInternalFrameImportacionListadoActivosFijos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionListadoActivosFijos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByListadoActivosFijos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByListadoActivosFijos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormListadoActivosFijos);
				this.jInternalFrameDetalleFormListadoActivosFijos.setVisible(false);
				this.jInternalFrameDetalleFormListadoActivosFijos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoListadoActivosFijos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoListadoActivosFijos);
					this.jInternalFrameReporteDinamicoListadoActivosFijos.setVisible(false);
					this.jInternalFrameReporteDinamicoListadoActivosFijos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionListadoActivosFijos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionListadoActivosFijos);
					this.jInternalFrameImportacionListadoActivosFijos.setVisible(false);
					this.jInternalFrameImportacionListadoActivosFijos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByListadoActivosFijos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByListadoActivosFijos);
					this.jInternalFrameOrderByListadoActivosFijos.setVisible(false);
					this.jInternalFrameOrderByListadoActivosFijos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idListadoActivosFijosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ListadoActivosFijosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.listadoactivosfijosReturnGeneral=new ListadoActivosFijosParameterReturnGeneral();
			
			this.listadoactivosfijosParameterGeneral=new ListadoActivosFijosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.listadoactivosfijosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ListadoActivosFijosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ListadoActivosFijosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.listadoactivosfijosSessionBean.getEsGuardarRelacionado(),this.listadoactivosfijosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ListadoActivosFijosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.listadoactivosfijosSessionBean.getEsGuardarRelacionado(),this.listadoactivosfijosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoListadoActivosFijos=false;
			this.isVisibilidadCeldaDuplicarListadoActivosFijos=true;
			this.isVisibilidadCeldaCopiarListadoActivosFijos=true;
			this.isVisibilidadCeldaVerFormListadoActivosFijos=true;
			this.isVisibilidadCeldaOrdenListadoActivosFijos=true;
			this.isVisibilidadCeldaNuevoRelacionesListadoActivosFijos=false;
			this.isVisibilidadCeldaModificarListadoActivosFijos=false;
			this.isVisibilidadCeldaActualizarListadoActivosFijos=false;
			this.isVisibilidadCeldaEliminarListadoActivosFijos=false;
			this.isVisibilidadCeldaCancelarListadoActivosFijos=false;
			this.isVisibilidadCeldaGuardarListadoActivosFijos=false;
			this.isVisibilidadCeldaGuardarCambiosListadoActivosFijos=false;
			
			
			this.isVisibilidadBusquedaListadoActivosFijos=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesListadoActivosFijos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosListadoActivosFijos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioListadoActivosFijos(false);
			
			this.setPermisosUsuarioListadoActivosFijos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.listadoactivosfijosSessionBean.getEsGuardarRelacionado() 
				|| (this.listadoactivosfijosSessionBean.getEsGuardarRelacionado() && this.listadoactivosfijosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioListadoActivosFijosClasesRelacionadas();
			}
			
			if(this.listadoactivosfijosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioListadoActivosFijosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ListadoActivosFijosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosListadoActivosFijos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualListadoActivosFijos();
			}
			
			if(!this.isPermisoBusquedaListadoActivosFijos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasListadoActivosFijos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ListadoActivosFijosConstantesFunciones.getTiposSeleccionarListadoActivosFijos());
				
				this.tiposColumnasSelect=ListadoActivosFijosConstantesFunciones.getTiposSeleccionarListadoActivosFijos(true);
				
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
			//if(!this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioListadoActivosFijos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioListadoActivosFijos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioListadoActivosFijos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesListadoActivosFijos() ;
			
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
				listadoactivosfijosImplementable= (ListadoActivosFijosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ListadoActivosFijosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				listadoactivosfijosImplementableHome= (ListadoActivosFijosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ListadoActivosFijosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.listadoactivosfijoss= new ArrayList<ListadoActivosFijos>();
			this.listadoactivosfijossEliminados= new ArrayList<ListadoActivosFijos>();
						
			this.isEsNuevoListadoActivosFijos=false;
			this.esParaAccionDesdeFormularioListadoActivosFijos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyListadoActivosFijos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroListadoActivosFijos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ListadoActivosFijosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ListadoActivosFijosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesListadoActivosFijos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingListadoActivosFijos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioListadoActivosFijos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioListadoActivosFijos();
			}
			
			ListadoActivosFijosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasListadoActivosFijos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasListadoActivosFijos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasListadoActivosFijos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessListadoActivosFijos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ListadoActivosFijos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectListadoActivosFijos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesListadoActivosFijos")) {
				iIndex=this.jInternalFrameDetalleFormListadoActivosFijos.jTabbedPaneRelacionesListadoActivosFijos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormListadoActivosFijos.jTabbedPaneRelacionesListadoActivosFijos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosListadoActivosFijos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessListadoActivosFijos();	
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
	
	public void cargarCombosForeignKeyListadoActivosFijos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyListadoActivosFijos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyListadoActivosFijos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyListadoActivosFijosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyListadoActivosFijos();
		
		this.cargarCombosFrameForeignKeyListadoActivosFijos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyListadoActivosFijos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyListadoActivosFijos();
		}
	}
	
	
	
	public void jButtonNuevoListadoActivosFijosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.listadoactivosfijosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormListadoActivosFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
			
			
			if(jTableDatosListadoActivosFijos.getRowCount()>=1) {
				jTableDatosListadoActivosFijos.removeRowSelectionInterval(0, jTableDatosListadoActivosFijos.getRowCount()-1);						
			}
			
			this.isEsNuevoListadoActivosFijos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoListadoActivosFijos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesListadoActivosFijos(true);			
			//this.listadoactivosfijos=new ListadoActivosFijos();
			//this.listadoactivosfijos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesListadoActivosFijos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadoActivosFijos() ;
			
			if(ListadoActivosFijosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleListadoActivosFijos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.listadoactivosfijos);	
			this.actualizarInformacion("INFO_PADRE",false,this.listadoactivosfijos);				
			
			ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
			
			if(this.listadoactivosfijosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ListadoActivosFijos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarListadoActivosFijosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ListadoActivosFijos> listadoactivosfijossSeleccionados=new ArrayList<ListadoActivosFijos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosListadoActivosFijos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosListadoActivosFijos.getSelectedRows().length;			
			}
			
			listadoactivosfijossSeleccionados=this.getListadoActivosFijossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoListadoActivosFijos--;			
				//ListadoActivosFijos listadoactivosfijosAux= new ListadoActivosFijos();			
				//listadoactivosfijosAux.setId(this.iIdNuevoListadoActivosFijos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ListadoActivosFijos listadoactivosfijosOrigen=new ListadoActivosFijos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ListadoActivosFijos listadoactivosfijosOrigen : listadoactivosfijossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosListadoActivosFijos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							listadoactivosfijosOrigen =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							listadoactivosfijosOrigen =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaListadoActivosFijos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.listadoactivosfijos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosListadoActivosFijos(listadoactivosfijosOrigen,this.listadoactivosfijos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysListadoActivosFijos(this.listadoactivosfijos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.listadoactivosfijosLogic.getListadoActivosFijoss().add(this.listadoactivosfijosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.listadoactivosfijoss.add(this.listadoactivosfijosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaListadoActivosFijos(false);
				
				this.jTableDatosListadoActivosFijos.setRowSelectionInterval(this.getIndiceNuevoListadoActivosFijos(), this.getIndiceNuevoListadoActivosFijos());
				
				int iLastRow =  this.jTableDatosListadoActivosFijos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosListadoActivosFijos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosListadoActivosFijos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaListadoActivosFijos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarListadoActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ListadoActivosFijos> listadoactivosfijossSeleccionados=new ArrayList<ListadoActivosFijos>();									
		
			ListadoActivosFijos listadoactivosfijosOrigen=new ListadoActivosFijos();
			ListadoActivosFijos listadoactivosfijosDestino=new ListadoActivosFijos();
				
			listadoactivosfijossSeleccionados=this.getListadoActivosFijossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosListadoActivosFijos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || listadoactivosfijossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosListadoActivosFijos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						listadoactivosfijosOrigen =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						listadoactivosfijosOrigen =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						listadoactivosfijosDestino =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						listadoactivosfijosDestino =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				listadoactivosfijosOrigen =listadoactivosfijossSeleccionados.get(0);
				listadoactivosfijosDestino =listadoactivosfijossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosListadoActivosFijos(listadoactivosfijosOrigen,listadoactivosfijosDestino,true,false);
				
				listadoactivosfijosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(listadoactivosfijosDestino,listadoactivosfijosLogic.getListadoActivosFijoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(listadoactivosfijosDestino,listadoactivosfijoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaListadoActivosFijos(false);
				
				//this.jTableDatosListadoActivosFijos.setRowSelectionInterval(this.getIndiceNuevoListadoActivosFijos(), this.getIndiceNuevoListadoActivosFijos());
				
				int iLastRow =  this.jTableDatosListadoActivosFijos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosListadoActivosFijos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosListadoActivosFijos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaListadoActivosFijos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormListadoActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormListadoActivosFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormListadoActivosFijos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarListadoActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesListadoActivosFijos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasListadoActivosFijos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesListadoActivosFijos.setVisible(!isVisible);
			this.jPanelPaginacionListadoActivosFijos.setVisible(!isVisible);
			this.jPanelAccionesListadoActivosFijos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarListadoActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameListadoActivosFijos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoListadoActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoListadoActivosFijos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionListadoActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionListadoActivosFijos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByListadoActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByListadoActivosFijos();
			
			this.abrirFrameOrderByListadoActivosFijos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByListadoActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByListadoActivosFijos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleListadoActivosFijos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormListadoActivosFijos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormListadoActivosFijos.isMaximum()) {
					this.jInternalFrameDetalleFormListadoActivosFijos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormListadoActivosFijos.setSize(this.jInternalFrameDetalleFormListadoActivosFijos.iWidthFormulario,this.jInternalFrameDetalleFormListadoActivosFijos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormListadoActivosFijos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormListadoActivosFijos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormListadoActivosFijos.isMaximum()) {
						this.jInternalFrameDetalleFormListadoActivosFijos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormListadoActivosFijos.jContentPaneDetalleListadoActivosFijos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormListadoActivosFijos.jTabbedPaneRelacionesListadoActivosFijos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormListadoActivosFijos.jContentPaneDetalleListadoActivosFijos.getWidth(),ListadoActivosFijosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormListadoActivosFijos.jTabbedPaneRelacionesListadoActivosFijos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormListadoActivosFijos.jContentPaneDetalleListadoActivosFijos.getWidth(),ListadoActivosFijosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormListadoActivosFijos.jTabbedPaneRelacionesListadoActivosFijos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormListadoActivosFijos.jContentPaneDetalleListadoActivosFijos.getWidth(),ListadoActivosFijosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormListadoActivosFijos.setVisible(true);
	        this.jInternalFrameDetalleFormListadoActivosFijos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByListadoActivosFijos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByListadoActivosFijos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByListadoActivosFijos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadoActivosFijos,false,this);
				} else {
					this.jInternalFrameOrderByListadoActivosFijos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadoActivosFijos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByListadoActivosFijos);
				this.jInternalFrameOrderByListadoActivosFijos.setVisible(false);
				this.jInternalFrameOrderByListadoActivosFijos.setSelected(false);
				
				this.jInternalFrameOrderByListadoActivosFijos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByListadoActivosFijos"));
				
				this.inicializarActualizarBindingTablaOrderByListadoActivosFijos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionListadoActivosFijos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionListadoActivosFijos==null) {
				
				this.jInternalFrameImportacionListadoActivosFijos=new ImportacionJInternalFrame(ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionListadoActivosFijos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionListadoActivosFijos);
				this.jInternalFrameImportacionListadoActivosFijos.setVisible(false);
				this.jInternalFrameImportacionListadoActivosFijos.setSelected(false);


				this.jInternalFrameImportacionListadoActivosFijos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionListadoActivosFijos"));
				this.jInternalFrameImportacionListadoActivosFijos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionListadoActivosFijos"));
				this.jInternalFrameImportacionListadoActivosFijos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionListadoActivosFijos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoListadoActivosFijos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoListadoActivosFijos==null) {
				this.jInternalFrameReporteDinamicoListadoActivosFijos=new ReporteDinamicoJInternalFrame(ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoListadoActivosFijos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoListadoActivosFijos);
				this.jInternalFrameReporteDinamicoListadoActivosFijos.setVisible(false);
				this.jInternalFrameReporteDinamicoListadoActivosFijos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoListadoActivosFijos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoListadoActivosFijos"));
				this.jInternalFrameReporteDinamicoListadoActivosFijos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoListadoActivosFijos"));
				this.jInternalFrameReporteDinamicoListadoActivosFijos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoListadoActivosFijos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualListadoActivosFijos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleListadoActivosFijos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormListadoActivosFijos);
			
	       	this.jInternalFrameDetalleFormListadoActivosFijos.setVisible(false);
	        this.jInternalFrameDetalleFormListadoActivosFijos.setSelected(false);
			
			//this.jInternalFrameDetalleFormListadoActivosFijos.dispose();
			//this.jInternalFrameDetalleFormListadoActivosFijos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoListadoActivosFijos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoListadoActivosFijos.setVisible(true);
	        this.jInternalFrameReporteDinamicoListadoActivosFijos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionListadoActivosFijos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionListadoActivosFijos.setVisible(true);
	        this.jInternalFrameImportacionListadoActivosFijos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByListadoActivosFijos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByListadoActivosFijos.setVisible(true);
	        this.jInternalFrameOrderByListadoActivosFijos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByListadoActivosFijos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByListadoActivosFijos.setVisible(false);
	        this.jInternalFrameOrderByListadoActivosFijos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoListadoActivosFijos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoListadoActivosFijos.setVisible(false);
	        this.jInternalFrameReporteDinamicoListadoActivosFijos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionListadoActivosFijos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionListadoActivosFijos.setVisible(false);
	        this.jInternalFrameImportacionListadoActivosFijos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarListadoActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarListadoActivosFijos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarListadoActivosFijos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosListadoActivosFijos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesListadoActivosFijos(true);
			//this.isEsNuevoListadoActivosFijos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesListadoActivosFijos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesListadoActivosFijos(false) ;
			
			if(listadoactivosfijosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ListadoActivosFijosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleListadoActivosFijos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadoActivosFijos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaListadoActivosFijosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosListadoActivosFijos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarListadoActivosFijos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormListadoActivosFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosListadoActivosFijos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesListadoActivosFijos(true);
			//this.isEsNuevoListadoActivosFijos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.listadoactivosfijos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesListadoActivosFijos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesListadoActivosFijos(false) ;
			
			if(ListadoActivosFijosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleListadoActivosFijos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadoActivosFijos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarListadoActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesListadoActivosFijos(false);
			
			//if(!this.isEsNuevoListadoActivosFijos) {								
				int intSelectedRow = this.jTableDatosListadoActivosFijos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ListadoActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualListadoActivosFijos(this.listadoactivosfijos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysListadoActivosFijos(this.listadoactivosfijos);
				
			}
			
			if(this.permiteMantenimiento(this.listadoactivosfijos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoListadoActivosFijos=true;
					this.inicializarActualizarBindingTablaListadoActivosFijos(false);
					this.isEsNuevoListadoActivosFijos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoListadoActivosFijos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoListadoActivosFijos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesListadoActivosFijos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualListadoActivosFijos(false);
				
				this.habilitarDeshabilitarControlesListadoActivosFijos(false);
			
												
				
				if(ListadoActivosFijosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleListadoActivosFijos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoListadoActivosFijosActionPerformed(evt,listadoactivosfijosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualListadoActivosFijos(this.listadoactivosfijos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosListadoActivosFijos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,listadoactivosfijosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.listadoactivosfijos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ListadoActivosFijos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoActivosFijos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarListadoActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosListadoActivosFijos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
				this.listadoactivosfijos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
				this.listadoactivosfijos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.listadoactivosfijos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ListadoActivosFijosModel) this.jTableDatosListadoActivosFijos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoListadoActivosFijos=true;
				this.inicializarActualizarBindingTablaListadoActivosFijos(false);
				this.isEsNuevoListadoActivosFijos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesListadoActivosFijos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualListadoActivosFijos(false);
				
				this.habilitarDeshabilitarControlesListadoActivosFijos(false);
				
				
				
				if(ListadoActivosFijosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleListadoActivosFijos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarListadoActivosFijosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosListadoActivosFijos.getRowCount()>=1) {
				jTableDatosListadoActivosFijos.removeRowSelectionInterval(0, jTableDatosListadoActivosFijos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesListadoActivosFijos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaListadoActivosFijos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesListadoActivosFijos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadoActivosFijos(false) ;
			
			this.isEsNuevoListadoActivosFijos=false;
			
			if(ListadoActivosFijosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleListadoActivosFijos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosListadoActivosFijosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingListadoActivosFijos(false);
				
				//SI ES MANUAL
				if(ListadoActivosFijosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualListadoActivosFijos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosListadoActivosFijosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoListadoActivosFijos--;			
			//ListadoActivosFijos listadoactivosfijosAux= new ListadoActivosFijos();			
			//listadoactivosfijosAux.setId(this.iIdNuevoListadoActivosFijos);
			
			if(this.jInternalFrameDetalleFormListadoActivosFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaListadoActivosFijos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysListadoActivosFijos(this.listadoactivosfijos);
			
			this.listadoactivosfijos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.listadoactivosfijosLogic.getListadoActivosFijoss().add(this.listadoactivosfijosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.listadoactivosfijoss.add(this.listadoactivosfijosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaListadoActivosFijos(false);
			
			this.jTableDatosListadoActivosFijos.setRowSelectionInterval(this.getIndiceNuevoListadoActivosFijos(), this.getIndiceNuevoListadoActivosFijos());
			
			int iLastRow =  this.jTableDatosListadoActivosFijos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosListadoActivosFijos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosListadoActivosFijos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaListadoActivosFijos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionListadoActivosFijosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingListadoActivosFijos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadoActivosFijos(false);
			
			//SI ES MANUAL
			if(ListadoActivosFijosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualListadoActivosFijos();
			}
			
			//this.abrirFrameTreeListadoActivosFijos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionListadoActivosFijosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionListadoActivosFijosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionListadoActivosFijos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionListadoActivosFijos.setFileImportacion(this.jInternalFrameImportacionListadoActivosFijos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionListadoActivosFijos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionListadoActivosFijos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionListadoActivosFijos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionListadoActivosFijos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoListadoActivosFijosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ListadoActivosFijos> listadoactivosfijossSeleccionados=new ArrayList<ListadoActivosFijos>();		

		listadoactivosfijossSeleccionados=this.getListadoActivosFijossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadoActivosFijos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadoActivosFijos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ListadoActivosFijosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ListadoActivosFijosBaseDesign.jrxml";
			
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
			
			this.generarReporteListadoActivosFijoss("Todos",listadoactivosfijossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listado Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoListadoActivosFijos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadoActivosFijos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ListadoActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoSubGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoSubGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoSubGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoSubGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreSubGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreSubGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreSubGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreSubGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoDetalleGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoDetalleGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoDetalleGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoDetalleGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreDetalleGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreDetalleGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreDetalleGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreDetalleGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_CLAVE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ave_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ave_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ave_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ave_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_FECHACOMPRA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaCompra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaCompra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaCompra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaCompra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_VIDAUTIL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_daUtil_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_daUtil_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_daUtil_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_daUtil_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoDeCompra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoDeCompra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoDeCompra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoDeCompra_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoListadoActivosFijos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoListadoActivosFijos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoListadoActivosFijos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ListadoActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					sNombreCampoCategoria="codigo_sub_grupo";
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					sNombreCampoCategoria="nombre_sub_grupo";
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					sNombreCampoCategoria="codigo_detalle_grupo";
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					sNombreCampoCategoria="nombre_detalle_grupo";
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_CLAVE:
					sNombreCampoCategoria="clave";
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_FECHACOMPRA:
					sNombreCampoCategoria="fecha_compra";
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_VIDAUTIL:
					sNombreCampoCategoria="vida_util";
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA:
					sNombreCampoCategoria="costo_de_compra";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoListadoActivosFijos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ListadoActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					sNombreCampoCategoriaValor="codigo_sub_grupo";
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					sNombreCampoCategoriaValor="nombre_sub_grupo";
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					sNombreCampoCategoriaValor="codigo_detalle_grupo";
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					sNombreCampoCategoriaValor="nombre_detalle_grupo";
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_CLAVE:
					sNombreCampoCategoriaValor="clave";
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_FECHACOMPRA:
					sNombreCampoCategoriaValor="fecha_compra";
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_VIDAUTIL:
					sNombreCampoCategoriaValor="vida_util";
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA:
					sNombreCampoCategoriaValor="costo_de_compra";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoListadoActivosFijos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadoActivosFijos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ListadoActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Sub Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_sub_grupo");
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Sub Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_sub_grupo");
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Detalle Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_detalle_grupo");
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Detalle Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_detalle_grupo");
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_CLAVE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Clave",sNombreCampoCategoria,sNombreCampoCategoriaValor,"clave");
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_FECHACOMPRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Compra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_compra");
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_VIDAUTIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Va Util",sNombreCampoCategoria,sNombreCampoCategoriaValor,"vida_util");
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Compra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_de_compra");
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
	
	public void jButtonGenerarExcelReporteDinamicoListadoActivosFijosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ListadoActivosFijos> listadoactivosfijossSeleccionados=new ArrayList<ListadoActivosFijos>();		
		
		listadoactivosfijossSeleccionados=this.getListadoActivosFijossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadoactivosfijos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ListadoActivosFijoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoListadoActivosFijos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoListadoActivosFijos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ListadoActivosFijosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ListadoActivosFijos listadoactivosfijos:listadoactivosfijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadoactivosfijos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO);
					iRow++;

					for(ListadoActivosFijos listadoactivosfijos:listadoactivosfijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadoactivosfijos.getcodigo_sub_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO);
					iRow++;

					for(ListadoActivosFijos listadoactivosfijos:listadoactivosfijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadoactivosfijos.getnombre_sub_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
					iRow++;

					for(ListadoActivosFijos listadoactivosfijos:listadoactivosfijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadoactivosfijos.getcodigo_detalle_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
					iRow++;

					for(ListadoActivosFijos listadoactivosfijos:listadoactivosfijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadoactivosfijos.getnombre_detalle_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_CLAVE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_CLAVE);
					iRow++;

					for(ListadoActivosFijos listadoactivosfijos:listadoactivosfijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadoactivosfijos.getclave());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ListadoActivosFijos listadoactivosfijos:listadoactivosfijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadoactivosfijos.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_FECHACOMPRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_FECHACOMPRA);
					iRow++;

					for(ListadoActivosFijos listadoactivosfijos:listadoactivosfijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadoactivosfijos.getfecha_compra());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_VIDAUTIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_VIDAUTIL);
					iRow++;

					for(ListadoActivosFijos listadoactivosfijos:listadoactivosfijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadoactivosfijos.getvida_util());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadoActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA);
					iRow++;

					for(ListadoActivosFijos listadoactivosfijos:listadoactivosfijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadoactivosfijos.getcosto_de_compra());
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
			//	this.getFilaCabeceraExportarExcelListadoActivosFijos(row);				
			//	iRow++;
			//}				
			
			//for(ListadoActivosFijos listadoactivosfijosAux:listadoactivosfijossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelListadoActivosFijos(listadoactivosfijosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listado Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
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
				this.listadoactivosfijosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadoActivosFijos(false);
			
			//SI ES MANUAL
			if(ListadoActivosFijosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualListadoActivosFijos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresListadoActivosFijosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadoActivosFijos(false);
			
			//SI ES MANUAL
			if(ListadoActivosFijosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualListadoActivosFijos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesListadoActivosFijosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadoActivosFijos(false);
			
			//SI ES MANUAL
			if(ListadoActivosFijosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualListadoActivosFijos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaListadoActivosFijos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosListadoActivosFijos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosListadoActivosFijos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosListadoActivosFijos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosListadoActivosFijos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosListadoActivosFijos.setMinimumSize(dimensionMinimum);
		this.jTableDatosListadoActivosFijos.setMaximumSize(dimensionMaximum);
		this.jTableDatosListadoActivosFijos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingListadoActivosFijos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingListadoActivosFijos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingListadoActivosFijos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaListadoActivosFijos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesListadoActivosFijos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasListadoActivosFijos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesListadoActivosFijos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesListadoActivosFijos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ListadoActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ListadoActivosFijosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualListadoActivosFijos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaListadoActivosFijos();
		
		this.inicializarActualizarBindingBotonesManualListadoActivosFijos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualListadoActivosFijos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesListadoActivosFijos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualListadoActivosFijos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualListadoActivosFijos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosListadoActivosFijos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosListadoActivosFijos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteListadoActivosFijos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormListadoActivosFijos.jCheckBoxPostAccionNuevoListadoActivosFijos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormListadoActivosFijos.jCheckBoxPostAccionSinCerrarListadoActivosFijos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormListadoActivosFijos.jCheckBoxPostAccionSinMensajeListadoActivosFijos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosListadoActivosFijos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosListadoActivosFijos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteListadoActivosFijos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) {
				this.jInternalFrameDetalleFormListadoActivosFijos.jCheckBoxPostAccionNuevoListadoActivosFijos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormListadoActivosFijos.jCheckBoxPostAccionSinCerrarListadoActivosFijos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormListadoActivosFijos.jCheckBoxPostAccionSinMensajeListadoActivosFijos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionListadoActivosFijos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionListadoActivosFijos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormListadoActivosFijos.jComboBoxTiposAccionesFormularioListadoActivosFijos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesListadoActivosFijos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoListadoActivosFijos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadoActivosFijos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesListadoActivosFijos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesListadoActivosFijos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarListadoActivosFijos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesListadoActivosFijos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoListadoActivosFijos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadoActivosFijos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesListadoActivosFijos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralListadoActivosFijos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesListadoActivosFijos(Boolean esInicializar) throws Exception {
		try	{	
			if(ListadoActivosFijosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualListadoActivosFijos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesListadoActivosFijos() throws Exception {
		try	{
			if(ListadoActivosFijosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualListadoActivosFijos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleListadoActivosFijos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormListadoActivosFijos.jComboBoxTiposAccionesFormularioListadoActivosFijos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormListadoActivosFijos.jComboBoxTiposAccionesFormularioListadoActivosFijos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualListadoActivosFijos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesListadoActivosFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesListadoActivosFijos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesListadoActivosFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesListadoActivosFijos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesListadoActivosFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesListadoActivosFijos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionListadoActivosFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionListadoActivosFijos.addItem(reporte);
			}
			
			
			if(!this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionListadoActivosFijos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionListadoActivosFijos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesListadoActivosFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesListadoActivosFijos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesListadoActivosFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesListadoActivosFijos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormListadoActivosFijos.jComboBoxTiposAccionesFormularioListadoActivosFijos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormListadoActivosFijos.jComboBoxTiposAccionesFormularioListadoActivosFijos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarListadoActivosFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarListadoActivosFijos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarListadoActivosFijos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualListadoActivosFijos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualListadoActivosFijos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoListadoActivosFijos!=null) {
				this.jInternalFrameReporteDinamicoListadoActivosFijos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoListadoActivosFijos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoListadoActivosFijos!=null) {
				this.jInternalFrameReporteDinamicoListadoActivosFijos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoListadoActivosFijos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoListadoActivosFijos!=null) {
				
				if(this.jInternalFrameReporteDinamicoListadoActivosFijos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoListadoActivosFijos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoListadoActivosFijos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoListadoActivosFijos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoListadoActivosFijos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoListadoActivosFijos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoListadoActivosFijos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoListadoActivosFijos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ListadoActivosFijosConstantesFunciones.getTiposSeleccionarListadoActivosFijos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoListadoActivosFijos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoListadoActivosFijos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoListadoActivosFijos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ListadoActivosFijosConstantesFunciones.getTiposSeleccionarListadoActivosFijos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoListadoActivosFijos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoListadoActivosFijos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoListadoActivosFijos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ListadoActivosFijosConstantesFunciones.getTiposSeleccionarListadoActivosFijos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoListadoActivosFijos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoListadoActivosFijos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoListadoActivosFijos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoListadoActivosFijos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualListadoActivosFijos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		//this.idBusquedaListadoActivosFijos=Long.parseLong(this.jLabelidListadoActivosFijosBusquedaListadoActivosFijos.getText());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasListadoActivosFijos(Boolean esInicializar) throws Exception {				
		if(ListadoActivosFijosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualListadoActivosFijos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaListadoActivosFijos() throws Exception {
		this.inicializarActualizarBindingTablaListadoActivosFijos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByListadoActivosFijos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByListadoActivosFijos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByListadoActivosFijos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByListadoActivosFijos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ListadoActivosFijosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByListadoActivosFijos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByListadoActivosFijos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ListadoActivosFijosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosListadoActivosFijosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoActivosFijosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ListadoActivosFijosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByListadoActivosFijos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByListadoActivosFijos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ListadoActivosFijosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByListadoActivosFijos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaListadoActivosFijos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=listadoactivosfijosLogic.getListadoActivosFijoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=listadoactivosfijoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ListadoActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosListadoActivosFijos.setModel(new ListadoActivosFijosModel(this.listadoactivosfijosLogic.getListadoActivosFijoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosListadoActivosFijos.setModel(new ListadoActivosFijosModel(this.listadoactivosfijoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByListadoActivosFijos!=null && this.jInternalFrameOrderByListadoActivosFijos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByListadoActivosFijos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosListadoActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoActivosFijos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ListadoActivosFijosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO,listadoactivosfijosConstantesFunciones.resaltarSeleccionarListadoActivosFijos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ListadoActivosFijosConstantesFunciones.SCLASSWEBTITULO,listadoactivosfijosConstantesFunciones.resaltarSeleccionarListadoActivosFijos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosListadoActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoActivosFijos,ListadoActivosFijosConstantesFunciones.LABEL_ID));

		if(this.listadoactivosfijosConstantesFunciones.mostraridListadoActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadoActivosFijosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.listadoactivosfijosConstantesFunciones.resaltaridListadoActivosFijos,this.listadoactivosfijosConstantesFunciones.activaridListadoActivosFijos,iSizeTabla,this,true,"idListadoActivosFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadoactivosfijosConstantesFunciones.resaltaridListadoActivosFijos,this.listadoactivosfijosConstantesFunciones.activaridListadoActivosFijos,this,true,"idListadoActivosFijos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadoActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoActivosFijos,ListadoActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO));

		if(this.listadoactivosfijosConstantesFunciones.mostrarcodigo_sub_grupoListadoActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadoActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadoactivosfijosConstantesFunciones.resaltarcodigo_sub_grupoListadoActivosFijos,this.listadoactivosfijosConstantesFunciones.activarcodigo_sub_grupoListadoActivosFijos,iSizeTabla,this,true,"codigo_sub_grupoListadoActivosFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadoactivosfijosConstantesFunciones.resaltarcodigo_sub_grupoListadoActivosFijos,this.listadoactivosfijosConstantesFunciones.activarcodigo_sub_grupoListadoActivosFijos,this,true,"codigo_sub_grupoListadoActivosFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadoActivosFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadoActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoActivosFijos,ListadoActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO));

		if(this.listadoactivosfijosConstantesFunciones.mostrarnombre_sub_grupoListadoActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadoActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadoactivosfijosConstantesFunciones.resaltarnombre_sub_grupoListadoActivosFijos,this.listadoactivosfijosConstantesFunciones.activarnombre_sub_grupoListadoActivosFijos,iSizeTabla,this,true,"nombre_sub_grupoListadoActivosFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadoactivosfijosConstantesFunciones.resaltarnombre_sub_grupoListadoActivosFijos,this.listadoactivosfijosConstantesFunciones.activarnombre_sub_grupoListadoActivosFijos,this,true,"nombre_sub_grupoListadoActivosFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadoActivosFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadoActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoActivosFijos,ListadoActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO));

		if(this.listadoactivosfijosConstantesFunciones.mostrarcodigo_detalle_grupoListadoActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadoActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadoactivosfijosConstantesFunciones.resaltarcodigo_detalle_grupoListadoActivosFijos,this.listadoactivosfijosConstantesFunciones.activarcodigo_detalle_grupoListadoActivosFijos,iSizeTabla,this,true,"codigo_detalle_grupoListadoActivosFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadoactivosfijosConstantesFunciones.resaltarcodigo_detalle_grupoListadoActivosFijos,this.listadoactivosfijosConstantesFunciones.activarcodigo_detalle_grupoListadoActivosFijos,this,true,"codigo_detalle_grupoListadoActivosFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadoActivosFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadoActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoActivosFijos,ListadoActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO));

		if(this.listadoactivosfijosConstantesFunciones.mostrarnombre_detalle_grupoListadoActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadoActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadoactivosfijosConstantesFunciones.resaltarnombre_detalle_grupoListadoActivosFijos,this.listadoactivosfijosConstantesFunciones.activarnombre_detalle_grupoListadoActivosFijos,iSizeTabla,this,true,"nombre_detalle_grupoListadoActivosFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadoactivosfijosConstantesFunciones.resaltarnombre_detalle_grupoListadoActivosFijos,this.listadoactivosfijosConstantesFunciones.activarnombre_detalle_grupoListadoActivosFijos,this,true,"nombre_detalle_grupoListadoActivosFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadoActivosFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadoActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoActivosFijos,ListadoActivosFijosConstantesFunciones.LABEL_CLAVE));

		if(this.listadoactivosfijosConstantesFunciones.mostrarclaveListadoActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadoActivosFijosConstantesFunciones.LABEL_CLAVE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadoactivosfijosConstantesFunciones.resaltarclaveListadoActivosFijos,this.listadoactivosfijosConstantesFunciones.activarclaveListadoActivosFijos,iSizeTabla,this,true,"claveListadoActivosFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadoactivosfijosConstantesFunciones.resaltarclaveListadoActivosFijos,this.listadoactivosfijosConstantesFunciones.activarclaveListadoActivosFijos,this,true,"claveListadoActivosFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadoActivosFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadoActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoActivosFijos,ListadoActivosFijosConstantesFunciones.LABEL_NOMBRE));

		if(this.listadoactivosfijosConstantesFunciones.mostrarnombreListadoActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadoActivosFijosConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadoactivosfijosConstantesFunciones.resaltarnombreListadoActivosFijos,this.listadoactivosfijosConstantesFunciones.activarnombreListadoActivosFijos,iSizeTabla,this,true,"nombreListadoActivosFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadoactivosfijosConstantesFunciones.resaltarnombreListadoActivosFijos,this.listadoactivosfijosConstantesFunciones.activarnombreListadoActivosFijos,this,true,"nombreListadoActivosFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadoActivosFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadoActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoActivosFijos,ListadoActivosFijosConstantesFunciones.LABEL_FECHACOMPRA));

		if(this.listadoactivosfijosConstantesFunciones.mostrarfecha_compraListadoActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadoActivosFijosConstantesFunciones.LABEL_FECHACOMPRA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.listadoactivosfijosConstantesFunciones.resaltarfecha_compraListadoActivosFijos,this.listadoactivosfijosConstantesFunciones.activarfecha_compraListadoActivosFijos,iSizeTabla,this,true,"fecha_compraListadoActivosFijos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.listadoactivosfijosConstantesFunciones.resaltarfecha_compraListadoActivosFijos,this.listadoactivosfijosConstantesFunciones.activarfecha_compraListadoActivosFijos,this,true,"fecha_compraListadoActivosFijos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ListadoActivosFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadoActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoActivosFijos,ListadoActivosFijosConstantesFunciones.LABEL_VIDAUTIL));

		if(this.listadoactivosfijosConstantesFunciones.mostrarvida_utilListadoActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadoActivosFijosConstantesFunciones.LABEL_VIDAUTIL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.listadoactivosfijosConstantesFunciones.resaltarvida_utilListadoActivosFijos,this.listadoactivosfijosConstantesFunciones.activarvida_utilListadoActivosFijos,iSizeTabla,this,true,"vida_utilListadoActivosFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadoactivosfijosConstantesFunciones.resaltarvida_utilListadoActivosFijos,this.listadoactivosfijosConstantesFunciones.activarvida_utilListadoActivosFijos,this,true,"vida_utilListadoActivosFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ListadoActivosFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadoActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadoActivosFijos,ListadoActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA));

		if(this.listadoactivosfijosConstantesFunciones.mostrarcosto_de_compraListadoActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadoActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.listadoactivosfijosConstantesFunciones.resaltarcosto_de_compraListadoActivosFijos,this.listadoactivosfijosConstantesFunciones.activarcosto_de_compraListadoActivosFijos,iSizeTabla,this,true,"costo_de_compraListadoActivosFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadoactivosfijosConstantesFunciones.resaltarcosto_de_compraListadoActivosFijos,this.listadoactivosfijosConstantesFunciones.activarcosto_de_compraListadoActivosFijos,this,true,"costo_de_compraListadoActivosFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ListadoActivosFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.listadoactivosfijosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.listadoactivosfijosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosListadoActivosFijos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.listadoactivosfijosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.listadoactivosfijosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosListadoActivosFijos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarListadoActivosFijos && this.isPermisoGuardarCambiosListadoActivosFijos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.listadoactivosfijosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.listadoactivosfijosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosListadoActivosFijos.addColumn(tableColumn);
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
			
			this.jTableDatosListadoActivosFijos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarListadoActivosFijos && this.isPermisoGuardarCambiosListadoActivosFijos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarListadoActivosFijos && this.isPermisoGuardarCambiosListadoActivosFijos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosListadoActivosFijos.moveColumn(this.jTableDatosListadoActivosFijos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosListadoActivosFijos.moveColumn(this.jTableDatosListadoActivosFijos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosListadoActivosFijos.moveColumn(this.jTableDatosListadoActivosFijos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosListadoActivosFijos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosListadoActivosFijos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosListadoActivosFijos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ListadoActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosListadoActivosFijos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosListadoActivosFijos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ListadoActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ListadoActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosListadoActivosFijos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosListadoActivosFijos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosListadoActivosFijos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=listadoactivosfijosLogic.getListadoActivosFijoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=listadoactivosfijoss.size()-1;
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
		//this.jTableDatosListadoActivosFijos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosListadoActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosListadoActivosFijos();
			
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
				
				//this.isEsNuevoListadoActivosFijos=false;
					
				ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
			
				if(this.listadoactivosfijosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormListadoActivosFijos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosListadoActivosFijos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosListadoActivosFijos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.listadoactivosfijos.getsType().equals("DUPLICADO")
				   || this.listadoactivosfijos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoListadoActivosFijos=true;
				
				} else {
					this.isEsNuevoListadoActivosFijos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {
					if(this.listadoactivosfijos.getId()>=0 && !this.listadoactivosfijos.getIsNew()) {						
						this.isEsNuevoListadoActivosFijos=false;
						
					} else {
						this.isEsNuevoListadoActivosFijos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoListadoActivosFijos(esRelaciones);						
				
				this.seleccionarListadoActivosFijos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.listadoactivosfijos.getId()<0) {
					this.isEsNuevoListadoActivosFijos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarListadoActivosFijos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarListadoActivosFijos(evt,rowIndex);
				}	
				
				if(this.listadoactivosfijosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ListadoActivosFijos: " + this.dDif); 
					}
				}								
				
				ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarListadoActivosFijos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.listadoactivosfijos)) {
					if(this.listadoactivosfijos.getId()>0) {
						this.listadoactivosfijos.setIsDeleted(true);
						
						this.listadoactivosfijossEliminados.add(this.listadoactivosfijos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.listadoactivosfijosLogic.getListadoActivosFijoss().remove(this.listadoactivosfijos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.listadoactivosfijoss.remove(this.listadoactivosfijos);				
					}
					
					
					((ListadoActivosFijosModel) this.jTableDatosListadoActivosFijos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaListadoActivosFijos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarListadoActivosFijos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoListadoActivosFijos) {
			
			if(this.jInternalFrameDetalleFormListadoActivosFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosListadoActivosFijos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosListadoActivosFijos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ListadoActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioListadoActivosFijos(this.listadoactivosfijos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesListadoActivosFijos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesListadoActivosFijos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualListadoActivosFijos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoListadoActivosFijos(ListadoActivosFijos listadoactivosfijos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoListadoActivosFijos(listadoactivosfijos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoListadoActivosFijos(ListadoActivosFijos listadoactivosfijos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioListadoActivosFijos(listadoactivosfijos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyListadoActivosFijos(listadoactivosfijos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyListadoActivosFijos(listadoactivosfijos);
	}
	
	public void setVariablesObjetoActualToFormularioListadoActivosFijos(ListadoActivosFijos listadoactivosfijos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormListadoActivosFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormListadoActivosFijos.jLabelidListadoActivosFijos.setText(listadoactivosfijos.getId().toString());
			this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldcodigo_sub_grupoListadoActivosFijos.setText(listadoactivosfijos.getcodigo_sub_grupo());
			this.jInternalFrameDetalleFormListadoActivosFijos.jTextAreanombre_sub_grupoListadoActivosFijos.setText(listadoactivosfijos.getnombre_sub_grupo());
			this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldcodigo_detalle_grupoListadoActivosFijos.setText(listadoactivosfijos.getcodigo_detalle_grupo());
			this.jInternalFrameDetalleFormListadoActivosFijos.jTextAreanombre_detalle_grupoListadoActivosFijos.setText(listadoactivosfijos.getnombre_detalle_grupo());
			this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldclaveListadoActivosFijos.setText(listadoactivosfijos.getclave());
			this.jInternalFrameDetalleFormListadoActivosFijos.jTextAreanombreListadoActivosFijos.setText(listadoactivosfijos.getnombre());
			this.jInternalFrameDetalleFormListadoActivosFijos.jDateChooserfecha_compraListadoActivosFijos.setDate(listadoactivosfijos.getfecha_compra());
			this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldvida_utilListadoActivosFijos.setText(listadoactivosfijos.getvida_util().toString());
			this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldcosto_de_compraListadoActivosFijos.setText(listadoactivosfijos.getcosto_de_compra().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ListadoActivosFijos listadoactivosfijosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,listadoactivosfijosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ListadoActivosFijos listadoactivosfijosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				listadoactivosfijosLocal=this.listadoactivosfijos;
			} else {
				listadoactivosfijosLocal=this.listadoactivosfijosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(listadoactivosfijosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoListadoActivosFijos(listadoactivosfijosLocal,true);
					
					if(listadoactivosfijosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(listadoactivosfijosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(listadoactivosfijosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoListadoActivosFijos(ListadoActivosFijos listadoactivosfijos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualListadoActivosFijos(listadoactivosfijos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysListadoActivosFijos(listadoactivosfijos);
	}
	
	public void setVariablesFormularioToObjetoActualListadoActivosFijos(ListadoActivosFijos listadoactivosfijos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualListadoActivosFijos(listadoactivosfijos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualListadoActivosFijos(ListadoActivosFijos listadoactivosfijos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormListadoActivosFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormListadoActivosFijos.jLabelidListadoActivosFijos.getText()==null || this.jInternalFrameDetalleFormListadoActivosFijos.jLabelidListadoActivosFijos.getText()=="" || this.jInternalFrameDetalleFormListadoActivosFijos.jLabelidListadoActivosFijos.getText()=="Id") {
				this.jInternalFrameDetalleFormListadoActivosFijos.jLabelidListadoActivosFijos.setText("0");
			}

			if(conColumnasBase) {listadoactivosfijos.setId(Long.parseLong(this.jInternalFrameDetalleFormListadoActivosFijos.jLabelidListadoActivosFijos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadoActivosFijosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoActivosFijos.jLabelIdListadoActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadoactivosfijos.setcodigo_sub_grupo(this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldcodigo_sub_grupoListadoActivosFijos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadoActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoActivosFijos.jLabelcodigo_sub_grupoListadoActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadoactivosfijos.setnombre_sub_grupo(this.jInternalFrameDetalleFormListadoActivosFijos.jTextAreanombre_sub_grupoListadoActivosFijos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadoActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoActivosFijos.jLabelnombre_sub_grupoListadoActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadoactivosfijos.setcodigo_detalle_grupo(this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldcodigo_detalle_grupoListadoActivosFijos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadoActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoActivosFijos.jLabelcodigo_detalle_grupoListadoActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadoactivosfijos.setnombre_detalle_grupo(this.jInternalFrameDetalleFormListadoActivosFijos.jTextAreanombre_detalle_grupoListadoActivosFijos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadoActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoActivosFijos.jLabelnombre_detalle_grupoListadoActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadoactivosfijos.setclave(this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldclaveListadoActivosFijos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadoActivosFijosConstantesFunciones.LABEL_CLAVE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoActivosFijos.jLabelclaveListadoActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadoactivosfijos.setnombre(this.jInternalFrameDetalleFormListadoActivosFijos.jTextAreanombreListadoActivosFijos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadoActivosFijosConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoActivosFijos.jLabelnombreListadoActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadoactivosfijos.setfecha_compra(this.jInternalFrameDetalleFormListadoActivosFijos.jDateChooserfecha_compraListadoActivosFijos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadoActivosFijosConstantesFunciones.LABEL_FECHACOMPRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoActivosFijos.jLabelfecha_compraListadoActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadoactivosfijos.setvida_util(Double.parseDouble(this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldvida_utilListadoActivosFijos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadoActivosFijosConstantesFunciones.LABEL_VIDAUTIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoActivosFijos.jLabelvida_utilListadoActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadoactivosfijos.setcosto_de_compra(Double.parseDouble(this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldcosto_de_compraListadoActivosFijos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadoActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadoActivosFijos.jLabelcosto_de_compraListadoActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualListadoActivosFijos(ListadoActivosFijos listadoactivosfijosBean,ListadoActivosFijos listadoactivosfijos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosListadoActivosFijos(ListadoActivosFijos listadoactivosfijosOrigen,ListadoActivosFijos listadoactivosfijos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && listadoactivosfijosOrigen.getId()!=null && !listadoactivosfijosOrigen.getId().equals(0L))) {listadoactivosfijos.setId(listadoactivosfijosOrigen.getId());}}
			if(conDefault || (!conDefault && listadoactivosfijosOrigen.getcodigo_sub_grupo()!=null && !listadoactivosfijosOrigen.getcodigo_sub_grupo().equals(""))) {listadoactivosfijos.setcodigo_sub_grupo(listadoactivosfijosOrigen.getcodigo_sub_grupo());}
			if(conDefault || (!conDefault && listadoactivosfijosOrigen.getnombre_sub_grupo()!=null && !listadoactivosfijosOrigen.getnombre_sub_grupo().equals(""))) {listadoactivosfijos.setnombre_sub_grupo(listadoactivosfijosOrigen.getnombre_sub_grupo());}
			if(conDefault || (!conDefault && listadoactivosfijosOrigen.getcodigo_detalle_grupo()!=null && !listadoactivosfijosOrigen.getcodigo_detalle_grupo().equals(""))) {listadoactivosfijos.setcodigo_detalle_grupo(listadoactivosfijosOrigen.getcodigo_detalle_grupo());}
			if(conDefault || (!conDefault && listadoactivosfijosOrigen.getnombre_detalle_grupo()!=null && !listadoactivosfijosOrigen.getnombre_detalle_grupo().equals(""))) {listadoactivosfijos.setnombre_detalle_grupo(listadoactivosfijosOrigen.getnombre_detalle_grupo());}
			if(conDefault || (!conDefault && listadoactivosfijosOrigen.getclave()!=null && !listadoactivosfijosOrigen.getclave().equals(""))) {listadoactivosfijos.setclave(listadoactivosfijosOrigen.getclave());}
			if(conDefault || (!conDefault && listadoactivosfijosOrigen.getnombre()!=null && !listadoactivosfijosOrigen.getnombre().equals(""))) {listadoactivosfijos.setnombre(listadoactivosfijosOrigen.getnombre());}
			if(conDefault || (!conDefault && listadoactivosfijosOrigen.getfecha_compra()!=null && !listadoactivosfijosOrigen.getfecha_compra().equals(new Date()))) {listadoactivosfijos.setfecha_compra(listadoactivosfijosOrigen.getfecha_compra());}
			if(conDefault || (!conDefault && listadoactivosfijosOrigen.getvida_util()!=null && !listadoactivosfijosOrigen.getvida_util().equals(0.0))) {listadoactivosfijos.setvida_util(listadoactivosfijosOrigen.getvida_util());}
			if(conDefault || (!conDefault && listadoactivosfijosOrigen.getcosto_de_compra()!=null && !listadoactivosfijosOrigen.getcosto_de_compra().equals(0.0))) {listadoactivosfijos.setcosto_de_compra(listadoactivosfijosOrigen.getcosto_de_compra());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioListadoActivosFijos(ListadoActivosFijos listadoactivosfijos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormListadoActivosFijos.jLabelidListadoActivosFijos.setText(listadoactivosfijos.getId().toString());
			this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldcodigo_sub_grupoListadoActivosFijos.setText(listadoactivosfijos.getcodigo_sub_grupo());
			this.jInternalFrameDetalleFormListadoActivosFijos.jTextAreanombre_sub_grupoListadoActivosFijos.setText(listadoactivosfijos.getnombre_sub_grupo());
			this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldcodigo_detalle_grupoListadoActivosFijos.setText(listadoactivosfijos.getcodigo_detalle_grupo());
			this.jInternalFrameDetalleFormListadoActivosFijos.jTextAreanombre_detalle_grupoListadoActivosFijos.setText(listadoactivosfijos.getnombre_detalle_grupo());
			this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldclaveListadoActivosFijos.setText(listadoactivosfijos.getclave());
			this.jInternalFrameDetalleFormListadoActivosFijos.jTextAreanombreListadoActivosFijos.setText(listadoactivosfijos.getnombre());
			this.jInternalFrameDetalleFormListadoActivosFijos.jDateChooserfecha_compraListadoActivosFijos.setDate(listadoactivosfijos.getfecha_compra());
			this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldvida_utilListadoActivosFijos.setText(listadoactivosfijos.getvida_util().toString());
			this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldcosto_de_compraListadoActivosFijos.setText(listadoactivosfijos.getcosto_de_compra().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioListadoActivosFijos(ListadoActivosFijosBean listadoactivosfijosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormListadoActivosFijos.jLabelidListadoActivosFijos.setText(listadoactivosfijosBean.getId().toString());
			this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldcodigo_sub_grupoListadoActivosFijos.setText(listadoactivosfijosBean.getcodigo_sub_grupo());
			this.jInternalFrameDetalleFormListadoActivosFijos.jTextAreanombre_sub_grupoListadoActivosFijos.setText(listadoactivosfijosBean.getnombre_sub_grupo());
			this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldcodigo_detalle_grupoListadoActivosFijos.setText(listadoactivosfijosBean.getcodigo_detalle_grupo());
			this.jInternalFrameDetalleFormListadoActivosFijos.jTextAreanombre_detalle_grupoListadoActivosFijos.setText(listadoactivosfijosBean.getnombre_detalle_grupo());
			this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldclaveListadoActivosFijos.setText(listadoactivosfijosBean.getclave());
			this.jInternalFrameDetalleFormListadoActivosFijos.jTextAreanombreListadoActivosFijos.setText(listadoactivosfijosBean.getnombre());
			this.jInternalFrameDetalleFormListadoActivosFijos.jDateChooserfecha_compraListadoActivosFijos.setDate(listadoactivosfijosBean.getfecha_compra());
			this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldvida_utilListadoActivosFijos.setText(listadoactivosfijosBean.getvida_util().toString());
			this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldcosto_de_compraListadoActivosFijos.setText(listadoactivosfijosBean.getcosto_de_compra().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanListadoActivosFijos(ListadoActivosFijosParameterReturnGeneral listadoactivosfijosReturnGeneral,ListadoActivosFijosBean listadoactivosfijosBean,Boolean conDefault) throws Exception { 
		try {
			ListadoActivosFijos listadoactivosfijosLocal=new ListadoActivosFijos();
			
			listadoactivosfijosLocal=listadoactivosfijosReturnGeneral.getListadoActivosFijos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && listadoactivosfijosLocal.getId()!=null && !listadoactivosfijosLocal.getId().equals(0L))) {listadoactivosfijosBean.setId(listadoactivosfijosLocal.getId());}}
			if(conDefault || (!conDefault && listadoactivosfijosLocal.getcodigo_sub_grupo()!=null && !listadoactivosfijosLocal.getcodigo_sub_grupo().equals(""))) {listadoactivosfijosBean.setcodigo_sub_grupo(listadoactivosfijosLocal.getcodigo_sub_grupo());}
			if(conDefault || (!conDefault && listadoactivosfijosLocal.getnombre_sub_grupo()!=null && !listadoactivosfijosLocal.getnombre_sub_grupo().equals(""))) {listadoactivosfijosBean.setnombre_sub_grupo(listadoactivosfijosLocal.getnombre_sub_grupo());}
			if(conDefault || (!conDefault && listadoactivosfijosLocal.getcodigo_detalle_grupo()!=null && !listadoactivosfijosLocal.getcodigo_detalle_grupo().equals(""))) {listadoactivosfijosBean.setcodigo_detalle_grupo(listadoactivosfijosLocal.getcodigo_detalle_grupo());}
			if(conDefault || (!conDefault && listadoactivosfijosLocal.getnombre_detalle_grupo()!=null && !listadoactivosfijosLocal.getnombre_detalle_grupo().equals(""))) {listadoactivosfijosBean.setnombre_detalle_grupo(listadoactivosfijosLocal.getnombre_detalle_grupo());}
			if(conDefault || (!conDefault && listadoactivosfijosLocal.getclave()!=null && !listadoactivosfijosLocal.getclave().equals(""))) {listadoactivosfijosBean.setclave(listadoactivosfijosLocal.getclave());}
			if(conDefault || (!conDefault && listadoactivosfijosLocal.getnombre()!=null && !listadoactivosfijosLocal.getnombre().equals(""))) {listadoactivosfijosBean.setnombre(listadoactivosfijosLocal.getnombre());}
			if(conDefault || (!conDefault && listadoactivosfijosLocal.getfecha_compra()!=null && !listadoactivosfijosLocal.getfecha_compra().equals(new Date()))) {listadoactivosfijosBean.setfecha_compra(listadoactivosfijosLocal.getfecha_compra());}
			if(conDefault || (!conDefault && listadoactivosfijosLocal.getvida_util()!=null && !listadoactivosfijosLocal.getvida_util().equals(0.0))) {listadoactivosfijosBean.setvida_util(listadoactivosfijosLocal.getvida_util());}
			if(conDefault || (!conDefault && listadoactivosfijosLocal.getcosto_de_compra()!=null && !listadoactivosfijosLocal.getcosto_de_compra().equals(0.0))) {listadoactivosfijosBean.setcosto_de_compra(listadoactivosfijosLocal.getcosto_de_compra());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxListadoActivosFijosGenerico(Long idListadoActivosFijosSeleccionado,JComboBox jComboBoxListadoActivosFijos,List<ListadoActivosFijos> listadoactivosfijossLocal)throws Exception {
		try {
			ListadoActivosFijos  listadoactivosfijosTemp=null;

			for(ListadoActivosFijos listadoactivosfijosAux:listadoactivosfijossLocal) {
				if(listadoactivosfijosAux.getId()!=null && listadoactivosfijosAux.getId().equals(idListadoActivosFijosSeleccionado)) {
					listadoactivosfijosTemp=listadoactivosfijosAux;
					break;
				}
			}

			jComboBoxListadoActivosFijos.setSelectedItem(listadoactivosfijosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxListadoActivosFijosGenerico(JComboBox jComboBoxListadoActivosFijos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxListadoActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxListadoActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxListadoActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxListadoActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxListadoActivosFijos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxListadoActivosFijos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxListadoActivosFijos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxListadoActivosFijos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxListadoActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxListadoActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			listadoactivosfijos=(ListadoActivosFijos) listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			listadoactivosfijos =(ListadoActivosFijos) listadoactivosfijoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!listadoactivosfijos.getIsNew() && !listadoactivosfijos.getIsChanged() && !listadoactivosfijos.getIsDeleted()) {
				sDescripcion=listadoactivosfijos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=listadoactivosfijos.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ListadoActivosFijos listadoactivosfijosRow=new ListadoActivosFijos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			listadoactivosfijosRow=(ListadoActivosFijos) listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			listadoactivosfijosRow=(ListadoActivosFijos) listadoactivosfijoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualListadoActivosFijos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoListadoActivosFijos.setVisible((this.isVisibilidadCeldaNuevoListadoActivosFijos && this.isPermisoNuevoListadoActivosFijos));			
			this.jButtonDuplicarListadoActivosFijos.setVisible((this.isVisibilidadCeldaDuplicarListadoActivosFijos && this.isPermisoDuplicarListadoActivosFijos));			
			this.jButtonCopiarListadoActivosFijos.setVisible((this.isVisibilidadCeldaCopiarListadoActivosFijos && this.isPermisoCopiarListadoActivosFijos));
			this.jButtonVerFormListadoActivosFijos.setVisible((this.isVisibilidadCeldaVerFormListadoActivosFijos && this.isPermisoVerFormListadoActivosFijos));
			
			this.jButtonAbrirOrderByListadoActivosFijos.setVisible((this.isVisibilidadCeldaOrdenListadoActivosFijos && this.isPermisoOrdenListadoActivosFijos));			
			
			this.jButtonNuevoRelacionesListadoActivosFijos.setVisible((this.isVisibilidadCeldaNuevoRelacionesListadoActivosFijos && this.isPermisoNuevoListadoActivosFijos));			
			this.jButtonNuevoGuardarCambiosListadoActivosFijos.setVisible((this.isVisibilidadCeldaNuevoListadoActivosFijos && this.isPermisoNuevoListadoActivosFijos && this.isPermisoGuardarCambiosListadoActivosFijos));
			
			if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) {
			this.jInternalFrameDetalleFormListadoActivosFijos.jButtonModificarListadoActivosFijos.setVisible((this.isVisibilidadCeldaModificarListadoActivosFijos && this.isPermisoActualizarListadoActivosFijos));	
			this.jInternalFrameDetalleFormListadoActivosFijos.jButtonActualizarListadoActivosFijos.setVisible((this.isVisibilidadCeldaActualizarListadoActivosFijos && this.isPermisoActualizarListadoActivosFijos));	
			this.jInternalFrameDetalleFormListadoActivosFijos.jButtonEliminarListadoActivosFijos.setVisible((this.isVisibilidadCeldaEliminarListadoActivosFijos && this.isPermisoEliminarListadoActivosFijos));
			this.jInternalFrameDetalleFormListadoActivosFijos.jButtonCancelarListadoActivosFijos.setVisible(this.isVisibilidadCeldaCancelarListadoActivosFijos);							
			this.jInternalFrameDetalleFormListadoActivosFijos.jButtonGuardarCambiosListadoActivosFijos.setVisible((this.isVisibilidadCeldaGuardarListadoActivosFijos && this.isPermisoGuardarCambiosListadoActivosFijos));			
			
			}
						
			this.jButtonGuardarCambiosTablaListadoActivosFijos.setVisible((this.isVisibilidadCeldaGuardarCambiosListadoActivosFijos && this.isPermisoGuardarCambiosListadoActivosFijos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarListadoActivosFijos.setVisible((this.isVisibilidadCeldaNuevoListadoActivosFijos && this.isPermisoNuevoListadoActivosFijos));						
			this.jButtonDuplicarToolBarListadoActivosFijos.setVisible((this.isVisibilidadCeldaDuplicarListadoActivosFijos && this.isPermisoDuplicarListadoActivosFijos));						
			this.jButtonCopiarToolBarListadoActivosFijos.setVisible((this.isVisibilidadCeldaCopiarListadoActivosFijos && this.isPermisoCopiarListadoActivosFijos));			
			this.jButtonVerFormToolBarListadoActivosFijos.setVisible((this.isVisibilidadCeldaVerFormListadoActivosFijos && this.isPermisoVerFormListadoActivosFijos));			
			this.jButtonAbrirOrderByToolBarListadoActivosFijos.setVisible((this.isVisibilidadCeldaOrdenListadoActivosFijos && this.isPermisoOrdenListadoActivosFijos));
			this.jButtonNuevoRelacionesToolBarListadoActivosFijos.setVisible((this.isVisibilidadCeldaNuevoRelacionesListadoActivosFijos && this.isPermisoNuevoListadoActivosFijos));			
			this.jButtonNuevoGuardarCambiosToolBarListadoActivosFijos.setVisible((this.isVisibilidadCeldaNuevoListadoActivosFijos && this.isPermisoNuevoListadoActivosFijos && this.isPermisoGuardarCambiosListadoActivosFijos));			
			
			if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) {
			this.jInternalFrameDetalleFormListadoActivosFijos.jButtonModificarToolBarListadoActivosFijos.setVisible((this.isVisibilidadCeldaModificarListadoActivosFijos && this.isPermisoActualizarListadoActivosFijos));	
			this.jInternalFrameDetalleFormListadoActivosFijos.jButtonActualizarToolBarListadoActivosFijos.setVisible((this.isVisibilidadCeldaActualizarListadoActivosFijos  && this.isPermisoActualizarListadoActivosFijos));	
			this.jInternalFrameDetalleFormListadoActivosFijos.jButtonEliminarToolBarListadoActivosFijos.setVisible((this.isVisibilidadCeldaEliminarListadoActivosFijos && this.isPermisoEliminarListadoActivosFijos));
			this.jInternalFrameDetalleFormListadoActivosFijos.jButtonCancelarToolBarListadoActivosFijos.setVisible(this.isVisibilidadCeldaCancelarListadoActivosFijos);				
			this.jInternalFrameDetalleFormListadoActivosFijos.jButtonGuardarCambiosToolBarListadoActivosFijos.setVisible((this.isVisibilidadCeldaGuardarListadoActivosFijos && this.isPermisoGuardarCambiosListadoActivosFijos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarListadoActivosFijos.setVisible((this.isVisibilidadCeldaGuardarCambiosListadoActivosFijos && this.isPermisoGuardarCambiosListadoActivosFijos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoListadoActivosFijos.setVisible((this.isVisibilidadCeldaNuevoListadoActivosFijos && this.isPermisoNuevoListadoActivosFijos));			
			this.jMenuItemDuplicarListadoActivosFijos.setVisible((this.isVisibilidadCeldaDuplicarListadoActivosFijos && this.isPermisoDuplicarListadoActivosFijos));			
			this.jMenuItemCopiarListadoActivosFijos.setVisible((this.isVisibilidadCeldaCopiarListadoActivosFijos && this.isPermisoCopiarListadoActivosFijos));			
			this.jMenuItemVerFormListadoActivosFijos.setVisible((this.isVisibilidadCeldaVerFormListadoActivosFijos && this.isPermisoVerFormListadoActivosFijos));			
			this.jMenuItemAbrirOrderByListadoActivosFijos.setVisible((this.isVisibilidadCeldaOrdenListadoActivosFijos && this.isPermisoOrdenListadoActivosFijos));			
			//this.jMenuItemMostrarOcultarListadoActivosFijos.setVisible((this.isVisibilidadCeldaOrdenListadoActivosFijos && this.isPermisoOrdenListadoActivosFijos));
			this.jMenuItemDetalleAbrirOrderByListadoActivosFijos.setVisible((this.isVisibilidadCeldaOrdenListadoActivosFijos && this.isPermisoOrdenListadoActivosFijos));			
			//this.jMenuItemDetalleMostrarOcultarListadoActivosFijos.setVisible((this.isVisibilidadCeldaOrdenListadoActivosFijos && this.isPermisoOrdenListadoActivosFijos));			
			this.jMenuItemNuevoRelacionesListadoActivosFijos.setVisible((this.isVisibilidadCeldaNuevoRelacionesListadoActivosFijos && this.isPermisoNuevoListadoActivosFijos));			
			this.jMenuItemNuevoGuardarCambiosListadoActivosFijos.setVisible((this.isVisibilidadCeldaNuevoListadoActivosFijos && this.isPermisoNuevoListadoActivosFijos && this.isPermisoGuardarCambiosListadoActivosFijos));									
			
			if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) {
			this.jInternalFrameDetalleFormListadoActivosFijos.jMenuItemModificarListadoActivosFijos.setVisible((this.isVisibilidadCeldaModificarListadoActivosFijos && this.isPermisoActualizarListadoActivosFijos));	
			this.jInternalFrameDetalleFormListadoActivosFijos.jMenuItemActualizarListadoActivosFijos.setVisible((this.isVisibilidadCeldaActualizarListadoActivosFijos && this.isPermisoActualizarListadoActivosFijos));	
			this.jInternalFrameDetalleFormListadoActivosFijos.jMenuItemEliminarListadoActivosFijos.setVisible((this.isVisibilidadCeldaEliminarListadoActivosFijos && this.isPermisoEliminarListadoActivosFijos));
			this.jInternalFrameDetalleFormListadoActivosFijos.jMenuItemCancelarListadoActivosFijos.setVisible(this.isVisibilidadCeldaCancelarListadoActivosFijos);				
			}
			
			this.jMenuItemGuardarCambiosListadoActivosFijos.setVisible((this.isVisibilidadCeldaGuardarListadoActivosFijos && this.isPermisoGuardarCambiosListadoActivosFijos));						
			this.jMenuItemGuardarCambiosTablaListadoActivosFijos.setVisible((this.isVisibilidadCeldaGuardarCambiosListadoActivosFijos && this.isPermisoGuardarCambiosListadoActivosFijos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoListadoActivosFijos=this.jButtonNuevoListadoActivosFijos.isVisible();
			this.isVisibilidadCeldaDuplicarListadoActivosFijos=this.jButtonDuplicarListadoActivosFijos.isVisible();
			this.isVisibilidadCeldaCopiarListadoActivosFijos=this.jButtonCopiarListadoActivosFijos.isVisible();
			this.isVisibilidadCeldaVerFormListadoActivosFijos=this.jButtonVerFormListadoActivosFijos.isVisible();
			
			this.isVisibilidadCeldaOrdenListadoActivosFijos=this.jButtonAbrirOrderByListadoActivosFijos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesListadoActivosFijos=this.jButtonNuevoRelacionesListadoActivosFijos.isVisible();
			this.isVisibilidadCeldaModificarListadoActivosFijos=this.jButtonModificarListadoActivosFijos.isVisible();
			
			if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) {
			this.isVisibilidadCeldaActualizarListadoActivosFijos=this.jInternalFrameDetalleFormListadoActivosFijos.jButtonActualizarListadoActivosFijos.isVisible();
			this.isVisibilidadCeldaEliminarListadoActivosFijos=this.jInternalFrameDetalleFormListadoActivosFijos.jButtonEliminarListadoActivosFijos.isVisible();
			this.isVisibilidadCeldaCancelarListadoActivosFijos=this.jInternalFrameDetalleFormListadoActivosFijos.jButtonCancelarListadoActivosFijos.isVisible();
			this.isVisibilidadCeldaGuardarListadoActivosFijos=this.jInternalFrameDetalleFormListadoActivosFijos.jButtonGuardarCambiosListadoActivosFijos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosListadoActivosFijos=this.jButtonGuardarCambiosTablaListadoActivosFijos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoListadoActivosFijos=this.jButtonNuevoToolBarListadoActivosFijos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesListadoActivosFijos=this.jButtonNuevoRelacionesToolBarListadoActivosFijos.isVisible();
			
			if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) {
			this.isVisibilidadCeldaModificarListadoActivosFijos=this.jInternalFrameDetalleFormListadoActivosFijos.jButtonModificarToolBarListadoActivosFijos.isVisible();
			this.isVisibilidadCeldaActualizarListadoActivosFijos=this.jInternalFrameDetalleFormListadoActivosFijos.jButtonActualizarToolBarListadoActivosFijos.isVisible();
			this.isVisibilidadCeldaEliminarListadoActivosFijos=this.jInternalFrameDetalleFormListadoActivosFijos.jButtonEliminarToolBarListadoActivosFijos.isVisible();
			this.isVisibilidadCeldaCancelarListadoActivosFijos=this.jInternalFrameDetalleFormListadoActivosFijos.jButtonCancelarToolBarListadoActivosFijos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarListadoActivosFijos=this.jButtonGuardarCambiosToolBarListadoActivosFijos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosListadoActivosFijos=this.jButtonGuardarCambiosTablaToolBarListadoActivosFijos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoListadoActivosFijos=this.jMenuItemNuevoListadoActivosFijos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesListadoActivosFijos=this.jMenuItemNuevoRelacionesListadoActivosFijos.isVisible();
			
			if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) {
			this.isVisibilidadCeldaModificarListadoActivosFijos=this.jInternalFrameDetalleFormListadoActivosFijos.jMenuItemModificarListadoActivosFijos.isVisible();
			this.isVisibilidadCeldaActualizarListadoActivosFijos=this.jInternalFrameDetalleFormListadoActivosFijos.jMenuItemActualizarListadoActivosFijos.isVisible();
			this.isVisibilidadCeldaEliminarListadoActivosFijos=this.jInternalFrameDetalleFormListadoActivosFijos.jMenuItemEliminarListadoActivosFijos.isVisible();
			this.isVisibilidadCeldaCancelarListadoActivosFijos=this.jInternalFrameDetalleFormListadoActivosFijos.jMenuItemCancelarListadoActivosFijos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarListadoActivosFijos=this.jMenuItemGuardarCambiosListadoActivosFijos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosListadoActivosFijos=this.jMenuItemGuardarCambiosTablaListadoActivosFijos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesListadoActivosFijos(Boolean esInicializar) {
		if(ListadoActivosFijosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.listadoactivosfijosSessionBean.getConGuardarRelaciones()) {
				//if(this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesListadoActivosFijos();
			}
			
			this.inicializarActualizarBindingBotonesManualListadoActivosFijos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualListadoActivosFijos() {
		this.jButtonNuevoListadoActivosFijos.setVisible(this.isPermisoNuevoListadoActivosFijos);			
		this.jButtonDuplicarListadoActivosFijos.setVisible(this.isPermisoDuplicarListadoActivosFijos);			
		this.jButtonCopiarListadoActivosFijos.setVisible(this.isPermisoCopiarListadoActivosFijos);			
		this.jButtonVerFormListadoActivosFijos.setVisible(this.isPermisoVerFormListadoActivosFijos);			
		
		this.jButtonAbrirOrderByListadoActivosFijos.setVisible(this.isPermisoOrdenListadoActivosFijos);					
		
		this.jButtonNuevoRelacionesListadoActivosFijos.setVisible(this.isPermisoNuevoListadoActivosFijos);			
		
		if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoActivosFijos.jButtonModificarListadoActivosFijos.setVisible(this.isPermisoActualizarListadoActivosFijos);	
			this.jInternalFrameDetalleFormListadoActivosFijos.jButtonActualizarListadoActivosFijos.setVisible(this.isPermisoActualizarListadoActivosFijos);	
			this.jInternalFrameDetalleFormListadoActivosFijos.jButtonEliminarListadoActivosFijos.setVisible(this.isPermisoEliminarListadoActivosFijos);
			this.jInternalFrameDetalleFormListadoActivosFijos.jButtonCancelarListadoActivosFijos.setVisible(this.isVisibilidadCeldaCancelarListadoActivosFijos);						
			this.jInternalFrameDetalleFormListadoActivosFijos.jButtonGuardarCambiosListadoActivosFijos.setVisible(this.isPermisoGuardarCambiosListadoActivosFijos);							
		}
		
		this.jButtonGuardarCambiosTablaListadoActivosFijos.setVisible(this.isPermisoActualizarListadoActivosFijos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleListadoActivosFijos() {
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonModificarListadoActivosFijos.setVisible(this.isPermisoActualizarListadoActivosFijos);	
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonActualizarListadoActivosFijos.setVisible(this.isPermisoActualizarListadoActivosFijos);	
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonEliminarListadoActivosFijos.setVisible(this.isPermisoEliminarListadoActivosFijos);
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonCancelarListadoActivosFijos.setVisible(this.isVisibilidadCeldaCancelarListadoActivosFijos);							
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonGuardarCambiosListadoActivosFijos.setVisible((this.isVisibilidadCeldaGuardarListadoActivosFijos && this.isPermisoGuardarCambiosListadoActivosFijos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosListadoActivosFijos() {
		if(ListadoActivosFijosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualListadoActivosFijos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesListadoActivosFijos() {
	}
	
	public void jTableDatosListadoActivosFijosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarListadoActivosFijos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidListadoActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoActivosFijos(this.getlistadoactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoActivosFijos(this.listadoactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoactivosfijos==null) {
						this.listadoactivosfijos = new ListadoActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualListadoActivosFijos(this.listadoactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoActivosFijos(this.listadoactivosfijos);
				}

				if(this.listadoactivosfijos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.listadoactivosfijos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaListadoActivosFijosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebListadoActivosFijos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoActivosFijos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosListadoActivosFijos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosListadoActivosFijos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualListadoActivosFijos(this.getlistadoactivosfijos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysListadoActivosFijos(this.listadoactivosfijos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.listadoactivosfijosLogic.getConnexion());

				if(this.listadoactivosfijos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.listadoactivosfijos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderListadoActivosFijos=(TitledBorder)this.jScrollPanelDatosListadoActivosFijos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderListadoActivosFijos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaListadoActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoActivosFijos(this.getlistadoactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoActivosFijos(this.listadoactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoactivosfijos==null) {
						this.listadoactivosfijos = new ListadoActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualListadoActivosFijos(this.listadoactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoActivosFijos(this.listadoactivosfijos);
				}

				if(this.listadoactivosfijos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.listadoactivosfijos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_sub_grupoListadoActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoActivosFijos(this.getlistadoactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoActivosFijos(this.listadoactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoactivosfijos==null) {
						this.listadoactivosfijos = new ListadoActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualListadoActivosFijos(this.listadoactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoActivosFijos(this.listadoactivosfijos);
				}

				if(this.listadoactivosfijos.getcodigo_sub_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_sub_grupo like '%"+this.listadoactivosfijos.getcodigo_sub_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_sub_grupoListadoActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoActivosFijos(this.getlistadoactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoActivosFijos(this.listadoactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoactivosfijos==null) {
						this.listadoactivosfijos = new ListadoActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualListadoActivosFijos(this.listadoactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoActivosFijos(this.listadoactivosfijos);
				}

				if(this.listadoactivosfijos.getnombre_sub_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_sub_grupo like '%"+this.listadoactivosfijos.getnombre_sub_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_detalle_grupoListadoActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoActivosFijos(this.getlistadoactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoActivosFijos(this.listadoactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoactivosfijos==null) {
						this.listadoactivosfijos = new ListadoActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualListadoActivosFijos(this.listadoactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoActivosFijos(this.listadoactivosfijos);
				}

				if(this.listadoactivosfijos.getcodigo_detalle_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_detalle_grupo like '%"+this.listadoactivosfijos.getcodigo_detalle_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_detalle_grupoListadoActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoActivosFijos(this.getlistadoactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoActivosFijos(this.listadoactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoactivosfijos==null) {
						this.listadoactivosfijos = new ListadoActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualListadoActivosFijos(this.listadoactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoActivosFijos(this.listadoactivosfijos);
				}

				if(this.listadoactivosfijos.getnombre_detalle_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_detalle_grupo like '%"+this.listadoactivosfijos.getnombre_detalle_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonclaveListadoActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoActivosFijos(this.getlistadoactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoActivosFijos(this.listadoactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoactivosfijos==null) {
						this.listadoactivosfijos = new ListadoActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualListadoActivosFijos(this.listadoactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoActivosFijos(this.listadoactivosfijos);
				}

				if(this.listadoactivosfijos.getclave()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where clave like '%"+this.listadoactivosfijos.getclave()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreListadoActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoActivosFijos(this.getlistadoactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoActivosFijos(this.listadoactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoactivosfijos==null) {
						this.listadoactivosfijos = new ListadoActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualListadoActivosFijos(this.listadoactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoActivosFijos(this.listadoactivosfijos);
				}

				if(this.listadoactivosfijos.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.listadoactivosfijos.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_compraListadoActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoActivosFijos(this.getlistadoactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoActivosFijos(this.listadoactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoactivosfijos==null) {
						this.listadoactivosfijos = new ListadoActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualListadoActivosFijos(this.listadoactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoActivosFijos(this.listadoactivosfijos);
				}

				if(this.listadoactivosfijos.getfecha_compra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_compra = '"+Funciones2.getStringPostgresDate(this.listadoactivosfijos.getfecha_compra())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvida_utilListadoActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoActivosFijos(this.getlistadoactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoActivosFijos(this.listadoactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoactivosfijos==null) {
						this.listadoactivosfijos = new ListadoActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualListadoActivosFijos(this.listadoactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoActivosFijos(this.listadoactivosfijos);
				}

				if(this.listadoactivosfijos.getvida_util()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where vida_util = "+this.listadoactivosfijos.getvida_util().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_de_compraListadoActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadoActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadoActivosFijos(this.getlistadoactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoActivosFijos(this.listadoactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadoactivosfijos==null) {
						this.listadoactivosfijos = new ListadoActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualListadoActivosFijos(this.listadoactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoActivosFijos(this.listadoactivosfijos);
				}

				if(this.listadoactivosfijos.getcosto_de_compra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_de_compra = "+this.listadoactivosfijos.getcosto_de_compra().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadoActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaListadoActivosFijosListadoActivosFijosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingListadoActivosFijos(false,false);

			this.getListadoActivosFijossBusquedaListadoActivosFijos();

			this.inicializarActualizarBindingListadoActivosFijos(false);

			//if(ListadoActivosFijosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingListadoActivosFijos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaListadoActivosFijosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingListadoActivosFijos(false,false);

			this.getListadoActivosFijossFK_IdEmpresa();

			this.inicializarActualizarBindingListadoActivosFijos(false);

			//if(ListadoActivosFijosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingListadoActivosFijos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadoactivosfijosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameListadoActivosFijos() {
		if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) {
			this.jInternalFrameDetalleFormListadoActivosFijos.setVisible(false);	    			
			this.jInternalFrameDetalleFormListadoActivosFijos.dispose();
			this.jInternalFrameDetalleFormListadoActivosFijos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoListadoActivosFijos!=null) {
			this.jInternalFrameReporteDinamicoListadoActivosFijos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoListadoActivosFijos.dispose();
			this.jInternalFrameReporteDinamicoListadoActivosFijos=null;
		}
		
		if(this.jInternalFrameImportacionListadoActivosFijos!=null) {
			this.jInternalFrameImportacionListadoActivosFijos.setVisible(false);	    			
			this.jInternalFrameImportacionListadoActivosFijos.dispose();
			this.jInternalFrameImportacionListadoActivosFijos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessListadoActivosFijos();
			
			ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
			
			
			if(sTipo.equals("NuevoListadoActivosFijos")) {
				jButtonNuevoListadoActivosFijosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarListadoActivosFijos")) {
				jButtonDuplicarListadoActivosFijosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarListadoActivosFijos")) {
				jButtonCopiarListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("VerFormListadoActivosFijos")) {
				jButtonVerFormListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarListadoActivosFijos")) {
				jButtonNuevoListadoActivosFijosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarListadoActivosFijos")) {
				jButtonDuplicarListadoActivosFijosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoListadoActivosFijos")) {
				jButtonNuevoListadoActivosFijosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarListadoActivosFijos")) {
				jButtonDuplicarListadoActivosFijosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesListadoActivosFijos")) {
				jButtonNuevoListadoActivosFijosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarListadoActivosFijos")) {
				jButtonNuevoListadoActivosFijosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesListadoActivosFijos")) {
				jButtonNuevoListadoActivosFijosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarListadoActivosFijos")) {
				jButtonModificarListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarListadoActivosFijos")) {
				jButtonModificarListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarListadoActivosFijos")) {
				jButtonModificarListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarListadoActivosFijos")) {
				jButtonActualizarListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarListadoActivosFijos")) {
				jButtonActualizarListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarListadoActivosFijos")) {
				jButtonActualizarListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("EliminarListadoActivosFijos")) {
				jButtonEliminarListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarListadoActivosFijos")) {
				jButtonEliminarListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarListadoActivosFijos")) {
				jButtonEliminarListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("CancelarListadoActivosFijos")) {
				jButtonCancelarListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarListadoActivosFijos")) {
				jButtonCancelarListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarListadoActivosFijos")) {
				jButtonCancelarListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("CerrarListadoActivosFijos")) {
				jButtonCerrarListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarListadoActivosFijos")) {
				jButtonCerrarListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarListadoActivosFijos")) {
				jButtonCerrarListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarListadoActivosFijos")) {
				jButtonMostrarOcultarListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarListadoActivosFijos")) {
				jButtonCancelarListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosListadoActivosFijos")) {
				jButtonGuardarCambiosListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarListadoActivosFijos")) {
				jButtonGuardarCambiosListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarListadoActivosFijos")) {
				jButtonCopiarListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarListadoActivosFijos")) {
				jButtonVerFormListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosListadoActivosFijos")) {
				jButtonGuardarCambiosListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarListadoActivosFijos")) {
				jButtonCopiarListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormListadoActivosFijos")) {
				jButtonVerFormListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaListadoActivosFijos")) {
				jButtonGuardarCambiosListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarListadoActivosFijos")) {
				jButtonGuardarCambiosListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaListadoActivosFijos")) {
				jButtonGuardarCambiosListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionListadoActivosFijos")) {
				jButtonRecargarInformacionListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarListadoActivosFijos")) {
				jButtonRecargarInformacionListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionListadoActivosFijos")) {
				jButtonRecargarInformacionListadoActivosFijosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresListadoActivosFijos")) {
				jButtonAnterioresListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarListadoActivosFijos")) {
				jButtonAnterioresListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreListadoActivosFijos")) {
				jButtonAnterioresListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesListadoActivosFijos")) {
				jButtonSiguientesListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarListadoActivosFijos")) {
				jButtonSiguientesListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesListadoActivosFijos")) {
				jButtonSiguientesListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByListadoActivosFijos") || sTipo.equals("MenuItemDetalleAbrirOrderByListadoActivosFijos")) {
				jButtonAbrirOrderByListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarListadoActivosFijos") || sTipo.equals("MenuItemDetalleMostrarOcultarListadoActivosFijos")) {
				jButtonMostrarOcultarListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosListadoActivosFijos")) {
				jButtonNuevoGuardarCambiosListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarListadoActivosFijos")) {
				jButtonNuevoGuardarCambiosListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosListadoActivosFijos")) {
				jButtonNuevoGuardarCambiosListadoActivosFijosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoListadoActivosFijos")) {
				jButtonCerrarReporteDinamicoListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoListadoActivosFijos")) {
				jButtonGenerarReporteDinamicoListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoListadoActivosFijos")) {
				
				jButtonGenerarExcelReporteDinamicoListadoActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionListadoActivosFijos")) {
				jButtonCerrarImportacionListadoActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionListadoActivosFijos")) {
				
				jButtonGenerarImportacionListadoActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionListadoActivosFijos")) {
				
				jButtonAbrirImportacionListadoActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesListadoActivosFijos")) {
				jComboBoxTiposAccionesListadoActivosFijosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesListadoActivosFijos")) {
				jComboBoxTiposRelacionesListadoActivosFijosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioListadoActivosFijos")) {
				jComboBoxTiposAccionesListadoActivosFijosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarListadoActivosFijos")) {
				
				jComboBoxTiposSeleccionarListadoActivosFijosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralListadoActivosFijos")) {
				jTextFieldValorCampoGeneralListadoActivosFijosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByListadoActivosFijos")) {
				jButtonAbrirOrderByListadoActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarListadoActivosFijos")) {
				jButtonAbrirOrderByListadoActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByListadoActivosFijos")) {
				jButtonCerrarOrderByListadoActivosFijosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idListadoActivosFijosBusqueda")) {
				this.jButtonidListadoActivosFijosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaListadoActivosFijosUpdate")) {
				this.jButtonid_empresaListadoActivosFijosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaListadoActivosFijosBusqueda")) {
				this.jButtonid_empresaListadoActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_sub_grupoListadoActivosFijosBusqueda")) {
				this.jButtoncodigo_sub_grupoListadoActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sub_grupoListadoActivosFijosBusqueda")) {
				this.jButtonnombre_sub_grupoListadoActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_detalle_grupoListadoActivosFijosBusqueda")) {
				this.jButtoncodigo_detalle_grupoListadoActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_detalle_grupoListadoActivosFijosBusqueda")) {
				this.jButtonnombre_detalle_grupoListadoActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("claveListadoActivosFijosBusqueda")) {
				this.jButtonclaveListadoActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreListadoActivosFijosBusqueda")) {
				this.jButtonnombreListadoActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_compraListadoActivosFijosBusqueda")) {
				this.jButtonfecha_compraListadoActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("vida_utilListadoActivosFijosBusqueda")) {
				this.jButtonvida_utilListadoActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_de_compraListadoActivosFijosBusqueda")) {
				this.jButtoncosto_de_compraListadoActivosFijosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaListadoActivosFijosListadoActivosFijos")) {
				this.jButtonBusquedaListadoActivosFijosListadoActivosFijosActionPerformed(evt);
			}
			
			;
			
			
			ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessListadoActivosFijos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadoActivosFijosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoactivosfijos);
				
				ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
				
				


				
				ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadoActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoActivosFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ListadoActivosFijos listadoactivosfijosLocal=null;
			
			if(!this.getEsControlTabla()) {
				listadoactivosfijosLocal=this.listadoactivosfijos;
			} else {
				listadoactivosfijosLocal=this.listadoactivosfijosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoactivosfijos);
				
				ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
							
				
				


				
				ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadoActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoActivosFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadoActivosFijosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadoActivosFijos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosAnterior =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoactivosfijosAnterior =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
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
			
			ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
			
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
			
			


			
			ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadoActivosFijosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoactivosfijos);
				
				ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
								
						
				


				
				ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadoActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoActivosFijos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoactivosfijos);
				
				ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
								
				
				


				
				ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadoActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoActivosFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadoActivosFijosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadoActivosFijos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosAnterior =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoactivosfijosAnterior =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoactivosfijos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadoActivosFijosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadoActivosFijos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosAnterior =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoactivosfijosAnterior =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadoActivosFijosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoactivosfijos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.listadoactivosfijos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoactivosfijos);
				
				ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
							
				
				


				
				ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadoActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoActivosFijos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadoActivosFijosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosListadoActivosFijos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoactivosfijosAnterior =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.listadoactivosfijosAnterior =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
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
			
			ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
			
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
			
			


			
			ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadoActivosFijosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoactivosfijos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.listadoactivosfijos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoactivosfijos);
				
				ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
								
				
				


				
				ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadoActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoActivosFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadoActivosFijosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadoActivosFijos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosAnterior =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoactivosfijosAnterior =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadoActivosFijosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoactivosfijos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.listadoactivosfijos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadoActivosFijosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoactivosfijos);
				
				ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosListadoActivosFijos")) {
					jCheckBoxSeleccionarTodosListadoActivosFijosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosListadoActivosFijos")) {
					jCheckBoxSeleccionadosListadoActivosFijosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarListadoActivosFijos")) {
					
				}
				
				


				
				
				ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadoActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoActivosFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoactivosfijos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.listadoactivosfijos);
				
				ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
												
				
				


				
				
				ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadoActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoActivosFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadoActivosFijosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosListadoActivosFijos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadoactivosfijosAnterior =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.listadoactivosfijosAnterior =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadoActivosFijosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoactivosfijos);
				
				ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
				
				
				ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
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
			
			ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
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
			
			


			
			ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadoActivosFijosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoactivosfijos);
				
				ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadoActivosFijos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoActivosFijos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadoactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadoactivosfijos);
				
				ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
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
				
				


				
				ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadoActivosFijos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadoActivosFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadoActivosFijosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadoActivosFijos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadoactivosfijosAnterior =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadoactivosfijosAnterior =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarListadoActivosFijos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosListadoActivosFijosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosListadoActivosFijos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.listadoactivosfijos =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.listadoactivosfijos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarListadoActivosFijos")) {
				
				}
				
				ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarListadoActivosFijos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosListadoActivosFijos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarListadoActivosFijos")) {
			
			}
			
			ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessListadoActivosFijos();
			
			ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
			
			if(sTipo.equals("NuevoListadoActivosFijos")) {
				jButtonNuevoListadoActivosFijosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarListadoActivosFijos")) {
				jButtonDuplicarListadoActivosFijosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarListadoActivosFijos")) {
				jButtonCopiarListadoActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormListadoActivosFijos")) {
				jButtonVerFormListadoActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesListadoActivosFijos")) {
				jButtonNuevoListadoActivosFijosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarListadoActivosFijos")) {
				jButtonModificarListadoActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarListadoActivosFijos")) {
				jButtonActualizarListadoActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarListadoActivosFijos")) {
				jButtonEliminarListadoActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaListadoActivosFijos")) {
				jButtonGuardarCambiosListadoActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarListadoActivosFijos")) {
				jButtonCancelarListadoActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarListadoActivosFijos")) {
				jButtonCerrarListadoActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosListadoActivosFijos")) {
				jButtonGuardarCambiosListadoActivosFijosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosListadoActivosFijos")) {
				jButtonNuevoGuardarCambiosListadoActivosFijosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByListadoActivosFijos")) {
				jButtonAbrirOrderByListadoActivosFijosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionListadoActivosFijos")) {
				jButtonRecargarInformacionListadoActivosFijosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresListadoActivosFijos")) {
				jButtonAnterioresListadoActivosFijosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesListadoActivosFijos")) {
				jButtonSiguientesListadoActivosFijosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idListadoActivosFijosBusqueda")) {
				this.jButtonidListadoActivosFijosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaListadoActivosFijosUpdate")) {
				this.jButtonid_empresaListadoActivosFijosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaListadoActivosFijosBusqueda")) {
				this.jButtonid_empresaListadoActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_sub_grupoListadoActivosFijosBusqueda")) {
				this.jButtoncodigo_sub_grupoListadoActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sub_grupoListadoActivosFijosBusqueda")) {
				this.jButtonnombre_sub_grupoListadoActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_detalle_grupoListadoActivosFijosBusqueda")) {
				this.jButtoncodigo_detalle_grupoListadoActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_detalle_grupoListadoActivosFijosBusqueda")) {
				this.jButtonnombre_detalle_grupoListadoActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("claveListadoActivosFijosBusqueda")) {
				this.jButtonclaveListadoActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreListadoActivosFijosBusqueda")) {
				this.jButtonnombreListadoActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_compraListadoActivosFijosBusqueda")) {
				this.jButtonfecha_compraListadoActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("vida_utilListadoActivosFijosBusqueda")) {
				this.jButtonvida_utilListadoActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_de_compraListadoActivosFijosBusqueda")) {
				this.jButtoncosto_de_compraListadoActivosFijosBusquedaActionPerformed(evt);
			}
			
			ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessListadoActivosFijos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameListadoActivosFijos")) {
				closingInternalFrameListadoActivosFijos();
				
			} else if(sTipo.equals("jButtonCancelarListadoActivosFijos")) {
				JInternalFrameBase jInternalFrameDetalleFormListadoActivosFijos = (JInternalFrameBase)evt.getSource();
	            	
	            ListadoActivosFijosBeanSwingJInternalFrame jInternalFrameParent=(ListadoActivosFijosBeanSwingJInternalFrame)jInternalFrameDetalleFormListadoActivosFijos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarListadoActivosFijosActionPerformed(null);
			}
			
			ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.listadoactivosfijos,new Object(),this.listadoactivosfijosParameterGeneral,this.listadoactivosfijosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormListadoActivosFijos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormListadoActivosFijos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormListadoActivosFijos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.listadoactivosfijos)) {
			if(!esControlTabla) {
				if(ListadoActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualListadoActivosFijos(this.listadoactivosfijos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoActivosFijos(this.listadoactivosfijos);			
				}
				
				if(this.listadoactivosfijosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualListadoActivosFijos(this.listadoactivosfijos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanListadoActivosFijos(this.listadoactivosfijosReturnGeneral,this.listadoactivosfijosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.listadoactivosfijosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanListadoActivosFijos(classes,this.listadoactivosfijosReturnGeneral,this.listadoactivosfijosBean,false);
					}
						
					if(this.listadoactivosfijosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyListadoActivosFijos(this.listadoactivosfijosReturnGeneral.getListadoActivosFijos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioListadoActivosFijos(this.listadoactivosfijosReturnGeneral.getListadoActivosFijos());	
					}
						
					if(this.listadoactivosfijosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioListadoActivosFijos(this.listadoactivosfijosReturnGeneral.getListadoActivosFijos(),classes);//this.listadoactivosfijosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioListadoActivosFijos(this.listadoactivosfijos,classes);//this.listadoactivosfijosBean);									
				}
			
				if(ListadoActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualListadoActivosFijos(this.listadoactivosfijos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysListadoActivosFijos(this.listadoactivosfijos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.listadoactivosfijosAnterior!=null) {
						this.listadoactivosfijos=this.listadoactivosfijosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.listadoactivosfijosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.listadoactivosfijosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.listadoactivosfijosReturnGeneral.getListadoActivosFijos(),listadoactivosfijosLogic.getListadoActivosFijoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.listadoactivosfijosReturnGeneral.getListadoActivosFijos(),this.listadoactivosfijoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosListadoActivosFijos.repaint();
				
				//((AbstractTableModel) this.jTableDatosListadoActivosFijos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosListadoActivosFijos();
			}
		}
	}
	
	public void actualizarVisualTableDatosListadoActivosFijos() throws Exception {
		
		ListadoActivosFijosModel listadoactivosfijosModel=(ListadoActivosFijosModel)this.jTableDatosListadoActivosFijos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			listadoactivosfijosModel.listadoactivosfijoss=this.listadoactivosfijosLogic.getListadoActivosFijoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			listadoactivosfijosModel.listadoactivosfijoss=this.listadoactivosfijoss;
		}
		
		
		((ListadoActivosFijosModel) this.jTableDatosListadoActivosFijos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaListadoActivosFijos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getlistadoactivosfijosAnterior(),this.listadoactivosfijosLogic.getListadoActivosFijoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getlistadoactivosfijosAnterior(),this.listadoactivosfijoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosListadoActivosFijos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioListadoActivosFijos(ListadoActivosFijos listadoactivosfijos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
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
										
				ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.listadoactivosfijos,new Object(),generalEntityParameterGeneral,this.listadoactivosfijosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.listadoactivosfijosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ListadoActivosFijosConstantesFunciones.getClassesRelationshipsOfListadoActivosFijos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ListadoActivosFijosConstantesFunciones.getClassesRelationshipsFromStringsOfListadoActivosFijos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormListadoActivosFijos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ListadoActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.listadoactivosfijos,new Object(),generalEntityParameterGeneral,this.listadoactivosfijosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioListadoActivosFijos(ListadoActivosFijosBean listadoactivosfijosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanListadoActivosFijos(ArrayList<Classe> classes,ListadoActivosFijosReturnGeneral listadoactivosfijosReturnGeneral,ListadoActivosFijosBean listadoactivosfijosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualListadoActivosFijos(ListadoActivosFijos listadoactivosfijos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.listadoactivosfijos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormListadoActivosFijos = new ListadoActivosFijosDetalleFormJInternalFrame(jDesktopPane,this.listadoactivosfijosSessionBean.getConGuardarRelaciones(),this.listadoactivosfijosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormListadoActivosFijos);
		this.jInternalFrameDetalleFormListadoActivosFijos.setVisible(false);
		this.jInternalFrameDetalleFormListadoActivosFijos.setSelected(false);						
		
		this.jInternalFrameDetalleFormListadoActivosFijos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormListadoActivosFijos.listadoactivosfijosLogic=this.listadoactivosfijosLogic;
		
		this.cargarCombosFrameForeignKeyListadoActivosFijos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleListadoActivosFijos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleListadoActivosFijos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyListadoActivosFijos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyListadoActivosFijos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormListadoActivosFijos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarListadoActivosFijos"));
		
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonModificarListadoActivosFijos.addActionListener(new ButtonActionListener(this,"ModificarListadoActivosFijos"));

		
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonModificarToolBarListadoActivosFijos.addActionListener(new ButtonActionListener(this,"ModificarToolBarListadoActivosFijos"));
					
		this.jInternalFrameDetalleFormListadoActivosFijos.jMenuItemModificarListadoActivosFijos.addActionListener(new ButtonActionListener(this,"MenuItemModificarListadoActivosFijos"));		
		
		
		
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonActualizarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"ActualizarListadoActivosFijos"));
		
		
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonActualizarToolBarListadoActivosFijos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarListadoActivosFijos"));
						
		this.jInternalFrameDetalleFormListadoActivosFijos.jMenuItemActualizarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarListadoActivosFijos"));		
		
		
		
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonEliminarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"EliminarListadoActivosFijos"));
		
		
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonEliminarToolBarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"EliminarToolBarListadoActivosFijos"));
								
		this.jInternalFrameDetalleFormListadoActivosFijos.jMenuItemEliminarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarListadoActivosFijos"));		
		
		
		
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonCancelarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"CancelarListadoActivosFijos"));
		
		
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonCancelarToolBarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"CancelarToolBarListadoActivosFijos"));
					
		this.jInternalFrameDetalleFormListadoActivosFijos.jMenuItemCancelarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarListadoActivosFijos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormListadoActivosFijos.jMenuItemDetalleCerrarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarListadoActivosFijos"));		
		
		
		
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonGuardarCambiosToolBarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarListadoActivosFijos"));
		
		
		
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonGuardarCambiosToolBarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarListadoActivosFijos"));
		
		
		
		this.jInternalFrameDetalleFormListadoActivosFijos.jComboBoxTiposAccionesFormularioListadoActivosFijos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioListadoActivosFijos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonidListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"idListadoActivosFijosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonid_empresaListadoActivosFijosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaListadoActivosFijosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonid_empresaListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaListadoActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtoncodigo_sub_grupoListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sub_grupoListadoActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonnombre_sub_grupoListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sub_grupoListadoActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtoncodigo_detalle_grupoListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_detalle_grupoListadoActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonnombre_detalle_grupoListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_detalle_grupoListadoActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonclaveListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"claveListadoActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonnombreListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombreListadoActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonfecha_compraListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_compraListadoActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonvida_utilListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"vida_utilListadoActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtoncosto_de_compraListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"costo_de_compraListadoActivosFijosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormListadoActivosFijos.jTabbedPaneRelacionesListadoActivosFijos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesListadoActivosFijos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameListadoActivosFijos"));
		
		if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoActivosFijos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarListadoActivosFijos"));
		}
		
		this.jTableDatosListadoActivosFijos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarListadoActivosFijos"));
		
		this.jTableDatosListadoActivosFijos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarListadoActivosFijos"));
		
		this.jButtonNuevoListadoActivosFijos.addActionListener(new ButtonActionListener(this,"NuevoListadoActivosFijos"));
		
		this.jButtonDuplicarListadoActivosFijos.addActionListener(new ButtonActionListener(this,"DuplicarListadoActivosFijos"));
		
		this.jButtonCopiarListadoActivosFijos.addActionListener(new ButtonActionListener(this,"CopiarListadoActivosFijos"));
		
		this.jButtonVerFormListadoActivosFijos.addActionListener(new ButtonActionListener(this,"VerFormListadoActivosFijos"));
		
		
		this.jButtonNuevoToolBarListadoActivosFijos.addActionListener(new ButtonActionListener(this,"NuevoToolBarListadoActivosFijos"));
			
		this.jButtonDuplicarToolBarListadoActivosFijos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarListadoActivosFijos"));
			
		this.jMenuItemNuevoListadoActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoListadoActivosFijos"));
			
		this.jMenuItemDuplicarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarListadoActivosFijos"));		
		
		
		this.jButtonNuevoRelacionesListadoActivosFijos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesListadoActivosFijos"));
		
		
		this.jButtonNuevoRelacionesToolBarListadoActivosFijos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarListadoActivosFijos"));
			
		this.jMenuItemNuevoRelacionesListadoActivosFijos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesListadoActivosFijos"));		
		
		
		if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoActivosFijos.jButtonModificarListadoActivosFijos.addActionListener(new ButtonActionListener(this,"ModificarListadoActivosFijos"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoActivosFijos.jButtonModificarToolBarListadoActivosFijos.addActionListener(new ButtonActionListener(this,"ModificarToolBarListadoActivosFijos"));
			
			this.jInternalFrameDetalleFormListadoActivosFijos.jMenuItemModificarListadoActivosFijos.addActionListener(new ButtonActionListener(this,"MenuItemModificarListadoActivosFijos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormListadoActivosFijos.jButtonActualizarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"ActualizarListadoActivosFijos"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoActivosFijos.jButtonActualizarToolBarListadoActivosFijos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarListadoActivosFijos"));
				
			this.jInternalFrameDetalleFormListadoActivosFijos.jMenuItemActualizarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarListadoActivosFijos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoActivosFijos.jButtonEliminarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"EliminarListadoActivosFijos"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoActivosFijos.jButtonEliminarToolBarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"EliminarToolBarListadoActivosFijos"));
						
			this.jInternalFrameDetalleFormListadoActivosFijos.jMenuItemEliminarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarListadoActivosFijos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoActivosFijos.jButtonCancelarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"CancelarListadoActivosFijos"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoActivosFijos.jButtonCancelarToolBarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"CancelarToolBarListadoActivosFijos"));
			
			this.jInternalFrameDetalleFormListadoActivosFijos.jMenuItemCancelarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarListadoActivosFijos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarListadoActivosFijos"));		
		
		
		this.jButtonCerrarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"CerrarListadoActivosFijos"));
		
		
		this.jButtonCerrarToolBarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"CerrarToolBarListadoActivosFijos"));
			
		this.jMenuItemCerrarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarListadoActivosFijos"));
			
		if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoActivosFijos.jMenuItemDetalleCerrarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarListadoActivosFijos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoActivosFijos.jButtonGuardarCambiosListadoActivosFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosListadoActivosFijos"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoActivosFijos.jButtonGuardarCambiosToolBarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarListadoActivosFijos"));
		}
		
		this.jButtonCopiarToolBarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"CopiarToolBarListadoActivosFijos"));
			
		this.jButtonVerFormToolBarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"VerFormToolBarListadoActivosFijos"));
		
		this.jMenuItemGuardarCambiosListadoActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosListadoActivosFijos"));
			
		this.jMenuItemCopiarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarListadoActivosFijos"));		
		
		this.jMenuItemVerFormListadoActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormListadoActivosFijos"));		
		
		
		this.jButtonGuardarCambiosTablaListadoActivosFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaListadoActivosFijos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarListadoActivosFijos"));
			
		this.jMenuItemGuardarCambiosTablaListadoActivosFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaListadoActivosFijos"));		
		
		
		
		this.jButtonRecargarInformacionListadoActivosFijos.addActionListener (new ButtonActionListener(this,"RecargarInformacionListadoActivosFijos"));
					
		this.jButtonRecargarInformacionToolBarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarListadoActivosFijos"));
		
		this.jMenuItemRecargarInformacionListadoActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionListadoActivosFijos"));		
		
		
		
		this.jButtonAnterioresListadoActivosFijos.addActionListener (new ButtonActionListener(this,"AnterioresListadoActivosFijos"));
		
		
		this.jButtonAnterioresToolBarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarListadoActivosFijos"));
		
		this.jMenuItemAnterioresListadoActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresListadoActivosFijos"));		
		
		
		this.jButtonSiguientesListadoActivosFijos.addActionListener (new ButtonActionListener(this,"SiguientesListadoActivosFijos"));
		
		
		this.jButtonSiguientesToolBarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarListadoActivosFijos"));
			
		this.jMenuItemSiguientesListadoActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesListadoActivosFijos"));
			
		this.jMenuItemAbrirOrderByListadoActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByListadoActivosFijos"));
			
		this.jMenuItemMostrarOcultarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarListadoActivosFijos"));
			
		this.jMenuItemDetalleAbrirOrderByListadoActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByListadoActivosFijos"));
			
		this.jMenuItemDetalleMostarOcultarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarListadoActivosFijos"));		
		
		
		this.jButtonNuevoGuardarCambiosListadoActivosFijos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosListadoActivosFijos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarListadoActivosFijos"));
			
		this.jMenuItemNuevoGuardarCambiosListadoActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosListadoActivosFijos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosListadoActivosFijos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosListadoActivosFijos"));

		this.jCheckBoxSeleccionadosListadoActivosFijos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosListadoActivosFijos"));
		
		if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoActivosFijos.jComboBoxTiposAccionesFormularioListadoActivosFijos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioListadoActivosFijos"));
		}
		
		
		this.jComboBoxTiposRelacionesListadoActivosFijos.addActionListener (new ButtonActionListener(this,"TiposRelacionesListadoActivosFijos"));
			
		this.jComboBoxTiposAccionesListadoActivosFijos.addActionListener (new ButtonActionListener(this,"TiposAccionesListadoActivosFijos"));
					
		this.jComboBoxTiposSeleccionarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarListadoActivosFijos"));
			
		this.jTextFieldValorCampoGeneralListadoActivosFijos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralListadoActivosFijos"));		
		
		
		if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonidListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"idListadoActivosFijosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonid_empresaListadoActivosFijosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaListadoActivosFijosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonid_empresaListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaListadoActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtoncodigo_sub_grupoListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sub_grupoListadoActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonnombre_sub_grupoListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sub_grupoListadoActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtoncodigo_detalle_grupoListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_detalle_grupoListadoActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonnombre_detalle_grupoListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_detalle_grupoListadoActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonclaveListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"claveListadoActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonnombreListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombreListadoActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonfecha_compraListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_compraListadoActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonvida_utilListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"vida_utilListadoActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtoncosto_de_compraListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"costo_de_compraListadoActivosFijosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaListadoActivosFijosListadoActivosFijos.addActionListener(new ButtonActionListener(this,"BusquedaListadoActivosFijosListadoActivosFijos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoListadoActivosFijos!=null) {
				this.jInternalFrameReporteDinamicoListadoActivosFijos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoListadoActivosFijos"));
				this.jInternalFrameReporteDinamicoListadoActivosFijos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoListadoActivosFijos"));
				this.jInternalFrameReporteDinamicoListadoActivosFijos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoListadoActivosFijos"));
			}
			
			//this.jButtonCerrarReporteDinamicoListadoActivosFijos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoListadoActivosFijos"));				
			//this.jButtonGenerarReporteDinamicoListadoActivosFijos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoListadoActivosFijos"));
			//this.jButtonGenerarExcelReporteDinamicoListadoActivosFijos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoListadoActivosFijos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionListadoActivosFijos!=null) {
				this.jInternalFrameImportacionListadoActivosFijos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionListadoActivosFijos"));
				this.jInternalFrameImportacionListadoActivosFijos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionListadoActivosFijos"));
				this.jInternalFrameImportacionListadoActivosFijos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionListadoActivosFijos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByListadoActivosFijos.addActionListener (new ButtonActionListener(this,"AbrirOrderByListadoActivosFijos"));
			
			this.jButtonAbrirOrderByToolBarListadoActivosFijos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarListadoActivosFijos"));			
			
			if(this.jInternalFrameOrderByListadoActivosFijos!=null) {
				this.jInternalFrameOrderByListadoActivosFijos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByListadoActivosFijos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadoActivosFijos.jTabbedPaneRelacionesListadoActivosFijos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesListadoActivosFijos"));
		
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
            		closingInternalFrameListadoActivosFijos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormListadoActivosFijos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormListadoActivosFijos = (JInternalFrameBase)event.getSource();
	            	
	            ListadoActivosFijosBeanSwingJInternalFrame jInternalFrameParent=(ListadoActivosFijosBeanSwingJInternalFrame)jInternalFrameDetalleFormListadoActivosFijos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarListadoActivosFijosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosListadoActivosFijos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosListadoActivosFijosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosListadoActivosFijos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosListadoActivosFijos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadoActivosFijosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadoActivosFijosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadoActivosFijosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoListadoActivosFijos";
		inputMap = this.jButtonNuevoListadoActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoListadoActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoListadoActivosFijosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadoActivosFijosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadoActivosFijosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadoActivosFijosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesListadoActivosFijos";
		inputMap = this.jButtonNuevoRelacionesListadoActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesListadoActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoListadoActivosFijosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarListadoActivosFijos";
		inputMap = this.jButtonModificarListadoActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarListadoActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarListadoActivosFijosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarListadoActivosFijos";
		inputMap = this.jButtonActualizarListadoActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarListadoActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarListadoActivosFijosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarListadoActivosFijos";
		inputMap = this.jButtonEliminarListadoActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarListadoActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarListadoActivosFijosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarListadoActivosFijos";
		inputMap = this.jButtonCancelarListadoActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarListadoActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarListadoActivosFijosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarListadoActivosFijos";
		inputMap = this.jButtonCerrarListadoActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarListadoActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarListadoActivosFijosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonGuardarCambiosListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosListadoActivosFijos";
		inputMap = this.jInternalFrameDetalleFormListadoActivosFijos.jButtonGuardarCambiosListadoActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonGuardarCambiosListadoActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosListadoActivosFijosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosListadoActivosFijos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosListadoActivosFijosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesListadoActivosFijos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesListadoActivosFijosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarListadoActivosFijos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarListadoActivosFijosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralListadoActivosFijos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralListadoActivosFijosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonidListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"idListadoActivosFijosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonid_empresaListadoActivosFijosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaListadoActivosFijosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonid_empresaListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaListadoActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtoncodigo_sub_grupoListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sub_grupoListadoActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonnombre_sub_grupoListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sub_grupoListadoActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtoncodigo_detalle_grupoListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_detalle_grupoListadoActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonnombre_detalle_grupoListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_detalle_grupoListadoActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonclaveListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"claveListadoActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonnombreListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombreListadoActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonfecha_compraListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_compraListadoActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtonvida_utilListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"vida_utilListadoActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadoActivosFijos.jButtoncosto_de_compraListadoActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"costo_de_compraListadoActivosFijosBusqueda"));
		
		
		this.jButtonBusquedaListadoActivosFijosListadoActivosFijos.addActionListener(new ButtonActionListener(this,"BusquedaListadoActivosFijosListadoActivosFijos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionListadoActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionListadoActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarListadoActivosFijosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarListadoActivosFijos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosListadoActivosFijos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ListadoActivosFijos listadoactivosfijosAux:this.listadoactivosfijosLogic.getListadoActivosFijoss()) {
					listadoactivosfijosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadoActivosFijos listadoactivosfijosAux:listadoactivosfijoss) {
					listadoactivosfijosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosListadoActivosFijosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingListadoActivosFijos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ListadoActivosFijos listadoactivosfijosAux:this.listadoactivosfijosLogic.getListadoActivosFijoss()) {
						listadoactivosfijosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ListadoActivosFijos listadoactivosfijosAux:listadoactivosfijoss) {
						listadoactivosfijosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ListadoActivosFijos listadoactivosfijosAux:this.listadoactivosfijosLogic.getListadoActivosFijoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ListadoActivosFijos listadoactivosfijosAux:listadoactivosfijoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaListadoActivosFijos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosListadoActivosFijos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosListadoActivosFijos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosListadoActivosFijos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosListadoActivosFijosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingListadoActivosFijos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosListadoActivosFijos.getSelectedRows();
			
			ListadoActivosFijos listadoactivosfijosLocal=new ListadoActivosFijos();
			
			//this.seleccionarTodosListadoActivosFijos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					listadoactivosfijosLocal =(ListadoActivosFijos) this.listadoactivosfijosLogic.getListadoActivosFijoss().toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					listadoactivosfijosLocal =(ListadoActivosFijos) this.listadoactivosfijoss.toArray()[this.jTableDatosListadoActivosFijos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				listadoactivosfijosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ListadoActivosFijos listadoactivosfijosAux:this.listadoactivosfijosLogic.getListadoActivosFijoss()) {
						listadoactivosfijosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ListadoActivosFijos listadoactivosfijosAux:listadoactivosfijoss) {
						listadoactivosfijosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaListadoActivosFijos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosListadoActivosFijos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosListadoActivosFijos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosListadoActivosFijos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualListadoActivosFijosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarListadoActivosFijosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralListadoActivosFijosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingListadoActivosFijos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralListadoActivosFijos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ListadoActivosFijos listadoactivosfijosAux:this.listadoactivosfijosLogic.getListadoActivosFijoss()) {
				
						if(sTipoSeleccionar.equals(ListadoActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO)) {
							existe=true;
							listadoactivosfijosAux.setcodigo_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO)) {
							existe=true;
							listadoactivosfijosAux.setnombre_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO)) {
							existe=true;
							listadoactivosfijosAux.setcodigo_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO)) {
							existe=true;
							listadoactivosfijosAux.setnombre_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoActivosFijosConstantesFunciones.LABEL_CLAVE)) {
							existe=true;
							listadoactivosfijosAux.setclave(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoActivosFijosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							listadoactivosfijosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoActivosFijosConstantesFunciones.LABEL_FECHACOMPRA)) {
							existe=true;
							listadoactivosfijosAux.setfecha_compra(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadoActivosFijosConstantesFunciones.LABEL_VIDAUTIL)) {
							existe=true;
							listadoactivosfijosAux.setvida_util(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadoActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA)) {
							existe=true;
							listadoactivosfijosAux.setcosto_de_compra(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadoActivosFijos listadoactivosfijosAux:listadoactivosfijoss) {
					
						if(sTipoSeleccionar.equals(ListadoActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO)) {
							existe=true;
							listadoactivosfijosAux.setcodigo_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO)) {
							existe=true;
							listadoactivosfijosAux.setnombre_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO)) {
							existe=true;
							listadoactivosfijosAux.setcodigo_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO)) {
							existe=true;
							listadoactivosfijosAux.setnombre_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoActivosFijosConstantesFunciones.LABEL_CLAVE)) {
							existe=true;
							listadoactivosfijosAux.setclave(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoActivosFijosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							listadoactivosfijosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadoActivosFijosConstantesFunciones.LABEL_FECHACOMPRA)) {
							existe=true;
							listadoactivosfijosAux.setfecha_compra(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadoActivosFijosConstantesFunciones.LABEL_VIDAUTIL)) {
							existe=true;
							listadoactivosfijosAux.setvida_util(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadoActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA)) {
							existe=true;
							listadoactivosfijosAux.setcosto_de_compra(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaListadoActivosFijos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesListadoActivosFijosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingListadoActivosFijos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioListadoActivosFijos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesListadoActivosFijos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormListadoActivosFijos.jComboBoxTiposAccionesFormularioListadoActivosFijos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteListadoActivosFijos) {				
					conSplash=true;//false;										
					
					//this.startProcessListadoActivosFijos(conSplash);
				
					this.generarReporteListadoActivosFijossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadoActivosFijos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadoActivosFijos.jComboBoxTiposAccionesFormularioListadoActivosFijos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoListadoActivosFijossSeleccionados();
				//this.jComboBoxTiposAccionesListadoActivosFijos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoListadoActivosFijossSeleccionados(false);
				//this.jComboBoxTiposAccionesListadoActivosFijos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoListadoActivosFijossSeleccionados(true);
				//this.jComboBoxTiposAccionesListadoActivosFijos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessListadoActivosFijos();
				
				this.exportarListadoActivosFijossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadoActivosFijos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadoActivosFijos.jComboBoxTiposAccionesFormularioListadoActivosFijos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionListadoActivosFijoss();
				//this.importarListadoActivosFijoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadoActivosFijos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadoActivosFijos.jComboBoxTiposAccionesFormularioListadoActivosFijos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessListadoActivosFijos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelListadoActivosFijossSeleccionados();
				//this.jComboBoxTiposAccionesListadoActivosFijos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Listado Activos Fijos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessListadoActivosFijos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoListadoActivosFijos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyListadoActivosFijos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Listado Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadoActivosFijos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadoActivosFijos.jComboBoxTiposAccionesFormularioListadoActivosFijos.setSelectedIndex(0);					
				}	
			} 			
			else if(ListadoActivosFijosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteListadoActivosFijos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessListadoActivosFijos(conSplash);
					
						//this.actualizarParametrosGeneralListadoActivosFijos();
						
						this.generarReporteProcesoAccionListadoActivosFijossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesListadoActivosFijos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormListadoActivosFijos.jComboBoxTiposAccionesFormularioListadoActivosFijos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ListadoActivosFijosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Listado Activos FijosES SELECCIONADOS?", "MANTENIMIENTO DE Listado Activos Fijos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessListadoActivosFijos();
				
						this.actualizarParametrosGeneralListadoActivosFijos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.listadoactivosfijosReturnGeneral=listadoactivosfijosLogic.procesarAccionListadoActivosFijossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.listadoactivosfijosLogic.getListadoActivosFijoss(),this.listadoactivosfijosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarListadoActivosFijosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesListadoActivosFijos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormListadoActivosFijos.jComboBoxTiposAccionesFormularioListadoActivosFijos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralListadoActivosFijos();
					
					ListadoActivosFijosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarListadoActivosFijosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesListadoActivosFijos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormListadoActivosFijos.jComboBoxTiposAccionesFormularioListadoActivosFijos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessListadoActivosFijos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesListadoActivosFijosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessListadoActivosFijos();
			
			if(this.jInternalFrameDetalleFormListadoActivosFijos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ListadoActivosFijos> listadoactivosfijossSeleccionados=new ArrayList<ListadoActivosFijos>();		
			ListadoActivosFijos listadoactivosfijos=new ListadoActivosFijos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingListadoActivosFijos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesListadoActivosFijos.getSelectedItem();
			
			
			
			
			listadoactivosfijossSeleccionados=this.getListadoActivosFijossSeleccionados(true);
			//this.sTipoAccion;
			
			if(listadoactivosfijossSeleccionados.size()==1) {
				for(ListadoActivosFijos listadoactivosfijosAux:listadoactivosfijossSeleccionados) {
					listadoactivosfijos=listadoactivosfijosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessListadoActivosFijos();
			
      		//this.finishProcessListadoActivosFijos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarListadoActivosFijosReturnGeneral() throws Exception {
		if(this.listadoactivosfijosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.listadoactivosfijosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.listadoactivosfijosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.listadoactivosfijosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.listadoactivosfijosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.listadoactivosfijosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingListadoActivosFijos(false);
		}
		
		if(this.listadoactivosfijosReturnGeneral.getConRetornoLista() || this.listadoactivosfijosReturnGeneral.getConRetornoObjeto()) {
			if(this.listadoactivosfijosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.listadoactivosfijosLogic.setListadoActivosFijoss(this.listadoactivosfijosReturnGeneral.getListadoActivosFijoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingListadoActivosFijos(false);
		}
	}
	
	public void actualizarParametrosGeneralListadoActivosFijos() throws Exception {
		
		
	}
	
	public ArrayList<ListadoActivosFijos> getListadoActivosFijossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ListadoActivosFijos> listadoactivosfijossSeleccionados=new ArrayList<ListadoActivosFijos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioListadoActivosFijos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ListadoActivosFijos listadoactivosfijosAux:listadoactivosfijosLogic.getListadoActivosFijoss()) {
					if(listadoactivosfijosAux.getIsSelected()) {
						listadoactivosfijossSeleccionados.add(listadoactivosfijosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadoActivosFijos listadoactivosfijosAux:this.listadoactivosfijoss) {
					if(listadoactivosfijosAux.getIsSelected()) {
						listadoactivosfijossSeleccionados.add(listadoactivosfijosAux);				
					}
				}
			}
			
			if(listadoactivosfijossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						listadoactivosfijossSeleccionados.addAll(this.listadoactivosfijosLogic.getListadoActivosFijoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						listadoactivosfijossSeleccionados.addAll(this.listadoactivosfijoss);				
					}
				}
			}
		} else {
			listadoactivosfijossSeleccionados.add(this.listadoactivosfijos);
		}
		
		return listadoactivosfijossSeleccionados;
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
	
	public void generarReporteListadoActivosFijossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalListadoActivosFijossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoListadoActivosFijossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoListadoActivosFijossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoListadoActivosFijossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Listado Activos Fijos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesListadoActivosFijossSeleccionados() throws Exception {
		ArrayList<ListadoActivosFijos> listadoactivosfijossSeleccionados=new ArrayList<ListadoActivosFijos>();		
		
		listadoactivosfijossSeleccionados=this.getListadoActivosFijossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteListadoActivosFijoss("Todos",listadoactivosfijossSeleccionados);
		
	}	
	
	public void generarReporteNormalListadoActivosFijossSeleccionados() throws Exception {
		ArrayList<ListadoActivosFijos> listadoactivosfijossSeleccionados=new ArrayList<ListadoActivosFijos>();		
		
		listadoactivosfijossSeleccionados=this.getListadoActivosFijossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteListadoActivosFijoss("Todos",listadoactivosfijossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionListadoActivosFijossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ListadoActivosFijos> listadoactivosfijossSeleccionados=new ArrayList<ListadoActivosFijos>();
		
		listadoactivosfijossSeleccionados=this.getListadoActivosFijossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteListadoActivosFijoss("Todos",listadoactivosfijossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoListadoActivosFijossSeleccionados() throws Exception {
		ArrayList<ListadoActivosFijos> listadoactivosfijossSeleccionados=new ArrayList<ListadoActivosFijos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoListadoActivosFijos();
		
		
		listadoactivosfijossSeleccionados=this.getListadoActivosFijossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoListadoActivosFijos();
		
		
		//this.generarReporteListadoActivosFijoss("Todos",listadoactivosfijossSeleccionados ,listadoactivosfijosImplementable,listadoactivosfijosImplementableHome);
	}
	
	public void mostrarImportacionListadoActivosFijoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionListadoActivosFijos();
		
		this.abrirFrameImportacionListadoActivosFijos();		
		
			
		//this.generarReporteListadoActivosFijoss("Todos",listadoactivosfijossSeleccionados ,listadoactivosfijosImplementable,listadoactivosfijosImplementableHome);
	}
	
	public void importarListadoActivosFijoss() throws Exception {		
	
	}
	
	public void exportarListadoActivosFijossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelListadoActivosFijossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoListadoActivosFijossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlListadoActivosFijossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Listado Activos Fijos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoListadoActivosFijossSeleccionados() throws Exception {
		ArrayList<ListadoActivosFijos> listadoactivosfijossSeleccionados=new ArrayList<ListadoActivosFijos>();		
		
		listadoactivosfijossSeleccionados=this.getListadoActivosFijossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadoactivosfijos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarListadoActivosFijos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ListadoActivosFijos listadoactivosfijosAux:listadoactivosfijossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarListadoActivosFijos(listadoactivosfijosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//listadoactivosfijosAux.setsDetalleGeneralEntityReporte(listadoactivosfijosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listado Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarListadoActivosFijos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ListadoActivosFijosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoActivosFijosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoActivosFijosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoActivosFijosConstantesFunciones.LABEL_CLAVE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoActivosFijosConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoActivosFijosConstantesFunciones.LABEL_FECHACOMPRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoActivosFijosConstantesFunciones.LABEL_VIDAUTIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadoActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarListadoActivosFijos(ListadoActivosFijos listadoactivosfijos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=listadoactivosfijos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoactivosfijos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoactivosfijos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoactivosfijos.getcodigo_sub_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoactivosfijos.getnombre_sub_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoactivosfijos.getcodigo_detalle_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoactivosfijos.getnombre_detalle_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoactivosfijos.getclave();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoactivosfijos.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoactivosfijos.getfecha_compra().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoactivosfijos.getvida_util().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadoactivosfijos.getcosto_de_compra().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelListadoActivosFijossSeleccionados() throws Exception {
		ArrayList<ListadoActivosFijos> listadoactivosfijossSeleccionados=new ArrayList<ListadoActivosFijos>();		
		
		listadoactivosfijossSeleccionados=this.getListadoActivosFijossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadoactivosfijos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ListadoActivosFijoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelListadoActivosFijos(row);				
				iRow++;
			}				
			
			for(ListadoActivosFijos listadoactivosfijosAux:listadoactivosfijossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelListadoActivosFijos(listadoactivosfijosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listado Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlListadoActivosFijossSeleccionados() throws Exception {
		ArrayList<ListadoActivosFijos> listadoactivosfijossSeleccionados=new ArrayList<ListadoActivosFijos>();		
		
		listadoactivosfijossSeleccionados=this.getListadoActivosFijossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadoactivosfijos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("listadoactivosfijoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("listadoactivosfijos");
			//elementRoot.appendChild(element);
		
			for(ListadoActivosFijos listadoactivosfijosAux:listadoactivosfijossSeleccionados) {
				element = document.createElement("listadoactivosfijos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlListadoActivosFijos(listadoactivosfijosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listado Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelListadoActivosFijos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_CLAVE);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_FECHACOMPRA);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_VIDAUTIL);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadoActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelListadoActivosFijos(ListadoActivosFijos listadoactivosfijos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(listadoactivosfijos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(listadoactivosfijos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(listadoactivosfijos.getcodigo_sub_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(listadoactivosfijos.getnombre_sub_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(listadoactivosfijos.getcodigo_detalle_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(listadoactivosfijos.getnombre_detalle_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(listadoactivosfijos.getclave());
		cell = row.createCell(iColumn++);cell.setCellValue(listadoactivosfijos.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(listadoactivosfijos.getfecha_compra());
		cell = row.createCell(iColumn++);cell.setCellValue(listadoactivosfijos.getvida_util());
		cell = row.createCell(iColumn++);cell.setCellValue(listadoactivosfijos.getcosto_de_compra());				
	}
	
	public void setFilaDatosExportarXmlListadoActivosFijos(ListadoActivosFijos listadoactivosfijos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ListadoActivosFijosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(listadoactivosfijos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ListadoActivosFijosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(listadoactivosfijos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ListadoActivosFijosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(listadoactivosfijos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo_sub_grupo = document.createElement(ListadoActivosFijosConstantesFunciones.CODIGOSUBGRUPO);
		elementcodigo_sub_grupo.appendChild(document.createTextNode(listadoactivosfijos.getcodigo_sub_grupo().trim()));
		element.appendChild(elementcodigo_sub_grupo);

		Element elementnombre_sub_grupo = document.createElement(ListadoActivosFijosConstantesFunciones.NOMBRESUBGRUPO);
		elementnombre_sub_grupo.appendChild(document.createTextNode(listadoactivosfijos.getnombre_sub_grupo().trim()));
		element.appendChild(elementnombre_sub_grupo);

		Element elementcodigo_detalle_grupo = document.createElement(ListadoActivosFijosConstantesFunciones.CODIGODETALLEGRUPO);
		elementcodigo_detalle_grupo.appendChild(document.createTextNode(listadoactivosfijos.getcodigo_detalle_grupo().trim()));
		element.appendChild(elementcodigo_detalle_grupo);

		Element elementnombre_detalle_grupo = document.createElement(ListadoActivosFijosConstantesFunciones.NOMBREDETALLEGRUPO);
		elementnombre_detalle_grupo.appendChild(document.createTextNode(listadoactivosfijos.getnombre_detalle_grupo().trim()));
		element.appendChild(elementnombre_detalle_grupo);

		Element elementclave = document.createElement(ListadoActivosFijosConstantesFunciones.CLAVE);
		elementclave.appendChild(document.createTextNode(listadoactivosfijos.getclave().trim()));
		element.appendChild(elementclave);

		Element elementnombre = document.createElement(ListadoActivosFijosConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(listadoactivosfijos.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementfecha_compra = document.createElement(ListadoActivosFijosConstantesFunciones.FECHACOMPRA);
		elementfecha_compra.appendChild(document.createTextNode(listadoactivosfijos.getfecha_compra().toString().trim()));
		element.appendChild(elementfecha_compra);

		Element elementvida_util = document.createElement(ListadoActivosFijosConstantesFunciones.VIDAUTIL);
		elementvida_util.appendChild(document.createTextNode(listadoactivosfijos.getvida_util().toString().trim()));
		element.appendChild(elementvida_util);

		Element elementcosto_de_compra = document.createElement(ListadoActivosFijosConstantesFunciones.COSTODECOMPRA);
		elementcosto_de_compra.appendChild(document.createTextNode(listadoactivosfijos.getcosto_de_compra().toString().trim()));
		element.appendChild(elementcosto_de_compra);
	}
	
	public void generarReporteGroupGenericoListadoActivosFijossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ListadoActivosFijos> listadoactivosfijossSeleccionados=new ArrayList<ListadoActivosFijos>();
		
		listadoactivosfijossSeleccionados=this.getListadoActivosFijossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoListadoActivosFijos(listadoactivosfijossSeleccionados);
		
		this.generarReporteListadoActivosFijoss("Todos",listadoactivosfijossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoListadoActivosFijos(ArrayList<ListadoActivosFijos> listadoactivosfijossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ListadoActivosFijos listadoactivosfijosAux:listadoactivosfijossSeleccionados) {
				listadoactivosfijosAux.setsDetalleGeneralEntityReporte(listadoactivosfijosAux.toString());
			
				if(sTipoSeleccionar.equals(ListadoActivosFijosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					listadoactivosfijosAux.setsDescripcionGeneralEntityReporte1(listadoactivosfijosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ListadoActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO)) {
					existe=true;
					listadoactivosfijosAux.setsDescripcionGeneralEntityReporte1(listadoactivosfijosAux.getcodigo_sub_grupo());
				}
				 else if(sTipoSeleccionar.equals(ListadoActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO)) {
					existe=true;
					listadoactivosfijosAux.setsDescripcionGeneralEntityReporte1(listadoactivosfijosAux.getnombre_sub_grupo());
				}
				 else if(sTipoSeleccionar.equals(ListadoActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO)) {
					existe=true;
					listadoactivosfijosAux.setsDescripcionGeneralEntityReporte1(listadoactivosfijosAux.getcodigo_detalle_grupo());
				}
				 else if(sTipoSeleccionar.equals(ListadoActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO)) {
					existe=true;
					listadoactivosfijosAux.setsDescripcionGeneralEntityReporte1(listadoactivosfijosAux.getnombre_detalle_grupo());
				}
				 else if(sTipoSeleccionar.equals(ListadoActivosFijosConstantesFunciones.LABEL_CLAVE)) {
					existe=true;
					listadoactivosfijosAux.setsDescripcionGeneralEntityReporte1(listadoactivosfijosAux.getclave());
				}
				 else if(sTipoSeleccionar.equals(ListadoActivosFijosConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					listadoactivosfijosAux.setsDescripcionGeneralEntityReporte1(listadoactivosfijosAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(ListadoActivosFijosConstantesFunciones.LABEL_FECHACOMPRA)) {
					existe=true;
					listadoactivosfijosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(listadoactivosfijosAux.getfecha_compra()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadoActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesListadoActivosFijos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoListadoActivosFijos=true;
				this.isVisibilidadCeldaNuevoRelacionesListadoActivosFijos=true;
				this.isVisibilidadCeldaGuardarCambiosListadoActivosFijos=true;
			}
			
			this.isVisibilidadCeldaModificarListadoActivosFijos=false;
			this.isVisibilidadCeldaActualizarListadoActivosFijos=false;
			this.isVisibilidadCeldaEliminarListadoActivosFijos=false;
			this.isVisibilidadCeldaCancelarListadoActivosFijos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadoActivosFijos=true;
				} else {
					this.isVisibilidadCeldaGuardarListadoActivosFijos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoListadoActivosFijos=false;
			this.isVisibilidadCeldaNuevoRelacionesListadoActivosFijos=false;
			this.isVisibilidadCeldaGuardarCambiosListadoActivosFijos=false;
			this.isVisibilidadCeldaModificarListadoActivosFijos=false;
			this.isVisibilidadCeldaActualizarListadoActivosFijos=true;
			this.isVisibilidadCeldaEliminarListadoActivosFijos=false;
			this.isVisibilidadCeldaCancelarListadoActivosFijos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadoActivosFijos=true;
				} else {
					this.isVisibilidadCeldaGuardarListadoActivosFijos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoListadoActivosFijos=false;
			this.isVisibilidadCeldaNuevoRelacionesListadoActivosFijos=false;
			this.isVisibilidadCeldaGuardarCambiosListadoActivosFijos=false;
			this.isVisibilidadCeldaModificarListadoActivosFijos=false;
			this.isVisibilidadCeldaActualizarListadoActivosFijos=true;
			this.isVisibilidadCeldaEliminarListadoActivosFijos=true;
			this.isVisibilidadCeldaCancelarListadoActivosFijos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadoActivosFijos=true;
				} else {
					this.isVisibilidadCeldaGuardarListadoActivosFijos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoListadoActivosFijos=false;
			this.isVisibilidadCeldaNuevoRelacionesListadoActivosFijos=false;
			this.isVisibilidadCeldaGuardarCambiosListadoActivosFijos=false;
			this.isVisibilidadCeldaModificarListadoActivosFijos=false;
			this.isVisibilidadCeldaActualizarListadoActivosFijos=true;
			this.isVisibilidadCeldaEliminarListadoActivosFijos=false;
			this.isVisibilidadCeldaCancelarListadoActivosFijos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadoActivosFijos=false;
				} else {
					this.isVisibilidadCeldaGuardarListadoActivosFijos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoListadoActivosFijos=true;
			this.isVisibilidadCeldaNuevoRelacionesListadoActivosFijos=true;
			this.isVisibilidadCeldaGuardarCambiosListadoActivosFijos=true;
			this.isVisibilidadCeldaModificarListadoActivosFijos=false;
			this.isVisibilidadCeldaActualizarListadoActivosFijos=false;
			this.isVisibilidadCeldaEliminarListadoActivosFijos=false;
			this.isVisibilidadCeldaCancelarListadoActivosFijos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadoActivosFijos=true;
				} else {
					this.isVisibilidadCeldaGuardarListadoActivosFijos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoListadoActivosFijos=false;
			this.isVisibilidadCeldaNuevoRelacionesListadoActivosFijos=false;
			this.isVisibilidadCeldaGuardarCambiosListadoActivosFijos=false;
			this.isVisibilidadCeldaActualizarListadoActivosFijos=false;
			this.isVisibilidadCeldaEliminarListadoActivosFijos=false;
			this.isVisibilidadCeldaCancelarListadoActivosFijos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadoActivosFijos=false;
				} else {
					this.isVisibilidadCeldaGuardarListadoActivosFijos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoListadoActivosFijos=false;
			this.isVisibilidadCeldaNuevoRelacionesListadoActivosFijos=false;
			this.isVisibilidadCeldaGuardarCambiosListadoActivosFijos=false;
			this.isVisibilidadCeldaModificarListadoActivosFijos=true;
			this.isVisibilidadCeldaActualizarListadoActivosFijos=false;
			this.isVisibilidadCeldaEliminarListadoActivosFijos=false;
			this.isVisibilidadCeldaCancelarListadoActivosFijos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadoActivosFijos=false;
				} else {
					this.isVisibilidadCeldaGuardarListadoActivosFijos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ListadoActivosFijosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoListadoActivosFijos=true;
			this.isVisibilidadCeldaNuevoRelacionesListadoActivosFijos=true;
			this.isVisibilidadCeldaGuardarCambiosListadoActivosFijos=true;
		} else {
			this.actualizarEstadoPanelsListadoActivosFijos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarListadoActivosFijos=false;
			//this.isVisibilidadCeldaVerFormListadoActivosFijos=false;
			this.isVisibilidadCeldaDuplicarListadoActivosFijos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!listadoactivosfijosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesListadoActivosFijos=false;
		} else {
			this.isVisibilidadCeldaNuevoListadoActivosFijos=false;
			this.isVisibilidadCeldaGuardarCambiosListadoActivosFijos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {
			if(!listadoactivosfijosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesListadoActivosFijos=false;												
			}
			
			this.jButtonCerrarListadoActivosFijos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesListadoActivosFijos=false;
		}
		
		if(!this.permiteMantenimiento(this.listadoactivosfijos)) {
			this.isVisibilidadCeldaActualizarListadoActivosFijos=false;
			this.isVisibilidadCeldaEliminarListadoActivosFijos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoListadoActivosFijos=false;
		this.isVisibilidadCeldaNuevoRelacionesListadoActivosFijos=false;
		this.isVisibilidadCeldaGuardarCambiosListadoActivosFijos=false;
		//this.isVisibilidadCeldaModificarListadoActivosFijos=true;
		this.isVisibilidadCeldaActualizarListadoActivosFijos=false;
		this.isVisibilidadCeldaEliminarListadoActivosFijos=false;
		//this.isVisibilidadCeldaCancelarListadoActivosFijos=true;			
		this.isVisibilidadCeldaGuardarListadoActivosFijos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesListadoActivosFijos() {
	}
	
	public void actualizarEstadoPanelsListadoActivosFijos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionListadoActivosFijos!=null) {
				this.jScrollPanelDatosEdicionListadoActivosFijos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadoActivosFijos!=null) {
				this.jTabbedPaneBusquedasListadoActivosFijos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadoActivosFijos!=null) {
				this.jScrollPanelDatosListadoActivosFijos.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadoActivosFijos!=null) {
				this.jPanelPaginacionListadoActivosFijos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadoActivosFijos!=null) {
				this.jPanelParametrosReportesListadoActivosFijos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionListadoActivosFijos!=null) {
				this.jScrollPanelDatosEdicionListadoActivosFijos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadoActivosFijos!=null) {
				this.jTabbedPaneBusquedasListadoActivosFijos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosListadoActivosFijos!=null) {
				this.jScrollPanelDatosListadoActivosFijos.setVisible(false);
			}
			
			if(this.jPanelPaginacionListadoActivosFijos!=null) {
				this.jPanelPaginacionListadoActivosFijos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesListadoActivosFijos!=null) {
				this.jPanelParametrosReportesListadoActivosFijos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionListadoActivosFijos!=null) {
				this.jScrollPanelDatosEdicionListadoActivosFijos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadoActivosFijos!=null) {
				this.jTabbedPaneBusquedasListadoActivosFijos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosListadoActivosFijos!=null) {
				this.jScrollPanelDatosListadoActivosFijos.setVisible(false);
			}
			
			if(this.jPanelPaginacionListadoActivosFijos!=null) {
				this.jPanelPaginacionListadoActivosFijos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesListadoActivosFijos!=null) {
				this.jPanelParametrosReportesListadoActivosFijos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionListadoActivosFijos!=null) {
				this.jScrollPanelDatosEdicionListadoActivosFijos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadoActivosFijos!=null) {
				this.jTabbedPaneBusquedasListadoActivosFijos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosListadoActivosFijos!=null) {
				this.jScrollPanelDatosListadoActivosFijos.setVisible(false);
			}
			
			if(this.jPanelPaginacionListadoActivosFijos!=null) {
				this.jPanelPaginacionListadoActivosFijos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesListadoActivosFijos!=null) {
				this.jPanelParametrosReportesListadoActivosFijos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionListadoActivosFijos!=null) {
				this.jScrollPanelDatosEdicionListadoActivosFijos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadoActivosFijos!=null) {
				this.jTabbedPaneBusquedasListadoActivosFijos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadoActivosFijos!=null) {
				this.jScrollPanelDatosListadoActivosFijos.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadoActivosFijos!=null) {
				this.jPanelPaginacionListadoActivosFijos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadoActivosFijos!=null) {
				this.jPanelParametrosReportesListadoActivosFijos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionListadoActivosFijos!=null) {
				this.jScrollPanelDatosEdicionListadoActivosFijos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadoActivosFijos!=null) {
				this.jTabbedPaneBusquedasListadoActivosFijos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadoActivosFijos!=null) {
				this.jScrollPanelDatosListadoActivosFijos.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadoActivosFijos!=null) {
				this.jPanelPaginacionListadoActivosFijos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadoActivosFijos!=null) {
				this.jPanelParametrosReportesListadoActivosFijos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionListadoActivosFijos!=null) {
				this.jScrollPanelDatosEdicionListadoActivosFijos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadoActivosFijos!=null) {
				this.jTabbedPaneBusquedasListadoActivosFijos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadoActivosFijos!=null) {
				this.jScrollPanelDatosListadoActivosFijos.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadoActivosFijos!=null) {
				this.jPanelPaginacionListadoActivosFijos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadoActivosFijos!=null) {
				this.jPanelParametrosReportesListadoActivosFijos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasListadoActivosFijos!=null) {
					this.jTabbedPaneBusquedasListadoActivosFijos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesListadoActivosFijos!=null) {
				this.jPanelParametrosReportesListadoActivosFijos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.listadoactivosfijosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadoActivosFijos!=null) {
				this.jTabbedPaneBusquedasListadoActivosFijos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesListadoActivosFijos!=null) {
				this.jPanelParametrosReportesListadoActivosFijos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaListadoActivosFijos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaListadoActivosFijos) {this.jTabbedPaneBusquedasListadoActivosFijos.remove(jPanelBusquedaListadoActivosFijosListadoActivosFijos);}
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
			
			this.inicializarActualizarBindingTablaListadoActivosFijos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioListadoActivosFijos() {
		this.updateBorderResaltarBusquedasFormularioListadoActivosFijos();
		this.updateVisibilidadBusquedasFormularioListadoActivosFijos();
		this.updateHabilitarBusquedasFormularioListadoActivosFijos();
	}
	
	public void updateBorderResaltarBusquedasFormularioListadoActivosFijos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasListadoActivosFijos.getComponents().length>0) {
	

		if(this.listadoactivosfijosConstantesFunciones.resaltarBusquedaListadoActivosFijosListadoActivosFijos!=null) {
			index= this.jTabbedPaneBusquedasListadoActivosFijos.indexOfComponent(this.jPanelBusquedaListadoActivosFijosListadoActivosFijos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasListadoActivosFijos.getComponent(index);
				jPanel.setBorder(this.listadoactivosfijosConstantesFunciones.resaltarBusquedaListadoActivosFijosListadoActivosFijos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioListadoActivosFijos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasListadoActivosFijos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasListadoActivosFijos.indexOfComponent(this.jPanelBusquedaListadoActivosFijosListadoActivosFijos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasListadoActivosFijos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.listadoactivosfijosConstantesFunciones.mostrarBusquedaListadoActivosFijosListadoActivosFijos);
			if(!this.listadoactivosfijosConstantesFunciones.mostrarBusquedaListadoActivosFijosListadoActivosFijos && index>-1) {
				this.jTabbedPaneBusquedasListadoActivosFijos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioListadoActivosFijos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasListadoActivosFijos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasListadoActivosFijos.indexOfComponent(this.jPanelBusquedaListadoActivosFijosListadoActivosFijos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasListadoActivosFijos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.listadoactivosfijosConstantesFunciones.activarBusquedaListadoActivosFijosListadoActivosFijos);
				this.jTabbedPaneBusquedasListadoActivosFijos.setEnabledAt(index,this.listadoactivosfijosConstantesFunciones.activarBusquedaListadoActivosFijosListadoActivosFijos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaListadoActivosFijos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaListadoActivosFijos")) {
			index= this.jTabbedPaneBusquedasListadoActivosFijos.indexOfComponent(this.jPanelBusquedaListadoActivosFijosListadoActivosFijos);

			this.jTabbedPaneBusquedasListadoActivosFijos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasListadoActivosFijos.getComponent(index);

			this.listadoactivosfijosConstantesFunciones.setResaltarBusquedaListadoActivosFijosListadoActivosFijos(resaltar);

			jPanel.setBorder(this.listadoactivosfijosConstantesFunciones.resaltarBusquedaListadoActivosFijosListadoActivosFijos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarListadoActivosFijos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioListadoActivosFijos() throws Exception {

		if(this.jInternalFrameDetalleFormListadoActivosFijos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioListadoActivosFijos();
		this.updateVisibilidadResaltarControlesFormularioListadoActivosFijos();
		this.updateHabilitarResaltarControlesFormularioListadoActivosFijos();
		
	}
	
	public void updateBorderResaltarControlesFormularioListadoActivosFijos() throws Exception {
		if(this.jInternalFrameDetalleFormListadoActivosFijos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.listadoactivosfijosConstantesFunciones.resaltaridListadoActivosFijos!=null && this.jInternalFrameDetalleFormListadoActivosFijos!=null) {this.jInternalFrameDetalleFormListadoActivosFijos.jLabelidListadoActivosFijos.setBorder(this.listadoactivosfijosConstantesFunciones.resaltaridListadoActivosFijos);}
		if(this.listadoactivosfijosConstantesFunciones.resaltarid_empresaListadoActivosFijos!=null && this.jInternalFrameDetalleFormListadoActivosFijos!=null) {this.jInternalFrameDetalleFormListadoActivosFijos.jComboBoxid_empresaListadoActivosFijos.setBorder(this.listadoactivosfijosConstantesFunciones.resaltarid_empresaListadoActivosFijos);}
		if(this.listadoactivosfijosConstantesFunciones.resaltarcodigo_sub_grupoListadoActivosFijos!=null && this.jInternalFrameDetalleFormListadoActivosFijos!=null) {this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldcodigo_sub_grupoListadoActivosFijos.setBorder(this.listadoactivosfijosConstantesFunciones.resaltarcodigo_sub_grupoListadoActivosFijos);}
		if(this.listadoactivosfijosConstantesFunciones.resaltarnombre_sub_grupoListadoActivosFijos!=null && this.jInternalFrameDetalleFormListadoActivosFijos!=null) {this.jInternalFrameDetalleFormListadoActivosFijos.jTextAreanombre_sub_grupoListadoActivosFijos.setBorder(this.listadoactivosfijosConstantesFunciones.resaltarnombre_sub_grupoListadoActivosFijos);}
		if(this.listadoactivosfijosConstantesFunciones.resaltarcodigo_detalle_grupoListadoActivosFijos!=null && this.jInternalFrameDetalleFormListadoActivosFijos!=null) {this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldcodigo_detalle_grupoListadoActivosFijos.setBorder(this.listadoactivosfijosConstantesFunciones.resaltarcodigo_detalle_grupoListadoActivosFijos);}
		if(this.listadoactivosfijosConstantesFunciones.resaltarnombre_detalle_grupoListadoActivosFijos!=null && this.jInternalFrameDetalleFormListadoActivosFijos!=null) {this.jInternalFrameDetalleFormListadoActivosFijos.jTextAreanombre_detalle_grupoListadoActivosFijos.setBorder(this.listadoactivosfijosConstantesFunciones.resaltarnombre_detalle_grupoListadoActivosFijos);}
		if(this.listadoactivosfijosConstantesFunciones.resaltarclaveListadoActivosFijos!=null && this.jInternalFrameDetalleFormListadoActivosFijos!=null) {this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldclaveListadoActivosFijos.setBorder(this.listadoactivosfijosConstantesFunciones.resaltarclaveListadoActivosFijos);}
		if(this.listadoactivosfijosConstantesFunciones.resaltarnombreListadoActivosFijos!=null && this.jInternalFrameDetalleFormListadoActivosFijos!=null) {this.jInternalFrameDetalleFormListadoActivosFijos.jTextAreanombreListadoActivosFijos.setBorder(this.listadoactivosfijosConstantesFunciones.resaltarnombreListadoActivosFijos);}
		if(this.listadoactivosfijosConstantesFunciones.resaltarfecha_compraListadoActivosFijos!=null && this.jInternalFrameDetalleFormListadoActivosFijos!=null) {this.jInternalFrameDetalleFormListadoActivosFijos.jDateChooserfecha_compraListadoActivosFijos.setBorder(this.listadoactivosfijosConstantesFunciones.resaltarfecha_compraListadoActivosFijos);}
		if(this.listadoactivosfijosConstantesFunciones.resaltarvida_utilListadoActivosFijos!=null && this.jInternalFrameDetalleFormListadoActivosFijos!=null) {this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldvida_utilListadoActivosFijos.setBorder(this.listadoactivosfijosConstantesFunciones.resaltarvida_utilListadoActivosFijos);}
		if(this.listadoactivosfijosConstantesFunciones.resaltarcosto_de_compraListadoActivosFijos!=null && this.jInternalFrameDetalleFormListadoActivosFijos!=null) {this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldcosto_de_compraListadoActivosFijos.setBorder(this.listadoactivosfijosConstantesFunciones.resaltarcosto_de_compraListadoActivosFijos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioListadoActivosFijos() throws Exception {		
		if(this.jInternalFrameDetalleFormListadoActivosFijos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) {
	
		//this.jInternalFrameDetalleFormListadoActivosFijos.jLabelidListadoActivosFijos.setVisible(this.listadoactivosfijosConstantesFunciones.mostraridListadoActivosFijos);
		this.jInternalFrameDetalleFormListadoActivosFijos.jPanelidListadoActivosFijos.setVisible(this.listadoactivosfijosConstantesFunciones.mostraridListadoActivosFijos);
		//this.jInternalFrameDetalleFormListadoActivosFijos.jComboBoxid_empresaListadoActivosFijos.setVisible(this.listadoactivosfijosConstantesFunciones.mostrarid_empresaListadoActivosFijos);
		this.jInternalFrameDetalleFormListadoActivosFijos.jPanelid_empresaListadoActivosFijos.setVisible(this.listadoactivosfijosConstantesFunciones.mostrarid_empresaListadoActivosFijos);
		//this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldcodigo_sub_grupoListadoActivosFijos.setVisible(this.listadoactivosfijosConstantesFunciones.mostrarcodigo_sub_grupoListadoActivosFijos);
		this.jInternalFrameDetalleFormListadoActivosFijos.jPanelcodigo_sub_grupoListadoActivosFijos.setVisible(this.listadoactivosfijosConstantesFunciones.mostrarcodigo_sub_grupoListadoActivosFijos);
		//this.jInternalFrameDetalleFormListadoActivosFijos.jTextAreanombre_sub_grupoListadoActivosFijos.setVisible(this.listadoactivosfijosConstantesFunciones.mostrarnombre_sub_grupoListadoActivosFijos);
		this.jInternalFrameDetalleFormListadoActivosFijos.jPanelnombre_sub_grupoListadoActivosFijos.setVisible(this.listadoactivosfijosConstantesFunciones.mostrarnombre_sub_grupoListadoActivosFijos);
		//this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldcodigo_detalle_grupoListadoActivosFijos.setVisible(this.listadoactivosfijosConstantesFunciones.mostrarcodigo_detalle_grupoListadoActivosFijos);
		this.jInternalFrameDetalleFormListadoActivosFijos.jPanelcodigo_detalle_grupoListadoActivosFijos.setVisible(this.listadoactivosfijosConstantesFunciones.mostrarcodigo_detalle_grupoListadoActivosFijos);
		//this.jInternalFrameDetalleFormListadoActivosFijos.jTextAreanombre_detalle_grupoListadoActivosFijos.setVisible(this.listadoactivosfijosConstantesFunciones.mostrarnombre_detalle_grupoListadoActivosFijos);
		this.jInternalFrameDetalleFormListadoActivosFijos.jPanelnombre_detalle_grupoListadoActivosFijos.setVisible(this.listadoactivosfijosConstantesFunciones.mostrarnombre_detalle_grupoListadoActivosFijos);
		//this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldclaveListadoActivosFijos.setVisible(this.listadoactivosfijosConstantesFunciones.mostrarclaveListadoActivosFijos);
		this.jInternalFrameDetalleFormListadoActivosFijos.jPanelclaveListadoActivosFijos.setVisible(this.listadoactivosfijosConstantesFunciones.mostrarclaveListadoActivosFijos);
		//this.jInternalFrameDetalleFormListadoActivosFijos.jTextAreanombreListadoActivosFijos.setVisible(this.listadoactivosfijosConstantesFunciones.mostrarnombreListadoActivosFijos);
		this.jInternalFrameDetalleFormListadoActivosFijos.jPanelnombreListadoActivosFijos.setVisible(this.listadoactivosfijosConstantesFunciones.mostrarnombreListadoActivosFijos);
		//this.jInternalFrameDetalleFormListadoActivosFijos.jDateChooserfecha_compraListadoActivosFijos.setVisible(this.listadoactivosfijosConstantesFunciones.mostrarfecha_compraListadoActivosFijos);
		this.jInternalFrameDetalleFormListadoActivosFijos.jPanelfecha_compraListadoActivosFijos.setVisible(this.listadoactivosfijosConstantesFunciones.mostrarfecha_compraListadoActivosFijos);
		//this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldvida_utilListadoActivosFijos.setVisible(this.listadoactivosfijosConstantesFunciones.mostrarvida_utilListadoActivosFijos);
		this.jInternalFrameDetalleFormListadoActivosFijos.jPanelvida_utilListadoActivosFijos.setVisible(this.listadoactivosfijosConstantesFunciones.mostrarvida_utilListadoActivosFijos);
		//this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldcosto_de_compraListadoActivosFijos.setVisible(this.listadoactivosfijosConstantesFunciones.mostrarcosto_de_compraListadoActivosFijos);
		this.jInternalFrameDetalleFormListadoActivosFijos.jPanelcosto_de_compraListadoActivosFijos.setVisible(this.listadoactivosfijosConstantesFunciones.mostrarcosto_de_compraListadoActivosFijos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioListadoActivosFijos() throws Exception {
		if(this.jInternalFrameDetalleFormListadoActivosFijos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormListadoActivosFijos!=null) {
	
		this.jInternalFrameDetalleFormListadoActivosFijos.jLabelidListadoActivosFijos.setEnabled(this.listadoactivosfijosConstantesFunciones.activaridListadoActivosFijos);
		this.jInternalFrameDetalleFormListadoActivosFijos.jComboBoxid_empresaListadoActivosFijos.setEnabled(this.listadoactivosfijosConstantesFunciones.activarid_empresaListadoActivosFijos);
		this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldcodigo_sub_grupoListadoActivosFijos.setEnabled(this.listadoactivosfijosConstantesFunciones.activarcodigo_sub_grupoListadoActivosFijos);
		this.jInternalFrameDetalleFormListadoActivosFijos.jTextAreanombre_sub_grupoListadoActivosFijos.setEnabled(this.listadoactivosfijosConstantesFunciones.activarnombre_sub_grupoListadoActivosFijos);
		this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldcodigo_detalle_grupoListadoActivosFijos.setEnabled(this.listadoactivosfijosConstantesFunciones.activarcodigo_detalle_grupoListadoActivosFijos);
		this.jInternalFrameDetalleFormListadoActivosFijos.jTextAreanombre_detalle_grupoListadoActivosFijos.setEnabled(this.listadoactivosfijosConstantesFunciones.activarnombre_detalle_grupoListadoActivosFijos);
		this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldclaveListadoActivosFijos.setEnabled(this.listadoactivosfijosConstantesFunciones.activarclaveListadoActivosFijos);
		this.jInternalFrameDetalleFormListadoActivosFijos.jTextAreanombreListadoActivosFijos.setEnabled(this.listadoactivosfijosConstantesFunciones.activarnombreListadoActivosFijos);
		this.jInternalFrameDetalleFormListadoActivosFijos.jDateChooserfecha_compraListadoActivosFijos.setEnabled(this.listadoactivosfijosConstantesFunciones.activarfecha_compraListadoActivosFijos);
		this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldvida_utilListadoActivosFijos.setEnabled(this.listadoactivosfijosConstantesFunciones.activarvida_utilListadoActivosFijos);
		this.jInternalFrameDetalleFormListadoActivosFijos.jTextFieldcosto_de_compraListadoActivosFijos.setEnabled(this.listadoactivosfijosConstantesFunciones.activarcosto_de_compraListadoActivosFijos);
		}
	}
	
		
}