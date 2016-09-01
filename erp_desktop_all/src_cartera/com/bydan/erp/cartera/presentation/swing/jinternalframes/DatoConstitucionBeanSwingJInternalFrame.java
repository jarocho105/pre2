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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




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

import com.bydan.erp.cartera.util.DatoConstitucionConstantesFunciones;
import com.bydan.erp.cartera.util.DatoConstitucionParameterReturnGeneral;
//import com.bydan.erp.cartera.util.DatoConstitucionParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.DatoConstitucionBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
public class DatoConstitucionBeanSwingJInternalFrame extends DatoConstitucionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DatoConstitucionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DatoConstitucion> datoconstitucionValidator = new ClassValidator<DatoConstitucion>(DatoConstitucion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DatoConstitucion datoconstitucion;	
	public DatoConstitucion datoconstitucionAux;
	public DatoConstitucion datoconstitucionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DatoConstitucion datoconstitucionTotales;
	public Long idDatoConstitucionActual;
	public Long iIdNuevoDatoConstitucion=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboCliente="";

	public List<Cliente> clientesForeignKey;

	public List<Cliente> getclientesForeignKey() {
		return clientesForeignKey;
	}

	public void setclientesForeignKey(List<Cliente> clientesForeignKey) {
		this.clientesForeignKey = clientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Cliente clienteForeignKey;

	public Cliente getclienteForeignKey() {
		return clienteForeignKey;
	}

	public void setclienteForeignKey(Cliente clienteForeignKey) {
		this.clienteForeignKey = clienteForeignKey;
	}

	public String sFinalQueryComboTipoCompania="";

	public List<TipoCompania> tipocompaniasForeignKey;

	public List<TipoCompania> gettipocompaniasForeignKey() {
		return tipocompaniasForeignKey;
	}

	public void settipocompaniasForeignKey(List<TipoCompania> tipocompaniasForeignKey) {
		this.tipocompaniasForeignKey = tipocompaniasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoCompania tipocompaniaForeignKey;

	public TipoCompania gettipocompaniaForeignKey() {
		return tipocompaniaForeignKey;
	}

	public void settipocompaniaForeignKey(TipoCompania tipocompaniaForeignKey) {
		this.tipocompaniaForeignKey = tipocompaniaForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idClienteActual=0L;

	public Long getidClienteActual() {
		return idClienteActual;
	}

	public void setidClienteActual(Long idClienteActual) {
		this.idClienteActual= idClienteActual;
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
	
	public Boolean isPermisoTodoDatoConstitucion;
	public Boolean isPermisoNuevoDatoConstitucion;
	public Boolean isPermisoActualizarDatoConstitucion;
	public Boolean isPermisoActualizarOriginalDatoConstitucion;
	public Boolean isPermisoEliminarDatoConstitucion;
	public Boolean isPermisoGuardarCambiosDatoConstitucion;
	public Boolean isPermisoConsultaDatoConstitucion;
	public Boolean isPermisoBusquedaDatoConstitucion;
	public Boolean isPermisoReporteDatoConstitucion;
	public Boolean isPermisoPaginacionMedioDatoConstitucion;
	public Boolean isPermisoPaginacionAltoDatoConstitucion;
	public Boolean isPermisoPaginacionTodoDatoConstitucion;
	public Boolean isPermisoCopiarDatoConstitucion;
	public Boolean isPermisoVerFormDatoConstitucion;
	public Boolean isPermisoDuplicarDatoConstitucion;
	public Boolean isPermisoOrdenDatoConstitucion;
	
	
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
	
	public DatoConstitucionParameterReturnGeneral datoconstitucionReturnGeneral;
	public DatoConstitucionParameterReturnGeneral datoconstitucionParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDatoConstitucion=false;
	public Boolean esParaAccionDesdeFormularioDatoConstitucion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DatoConstitucionSessionBeanAdditional datoconstitucionSessionBeanAdditional=null;
	
	public DatoConstitucionSessionBeanAdditional getDatoConstitucionSessionBeanAdditional() {
		return this.datoconstitucionSessionBeanAdditional;
	}
	
	public void setDatoConstitucionSessionBeanAdditional(DatoConstitucionSessionBeanAdditional datoconstitucionSessionBeanAdditional) {
		try {
			this.datoconstitucionSessionBeanAdditional=datoconstitucionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DatoConstitucionBeanSwingJInternalFrameAdditional datoconstitucionBeanSwingJInternalFrameAdditional=null;
	//public class DatoConstitucionBeanSwingJInternalFrame
	
	public DatoConstitucionBeanSwingJInternalFrameAdditional getDatoConstitucionBeanSwingJInternalFrameAdditional() {
		return this.datoconstitucionBeanSwingJInternalFrameAdditional;
	}
	
	public void setDatoConstitucionBeanSwingJInternalFrameAdditional(DatoConstitucionBeanSwingJInternalFrameAdditional datoconstitucionBeanSwingJInternalFrameAdditional) {
		try {
			this.datoconstitucionBeanSwingJInternalFrameAdditional=datoconstitucionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DatoConstitucionLogic datoconstitucionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DatoConstitucion datoconstitucionBean;
	public DatoConstitucionConstantesFunciones datoconstitucionConstantesFunciones;
	//public DatoConstitucionParameterReturnGeneral datoconstitucionReturnGeneral;
	
	//FK
	
	public ClienteLogic clienteLogic;
	public TipoCompaniaLogic tipocompaniaLogic;
	
	//PARAMETROS
	
	
	//public List<DatoConstitucion> datoconstitucions;	
	//public List<DatoConstitucion> datoconstitucionsEliminados;
	//public List<DatoConstitucion> datoconstitucionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDatoConstitucion=false;
	public Boolean isVisibilidadCeldaDuplicarDatoConstitucion=true;
	public Boolean isVisibilidadCeldaCopiarDatoConstitucion=true;
	public Boolean isVisibilidadCeldaVerFormDatoConstitucion=true;
	public Boolean isVisibilidadCeldaOrdenDatoConstitucion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDatoConstitucion=false;
	public Boolean isVisibilidadCeldaModificarDatoConstitucion=false;
	public Boolean isVisibilidadCeldaActualizarDatoConstitucion=false;
	public Boolean isVisibilidadCeldaEliminarDatoConstitucion=false;
	public Boolean isVisibilidadCeldaCancelarDatoConstitucion=false;
	public Boolean isVisibilidadCeldaGuardarDatoConstitucion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDatoConstitucion=false;	
	
	
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdValorClienteCompania=false;
	
	public Long getiIdNuevoDatoConstitucion() {
		return this.iIdNuevoDatoConstitucion;
	}

	public void setiIdNuevoDatoConstitucion(Long iIdNuevoDatoConstitucion) {
		this.iIdNuevoDatoConstitucion = iIdNuevoDatoConstitucion;
	}
	
	public Long getidDatoConstitucionActual() {
		return this.idDatoConstitucionActual;
	}

	public void setidDatoConstitucionActual(Long idDatoConstitucionActual) {
		this.idDatoConstitucionActual = idDatoConstitucionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DatoConstitucion getdatoconstitucion() {
		return this.datoconstitucion;
	}

	public void setdatoconstitucion(DatoConstitucion datoconstitucion) {
		this.datoconstitucion = datoconstitucion;
	}
	
	public DatoConstitucion getdatoconstitucionAux() {
		return this.datoconstitucionAux;
	}

	public void setdatoconstitucionAux(DatoConstitucion datoconstitucionAux) {
		this.datoconstitucionAux = datoconstitucionAux;
	}				
	
	public DatoConstitucion getdatoconstitucionAnterior() {
		return this.datoconstitucionAnterior;
	}

	public void setdatoconstitucionAnterior(DatoConstitucion datoconstitucionAnterior) {
		this.datoconstitucionAnterior = datoconstitucionAnterior;
	}	
	
	public DatoConstitucion getdatoconstitucionTotales() {
		return this.datoconstitucionTotales;
	}

	public void setdatoconstitucionTotales(DatoConstitucion datoconstitucionTotales) {
		this.datoconstitucionTotales = datoconstitucionTotales;
	}	
	
	public DatoConstitucion getdatoconstitucionBean() {
		return this.datoconstitucionBean;
	}

	public void setdatoconstitucionBean(DatoConstitucion datoconstitucionBean) {
		this.datoconstitucionBean = datoconstitucionBean;
	}	
	
	public DatoConstitucionParameterReturnGeneral getdatoconstitucionReturnGeneral() {
		return this.datoconstitucionReturnGeneral;
	}

	public void setdatoconstitucionReturnGeneral(DatoConstitucionParameterReturnGeneral datoconstitucionReturnGeneral) {
		this.datoconstitucionReturnGeneral = datoconstitucionReturnGeneral;
	}	
	
	
	public Long idclienteFK_IdCliente=-1L;

	public Long getidclienteFK_IdCliente() {
		return this.idclienteFK_IdCliente;
	}

	public void setidclienteFK_IdCliente(Long idclienteFK_IdCliente) {
		this.idclienteFK_IdCliente = idclienteFK_IdCliente;
	}

	public Long idvalorclientecompaniaFK_IdValorClienteCompania=-1L;

	public Long getidvalorclientecompaniaFK_IdValorClienteCompania() {
		return this.idvalorclientecompaniaFK_IdValorClienteCompania;
	}

	public void setidvalorclientecompaniaFK_IdValorClienteCompania(Long idvalorclientecompaniaFK_IdValorClienteCompania) {
		this.idvalorclientecompaniaFK_IdValorClienteCompania = idvalorclientecompaniaFK_IdValorClienteCompania;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public DatoConstitucionLogic getDatoConstitucionLogic()	{		
		return datoconstitucionLogic;
	}

	public void setDatoConstitucionLogic(DatoConstitucionLogic datoconstitucionLogic) {
		this.datoconstitucionLogic = datoconstitucionLogic;
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
	
	public Boolean getIsEsNuevoDatoConstitucion() {
		return isEsNuevoDatoConstitucion;
	}

	public void setIsEsNuevoDatoConstitucion(Boolean isEsNuevoDatoConstitucion) {
		this.isEsNuevoDatoConstitucion = isEsNuevoDatoConstitucion;
	}

	public Boolean getEsParaAccionDesdeFormularioDatoConstitucion() {
		return esParaAccionDesdeFormularioDatoConstitucion;
	}
	
	public void setEsParaAccionDesdeFormularioDatoConstitucion(Boolean esParaAccionDesdeFormularioDatoConstitucion) {
		this.esParaAccionDesdeFormularioDatoConstitucion = esParaAccionDesdeFormularioDatoConstitucion;
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
	
	
	public void cargarCombosClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.clientesForeignKey=new ArrayList<Cliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ClienteLogic clienteLogic=new ClienteLogic();

			clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

			if(this.datoconstitucionSessionBean==null) {
				this.datoconstitucionSessionBean=new DatoConstitucionSessionBean();
			}

			if(!this.datoconstitucionSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

					clienteLogic.getTodosClientesWithConnection(sFinalQuery,new Pagination());

					this.clientesForeignKey=clienteLogic.getClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(datoconstitucionSessionBean.getlidClienteActual());
					this.clientesForeignKey.add(clienteLogic.getCliente());
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

	public void cargarCombosTipoCompaniasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipocompaniasForeignKey=new ArrayList<TipoCompania>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoCompaniaLogic tipocompaniaLogic=new TipoCompaniaLogic();

			tipocompaniaLogic.getTipoCompaniaDataAccess().setIsForForeingKeyData(true);

			if(this.datoconstitucionSessionBean==null) {
				this.datoconstitucionSessionBean=new DatoConstitucionSessionBean();
			}

			if(!this.datoconstitucionSessionBean.getisBusquedaDesdeForeignKeySesionTipoCompania()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocompaniaLogic.getTipoCompaniaDataAccess().setIsForForeingKeyData(true);

					tipocompaniaLogic.getTodosTipoCompaniasWithConnection(sFinalQuery,new Pagination());

					this.tipocompaniasForeignKey=tipocompaniaLogic.getTipoCompanias();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoCompania(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocompaniaLogic.getEntityWithConnection(datoconstitucionSessionBean.getlidTipoCompaniaActual());
					this.tipocompaniasForeignKey.add(tipocompaniaLogic.getTipoCompania());
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

	
	
	public void setActualClienteForeignKey(Long idClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(clienteTemp!=null) {

					if(this.datoconstitucion!=null) {
						this.datoconstitucion.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormDatoConstitucion!=null) {
						this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxidclienteDatoConstitucion.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxidclienteDatoConstitucion.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormDatoConstitucion!=null) {
						if(this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxidclienteDatoConstitucion.getItemCount()>0) {
							this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxidclienteDatoConstitucion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxidclienteFK_IdClienteDatoConstitucion!=null) {
						jComboBoxidclienteFK_IdClienteDatoConstitucion.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxidclienteFK_IdClienteDatoConstitucion!=null) {
							//jComboBoxidclienteFK_IdClienteDatoConstitucion.setSelectedItem(clienteTemp);
							if(jComboBoxidclienteFK_IdClienteDatoConstitucion.getItemCount()>0) {
								jComboBoxidclienteFK_IdClienteDatoConstitucion.setSelectedIndex(0);
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

	public String getActualClienteForeignKeyDescripcion(Long idClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}


			sDescripcion=ClienteConstantesFunciones.getClienteDescripcion(clienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxidclienteDatoConstitucionGenerico)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(clienteTemp!=null) {
				jComboBoxidclienteDatoConstitucionGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxidclienteDatoConstitucionGenerico!=null && jComboBoxidclienteDatoConstitucionGenerico.getItemCount()>0) {
					jComboBoxidclienteDatoConstitucionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoCompaniaForeignKey(Long idTipoCompaniaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoCompania  tipocompaniaTemp=null;

			for(TipoCompania tipocompaniaAux:tipocompaniasForeignKey) {
				if(tipocompaniaAux.getId()!=null && tipocompaniaAux.getId().equals(idTipoCompaniaSeleccionado)) {
					tipocompaniaTemp=tipocompaniaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipocompaniaTemp!=null) {

					if(this.datoconstitucion!=null) {
						this.datoconstitucion.setTipoCompania(tipocompaniaTemp);
					}

					if(this.jInternalFrameDetalleFormDatoConstitucion!=null) {
						this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxidvalorclientecompaniaDatoConstitucion.setSelectedItem(tipocompaniaTemp);
					}
				} else {
					//jComboBoxidvalorclientecompaniaDatoConstitucion.setSelectedItem(tipocompaniaTemp);
					if(this.jInternalFrameDetalleFormDatoConstitucion!=null) {
						if(this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxidvalorclientecompaniaDatoConstitucion.getItemCount()>0) {
							this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxidvalorclientecompaniaDatoConstitucion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdValorClienteCompania") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipocompaniaTemp!=null && jComboBoxidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucion!=null) {
						jComboBoxidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucion.setSelectedItem(tipocompaniaTemp);
					} else {
						if(jComboBoxidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucion!=null) {
							//jComboBoxidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucion.setSelectedItem(tipocompaniaTemp);
							if(jComboBoxidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucion.getItemCount()>0) {
								jComboBoxidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucion.setSelectedIndex(0);
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

	public String getActualTipoCompaniaForeignKeyDescripcion(Long idTipoCompaniaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoCompania  tipocompaniaTemp=null;

			for(TipoCompania tipocompaniaAux:tipocompaniasForeignKey) {
				if(tipocompaniaAux.getId()!=null && tipocompaniaAux.getId().equals(idTipoCompaniaSeleccionado)) {
					tipocompaniaTemp=tipocompaniaAux;
					break;
				}
			}


			sDescripcion=TipoCompaniaConstantesFunciones.getTipoCompaniaDescripcion(tipocompaniaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoCompaniaForeignKeyGenerico(Long idTipoCompaniaSeleccionado,JComboBox jComboBoxidvalorclientecompaniaDatoConstitucionGenerico)throws Exception
	{
		try
		{
			TipoCompania  tipocompaniaTemp=null;

			for(TipoCompania tipocompaniaAux:tipocompaniasForeignKey) {
				if(tipocompaniaAux.getId()!=null && tipocompaniaAux.getId().equals(idTipoCompaniaSeleccionado)) {
					tipocompaniaTemp=tipocompaniaAux;
					break;
				}
			}

			if(tipocompaniaTemp!=null) {
				jComboBoxidvalorclientecompaniaDatoConstitucionGenerico.setSelectedItem(tipocompaniaTemp);
			} else {
				if(jComboBoxidvalorclientecompaniaDatoConstitucionGenerico!=null && jComboBoxidvalorclientecompaniaDatoConstitucionGenerico.getItemCount()>0) {
					jComboBoxidvalorclientecompaniaDatoConstitucionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(DatoConstitucion datoconstitucion,JComboBox jComboBoxidclienteDatoConstitucionGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxidclienteDatoConstitucionGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxidclienteDatoConstitucion.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxidclienteDatoConstitucionGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				datoconstitucion.setidcliente(clienteAux.getId());
				datoconstitucion.setcliente_descripcion(DatoConstitucionConstantesFunciones.getClienteDescripcion(clienteAux));
				datoconstitucion.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoCompaniaForeignKey(DatoConstitucion datoconstitucion,JComboBox jComboBoxidvalorclientecompaniaDatoConstitucionGenerico)throws Exception
	{
		try
		{
			TipoCompania  tipocompaniaAux=new TipoCompania();

			if(jComboBoxidvalorclientecompaniaDatoConstitucionGenerico==null) {
				tipocompaniaAux=(TipoCompania)this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxidvalorclientecompaniaDatoConstitucion.getSelectedItem();
			} else {
				tipocompaniaAux=(TipoCompania)jComboBoxidvalorclientecompaniaDatoConstitucionGenerico.getSelectedItem();
			}

			if(tipocompaniaAux!=null && tipocompaniaAux.getId()!=null) {
				datoconstitucion.setidvalorclientecompania(tipocompaniaAux.getId());
				datoconstitucion.settipocompania_descripcion(DatoConstitucionConstantesFunciones.getTipoCompaniaDescripcion(tipocompaniaAux));
				datoconstitucion.setTipoCompania(tipocompaniaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DatoConstitucionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDatoConstitucion!=null) { 
							this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxidclienteDatoConstitucion.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxidclienteDatoConstitucion.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDatoConstitucion!=null) { 
					}

					if(!DatoConstitucionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DatoConstitucionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxidclienteFK_IdClienteDatoConstitucion.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxidclienteFK_IdClienteDatoConstitucion.addItem(cliente);
							}
						}

						if(!DatoConstitucionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoCompaniasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoCompania=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DatoConstitucionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDatoConstitucion!=null) { 
							this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxidvalorclientecompaniaDatoConstitucion.removeAllItems();

							for(TipoCompania tipocompania:this.tipocompaniasForeignKey) {
								this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxidvalorclientecompaniaDatoConstitucion.addItem(tipocompania);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDatoConstitucion!=null) { 
					}

					if(!DatoConstitucionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdValorClienteCompania") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DatoConstitucionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucion.removeAllItems();

							for(TipoCompania tipocompania:this.tipocompaniasForeignKey) {
								this.jComboBoxidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucion.addItem(tipocompania);
							}
						}

						if(!DatoConstitucionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameClienteForeignKey(Cliente cliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDatoConstitucion!=null) {
							this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxidclienteDatoConstitucion.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormDatoConstitucion!=null) {
							this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxidclienteDatoConstitucion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxidclienteFK_IdClienteDatoConstitucion.setSelectedItem(cliente);
						} else {
							this.jComboBoxidclienteFK_IdClienteDatoConstitucion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoCompaniaForeignKey(TipoCompania tipocompania,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDatoConstitucion!=null) {
							this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxidvalorclientecompaniaDatoConstitucion.setSelectedItem(tipocompania);
						}
					} else {
						if(this.jInternalFrameDetalleFormDatoConstitucion!=null) {
							this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxidvalorclientecompaniaDatoConstitucion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucion.setSelectedItem(tipocompania);
						} else {
							this.jComboBoxidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDatoConstitucion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DatoConstitucionConstantesFunciones.refrescarForeignKeysDescripcionesDatoConstitucion(this.datoconstitucionLogic.getDatoConstitucions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DatoConstitucionConstantesFunciones.refrescarForeignKeysDescripcionesDatoConstitucion(this.datoconstitucions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(TipoCompania.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//datoconstitucionLogic.setDatoConstitucions(this.datoconstitucions);
			datoconstitucionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DatoConstitucionParameterReturnGeneral getDatoConstitucionParameterGeneral() {
		return this.datoconstitucionParameterGeneral;
	}
	
	public void setDatoConstitucionParameterGeneral(DatoConstitucionParameterReturnGeneral datoconstitucionParameterGeneral) {
		this.datoconstitucionParameterGeneral = datoconstitucionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDatoConstitucion() {
		return isPermisoTodoDatoConstitucion;
	}

	public void setIsPermisoTodoDatoConstitucion(Boolean isPermisoTodoDatoConstitucion) {
		this.isPermisoTodoDatoConstitucion = isPermisoTodoDatoConstitucion;
	}

	public Boolean getIsPermisoNuevoDatoConstitucion() {
		return isPermisoNuevoDatoConstitucion;
	}

	public void setIsPermisoNuevoDatoConstitucion(Boolean isPermisoNuevoDatoConstitucion) {
		this.isPermisoNuevoDatoConstitucion = isPermisoNuevoDatoConstitucion;
	}

	public Boolean getIsPermisoActualizarDatoConstitucion() {
		return isPermisoActualizarDatoConstitucion;
	}

	public void setIsPermisoActualizarDatoConstitucion(Boolean isPermisoActualizarDatoConstitucion) {
		this.isPermisoActualizarDatoConstitucion = isPermisoActualizarDatoConstitucion;
	}

	public Boolean getIsPermisoEliminarDatoConstitucion() {
		return isPermisoEliminarDatoConstitucion;
	}

	public void setIsPermisoEliminarDatoConstitucion(Boolean isPermisoEliminarDatoConstitucion) {
		this.isPermisoEliminarDatoConstitucion = isPermisoEliminarDatoConstitucion;
	}

	public Boolean getIsPermisoGuardarCambiosDatoConstitucion() {
		return isPermisoGuardarCambiosDatoConstitucion;
	}

	public void setIsPermisoGuardarCambiosDatoConstitucion(Boolean isPermisoGuardarCambiosDatoConstitucion) {
		this.isPermisoGuardarCambiosDatoConstitucion = isPermisoGuardarCambiosDatoConstitucion;
	}
	
	public Boolean getIsPermisoConsultaDatoConstitucion() {
		return isPermisoConsultaDatoConstitucion;
	}

	public void setIsPermisoConsultaDatoConstitucion(Boolean isPermisoConsultaDatoConstitucion) {
		this.isPermisoConsultaDatoConstitucion = isPermisoConsultaDatoConstitucion;
	}

	public Boolean getIsPermisoBusquedaDatoConstitucion() {
		return isPermisoBusquedaDatoConstitucion;
	}

	public void setIsPermisoBusquedaDatoConstitucion(Boolean isPermisoBusquedaDatoConstitucion) {
		this.isPermisoBusquedaDatoConstitucion = isPermisoBusquedaDatoConstitucion;
	}

	public Boolean getIsPermisoReporteDatoConstitucion() {
		return isPermisoReporteDatoConstitucion;
	}

	public void setIsPermisoReporteDatoConstitucion(Boolean isPermisoReporteDatoConstitucion) {
		this.isPermisoReporteDatoConstitucion = isPermisoReporteDatoConstitucion;
	}
	
	public Boolean getIsPermisoPaginacionMedioDatoConstitucion() {
		return isPermisoPaginacionMedioDatoConstitucion;
	}

	public void setIsPermisoPaginacionMedioDatoConstitucion(Boolean isPermisoPaginacionMedioDatoConstitucion) {
		this.isPermisoPaginacionMedioDatoConstitucion = isPermisoPaginacionMedioDatoConstitucion;
	}
	
	public Boolean getIsPermisoPaginacionTodoDatoConstitucion() {
		return isPermisoPaginacionTodoDatoConstitucion;
	}

	public void setIsPermisoPaginacionTodoDatoConstitucion(Boolean isPermisoPaginacionTodoDatoConstitucion) {
		this.isPermisoPaginacionTodoDatoConstitucion = isPermisoPaginacionTodoDatoConstitucion;
	}
	
	public Boolean getIsPermisoPaginacionAltoDatoConstitucion() {
		return isPermisoPaginacionAltoDatoConstitucion;
	}

	public void setIsPermisoPaginacionAltoDatoConstitucion(Boolean isPermisoPaginacionAltoDatoConstitucion) {
		this.isPermisoPaginacionAltoDatoConstitucion = isPermisoPaginacionAltoDatoConstitucion;
	}
	
	public Boolean getIsPermisoCopiarDatoConstitucion() {
		return isPermisoCopiarDatoConstitucion;
	}

	public void setIsPermisoCopiarDatoConstitucion(Boolean isPermisoCopiarDatoConstitucion) {
		this.isPermisoCopiarDatoConstitucion = isPermisoCopiarDatoConstitucion;
	}
	
	public Boolean getIsPermisoVerFormDatoConstitucion() {
		return isPermisoVerFormDatoConstitucion;
	}

	public void setIsPermisoVerFormDatoConstitucion(Boolean isPermisoVerFormDatoConstitucion) {
		this.isPermisoVerFormDatoConstitucion = isPermisoVerFormDatoConstitucion;
	}
	
	public Boolean getIsPermisoDuplicarDatoConstitucion() {
		return isPermisoDuplicarDatoConstitucion;
	}

	public void setIsPermisoDuplicarDatoConstitucion(Boolean isPermisoDuplicarDatoConstitucion) {
		this.isPermisoDuplicarDatoConstitucion = isPermisoDuplicarDatoConstitucion;
	}
	
	public Boolean getIsPermisoOrdenDatoConstitucion() {
		return isPermisoOrdenDatoConstitucion;
	}

	public void setIsPermisoOrdenDatoConstitucion(Boolean isPermisoOrdenDatoConstitucion) {
		this.isPermisoOrdenDatoConstitucion = isPermisoOrdenDatoConstitucion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDatoConstitucion() {
		return isVisibilidadCeldaNuevoDatoConstitucion;
	}

	public void setIsVisibilidadCeldaNuevoDatoConstitucion(Boolean isVisibilidadCeldaNuevoDatoConstitucion) {
		this.isVisibilidadCeldaNuevoDatoConstitucion = isVisibilidadCeldaNuevoDatoConstitucion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDatoConstitucion() {
		return isVisibilidadCeldaDuplicarDatoConstitucion;
	}

	public void setIsVisibilidadCeldaDuplicarDatoConstitucion(Boolean isVisibilidadCeldaDuplicarDatoConstitucion) {
		this.isVisibilidadCeldaDuplicarDatoConstitucion = isVisibilidadCeldaDuplicarDatoConstitucion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDatoConstitucion() {
		return isVisibilidadCeldaCopiarDatoConstitucion;
	}

	public void setIsVisibilidadCeldaCopiarDatoConstitucion(Boolean isVisibilidadCeldaCopiarDatoConstitucion) {
		this.isVisibilidadCeldaCopiarDatoConstitucion = isVisibilidadCeldaCopiarDatoConstitucion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDatoConstitucion() {
		return isVisibilidadCeldaVerFormDatoConstitucion;
	}

	public void setIsVisibilidadCeldaVerFormDatoConstitucion(Boolean isVisibilidadCeldaVerFormDatoConstitucion) {
		this.isVisibilidadCeldaVerFormDatoConstitucion = isVisibilidadCeldaVerFormDatoConstitucion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDatoConstitucion() {
		return isVisibilidadCeldaOrdenDatoConstitucion;
	}

	public void setIsVisibilidadCeldaOrdenDatoConstitucion(Boolean isVisibilidadCeldaOrdenDatoConstitucion) {
		this.isVisibilidadCeldaOrdenDatoConstitucion = isVisibilidadCeldaOrdenDatoConstitucion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDatoConstitucion() {
		return isVisibilidadCeldaNuevoRelacionesDatoConstitucion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDatoConstitucion(Boolean isVisibilidadCeldaNuevoRelacionesDatoConstitucion) {
		this.isVisibilidadCeldaNuevoRelacionesDatoConstitucion = isVisibilidadCeldaNuevoRelacionesDatoConstitucion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDatoConstitucion() {
		return isVisibilidadCeldaModificarDatoConstitucion;
	}

	public void setIsVisibilidadCeldaModificarDatoConstitucion(Boolean isVisibilidadCeldaModificarDatoConstitucion) {
		this.isVisibilidadCeldaModificarDatoConstitucion = isVisibilidadCeldaModificarDatoConstitucion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDatoConstitucion() {
		return isVisibilidadCeldaActualizarDatoConstitucion;
	}

	public void setIsVisibilidadCeldaActualizarDatoConstitucion(Boolean isVisibilidadCeldaActualizarDatoConstitucion) {
		this.isVisibilidadCeldaActualizarDatoConstitucion = isVisibilidadCeldaActualizarDatoConstitucion;
	}

	public Boolean getIsVisibilidadCeldaEliminarDatoConstitucion() {
		return isVisibilidadCeldaEliminarDatoConstitucion;
	}

	public void setIsVisibilidadCeldaEliminarDatoConstitucion(Boolean isVisibilidadCeldaEliminarDatoConstitucion) {
		this.isVisibilidadCeldaEliminarDatoConstitucion = isVisibilidadCeldaEliminarDatoConstitucion;
	}

	public Boolean getIsVisibilidadCeldaCancelarDatoConstitucion() {
		return isVisibilidadCeldaCancelarDatoConstitucion;
	}

	public void setIsVisibilidadCeldaCancelarDatoConstitucion(Boolean isVisibilidadCeldaCancelarDatoConstitucion) {
		this.isVisibilidadCeldaCancelarDatoConstitucion = isVisibilidadCeldaCancelarDatoConstitucion;
	}

	public Boolean getIsVisibilidadCeldaGuardarDatoConstitucion() {
		return isVisibilidadCeldaGuardarDatoConstitucion;
	}

	public void setIsVisibilidadCeldaGuardarDatoConstitucion(Boolean isVisibilidadCeldaGuardarDatoConstitucion) {
		this.isVisibilidadCeldaGuardarDatoConstitucion = isVisibilidadCeldaGuardarDatoConstitucion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDatoConstitucion() {
		return isVisibilidadCeldaGuardarCambiosDatoConstitucion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDatoConstitucion(Boolean isVisibilidadCeldaGuardarCambiosDatoConstitucion) {
		this.isVisibilidadCeldaGuardarCambiosDatoConstitucion = isVisibilidadCeldaGuardarCambiosDatoConstitucion;
	}
		
	public DatoConstitucionSessionBean getdatoconstitucionSessionBean() {
		return this.datoconstitucionSessionBean;
	}
	
	public void setdatoconstitucionSessionBean(DatoConstitucionSessionBean datoconstitucionSessionBean) {
		this.datoconstitucionSessionBean=datoconstitucionSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
	}

	public Boolean getisVisibilidadFK_IdValorClienteCompania() {
		return this.isVisibilidadFK_IdValorClienteCompania;
	}

	public void setisVisibilidadFK_IdValorClienteCompania(Boolean isVisibilidadFK_IdValorClienteCompania) {
		this.isVisibilidadFK_IdValorClienteCompania=isVisibilidadFK_IdValorClienteCompania;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDatoConstitucion(DatoConstitucion datoconstitucion)throws Exception {
		try {
			
				this.setActualParaGuardarClienteForeignKey(datoconstitucion,null);
				this.setActualParaGuardarTipoCompaniaForeignKey(datoconstitucion,null);
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
	
	public void bugActualizarReferenciaActual(DatoConstitucion datoconstitucion,DatoConstitucion datoconstitucionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDatoConstitucion(datoconstitucion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		datoconstitucionAux.setId(datoconstitucion.getId());
		datoconstitucionAux.setVersionRow(datoconstitucion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDatoConstitucion();
		
			int intSelectedRow = this.jTableDatosDatoConstitucion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucion =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.datoconstitucion =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DatoConstitucionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDatoConstitucion(this.datoconstitucion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDatoConstitucion(this.datoconstitucion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = datoconstitucionValidator.getInvalidValues(this.datoconstitucion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			datoconstitucionLogic.setDatosCliente(datosCliente);
			datoconstitucionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				datoconstitucionAux=new  DatoConstitucion();
				
				datoconstitucionAux.setIsNew(true);
				datoconstitucionAux.setIsChanged(true);
				
				datoconstitucionAux.setDatoConstitucionOriginal(this.datoconstitucion);
				
				datoconstitucionAux.setId(this.datoconstitucion.getId());	
				datoconstitucionAux.setVersionRow(this.datoconstitucion.getVersionRow());	
				datoconstitucionAux.setidcliente(this.datoconstitucion.getidcliente());	
				datoconstitucionAux.setidvalorclientecompania(this.datoconstitucion.getidvalorclientecompania());	
				datoconstitucionAux.setdireccion(this.datoconstitucion.getdireccion());	
				datoconstitucionAux.setfechaconstitucion(this.datoconstitucion.getfechaconstitucion());	
				datoconstitucionAux.setcapitalsuscrito(this.datoconstitucion.getcapitalsuscrito());	
				datoconstitucionAux.setplazofiniquito(this.datoconstitucion.getplazofiniquito());	
				datoconstitucionAux.setreservalegal(this.datoconstitucion.getreservalegal());	
				datoconstitucionAux.setfechaestatuto(this.datoconstitucion.getfechaestatuto());	
				datoconstitucionAux.setesactivo(this.datoconstitucion.getesactivo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.datoconstitucionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.datoconstitucionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(datoconstitucionAux,datoconstitucionLogic.getDatoConstitucions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(datoconstitucionAux,datoconstitucions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.datoconstitucionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.datoconstitucionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						datoconstitucionLogic.saveDatoConstitucions();//WithConnection
						//datoconstitucionLogic.getSetVersionRowDatoConstitucions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.datoconstitucion,datoconstitucionAux);
					
					this.refrescarForeignKeysDescripcionesDatoConstitucion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.datoconstitucionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								datoconstitucionLogic.saveDatoConstitucionRelaciones(datoconstitucionAux);//WithConnection
								//datoconstitucionLogic.getSetVersionRowDatoConstitucions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.datoconstitucion,datoconstitucionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.datoconstitucionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.datoconstitucionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(datoconstitucionAux,datoconstitucionLogic.getDatoConstitucions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(datoconstitucionAux,datoconstitucions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.datoconstitucion,datoconstitucionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				datoconstitucionAux=new  DatoConstitucion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.datoconstitucionSessionBean.getEsGuardarRelacionado() 
					|| (this.datoconstitucionSessionBean.getEsGuardarRelacionado() && this.datoconstitucion.getId()>=0)) {
						
					datoconstitucionAux.setIsNew(false);
				}
				
				datoconstitucionAux.setIsDeleted(false);
			
				datoconstitucionAux.setId(this.datoconstitucion.getId());	
				datoconstitucionAux.setVersionRow(this.datoconstitucion.getVersionRow());	
				datoconstitucionAux.setidcliente(this.datoconstitucion.getidcliente());	
				datoconstitucionAux.setidvalorclientecompania(this.datoconstitucion.getidvalorclientecompania());	
				datoconstitucionAux.setdireccion(this.datoconstitucion.getdireccion());	
				datoconstitucionAux.setfechaconstitucion(this.datoconstitucion.getfechaconstitucion());	
				datoconstitucionAux.setcapitalsuscrito(this.datoconstitucion.getcapitalsuscrito());	
				datoconstitucionAux.setplazofiniquito(this.datoconstitucion.getplazofiniquito());	
				datoconstitucionAux.setreservalegal(this.datoconstitucion.getreservalegal());	
				datoconstitucionAux.setfechaestatuto(this.datoconstitucion.getfechaestatuto());	
				datoconstitucionAux.setesactivo(this.datoconstitucion.getesactivo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(datoconstitucionAux,datoconstitucionLogic.getDatoConstitucions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(datoconstitucionAux,datoconstitucions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.datoconstitucionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.datoconstitucionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						datoconstitucionLogic.saveDatoConstitucions();//WithConnection
						//datoconstitucionLogic.getSetVersionRowDatoConstitucions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.datoconstitucion,datoconstitucionAux);
					
					this.refrescarForeignKeysDescripcionesDatoConstitucion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.datoconstitucionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								datoconstitucionLogic.saveDatoConstitucionRelaciones(datoconstitucionAux);//WithConnection
								//datoconstitucionLogic.getSetVersionRowDatoConstitucions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.datoconstitucion,datoconstitucionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.datoconstitucionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.datoconstitucionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(datoconstitucionAux,datoconstitucionLogic.getDatoConstitucions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(datoconstitucionAux,datoconstitucions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.datoconstitucion,datoconstitucionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				datoconstitucionAux=new  DatoConstitucion();
				
				datoconstitucionAux.setIsNew(false);
				datoconstitucionAux.setIsChanged(false);
				
				datoconstitucionAux.setIsDeleted(true);
				
				datoconstitucionAux.setId(this.datoconstitucion.getId());	
				datoconstitucionAux.setVersionRow(this.datoconstitucion.getVersionRow());	
				datoconstitucionAux.setidcliente(this.datoconstitucion.getidcliente());	
				datoconstitucionAux.setidvalorclientecompania(this.datoconstitucion.getidvalorclientecompania());	
				datoconstitucionAux.setdireccion(this.datoconstitucion.getdireccion());	
				datoconstitucionAux.setfechaconstitucion(this.datoconstitucion.getfechaconstitucion());	
				datoconstitucionAux.setcapitalsuscrito(this.datoconstitucion.getcapitalsuscrito());	
				datoconstitucionAux.setplazofiniquito(this.datoconstitucion.getplazofiniquito());	
				datoconstitucionAux.setreservalegal(this.datoconstitucion.getreservalegal());	
				datoconstitucionAux.setfechaestatuto(this.datoconstitucion.getfechaestatuto());	
				datoconstitucionAux.setesactivo(this.datoconstitucion.getesactivo());	
				
				if(this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.datoconstitucionAux.getId()>=0) {	
						this.datoconstitucionsEliminados.add(datoconstitucionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(datoconstitucionAux,datoconstitucionLogic.getDatoConstitucions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(datoconstitucionAux,datoconstitucions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.datoconstitucionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.datoconstitucionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						datoconstitucionLogic.saveDatoConstitucions();//WithConnection
						//datoconstitucionLogic.getSetVersionRowDatoConstitucions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.datoconstitucionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								datoconstitucionLogic.saveDatoConstitucionRelaciones(datoconstitucionAux);//WithConnection
								//datoconstitucionLogic.getSetVersionRowDatoConstitucions();//WithConnection
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
							if(this.datoconstitucionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.datoconstitucionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(datoconstitucionAux,datoconstitucionLogic.getDatoConstitucions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(datoconstitucionAux,datoconstitucions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.getDatoConstitucions().addAll(this.datoconstitucionsEliminados);
					
					datoconstitucionLogic.saveDatoConstitucions();//WithConnection
					//datoconstitucionLogic.getSetVersionRowDatoConstitucions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDatoConstitucion();
				
				this.datoconstitucionsEliminados= new ArrayList<DatoConstitucion>();		
			}
			
			if(this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Dato Constitucion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Dato Constitucion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.datoconstitucion=datoconstitucionAux;
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
      		//this.finishProcessDatoConstitucion();
      	}
		
	}	
	
	public void actualizarRelaciones(DatoConstitucion datoconstitucionLocal) throws Exception {
		
		if(this.datoconstitucionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DatoConstitucion datoconstitucionLocal) throws Exception {	
		if(this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				datoconstitucionLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoCompaniaDetalleFormJInternalFrame.class)) {
				TipoCompaniaBeanSwingJInternalFrame tipocompaniaBeanSwingJInternalFrameLocal=(TipoCompaniaBeanSwingJInternalFrame) ((TipoCompaniaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipocompaniaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoCompania(tipocompaniaBeanSwingJInternalFrameLocal.gettipocompania(),true);
				tipocompaniaBeanSwingJInternalFrameLocal.actualizarLista(tipocompaniaBeanSwingJInternalFrameLocal.tipocompania,this.tipocompaniasForeignKey);

				tipocompaniaBeanSwingJInternalFrameLocal.actualizarRelaciones(tipocompaniaBeanSwingJInternalFrameLocal.tipocompania);

				datoconstitucionLocal.setTipoCompania(tipocompaniaBeanSwingJInternalFrameLocal.tipocompania);

				this.addItemDefectoCombosForeignKeyTipoCompania();
				this.cargarCombosFrameTipoCompaniasForeignKey("Formulario");
				this.setActualTipoCompaniaForeignKey(tipocompaniaBeanSwingJInternalFrameLocal.tipocompania.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDatoConstitucionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDatoConstitucion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.datoconstitucion =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.datoconstitucion =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = datoconstitucionValidator.getInvalidValues(this.datoconstitucion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DatoConstitucion datoconstitucion,List<DatoConstitucion> datoconstitucions) throws Exception {
		try	{		
			DatoConstitucionConstantesFunciones.actualizarLista(datoconstitucion,datoconstitucions,this.datoconstitucionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DatoConstitucion datoconstitucion,List<DatoConstitucion> datoconstitucions) throws Exception {
		try	{			
			DatoConstitucionConstantesFunciones.actualizarSelectedLista(datoconstitucion,datoconstitucions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DatoConstitucion> datoconstitucionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				datoconstitucionsLocal=this.datoconstitucionLogic.getDatoConstitucions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				datoconstitucionsLocal=this.datoconstitucions;
			}
			//ARCHITECTURE
		
			for(DatoConstitucion datoconstitucionLocal:datoconstitucionsLocal) {
				if(this.permiteMantenimiento(datoconstitucionLocal) && datoconstitucionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DatoConstitucionConstantesFunciones.getDatoConstitucionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DatoConstitucionConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoConstitucion.jLabelidclienteDatoConstitucion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DatoConstitucionConstantesFunciones.IDTIPOCOMPANIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoConstitucion.jLabelidvalorclientecompaniaDatoConstitucion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DatoConstitucionConstantesFunciones.DIRECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoConstitucion.jLabeldireccionDatoConstitucion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DatoConstitucionConstantesFunciones.FECHACONSTITUCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoConstitucion.jLabelfechaconstitucionDatoConstitucion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DatoConstitucionConstantesFunciones.CAPITALSUSCRITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoConstitucion.jLabelcapitalsuscritoDatoConstitucion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DatoConstitucionConstantesFunciones.PLAZOFINIQUITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoConstitucion.jLabelplazofiniquitoDatoConstitucion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DatoConstitucionConstantesFunciones.RESERVALEGAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoConstitucion.jLabelreservalegalDatoConstitucion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DatoConstitucionConstantesFunciones.FECHAESTATUTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoConstitucion.jLabelfechaestatutoDatoConstitucion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DatoConstitucionConstantesFunciones.ESACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoConstitucion.jLabelesactivoDatoConstitucion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDatoConstitucion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoConstitucion.jLabelidclienteDatoConstitucion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoConstitucion.jLabelidvalorclientecompaniaDatoConstitucion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoConstitucion.jLabeldireccionDatoConstitucion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoConstitucion.jLabelfechaconstitucionDatoConstitucion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoConstitucion.jLabelcapitalsuscritoDatoConstitucion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoConstitucion.jLabelplazofiniquitoDatoConstitucion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoConstitucion.jLabelreservalegalDatoConstitucion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoConstitucion.jLabelfechaestatutoDatoConstitucion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDatoConstitucion.jLabelesactivoDatoConstitucion,"");
		
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
		this.iIdNuevoDatoConstitucion--;	
		
		
		this.datoconstitucionAux=new DatoConstitucion();
		
		this.datoconstitucionAux.setId(this.iIdNuevoDatoConstitucion);
		this.datoconstitucionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.datoconstitucionLogic.getDatoConstitucions().add(this.datoconstitucionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.datoconstitucions.add(this.datoconstitucionAux);
		}
		//ARCHITECTURE
		
		this.datoconstitucion=this.datoconstitucionAux;
		
		if(DatoConstitucionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDatoConstitucion(this.datoconstitucion);
			this.setVariablesObjetoActualToFormularioForeignKeyDatoConstitucion(this.datoconstitucion);
		}
				
		//this.setDefaultControlesDatoConstitucion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDatoConstitucion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDatoConstitucion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDatoConstitucion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDatoConstitucion(this.datoconstitucionBean,this.datoconstitucion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDatoConstitucion(this.datoconstitucion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DatoConstitucionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.datoconstitucionSessionBean.getConGuardarRelaciones()) {
			classes=DatoConstitucionConstantesFunciones.getClassesRelationshipsOfDatoConstitucion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.datoconstitucionReturnGeneral=datoconstitucionLogic.procesarEventosDatoConstitucionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.datoconstitucionLogic.getDatoConstitucions(),this.datoconstitucion,this.datoconstitucionParameterGeneral,this.isEsNuevoDatoConstitucion,classes);//this.datoconstitucionLogic.getDatoConstitucion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDatoConstitucion(this.datoconstitucionReturnGeneral,this.datoconstitucionBean,false);
		
		if(this.datoconstitucionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDatoConstitucion(this.datoconstitucionReturnGeneral.getDatoConstitucion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDatoConstitucion(this.datoconstitucionReturnGeneral.getDatoConstitucion());
		}
		
		if(this.datoconstitucionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDatoConstitucion(this.datoconstitucionReturnGeneral.getDatoConstitucion(),classes);//this.datoconstitucionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDatoConstitucion(this.datoconstitucion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDatoConstitucion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDatoConstitucion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DatoConstitucionBeanSwingJInternalFrameAdditional.RecargarFormDatoConstitucion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDatoConstitucion(false);
						
			if(datoconstitucionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DatoConstitucionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDatoConstitucion();
			}
			
			this.actualizarVisualTableDatosDatoConstitucion();
			
			this.jTableDatosDatoConstitucion.setRowSelectionInterval(this.getIndiceNuevoDatoConstitucion(), this.getIndiceNuevoDatoConstitucion());
			
			this.seleccionarFilaTablaDatoConstitucionActual();
						
			this.actualizarEstadoCeldasBotonesDatoConstitucion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDatoConstitucion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDatoConstitucion.jTextAreadireccionDatoConstitucion.setEnabled(isHabilitar && this.datoconstitucionConstantesFunciones.activardireccionDatoConstitucion);
		this.jInternalFrameDetalleFormDatoConstitucion.jDateChooserfechaconstitucionDatoConstitucion.setEnabled(isHabilitar && this.datoconstitucionConstantesFunciones.activarfechaconstitucionDatoConstitucion);
		this.jInternalFrameDetalleFormDatoConstitucion.jTextFieldcapitalsuscritoDatoConstitucion.setEnabled(isHabilitar && this.datoconstitucionConstantesFunciones.activarcapitalsuscritoDatoConstitucion);
		this.jInternalFrameDetalleFormDatoConstitucion.jTextFieldplazofiniquitoDatoConstitucion.setEnabled(isHabilitar && this.datoconstitucionConstantesFunciones.activarplazofiniquitoDatoConstitucion);
		this.jInternalFrameDetalleFormDatoConstitucion.jTextFieldreservalegalDatoConstitucion.setEnabled(isHabilitar && this.datoconstitucionConstantesFunciones.activarreservalegalDatoConstitucion);
		this.jInternalFrameDetalleFormDatoConstitucion.jDateChooserfechaestatutoDatoConstitucion.setEnabled(isHabilitar && this.datoconstitucionConstantesFunciones.activarfechaestatutoDatoConstitucion);
		this.jInternalFrameDetalleFormDatoConstitucion.jCheckBoxesactivoDatoConstitucion.setEnabled(isHabilitar && this.datoconstitucionConstantesFunciones.activaresactivoDatoConstitucion);	
		
		this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxidclienteDatoConstitucion.setEnabled(isHabilitar && this.datoconstitucionConstantesFunciones.activaridclienteDatoConstitucion);
		this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxidvalorclientecompaniaDatoConstitucion.setEnabled(isHabilitar && this.datoconstitucionConstantesFunciones.activaridvalorclientecompaniaDatoConstitucion);
	};
	
	public void setDefaultControlesDatoConstitucion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDatoConstitucion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.datoconstitucionSessionBean.setConGuardarRelaciones(true);			
			this.datoconstitucionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDatoConstitucion.jTabbedPaneRelacionesDatoConstitucion.setVisible(true);
			
					
		} else {
			//this.datoconstitucionSessionBean.setConGuardarRelaciones(false);			
			this.datoconstitucionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDatoConstitucion.jTabbedPaneRelacionesDatoConstitucion.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDatoConstitucion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DatoConstitucion datoconstitucionAux:this.datoconstitucionLogic.getDatoConstitucions()) {
				if(datoconstitucionAux.getId().equals(this.iIdNuevoDatoConstitucion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DatoConstitucion datoconstitucionAux:this.datoconstitucions) {
				if(datoconstitucionAux.getId().equals(this.iIdNuevoDatoConstitucion)) {
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
	
	public int getIndiceActualDatoConstitucion(DatoConstitucion datoconstitucion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DatoConstitucion datoconstitucionAux:this.datoconstitucionLogic.getDatoConstitucions()) {
				if(datoconstitucionAux.getId().equals(datoconstitucion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DatoConstitucion datoconstitucionAux:this.datoconstitucions) {
				if(datoconstitucionAux.getId().equals(datoconstitucion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDatoConstitucion(DatoConstitucion datoconstitucionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DatoConstitucion datoconstitucionAux:this.datoconstitucionLogic.getDatoConstitucions()) {
				if(datoconstitucionAux.getDatoConstitucionOriginal().getId().equals(datoconstitucionOriginal.getId())) {
					existe=true;
					datoconstitucionOriginal.setId(datoconstitucionAux.getId());
					datoconstitucionOriginal.setVersionRow(datoconstitucionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DatoConstitucion datoconstitucionAux:this.datoconstitucions) {
				if(datoconstitucionAux.getDatoConstitucionOriginal().getId().equals(datoconstitucionOriginal.getId())) {
					existe=true;
					datoconstitucionOriginal.setId(datoconstitucionAux.getId());
					datoconstitucionOriginal.setVersionRow(datoconstitucionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDatoConstitucion(Boolean esParaCancelar) throws Exception {
		datoconstitucionsAux=new ArrayList<DatoConstitucion>();
		datoconstitucionAux=new DatoConstitucion();
		
		if(!this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DatoConstitucion datoconstitucionAux:this.datoconstitucionLogic.getDatoConstitucions()) {
					if(datoconstitucionAux.getId()<0) {
						datoconstitucionsAux.add(datoconstitucionAux);
					}		
				}
				this.iIdNuevoDatoConstitucion=0L;
				this.datoconstitucionLogic.getDatoConstitucions().removeAll(datoconstitucionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DatoConstitucion datoconstitucionAux:this.datoconstitucions) {
					if(datoconstitucionAux.getId()<0) {
						datoconstitucionsAux.add(datoconstitucionAux);
					}		
				}
				this.iIdNuevoDatoConstitucion=0L;
				this.datoconstitucions.removeAll(datoconstitucionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDatoConstitucion 
					&& this.datoconstitucionLogic.getDatoConstitucions().size()>0
					) {
					datoconstitucionAux=this.datoconstitucionLogic.getDatoConstitucions().get(this.datoconstitucionLogic.getDatoConstitucions().size() - 1);
				
					if(datoconstitucionAux.getId()<0) {
						this.datoconstitucionLogic.getDatoConstitucions().remove(datoconstitucionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDatoConstitucion && this.datoconstitucions.size()>0) {
					datoconstitucionAux=this.datoconstitucions.get(this.datoconstitucions.size() - 1);
				
					if(datoconstitucionAux.getId()<0) {
						this.datoconstitucions.remove(datoconstitucionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDatoConstitucion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(datoconstitucion.getId()<0) {
				this.datoconstitucionLogic.getDatoConstitucions().remove(this.datoconstitucion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(datoconstitucion.getId()<0) {
				this.datoconstitucions.remove(this.datoconstitucion);
			}
		}			
	}
	
	public void setEstadosInicialesDatoConstitucion(List<DatoConstitucion> datoconstitucionsAux) throws Exception {
		DatoConstitucionConstantesFunciones.setEstadosInicialesDatoConstitucion(datoconstitucionsAux);
	}
	
	public void setEstadosInicialesDatoConstitucion(DatoConstitucion datoconstitucionAux) throws Exception {
		DatoConstitucionConstantesFunciones.setEstadosInicialesDatoConstitucion(datoconstitucionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDatoConstitucionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDatoConstitucion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDatoConstitucionActual()) {
				if(!this.isEsNuevoDatoConstitucion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDatoConstitucion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDatoConstitucion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDatoConstitucionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Dato Constitucion ?", "MANTENIMIENTO DE Dato Constitucion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDatoConstitucion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DatoConstitucion datoconstitucion) throws Exception {
		DatoConstitucionConstantesFunciones.seleccionarAsignar(this.datoconstitucion,datoconstitucion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDatoConstitucion=this.isPermisoActualizarOriginalDatoConstitucion;
			
			
			this.seleccionarAsignar(datoconstitucion);
			
			

			idClienteActual=datoconstitucion.getidcliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DatoConstitucionConstantesFunciones.quitarEspaciosDatoConstitucion(this.datoconstitucion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDatoConstitucion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.datoconstitucionSessionBean.setsFuncionBusquedaRapida(this.datoconstitucionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarClienteActual() throws Exception {
		try	{
			Cliente clienteAux=new Cliente();

			if(this.idClienteActual != null && this.idClienteActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(this.idClienteActual);
					clienteAux= clienteLogic.getCliente();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				clientesForeignKey=new ArrayList<Cliente>();
				clientesForeignKey.add(clienteAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDatoConstitucion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDatoConstitucion(esParaCancelar);				
				this.cancelarNuevoDatoConstitucion(esParaCancelar);								
			}
			
			this.datoconstitucion=new DatoConstitucion();
			
			this.inicializarDatoConstitucion();
			
			this.actualizarEstadoCeldasBotonesDatoConstitucion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDatoConstitucion() throws Exception {
		try {
			DatoConstitucionConstantesFunciones.inicializarDatoConstitucion(this.datoconstitucion);
			
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
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.datoconstitucionLogic.getDatoConstitucions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDatoConstitucions(String sAccionBusqueda,List<DatoConstitucion> datoconstitucionsParaReportes) throws Exception {
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
					sPathReporteFinal="DatoConstitucion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DatoConstitucionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DatoConstitucionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DatoConstitucion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Dato Constituciones");		
		parameters.put("busquedapor", DatoConstitucionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDatoConstitucion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DatoConstitucionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DatoConstitucionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDatoConstitucion=new JRBeanArrayDataSource(DatoConstitucionJInternalFrame.TraerDatoConstitucionBeans(datoconstitucionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDatoConstitucion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DatoConstitucionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DatoConstitucionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DatoConstitucionBean.TraerDatoConstitucionBeans(datoconstitucionsParaReportes).toArray()));
							
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
				this.generarExcelReporteDatoConstitucions(sAccionBusqueda,sTipoArchivoReporte,datoconstitucionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDatoConstitucions(sAccionBusqueda,sTipoArchivoReporte,datoconstitucionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDatoConstitucionActionPerformed(null);
					//this.generarExcelReporteDatoConstitucions(sAccionBusqueda,sTipoArchivoReporte,datoconstitucionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDatoConstitucions(sAccionBusqueda,sTipoArchivoReporte,datoconstitucionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDatoConstitucions(sAccionBusqueda,sTipoArchivoReporte,datoconstitucionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDatoConstitucions(sAccionBusqueda,sTipoArchivoReporte,datoconstitucionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDatoConstitucions(String sAccionBusqueda,String sTipoArchivoReporte,List<DatoConstitucion> datoconstitucionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"datoconstitucion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DatoConstitucions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDatoConstitucion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DatoConstitucion datoconstitucion : datoconstitucionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DatoConstitucionConstantesFunciones.generarExcelReporteDataDatoConstitucion("NORMAL",row,workbook,datoconstitucion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato Constitucion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDatoConstitucion(String sTipo,Row row,Workbook workbook) {
		
		DatoConstitucionConstantesFunciones.generarExcelReporteHeaderDatoConstitucion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDatoConstitucions(String sAccionBusqueda,String sTipoArchivoReporte,List<DatoConstitucion> datoconstitucionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"datoconstitucion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DatoConstitucions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DatoConstitucion datoconstitucion : datoconstitucionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DatoConstitucionConstantesFunciones.getDatoConstitucionDescripcion(datoconstitucion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoConstitucionConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoConstitucionConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(datoconstitucion.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoConstitucionConstantesFunciones.LABEL_IDTIPOCOMPANIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoConstitucionConstantesFunciones.LABEL_IDTIPOCOMPANIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(datoconstitucion.gettipocompania_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoConstitucionConstantesFunciones.LABEL_DIRECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoConstitucionConstantesFunciones.LABEL_DIRECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(datoconstitucion.getdireccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoConstitucionConstantesFunciones.LABEL_FECHACONSTITUCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoConstitucionConstantesFunciones.LABEL_FECHACONSTITUCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(datoconstitucion.getfechaconstitucion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoConstitucionConstantesFunciones.LABEL_CAPITALSUSCRITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoConstitucionConstantesFunciones.LABEL_CAPITALSUSCRITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(datoconstitucion.getcapitalsuscrito());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoConstitucionConstantesFunciones.LABEL_PLAZOFINIQUITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoConstitucionConstantesFunciones.LABEL_PLAZOFINIQUITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(datoconstitucion.getplazofiniquito());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoConstitucionConstantesFunciones.LABEL_RESERVALEGAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoConstitucionConstantesFunciones.LABEL_RESERVALEGAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(datoconstitucion.getreservalegal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoConstitucionConstantesFunciones.LABEL_FECHAESTATUTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoConstitucionConstantesFunciones.LABEL_FECHAESTATUTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(datoconstitucion.getfechaestatuto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DatoConstitucionConstantesFunciones.LABEL_ESACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DatoConstitucionConstantesFunciones.LABEL_ESACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(datoconstitucion.getesactivo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato Constitucion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDatoConstitucions(String sAccionBusqueda,String sTipoArchivoReporte,List<DatoConstitucion> datoconstitucionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DatoConstitucion> datoconstitucionsRespaldo=null;
		
		classes=DatoConstitucionConstantesFunciones.getClassesRelationshipsOfDatoConstitucion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.datoconstitucionLogic.setDatosCliente(this.datosCliente);
		this.datoconstitucionLogic.setDatosDeep(this.datosDeep);
		this.datoconstitucionLogic.setIsConDeep(true);
		
		datoconstitucionsRespaldo=this.datoconstitucionLogic.getDatoConstitucions();
		
		this.datoconstitucionLogic.setDatoConstitucions(datoconstitucionsParaReportes);	
		this.datoconstitucionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		datoconstitucionsParaReportes=this.datoconstitucionLogic.getDatoConstitucions();
		this.datoconstitucionLogic.setDatoConstitucions(datoconstitucionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"datoconstitucion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DatoConstitucions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDatoConstitucion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DatoConstitucion datoconstitucion : datoconstitucionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDatoConstitucion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DatoConstitucionConstantesFunciones.generarExcelReporteDataDatoConstitucion("NORMAL",row,workbook,datoconstitucion,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DatoConstitucionConstantesFunciones.getDatoConstitucionDescripcion(datoconstitucion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato Constitucion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDatoConstitucion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDatoConstitucion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDatoConstitucion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDatoConstitucion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDatoConstitucion() throws Exception {		
		this.startProcessDatoConstitucion(true);
	}
	
	public void startProcessDatoConstitucion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDatoConstitucion ,this.jPanelParametrosReportesDatoConstitucion, this.jScrollPanelDatosDatoConstitucion,this.jPanelPaginacionDatoConstitucion, this.jScrollPanelDatosEdicionDatoConstitucion, this.jPanelAccionesDatoConstitucion,this.jPanelAccionesFormularioDatoConstitucion,this.jmenuBarDatoConstitucion,this.jmenuBarDetalleDatoConstitucion,this.jTtoolBarDatoConstitucion,this.jTtoolBarDetalleDatoConstitucion);		
		
		final JTabbedPane jTabbedPaneBusquedasDatoConstitucion=this.jTabbedPaneBusquedasDatoConstitucion; 
		
		final JPanel jPanelParametrosReportesDatoConstitucion=this.jPanelParametrosReportesDatoConstitucion;
		//final JScrollPane jScrollPanelDatosDatoConstitucion=this.jScrollPanelDatosDatoConstitucion;
		final JTable jTableDatosDatoConstitucion=this.jTableDatosDatoConstitucion;		
		final JPanel jPanelPaginacionDatoConstitucion=this.jPanelPaginacionDatoConstitucion;
		//final JScrollPane jScrollPanelDatosEdicionDatoConstitucion=this.jScrollPanelDatosEdicionDatoConstitucion;
		final JPanel jPanelAccionesDatoConstitucion=this.jPanelAccionesDatoConstitucion;
		
		JPanel jPanelCamposAuxiliarDatoConstitucion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDatoConstitucion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDatoConstitucion!=null) {
			jPanelCamposAuxiliarDatoConstitucion=this.jInternalFrameDetalleFormDatoConstitucion.jPanelCamposDatoConstitucion;
			jPanelAccionesFormularioAuxiliarDatoConstitucion=this.jInternalFrameDetalleFormDatoConstitucion.jPanelAccionesFormularioDatoConstitucion;
		}
		
		final JPanel jPanelCamposDatoConstitucion=jPanelCamposAuxiliarDatoConstitucion;
		final JPanel jPanelAccionesFormularioDatoConstitucion=jPanelAccionesFormularioAuxiliarDatoConstitucion;
		
		
		final JMenuBar jmenuBarDatoConstitucion=this.jmenuBarDatoConstitucion;
		final JToolBar jTtoolBarDatoConstitucion=this.jTtoolBarDatoConstitucion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDatoConstitucion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDatoConstitucion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDatoConstitucion!=null) {
			jmenuBarDetalleAuxiliarDatoConstitucion=this.jInternalFrameDetalleFormDatoConstitucion.jmenuBarDetalleDatoConstitucion;
			jTtoolBarDetalleAuxiliarDatoConstitucion=this.jInternalFrameDetalleFormDatoConstitucion.jTtoolBarDetalleDatoConstitucion;
		}
		
		final JMenuBar jmenuBarDetalleDatoConstitucion=jmenuBarDetalleAuxiliarDatoConstitucion;
		final JToolBar jTtoolBarDetalleDatoConstitucion=jTtoolBarDetalleAuxiliarDatoConstitucion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDatoConstitucion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDatoConstitucion;
			processRunnable.jTableDatos=jTableDatosDatoConstitucion;
			processRunnable.jPanelCampos=jPanelCamposDatoConstitucion;
			processRunnable.jPanelPaginacion=jPanelPaginacionDatoConstitucion;
			processRunnable.jPanelAcciones=jPanelAccionesDatoConstitucion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDatoConstitucion;
			
			
			processRunnable.jmenuBar=jmenuBarDatoConstitucion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDatoConstitucion;
			processRunnable.jTtoolBar=jTtoolBarDatoConstitucion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDatoConstitucion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDatoConstitucion ,jPanelParametrosReportesDatoConstitucion,jTableDatosDatoConstitucion, /*jScrollPanelDatosDatoConstitucion,*/jPanelCamposDatoConstitucion,jPanelPaginacionDatoConstitucion, /*jScrollPanelDatosEdicionDatoConstitucion,*/ jPanelAccionesDatoConstitucion,jPanelAccionesFormularioDatoConstitucion,jmenuBarDatoConstitucion,jmenuBarDetalleDatoConstitucion,jTtoolBarDatoConstitucion,jTtoolBarDetalleDatoConstitucion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDatoConstitucion ,jPanelParametrosReportesDatoConstitucion, jScrollPanelDatosDatoConstitucion,jPanelPaginacionDatoConstitucion, jScrollPanelDatosEdicionDatoConstitucion, jPanelAccionesDatoConstitucion,jPanelAccionesFormularioDatoConstitucion,jmenuBarDatoConstitucion,jmenuBarDetalleDatoConstitucion,jTtoolBarDatoConstitucion,jTtoolBarDetalleDatoConstitucion);
						
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
	
	public void finishProcessDatoConstitucion() {// throws Exception 
		this.finishProcessDatoConstitucion(true);
	}
	
	public void finishProcessDatoConstitucion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDatoConstitucion ,this.jPanelParametrosReportesDatoConstitucion, this.jScrollPanelDatosDatoConstitucion,this.jPanelPaginacionDatoConstitucion, this.jScrollPanelDatosEdicionDatoConstitucion, this.jPanelAccionesDatoConstitucion,this.jPanelAccionesFormularioDatoConstitucion,this.jmenuBarDatoConstitucion,this.jmenuBarDetalleDatoConstitucion,this.jTtoolBarDatoConstitucion,this.jTtoolBarDetalleDatoConstitucion);		
		
		final JTabbedPane jTabbedPaneBusquedasDatoConstitucion=this.jTabbedPaneBusquedasDatoConstitucion; 
		
		final JPanel jPanelParametrosReportesDatoConstitucion=this.jPanelParametrosReportesDatoConstitucion;
		//final JScrollPane jScrollPanelDatosDatoConstitucion=this.jScrollPanelDatosDatoConstitucion;
		final JTable jTableDatosDatoConstitucion=this.jTableDatosDatoConstitucion;		
		final JPanel jPanelPaginacionDatoConstitucion=this.jPanelPaginacionDatoConstitucion;
		//final JScrollPane jScrollPanelDatosEdicionDatoConstitucion=this.jScrollPanelDatosEdicionDatoConstitucion;
		final JPanel jPanelAccionesDatoConstitucion=this.jPanelAccionesDatoConstitucion;
		
		JPanel jPanelCamposAuxiliarDatoConstitucion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDatoConstitucion=new JPanel();
		
		if(this.jInternalFrameDetalleFormDatoConstitucion!=null) {
			jPanelCamposAuxiliarDatoConstitucion=this.jInternalFrameDetalleFormDatoConstitucion.jPanelCamposDatoConstitucion;
			jPanelAccionesFormularioAuxiliarDatoConstitucion=this.jInternalFrameDetalleFormDatoConstitucion.jPanelAccionesFormularioDatoConstitucion;
		}
		
		final JPanel jPanelCamposDatoConstitucion=jPanelCamposAuxiliarDatoConstitucion;
		final JPanel jPanelAccionesFormularioDatoConstitucion=jPanelAccionesFormularioAuxiliarDatoConstitucion;
		
		
		final JMenuBar jmenuBarDatoConstitucion=this.jmenuBarDatoConstitucion;		
		final JToolBar jTtoolBarDatoConstitucion=this.jTtoolBarDatoConstitucion;
				
		JMenuBar jmenuBarDetalleAuxiliarDatoConstitucion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDatoConstitucion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDatoConstitucion!=null) {
			jmenuBarDetalleAuxiliarDatoConstitucion=this.jInternalFrameDetalleFormDatoConstitucion.jmenuBarDetalleDatoConstitucion;
			jTtoolBarDetalleAuxiliarDatoConstitucion=this.jInternalFrameDetalleFormDatoConstitucion.jTtoolBarDetalleDatoConstitucion;		
		}
		
		final JMenuBar jmenuBarDetalleDatoConstitucion=jmenuBarDetalleAuxiliarDatoConstitucion;
		final JToolBar jTtoolBarDetalleDatoConstitucion=jTtoolBarDetalleAuxiliarDatoConstitucion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDatoConstitucion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDatoConstitucion;
			processRunnable.jTableDatos=jTableDatosDatoConstitucion;
			processRunnable.jPanelCampos=jPanelCamposDatoConstitucion;
			processRunnable.jPanelPaginacion=jPanelPaginacionDatoConstitucion;
			processRunnable.jPanelAcciones=jPanelAccionesDatoConstitucion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDatoConstitucion;
			
			
			processRunnable.jmenuBar=jmenuBarDatoConstitucion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDatoConstitucion;
			processRunnable.jTtoolBar=jTtoolBarDatoConstitucion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDatoConstitucion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDatoConstitucion ,jPanelParametrosReportesDatoConstitucion, jTableDatosDatoConstitucion,/*jScrollPanelDatosDatoConstitucion,*/jPanelCamposDatoConstitucion,jPanelPaginacionDatoConstitucion, /*jScrollPanelDatosEdicionDatoConstitucion,*/ jPanelAccionesDatoConstitucion,jPanelAccionesFormularioDatoConstitucion,jmenuBarDatoConstitucion,jmenuBarDetalleDatoConstitucion,jTtoolBarDatoConstitucion,jTtoolBarDetalleDatoConstitucion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDatoConstitucion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDatoConstitucion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDatoConstitucion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDatoConstitucion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDatoConstitucion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDatoConstitucion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDatoConstitucion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDatoConstitucion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDatoConstitucion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.datoconstitucionConstantesFunciones.getsFinalQueryDatoConstitucion();
		String  finalQueryPaginacionTodos=this.datoconstitucionConstantesFunciones.getsFinalQueryDatoConstitucion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DatoConstitucionConstantesFunciones.getArrayColumnasGlobalesNoDatoConstitucion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DatoConstitucionConstantesFunciones.getArrayColumnasGlobalesDatoConstitucion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DatoConstitucionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.datoconstitucionsEliminados= new ArrayList<DatoConstitucion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDatoConstitucion();
		
				///*DatoConstitucionSessionBean*/this.datoconstitucionSessionBean=new DatoConstitucionSessionBean();
			
			if(this.datoconstitucionSessionBean==null) {
				this.datoconstitucionSessionBean=new DatoConstitucionSessionBean();
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
					this.iNumeroPaginacion=DatoConstitucionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DatoConstitucionConstantesFunciones.getClassesForeignKeysOfDatoConstitucion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/datoconstitucion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			datoconstitucionsAux= new ArrayList<DatoConstitucion>();
			
				
			datoconstitucionLogic.setDatosCliente(this.datosCliente);
			datoconstitucionLogic.setDatosDeep(this.datosDeep);
			datoconstitucionLogic.setIsConDeep(true);
			
			
			datoconstitucionLogic.getDatoConstitucionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					datoconstitucionLogic.getTodosDatoConstitucions(finalQueryGlobal,pagination);
					
					//datoconstitucionLogic.getTodosDatoConstitucionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(datoconstitucionLogic.getDatoConstitucions()==null|| datoconstitucionLogic.getDatoConstitucions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							datoconstitucionsAux= new ArrayList<DatoConstitucion>();
							datoconstitucionsAux.addAll(datoconstitucionLogic.getDatoConstitucions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datoconstitucionsAux= new ArrayList<DatoConstitucion>();
							datoconstitucionsAux.addAll(datoconstitucions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							datoconstitucionLogic.getTodosDatoConstitucions(finalQueryGlobal+"",this.pagination);												
							
							//datoconstitucionLogic.getTodosDatoConstitucionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDatoConstitucions("Todos",datoconstitucionLogic.getDatoConstitucions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							datoconstitucionLogic.setDatoConstitucions(new ArrayList<DatoConstitucion>());					
							datoconstitucionLogic.getDatoConstitucions().addAll(datoconstitucionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datoconstitucions=new ArrayList<DatoConstitucion>();
							datoconstitucions.addAll(datoconstitucionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDatoConstitucion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDatoConstitucion=this.idActual;
				
				} else if(this.idDatoConstitucionActual!=null && this.idDatoConstitucionActual!=0L) {
					idDatoConstitucion=idDatoConstitucionActual;
				}
				
					
				this.sDetalleReporte=DatoConstitucionConstantesFunciones.getDetalleIndicePorId(idDatoConstitucion);
				
				this.datoconstitucions=new ArrayList<DatoConstitucion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					datoconstitucionLogic.getEntity(idDatoConstitucion);
					
					//datoconstitucionLogic.getEntityWithConnection(idDatoConstitucion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					datoconstitucionLogic.setDatoConstitucions(new ArrayList<DatoConstitucion>());
					datoconstitucionLogic.getDatoConstitucions().add(datoconstitucionLogic.getDatoConstitucion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.datoconstitucions=new ArrayList<DatoConstitucion>();
					this.datoconstitucions.add(datoconstitucion);
				}
				
				if(datoconstitucionLogic.getDatoConstitucion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=DatoConstitucionConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					datoconstitucionLogic.getDatoConstitucionsFK_IdCliente(finalQueryGlobal,pagination,idclienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DatoConstitucionConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DatoConstitucionConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=datoconstitucionLogic.getDatoConstitucions()==null||datoconstitucionLogic.getDatoConstitucions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=datoconstitucions==null|| datoconstitucions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						datoconstitucionsAux=new ArrayList<DatoConstitucion>();
						datoconstitucionsAux.addAll(datoconstitucionLogic.getDatoConstitucions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datoconstitucionsAux=new ArrayList<DatoConstitucion>();
							datoconstitucionsAux.addAll(datoconstitucions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							datoconstitucionLogic.getDatoConstitucionsFK_IdCliente(finalQueryGlobal,pagination,idclienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DatoConstitucionConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DatoConstitucionConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDatoConstitucions("FK_IdCliente",datoconstitucionLogic.getDatoConstitucions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDatoConstitucions("FK_IdCliente",datoconstitucions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						datoconstitucionLogic.setDatoConstitucions(new ArrayList<DatoConstitucion>());
						datoconstitucionLogic.getDatoConstitucions().addAll(datoconstitucionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datoconstitucions=new ArrayList<DatoConstitucion>();
							datoconstitucions.addAll(datoconstitucionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdValorClienteCompania")) {
				this.sDetalleReporte=DatoConstitucionConstantesFunciones.getDetalleIndiceFK_IdValorClienteCompania(idvalorclientecompaniaFK_IdValorClienteCompania);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					datoconstitucionLogic.getDatoConstitucionsFK_IdValorClienteCompania(finalQueryGlobal,pagination,idvalorclientecompaniaFK_IdValorClienteCompania);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DatoConstitucionConstantesFunciones.getDetalleIndiceFK_IdValorClienteCompania(idvalorclientecompaniaFK_IdValorClienteCompania);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DatoConstitucionConstantesFunciones.getDetalleIndiceFK_IdValorClienteCompania(idvalorclientecompaniaFK_IdValorClienteCompania);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=datoconstitucionLogic.getDatoConstitucions()==null||datoconstitucionLogic.getDatoConstitucions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=datoconstitucions==null|| datoconstitucions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						datoconstitucionsAux=new ArrayList<DatoConstitucion>();
						datoconstitucionsAux.addAll(datoconstitucionLogic.getDatoConstitucions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datoconstitucionsAux=new ArrayList<DatoConstitucion>();
							datoconstitucionsAux.addAll(datoconstitucions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							datoconstitucionLogic.getDatoConstitucionsFK_IdValorClienteCompania(finalQueryGlobal,pagination,idvalorclientecompaniaFK_IdValorClienteCompania);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DatoConstitucionConstantesFunciones.getDetalleIndiceFK_IdValorClienteCompania(idvalorclientecompaniaFK_IdValorClienteCompania);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DatoConstitucionConstantesFunciones.getDetalleIndiceFK_IdValorClienteCompania(idvalorclientecompaniaFK_IdValorClienteCompania);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDatoConstitucions("FK_IdValorClienteCompania",datoconstitucionLogic.getDatoConstitucions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDatoConstitucions("FK_IdValorClienteCompania",datoconstitucions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						datoconstitucionLogic.setDatoConstitucions(new ArrayList<DatoConstitucion>());
						datoconstitucionLogic.getDatoConstitucions().addAll(datoconstitucionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datoconstitucions=new ArrayList<DatoConstitucion>();
							datoconstitucions.addAll(datoconstitucionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDatoConstitucion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDatoConstitucion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=datoconstitucionLogic.getDatoConstitucions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=datoconstitucions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=datoconstitucionLogic.getDatoConstitucions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=datoconstitucions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DatoConstitucion datoconstitucion) {
		Boolean permite=true;
		
		if(this.datoconstitucion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DatoConstitucionConstantesFunciones.getOrderByListaDatoConstitucion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DatoConstitucionConstantesFunciones.getOrderByListaDatoConstitucion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DatoConstitucion datoconstitucion:datoconstitucionLogic.getDatoConstitucions()) {
				if(datoconstitucion.getsType().equals(Constantes2.S_TOTALES)) {
					datoconstitucionTotales=datoconstitucion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DatoConstitucion datoconstitucion:this.datoconstitucions) {
				if(datoconstitucion.getsType().equals(Constantes2.S_TOTALES)) {
					datoconstitucionTotales=datoconstitucion;
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
			this.datoconstitucionAux=new DatoConstitucion();
			this.datoconstitucionAux.setsType(Constantes2.S_TOTALES);
			this.datoconstitucionAux.setIsNew(false);
			this.datoconstitucionAux.setIsChanged(false);
			this.datoconstitucionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DatoConstitucionConstantesFunciones.TotalizarValoresFilaDatoConstitucion(this.datoconstitucionLogic.getDatoConstitucions(),this.datoconstitucionAux);
				
				this.datoconstitucionLogic.getDatoConstitucions().add(this.datoconstitucionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DatoConstitucionConstantesFunciones.TotalizarValoresFilaDatoConstitucion(this.datoconstitucions,this.datoconstitucionAux);
				
				this.datoconstitucions.add(this.datoconstitucionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		datoconstitucionTotales=new DatoConstitucion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.datoconstitucionLogic.getDatoConstitucions().remove(datoconstitucionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.datoconstitucions.remove(datoconstitucionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		datoconstitucionTotales=new DatoConstitucion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DatoConstitucion datoconstitucion:datoconstitucionLogic.getDatoConstitucions()) {
				if(datoconstitucion.getsType().equals(Constantes2.S_TOTALES)) {
					datoconstitucionTotales=datoconstitucion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DatoConstitucionConstantesFunciones.TotalizarValoresFilaDatoConstitucion(this.datoconstitucionLogic.getDatoConstitucions(),datoconstitucionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DatoConstitucion datoconstitucion:this.datoconstitucions) {
				if(datoconstitucion.getsType().equals(Constantes2.S_TOTALES)) {
					datoconstitucionTotales=datoconstitucion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DatoConstitucionConstantesFunciones.TotalizarValoresFilaDatoConstitucion(this.datoconstitucions,datoconstitucionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDatoConstitucionsFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDatoConstitucionsFK_IdValorClienteCompania()throws Exception {
		try {
			sAccionBusqueda="FK_IdValorClienteCompania";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDatoConstitucionsFK_IdCliente(String sFinalQuery,Long idcliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					datoconstitucionLogic.getDatoConstitucionsFK_IdCliente(sFinalQuery,this.pagination,idcliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDatoConstitucionsFK_IdValorClienteCompania(String sFinalQuery,Long idvalorclientecompania)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					datoconstitucionLogic.getDatoConstitucionsFK_IdValorClienteCompania(sFinalQuery,this.pagination,idvalorclientecompania);
				
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
	
	public void inicializarPermisosDatoConstitucion() {
		this.isPermisoTodoDatoConstitucion=false;
		this.isPermisoNuevoDatoConstitucion=false;
		this.isPermisoActualizarDatoConstitucion=false;
		this.isPermisoActualizarOriginalDatoConstitucion=false;
		this.isPermisoEliminarDatoConstitucion=false;
		this.isPermisoGuardarCambiosDatoConstitucion=false;
		this.isPermisoConsultaDatoConstitucion=false;
		this.isPermisoBusquedaDatoConstitucion=false;
		this.isPermisoReporteDatoConstitucion=false;		
		this.isPermisoOrdenDatoConstitucion=false;		
		this.isPermisoPaginacionMedioDatoConstitucion=false;		
		this.isPermisoPaginacionAltoDatoConstitucion=false;
		this.isPermisoPaginacionTodoDatoConstitucion=false;
		this.isPermisoCopiarDatoConstitucion=false;		
		this.isPermisoVerFormDatoConstitucion=false;		
		this.isPermisoDuplicarDatoConstitucion=false;		
		this.isPermisoOrdenDatoConstitucion=false;		
	}
	
	public void setPermisosUsuarioDatoConstitucion(Boolean isPermiso) {
		this.isPermisoTodoDatoConstitucion=isPermiso;
		this.isPermisoNuevoDatoConstitucion=isPermiso;
		this.isPermisoActualizarDatoConstitucion=isPermiso;
		this.isPermisoActualizarOriginalDatoConstitucion=isPermiso;
		this.isPermisoEliminarDatoConstitucion=isPermiso;
		this.isPermisoGuardarCambiosDatoConstitucion=isPermiso;
		this.isPermisoConsultaDatoConstitucion=isPermiso;
		this.isPermisoBusquedaDatoConstitucion=isPermiso;
		this.isPermisoReporteDatoConstitucion=isPermiso;
		this.isPermisoOrdenDatoConstitucion=isPermiso;		
		this.isPermisoPaginacionMedioDatoConstitucion=isPermiso;		
		this.isPermisoPaginacionAltoDatoConstitucion=isPermiso;		
		this.isPermisoPaginacionTodoDatoConstitucion=isPermiso;		
		this.isPermisoCopiarDatoConstitucion=isPermiso;		
		this.isPermisoVerFormDatoConstitucion=isPermiso;		
		this.isPermisoDuplicarDatoConstitucion=isPermiso;
		this.isPermisoOrdenDatoConstitucion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDatoConstitucion(Boolean isPermiso) {
		//this.isPermisoTodoDatoConstitucion=isPermiso;
		this.isPermisoNuevoDatoConstitucion=isPermiso;
		this.isPermisoActualizarDatoConstitucion=isPermiso;
		this.isPermisoActualizarOriginalDatoConstitucion=isPermiso;
		this.isPermisoEliminarDatoConstitucion=isPermiso;
		this.isPermisoGuardarCambiosDatoConstitucion=isPermiso;
		//this.isPermisoConsultaDatoConstitucion=isPermiso;
		//this.isPermisoBusquedaDatoConstitucion=isPermiso;
		//this.isPermisoReporteDatoConstitucion=isPermiso;
		//this.isPermisoOrdenDatoConstitucion=isPermiso;		
		//this.isPermisoPaginacionMedioDatoConstitucion=isPermiso;		
		//this.isPermisoPaginacionAltoDatoConstitucion=isPermiso;		
		//this.isPermisoPaginacionTodoDatoConstitucion=isPermiso;		
		//this.isPermisoCopiarDatoConstitucion=isPermiso;		
		//this.isPermisoDuplicarDatoConstitucion=isPermiso;
		//this.isPermisoOrdenDatoConstitucion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDatoConstitucionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DatoConstitucionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDatoConstitucion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDatoConstitucionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDatoConstitucionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDatoConstitucionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDatoConstitucionClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDatoConstitucion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DatoConstitucionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DatoConstitucionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDatoConstitucion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDatoConstitucion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDatoConstitucion=this.isPermisoActualizarDatoConstitucion;
			this.isPermisoEliminarDatoConstitucion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDatoConstitucion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDatoConstitucion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDatoConstitucion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDatoConstitucion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDatoConstitucion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDatoConstitucion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDatoConstitucion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDatoConstitucion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDatoConstitucion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDatoConstitucion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDatoConstitucion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDatoConstitucion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDatoConstitucion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDatoConstitucion.setToolTipText(this.jTableDatosDatoConstitucion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDatoConstitucion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDatoConstitucion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DatoConstitucionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DatoConstitucionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDatoConstitucion() throws Exception {
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
	public void inicializarCombosForeignKeyDatoConstitucionListas()throws Exception {
		try	{						
			
				this.clientesForeignKey=new ArrayList();
				this.tipocompaniasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDatoConstitucionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DatoConstitucionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDatoConstitucionListas(false);
			} else {
			
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoCompaniaListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoCompaniaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipocompaniasForeignKey==null||this.tipocompaniasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoCompaniaConstantesFunciones.getArrayColumnasGlobalesTipoCompania(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoCompaniaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoCompaniaConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoCompaniasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyDatoConstitucionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DatoConstitucionParameterReturnGeneral datoconstitucionReturnGeneral=new DatoConstitucionParameterReturnGeneral();
						
			


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.datoconstitucionConstantesFunciones.cargaridclienteDatoConstitucion)
					 || (this.esRecargarFks && this.datoconstitucionConstantesFunciones.cargaridclienteDatoConstitucion)) {

					if(!this.datoconstitucionSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+datoconstitucionSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalTipoCompania="";

				if(((this.tipocompaniasForeignKey==null||this.tipocompaniasForeignKey.size()<=0) && this.datoconstitucionConstantesFunciones.cargaridvalorclientecompaniaDatoConstitucion)
					 || (this.esRecargarFks && this.datoconstitucionConstantesFunciones.cargaridvalorclientecompaniaDatoConstitucion)) {

					if(!this.datoconstitucionSessionBean.getisBusquedaDesdeForeignKeySesionTipoCompania()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoCompaniaConstantesFunciones.getArrayColumnasGlobalesTipoCompania(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoCompania=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoCompaniaConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoCompania=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoCompania, "");
						finalQueryGlobalTipoCompania+=TipoCompaniaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoCompaniasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoCompania=" WHERE " + ConstantesSql.ID + "="+datoconstitucionSessionBean.getlidTipoCompaniaActual();
					}
				} else {
					finalQueryGlobalTipoCompania="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				datoconstitucionReturnGeneral=datoconstitucionLogic.cargarCombosLoteForeignKeyDatoConstitucion(finalQueryGlobalCliente,finalQueryGlobalTipoCompania);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=datoconstitucionReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalTipoCompania.equals("NONE")) {
				this.tipocompaniasForeignKey=datoconstitucionReturnGeneral.gettipocompaniasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDatoConstitucion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyTipoCompania();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {
			if(this.datoconstitucionSessionBean==null) {
				this.datoconstitucionSessionBean=new DatoConstitucionSessionBean();
			}

			if(!this.datoconstitucionSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				Cliente cliente=new Cliente();
				ClienteConstantesFunciones.setClienteDescripcion(cliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				cliente.setId(null);

				if(!ClienteConstantesFunciones.ExisteEnLista(this.clientesForeignKey,cliente,true)) {

					this.clientesForeignKey.add(0,cliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoCompania()throws Exception {
		try {

			if(!this.datoconstitucionSessionBean.getisBusquedaDesdeForeignKeySesionTipoCompania()) {
				TipoCompania tipocompania=new TipoCompania();
				TipoCompaniaConstantesFunciones.setTipoCompaniaDescripcion(tipocompania,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipocompania.setId(null);

				if(!TipoCompaniaConstantesFunciones.ExisteEnLista(this.tipocompaniasForeignKey,tipocompania,true)) {

					this.tipocompaniasForeignKey.add(0,tipocompania);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyDatoConstitucion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDatoConstitucion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDatoConstitucion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
				this.datoconstitucion.setfechaconstitucion(this.parametroGeneralUsuario.getfecha_sistema());
				this.datoconstitucion.setfechaestatuto(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDatoConstitucion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDatoConstitucion(DatoConstitucion datoconstitucion)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(datoconstitucion.getidcliente(),false,"Formulario");
			this.setActualTipoCompaniaForeignKey(datoconstitucion.getidvalorclientecompania(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDatoConstitucion(DatoConstitucion datoconstitucion,String sTipoEvento)throws Exception {	
		try {
			
			

				if(datoconstitucion.getCliente()!=null && !sTipoEvento.equals("idclienteDatoConstitucion")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(datoconstitucion.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDatoConstitucion()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.datoconstitucionConstantesFunciones.getidcliente(),false,"Formulario");
			this.setActualTipoCompaniaForeignKey(this.datoconstitucionConstantesFunciones.getidvalorclientecompania(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDatoConstitucion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDatoConstitucion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDatoConstitucion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDatoConstitucion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDatoConstitucion()throws Exception {
		try {
			

			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameTipoCompaniasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDatoConstitucion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoCompaniasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDatoConstitucion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxidclienteDatoConstitucion!=null && this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxidclienteDatoConstitucion.getItemCount()>0) {
				this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxidclienteDatoConstitucion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxidvalorclientecompaniaDatoConstitucion!=null && this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxidvalorclientecompaniaDatoConstitucion.getItemCount()>0) {
				this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxidvalorclientecompaniaDatoConstitucion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public DatoConstitucionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DatoConstitucionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DatoConstitucionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.datoconstitucionSessionBean=new DatoConstitucionSessionBean(); 
		this.datoconstitucionConstantesFunciones=new DatoConstitucionConstantesFunciones(); 
		this.datoconstitucionBean=new DatoConstitucion();//(this.datoconstitucionConstantesFunciones); 		
		this.datoconstitucionReturnGeneral=new DatoConstitucionParameterReturnGeneral(); 
		
		this.datoconstitucionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.datoconstitucionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DatoConstitucionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DatoConstitucionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DatoConstitucionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDatoConstitucion(true);
			
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
			
			this.datoconstitucionConstantesFunciones=new DatoConstitucionConstantesFunciones(); 
			this.datoconstitucionBean=new DatoConstitucion();//this.datoconstitucionConstantesFunciones); 			
			this.datoconstitucionReturnGeneral=new DatoConstitucionParameterReturnGeneral(); 
		
			DatoConstitucionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Dato Constitucion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.datoconstitucion=new DatoConstitucion();
			this.datoconstitucions = new ArrayList<DatoConstitucion>();
			this.datoconstitucionsAux = new ArrayList<DatoConstitucion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic=new DatoConstitucionLogic();
				this.datoconstitucionLogic.getNewConnexionToDeep("");
			}
			
			//this.datoconstitucionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.datoconstitucionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDatoConstitucion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDatoConstitucion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDatoConstitucion);	
					}
					
					if(this.jInternalFrameImportacionDatoConstitucion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDatoConstitucion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDatoConstitucion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDatoConstitucion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDatoConstitucion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDatoConstitucion);
				this.jInternalFrameDetalleFormDatoConstitucion.setVisible(false);
				this.jInternalFrameDetalleFormDatoConstitucion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDatoConstitucion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDatoConstitucion);
					this.jInternalFrameReporteDinamicoDatoConstitucion.setVisible(false);
					this.jInternalFrameReporteDinamicoDatoConstitucion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDatoConstitucion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDatoConstitucion);
					this.jInternalFrameImportacionDatoConstitucion.setVisible(false);
					this.jInternalFrameImportacionDatoConstitucion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDatoConstitucion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDatoConstitucion);
					this.jInternalFrameOrderByDatoConstitucion.setVisible(false);
					this.jInternalFrameOrderByDatoConstitucion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDatoConstitucionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DatoConstitucionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.datoconstitucionReturnGeneral=new DatoConstitucionParameterReturnGeneral();
			
			this.datoconstitucionParameterGeneral=new DatoConstitucionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.datoconstitucionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DatoConstitucionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DatoConstitucionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.datoconstitucionSessionBean.getEsGuardarRelacionado(),this.datoconstitucionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DatoConstitucionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.datoconstitucionSessionBean.getEsGuardarRelacionado(),this.datoconstitucionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDatoConstitucion=false;
			this.isVisibilidadCeldaDuplicarDatoConstitucion=true;
			this.isVisibilidadCeldaCopiarDatoConstitucion=true;
			this.isVisibilidadCeldaVerFormDatoConstitucion=true;
			this.isVisibilidadCeldaOrdenDatoConstitucion=true;
			this.isVisibilidadCeldaNuevoRelacionesDatoConstitucion=false;
			this.isVisibilidadCeldaModificarDatoConstitucion=false;
			this.isVisibilidadCeldaActualizarDatoConstitucion=false;
			this.isVisibilidadCeldaEliminarDatoConstitucion=false;
			this.isVisibilidadCeldaCancelarDatoConstitucion=false;
			this.isVisibilidadCeldaGuardarDatoConstitucion=false;
			this.isVisibilidadCeldaGuardarCambiosDatoConstitucion=false;
			
			
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdValorClienteCompania=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDatoConstitucion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDatoConstitucion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDatoConstitucion(false);
			
			this.setPermisosUsuarioDatoConstitucion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.datoconstitucionSessionBean.getEsGuardarRelacionado() 
				|| (this.datoconstitucionSessionBean.getEsGuardarRelacionado() && this.datoconstitucionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDatoConstitucionClasesRelacionadas();
			}
			
			if(this.datoconstitucionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDatoConstitucionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DatoConstitucionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDatoConstitucion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDatoConstitucion();
			}
			
			if(!this.isPermisoBusquedaDatoConstitucion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDatoConstitucion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDatoConstitucion,this.isPermisoPaginacionMedioDatoConstitucion,this.isPermisoPaginacionTodoDatoConstitucion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DatoConstitucionConstantesFunciones.getTiposSeleccionarDatoConstitucion());
				
				this.tiposColumnasSelect=DatoConstitucionConstantesFunciones.getTiposSeleccionarDatoConstitucion(true);
				
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
			//if(!this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDatoConstitucion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioDatoConstitucion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioDatoConstitucion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDatoConstitucion() ;
			
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
			
			this.clienteLogic=new ClienteLogic();
			this.tipocompaniaLogic=new TipoCompaniaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				datoconstitucionImplementable= (DatoConstitucionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DatoConstitucionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				datoconstitucionImplementableHome= (DatoConstitucionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DatoConstitucionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.datoconstitucions= new ArrayList<DatoConstitucion>();
			this.datoconstitucionsEliminados= new ArrayList<DatoConstitucion>();
						
			this.isEsNuevoDatoConstitucion=false;
			this.esParaAccionDesdeFormularioDatoConstitucion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.tipocompaniasForeignKey=new ArrayList<TipoCompania>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDatoConstitucion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDatoConstitucion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DatoConstitucionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DatoConstitucionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDatoConstitucion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDatoConstitucion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDatoConstitucion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDatoConstitucion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDatoConstitucion();
			}
			
			DatoConstitucionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDatoConstitucion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDatoConstitucion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDatoConstitucion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDatoConstitucion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DatoConstitucion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDatoConstitucion() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDatoConstitucion")) {
				iIndex=this.jInternalFrameDetalleFormDatoConstitucion.jTabbedPaneRelacionesDatoConstitucion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDatoConstitucion.jTabbedPaneRelacionesDatoConstitucion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDatoConstitucion.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDatoConstitucion();	
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
	
	public void cargarCombosForeignKeyDatoConstitucion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDatoConstitucion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDatoConstitucion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDatoConstitucionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDatoConstitucion();
		
		this.cargarCombosFrameForeignKeyDatoConstitucion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDatoConstitucion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDatoConstitucion();
		}
	}
	
	

	public void cargarCombosForeignKeyCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCliente(this.clientesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoCompania(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoCompaniaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoCompania();
				this.cargarCombosFrameTipoCompaniasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoCompania(this.tipocompaniasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoDatoConstitucionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.datoconstitucionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDatoConstitucion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
			
			
			if(jTableDatosDatoConstitucion.getRowCount()>=1) {
				jTableDatosDatoConstitucion.removeRowSelectionInterval(0, jTableDatosDatoConstitucion.getRowCount()-1);						
			}
			
			this.isEsNuevoDatoConstitucion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDatoConstitucion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDatoConstitucion(true);			
			//this.datoconstitucion=new DatoConstitucion();
			//this.datoconstitucion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDatoConstitucion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDatoConstitucion() ;
			
			if(DatoConstitucionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDatoConstitucion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.datoconstitucion);	
			this.actualizarInformacion("INFO_PADRE",false,this.datoconstitucion);				
			
			DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
			
			if(this.datoconstitucionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DatoConstitucion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDatoConstitucionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DatoConstitucion> datoconstitucionsSeleccionados=new ArrayList<DatoConstitucion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDatoConstitucion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDatoConstitucion.getSelectedRows().length;			
			}
			
			datoconstitucionsSeleccionados=this.getDatoConstitucionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDatoConstitucion--;			
				//DatoConstitucion datoconstitucionAux= new DatoConstitucion();			
				//datoconstitucionAux.setId(this.iIdNuevoDatoConstitucion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DatoConstitucion datoconstitucionOrigen=new DatoConstitucion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DatoConstitucion datoconstitucionOrigen : datoconstitucionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDatoConstitucion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							datoconstitucionOrigen =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							datoconstitucionOrigen =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDatoConstitucion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.datoconstitucion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDatoConstitucion(datoconstitucionOrigen,this.datoconstitucion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDatoConstitucion(this.datoconstitucion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.datoconstitucionLogic.getDatoConstitucions().add(this.datoconstitucionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.datoconstitucions.add(this.datoconstitucionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDatoConstitucion(false);
				
				this.jTableDatosDatoConstitucion.setRowSelectionInterval(this.getIndiceNuevoDatoConstitucion(), this.getIndiceNuevoDatoConstitucion());
				
				int iLastRow =  this.jTableDatosDatoConstitucion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDatoConstitucion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDatoConstitucion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDatoConstitucion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDatoConstitucionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DatoConstitucion> datoconstitucionsSeleccionados=new ArrayList<DatoConstitucion>();									
		
			DatoConstitucion datoconstitucionOrigen=new DatoConstitucion();
			DatoConstitucion datoconstitucionDestino=new DatoConstitucion();
				
			datoconstitucionsSeleccionados=this.getDatoConstitucionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDatoConstitucion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || datoconstitucionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDatoConstitucion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						datoconstitucionOrigen =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						datoconstitucionOrigen =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						datoconstitucionDestino =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						datoconstitucionDestino =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				datoconstitucionOrigen =datoconstitucionsSeleccionados.get(0);
				datoconstitucionDestino =datoconstitucionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDatoConstitucion(datoconstitucionOrigen,datoconstitucionDestino,true,false);
				
				datoconstitucionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(datoconstitucionDestino,datoconstitucionLogic.getDatoConstitucions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(datoconstitucionDestino,datoconstitucions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDatoConstitucion(false);
				
				//this.jTableDatosDatoConstitucion.setRowSelectionInterval(this.getIndiceNuevoDatoConstitucion(), this.getIndiceNuevoDatoConstitucion());
				
				int iLastRow =  this.jTableDatosDatoConstitucion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDatoConstitucion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDatoConstitucion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDatoConstitucion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDatoConstitucionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDatoConstitucion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDatoConstitucion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDatoConstitucionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDatoConstitucion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDatoConstitucion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDatoConstitucion.setVisible(!isVisible);
			this.jPanelPaginacionDatoConstitucion.setVisible(!isVisible);
			this.jPanelAccionesDatoConstitucion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDatoConstitucionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDatoConstitucion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDatoConstitucionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDatoConstitucion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDatoConstitucionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDatoConstitucion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDatoConstitucionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDatoConstitucion();
			
			this.abrirFrameOrderByDatoConstitucion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDatoConstitucionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDatoConstitucion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDatoConstitucion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDatoConstitucion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDatoConstitucion.isMaximum()) {
					this.jInternalFrameDetalleFormDatoConstitucion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDatoConstitucion.setSize(this.jInternalFrameDetalleFormDatoConstitucion.iWidthFormulario,this.jInternalFrameDetalleFormDatoConstitucion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDatoConstitucion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDatoConstitucion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDatoConstitucion.isMaximum()) {
						this.jInternalFrameDetalleFormDatoConstitucion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDatoConstitucion.jContentPaneDetalleDatoConstitucion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDatoConstitucion.jTabbedPaneRelacionesDatoConstitucion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDatoConstitucion.jContentPaneDetalleDatoConstitucion.getWidth(),DatoConstitucionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDatoConstitucion.jTabbedPaneRelacionesDatoConstitucion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDatoConstitucion.jContentPaneDetalleDatoConstitucion.getWidth(),DatoConstitucionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDatoConstitucion.jTabbedPaneRelacionesDatoConstitucion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDatoConstitucion.jContentPaneDetalleDatoConstitucion.getWidth(),DatoConstitucionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDatoConstitucion.setVisible(true);
	        this.jInternalFrameDetalleFormDatoConstitucion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDatoConstitucion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDatoConstitucion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDatoConstitucion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDatoConstitucion,false,this);
				} else {
					this.jInternalFrameOrderByDatoConstitucion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDatoConstitucion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDatoConstitucion);
				this.jInternalFrameOrderByDatoConstitucion.setVisible(false);
				this.jInternalFrameOrderByDatoConstitucion.setSelected(false);
				
				this.jInternalFrameOrderByDatoConstitucion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDatoConstitucion"));
				
				this.inicializarActualizarBindingTablaOrderByDatoConstitucion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDatoConstitucion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDatoConstitucion==null) {
				
				this.jInternalFrameImportacionDatoConstitucion=new ImportacionJInternalFrame(DatoConstitucionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDatoConstitucion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDatoConstitucion);
				this.jInternalFrameImportacionDatoConstitucion.setVisible(false);
				this.jInternalFrameImportacionDatoConstitucion.setSelected(false);


				this.jInternalFrameImportacionDatoConstitucion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDatoConstitucion"));
				this.jInternalFrameImportacionDatoConstitucion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDatoConstitucion"));
				this.jInternalFrameImportacionDatoConstitucion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDatoConstitucion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDatoConstitucion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDatoConstitucion==null) {
				this.jInternalFrameReporteDinamicoDatoConstitucion=new ReporteDinamicoJInternalFrame(DatoConstitucionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDatoConstitucion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDatoConstitucion);
				this.jInternalFrameReporteDinamicoDatoConstitucion.setVisible(false);
				this.jInternalFrameReporteDinamicoDatoConstitucion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDatoConstitucion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDatoConstitucion"));
				this.jInternalFrameReporteDinamicoDatoConstitucion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDatoConstitucion"));
				this.jInternalFrameReporteDinamicoDatoConstitucion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDatoConstitucion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDatoConstitucion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDatoConstitucion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDatoConstitucion);
			
	       	this.jInternalFrameDetalleFormDatoConstitucion.setVisible(false);
	        this.jInternalFrameDetalleFormDatoConstitucion.setSelected(false);
			
			//this.jInternalFrameDetalleFormDatoConstitucion.dispose();
			//this.jInternalFrameDetalleFormDatoConstitucion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDatoConstitucion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDatoConstitucion.setVisible(true);
	        this.jInternalFrameReporteDinamicoDatoConstitucion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDatoConstitucion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDatoConstitucion.setVisible(true);
	        this.jInternalFrameImportacionDatoConstitucion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDatoConstitucion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDatoConstitucion.setVisible(true);
	        this.jInternalFrameOrderByDatoConstitucion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDatoConstitucion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDatoConstitucion.setVisible(false);
	        this.jInternalFrameOrderByDatoConstitucion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDatoConstitucion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDatoConstitucion.setVisible(false);
	        this.jInternalFrameReporteDinamicoDatoConstitucion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDatoConstitucion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDatoConstitucion.setVisible(false);
	        this.jInternalFrameImportacionDatoConstitucion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDatoConstitucionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDatoConstitucion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDatoConstitucion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDatoConstitucion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDatoConstitucion(true);
			//this.isEsNuevoDatoConstitucion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucion =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.datoconstitucion =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDatoConstitucion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDatoConstitucion(false) ;
			
			if(datoconstitucionSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DatoConstitucionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDatoConstitucion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDatoConstitucion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDatoConstitucionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDatoConstitucion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucion =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datoconstitucion =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDatoConstitucion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDatoConstitucion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDatoConstitucion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDatoConstitucion(true);
			//this.isEsNuevoDatoConstitucion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucion =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.datoconstitucion =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.datoconstitucion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDatoConstitucion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDatoConstitucion(false) ;
			
			if(DatoConstitucionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDatoConstitucion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDatoConstitucion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.datoconstitucionConstantesFunciones.cargaridclienteDatoConstitucion) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingDatoConstitucion(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaidcliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosDatoConstitucion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoConstitucion,DatoConstitucionConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDatoConstitucion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoCompania(List<TipoCompania> tipocompaniasForeignKey)throws Exception{
		TableColumn tableColumnTipoCompania=this.jTableDatosDatoConstitucion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoConstitucion,DatoConstitucionConstantesFunciones.LABEL_IDTIPOCOMPANIA));
		TableCellEditor tableCellEditorTipoCompania =tableColumnTipoCompania.getCellEditor();

		TipoCompaniaTableCell tipocompaniaTableCellFk=(TipoCompaniaTableCell)tableCellEditorTipoCompania;

		if(tipocompaniaTableCellFk!=null) {
			tipocompaniaTableCellFk.settipocompaniasForeignKey(tipocompaniasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDatoConstitucion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipocompaniaTableCellFk.setRowActual(intSelectedRow);
			//tipocompaniaTableCellFk.settipocompaniasForeignKeyActual(tipocompaniasForeignKey);
		//}


		if(tipocompaniaTableCellFk!=null) {
			tipocompaniaTableCellFk.RecargarTipoCompaniasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaidcliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarDatoConstitucionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDatoConstitucion(false);
			
			//if(!this.isEsNuevoDatoConstitucion) {								
				int intSelectedRow = this.jTableDatosDatoConstitucion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucion =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.datoconstitucion =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DatoConstitucionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDatoConstitucion(this.datoconstitucion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDatoConstitucion(this.datoconstitucion);
				
			}
			
			if(this.permiteMantenimiento(this.datoconstitucion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDatoConstitucion=true;
					this.inicializarActualizarBindingTablaDatoConstitucion(false);
					this.isEsNuevoDatoConstitucion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDatoConstitucion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDatoConstitucion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDatoConstitucion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDatoConstitucion(false);
				
				this.habilitarDeshabilitarControlesDatoConstitucion(false);
			
												
				
				if(DatoConstitucionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDatoConstitucion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDatoConstitucionActionPerformed(evt,datoconstitucionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDatoConstitucion(this.datoconstitucion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDatoConstitucion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,datoconstitucionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.datoconstitucion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DatoConstitucion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoConstitucion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDatoConstitucionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDatoConstitucion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucion =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
				this.datoconstitucion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.datoconstitucion =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
				this.datoconstitucion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.datoconstitucion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DatoConstitucionModel) this.jTableDatosDatoConstitucion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDatoConstitucion=true;
				this.inicializarActualizarBindingTablaDatoConstitucion(false);
				this.isEsNuevoDatoConstitucion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDatoConstitucion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDatoConstitucion(false);
				
				this.habilitarDeshabilitarControlesDatoConstitucion(false);
				
				
				
				if(DatoConstitucionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDatoConstitucion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDatoConstitucionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDatoConstitucion.getRowCount()>=1) {
				jTableDatosDatoConstitucion.removeRowSelectionInterval(0, jTableDatosDatoConstitucion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDatoConstitucion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDatoConstitucion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDatoConstitucion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDatoConstitucion(false) ;
			
			this.isEsNuevoDatoConstitucion=false;
			
			if(DatoConstitucionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDatoConstitucion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDatoConstitucionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDatoConstitucion(false);
				
				//SI ES MANUAL
				if(DatoConstitucionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDatoConstitucion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDatoConstitucionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDatoConstitucion--;			
			//DatoConstitucion datoconstitucionAux= new DatoConstitucion();			
			//datoconstitucionAux.setId(this.iIdNuevoDatoConstitucion);
			
			if(this.jInternalFrameDetalleFormDatoConstitucion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDatoConstitucion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDatoConstitucion(this.datoconstitucion);
			
			this.datoconstitucion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.datoconstitucionLogic.getDatoConstitucions().add(this.datoconstitucionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.datoconstitucions.add(this.datoconstitucionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDatoConstitucion(false);
			
			this.jTableDatosDatoConstitucion.setRowSelectionInterval(this.getIndiceNuevoDatoConstitucion(), this.getIndiceNuevoDatoConstitucion());
			
			int iLastRow =  this.jTableDatosDatoConstitucion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDatoConstitucion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDatoConstitucion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDatoConstitucion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDatoConstitucionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDatoConstitucion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDatoConstitucion(false);
			
			//SI ES MANUAL
			if(DatoConstitucionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDatoConstitucion();
			}
			
			//this.abrirFrameTreeDatoConstitucion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDatoConstitucionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Dato ConstitucionES ?", "MANTENIMIENTO DE Dato Constitucion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDatoConstitucion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDatoConstitucion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.datoconstitucionReturnGeneral=datoconstitucionLogic.procesarImportacionDatoConstitucionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.datoconstitucionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDatoConstitucionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDatoConstitucionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDatoConstitucion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDatoConstitucion.setFileImportacion(this.jInternalFrameImportacionDatoConstitucion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDatoConstitucion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDatoConstitucion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDatoConstitucion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDatoConstitucion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDatoConstitucionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DatoConstitucion> datoconstitucionsSeleccionados=new ArrayList<DatoConstitucion>();		

		datoconstitucionsSeleccionados=this.getDatoConstitucionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDatoConstitucion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDatoConstitucion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DatoConstitucionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DatoConstitucionBaseDesign.jrxml";
			
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
			
			this.generarReporteDatoConstitucions("Todos",datoconstitucionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato Constitucion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDatoConstitucion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDatoConstitucion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DatoConstitucionConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DatoConstitucionConstantesFunciones.LABEL_IDTIPOCOMPANIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoCompania_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoCompania_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoCompania_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoCompania_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DatoConstitucionConstantesFunciones.LABEL_DIRECCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DatoConstitucionConstantesFunciones.LABEL_FECHACONSTITUCION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaConstitucion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaConstitucion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaConstitucion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaConstitucion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DatoConstitucionConstantesFunciones.LABEL_CAPITALSUSCRITO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_pitalSuscrito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_pitalSuscrito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_pitalSuscrito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_pitalSuscrito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DatoConstitucionConstantesFunciones.LABEL_PLAZOFINIQUITO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_azoFiniquito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_azoFiniquito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_azoFiniquito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_azoFiniquito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DatoConstitucionConstantesFunciones.LABEL_RESERVALEGAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_servaLegal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_servaLegal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_servaLegal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_servaLegal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DatoConstitucionConstantesFunciones.LABEL_FECHAESTATUTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEstatuto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEstatuto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEstatuto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEstatuto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DatoConstitucionConstantesFunciones.LABEL_ESACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Activo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Activo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Activo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Activo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDatoConstitucion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDatoConstitucion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDatoConstitucion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DatoConstitucionConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="idcliente";
					break;

				case DatoConstitucionConstantesFunciones.LABEL_IDTIPOCOMPANIA:
					sNombreCampoCategoria="idvalorclientecompania";
					break;

				case DatoConstitucionConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoria="direccion";
					break;

				case DatoConstitucionConstantesFunciones.LABEL_FECHACONSTITUCION:
					sNombreCampoCategoria="fechaconstitucion";
					break;

				case DatoConstitucionConstantesFunciones.LABEL_CAPITALSUSCRITO:
					sNombreCampoCategoria="capitalsuscrito";
					break;

				case DatoConstitucionConstantesFunciones.LABEL_PLAZOFINIQUITO:
					sNombreCampoCategoria="plazofiniquito";
					break;

				case DatoConstitucionConstantesFunciones.LABEL_RESERVALEGAL:
					sNombreCampoCategoria="reservalegal";
					break;

				case DatoConstitucionConstantesFunciones.LABEL_FECHAESTATUTO:
					sNombreCampoCategoria="fechaestatuto";
					break;

				case DatoConstitucionConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoria="esactivo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDatoConstitucion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DatoConstitucionConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="idcliente";
					break;

				case DatoConstitucionConstantesFunciones.LABEL_IDTIPOCOMPANIA:
					sNombreCampoCategoriaValor="idvalorclientecompania";
					break;

				case DatoConstitucionConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoriaValor="direccion";
					break;

				case DatoConstitucionConstantesFunciones.LABEL_FECHACONSTITUCION:
					sNombreCampoCategoriaValor="fechaconstitucion";
					break;

				case DatoConstitucionConstantesFunciones.LABEL_CAPITALSUSCRITO:
					sNombreCampoCategoriaValor="capitalsuscrito";
					break;

				case DatoConstitucionConstantesFunciones.LABEL_PLAZOFINIQUITO:
					sNombreCampoCategoriaValor="plazofiniquito";
					break;

				case DatoConstitucionConstantesFunciones.LABEL_RESERVALEGAL:
					sNombreCampoCategoriaValor="reservalegal";
					break;

				case DatoConstitucionConstantesFunciones.LABEL_FECHAESTATUTO:
					sNombreCampoCategoriaValor="fechaestatuto";
					break;

				case DatoConstitucionConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoriaValor="esactivo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDatoConstitucion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDatoConstitucion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DatoConstitucionConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"idcliente");
					break;

				case DatoConstitucionConstantesFunciones.LABEL_IDTIPOCOMPANIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Compania",sNombreCampoCategoria,sNombreCampoCategoriaValor,"idvalorclientecompania");
					break;

				case DatoConstitucionConstantesFunciones.LABEL_DIRECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion");
					break;

				case DatoConstitucionConstantesFunciones.LABEL_FECHACONSTITUCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Constitucion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fechaconstitucion");
					break;

				case DatoConstitucionConstantesFunciones.LABEL_CAPITALSUSCRITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Capital Suscrito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"capitalsuscrito");
					break;

				case DatoConstitucionConstantesFunciones.LABEL_PLAZOFINIQUITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Plazo Finiquito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"plazofiniquito");
					break;

				case DatoConstitucionConstantesFunciones.LABEL_RESERVALEGAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Reserva Legal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"reservalegal");
					break;

				case DatoConstitucionConstantesFunciones.LABEL_FECHAESTATUTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Estatuto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fechaestatuto");
					break;

				case DatoConstitucionConstantesFunciones.LABEL_ESACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esactivo");
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
	
	public void jButtonGenerarExcelReporteDinamicoDatoConstitucionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DatoConstitucion> datoconstitucionsSeleccionados=new ArrayList<DatoConstitucion>();		
		
		datoconstitucionsSeleccionados=this.getDatoConstitucionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"datoconstitucion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DatoConstitucions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDatoConstitucion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDatoConstitucion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DatoConstitucionConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoConstitucionConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(DatoConstitucion datoconstitucion:datoconstitucionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datoconstitucion.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DatoConstitucionConstantesFunciones.LABEL_IDTIPOCOMPANIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoConstitucionConstantesFunciones.LABEL_IDTIPOCOMPANIA);
					iRow++;

					for(DatoConstitucion datoconstitucion:datoconstitucionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datoconstitucion.gettipocompania_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DatoConstitucionConstantesFunciones.LABEL_DIRECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoConstitucionConstantesFunciones.LABEL_DIRECCION);
					iRow++;

					for(DatoConstitucion datoconstitucion:datoconstitucionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datoconstitucion.getdireccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DatoConstitucionConstantesFunciones.LABEL_FECHACONSTITUCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoConstitucionConstantesFunciones.LABEL_FECHACONSTITUCION);
					iRow++;

					for(DatoConstitucion datoconstitucion:datoconstitucionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datoconstitucion.getfechaconstitucion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DatoConstitucionConstantesFunciones.LABEL_CAPITALSUSCRITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoConstitucionConstantesFunciones.LABEL_CAPITALSUSCRITO);
					iRow++;

					for(DatoConstitucion datoconstitucion:datoconstitucionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datoconstitucion.getcapitalsuscrito());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DatoConstitucionConstantesFunciones.LABEL_PLAZOFINIQUITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoConstitucionConstantesFunciones.LABEL_PLAZOFINIQUITO);
					iRow++;

					for(DatoConstitucion datoconstitucion:datoconstitucionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datoconstitucion.getplazofiniquito());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DatoConstitucionConstantesFunciones.LABEL_RESERVALEGAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoConstitucionConstantesFunciones.LABEL_RESERVALEGAL);
					iRow++;

					for(DatoConstitucion datoconstitucion:datoconstitucionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datoconstitucion.getreservalegal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DatoConstitucionConstantesFunciones.LABEL_FECHAESTATUTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoConstitucionConstantesFunciones.LABEL_FECHAESTATUTO);
					iRow++;

					for(DatoConstitucion datoconstitucion:datoconstitucionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datoconstitucion.getfechaestatuto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DatoConstitucionConstantesFunciones.LABEL_ESACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DatoConstitucionConstantesFunciones.LABEL_ESACTIVO);
					iRow++;

					for(DatoConstitucion datoconstitucion:datoconstitucionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(datoconstitucion.getesactivo());
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
			//	this.getFilaCabeceraExportarExcelDatoConstitucion(row);				
			//	iRow++;
			//}				
			
			//for(DatoConstitucion datoconstitucionAux:datoconstitucionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDatoConstitucion(datoconstitucionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato Constitucion",JOptionPane.INFORMATION_MESSAGE);
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
				this.datoconstitucionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDatoConstitucion(false);
			
			//SI ES MANUAL
			if(DatoConstitucionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDatoConstitucion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDatoConstitucionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDatoConstitucion(false);
			
			//SI ES MANUAL
			if(DatoConstitucionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDatoConstitucion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDatoConstitucionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDatoConstitucion(false);
			
			//SI ES MANUAL
			if(DatoConstitucionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDatoConstitucion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDatoConstitucion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDatoConstitucion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDatoConstitucion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDatoConstitucion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDatoConstitucion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDatoConstitucion.setMinimumSize(dimensionMinimum);
		this.jTableDatosDatoConstitucion.setMaximumSize(dimensionMaximum);
		this.jTableDatosDatoConstitucion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDatoConstitucion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDatoConstitucion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDatoConstitucion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDatoConstitucion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDatoConstitucion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDatoConstitucion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDatoConstitucion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDatoConstitucion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DatoConstitucionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DatoConstitucionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDatoConstitucion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDatoConstitucion();
		
		this.inicializarActualizarBindingBotonesManualDatoConstitucion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDatoConstitucion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDatoConstitucion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDatoConstitucion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDatoConstitucion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDatoConstitucion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDatoConstitucion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDatoConstitucion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDatoConstitucion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDatoConstitucion.jCheckBoxPostAccionNuevoDatoConstitucion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDatoConstitucion.jCheckBoxPostAccionSinCerrarDatoConstitucion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDatoConstitucion.jCheckBoxPostAccionSinMensajeDatoConstitucion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDatoConstitucion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDatoConstitucion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDatoConstitucion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDatoConstitucion!=null) {
				this.jInternalFrameDetalleFormDatoConstitucion.jCheckBoxPostAccionNuevoDatoConstitucion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDatoConstitucion.jCheckBoxPostAccionSinCerrarDatoConstitucion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDatoConstitucion.jCheckBoxPostAccionSinMensajeDatoConstitucion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDatoConstitucion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDatoConstitucion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDatoConstitucion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxTiposAccionesFormularioDatoConstitucion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDatoConstitucion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDatoConstitucion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDatoConstitucion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDatoConstitucion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDatoConstitucion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDatoConstitucion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDatoConstitucion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDatoConstitucion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDatoConstitucion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDatoConstitucion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDatoConstitucion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDatoConstitucion(Boolean esInicializar) throws Exception {
		try	{	
			if(DatoConstitucionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDatoConstitucion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDatoConstitucion() throws Exception {
		try	{
			if(DatoConstitucionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDatoConstitucion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDatoConstitucion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxTiposAccionesFormularioDatoConstitucion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxTiposAccionesFormularioDatoConstitucion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDatoConstitucion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDatoConstitucion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDatoConstitucion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDatoConstitucion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDatoConstitucion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDatoConstitucion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDatoConstitucion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDatoConstitucion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDatoConstitucion.addItem(reporte);
			}
			
			
			if(!this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDatoConstitucion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDatoConstitucion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDatoConstitucion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDatoConstitucion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDatoConstitucion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDatoConstitucion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDatoConstitucion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxTiposAccionesFormularioDatoConstitucion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxTiposAccionesFormularioDatoConstitucion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDatoConstitucion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDatoConstitucion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDatoConstitucion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDatoConstitucion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDatoConstitucion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDatoConstitucion!=null) {
				this.jInternalFrameReporteDinamicoDatoConstitucion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDatoConstitucion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDatoConstitucion!=null) {
				this.jInternalFrameReporteDinamicoDatoConstitucion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDatoConstitucion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDatoConstitucion!=null) {
				
				if(this.jInternalFrameReporteDinamicoDatoConstitucion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDatoConstitucion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDatoConstitucion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDatoConstitucion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDatoConstitucion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDatoConstitucion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoDatoConstitucion.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDatoConstitucion.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=DatoConstitucionConstantesFunciones.getTiposSeleccionarDatoConstitucion(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDatoConstitucion.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoDatoConstitucion.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoDatoConstitucion.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=DatoConstitucionConstantesFunciones.getTiposSeleccionarDatoConstitucion(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDatoConstitucion.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoDatoConstitucion.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDatoConstitucion.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=DatoConstitucionConstantesFunciones.getTiposSeleccionarDatoConstitucion(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDatoConstitucion.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoDatoConstitucion.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoDatoConstitucion.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoDatoConstitucion.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDatoConstitucion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxidclienteFK_IdClienteDatoConstitucion.getSelectedItem()!=null){this.idclienteFK_IdCliente=((Cliente)this.jComboBoxidclienteFK_IdClienteDatoConstitucion.getSelectedItem()).getId();}
		if(this.jComboBoxidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucion.getSelectedItem()!=null){this.idvalorclientecompaniaFK_IdValorClienteCompania=((TipoCompania)this.jComboBoxidvalorclientecompaniaFK_IdValorClienteCompaniaDatoConstitucion.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDatoConstitucion(Boolean esInicializar) throws Exception {				
		if(DatoConstitucionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDatoConstitucion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDatoConstitucion() throws Exception {
		this.inicializarActualizarBindingTablaDatoConstitucion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDatoConstitucion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDatoConstitucion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDatoConstitucion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDatoConstitucion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DatoConstitucionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDatoConstitucion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDatoConstitucion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DatoConstitucionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDatoConstitucionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoConstitucionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DatoConstitucionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDatoConstitucion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDatoConstitucion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DatoConstitucionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDatoConstitucion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDatoConstitucion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=datoconstitucionLogic.getDatoConstitucions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=datoconstitucions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DatoConstitucionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDatoConstitucion.setModel(new DatoConstitucionModel(this.datoconstitucionLogic.getDatoConstitucions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDatoConstitucion.setModel(new DatoConstitucionModel(this.datoconstitucions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDatoConstitucion!=null && this.jInternalFrameOrderByDatoConstitucion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDatoConstitucion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDatoConstitucion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoConstitucion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DatoConstitucionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO,datoconstitucionConstantesFunciones.resaltarSeleccionarDatoConstitucion,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DatoConstitucionConstantesFunciones.SCLASSWEBTITULO,datoconstitucionConstantesFunciones.resaltarSeleccionarDatoConstitucion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDatoConstitucion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoConstitucion,DatoConstitucionConstantesFunciones.LABEL_ID));

		if(this.datoconstitucionConstantesFunciones.mostraridDatoConstitucion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoConstitucionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.datoconstitucionConstantesFunciones.resaltaridDatoConstitucion,this.datoconstitucionConstantesFunciones.activaridDatoConstitucion,iSizeTabla,this,true,"idDatoConstitucion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.datoconstitucionConstantesFunciones.resaltaridDatoConstitucion,this.datoconstitucionConstantesFunciones.activaridDatoConstitucion,this,true,"idDatoConstitucion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoConstitucion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoConstitucion,DatoConstitucionConstantesFunciones.LABEL_IDCLIENTE));

		if(this.datoconstitucionConstantesFunciones.mostraridclienteDatoConstitucion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoConstitucionConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.datoconstitucionConstantesFunciones.resaltaridclienteDatoConstitucion,this,this.datoconstitucionConstantesFunciones.activaridclienteDatoConstitucion,iSizeTabla));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.datoconstitucionConstantesFunciones.resaltaridclienteDatoConstitucion,this,this.datoconstitucionConstantesFunciones.activaridclienteDatoConstitucion,true,"idclienteDatoConstitucion","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new DatoConstitucionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoConstitucion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoConstitucion,DatoConstitucionConstantesFunciones.LABEL_IDTIPOCOMPANIA));

		if(this.datoconstitucionConstantesFunciones.mostraridvalorclientecompaniaDatoConstitucion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoConstitucionConstantesFunciones.LABEL_IDTIPOCOMPANIA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoCompaniaTableCell(this.tipocompaniasForeignKey,this.datoconstitucionConstantesFunciones.resaltaridvalorclientecompaniaDatoConstitucion,this,this.datoconstitucionConstantesFunciones.activaridvalorclientecompaniaDatoConstitucion,iSizeTabla));
			tableColumn.setCellEditor(new TipoCompaniaTableCell(this.tipocompaniasForeignKey,this.datoconstitucionConstantesFunciones.resaltaridvalorclientecompaniaDatoConstitucion,this,this.datoconstitucionConstantesFunciones.activaridvalorclientecompaniaDatoConstitucion,true,"idvalorclientecompaniaDatoConstitucion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DatoConstitucionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoConstitucion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoConstitucion,DatoConstitucionConstantesFunciones.LABEL_DIRECCION));

		if(this.datoconstitucionConstantesFunciones.mostrardireccionDatoConstitucion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoConstitucionConstantesFunciones.LABEL_DIRECCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.datoconstitucionConstantesFunciones.resaltardireccionDatoConstitucion,this.datoconstitucionConstantesFunciones.activardireccionDatoConstitucion,iSizeTabla,this,true,"direccionDatoConstitucion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.datoconstitucionConstantesFunciones.resaltardireccionDatoConstitucion,this.datoconstitucionConstantesFunciones.activardireccionDatoConstitucion,this,true,"direccionDatoConstitucion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DatoConstitucionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoConstitucion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoConstitucion,DatoConstitucionConstantesFunciones.LABEL_FECHACONSTITUCION));

		if(this.datoconstitucionConstantesFunciones.mostrarfechaconstitucionDatoConstitucion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoConstitucionConstantesFunciones.LABEL_FECHACONSTITUCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.datoconstitucionConstantesFunciones.resaltarfechaconstitucionDatoConstitucion,this.datoconstitucionConstantesFunciones.activarfechaconstitucionDatoConstitucion,iSizeTabla,this,true,"fechaconstitucionDatoConstitucion","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.datoconstitucionConstantesFunciones.resaltarfechaconstitucionDatoConstitucion,this.datoconstitucionConstantesFunciones.activarfechaconstitucionDatoConstitucion,this,true,"fechaconstitucionDatoConstitucion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new DatoConstitucionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoConstitucion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoConstitucion,DatoConstitucionConstantesFunciones.LABEL_CAPITALSUSCRITO));

		if(this.datoconstitucionConstantesFunciones.mostrarcapitalsuscritoDatoConstitucion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoConstitucionConstantesFunciones.LABEL_CAPITALSUSCRITO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.datoconstitucionConstantesFunciones.resaltarcapitalsuscritoDatoConstitucion,this.datoconstitucionConstantesFunciones.activarcapitalsuscritoDatoConstitucion,iSizeTabla,this,true,"capitalsuscritoDatoConstitucion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.datoconstitucionConstantesFunciones.resaltarcapitalsuscritoDatoConstitucion,this.datoconstitucionConstantesFunciones.activarcapitalsuscritoDatoConstitucion,this,true,"capitalsuscritoDatoConstitucion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DatoConstitucionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoConstitucion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoConstitucion,DatoConstitucionConstantesFunciones.LABEL_PLAZOFINIQUITO));

		if(this.datoconstitucionConstantesFunciones.mostrarplazofiniquitoDatoConstitucion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoConstitucionConstantesFunciones.LABEL_PLAZOFINIQUITO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.datoconstitucionConstantesFunciones.resaltarplazofiniquitoDatoConstitucion,this.datoconstitucionConstantesFunciones.activarplazofiniquitoDatoConstitucion,iSizeTabla,this,true,"plazofiniquitoDatoConstitucion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.datoconstitucionConstantesFunciones.resaltarplazofiniquitoDatoConstitucion,this.datoconstitucionConstantesFunciones.activarplazofiniquitoDatoConstitucion,this,true,"plazofiniquitoDatoConstitucion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DatoConstitucionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoConstitucion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoConstitucion,DatoConstitucionConstantesFunciones.LABEL_RESERVALEGAL));

		if(this.datoconstitucionConstantesFunciones.mostrarreservalegalDatoConstitucion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoConstitucionConstantesFunciones.LABEL_RESERVALEGAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.datoconstitucionConstantesFunciones.resaltarreservalegalDatoConstitucion,this.datoconstitucionConstantesFunciones.activarreservalegalDatoConstitucion,iSizeTabla,this,true,"reservalegalDatoConstitucion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.datoconstitucionConstantesFunciones.resaltarreservalegalDatoConstitucion,this.datoconstitucionConstantesFunciones.activarreservalegalDatoConstitucion,this,true,"reservalegalDatoConstitucion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DatoConstitucionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoConstitucion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoConstitucion,DatoConstitucionConstantesFunciones.LABEL_FECHAESTATUTO));

		if(this.datoconstitucionConstantesFunciones.mostrarfechaestatutoDatoConstitucion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoConstitucionConstantesFunciones.LABEL_FECHAESTATUTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.datoconstitucionConstantesFunciones.resaltarfechaestatutoDatoConstitucion,this.datoconstitucionConstantesFunciones.activarfechaestatutoDatoConstitucion,iSizeTabla,this,true,"fechaestatutoDatoConstitucion","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.datoconstitucionConstantesFunciones.resaltarfechaestatutoDatoConstitucion,this.datoconstitucionConstantesFunciones.activarfechaestatutoDatoConstitucion,this,true,"fechaestatutoDatoConstitucion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new DatoConstitucionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDatoConstitucion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDatoConstitucion,DatoConstitucionConstantesFunciones.LABEL_ESACTIVO));

		if(this.datoconstitucionConstantesFunciones.mostraresactivoDatoConstitucion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DatoConstitucionConstantesFunciones.LABEL_ESACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.datoconstitucionConstantesFunciones.resaltaresactivoDatoConstitucion,this.datoconstitucionConstantesFunciones.activaresactivoDatoConstitucion,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.datoconstitucionConstantesFunciones.resaltaresactivoDatoConstitucion,this.datoconstitucionConstantesFunciones.activaresactivoDatoConstitucion,this,true,"esactivoDatoConstitucion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DatoConstitucionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.datoconstitucionSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.datoconstitucionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.datoconstitucionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDatoConstitucion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.datoconstitucionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.datoconstitucionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDatoConstitucion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDatoConstitucion && this.isPermisoGuardarCambiosDatoConstitucion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.datoconstitucionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.datoconstitucionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDatoConstitucion.addColumn(tableColumn);
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
			
			this.jTableDatosDatoConstitucion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDatoConstitucion && this.isPermisoGuardarCambiosDatoConstitucion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDatoConstitucion && this.isPermisoGuardarCambiosDatoConstitucion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDatoConstitucion.moveColumn(this.jTableDatosDatoConstitucion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDatoConstitucion.moveColumn(this.jTableDatosDatoConstitucion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDatoConstitucion.moveColumn(this.jTableDatosDatoConstitucion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDatoConstitucion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDatoConstitucion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDatoConstitucion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DatoConstitucionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDatoConstitucion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDatoConstitucion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DatoConstitucionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DatoConstitucionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDatoConstitucion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDatoConstitucion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDatoConstitucion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=datoconstitucionLogic.getDatoConstitucions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=datoconstitucions.size()-1;
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
		//this.jTableDatosDatoConstitucion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDatoConstitucion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDatoConstitucion();
			
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
				
				//this.isEsNuevoDatoConstitucion=false;
					
				DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
			
				if(this.datoconstitucionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDatoConstitucion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDatoConstitucion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDatoConstitucion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucion =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datoconstitucion =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.datoconstitucion.getsType().equals("DUPLICADO")
				   || this.datoconstitucion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDatoConstitucion=true;
				
				} else {
					this.isEsNuevoDatoConstitucion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {
					if(this.datoconstitucion.getId()>=0 && !this.datoconstitucion.getIsNew()) {						
						this.isEsNuevoDatoConstitucion=false;
						
					} else {
						this.isEsNuevoDatoConstitucion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDatoConstitucion(esRelaciones);						
				
				this.seleccionarDatoConstitucion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.datoconstitucion.getId()<0) {
					this.isEsNuevoDatoConstitucion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDatoConstitucion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDatoConstitucion(evt,rowIndex);
				}	
				
				if(this.datoconstitucionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DatoConstitucion: " + this.dDif); 
					}
				}								
				
				DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDatoConstitucion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.datoconstitucion)) {
					if(this.datoconstitucion.getId()>0) {
						this.datoconstitucion.setIsDeleted(true);
						
						this.datoconstitucionsEliminados.add(this.datoconstitucion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.datoconstitucionLogic.getDatoConstitucions().remove(this.datoconstitucion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.datoconstitucions.remove(this.datoconstitucion);				
					}
					
					
					((DatoConstitucionModel) this.jTableDatosDatoConstitucion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDatoConstitucion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDatoConstitucion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDatoConstitucion) {
			
			if(this.jInternalFrameDetalleFormDatoConstitucion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDatoConstitucion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDatoConstitucion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucion =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datoconstitucion =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DatoConstitucionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDatoConstitucion(this.datoconstitucion);
				}
				
				//ARCHITECTURE
				try {
					

					//Cliente
					if(!this.datoconstitucionConstantesFunciones.cargaridclienteDatoConstitucion || this.datoconstitucionConstantesFunciones.event_dependidclienteDatoConstitucion) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.datoconstitucion.getidcliente());
									//this.inicializarActualizarBindingDatoConstitucion(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(datoconstitucion.getCliente()!=null) {
							this.clientesForeignKey.add(datoconstitucion.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.datoconstitucion.getidcliente(),false,"Formulario");

					//TipoCompania
					if(!this.datoconstitucionConstantesFunciones.cargaridvalorclientecompaniaDatoConstitucion || this.datoconstitucionConstantesFunciones.event_dependidvalorclientecompaniaDatoConstitucion) {
						//this.cargarCombosTipoCompaniasForeignKeyLista(" where id="+this.datoconstitucion.getidvalorclientecompania());
									//this.inicializarActualizarBindingDatoConstitucion(false,false);
						this.tipocompaniasForeignKey=new ArrayList<TipoCompania>();

						if(datoconstitucion.getTipoCompania()!=null) {
							this.tipocompaniasForeignKey.add(datoconstitucion.getTipoCompania());
						}

						this.addItemDefectoCombosForeignKeyTipoCompania();
						this.cargarCombosFrameTipoCompaniasForeignKey("Todos");
					}
					this.setActualTipoCompaniaForeignKey(this.datoconstitucion.getidvalorclientecompania(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDatoConstitucion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDatoConstitucion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDatoConstitucion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDatoConstitucion(DatoConstitucion datoconstitucion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDatoConstitucion(datoconstitucion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDatoConstitucion(DatoConstitucion datoconstitucion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDatoConstitucion(datoconstitucion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDatoConstitucion(datoconstitucion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDatoConstitucion(datoconstitucion);
	}
	
	public void setVariablesObjetoActualToFormularioDatoConstitucion(DatoConstitucion datoconstitucion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDatoConstitucion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDatoConstitucion.jLabelidDatoConstitucion.setText(datoconstitucion.getId().toString());
			this.jInternalFrameDetalleFormDatoConstitucion.jTextAreadireccionDatoConstitucion.setText(datoconstitucion.getdireccion());
			this.jInternalFrameDetalleFormDatoConstitucion.jDateChooserfechaconstitucionDatoConstitucion.setDate(datoconstitucion.getfechaconstitucion());
			this.jInternalFrameDetalleFormDatoConstitucion.jTextFieldcapitalsuscritoDatoConstitucion.setText(datoconstitucion.getcapitalsuscrito().toString());
			this.jInternalFrameDetalleFormDatoConstitucion.jTextFieldplazofiniquitoDatoConstitucion.setText(datoconstitucion.getplazofiniquito().toString());
			this.jInternalFrameDetalleFormDatoConstitucion.jTextFieldreservalegalDatoConstitucion.setText(datoconstitucion.getreservalegal().toString());
			this.jInternalFrameDetalleFormDatoConstitucion.jDateChooserfechaestatutoDatoConstitucion.setDate(datoconstitucion.getfechaestatuto());
			this.jInternalFrameDetalleFormDatoConstitucion.jCheckBoxesactivoDatoConstitucion.setSelected(datoconstitucion.getesactivo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DatoConstitucion datoconstitucionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,datoconstitucionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DatoConstitucion datoconstitucionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				datoconstitucionLocal=this.datoconstitucion;
			} else {
				datoconstitucionLocal=this.datoconstitucionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(datoconstitucionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDatoConstitucion(datoconstitucionLocal,true);
					
					if(datoconstitucionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(datoconstitucionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(datoconstitucionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDatoConstitucion(DatoConstitucion datoconstitucion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDatoConstitucion(datoconstitucion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDatoConstitucion(datoconstitucion);
	}
	
	public void setVariablesFormularioToObjetoActualDatoConstitucion(DatoConstitucion datoconstitucion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDatoConstitucion(datoconstitucion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDatoConstitucion(DatoConstitucion datoconstitucion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDatoConstitucion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDatoConstitucion.jLabelidDatoConstitucion.getText()==null || this.jInternalFrameDetalleFormDatoConstitucion.jLabelidDatoConstitucion.getText()=="" || this.jInternalFrameDetalleFormDatoConstitucion.jLabelidDatoConstitucion.getText()=="Id") {
				this.jInternalFrameDetalleFormDatoConstitucion.jLabelidDatoConstitucion.setText("0");
			}

			if(conColumnasBase) {datoconstitucion.setId(Long.parseLong(this.jInternalFrameDetalleFormDatoConstitucion.jLabelidDatoConstitucion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoConstitucionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoConstitucion.jLabelIdDatoConstitucion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			datoconstitucion.setdireccion(this.jInternalFrameDetalleFormDatoConstitucion.jTextAreadireccionDatoConstitucion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoConstitucionConstantesFunciones.LABEL_DIRECCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoConstitucion.jLabeldireccionDatoConstitucion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			datoconstitucion.setfechaconstitucion(this.jInternalFrameDetalleFormDatoConstitucion.jDateChooserfechaconstitucionDatoConstitucion.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoConstitucionConstantesFunciones.LABEL_FECHACONSTITUCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoConstitucion.jLabelfechaconstitucionDatoConstitucion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			datoconstitucion.setcapitalsuscrito(Double.parseDouble(this.jInternalFrameDetalleFormDatoConstitucion.jTextFieldcapitalsuscritoDatoConstitucion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoConstitucionConstantesFunciones.LABEL_CAPITALSUSCRITO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoConstitucion.jLabelcapitalsuscritoDatoConstitucion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			datoconstitucion.setplazofiniquito(Integer.parseInt(this.jInternalFrameDetalleFormDatoConstitucion.jTextFieldplazofiniquitoDatoConstitucion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoConstitucionConstantesFunciones.LABEL_PLAZOFINIQUITO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoConstitucion.jLabelplazofiniquitoDatoConstitucion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			datoconstitucion.setreservalegal(Double.parseDouble(this.jInternalFrameDetalleFormDatoConstitucion.jTextFieldreservalegalDatoConstitucion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoConstitucionConstantesFunciones.LABEL_RESERVALEGAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoConstitucion.jLabelreservalegalDatoConstitucion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			datoconstitucion.setfechaestatuto(this.jInternalFrameDetalleFormDatoConstitucion.jDateChooserfechaestatutoDatoConstitucion.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoConstitucionConstantesFunciones.LABEL_FECHAESTATUTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoConstitucion.jLabelfechaestatutoDatoConstitucion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			datoconstitucion.setesactivo(this.jInternalFrameDetalleFormDatoConstitucion.jCheckBoxesactivoDatoConstitucion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DatoConstitucionConstantesFunciones.LABEL_ESACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDatoConstitucion.jLabelesactivoDatoConstitucion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDatoConstitucion(DatoConstitucion datoconstitucionBean,DatoConstitucion datoconstitucion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && datoconstitucionBean.getidcliente()!=null && !datoconstitucionBean.getidcliente().equals(-1L))) {datoconstitucion.setidcliente(datoconstitucionBean.getidcliente());}
			if(conDefault || (!conDefault && datoconstitucionBean.getidvalorclientecompania()!=null && !datoconstitucionBean.getidvalorclientecompania().equals(-1L))) {datoconstitucion.setidvalorclientecompania(datoconstitucionBean.getidvalorclientecompania());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDatoConstitucion(DatoConstitucion datoconstitucionOrigen,DatoConstitucion datoconstitucion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && datoconstitucionOrigen.getId()!=null && !datoconstitucionOrigen.getId().equals(0L))) {datoconstitucion.setId(datoconstitucionOrigen.getId());}}
			if(conDefault || (!conDefault && datoconstitucionOrigen.getidcliente()!=null && !datoconstitucionOrigen.getidcliente().equals(-1L))) {datoconstitucion.setidcliente(datoconstitucionOrigen.getidcliente());}
			if(conDefault || (!conDefault && datoconstitucionOrigen.getidvalorclientecompania()!=null && !datoconstitucionOrigen.getidvalorclientecompania().equals(-1L))) {datoconstitucion.setidvalorclientecompania(datoconstitucionOrigen.getidvalorclientecompania());}
			if(conDefault || (!conDefault && datoconstitucionOrigen.getdireccion()!=null && !datoconstitucionOrigen.getdireccion().equals(""))) {datoconstitucion.setdireccion(datoconstitucionOrigen.getdireccion());}
			if(conDefault || (!conDefault && datoconstitucionOrigen.getfechaconstitucion()!=null && !datoconstitucionOrigen.getfechaconstitucion().equals(new Date()))) {datoconstitucion.setfechaconstitucion(datoconstitucionOrigen.getfechaconstitucion());}
			if(conDefault || (!conDefault && datoconstitucionOrigen.getcapitalsuscrito()!=null && !datoconstitucionOrigen.getcapitalsuscrito().equals(0.0))) {datoconstitucion.setcapitalsuscrito(datoconstitucionOrigen.getcapitalsuscrito());}
			if(conDefault || (!conDefault && datoconstitucionOrigen.getplazofiniquito()!=null && !datoconstitucionOrigen.getplazofiniquito().equals(0))) {datoconstitucion.setplazofiniquito(datoconstitucionOrigen.getplazofiniquito());}
			if(conDefault || (!conDefault && datoconstitucionOrigen.getreservalegal()!=null && !datoconstitucionOrigen.getreservalegal().equals(0.0))) {datoconstitucion.setreservalegal(datoconstitucionOrigen.getreservalegal());}
			if(conDefault || (!conDefault && datoconstitucionOrigen.getfechaestatuto()!=null && !datoconstitucionOrigen.getfechaestatuto().equals(new Date()))) {datoconstitucion.setfechaestatuto(datoconstitucionOrigen.getfechaestatuto());}
			if(conDefault || (!conDefault && datoconstitucionOrigen.getesactivo()!=null && !datoconstitucionOrigen.getesactivo().equals(false))) {datoconstitucion.setesactivo(datoconstitucionOrigen.getesactivo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDatoConstitucion(DatoConstitucion datoconstitucion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDatoConstitucion.jLabelidDatoConstitucion.setText(datoconstitucion.getId().toString());
			this.jInternalFrameDetalleFormDatoConstitucion.jTextAreadireccionDatoConstitucion.setText(datoconstitucion.getdireccion());
			this.jInternalFrameDetalleFormDatoConstitucion.jDateChooserfechaconstitucionDatoConstitucion.setDate(datoconstitucion.getfechaconstitucion());
			this.jInternalFrameDetalleFormDatoConstitucion.jTextFieldcapitalsuscritoDatoConstitucion.setText(datoconstitucion.getcapitalsuscrito().toString());
			this.jInternalFrameDetalleFormDatoConstitucion.jTextFieldplazofiniquitoDatoConstitucion.setText(datoconstitucion.getplazofiniquito().toString());
			this.jInternalFrameDetalleFormDatoConstitucion.jTextFieldreservalegalDatoConstitucion.setText(datoconstitucion.getreservalegal().toString());
			this.jInternalFrameDetalleFormDatoConstitucion.jDateChooserfechaestatutoDatoConstitucion.setDate(datoconstitucion.getfechaestatuto());
			this.jInternalFrameDetalleFormDatoConstitucion.jCheckBoxesactivoDatoConstitucion.setSelected(datoconstitucion.getesactivo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDatoConstitucion(DatoConstitucionBean datoconstitucionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDatoConstitucion.jLabelidDatoConstitucion.setText(datoconstitucionBean.getId().toString());
			this.jInternalFrameDetalleFormDatoConstitucion.jTextAreadireccionDatoConstitucion.setText(datoconstitucionBean.getdireccion());
			this.jInternalFrameDetalleFormDatoConstitucion.jDateChooserfechaconstitucionDatoConstitucion.setDate(datoconstitucionBean.getfechaconstitucion());
			this.jInternalFrameDetalleFormDatoConstitucion.jTextFieldcapitalsuscritoDatoConstitucion.setText(datoconstitucionBean.getcapitalsuscrito().toString());
			this.jInternalFrameDetalleFormDatoConstitucion.jTextFieldplazofiniquitoDatoConstitucion.setText(datoconstitucionBean.getplazofiniquito().toString());
			this.jInternalFrameDetalleFormDatoConstitucion.jTextFieldreservalegalDatoConstitucion.setText(datoconstitucionBean.getreservalegal().toString());
			this.jInternalFrameDetalleFormDatoConstitucion.jDateChooserfechaestatutoDatoConstitucion.setDate(datoconstitucionBean.getfechaestatuto());
			this.jInternalFrameDetalleFormDatoConstitucion.jCheckBoxesactivoDatoConstitucion.setSelected(datoconstitucionBean.getesactivo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDatoConstitucion(DatoConstitucionParameterReturnGeneral datoconstitucionReturnGeneral,DatoConstitucionBean datoconstitucionBean,Boolean conDefault) throws Exception { 
		try {
			DatoConstitucion datoconstitucionLocal=new DatoConstitucion();
			
			datoconstitucionLocal=datoconstitucionReturnGeneral.getDatoConstitucion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && datoconstitucionLocal.getId()!=null && !datoconstitucionLocal.getId().equals(0L))) {datoconstitucionBean.setId(datoconstitucionLocal.getId());}}
			if(conDefault || (!conDefault && datoconstitucionLocal.getidcliente()!=null && !datoconstitucionLocal.getidcliente().equals(-1L))) {datoconstitucionBean.setidcliente(datoconstitucionLocal.getidcliente());}
			if(conDefault || (!conDefault && datoconstitucionLocal.getidvalorclientecompania()!=null && !datoconstitucionLocal.getidvalorclientecompania().equals(-1L))) {datoconstitucionBean.setidvalorclientecompania(datoconstitucionLocal.getidvalorclientecompania());}
			if(conDefault || (!conDefault && datoconstitucionLocal.getdireccion()!=null && !datoconstitucionLocal.getdireccion().equals(""))) {datoconstitucionBean.setdireccion(datoconstitucionLocal.getdireccion());}
			if(conDefault || (!conDefault && datoconstitucionLocal.getfechaconstitucion()!=null && !datoconstitucionLocal.getfechaconstitucion().equals(new Date()))) {datoconstitucionBean.setfechaconstitucion(datoconstitucionLocal.getfechaconstitucion());}
			if(conDefault || (!conDefault && datoconstitucionLocal.getcapitalsuscrito()!=null && !datoconstitucionLocal.getcapitalsuscrito().equals(0.0))) {datoconstitucionBean.setcapitalsuscrito(datoconstitucionLocal.getcapitalsuscrito());}
			if(conDefault || (!conDefault && datoconstitucionLocal.getplazofiniquito()!=null && !datoconstitucionLocal.getplazofiniquito().equals(0))) {datoconstitucionBean.setplazofiniquito(datoconstitucionLocal.getplazofiniquito());}
			if(conDefault || (!conDefault && datoconstitucionLocal.getreservalegal()!=null && !datoconstitucionLocal.getreservalegal().equals(0.0))) {datoconstitucionBean.setreservalegal(datoconstitucionLocal.getreservalegal());}
			if(conDefault || (!conDefault && datoconstitucionLocal.getfechaestatuto()!=null && !datoconstitucionLocal.getfechaestatuto().equals(new Date()))) {datoconstitucionBean.setfechaestatuto(datoconstitucionLocal.getfechaestatuto());}
			if(conDefault || (!conDefault && datoconstitucionLocal.getesactivo()!=null && !datoconstitucionLocal.getesactivo().equals(false))) {datoconstitucionBean.setesactivo(datoconstitucionLocal.getesactivo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDatoConstitucionGenerico(Long idDatoConstitucionSeleccionado,JComboBox jComboBoxDatoConstitucion,List<DatoConstitucion> datoconstitucionsLocal)throws Exception {
		try {
			DatoConstitucion  datoconstitucionTemp=null;

			for(DatoConstitucion datoconstitucionAux:datoconstitucionsLocal) {
				if(datoconstitucionAux.getId()!=null && datoconstitucionAux.getId().equals(idDatoConstitucionSeleccionado)) {
					datoconstitucionTemp=datoconstitucionAux;
					break;
				}
			}

			jComboBoxDatoConstitucion.setSelectedItem(datoconstitucionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDatoConstitucionGenerico(JComboBox jComboBoxDatoConstitucion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDatoConstitucion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDatoConstitucion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDatoConstitucion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDatoConstitucion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDatoConstitucion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDatoConstitucion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDatoConstitucion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDatoConstitucion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDatoConstitucion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDatoConstitucion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			datoconstitucion=(DatoConstitucion) datoconstitucionLogic.getDatoConstitucions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			datoconstitucion =(DatoConstitucion) datoconstitucions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!datoconstitucion.getIsNew() && !datoconstitucion.getIsChanged() && !datoconstitucion.getIsDeleted()) {
				sDescripcion=datoconstitucion.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=datoconstitucion.getcliente_descripcion();
			}
		}

		if(sTipo.equals("TipoCompania")) {
			//sDescripcion=this.getActualTipoCompaniaForeignKeyDescripcion((Long)value);
			if(!datoconstitucion.getIsNew() && !datoconstitucion.getIsChanged() && !datoconstitucion.getIsDeleted()) {
				sDescripcion=datoconstitucion.gettipocompania_descripcion();
			} else {
				//sDescripcion=this.getActualTipoCompaniaForeignKeyDescripcion((Long)value);
				sDescripcion=datoconstitucion.gettipocompania_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DatoConstitucion datoconstitucionRow=new DatoConstitucion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			datoconstitucionRow=(DatoConstitucion) datoconstitucionLogic.getDatoConstitucions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			datoconstitucionRow=(DatoConstitucion) datoconstitucions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDatoConstitucion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDatoConstitucion.setVisible((this.isVisibilidadCeldaNuevoDatoConstitucion && this.isPermisoNuevoDatoConstitucion));			
			this.jButtonDuplicarDatoConstitucion.setVisible((this.isVisibilidadCeldaDuplicarDatoConstitucion && this.isPermisoDuplicarDatoConstitucion));			
			this.jButtonCopiarDatoConstitucion.setVisible((this.isVisibilidadCeldaCopiarDatoConstitucion && this.isPermisoCopiarDatoConstitucion));
			this.jButtonVerFormDatoConstitucion.setVisible((this.isVisibilidadCeldaVerFormDatoConstitucion && this.isPermisoVerFormDatoConstitucion));
			
			this.jButtonAbrirOrderByDatoConstitucion.setVisible((this.isVisibilidadCeldaOrdenDatoConstitucion && this.isPermisoOrdenDatoConstitucion));			
			
			this.jButtonNuevoRelacionesDatoConstitucion.setVisible((this.isVisibilidadCeldaNuevoRelacionesDatoConstitucion && this.isPermisoNuevoDatoConstitucion));			
			this.jButtonNuevoGuardarCambiosDatoConstitucion.setVisible((this.isVisibilidadCeldaNuevoDatoConstitucion && this.isPermisoNuevoDatoConstitucion && this.isPermisoGuardarCambiosDatoConstitucion));
			
			if(this.jInternalFrameDetalleFormDatoConstitucion!=null) {
			this.jInternalFrameDetalleFormDatoConstitucion.jButtonModificarDatoConstitucion.setVisible((this.isVisibilidadCeldaModificarDatoConstitucion && this.isPermisoActualizarDatoConstitucion));	
			this.jInternalFrameDetalleFormDatoConstitucion.jButtonActualizarDatoConstitucion.setVisible((this.isVisibilidadCeldaActualizarDatoConstitucion && this.isPermisoActualizarDatoConstitucion));	
			this.jInternalFrameDetalleFormDatoConstitucion.jButtonEliminarDatoConstitucion.setVisible((this.isVisibilidadCeldaEliminarDatoConstitucion && this.isPermisoEliminarDatoConstitucion));
			this.jInternalFrameDetalleFormDatoConstitucion.jButtonCancelarDatoConstitucion.setVisible(this.isVisibilidadCeldaCancelarDatoConstitucion);							
			this.jInternalFrameDetalleFormDatoConstitucion.jButtonGuardarCambiosDatoConstitucion.setVisible((this.isVisibilidadCeldaGuardarDatoConstitucion && this.isPermisoGuardarCambiosDatoConstitucion));			
			
			}
						
			this.jButtonGuardarCambiosTablaDatoConstitucion.setVisible((this.isVisibilidadCeldaGuardarCambiosDatoConstitucion && this.isPermisoGuardarCambiosDatoConstitucion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDatoConstitucion.setVisible((this.isVisibilidadCeldaNuevoDatoConstitucion && this.isPermisoNuevoDatoConstitucion));						
			this.jButtonDuplicarToolBarDatoConstitucion.setVisible((this.isVisibilidadCeldaDuplicarDatoConstitucion && this.isPermisoDuplicarDatoConstitucion));						
			this.jButtonCopiarToolBarDatoConstitucion.setVisible((this.isVisibilidadCeldaCopiarDatoConstitucion && this.isPermisoCopiarDatoConstitucion));			
			this.jButtonVerFormToolBarDatoConstitucion.setVisible((this.isVisibilidadCeldaVerFormDatoConstitucion && this.isPermisoVerFormDatoConstitucion));			
			this.jButtonAbrirOrderByToolBarDatoConstitucion.setVisible((this.isVisibilidadCeldaOrdenDatoConstitucion && this.isPermisoOrdenDatoConstitucion));
			this.jButtonNuevoRelacionesToolBarDatoConstitucion.setVisible((this.isVisibilidadCeldaNuevoRelacionesDatoConstitucion && this.isPermisoNuevoDatoConstitucion));			
			this.jButtonNuevoGuardarCambiosToolBarDatoConstitucion.setVisible((this.isVisibilidadCeldaNuevoDatoConstitucion && this.isPermisoNuevoDatoConstitucion && this.isPermisoGuardarCambiosDatoConstitucion));			
			
			if(this.jInternalFrameDetalleFormDatoConstitucion!=null) {
			this.jInternalFrameDetalleFormDatoConstitucion.jButtonModificarToolBarDatoConstitucion.setVisible((this.isVisibilidadCeldaModificarDatoConstitucion && this.isPermisoActualizarDatoConstitucion));	
			this.jInternalFrameDetalleFormDatoConstitucion.jButtonActualizarToolBarDatoConstitucion.setVisible((this.isVisibilidadCeldaActualizarDatoConstitucion  && this.isPermisoActualizarDatoConstitucion));	
			this.jInternalFrameDetalleFormDatoConstitucion.jButtonEliminarToolBarDatoConstitucion.setVisible((this.isVisibilidadCeldaEliminarDatoConstitucion && this.isPermisoEliminarDatoConstitucion));
			this.jInternalFrameDetalleFormDatoConstitucion.jButtonCancelarToolBarDatoConstitucion.setVisible(this.isVisibilidadCeldaCancelarDatoConstitucion);				
			this.jInternalFrameDetalleFormDatoConstitucion.jButtonGuardarCambiosToolBarDatoConstitucion.setVisible((this.isVisibilidadCeldaGuardarDatoConstitucion && this.isPermisoGuardarCambiosDatoConstitucion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDatoConstitucion.setVisible((this.isVisibilidadCeldaGuardarCambiosDatoConstitucion && this.isPermisoGuardarCambiosDatoConstitucion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDatoConstitucion.setVisible((this.isVisibilidadCeldaNuevoDatoConstitucion && this.isPermisoNuevoDatoConstitucion));			
			this.jMenuItemDuplicarDatoConstitucion.setVisible((this.isVisibilidadCeldaDuplicarDatoConstitucion && this.isPermisoDuplicarDatoConstitucion));			
			this.jMenuItemCopiarDatoConstitucion.setVisible((this.isVisibilidadCeldaCopiarDatoConstitucion && this.isPermisoCopiarDatoConstitucion));			
			this.jMenuItemVerFormDatoConstitucion.setVisible((this.isVisibilidadCeldaVerFormDatoConstitucion && this.isPermisoVerFormDatoConstitucion));			
			this.jMenuItemAbrirOrderByDatoConstitucion.setVisible((this.isVisibilidadCeldaOrdenDatoConstitucion && this.isPermisoOrdenDatoConstitucion));			
			//this.jMenuItemMostrarOcultarDatoConstitucion.setVisible((this.isVisibilidadCeldaOrdenDatoConstitucion && this.isPermisoOrdenDatoConstitucion));
			this.jMenuItemDetalleAbrirOrderByDatoConstitucion.setVisible((this.isVisibilidadCeldaOrdenDatoConstitucion && this.isPermisoOrdenDatoConstitucion));			
			//this.jMenuItemDetalleMostrarOcultarDatoConstitucion.setVisible((this.isVisibilidadCeldaOrdenDatoConstitucion && this.isPermisoOrdenDatoConstitucion));			
			this.jMenuItemNuevoRelacionesDatoConstitucion.setVisible((this.isVisibilidadCeldaNuevoRelacionesDatoConstitucion && this.isPermisoNuevoDatoConstitucion));			
			this.jMenuItemNuevoGuardarCambiosDatoConstitucion.setVisible((this.isVisibilidadCeldaNuevoDatoConstitucion && this.isPermisoNuevoDatoConstitucion && this.isPermisoGuardarCambiosDatoConstitucion));									
			
			if(this.jInternalFrameDetalleFormDatoConstitucion!=null) {
			this.jInternalFrameDetalleFormDatoConstitucion.jMenuItemModificarDatoConstitucion.setVisible((this.isVisibilidadCeldaModificarDatoConstitucion && this.isPermisoActualizarDatoConstitucion));	
			this.jInternalFrameDetalleFormDatoConstitucion.jMenuItemActualizarDatoConstitucion.setVisible((this.isVisibilidadCeldaActualizarDatoConstitucion && this.isPermisoActualizarDatoConstitucion));	
			this.jInternalFrameDetalleFormDatoConstitucion.jMenuItemEliminarDatoConstitucion.setVisible((this.isVisibilidadCeldaEliminarDatoConstitucion && this.isPermisoEliminarDatoConstitucion));
			this.jInternalFrameDetalleFormDatoConstitucion.jMenuItemCancelarDatoConstitucion.setVisible(this.isVisibilidadCeldaCancelarDatoConstitucion);				
			}
			
			this.jMenuItemGuardarCambiosDatoConstitucion.setVisible((this.isVisibilidadCeldaGuardarDatoConstitucion && this.isPermisoGuardarCambiosDatoConstitucion));						
			this.jMenuItemGuardarCambiosTablaDatoConstitucion.setVisible((this.isVisibilidadCeldaGuardarCambiosDatoConstitucion && this.isPermisoGuardarCambiosDatoConstitucion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDatoConstitucion=this.jButtonNuevoDatoConstitucion.isVisible();
			this.isVisibilidadCeldaDuplicarDatoConstitucion=this.jButtonDuplicarDatoConstitucion.isVisible();
			this.isVisibilidadCeldaCopiarDatoConstitucion=this.jButtonCopiarDatoConstitucion.isVisible();
			this.isVisibilidadCeldaVerFormDatoConstitucion=this.jButtonVerFormDatoConstitucion.isVisible();
			
			this.isVisibilidadCeldaOrdenDatoConstitucion=this.jButtonAbrirOrderByDatoConstitucion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDatoConstitucion=this.jButtonNuevoRelacionesDatoConstitucion.isVisible();
			this.isVisibilidadCeldaModificarDatoConstitucion=this.jButtonModificarDatoConstitucion.isVisible();
			
			if(this.jInternalFrameDetalleFormDatoConstitucion!=null) {
			this.isVisibilidadCeldaActualizarDatoConstitucion=this.jInternalFrameDetalleFormDatoConstitucion.jButtonActualizarDatoConstitucion.isVisible();
			this.isVisibilidadCeldaEliminarDatoConstitucion=this.jInternalFrameDetalleFormDatoConstitucion.jButtonEliminarDatoConstitucion.isVisible();
			this.isVisibilidadCeldaCancelarDatoConstitucion=this.jInternalFrameDetalleFormDatoConstitucion.jButtonCancelarDatoConstitucion.isVisible();
			this.isVisibilidadCeldaGuardarDatoConstitucion=this.jInternalFrameDetalleFormDatoConstitucion.jButtonGuardarCambiosDatoConstitucion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDatoConstitucion=this.jButtonGuardarCambiosTablaDatoConstitucion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDatoConstitucion=this.jButtonNuevoToolBarDatoConstitucion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDatoConstitucion=this.jButtonNuevoRelacionesToolBarDatoConstitucion.isVisible();
			
			if(this.jInternalFrameDetalleFormDatoConstitucion!=null) {
			this.isVisibilidadCeldaModificarDatoConstitucion=this.jInternalFrameDetalleFormDatoConstitucion.jButtonModificarToolBarDatoConstitucion.isVisible();
			this.isVisibilidadCeldaActualizarDatoConstitucion=this.jInternalFrameDetalleFormDatoConstitucion.jButtonActualizarToolBarDatoConstitucion.isVisible();
			this.isVisibilidadCeldaEliminarDatoConstitucion=this.jInternalFrameDetalleFormDatoConstitucion.jButtonEliminarToolBarDatoConstitucion.isVisible();
			this.isVisibilidadCeldaCancelarDatoConstitucion=this.jInternalFrameDetalleFormDatoConstitucion.jButtonCancelarToolBarDatoConstitucion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDatoConstitucion=this.jButtonGuardarCambiosToolBarDatoConstitucion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDatoConstitucion=this.jButtonGuardarCambiosTablaToolBarDatoConstitucion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDatoConstitucion=this.jMenuItemNuevoDatoConstitucion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDatoConstitucion=this.jMenuItemNuevoRelacionesDatoConstitucion.isVisible();
			
			if(this.jInternalFrameDetalleFormDatoConstitucion!=null) {
			this.isVisibilidadCeldaModificarDatoConstitucion=this.jInternalFrameDetalleFormDatoConstitucion.jMenuItemModificarDatoConstitucion.isVisible();
			this.isVisibilidadCeldaActualizarDatoConstitucion=this.jInternalFrameDetalleFormDatoConstitucion.jMenuItemActualizarDatoConstitucion.isVisible();
			this.isVisibilidadCeldaEliminarDatoConstitucion=this.jInternalFrameDetalleFormDatoConstitucion.jMenuItemEliminarDatoConstitucion.isVisible();
			this.isVisibilidadCeldaCancelarDatoConstitucion=this.jInternalFrameDetalleFormDatoConstitucion.jMenuItemCancelarDatoConstitucion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDatoConstitucion=this.jMenuItemGuardarCambiosDatoConstitucion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDatoConstitucion=this.jMenuItemGuardarCambiosTablaDatoConstitucion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDatoConstitucion(Boolean esInicializar) {
		if(DatoConstitucionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.datoconstitucionSessionBean.getConGuardarRelaciones()) {
				//if(this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDatoConstitucion();
			}
			
			this.inicializarActualizarBindingBotonesManualDatoConstitucion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDatoConstitucion() {
		this.jButtonNuevoDatoConstitucion.setVisible(this.isPermisoNuevoDatoConstitucion);			
		this.jButtonDuplicarDatoConstitucion.setVisible(this.isPermisoDuplicarDatoConstitucion);			
		this.jButtonCopiarDatoConstitucion.setVisible(this.isPermisoCopiarDatoConstitucion);			
		this.jButtonVerFormDatoConstitucion.setVisible(this.isPermisoVerFormDatoConstitucion);			
		
		this.jButtonAbrirOrderByDatoConstitucion.setVisible(this.isPermisoOrdenDatoConstitucion);					
		
		this.jButtonNuevoRelacionesDatoConstitucion.setVisible(this.isPermisoNuevoDatoConstitucion);			
		
		if(this.jInternalFrameDetalleFormDatoConstitucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoConstitucion.jButtonModificarDatoConstitucion.setVisible(this.isPermisoActualizarDatoConstitucion);	
			this.jInternalFrameDetalleFormDatoConstitucion.jButtonActualizarDatoConstitucion.setVisible(this.isPermisoActualizarDatoConstitucion);	
			this.jInternalFrameDetalleFormDatoConstitucion.jButtonEliminarDatoConstitucion.setVisible(this.isPermisoEliminarDatoConstitucion);
			this.jInternalFrameDetalleFormDatoConstitucion.jButtonCancelarDatoConstitucion.setVisible(this.isVisibilidadCeldaCancelarDatoConstitucion);						
			this.jInternalFrameDetalleFormDatoConstitucion.jButtonGuardarCambiosDatoConstitucion.setVisible(this.isPermisoGuardarCambiosDatoConstitucion);							
		}
		
		this.jButtonGuardarCambiosTablaDatoConstitucion.setVisible(this.isPermisoActualizarDatoConstitucion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDatoConstitucion() {
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonModificarDatoConstitucion.setVisible(this.isPermisoActualizarDatoConstitucion);	
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonActualizarDatoConstitucion.setVisible(this.isPermisoActualizarDatoConstitucion);	
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonEliminarDatoConstitucion.setVisible(this.isPermisoEliminarDatoConstitucion);
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonCancelarDatoConstitucion.setVisible(this.isVisibilidadCeldaCancelarDatoConstitucion);							
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonGuardarCambiosDatoConstitucion.setVisible((this.isVisibilidadCeldaGuardarDatoConstitucion && this.isPermisoGuardarCambiosDatoConstitucion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDatoConstitucion() {
		if(DatoConstitucionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDatoConstitucion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDatoConstitucion() {
	}
	
	public void jTableDatosDatoConstitucionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDatoConstitucion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDatoConstitucionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoConstitucion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoConstitucion(this.getdatoconstitucion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoConstitucion(this.datoconstitucion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoconstitucion =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datoconstitucion =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datoconstitucion==null) {
						this.datoconstitucion = new DatoConstitucion();
					}

					this.setVariablesFormularioToObjetoActualDatoConstitucion(this.datoconstitucion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoConstitucion(this.datoconstitucion);
				}

				if(this.datoconstitucion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.datoconstitucion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoConstitucion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidclienteDatoConstitucionActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.clienteBeanSwingJInternalFrame.sTipoBusqueda="Cliente";

			if(!this.sFinalQueryGeneral_cliente.equals("")) {
				this.clienteBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cliente);
				this.clienteBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.clienteBeanSwingJInternalFrame.procesarBusqueda(this.clienteBeanSwingJInternalFrame.sAccionBusqueda);
				this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingCliente(false);
			}

			if(!this.sFinalQueryComboCliente.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderDatoConstitucion=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosDatoConstitucion.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderDatoConstitucion=(TitledBorder)this.jScrollPanelDatosDatoConstitucion.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderDatoConstitucion.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonidclienteDatoConstitucionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebDatoConstitucion(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoConstitucion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDatoConstitucion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDatoConstitucion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucion =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.datoconstitucion =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDatoConstitucion(this.getdatoconstitucion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDatoConstitucion(this.datoconstitucion);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.datoconstitucionLogic.getConnexion());

				if(this.datoconstitucion.getidcliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.datoconstitucion.getidcliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDatoConstitucion=(TitledBorder)this.jScrollPanelDatosDatoConstitucion.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderDatoConstitucion.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonidclienteDatoConstitucionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoConstitucion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoConstitucion(this.getdatoconstitucion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoConstitucion(this.datoconstitucion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoconstitucion =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datoconstitucion =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datoconstitucion==null) {
						this.datoconstitucion = new DatoConstitucion();
					}

					this.setVariablesFormularioToObjetoActualDatoConstitucion(this.datoconstitucion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoConstitucion(this.datoconstitucion);
				}

				if(this.datoconstitucion.getidcliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where idcliente = "+this.datoconstitucion.getidcliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoConstitucion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidvalorclientecompaniaDatoConstitucionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipocompania=true;

			idTienePermisotipocompania=this.tienePermisosUsuarioEnPaginaWebDatoConstitucion(TipoCompaniaConstantesFunciones.CLASSNAME);

			if(idTienePermisotipocompania) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoConstitucion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDatoConstitucion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDatoConstitucion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucion =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.datoconstitucion =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDatoConstitucion(this.getdatoconstitucion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDatoConstitucion(this.datoconstitucion);

				this.tipocompaniaBeanSwingJInternalFrame=new TipoCompaniaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipocompaniaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipocompaniaBeanSwingJInternalFrame.getTipoCompaniaLogic().setConnexion(this.datoconstitucionLogic.getConnexion());

				if(this.datoconstitucion.getidvalorclientecompania()!=null) {
					this.tipocompaniaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipocompaniaBeanSwingJInternalFrame.setIdActual(this.datoconstitucion.getidvalorclientecompania());
					this.tipocompaniaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipocompaniaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipocompaniaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoCompania();
				}

				JInternalFrameBase jinternalFrame =this.tipocompaniaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDatoConstitucion=(TitledBorder)this.jScrollPanelDatosDatoConstitucion.getBorder();
				TitledBorder titledBordertipocompania=(TitledBorder)this.tipocompaniaBeanSwingJInternalFrame.jScrollPanelDatosTipoCompania.getBorder();

				titledBordertipocompania.setTitle(titledBorderDatoConstitucion.getTitle() + " -> Tipo Compania");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonidvalorclientecompaniaDatoConstitucionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoConstitucion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoConstitucion(this.getdatoconstitucion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoConstitucion(this.datoconstitucion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoconstitucion =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datoconstitucion =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datoconstitucion==null) {
						this.datoconstitucion = new DatoConstitucion();
					}

					this.setVariablesFormularioToObjetoActualDatoConstitucion(this.datoconstitucion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoConstitucion(this.datoconstitucion);
				}

				if(this.datoconstitucion.getidvalorclientecompania()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where idvalorclientecompania = "+this.datoconstitucion.getidvalorclientecompania().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoConstitucion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccionDatoConstitucionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoConstitucion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoConstitucion(this.getdatoconstitucion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoConstitucion(this.datoconstitucion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoconstitucion =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datoconstitucion =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datoconstitucion==null) {
						this.datoconstitucion = new DatoConstitucion();
					}

					this.setVariablesFormularioToObjetoActualDatoConstitucion(this.datoconstitucion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoConstitucion(this.datoconstitucion);
				}

				if(this.datoconstitucion.getdireccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion like '%"+this.datoconstitucion.getdireccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoConstitucion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaconstitucionDatoConstitucionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoConstitucion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoConstitucion(this.getdatoconstitucion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoConstitucion(this.datoconstitucion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoconstitucion =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datoconstitucion =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datoconstitucion==null) {
						this.datoconstitucion = new DatoConstitucion();
					}

					this.setVariablesFormularioToObjetoActualDatoConstitucion(this.datoconstitucion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoConstitucion(this.datoconstitucion);
				}

				if(this.datoconstitucion.getfechaconstitucion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fechaconstitucion = '"+Funciones2.getStringPostgresDate(this.datoconstitucion.getfechaconstitucion())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoConstitucion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncapitalsuscritoDatoConstitucionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoConstitucion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoConstitucion(this.getdatoconstitucion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoConstitucion(this.datoconstitucion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoconstitucion =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datoconstitucion =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datoconstitucion==null) {
						this.datoconstitucion = new DatoConstitucion();
					}

					this.setVariablesFormularioToObjetoActualDatoConstitucion(this.datoconstitucion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoConstitucion(this.datoconstitucion);
				}

				if(this.datoconstitucion.getcapitalsuscrito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where capitalsuscrito = "+this.datoconstitucion.getcapitalsuscrito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoConstitucion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonplazofiniquitoDatoConstitucionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoConstitucion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoConstitucion(this.getdatoconstitucion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoConstitucion(this.datoconstitucion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoconstitucion =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datoconstitucion =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datoconstitucion==null) {
						this.datoconstitucion = new DatoConstitucion();
					}

					this.setVariablesFormularioToObjetoActualDatoConstitucion(this.datoconstitucion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoConstitucion(this.datoconstitucion);
				}

				if(this.datoconstitucion.getplazofiniquito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where plazofiniquito = "+this.datoconstitucion.getplazofiniquito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoConstitucion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonreservalegalDatoConstitucionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoConstitucion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoConstitucion(this.getdatoconstitucion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoConstitucion(this.datoconstitucion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoconstitucion =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datoconstitucion =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datoconstitucion==null) {
						this.datoconstitucion = new DatoConstitucion();
					}

					this.setVariablesFormularioToObjetoActualDatoConstitucion(this.datoconstitucion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoConstitucion(this.datoconstitucion);
				}

				if(this.datoconstitucion.getreservalegal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where reservalegal = "+this.datoconstitucion.getreservalegal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoConstitucion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaestatutoDatoConstitucionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoConstitucion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoConstitucion(this.getdatoconstitucion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoConstitucion(this.datoconstitucion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoconstitucion =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datoconstitucion =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datoconstitucion==null) {
						this.datoconstitucion = new DatoConstitucion();
					}

					this.setVariablesFormularioToObjetoActualDatoConstitucion(this.datoconstitucion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoConstitucion(this.datoconstitucion);
				}

				if(this.datoconstitucion.getfechaestatuto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fechaestatuto = '"+Funciones2.getStringPostgresDate(this.datoconstitucion.getfechaestatuto())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoConstitucion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesactivoDatoConstitucionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDatoConstitucion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDatoConstitucion(this.getdatoconstitucion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoConstitucion(this.datoconstitucion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoconstitucion =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.datoconstitucion =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.datoconstitucion==null) {
						this.datoconstitucion = new DatoConstitucion();
					}

					this.setVariablesFormularioToObjetoActualDatoConstitucion(this.datoconstitucion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoConstitucion(this.datoconstitucion);
				}

				if(this.datoconstitucion.getesactivo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esactivo = "+this.datoconstitucion.getesactivo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDatoConstitucion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdClienteDatoConstitucionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDatoConstitucion(false,false);

			this.getDatoConstitucionsFK_IdCliente();

			this.inicializarActualizarBindingDatoConstitucion(false);

			//if(DatoConstitucionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDatoConstitucion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdValorClienteCompaniaDatoConstitucionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDatoConstitucion(false,false);

			this.getDatoConstitucionsFK_IdValorClienteCompania();

			this.inicializarActualizarBindingDatoConstitucion(false);

			//if(DatoConstitucionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDatoConstitucion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.datoconstitucionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDatoConstitucion() {
		if(this.jInternalFrameDetalleFormDatoConstitucion!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDatoConstitucion!=null) {
			this.jInternalFrameDetalleFormDatoConstitucion.setVisible(false);	    			
			this.jInternalFrameDetalleFormDatoConstitucion.dispose();
			this.jInternalFrameDetalleFormDatoConstitucion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDatoConstitucion!=null) {
			this.jInternalFrameReporteDinamicoDatoConstitucion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDatoConstitucion.dispose();
			this.jInternalFrameReporteDinamicoDatoConstitucion=null;
		}
		
		if(this.jInternalFrameImportacionDatoConstitucion!=null) {
			this.jInternalFrameImportacionDatoConstitucion.setVisible(false);	    			
			this.jInternalFrameImportacionDatoConstitucion.dispose();
			this.jInternalFrameImportacionDatoConstitucion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDatoConstitucion();
			
			DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
			
			
			if(sTipo.equals("NuevoDatoConstitucion")) {
				jButtonNuevoDatoConstitucionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDatoConstitucion")) {
				jButtonDuplicarDatoConstitucionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDatoConstitucion")) {
				jButtonCopiarDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("VerFormDatoConstitucion")) {
				jButtonVerFormDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDatoConstitucion")) {
				jButtonNuevoDatoConstitucionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDatoConstitucion")) {
				jButtonDuplicarDatoConstitucionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDatoConstitucion")) {
				jButtonNuevoDatoConstitucionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDatoConstitucion")) {
				jButtonDuplicarDatoConstitucionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDatoConstitucion")) {
				jButtonNuevoDatoConstitucionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDatoConstitucion")) {
				jButtonNuevoDatoConstitucionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDatoConstitucion")) {
				jButtonNuevoDatoConstitucionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDatoConstitucion")) {
				jButtonModificarDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDatoConstitucion")) {
				jButtonModificarDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDatoConstitucion")) {
				jButtonModificarDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDatoConstitucion")) {
				jButtonActualizarDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDatoConstitucion")) {
				jButtonActualizarDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDatoConstitucion")) {
				jButtonActualizarDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("EliminarDatoConstitucion")) {
				jButtonEliminarDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDatoConstitucion")) {
				jButtonEliminarDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDatoConstitucion")) {
				jButtonEliminarDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("CancelarDatoConstitucion")) {
				jButtonCancelarDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDatoConstitucion")) {
				jButtonCancelarDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDatoConstitucion")) {
				jButtonCancelarDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("CerrarDatoConstitucion")) {
				jButtonCerrarDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDatoConstitucion")) {
				jButtonCerrarDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDatoConstitucion")) {
				jButtonCerrarDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDatoConstitucion")) {
				jButtonMostrarOcultarDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDatoConstitucion")) {
				jButtonCancelarDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDatoConstitucion")) {
				jButtonGuardarCambiosDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDatoConstitucion")) {
				jButtonGuardarCambiosDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDatoConstitucion")) {
				jButtonCopiarDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDatoConstitucion")) {
				jButtonVerFormDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDatoConstitucion")) {
				jButtonGuardarCambiosDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDatoConstitucion")) {
				jButtonCopiarDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDatoConstitucion")) {
				jButtonVerFormDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDatoConstitucion")) {
				jButtonGuardarCambiosDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDatoConstitucion")) {
				jButtonGuardarCambiosDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDatoConstitucion")) {
				jButtonGuardarCambiosDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDatoConstitucion")) {
				jButtonRecargarInformacionDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDatoConstitucion")) {
				jButtonRecargarInformacionDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDatoConstitucion")) {
				jButtonRecargarInformacionDatoConstitucionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDatoConstitucion")) {
				jButtonAnterioresDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDatoConstitucion")) {
				jButtonAnterioresDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDatoConstitucion")) {
				jButtonAnterioresDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDatoConstitucion")) {
				jButtonSiguientesDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDatoConstitucion")) {
				jButtonSiguientesDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDatoConstitucion")) {
				jButtonSiguientesDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDatoConstitucion") || sTipo.equals("MenuItemDetalleAbrirOrderByDatoConstitucion")) {
				jButtonAbrirOrderByDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDatoConstitucion") || sTipo.equals("MenuItemDetalleMostrarOcultarDatoConstitucion")) {
				jButtonMostrarOcultarDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDatoConstitucion")) {
				jButtonNuevoGuardarCambiosDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDatoConstitucion")) {
				jButtonNuevoGuardarCambiosDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDatoConstitucion")) {
				jButtonNuevoGuardarCambiosDatoConstitucionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDatoConstitucion")) {
				jButtonCerrarReporteDinamicoDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDatoConstitucion")) {
				jButtonGenerarReporteDinamicoDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDatoConstitucion")) {
				
				jButtonGenerarExcelReporteDinamicoDatoConstitucionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDatoConstitucion")) {
				jButtonCerrarImportacionDatoConstitucionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDatoConstitucion")) {
				
				jButtonGenerarImportacionDatoConstitucionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDatoConstitucion")) {
				
				jButtonAbrirImportacionDatoConstitucionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDatoConstitucion")) {
				jComboBoxTiposAccionesDatoConstitucionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDatoConstitucion")) {
				jComboBoxTiposRelacionesDatoConstitucionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDatoConstitucion")) {
				jComboBoxTiposAccionesDatoConstitucionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDatoConstitucion")) {
				
				jComboBoxTiposSeleccionarDatoConstitucionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDatoConstitucion")) {
				jTextFieldValorCampoGeneralDatoConstitucionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDatoConstitucion")) {
				jButtonAbrirOrderByDatoConstitucionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDatoConstitucion")) {
				jButtonAbrirOrderByDatoConstitucionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDatoConstitucion")) {
				jButtonCerrarOrderByDatoConstitucionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDatoConstitucionBusqueda")) {
				this.jButtonidDatoConstitucionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("idclienteDatoConstitucion")) {
				this.jButtonidclienteDatoConstitucionActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idclienteDatoConstitucionUpdate")) {
				this.jButtonidclienteDatoConstitucionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idclienteDatoConstitucionBusqueda")) {
				this.jButtonidclienteDatoConstitucionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvalorclientecompaniaDatoConstitucionUpdate")) {
				this.jButtonidvalorclientecompaniaDatoConstitucionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvalorclientecompaniaDatoConstitucionBusqueda")) {
				this.jButtonidvalorclientecompaniaDatoConstitucionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionDatoConstitucionBusqueda")) {
				this.jButtondireccionDatoConstitucionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaconstitucionDatoConstitucionBusqueda")) {
				this.jButtonfechaconstitucionDatoConstitucionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("capitalsuscritoDatoConstitucionBusqueda")) {
				this.jButtoncapitalsuscritoDatoConstitucionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("plazofiniquitoDatoConstitucionBusqueda")) {
				this.jButtonplazofiniquitoDatoConstitucionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("reservalegalDatoConstitucionBusqueda")) {
				this.jButtonreservalegalDatoConstitucionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaestatutoDatoConstitucionBusqueda")) {
				this.jButtonfechaestatutoDatoConstitucionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esactivoDatoConstitucionBusqueda")) {
				this.jButtonesactivoDatoConstitucionBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("idclienteDatoConstitucion")) {
				this.jButtonidclienteDatoConstitucionActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdClienteDatoConstitucion")) {
				this.jButtonFK_IdClienteDatoConstitucionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdValorClienteCompaniaDatoConstitucion")) {
				this.jButtonFK_IdValorClienteCompaniaDatoConstitucionActionPerformed(evt);
			}
			
			;
			
			
			DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDatoConstitucion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDatoConstitucionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoconstitucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoconstitucion);
				
				DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
				
				


				
				DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoConstitucion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoConstitucion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DatoConstitucion datoconstitucionLocal=null;
			
			if(!this.getEsControlTabla()) {
				datoconstitucionLocal=this.datoconstitucion;
			} else {
				datoconstitucionLocal=this.datoconstitucionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoconstitucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoconstitucion);
				
				DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
							
				
				


				
				DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoConstitucion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoConstitucion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoConstitucionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDatoConstitucion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionAnterior =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datoconstitucionAnterior =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
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
			
			DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
			
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
			
			


			
			DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDatoConstitucionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoconstitucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoconstitucion);
				
				DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
								
						
				


				
				DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoConstitucion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoConstitucion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoconstitucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoconstitucion);
				
				DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
								
				
				


				
				DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoConstitucion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoConstitucion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoConstitucionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDatoConstitucion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionAnterior =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datoconstitucionAnterior =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoconstitucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoconstitucion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoConstitucionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDatoConstitucion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionAnterior =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datoconstitucionAnterior =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoConstitucionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.datoconstitucion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.datoconstitucion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoconstitucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoconstitucion);
				
				DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
							
				
				


				
				DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoConstitucion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoConstitucion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDatoConstitucionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDatoConstitucion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoconstitucionAnterior =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.datoconstitucionAnterior =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
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
			
			DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
			
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
			
			


			
			DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoConstitucionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.datoconstitucion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.datoconstitucion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoconstitucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoconstitucion);
				
				DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
								
				
				


				
				DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoConstitucion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoConstitucion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoConstitucionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDatoConstitucion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionAnterior =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datoconstitucionAnterior =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoConstitucionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.datoconstitucion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.datoconstitucion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDatoConstitucionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoconstitucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoconstitucion);
				
				DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDatoConstitucion")) {
					jCheckBoxSeleccionarTodosDatoConstitucionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDatoConstitucion")) {
					jCheckBoxSeleccionadosDatoConstitucionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDatoConstitucion")) {
					
				}
				
				


				
				
				DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoConstitucion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoConstitucion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.datoconstitucion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.datoconstitucion);
				
				DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
												
				
				


				
				
				DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoConstitucion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoConstitucion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDatoConstitucionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDatoConstitucion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.datoconstitucionAnterior =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.datoconstitucionAnterior =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDatoConstitucionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoconstitucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoconstitucion);
				
				DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
				
				
				DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
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
			
			DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
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
			
			


			
			DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDatoConstitucionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoconstitucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoconstitucion);
				
				DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoConstitucion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoConstitucion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.datoconstitucion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.datoconstitucion);
				
				DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
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
				
				


				
				DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DatoConstitucion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DatoConstitucion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDatoConstitucionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDatoConstitucion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.datoconstitucionAnterior =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.datoconstitucionAnterior =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDatoConstitucion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDatoConstitucionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDatoConstitucion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.datoconstitucion =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.datoconstitucion =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.datoconstitucion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDatoConstitucion")) {
				
				}
				
				DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDatoConstitucion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDatoConstitucion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDatoConstitucion")) {
			
			}
			
			DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDatoConstitucion();
			
			DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
			
			if(sTipo.equals("NuevoDatoConstitucion")) {
				jButtonNuevoDatoConstitucionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDatoConstitucion")) {
				jButtonDuplicarDatoConstitucionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDatoConstitucion")) {
				jButtonCopiarDatoConstitucionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDatoConstitucion")) {
				jButtonVerFormDatoConstitucionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDatoConstitucion")) {
				jButtonNuevoDatoConstitucionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDatoConstitucion")) {
				jButtonModificarDatoConstitucionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDatoConstitucion")) {
				jButtonActualizarDatoConstitucionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDatoConstitucion")) {
				jButtonEliminarDatoConstitucionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDatoConstitucion")) {
				jButtonGuardarCambiosDatoConstitucionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDatoConstitucion")) {
				jButtonCancelarDatoConstitucionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDatoConstitucion")) {
				jButtonCerrarDatoConstitucionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDatoConstitucion")) {
				jButtonGuardarCambiosDatoConstitucionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDatoConstitucion")) {
				jButtonNuevoGuardarCambiosDatoConstitucionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDatoConstitucion")) {
				jButtonAbrirOrderByDatoConstitucionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDatoConstitucion")) {
				jButtonRecargarInformacionDatoConstitucionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDatoConstitucion")) {
				jButtonAnterioresDatoConstitucionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDatoConstitucion")) {
				jButtonSiguientesDatoConstitucionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDatoConstitucionBusqueda")) {
				this.jButtonidDatoConstitucionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("idclienteDatoConstitucion")) {
				this.jButtonidclienteDatoConstitucionActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idclienteDatoConstitucionUpdate")) {
				this.jButtonidclienteDatoConstitucionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idclienteDatoConstitucionBusqueda")) {
				this.jButtonidclienteDatoConstitucionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvalorclientecompaniaDatoConstitucionUpdate")) {
				this.jButtonidvalorclientecompaniaDatoConstitucionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvalorclientecompaniaDatoConstitucionBusqueda")) {
				this.jButtonidvalorclientecompaniaDatoConstitucionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionDatoConstitucionBusqueda")) {
				this.jButtondireccionDatoConstitucionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaconstitucionDatoConstitucionBusqueda")) {
				this.jButtonfechaconstitucionDatoConstitucionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("capitalsuscritoDatoConstitucionBusqueda")) {
				this.jButtoncapitalsuscritoDatoConstitucionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("plazofiniquitoDatoConstitucionBusqueda")) {
				this.jButtonplazofiniquitoDatoConstitucionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("reservalegalDatoConstitucionBusqueda")) {
				this.jButtonreservalegalDatoConstitucionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaestatutoDatoConstitucionBusqueda")) {
				this.jButtonfechaestatutoDatoConstitucionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esactivoDatoConstitucionBusqueda")) {
				this.jButtonesactivoDatoConstitucionBusquedaActionPerformed(evt);
			}
			
			DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDatoConstitucion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDatoConstitucion")) {
				closingInternalFrameDatoConstitucion();
				
			} else if(sTipo.equals("jButtonCancelarDatoConstitucion")) {
				JInternalFrameBase jInternalFrameDetalleFormDatoConstitucion = (JInternalFrameBase)evt.getSource();
	            	
	            DatoConstitucionBeanSwingJInternalFrame jInternalFrameParent=(DatoConstitucionBeanSwingJInternalFrame)jInternalFrameDetalleFormDatoConstitucion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDatoConstitucionActionPerformed(null);
			}
			
			DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.datoconstitucion,new Object(),this.datoconstitucionParameterGeneral,this.datoconstitucionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDatoConstitucion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDatoConstitucion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDatoConstitucion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.datoconstitucion)) {
			if(!esControlTabla) {
				if(DatoConstitucionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDatoConstitucion(this.datoconstitucion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoConstitucion(this.datoconstitucion);			
				}
				
				if(this.datoconstitucionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDatoConstitucion(this.datoconstitucion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.datoconstitucionReturnGeneral=datoconstitucionLogic.procesarEventosDatoConstitucionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.datoconstitucionLogic.getDatoConstitucions(),this.datoconstitucion,this.datoconstitucionParameterGeneral,this.isEsNuevoDatoConstitucion,classes);//this.datoconstitucionLogic.getDatoConstitucion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDatoConstitucion(this.datoconstitucionReturnGeneral,this.datoconstitucionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.datoconstitucionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDatoConstitucion(classes,this.datoconstitucionReturnGeneral,this.datoconstitucionBean,false);
					}
						
					if(this.datoconstitucionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDatoConstitucion(this.datoconstitucionReturnGeneral.getDatoConstitucion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDatoConstitucion(this.datoconstitucionReturnGeneral.getDatoConstitucion());	
					}
						
					if(this.datoconstitucionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDatoConstitucion(this.datoconstitucionReturnGeneral.getDatoConstitucion(),classes);//this.datoconstitucionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDatoConstitucion(this.datoconstitucion,classes);//this.datoconstitucionBean);									
				}
			
				if(DatoConstitucionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDatoConstitucion(this.datoconstitucion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDatoConstitucion(this.datoconstitucion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.datoconstitucionAnterior!=null) {
						this.datoconstitucion=this.datoconstitucionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.datoconstitucionReturnGeneral=datoconstitucionLogic.procesarEventosDatoConstitucionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.datoconstitucionLogic.getDatoConstitucions(),this.datoconstitucion,this.datoconstitucionParameterGeneral,this.isEsNuevoDatoConstitucion,classes);//this.datoconstitucionLogic.getDatoConstitucion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.datoconstitucionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.datoconstitucionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.datoconstitucionReturnGeneral.getDatoConstitucion(),datoconstitucionLogic.getDatoConstitucions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.datoconstitucionReturnGeneral.getDatoConstitucion(),this.datoconstitucions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDatoConstitucion.repaint();
				
				//((AbstractTableModel) this.jTableDatosDatoConstitucion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDatoConstitucion();
			}
		}
	}
	
	public void actualizarVisualTableDatosDatoConstitucion() throws Exception {
		
		DatoConstitucionModel datoconstitucionModel=(DatoConstitucionModel)this.jTableDatosDatoConstitucion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			datoconstitucionModel.datoconstitucions=this.datoconstitucionLogic.getDatoConstitucions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			datoconstitucionModel.datoconstitucions=this.datoconstitucions;
		}
		
		
		((DatoConstitucionModel) this.jTableDatosDatoConstitucion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDatoConstitucion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdatoconstitucionAnterior(),this.datoconstitucionLogic.getDatoConstitucions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdatoconstitucionAnterior(),this.datoconstitucions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDatoConstitucion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDatoConstitucion(DatoConstitucion datoconstitucion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
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
										
				DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.datoconstitucion,new Object(),generalEntityParameterGeneral,this.datoconstitucionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.datoconstitucionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DatoConstitucionConstantesFunciones.getClassesRelationshipsOfDatoConstitucion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DatoConstitucionConstantesFunciones.getClassesRelationshipsFromStringsOfDatoConstitucion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDatoConstitucion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DatoConstitucionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.datoconstitucion,new Object(),generalEntityParameterGeneral,this.datoconstitucionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDatoConstitucion(DatoConstitucionBean datoconstitucionBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDatoConstitucion(ArrayList<Classe> classes,DatoConstitucionReturnGeneral datoconstitucionReturnGeneral,DatoConstitucionBean datoconstitucionBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDatoConstitucion(DatoConstitucion datoconstitucion,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.datoconstitucion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDatoConstitucion = new DatoConstitucionDetalleFormJInternalFrame(jDesktopPane,this.datoconstitucionSessionBean.getConGuardarRelaciones(),this.datoconstitucionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDatoConstitucion);
		this.jInternalFrameDetalleFormDatoConstitucion.setVisible(false);
		this.jInternalFrameDetalleFormDatoConstitucion.setSelected(false);						
		
		this.jInternalFrameDetalleFormDatoConstitucion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDatoConstitucion.datoconstitucionLogic=this.datoconstitucionLogic;
		
		this.cargarCombosFrameForeignKeyDatoConstitucion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDatoConstitucion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDatoConstitucion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDatoConstitucion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDatoConstitucion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDatoConstitucion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDatoConstitucion"));
		
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonModificarDatoConstitucion.addActionListener(new ButtonActionListener(this,"ModificarDatoConstitucion"));

		
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonModificarToolBarDatoConstitucion.addActionListener(new ButtonActionListener(this,"ModificarToolBarDatoConstitucion"));
					
		this.jInternalFrameDetalleFormDatoConstitucion.jMenuItemModificarDatoConstitucion.addActionListener(new ButtonActionListener(this,"MenuItemModificarDatoConstitucion"));		
		
		
		
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonActualizarDatoConstitucion.addActionListener (new ButtonActionListener(this,"ActualizarDatoConstitucion"));
		
		
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonActualizarToolBarDatoConstitucion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDatoConstitucion"));
						
		this.jInternalFrameDetalleFormDatoConstitucion.jMenuItemActualizarDatoConstitucion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDatoConstitucion"));		
		
		
		
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonEliminarDatoConstitucion.addActionListener (new ButtonActionListener(this,"EliminarDatoConstitucion"));
		
		
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonEliminarToolBarDatoConstitucion.addActionListener (new ButtonActionListener(this,"EliminarToolBarDatoConstitucion"));
								
		this.jInternalFrameDetalleFormDatoConstitucion.jMenuItemEliminarDatoConstitucion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDatoConstitucion"));		
		
		
		
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonCancelarDatoConstitucion.addActionListener (new ButtonActionListener(this,"CancelarDatoConstitucion"));
		
		
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonCancelarToolBarDatoConstitucion.addActionListener (new ButtonActionListener(this,"CancelarToolBarDatoConstitucion"));
					
		this.jInternalFrameDetalleFormDatoConstitucion.jMenuItemCancelarDatoConstitucion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDatoConstitucion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDatoConstitucion.jMenuItemDetalleCerrarDatoConstitucion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDatoConstitucion"));		
		
		
		
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonGuardarCambiosToolBarDatoConstitucion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDatoConstitucion"));
		
		
		
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonGuardarCambiosToolBarDatoConstitucion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDatoConstitucion"));
		
		
		
		this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxTiposAccionesFormularioDatoConstitucion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDatoConstitucion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonidDatoConstitucionBusqueda.addActionListener(new ButtonActionListener(this,"idDatoConstitucionBusqueda"));
		//jButtonidclienteDatoConstitucion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonidclienteDatoConstitucionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonidclienteDatoConstitucion.addActionListener(new ButtonActionListener(this,"idclienteDatoConstitucion"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonidclienteDatoConstitucionUpdate.addActionListener(new ButtonActionListener(this,"idclienteDatoConstitucionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonidclienteDatoConstitucionBusqueda.addActionListener(new ButtonActionListener(this,"idclienteDatoConstitucionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonidvalorclientecompaniaDatoConstitucionUpdate.addActionListener(new ButtonActionListener(this,"idvalorclientecompaniaDatoConstitucionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonidvalorclientecompaniaDatoConstitucionBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclientecompaniaDatoConstitucionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoConstitucion.jButtondireccionDatoConstitucionBusqueda.addActionListener(new ButtonActionListener(this,"direccionDatoConstitucionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonfechaconstitucionDatoConstitucionBusqueda.addActionListener(new ButtonActionListener(this,"fechaconstitucionDatoConstitucionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoConstitucion.jButtoncapitalsuscritoDatoConstitucionBusqueda.addActionListener(new ButtonActionListener(this,"capitalsuscritoDatoConstitucionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonplazofiniquitoDatoConstitucionBusqueda.addActionListener(new ButtonActionListener(this,"plazofiniquitoDatoConstitucionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonreservalegalDatoConstitucionBusqueda.addActionListener(new ButtonActionListener(this,"reservalegalDatoConstitucionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonfechaestatutoDatoConstitucionBusqueda.addActionListener(new ButtonActionListener(this,"fechaestatutoDatoConstitucionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonesactivoDatoConstitucionBusqueda.addActionListener(new ButtonActionListener(this,"esactivoDatoConstitucionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDatoConstitucion.jTabbedPaneRelacionesDatoConstitucion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDatoConstitucion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDatoConstitucion"));
		
		if(this.jInternalFrameDetalleFormDatoConstitucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoConstitucion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDatoConstitucion"));
		}
		
		this.jTableDatosDatoConstitucion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDatoConstitucion"));
		
		this.jTableDatosDatoConstitucion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDatoConstitucion"));
		
		this.jButtonNuevoDatoConstitucion.addActionListener(new ButtonActionListener(this,"NuevoDatoConstitucion"));
		
		this.jButtonDuplicarDatoConstitucion.addActionListener(new ButtonActionListener(this,"DuplicarDatoConstitucion"));
		
		this.jButtonCopiarDatoConstitucion.addActionListener(new ButtonActionListener(this,"CopiarDatoConstitucion"));
		
		this.jButtonVerFormDatoConstitucion.addActionListener(new ButtonActionListener(this,"VerFormDatoConstitucion"));
		
		
		this.jButtonNuevoToolBarDatoConstitucion.addActionListener(new ButtonActionListener(this,"NuevoToolBarDatoConstitucion"));
			
		this.jButtonDuplicarToolBarDatoConstitucion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDatoConstitucion"));
			
		this.jMenuItemNuevoDatoConstitucion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDatoConstitucion"));
			
		this.jMenuItemDuplicarDatoConstitucion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDatoConstitucion"));		
		
		
		this.jButtonNuevoRelacionesDatoConstitucion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDatoConstitucion"));
		
		
		this.jButtonNuevoRelacionesToolBarDatoConstitucion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDatoConstitucion"));
			
		this.jMenuItemNuevoRelacionesDatoConstitucion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDatoConstitucion"));		
		
		
		if(this.jInternalFrameDetalleFormDatoConstitucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoConstitucion.jButtonModificarDatoConstitucion.addActionListener(new ButtonActionListener(this,"ModificarDatoConstitucion"));
		}
		
		
		if(this.jInternalFrameDetalleFormDatoConstitucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoConstitucion.jButtonModificarToolBarDatoConstitucion.addActionListener(new ButtonActionListener(this,"ModificarToolBarDatoConstitucion"));
			
			this.jInternalFrameDetalleFormDatoConstitucion.jMenuItemModificarDatoConstitucion.addActionListener(new ButtonActionListener(this,"MenuItemModificarDatoConstitucion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDatoConstitucion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDatoConstitucion.jButtonActualizarDatoConstitucion.addActionListener (new ButtonActionListener(this,"ActualizarDatoConstitucion"));
		}
		
		
		if(this.jInternalFrameDetalleFormDatoConstitucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoConstitucion.jButtonActualizarToolBarDatoConstitucion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDatoConstitucion"));
				
			this.jInternalFrameDetalleFormDatoConstitucion.jMenuItemActualizarDatoConstitucion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDatoConstitucion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDatoConstitucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoConstitucion.jButtonEliminarDatoConstitucion.addActionListener (new ButtonActionListener(this,"EliminarDatoConstitucion"));
		}
		
		
		if(this.jInternalFrameDetalleFormDatoConstitucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoConstitucion.jButtonEliminarToolBarDatoConstitucion.addActionListener (new ButtonActionListener(this,"EliminarToolBarDatoConstitucion"));
						
			this.jInternalFrameDetalleFormDatoConstitucion.jMenuItemEliminarDatoConstitucion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDatoConstitucion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDatoConstitucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoConstitucion.jButtonCancelarDatoConstitucion.addActionListener (new ButtonActionListener(this,"CancelarDatoConstitucion"));
		}
		
		
		if(this.jInternalFrameDetalleFormDatoConstitucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoConstitucion.jButtonCancelarToolBarDatoConstitucion.addActionListener (new ButtonActionListener(this,"CancelarToolBarDatoConstitucion"));
			
			this.jInternalFrameDetalleFormDatoConstitucion.jMenuItemCancelarDatoConstitucion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDatoConstitucion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDatoConstitucion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDatoConstitucion"));		
		
		
		this.jButtonCerrarDatoConstitucion.addActionListener (new ButtonActionListener(this,"CerrarDatoConstitucion"));
		
		
		this.jButtonCerrarToolBarDatoConstitucion.addActionListener (new ButtonActionListener(this,"CerrarToolBarDatoConstitucion"));
			
		this.jMenuItemCerrarDatoConstitucion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDatoConstitucion"));
			
		if(this.jInternalFrameDetalleFormDatoConstitucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoConstitucion.jMenuItemDetalleCerrarDatoConstitucion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDatoConstitucion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDatoConstitucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoConstitucion.jButtonGuardarCambiosDatoConstitucion.addActionListener (new ButtonActionListener(this,"GuardarCambiosDatoConstitucion"));
		}
		
		
		if(this.jInternalFrameDetalleFormDatoConstitucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoConstitucion.jButtonGuardarCambiosToolBarDatoConstitucion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDatoConstitucion"));
		}
		
		this.jButtonCopiarToolBarDatoConstitucion.addActionListener (new ButtonActionListener(this,"CopiarToolBarDatoConstitucion"));
			
		this.jButtonVerFormToolBarDatoConstitucion.addActionListener (new ButtonActionListener(this,"VerFormToolBarDatoConstitucion"));
		
		this.jMenuItemGuardarCambiosDatoConstitucion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDatoConstitucion"));
			
		this.jMenuItemCopiarDatoConstitucion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDatoConstitucion"));		
		
		this.jMenuItemVerFormDatoConstitucion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDatoConstitucion"));		
		
		
		this.jButtonGuardarCambiosTablaDatoConstitucion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDatoConstitucion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDatoConstitucion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDatoConstitucion"));
			
		this.jMenuItemGuardarCambiosTablaDatoConstitucion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDatoConstitucion"));		
		
		
		
		this.jButtonRecargarInformacionDatoConstitucion.addActionListener (new ButtonActionListener(this,"RecargarInformacionDatoConstitucion"));
					
		this.jButtonRecargarInformacionToolBarDatoConstitucion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDatoConstitucion"));
		
		this.jMenuItemRecargarInformacionDatoConstitucion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDatoConstitucion"));		
		
		
		
		this.jButtonAnterioresDatoConstitucion.addActionListener (new ButtonActionListener(this,"AnterioresDatoConstitucion"));
		
		
		this.jButtonAnterioresToolBarDatoConstitucion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDatoConstitucion"));
		
		this.jMenuItemAnterioresDatoConstitucion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDatoConstitucion"));		
		
		
		this.jButtonSiguientesDatoConstitucion.addActionListener (new ButtonActionListener(this,"SiguientesDatoConstitucion"));
		
		
		this.jButtonSiguientesToolBarDatoConstitucion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDatoConstitucion"));
			
		this.jMenuItemSiguientesDatoConstitucion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDatoConstitucion"));
			
		this.jMenuItemAbrirOrderByDatoConstitucion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDatoConstitucion"));
			
		this.jMenuItemMostrarOcultarDatoConstitucion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDatoConstitucion"));
			
		this.jMenuItemDetalleAbrirOrderByDatoConstitucion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDatoConstitucion"));
			
		this.jMenuItemDetalleMostarOcultarDatoConstitucion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDatoConstitucion"));		
		
		
		this.jButtonNuevoGuardarCambiosDatoConstitucion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDatoConstitucion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDatoConstitucion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDatoConstitucion"));
			
		this.jMenuItemNuevoGuardarCambiosDatoConstitucion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDatoConstitucion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDatoConstitucion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDatoConstitucion"));

		this.jCheckBoxSeleccionadosDatoConstitucion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDatoConstitucion"));
		
		if(this.jInternalFrameDetalleFormDatoConstitucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxTiposAccionesFormularioDatoConstitucion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDatoConstitucion"));
		}
		
		
		this.jComboBoxTiposRelacionesDatoConstitucion.addActionListener (new ButtonActionListener(this,"TiposRelacionesDatoConstitucion"));
			
		this.jComboBoxTiposAccionesDatoConstitucion.addActionListener (new ButtonActionListener(this,"TiposAccionesDatoConstitucion"));
					
		this.jComboBoxTiposSeleccionarDatoConstitucion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDatoConstitucion"));
			
		this.jTextFieldValorCampoGeneralDatoConstitucion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDatoConstitucion"));		
		
		
		if(this.jInternalFrameDetalleFormDatoConstitucion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonidDatoConstitucionBusqueda.addActionListener(new ButtonActionListener(this,"idDatoConstitucionBusqueda"));
		//jButtonidclienteDatoConstitucion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonidclienteDatoConstitucionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonidclienteDatoConstitucion.addActionListener(new ButtonActionListener(this,"idclienteDatoConstitucion"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonidclienteDatoConstitucionUpdate.addActionListener(new ButtonActionListener(this,"idclienteDatoConstitucionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonidclienteDatoConstitucionBusqueda.addActionListener(new ButtonActionListener(this,"idclienteDatoConstitucionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonidvalorclientecompaniaDatoConstitucionUpdate.addActionListener(new ButtonActionListener(this,"idvalorclientecompaniaDatoConstitucionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonidvalorclientecompaniaDatoConstitucionBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclientecompaniaDatoConstitucionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoConstitucion.jButtondireccionDatoConstitucionBusqueda.addActionListener(new ButtonActionListener(this,"direccionDatoConstitucionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonfechaconstitucionDatoConstitucionBusqueda.addActionListener(new ButtonActionListener(this,"fechaconstitucionDatoConstitucionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoConstitucion.jButtoncapitalsuscritoDatoConstitucionBusqueda.addActionListener(new ButtonActionListener(this,"capitalsuscritoDatoConstitucionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonplazofiniquitoDatoConstitucionBusqueda.addActionListener(new ButtonActionListener(this,"plazofiniquitoDatoConstitucionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonreservalegalDatoConstitucionBusqueda.addActionListener(new ButtonActionListener(this,"reservalegalDatoConstitucionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonfechaestatutoDatoConstitucionBusqueda.addActionListener(new ButtonActionListener(this,"fechaestatutoDatoConstitucionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonesactivoDatoConstitucionBusqueda.addActionListener(new ButtonActionListener(this,"esactivoDatoConstitucionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdClienteDatoConstitucion.addActionListener(new ButtonActionListener(this,"FK_IdClienteDatoConstitucion"));

			this.jButtonBuscarFK_IdClienteidclienteDatoConstitucion.addActionListener(new ButtonActionListener(this,"idclienteDatoConstitucion"));

			this.jButtonFK_IdValorClienteCompaniaDatoConstitucion.addActionListener(new ButtonActionListener(this,"FK_IdValorClienteCompaniaDatoConstitucion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDatoConstitucion!=null) {
				this.jInternalFrameReporteDinamicoDatoConstitucion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDatoConstitucion"));
				this.jInternalFrameReporteDinamicoDatoConstitucion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDatoConstitucion"));
				this.jInternalFrameReporteDinamicoDatoConstitucion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDatoConstitucion"));
			}
			
			//this.jButtonCerrarReporteDinamicoDatoConstitucion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDatoConstitucion"));				
			//this.jButtonGenerarReporteDinamicoDatoConstitucion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDatoConstitucion"));
			//this.jButtonGenerarExcelReporteDinamicoDatoConstitucion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDatoConstitucion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDatoConstitucion!=null) {
				this.jInternalFrameImportacionDatoConstitucion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDatoConstitucion"));
				this.jInternalFrameImportacionDatoConstitucion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDatoConstitucion"));
				this.jInternalFrameImportacionDatoConstitucion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDatoConstitucion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDatoConstitucion.addActionListener (new ButtonActionListener(this,"AbrirOrderByDatoConstitucion"));
			
			this.jButtonAbrirOrderByToolBarDatoConstitucion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDatoConstitucion"));			
			
			if(this.jInternalFrameOrderByDatoConstitucion!=null) {
				this.jInternalFrameOrderByDatoConstitucion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDatoConstitucion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDatoConstitucion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDatoConstitucion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDatoConstitucion.jTabbedPaneRelacionesDatoConstitucion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDatoConstitucion"));
		
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
            		closingInternalFrameDatoConstitucion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDatoConstitucion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDatoConstitucion = (JInternalFrameBase)event.getSource();
	            	
	            DatoConstitucionBeanSwingJInternalFrame jInternalFrameParent=(DatoConstitucionBeanSwingJInternalFrame)jInternalFrameDetalleFormDatoConstitucion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDatoConstitucionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDatoConstitucion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDatoConstitucionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDatoConstitucion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDatoConstitucion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDatoConstitucionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDatoConstitucionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDatoConstitucionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDatoConstitucion";
		inputMap = this.jButtonNuevoDatoConstitucion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDatoConstitucion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDatoConstitucionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDatoConstitucionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDatoConstitucionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDatoConstitucionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDatoConstitucion";
		inputMap = this.jButtonNuevoRelacionesDatoConstitucion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDatoConstitucion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDatoConstitucionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDatoConstitucion";
		inputMap = this.jButtonModificarDatoConstitucion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDatoConstitucion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDatoConstitucionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDatoConstitucion";
		inputMap = this.jButtonActualizarDatoConstitucion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDatoConstitucion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDatoConstitucionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDatoConstitucion";
		inputMap = this.jButtonEliminarDatoConstitucion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDatoConstitucion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDatoConstitucionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDatoConstitucion";
		inputMap = this.jButtonCancelarDatoConstitucion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDatoConstitucion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDatoConstitucionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDatoConstitucion";
		inputMap = this.jButtonCerrarDatoConstitucion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDatoConstitucion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDatoConstitucionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonGuardarCambiosDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDatoConstitucion";
		inputMap = this.jInternalFrameDetalleFormDatoConstitucion.jButtonGuardarCambiosDatoConstitucion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonGuardarCambiosDatoConstitucion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDatoConstitucionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDatoConstitucion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDatoConstitucionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDatoConstitucion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDatoConstitucionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDatoConstitucion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDatoConstitucionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDatoConstitucion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDatoConstitucionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonidDatoConstitucionBusqueda.addActionListener(new ButtonActionListener(this,"idDatoConstitucionBusqueda"));
		//jButtonidclienteDatoConstitucion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonidclienteDatoConstitucionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonidclienteDatoConstitucion.addActionListener(new ButtonActionListener(this,"idclienteDatoConstitucion"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonidclienteDatoConstitucionUpdate.addActionListener(new ButtonActionListener(this,"idclienteDatoConstitucionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonidclienteDatoConstitucionBusqueda.addActionListener(new ButtonActionListener(this,"idclienteDatoConstitucionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonidvalorclientecompaniaDatoConstitucionUpdate.addActionListener(new ButtonActionListener(this,"idvalorclientecompaniaDatoConstitucionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonidvalorclientecompaniaDatoConstitucionBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclientecompaniaDatoConstitucionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoConstitucion.jButtondireccionDatoConstitucionBusqueda.addActionListener(new ButtonActionListener(this,"direccionDatoConstitucionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonfechaconstitucionDatoConstitucionBusqueda.addActionListener(new ButtonActionListener(this,"fechaconstitucionDatoConstitucionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoConstitucion.jButtoncapitalsuscritoDatoConstitucionBusqueda.addActionListener(new ButtonActionListener(this,"capitalsuscritoDatoConstitucionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonplazofiniquitoDatoConstitucionBusqueda.addActionListener(new ButtonActionListener(this,"plazofiniquitoDatoConstitucionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonreservalegalDatoConstitucionBusqueda.addActionListener(new ButtonActionListener(this,"reservalegalDatoConstitucionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonfechaestatutoDatoConstitucionBusqueda.addActionListener(new ButtonActionListener(this,"fechaestatutoDatoConstitucionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDatoConstitucion.jButtonesactivoDatoConstitucionBusqueda.addActionListener(new ButtonActionListener(this,"esactivoDatoConstitucionBusqueda"));
		
		
		this.jButtonFK_IdClienteDatoConstitucion.addActionListener(new ButtonActionListener(this,"FK_IdClienteDatoConstitucion"));

		this.jButtonBuscarFK_IdClienteidclienteDatoConstitucion.addActionListener(new ButtonActionListener(this,"idclienteDatoConstitucion"));

		this.jButtonFK_IdValorClienteCompaniaDatoConstitucion.addActionListener(new ButtonActionListener(this,"FK_IdValorClienteCompaniaDatoConstitucion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDatoConstitucion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDatoConstitucionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDatoConstitucionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDatoConstitucion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDatoConstitucion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DatoConstitucion datoconstitucionAux:this.datoconstitucionLogic.getDatoConstitucions()) {
					datoconstitucionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DatoConstitucion datoconstitucionAux:datoconstitucions) {
					datoconstitucionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDatoConstitucionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDatoConstitucion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DatoConstitucion datoconstitucionAux:this.datoconstitucionLogic.getDatoConstitucions()) {
						datoconstitucionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DatoConstitucion datoconstitucionAux:datoconstitucions) {
						datoconstitucionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DatoConstitucion datoconstitucionAux:this.datoconstitucionLogic.getDatoConstitucions()) {
					
						if(sTipoSeleccionar.equals(DatoConstitucionConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							datoconstitucionAux.setesactivo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DatoConstitucion datoconstitucionAux:datoconstitucions) {
						
						if(sTipoSeleccionar.equals(DatoConstitucionConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							datoconstitucionAux.setesactivo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDatoConstitucion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDatoConstitucion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDatoConstitucion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDatoConstitucion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDatoConstitucionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDatoConstitucion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDatoConstitucion.getSelectedRows();
			
			DatoConstitucion datoconstitucionLocal=new DatoConstitucion();
			
			//this.seleccionarTodosDatoConstitucion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					datoconstitucionLocal =(DatoConstitucion) this.datoconstitucionLogic.getDatoConstitucions().toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					datoconstitucionLocal =(DatoConstitucion) this.datoconstitucions.toArray()[this.jTableDatosDatoConstitucion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				datoconstitucionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DatoConstitucion datoconstitucionAux:this.datoconstitucionLogic.getDatoConstitucions()) {
						datoconstitucionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DatoConstitucion datoconstitucionAux:datoconstitucions) {
						datoconstitucionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDatoConstitucion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDatoConstitucion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDatoConstitucion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDatoConstitucion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDatoConstitucionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDatoConstitucionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDatoConstitucionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDatoConstitucion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDatoConstitucion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DatoConstitucion datoconstitucionAux:this.datoconstitucionLogic.getDatoConstitucions()) {
				
						if(sTipoSeleccionar.equals(DatoConstitucionConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							datoconstitucionAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DatoConstitucionConstantesFunciones.LABEL_FECHACONSTITUCION)) {
							existe=true;
							datoconstitucionAux.setfechaconstitucion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DatoConstitucionConstantesFunciones.LABEL_CAPITALSUSCRITO)) {
							existe=true;
							datoconstitucionAux.setcapitalsuscrito(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DatoConstitucionConstantesFunciones.LABEL_PLAZOFINIQUITO)) {
							existe=true;
							datoconstitucionAux.setplazofiniquito(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DatoConstitucionConstantesFunciones.LABEL_RESERVALEGAL)) {
							existe=true;
							datoconstitucionAux.setreservalegal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DatoConstitucionConstantesFunciones.LABEL_FECHAESTATUTO)) {
							existe=true;
							datoconstitucionAux.setfechaestatuto(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DatoConstitucion datoconstitucionAux:datoconstitucions) {
					
						if(sTipoSeleccionar.equals(DatoConstitucionConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							datoconstitucionAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DatoConstitucionConstantesFunciones.LABEL_FECHACONSTITUCION)) {
							existe=true;
							datoconstitucionAux.setfechaconstitucion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DatoConstitucionConstantesFunciones.LABEL_CAPITALSUSCRITO)) {
							existe=true;
							datoconstitucionAux.setcapitalsuscrito(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DatoConstitucionConstantesFunciones.LABEL_PLAZOFINIQUITO)) {
							existe=true;
							datoconstitucionAux.setplazofiniquito(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DatoConstitucionConstantesFunciones.LABEL_RESERVALEGAL)) {
							existe=true;
							datoconstitucionAux.setreservalegal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DatoConstitucionConstantesFunciones.LABEL_FECHAESTATUTO)) {
							existe=true;
							datoconstitucionAux.setfechaestatuto(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDatoConstitucion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDatoConstitucionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDatoConstitucion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDatoConstitucion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDatoConstitucion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxTiposAccionesFormularioDatoConstitucion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDatoConstitucion) {				
					conSplash=true;//false;										
					
					//this.startProcessDatoConstitucion(conSplash);
				
					this.generarReporteDatoConstitucionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDatoConstitucion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxTiposAccionesFormularioDatoConstitucion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDatoConstitucionsSeleccionados();
				//this.jComboBoxTiposAccionesDatoConstitucion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDatoConstitucionsSeleccionados(false);
				//this.jComboBoxTiposAccionesDatoConstitucion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDatoConstitucionsSeleccionados(true);
				//this.jComboBoxTiposAccionesDatoConstitucion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDatoConstitucion();
				
				this.exportarDatoConstitucionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDatoConstitucion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxTiposAccionesFormularioDatoConstitucion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDatoConstitucions();
				//this.importarDatoConstitucions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDatoConstitucion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxTiposAccionesFormularioDatoConstitucion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDatoConstitucion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDatoConstitucionsSeleccionados();
				//this.jComboBoxTiposAccionesDatoConstitucion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Dato Constitucion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDatoConstitucion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDatoConstitucion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDatoConstitucion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Dato Constitucion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDatoConstitucion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxTiposAccionesFormularioDatoConstitucion.setSelectedIndex(0);					
				}	
			} 			
			else if(DatoConstitucionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDatoConstitucion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDatoConstitucion(conSplash);
					
						//this.actualizarParametrosGeneralDatoConstitucion();
						
						this.generarReporteProcesoAccionDatoConstitucionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDatoConstitucion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxTiposAccionesFormularioDatoConstitucion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DatoConstitucionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Dato ConstitucionES SELECCIONADOS?", "MANTENIMIENTO DE Dato Constitucion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDatoConstitucion();
				
						this.actualizarParametrosGeneralDatoConstitucion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.datoconstitucionReturnGeneral=datoconstitucionLogic.procesarAccionDatoConstitucionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.datoconstitucionLogic.getDatoConstitucions(),this.datoconstitucionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDatoConstitucionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDatoConstitucion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxTiposAccionesFormularioDatoConstitucion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDatoConstitucion();
					
					DatoConstitucionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDatoConstitucionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDatoConstitucion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxTiposAccionesFormularioDatoConstitucion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDatoConstitucion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDatoConstitucionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDatoConstitucion();
			
			if(this.jInternalFrameDetalleFormDatoConstitucion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DatoConstitucion> datoconstitucionsSeleccionados=new ArrayList<DatoConstitucion>();		
			DatoConstitucion datoconstitucion=new DatoConstitucion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDatoConstitucion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDatoConstitucion.getSelectedItem();
			
			
			
			
			datoconstitucionsSeleccionados=this.getDatoConstitucionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(datoconstitucionsSeleccionados.size()==1) {
				for(DatoConstitucion datoconstitucionAux:datoconstitucionsSeleccionados) {
					datoconstitucion=datoconstitucionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDatoConstitucion();
			
      		//this.finishProcessDatoConstitucion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDatoConstitucionReturnGeneral() throws Exception {
		if(this.datoconstitucionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.datoconstitucionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.datoconstitucionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.datoconstitucionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.datoconstitucionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.datoconstitucionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDatoConstitucion(false);
		}
		
		if(this.datoconstitucionReturnGeneral.getConRetornoLista() || this.datoconstitucionReturnGeneral.getConRetornoObjeto()) {
			if(this.datoconstitucionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.datoconstitucionLogic.setDatoConstitucions(this.datoconstitucionReturnGeneral.getDatoConstitucions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.datoconstitucionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.datoconstitucionLogic.setDatoConstitucion(this.datoconstitucionReturnGeneral.getDatoConstitucion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDatoConstitucion(false);
		}
	}
	
	public void actualizarParametrosGeneralDatoConstitucion() throws Exception {
		
		
	}
	
	public ArrayList<DatoConstitucion> getDatoConstitucionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DatoConstitucion> datoconstitucionsSeleccionados=new ArrayList<DatoConstitucion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDatoConstitucion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DatoConstitucion datoconstitucionAux:datoconstitucionLogic.getDatoConstitucions()) {
					if(datoconstitucionAux.getIsSelected()) {
						datoconstitucionsSeleccionados.add(datoconstitucionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DatoConstitucion datoconstitucionAux:this.datoconstitucions) {
					if(datoconstitucionAux.getIsSelected()) {
						datoconstitucionsSeleccionados.add(datoconstitucionAux);				
					}
				}
			}
			
			if(datoconstitucionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						datoconstitucionsSeleccionados.addAll(this.datoconstitucionLogic.getDatoConstitucions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						datoconstitucionsSeleccionados.addAll(this.datoconstitucions);				
					}
				}
			}
		} else {
			datoconstitucionsSeleccionados.add(this.datoconstitucion);
		}
		
		return datoconstitucionsSeleccionados;
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
	
	public void generarReporteDatoConstitucionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDatoConstitucionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDatoConstitucionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDatoConstitucionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDatoConstitucionsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Dato Constitucion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDatoConstitucionsSeleccionados() throws Exception {
		ArrayList<DatoConstitucion> datoconstitucionsSeleccionados=new ArrayList<DatoConstitucion>();		
		
		datoconstitucionsSeleccionados=this.getDatoConstitucionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDatoConstitucions("Todos",datoconstitucionsSeleccionados);
		
	}	
	
	public void generarReporteNormalDatoConstitucionsSeleccionados() throws Exception {
		ArrayList<DatoConstitucion> datoconstitucionsSeleccionados=new ArrayList<DatoConstitucion>();		
		
		datoconstitucionsSeleccionados=this.getDatoConstitucionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDatoConstitucions("Todos",datoconstitucionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDatoConstitucionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DatoConstitucion> datoconstitucionsSeleccionados=new ArrayList<DatoConstitucion>();
		
		datoconstitucionsSeleccionados=this.getDatoConstitucionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDatoConstitucions("Todos",datoconstitucionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDatoConstitucionsSeleccionados() throws Exception {
		ArrayList<DatoConstitucion> datoconstitucionsSeleccionados=new ArrayList<DatoConstitucion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDatoConstitucion();
		
		
		datoconstitucionsSeleccionados=this.getDatoConstitucionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDatoConstitucion();
		
		
		//this.generarReporteDatoConstitucions("Todos",datoconstitucionsSeleccionados ,datoconstitucionImplementable,datoconstitucionImplementableHome);
	}
	
	public void mostrarImportacionDatoConstitucions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDatoConstitucion();
		
		this.abrirFrameImportacionDatoConstitucion();		
		
			
		//this.generarReporteDatoConstitucions("Todos",datoconstitucionsSeleccionados ,datoconstitucionImplementable,datoconstitucionImplementableHome);
	}
	
	public void importarDatoConstitucions() throws Exception {		
	
	}
	
	public void exportarDatoConstitucionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDatoConstitucionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDatoConstitucionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDatoConstitucionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Dato Constitucion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDatoConstitucionsSeleccionados() throws Exception {
		ArrayList<DatoConstitucion> datoconstitucionsSeleccionados=new ArrayList<DatoConstitucion>();		
		
		datoconstitucionsSeleccionados=this.getDatoConstitucionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"datoconstitucion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDatoConstitucion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DatoConstitucion datoconstitucionAux:datoconstitucionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDatoConstitucion(datoconstitucionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//datoconstitucionAux.setsDetalleGeneralEntityReporte(datoconstitucionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato Constitucion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDatoConstitucion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DatoConstitucionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoConstitucionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoConstitucionConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoConstitucionConstantesFunciones.LABEL_IDTIPOCOMPANIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoConstitucionConstantesFunciones.LABEL_DIRECCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoConstitucionConstantesFunciones.LABEL_FECHACONSTITUCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoConstitucionConstantesFunciones.LABEL_CAPITALSUSCRITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoConstitucionConstantesFunciones.LABEL_PLAZOFINIQUITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoConstitucionConstantesFunciones.LABEL_RESERVALEGAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoConstitucionConstantesFunciones.LABEL_FECHAESTATUTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DatoConstitucionConstantesFunciones.LABEL_ESACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDatoConstitucion(DatoConstitucion datoconstitucion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=datoconstitucion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=datoconstitucion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=datoconstitucion.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datoconstitucion.gettipocompania_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datoconstitucion.getdireccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datoconstitucion.getfechaconstitucion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datoconstitucion.getcapitalsuscrito().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datoconstitucion.getplazofiniquito().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datoconstitucion.getreservalegal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datoconstitucion.getfechaestatuto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=datoconstitucion.getesactivo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDatoConstitucionsSeleccionados() throws Exception {
		ArrayList<DatoConstitucion> datoconstitucionsSeleccionados=new ArrayList<DatoConstitucion>();		
		
		datoconstitucionsSeleccionados=this.getDatoConstitucionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"datoconstitucion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DatoConstitucions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDatoConstitucion(row);				
				iRow++;
			}				
			
			for(DatoConstitucion datoconstitucionAux:datoconstitucionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDatoConstitucion(datoconstitucionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato Constitucion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDatoConstitucionsSeleccionados() throws Exception {
		ArrayList<DatoConstitucion> datoconstitucionsSeleccionados=new ArrayList<DatoConstitucion>();		
		
		datoconstitucionsSeleccionados=this.getDatoConstitucionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"datoconstitucion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("datoconstitucions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("datoconstitucion");
			//elementRoot.appendChild(element);
		
			for(DatoConstitucion datoconstitucionAux:datoconstitucionsSeleccionados) {
				element = document.createElement("datoconstitucion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDatoConstitucion(datoconstitucionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dato Constitucion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDatoConstitucion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DatoConstitucionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DatoConstitucionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DatoConstitucionConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(DatoConstitucionConstantesFunciones.LABEL_IDTIPOCOMPANIA);
		cell = row.createCell(iColumn++);cell.setCellValue(DatoConstitucionConstantesFunciones.LABEL_DIRECCION);
		cell = row.createCell(iColumn++);cell.setCellValue(DatoConstitucionConstantesFunciones.LABEL_FECHACONSTITUCION);
		cell = row.createCell(iColumn++);cell.setCellValue(DatoConstitucionConstantesFunciones.LABEL_CAPITALSUSCRITO);
		cell = row.createCell(iColumn++);cell.setCellValue(DatoConstitucionConstantesFunciones.LABEL_PLAZOFINIQUITO);
		cell = row.createCell(iColumn++);cell.setCellValue(DatoConstitucionConstantesFunciones.LABEL_RESERVALEGAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DatoConstitucionConstantesFunciones.LABEL_FECHAESTATUTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DatoConstitucionConstantesFunciones.LABEL_ESACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDatoConstitucion(DatoConstitucion datoconstitucion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(datoconstitucion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(datoconstitucion.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(datoconstitucion.gettipocompania_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(datoconstitucion.getdireccion());
		cell = row.createCell(iColumn++);cell.setCellValue(datoconstitucion.getfechaconstitucion());
		cell = row.createCell(iColumn++);cell.setCellValue(datoconstitucion.getcapitalsuscrito());
		cell = row.createCell(iColumn++);cell.setCellValue(datoconstitucion.getplazofiniquito());
		cell = row.createCell(iColumn++);cell.setCellValue(datoconstitucion.getreservalegal());
		cell = row.createCell(iColumn++);cell.setCellValue(datoconstitucion.getfechaestatuto());
		cell = row.createCell(iColumn++);cell.setCellValue(datoconstitucion.getesactivo());				
	}
	
	public void setFilaDatosExportarXmlDatoConstitucion(DatoConstitucion datoconstitucion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DatoConstitucionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(datoconstitucion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DatoConstitucionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(datoconstitucion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcliente_descripcion = document.createElement(DatoConstitucionConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(datoconstitucion.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementtipocompania_descripcion = document.createElement(DatoConstitucionConstantesFunciones.IDTIPOCOMPANIA);
		elementtipocompania_descripcion.appendChild(document.createTextNode(datoconstitucion.gettipocompania_descripcion()));
		element.appendChild(elementtipocompania_descripcion);

		Element elementdireccion = document.createElement(DatoConstitucionConstantesFunciones.DIRECCION);
		elementdireccion.appendChild(document.createTextNode(datoconstitucion.getdireccion().trim()));
		element.appendChild(elementdireccion);

		Element elementfechaconstitucion = document.createElement(DatoConstitucionConstantesFunciones.FECHACONSTITUCION);
		elementfechaconstitucion.appendChild(document.createTextNode(datoconstitucion.getfechaconstitucion().toString().trim()));
		element.appendChild(elementfechaconstitucion);

		Element elementcapitalsuscrito = document.createElement(DatoConstitucionConstantesFunciones.CAPITALSUSCRITO);
		elementcapitalsuscrito.appendChild(document.createTextNode(datoconstitucion.getcapitalsuscrito().toString().trim()));
		element.appendChild(elementcapitalsuscrito);

		Element elementplazofiniquito = document.createElement(DatoConstitucionConstantesFunciones.PLAZOFINIQUITO);
		elementplazofiniquito.appendChild(document.createTextNode(datoconstitucion.getplazofiniquito().toString().trim()));
		element.appendChild(elementplazofiniquito);

		Element elementreservalegal = document.createElement(DatoConstitucionConstantesFunciones.RESERVALEGAL);
		elementreservalegal.appendChild(document.createTextNode(datoconstitucion.getreservalegal().toString().trim()));
		element.appendChild(elementreservalegal);

		Element elementfechaestatuto = document.createElement(DatoConstitucionConstantesFunciones.FECHAESTATUTO);
		elementfechaestatuto.appendChild(document.createTextNode(datoconstitucion.getfechaestatuto().toString().trim()));
		element.appendChild(elementfechaestatuto);

		Element elementesactivo = document.createElement(DatoConstitucionConstantesFunciones.ESACTIVO);
		elementesactivo.appendChild(document.createTextNode(datoconstitucion.getesactivo().toString().trim()));
		element.appendChild(elementesactivo);
	}
	
	public void generarReporteGroupGenericoDatoConstitucionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DatoConstitucion> datoconstitucionsSeleccionados=new ArrayList<DatoConstitucion>();
		
		datoconstitucionsSeleccionados=this.getDatoConstitucionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDatoConstitucion(datoconstitucionsSeleccionados);
		
		this.generarReporteDatoConstitucions("Todos",datoconstitucionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDatoConstitucion(ArrayList<DatoConstitucion> datoconstitucionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DatoConstitucion datoconstitucionAux:datoconstitucionsSeleccionados) {
				datoconstitucionAux.setsDetalleGeneralEntityReporte(datoconstitucionAux.toString());
			
				if(sTipoSeleccionar.equals(DatoConstitucionConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					datoconstitucionAux.setsDescripcionGeneralEntityReporte1(datoconstitucionAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DatoConstitucionConstantesFunciones.LABEL_IDTIPOCOMPANIA)) {
					existe=true;
					datoconstitucionAux.setsDescripcionGeneralEntityReporte1(datoconstitucionAux.gettipocompania_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DatoConstitucionConstantesFunciones.LABEL_DIRECCION)) {
					existe=true;
					datoconstitucionAux.setsDescripcionGeneralEntityReporte1(datoconstitucionAux.getdireccion());
				}
				 else if(sTipoSeleccionar.equals(DatoConstitucionConstantesFunciones.LABEL_FECHACONSTITUCION)) {
					existe=true;
					datoconstitucionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(datoconstitucionAux.getfechaconstitucion()));
				}
				 else if(sTipoSeleccionar.equals(DatoConstitucionConstantesFunciones.LABEL_PLAZOFINIQUITO)) {
					existe=true;
					datoconstitucionAux.setsDescripcionGeneralEntityReporte1(datoconstitucionAux.getplazofiniquito().toString());
				}
				 else if(sTipoSeleccionar.equals(DatoConstitucionConstantesFunciones.LABEL_FECHAESTATUTO)) {
					existe=true;
					datoconstitucionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(datoconstitucionAux.getfechaestatuto()));
				}
				 else if(sTipoSeleccionar.equals(DatoConstitucionConstantesFunciones.LABEL_ESACTIVO)) {
					existe=true;
					datoconstitucionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(datoconstitucionAux.getesactivo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DatoConstitucionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDatoConstitucion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDatoConstitucion=true;
				this.isVisibilidadCeldaNuevoRelacionesDatoConstitucion=true;
				this.isVisibilidadCeldaGuardarCambiosDatoConstitucion=true;
			}
			
			this.isVisibilidadCeldaModificarDatoConstitucion=false;
			this.isVisibilidadCeldaActualizarDatoConstitucion=false;
			this.isVisibilidadCeldaEliminarDatoConstitucion=false;
			this.isVisibilidadCeldaCancelarDatoConstitucion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDatoConstitucion=true;
				} else {
					this.isVisibilidadCeldaGuardarDatoConstitucion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDatoConstitucion=false;
			this.isVisibilidadCeldaNuevoRelacionesDatoConstitucion=false;
			this.isVisibilidadCeldaGuardarCambiosDatoConstitucion=false;
			this.isVisibilidadCeldaModificarDatoConstitucion=false;
			this.isVisibilidadCeldaActualizarDatoConstitucion=true;
			this.isVisibilidadCeldaEliminarDatoConstitucion=false;
			this.isVisibilidadCeldaCancelarDatoConstitucion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDatoConstitucion=true;
				} else {
					this.isVisibilidadCeldaGuardarDatoConstitucion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDatoConstitucion=false;
			this.isVisibilidadCeldaNuevoRelacionesDatoConstitucion=false;
			this.isVisibilidadCeldaGuardarCambiosDatoConstitucion=false;
			this.isVisibilidadCeldaModificarDatoConstitucion=false;
			this.isVisibilidadCeldaActualizarDatoConstitucion=true;
			this.isVisibilidadCeldaEliminarDatoConstitucion=true;
			this.isVisibilidadCeldaCancelarDatoConstitucion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDatoConstitucion=true;
				} else {
					this.isVisibilidadCeldaGuardarDatoConstitucion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDatoConstitucion=false;
			this.isVisibilidadCeldaNuevoRelacionesDatoConstitucion=false;
			this.isVisibilidadCeldaGuardarCambiosDatoConstitucion=false;
			this.isVisibilidadCeldaModificarDatoConstitucion=false;
			this.isVisibilidadCeldaActualizarDatoConstitucion=true;
			this.isVisibilidadCeldaEliminarDatoConstitucion=false;
			this.isVisibilidadCeldaCancelarDatoConstitucion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDatoConstitucion=false;
				} else {
					this.isVisibilidadCeldaGuardarDatoConstitucion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDatoConstitucion=true;
			this.isVisibilidadCeldaNuevoRelacionesDatoConstitucion=true;
			this.isVisibilidadCeldaGuardarCambiosDatoConstitucion=true;
			this.isVisibilidadCeldaModificarDatoConstitucion=false;
			this.isVisibilidadCeldaActualizarDatoConstitucion=false;
			this.isVisibilidadCeldaEliminarDatoConstitucion=false;
			this.isVisibilidadCeldaCancelarDatoConstitucion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDatoConstitucion=true;
				} else {
					this.isVisibilidadCeldaGuardarDatoConstitucion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDatoConstitucion=false;
			this.isVisibilidadCeldaNuevoRelacionesDatoConstitucion=false;
			this.isVisibilidadCeldaGuardarCambiosDatoConstitucion=false;
			this.isVisibilidadCeldaActualizarDatoConstitucion=false;
			this.isVisibilidadCeldaEliminarDatoConstitucion=false;
			this.isVisibilidadCeldaCancelarDatoConstitucion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDatoConstitucion=false;
				} else {
					this.isVisibilidadCeldaGuardarDatoConstitucion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDatoConstitucion=false;
			this.isVisibilidadCeldaNuevoRelacionesDatoConstitucion=false;
			this.isVisibilidadCeldaGuardarCambiosDatoConstitucion=false;
			this.isVisibilidadCeldaModificarDatoConstitucion=true;
			this.isVisibilidadCeldaActualizarDatoConstitucion=false;
			this.isVisibilidadCeldaEliminarDatoConstitucion=false;
			this.isVisibilidadCeldaCancelarDatoConstitucion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDatoConstitucion=false;
				} else {
					this.isVisibilidadCeldaGuardarDatoConstitucion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DatoConstitucionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDatoConstitucion=true;
			this.isVisibilidadCeldaNuevoRelacionesDatoConstitucion=true;
			this.isVisibilidadCeldaGuardarCambiosDatoConstitucion=true;
		} else {
			this.actualizarEstadoPanelsDatoConstitucion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDatoConstitucion=false;
			//this.isVisibilidadCeldaVerFormDatoConstitucion=false;
			this.isVisibilidadCeldaDuplicarDatoConstitucion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!datoconstitucionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDatoConstitucion=false;
		} else {
			this.isVisibilidadCeldaNuevoDatoConstitucion=false;
			this.isVisibilidadCeldaGuardarCambiosDatoConstitucion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(datoconstitucionSessionBean.getEsGuardarRelacionado()) {
			if(!datoconstitucionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDatoConstitucion=false;												
			}
			
			this.jButtonCerrarDatoConstitucion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDatoConstitucion=false;
		}
		
		if(!this.permiteMantenimiento(this.datoconstitucion)) {
			this.isVisibilidadCeldaActualizarDatoConstitucion=false;
			this.isVisibilidadCeldaEliminarDatoConstitucion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDatoConstitucion() {
	}
	
	public void actualizarEstadoPanelsDatoConstitucion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDatoConstitucion!=null) {
				this.jScrollPanelDatosEdicionDatoConstitucion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoConstitucion!=null) {
				this.jTabbedPaneBusquedasDatoConstitucion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDatoConstitucion!=null) {
				this.jScrollPanelDatosDatoConstitucion.setVisible(true);
			}
			
			if(this.jPanelPaginacionDatoConstitucion!=null) {
				this.jPanelPaginacionDatoConstitucion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDatoConstitucion!=null) {
				this.jPanelParametrosReportesDatoConstitucion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDatoConstitucion!=null) {
				this.jScrollPanelDatosEdicionDatoConstitucion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoConstitucion!=null) {
				this.jTabbedPaneBusquedasDatoConstitucion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDatoConstitucion!=null) {
				this.jScrollPanelDatosDatoConstitucion.setVisible(false);
			}
			
			if(this.jPanelPaginacionDatoConstitucion!=null) {
				this.jPanelPaginacionDatoConstitucion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDatoConstitucion!=null) {
				this.jPanelParametrosReportesDatoConstitucion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDatoConstitucion!=null) {
				this.jScrollPanelDatosEdicionDatoConstitucion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoConstitucion!=null) {
				this.jTabbedPaneBusquedasDatoConstitucion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDatoConstitucion!=null) {
				this.jScrollPanelDatosDatoConstitucion.setVisible(false);
			}
			
			if(this.jPanelPaginacionDatoConstitucion!=null) {
				this.jPanelPaginacionDatoConstitucion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDatoConstitucion!=null) {
				this.jPanelParametrosReportesDatoConstitucion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDatoConstitucion!=null) {
				this.jScrollPanelDatosEdicionDatoConstitucion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoConstitucion!=null) {
				this.jTabbedPaneBusquedasDatoConstitucion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDatoConstitucion!=null) {
				this.jScrollPanelDatosDatoConstitucion.setVisible(false);
			}
			
			if(this.jPanelPaginacionDatoConstitucion!=null) {
				this.jPanelPaginacionDatoConstitucion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDatoConstitucion!=null) {
				this.jPanelParametrosReportesDatoConstitucion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDatoConstitucion!=null) {
				this.jScrollPanelDatosEdicionDatoConstitucion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoConstitucion!=null) {
				this.jTabbedPaneBusquedasDatoConstitucion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDatoConstitucion!=null) {
				this.jScrollPanelDatosDatoConstitucion.setVisible(true);
			}
			
			if(this.jPanelPaginacionDatoConstitucion!=null) {
				this.jPanelPaginacionDatoConstitucion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDatoConstitucion!=null) {
				this.jPanelParametrosReportesDatoConstitucion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDatoConstitucion!=null) {
				this.jScrollPanelDatosEdicionDatoConstitucion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoConstitucion!=null) {
				this.jTabbedPaneBusquedasDatoConstitucion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDatoConstitucion!=null) {
				this.jScrollPanelDatosDatoConstitucion.setVisible(true);
			}
			
			if(this.jPanelPaginacionDatoConstitucion!=null) {
				this.jPanelPaginacionDatoConstitucion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDatoConstitucion!=null) {
				this.jPanelParametrosReportesDatoConstitucion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDatoConstitucion!=null) {
				this.jScrollPanelDatosEdicionDatoConstitucion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoConstitucion!=null) {
				this.jTabbedPaneBusquedasDatoConstitucion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDatoConstitucion!=null) {
				this.jScrollPanelDatosDatoConstitucion.setVisible(true);
			}
			
			if(this.jPanelPaginacionDatoConstitucion!=null) {
				this.jPanelPaginacionDatoConstitucion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDatoConstitucion!=null) {
				this.jPanelParametrosReportesDatoConstitucion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDatoConstitucion!=null) {
					this.jTabbedPaneBusquedasDatoConstitucion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDatoConstitucion!=null) {
				this.jPanelParametrosReportesDatoConstitucion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.datoconstitucionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDatoConstitucion!=null) {
				this.jTabbedPaneBusquedasDatoConstitucion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDatoConstitucion!=null) {
				this.jPanelParametrosReportesDatoConstitucion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasDatoConstitucion.remove(jPanelFK_IdClienteDatoConstitucion);}

			this.isVisibilidadFK_IdValorClienteCompania=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdValorClienteCompania) {this.jTabbedPaneBusquedasDatoConstitucion.remove(jPanelFK_IdValorClienteCompaniaDatoConstitucion);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoCompania(Boolean isParaTipoCompania){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoCompaniaNegation=!isParaTipoCompania;

			this.isVisibilidadFK_IdCliente=isParaTipoCompaniaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasDatoConstitucion.remove(jPanelFK_IdClienteDatoConstitucion);}

			this.isVisibilidadFK_IdValorClienteCompania=isParaTipoCompania;
			if(!this.isVisibilidadFK_IdValorClienteCompania) {this.jTabbedPaneBusquedasDatoConstitucion.remove(jPanelFK_IdValorClienteCompaniaDatoConstitucion);}
		}
		
	}
	
	
	
	

	public String registrarSesionDatoConstitucionParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(datoconstitucionSessionBean==null) {
				datoconstitucionSessionBean=new DatoConstitucionSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(datoconstitucionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.datoconstitucionFuncionGeneral.setCombosCodigoDesdeBusquedaidcliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(DatoConstitucionConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionDatoConstitucion(true);
			//clienteSessionBean.setlidDatoConstitucionActual(this.idDatoConstitucionActual);

			datoconstitucionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyDatoConstitucion(true);
			datoconstitucionSessionBean.setlIdDatoConstitucionActualForeignKey(this.idDatoConstitucionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DatoConstitucionSessionBean datoconstitucionSessionBean=new DatoConstitucionSessionBean();
		
		if(this.datoconstitucionSessionBean==null) {
			this.datoconstitucionSessionBean=new DatoConstitucionSessionBean();
		}
		
		this.datoconstitucionSessionBean.setsUltimaBusquedaDatoConstitucion(this.getsAccionBusqueda());
		this.datoconstitucionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.datoconstitucionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			datoconstitucionSessionBean.setidcliente(this.getidclienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdValorClienteCompania")) {
			datoconstitucionSessionBean.setidvalorclientecompania(this.getidvalorclientecompaniaFK_IdValorClienteCompania());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DatoConstitucionSessionBean datoconstitucionSessionBean=new DatoConstitucionSessionBean();
		
		if(this.datoconstitucionSessionBean==null) {
			this.datoconstitucionSessionBean=new DatoConstitucionSessionBean();
		}
		
		if(this.datoconstitucionSessionBean.getsUltimaBusquedaDatoConstitucion()!=null&&!this.datoconstitucionSessionBean.getsUltimaBusquedaDatoConstitucion().equals("")) {
			this.setsAccionBusqueda(datoconstitucionSessionBean.getsUltimaBusquedaDatoConstitucion());
			this.setiNumeroPaginacion(datoconstitucionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(datoconstitucionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setidclienteFK_IdCliente(datoconstitucionSessionBean.getidcliente());
				datoconstitucionSessionBean.setidcliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdValorClienteCompania")) {
				this.setidvalorclientecompaniaFK_IdValorClienteCompania(datoconstitucionSessionBean.getidvalorclientecompania());
				datoconstitucionSessionBean.setidvalorclientecompania(-1L);
			}
		}
		
		this.datoconstitucionSessionBean.setsUltimaBusquedaDatoConstitucion("");
		this.datoconstitucionSessionBean.setiNumeroPaginacion(DatoConstitucionConstantesFunciones.INUMEROPAGINACION);
		this.datoconstitucionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDatoConstitucion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDatoConstitucion() {
		this.updateBorderResaltarBusquedasFormularioDatoConstitucion();
		this.updateVisibilidadBusquedasFormularioDatoConstitucion();
		this.updateHabilitarBusquedasFormularioDatoConstitucion();
	}
	
	public void updateBorderResaltarBusquedasFormularioDatoConstitucion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDatoConstitucion.getComponents().length>0) {
	

		if(this.datoconstitucionConstantesFunciones.resaltarFK_IdClienteDatoConstitucion!=null) {
			index= this.jTabbedPaneBusquedasDatoConstitucion.indexOfComponent(this.jPanelFK_IdClienteDatoConstitucion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDatoConstitucion.getComponent(index);
				jPanel.setBorder(this.datoconstitucionConstantesFunciones.resaltarFK_IdClienteDatoConstitucion);
			}
		}

		if(this.datoconstitucionConstantesFunciones.resaltarFK_IdValorClienteCompaniaDatoConstitucion!=null) {
			index= this.jTabbedPaneBusquedasDatoConstitucion.indexOfComponent(this.jPanelFK_IdValorClienteCompaniaDatoConstitucion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDatoConstitucion.getComponent(index);
				jPanel.setBorder(this.datoconstitucionConstantesFunciones.resaltarFK_IdValorClienteCompaniaDatoConstitucion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDatoConstitucion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDatoConstitucion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDatoConstitucion.indexOfComponent(this.jPanelFK_IdClienteDatoConstitucion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDatoConstitucion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.datoconstitucionConstantesFunciones.mostrarFK_IdClienteDatoConstitucion);
			if(!this.datoconstitucionConstantesFunciones.mostrarFK_IdClienteDatoConstitucion && index>-1) {
				this.jTabbedPaneBusquedasDatoConstitucion.remove(index);
			}

			index= this.jTabbedPaneBusquedasDatoConstitucion.indexOfComponent(this.jPanelFK_IdValorClienteCompaniaDatoConstitucion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDatoConstitucion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.datoconstitucionConstantesFunciones.mostrarFK_IdValorClienteCompaniaDatoConstitucion);
			if(!this.datoconstitucionConstantesFunciones.mostrarFK_IdValorClienteCompaniaDatoConstitucion && index>-1) {
				this.jTabbedPaneBusquedasDatoConstitucion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDatoConstitucion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDatoConstitucion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDatoConstitucion.indexOfComponent(this.jPanelFK_IdClienteDatoConstitucion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDatoConstitucion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.datoconstitucionConstantesFunciones.activarFK_IdClienteDatoConstitucion);
				this.jTabbedPaneBusquedasDatoConstitucion.setEnabledAt(index,this.datoconstitucionConstantesFunciones.activarFK_IdClienteDatoConstitucion);
			}

			index= this.jTabbedPaneBusquedasDatoConstitucion.indexOfComponent(this.jPanelFK_IdValorClienteCompaniaDatoConstitucion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDatoConstitucion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.datoconstitucionConstantesFunciones.activarFK_IdValorClienteCompaniaDatoConstitucion);
				this.jTabbedPaneBusquedasDatoConstitucion.setEnabledAt(index,this.datoconstitucionConstantesFunciones.activarFK_IdValorClienteCompaniaDatoConstitucion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDatoConstitucion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasDatoConstitucion.indexOfComponent(this.jPanelFK_IdClienteDatoConstitucion);

			this.jTabbedPaneBusquedasDatoConstitucion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDatoConstitucion.getComponent(index);

			this.datoconstitucionConstantesFunciones.setResaltarFK_IdClienteDatoConstitucion(resaltar);

			jPanel.setBorder(this.datoconstitucionConstantesFunciones.resaltarFK_IdClienteDatoConstitucion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdValorClienteCompania")) {
			index= this.jTabbedPaneBusquedasDatoConstitucion.indexOfComponent(this.jPanelFK_IdValorClienteCompaniaDatoConstitucion);

			this.jTabbedPaneBusquedasDatoConstitucion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDatoConstitucion.getComponent(index);

			this.datoconstitucionConstantesFunciones.setResaltarFK_IdValorClienteCompaniaDatoConstitucion(resaltar);

			jPanel.setBorder(this.datoconstitucionConstantesFunciones.resaltarFK_IdValorClienteCompaniaDatoConstitucion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDatoConstitucion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDatoConstitucion() throws Exception {

		if(this.jInternalFrameDetalleFormDatoConstitucion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDatoConstitucion();
		this.updateVisibilidadResaltarControlesFormularioDatoConstitucion();
		this.updateHabilitarResaltarControlesFormularioDatoConstitucion();
		
	}
	
	public void updateBorderResaltarControlesFormularioDatoConstitucion() throws Exception {
		if(this.jInternalFrameDetalleFormDatoConstitucion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.datoconstitucionConstantesFunciones.resaltaridDatoConstitucion!=null && this.jInternalFrameDetalleFormDatoConstitucion!=null) {this.jInternalFrameDetalleFormDatoConstitucion.jLabelidDatoConstitucion.setBorder(this.datoconstitucionConstantesFunciones.resaltaridDatoConstitucion);}
		if(this.datoconstitucionConstantesFunciones.resaltaridclienteDatoConstitucion!=null && this.jInternalFrameDetalleFormDatoConstitucion!=null) {this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxidclienteDatoConstitucion.setBorder(this.datoconstitucionConstantesFunciones.resaltaridclienteDatoConstitucion);}
		if(this.datoconstitucionConstantesFunciones.resaltaridvalorclientecompaniaDatoConstitucion!=null && this.jInternalFrameDetalleFormDatoConstitucion!=null) {this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxidvalorclientecompaniaDatoConstitucion.setBorder(this.datoconstitucionConstantesFunciones.resaltaridvalorclientecompaniaDatoConstitucion);}
		if(this.datoconstitucionConstantesFunciones.resaltardireccionDatoConstitucion!=null && this.jInternalFrameDetalleFormDatoConstitucion!=null) {this.jInternalFrameDetalleFormDatoConstitucion.jTextAreadireccionDatoConstitucion.setBorder(this.datoconstitucionConstantesFunciones.resaltardireccionDatoConstitucion);}
		if(this.datoconstitucionConstantesFunciones.resaltarfechaconstitucionDatoConstitucion!=null && this.jInternalFrameDetalleFormDatoConstitucion!=null) {this.jInternalFrameDetalleFormDatoConstitucion.jDateChooserfechaconstitucionDatoConstitucion.setBorder(this.datoconstitucionConstantesFunciones.resaltarfechaconstitucionDatoConstitucion);}
		if(this.datoconstitucionConstantesFunciones.resaltarcapitalsuscritoDatoConstitucion!=null && this.jInternalFrameDetalleFormDatoConstitucion!=null) {this.jInternalFrameDetalleFormDatoConstitucion.jTextFieldcapitalsuscritoDatoConstitucion.setBorder(this.datoconstitucionConstantesFunciones.resaltarcapitalsuscritoDatoConstitucion);}
		if(this.datoconstitucionConstantesFunciones.resaltarplazofiniquitoDatoConstitucion!=null && this.jInternalFrameDetalleFormDatoConstitucion!=null) {this.jInternalFrameDetalleFormDatoConstitucion.jTextFieldplazofiniquitoDatoConstitucion.setBorder(this.datoconstitucionConstantesFunciones.resaltarplazofiniquitoDatoConstitucion);}
		if(this.datoconstitucionConstantesFunciones.resaltarreservalegalDatoConstitucion!=null && this.jInternalFrameDetalleFormDatoConstitucion!=null) {this.jInternalFrameDetalleFormDatoConstitucion.jTextFieldreservalegalDatoConstitucion.setBorder(this.datoconstitucionConstantesFunciones.resaltarreservalegalDatoConstitucion);}
		if(this.datoconstitucionConstantesFunciones.resaltarfechaestatutoDatoConstitucion!=null && this.jInternalFrameDetalleFormDatoConstitucion!=null) {this.jInternalFrameDetalleFormDatoConstitucion.jDateChooserfechaestatutoDatoConstitucion.setBorder(this.datoconstitucionConstantesFunciones.resaltarfechaestatutoDatoConstitucion);}
		if(this.datoconstitucionConstantesFunciones.resaltaresactivoDatoConstitucion!=null && this.jInternalFrameDetalleFormDatoConstitucion!=null) {this.jInternalFrameDetalleFormDatoConstitucion.jCheckBoxesactivoDatoConstitucion.setBorderPainted(true);this.jInternalFrameDetalleFormDatoConstitucion.jCheckBoxesactivoDatoConstitucion.setBorder(this.datoconstitucionConstantesFunciones.resaltaresactivoDatoConstitucion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDatoConstitucion() throws Exception {		
		if(this.jInternalFrameDetalleFormDatoConstitucion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDatoConstitucion!=null) {
	
		//this.jInternalFrameDetalleFormDatoConstitucion.jLabelidDatoConstitucion.setVisible(this.datoconstitucionConstantesFunciones.mostraridDatoConstitucion);
		this.jInternalFrameDetalleFormDatoConstitucion.jPanelidDatoConstitucion.setVisible(this.datoconstitucionConstantesFunciones.mostraridDatoConstitucion);
		//this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxidclienteDatoConstitucion.setVisible(this.datoconstitucionConstantesFunciones.mostraridclienteDatoConstitucion);
		this.jInternalFrameDetalleFormDatoConstitucion.jPanelidclienteDatoConstitucion.setVisible(this.datoconstitucionConstantesFunciones.mostraridclienteDatoConstitucion);
			this.jInternalFrameDetalleFormDatoConstitucion.jButtonidclienteDatoConstitucion.setVisible(this.datoconstitucionConstantesFunciones.mostraridclienteDatoConstitucion);
		//this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxidvalorclientecompaniaDatoConstitucion.setVisible(this.datoconstitucionConstantesFunciones.mostraridvalorclientecompaniaDatoConstitucion);
		this.jInternalFrameDetalleFormDatoConstitucion.jPanelidvalorclientecompaniaDatoConstitucion.setVisible(this.datoconstitucionConstantesFunciones.mostraridvalorclientecompaniaDatoConstitucion);
		//this.jInternalFrameDetalleFormDatoConstitucion.jTextAreadireccionDatoConstitucion.setVisible(this.datoconstitucionConstantesFunciones.mostrardireccionDatoConstitucion);
		this.jInternalFrameDetalleFormDatoConstitucion.jPaneldireccionDatoConstitucion.setVisible(this.datoconstitucionConstantesFunciones.mostrardireccionDatoConstitucion);
		//this.jInternalFrameDetalleFormDatoConstitucion.jDateChooserfechaconstitucionDatoConstitucion.setVisible(this.datoconstitucionConstantesFunciones.mostrarfechaconstitucionDatoConstitucion);
		this.jInternalFrameDetalleFormDatoConstitucion.jPanelfechaconstitucionDatoConstitucion.setVisible(this.datoconstitucionConstantesFunciones.mostrarfechaconstitucionDatoConstitucion);
		//this.jInternalFrameDetalleFormDatoConstitucion.jTextFieldcapitalsuscritoDatoConstitucion.setVisible(this.datoconstitucionConstantesFunciones.mostrarcapitalsuscritoDatoConstitucion);
		this.jInternalFrameDetalleFormDatoConstitucion.jPanelcapitalsuscritoDatoConstitucion.setVisible(this.datoconstitucionConstantesFunciones.mostrarcapitalsuscritoDatoConstitucion);
		//this.jInternalFrameDetalleFormDatoConstitucion.jTextFieldplazofiniquitoDatoConstitucion.setVisible(this.datoconstitucionConstantesFunciones.mostrarplazofiniquitoDatoConstitucion);
		this.jInternalFrameDetalleFormDatoConstitucion.jPanelplazofiniquitoDatoConstitucion.setVisible(this.datoconstitucionConstantesFunciones.mostrarplazofiniquitoDatoConstitucion);
		//this.jInternalFrameDetalleFormDatoConstitucion.jTextFieldreservalegalDatoConstitucion.setVisible(this.datoconstitucionConstantesFunciones.mostrarreservalegalDatoConstitucion);
		this.jInternalFrameDetalleFormDatoConstitucion.jPanelreservalegalDatoConstitucion.setVisible(this.datoconstitucionConstantesFunciones.mostrarreservalegalDatoConstitucion);
		//this.jInternalFrameDetalleFormDatoConstitucion.jDateChooserfechaestatutoDatoConstitucion.setVisible(this.datoconstitucionConstantesFunciones.mostrarfechaestatutoDatoConstitucion);
		this.jInternalFrameDetalleFormDatoConstitucion.jPanelfechaestatutoDatoConstitucion.setVisible(this.datoconstitucionConstantesFunciones.mostrarfechaestatutoDatoConstitucion);
		//this.jInternalFrameDetalleFormDatoConstitucion.jCheckBoxesactivoDatoConstitucion.setVisible(this.datoconstitucionConstantesFunciones.mostraresactivoDatoConstitucion);
		this.jInternalFrameDetalleFormDatoConstitucion.jPanelesactivoDatoConstitucion.setVisible(this.datoconstitucionConstantesFunciones.mostraresactivoDatoConstitucion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDatoConstitucion() throws Exception {
		if(this.jInternalFrameDetalleFormDatoConstitucion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDatoConstitucion!=null) {
	
		this.jInternalFrameDetalleFormDatoConstitucion.jLabelidDatoConstitucion.setEnabled(this.datoconstitucionConstantesFunciones.activaridDatoConstitucion);
		this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxidclienteDatoConstitucion.setEnabled(this.datoconstitucionConstantesFunciones.activaridclienteDatoConstitucion);
			this.jInternalFrameDetalleFormDatoConstitucion.jButtonidclienteDatoConstitucion.setEnabled(this.datoconstitucionConstantesFunciones.activaridclienteDatoConstitucion);
		this.jInternalFrameDetalleFormDatoConstitucion.jComboBoxidvalorclientecompaniaDatoConstitucion.setEnabled(this.datoconstitucionConstantesFunciones.activaridvalorclientecompaniaDatoConstitucion);
		this.jInternalFrameDetalleFormDatoConstitucion.jTextAreadireccionDatoConstitucion.setEnabled(this.datoconstitucionConstantesFunciones.activardireccionDatoConstitucion);
		this.jInternalFrameDetalleFormDatoConstitucion.jDateChooserfechaconstitucionDatoConstitucion.setEnabled(this.datoconstitucionConstantesFunciones.activarfechaconstitucionDatoConstitucion);
		this.jInternalFrameDetalleFormDatoConstitucion.jTextFieldcapitalsuscritoDatoConstitucion.setEnabled(this.datoconstitucionConstantesFunciones.activarcapitalsuscritoDatoConstitucion);
		this.jInternalFrameDetalleFormDatoConstitucion.jTextFieldplazofiniquitoDatoConstitucion.setEnabled(this.datoconstitucionConstantesFunciones.activarplazofiniquitoDatoConstitucion);
		this.jInternalFrameDetalleFormDatoConstitucion.jTextFieldreservalegalDatoConstitucion.setEnabled(this.datoconstitucionConstantesFunciones.activarreservalegalDatoConstitucion);
		this.jInternalFrameDetalleFormDatoConstitucion.jDateChooserfechaestatutoDatoConstitucion.setEnabled(this.datoconstitucionConstantesFunciones.activarfechaestatutoDatoConstitucion);
		this.jInternalFrameDetalleFormDatoConstitucion.jCheckBoxesactivoDatoConstitucion.setEnabled(this.datoconstitucionConstantesFunciones.activaresactivoDatoConstitucion);
		}
	}
	
		
}