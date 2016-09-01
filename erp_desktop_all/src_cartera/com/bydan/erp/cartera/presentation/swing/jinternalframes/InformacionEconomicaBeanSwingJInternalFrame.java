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

import com.bydan.erp.cartera.util.InformacionEconomicaConstantesFunciones;
import com.bydan.erp.cartera.util.InformacionEconomicaParameterReturnGeneral;
//import com.bydan.erp.cartera.util.InformacionEconomicaParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.InformacionEconomicaBean;
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
public class InformacionEconomicaBeanSwingJInternalFrame extends InformacionEconomicaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(InformacionEconomicaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<InformacionEconomica> informacioneconomicaValidator = new ClassValidator<InformacionEconomica>(InformacionEconomica.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public InformacionEconomica informacioneconomica;	
	public InformacionEconomica informacioneconomicaAux;
	public InformacionEconomica informacioneconomicaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public InformacionEconomica informacioneconomicaTotales;
	public Long idInformacionEconomicaActual;
	public Long iIdNuevoInformacionEconomica=0L;
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

	public String sFinalQueryComboTipoVinculacion="";

	public List<TipoVinculacion> tipovinculacionsForeignKey;

	public List<TipoVinculacion> gettipovinculacionsForeignKey() {
		return tipovinculacionsForeignKey;
	}

	public void settipovinculacionsForeignKey(List<TipoVinculacion> tipovinculacionsForeignKey) {
		this.tipovinculacionsForeignKey = tipovinculacionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoVinculacion tipovinculacionForeignKey;

	public TipoVinculacion gettipovinculacionForeignKey() {
		return tipovinculacionForeignKey;
	}

	public void settipovinculacionForeignKey(TipoVinculacion tipovinculacionForeignKey) {
		this.tipovinculacionForeignKey = tipovinculacionForeignKey;
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
	
	public Boolean isPermisoTodoInformacionEconomica;
	public Boolean isPermisoNuevoInformacionEconomica;
	public Boolean isPermisoActualizarInformacionEconomica;
	public Boolean isPermisoActualizarOriginalInformacionEconomica;
	public Boolean isPermisoEliminarInformacionEconomica;
	public Boolean isPermisoGuardarCambiosInformacionEconomica;
	public Boolean isPermisoConsultaInformacionEconomica;
	public Boolean isPermisoBusquedaInformacionEconomica;
	public Boolean isPermisoReporteInformacionEconomica;
	public Boolean isPermisoPaginacionMedioInformacionEconomica;
	public Boolean isPermisoPaginacionAltoInformacionEconomica;
	public Boolean isPermisoPaginacionTodoInformacionEconomica;
	public Boolean isPermisoCopiarInformacionEconomica;
	public Boolean isPermisoVerFormInformacionEconomica;
	public Boolean isPermisoDuplicarInformacionEconomica;
	public Boolean isPermisoOrdenInformacionEconomica;
	
	
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
	
	public InformacionEconomicaParameterReturnGeneral informacioneconomicaReturnGeneral;
	public InformacionEconomicaParameterReturnGeneral informacioneconomicaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoInformacionEconomica=false;
	public Boolean esParaAccionDesdeFormularioInformacionEconomica=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected InformacionEconomicaSessionBeanAdditional informacioneconomicaSessionBeanAdditional=null;
	
	public InformacionEconomicaSessionBeanAdditional getInformacionEconomicaSessionBeanAdditional() {
		return this.informacioneconomicaSessionBeanAdditional;
	}
	
	public void setInformacionEconomicaSessionBeanAdditional(InformacionEconomicaSessionBeanAdditional informacioneconomicaSessionBeanAdditional) {
		try {
			this.informacioneconomicaSessionBeanAdditional=informacioneconomicaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected InformacionEconomicaBeanSwingJInternalFrameAdditional informacioneconomicaBeanSwingJInternalFrameAdditional=null;
	//public class InformacionEconomicaBeanSwingJInternalFrame
	
	public InformacionEconomicaBeanSwingJInternalFrameAdditional getInformacionEconomicaBeanSwingJInternalFrameAdditional() {
		return this.informacioneconomicaBeanSwingJInternalFrameAdditional;
	}
	
	public void setInformacionEconomicaBeanSwingJInternalFrameAdditional(InformacionEconomicaBeanSwingJInternalFrameAdditional informacioneconomicaBeanSwingJInternalFrameAdditional) {
		try {
			this.informacioneconomicaBeanSwingJInternalFrameAdditional=informacioneconomicaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public InformacionEconomicaLogic informacioneconomicaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public InformacionEconomica informacioneconomicaBean;
	public InformacionEconomicaConstantesFunciones informacioneconomicaConstantesFunciones;
	//public InformacionEconomicaParameterReturnGeneral informacioneconomicaReturnGeneral;
	
	//FK
	
	public ClienteLogic clienteLogic;
	public TipoVinculacionLogic tipovinculacionLogic;
	
	//PARAMETROS
	
	
	//public List<InformacionEconomica> informacioneconomicas;	
	//public List<InformacionEconomica> informacioneconomicasEliminados;
	//public List<InformacionEconomica> informacioneconomicasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoInformacionEconomica=false;
	public Boolean isVisibilidadCeldaDuplicarInformacionEconomica=true;
	public Boolean isVisibilidadCeldaCopiarInformacionEconomica=true;
	public Boolean isVisibilidadCeldaVerFormInformacionEconomica=true;
	public Boolean isVisibilidadCeldaOrdenInformacionEconomica=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesInformacionEconomica=false;
	public Boolean isVisibilidadCeldaModificarInformacionEconomica=false;
	public Boolean isVisibilidadCeldaActualizarInformacionEconomica=false;
	public Boolean isVisibilidadCeldaEliminarInformacionEconomica=false;
	public Boolean isVisibilidadCeldaCancelarInformacionEconomica=false;
	public Boolean isVisibilidadCeldaGuardarInformacionEconomica=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosInformacionEconomica=false;	
	
	
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdValorClienteVinculacion=false;
	
	public Long getiIdNuevoInformacionEconomica() {
		return this.iIdNuevoInformacionEconomica;
	}

	public void setiIdNuevoInformacionEconomica(Long iIdNuevoInformacionEconomica) {
		this.iIdNuevoInformacionEconomica = iIdNuevoInformacionEconomica;
	}
	
	public Long getidInformacionEconomicaActual() {
		return this.idInformacionEconomicaActual;
	}

	public void setidInformacionEconomicaActual(Long idInformacionEconomicaActual) {
		this.idInformacionEconomicaActual = idInformacionEconomicaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public InformacionEconomica getinformacioneconomica() {
		return this.informacioneconomica;
	}

	public void setinformacioneconomica(InformacionEconomica informacioneconomica) {
		this.informacioneconomica = informacioneconomica;
	}
	
	public InformacionEconomica getinformacioneconomicaAux() {
		return this.informacioneconomicaAux;
	}

	public void setinformacioneconomicaAux(InformacionEconomica informacioneconomicaAux) {
		this.informacioneconomicaAux = informacioneconomicaAux;
	}				
	
	public InformacionEconomica getinformacioneconomicaAnterior() {
		return this.informacioneconomicaAnterior;
	}

	public void setinformacioneconomicaAnterior(InformacionEconomica informacioneconomicaAnterior) {
		this.informacioneconomicaAnterior = informacioneconomicaAnterior;
	}	
	
	public InformacionEconomica getinformacioneconomicaTotales() {
		return this.informacioneconomicaTotales;
	}

	public void setinformacioneconomicaTotales(InformacionEconomica informacioneconomicaTotales) {
		this.informacioneconomicaTotales = informacioneconomicaTotales;
	}	
	
	public InformacionEconomica getinformacioneconomicaBean() {
		return this.informacioneconomicaBean;
	}

	public void setinformacioneconomicaBean(InformacionEconomica informacioneconomicaBean) {
		this.informacioneconomicaBean = informacioneconomicaBean;
	}	
	
	public InformacionEconomicaParameterReturnGeneral getinformacioneconomicaReturnGeneral() {
		return this.informacioneconomicaReturnGeneral;
	}

	public void setinformacioneconomicaReturnGeneral(InformacionEconomicaParameterReturnGeneral informacioneconomicaReturnGeneral) {
		this.informacioneconomicaReturnGeneral = informacioneconomicaReturnGeneral;
	}	
	
	
	public Long idclienteFK_IdCliente=-1L;

	public Long getidclienteFK_IdCliente() {
		return this.idclienteFK_IdCliente;
	}

	public void setidclienteFK_IdCliente(Long idclienteFK_IdCliente) {
		this.idclienteFK_IdCliente = idclienteFK_IdCliente;
	}

	public Long idvalorclientevinculacionFK_IdValorClienteVinculacion=-1L;

	public Long getidvalorclientevinculacionFK_IdValorClienteVinculacion() {
		return this.idvalorclientevinculacionFK_IdValorClienteVinculacion;
	}

	public void setidvalorclientevinculacionFK_IdValorClienteVinculacion(Long idvalorclientevinculacionFK_IdValorClienteVinculacion) {
		this.idvalorclientevinculacionFK_IdValorClienteVinculacion = idvalorclientevinculacionFK_IdValorClienteVinculacion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public InformacionEconomicaLogic getInformacionEconomicaLogic()	{		
		return informacioneconomicaLogic;
	}

	public void setInformacionEconomicaLogic(InformacionEconomicaLogic informacioneconomicaLogic) {
		this.informacioneconomicaLogic = informacioneconomicaLogic;
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
	
	public Boolean getIsEsNuevoInformacionEconomica() {
		return isEsNuevoInformacionEconomica;
	}

	public void setIsEsNuevoInformacionEconomica(Boolean isEsNuevoInformacionEconomica) {
		this.isEsNuevoInformacionEconomica = isEsNuevoInformacionEconomica;
	}

	public Boolean getEsParaAccionDesdeFormularioInformacionEconomica() {
		return esParaAccionDesdeFormularioInformacionEconomica;
	}
	
	public void setEsParaAccionDesdeFormularioInformacionEconomica(Boolean esParaAccionDesdeFormularioInformacionEconomica) {
		this.esParaAccionDesdeFormularioInformacionEconomica = esParaAccionDesdeFormularioInformacionEconomica;
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

			if(this.informacioneconomicaSessionBean==null) {
				this.informacioneconomicaSessionBean=new InformacionEconomicaSessionBean();
			}

			if(!this.informacioneconomicaSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(informacioneconomicaSessionBean.getlidClienteActual());
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

	public void cargarCombosTipoVinculacionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipovinculacionsForeignKey=new ArrayList<TipoVinculacion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoVinculacionLogic tipovinculacionLogic=new TipoVinculacionLogic();

			tipovinculacionLogic.getTipoVinculacionDataAccess().setIsForForeingKeyData(true);

			if(this.informacioneconomicaSessionBean==null) {
				this.informacioneconomicaSessionBean=new InformacionEconomicaSessionBean();
			}

			if(!this.informacioneconomicaSessionBean.getisBusquedaDesdeForeignKeySesionTipoVinculacion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipovinculacionLogic.getTipoVinculacionDataAccess().setIsForForeingKeyData(true);

					tipovinculacionLogic.getTodosTipoVinculacionsWithConnection(sFinalQuery,new Pagination());

					this.tipovinculacionsForeignKey=tipovinculacionLogic.getTipoVinculacions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoVinculacion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipovinculacionLogic.getEntityWithConnection(informacioneconomicaSessionBean.getlidTipoVinculacionActual());
					this.tipovinculacionsForeignKey.add(tipovinculacionLogic.getTipoVinculacion());
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

					if(this.informacioneconomica!=null) {
						this.informacioneconomica.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormInformacionEconomica!=null) {
						this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxidclienteInformacionEconomica.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxidclienteInformacionEconomica.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormInformacionEconomica!=null) {
						if(this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxidclienteInformacionEconomica.getItemCount()>0) {
							this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxidclienteInformacionEconomica.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxidclienteFK_IdClienteInformacionEconomica!=null) {
						jComboBoxidclienteFK_IdClienteInformacionEconomica.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxidclienteFK_IdClienteInformacionEconomica!=null) {
							//jComboBoxidclienteFK_IdClienteInformacionEconomica.setSelectedItem(clienteTemp);
							if(jComboBoxidclienteFK_IdClienteInformacionEconomica.getItemCount()>0) {
								jComboBoxidclienteFK_IdClienteInformacionEconomica.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxidclienteInformacionEconomicaGenerico)throws Exception
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
				jComboBoxidclienteInformacionEconomicaGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxidclienteInformacionEconomicaGenerico!=null && jComboBoxidclienteInformacionEconomicaGenerico.getItemCount()>0) {
					jComboBoxidclienteInformacionEconomicaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoVinculacionForeignKey(Long idTipoVinculacionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoVinculacion  tipovinculacionTemp=null;

			for(TipoVinculacion tipovinculacionAux:tipovinculacionsForeignKey) {
				if(tipovinculacionAux.getId()!=null && tipovinculacionAux.getId().equals(idTipoVinculacionSeleccionado)) {
					tipovinculacionTemp=tipovinculacionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipovinculacionTemp!=null) {

					if(this.informacioneconomica!=null) {
						this.informacioneconomica.setTipoVinculacion(tipovinculacionTemp);
					}

					if(this.jInternalFrameDetalleFormInformacionEconomica!=null) {
						this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxidvalorclientevinculacionInformacionEconomica.setSelectedItem(tipovinculacionTemp);
					}
				} else {
					//jComboBoxidvalorclientevinculacionInformacionEconomica.setSelectedItem(tipovinculacionTemp);
					if(this.jInternalFrameDetalleFormInformacionEconomica!=null) {
						if(this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxidvalorclientevinculacionInformacionEconomica.getItemCount()>0) {
							this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxidvalorclientevinculacionInformacionEconomica.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdValorClienteVinculacion") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipovinculacionTemp!=null && jComboBoxidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomica!=null) {
						jComboBoxidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomica.setSelectedItem(tipovinculacionTemp);
					} else {
						if(jComboBoxidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomica!=null) {
							//jComboBoxidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomica.setSelectedItem(tipovinculacionTemp);
							if(jComboBoxidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomica.getItemCount()>0) {
								jComboBoxidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomica.setSelectedIndex(0);
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

	public String getActualTipoVinculacionForeignKeyDescripcion(Long idTipoVinculacionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoVinculacion  tipovinculacionTemp=null;

			for(TipoVinculacion tipovinculacionAux:tipovinculacionsForeignKey) {
				if(tipovinculacionAux.getId()!=null && tipovinculacionAux.getId().equals(idTipoVinculacionSeleccionado)) {
					tipovinculacionTemp=tipovinculacionAux;
					break;
				}
			}


			sDescripcion=TipoVinculacionConstantesFunciones.getTipoVinculacionDescripcion(tipovinculacionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoVinculacionForeignKeyGenerico(Long idTipoVinculacionSeleccionado,JComboBox jComboBoxidvalorclientevinculacionInformacionEconomicaGenerico)throws Exception
	{
		try
		{
			TipoVinculacion  tipovinculacionTemp=null;

			for(TipoVinculacion tipovinculacionAux:tipovinculacionsForeignKey) {
				if(tipovinculacionAux.getId()!=null && tipovinculacionAux.getId().equals(idTipoVinculacionSeleccionado)) {
					tipovinculacionTemp=tipovinculacionAux;
					break;
				}
			}

			if(tipovinculacionTemp!=null) {
				jComboBoxidvalorclientevinculacionInformacionEconomicaGenerico.setSelectedItem(tipovinculacionTemp);
			} else {
				if(jComboBoxidvalorclientevinculacionInformacionEconomicaGenerico!=null && jComboBoxidvalorclientevinculacionInformacionEconomicaGenerico.getItemCount()>0) {
					jComboBoxidvalorclientevinculacionInformacionEconomicaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(InformacionEconomica informacioneconomica,JComboBox jComboBoxidclienteInformacionEconomicaGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxidclienteInformacionEconomicaGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxidclienteInformacionEconomica.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxidclienteInformacionEconomicaGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				informacioneconomica.setidcliente(clienteAux.getId());
				informacioneconomica.setcliente_descripcion(InformacionEconomicaConstantesFunciones.getClienteDescripcion(clienteAux));
				informacioneconomica.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoVinculacionForeignKey(InformacionEconomica informacioneconomica,JComboBox jComboBoxidvalorclientevinculacionInformacionEconomicaGenerico)throws Exception
	{
		try
		{
			TipoVinculacion  tipovinculacionAux=new TipoVinculacion();

			if(jComboBoxidvalorclientevinculacionInformacionEconomicaGenerico==null) {
				tipovinculacionAux=(TipoVinculacion)this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxidvalorclientevinculacionInformacionEconomica.getSelectedItem();
			} else {
				tipovinculacionAux=(TipoVinculacion)jComboBoxidvalorclientevinculacionInformacionEconomicaGenerico.getSelectedItem();
			}

			if(tipovinculacionAux!=null && tipovinculacionAux.getId()!=null) {
				informacioneconomica.setidvalorclientevinculacion(tipovinculacionAux.getId());
				informacioneconomica.settipovinculacion_descripcion(InformacionEconomicaConstantesFunciones.getTipoVinculacionDescripcion(tipovinculacionAux));
				informacioneconomica.setTipoVinculacion(tipovinculacionAux);			}
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

					if(!InformacionEconomicaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormInformacionEconomica!=null) { 
							this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxidclienteInformacionEconomica.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxidclienteInformacionEconomica.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormInformacionEconomica!=null) { 
					}

					if(!InformacionEconomicaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!InformacionEconomicaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxidclienteFK_IdClienteInformacionEconomica.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxidclienteFK_IdClienteInformacionEconomica.addItem(cliente);
							}
						}

						if(!InformacionEconomicaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoVinculacionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoVinculacion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!InformacionEconomicaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormInformacionEconomica!=null) { 
							this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxidvalorclientevinculacionInformacionEconomica.removeAllItems();

							for(TipoVinculacion tipovinculacion:this.tipovinculacionsForeignKey) {
								this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxidvalorclientevinculacionInformacionEconomica.addItem(tipovinculacion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormInformacionEconomica!=null) { 
					}

					if(!InformacionEconomicaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdValorClienteVinculacion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!InformacionEconomicaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomica.removeAllItems();

							for(TipoVinculacion tipovinculacion:this.tipovinculacionsForeignKey) {
								this.jComboBoxidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomica.addItem(tipovinculacion);
							}
						}

						if(!InformacionEconomicaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormInformacionEconomica!=null) {
							this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxidclienteInformacionEconomica.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormInformacionEconomica!=null) {
							this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxidclienteInformacionEconomica.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxidclienteFK_IdClienteInformacionEconomica.setSelectedItem(cliente);
						} else {
							this.jComboBoxidclienteFK_IdClienteInformacionEconomica.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoVinculacionForeignKey(TipoVinculacion tipovinculacion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormInformacionEconomica!=null) {
							this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxidvalorclientevinculacionInformacionEconomica.setSelectedItem(tipovinculacion);
						}
					} else {
						if(this.jInternalFrameDetalleFormInformacionEconomica!=null) {
							this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxidvalorclientevinculacionInformacionEconomica.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomica.setSelectedItem(tipovinculacion);
						} else {
							this.jComboBoxidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomica.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesInformacionEconomica() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			InformacionEconomicaConstantesFunciones.refrescarForeignKeysDescripcionesInformacionEconomica(this.informacioneconomicaLogic.getInformacionEconomicas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			InformacionEconomicaConstantesFunciones.refrescarForeignKeysDescripcionesInformacionEconomica(this.informacioneconomicas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(TipoVinculacion.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//informacioneconomicaLogic.setInformacionEconomicas(this.informacioneconomicas);
			informacioneconomicaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public InformacionEconomicaParameterReturnGeneral getInformacionEconomicaParameterGeneral() {
		return this.informacioneconomicaParameterGeneral;
	}
	
	public void setInformacionEconomicaParameterGeneral(InformacionEconomicaParameterReturnGeneral informacioneconomicaParameterGeneral) {
		this.informacioneconomicaParameterGeneral = informacioneconomicaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoInformacionEconomica() {
		return isPermisoTodoInformacionEconomica;
	}

	public void setIsPermisoTodoInformacionEconomica(Boolean isPermisoTodoInformacionEconomica) {
		this.isPermisoTodoInformacionEconomica = isPermisoTodoInformacionEconomica;
	}

	public Boolean getIsPermisoNuevoInformacionEconomica() {
		return isPermisoNuevoInformacionEconomica;
	}

	public void setIsPermisoNuevoInformacionEconomica(Boolean isPermisoNuevoInformacionEconomica) {
		this.isPermisoNuevoInformacionEconomica = isPermisoNuevoInformacionEconomica;
	}

	public Boolean getIsPermisoActualizarInformacionEconomica() {
		return isPermisoActualizarInformacionEconomica;
	}

	public void setIsPermisoActualizarInformacionEconomica(Boolean isPermisoActualizarInformacionEconomica) {
		this.isPermisoActualizarInformacionEconomica = isPermisoActualizarInformacionEconomica;
	}

	public Boolean getIsPermisoEliminarInformacionEconomica() {
		return isPermisoEliminarInformacionEconomica;
	}

	public void setIsPermisoEliminarInformacionEconomica(Boolean isPermisoEliminarInformacionEconomica) {
		this.isPermisoEliminarInformacionEconomica = isPermisoEliminarInformacionEconomica;
	}

	public Boolean getIsPermisoGuardarCambiosInformacionEconomica() {
		return isPermisoGuardarCambiosInformacionEconomica;
	}

	public void setIsPermisoGuardarCambiosInformacionEconomica(Boolean isPermisoGuardarCambiosInformacionEconomica) {
		this.isPermisoGuardarCambiosInformacionEconomica = isPermisoGuardarCambiosInformacionEconomica;
	}
	
	public Boolean getIsPermisoConsultaInformacionEconomica() {
		return isPermisoConsultaInformacionEconomica;
	}

	public void setIsPermisoConsultaInformacionEconomica(Boolean isPermisoConsultaInformacionEconomica) {
		this.isPermisoConsultaInformacionEconomica = isPermisoConsultaInformacionEconomica;
	}

	public Boolean getIsPermisoBusquedaInformacionEconomica() {
		return isPermisoBusquedaInformacionEconomica;
	}

	public void setIsPermisoBusquedaInformacionEconomica(Boolean isPermisoBusquedaInformacionEconomica) {
		this.isPermisoBusquedaInformacionEconomica = isPermisoBusquedaInformacionEconomica;
	}

	public Boolean getIsPermisoReporteInformacionEconomica() {
		return isPermisoReporteInformacionEconomica;
	}

	public void setIsPermisoReporteInformacionEconomica(Boolean isPermisoReporteInformacionEconomica) {
		this.isPermisoReporteInformacionEconomica = isPermisoReporteInformacionEconomica;
	}
	
	public Boolean getIsPermisoPaginacionMedioInformacionEconomica() {
		return isPermisoPaginacionMedioInformacionEconomica;
	}

	public void setIsPermisoPaginacionMedioInformacionEconomica(Boolean isPermisoPaginacionMedioInformacionEconomica) {
		this.isPermisoPaginacionMedioInformacionEconomica = isPermisoPaginacionMedioInformacionEconomica;
	}
	
	public Boolean getIsPermisoPaginacionTodoInformacionEconomica() {
		return isPermisoPaginacionTodoInformacionEconomica;
	}

	public void setIsPermisoPaginacionTodoInformacionEconomica(Boolean isPermisoPaginacionTodoInformacionEconomica) {
		this.isPermisoPaginacionTodoInformacionEconomica = isPermisoPaginacionTodoInformacionEconomica;
	}
	
	public Boolean getIsPermisoPaginacionAltoInformacionEconomica() {
		return isPermisoPaginacionAltoInformacionEconomica;
	}

	public void setIsPermisoPaginacionAltoInformacionEconomica(Boolean isPermisoPaginacionAltoInformacionEconomica) {
		this.isPermisoPaginacionAltoInformacionEconomica = isPermisoPaginacionAltoInformacionEconomica;
	}
	
	public Boolean getIsPermisoCopiarInformacionEconomica() {
		return isPermisoCopiarInformacionEconomica;
	}

	public void setIsPermisoCopiarInformacionEconomica(Boolean isPermisoCopiarInformacionEconomica) {
		this.isPermisoCopiarInformacionEconomica = isPermisoCopiarInformacionEconomica;
	}
	
	public Boolean getIsPermisoVerFormInformacionEconomica() {
		return isPermisoVerFormInformacionEconomica;
	}

	public void setIsPermisoVerFormInformacionEconomica(Boolean isPermisoVerFormInformacionEconomica) {
		this.isPermisoVerFormInformacionEconomica = isPermisoVerFormInformacionEconomica;
	}
	
	public Boolean getIsPermisoDuplicarInformacionEconomica() {
		return isPermisoDuplicarInformacionEconomica;
	}

	public void setIsPermisoDuplicarInformacionEconomica(Boolean isPermisoDuplicarInformacionEconomica) {
		this.isPermisoDuplicarInformacionEconomica = isPermisoDuplicarInformacionEconomica;
	}
	
	public Boolean getIsPermisoOrdenInformacionEconomica() {
		return isPermisoOrdenInformacionEconomica;
	}

	public void setIsPermisoOrdenInformacionEconomica(Boolean isPermisoOrdenInformacionEconomica) {
		this.isPermisoOrdenInformacionEconomica = isPermisoOrdenInformacionEconomica;
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
	
	public Boolean getIsVisibilidadCeldaNuevoInformacionEconomica() {
		return isVisibilidadCeldaNuevoInformacionEconomica;
	}

	public void setIsVisibilidadCeldaNuevoInformacionEconomica(Boolean isVisibilidadCeldaNuevoInformacionEconomica) {
		this.isVisibilidadCeldaNuevoInformacionEconomica = isVisibilidadCeldaNuevoInformacionEconomica;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarInformacionEconomica() {
		return isVisibilidadCeldaDuplicarInformacionEconomica;
	}

	public void setIsVisibilidadCeldaDuplicarInformacionEconomica(Boolean isVisibilidadCeldaDuplicarInformacionEconomica) {
		this.isVisibilidadCeldaDuplicarInformacionEconomica = isVisibilidadCeldaDuplicarInformacionEconomica;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarInformacionEconomica() {
		return isVisibilidadCeldaCopiarInformacionEconomica;
	}

	public void setIsVisibilidadCeldaCopiarInformacionEconomica(Boolean isVisibilidadCeldaCopiarInformacionEconomica) {
		this.isVisibilidadCeldaCopiarInformacionEconomica = isVisibilidadCeldaCopiarInformacionEconomica;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormInformacionEconomica() {
		return isVisibilidadCeldaVerFormInformacionEconomica;
	}

	public void setIsVisibilidadCeldaVerFormInformacionEconomica(Boolean isVisibilidadCeldaVerFormInformacionEconomica) {
		this.isVisibilidadCeldaVerFormInformacionEconomica = isVisibilidadCeldaVerFormInformacionEconomica;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenInformacionEconomica() {
		return isVisibilidadCeldaOrdenInformacionEconomica;
	}

	public void setIsVisibilidadCeldaOrdenInformacionEconomica(Boolean isVisibilidadCeldaOrdenInformacionEconomica) {
		this.isVisibilidadCeldaOrdenInformacionEconomica = isVisibilidadCeldaOrdenInformacionEconomica;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesInformacionEconomica() {
		return isVisibilidadCeldaNuevoRelacionesInformacionEconomica;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesInformacionEconomica(Boolean isVisibilidadCeldaNuevoRelacionesInformacionEconomica) {
		this.isVisibilidadCeldaNuevoRelacionesInformacionEconomica = isVisibilidadCeldaNuevoRelacionesInformacionEconomica;
	}
	
	public Boolean getIsVisibilidadCeldaModificarInformacionEconomica() {
		return isVisibilidadCeldaModificarInformacionEconomica;
	}

	public void setIsVisibilidadCeldaModificarInformacionEconomica(Boolean isVisibilidadCeldaModificarInformacionEconomica) {
		this.isVisibilidadCeldaModificarInformacionEconomica = isVisibilidadCeldaModificarInformacionEconomica;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarInformacionEconomica() {
		return isVisibilidadCeldaActualizarInformacionEconomica;
	}

	public void setIsVisibilidadCeldaActualizarInformacionEconomica(Boolean isVisibilidadCeldaActualizarInformacionEconomica) {
		this.isVisibilidadCeldaActualizarInformacionEconomica = isVisibilidadCeldaActualizarInformacionEconomica;
	}

	public Boolean getIsVisibilidadCeldaEliminarInformacionEconomica() {
		return isVisibilidadCeldaEliminarInformacionEconomica;
	}

	public void setIsVisibilidadCeldaEliminarInformacionEconomica(Boolean isVisibilidadCeldaEliminarInformacionEconomica) {
		this.isVisibilidadCeldaEliminarInformacionEconomica = isVisibilidadCeldaEliminarInformacionEconomica;
	}

	public Boolean getIsVisibilidadCeldaCancelarInformacionEconomica() {
		return isVisibilidadCeldaCancelarInformacionEconomica;
	}

	public void setIsVisibilidadCeldaCancelarInformacionEconomica(Boolean isVisibilidadCeldaCancelarInformacionEconomica) {
		this.isVisibilidadCeldaCancelarInformacionEconomica = isVisibilidadCeldaCancelarInformacionEconomica;
	}

	public Boolean getIsVisibilidadCeldaGuardarInformacionEconomica() {
		return isVisibilidadCeldaGuardarInformacionEconomica;
	}

	public void setIsVisibilidadCeldaGuardarInformacionEconomica(Boolean isVisibilidadCeldaGuardarInformacionEconomica) {
		this.isVisibilidadCeldaGuardarInformacionEconomica = isVisibilidadCeldaGuardarInformacionEconomica;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosInformacionEconomica() {
		return isVisibilidadCeldaGuardarCambiosInformacionEconomica;
	}

	public void setIsVisibilidadCeldaGuardarCambiosInformacionEconomica(Boolean isVisibilidadCeldaGuardarCambiosInformacionEconomica) {
		this.isVisibilidadCeldaGuardarCambiosInformacionEconomica = isVisibilidadCeldaGuardarCambiosInformacionEconomica;
	}
		
	public InformacionEconomicaSessionBean getinformacioneconomicaSessionBean() {
		return this.informacioneconomicaSessionBean;
	}
	
	public void setinformacioneconomicaSessionBean(InformacionEconomicaSessionBean informacioneconomicaSessionBean) {
		this.informacioneconomicaSessionBean=informacioneconomicaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
	}

	public Boolean getisVisibilidadFK_IdValorClienteVinculacion() {
		return this.isVisibilidadFK_IdValorClienteVinculacion;
	}

	public void setisVisibilidadFK_IdValorClienteVinculacion(Boolean isVisibilidadFK_IdValorClienteVinculacion) {
		this.isVisibilidadFK_IdValorClienteVinculacion=isVisibilidadFK_IdValorClienteVinculacion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysInformacionEconomica(InformacionEconomica informacioneconomica)throws Exception {
		try {
			
				this.setActualParaGuardarClienteForeignKey(informacioneconomica,null);
				this.setActualParaGuardarTipoVinculacionForeignKey(informacioneconomica,null);
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
	
	public void bugActualizarReferenciaActual(InformacionEconomica informacioneconomica,InformacionEconomica informacioneconomicaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalInformacionEconomica(informacioneconomica);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		informacioneconomicaAux.setId(informacioneconomica.getId());
		informacioneconomicaAux.setVersionRow(informacioneconomica.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessInformacionEconomica();
		
			int intSelectedRow = this.jTableDatosInformacionEconomica.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomica =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.informacioneconomica =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(InformacionEconomicaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualInformacionEconomica(this.informacioneconomica,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysInformacionEconomica(this.informacioneconomica);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = informacioneconomicaValidator.getInvalidValues(this.informacioneconomica);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			informacioneconomicaLogic.setDatosCliente(datosCliente);
			informacioneconomicaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				informacioneconomicaAux=new  InformacionEconomica();
				
				informacioneconomicaAux.setIsNew(true);
				informacioneconomicaAux.setIsChanged(true);
				
				informacioneconomicaAux.setInformacionEconomicaOriginal(this.informacioneconomica);
				
				informacioneconomicaAux.setId(this.informacioneconomica.getId());	
				informacioneconomicaAux.setVersionRow(this.informacioneconomica.getVersionRow());	
				informacioneconomicaAux.setidcliente(this.informacioneconomica.getidcliente());	
				informacioneconomicaAux.setidvalorclientevinculacion(this.informacioneconomica.getidvalorclientevinculacion());	
				informacioneconomicaAux.setcodigoactualizacion(this.informacioneconomica.getcodigoactualizacion());	
				informacioneconomicaAux.setcodigodestinofinanciero(this.informacioneconomica.getcodigodestinofinanciero());	
				informacioneconomicaAux.setorigenrecursos(this.informacioneconomica.getorigenrecursos());	
				informacioneconomicaAux.setcuasavinculacion(this.informacioneconomica.getcuasavinculacion());	
				informacioneconomicaAux.setsectorizacion(this.informacioneconomica.getsectorizacion());	
				informacioneconomicaAux.setesactivo(this.informacioneconomica.getesactivo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.informacioneconomicaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.informacioneconomicaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(informacioneconomicaAux,informacioneconomicaLogic.getInformacionEconomicas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(informacioneconomicaAux,informacioneconomicas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.informacioneconomicaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.informacioneconomicaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						informacioneconomicaLogic.saveInformacionEconomicas();//WithConnection
						//informacioneconomicaLogic.getSetVersionRowInformacionEconomicas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.informacioneconomica,informacioneconomicaAux);
					
					this.refrescarForeignKeysDescripcionesInformacionEconomica();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.informacioneconomicaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								informacioneconomicaLogic.saveInformacionEconomicaRelaciones(informacioneconomicaAux);//WithConnection
								//informacioneconomicaLogic.getSetVersionRowInformacionEconomicas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.informacioneconomica,informacioneconomicaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.informacioneconomicaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.informacioneconomicaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(informacioneconomicaAux,informacioneconomicaLogic.getInformacionEconomicas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(informacioneconomicaAux,informacioneconomicas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.informacioneconomica,informacioneconomicaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				informacioneconomicaAux=new  InformacionEconomica();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.informacioneconomicaSessionBean.getEsGuardarRelacionado() 
					|| (this.informacioneconomicaSessionBean.getEsGuardarRelacionado() && this.informacioneconomica.getId()>=0)) {
						
					informacioneconomicaAux.setIsNew(false);
				}
				
				informacioneconomicaAux.setIsDeleted(false);
			
				informacioneconomicaAux.setId(this.informacioneconomica.getId());	
				informacioneconomicaAux.setVersionRow(this.informacioneconomica.getVersionRow());	
				informacioneconomicaAux.setidcliente(this.informacioneconomica.getidcliente());	
				informacioneconomicaAux.setidvalorclientevinculacion(this.informacioneconomica.getidvalorclientevinculacion());	
				informacioneconomicaAux.setcodigoactualizacion(this.informacioneconomica.getcodigoactualizacion());	
				informacioneconomicaAux.setcodigodestinofinanciero(this.informacioneconomica.getcodigodestinofinanciero());	
				informacioneconomicaAux.setorigenrecursos(this.informacioneconomica.getorigenrecursos());	
				informacioneconomicaAux.setcuasavinculacion(this.informacioneconomica.getcuasavinculacion());	
				informacioneconomicaAux.setsectorizacion(this.informacioneconomica.getsectorizacion());	
				informacioneconomicaAux.setesactivo(this.informacioneconomica.getesactivo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(informacioneconomicaAux,informacioneconomicaLogic.getInformacionEconomicas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(informacioneconomicaAux,informacioneconomicas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.informacioneconomicaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.informacioneconomicaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						informacioneconomicaLogic.saveInformacionEconomicas();//WithConnection
						//informacioneconomicaLogic.getSetVersionRowInformacionEconomicas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.informacioneconomica,informacioneconomicaAux);
					
					this.refrescarForeignKeysDescripcionesInformacionEconomica();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.informacioneconomicaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								informacioneconomicaLogic.saveInformacionEconomicaRelaciones(informacioneconomicaAux);//WithConnection
								//informacioneconomicaLogic.getSetVersionRowInformacionEconomicas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.informacioneconomica,informacioneconomicaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.informacioneconomicaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.informacioneconomicaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(informacioneconomicaAux,informacioneconomicaLogic.getInformacionEconomicas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(informacioneconomicaAux,informacioneconomicas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.informacioneconomica,informacioneconomicaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				informacioneconomicaAux=new  InformacionEconomica();
				
				informacioneconomicaAux.setIsNew(false);
				informacioneconomicaAux.setIsChanged(false);
				
				informacioneconomicaAux.setIsDeleted(true);
				
				informacioneconomicaAux.setId(this.informacioneconomica.getId());	
				informacioneconomicaAux.setVersionRow(this.informacioneconomica.getVersionRow());	
				informacioneconomicaAux.setidcliente(this.informacioneconomica.getidcliente());	
				informacioneconomicaAux.setidvalorclientevinculacion(this.informacioneconomica.getidvalorclientevinculacion());	
				informacioneconomicaAux.setcodigoactualizacion(this.informacioneconomica.getcodigoactualizacion());	
				informacioneconomicaAux.setcodigodestinofinanciero(this.informacioneconomica.getcodigodestinofinanciero());	
				informacioneconomicaAux.setorigenrecursos(this.informacioneconomica.getorigenrecursos());	
				informacioneconomicaAux.setcuasavinculacion(this.informacioneconomica.getcuasavinculacion());	
				informacioneconomicaAux.setsectorizacion(this.informacioneconomica.getsectorizacion());	
				informacioneconomicaAux.setesactivo(this.informacioneconomica.getesactivo());	
				
				if(this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.informacioneconomicaAux.getId()>=0) {	
						this.informacioneconomicasEliminados.add(informacioneconomicaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(informacioneconomicaAux,informacioneconomicaLogic.getInformacionEconomicas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(informacioneconomicaAux,informacioneconomicas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.informacioneconomicaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.informacioneconomicaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						informacioneconomicaLogic.saveInformacionEconomicas();//WithConnection
						//informacioneconomicaLogic.getSetVersionRowInformacionEconomicas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.informacioneconomicaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								informacioneconomicaLogic.saveInformacionEconomicaRelaciones(informacioneconomicaAux);//WithConnection
								//informacioneconomicaLogic.getSetVersionRowInformacionEconomicas();//WithConnection
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
							if(this.informacioneconomicaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.informacioneconomicaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(informacioneconomicaAux,informacioneconomicaLogic.getInformacionEconomicas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(informacioneconomicaAux,informacioneconomicas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.getInformacionEconomicas().addAll(this.informacioneconomicasEliminados);
					
					informacioneconomicaLogic.saveInformacionEconomicas();//WithConnection
					//informacioneconomicaLogic.getSetVersionRowInformacionEconomicas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesInformacionEconomica();
				
				this.informacioneconomicasEliminados= new ArrayList<InformacionEconomica>();		
			}
			
			if(this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Informacion Economica GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Informacion Economica",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.informacioneconomica=informacioneconomicaAux;
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
      		//this.finishProcessInformacionEconomica();
      	}
		
	}	
	
	public void actualizarRelaciones(InformacionEconomica informacioneconomicaLocal) throws Exception {
		
		if(this.informacioneconomicaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(InformacionEconomica informacioneconomicaLocal) throws Exception {	
		if(this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				informacioneconomicaLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoVinculacionDetalleFormJInternalFrame.class)) {
				TipoVinculacionBeanSwingJInternalFrame tipovinculacionBeanSwingJInternalFrameLocal=(TipoVinculacionBeanSwingJInternalFrame) ((TipoVinculacionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipovinculacionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoVinculacion(tipovinculacionBeanSwingJInternalFrameLocal.gettipovinculacion(),true);
				tipovinculacionBeanSwingJInternalFrameLocal.actualizarLista(tipovinculacionBeanSwingJInternalFrameLocal.tipovinculacion,this.tipovinculacionsForeignKey);

				tipovinculacionBeanSwingJInternalFrameLocal.actualizarRelaciones(tipovinculacionBeanSwingJInternalFrameLocal.tipovinculacion);

				informacioneconomicaLocal.setTipoVinculacion(tipovinculacionBeanSwingJInternalFrameLocal.tipovinculacion);

				this.addItemDefectoCombosForeignKeyTipoVinculacion();
				this.cargarCombosFrameTipoVinculacionsForeignKey("Formulario");
				this.setActualTipoVinculacionForeignKey(tipovinculacionBeanSwingJInternalFrameLocal.tipovinculacion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarInformacionEconomicaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosInformacionEconomica.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.informacioneconomica =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.informacioneconomica =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = informacioneconomicaValidator.getInvalidValues(this.informacioneconomica);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(InformacionEconomica informacioneconomica,List<InformacionEconomica> informacioneconomicas) throws Exception {
		try	{		
			InformacionEconomicaConstantesFunciones.actualizarLista(informacioneconomica,informacioneconomicas,this.informacioneconomicaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(InformacionEconomica informacioneconomica,List<InformacionEconomica> informacioneconomicas) throws Exception {
		try	{			
			InformacionEconomicaConstantesFunciones.actualizarSelectedLista(informacioneconomica,informacioneconomicas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<InformacionEconomica> informacioneconomicasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				informacioneconomicasLocal=this.informacioneconomicaLogic.getInformacionEconomicas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				informacioneconomicasLocal=this.informacioneconomicas;
			}
			//ARCHITECTURE
		
			for(InformacionEconomica informacioneconomicaLocal:informacioneconomicasLocal) {
				if(this.permiteMantenimiento(informacioneconomicaLocal) && informacioneconomicaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+InformacionEconomicaConstantesFunciones.getInformacionEconomicaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(InformacionEconomicaConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionEconomica.jLabelidclienteInformacionEconomica,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformacionEconomicaConstantesFunciones.IDTIPOVINCULACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionEconomica.jLabelidvalorclientevinculacionInformacionEconomica,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformacionEconomicaConstantesFunciones.CODIGOACTUALIZACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionEconomica.jLabelcodigoactualizacionInformacionEconomica,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformacionEconomicaConstantesFunciones.CODIGODESTINOFINANCIERO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionEconomica.jLabelcodigodestinofinancieroInformacionEconomica,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformacionEconomicaConstantesFunciones.ORIGENRECURSOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionEconomica.jLabelorigenrecursosInformacionEconomica,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformacionEconomicaConstantesFunciones.CUASAVINCULACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionEconomica.jLabelcuasavinculacionInformacionEconomica,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformacionEconomicaConstantesFunciones.SECTORIZACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionEconomica.jLabelsectorizacionInformacionEconomica,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformacionEconomicaConstantesFunciones.ESACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionEconomica.jLabelesactivoInformacionEconomica,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormInformacionEconomica!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformacionEconomica.jLabelidclienteInformacionEconomica,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformacionEconomica.jLabelidvalorclientevinculacionInformacionEconomica,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformacionEconomica.jLabelcodigoactualizacionInformacionEconomica,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformacionEconomica.jLabelcodigodestinofinancieroInformacionEconomica,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformacionEconomica.jLabelorigenrecursosInformacionEconomica,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformacionEconomica.jLabelcuasavinculacionInformacionEconomica,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformacionEconomica.jLabelsectorizacionInformacionEconomica,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformacionEconomica.jLabelesactivoInformacionEconomica,"");
		
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
		this.iIdNuevoInformacionEconomica--;	
		
		
		this.informacioneconomicaAux=new InformacionEconomica();
		
		this.informacioneconomicaAux.setId(this.iIdNuevoInformacionEconomica);
		this.informacioneconomicaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.informacioneconomicaLogic.getInformacionEconomicas().add(this.informacioneconomicaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.informacioneconomicas.add(this.informacioneconomicaAux);
		}
		//ARCHITECTURE
		
		this.informacioneconomica=this.informacioneconomicaAux;
		
		if(InformacionEconomicaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioInformacionEconomica(this.informacioneconomica);
			this.setVariablesObjetoActualToFormularioForeignKeyInformacionEconomica(this.informacioneconomica);
		}
				
		//this.setDefaultControlesInformacionEconomica();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyInformacionEconomica();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyInformacionEconomica();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyInformacionEconomica();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualInformacionEconomica(this.informacioneconomicaBean,this.informacioneconomica,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysInformacionEconomica(this.informacioneconomica);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(InformacionEconomicaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.informacioneconomicaSessionBean.getConGuardarRelaciones()) {
			classes=InformacionEconomicaConstantesFunciones.getClassesRelationshipsOfInformacionEconomica(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.informacioneconomicaReturnGeneral=informacioneconomicaLogic.procesarEventosInformacionEconomicasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.informacioneconomicaLogic.getInformacionEconomicas(),this.informacioneconomica,this.informacioneconomicaParameterGeneral,this.isEsNuevoInformacionEconomica,classes);//this.informacioneconomicaLogic.getInformacionEconomica()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanInformacionEconomica(this.informacioneconomicaReturnGeneral,this.informacioneconomicaBean,false);
		
		if(this.informacioneconomicaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyInformacionEconomica(this.informacioneconomicaReturnGeneral.getInformacionEconomica());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioInformacionEconomica(this.informacioneconomicaReturnGeneral.getInformacionEconomica());
		}
		
		if(this.informacioneconomicaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioInformacionEconomica(this.informacioneconomicaReturnGeneral.getInformacionEconomica(),classes);//this.informacioneconomicaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualInformacionEconomica(this.informacioneconomica,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyInformacionEconomica();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyInformacionEconomica();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			InformacionEconomicaBeanSwingJInternalFrameAdditional.RecargarFormInformacionEconomica(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingInformacionEconomica(false);
						
			if(informacioneconomicaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(InformacionEconomicaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualInformacionEconomica();
			}
			
			this.actualizarVisualTableDatosInformacionEconomica();
			
			this.jTableDatosInformacionEconomica.setRowSelectionInterval(this.getIndiceNuevoInformacionEconomica(), this.getIndiceNuevoInformacionEconomica());
			
			this.seleccionarFilaTablaInformacionEconomicaActual();
						
			this.actualizarEstadoCeldasBotonesInformacionEconomica("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesInformacionEconomica(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldcodigoactualizacionInformacionEconomica.setEnabled(isHabilitar && this.informacioneconomicaConstantesFunciones.activarcodigoactualizacionInformacionEconomica);
		this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldcodigodestinofinancieroInformacionEconomica.setEnabled(isHabilitar && this.informacioneconomicaConstantesFunciones.activarcodigodestinofinancieroInformacionEconomica);
		this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldorigenrecursosInformacionEconomica.setEnabled(isHabilitar && this.informacioneconomicaConstantesFunciones.activarorigenrecursosInformacionEconomica);
		this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldcuasavinculacionInformacionEconomica.setEnabled(isHabilitar && this.informacioneconomicaConstantesFunciones.activarcuasavinculacionInformacionEconomica);
		this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldsectorizacionInformacionEconomica.setEnabled(isHabilitar && this.informacioneconomicaConstantesFunciones.activarsectorizacionInformacionEconomica);
		this.jInternalFrameDetalleFormInformacionEconomica.jCheckBoxesactivoInformacionEconomica.setEnabled(isHabilitar && this.informacioneconomicaConstantesFunciones.activaresactivoInformacionEconomica);	
		
		this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxidclienteInformacionEconomica.setEnabled(isHabilitar && this.informacioneconomicaConstantesFunciones.activaridclienteInformacionEconomica);
		this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxidvalorclientevinculacionInformacionEconomica.setEnabled(isHabilitar && this.informacioneconomicaConstantesFunciones.activaridvalorclientevinculacionInformacionEconomica);
	};
	
	public void setDefaultControlesInformacionEconomica() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoInformacionEconomica(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.informacioneconomicaSessionBean.setConGuardarRelaciones(true);			
			this.informacioneconomicaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormInformacionEconomica.jTabbedPaneRelacionesInformacionEconomica.setVisible(true);
			
					
		} else {
			//this.informacioneconomicaSessionBean.setConGuardarRelaciones(false);			
			this.informacioneconomicaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormInformacionEconomica.jTabbedPaneRelacionesInformacionEconomica.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoInformacionEconomica() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(InformacionEconomica informacioneconomicaAux:this.informacioneconomicaLogic.getInformacionEconomicas()) {
				if(informacioneconomicaAux.getId().equals(this.iIdNuevoInformacionEconomica)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(InformacionEconomica informacioneconomicaAux:this.informacioneconomicas) {
				if(informacioneconomicaAux.getId().equals(this.iIdNuevoInformacionEconomica)) {
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
	
	public int getIndiceActualInformacionEconomica(InformacionEconomica informacioneconomica,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(InformacionEconomica informacioneconomicaAux:this.informacioneconomicaLogic.getInformacionEconomicas()) {
				if(informacioneconomicaAux.getId().equals(informacioneconomica.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(InformacionEconomica informacioneconomicaAux:this.informacioneconomicas) {
				if(informacioneconomicaAux.getId().equals(informacioneconomica.getId())) {
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
	
	public void setCamposBaseDesdeOriginalInformacionEconomica(InformacionEconomica informacioneconomicaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(InformacionEconomica informacioneconomicaAux:this.informacioneconomicaLogic.getInformacionEconomicas()) {
				if(informacioneconomicaAux.getInformacionEconomicaOriginal().getId().equals(informacioneconomicaOriginal.getId())) {
					existe=true;
					informacioneconomicaOriginal.setId(informacioneconomicaAux.getId());
					informacioneconomicaOriginal.setVersionRow(informacioneconomicaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(InformacionEconomica informacioneconomicaAux:this.informacioneconomicas) {
				if(informacioneconomicaAux.getInformacionEconomicaOriginal().getId().equals(informacioneconomicaOriginal.getId())) {
					existe=true;
					informacioneconomicaOriginal.setId(informacioneconomicaAux.getId());
					informacioneconomicaOriginal.setVersionRow(informacioneconomicaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosInformacionEconomica(Boolean esParaCancelar) throws Exception {
		informacioneconomicasAux=new ArrayList<InformacionEconomica>();
		informacioneconomicaAux=new InformacionEconomica();
		
		if(!this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(InformacionEconomica informacioneconomicaAux:this.informacioneconomicaLogic.getInformacionEconomicas()) {
					if(informacioneconomicaAux.getId()<0) {
						informacioneconomicasAux.add(informacioneconomicaAux);
					}		
				}
				this.iIdNuevoInformacionEconomica=0L;
				this.informacioneconomicaLogic.getInformacionEconomicas().removeAll(informacioneconomicasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(InformacionEconomica informacioneconomicaAux:this.informacioneconomicas) {
					if(informacioneconomicaAux.getId()<0) {
						informacioneconomicasAux.add(informacioneconomicaAux);
					}		
				}
				this.iIdNuevoInformacionEconomica=0L;
				this.informacioneconomicas.removeAll(informacioneconomicasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoInformacionEconomica 
					&& this.informacioneconomicaLogic.getInformacionEconomicas().size()>0
					) {
					informacioneconomicaAux=this.informacioneconomicaLogic.getInformacionEconomicas().get(this.informacioneconomicaLogic.getInformacionEconomicas().size() - 1);
				
					if(informacioneconomicaAux.getId()<0) {
						this.informacioneconomicaLogic.getInformacionEconomicas().remove(informacioneconomicaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoInformacionEconomica && this.informacioneconomicas.size()>0) {
					informacioneconomicaAux=this.informacioneconomicas.get(this.informacioneconomicas.size() - 1);
				
					if(informacioneconomicaAux.getId()<0) {
						this.informacioneconomicas.remove(informacioneconomicaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoInformacionEconomica(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(informacioneconomica.getId()<0) {
				this.informacioneconomicaLogic.getInformacionEconomicas().remove(this.informacioneconomica);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(informacioneconomica.getId()<0) {
				this.informacioneconomicas.remove(this.informacioneconomica);
			}
		}			
	}
	
	public void setEstadosInicialesInformacionEconomica(List<InformacionEconomica> informacioneconomicasAux) throws Exception {
		InformacionEconomicaConstantesFunciones.setEstadosInicialesInformacionEconomica(informacioneconomicasAux);
	}
	
	public void setEstadosInicialesInformacionEconomica(InformacionEconomica informacioneconomicaAux) throws Exception {
		InformacionEconomicaConstantesFunciones.setEstadosInicialesInformacionEconomica(informacioneconomicaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarInformacionEconomicaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesInformacionEconomica("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarInformacionEconomicaActual()) {
				if(!this.isEsNuevoInformacionEconomica) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesInformacionEconomica("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoInformacionEconomica=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarInformacionEconomicaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Informacion Economica ?", "MANTENIMIENTO DE Informacion Economica", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesInformacionEconomica("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(InformacionEconomica informacioneconomica) throws Exception {
		InformacionEconomicaConstantesFunciones.seleccionarAsignar(this.informacioneconomica,informacioneconomica);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarInformacionEconomica=this.isPermisoActualizarOriginalInformacionEconomica;
			
			
			this.seleccionarAsignar(informacioneconomica);
			
			

			idClienteActual=informacioneconomica.getidcliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			InformacionEconomicaConstantesFunciones.quitarEspaciosInformacionEconomica(this.informacioneconomica,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesInformacionEconomica("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.informacioneconomicaSessionBean.setsFuncionBusquedaRapida(this.informacioneconomicaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoInformacionEconomica) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosInformacionEconomica(esParaCancelar);				
				this.cancelarNuevoInformacionEconomica(esParaCancelar);								
			}
			
			this.informacioneconomica=new InformacionEconomica();
			
			this.inicializarInformacionEconomica();
			
			this.actualizarEstadoCeldasBotonesInformacionEconomica("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarInformacionEconomica() throws Exception {
		try {
			InformacionEconomicaConstantesFunciones.inicializarInformacionEconomica(this.informacioneconomica);
			
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
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.informacioneconomicaLogic.getInformacionEconomicas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteInformacionEconomicas(String sAccionBusqueda,List<InformacionEconomica> informacioneconomicasParaReportes) throws Exception {
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
					sPathReporteFinal="InformacionEconomica"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="InformacionEconomicaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("InformacionEconomicaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="InformacionEconomica"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Informacion Economicas");		
		parameters.put("busquedapor", InformacionEconomicaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceInformacionEconomica=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			InformacionEconomicaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			InformacionEconomicaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceInformacionEconomica=new JRBeanArrayDataSource(InformacionEconomicaJInternalFrame.TraerInformacionEconomicaBeans(informacioneconomicasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceInformacionEconomica);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+InformacionEconomicaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+InformacionEconomicaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(InformacionEconomicaBean.TraerInformacionEconomicaBeans(informacioneconomicasParaReportes).toArray()));
							
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
				this.generarExcelReporteInformacionEconomicas(sAccionBusqueda,sTipoArchivoReporte,informacioneconomicasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalInformacionEconomicas(sAccionBusqueda,sTipoArchivoReporte,informacioneconomicasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoInformacionEconomicaActionPerformed(null);
					//this.generarExcelReporteInformacionEconomicas(sAccionBusqueda,sTipoArchivoReporte,informacioneconomicasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalInformacionEconomicas(sAccionBusqueda,sTipoArchivoReporte,informacioneconomicasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesInformacionEconomicas(sAccionBusqueda,sTipoArchivoReporte,informacioneconomicasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesInformacionEconomicas(sAccionBusqueda,sTipoArchivoReporte,informacioneconomicasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteInformacionEconomicas(String sAccionBusqueda,String sTipoArchivoReporte,List<InformacionEconomica> informacioneconomicasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"informacioneconomica";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("InformacionEconomicas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderInformacionEconomica("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(InformacionEconomica informacioneconomica : informacioneconomicasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			InformacionEconomicaConstantesFunciones.generarExcelReporteDataInformacionEconomica("NORMAL",row,workbook,informacioneconomica,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informacion Economica",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderInformacionEconomica(String sTipo,Row row,Workbook workbook) {
		
		InformacionEconomicaConstantesFunciones.generarExcelReporteHeaderInformacionEconomica(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalInformacionEconomicas(String sAccionBusqueda,String sTipoArchivoReporte,List<InformacionEconomica> informacioneconomicasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"informacioneconomica_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("InformacionEconomicas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(InformacionEconomica informacioneconomica : informacioneconomicasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(InformacionEconomicaConstantesFunciones.getInformacionEconomicaDescripcion(informacioneconomica));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformacionEconomicaConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformacionEconomicaConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informacioneconomica.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformacionEconomicaConstantesFunciones.LABEL_IDTIPOVINCULACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformacionEconomicaConstantesFunciones.LABEL_IDTIPOVINCULACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informacioneconomica.gettipovinculacion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformacionEconomicaConstantesFunciones.LABEL_CODIGOACTUALIZACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformacionEconomicaConstantesFunciones.LABEL_CODIGOACTUALIZACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informacioneconomica.getcodigoactualizacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformacionEconomicaConstantesFunciones.LABEL_CODIGODESTINOFINANCIERO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformacionEconomicaConstantesFunciones.LABEL_CODIGODESTINOFINANCIERO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informacioneconomica.getcodigodestinofinanciero());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformacionEconomicaConstantesFunciones.LABEL_ORIGENRECURSOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformacionEconomicaConstantesFunciones.LABEL_ORIGENRECURSOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informacioneconomica.getorigenrecursos());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformacionEconomicaConstantesFunciones.LABEL_CUASAVINCULACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformacionEconomicaConstantesFunciones.LABEL_CUASAVINCULACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informacioneconomica.getcuasavinculacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformacionEconomicaConstantesFunciones.LABEL_SECTORIZACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformacionEconomicaConstantesFunciones.LABEL_SECTORIZACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informacioneconomica.getsectorizacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformacionEconomicaConstantesFunciones.LABEL_ESACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformacionEconomicaConstantesFunciones.LABEL_ESACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(informacioneconomica.getesactivo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informacion Economica",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesInformacionEconomicas(String sAccionBusqueda,String sTipoArchivoReporte,List<InformacionEconomica> informacioneconomicasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<InformacionEconomica> informacioneconomicasRespaldo=null;
		
		classes=InformacionEconomicaConstantesFunciones.getClassesRelationshipsOfInformacionEconomica(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.informacioneconomicaLogic.setDatosCliente(this.datosCliente);
		this.informacioneconomicaLogic.setDatosDeep(this.datosDeep);
		this.informacioneconomicaLogic.setIsConDeep(true);
		
		informacioneconomicasRespaldo=this.informacioneconomicaLogic.getInformacionEconomicas();
		
		this.informacioneconomicaLogic.setInformacionEconomicas(informacioneconomicasParaReportes);	
		this.informacioneconomicaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		informacioneconomicasParaReportes=this.informacioneconomicaLogic.getInformacionEconomicas();
		this.informacioneconomicaLogic.setInformacionEconomicas(informacioneconomicasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"informacioneconomica_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("InformacionEconomicas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderInformacionEconomica("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(InformacionEconomica informacioneconomica : informacioneconomicasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderInformacionEconomica("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			InformacionEconomicaConstantesFunciones.generarExcelReporteDataInformacionEconomica("NORMAL",row,workbook,informacioneconomica,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(InformacionEconomicaConstantesFunciones.getInformacionEconomicaDescripcion(informacioneconomica));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informacion Economica",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoInformacionEconomica.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoInformacionEconomica.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoInformacionEconomica.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoInformacionEconomica.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessInformacionEconomica() throws Exception {		
		this.startProcessInformacionEconomica(true);
	}
	
	public void startProcessInformacionEconomica(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasInformacionEconomica ,this.jPanelParametrosReportesInformacionEconomica, this.jScrollPanelDatosInformacionEconomica,this.jPanelPaginacionInformacionEconomica, this.jScrollPanelDatosEdicionInformacionEconomica, this.jPanelAccionesInformacionEconomica,this.jPanelAccionesFormularioInformacionEconomica,this.jmenuBarInformacionEconomica,this.jmenuBarDetalleInformacionEconomica,this.jTtoolBarInformacionEconomica,this.jTtoolBarDetalleInformacionEconomica);		
		
		final JTabbedPane jTabbedPaneBusquedasInformacionEconomica=this.jTabbedPaneBusquedasInformacionEconomica; 
		
		final JPanel jPanelParametrosReportesInformacionEconomica=this.jPanelParametrosReportesInformacionEconomica;
		//final JScrollPane jScrollPanelDatosInformacionEconomica=this.jScrollPanelDatosInformacionEconomica;
		final JTable jTableDatosInformacionEconomica=this.jTableDatosInformacionEconomica;		
		final JPanel jPanelPaginacionInformacionEconomica=this.jPanelPaginacionInformacionEconomica;
		//final JScrollPane jScrollPanelDatosEdicionInformacionEconomica=this.jScrollPanelDatosEdicionInformacionEconomica;
		final JPanel jPanelAccionesInformacionEconomica=this.jPanelAccionesInformacionEconomica;
		
		JPanel jPanelCamposAuxiliarInformacionEconomica=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarInformacionEconomica=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormInformacionEconomica!=null) {
			jPanelCamposAuxiliarInformacionEconomica=this.jInternalFrameDetalleFormInformacionEconomica.jPanelCamposInformacionEconomica;
			jPanelAccionesFormularioAuxiliarInformacionEconomica=this.jInternalFrameDetalleFormInformacionEconomica.jPanelAccionesFormularioInformacionEconomica;
		}
		
		final JPanel jPanelCamposInformacionEconomica=jPanelCamposAuxiliarInformacionEconomica;
		final JPanel jPanelAccionesFormularioInformacionEconomica=jPanelAccionesFormularioAuxiliarInformacionEconomica;
		
		
		final JMenuBar jmenuBarInformacionEconomica=this.jmenuBarInformacionEconomica;
		final JToolBar jTtoolBarInformacionEconomica=this.jTtoolBarInformacionEconomica;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarInformacionEconomica=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarInformacionEconomica=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormInformacionEconomica!=null) {
			jmenuBarDetalleAuxiliarInformacionEconomica=this.jInternalFrameDetalleFormInformacionEconomica.jmenuBarDetalleInformacionEconomica;
			jTtoolBarDetalleAuxiliarInformacionEconomica=this.jInternalFrameDetalleFormInformacionEconomica.jTtoolBarDetalleInformacionEconomica;
		}
		
		final JMenuBar jmenuBarDetalleInformacionEconomica=jmenuBarDetalleAuxiliarInformacionEconomica;
		final JToolBar jTtoolBarDetalleInformacionEconomica=jTtoolBarDetalleAuxiliarInformacionEconomica;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasInformacionEconomica;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesInformacionEconomica;
			processRunnable.jTableDatos=jTableDatosInformacionEconomica;
			processRunnable.jPanelCampos=jPanelCamposInformacionEconomica;
			processRunnable.jPanelPaginacion=jPanelPaginacionInformacionEconomica;
			processRunnable.jPanelAcciones=jPanelAccionesInformacionEconomica;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioInformacionEconomica;
			
			
			processRunnable.jmenuBar=jmenuBarInformacionEconomica;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleInformacionEconomica;
			processRunnable.jTtoolBar=jTtoolBarInformacionEconomica;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleInformacionEconomica;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasInformacionEconomica ,jPanelParametrosReportesInformacionEconomica,jTableDatosInformacionEconomica, /*jScrollPanelDatosInformacionEconomica,*/jPanelCamposInformacionEconomica,jPanelPaginacionInformacionEconomica, /*jScrollPanelDatosEdicionInformacionEconomica,*/ jPanelAccionesInformacionEconomica,jPanelAccionesFormularioInformacionEconomica,jmenuBarInformacionEconomica,jmenuBarDetalleInformacionEconomica,jTtoolBarInformacionEconomica,jTtoolBarDetalleInformacionEconomica);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasInformacionEconomica ,jPanelParametrosReportesInformacionEconomica, jScrollPanelDatosInformacionEconomica,jPanelPaginacionInformacionEconomica, jScrollPanelDatosEdicionInformacionEconomica, jPanelAccionesInformacionEconomica,jPanelAccionesFormularioInformacionEconomica,jmenuBarInformacionEconomica,jmenuBarDetalleInformacionEconomica,jTtoolBarInformacionEconomica,jTtoolBarDetalleInformacionEconomica);
						
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
	
	public void finishProcessInformacionEconomica() {// throws Exception 
		this.finishProcessInformacionEconomica(true);
	}
	
	public void finishProcessInformacionEconomica(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasInformacionEconomica ,this.jPanelParametrosReportesInformacionEconomica, this.jScrollPanelDatosInformacionEconomica,this.jPanelPaginacionInformacionEconomica, this.jScrollPanelDatosEdicionInformacionEconomica, this.jPanelAccionesInformacionEconomica,this.jPanelAccionesFormularioInformacionEconomica,this.jmenuBarInformacionEconomica,this.jmenuBarDetalleInformacionEconomica,this.jTtoolBarInformacionEconomica,this.jTtoolBarDetalleInformacionEconomica);		
		
		final JTabbedPane jTabbedPaneBusquedasInformacionEconomica=this.jTabbedPaneBusquedasInformacionEconomica; 
		
		final JPanel jPanelParametrosReportesInformacionEconomica=this.jPanelParametrosReportesInformacionEconomica;
		//final JScrollPane jScrollPanelDatosInformacionEconomica=this.jScrollPanelDatosInformacionEconomica;
		final JTable jTableDatosInformacionEconomica=this.jTableDatosInformacionEconomica;		
		final JPanel jPanelPaginacionInformacionEconomica=this.jPanelPaginacionInformacionEconomica;
		//final JScrollPane jScrollPanelDatosEdicionInformacionEconomica=this.jScrollPanelDatosEdicionInformacionEconomica;
		final JPanel jPanelAccionesInformacionEconomica=this.jPanelAccionesInformacionEconomica;
		
		JPanel jPanelCamposAuxiliarInformacionEconomica=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarInformacionEconomica=new JPanel();
		
		if(this.jInternalFrameDetalleFormInformacionEconomica!=null) {
			jPanelCamposAuxiliarInformacionEconomica=this.jInternalFrameDetalleFormInformacionEconomica.jPanelCamposInformacionEconomica;
			jPanelAccionesFormularioAuxiliarInformacionEconomica=this.jInternalFrameDetalleFormInformacionEconomica.jPanelAccionesFormularioInformacionEconomica;
		}
		
		final JPanel jPanelCamposInformacionEconomica=jPanelCamposAuxiliarInformacionEconomica;
		final JPanel jPanelAccionesFormularioInformacionEconomica=jPanelAccionesFormularioAuxiliarInformacionEconomica;
		
		
		final JMenuBar jmenuBarInformacionEconomica=this.jmenuBarInformacionEconomica;		
		final JToolBar jTtoolBarInformacionEconomica=this.jTtoolBarInformacionEconomica;
				
		JMenuBar jmenuBarDetalleAuxiliarInformacionEconomica=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarInformacionEconomica=new JToolBar();
		
		if(this.jInternalFrameDetalleFormInformacionEconomica!=null) {
			jmenuBarDetalleAuxiliarInformacionEconomica=this.jInternalFrameDetalleFormInformacionEconomica.jmenuBarDetalleInformacionEconomica;
			jTtoolBarDetalleAuxiliarInformacionEconomica=this.jInternalFrameDetalleFormInformacionEconomica.jTtoolBarDetalleInformacionEconomica;		
		}
		
		final JMenuBar jmenuBarDetalleInformacionEconomica=jmenuBarDetalleAuxiliarInformacionEconomica;
		final JToolBar jTtoolBarDetalleInformacionEconomica=jTtoolBarDetalleAuxiliarInformacionEconomica;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasInformacionEconomica;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesInformacionEconomica;
			processRunnable.jTableDatos=jTableDatosInformacionEconomica;
			processRunnable.jPanelCampos=jPanelCamposInformacionEconomica;
			processRunnable.jPanelPaginacion=jPanelPaginacionInformacionEconomica;
			processRunnable.jPanelAcciones=jPanelAccionesInformacionEconomica;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioInformacionEconomica;
			
			
			processRunnable.jmenuBar=jmenuBarInformacionEconomica;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleInformacionEconomica;
			processRunnable.jTtoolBar=jTtoolBarInformacionEconomica;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleInformacionEconomica;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasInformacionEconomica ,jPanelParametrosReportesInformacionEconomica, jTableDatosInformacionEconomica,/*jScrollPanelDatosInformacionEconomica,*/jPanelCamposInformacionEconomica,jPanelPaginacionInformacionEconomica, /*jScrollPanelDatosEdicionInformacionEconomica,*/ jPanelAccionesInformacionEconomica,jPanelAccionesFormularioInformacionEconomica,jmenuBarInformacionEconomica,jmenuBarDetalleInformacionEconomica,jTtoolBarInformacionEconomica,jTtoolBarDetalleInformacionEconomica));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesInformacionEconomica(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarInformacionEconomica(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuInformacionEconomica(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarInformacionEconomica(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarInformacionEconomica,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleInformacionEconomica,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuInformacionEconomica(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarInformacionEconomica,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleInformacionEconomica,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.informacioneconomicaConstantesFunciones.getsFinalQueryInformacionEconomica();
		String  finalQueryPaginacionTodos=this.informacioneconomicaConstantesFunciones.getsFinalQueryInformacionEconomica();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=InformacionEconomicaConstantesFunciones.getArrayColumnasGlobalesNoInformacionEconomica(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=InformacionEconomicaConstantesFunciones.getArrayColumnasGlobalesInformacionEconomica(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,InformacionEconomicaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.informacioneconomicasEliminados= new ArrayList<InformacionEconomica>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessInformacionEconomica();
		
				///*InformacionEconomicaSessionBean*/this.informacioneconomicaSessionBean=new InformacionEconomicaSessionBean();
			
			if(this.informacioneconomicaSessionBean==null) {
				this.informacioneconomicaSessionBean=new InformacionEconomicaSessionBean();
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
					this.iNumeroPaginacion=InformacionEconomicaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=InformacionEconomicaConstantesFunciones.getClassesForeignKeysOfInformacionEconomica(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/informacioneconomica."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			informacioneconomicasAux= new ArrayList<InformacionEconomica>();
			
				
			informacioneconomicaLogic.setDatosCliente(this.datosCliente);
			informacioneconomicaLogic.setDatosDeep(this.datosDeep);
			informacioneconomicaLogic.setIsConDeep(true);
			
			
			informacioneconomicaLogic.getInformacionEconomicaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					informacioneconomicaLogic.getTodosInformacionEconomicas(finalQueryGlobal,pagination);
					
					//informacioneconomicaLogic.getTodosInformacionEconomicasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(informacioneconomicaLogic.getInformacionEconomicas()==null|| informacioneconomicaLogic.getInformacionEconomicas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							informacioneconomicasAux= new ArrayList<InformacionEconomica>();
							informacioneconomicasAux.addAll(informacioneconomicaLogic.getInformacionEconomicas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacioneconomicasAux= new ArrayList<InformacionEconomica>();
							informacioneconomicasAux.addAll(informacioneconomicas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							informacioneconomicaLogic.getTodosInformacionEconomicas(finalQueryGlobal+"",this.pagination);												
							
							//informacioneconomicaLogic.getTodosInformacionEconomicasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteInformacionEconomicas("Todos",informacioneconomicaLogic.getInformacionEconomicas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							informacioneconomicaLogic.setInformacionEconomicas(new ArrayList<InformacionEconomica>());					
							informacioneconomicaLogic.getInformacionEconomicas().addAll(informacioneconomicasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacioneconomicas=new ArrayList<InformacionEconomica>();
							informacioneconomicas.addAll(informacioneconomicasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idInformacionEconomica=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idInformacionEconomica=this.idActual;
				
				} else if(this.idInformacionEconomicaActual!=null && this.idInformacionEconomicaActual!=0L) {
					idInformacionEconomica=idInformacionEconomicaActual;
				}
				
					
				this.sDetalleReporte=InformacionEconomicaConstantesFunciones.getDetalleIndicePorId(idInformacionEconomica);
				
				this.informacioneconomicas=new ArrayList<InformacionEconomica>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					informacioneconomicaLogic.getEntity(idInformacionEconomica);
					
					//informacioneconomicaLogic.getEntityWithConnection(idInformacionEconomica);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					informacioneconomicaLogic.setInformacionEconomicas(new ArrayList<InformacionEconomica>());
					informacioneconomicaLogic.getInformacionEconomicas().add(informacioneconomicaLogic.getInformacionEconomica());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.informacioneconomicas=new ArrayList<InformacionEconomica>();
					this.informacioneconomicas.add(informacioneconomica);
				}
				
				if(informacioneconomicaLogic.getInformacionEconomica()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=InformacionEconomicaConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					informacioneconomicaLogic.getInformacionEconomicasFK_IdCliente(finalQueryGlobal,pagination,idclienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=InformacionEconomicaConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=InformacionEconomicaConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=informacioneconomicaLogic.getInformacionEconomicas()==null||informacioneconomicaLogic.getInformacionEconomicas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=informacioneconomicas==null|| informacioneconomicas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						informacioneconomicasAux=new ArrayList<InformacionEconomica>();
						informacioneconomicasAux.addAll(informacioneconomicaLogic.getInformacionEconomicas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacioneconomicasAux=new ArrayList<InformacionEconomica>();
							informacioneconomicasAux.addAll(informacioneconomicas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							informacioneconomicaLogic.getInformacionEconomicasFK_IdCliente(finalQueryGlobal,pagination,idclienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=InformacionEconomicaConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=InformacionEconomicaConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteInformacionEconomicas("FK_IdCliente",informacioneconomicaLogic.getInformacionEconomicas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteInformacionEconomicas("FK_IdCliente",informacioneconomicas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						informacioneconomicaLogic.setInformacionEconomicas(new ArrayList<InformacionEconomica>());
						informacioneconomicaLogic.getInformacionEconomicas().addAll(informacioneconomicasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacioneconomicas=new ArrayList<InformacionEconomica>();
							informacioneconomicas.addAll(informacioneconomicasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdValorClienteVinculacion")) {
				this.sDetalleReporte=InformacionEconomicaConstantesFunciones.getDetalleIndiceFK_IdValorClienteVinculacion(idvalorclientevinculacionFK_IdValorClienteVinculacion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					informacioneconomicaLogic.getInformacionEconomicasFK_IdValorClienteVinculacion(finalQueryGlobal,pagination,idvalorclientevinculacionFK_IdValorClienteVinculacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=InformacionEconomicaConstantesFunciones.getDetalleIndiceFK_IdValorClienteVinculacion(idvalorclientevinculacionFK_IdValorClienteVinculacion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=InformacionEconomicaConstantesFunciones.getDetalleIndiceFK_IdValorClienteVinculacion(idvalorclientevinculacionFK_IdValorClienteVinculacion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=informacioneconomicaLogic.getInformacionEconomicas()==null||informacioneconomicaLogic.getInformacionEconomicas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=informacioneconomicas==null|| informacioneconomicas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						informacioneconomicasAux=new ArrayList<InformacionEconomica>();
						informacioneconomicasAux.addAll(informacioneconomicaLogic.getInformacionEconomicas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacioneconomicasAux=new ArrayList<InformacionEconomica>();
							informacioneconomicasAux.addAll(informacioneconomicas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							informacioneconomicaLogic.getInformacionEconomicasFK_IdValorClienteVinculacion(finalQueryGlobal,pagination,idvalorclientevinculacionFK_IdValorClienteVinculacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=InformacionEconomicaConstantesFunciones.getDetalleIndiceFK_IdValorClienteVinculacion(idvalorclientevinculacionFK_IdValorClienteVinculacion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=InformacionEconomicaConstantesFunciones.getDetalleIndiceFK_IdValorClienteVinculacion(idvalorclientevinculacionFK_IdValorClienteVinculacion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteInformacionEconomicas("FK_IdValorClienteVinculacion",informacioneconomicaLogic.getInformacionEconomicas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteInformacionEconomicas("FK_IdValorClienteVinculacion",informacioneconomicas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						informacioneconomicaLogic.setInformacionEconomicas(new ArrayList<InformacionEconomica>());
						informacioneconomicaLogic.getInformacionEconomicas().addAll(informacioneconomicasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacioneconomicas=new ArrayList<InformacionEconomica>();
							informacioneconomicas.addAll(informacioneconomicasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesInformacionEconomica();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessInformacionEconomica();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=informacioneconomicaLogic.getInformacionEconomicas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=informacioneconomicas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=informacioneconomicaLogic.getInformacionEconomicas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=informacioneconomicas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(InformacionEconomica informacioneconomica) {
		Boolean permite=true;
		
		if(this.informacioneconomica.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=InformacionEconomicaConstantesFunciones.getOrderByListaInformacionEconomica();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=InformacionEconomicaConstantesFunciones.getOrderByListaInformacionEconomica();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(InformacionEconomica informacioneconomica:informacioneconomicaLogic.getInformacionEconomicas()) {
				if(informacioneconomica.getsType().equals(Constantes2.S_TOTALES)) {
					informacioneconomicaTotales=informacioneconomica;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(InformacionEconomica informacioneconomica:this.informacioneconomicas) {
				if(informacioneconomica.getsType().equals(Constantes2.S_TOTALES)) {
					informacioneconomicaTotales=informacioneconomica;
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
			this.informacioneconomicaAux=new InformacionEconomica();
			this.informacioneconomicaAux.setsType(Constantes2.S_TOTALES);
			this.informacioneconomicaAux.setIsNew(false);
			this.informacioneconomicaAux.setIsChanged(false);
			this.informacioneconomicaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				InformacionEconomicaConstantesFunciones.TotalizarValoresFilaInformacionEconomica(this.informacioneconomicaLogic.getInformacionEconomicas(),this.informacioneconomicaAux);
				
				this.informacioneconomicaLogic.getInformacionEconomicas().add(this.informacioneconomicaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				InformacionEconomicaConstantesFunciones.TotalizarValoresFilaInformacionEconomica(this.informacioneconomicas,this.informacioneconomicaAux);
				
				this.informacioneconomicas.add(this.informacioneconomicaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		informacioneconomicaTotales=new InformacionEconomica();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.informacioneconomicaLogic.getInformacionEconomicas().remove(informacioneconomicaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.informacioneconomicas.remove(informacioneconomicaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		informacioneconomicaTotales=new InformacionEconomica();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(InformacionEconomica informacioneconomica:informacioneconomicaLogic.getInformacionEconomicas()) {
				if(informacioneconomica.getsType().equals(Constantes2.S_TOTALES)) {
					informacioneconomicaTotales=informacioneconomica;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				InformacionEconomicaConstantesFunciones.TotalizarValoresFilaInformacionEconomica(this.informacioneconomicaLogic.getInformacionEconomicas(),informacioneconomicaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(InformacionEconomica informacioneconomica:this.informacioneconomicas) {
				if(informacioneconomica.getsType().equals(Constantes2.S_TOTALES)) {
					informacioneconomicaTotales=informacioneconomica;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				InformacionEconomicaConstantesFunciones.TotalizarValoresFilaInformacionEconomica(this.informacioneconomicas,informacioneconomicaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getInformacionEconomicasFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getInformacionEconomicasFK_IdValorClienteVinculacion()throws Exception {
		try {
			sAccionBusqueda="FK_IdValorClienteVinculacion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getInformacionEconomicasFK_IdCliente(String sFinalQuery,Long idcliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					informacioneconomicaLogic.getInformacionEconomicasFK_IdCliente(sFinalQuery,this.pagination,idcliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getInformacionEconomicasFK_IdValorClienteVinculacion(String sFinalQuery,Long idvalorclientevinculacion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					informacioneconomicaLogic.getInformacionEconomicasFK_IdValorClienteVinculacion(sFinalQuery,this.pagination,idvalorclientevinculacion);
				
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
	
	public void inicializarPermisosInformacionEconomica() {
		this.isPermisoTodoInformacionEconomica=false;
		this.isPermisoNuevoInformacionEconomica=false;
		this.isPermisoActualizarInformacionEconomica=false;
		this.isPermisoActualizarOriginalInformacionEconomica=false;
		this.isPermisoEliminarInformacionEconomica=false;
		this.isPermisoGuardarCambiosInformacionEconomica=false;
		this.isPermisoConsultaInformacionEconomica=false;
		this.isPermisoBusquedaInformacionEconomica=false;
		this.isPermisoReporteInformacionEconomica=false;		
		this.isPermisoOrdenInformacionEconomica=false;		
		this.isPermisoPaginacionMedioInformacionEconomica=false;		
		this.isPermisoPaginacionAltoInformacionEconomica=false;
		this.isPermisoPaginacionTodoInformacionEconomica=false;
		this.isPermisoCopiarInformacionEconomica=false;		
		this.isPermisoVerFormInformacionEconomica=false;		
		this.isPermisoDuplicarInformacionEconomica=false;		
		this.isPermisoOrdenInformacionEconomica=false;		
	}
	
	public void setPermisosUsuarioInformacionEconomica(Boolean isPermiso) {
		this.isPermisoTodoInformacionEconomica=isPermiso;
		this.isPermisoNuevoInformacionEconomica=isPermiso;
		this.isPermisoActualizarInformacionEconomica=isPermiso;
		this.isPermisoActualizarOriginalInformacionEconomica=isPermiso;
		this.isPermisoEliminarInformacionEconomica=isPermiso;
		this.isPermisoGuardarCambiosInformacionEconomica=isPermiso;
		this.isPermisoConsultaInformacionEconomica=isPermiso;
		this.isPermisoBusquedaInformacionEconomica=isPermiso;
		this.isPermisoReporteInformacionEconomica=isPermiso;
		this.isPermisoOrdenInformacionEconomica=isPermiso;		
		this.isPermisoPaginacionMedioInformacionEconomica=isPermiso;		
		this.isPermisoPaginacionAltoInformacionEconomica=isPermiso;		
		this.isPermisoPaginacionTodoInformacionEconomica=isPermiso;		
		this.isPermisoCopiarInformacionEconomica=isPermiso;		
		this.isPermisoVerFormInformacionEconomica=isPermiso;		
		this.isPermisoDuplicarInformacionEconomica=isPermiso;
		this.isPermisoOrdenInformacionEconomica=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioInformacionEconomica(Boolean isPermiso) {
		//this.isPermisoTodoInformacionEconomica=isPermiso;
		this.isPermisoNuevoInformacionEconomica=isPermiso;
		this.isPermisoActualizarInformacionEconomica=isPermiso;
		this.isPermisoActualizarOriginalInformacionEconomica=isPermiso;
		this.isPermisoEliminarInformacionEconomica=isPermiso;
		this.isPermisoGuardarCambiosInformacionEconomica=isPermiso;
		//this.isPermisoConsultaInformacionEconomica=isPermiso;
		//this.isPermisoBusquedaInformacionEconomica=isPermiso;
		//this.isPermisoReporteInformacionEconomica=isPermiso;
		//this.isPermisoOrdenInformacionEconomica=isPermiso;		
		//this.isPermisoPaginacionMedioInformacionEconomica=isPermiso;		
		//this.isPermisoPaginacionAltoInformacionEconomica=isPermiso;		
		//this.isPermisoPaginacionTodoInformacionEconomica=isPermiso;		
		//this.isPermisoCopiarInformacionEconomica=isPermiso;		
		//this.isPermisoDuplicarInformacionEconomica=isPermiso;
		//this.isPermisoOrdenInformacionEconomica=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioInformacionEconomicaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(InformacionEconomicaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebInformacionEconomica(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioInformacionEconomicaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioInformacionEconomicaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionInformacionEconomicaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioInformacionEconomicaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioInformacionEconomica() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(InformacionEconomicaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, InformacionEconomicaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoInformacionEconomica=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarInformacionEconomica=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalInformacionEconomica=this.isPermisoActualizarInformacionEconomica;
			this.isPermisoEliminarInformacionEconomica=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosInformacionEconomica=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaInformacionEconomica=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaInformacionEconomica=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoInformacionEconomica=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteInformacionEconomica=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenInformacionEconomica=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioInformacionEconomica=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoInformacionEconomica=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoInformacionEconomica=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarInformacionEconomica=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormInformacionEconomica=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarInformacionEconomica=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenInformacionEconomica=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosInformacionEconomica.setToolTipText(this.jTableDatosInformacionEconomica.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioInformacionEconomica(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioInformacionEconomica(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(InformacionEconomicaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(InformacionEconomicaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioInformacionEconomica() throws Exception {
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
	public void inicializarCombosForeignKeyInformacionEconomicaListas()throws Exception {
		try	{						
			
				this.clientesForeignKey=new ArrayList();
				this.tipovinculacionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyInformacionEconomicaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(InformacionEconomicaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyInformacionEconomicaListas(false);
			} else {
			
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoVinculacionListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoVinculacionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipovinculacionsForeignKey==null||this.tipovinculacionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoVinculacionConstantesFunciones.getArrayColumnasGlobalesTipoVinculacion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoVinculacionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoVinculacionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoVinculacionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyInformacionEconomicaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			InformacionEconomicaParameterReturnGeneral informacioneconomicaReturnGeneral=new InformacionEconomicaParameterReturnGeneral();
						
			


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.informacioneconomicaConstantesFunciones.cargaridclienteInformacionEconomica)
					 || (this.esRecargarFks && this.informacioneconomicaConstantesFunciones.cargaridclienteInformacionEconomica)) {

					if(!this.informacioneconomicaSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+informacioneconomicaSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalTipoVinculacion="";

				if(((this.tipovinculacionsForeignKey==null||this.tipovinculacionsForeignKey.size()<=0) && this.informacioneconomicaConstantesFunciones.cargaridvalorclientevinculacionInformacionEconomica)
					 || (this.esRecargarFks && this.informacioneconomicaConstantesFunciones.cargaridvalorclientevinculacionInformacionEconomica)) {

					if(!this.informacioneconomicaSessionBean.getisBusquedaDesdeForeignKeySesionTipoVinculacion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoVinculacionConstantesFunciones.getArrayColumnasGlobalesTipoVinculacion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoVinculacion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoVinculacionConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoVinculacion=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoVinculacion, "");
						finalQueryGlobalTipoVinculacion+=TipoVinculacionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoVinculacionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoVinculacion=" WHERE " + ConstantesSql.ID + "="+informacioneconomicaSessionBean.getlidTipoVinculacionActual();
					}
				} else {
					finalQueryGlobalTipoVinculacion="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				informacioneconomicaReturnGeneral=informacioneconomicaLogic.cargarCombosLoteForeignKeyInformacionEconomica(finalQueryGlobalCliente,finalQueryGlobalTipoVinculacion);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=informacioneconomicaReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalTipoVinculacion.equals("NONE")) {
				this.tipovinculacionsForeignKey=informacioneconomicaReturnGeneral.gettipovinculacionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyInformacionEconomica()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyTipoVinculacion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {
			if(this.informacioneconomicaSessionBean==null) {
				this.informacioneconomicaSessionBean=new InformacionEconomicaSessionBean();
			}

			if(!this.informacioneconomicaSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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

	public void addItemDefectoCombosForeignKeyTipoVinculacion()throws Exception {
		try {

			if(!this.informacioneconomicaSessionBean.getisBusquedaDesdeForeignKeySesionTipoVinculacion()) {
				TipoVinculacion tipovinculacion=new TipoVinculacion();
				TipoVinculacionConstantesFunciones.setTipoVinculacionDescripcion(tipovinculacion,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipovinculacion.setId(null);

				if(!TipoVinculacionConstantesFunciones.ExisteEnLista(this.tipovinculacionsForeignKey,tipovinculacion,true)) {

					this.tipovinculacionsForeignKey.add(0,tipovinculacion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyInformacionEconomica()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyInformacionEconomica(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyInformacionEconomica()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyInformacionEconomica();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyInformacionEconomica(InformacionEconomica informacioneconomica)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(informacioneconomica.getidcliente(),false,"Formulario");
			this.setActualTipoVinculacionForeignKey(informacioneconomica.getidvalorclientevinculacion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyInformacionEconomica(InformacionEconomica informacioneconomica,String sTipoEvento)throws Exception {	
		try {
			
			

				if(informacioneconomica.getCliente()!=null && !sTipoEvento.equals("idclienteInformacionEconomica")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(informacioneconomica.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyInformacionEconomica()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.informacioneconomicaConstantesFunciones.getidcliente(),false,"Formulario");
			this.setActualTipoVinculacionForeignKey(this.informacioneconomicaConstantesFunciones.getidvalorclientevinculacion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyInformacionEconomica()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyInformacionEconomica()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyInformacionEconomica()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroInformacionEconomica()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyInformacionEconomica()throws Exception {
		try {
			

			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameTipoVinculacionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyInformacionEconomica(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoVinculacionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyInformacionEconomica()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxidclienteInformacionEconomica!=null && this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxidclienteInformacionEconomica.getItemCount()>0) {
				this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxidclienteInformacionEconomica.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxidvalorclientevinculacionInformacionEconomica!=null && this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxidvalorclientevinculacionInformacionEconomica.getItemCount()>0) {
				this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxidvalorclientevinculacionInformacionEconomica.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public InformacionEconomicaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public InformacionEconomicaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public InformacionEconomicaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.informacioneconomicaSessionBean=new InformacionEconomicaSessionBean(); 
		this.informacioneconomicaConstantesFunciones=new InformacionEconomicaConstantesFunciones(); 
		this.informacioneconomicaBean=new InformacionEconomica();//(this.informacioneconomicaConstantesFunciones); 		
		this.informacioneconomicaReturnGeneral=new InformacionEconomicaParameterReturnGeneral(); 
		
		this.informacioneconomicaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.informacioneconomicaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public InformacionEconomicaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public InformacionEconomicaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public InformacionEconomicaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessInformacionEconomica(true);
			
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
			
			this.informacioneconomicaConstantesFunciones=new InformacionEconomicaConstantesFunciones(); 
			this.informacioneconomicaBean=new InformacionEconomica();//this.informacioneconomicaConstantesFunciones); 			
			this.informacioneconomicaReturnGeneral=new InformacionEconomicaParameterReturnGeneral(); 
		
			InformacionEconomicaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Informacion Economica Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.informacioneconomica=new InformacionEconomica();
			this.informacioneconomicas = new ArrayList<InformacionEconomica>();
			this.informacioneconomicasAux = new ArrayList<InformacionEconomica>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic=new InformacionEconomicaLogic();
				this.informacioneconomicaLogic.getNewConnexionToDeep("");
			}
			
			//this.informacioneconomicaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.informacioneconomicaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormInformacionEconomica);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoInformacionEconomica!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoInformacionEconomica);	
					}
					
					if(this.jInternalFrameImportacionInformacionEconomica!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionInformacionEconomica);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByInformacionEconomica!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByInformacionEconomica);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormInformacionEconomica!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormInformacionEconomica);
				this.jInternalFrameDetalleFormInformacionEconomica.setVisible(false);
				this.jInternalFrameDetalleFormInformacionEconomica.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoInformacionEconomica!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoInformacionEconomica);
					this.jInternalFrameReporteDinamicoInformacionEconomica.setVisible(false);
					this.jInternalFrameReporteDinamicoInformacionEconomica.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionInformacionEconomica!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionInformacionEconomica);
					this.jInternalFrameImportacionInformacionEconomica.setVisible(false);
					this.jInternalFrameImportacionInformacionEconomica.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByInformacionEconomica!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByInformacionEconomica);
					this.jInternalFrameOrderByInformacionEconomica.setVisible(false);
					this.jInternalFrameOrderByInformacionEconomica.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idInformacionEconomicaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=InformacionEconomicaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.informacioneconomicaReturnGeneral=new InformacionEconomicaParameterReturnGeneral();
			
			this.informacioneconomicaParameterGeneral=new InformacionEconomicaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.informacioneconomicaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(InformacionEconomicaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,InformacionEconomicaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.informacioneconomicaSessionBean.getEsGuardarRelacionado(),this.informacioneconomicaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,InformacionEconomicaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.informacioneconomicaSessionBean.getEsGuardarRelacionado(),this.informacioneconomicaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoInformacionEconomica=false;
			this.isVisibilidadCeldaDuplicarInformacionEconomica=true;
			this.isVisibilidadCeldaCopiarInformacionEconomica=true;
			this.isVisibilidadCeldaVerFormInformacionEconomica=true;
			this.isVisibilidadCeldaOrdenInformacionEconomica=true;
			this.isVisibilidadCeldaNuevoRelacionesInformacionEconomica=false;
			this.isVisibilidadCeldaModificarInformacionEconomica=false;
			this.isVisibilidadCeldaActualizarInformacionEconomica=false;
			this.isVisibilidadCeldaEliminarInformacionEconomica=false;
			this.isVisibilidadCeldaCancelarInformacionEconomica=false;
			this.isVisibilidadCeldaGuardarInformacionEconomica=false;
			this.isVisibilidadCeldaGuardarCambiosInformacionEconomica=false;
			
			
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdValorClienteVinculacion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesInformacionEconomica("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosInformacionEconomica();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioInformacionEconomica(false);
			
			this.setPermisosUsuarioInformacionEconomica();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.informacioneconomicaSessionBean.getEsGuardarRelacionado() 
				|| (this.informacioneconomicaSessionBean.getEsGuardarRelacionado() && this.informacioneconomicaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioInformacionEconomicaClasesRelacionadas();
			}
			
			if(this.informacioneconomicaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioInformacionEconomicaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!InformacionEconomicaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosInformacionEconomica();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualInformacionEconomica();
			}
			
			if(!this.isPermisoBusquedaInformacionEconomica) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasInformacionEconomica.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioInformacionEconomica,this.isPermisoPaginacionMedioInformacionEconomica,this.isPermisoPaginacionTodoInformacionEconomica);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(InformacionEconomicaConstantesFunciones.getTiposSeleccionarInformacionEconomica());
				
				this.tiposColumnasSelect=InformacionEconomicaConstantesFunciones.getTiposSeleccionarInformacionEconomica(true);
				
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
			//if(!this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioInformacionEconomica();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioInformacionEconomica(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioInformacionEconomica(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesInformacionEconomica() ;
			
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
			this.tipovinculacionLogic=new TipoVinculacionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				informacioneconomicaImplementable= (InformacionEconomicaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+InformacionEconomicaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				informacioneconomicaImplementableHome= (InformacionEconomicaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+InformacionEconomicaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.informacioneconomicas= new ArrayList<InformacionEconomica>();
			this.informacioneconomicasEliminados= new ArrayList<InformacionEconomica>();
						
			this.isEsNuevoInformacionEconomica=false;
			this.esParaAccionDesdeFormularioInformacionEconomica=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.tipovinculacionsForeignKey=new ArrayList<TipoVinculacion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyInformacionEconomica(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroInformacionEconomica();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			InformacionEconomicaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=InformacionEconomicaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesInformacionEconomica("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingInformacionEconomica(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormInformacionEconomica!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioInformacionEconomica();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioInformacionEconomica();
			}
			
			InformacionEconomicaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasInformacionEconomica.getTabCount(); i++) {
					this.jTabbedPaneBusquedasInformacionEconomica.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasInformacionEconomica.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessInformacionEconomica(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga InformacionEconomica: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectInformacionEconomica() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesInformacionEconomica")) {
				iIndex=this.jInternalFrameDetalleFormInformacionEconomica.jTabbedPaneRelacionesInformacionEconomica.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormInformacionEconomica.jTabbedPaneRelacionesInformacionEconomica.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosInformacionEconomica.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessInformacionEconomica();	
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
	
	public void cargarCombosForeignKeyInformacionEconomica(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyInformacionEconomica(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyInformacionEconomica(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyInformacionEconomicaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyInformacionEconomica();
		
		this.cargarCombosFrameForeignKeyInformacionEconomica();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyInformacionEconomica();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyInformacionEconomica();
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

	public void cargarCombosForeignKeyTipoVinculacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoVinculacionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoVinculacion();
				this.cargarCombosFrameTipoVinculacionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoVinculacion(this.tipovinculacionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoInformacionEconomicaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.informacioneconomicaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormInformacionEconomica==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
			
			
			if(jTableDatosInformacionEconomica.getRowCount()>=1) {
				jTableDatosInformacionEconomica.removeRowSelectionInterval(0, jTableDatosInformacionEconomica.getRowCount()-1);						
			}
			
			this.isEsNuevoInformacionEconomica=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoInformacionEconomica(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesInformacionEconomica(true);			
			//this.informacioneconomica=new InformacionEconomica();
			//this.informacioneconomica.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesInformacionEconomica(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualInformacionEconomica() ;
			
			if(InformacionEconomicaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleInformacionEconomica(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.informacioneconomica);	
			this.actualizarInformacion("INFO_PADRE",false,this.informacioneconomica);				
			
			InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
			
			if(this.informacioneconomicaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar InformacionEconomica: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarInformacionEconomicaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<InformacionEconomica> informacioneconomicasSeleccionados=new ArrayList<InformacionEconomica>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosInformacionEconomica.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosInformacionEconomica.getSelectedRows().length;			
			}
			
			informacioneconomicasSeleccionados=this.getInformacionEconomicasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoInformacionEconomica--;			
				//InformacionEconomica informacioneconomicaAux= new InformacionEconomica();			
				//informacioneconomicaAux.setId(this.iIdNuevoInformacionEconomica);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//InformacionEconomica informacioneconomicaOrigen=new InformacionEconomica();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(InformacionEconomica informacioneconomicaOrigen : informacioneconomicasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosInformacionEconomica.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							informacioneconomicaOrigen =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informacioneconomicaOrigen =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaInformacionEconomica();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.informacioneconomica.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosInformacionEconomica(informacioneconomicaOrigen,this.informacioneconomica,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionEconomica(this.informacioneconomica);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.informacioneconomicaLogic.getInformacionEconomicas().add(this.informacioneconomicaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.informacioneconomicas.add(this.informacioneconomicaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaInformacionEconomica(false);
				
				this.jTableDatosInformacionEconomica.setRowSelectionInterval(this.getIndiceNuevoInformacionEconomica(), this.getIndiceNuevoInformacionEconomica());
				
				int iLastRow =  this.jTableDatosInformacionEconomica.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosInformacionEconomica.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosInformacionEconomica.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaInformacionEconomica(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarInformacionEconomicaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<InformacionEconomica> informacioneconomicasSeleccionados=new ArrayList<InformacionEconomica>();									
		
			InformacionEconomica informacioneconomicaOrigen=new InformacionEconomica();
			InformacionEconomica informacioneconomicaDestino=new InformacionEconomica();
				
			informacioneconomicasSeleccionados=this.getInformacionEconomicasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosInformacionEconomica.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || informacioneconomicasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosInformacionEconomica.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						informacioneconomicaOrigen =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						informacioneconomicaOrigen =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						informacioneconomicaDestino =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						informacioneconomicaDestino =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				informacioneconomicaOrigen =informacioneconomicasSeleccionados.get(0);
				informacioneconomicaDestino =informacioneconomicasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosInformacionEconomica(informacioneconomicaOrigen,informacioneconomicaDestino,true,false);
				
				informacioneconomicaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(informacioneconomicaDestino,informacioneconomicaLogic.getInformacionEconomicas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(informacioneconomicaDestino,informacioneconomicas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaInformacionEconomica(false);
				
				//this.jTableDatosInformacionEconomica.setRowSelectionInterval(this.getIndiceNuevoInformacionEconomica(), this.getIndiceNuevoInformacionEconomica());
				
				int iLastRow =  this.jTableDatosInformacionEconomica.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosInformacionEconomica.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosInformacionEconomica.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaInformacionEconomica(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormInformacionEconomicaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormInformacionEconomica==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormInformacionEconomica.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarInformacionEconomicaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesInformacionEconomica.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasInformacionEconomica.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesInformacionEconomica.setVisible(!isVisible);
			this.jPanelPaginacionInformacionEconomica.setVisible(!isVisible);
			this.jPanelAccionesInformacionEconomica.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarInformacionEconomicaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameInformacionEconomica();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoInformacionEconomicaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoInformacionEconomica();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionInformacionEconomicaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionInformacionEconomica();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByInformacionEconomicaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByInformacionEconomica();
			
			this.abrirFrameOrderByInformacionEconomica();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByInformacionEconomicaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByInformacionEconomica();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleInformacionEconomica(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormInformacionEconomica);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormInformacionEconomica.isMaximum()) {
					this.jInternalFrameDetalleFormInformacionEconomica.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormInformacionEconomica.setSize(this.jInternalFrameDetalleFormInformacionEconomica.iWidthFormulario,this.jInternalFrameDetalleFormInformacionEconomica.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormInformacionEconomica.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormInformacionEconomica.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormInformacionEconomica.isMaximum()) {
						this.jInternalFrameDetalleFormInformacionEconomica.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormInformacionEconomica.jContentPaneDetalleInformacionEconomica.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormInformacionEconomica.jTabbedPaneRelacionesInformacionEconomica.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormInformacionEconomica.jContentPaneDetalleInformacionEconomica.getWidth(),InformacionEconomicaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormInformacionEconomica.jTabbedPaneRelacionesInformacionEconomica.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormInformacionEconomica.jContentPaneDetalleInformacionEconomica.getWidth(),InformacionEconomicaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormInformacionEconomica.jTabbedPaneRelacionesInformacionEconomica.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormInformacionEconomica.jContentPaneDetalleInformacionEconomica.getWidth(),InformacionEconomicaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormInformacionEconomica.setVisible(true);
	        this.jInternalFrameDetalleFormInformacionEconomica.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByInformacionEconomica() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByInformacionEconomica==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByInformacionEconomica=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByInformacionEconomica,false,this);
				} else {
					this.jInternalFrameOrderByInformacionEconomica=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByInformacionEconomica,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByInformacionEconomica);
				this.jInternalFrameOrderByInformacionEconomica.setVisible(false);
				this.jInternalFrameOrderByInformacionEconomica.setSelected(false);
				
				this.jInternalFrameOrderByInformacionEconomica.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByInformacionEconomica"));
				
				this.inicializarActualizarBindingTablaOrderByInformacionEconomica();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionInformacionEconomica() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionInformacionEconomica==null) {
				
				this.jInternalFrameImportacionInformacionEconomica=new ImportacionJInternalFrame(InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionInformacionEconomica);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionInformacionEconomica);
				this.jInternalFrameImportacionInformacionEconomica.setVisible(false);
				this.jInternalFrameImportacionInformacionEconomica.setSelected(false);


				this.jInternalFrameImportacionInformacionEconomica.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionInformacionEconomica"));
				this.jInternalFrameImportacionInformacionEconomica.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionInformacionEconomica"));
				this.jInternalFrameImportacionInformacionEconomica.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionInformacionEconomica"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoInformacionEconomica() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoInformacionEconomica==null) {
				this.jInternalFrameReporteDinamicoInformacionEconomica=new ReporteDinamicoJInternalFrame(InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoInformacionEconomica);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoInformacionEconomica);
				this.jInternalFrameReporteDinamicoInformacionEconomica.setVisible(false);
				this.jInternalFrameReporteDinamicoInformacionEconomica.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoInformacionEconomica.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoInformacionEconomica"));
				this.jInternalFrameReporteDinamicoInformacionEconomica.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoInformacionEconomica"));
				this.jInternalFrameReporteDinamicoInformacionEconomica.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoInformacionEconomica"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualInformacionEconomica();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleInformacionEconomica() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormInformacionEconomica);
			
	       	this.jInternalFrameDetalleFormInformacionEconomica.setVisible(false);
	        this.jInternalFrameDetalleFormInformacionEconomica.setSelected(false);
			
			//this.jInternalFrameDetalleFormInformacionEconomica.dispose();
			//this.jInternalFrameDetalleFormInformacionEconomica=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoInformacionEconomica() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoInformacionEconomica.setVisible(true);
	        this.jInternalFrameReporteDinamicoInformacionEconomica.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionInformacionEconomica() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionInformacionEconomica.setVisible(true);
	        this.jInternalFrameImportacionInformacionEconomica.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByInformacionEconomica() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByInformacionEconomica.setVisible(true);
	        this.jInternalFrameOrderByInformacionEconomica.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByInformacionEconomica() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByInformacionEconomica.setVisible(false);
	        this.jInternalFrameOrderByInformacionEconomica.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoInformacionEconomica() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoInformacionEconomica.setVisible(false);
	        this.jInternalFrameReporteDinamicoInformacionEconomica.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionInformacionEconomica() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionInformacionEconomica.setVisible(false);
	        this.jInternalFrameImportacionInformacionEconomica.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarInformacionEconomicaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarInformacionEconomica(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarInformacionEconomica(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosInformacionEconomica.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesInformacionEconomica(true);
			//this.isEsNuevoInformacionEconomica=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomica =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.informacioneconomica =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesInformacionEconomica("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesInformacionEconomica(false) ;
			
			if(informacioneconomicaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(InformacionEconomicaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleInformacionEconomica(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualInformacionEconomica(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaInformacionEconomicaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosInformacionEconomica.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomica =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informacioneconomica =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarInformacionEconomica(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormInformacionEconomica==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosInformacionEconomica.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesInformacionEconomica(true);
			//this.isEsNuevoInformacionEconomica=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomica =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.informacioneconomica =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.informacioneconomica.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesInformacionEconomica("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesInformacionEconomica(false) ;
			
			if(InformacionEconomicaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleInformacionEconomica(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualInformacionEconomica(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.informacioneconomicaConstantesFunciones.cargaridclienteInformacionEconomica) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingInformacionEconomica(false,false);
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
		TableColumn tableColumnCliente=this.jTableDatosInformacionEconomica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionEconomica,InformacionEconomicaConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosInformacionEconomica.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoVinculacion(List<TipoVinculacion> tipovinculacionsForeignKey)throws Exception{
		TableColumn tableColumnTipoVinculacion=this.jTableDatosInformacionEconomica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionEconomica,InformacionEconomicaConstantesFunciones.LABEL_IDTIPOVINCULACION));
		TableCellEditor tableCellEditorTipoVinculacion =tableColumnTipoVinculacion.getCellEditor();

		TipoVinculacionTableCell tipovinculacionTableCellFk=(TipoVinculacionTableCell)tableCellEditorTipoVinculacion;

		if(tipovinculacionTableCellFk!=null) {
			tipovinculacionTableCellFk.settipovinculacionsForeignKey(tipovinculacionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosInformacionEconomica.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipovinculacionTableCellFk.setRowActual(intSelectedRow);
			//tipovinculacionTableCellFk.settipovinculacionsForeignKeyActual(tipovinculacionsForeignKey);
		//}


		if(tipovinculacionTableCellFk!=null) {
			tipovinculacionTableCellFk.RecargarTipoVinculacionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaidcliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarInformacionEconomicaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesInformacionEconomica(false);
			
			//if(!this.isEsNuevoInformacionEconomica) {								
				int intSelectedRow = this.jTableDatosInformacionEconomica.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomica =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.informacioneconomica =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(InformacionEconomicaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualInformacionEconomica(this.informacioneconomica,true);
				this.setVariablesFormularioToObjetoActualForeignKeysInformacionEconomica(this.informacioneconomica);
				
			}
			
			if(this.permiteMantenimiento(this.informacioneconomica)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoInformacionEconomica=true;
					this.inicializarActualizarBindingTablaInformacionEconomica(false);
					this.isEsNuevoInformacionEconomica=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoInformacionEconomica=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoInformacionEconomica=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesInformacionEconomica(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualInformacionEconomica(false);
				
				this.habilitarDeshabilitarControlesInformacionEconomica(false);
			
												
				
				if(InformacionEconomicaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleInformacionEconomica();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoInformacionEconomicaActionPerformed(evt,informacioneconomicaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualInformacionEconomica(this.informacioneconomica,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosInformacionEconomica.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,informacioneconomicaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.informacioneconomica.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(InformacionEconomica.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionEconomica.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarInformacionEconomicaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosInformacionEconomica.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomica =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
				this.informacioneconomica.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.informacioneconomica =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
				this.informacioneconomica.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.informacioneconomica)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((InformacionEconomicaModel) this.jTableDatosInformacionEconomica.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoInformacionEconomica=true;
				this.inicializarActualizarBindingTablaInformacionEconomica(false);
				this.isEsNuevoInformacionEconomica=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesInformacionEconomica(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualInformacionEconomica(false);
				
				this.habilitarDeshabilitarControlesInformacionEconomica(false);
				
				
				
				if(InformacionEconomicaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleInformacionEconomica();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarInformacionEconomicaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosInformacionEconomica.getRowCount()>=1) {
				jTableDatosInformacionEconomica.removeRowSelectionInterval(0, jTableDatosInformacionEconomica.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesInformacionEconomica(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaInformacionEconomica(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesInformacionEconomica(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualInformacionEconomica(false) ;
			
			this.isEsNuevoInformacionEconomica=false;
			
			if(InformacionEconomicaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleInformacionEconomica();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosInformacionEconomicaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingInformacionEconomica(false);
				
				//SI ES MANUAL
				if(InformacionEconomicaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualInformacionEconomica();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosInformacionEconomicaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoInformacionEconomica--;			
			//InformacionEconomica informacioneconomicaAux= new InformacionEconomica();			
			//informacioneconomicaAux.setId(this.iIdNuevoInformacionEconomica);
			
			if(this.jInternalFrameDetalleFormInformacionEconomica==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaInformacionEconomica();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysInformacionEconomica(this.informacioneconomica);
			
			this.informacioneconomica.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.informacioneconomicaLogic.getInformacionEconomicas().add(this.informacioneconomicaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.informacioneconomicas.add(this.informacioneconomicaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaInformacionEconomica(false);
			
			this.jTableDatosInformacionEconomica.setRowSelectionInterval(this.getIndiceNuevoInformacionEconomica(), this.getIndiceNuevoInformacionEconomica());
			
			int iLastRow =  this.jTableDatosInformacionEconomica.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosInformacionEconomica.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosInformacionEconomica.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaInformacionEconomica(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionInformacionEconomicaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingInformacionEconomica(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingInformacionEconomica(false);
			
			//SI ES MANUAL
			if(InformacionEconomicaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualInformacionEconomica();
			}
			
			//this.abrirFrameTreeInformacionEconomica();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionInformacionEconomicaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Informacion EconomicaS ?", "MANTENIMIENTO DE Informacion Economica", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionInformacionEconomica.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralInformacionEconomica();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.informacioneconomicaReturnGeneral=informacioneconomicaLogic.procesarImportacionInformacionEconomicasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.informacioneconomicaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarInformacionEconomicaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionInformacionEconomicaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionInformacionEconomica.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionInformacionEconomica.setFileImportacion(this.jInternalFrameImportacionInformacionEconomica.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionInformacionEconomica.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionInformacionEconomica.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionInformacionEconomica.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionInformacionEconomica.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoInformacionEconomicaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<InformacionEconomica> informacioneconomicasSeleccionados=new ArrayList<InformacionEconomica>();		

		informacioneconomicasSeleccionados=this.getInformacionEconomicasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoInformacionEconomica.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoInformacionEconomica.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("InformacionEconomicaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"InformacionEconomicaBaseDesign.jrxml";
			
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
			
			this.generarReporteInformacionEconomicas("Todos",informacioneconomicasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informacion Economica",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoInformacionEconomica.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoInformacionEconomica.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case InformacionEconomicaConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformacionEconomicaConstantesFunciones.LABEL_IDTIPOVINCULACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoVinculacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoVinculacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoVinculacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoVinculacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformacionEconomicaConstantesFunciones.LABEL_CODIGOACTUALIZACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoActualizacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoActualizacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoActualizacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoActualizacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformacionEconomicaConstantesFunciones.LABEL_CODIGODESTINOFINANCIERO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoDestinoFinanciero_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoDestinoFinanciero_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoDestinoFinanciero_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoDestinoFinanciero_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformacionEconomicaConstantesFunciones.LABEL_ORIGENRECURSOS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_igenRecursos_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_igenRecursos_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_igenRecursos_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_igenRecursos_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformacionEconomicaConstantesFunciones.LABEL_CUASAVINCULACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_asaVinculacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_asaVinculacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_asaVinculacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_asaVinculacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformacionEconomicaConstantesFunciones.LABEL_SECTORIZACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ctorizacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ctorizacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ctorizacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ctorizacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformacionEconomicaConstantesFunciones.LABEL_ESACTIVO:
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
		
		if(this.jInternalFrameReporteDinamicoInformacionEconomica.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoInformacionEconomica.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoInformacionEconomica.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case InformacionEconomicaConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="idcliente";
					break;

				case InformacionEconomicaConstantesFunciones.LABEL_IDTIPOVINCULACION:
					sNombreCampoCategoria="idvalorclientevinculacion";
					break;

				case InformacionEconomicaConstantesFunciones.LABEL_CODIGOACTUALIZACION:
					sNombreCampoCategoria="codigoactualizacion";
					break;

				case InformacionEconomicaConstantesFunciones.LABEL_CODIGODESTINOFINANCIERO:
					sNombreCampoCategoria="codigodestinofinanciero";
					break;

				case InformacionEconomicaConstantesFunciones.LABEL_ORIGENRECURSOS:
					sNombreCampoCategoria="origenrecursos";
					break;

				case InformacionEconomicaConstantesFunciones.LABEL_CUASAVINCULACION:
					sNombreCampoCategoria="cuasavinculacion";
					break;

				case InformacionEconomicaConstantesFunciones.LABEL_SECTORIZACION:
					sNombreCampoCategoria="sectorizacion";
					break;

				case InformacionEconomicaConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoria="esactivo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoInformacionEconomica.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case InformacionEconomicaConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="idcliente";
					break;

				case InformacionEconomicaConstantesFunciones.LABEL_IDTIPOVINCULACION:
					sNombreCampoCategoriaValor="idvalorclientevinculacion";
					break;

				case InformacionEconomicaConstantesFunciones.LABEL_CODIGOACTUALIZACION:
					sNombreCampoCategoriaValor="codigoactualizacion";
					break;

				case InformacionEconomicaConstantesFunciones.LABEL_CODIGODESTINOFINANCIERO:
					sNombreCampoCategoriaValor="codigodestinofinanciero";
					break;

				case InformacionEconomicaConstantesFunciones.LABEL_ORIGENRECURSOS:
					sNombreCampoCategoriaValor="origenrecursos";
					break;

				case InformacionEconomicaConstantesFunciones.LABEL_CUASAVINCULACION:
					sNombreCampoCategoriaValor="cuasavinculacion";
					break;

				case InformacionEconomicaConstantesFunciones.LABEL_SECTORIZACION:
					sNombreCampoCategoriaValor="sectorizacion";
					break;

				case InformacionEconomicaConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoriaValor="esactivo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoInformacionEconomica.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoInformacionEconomica.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case InformacionEconomicaConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"idcliente");
					break;

				case InformacionEconomicaConstantesFunciones.LABEL_IDTIPOVINCULACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Vinculacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"idvalorclientevinculacion");
					break;

				case InformacionEconomicaConstantesFunciones.LABEL_CODIGOACTUALIZACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Actualizacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigoactualizacion");
					break;

				case InformacionEconomicaConstantesFunciones.LABEL_CODIGODESTINOFINANCIERO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Destino Financiero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigodestinofinanciero");
					break;

				case InformacionEconomicaConstantesFunciones.LABEL_ORIGENRECURSOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Origen Recursos",sNombreCampoCategoria,sNombreCampoCategoriaValor,"origenrecursos");
					break;

				case InformacionEconomicaConstantesFunciones.LABEL_CUASAVINCULACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuasa Vinculacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cuasavinculacion");
					break;

				case InformacionEconomicaConstantesFunciones.LABEL_SECTORIZACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sectorizacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"sectorizacion");
					break;

				case InformacionEconomicaConstantesFunciones.LABEL_ESACTIVO:
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
	
	public void jButtonGenerarExcelReporteDinamicoInformacionEconomicaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<InformacionEconomica> informacioneconomicasSeleccionados=new ArrayList<InformacionEconomica>();		
		
		informacioneconomicasSeleccionados=this.getInformacionEconomicasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"informacioneconomica";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("InformacionEconomicas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoInformacionEconomica.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoInformacionEconomica.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case InformacionEconomicaConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformacionEconomicaConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(InformacionEconomica informacioneconomica:informacioneconomicasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informacioneconomica.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformacionEconomicaConstantesFunciones.LABEL_IDTIPOVINCULACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformacionEconomicaConstantesFunciones.LABEL_IDTIPOVINCULACION);
					iRow++;

					for(InformacionEconomica informacioneconomica:informacioneconomicasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informacioneconomica.gettipovinculacion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformacionEconomicaConstantesFunciones.LABEL_CODIGOACTUALIZACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformacionEconomicaConstantesFunciones.LABEL_CODIGOACTUALIZACION);
					iRow++;

					for(InformacionEconomica informacioneconomica:informacioneconomicasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informacioneconomica.getcodigoactualizacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformacionEconomicaConstantesFunciones.LABEL_CODIGODESTINOFINANCIERO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformacionEconomicaConstantesFunciones.LABEL_CODIGODESTINOFINANCIERO);
					iRow++;

					for(InformacionEconomica informacioneconomica:informacioneconomicasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informacioneconomica.getcodigodestinofinanciero());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformacionEconomicaConstantesFunciones.LABEL_ORIGENRECURSOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformacionEconomicaConstantesFunciones.LABEL_ORIGENRECURSOS);
					iRow++;

					for(InformacionEconomica informacioneconomica:informacioneconomicasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informacioneconomica.getorigenrecursos());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformacionEconomicaConstantesFunciones.LABEL_CUASAVINCULACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformacionEconomicaConstantesFunciones.LABEL_CUASAVINCULACION);
					iRow++;

					for(InformacionEconomica informacioneconomica:informacioneconomicasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informacioneconomica.getcuasavinculacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformacionEconomicaConstantesFunciones.LABEL_SECTORIZACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformacionEconomicaConstantesFunciones.LABEL_SECTORIZACION);
					iRow++;

					for(InformacionEconomica informacioneconomica:informacioneconomicasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informacioneconomica.getsectorizacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformacionEconomicaConstantesFunciones.LABEL_ESACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformacionEconomicaConstantesFunciones.LABEL_ESACTIVO);
					iRow++;

					for(InformacionEconomica informacioneconomica:informacioneconomicasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informacioneconomica.getesactivo());
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
			//	this.getFilaCabeceraExportarExcelInformacionEconomica(row);				
			//	iRow++;
			//}				
			
			//for(InformacionEconomica informacioneconomicaAux:informacioneconomicasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelInformacionEconomica(informacioneconomicaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informacion Economica",JOptionPane.INFORMATION_MESSAGE);
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
				this.informacioneconomicaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingInformacionEconomica(false);
			
			//SI ES MANUAL
			if(InformacionEconomicaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualInformacionEconomica();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresInformacionEconomicaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingInformacionEconomica(false);
			
			//SI ES MANUAL
			if(InformacionEconomicaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualInformacionEconomica();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesInformacionEconomicaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingInformacionEconomica(false);
			
			//SI ES MANUAL
			if(InformacionEconomicaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualInformacionEconomica();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaInformacionEconomica() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosInformacionEconomica.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosInformacionEconomica.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosInformacionEconomica.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosInformacionEconomica.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosInformacionEconomica.setMinimumSize(dimensionMinimum);
		this.jTableDatosInformacionEconomica.setMaximumSize(dimensionMaximum);
		this.jTableDatosInformacionEconomica.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingInformacionEconomica(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingInformacionEconomica(esInicializar,true);
	}
	
	public void inicializarActualizarBindingInformacionEconomica(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaInformacionEconomica(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesInformacionEconomica(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasInformacionEconomica(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesInformacionEconomica(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesInformacionEconomica(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !InformacionEconomicaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!InformacionEconomicaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualInformacionEconomica() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaInformacionEconomica();
		
		this.inicializarActualizarBindingBotonesManualInformacionEconomica(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualInformacionEconomica();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesInformacionEconomica() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualInformacionEconomica(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualInformacionEconomica(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosInformacionEconomica.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosInformacionEconomica.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteInformacionEconomica.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormInformacionEconomica!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormInformacionEconomica.jCheckBoxPostAccionNuevoInformacionEconomica.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormInformacionEconomica.jCheckBoxPostAccionSinCerrarInformacionEconomica.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormInformacionEconomica.jCheckBoxPostAccionSinMensajeInformacionEconomica.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosInformacionEconomica.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosInformacionEconomica.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteInformacionEconomica.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormInformacionEconomica!=null) {
				this.jInternalFrameDetalleFormInformacionEconomica.jCheckBoxPostAccionNuevoInformacionEconomica.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormInformacionEconomica.jCheckBoxPostAccionSinCerrarInformacionEconomica.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormInformacionEconomica.jCheckBoxPostAccionSinMensajeInformacionEconomica.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionInformacionEconomica.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionInformacionEconomica.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormInformacionEconomica!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxTiposAccionesFormularioInformacionEconomica.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesInformacionEconomica.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoInformacionEconomica!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoInformacionEconomica.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesInformacionEconomica.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesInformacionEconomica.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarInformacionEconomica.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesInformacionEconomica.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoInformacionEconomica!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoInformacionEconomica.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesInformacionEconomica.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralInformacionEconomica.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesInformacionEconomica(Boolean esInicializar) throws Exception {
		try	{	
			if(InformacionEconomicaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualInformacionEconomica(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesInformacionEconomica() throws Exception {
		try	{
			if(InformacionEconomicaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualInformacionEconomica();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleInformacionEconomica() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxTiposAccionesFormularioInformacionEconomica.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxTiposAccionesFormularioInformacionEconomica.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualInformacionEconomica() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesInformacionEconomica.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesInformacionEconomica.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesInformacionEconomica.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesInformacionEconomica.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesInformacionEconomica.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesInformacionEconomica.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionInformacionEconomica.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionInformacionEconomica.addItem(reporte);
			}
			
			
			if(!this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionInformacionEconomica.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionInformacionEconomica.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesInformacionEconomica.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesInformacionEconomica.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesInformacionEconomica.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesInformacionEconomica.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormInformacionEconomica!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxTiposAccionesFormularioInformacionEconomica.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxTiposAccionesFormularioInformacionEconomica.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarInformacionEconomica.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarInformacionEconomica.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarInformacionEconomica.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualInformacionEconomica();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualInformacionEconomica() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoInformacionEconomica!=null) {
				this.jInternalFrameReporteDinamicoInformacionEconomica.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoInformacionEconomica.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoInformacionEconomica!=null) {
				this.jInternalFrameReporteDinamicoInformacionEconomica.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoInformacionEconomica.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoInformacionEconomica!=null) {
				
				if(this.jInternalFrameReporteDinamicoInformacionEconomica.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoInformacionEconomica.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoInformacionEconomica.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoInformacionEconomica.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoInformacionEconomica.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoInformacionEconomica.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualInformacionEconomica()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxidclienteFK_IdClienteInformacionEconomica.getSelectedItem()!=null){this.idclienteFK_IdCliente=((Cliente)this.jComboBoxidclienteFK_IdClienteInformacionEconomica.getSelectedItem()).getId();}
		if(this.jComboBoxidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomica.getSelectedItem()!=null){this.idvalorclientevinculacionFK_IdValorClienteVinculacion=((TipoVinculacion)this.jComboBoxidvalorclientevinculacionFK_IdValorClienteVinculacionInformacionEconomica.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasInformacionEconomica(Boolean esInicializar) throws Exception {				
		if(InformacionEconomicaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualInformacionEconomica();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaInformacionEconomica() throws Exception {
		this.inicializarActualizarBindingTablaInformacionEconomica(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByInformacionEconomica() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByInformacionEconomica.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByInformacionEconomica.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByInformacionEconomica.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new InformacionEconomicaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByInformacionEconomica.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByInformacionEconomica.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new InformacionEconomicaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosInformacionEconomicaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionEconomicaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new InformacionEconomicaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByInformacionEconomica.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByInformacionEconomica.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new InformacionEconomicaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByInformacionEconomica.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaInformacionEconomica(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=informacioneconomicaLogic.getInformacionEconomicas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=informacioneconomicas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(InformacionEconomicaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosInformacionEconomica.setModel(new InformacionEconomicaModel(this.informacioneconomicaLogic.getInformacionEconomicas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosInformacionEconomica.setModel(new InformacionEconomicaModel(this.informacioneconomicas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByInformacionEconomica!=null && this.jInternalFrameOrderByInformacionEconomica.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByInformacionEconomica();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosInformacionEconomica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionEconomica,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new InformacionEconomicaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO,informacioneconomicaConstantesFunciones.resaltarSeleccionarInformacionEconomica,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+InformacionEconomicaConstantesFunciones.SCLASSWEBTITULO,informacioneconomicaConstantesFunciones.resaltarSeleccionarInformacionEconomica,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosInformacionEconomica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionEconomica,InformacionEconomicaConstantesFunciones.LABEL_ID));

		if(this.informacioneconomicaConstantesFunciones.mostraridInformacionEconomica && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionEconomicaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.informacioneconomicaConstantesFunciones.resaltaridInformacionEconomica,this.informacioneconomicaConstantesFunciones.activaridInformacionEconomica,this,true,"idInformacionEconomica","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.informacioneconomicaConstantesFunciones.resaltaridInformacionEconomica,this.informacioneconomicaConstantesFunciones.activaridInformacionEconomica,this,true,"idInformacionEconomica","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformacionEconomica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionEconomica,InformacionEconomicaConstantesFunciones.LABEL_IDCLIENTE));

		if(this.informacioneconomicaConstantesFunciones.mostraridclienteInformacionEconomica && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionEconomicaConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.informacioneconomicaConstantesFunciones.resaltaridclienteInformacionEconomica,this,this.informacioneconomicaConstantesFunciones.activaridclienteInformacionEconomica));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.informacioneconomicaConstantesFunciones.resaltaridclienteInformacionEconomica,this,this.informacioneconomicaConstantesFunciones.activaridclienteInformacionEconomica,true,"idclienteInformacionEconomica","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new InformacionEconomicaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformacionEconomica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionEconomica,InformacionEconomicaConstantesFunciones.LABEL_IDTIPOVINCULACION));

		if(this.informacioneconomicaConstantesFunciones.mostraridvalorclientevinculacionInformacionEconomica && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionEconomicaConstantesFunciones.LABEL_IDTIPOVINCULACION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoVinculacionTableCell(this.tipovinculacionsForeignKey,this.informacioneconomicaConstantesFunciones.resaltaridvalorclientevinculacionInformacionEconomica,this,this.informacioneconomicaConstantesFunciones.activaridvalorclientevinculacionInformacionEconomica));
			tableColumn.setCellEditor(new TipoVinculacionTableCell(this.tipovinculacionsForeignKey,this.informacioneconomicaConstantesFunciones.resaltaridvalorclientevinculacionInformacionEconomica,this,this.informacioneconomicaConstantesFunciones.activaridvalorclientevinculacionInformacionEconomica,true,"idvalorclientevinculacionInformacionEconomica","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new InformacionEconomicaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformacionEconomica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionEconomica,InformacionEconomicaConstantesFunciones.LABEL_CODIGOACTUALIZACION));

		if(this.informacioneconomicaConstantesFunciones.mostrarcodigoactualizacionInformacionEconomica && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionEconomicaConstantesFunciones.LABEL_CODIGOACTUALIZACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.informacioneconomicaConstantesFunciones.resaltarcodigoactualizacionInformacionEconomica,this.informacioneconomicaConstantesFunciones.activarcodigoactualizacionInformacionEconomica,this,true,"codigoactualizacionInformacionEconomica","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.informacioneconomicaConstantesFunciones.resaltarcodigoactualizacionInformacionEconomica,this.informacioneconomicaConstantesFunciones.activarcodigoactualizacionInformacionEconomica,this,true,"codigoactualizacionInformacionEconomica","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new InformacionEconomicaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformacionEconomica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionEconomica,InformacionEconomicaConstantesFunciones.LABEL_CODIGODESTINOFINANCIERO));

		if(this.informacioneconomicaConstantesFunciones.mostrarcodigodestinofinancieroInformacionEconomica && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionEconomicaConstantesFunciones.LABEL_CODIGODESTINOFINANCIERO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.informacioneconomicaConstantesFunciones.resaltarcodigodestinofinancieroInformacionEconomica,this.informacioneconomicaConstantesFunciones.activarcodigodestinofinancieroInformacionEconomica,this,true,"codigodestinofinancieroInformacionEconomica","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.informacioneconomicaConstantesFunciones.resaltarcodigodestinofinancieroInformacionEconomica,this.informacioneconomicaConstantesFunciones.activarcodigodestinofinancieroInformacionEconomica,this,true,"codigodestinofinancieroInformacionEconomica","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new InformacionEconomicaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformacionEconomica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionEconomica,InformacionEconomicaConstantesFunciones.LABEL_ORIGENRECURSOS));

		if(this.informacioneconomicaConstantesFunciones.mostrarorigenrecursosInformacionEconomica && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionEconomicaConstantesFunciones.LABEL_ORIGENRECURSOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.informacioneconomicaConstantesFunciones.resaltarorigenrecursosInformacionEconomica,this.informacioneconomicaConstantesFunciones.activarorigenrecursosInformacionEconomica,this,true,"origenrecursosInformacionEconomica","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.informacioneconomicaConstantesFunciones.resaltarorigenrecursosInformacionEconomica,this.informacioneconomicaConstantesFunciones.activarorigenrecursosInformacionEconomica,this,true,"origenrecursosInformacionEconomica","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new InformacionEconomicaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformacionEconomica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionEconomica,InformacionEconomicaConstantesFunciones.LABEL_CUASAVINCULACION));

		if(this.informacioneconomicaConstantesFunciones.mostrarcuasavinculacionInformacionEconomica && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionEconomicaConstantesFunciones.LABEL_CUASAVINCULACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.informacioneconomicaConstantesFunciones.resaltarcuasavinculacionInformacionEconomica,this.informacioneconomicaConstantesFunciones.activarcuasavinculacionInformacionEconomica,this,true,"cuasavinculacionInformacionEconomica","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.informacioneconomicaConstantesFunciones.resaltarcuasavinculacionInformacionEconomica,this.informacioneconomicaConstantesFunciones.activarcuasavinculacionInformacionEconomica,this,true,"cuasavinculacionInformacionEconomica","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new InformacionEconomicaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformacionEconomica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionEconomica,InformacionEconomicaConstantesFunciones.LABEL_SECTORIZACION));

		if(this.informacioneconomicaConstantesFunciones.mostrarsectorizacionInformacionEconomica && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionEconomicaConstantesFunciones.LABEL_SECTORIZACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.informacioneconomicaConstantesFunciones.resaltarsectorizacionInformacionEconomica,this.informacioneconomicaConstantesFunciones.activarsectorizacionInformacionEconomica,this,true,"sectorizacionInformacionEconomica","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.informacioneconomicaConstantesFunciones.resaltarsectorizacionInformacionEconomica,this.informacioneconomicaConstantesFunciones.activarsectorizacionInformacionEconomica,this,true,"sectorizacionInformacionEconomica","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new InformacionEconomicaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformacionEconomica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformacionEconomica,InformacionEconomicaConstantesFunciones.LABEL_ESACTIVO));

		if(this.informacioneconomicaConstantesFunciones.mostraresactivoInformacionEconomica && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformacionEconomicaConstantesFunciones.LABEL_ESACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.informacioneconomicaConstantesFunciones.resaltaresactivoInformacionEconomica,this.informacioneconomicaConstantesFunciones.activaresactivoInformacionEconomica));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.informacioneconomicaConstantesFunciones.resaltaresactivoInformacionEconomica,this.informacioneconomicaConstantesFunciones.activaresactivoInformacionEconomica,this,true,"esactivoInformacionEconomica","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new InformacionEconomicaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.informacioneconomicaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.informacioneconomicaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.informacioneconomicaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosInformacionEconomica.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.informacioneconomicaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.informacioneconomicaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosInformacionEconomica.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarInformacionEconomica && this.isPermisoGuardarCambiosInformacionEconomica) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.informacioneconomicaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.informacioneconomicaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosInformacionEconomica.addColumn(tableColumn);
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
			
			this.jTableDatosInformacionEconomica.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarInformacionEconomica && this.isPermisoGuardarCambiosInformacionEconomica) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarInformacionEconomica && this.isPermisoGuardarCambiosInformacionEconomica) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosInformacionEconomica.moveColumn(this.jTableDatosInformacionEconomica.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosInformacionEconomica.moveColumn(this.jTableDatosInformacionEconomica.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosInformacionEconomica.moveColumn(this.jTableDatosInformacionEconomica.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosInformacionEconomica.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosInformacionEconomica.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosInformacionEconomica,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!InformacionEconomicaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosInformacionEconomica.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosInformacionEconomica.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!InformacionEconomicaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!InformacionEconomicaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosInformacionEconomica.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosInformacionEconomica.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosInformacionEconomica.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=informacioneconomicaLogic.getInformacionEconomicas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=informacioneconomicas.size()-1;
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
		//this.jTableDatosInformacionEconomica.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosInformacionEconomica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosInformacionEconomica();
			
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
				
				//this.isEsNuevoInformacionEconomica=false;
					
				InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
			
				if(this.informacioneconomicaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormInformacionEconomica==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosInformacionEconomica.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosInformacionEconomica.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomica =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informacioneconomica =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.informacioneconomica.getsType().equals("DUPLICADO")
				   || this.informacioneconomica.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoInformacionEconomica=true;
				
				} else {
					this.isEsNuevoInformacionEconomica=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {
					if(this.informacioneconomica.getId()>=0 && !this.informacioneconomica.getIsNew()) {						
						this.isEsNuevoInformacionEconomica=false;
						
					} else {
						this.isEsNuevoInformacionEconomica=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoInformacionEconomica(esRelaciones);						
				
				this.seleccionarInformacionEconomica(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.informacioneconomica.getId()<0) {
					this.isEsNuevoInformacionEconomica=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarInformacionEconomica(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarInformacionEconomica(evt,rowIndex);
				}	
				
				if(this.informacioneconomicaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion InformacionEconomica: " + this.dDif); 
					}
				}								
				
				InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarInformacionEconomica(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.informacioneconomica)) {
					if(this.informacioneconomica.getId()>0) {
						this.informacioneconomica.setIsDeleted(true);
						
						this.informacioneconomicasEliminados.add(this.informacioneconomica);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.informacioneconomicaLogic.getInformacionEconomicas().remove(this.informacioneconomica);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.informacioneconomicas.remove(this.informacioneconomica);				
					}
					
					
					((InformacionEconomicaModel) this.jTableDatosInformacionEconomica.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaInformacionEconomica(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarInformacionEconomica(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoInformacionEconomica) {
			
			if(this.jInternalFrameDetalleFormInformacionEconomica==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosInformacionEconomica.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosInformacionEconomica.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomica =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informacioneconomica =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(InformacionEconomicaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioInformacionEconomica(this.informacioneconomica);
				}
				
				//ARCHITECTURE
				try {
					

					//Cliente
					if(!this.informacioneconomicaConstantesFunciones.cargaridclienteInformacionEconomica || this.informacioneconomicaConstantesFunciones.event_dependidclienteInformacionEconomica) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.informacioneconomica.getidcliente());
									//this.inicializarActualizarBindingInformacionEconomica(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(informacioneconomica.getCliente()!=null) {
							this.clientesForeignKey.add(informacioneconomica.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.informacioneconomica.getidcliente(),false,"Formulario");

					//TipoVinculacion
					if(!this.informacioneconomicaConstantesFunciones.cargaridvalorclientevinculacionInformacionEconomica || this.informacioneconomicaConstantesFunciones.event_dependidvalorclientevinculacionInformacionEconomica) {
						//this.cargarCombosTipoVinculacionsForeignKeyLista(" where id="+this.informacioneconomica.getidvalorclientevinculacion());
									//this.inicializarActualizarBindingInformacionEconomica(false,false);
						this.tipovinculacionsForeignKey=new ArrayList<TipoVinculacion>();

						if(informacioneconomica.getTipoVinculacion()!=null) {
							this.tipovinculacionsForeignKey.add(informacioneconomica.getTipoVinculacion());
						}

						this.addItemDefectoCombosForeignKeyTipoVinculacion();
						this.cargarCombosFrameTipoVinculacionsForeignKey("Todos");
					}
					this.setActualTipoVinculacionForeignKey(this.informacioneconomica.getidvalorclientevinculacion(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesInformacionEconomica("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesInformacionEconomica(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualInformacionEconomica() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoInformacionEconomica(InformacionEconomica informacioneconomica) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoInformacionEconomica(informacioneconomica,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoInformacionEconomica(InformacionEconomica informacioneconomica,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioInformacionEconomica(informacioneconomica);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyInformacionEconomica(informacioneconomica,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyInformacionEconomica(informacioneconomica);
	}
	
	public void setVariablesObjetoActualToFormularioInformacionEconomica(InformacionEconomica informacioneconomica) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormInformacionEconomica==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormInformacionEconomica.jLabelidInformacionEconomica.setText(informacioneconomica.getId().toString());
			this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldcodigoactualizacionInformacionEconomica.setText(informacioneconomica.getcodigoactualizacion());
			this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldcodigodestinofinancieroInformacionEconomica.setText(informacioneconomica.getcodigodestinofinanciero());
			this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldorigenrecursosInformacionEconomica.setText(informacioneconomica.getorigenrecursos());
			this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldcuasavinculacionInformacionEconomica.setText(informacioneconomica.getcuasavinculacion());
			this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldsectorizacionInformacionEconomica.setText(informacioneconomica.getsectorizacion());
			this.jInternalFrameDetalleFormInformacionEconomica.jCheckBoxesactivoInformacionEconomica.setSelected(informacioneconomica.getesactivo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,InformacionEconomica informacioneconomicaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,informacioneconomicaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,InformacionEconomica informacioneconomicaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				informacioneconomicaLocal=this.informacioneconomica;
			} else {
				informacioneconomicaLocal=this.informacioneconomicaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(informacioneconomicaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoInformacionEconomica(informacioneconomicaLocal,true);
					
					if(informacioneconomicaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(informacioneconomicaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(informacioneconomicaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoInformacionEconomica(InformacionEconomica informacioneconomica,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualInformacionEconomica(informacioneconomica,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysInformacionEconomica(informacioneconomica);
	}
	
	public void setVariablesFormularioToObjetoActualInformacionEconomica(InformacionEconomica informacioneconomica,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualInformacionEconomica(informacioneconomica,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualInformacionEconomica(InformacionEconomica informacioneconomica,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormInformacionEconomica==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormInformacionEconomica.jLabelidInformacionEconomica.getText()==null || this.jInternalFrameDetalleFormInformacionEconomica.jLabelidInformacionEconomica.getText()=="" || this.jInternalFrameDetalleFormInformacionEconomica.jLabelidInformacionEconomica.getText()=="Id") {
				this.jInternalFrameDetalleFormInformacionEconomica.jLabelidInformacionEconomica.setText("0");
			}

			if(conColumnasBase) {informacioneconomica.setId(Long.parseLong(this.jInternalFrameDetalleFormInformacionEconomica.jLabelidInformacionEconomica.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformacionEconomicaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionEconomica.jLabelIdInformacionEconomica,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			informacioneconomica.setcodigoactualizacion(this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldcodigoactualizacionInformacionEconomica.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformacionEconomicaConstantesFunciones.LABEL_CODIGOACTUALIZACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionEconomica.jLabelcodigoactualizacionInformacionEconomica,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			informacioneconomica.setcodigodestinofinanciero(this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldcodigodestinofinancieroInformacionEconomica.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformacionEconomicaConstantesFunciones.LABEL_CODIGODESTINOFINANCIERO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionEconomica.jLabelcodigodestinofinancieroInformacionEconomica,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			informacioneconomica.setorigenrecursos(this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldorigenrecursosInformacionEconomica.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformacionEconomicaConstantesFunciones.LABEL_ORIGENRECURSOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionEconomica.jLabelorigenrecursosInformacionEconomica,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			informacioneconomica.setcuasavinculacion(this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldcuasavinculacionInformacionEconomica.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformacionEconomicaConstantesFunciones.LABEL_CUASAVINCULACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionEconomica.jLabelcuasavinculacionInformacionEconomica,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			informacioneconomica.setsectorizacion(this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldsectorizacionInformacionEconomica.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformacionEconomicaConstantesFunciones.LABEL_SECTORIZACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionEconomica.jLabelsectorizacionInformacionEconomica,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			informacioneconomica.setesactivo(this.jInternalFrameDetalleFormInformacionEconomica.jCheckBoxesactivoInformacionEconomica.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformacionEconomicaConstantesFunciones.LABEL_ESACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformacionEconomica.jLabelesactivoInformacionEconomica,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualInformacionEconomica(InformacionEconomica informacioneconomicaBean,InformacionEconomica informacioneconomica,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && informacioneconomicaBean.getidcliente()!=null && !informacioneconomicaBean.getidcliente().equals(-1L))) {informacioneconomica.setidcliente(informacioneconomicaBean.getidcliente());}
			if(conDefault || (!conDefault && informacioneconomicaBean.getidvalorclientevinculacion()!=null && !informacioneconomicaBean.getidvalorclientevinculacion().equals(-1L))) {informacioneconomica.setidvalorclientevinculacion(informacioneconomicaBean.getidvalorclientevinculacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosInformacionEconomica(InformacionEconomica informacioneconomicaOrigen,InformacionEconomica informacioneconomica,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && informacioneconomicaOrigen.getId()!=null && !informacioneconomicaOrigen.getId().equals(0L))) {informacioneconomica.setId(informacioneconomicaOrigen.getId());}}
			if(conDefault || (!conDefault && informacioneconomicaOrigen.getidcliente()!=null && !informacioneconomicaOrigen.getidcliente().equals(-1L))) {informacioneconomica.setidcliente(informacioneconomicaOrigen.getidcliente());}
			if(conDefault || (!conDefault && informacioneconomicaOrigen.getidvalorclientevinculacion()!=null && !informacioneconomicaOrigen.getidvalorclientevinculacion().equals(-1L))) {informacioneconomica.setidvalorclientevinculacion(informacioneconomicaOrigen.getidvalorclientevinculacion());}
			if(conDefault || (!conDefault && informacioneconomicaOrigen.getcodigoactualizacion()!=null && !informacioneconomicaOrigen.getcodigoactualizacion().equals(""))) {informacioneconomica.setcodigoactualizacion(informacioneconomicaOrigen.getcodigoactualizacion());}
			if(conDefault || (!conDefault && informacioneconomicaOrigen.getcodigodestinofinanciero()!=null && !informacioneconomicaOrigen.getcodigodestinofinanciero().equals(""))) {informacioneconomica.setcodigodestinofinanciero(informacioneconomicaOrigen.getcodigodestinofinanciero());}
			if(conDefault || (!conDefault && informacioneconomicaOrigen.getorigenrecursos()!=null && !informacioneconomicaOrigen.getorigenrecursos().equals(""))) {informacioneconomica.setorigenrecursos(informacioneconomicaOrigen.getorigenrecursos());}
			if(conDefault || (!conDefault && informacioneconomicaOrigen.getcuasavinculacion()!=null && !informacioneconomicaOrigen.getcuasavinculacion().equals(""))) {informacioneconomica.setcuasavinculacion(informacioneconomicaOrigen.getcuasavinculacion());}
			if(conDefault || (!conDefault && informacioneconomicaOrigen.getsectorizacion()!=null && !informacioneconomicaOrigen.getsectorizacion().equals(""))) {informacioneconomica.setsectorizacion(informacioneconomicaOrigen.getsectorizacion());}
			if(conDefault || (!conDefault && informacioneconomicaOrigen.getesactivo()!=null && !informacioneconomicaOrigen.getesactivo().equals(false))) {informacioneconomica.setesactivo(informacioneconomicaOrigen.getesactivo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioInformacionEconomica(InformacionEconomica informacioneconomica) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormInformacionEconomica.jLabelidInformacionEconomica.setText(informacioneconomica.getId().toString());
			this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldcodigoactualizacionInformacionEconomica.setText(informacioneconomica.getcodigoactualizacion());
			this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldcodigodestinofinancieroInformacionEconomica.setText(informacioneconomica.getcodigodestinofinanciero());
			this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldorigenrecursosInformacionEconomica.setText(informacioneconomica.getorigenrecursos());
			this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldcuasavinculacionInformacionEconomica.setText(informacioneconomica.getcuasavinculacion());
			this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldsectorizacionInformacionEconomica.setText(informacioneconomica.getsectorizacion());
			this.jInternalFrameDetalleFormInformacionEconomica.jCheckBoxesactivoInformacionEconomica.setSelected(informacioneconomica.getesactivo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioInformacionEconomica(InformacionEconomicaBean informacioneconomicaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormInformacionEconomica.jLabelidInformacionEconomica.setText(informacioneconomicaBean.getId().toString());
			this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldcodigoactualizacionInformacionEconomica.setText(informacioneconomicaBean.getcodigoactualizacion());
			this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldcodigodestinofinancieroInformacionEconomica.setText(informacioneconomicaBean.getcodigodestinofinanciero());
			this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldorigenrecursosInformacionEconomica.setText(informacioneconomicaBean.getorigenrecursos());
			this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldcuasavinculacionInformacionEconomica.setText(informacioneconomicaBean.getcuasavinculacion());
			this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldsectorizacionInformacionEconomica.setText(informacioneconomicaBean.getsectorizacion());
			this.jInternalFrameDetalleFormInformacionEconomica.jCheckBoxesactivoInformacionEconomica.setSelected(informacioneconomicaBean.getesactivo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanInformacionEconomica(InformacionEconomicaParameterReturnGeneral informacioneconomicaReturnGeneral,InformacionEconomicaBean informacioneconomicaBean,Boolean conDefault) throws Exception { 
		try {
			InformacionEconomica informacioneconomicaLocal=new InformacionEconomica();
			
			informacioneconomicaLocal=informacioneconomicaReturnGeneral.getInformacionEconomica();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && informacioneconomicaLocal.getId()!=null && !informacioneconomicaLocal.getId().equals(0L))) {informacioneconomicaBean.setId(informacioneconomicaLocal.getId());}}
			if(conDefault || (!conDefault && informacioneconomicaLocal.getidcliente()!=null && !informacioneconomicaLocal.getidcliente().equals(-1L))) {informacioneconomicaBean.setidcliente(informacioneconomicaLocal.getidcliente());}
			if(conDefault || (!conDefault && informacioneconomicaLocal.getidvalorclientevinculacion()!=null && !informacioneconomicaLocal.getidvalorclientevinculacion().equals(-1L))) {informacioneconomicaBean.setidvalorclientevinculacion(informacioneconomicaLocal.getidvalorclientevinculacion());}
			if(conDefault || (!conDefault && informacioneconomicaLocal.getcodigoactualizacion()!=null && !informacioneconomicaLocal.getcodigoactualizacion().equals(""))) {informacioneconomicaBean.setcodigoactualizacion(informacioneconomicaLocal.getcodigoactualizacion());}
			if(conDefault || (!conDefault && informacioneconomicaLocal.getcodigodestinofinanciero()!=null && !informacioneconomicaLocal.getcodigodestinofinanciero().equals(""))) {informacioneconomicaBean.setcodigodestinofinanciero(informacioneconomicaLocal.getcodigodestinofinanciero());}
			if(conDefault || (!conDefault && informacioneconomicaLocal.getorigenrecursos()!=null && !informacioneconomicaLocal.getorigenrecursos().equals(""))) {informacioneconomicaBean.setorigenrecursos(informacioneconomicaLocal.getorigenrecursos());}
			if(conDefault || (!conDefault && informacioneconomicaLocal.getcuasavinculacion()!=null && !informacioneconomicaLocal.getcuasavinculacion().equals(""))) {informacioneconomicaBean.setcuasavinculacion(informacioneconomicaLocal.getcuasavinculacion());}
			if(conDefault || (!conDefault && informacioneconomicaLocal.getsectorizacion()!=null && !informacioneconomicaLocal.getsectorizacion().equals(""))) {informacioneconomicaBean.setsectorizacion(informacioneconomicaLocal.getsectorizacion());}
			if(conDefault || (!conDefault && informacioneconomicaLocal.getesactivo()!=null && !informacioneconomicaLocal.getesactivo().equals(false))) {informacioneconomicaBean.setesactivo(informacioneconomicaLocal.getesactivo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxInformacionEconomicaGenerico(Long idInformacionEconomicaSeleccionado,JComboBox jComboBoxInformacionEconomica,List<InformacionEconomica> informacioneconomicasLocal)throws Exception {
		try {
			InformacionEconomica  informacioneconomicaTemp=null;

			for(InformacionEconomica informacioneconomicaAux:informacioneconomicasLocal) {
				if(informacioneconomicaAux.getId()!=null && informacioneconomicaAux.getId().equals(idInformacionEconomicaSeleccionado)) {
					informacioneconomicaTemp=informacioneconomicaAux;
					break;
				}
			}

			jComboBoxInformacionEconomica.setSelectedItem(informacioneconomicaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxInformacionEconomicaGenerico(JComboBox jComboBoxInformacionEconomica,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxInformacionEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxInformacionEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxInformacionEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxInformacionEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxInformacionEconomica.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxInformacionEconomica.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxInformacionEconomica.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxInformacionEconomica.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxInformacionEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxInformacionEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			informacioneconomica=(InformacionEconomica) informacioneconomicaLogic.getInformacionEconomicas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			informacioneconomica =(InformacionEconomica) informacioneconomicas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!informacioneconomica.getIsNew() && !informacioneconomica.getIsChanged() && !informacioneconomica.getIsDeleted()) {
				sDescripcion=informacioneconomica.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=informacioneconomica.getcliente_descripcion();
			}
		}

		if(sTipo.equals("TipoVinculacion")) {
			//sDescripcion=this.getActualTipoVinculacionForeignKeyDescripcion((Long)value);
			if(!informacioneconomica.getIsNew() && !informacioneconomica.getIsChanged() && !informacioneconomica.getIsDeleted()) {
				sDescripcion=informacioneconomica.gettipovinculacion_descripcion();
			} else {
				//sDescripcion=this.getActualTipoVinculacionForeignKeyDescripcion((Long)value);
				sDescripcion=informacioneconomica.gettipovinculacion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		InformacionEconomica informacioneconomicaRow=new InformacionEconomica();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			informacioneconomicaRow=(InformacionEconomica) informacioneconomicaLogic.getInformacionEconomicas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			informacioneconomicaRow=(InformacionEconomica) informacioneconomicas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualInformacionEconomica(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoInformacionEconomica.setVisible((this.isVisibilidadCeldaNuevoInformacionEconomica && this.isPermisoNuevoInformacionEconomica));			
			this.jButtonDuplicarInformacionEconomica.setVisible((this.isVisibilidadCeldaDuplicarInformacionEconomica && this.isPermisoDuplicarInformacionEconomica));			
			this.jButtonCopiarInformacionEconomica.setVisible((this.isVisibilidadCeldaCopiarInformacionEconomica && this.isPermisoCopiarInformacionEconomica));
			this.jButtonVerFormInformacionEconomica.setVisible((this.isVisibilidadCeldaVerFormInformacionEconomica && this.isPermisoVerFormInformacionEconomica));
			
			this.jButtonAbrirOrderByInformacionEconomica.setVisible((this.isVisibilidadCeldaOrdenInformacionEconomica && this.isPermisoOrdenInformacionEconomica));			
			
			this.jButtonNuevoRelacionesInformacionEconomica.setVisible((this.isVisibilidadCeldaNuevoRelacionesInformacionEconomica && this.isPermisoNuevoInformacionEconomica));			
			this.jButtonNuevoGuardarCambiosInformacionEconomica.setVisible((this.isVisibilidadCeldaNuevoInformacionEconomica && this.isPermisoNuevoInformacionEconomica && this.isPermisoGuardarCambiosInformacionEconomica));
			
			if(this.jInternalFrameDetalleFormInformacionEconomica!=null) {
			this.jInternalFrameDetalleFormInformacionEconomica.jButtonModificarInformacionEconomica.setVisible((this.isVisibilidadCeldaModificarInformacionEconomica && this.isPermisoActualizarInformacionEconomica));	
			this.jInternalFrameDetalleFormInformacionEconomica.jButtonActualizarInformacionEconomica.setVisible((this.isVisibilidadCeldaActualizarInformacionEconomica && this.isPermisoActualizarInformacionEconomica));	
			this.jInternalFrameDetalleFormInformacionEconomica.jButtonEliminarInformacionEconomica.setVisible((this.isVisibilidadCeldaEliminarInformacionEconomica && this.isPermisoEliminarInformacionEconomica));
			this.jInternalFrameDetalleFormInformacionEconomica.jButtonCancelarInformacionEconomica.setVisible(this.isVisibilidadCeldaCancelarInformacionEconomica);							
			this.jInternalFrameDetalleFormInformacionEconomica.jButtonGuardarCambiosInformacionEconomica.setVisible((this.isVisibilidadCeldaGuardarInformacionEconomica && this.isPermisoGuardarCambiosInformacionEconomica));			
			
			}
						
			this.jButtonGuardarCambiosTablaInformacionEconomica.setVisible((this.isVisibilidadCeldaGuardarCambiosInformacionEconomica && this.isPermisoGuardarCambiosInformacionEconomica));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarInformacionEconomica.setVisible((this.isVisibilidadCeldaNuevoInformacionEconomica && this.isPermisoNuevoInformacionEconomica));						
			this.jButtonDuplicarToolBarInformacionEconomica.setVisible((this.isVisibilidadCeldaDuplicarInformacionEconomica && this.isPermisoDuplicarInformacionEconomica));						
			this.jButtonCopiarToolBarInformacionEconomica.setVisible((this.isVisibilidadCeldaCopiarInformacionEconomica && this.isPermisoCopiarInformacionEconomica));			
			this.jButtonVerFormToolBarInformacionEconomica.setVisible((this.isVisibilidadCeldaVerFormInformacionEconomica && this.isPermisoVerFormInformacionEconomica));			
			this.jButtonAbrirOrderByToolBarInformacionEconomica.setVisible((this.isVisibilidadCeldaOrdenInformacionEconomica && this.isPermisoOrdenInformacionEconomica));
			this.jButtonNuevoRelacionesToolBarInformacionEconomica.setVisible((this.isVisibilidadCeldaNuevoRelacionesInformacionEconomica && this.isPermisoNuevoInformacionEconomica));			
			this.jButtonNuevoGuardarCambiosToolBarInformacionEconomica.setVisible((this.isVisibilidadCeldaNuevoInformacionEconomica && this.isPermisoNuevoInformacionEconomica && this.isPermisoGuardarCambiosInformacionEconomica));			
			
			if(this.jInternalFrameDetalleFormInformacionEconomica!=null) {
			this.jInternalFrameDetalleFormInformacionEconomica.jButtonModificarToolBarInformacionEconomica.setVisible((this.isVisibilidadCeldaModificarInformacionEconomica && this.isPermisoActualizarInformacionEconomica));	
			this.jInternalFrameDetalleFormInformacionEconomica.jButtonActualizarToolBarInformacionEconomica.setVisible((this.isVisibilidadCeldaActualizarInformacionEconomica  && this.isPermisoActualizarInformacionEconomica));	
			this.jInternalFrameDetalleFormInformacionEconomica.jButtonEliminarToolBarInformacionEconomica.setVisible((this.isVisibilidadCeldaEliminarInformacionEconomica && this.isPermisoEliminarInformacionEconomica));
			this.jInternalFrameDetalleFormInformacionEconomica.jButtonCancelarToolBarInformacionEconomica.setVisible(this.isVisibilidadCeldaCancelarInformacionEconomica);				
			this.jInternalFrameDetalleFormInformacionEconomica.jButtonGuardarCambiosToolBarInformacionEconomica.setVisible((this.isVisibilidadCeldaGuardarInformacionEconomica && this.isPermisoGuardarCambiosInformacionEconomica));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarInformacionEconomica.setVisible((this.isVisibilidadCeldaGuardarCambiosInformacionEconomica && this.isPermisoGuardarCambiosInformacionEconomica));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoInformacionEconomica.setVisible((this.isVisibilidadCeldaNuevoInformacionEconomica && this.isPermisoNuevoInformacionEconomica));			
			this.jMenuItemDuplicarInformacionEconomica.setVisible((this.isVisibilidadCeldaDuplicarInformacionEconomica && this.isPermisoDuplicarInformacionEconomica));			
			this.jMenuItemCopiarInformacionEconomica.setVisible((this.isVisibilidadCeldaCopiarInformacionEconomica && this.isPermisoCopiarInformacionEconomica));			
			this.jMenuItemVerFormInformacionEconomica.setVisible((this.isVisibilidadCeldaVerFormInformacionEconomica && this.isPermisoVerFormInformacionEconomica));			
			this.jMenuItemAbrirOrderByInformacionEconomica.setVisible((this.isVisibilidadCeldaOrdenInformacionEconomica && this.isPermisoOrdenInformacionEconomica));			
			//this.jMenuItemMostrarOcultarInformacionEconomica.setVisible((this.isVisibilidadCeldaOrdenInformacionEconomica && this.isPermisoOrdenInformacionEconomica));
			this.jMenuItemDetalleAbrirOrderByInformacionEconomica.setVisible((this.isVisibilidadCeldaOrdenInformacionEconomica && this.isPermisoOrdenInformacionEconomica));			
			//this.jMenuItemDetalleMostrarOcultarInformacionEconomica.setVisible((this.isVisibilidadCeldaOrdenInformacionEconomica && this.isPermisoOrdenInformacionEconomica));			
			this.jMenuItemNuevoRelacionesInformacionEconomica.setVisible((this.isVisibilidadCeldaNuevoRelacionesInformacionEconomica && this.isPermisoNuevoInformacionEconomica));			
			this.jMenuItemNuevoGuardarCambiosInformacionEconomica.setVisible((this.isVisibilidadCeldaNuevoInformacionEconomica && this.isPermisoNuevoInformacionEconomica && this.isPermisoGuardarCambiosInformacionEconomica));									
			
			if(this.jInternalFrameDetalleFormInformacionEconomica!=null) {
			this.jInternalFrameDetalleFormInformacionEconomica.jMenuItemModificarInformacionEconomica.setVisible((this.isVisibilidadCeldaModificarInformacionEconomica && this.isPermisoActualizarInformacionEconomica));	
			this.jInternalFrameDetalleFormInformacionEconomica.jMenuItemActualizarInformacionEconomica.setVisible((this.isVisibilidadCeldaActualizarInformacionEconomica && this.isPermisoActualizarInformacionEconomica));	
			this.jInternalFrameDetalleFormInformacionEconomica.jMenuItemEliminarInformacionEconomica.setVisible((this.isVisibilidadCeldaEliminarInformacionEconomica && this.isPermisoEliminarInformacionEconomica));
			this.jInternalFrameDetalleFormInformacionEconomica.jMenuItemCancelarInformacionEconomica.setVisible(this.isVisibilidadCeldaCancelarInformacionEconomica);				
			}
			
			this.jMenuItemGuardarCambiosInformacionEconomica.setVisible((this.isVisibilidadCeldaGuardarInformacionEconomica && this.isPermisoGuardarCambiosInformacionEconomica));						
			this.jMenuItemGuardarCambiosTablaInformacionEconomica.setVisible((this.isVisibilidadCeldaGuardarCambiosInformacionEconomica && this.isPermisoGuardarCambiosInformacionEconomica));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoInformacionEconomica=this.jButtonNuevoInformacionEconomica.isVisible();
			this.isVisibilidadCeldaDuplicarInformacionEconomica=this.jButtonDuplicarInformacionEconomica.isVisible();
			this.isVisibilidadCeldaCopiarInformacionEconomica=this.jButtonCopiarInformacionEconomica.isVisible();
			this.isVisibilidadCeldaVerFormInformacionEconomica=this.jButtonVerFormInformacionEconomica.isVisible();
			
			this.isVisibilidadCeldaOrdenInformacionEconomica=this.jButtonAbrirOrderByInformacionEconomica.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesInformacionEconomica=this.jButtonNuevoRelacionesInformacionEconomica.isVisible();
			this.isVisibilidadCeldaModificarInformacionEconomica=this.jButtonModificarInformacionEconomica.isVisible();
			
			if(this.jInternalFrameDetalleFormInformacionEconomica!=null) {
			this.isVisibilidadCeldaActualizarInformacionEconomica=this.jInternalFrameDetalleFormInformacionEconomica.jButtonActualizarInformacionEconomica.isVisible();
			this.isVisibilidadCeldaEliminarInformacionEconomica=this.jInternalFrameDetalleFormInformacionEconomica.jButtonEliminarInformacionEconomica.isVisible();
			this.isVisibilidadCeldaCancelarInformacionEconomica=this.jInternalFrameDetalleFormInformacionEconomica.jButtonCancelarInformacionEconomica.isVisible();
			this.isVisibilidadCeldaGuardarInformacionEconomica=this.jInternalFrameDetalleFormInformacionEconomica.jButtonGuardarCambiosInformacionEconomica.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosInformacionEconomica=this.jButtonGuardarCambiosTablaInformacionEconomica.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoInformacionEconomica=this.jButtonNuevoToolBarInformacionEconomica.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesInformacionEconomica=this.jButtonNuevoRelacionesToolBarInformacionEconomica.isVisible();
			
			if(this.jInternalFrameDetalleFormInformacionEconomica!=null) {
			this.isVisibilidadCeldaModificarInformacionEconomica=this.jInternalFrameDetalleFormInformacionEconomica.jButtonModificarToolBarInformacionEconomica.isVisible();
			this.isVisibilidadCeldaActualizarInformacionEconomica=this.jInternalFrameDetalleFormInformacionEconomica.jButtonActualizarToolBarInformacionEconomica.isVisible();
			this.isVisibilidadCeldaEliminarInformacionEconomica=this.jInternalFrameDetalleFormInformacionEconomica.jButtonEliminarToolBarInformacionEconomica.isVisible();
			this.isVisibilidadCeldaCancelarInformacionEconomica=this.jInternalFrameDetalleFormInformacionEconomica.jButtonCancelarToolBarInformacionEconomica.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarInformacionEconomica=this.jButtonGuardarCambiosToolBarInformacionEconomica.isVisible();
			this.isVisibilidadCeldaGuardarCambiosInformacionEconomica=this.jButtonGuardarCambiosTablaToolBarInformacionEconomica.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoInformacionEconomica=this.jMenuItemNuevoInformacionEconomica.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesInformacionEconomica=this.jMenuItemNuevoRelacionesInformacionEconomica.isVisible();
			
			if(this.jInternalFrameDetalleFormInformacionEconomica!=null) {
			this.isVisibilidadCeldaModificarInformacionEconomica=this.jInternalFrameDetalleFormInformacionEconomica.jMenuItemModificarInformacionEconomica.isVisible();
			this.isVisibilidadCeldaActualizarInformacionEconomica=this.jInternalFrameDetalleFormInformacionEconomica.jMenuItemActualizarInformacionEconomica.isVisible();
			this.isVisibilidadCeldaEliminarInformacionEconomica=this.jInternalFrameDetalleFormInformacionEconomica.jMenuItemEliminarInformacionEconomica.isVisible();
			this.isVisibilidadCeldaCancelarInformacionEconomica=this.jInternalFrameDetalleFormInformacionEconomica.jMenuItemCancelarInformacionEconomica.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarInformacionEconomica=this.jMenuItemGuardarCambiosInformacionEconomica.isVisible();
			this.isVisibilidadCeldaGuardarCambiosInformacionEconomica=this.jMenuItemGuardarCambiosTablaInformacionEconomica.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesInformacionEconomica(Boolean esInicializar) {
		if(InformacionEconomicaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.informacioneconomicaSessionBean.getConGuardarRelaciones()) {
				//if(this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesInformacionEconomica();
			}
			
			this.inicializarActualizarBindingBotonesManualInformacionEconomica(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualInformacionEconomica() {
		this.jButtonNuevoInformacionEconomica.setVisible(this.isPermisoNuevoInformacionEconomica);			
		this.jButtonDuplicarInformacionEconomica.setVisible(this.isPermisoDuplicarInformacionEconomica);			
		this.jButtonCopiarInformacionEconomica.setVisible(this.isPermisoCopiarInformacionEconomica);			
		this.jButtonVerFormInformacionEconomica.setVisible(this.isPermisoVerFormInformacionEconomica);			
		
		this.jButtonAbrirOrderByInformacionEconomica.setVisible(this.isPermisoOrdenInformacionEconomica);					
		
		this.jButtonNuevoRelacionesInformacionEconomica.setVisible(this.isPermisoNuevoInformacionEconomica);			
		
		if(this.jInternalFrameDetalleFormInformacionEconomica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionEconomica.jButtonModificarInformacionEconomica.setVisible(this.isPermisoActualizarInformacionEconomica);	
			this.jInternalFrameDetalleFormInformacionEconomica.jButtonActualizarInformacionEconomica.setVisible(this.isPermisoActualizarInformacionEconomica);	
			this.jInternalFrameDetalleFormInformacionEconomica.jButtonEliminarInformacionEconomica.setVisible(this.isPermisoEliminarInformacionEconomica);
			this.jInternalFrameDetalleFormInformacionEconomica.jButtonCancelarInformacionEconomica.setVisible(this.isVisibilidadCeldaCancelarInformacionEconomica);						
			this.jInternalFrameDetalleFormInformacionEconomica.jButtonGuardarCambiosInformacionEconomica.setVisible(this.isPermisoGuardarCambiosInformacionEconomica);							
		}
		
		this.jButtonGuardarCambiosTablaInformacionEconomica.setVisible(this.isPermisoActualizarInformacionEconomica);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleInformacionEconomica() {
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonModificarInformacionEconomica.setVisible(this.isPermisoActualizarInformacionEconomica);	
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonActualizarInformacionEconomica.setVisible(this.isPermisoActualizarInformacionEconomica);	
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonEliminarInformacionEconomica.setVisible(this.isPermisoEliminarInformacionEconomica);
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonCancelarInformacionEconomica.setVisible(this.isVisibilidadCeldaCancelarInformacionEconomica);							
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonGuardarCambiosInformacionEconomica.setVisible((this.isVisibilidadCeldaGuardarInformacionEconomica && this.isPermisoGuardarCambiosInformacionEconomica));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosInformacionEconomica() {
		if(InformacionEconomicaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualInformacionEconomica();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesInformacionEconomica() {
	}
	
	public void jTableDatosInformacionEconomicaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarInformacionEconomica(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidInformacionEconomicaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionEconomica.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionEconomica(this.getinformacioneconomica(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionEconomica(this.informacioneconomica);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacioneconomica =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacioneconomica =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacioneconomica==null) {
						this.informacioneconomica = new InformacionEconomica();
					}

					this.setVariablesFormularioToObjetoActualInformacionEconomica(this.informacioneconomica,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionEconomica(this.informacioneconomica);
				}

				if(this.informacioneconomica.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.informacioneconomica.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionEconomica(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidclienteInformacionEconomicaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderInformacionEconomica=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosInformacionEconomica.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderInformacionEconomica=(TitledBorder)this.jScrollPanelDatosInformacionEconomica.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderInformacionEconomica.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonidclienteInformacionEconomicaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebInformacionEconomica(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionEconomica.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosInformacionEconomica.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosInformacionEconomica.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomica =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.informacioneconomica =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualInformacionEconomica(this.getinformacioneconomica(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysInformacionEconomica(this.informacioneconomica);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.informacioneconomicaLogic.getConnexion());

				if(this.informacioneconomica.getidcliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.informacioneconomica.getidcliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderInformacionEconomica=(TitledBorder)this.jScrollPanelDatosInformacionEconomica.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderInformacionEconomica.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonidclienteInformacionEconomicaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionEconomica.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionEconomica(this.getinformacioneconomica(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionEconomica(this.informacioneconomica);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacioneconomica =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacioneconomica =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacioneconomica==null) {
						this.informacioneconomica = new InformacionEconomica();
					}

					this.setVariablesFormularioToObjetoActualInformacionEconomica(this.informacioneconomica,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionEconomica(this.informacioneconomica);
				}

				if(this.informacioneconomica.getidcliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where idcliente = "+this.informacioneconomica.getidcliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionEconomica(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidvalorclientevinculacionInformacionEconomicaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipovinculacion=true;

			idTienePermisotipovinculacion=this.tienePermisosUsuarioEnPaginaWebInformacionEconomica(TipoVinculacionConstantesFunciones.CLASSNAME);

			if(idTienePermisotipovinculacion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionEconomica.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosInformacionEconomica.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosInformacionEconomica.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomica =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.informacioneconomica =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualInformacionEconomica(this.getinformacioneconomica(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysInformacionEconomica(this.informacioneconomica);

				this.tipovinculacionBeanSwingJInternalFrame=new TipoVinculacionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipovinculacionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipovinculacionBeanSwingJInternalFrame.getTipoVinculacionLogic().setConnexion(this.informacioneconomicaLogic.getConnexion());

				if(this.informacioneconomica.getidvalorclientevinculacion()!=null) {
					this.tipovinculacionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipovinculacionBeanSwingJInternalFrame.setIdActual(this.informacioneconomica.getidvalorclientevinculacion());
					this.tipovinculacionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipovinculacionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipovinculacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoVinculacion();
				}

				JInternalFrameBase jinternalFrame =this.tipovinculacionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderInformacionEconomica=(TitledBorder)this.jScrollPanelDatosInformacionEconomica.getBorder();
				TitledBorder titledBordertipovinculacion=(TitledBorder)this.tipovinculacionBeanSwingJInternalFrame.jScrollPanelDatosTipoVinculacion.getBorder();

				titledBordertipovinculacion.setTitle(titledBorderInformacionEconomica.getTitle() + " -> Tipo Vinculacion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonidvalorclientevinculacionInformacionEconomicaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionEconomica.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionEconomica(this.getinformacioneconomica(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionEconomica(this.informacioneconomica);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacioneconomica =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacioneconomica =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacioneconomica==null) {
						this.informacioneconomica = new InformacionEconomica();
					}

					this.setVariablesFormularioToObjetoActualInformacionEconomica(this.informacioneconomica,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionEconomica(this.informacioneconomica);
				}

				if(this.informacioneconomica.getidvalorclientevinculacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where idvalorclientevinculacion = "+this.informacioneconomica.getidvalorclientevinculacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionEconomica(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoactualizacionInformacionEconomicaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionEconomica.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionEconomica(this.getinformacioneconomica(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionEconomica(this.informacioneconomica);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacioneconomica =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacioneconomica =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacioneconomica==null) {
						this.informacioneconomica = new InformacionEconomica();
					}

					this.setVariablesFormularioToObjetoActualInformacionEconomica(this.informacioneconomica,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionEconomica(this.informacioneconomica);
				}

				if(this.informacioneconomica.getcodigoactualizacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigoactualizacion like '%"+this.informacioneconomica.getcodigoactualizacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionEconomica(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigodestinofinancieroInformacionEconomicaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionEconomica.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionEconomica(this.getinformacioneconomica(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionEconomica(this.informacioneconomica);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacioneconomica =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacioneconomica =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacioneconomica==null) {
						this.informacioneconomica = new InformacionEconomica();
					}

					this.setVariablesFormularioToObjetoActualInformacionEconomica(this.informacioneconomica,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionEconomica(this.informacioneconomica);
				}

				if(this.informacioneconomica.getcodigodestinofinanciero()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigodestinofinanciero like '%"+this.informacioneconomica.getcodigodestinofinanciero()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionEconomica(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonorigenrecursosInformacionEconomicaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionEconomica.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionEconomica(this.getinformacioneconomica(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionEconomica(this.informacioneconomica);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacioneconomica =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacioneconomica =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacioneconomica==null) {
						this.informacioneconomica = new InformacionEconomica();
					}

					this.setVariablesFormularioToObjetoActualInformacionEconomica(this.informacioneconomica,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionEconomica(this.informacioneconomica);
				}

				if(this.informacioneconomica.getorigenrecursos()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where origenrecursos like '%"+this.informacioneconomica.getorigenrecursos()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionEconomica(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncuasavinculacionInformacionEconomicaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionEconomica.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionEconomica(this.getinformacioneconomica(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionEconomica(this.informacioneconomica);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacioneconomica =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacioneconomica =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacioneconomica==null) {
						this.informacioneconomica = new InformacionEconomica();
					}

					this.setVariablesFormularioToObjetoActualInformacionEconomica(this.informacioneconomica,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionEconomica(this.informacioneconomica);
				}

				if(this.informacioneconomica.getcuasavinculacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cuasavinculacion like '%"+this.informacioneconomica.getcuasavinculacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionEconomica(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsectorizacionInformacionEconomicaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionEconomica.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionEconomica(this.getinformacioneconomica(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionEconomica(this.informacioneconomica);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacioneconomica =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacioneconomica =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacioneconomica==null) {
						this.informacioneconomica = new InformacionEconomica();
					}

					this.setVariablesFormularioToObjetoActualInformacionEconomica(this.informacioneconomica,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionEconomica(this.informacioneconomica);
				}

				if(this.informacioneconomica.getsectorizacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where sectorizacion like '%"+this.informacioneconomica.getsectorizacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionEconomica(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesactivoInformacionEconomicaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformacionEconomica.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformacionEconomica(this.getinformacioneconomica(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionEconomica(this.informacioneconomica);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacioneconomica =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informacioneconomica =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informacioneconomica==null) {
						this.informacioneconomica = new InformacionEconomica();
					}

					this.setVariablesFormularioToObjetoActualInformacionEconomica(this.informacioneconomica,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionEconomica(this.informacioneconomica);
				}

				if(this.informacioneconomica.getesactivo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esactivo = "+this.informacioneconomica.getesactivo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformacionEconomica(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdClienteInformacionEconomicaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingInformacionEconomica(false,false);

			this.getInformacionEconomicasFK_IdCliente();

			this.inicializarActualizarBindingInformacionEconomica(false);

			//if(InformacionEconomicaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingInformacionEconomica(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdValorClienteVinculacionInformacionEconomicaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingInformacionEconomica(false,false);

			this.getInformacionEconomicasFK_IdValorClienteVinculacion();

			this.inicializarActualizarBindingInformacionEconomica(false);

			//if(InformacionEconomicaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingInformacionEconomica(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informacioneconomicaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameInformacionEconomica() {
		if(this.jInternalFrameDetalleFormInformacionEconomica!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormInformacionEconomica!=null) {
			this.jInternalFrameDetalleFormInformacionEconomica.setVisible(false);	    			
			this.jInternalFrameDetalleFormInformacionEconomica.dispose();
			this.jInternalFrameDetalleFormInformacionEconomica=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoInformacionEconomica!=null) {
			this.jInternalFrameReporteDinamicoInformacionEconomica.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoInformacionEconomica.dispose();
			this.jInternalFrameReporteDinamicoInformacionEconomica=null;
		}
		
		if(this.jInternalFrameImportacionInformacionEconomica!=null) {
			this.jInternalFrameImportacionInformacionEconomica.setVisible(false);	    			
			this.jInternalFrameImportacionInformacionEconomica.dispose();
			this.jInternalFrameImportacionInformacionEconomica=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessInformacionEconomica();
			
			InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
			
			
			if(sTipo.equals("NuevoInformacionEconomica")) {
				jButtonNuevoInformacionEconomicaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarInformacionEconomica")) {
				jButtonDuplicarInformacionEconomicaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarInformacionEconomica")) {
				jButtonCopiarInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("VerFormInformacionEconomica")) {
				jButtonVerFormInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarInformacionEconomica")) {
				jButtonNuevoInformacionEconomicaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarInformacionEconomica")) {
				jButtonDuplicarInformacionEconomicaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoInformacionEconomica")) {
				jButtonNuevoInformacionEconomicaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarInformacionEconomica")) {
				jButtonDuplicarInformacionEconomicaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesInformacionEconomica")) {
				jButtonNuevoInformacionEconomicaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarInformacionEconomica")) {
				jButtonNuevoInformacionEconomicaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesInformacionEconomica")) {
				jButtonNuevoInformacionEconomicaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarInformacionEconomica")) {
				jButtonModificarInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarInformacionEconomica")) {
				jButtonModificarInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarInformacionEconomica")) {
				jButtonModificarInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarInformacionEconomica")) {
				jButtonActualizarInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarInformacionEconomica")) {
				jButtonActualizarInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarInformacionEconomica")) {
				jButtonActualizarInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("EliminarInformacionEconomica")) {
				jButtonEliminarInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarInformacionEconomica")) {
				jButtonEliminarInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarInformacionEconomica")) {
				jButtonEliminarInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("CancelarInformacionEconomica")) {
				jButtonCancelarInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarInformacionEconomica")) {
				jButtonCancelarInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarInformacionEconomica")) {
				jButtonCancelarInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("CerrarInformacionEconomica")) {
				jButtonCerrarInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarInformacionEconomica")) {
				jButtonCerrarInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarInformacionEconomica")) {
				jButtonCerrarInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarInformacionEconomica")) {
				jButtonMostrarOcultarInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarInformacionEconomica")) {
				jButtonCancelarInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosInformacionEconomica")) {
				jButtonGuardarCambiosInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarInformacionEconomica")) {
				jButtonGuardarCambiosInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarInformacionEconomica")) {
				jButtonCopiarInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarInformacionEconomica")) {
				jButtonVerFormInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosInformacionEconomica")) {
				jButtonGuardarCambiosInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarInformacionEconomica")) {
				jButtonCopiarInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormInformacionEconomica")) {
				jButtonVerFormInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaInformacionEconomica")) {
				jButtonGuardarCambiosInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarInformacionEconomica")) {
				jButtonGuardarCambiosInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaInformacionEconomica")) {
				jButtonGuardarCambiosInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionInformacionEconomica")) {
				jButtonRecargarInformacionInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarInformacionEconomica")) {
				jButtonRecargarInformacionInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionInformacionEconomica")) {
				jButtonRecargarInformacionInformacionEconomicaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresInformacionEconomica")) {
				jButtonAnterioresInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarInformacionEconomica")) {
				jButtonAnterioresInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreInformacionEconomica")) {
				jButtonAnterioresInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesInformacionEconomica")) {
				jButtonSiguientesInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarInformacionEconomica")) {
				jButtonSiguientesInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesInformacionEconomica")) {
				jButtonSiguientesInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByInformacionEconomica") || sTipo.equals("MenuItemDetalleAbrirOrderByInformacionEconomica")) {
				jButtonAbrirOrderByInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarInformacionEconomica") || sTipo.equals("MenuItemDetalleMostrarOcultarInformacionEconomica")) {
				jButtonMostrarOcultarInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosInformacionEconomica")) {
				jButtonNuevoGuardarCambiosInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarInformacionEconomica")) {
				jButtonNuevoGuardarCambiosInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosInformacionEconomica")) {
				jButtonNuevoGuardarCambiosInformacionEconomicaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoInformacionEconomica")) {
				jButtonCerrarReporteDinamicoInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoInformacionEconomica")) {
				jButtonGenerarReporteDinamicoInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoInformacionEconomica")) {
				
				jButtonGenerarExcelReporteDinamicoInformacionEconomicaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionInformacionEconomica")) {
				jButtonCerrarImportacionInformacionEconomicaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionInformacionEconomica")) {
				
				jButtonGenerarImportacionInformacionEconomicaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionInformacionEconomica")) {
				
				jButtonAbrirImportacionInformacionEconomicaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesInformacionEconomica")) {
				jComboBoxTiposAccionesInformacionEconomicaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesInformacionEconomica")) {
				jComboBoxTiposRelacionesInformacionEconomicaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioInformacionEconomica")) {
				jComboBoxTiposAccionesInformacionEconomicaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarInformacionEconomica")) {
				
				jComboBoxTiposSeleccionarInformacionEconomicaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralInformacionEconomica")) {
				jTextFieldValorCampoGeneralInformacionEconomicaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByInformacionEconomica")) {
				jButtonAbrirOrderByInformacionEconomicaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarInformacionEconomica")) {
				jButtonAbrirOrderByInformacionEconomicaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByInformacionEconomica")) {
				jButtonCerrarOrderByInformacionEconomicaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idInformacionEconomicaBusqueda")) {
				this.jButtonidInformacionEconomicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("idclienteInformacionEconomica")) {
				this.jButtonidclienteInformacionEconomicaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idclienteInformacionEconomicaUpdate")) {
				this.jButtonidclienteInformacionEconomicaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idclienteInformacionEconomicaBusqueda")) {
				this.jButtonidclienteInformacionEconomicaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvalorclientevinculacionInformacionEconomicaUpdate")) {
				this.jButtonidvalorclientevinculacionInformacionEconomicaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvalorclientevinculacionInformacionEconomicaBusqueda")) {
				this.jButtonidvalorclientevinculacionInformacionEconomicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoactualizacionInformacionEconomicaBusqueda")) {
				this.jButtoncodigoactualizacionInformacionEconomicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigodestinofinancieroInformacionEconomicaBusqueda")) {
				this.jButtoncodigodestinofinancieroInformacionEconomicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("origenrecursosInformacionEconomicaBusqueda")) {
				this.jButtonorigenrecursosInformacionEconomicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cuasavinculacionInformacionEconomicaBusqueda")) {
				this.jButtoncuasavinculacionInformacionEconomicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sectorizacionInformacionEconomicaBusqueda")) {
				this.jButtonsectorizacionInformacionEconomicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esactivoInformacionEconomicaBusqueda")) {
				this.jButtonesactivoInformacionEconomicaBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("idclienteInformacionEconomica")) {
				this.jButtonidclienteInformacionEconomicaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdClienteInformacionEconomica")) {
				this.jButtonFK_IdClienteInformacionEconomicaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdValorClienteVinculacionInformacionEconomica")) {
				this.jButtonFK_IdValorClienteVinculacionInformacionEconomicaActionPerformed(evt);
			}
			
			;
			
			
			InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessInformacionEconomica();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInformacionEconomicaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacioneconomica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacioneconomica);
				
				InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
				
				


				
				InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformacionEconomica.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionEconomica.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			InformacionEconomica informacioneconomicaLocal=null;
			
			if(!this.getEsControlTabla()) {
				informacioneconomicaLocal=this.informacioneconomica;
			} else {
				informacioneconomicaLocal=this.informacioneconomicaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacioneconomica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacioneconomica);
				
				InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
							
				
				


				
				InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformacionEconomica.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionEconomica.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformacionEconomicaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosInformacionEconomica.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaAnterior =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informacioneconomicaAnterior =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
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
			
			InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
			
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
			
			


			
			InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInformacionEconomicaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacioneconomica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacioneconomica);
				
				InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
								
						
				


				
				InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformacionEconomica.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionEconomica.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacioneconomica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacioneconomica);
				
				InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
								
				
				


				
				InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformacionEconomica.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionEconomica.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformacionEconomicaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosInformacionEconomica.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaAnterior =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informacioneconomicaAnterior =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacioneconomica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacioneconomica);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformacionEconomicaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosInformacionEconomica.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaAnterior =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informacioneconomicaAnterior =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformacionEconomicaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.informacioneconomica);
			
			this.actualizarInformacion("INFO_PADRE",false,this.informacioneconomica);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacioneconomica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacioneconomica);
				
				InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
							
				
				


				
				InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformacionEconomica.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionEconomica.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInformacionEconomicaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosInformacionEconomica.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacioneconomicaAnterior =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.informacioneconomicaAnterior =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
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
			
			InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
			
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
			
			


			
			InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformacionEconomicaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.informacioneconomica);
			
			this.actualizarInformacion("INFO_PADRE",false,this.informacioneconomica);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacioneconomica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacioneconomica);
				
				InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
								
				
				


				
				InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformacionEconomica.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionEconomica.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformacionEconomicaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosInformacionEconomica.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaAnterior =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informacioneconomicaAnterior =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformacionEconomicaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.informacioneconomica);
			
			this.actualizarInformacion("INFO_PADRE",false,this.informacioneconomica);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInformacionEconomicaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacioneconomica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacioneconomica);
				
				InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosInformacionEconomica")) {
					jCheckBoxSeleccionarTodosInformacionEconomicaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosInformacionEconomica")) {
					jCheckBoxSeleccionadosInformacionEconomicaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarInformacionEconomica")) {
					
				}
				
				


				
				
				InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformacionEconomica.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionEconomica.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.informacioneconomica);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.informacioneconomica);
				
				InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
												
				
				


				
				
				InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformacionEconomica.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionEconomica.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInformacionEconomicaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosInformacionEconomica.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informacioneconomicaAnterior =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.informacioneconomicaAnterior =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInformacionEconomicaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacioneconomica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacioneconomica);
				
				InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
				
				
				InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
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
			
			InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
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
			
			


			
			InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInformacionEconomicaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacioneconomica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacioneconomica);
				
				InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformacionEconomica.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionEconomica.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informacioneconomica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informacioneconomica);
				
				InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
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
				
				


				
				InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformacionEconomica.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformacionEconomica.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformacionEconomicaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosInformacionEconomica.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informacioneconomicaAnterior =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informacioneconomicaAnterior =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarInformacionEconomica")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosInformacionEconomicaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosInformacionEconomica.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.informacioneconomica =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.informacioneconomica =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.informacioneconomica);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarInformacionEconomica")) {
				
				}
				
				InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarInformacionEconomica")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosInformacionEconomica.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarInformacionEconomica")) {
			
			}
			
			InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessInformacionEconomica();
			
			InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
			
			if(sTipo.equals("NuevoInformacionEconomica")) {
				jButtonNuevoInformacionEconomicaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarInformacionEconomica")) {
				jButtonDuplicarInformacionEconomicaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarInformacionEconomica")) {
				jButtonCopiarInformacionEconomicaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormInformacionEconomica")) {
				jButtonVerFormInformacionEconomicaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesInformacionEconomica")) {
				jButtonNuevoInformacionEconomicaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarInformacionEconomica")) {
				jButtonModificarInformacionEconomicaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarInformacionEconomica")) {
				jButtonActualizarInformacionEconomicaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarInformacionEconomica")) {
				jButtonEliminarInformacionEconomicaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaInformacionEconomica")) {
				jButtonGuardarCambiosInformacionEconomicaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarInformacionEconomica")) {
				jButtonCancelarInformacionEconomicaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarInformacionEconomica")) {
				jButtonCerrarInformacionEconomicaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosInformacionEconomica")) {
				jButtonGuardarCambiosInformacionEconomicaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosInformacionEconomica")) {
				jButtonNuevoGuardarCambiosInformacionEconomicaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByInformacionEconomica")) {
				jButtonAbrirOrderByInformacionEconomicaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionInformacionEconomica")) {
				jButtonRecargarInformacionInformacionEconomicaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresInformacionEconomica")) {
				jButtonAnterioresInformacionEconomicaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesInformacionEconomica")) {
				jButtonSiguientesInformacionEconomicaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idInformacionEconomicaBusqueda")) {
				this.jButtonidInformacionEconomicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("idclienteInformacionEconomica")) {
				this.jButtonidclienteInformacionEconomicaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idclienteInformacionEconomicaUpdate")) {
				this.jButtonidclienteInformacionEconomicaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idclienteInformacionEconomicaBusqueda")) {
				this.jButtonidclienteInformacionEconomicaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvalorclientevinculacionInformacionEconomicaUpdate")) {
				this.jButtonidvalorclientevinculacionInformacionEconomicaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvalorclientevinculacionInformacionEconomicaBusqueda")) {
				this.jButtonidvalorclientevinculacionInformacionEconomicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoactualizacionInformacionEconomicaBusqueda")) {
				this.jButtoncodigoactualizacionInformacionEconomicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigodestinofinancieroInformacionEconomicaBusqueda")) {
				this.jButtoncodigodestinofinancieroInformacionEconomicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("origenrecursosInformacionEconomicaBusqueda")) {
				this.jButtonorigenrecursosInformacionEconomicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cuasavinculacionInformacionEconomicaBusqueda")) {
				this.jButtoncuasavinculacionInformacionEconomicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sectorizacionInformacionEconomicaBusqueda")) {
				this.jButtonsectorizacionInformacionEconomicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esactivoInformacionEconomicaBusqueda")) {
				this.jButtonesactivoInformacionEconomicaBusquedaActionPerformed(evt);
			}
			
			InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessInformacionEconomica();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameInformacionEconomica")) {
				closingInternalFrameInformacionEconomica();
				
			} else if(sTipo.equals("jButtonCancelarInformacionEconomica")) {
				JInternalFrameBase jInternalFrameDetalleFormInformacionEconomica = (JInternalFrameBase)evt.getSource();
	            	
	            InformacionEconomicaBeanSwingJInternalFrame jInternalFrameParent=(InformacionEconomicaBeanSwingJInternalFrame)jInternalFrameDetalleFormInformacionEconomica.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarInformacionEconomicaActionPerformed(null);
			}
			
			InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.informacioneconomica,new Object(),this.informacioneconomicaParameterGeneral,this.informacioneconomicaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormInformacionEconomica(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormInformacionEconomica(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormInformacionEconomica(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.informacioneconomica)) {
			if(!esControlTabla) {
				if(InformacionEconomicaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualInformacionEconomica(this.informacioneconomica,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionEconomica(this.informacioneconomica);			
				}
				
				if(this.informacioneconomicaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualInformacionEconomica(this.informacioneconomica,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.informacioneconomicaReturnGeneral=informacioneconomicaLogic.procesarEventosInformacionEconomicasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.informacioneconomicaLogic.getInformacionEconomicas(),this.informacioneconomica,this.informacioneconomicaParameterGeneral,this.isEsNuevoInformacionEconomica,classes);//this.informacioneconomicaLogic.getInformacionEconomica()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanInformacionEconomica(this.informacioneconomicaReturnGeneral,this.informacioneconomicaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.informacioneconomicaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanInformacionEconomica(classes,this.informacioneconomicaReturnGeneral,this.informacioneconomicaBean,false);
					}
						
					if(this.informacioneconomicaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyInformacionEconomica(this.informacioneconomicaReturnGeneral.getInformacionEconomica());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioInformacionEconomica(this.informacioneconomicaReturnGeneral.getInformacionEconomica());	
					}
						
					if(this.informacioneconomicaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioInformacionEconomica(this.informacioneconomicaReturnGeneral.getInformacionEconomica(),classes);//this.informacioneconomicaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioInformacionEconomica(this.informacioneconomica,classes);//this.informacioneconomicaBean);									
				}
			
				if(InformacionEconomicaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualInformacionEconomica(this.informacioneconomica,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysInformacionEconomica(this.informacioneconomica);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.informacioneconomicaAnterior!=null) {
						this.informacioneconomica=this.informacioneconomicaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.informacioneconomicaReturnGeneral=informacioneconomicaLogic.procesarEventosInformacionEconomicasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.informacioneconomicaLogic.getInformacionEconomicas(),this.informacioneconomica,this.informacioneconomicaParameterGeneral,this.isEsNuevoInformacionEconomica,classes);//this.informacioneconomicaLogic.getInformacionEconomica()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.informacioneconomicaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.informacioneconomicaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.informacioneconomicaReturnGeneral.getInformacionEconomica(),informacioneconomicaLogic.getInformacionEconomicas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.informacioneconomicaReturnGeneral.getInformacionEconomica(),this.informacioneconomicas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosInformacionEconomica.repaint();
				
				//((AbstractTableModel) this.jTableDatosInformacionEconomica.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosInformacionEconomica();
			}
		}
	}
	
	public void actualizarVisualTableDatosInformacionEconomica() throws Exception {
		
		InformacionEconomicaModel informacioneconomicaModel=(InformacionEconomicaModel)this.jTableDatosInformacionEconomica.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			informacioneconomicaModel.informacioneconomicas=this.informacioneconomicaLogic.getInformacionEconomicas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			informacioneconomicaModel.informacioneconomicas=this.informacioneconomicas;
		}
		
		
		((InformacionEconomicaModel) this.jTableDatosInformacionEconomica.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaInformacionEconomica() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getinformacioneconomicaAnterior(),this.informacioneconomicaLogic.getInformacionEconomicas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getinformacioneconomicaAnterior(),this.informacioneconomicas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosInformacionEconomica();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioInformacionEconomica(InformacionEconomica informacioneconomica,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
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
										
				InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.informacioneconomica,new Object(),generalEntityParameterGeneral,this.informacioneconomicaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.informacioneconomicaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=InformacionEconomicaConstantesFunciones.getClassesRelationshipsOfInformacionEconomica(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=InformacionEconomicaConstantesFunciones.getClassesRelationshipsFromStringsOfInformacionEconomica(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormInformacionEconomica(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				InformacionEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.informacioneconomica,new Object(),generalEntityParameterGeneral,this.informacioneconomicaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioInformacionEconomica(InformacionEconomicaBean informacioneconomicaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanInformacionEconomica(ArrayList<Classe> classes,InformacionEconomicaReturnGeneral informacioneconomicaReturnGeneral,InformacionEconomicaBean informacioneconomicaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualInformacionEconomica(InformacionEconomica informacioneconomica,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.informacioneconomica)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormInformacionEconomica = new InformacionEconomicaDetalleFormJInternalFrame(jDesktopPane,this.informacioneconomicaSessionBean.getConGuardarRelaciones(),this.informacioneconomicaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormInformacionEconomica);
		this.jInternalFrameDetalleFormInformacionEconomica.setVisible(false);
		this.jInternalFrameDetalleFormInformacionEconomica.setSelected(false);						
		
		this.jInternalFrameDetalleFormInformacionEconomica.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormInformacionEconomica.informacioneconomicaLogic=this.informacioneconomicaLogic;
		
		this.cargarCombosFrameForeignKeyInformacionEconomica("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleInformacionEconomica();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleInformacionEconomica();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyInformacionEconomica("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyInformacionEconomica();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormInformacionEconomica.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarInformacionEconomica"));
		
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonModificarInformacionEconomica.addActionListener(new ButtonActionListener(this,"ModificarInformacionEconomica"));

		
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonModificarToolBarInformacionEconomica.addActionListener(new ButtonActionListener(this,"ModificarToolBarInformacionEconomica"));
					
		this.jInternalFrameDetalleFormInformacionEconomica.jMenuItemModificarInformacionEconomica.addActionListener(new ButtonActionListener(this,"MenuItemModificarInformacionEconomica"));		
		
		
		
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonActualizarInformacionEconomica.addActionListener (new ButtonActionListener(this,"ActualizarInformacionEconomica"));
		
		
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonActualizarToolBarInformacionEconomica.addActionListener(new ButtonActionListener(this,"ActualizarToolBarInformacionEconomica"));
						
		this.jInternalFrameDetalleFormInformacionEconomica.jMenuItemActualizarInformacionEconomica.addActionListener (new ButtonActionListener(this,"MenuItemActualizarInformacionEconomica"));		
		
		
		
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonEliminarInformacionEconomica.addActionListener (new ButtonActionListener(this,"EliminarInformacionEconomica"));
		
		
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonEliminarToolBarInformacionEconomica.addActionListener (new ButtonActionListener(this,"EliminarToolBarInformacionEconomica"));
								
		this.jInternalFrameDetalleFormInformacionEconomica.jMenuItemEliminarInformacionEconomica.addActionListener (new ButtonActionListener(this,"MenuItemEliminarInformacionEconomica"));		
		
		
		
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonCancelarInformacionEconomica.addActionListener (new ButtonActionListener(this,"CancelarInformacionEconomica"));
		
		
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonCancelarToolBarInformacionEconomica.addActionListener (new ButtonActionListener(this,"CancelarToolBarInformacionEconomica"));
					
		this.jInternalFrameDetalleFormInformacionEconomica.jMenuItemCancelarInformacionEconomica.addActionListener (new ButtonActionListener(this,"MenuItemCancelarInformacionEconomica"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormInformacionEconomica.jMenuItemDetalleCerrarInformacionEconomica.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarInformacionEconomica"));		
		
		
		
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonGuardarCambiosToolBarInformacionEconomica.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarInformacionEconomica"));
		
		
		
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonGuardarCambiosToolBarInformacionEconomica.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarInformacionEconomica"));
		
		
		
		this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxTiposAccionesFormularioInformacionEconomica.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioInformacionEconomica"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonidInformacionEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"idInformacionEconomicaBusqueda"));
		//jButtonidclienteInformacionEconomica.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonidclienteInformacionEconomicaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonidclienteInformacionEconomica.addActionListener(new ButtonActionListener(this,"idclienteInformacionEconomica"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonidclienteInformacionEconomicaUpdate.addActionListener(new ButtonActionListener(this,"idclienteInformacionEconomicaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonidclienteInformacionEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"idclienteInformacionEconomicaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonidvalorclientevinculacionInformacionEconomicaUpdate.addActionListener(new ButtonActionListener(this,"idvalorclientevinculacionInformacionEconomicaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonidvalorclientevinculacionInformacionEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclientevinculacionInformacionEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionEconomica.jButtoncodigoactualizacionInformacionEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"codigoactualizacionInformacionEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionEconomica.jButtoncodigodestinofinancieroInformacionEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"codigodestinofinancieroInformacionEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonorigenrecursosInformacionEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"origenrecursosInformacionEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionEconomica.jButtoncuasavinculacionInformacionEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"cuasavinculacionInformacionEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonsectorizacionInformacionEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"sectorizacionInformacionEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonesactivoInformacionEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"esactivoInformacionEconomicaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormInformacionEconomica.jTabbedPaneRelacionesInformacionEconomica.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesInformacionEconomica"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameInformacionEconomica"));
		
		if(this.jInternalFrameDetalleFormInformacionEconomica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionEconomica.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarInformacionEconomica"));
		}
		
		this.jTableDatosInformacionEconomica.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarInformacionEconomica"));
		
		this.jTableDatosInformacionEconomica.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarInformacionEconomica"));
		
		this.jButtonNuevoInformacionEconomica.addActionListener(new ButtonActionListener(this,"NuevoInformacionEconomica"));
		
		this.jButtonDuplicarInformacionEconomica.addActionListener(new ButtonActionListener(this,"DuplicarInformacionEconomica"));
		
		this.jButtonCopiarInformacionEconomica.addActionListener(new ButtonActionListener(this,"CopiarInformacionEconomica"));
		
		this.jButtonVerFormInformacionEconomica.addActionListener(new ButtonActionListener(this,"VerFormInformacionEconomica"));
		
		
		this.jButtonNuevoToolBarInformacionEconomica.addActionListener(new ButtonActionListener(this,"NuevoToolBarInformacionEconomica"));
			
		this.jButtonDuplicarToolBarInformacionEconomica.addActionListener(new ButtonActionListener(this,"DuplicarToolBarInformacionEconomica"));
			
		this.jMenuItemNuevoInformacionEconomica.addActionListener (new ButtonActionListener(this,"MenuItemNuevoInformacionEconomica"));
			
		this.jMenuItemDuplicarInformacionEconomica.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarInformacionEconomica"));		
		
		
		this.jButtonNuevoRelacionesInformacionEconomica.addActionListener (new ButtonActionListener(this,"NuevoRelacionesInformacionEconomica"));
		
		
		this.jButtonNuevoRelacionesToolBarInformacionEconomica.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarInformacionEconomica"));
			
		this.jMenuItemNuevoRelacionesInformacionEconomica.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesInformacionEconomica"));		
		
		
		if(this.jInternalFrameDetalleFormInformacionEconomica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionEconomica.jButtonModificarInformacionEconomica.addActionListener(new ButtonActionListener(this,"ModificarInformacionEconomica"));
		}
		
		
		if(this.jInternalFrameDetalleFormInformacionEconomica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionEconomica.jButtonModificarToolBarInformacionEconomica.addActionListener(new ButtonActionListener(this,"ModificarToolBarInformacionEconomica"));
			
			this.jInternalFrameDetalleFormInformacionEconomica.jMenuItemModificarInformacionEconomica.addActionListener(new ButtonActionListener(this,"MenuItemModificarInformacionEconomica"));		
		}
		
		
		if(this.jInternalFrameDetalleFormInformacionEconomica!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormInformacionEconomica.jButtonActualizarInformacionEconomica.addActionListener (new ButtonActionListener(this,"ActualizarInformacionEconomica"));
		}
		
		
		if(this.jInternalFrameDetalleFormInformacionEconomica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionEconomica.jButtonActualizarToolBarInformacionEconomica.addActionListener(new ButtonActionListener(this,"ActualizarToolBarInformacionEconomica"));
				
			this.jInternalFrameDetalleFormInformacionEconomica.jMenuItemActualizarInformacionEconomica.addActionListener (new ButtonActionListener(this,"MenuItemActualizarInformacionEconomica"));		
		}
		
		
		if(this.jInternalFrameDetalleFormInformacionEconomica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionEconomica.jButtonEliminarInformacionEconomica.addActionListener (new ButtonActionListener(this,"EliminarInformacionEconomica"));
		}
		
		
		if(this.jInternalFrameDetalleFormInformacionEconomica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionEconomica.jButtonEliminarToolBarInformacionEconomica.addActionListener (new ButtonActionListener(this,"EliminarToolBarInformacionEconomica"));
						
			this.jInternalFrameDetalleFormInformacionEconomica.jMenuItemEliminarInformacionEconomica.addActionListener (new ButtonActionListener(this,"MenuItemEliminarInformacionEconomica"));		
		}
		
		
		if(this.jInternalFrameDetalleFormInformacionEconomica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionEconomica.jButtonCancelarInformacionEconomica.addActionListener (new ButtonActionListener(this,"CancelarInformacionEconomica"));
		}
		
		
		if(this.jInternalFrameDetalleFormInformacionEconomica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionEconomica.jButtonCancelarToolBarInformacionEconomica.addActionListener (new ButtonActionListener(this,"CancelarToolBarInformacionEconomica"));
			
			this.jInternalFrameDetalleFormInformacionEconomica.jMenuItemCancelarInformacionEconomica.addActionListener (new ButtonActionListener(this,"MenuItemCancelarInformacionEconomica"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarInformacionEconomica.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarInformacionEconomica"));		
		
		
		this.jButtonCerrarInformacionEconomica.addActionListener (new ButtonActionListener(this,"CerrarInformacionEconomica"));
		
		
		this.jButtonCerrarToolBarInformacionEconomica.addActionListener (new ButtonActionListener(this,"CerrarToolBarInformacionEconomica"));
			
		this.jMenuItemCerrarInformacionEconomica.addActionListener (new ButtonActionListener(this,"MenuItemCerrarInformacionEconomica"));
			
		if(this.jInternalFrameDetalleFormInformacionEconomica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionEconomica.jMenuItemDetalleCerrarInformacionEconomica.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarInformacionEconomica"));		
		}
		
		
		if(this.jInternalFrameDetalleFormInformacionEconomica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionEconomica.jButtonGuardarCambiosInformacionEconomica.addActionListener (new ButtonActionListener(this,"GuardarCambiosInformacionEconomica"));
		}
		
		
		if(this.jInternalFrameDetalleFormInformacionEconomica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionEconomica.jButtonGuardarCambiosToolBarInformacionEconomica.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarInformacionEconomica"));
		}
		
		this.jButtonCopiarToolBarInformacionEconomica.addActionListener (new ButtonActionListener(this,"CopiarToolBarInformacionEconomica"));
			
		this.jButtonVerFormToolBarInformacionEconomica.addActionListener (new ButtonActionListener(this,"VerFormToolBarInformacionEconomica"));
		
		this.jMenuItemGuardarCambiosInformacionEconomica.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosInformacionEconomica"));
			
		this.jMenuItemCopiarInformacionEconomica.addActionListener (new ButtonActionListener(this,"MenuItemCopiarInformacionEconomica"));		
		
		this.jMenuItemVerFormInformacionEconomica.addActionListener (new ButtonActionListener(this,"MenuItemVerFormInformacionEconomica"));		
		
		
		this.jButtonGuardarCambiosTablaInformacionEconomica.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaInformacionEconomica"));
		
		
		this.jButtonGuardarCambiosTablaToolBarInformacionEconomica.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarInformacionEconomica"));
			
		this.jMenuItemGuardarCambiosTablaInformacionEconomica.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaInformacionEconomica"));		
		
		
		
		this.jButtonRecargarInformacionInformacionEconomica.addActionListener (new ButtonActionListener(this,"RecargarInformacionInformacionEconomica"));
					
		this.jButtonRecargarInformacionToolBarInformacionEconomica.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarInformacionEconomica"));
		
		this.jMenuItemRecargarInformacionInformacionEconomica.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionInformacionEconomica"));		
		
		
		
		this.jButtonAnterioresInformacionEconomica.addActionListener (new ButtonActionListener(this,"AnterioresInformacionEconomica"));
		
		
		this.jButtonAnterioresToolBarInformacionEconomica.addActionListener (new ButtonActionListener(this,"AnterioresToolBarInformacionEconomica"));
		
		this.jMenuItemAnterioresInformacionEconomica.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresInformacionEconomica"));		
		
		
		this.jButtonSiguientesInformacionEconomica.addActionListener (new ButtonActionListener(this,"SiguientesInformacionEconomica"));
		
		
		this.jButtonSiguientesToolBarInformacionEconomica.addActionListener (new ButtonActionListener(this,"SiguientesToolBarInformacionEconomica"));
			
		this.jMenuItemSiguientesInformacionEconomica.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesInformacionEconomica"));
			
		this.jMenuItemAbrirOrderByInformacionEconomica.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByInformacionEconomica"));
			
		this.jMenuItemMostrarOcultarInformacionEconomica.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarInformacionEconomica"));
			
		this.jMenuItemDetalleAbrirOrderByInformacionEconomica.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByInformacionEconomica"));
			
		this.jMenuItemDetalleMostarOcultarInformacionEconomica.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarInformacionEconomica"));		
		
		
		this.jButtonNuevoGuardarCambiosInformacionEconomica.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosInformacionEconomica"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarInformacionEconomica.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarInformacionEconomica"));
			
		this.jMenuItemNuevoGuardarCambiosInformacionEconomica.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosInformacionEconomica"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosInformacionEconomica.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosInformacionEconomica"));

		this.jCheckBoxSeleccionadosInformacionEconomica.addItemListener(new CheckBoxItemListener(this,"SeleccionadosInformacionEconomica"));
		
		if(this.jInternalFrameDetalleFormInformacionEconomica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxTiposAccionesFormularioInformacionEconomica.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioInformacionEconomica"));
		}
		
		
		this.jComboBoxTiposRelacionesInformacionEconomica.addActionListener (new ButtonActionListener(this,"TiposRelacionesInformacionEconomica"));
			
		this.jComboBoxTiposAccionesInformacionEconomica.addActionListener (new ButtonActionListener(this,"TiposAccionesInformacionEconomica"));
					
		this.jComboBoxTiposSeleccionarInformacionEconomica.addActionListener (new ButtonActionListener(this,"TiposSeleccionarInformacionEconomica"));
			
		this.jTextFieldValorCampoGeneralInformacionEconomica.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralInformacionEconomica"));		
		
		
		if(this.jInternalFrameDetalleFormInformacionEconomica!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonidInformacionEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"idInformacionEconomicaBusqueda"));
		//jButtonidclienteInformacionEconomica.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonidclienteInformacionEconomicaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonidclienteInformacionEconomica.addActionListener(new ButtonActionListener(this,"idclienteInformacionEconomica"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonidclienteInformacionEconomicaUpdate.addActionListener(new ButtonActionListener(this,"idclienteInformacionEconomicaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonidclienteInformacionEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"idclienteInformacionEconomicaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonidvalorclientevinculacionInformacionEconomicaUpdate.addActionListener(new ButtonActionListener(this,"idvalorclientevinculacionInformacionEconomicaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonidvalorclientevinculacionInformacionEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclientevinculacionInformacionEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionEconomica.jButtoncodigoactualizacionInformacionEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"codigoactualizacionInformacionEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionEconomica.jButtoncodigodestinofinancieroInformacionEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"codigodestinofinancieroInformacionEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonorigenrecursosInformacionEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"origenrecursosInformacionEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionEconomica.jButtoncuasavinculacionInformacionEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"cuasavinculacionInformacionEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonsectorizacionInformacionEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"sectorizacionInformacionEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonesactivoInformacionEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"esactivoInformacionEconomicaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdClienteInformacionEconomica.addActionListener(new ButtonActionListener(this,"FK_IdClienteInformacionEconomica"));

			this.jButtonBuscarFK_IdClienteidclienteInformacionEconomica.addActionListener(new ButtonActionListener(this,"idclienteInformacionEconomica"));

			this.jButtonFK_IdValorClienteVinculacionInformacionEconomica.addActionListener(new ButtonActionListener(this,"FK_IdValorClienteVinculacionInformacionEconomica"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoInformacionEconomica!=null) {
				this.jInternalFrameReporteDinamicoInformacionEconomica.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoInformacionEconomica"));
				this.jInternalFrameReporteDinamicoInformacionEconomica.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoInformacionEconomica"));
				this.jInternalFrameReporteDinamicoInformacionEconomica.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoInformacionEconomica"));
			}
			
			//this.jButtonCerrarReporteDinamicoInformacionEconomica.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoInformacionEconomica"));				
			//this.jButtonGenerarReporteDinamicoInformacionEconomica.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoInformacionEconomica"));
			//this.jButtonGenerarExcelReporteDinamicoInformacionEconomica.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoInformacionEconomica"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionInformacionEconomica!=null) {
				this.jInternalFrameImportacionInformacionEconomica.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionInformacionEconomica"));
				this.jInternalFrameImportacionInformacionEconomica.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionInformacionEconomica"));
				this.jInternalFrameImportacionInformacionEconomica.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionInformacionEconomica"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByInformacionEconomica.addActionListener (new ButtonActionListener(this,"AbrirOrderByInformacionEconomica"));
			
			this.jButtonAbrirOrderByToolBarInformacionEconomica.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarInformacionEconomica"));			
			
			if(this.jInternalFrameOrderByInformacionEconomica!=null) {
				this.jInternalFrameOrderByInformacionEconomica.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByInformacionEconomica"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormInformacionEconomica!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormInformacionEconomica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformacionEconomica.jTabbedPaneRelacionesInformacionEconomica.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesInformacionEconomica"));
		
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
            		closingInternalFrameInformacionEconomica();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormInformacionEconomica.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormInformacionEconomica = (JInternalFrameBase)event.getSource();
	            	
	            InformacionEconomicaBeanSwingJInternalFrame jInternalFrameParent=(InformacionEconomicaBeanSwingJInternalFrame)jInternalFrameDetalleFormInformacionEconomica.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarInformacionEconomicaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosInformacionEconomica.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosInformacionEconomicaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosInformacionEconomica.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosInformacionEconomica.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoInformacionEconomicaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoInformacionEconomicaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoInformacionEconomicaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoInformacionEconomica";
		inputMap = this.jButtonNuevoInformacionEconomica.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoInformacionEconomica.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoInformacionEconomicaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoInformacionEconomicaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoInformacionEconomicaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoInformacionEconomicaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesInformacionEconomica";
		inputMap = this.jButtonNuevoRelacionesInformacionEconomica.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesInformacionEconomica.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoInformacionEconomicaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarInformacionEconomica";
		inputMap = this.jButtonModificarInformacionEconomica.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarInformacionEconomica.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarInformacionEconomicaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarInformacionEconomica";
		inputMap = this.jButtonActualizarInformacionEconomica.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarInformacionEconomica.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarInformacionEconomicaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarInformacionEconomica";
		inputMap = this.jButtonEliminarInformacionEconomica.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarInformacionEconomica.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarInformacionEconomicaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarInformacionEconomica";
		inputMap = this.jButtonCancelarInformacionEconomica.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarInformacionEconomica.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarInformacionEconomicaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarInformacionEconomica";
		inputMap = this.jButtonCerrarInformacionEconomica.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarInformacionEconomica.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarInformacionEconomicaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonGuardarCambiosInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosInformacionEconomica";
		inputMap = this.jInternalFrameDetalleFormInformacionEconomica.jButtonGuardarCambiosInformacionEconomica.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonGuardarCambiosInformacionEconomica.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosInformacionEconomicaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosInformacionEconomica.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosInformacionEconomicaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesInformacionEconomica.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesInformacionEconomicaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarInformacionEconomica.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarInformacionEconomicaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralInformacionEconomica.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralInformacionEconomicaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonidInformacionEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"idInformacionEconomicaBusqueda"));
		//jButtonidclienteInformacionEconomica.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonidclienteInformacionEconomicaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonidclienteInformacionEconomica.addActionListener(new ButtonActionListener(this,"idclienteInformacionEconomica"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonidclienteInformacionEconomicaUpdate.addActionListener(new ButtonActionListener(this,"idclienteInformacionEconomicaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonidclienteInformacionEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"idclienteInformacionEconomicaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonidvalorclientevinculacionInformacionEconomicaUpdate.addActionListener(new ButtonActionListener(this,"idvalorclientevinculacionInformacionEconomicaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonidvalorclientevinculacionInformacionEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclientevinculacionInformacionEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionEconomica.jButtoncodigoactualizacionInformacionEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"codigoactualizacionInformacionEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionEconomica.jButtoncodigodestinofinancieroInformacionEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"codigodestinofinancieroInformacionEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonorigenrecursosInformacionEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"origenrecursosInformacionEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionEconomica.jButtoncuasavinculacionInformacionEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"cuasavinculacionInformacionEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonsectorizacionInformacionEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"sectorizacionInformacionEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformacionEconomica.jButtonesactivoInformacionEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"esactivoInformacionEconomicaBusqueda"));
		
		
		this.jButtonFK_IdClienteInformacionEconomica.addActionListener(new ButtonActionListener(this,"FK_IdClienteInformacionEconomica"));

		this.jButtonBuscarFK_IdClienteidclienteInformacionEconomica.addActionListener(new ButtonActionListener(this,"idclienteInformacionEconomica"));

		this.jButtonFK_IdValorClienteVinculacionInformacionEconomica.addActionListener(new ButtonActionListener(this,"FK_IdValorClienteVinculacionInformacionEconomica"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionInformacionEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionInformacionEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarInformacionEconomicaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarInformacionEconomica.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosInformacionEconomica(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(InformacionEconomica informacioneconomicaAux:this.informacioneconomicaLogic.getInformacionEconomicas()) {
					informacioneconomicaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(InformacionEconomica informacioneconomicaAux:informacioneconomicas) {
					informacioneconomicaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosInformacionEconomicaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingInformacionEconomica(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(InformacionEconomica informacioneconomicaAux:this.informacioneconomicaLogic.getInformacionEconomicas()) {
						informacioneconomicaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(InformacionEconomica informacioneconomicaAux:informacioneconomicas) {
						informacioneconomicaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(InformacionEconomica informacioneconomicaAux:this.informacioneconomicaLogic.getInformacionEconomicas()) {
					
						if(sTipoSeleccionar.equals(InformacionEconomicaConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							informacioneconomicaAux.setesactivo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(InformacionEconomica informacioneconomicaAux:informacioneconomicas) {
						
						if(sTipoSeleccionar.equals(InformacionEconomicaConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							informacioneconomicaAux.setesactivo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaInformacionEconomica(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosInformacionEconomica.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosInformacionEconomica.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosInformacionEconomica,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosInformacionEconomicaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingInformacionEconomica(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosInformacionEconomica.getSelectedRows();
			
			InformacionEconomica informacioneconomicaLocal=new InformacionEconomica();
			
			//this.seleccionarTodosInformacionEconomica(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					informacioneconomicaLocal =(InformacionEconomica) this.informacioneconomicaLogic.getInformacionEconomicas().toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					informacioneconomicaLocal =(InformacionEconomica) this.informacioneconomicas.toArray()[this.jTableDatosInformacionEconomica.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				informacioneconomicaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(InformacionEconomica informacioneconomicaAux:this.informacioneconomicaLogic.getInformacionEconomicas()) {
						informacioneconomicaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(InformacionEconomica informacioneconomicaAux:informacioneconomicas) {
						informacioneconomicaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaInformacionEconomica(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosInformacionEconomica.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosInformacionEconomica.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosInformacionEconomica,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualInformacionEconomicaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarInformacionEconomicaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralInformacionEconomicaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingInformacionEconomica(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralInformacionEconomica.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(InformacionEconomica informacioneconomicaAux:this.informacioneconomicaLogic.getInformacionEconomicas()) {
				
						if(sTipoSeleccionar.equals(InformacionEconomicaConstantesFunciones.LABEL_CODIGOACTUALIZACION)) {
							existe=true;
							informacioneconomicaAux.setcodigoactualizacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformacionEconomicaConstantesFunciones.LABEL_CODIGODESTINOFINANCIERO)) {
							existe=true;
							informacioneconomicaAux.setcodigodestinofinanciero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformacionEconomicaConstantesFunciones.LABEL_ORIGENRECURSOS)) {
							existe=true;
							informacioneconomicaAux.setorigenrecursos(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformacionEconomicaConstantesFunciones.LABEL_CUASAVINCULACION)) {
							existe=true;
							informacioneconomicaAux.setcuasavinculacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformacionEconomicaConstantesFunciones.LABEL_SECTORIZACION)) {
							existe=true;
							informacioneconomicaAux.setsectorizacion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(InformacionEconomica informacioneconomicaAux:informacioneconomicas) {
					
						if(sTipoSeleccionar.equals(InformacionEconomicaConstantesFunciones.LABEL_CODIGOACTUALIZACION)) {
							existe=true;
							informacioneconomicaAux.setcodigoactualizacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformacionEconomicaConstantesFunciones.LABEL_CODIGODESTINOFINANCIERO)) {
							existe=true;
							informacioneconomicaAux.setcodigodestinofinanciero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformacionEconomicaConstantesFunciones.LABEL_ORIGENRECURSOS)) {
							existe=true;
							informacioneconomicaAux.setorigenrecursos(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformacionEconomicaConstantesFunciones.LABEL_CUASAVINCULACION)) {
							existe=true;
							informacioneconomicaAux.setcuasavinculacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformacionEconomicaConstantesFunciones.LABEL_SECTORIZACION)) {
							existe=true;
							informacioneconomicaAux.setsectorizacion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaInformacionEconomica(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesInformacionEconomicaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingInformacionEconomica(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioInformacionEconomica=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesInformacionEconomica.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxTiposAccionesFormularioInformacionEconomica.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteInformacionEconomica) {				
					conSplash=true;//false;										
					
					//this.startProcessInformacionEconomica(conSplash);
				
					this.generarReporteInformacionEconomicasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesInformacionEconomica.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxTiposAccionesFormularioInformacionEconomica.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoInformacionEconomicasSeleccionados();
				//this.jComboBoxTiposAccionesInformacionEconomica.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoInformacionEconomicasSeleccionados(false);
				//this.jComboBoxTiposAccionesInformacionEconomica.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoInformacionEconomicasSeleccionados(true);
				//this.jComboBoxTiposAccionesInformacionEconomica.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessInformacionEconomica();
				
				this.exportarInformacionEconomicasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesInformacionEconomica.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxTiposAccionesFormularioInformacionEconomica.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionInformacionEconomicas();
				//this.importarInformacionEconomicas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesInformacionEconomica.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxTiposAccionesFormularioInformacionEconomica.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessInformacionEconomica();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelInformacionEconomicasSeleccionados();
				//this.jComboBoxTiposAccionesInformacionEconomica.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Informacion Economica", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessInformacionEconomica();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoInformacionEconomica)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyInformacionEconomica(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Informacion Economica",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesInformacionEconomica.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxTiposAccionesFormularioInformacionEconomica.setSelectedIndex(0);					
				}	
			} 			
			else if(InformacionEconomicaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteInformacionEconomica) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessInformacionEconomica(conSplash);
					
						//this.actualizarParametrosGeneralInformacionEconomica();
						
						this.generarReporteProcesoAccionInformacionEconomicasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesInformacionEconomica.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxTiposAccionesFormularioInformacionEconomica.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(InformacionEconomicaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Informacion EconomicaS SELECCIONADOS?", "MANTENIMIENTO DE Informacion Economica", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessInformacionEconomica();
				
						this.actualizarParametrosGeneralInformacionEconomica();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.informacioneconomicaReturnGeneral=informacioneconomicaLogic.procesarAccionInformacionEconomicasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.informacioneconomicaLogic.getInformacionEconomicas(),this.informacioneconomicaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarInformacionEconomicaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesInformacionEconomica.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxTiposAccionesFormularioInformacionEconomica.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralInformacionEconomica();
					
					InformacionEconomicaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarInformacionEconomicaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesInformacionEconomica.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxTiposAccionesFormularioInformacionEconomica.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessInformacionEconomica(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesInformacionEconomicaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessInformacionEconomica();
			
			if(this.jInternalFrameDetalleFormInformacionEconomica==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<InformacionEconomica> informacioneconomicasSeleccionados=new ArrayList<InformacionEconomica>();		
			InformacionEconomica informacioneconomica=new InformacionEconomica();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingInformacionEconomica(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesInformacionEconomica.getSelectedItem();
			
			
			
			
			informacioneconomicasSeleccionados=this.getInformacionEconomicasSeleccionados(true);
			//this.sTipoAccion;
			
			if(informacioneconomicasSeleccionados.size()==1) {
				for(InformacionEconomica informacioneconomicaAux:informacioneconomicasSeleccionados) {
					informacioneconomica=informacioneconomicaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessInformacionEconomica();
			
      		//this.finishProcessInformacionEconomica(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarInformacionEconomicaReturnGeneral() throws Exception {
		if(this.informacioneconomicaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.informacioneconomicaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.informacioneconomicaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.informacioneconomicaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.informacioneconomicaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.informacioneconomicaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingInformacionEconomica(false);
		}
		
		if(this.informacioneconomicaReturnGeneral.getConRetornoLista() || this.informacioneconomicaReturnGeneral.getConRetornoObjeto()) {
			if(this.informacioneconomicaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.informacioneconomicaLogic.setInformacionEconomicas(this.informacioneconomicaReturnGeneral.getInformacionEconomicas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.informacioneconomicaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.informacioneconomicaLogic.setInformacionEconomica(this.informacioneconomicaReturnGeneral.getInformacionEconomica());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingInformacionEconomica(false);
		}
	}
	
	public void actualizarParametrosGeneralInformacionEconomica() throws Exception {
		
		
	}
	
	public ArrayList<InformacionEconomica> getInformacionEconomicasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<InformacionEconomica> informacioneconomicasSeleccionados=new ArrayList<InformacionEconomica>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioInformacionEconomica) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(InformacionEconomica informacioneconomicaAux:informacioneconomicaLogic.getInformacionEconomicas()) {
					if(informacioneconomicaAux.getIsSelected()) {
						informacioneconomicasSeleccionados.add(informacioneconomicaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(InformacionEconomica informacioneconomicaAux:this.informacioneconomicas) {
					if(informacioneconomicaAux.getIsSelected()) {
						informacioneconomicasSeleccionados.add(informacioneconomicaAux);				
					}
				}
			}
			
			if(informacioneconomicasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						informacioneconomicasSeleccionados.addAll(this.informacioneconomicaLogic.getInformacionEconomicas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						informacioneconomicasSeleccionados.addAll(this.informacioneconomicas);				
					}
				}
			}
		} else {
			informacioneconomicasSeleccionados.add(this.informacioneconomica);
		}
		
		return informacioneconomicasSeleccionados;
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
	
	public void generarReporteInformacionEconomicasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalInformacionEconomicasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoInformacionEconomicasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoInformacionEconomicasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoInformacionEconomicasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Informacion Economica",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesInformacionEconomicasSeleccionados() throws Exception {
		ArrayList<InformacionEconomica> informacioneconomicasSeleccionados=new ArrayList<InformacionEconomica>();		
		
		informacioneconomicasSeleccionados=this.getInformacionEconomicasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteInformacionEconomicas("Todos",informacioneconomicasSeleccionados);
		
	}	
	
	public void generarReporteNormalInformacionEconomicasSeleccionados() throws Exception {
		ArrayList<InformacionEconomica> informacioneconomicasSeleccionados=new ArrayList<InformacionEconomica>();		
		
		informacioneconomicasSeleccionados=this.getInformacionEconomicasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteInformacionEconomicas("Todos",informacioneconomicasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionInformacionEconomicasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<InformacionEconomica> informacioneconomicasSeleccionados=new ArrayList<InformacionEconomica>();
		
		informacioneconomicasSeleccionados=this.getInformacionEconomicasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteInformacionEconomicas("Todos",informacioneconomicasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoInformacionEconomicasSeleccionados() throws Exception {
		ArrayList<InformacionEconomica> informacioneconomicasSeleccionados=new ArrayList<InformacionEconomica>();		
		
		
		this.abrirInicializarFrameReporteDinamicoInformacionEconomica();
		
		
		informacioneconomicasSeleccionados=this.getInformacionEconomicasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoInformacionEconomica();
		
		
		//this.generarReporteInformacionEconomicas("Todos",informacioneconomicasSeleccionados ,informacioneconomicaImplementable,informacioneconomicaImplementableHome);
	}
	
	public void mostrarImportacionInformacionEconomicas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionInformacionEconomica();
		
		this.abrirFrameImportacionInformacionEconomica();		
		
			
		//this.generarReporteInformacionEconomicas("Todos",informacioneconomicasSeleccionados ,informacioneconomicaImplementable,informacioneconomicaImplementableHome);
	}
	
	public void importarInformacionEconomicas() throws Exception {		
	
	}
	
	public void exportarInformacionEconomicasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelInformacionEconomicasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoInformacionEconomicasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlInformacionEconomicasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Informacion Economica",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoInformacionEconomicasSeleccionados() throws Exception {
		ArrayList<InformacionEconomica> informacioneconomicasSeleccionados=new ArrayList<InformacionEconomica>();		
		
		informacioneconomicasSeleccionados=this.getInformacionEconomicasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"informacioneconomica."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarInformacionEconomica(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(InformacionEconomica informacioneconomicaAux:informacioneconomicasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarInformacionEconomica(informacioneconomicaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//informacioneconomicaAux.setsDetalleGeneralEntityReporte(informacioneconomicaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informacion Economica",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarInformacionEconomica(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=InformacionEconomicaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionEconomicaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionEconomicaConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionEconomicaConstantesFunciones.LABEL_IDTIPOVINCULACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionEconomicaConstantesFunciones.LABEL_CODIGOACTUALIZACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionEconomicaConstantesFunciones.LABEL_CODIGODESTINOFINANCIERO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionEconomicaConstantesFunciones.LABEL_ORIGENRECURSOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionEconomicaConstantesFunciones.LABEL_CUASAVINCULACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionEconomicaConstantesFunciones.LABEL_SECTORIZACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformacionEconomicaConstantesFunciones.LABEL_ESACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarInformacionEconomica(InformacionEconomica informacioneconomica,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=informacioneconomica.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=informacioneconomica.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=informacioneconomica.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informacioneconomica.gettipovinculacion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informacioneconomica.getcodigoactualizacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informacioneconomica.getcodigodestinofinanciero();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informacioneconomica.getorigenrecursos();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informacioneconomica.getcuasavinculacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informacioneconomica.getsectorizacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informacioneconomica.getesactivo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelInformacionEconomicasSeleccionados() throws Exception {
		ArrayList<InformacionEconomica> informacioneconomicasSeleccionados=new ArrayList<InformacionEconomica>();		
		
		informacioneconomicasSeleccionados=this.getInformacionEconomicasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"informacioneconomica.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("InformacionEconomicas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelInformacionEconomica(row);				
				iRow++;
			}				
			
			for(InformacionEconomica informacioneconomicaAux:informacioneconomicasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelInformacionEconomica(informacioneconomicaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informacion Economica",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlInformacionEconomicasSeleccionados() throws Exception {
		ArrayList<InformacionEconomica> informacioneconomicasSeleccionados=new ArrayList<InformacionEconomica>();		
		
		informacioneconomicasSeleccionados=this.getInformacionEconomicasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"informacioneconomica.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("informacioneconomicas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("informacioneconomica");
			//elementRoot.appendChild(element);
		
			for(InformacionEconomica informacioneconomicaAux:informacioneconomicasSeleccionados) {
				element = document.createElement("informacioneconomica");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlInformacionEconomica(informacioneconomicaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informacion Economica",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelInformacionEconomica(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionEconomicaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionEconomicaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(InformacionEconomicaConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionEconomicaConstantesFunciones.LABEL_IDTIPOVINCULACION);
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionEconomicaConstantesFunciones.LABEL_CODIGOACTUALIZACION);
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionEconomicaConstantesFunciones.LABEL_CODIGODESTINOFINANCIERO);
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionEconomicaConstantesFunciones.LABEL_ORIGENRECURSOS);
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionEconomicaConstantesFunciones.LABEL_CUASAVINCULACION);
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionEconomicaConstantesFunciones.LABEL_SECTORIZACION);
		cell = row.createCell(iColumn++);cell.setCellValue(InformacionEconomicaConstantesFunciones.LABEL_ESACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelInformacionEconomica(InformacionEconomica informacioneconomica,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(informacioneconomica.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(informacioneconomica.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(informacioneconomica.gettipovinculacion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(informacioneconomica.getcodigoactualizacion());
		cell = row.createCell(iColumn++);cell.setCellValue(informacioneconomica.getcodigodestinofinanciero());
		cell = row.createCell(iColumn++);cell.setCellValue(informacioneconomica.getorigenrecursos());
		cell = row.createCell(iColumn++);cell.setCellValue(informacioneconomica.getcuasavinculacion());
		cell = row.createCell(iColumn++);cell.setCellValue(informacioneconomica.getsectorizacion());
		cell = row.createCell(iColumn++);cell.setCellValue(informacioneconomica.getesactivo());				
	}
	
	public void setFilaDatosExportarXmlInformacionEconomica(InformacionEconomica informacioneconomica,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(InformacionEconomicaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(informacioneconomica.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(InformacionEconomicaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(informacioneconomica.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcliente_descripcion = document.createElement(InformacionEconomicaConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(informacioneconomica.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementtipovinculacion_descripcion = document.createElement(InformacionEconomicaConstantesFunciones.IDTIPOVINCULACION);
		elementtipovinculacion_descripcion.appendChild(document.createTextNode(informacioneconomica.gettipovinculacion_descripcion()));
		element.appendChild(elementtipovinculacion_descripcion);

		Element elementcodigoactualizacion = document.createElement(InformacionEconomicaConstantesFunciones.CODIGOACTUALIZACION);
		elementcodigoactualizacion.appendChild(document.createTextNode(informacioneconomica.getcodigoactualizacion().trim()));
		element.appendChild(elementcodigoactualizacion);

		Element elementcodigodestinofinanciero = document.createElement(InformacionEconomicaConstantesFunciones.CODIGODESTINOFINANCIERO);
		elementcodigodestinofinanciero.appendChild(document.createTextNode(informacioneconomica.getcodigodestinofinanciero().trim()));
		element.appendChild(elementcodigodestinofinanciero);

		Element elementorigenrecursos = document.createElement(InformacionEconomicaConstantesFunciones.ORIGENRECURSOS);
		elementorigenrecursos.appendChild(document.createTextNode(informacioneconomica.getorigenrecursos().trim()));
		element.appendChild(elementorigenrecursos);

		Element elementcuasavinculacion = document.createElement(InformacionEconomicaConstantesFunciones.CUASAVINCULACION);
		elementcuasavinculacion.appendChild(document.createTextNode(informacioneconomica.getcuasavinculacion().trim()));
		element.appendChild(elementcuasavinculacion);

		Element elementsectorizacion = document.createElement(InformacionEconomicaConstantesFunciones.SECTORIZACION);
		elementsectorizacion.appendChild(document.createTextNode(informacioneconomica.getsectorizacion().trim()));
		element.appendChild(elementsectorizacion);

		Element elementesactivo = document.createElement(InformacionEconomicaConstantesFunciones.ESACTIVO);
		elementesactivo.appendChild(document.createTextNode(informacioneconomica.getesactivo().toString().trim()));
		element.appendChild(elementesactivo);
	}
	
	public void generarReporteGroupGenericoInformacionEconomicasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<InformacionEconomica> informacioneconomicasSeleccionados=new ArrayList<InformacionEconomica>();
		
		informacioneconomicasSeleccionados=this.getInformacionEconomicasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoInformacionEconomica(informacioneconomicasSeleccionados);
		
		this.generarReporteInformacionEconomicas("Todos",informacioneconomicasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoInformacionEconomica(ArrayList<InformacionEconomica> informacioneconomicasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(InformacionEconomica informacioneconomicaAux:informacioneconomicasSeleccionados) {
				informacioneconomicaAux.setsDetalleGeneralEntityReporte(informacioneconomicaAux.toString());
			
				if(sTipoSeleccionar.equals(InformacionEconomicaConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					informacioneconomicaAux.setsDescripcionGeneralEntityReporte1(informacioneconomicaAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(InformacionEconomicaConstantesFunciones.LABEL_IDTIPOVINCULACION)) {
					existe=true;
					informacioneconomicaAux.setsDescripcionGeneralEntityReporte1(informacioneconomicaAux.gettipovinculacion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(InformacionEconomicaConstantesFunciones.LABEL_CODIGOACTUALIZACION)) {
					existe=true;
					informacioneconomicaAux.setsDescripcionGeneralEntityReporte1(informacioneconomicaAux.getcodigoactualizacion());
				}
				 else if(sTipoSeleccionar.equals(InformacionEconomicaConstantesFunciones.LABEL_CODIGODESTINOFINANCIERO)) {
					existe=true;
					informacioneconomicaAux.setsDescripcionGeneralEntityReporte1(informacioneconomicaAux.getcodigodestinofinanciero());
				}
				 else if(sTipoSeleccionar.equals(InformacionEconomicaConstantesFunciones.LABEL_ORIGENRECURSOS)) {
					existe=true;
					informacioneconomicaAux.setsDescripcionGeneralEntityReporte1(informacioneconomicaAux.getorigenrecursos());
				}
				 else if(sTipoSeleccionar.equals(InformacionEconomicaConstantesFunciones.LABEL_CUASAVINCULACION)) {
					existe=true;
					informacioneconomicaAux.setsDescripcionGeneralEntityReporte1(informacioneconomicaAux.getcuasavinculacion());
				}
				 else if(sTipoSeleccionar.equals(InformacionEconomicaConstantesFunciones.LABEL_SECTORIZACION)) {
					existe=true;
					informacioneconomicaAux.setsDescripcionGeneralEntityReporte1(informacioneconomicaAux.getsectorizacion());
				}
				 else if(sTipoSeleccionar.equals(InformacionEconomicaConstantesFunciones.LABEL_ESACTIVO)) {
					existe=true;
					informacioneconomicaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(informacioneconomicaAux.getesactivo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformacionEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesInformacionEconomica(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoInformacionEconomica=true;
				this.isVisibilidadCeldaNuevoRelacionesInformacionEconomica=true;
				this.isVisibilidadCeldaGuardarCambiosInformacionEconomica=true;
			}
			
			this.isVisibilidadCeldaModificarInformacionEconomica=false;
			this.isVisibilidadCeldaActualizarInformacionEconomica=false;
			this.isVisibilidadCeldaEliminarInformacionEconomica=false;
			this.isVisibilidadCeldaCancelarInformacionEconomica=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInformacionEconomica=true;
				} else {
					this.isVisibilidadCeldaGuardarInformacionEconomica=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoInformacionEconomica=false;
			this.isVisibilidadCeldaNuevoRelacionesInformacionEconomica=false;
			this.isVisibilidadCeldaGuardarCambiosInformacionEconomica=false;
			this.isVisibilidadCeldaModificarInformacionEconomica=false;
			this.isVisibilidadCeldaActualizarInformacionEconomica=true;
			this.isVisibilidadCeldaEliminarInformacionEconomica=false;
			this.isVisibilidadCeldaCancelarInformacionEconomica=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInformacionEconomica=true;
				} else {
					this.isVisibilidadCeldaGuardarInformacionEconomica=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoInformacionEconomica=false;
			this.isVisibilidadCeldaNuevoRelacionesInformacionEconomica=false;
			this.isVisibilidadCeldaGuardarCambiosInformacionEconomica=false;
			this.isVisibilidadCeldaModificarInformacionEconomica=false;
			this.isVisibilidadCeldaActualizarInformacionEconomica=true;
			this.isVisibilidadCeldaEliminarInformacionEconomica=true;
			this.isVisibilidadCeldaCancelarInformacionEconomica=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInformacionEconomica=true;
				} else {
					this.isVisibilidadCeldaGuardarInformacionEconomica=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoInformacionEconomica=false;
			this.isVisibilidadCeldaNuevoRelacionesInformacionEconomica=false;
			this.isVisibilidadCeldaGuardarCambiosInformacionEconomica=false;
			this.isVisibilidadCeldaModificarInformacionEconomica=false;
			this.isVisibilidadCeldaActualizarInformacionEconomica=true;
			this.isVisibilidadCeldaEliminarInformacionEconomica=false;
			this.isVisibilidadCeldaCancelarInformacionEconomica=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInformacionEconomica=false;
				} else {
					this.isVisibilidadCeldaGuardarInformacionEconomica=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoInformacionEconomica=true;
			this.isVisibilidadCeldaNuevoRelacionesInformacionEconomica=true;
			this.isVisibilidadCeldaGuardarCambiosInformacionEconomica=true;
			this.isVisibilidadCeldaModificarInformacionEconomica=false;
			this.isVisibilidadCeldaActualizarInformacionEconomica=false;
			this.isVisibilidadCeldaEliminarInformacionEconomica=false;
			this.isVisibilidadCeldaCancelarInformacionEconomica=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInformacionEconomica=true;
				} else {
					this.isVisibilidadCeldaGuardarInformacionEconomica=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoInformacionEconomica=false;
			this.isVisibilidadCeldaNuevoRelacionesInformacionEconomica=false;
			this.isVisibilidadCeldaGuardarCambiosInformacionEconomica=false;
			this.isVisibilidadCeldaActualizarInformacionEconomica=false;
			this.isVisibilidadCeldaEliminarInformacionEconomica=false;
			this.isVisibilidadCeldaCancelarInformacionEconomica=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInformacionEconomica=false;
				} else {
					this.isVisibilidadCeldaGuardarInformacionEconomica=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoInformacionEconomica=false;
			this.isVisibilidadCeldaNuevoRelacionesInformacionEconomica=false;
			this.isVisibilidadCeldaGuardarCambiosInformacionEconomica=false;
			this.isVisibilidadCeldaModificarInformacionEconomica=true;
			this.isVisibilidadCeldaActualizarInformacionEconomica=false;
			this.isVisibilidadCeldaEliminarInformacionEconomica=false;
			this.isVisibilidadCeldaCancelarInformacionEconomica=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInformacionEconomica=false;
				} else {
					this.isVisibilidadCeldaGuardarInformacionEconomica=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(InformacionEconomicaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoInformacionEconomica=true;
			this.isVisibilidadCeldaNuevoRelacionesInformacionEconomica=true;
			this.isVisibilidadCeldaGuardarCambiosInformacionEconomica=true;
		} else {
			this.actualizarEstadoPanelsInformacionEconomica(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarInformacionEconomica=false;
			//this.isVisibilidadCeldaVerFormInformacionEconomica=false;
			this.isVisibilidadCeldaDuplicarInformacionEconomica=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!informacioneconomicaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesInformacionEconomica=false;
		} else {
			this.isVisibilidadCeldaNuevoInformacionEconomica=false;
			this.isVisibilidadCeldaGuardarCambiosInformacionEconomica=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(informacioneconomicaSessionBean.getEsGuardarRelacionado()) {
			if(!informacioneconomicaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesInformacionEconomica=false;												
			}
			
			this.jButtonCerrarInformacionEconomica.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesInformacionEconomica=false;
		}
		
		if(!this.permiteMantenimiento(this.informacioneconomica)) {
			this.isVisibilidadCeldaActualizarInformacionEconomica=false;
			this.isVisibilidadCeldaEliminarInformacionEconomica=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesInformacionEconomica() {
	}
	
	public void actualizarEstadoPanelsInformacionEconomica(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionInformacionEconomica!=null) {
				this.jScrollPanelDatosEdicionInformacionEconomica.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformacionEconomica!=null) {
				this.jTabbedPaneBusquedasInformacionEconomica.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosInformacionEconomica!=null) {
				this.jScrollPanelDatosInformacionEconomica.setVisible(true);
			}
			
			if(this.jPanelPaginacionInformacionEconomica!=null) {
				this.jPanelPaginacionInformacionEconomica.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesInformacionEconomica!=null) {
				this.jPanelParametrosReportesInformacionEconomica.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionInformacionEconomica!=null) {
				this.jScrollPanelDatosEdicionInformacionEconomica.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformacionEconomica!=null) {
				this.jTabbedPaneBusquedasInformacionEconomica.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosInformacionEconomica!=null) {
				this.jScrollPanelDatosInformacionEconomica.setVisible(false);
			}
			
			if(this.jPanelPaginacionInformacionEconomica!=null) {
				this.jPanelPaginacionInformacionEconomica.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesInformacionEconomica!=null) {
				this.jPanelParametrosReportesInformacionEconomica.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionInformacionEconomica!=null) {
				this.jScrollPanelDatosEdicionInformacionEconomica.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformacionEconomica!=null) {
				this.jTabbedPaneBusquedasInformacionEconomica.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosInformacionEconomica!=null) {
				this.jScrollPanelDatosInformacionEconomica.setVisible(false);
			}
			
			if(this.jPanelPaginacionInformacionEconomica!=null) {
				this.jPanelPaginacionInformacionEconomica.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesInformacionEconomica!=null) {
				this.jPanelParametrosReportesInformacionEconomica.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionInformacionEconomica!=null) {
				this.jScrollPanelDatosEdicionInformacionEconomica.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformacionEconomica!=null) {
				this.jTabbedPaneBusquedasInformacionEconomica.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosInformacionEconomica!=null) {
				this.jScrollPanelDatosInformacionEconomica.setVisible(false);
			}
			
			if(this.jPanelPaginacionInformacionEconomica!=null) {
				this.jPanelPaginacionInformacionEconomica.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesInformacionEconomica!=null) {
				this.jPanelParametrosReportesInformacionEconomica.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionInformacionEconomica!=null) {
				this.jScrollPanelDatosEdicionInformacionEconomica.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformacionEconomica!=null) {
				this.jTabbedPaneBusquedasInformacionEconomica.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosInformacionEconomica!=null) {
				this.jScrollPanelDatosInformacionEconomica.setVisible(true);
			}
			
			if(this.jPanelPaginacionInformacionEconomica!=null) {
				this.jPanelPaginacionInformacionEconomica.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesInformacionEconomica!=null) {
				this.jPanelParametrosReportesInformacionEconomica.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionInformacionEconomica!=null) {
				this.jScrollPanelDatosEdicionInformacionEconomica.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformacionEconomica!=null) {
				this.jTabbedPaneBusquedasInformacionEconomica.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosInformacionEconomica!=null) {
				this.jScrollPanelDatosInformacionEconomica.setVisible(true);
			}
			
			if(this.jPanelPaginacionInformacionEconomica!=null) {
				this.jPanelPaginacionInformacionEconomica.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesInformacionEconomica!=null) {
				this.jPanelParametrosReportesInformacionEconomica.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionInformacionEconomica!=null) {
				this.jScrollPanelDatosEdicionInformacionEconomica.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformacionEconomica!=null) {
				this.jTabbedPaneBusquedasInformacionEconomica.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosInformacionEconomica!=null) {
				this.jScrollPanelDatosInformacionEconomica.setVisible(true);
			}
			
			if(this.jPanelPaginacionInformacionEconomica!=null) {
				this.jPanelPaginacionInformacionEconomica.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesInformacionEconomica!=null) {
				this.jPanelParametrosReportesInformacionEconomica.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasInformacionEconomica!=null) {
					this.jTabbedPaneBusquedasInformacionEconomica.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesInformacionEconomica!=null) {
				this.jPanelParametrosReportesInformacionEconomica.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.informacioneconomicaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformacionEconomica!=null) {
				this.jTabbedPaneBusquedasInformacionEconomica.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesInformacionEconomica!=null) {
				this.jPanelParametrosReportesInformacionEconomica.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasInformacionEconomica.remove(jPanelFK_IdClienteInformacionEconomica);}

			this.isVisibilidadFK_IdValorClienteVinculacion=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdValorClienteVinculacion) {this.jTabbedPaneBusquedasInformacionEconomica.remove(jPanelFK_IdValorClienteVinculacionInformacionEconomica);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoVinculacion(Boolean isParaTipoVinculacion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoVinculacionNegation=!isParaTipoVinculacion;

			this.isVisibilidadFK_IdCliente=isParaTipoVinculacionNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasInformacionEconomica.remove(jPanelFK_IdClienteInformacionEconomica);}

			this.isVisibilidadFK_IdValorClienteVinculacion=isParaTipoVinculacion;
			if(!this.isVisibilidadFK_IdValorClienteVinculacion) {this.jTabbedPaneBusquedasInformacionEconomica.remove(jPanelFK_IdValorClienteVinculacionInformacionEconomica);}
		}
		
	}
	
	
	
	

	public String registrarSesionInformacionEconomicaParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(informacioneconomicaSessionBean==null) {
				informacioneconomicaSessionBean=new InformacionEconomicaSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(informacioneconomicaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.informacioneconomicaFuncionGeneral.setCombosCodigoDesdeBusquedaidcliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(InformacionEconomicaConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionInformacionEconomica(true);
			//clienteSessionBean.setlidInformacionEconomicaActual(this.idInformacionEconomicaActual);

			informacioneconomicaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyInformacionEconomica(true);
			informacioneconomicaSessionBean.setlIdInformacionEconomicaActualForeignKey(this.idInformacionEconomicaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//InformacionEconomicaSessionBean informacioneconomicaSessionBean=new InformacionEconomicaSessionBean();
		
		if(this.informacioneconomicaSessionBean==null) {
			this.informacioneconomicaSessionBean=new InformacionEconomicaSessionBean();
		}
		
		this.informacioneconomicaSessionBean.setsUltimaBusquedaInformacionEconomica(this.getsAccionBusqueda());
		this.informacioneconomicaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.informacioneconomicaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			informacioneconomicaSessionBean.setidcliente(this.getidclienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdValorClienteVinculacion")) {
			informacioneconomicaSessionBean.setidvalorclientevinculacion(this.getidvalorclientevinculacionFK_IdValorClienteVinculacion());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//InformacionEconomicaSessionBean informacioneconomicaSessionBean=new InformacionEconomicaSessionBean();
		
		if(this.informacioneconomicaSessionBean==null) {
			this.informacioneconomicaSessionBean=new InformacionEconomicaSessionBean();
		}
		
		if(this.informacioneconomicaSessionBean.getsUltimaBusquedaInformacionEconomica()!=null&&!this.informacioneconomicaSessionBean.getsUltimaBusquedaInformacionEconomica().equals("")) {
			this.setsAccionBusqueda(informacioneconomicaSessionBean.getsUltimaBusquedaInformacionEconomica());
			this.setiNumeroPaginacion(informacioneconomicaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(informacioneconomicaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setidclienteFK_IdCliente(informacioneconomicaSessionBean.getidcliente());
				informacioneconomicaSessionBean.setidcliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdValorClienteVinculacion")) {
				this.setidvalorclientevinculacionFK_IdValorClienteVinculacion(informacioneconomicaSessionBean.getidvalorclientevinculacion());
				informacioneconomicaSessionBean.setidvalorclientevinculacion(-1L);
			}
		}
		
		this.informacioneconomicaSessionBean.setsUltimaBusquedaInformacionEconomica("");
		this.informacioneconomicaSessionBean.setiNumeroPaginacion(InformacionEconomicaConstantesFunciones.INUMEROPAGINACION);
		this.informacioneconomicaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaInformacionEconomica(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioInformacionEconomica() {
		this.updateBorderResaltarBusquedasFormularioInformacionEconomica();
		this.updateVisibilidadBusquedasFormularioInformacionEconomica();
		this.updateHabilitarBusquedasFormularioInformacionEconomica();
	}
	
	public void updateBorderResaltarBusquedasFormularioInformacionEconomica() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasInformacionEconomica.getComponents().length>0) {
	

		if(this.informacioneconomicaConstantesFunciones.resaltarFK_IdClienteInformacionEconomica!=null) {
			index= this.jTabbedPaneBusquedasInformacionEconomica.indexOfComponent(this.jPanelFK_IdClienteInformacionEconomica);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionEconomica.getComponent(index);
				jPanel.setBorder(this.informacioneconomicaConstantesFunciones.resaltarFK_IdClienteInformacionEconomica);
			}
		}

		if(this.informacioneconomicaConstantesFunciones.resaltarFK_IdValorClienteVinculacionInformacionEconomica!=null) {
			index= this.jTabbedPaneBusquedasInformacionEconomica.indexOfComponent(this.jPanelFK_IdValorClienteVinculacionInformacionEconomica);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionEconomica.getComponent(index);
				jPanel.setBorder(this.informacioneconomicaConstantesFunciones.resaltarFK_IdValorClienteVinculacionInformacionEconomica);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioInformacionEconomica() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasInformacionEconomica.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasInformacionEconomica.indexOfComponent(this.jPanelFK_IdClienteInformacionEconomica);
			jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionEconomica.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.informacioneconomicaConstantesFunciones.mostrarFK_IdClienteInformacionEconomica);
			if(!this.informacioneconomicaConstantesFunciones.mostrarFK_IdClienteInformacionEconomica && index>-1) {
				this.jTabbedPaneBusquedasInformacionEconomica.remove(index);
			}

			index= this.jTabbedPaneBusquedasInformacionEconomica.indexOfComponent(this.jPanelFK_IdValorClienteVinculacionInformacionEconomica);
			jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionEconomica.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.informacioneconomicaConstantesFunciones.mostrarFK_IdValorClienteVinculacionInformacionEconomica);
			if(!this.informacioneconomicaConstantesFunciones.mostrarFK_IdValorClienteVinculacionInformacionEconomica && index>-1) {
				this.jTabbedPaneBusquedasInformacionEconomica.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioInformacionEconomica() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasInformacionEconomica.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasInformacionEconomica.indexOfComponent(this.jPanelFK_IdClienteInformacionEconomica);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionEconomica.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.informacioneconomicaConstantesFunciones.activarFK_IdClienteInformacionEconomica);
				this.jTabbedPaneBusquedasInformacionEconomica.setEnabledAt(index,this.informacioneconomicaConstantesFunciones.activarFK_IdClienteInformacionEconomica);
			}

			index= this.jTabbedPaneBusquedasInformacionEconomica.indexOfComponent(this.jPanelFK_IdValorClienteVinculacionInformacionEconomica);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionEconomica.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.informacioneconomicaConstantesFunciones.activarFK_IdValorClienteVinculacionInformacionEconomica);
				this.jTabbedPaneBusquedasInformacionEconomica.setEnabledAt(index,this.informacioneconomicaConstantesFunciones.activarFK_IdValorClienteVinculacionInformacionEconomica);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaInformacionEconomica(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasInformacionEconomica.indexOfComponent(this.jPanelFK_IdClienteInformacionEconomica);

			this.jTabbedPaneBusquedasInformacionEconomica.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionEconomica.getComponent(index);

			this.informacioneconomicaConstantesFunciones.setResaltarFK_IdClienteInformacionEconomica(resaltar);

			jPanel.setBorder(this.informacioneconomicaConstantesFunciones.resaltarFK_IdClienteInformacionEconomica);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdValorClienteVinculacion")) {
			index= this.jTabbedPaneBusquedasInformacionEconomica.indexOfComponent(this.jPanelFK_IdValorClienteVinculacionInformacionEconomica);

			this.jTabbedPaneBusquedasInformacionEconomica.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasInformacionEconomica.getComponent(index);

			this.informacioneconomicaConstantesFunciones.setResaltarFK_IdValorClienteVinculacionInformacionEconomica(resaltar);

			jPanel.setBorder(this.informacioneconomicaConstantesFunciones.resaltarFK_IdValorClienteVinculacionInformacionEconomica);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarInformacionEconomica.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioInformacionEconomica() throws Exception {

		if(this.jInternalFrameDetalleFormInformacionEconomica==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioInformacionEconomica();
		this.updateVisibilidadResaltarControlesFormularioInformacionEconomica();
		this.updateHabilitarResaltarControlesFormularioInformacionEconomica();
		
	}
	
	public void updateBorderResaltarControlesFormularioInformacionEconomica() throws Exception {
		if(this.jInternalFrameDetalleFormInformacionEconomica==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.informacioneconomicaConstantesFunciones.resaltaridInformacionEconomica!=null && this.jInternalFrameDetalleFormInformacionEconomica!=null) {this.jInternalFrameDetalleFormInformacionEconomica.jLabelidInformacionEconomica.setBorder(this.informacioneconomicaConstantesFunciones.resaltaridInformacionEconomica);}
		if(this.informacioneconomicaConstantesFunciones.resaltaridclienteInformacionEconomica!=null && this.jInternalFrameDetalleFormInformacionEconomica!=null) {this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxidclienteInformacionEconomica.setBorder(this.informacioneconomicaConstantesFunciones.resaltaridclienteInformacionEconomica);}
		if(this.informacioneconomicaConstantesFunciones.resaltaridvalorclientevinculacionInformacionEconomica!=null && this.jInternalFrameDetalleFormInformacionEconomica!=null) {this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxidvalorclientevinculacionInformacionEconomica.setBorder(this.informacioneconomicaConstantesFunciones.resaltaridvalorclientevinculacionInformacionEconomica);}
		if(this.informacioneconomicaConstantesFunciones.resaltarcodigoactualizacionInformacionEconomica!=null && this.jInternalFrameDetalleFormInformacionEconomica!=null) {this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldcodigoactualizacionInformacionEconomica.setBorder(this.informacioneconomicaConstantesFunciones.resaltarcodigoactualizacionInformacionEconomica);}
		if(this.informacioneconomicaConstantesFunciones.resaltarcodigodestinofinancieroInformacionEconomica!=null && this.jInternalFrameDetalleFormInformacionEconomica!=null) {this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldcodigodestinofinancieroInformacionEconomica.setBorder(this.informacioneconomicaConstantesFunciones.resaltarcodigodestinofinancieroInformacionEconomica);}
		if(this.informacioneconomicaConstantesFunciones.resaltarorigenrecursosInformacionEconomica!=null && this.jInternalFrameDetalleFormInformacionEconomica!=null) {this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldorigenrecursosInformacionEconomica.setBorder(this.informacioneconomicaConstantesFunciones.resaltarorigenrecursosInformacionEconomica);}
		if(this.informacioneconomicaConstantesFunciones.resaltarcuasavinculacionInformacionEconomica!=null && this.jInternalFrameDetalleFormInformacionEconomica!=null) {this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldcuasavinculacionInformacionEconomica.setBorder(this.informacioneconomicaConstantesFunciones.resaltarcuasavinculacionInformacionEconomica);}
		if(this.informacioneconomicaConstantesFunciones.resaltarsectorizacionInformacionEconomica!=null && this.jInternalFrameDetalleFormInformacionEconomica!=null) {this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldsectorizacionInformacionEconomica.setBorder(this.informacioneconomicaConstantesFunciones.resaltarsectorizacionInformacionEconomica);}
		if(this.informacioneconomicaConstantesFunciones.resaltaresactivoInformacionEconomica!=null && this.jInternalFrameDetalleFormInformacionEconomica!=null) {this.jInternalFrameDetalleFormInformacionEconomica.jCheckBoxesactivoInformacionEconomica.setBorderPainted(true);this.jInternalFrameDetalleFormInformacionEconomica.jCheckBoxesactivoInformacionEconomica.setBorder(this.informacioneconomicaConstantesFunciones.resaltaresactivoInformacionEconomica);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioInformacionEconomica() throws Exception {		
		if(this.jInternalFrameDetalleFormInformacionEconomica==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormInformacionEconomica!=null) {
	
		//this.jInternalFrameDetalleFormInformacionEconomica.jLabelidInformacionEconomica.setVisible(this.informacioneconomicaConstantesFunciones.mostraridInformacionEconomica);
		this.jInternalFrameDetalleFormInformacionEconomica.jPanelidInformacionEconomica.setVisible(this.informacioneconomicaConstantesFunciones.mostraridInformacionEconomica);
		//this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxidclienteInformacionEconomica.setVisible(this.informacioneconomicaConstantesFunciones.mostraridclienteInformacionEconomica);
		this.jInternalFrameDetalleFormInformacionEconomica.jPanelidclienteInformacionEconomica.setVisible(this.informacioneconomicaConstantesFunciones.mostraridclienteInformacionEconomica);
			this.jInternalFrameDetalleFormInformacionEconomica.jButtonidclienteInformacionEconomica.setVisible(this.informacioneconomicaConstantesFunciones.mostraridclienteInformacionEconomica);
		//this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxidvalorclientevinculacionInformacionEconomica.setVisible(this.informacioneconomicaConstantesFunciones.mostraridvalorclientevinculacionInformacionEconomica);
		this.jInternalFrameDetalleFormInformacionEconomica.jPanelidvalorclientevinculacionInformacionEconomica.setVisible(this.informacioneconomicaConstantesFunciones.mostraridvalorclientevinculacionInformacionEconomica);
		//this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldcodigoactualizacionInformacionEconomica.setVisible(this.informacioneconomicaConstantesFunciones.mostrarcodigoactualizacionInformacionEconomica);
		this.jInternalFrameDetalleFormInformacionEconomica.jPanelcodigoactualizacionInformacionEconomica.setVisible(this.informacioneconomicaConstantesFunciones.mostrarcodigoactualizacionInformacionEconomica);
		//this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldcodigodestinofinancieroInformacionEconomica.setVisible(this.informacioneconomicaConstantesFunciones.mostrarcodigodestinofinancieroInformacionEconomica);
		this.jInternalFrameDetalleFormInformacionEconomica.jPanelcodigodestinofinancieroInformacionEconomica.setVisible(this.informacioneconomicaConstantesFunciones.mostrarcodigodestinofinancieroInformacionEconomica);
		//this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldorigenrecursosInformacionEconomica.setVisible(this.informacioneconomicaConstantesFunciones.mostrarorigenrecursosInformacionEconomica);
		this.jInternalFrameDetalleFormInformacionEconomica.jPanelorigenrecursosInformacionEconomica.setVisible(this.informacioneconomicaConstantesFunciones.mostrarorigenrecursosInformacionEconomica);
		//this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldcuasavinculacionInformacionEconomica.setVisible(this.informacioneconomicaConstantesFunciones.mostrarcuasavinculacionInformacionEconomica);
		this.jInternalFrameDetalleFormInformacionEconomica.jPanelcuasavinculacionInformacionEconomica.setVisible(this.informacioneconomicaConstantesFunciones.mostrarcuasavinculacionInformacionEconomica);
		//this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldsectorizacionInformacionEconomica.setVisible(this.informacioneconomicaConstantesFunciones.mostrarsectorizacionInformacionEconomica);
		this.jInternalFrameDetalleFormInformacionEconomica.jPanelsectorizacionInformacionEconomica.setVisible(this.informacioneconomicaConstantesFunciones.mostrarsectorizacionInformacionEconomica);
		//this.jInternalFrameDetalleFormInformacionEconomica.jCheckBoxesactivoInformacionEconomica.setVisible(this.informacioneconomicaConstantesFunciones.mostraresactivoInformacionEconomica);
		this.jInternalFrameDetalleFormInformacionEconomica.jPanelesactivoInformacionEconomica.setVisible(this.informacioneconomicaConstantesFunciones.mostraresactivoInformacionEconomica);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioInformacionEconomica() throws Exception {
		if(this.jInternalFrameDetalleFormInformacionEconomica==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormInformacionEconomica!=null) {
	
		this.jInternalFrameDetalleFormInformacionEconomica.jLabelidInformacionEconomica.setEnabled(this.informacioneconomicaConstantesFunciones.activaridInformacionEconomica);
		this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxidclienteInformacionEconomica.setEnabled(this.informacioneconomicaConstantesFunciones.activaridclienteInformacionEconomica);
			this.jInternalFrameDetalleFormInformacionEconomica.jButtonidclienteInformacionEconomica.setEnabled(this.informacioneconomicaConstantesFunciones.activaridclienteInformacionEconomica);
		this.jInternalFrameDetalleFormInformacionEconomica.jComboBoxidvalorclientevinculacionInformacionEconomica.setEnabled(this.informacioneconomicaConstantesFunciones.activaridvalorclientevinculacionInformacionEconomica);
		this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldcodigoactualizacionInformacionEconomica.setEnabled(this.informacioneconomicaConstantesFunciones.activarcodigoactualizacionInformacionEconomica);
		this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldcodigodestinofinancieroInformacionEconomica.setEnabled(this.informacioneconomicaConstantesFunciones.activarcodigodestinofinancieroInformacionEconomica);
		this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldorigenrecursosInformacionEconomica.setEnabled(this.informacioneconomicaConstantesFunciones.activarorigenrecursosInformacionEconomica);
		this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldcuasavinculacionInformacionEconomica.setEnabled(this.informacioneconomicaConstantesFunciones.activarcuasavinculacionInformacionEconomica);
		this.jInternalFrameDetalleFormInformacionEconomica.jTextFieldsectorizacionInformacionEconomica.setEnabled(this.informacioneconomicaConstantesFunciones.activarsectorizacionInformacionEconomica);
		this.jInternalFrameDetalleFormInformacionEconomica.jCheckBoxesactivoInformacionEconomica.setEnabled(this.informacioneconomicaConstantesFunciones.activaresactivoInformacionEconomica);
		}
	}
	
		
}