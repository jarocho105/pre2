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

import com.bydan.erp.cartera.util.ActividadEconomicaConstantesFunciones;
import com.bydan.erp.cartera.util.ActividadEconomicaParameterReturnGeneral;
//import com.bydan.erp.cartera.util.ActividadEconomicaParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.ActividadEconomicaBean;
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

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ActividadEconomicaBeanSwingJInternalFrame extends ActividadEconomicaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ActividadEconomicaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ActividadEconomica> actividadeconomicaValidator = new ClassValidator<ActividadEconomica>(ActividadEconomica.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ActividadEconomica actividadeconomica;	
	public ActividadEconomica actividadeconomicaAux;
	public ActividadEconomica actividadeconomicaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ActividadEconomica actividadeconomicaTotales;
	public Long idActividadEconomicaActual;
	public Long iIdNuevoActividadEconomica=0L;
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

	public String sFinalQueryComboPais="";

	public List<Pais> paissForeignKey;

	public List<Pais> getpaissForeignKey() {
		return paissForeignKey;
	}

	public void setpaissForeignKey(List<Pais> paissForeignKey) {
		this.paissForeignKey = paissForeignKey;
	}

	//OBJETO FK ACTUAL
	public Pais paisForeignKey;

	public Pais getpaisForeignKey() {
		return paisForeignKey;
	}

	public void setpaisForeignKey(Pais paisForeignKey) {
		this.paisForeignKey = paisForeignKey;
	}

	public String sFinalQueryComboCiudad="";

	public List<Ciudad> ciudadsForeignKey;

	public List<Ciudad> getciudadsForeignKey() {
		return ciudadsForeignKey;
	}

	public void setciudadsForeignKey(List<Ciudad> ciudadsForeignKey) {
		this.ciudadsForeignKey = ciudadsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ciudad ciudadForeignKey;

	public Ciudad getciudadForeignKey() {
		return ciudadForeignKey;
	}

	public void setciudadForeignKey(Ciudad ciudadForeignKey) {
		this.ciudadForeignKey = ciudadForeignKey;
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
	
	public Boolean isPermisoTodoActividadEconomica;
	public Boolean isPermisoNuevoActividadEconomica;
	public Boolean isPermisoActualizarActividadEconomica;
	public Boolean isPermisoActualizarOriginalActividadEconomica;
	public Boolean isPermisoEliminarActividadEconomica;
	public Boolean isPermisoGuardarCambiosActividadEconomica;
	public Boolean isPermisoConsultaActividadEconomica;
	public Boolean isPermisoBusquedaActividadEconomica;
	public Boolean isPermisoReporteActividadEconomica;
	public Boolean isPermisoPaginacionMedioActividadEconomica;
	public Boolean isPermisoPaginacionAltoActividadEconomica;
	public Boolean isPermisoPaginacionTodoActividadEconomica;
	public Boolean isPermisoCopiarActividadEconomica;
	public Boolean isPermisoVerFormActividadEconomica;
	public Boolean isPermisoDuplicarActividadEconomica;
	public Boolean isPermisoOrdenActividadEconomica;
	
	
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
	
	public ActividadEconomicaParameterReturnGeneral actividadeconomicaReturnGeneral;
	public ActividadEconomicaParameterReturnGeneral actividadeconomicaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoActividadEconomica=false;
	public Boolean esParaAccionDesdeFormularioActividadEconomica=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ActividadEconomicaSessionBeanAdditional actividadeconomicaSessionBeanAdditional=null;
	
	public ActividadEconomicaSessionBeanAdditional getActividadEconomicaSessionBeanAdditional() {
		return this.actividadeconomicaSessionBeanAdditional;
	}
	
	public void setActividadEconomicaSessionBeanAdditional(ActividadEconomicaSessionBeanAdditional actividadeconomicaSessionBeanAdditional) {
		try {
			this.actividadeconomicaSessionBeanAdditional=actividadeconomicaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ActividadEconomicaBeanSwingJInternalFrameAdditional actividadeconomicaBeanSwingJInternalFrameAdditional=null;
	//public class ActividadEconomicaBeanSwingJInternalFrame
	
	public ActividadEconomicaBeanSwingJInternalFrameAdditional getActividadEconomicaBeanSwingJInternalFrameAdditional() {
		return this.actividadeconomicaBeanSwingJInternalFrameAdditional;
	}
	
	public void setActividadEconomicaBeanSwingJInternalFrameAdditional(ActividadEconomicaBeanSwingJInternalFrameAdditional actividadeconomicaBeanSwingJInternalFrameAdditional) {
		try {
			this.actividadeconomicaBeanSwingJInternalFrameAdditional=actividadeconomicaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ActividadEconomicaLogic actividadeconomicaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ActividadEconomica actividadeconomicaBean;
	public ActividadEconomicaConstantesFunciones actividadeconomicaConstantesFunciones;
	//public ActividadEconomicaParameterReturnGeneral actividadeconomicaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ClienteLogic clienteLogic;
	public PaisLogic paisLogic;
	public CiudadLogic ciudadLogic;
	
	//PARAMETROS
	
	
	//public List<ActividadEconomica> actividadeconomicas;	
	//public List<ActividadEconomica> actividadeconomicasEliminados;
	//public List<ActividadEconomica> actividadeconomicasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoActividadEconomica=false;
	public Boolean isVisibilidadCeldaDuplicarActividadEconomica=true;
	public Boolean isVisibilidadCeldaCopiarActividadEconomica=true;
	public Boolean isVisibilidadCeldaVerFormActividadEconomica=true;
	public Boolean isVisibilidadCeldaOrdenActividadEconomica=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesActividadEconomica=false;
	public Boolean isVisibilidadCeldaModificarActividadEconomica=false;
	public Boolean isVisibilidadCeldaActualizarActividadEconomica=false;
	public Boolean isVisibilidadCeldaEliminarActividadEconomica=false;
	public Boolean isVisibilidadCeldaCancelarActividadEconomica=false;
	public Boolean isVisibilidadCeldaGuardarActividadEconomica=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosActividadEconomica=false;	
	
	
	public Boolean isVisibilidadFK_IdCiudad=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPais=false;
	
	public Long getiIdNuevoActividadEconomica() {
		return this.iIdNuevoActividadEconomica;
	}

	public void setiIdNuevoActividadEconomica(Long iIdNuevoActividadEconomica) {
		this.iIdNuevoActividadEconomica = iIdNuevoActividadEconomica;
	}
	
	public Long getidActividadEconomicaActual() {
		return this.idActividadEconomicaActual;
	}

	public void setidActividadEconomicaActual(Long idActividadEconomicaActual) {
		this.idActividadEconomicaActual = idActividadEconomicaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ActividadEconomica getactividadeconomica() {
		return this.actividadeconomica;
	}

	public void setactividadeconomica(ActividadEconomica actividadeconomica) {
		this.actividadeconomica = actividadeconomica;
	}
	
	public ActividadEconomica getactividadeconomicaAux() {
		return this.actividadeconomicaAux;
	}

	public void setactividadeconomicaAux(ActividadEconomica actividadeconomicaAux) {
		this.actividadeconomicaAux = actividadeconomicaAux;
	}				
	
	public ActividadEconomica getactividadeconomicaAnterior() {
		return this.actividadeconomicaAnterior;
	}

	public void setactividadeconomicaAnterior(ActividadEconomica actividadeconomicaAnterior) {
		this.actividadeconomicaAnterior = actividadeconomicaAnterior;
	}	
	
	public ActividadEconomica getactividadeconomicaTotales() {
		return this.actividadeconomicaTotales;
	}

	public void setactividadeconomicaTotales(ActividadEconomica actividadeconomicaTotales) {
		this.actividadeconomicaTotales = actividadeconomicaTotales;
	}	
	
	public ActividadEconomica getactividadeconomicaBean() {
		return this.actividadeconomicaBean;
	}

	public void setactividadeconomicaBean(ActividadEconomica actividadeconomicaBean) {
		this.actividadeconomicaBean = actividadeconomicaBean;
	}	
	
	public ActividadEconomicaParameterReturnGeneral getactividadeconomicaReturnGeneral() {
		return this.actividadeconomicaReturnGeneral;
	}

	public void setactividadeconomicaReturnGeneral(ActividadEconomicaParameterReturnGeneral actividadeconomicaReturnGeneral) {
		this.actividadeconomicaReturnGeneral = actividadeconomicaReturnGeneral;
	}	
	
	
	public Long id_ciudadFK_IdCiudad=-1L;

	public Long getid_ciudadFK_IdCiudad() {
		return this.id_ciudadFK_IdCiudad;
	}

	public void setid_ciudadFK_IdCiudad(Long id_ciudadFK_IdCiudad) {
		this.id_ciudadFK_IdCiudad = id_ciudadFK_IdCiudad;
	}

	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_paisFK_IdPais=-1L;

	public Long getid_paisFK_IdPais() {
		return this.id_paisFK_IdPais;
	}

	public void setid_paisFK_IdPais(Long id_paisFK_IdPais) {
		this.id_paisFK_IdPais = id_paisFK_IdPais;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ActividadEconomicaLogic getActividadEconomicaLogic()	{		
		return actividadeconomicaLogic;
	}

	public void setActividadEconomicaLogic(ActividadEconomicaLogic actividadeconomicaLogic) {
		this.actividadeconomicaLogic = actividadeconomicaLogic;
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
	
	public Boolean getIsEsNuevoActividadEconomica() {
		return isEsNuevoActividadEconomica;
	}

	public void setIsEsNuevoActividadEconomica(Boolean isEsNuevoActividadEconomica) {
		this.isEsNuevoActividadEconomica = isEsNuevoActividadEconomica;
	}

	public Boolean getEsParaAccionDesdeFormularioActividadEconomica() {
		return esParaAccionDesdeFormularioActividadEconomica;
	}
	
	public void setEsParaAccionDesdeFormularioActividadEconomica(Boolean esParaAccionDesdeFormularioActividadEconomica) {
		this.esParaAccionDesdeFormularioActividadEconomica = esParaAccionDesdeFormularioActividadEconomica;
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

			if(this.actividadeconomicaSessionBean==null) {
				this.actividadeconomicaSessionBean=new ActividadEconomicaSessionBean();
			}

			if(!this.actividadeconomicaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(actividadeconomicaSessionBean.getlidEmpresaActual());
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

			//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

			if(this.actividadeconomicaSessionBean==null) {
				this.actividadeconomicaSessionBean=new ActividadEconomicaSessionBean();
			}

			if(!this.actividadeconomicaSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

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
					clienteLogic.getEntityWithConnection(actividadeconomicaSessionBean.getlidClienteActual());
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

	public void cargarCombosPaissForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.paissForeignKey=new ArrayList<Pais>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PaisLogic paisLogic=new PaisLogic();

			//paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

			if(this.actividadeconomicaSessionBean==null) {
				this.actividadeconomicaSessionBean=new ActividadEconomicaSessionBean();
			}

			if(!this.actividadeconomicaSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

					paisLogic.getTodosPaissWithConnection(sFinalQuery,new Pagination());

					this.paissForeignKey=paisLogic.getPaiss();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPais(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getEntityWithConnection(actividadeconomicaSessionBean.getlidPaisActual());
					this.paissForeignKey.add(paisLogic.getPais());
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

	public void cargarCombosCiudadsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ciudadsForeignKey=new ArrayList<Ciudad>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CiudadLogic ciudadLogic=new CiudadLogic();

			//ciudadLogic.getCiudadDataAccess().setIsForForeingKeyData(true);

			if(this.actividadeconomicaSessionBean==null) {
				this.actividadeconomicaSessionBean=new ActividadEconomicaSessionBean();
			}

			if(!this.actividadeconomicaSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ciudadLogic.getCiudadDataAccess().setIsForForeingKeyData(true);

					ciudadLogic.getTodosCiudadsWithConnection(sFinalQuery,new Pagination());

					this.ciudadsForeignKey=ciudadLogic.getCiudads();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCiudad(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ciudadLogic.getEntityWithConnection(actividadeconomicaSessionBean.getlidCiudadActual());
					this.ciudadsForeignKey.add(ciudadLogic.getCiudad());
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

					if(this.actividadeconomica!=null) {
						this.actividadeconomica.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
						this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_empresaActividadEconomica.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaActividadEconomica.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
						if(this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_empresaActividadEconomica.getItemCount()>0) {
							this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_empresaActividadEconomica.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaActividadEconomicaGenerico)throws Exception
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
				jComboBoxid_empresaActividadEconomicaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaActividadEconomicaGenerico!=null && jComboBoxid_empresaActividadEconomicaGenerico.getItemCount()>0) {
					jComboBoxid_empresaActividadEconomicaGenerico.setSelectedIndex(0);
				}
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

					if(this.actividadeconomica!=null) {
						this.actividadeconomica.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
						this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_clienteActividadEconomica.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteActividadEconomica.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
						if(this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_clienteActividadEconomica.getItemCount()>0) {
							this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_clienteActividadEconomica.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteActividadEconomica!=null) {
						jComboBoxid_clienteFK_IdClienteActividadEconomica.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteActividadEconomica!=null) {
							//jComboBoxid_clienteFK_IdClienteActividadEconomica.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteActividadEconomica.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteActividadEconomica.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteActividadEconomicaGenerico)throws Exception
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
				jComboBoxid_clienteActividadEconomicaGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteActividadEconomicaGenerico!=null && jComboBoxid_clienteActividadEconomicaGenerico.getItemCount()>0) {
					jComboBoxid_clienteActividadEconomicaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPaisForeignKey(Long idPaisSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(paisTemp!=null) {

					if(this.actividadeconomica!=null) {
						this.actividadeconomica.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
						this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_paisActividadEconomica.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisActividadEconomica.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
						if(this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_paisActividadEconomica.getItemCount()>0) {
							this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_paisActividadEconomica.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisActividadEconomica!=null) {
						jComboBoxid_paisFK_IdPaisActividadEconomica.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisActividadEconomica!=null) {
							//jComboBoxid_paisFK_IdPaisActividadEconomica.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisActividadEconomica.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisActividadEconomica.setSelectedIndex(0);
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

	public String getActualPaisForeignKeyDescripcion(Long idPaisSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}


			sDescripcion=PaisConstantesFunciones.getPaisDescripcion(paisTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisActividadEconomicaGenerico)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(paisTemp!=null) {
				jComboBoxid_paisActividadEconomicaGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisActividadEconomicaGenerico!=null && jComboBoxid_paisActividadEconomicaGenerico.getItemCount()>0) {
					jComboBoxid_paisActividadEconomicaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCiudadForeignKey(Long idCiudadSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ciudadTemp!=null) {

					if(this.actividadeconomica!=null) {
						this.actividadeconomica.setCiudad(ciudadTemp);
					}

					if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
						this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_ciudadActividadEconomica.setSelectedItem(ciudadTemp);
					}
				} else {
					//jComboBoxid_ciudadActividadEconomica.setSelectedItem(ciudadTemp);
					if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
						if(this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_ciudadActividadEconomica.getItemCount()>0) {
							this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_ciudadActividadEconomica.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCiudad") || sFormularioTipoBusqueda.equals("Todos")){
					if(ciudadTemp!=null && jComboBoxid_ciudadFK_IdCiudadActividadEconomica!=null) {
						jComboBoxid_ciudadFK_IdCiudadActividadEconomica.setSelectedItem(ciudadTemp);
					} else {
						if(jComboBoxid_ciudadFK_IdCiudadActividadEconomica!=null) {
							//jComboBoxid_ciudadFK_IdCiudadActividadEconomica.setSelectedItem(ciudadTemp);
							if(jComboBoxid_ciudadFK_IdCiudadActividadEconomica.getItemCount()>0) {
								jComboBoxid_ciudadFK_IdCiudadActividadEconomica.setSelectedIndex(0);
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

	public String getActualCiudadForeignKeyDescripcion(Long idCiudadSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}


			sDescripcion=CiudadConstantesFunciones.getCiudadDescripcion(ciudadTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCiudadForeignKeyGenerico(Long idCiudadSeleccionado,JComboBox jComboBoxid_ciudadActividadEconomicaGenerico)throws Exception
	{
		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}

			if(ciudadTemp!=null) {
				jComboBoxid_ciudadActividadEconomicaGenerico.setSelectedItem(ciudadTemp);
			} else {
				if(jComboBoxid_ciudadActividadEconomicaGenerico!=null && jComboBoxid_ciudadActividadEconomicaGenerico.getItemCount()>0) {
					jComboBoxid_ciudadActividadEconomicaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ActividadEconomica actividadeconomica,JComboBox jComboBoxid_empresaActividadEconomicaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaActividadEconomicaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_empresaActividadEconomica.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaActividadEconomicaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				actividadeconomica.setid_empresa(empresaAux.getId());
				actividadeconomica.setempresa_descripcion(ActividadEconomicaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				actividadeconomica.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(ActividadEconomica actividadeconomica,JComboBox jComboBoxid_clienteActividadEconomicaGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteActividadEconomicaGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_clienteActividadEconomica.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteActividadEconomicaGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				actividadeconomica.setid_cliente(clienteAux.getId());
				actividadeconomica.setcliente_descripcion(ActividadEconomicaConstantesFunciones.getClienteDescripcion(clienteAux));
				actividadeconomica.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(ActividadEconomica actividadeconomica,JComboBox jComboBoxid_paisActividadEconomicaGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisActividadEconomicaGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_paisActividadEconomica.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisActividadEconomicaGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				actividadeconomica.setid_pais(paisAux.getId());
				actividadeconomica.setpais_descripcion(ActividadEconomicaConstantesFunciones.getPaisDescripcion(paisAux));
				actividadeconomica.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCiudadForeignKey(ActividadEconomica actividadeconomica,JComboBox jComboBoxid_ciudadActividadEconomicaGenerico)throws Exception
	{
		try
		{
			Ciudad  ciudadAux=new Ciudad();

			if(jComboBoxid_ciudadActividadEconomicaGenerico==null) {
				ciudadAux=(Ciudad)this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_ciudadActividadEconomica.getSelectedItem();
			} else {
				ciudadAux=(Ciudad)jComboBoxid_ciudadActividadEconomicaGenerico.getSelectedItem();
			}

			if(ciudadAux!=null && ciudadAux.getId()!=null) {
				actividadeconomica.setid_ciudad(ciudadAux.getId());
				actividadeconomica.setciudad_descripcion(ActividadEconomicaConstantesFunciones.getCiudadDescripcion(ciudadAux));
				actividadeconomica.setCiudad(ciudadAux);			}
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

					if(!ActividadEconomicaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormActividadEconomica!=null) { 
							this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_empresaActividadEconomica.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_empresaActividadEconomica.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormActividadEconomica!=null) { 
					}

					if(!ActividadEconomicaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ActividadEconomicaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormActividadEconomica!=null) { 
							this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_clienteActividadEconomica.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_clienteActividadEconomica.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormActividadEconomica!=null) { 
					}

					if(!ActividadEconomicaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ActividadEconomicaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteActividadEconomica.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteActividadEconomica.addItem(cliente);
							}
						}

						if(!ActividadEconomicaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePaissForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPais=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ActividadEconomicaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormActividadEconomica!=null) { 
							this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_paisActividadEconomica.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_paisActividadEconomica.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormActividadEconomica!=null) { 
					}

					if(!ActividadEconomicaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ActividadEconomicaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisActividadEconomica.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisActividadEconomica.addItem(pais);
							}
						}

						if(!ActividadEconomicaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCiudadsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCiudad=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ActividadEconomicaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormActividadEconomica!=null) { 
							this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_ciudadActividadEconomica.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_ciudadActividadEconomica.addItem(ciudad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormActividadEconomica!=null) { 
					}

					if(!ActividadEconomicaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCiudad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ActividadEconomicaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ciudadFK_IdCiudadActividadEconomica.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jComboBoxid_ciudadFK_IdCiudadActividadEconomica.addItem(ciudad);
							}
						}

						if(!ActividadEconomicaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
							this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_empresaActividadEconomica.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
							this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_empresaActividadEconomica.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameClienteForeignKey(Cliente cliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
							this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_clienteActividadEconomica.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
							this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_clienteActividadEconomica.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteActividadEconomica.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteActividadEconomica.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFramePaisForeignKey(Pais pais,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
							this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_paisActividadEconomica.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
							this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_paisActividadEconomica.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisActividadEconomica.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisActividadEconomica.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCiudadForeignKey(Ciudad ciudad,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
							this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_ciudadActividadEconomica.setSelectedItem(ciudad);
						}
					} else {
						if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
							this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_ciudadActividadEconomica.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ciudadFK_IdCiudadActividadEconomica.setSelectedItem(ciudad);
						} else {
							this.jComboBoxid_ciudadFK_IdCiudadActividadEconomica.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesActividadEconomica() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ActividadEconomicaConstantesFunciones.refrescarForeignKeysDescripcionesActividadEconomica(this.actividadeconomicaLogic.getActividadEconomicas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ActividadEconomicaConstantesFunciones.refrescarForeignKeysDescripcionesActividadEconomica(this.actividadeconomicas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(Pais.class));
		classes.add(new Classe(Ciudad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//actividadeconomicaLogic.setActividadEconomicas(this.actividadeconomicas);
			actividadeconomicaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ActividadEconomicaParameterReturnGeneral getActividadEconomicaParameterGeneral() {
		return this.actividadeconomicaParameterGeneral;
	}
	
	public void setActividadEconomicaParameterGeneral(ActividadEconomicaParameterReturnGeneral actividadeconomicaParameterGeneral) {
		this.actividadeconomicaParameterGeneral = actividadeconomicaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoActividadEconomica() {
		return isPermisoTodoActividadEconomica;
	}

	public void setIsPermisoTodoActividadEconomica(Boolean isPermisoTodoActividadEconomica) {
		this.isPermisoTodoActividadEconomica = isPermisoTodoActividadEconomica;
	}

	public Boolean getIsPermisoNuevoActividadEconomica() {
		return isPermisoNuevoActividadEconomica;
	}

	public void setIsPermisoNuevoActividadEconomica(Boolean isPermisoNuevoActividadEconomica) {
		this.isPermisoNuevoActividadEconomica = isPermisoNuevoActividadEconomica;
	}

	public Boolean getIsPermisoActualizarActividadEconomica() {
		return isPermisoActualizarActividadEconomica;
	}

	public void setIsPermisoActualizarActividadEconomica(Boolean isPermisoActualizarActividadEconomica) {
		this.isPermisoActualizarActividadEconomica = isPermisoActualizarActividadEconomica;
	}

	public Boolean getIsPermisoEliminarActividadEconomica() {
		return isPermisoEliminarActividadEconomica;
	}

	public void setIsPermisoEliminarActividadEconomica(Boolean isPermisoEliminarActividadEconomica) {
		this.isPermisoEliminarActividadEconomica = isPermisoEliminarActividadEconomica;
	}

	public Boolean getIsPermisoGuardarCambiosActividadEconomica() {
		return isPermisoGuardarCambiosActividadEconomica;
	}

	public void setIsPermisoGuardarCambiosActividadEconomica(Boolean isPermisoGuardarCambiosActividadEconomica) {
		this.isPermisoGuardarCambiosActividadEconomica = isPermisoGuardarCambiosActividadEconomica;
	}
	
	public Boolean getIsPermisoConsultaActividadEconomica() {
		return isPermisoConsultaActividadEconomica;
	}

	public void setIsPermisoConsultaActividadEconomica(Boolean isPermisoConsultaActividadEconomica) {
		this.isPermisoConsultaActividadEconomica = isPermisoConsultaActividadEconomica;
	}

	public Boolean getIsPermisoBusquedaActividadEconomica() {
		return isPermisoBusquedaActividadEconomica;
	}

	public void setIsPermisoBusquedaActividadEconomica(Boolean isPermisoBusquedaActividadEconomica) {
		this.isPermisoBusquedaActividadEconomica = isPermisoBusquedaActividadEconomica;
	}

	public Boolean getIsPermisoReporteActividadEconomica() {
		return isPermisoReporteActividadEconomica;
	}

	public void setIsPermisoReporteActividadEconomica(Boolean isPermisoReporteActividadEconomica) {
		this.isPermisoReporteActividadEconomica = isPermisoReporteActividadEconomica;
	}
	
	public Boolean getIsPermisoPaginacionMedioActividadEconomica() {
		return isPermisoPaginacionMedioActividadEconomica;
	}

	public void setIsPermisoPaginacionMedioActividadEconomica(Boolean isPermisoPaginacionMedioActividadEconomica) {
		this.isPermisoPaginacionMedioActividadEconomica = isPermisoPaginacionMedioActividadEconomica;
	}
	
	public Boolean getIsPermisoPaginacionTodoActividadEconomica() {
		return isPermisoPaginacionTodoActividadEconomica;
	}

	public void setIsPermisoPaginacionTodoActividadEconomica(Boolean isPermisoPaginacionTodoActividadEconomica) {
		this.isPermisoPaginacionTodoActividadEconomica = isPermisoPaginacionTodoActividadEconomica;
	}
	
	public Boolean getIsPermisoPaginacionAltoActividadEconomica() {
		return isPermisoPaginacionAltoActividadEconomica;
	}

	public void setIsPermisoPaginacionAltoActividadEconomica(Boolean isPermisoPaginacionAltoActividadEconomica) {
		this.isPermisoPaginacionAltoActividadEconomica = isPermisoPaginacionAltoActividadEconomica;
	}
	
	public Boolean getIsPermisoCopiarActividadEconomica() {
		return isPermisoCopiarActividadEconomica;
	}

	public void setIsPermisoCopiarActividadEconomica(Boolean isPermisoCopiarActividadEconomica) {
		this.isPermisoCopiarActividadEconomica = isPermisoCopiarActividadEconomica;
	}
	
	public Boolean getIsPermisoVerFormActividadEconomica() {
		return isPermisoVerFormActividadEconomica;
	}

	public void setIsPermisoVerFormActividadEconomica(Boolean isPermisoVerFormActividadEconomica) {
		this.isPermisoVerFormActividadEconomica = isPermisoVerFormActividadEconomica;
	}
	
	public Boolean getIsPermisoDuplicarActividadEconomica() {
		return isPermisoDuplicarActividadEconomica;
	}

	public void setIsPermisoDuplicarActividadEconomica(Boolean isPermisoDuplicarActividadEconomica) {
		this.isPermisoDuplicarActividadEconomica = isPermisoDuplicarActividadEconomica;
	}
	
	public Boolean getIsPermisoOrdenActividadEconomica() {
		return isPermisoOrdenActividadEconomica;
	}

	public void setIsPermisoOrdenActividadEconomica(Boolean isPermisoOrdenActividadEconomica) {
		this.isPermisoOrdenActividadEconomica = isPermisoOrdenActividadEconomica;
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
	
	public Boolean getIsVisibilidadCeldaNuevoActividadEconomica() {
		return isVisibilidadCeldaNuevoActividadEconomica;
	}

	public void setIsVisibilidadCeldaNuevoActividadEconomica(Boolean isVisibilidadCeldaNuevoActividadEconomica) {
		this.isVisibilidadCeldaNuevoActividadEconomica = isVisibilidadCeldaNuevoActividadEconomica;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarActividadEconomica() {
		return isVisibilidadCeldaDuplicarActividadEconomica;
	}

	public void setIsVisibilidadCeldaDuplicarActividadEconomica(Boolean isVisibilidadCeldaDuplicarActividadEconomica) {
		this.isVisibilidadCeldaDuplicarActividadEconomica = isVisibilidadCeldaDuplicarActividadEconomica;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarActividadEconomica() {
		return isVisibilidadCeldaCopiarActividadEconomica;
	}

	public void setIsVisibilidadCeldaCopiarActividadEconomica(Boolean isVisibilidadCeldaCopiarActividadEconomica) {
		this.isVisibilidadCeldaCopiarActividadEconomica = isVisibilidadCeldaCopiarActividadEconomica;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormActividadEconomica() {
		return isVisibilidadCeldaVerFormActividadEconomica;
	}

	public void setIsVisibilidadCeldaVerFormActividadEconomica(Boolean isVisibilidadCeldaVerFormActividadEconomica) {
		this.isVisibilidadCeldaVerFormActividadEconomica = isVisibilidadCeldaVerFormActividadEconomica;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenActividadEconomica() {
		return isVisibilidadCeldaOrdenActividadEconomica;
	}

	public void setIsVisibilidadCeldaOrdenActividadEconomica(Boolean isVisibilidadCeldaOrdenActividadEconomica) {
		this.isVisibilidadCeldaOrdenActividadEconomica = isVisibilidadCeldaOrdenActividadEconomica;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesActividadEconomica() {
		return isVisibilidadCeldaNuevoRelacionesActividadEconomica;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesActividadEconomica(Boolean isVisibilidadCeldaNuevoRelacionesActividadEconomica) {
		this.isVisibilidadCeldaNuevoRelacionesActividadEconomica = isVisibilidadCeldaNuevoRelacionesActividadEconomica;
	}
	
	public Boolean getIsVisibilidadCeldaModificarActividadEconomica() {
		return isVisibilidadCeldaModificarActividadEconomica;
	}

	public void setIsVisibilidadCeldaModificarActividadEconomica(Boolean isVisibilidadCeldaModificarActividadEconomica) {
		this.isVisibilidadCeldaModificarActividadEconomica = isVisibilidadCeldaModificarActividadEconomica;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarActividadEconomica() {
		return isVisibilidadCeldaActualizarActividadEconomica;
	}

	public void setIsVisibilidadCeldaActualizarActividadEconomica(Boolean isVisibilidadCeldaActualizarActividadEconomica) {
		this.isVisibilidadCeldaActualizarActividadEconomica = isVisibilidadCeldaActualizarActividadEconomica;
	}

	public Boolean getIsVisibilidadCeldaEliminarActividadEconomica() {
		return isVisibilidadCeldaEliminarActividadEconomica;
	}

	public void setIsVisibilidadCeldaEliminarActividadEconomica(Boolean isVisibilidadCeldaEliminarActividadEconomica) {
		this.isVisibilidadCeldaEliminarActividadEconomica = isVisibilidadCeldaEliminarActividadEconomica;
	}

	public Boolean getIsVisibilidadCeldaCancelarActividadEconomica() {
		return isVisibilidadCeldaCancelarActividadEconomica;
	}

	public void setIsVisibilidadCeldaCancelarActividadEconomica(Boolean isVisibilidadCeldaCancelarActividadEconomica) {
		this.isVisibilidadCeldaCancelarActividadEconomica = isVisibilidadCeldaCancelarActividadEconomica;
	}

	public Boolean getIsVisibilidadCeldaGuardarActividadEconomica() {
		return isVisibilidadCeldaGuardarActividadEconomica;
	}

	public void setIsVisibilidadCeldaGuardarActividadEconomica(Boolean isVisibilidadCeldaGuardarActividadEconomica) {
		this.isVisibilidadCeldaGuardarActividadEconomica = isVisibilidadCeldaGuardarActividadEconomica;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosActividadEconomica() {
		return isVisibilidadCeldaGuardarCambiosActividadEconomica;
	}

	public void setIsVisibilidadCeldaGuardarCambiosActividadEconomica(Boolean isVisibilidadCeldaGuardarCambiosActividadEconomica) {
		this.isVisibilidadCeldaGuardarCambiosActividadEconomica = isVisibilidadCeldaGuardarCambiosActividadEconomica;
	}
		
	public ActividadEconomicaSessionBean getactividadeconomicaSessionBean() {
		return this.actividadeconomicaSessionBean;
	}
	
	public void setactividadeconomicaSessionBean(ActividadEconomicaSessionBean actividadeconomicaSessionBean) {
		this.actividadeconomicaSessionBean=actividadeconomicaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCiudad() {
		return this.isVisibilidadFK_IdCiudad;
	}

	public void setisVisibilidadFK_IdCiudad(Boolean isVisibilidadFK_IdCiudad) {
		this.isVisibilidadFK_IdCiudad=isVisibilidadFK_IdCiudad;
	}

	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(ActividadEconomica actividadeconomica)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(actividadeconomica,null);
				this.setActualParaGuardarClienteForeignKey(actividadeconomica,null);
				this.setActualParaGuardarPaisForeignKey(actividadeconomica,null);
				this.setActualParaGuardarCiudadForeignKey(actividadeconomica,null);
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
	
	public void bugActualizarReferenciaActual(ActividadEconomica actividadeconomica,ActividadEconomica actividadeconomicaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalActividadEconomica(actividadeconomica);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		actividadeconomicaAux.setId(actividadeconomica.getId());
		actividadeconomicaAux.setVersionRow(actividadeconomica.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessActividadEconomica();
		
			int intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomica =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.actividadeconomica =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ActividadEconomicaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualActividadEconomica(this.actividadeconomica,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = actividadeconomicaValidator.getInvalidValues(this.actividadeconomica);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			actividadeconomicaLogic.setDatosCliente(datosCliente);
			actividadeconomicaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				actividadeconomicaAux=new  ActividadEconomica();
				
				actividadeconomicaAux.setIsNew(true);
				actividadeconomicaAux.setIsChanged(true);
				
				actividadeconomicaAux.setActividadEconomicaOriginal(this.actividadeconomica);
				
				actividadeconomicaAux.setId(this.actividadeconomica.getId());	
				actividadeconomicaAux.setVersionRow(this.actividadeconomica.getVersionRow());	
				actividadeconomicaAux.setid_empresa(this.actividadeconomica.getid_empresa());	
				actividadeconomicaAux.setid_cliente(this.actividadeconomica.getid_cliente());	
				actividadeconomicaAux.setnombre_negocio(this.actividadeconomica.getnombre_negocio());	
				actividadeconomicaAux.setactividad(this.actividadeconomica.getactividad());	
				actividadeconomicaAux.setid_pais(this.actividadeconomica.getid_pais());	
				actividadeconomicaAux.setid_ciudad(this.actividadeconomica.getid_ciudad());	
				actividadeconomicaAux.setdireccion(this.actividadeconomica.getdireccion());	
				actividadeconomicaAux.settelefono(this.actividadeconomica.gettelefono());	
				actividadeconomicaAux.setingreso_neto(this.actividadeconomica.getingreso_neto());	
				actividadeconomicaAux.setingreso_bruto(this.actividadeconomica.getingreso_bruto());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.actividadeconomicaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.actividadeconomicaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(actividadeconomicaAux,actividadeconomicaLogic.getActividadEconomicas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(actividadeconomicaAux,actividadeconomicas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.actividadeconomicaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.actividadeconomicaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						actividadeconomicaLogic.saveActividadEconomicas();//WithConnection
						//actividadeconomicaLogic.getSetVersionRowActividadEconomicas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.actividadeconomica,actividadeconomicaAux);
					
					this.refrescarForeignKeysDescripcionesActividadEconomica();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.actividadeconomicaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								actividadeconomicaLogic.saveActividadEconomicaRelaciones(actividadeconomicaAux);//WithConnection
								//actividadeconomicaLogic.getSetVersionRowActividadEconomicas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.actividadeconomica,actividadeconomicaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.actividadeconomicaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.actividadeconomicaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(actividadeconomicaAux,actividadeconomicaLogic.getActividadEconomicas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(actividadeconomicaAux,actividadeconomicas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.actividadeconomica,actividadeconomicaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				actividadeconomicaAux=new  ActividadEconomica();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.actividadeconomicaSessionBean.getEsGuardarRelacionado() 
					|| (this.actividadeconomicaSessionBean.getEsGuardarRelacionado() && this.actividadeconomica.getId()>=0)) {
						
					actividadeconomicaAux.setIsNew(false);
				}
				
				actividadeconomicaAux.setIsDeleted(false);
			
				actividadeconomicaAux.setId(this.actividadeconomica.getId());	
				actividadeconomicaAux.setVersionRow(this.actividadeconomica.getVersionRow());	
				actividadeconomicaAux.setid_empresa(this.actividadeconomica.getid_empresa());	
				actividadeconomicaAux.setid_cliente(this.actividadeconomica.getid_cliente());	
				actividadeconomicaAux.setnombre_negocio(this.actividadeconomica.getnombre_negocio());	
				actividadeconomicaAux.setactividad(this.actividadeconomica.getactividad());	
				actividadeconomicaAux.setid_pais(this.actividadeconomica.getid_pais());	
				actividadeconomicaAux.setid_ciudad(this.actividadeconomica.getid_ciudad());	
				actividadeconomicaAux.setdireccion(this.actividadeconomica.getdireccion());	
				actividadeconomicaAux.settelefono(this.actividadeconomica.gettelefono());	
				actividadeconomicaAux.setingreso_neto(this.actividadeconomica.getingreso_neto());	
				actividadeconomicaAux.setingreso_bruto(this.actividadeconomica.getingreso_bruto());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(actividadeconomicaAux,actividadeconomicaLogic.getActividadEconomicas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(actividadeconomicaAux,actividadeconomicas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.actividadeconomicaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.actividadeconomicaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						actividadeconomicaLogic.saveActividadEconomicas();//WithConnection
						//actividadeconomicaLogic.getSetVersionRowActividadEconomicas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.actividadeconomica,actividadeconomicaAux);
					
					this.refrescarForeignKeysDescripcionesActividadEconomica();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.actividadeconomicaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								actividadeconomicaLogic.saveActividadEconomicaRelaciones(actividadeconomicaAux);//WithConnection
								//actividadeconomicaLogic.getSetVersionRowActividadEconomicas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.actividadeconomica,actividadeconomicaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.actividadeconomicaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.actividadeconomicaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(actividadeconomicaAux,actividadeconomicaLogic.getActividadEconomicas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(actividadeconomicaAux,actividadeconomicas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.actividadeconomica,actividadeconomicaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				actividadeconomicaAux=new  ActividadEconomica();
				
				actividadeconomicaAux.setIsNew(false);
				actividadeconomicaAux.setIsChanged(false);
				
				actividadeconomicaAux.setIsDeleted(true);
				
				actividadeconomicaAux.setId(this.actividadeconomica.getId());	
				actividadeconomicaAux.setVersionRow(this.actividadeconomica.getVersionRow());	
				actividadeconomicaAux.setid_empresa(this.actividadeconomica.getid_empresa());	
				actividadeconomicaAux.setid_cliente(this.actividadeconomica.getid_cliente());	
				actividadeconomicaAux.setnombre_negocio(this.actividadeconomica.getnombre_negocio());	
				actividadeconomicaAux.setactividad(this.actividadeconomica.getactividad());	
				actividadeconomicaAux.setid_pais(this.actividadeconomica.getid_pais());	
				actividadeconomicaAux.setid_ciudad(this.actividadeconomica.getid_ciudad());	
				actividadeconomicaAux.setdireccion(this.actividadeconomica.getdireccion());	
				actividadeconomicaAux.settelefono(this.actividadeconomica.gettelefono());	
				actividadeconomicaAux.setingreso_neto(this.actividadeconomica.getingreso_neto());	
				actividadeconomicaAux.setingreso_bruto(this.actividadeconomica.getingreso_bruto());	
				
				if(this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.actividadeconomicaAux.getId()>=0) {	
						this.actividadeconomicasEliminados.add(actividadeconomicaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(actividadeconomicaAux,actividadeconomicaLogic.getActividadEconomicas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(actividadeconomicaAux,actividadeconomicas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.actividadeconomicaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.actividadeconomicaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						actividadeconomicaLogic.saveActividadEconomicas();//WithConnection
						//actividadeconomicaLogic.getSetVersionRowActividadEconomicas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.actividadeconomicaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								actividadeconomicaLogic.saveActividadEconomicaRelaciones(actividadeconomicaAux);//WithConnection
								//actividadeconomicaLogic.getSetVersionRowActividadEconomicas();//WithConnection
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
							if(this.actividadeconomicaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.actividadeconomicaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(actividadeconomicaAux,actividadeconomicaLogic.getActividadEconomicas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(actividadeconomicaAux,actividadeconomicas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.getActividadEconomicas().addAll(this.actividadeconomicasEliminados);
					
					actividadeconomicaLogic.saveActividadEconomicas();//WithConnection
					//actividadeconomicaLogic.getSetVersionRowActividadEconomicas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesActividadEconomica();
				
				this.actividadeconomicasEliminados= new ArrayList<ActividadEconomica>();		
			}
			
			if(this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Actividad Economica GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Actividad Economica",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.actividadeconomica=actividadeconomicaAux;
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
      		//this.finishProcessActividadEconomica();
      	}
		
	}	
	
	public void actualizarRelaciones(ActividadEconomica actividadeconomicaLocal) throws Exception {
		
		if(this.actividadeconomicaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ActividadEconomica actividadeconomicaLocal) throws Exception {	
		if(this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				actividadeconomicaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				actividadeconomicaLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				actividadeconomicaLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CiudadDetalleFormJInternalFrame.class)) {
				CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrameLocal=(CiudadBeanSwingJInternalFrame) ((CiudadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ciudadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCiudad(ciudadBeanSwingJInternalFrameLocal.getciudad(),true);
				ciudadBeanSwingJInternalFrameLocal.actualizarLista(ciudadBeanSwingJInternalFrameLocal.ciudad,this.ciudadsForeignKey);

				ciudadBeanSwingJInternalFrameLocal.actualizarRelaciones(ciudadBeanSwingJInternalFrameLocal.ciudad);

				actividadeconomicaLocal.setCiudad(ciudadBeanSwingJInternalFrameLocal.ciudad);

				this.addItemDefectoCombosForeignKeyCiudad();
				this.cargarCombosFrameCiudadsForeignKey("Formulario");
				this.setActualCiudadForeignKey(ciudadBeanSwingJInternalFrameLocal.ciudad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarActividadEconomicaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actividadeconomica =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.actividadeconomica =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = actividadeconomicaValidator.getInvalidValues(this.actividadeconomica);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ActividadEconomica actividadeconomica,List<ActividadEconomica> actividadeconomicas) throws Exception {
		try	{		
			ActividadEconomicaConstantesFunciones.actualizarLista(actividadeconomica,actividadeconomicas,this.actividadeconomicaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ActividadEconomica actividadeconomica,List<ActividadEconomica> actividadeconomicas) throws Exception {
		try	{			
			ActividadEconomicaConstantesFunciones.actualizarSelectedLista(actividadeconomica,actividadeconomicas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ActividadEconomica> actividadeconomicasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				actividadeconomicasLocal=this.actividadeconomicaLogic.getActividadEconomicas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				actividadeconomicasLocal=this.actividadeconomicas;
			}
			//ARCHITECTURE
		
			for(ActividadEconomica actividadeconomicaLocal:actividadeconomicasLocal) {
				if(this.permiteMantenimiento(actividadeconomicaLocal) && actividadeconomicaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ActividadEconomicaConstantesFunciones.getActividadEconomicaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ActividadEconomicaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActividadEconomica.jLabelid_empresaActividadEconomica,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActividadEconomicaConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActividadEconomica.jLabelid_clienteActividadEconomica,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActividadEconomicaConstantesFunciones.NOMBRENEGOCIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActividadEconomica.jLabelnombre_negocioActividadEconomica,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActividadEconomicaConstantesFunciones.ACTIVIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActividadEconomica.jLabelactividadActividadEconomica,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActividadEconomicaConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActividadEconomica.jLabelid_paisActividadEconomica,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActividadEconomicaConstantesFunciones.IDCIUDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActividadEconomica.jLabelid_ciudadActividadEconomica,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActividadEconomicaConstantesFunciones.DIRECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActividadEconomica.jLabeldireccionActividadEconomica,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActividadEconomicaConstantesFunciones.TELEFONO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActividadEconomica.jLabeltelefonoActividadEconomica,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActividadEconomicaConstantesFunciones.INGRESONETO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActividadEconomica.jLabelingreso_netoActividadEconomica,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActividadEconomicaConstantesFunciones.INGRESOBRUTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActividadEconomica.jLabelingreso_brutoActividadEconomica,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActividadEconomica.jLabelid_empresaActividadEconomica,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActividadEconomica.jLabelid_clienteActividadEconomica,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActividadEconomica.jLabelnombre_negocioActividadEconomica,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActividadEconomica.jLabelactividadActividadEconomica,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActividadEconomica.jLabelid_paisActividadEconomica,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActividadEconomica.jLabelid_ciudadActividadEconomica,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActividadEconomica.jLabeldireccionActividadEconomica,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActividadEconomica.jLabeltelefonoActividadEconomica,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActividadEconomica.jLabelingreso_netoActividadEconomica,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActividadEconomica.jLabelingreso_brutoActividadEconomica,"");
		
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
		this.iIdNuevoActividadEconomica--;	
		
		
		this.actividadeconomicaAux=new ActividadEconomica();
		
		this.actividadeconomicaAux.setId(this.iIdNuevoActividadEconomica);
		this.actividadeconomicaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actividadeconomicaLogic.getActividadEconomicas().add(this.actividadeconomicaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.actividadeconomicas.add(this.actividadeconomicaAux);
		}
		//ARCHITECTURE
		
		this.actividadeconomica=this.actividadeconomicaAux;
		
		if(ActividadEconomicaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioActividadEconomica(this.actividadeconomica);
			this.setVariablesObjetoActualToFormularioForeignKeyActividadEconomica(this.actividadeconomica);
		}
				
		//this.setDefaultControlesActividadEconomica();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyActividadEconomica();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyActividadEconomica();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyActividadEconomica();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualActividadEconomica(this.actividadeconomicaBean,this.actividadeconomica,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ActividadEconomicaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.actividadeconomicaSessionBean.getConGuardarRelaciones()) {
			classes=ActividadEconomicaConstantesFunciones.getClassesRelationshipsOfActividadEconomica(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.actividadeconomicaReturnGeneral=actividadeconomicaLogic.procesarEventosActividadEconomicasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.actividadeconomicaLogic.getActividadEconomicas(),this.actividadeconomica,this.actividadeconomicaParameterGeneral,this.isEsNuevoActividadEconomica,classes);//this.actividadeconomicaLogic.getActividadEconomica()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanActividadEconomica(this.actividadeconomicaReturnGeneral,this.actividadeconomicaBean,false);
		
		if(this.actividadeconomicaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyActividadEconomica(this.actividadeconomicaReturnGeneral.getActividadEconomica());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioActividadEconomica(this.actividadeconomicaReturnGeneral.getActividadEconomica());
		}
		
		if(this.actividadeconomicaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioActividadEconomica(this.actividadeconomicaReturnGeneral.getActividadEconomica(),classes);//this.actividadeconomicaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualActividadEconomica(this.actividadeconomica,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyActividadEconomica();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyActividadEconomica();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ActividadEconomicaBeanSwingJInternalFrameAdditional.RecargarFormActividadEconomica(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingActividadEconomica(false);
						
			if(actividadeconomicaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ActividadEconomicaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualActividadEconomica();
			}
			
			this.actualizarVisualTableDatosActividadEconomica();
			
			this.jTableDatosActividadEconomica.setRowSelectionInterval(this.getIndiceNuevoActividadEconomica(), this.getIndiceNuevoActividadEconomica());
			
			this.seleccionarFilaTablaActividadEconomicaActual();
						
			this.actualizarEstadoCeldasBotonesActividadEconomica("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesActividadEconomica(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormActividadEconomica.jTextAreanombre_negocioActividadEconomica.setEnabled(isHabilitar && this.actividadeconomicaConstantesFunciones.activarnombre_negocioActividadEconomica);
		this.jInternalFrameDetalleFormActividadEconomica.jTextAreaactividadActividadEconomica.setEnabled(isHabilitar && this.actividadeconomicaConstantesFunciones.activaractividadActividadEconomica);
		this.jInternalFrameDetalleFormActividadEconomica.jTextAreadireccionActividadEconomica.setEnabled(isHabilitar && this.actividadeconomicaConstantesFunciones.activardireccionActividadEconomica);
		this.jInternalFrameDetalleFormActividadEconomica.jTextAreatelefonoActividadEconomica.setEnabled(isHabilitar && this.actividadeconomicaConstantesFunciones.activartelefonoActividadEconomica);
		this.jInternalFrameDetalleFormActividadEconomica.jTextFieldingreso_netoActividadEconomica.setEnabled(isHabilitar && this.actividadeconomicaConstantesFunciones.activaringreso_netoActividadEconomica);
		this.jInternalFrameDetalleFormActividadEconomica.jTextFieldingreso_brutoActividadEconomica.setEnabled(isHabilitar && this.actividadeconomicaConstantesFunciones.activaringreso_brutoActividadEconomica);	
		//
		this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_empresaActividadEconomica.setEnabled(isHabilitar && this.actividadeconomicaConstantesFunciones.activarid_empresaActividadEconomica);
		this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_clienteActividadEconomica.setEnabled(isHabilitar && this.actividadeconomicaConstantesFunciones.activarid_clienteActividadEconomica);
		this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_paisActividadEconomica.setEnabled(isHabilitar && this.actividadeconomicaConstantesFunciones.activarid_paisActividadEconomica);
		this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_ciudadActividadEconomica.setEnabled(isHabilitar && this.actividadeconomicaConstantesFunciones.activarid_ciudadActividadEconomica);
	};
	
	public void setDefaultControlesActividadEconomica() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoActividadEconomica(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.actividadeconomicaSessionBean.setConGuardarRelaciones(true);			
			this.actividadeconomicaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormActividadEconomica.jTabbedPaneRelacionesActividadEconomica.setVisible(true);
			
					
		} else {
			//this.actividadeconomicaSessionBean.setConGuardarRelaciones(false);			
			this.actividadeconomicaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormActividadEconomica.jTabbedPaneRelacionesActividadEconomica.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoActividadEconomica() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ActividadEconomica actividadeconomicaAux:this.actividadeconomicaLogic.getActividadEconomicas()) {
				if(actividadeconomicaAux.getId().equals(this.iIdNuevoActividadEconomica)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ActividadEconomica actividadeconomicaAux:this.actividadeconomicas) {
				if(actividadeconomicaAux.getId().equals(this.iIdNuevoActividadEconomica)) {
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
	
	public int getIndiceActualActividadEconomica(ActividadEconomica actividadeconomica,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ActividadEconomica actividadeconomicaAux:this.actividadeconomicaLogic.getActividadEconomicas()) {
				if(actividadeconomicaAux.getId().equals(actividadeconomica.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ActividadEconomica actividadeconomicaAux:this.actividadeconomicas) {
				if(actividadeconomicaAux.getId().equals(actividadeconomica.getId())) {
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
	
	public void setCamposBaseDesdeOriginalActividadEconomica(ActividadEconomica actividadeconomicaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ActividadEconomica actividadeconomicaAux:this.actividadeconomicaLogic.getActividadEconomicas()) {
				if(actividadeconomicaAux.getActividadEconomicaOriginal().getId().equals(actividadeconomicaOriginal.getId())) {
					existe=true;
					actividadeconomicaOriginal.setId(actividadeconomicaAux.getId());
					actividadeconomicaOriginal.setVersionRow(actividadeconomicaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ActividadEconomica actividadeconomicaAux:this.actividadeconomicas) {
				if(actividadeconomicaAux.getActividadEconomicaOriginal().getId().equals(actividadeconomicaOriginal.getId())) {
					existe=true;
					actividadeconomicaOriginal.setId(actividadeconomicaAux.getId());
					actividadeconomicaOriginal.setVersionRow(actividadeconomicaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosActividadEconomica(Boolean esParaCancelar) throws Exception {
		actividadeconomicasAux=new ArrayList<ActividadEconomica>();
		actividadeconomicaAux=new ActividadEconomica();
		
		if(!this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ActividadEconomica actividadeconomicaAux:this.actividadeconomicaLogic.getActividadEconomicas()) {
					if(actividadeconomicaAux.getId()<0) {
						actividadeconomicasAux.add(actividadeconomicaAux);
					}		
				}
				this.iIdNuevoActividadEconomica=0L;
				this.actividadeconomicaLogic.getActividadEconomicas().removeAll(actividadeconomicasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ActividadEconomica actividadeconomicaAux:this.actividadeconomicas) {
					if(actividadeconomicaAux.getId()<0) {
						actividadeconomicasAux.add(actividadeconomicaAux);
					}		
				}
				this.iIdNuevoActividadEconomica=0L;
				this.actividadeconomicas.removeAll(actividadeconomicasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoActividadEconomica 
					&& this.actividadeconomicaLogic.getActividadEconomicas().size()>0
					) {
					actividadeconomicaAux=this.actividadeconomicaLogic.getActividadEconomicas().get(this.actividadeconomicaLogic.getActividadEconomicas().size() - 1);
				
					if(actividadeconomicaAux.getId()<0) {
						this.actividadeconomicaLogic.getActividadEconomicas().remove(actividadeconomicaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoActividadEconomica && this.actividadeconomicas.size()>0) {
					actividadeconomicaAux=this.actividadeconomicas.get(this.actividadeconomicas.size() - 1);
				
					if(actividadeconomicaAux.getId()<0) {
						this.actividadeconomicas.remove(actividadeconomicaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoActividadEconomica(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(actividadeconomica.getId()<0) {
				this.actividadeconomicaLogic.getActividadEconomicas().remove(this.actividadeconomica);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(actividadeconomica.getId()<0) {
				this.actividadeconomicas.remove(this.actividadeconomica);
			}
		}			
	}
	
	public void setEstadosInicialesActividadEconomica(List<ActividadEconomica> actividadeconomicasAux) throws Exception {
		ActividadEconomicaConstantesFunciones.setEstadosInicialesActividadEconomica(actividadeconomicasAux);
	}
	
	public void setEstadosInicialesActividadEconomica(ActividadEconomica actividadeconomicaAux) throws Exception {
		ActividadEconomicaConstantesFunciones.setEstadosInicialesActividadEconomica(actividadeconomicaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarActividadEconomicaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesActividadEconomica("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarActividadEconomicaActual()) {
				if(!this.isEsNuevoActividadEconomica) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesActividadEconomica("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoActividadEconomica=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarActividadEconomicaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Actividad Economica ?", "MANTENIMIENTO DE Actividad Economica", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesActividadEconomica("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ActividadEconomica actividadeconomica) throws Exception {
		ActividadEconomicaConstantesFunciones.seleccionarAsignar(this.actividadeconomica,actividadeconomica);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarActividadEconomica=this.isPermisoActualizarOriginalActividadEconomica;
			
			
			this.seleccionarAsignar(actividadeconomica);
			
			

			idClienteActual=actividadeconomica.getid_cliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ActividadEconomicaConstantesFunciones.quitarEspaciosActividadEconomica(this.actividadeconomica,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesActividadEconomica("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.actividadeconomicaSessionBean.setsFuncionBusquedaRapida(this.actividadeconomicaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoActividadEconomica) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosActividadEconomica(esParaCancelar);				
				this.cancelarNuevoActividadEconomica(esParaCancelar);								
			}
			
			this.actividadeconomica=new ActividadEconomica();
			
			this.inicializarActividadEconomica();
			
			this.actualizarEstadoCeldasBotonesActividadEconomica("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarActividadEconomica() throws Exception {
		try {
			ActividadEconomicaConstantesFunciones.inicializarActividadEconomica(this.actividadeconomica);
			
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
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.actividadeconomicaLogic.getActividadEconomicas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteActividadEconomicas(String sAccionBusqueda,List<ActividadEconomica> actividadeconomicasParaReportes) throws Exception {
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
					sPathReporteFinal="ActividadEconomica"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ActividadEconomicaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ActividadEconomicaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ActividadEconomica"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Actividad Economicas");		
		parameters.put("busquedapor", ActividadEconomicaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceActividadEconomica=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ActividadEconomicaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ActividadEconomicaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceActividadEconomica=new JRBeanArrayDataSource(ActividadEconomicaJInternalFrame.TraerActividadEconomicaBeans(actividadeconomicasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceActividadEconomica);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ActividadEconomicaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ActividadEconomicaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ActividadEconomicaBean.TraerActividadEconomicaBeans(actividadeconomicasParaReportes).toArray()));
							
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
				this.generarExcelReporteActividadEconomicas(sAccionBusqueda,sTipoArchivoReporte,actividadeconomicasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalActividadEconomicas(sAccionBusqueda,sTipoArchivoReporte,actividadeconomicasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoActividadEconomicaActionPerformed(null);
					//this.generarExcelReporteActividadEconomicas(sAccionBusqueda,sTipoArchivoReporte,actividadeconomicasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalActividadEconomicas(sAccionBusqueda,sTipoArchivoReporte,actividadeconomicasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesActividadEconomicas(sAccionBusqueda,sTipoArchivoReporte,actividadeconomicasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesActividadEconomicas(sAccionBusqueda,sTipoArchivoReporte,actividadeconomicasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteActividadEconomicas(String sAccionBusqueda,String sTipoArchivoReporte,List<ActividadEconomica> actividadeconomicasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"actividadeconomica";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ActividadEconomicas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderActividadEconomica("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ActividadEconomica actividadeconomica : actividadeconomicasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ActividadEconomicaConstantesFunciones.generarExcelReporteDataActividadEconomica("NORMAL",row,workbook,actividadeconomica,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Actividad Economica",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderActividadEconomica(String sTipo,Row row,Workbook workbook) {
		
		ActividadEconomicaConstantesFunciones.generarExcelReporteHeaderActividadEconomica(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalActividadEconomicas(String sAccionBusqueda,String sTipoArchivoReporte,List<ActividadEconomica> actividadeconomicasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"actividadeconomica_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ActividadEconomicas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ActividadEconomica actividadeconomica : actividadeconomicasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ActividadEconomicaConstantesFunciones.getActividadEconomicaDescripcion(actividadeconomica));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActividadEconomicaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(actividadeconomica.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActividadEconomicaConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(actividadeconomica.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActividadEconomicaConstantesFunciones.LABEL_NOMBRENEGOCIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_NOMBRENEGOCIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(actividadeconomica.getnombre_negocio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActividadEconomicaConstantesFunciones.LABEL_ACTIVIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_ACTIVIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(actividadeconomica.getactividad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActividadEconomicaConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(actividadeconomica.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActividadEconomicaConstantesFunciones.LABEL_IDCIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_IDCIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(actividadeconomica.getciudad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActividadEconomicaConstantesFunciones.LABEL_DIRECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_DIRECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(actividadeconomica.getdireccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActividadEconomicaConstantesFunciones.LABEL_TELEFONO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_TELEFONO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(actividadeconomica.gettelefono());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActividadEconomicaConstantesFunciones.LABEL_INGRESONETO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_INGRESONETO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(actividadeconomica.getingreso_neto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActividadEconomicaConstantesFunciones.LABEL_INGRESOBRUTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_INGRESOBRUTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(actividadeconomica.getingreso_bruto());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Actividad Economica",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesActividadEconomicas(String sAccionBusqueda,String sTipoArchivoReporte,List<ActividadEconomica> actividadeconomicasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ActividadEconomica> actividadeconomicasRespaldo=null;
		
		classes=ActividadEconomicaConstantesFunciones.getClassesRelationshipsOfActividadEconomica(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.actividadeconomicaLogic.setDatosCliente(this.datosCliente);
		this.actividadeconomicaLogic.setDatosDeep(this.datosDeep);
		this.actividadeconomicaLogic.setIsConDeep(true);
		
		actividadeconomicasRespaldo=this.actividadeconomicaLogic.getActividadEconomicas();
		
		this.actividadeconomicaLogic.setActividadEconomicas(actividadeconomicasParaReportes);	
		this.actividadeconomicaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		actividadeconomicasParaReportes=this.actividadeconomicaLogic.getActividadEconomicas();
		this.actividadeconomicaLogic.setActividadEconomicas(actividadeconomicasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"actividadeconomica_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ActividadEconomicas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderActividadEconomica("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ActividadEconomica actividadeconomica : actividadeconomicasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderActividadEconomica("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ActividadEconomicaConstantesFunciones.generarExcelReporteDataActividadEconomica("NORMAL",row,workbook,actividadeconomica,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ActividadEconomicaConstantesFunciones.getActividadEconomicaDescripcion(actividadeconomica));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Actividad Economica",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoActividadEconomica.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoActividadEconomica.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoActividadEconomica.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoActividadEconomica.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessActividadEconomica() throws Exception {		
		this.startProcessActividadEconomica(true);
	}
	
	public void startProcessActividadEconomica(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasActividadEconomica ,this.jPanelParametrosReportesActividadEconomica, this.jScrollPanelDatosActividadEconomica,this.jPanelPaginacionActividadEconomica, this.jScrollPanelDatosEdicionActividadEconomica, this.jPanelAccionesActividadEconomica,this.jPanelAccionesFormularioActividadEconomica,this.jmenuBarActividadEconomica,this.jmenuBarDetalleActividadEconomica,this.jTtoolBarActividadEconomica,this.jTtoolBarDetalleActividadEconomica);		
		
		final JTabbedPane jTabbedPaneBusquedasActividadEconomica=this.jTabbedPaneBusquedasActividadEconomica; 
		
		final JPanel jPanelParametrosReportesActividadEconomica=this.jPanelParametrosReportesActividadEconomica;
		//final JScrollPane jScrollPanelDatosActividadEconomica=this.jScrollPanelDatosActividadEconomica;
		final JTable jTableDatosActividadEconomica=this.jTableDatosActividadEconomica;		
		final JPanel jPanelPaginacionActividadEconomica=this.jPanelPaginacionActividadEconomica;
		//final JScrollPane jScrollPanelDatosEdicionActividadEconomica=this.jScrollPanelDatosEdicionActividadEconomica;
		final JPanel jPanelAccionesActividadEconomica=this.jPanelAccionesActividadEconomica;
		
		JPanel jPanelCamposAuxiliarActividadEconomica=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarActividadEconomica=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
			jPanelCamposAuxiliarActividadEconomica=this.jInternalFrameDetalleFormActividadEconomica.jPanelCamposActividadEconomica;
			jPanelAccionesFormularioAuxiliarActividadEconomica=this.jInternalFrameDetalleFormActividadEconomica.jPanelAccionesFormularioActividadEconomica;
		}
		
		final JPanel jPanelCamposActividadEconomica=jPanelCamposAuxiliarActividadEconomica;
		final JPanel jPanelAccionesFormularioActividadEconomica=jPanelAccionesFormularioAuxiliarActividadEconomica;
		
		
		final JMenuBar jmenuBarActividadEconomica=this.jmenuBarActividadEconomica;
		final JToolBar jTtoolBarActividadEconomica=this.jTtoolBarActividadEconomica;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarActividadEconomica=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarActividadEconomica=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
			jmenuBarDetalleAuxiliarActividadEconomica=this.jInternalFrameDetalleFormActividadEconomica.jmenuBarDetalleActividadEconomica;
			jTtoolBarDetalleAuxiliarActividadEconomica=this.jInternalFrameDetalleFormActividadEconomica.jTtoolBarDetalleActividadEconomica;
		}
		
		final JMenuBar jmenuBarDetalleActividadEconomica=jmenuBarDetalleAuxiliarActividadEconomica;
		final JToolBar jTtoolBarDetalleActividadEconomica=jTtoolBarDetalleAuxiliarActividadEconomica;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasActividadEconomica;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesActividadEconomica;
			processRunnable.jTableDatos=jTableDatosActividadEconomica;
			processRunnable.jPanelCampos=jPanelCamposActividadEconomica;
			processRunnable.jPanelPaginacion=jPanelPaginacionActividadEconomica;
			processRunnable.jPanelAcciones=jPanelAccionesActividadEconomica;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioActividadEconomica;
			
			
			processRunnable.jmenuBar=jmenuBarActividadEconomica;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleActividadEconomica;
			processRunnable.jTtoolBar=jTtoolBarActividadEconomica;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleActividadEconomica;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasActividadEconomica ,jPanelParametrosReportesActividadEconomica,jTableDatosActividadEconomica, /*jScrollPanelDatosActividadEconomica,*/jPanelCamposActividadEconomica,jPanelPaginacionActividadEconomica, /*jScrollPanelDatosEdicionActividadEconomica,*/ jPanelAccionesActividadEconomica,jPanelAccionesFormularioActividadEconomica,jmenuBarActividadEconomica,jmenuBarDetalleActividadEconomica,jTtoolBarActividadEconomica,jTtoolBarDetalleActividadEconomica);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasActividadEconomica ,jPanelParametrosReportesActividadEconomica, jScrollPanelDatosActividadEconomica,jPanelPaginacionActividadEconomica, jScrollPanelDatosEdicionActividadEconomica, jPanelAccionesActividadEconomica,jPanelAccionesFormularioActividadEconomica,jmenuBarActividadEconomica,jmenuBarDetalleActividadEconomica,jTtoolBarActividadEconomica,jTtoolBarDetalleActividadEconomica);
						
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
	
	public void finishProcessActividadEconomica() {// throws Exception 
		this.finishProcessActividadEconomica(true);
	}
	
	public void finishProcessActividadEconomica(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasActividadEconomica ,this.jPanelParametrosReportesActividadEconomica, this.jScrollPanelDatosActividadEconomica,this.jPanelPaginacionActividadEconomica, this.jScrollPanelDatosEdicionActividadEconomica, this.jPanelAccionesActividadEconomica,this.jPanelAccionesFormularioActividadEconomica,this.jmenuBarActividadEconomica,this.jmenuBarDetalleActividadEconomica,this.jTtoolBarActividadEconomica,this.jTtoolBarDetalleActividadEconomica);		
		
		final JTabbedPane jTabbedPaneBusquedasActividadEconomica=this.jTabbedPaneBusquedasActividadEconomica; 
		
		final JPanel jPanelParametrosReportesActividadEconomica=this.jPanelParametrosReportesActividadEconomica;
		//final JScrollPane jScrollPanelDatosActividadEconomica=this.jScrollPanelDatosActividadEconomica;
		final JTable jTableDatosActividadEconomica=this.jTableDatosActividadEconomica;		
		final JPanel jPanelPaginacionActividadEconomica=this.jPanelPaginacionActividadEconomica;
		//final JScrollPane jScrollPanelDatosEdicionActividadEconomica=this.jScrollPanelDatosEdicionActividadEconomica;
		final JPanel jPanelAccionesActividadEconomica=this.jPanelAccionesActividadEconomica;
		
		JPanel jPanelCamposAuxiliarActividadEconomica=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarActividadEconomica=new JPanel();
		
		if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
			jPanelCamposAuxiliarActividadEconomica=this.jInternalFrameDetalleFormActividadEconomica.jPanelCamposActividadEconomica;
			jPanelAccionesFormularioAuxiliarActividadEconomica=this.jInternalFrameDetalleFormActividadEconomica.jPanelAccionesFormularioActividadEconomica;
		}
		
		final JPanel jPanelCamposActividadEconomica=jPanelCamposAuxiliarActividadEconomica;
		final JPanel jPanelAccionesFormularioActividadEconomica=jPanelAccionesFormularioAuxiliarActividadEconomica;
		
		
		final JMenuBar jmenuBarActividadEconomica=this.jmenuBarActividadEconomica;		
		final JToolBar jTtoolBarActividadEconomica=this.jTtoolBarActividadEconomica;
				
		JMenuBar jmenuBarDetalleAuxiliarActividadEconomica=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarActividadEconomica=new JToolBar();
		
		if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
			jmenuBarDetalleAuxiliarActividadEconomica=this.jInternalFrameDetalleFormActividadEconomica.jmenuBarDetalleActividadEconomica;
			jTtoolBarDetalleAuxiliarActividadEconomica=this.jInternalFrameDetalleFormActividadEconomica.jTtoolBarDetalleActividadEconomica;		
		}
		
		final JMenuBar jmenuBarDetalleActividadEconomica=jmenuBarDetalleAuxiliarActividadEconomica;
		final JToolBar jTtoolBarDetalleActividadEconomica=jTtoolBarDetalleAuxiliarActividadEconomica;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasActividadEconomica;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesActividadEconomica;
			processRunnable.jTableDatos=jTableDatosActividadEconomica;
			processRunnable.jPanelCampos=jPanelCamposActividadEconomica;
			processRunnable.jPanelPaginacion=jPanelPaginacionActividadEconomica;
			processRunnable.jPanelAcciones=jPanelAccionesActividadEconomica;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioActividadEconomica;
			
			
			processRunnable.jmenuBar=jmenuBarActividadEconomica;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleActividadEconomica;
			processRunnable.jTtoolBar=jTtoolBarActividadEconomica;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleActividadEconomica;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasActividadEconomica ,jPanelParametrosReportesActividadEconomica, jTableDatosActividadEconomica,/*jScrollPanelDatosActividadEconomica,*/jPanelCamposActividadEconomica,jPanelPaginacionActividadEconomica, /*jScrollPanelDatosEdicionActividadEconomica,*/ jPanelAccionesActividadEconomica,jPanelAccionesFormularioActividadEconomica,jmenuBarActividadEconomica,jmenuBarDetalleActividadEconomica,jTtoolBarActividadEconomica,jTtoolBarDetalleActividadEconomica));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesActividadEconomica(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarActividadEconomica(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuActividadEconomica(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarActividadEconomica(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarActividadEconomica,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleActividadEconomica,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuActividadEconomica(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarActividadEconomica,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleActividadEconomica,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.actividadeconomicaConstantesFunciones.getsFinalQueryActividadEconomica();
		String  finalQueryPaginacionTodos=this.actividadeconomicaConstantesFunciones.getsFinalQueryActividadEconomica();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ActividadEconomicaConstantesFunciones.getArrayColumnasGlobalesNoActividadEconomica(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ActividadEconomicaConstantesFunciones.getArrayColumnasGlobalesActividadEconomica(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ActividadEconomicaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.actividadeconomicasEliminados= new ArrayList<ActividadEconomica>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessActividadEconomica();
		
				///*ActividadEconomicaSessionBean*/this.actividadeconomicaSessionBean=new ActividadEconomicaSessionBean();
			
			if(this.actividadeconomicaSessionBean==null) {
				this.actividadeconomicaSessionBean=new ActividadEconomicaSessionBean();
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
					this.iNumeroPaginacion=ActividadEconomicaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ActividadEconomicaConstantesFunciones.getClassesForeignKeysOfActividadEconomica(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/actividadeconomica."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			actividadeconomicasAux= new ArrayList<ActividadEconomica>();
			
				
			actividadeconomicaLogic.setDatosCliente(this.datosCliente);
			actividadeconomicaLogic.setDatosDeep(this.datosDeep);
			actividadeconomicaLogic.setIsConDeep(true);
			
			
			actividadeconomicaLogic.getActividadEconomicaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					actividadeconomicaLogic.getTodosActividadEconomicas(finalQueryGlobal,pagination);
					
					//actividadeconomicaLogic.getTodosActividadEconomicasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(actividadeconomicaLogic.getActividadEconomicas()==null|| actividadeconomicaLogic.getActividadEconomicas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							actividadeconomicasAux= new ArrayList<ActividadEconomica>();
							actividadeconomicasAux.addAll(actividadeconomicaLogic.getActividadEconomicas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							actividadeconomicasAux= new ArrayList<ActividadEconomica>();
							actividadeconomicasAux.addAll(actividadeconomicas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							actividadeconomicaLogic.getTodosActividadEconomicas(finalQueryGlobal+"",this.pagination);												
							
							//actividadeconomicaLogic.getTodosActividadEconomicasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteActividadEconomicas("Todos",actividadeconomicaLogic.getActividadEconomicas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							actividadeconomicaLogic.setActividadEconomicas(new ArrayList<ActividadEconomica>());					
							actividadeconomicaLogic.getActividadEconomicas().addAll(actividadeconomicasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							actividadeconomicas=new ArrayList<ActividadEconomica>();
							actividadeconomicas.addAll(actividadeconomicasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idActividadEconomica=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idActividadEconomica=this.idActual;
				
				} else if(this.idActividadEconomicaActual!=null && this.idActividadEconomicaActual!=0L) {
					idActividadEconomica=idActividadEconomicaActual;
				}
				
					
				this.sDetalleReporte=ActividadEconomicaConstantesFunciones.getDetalleIndicePorId(idActividadEconomica);
				
				this.actividadeconomicas=new ArrayList<ActividadEconomica>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					actividadeconomicaLogic.getEntity(idActividadEconomica);
					
					//actividadeconomicaLogic.getEntityWithConnection(idActividadEconomica);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actividadeconomicaLogic.setActividadEconomicas(new ArrayList<ActividadEconomica>());
					actividadeconomicaLogic.getActividadEconomicas().add(actividadeconomicaLogic.getActividadEconomica());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.actividadeconomicas=new ArrayList<ActividadEconomica>();
					this.actividadeconomicas.add(actividadeconomica);
				}
				
				if(actividadeconomicaLogic.getActividadEconomica()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCiudad")) {
				this.sDetalleReporte=ActividadEconomicaConstantesFunciones.getDetalleIndiceFK_IdCiudad(id_ciudadFK_IdCiudad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					actividadeconomicaLogic.getActividadEconomicasFK_IdCiudad(finalQueryGlobal,pagination,id_ciudadFK_IdCiudad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ActividadEconomicaConstantesFunciones.getDetalleIndiceFK_IdCiudad(id_ciudadFK_IdCiudad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ActividadEconomicaConstantesFunciones.getDetalleIndiceFK_IdCiudad(id_ciudadFK_IdCiudad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=actividadeconomicaLogic.getActividadEconomicas()==null||actividadeconomicaLogic.getActividadEconomicas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=actividadeconomicas==null|| actividadeconomicas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						actividadeconomicasAux=new ArrayList<ActividadEconomica>();
						actividadeconomicasAux.addAll(actividadeconomicaLogic.getActividadEconomicas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							actividadeconomicasAux=new ArrayList<ActividadEconomica>();
							actividadeconomicasAux.addAll(actividadeconomicas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							actividadeconomicaLogic.getActividadEconomicasFK_IdCiudad(finalQueryGlobal,pagination,id_ciudadFK_IdCiudad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ActividadEconomicaConstantesFunciones.getDetalleIndiceFK_IdCiudad(id_ciudadFK_IdCiudad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ActividadEconomicaConstantesFunciones.getDetalleIndiceFK_IdCiudad(id_ciudadFK_IdCiudad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteActividadEconomicas("FK_IdCiudad",actividadeconomicaLogic.getActividadEconomicas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteActividadEconomicas("FK_IdCiudad",actividadeconomicas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						actividadeconomicaLogic.setActividadEconomicas(new ArrayList<ActividadEconomica>());
						actividadeconomicaLogic.getActividadEconomicas().addAll(actividadeconomicasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							actividadeconomicas=new ArrayList<ActividadEconomica>();
							actividadeconomicas.addAll(actividadeconomicasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=ActividadEconomicaConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					actividadeconomicaLogic.getActividadEconomicasFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ActividadEconomicaConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ActividadEconomicaConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=actividadeconomicaLogic.getActividadEconomicas()==null||actividadeconomicaLogic.getActividadEconomicas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=actividadeconomicas==null|| actividadeconomicas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						actividadeconomicasAux=new ArrayList<ActividadEconomica>();
						actividadeconomicasAux.addAll(actividadeconomicaLogic.getActividadEconomicas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							actividadeconomicasAux=new ArrayList<ActividadEconomica>();
							actividadeconomicasAux.addAll(actividadeconomicas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							actividadeconomicaLogic.getActividadEconomicasFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ActividadEconomicaConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ActividadEconomicaConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteActividadEconomicas("FK_IdCliente",actividadeconomicaLogic.getActividadEconomicas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteActividadEconomicas("FK_IdCliente",actividadeconomicas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						actividadeconomicaLogic.setActividadEconomicas(new ArrayList<ActividadEconomica>());
						actividadeconomicaLogic.getActividadEconomicas().addAll(actividadeconomicasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							actividadeconomicas=new ArrayList<ActividadEconomica>();
							actividadeconomicas.addAll(actividadeconomicasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ActividadEconomicaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					actividadeconomicaLogic.getActividadEconomicasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ActividadEconomicaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ActividadEconomicaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=actividadeconomicaLogic.getActividadEconomicas()==null||actividadeconomicaLogic.getActividadEconomicas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=actividadeconomicas==null|| actividadeconomicas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						actividadeconomicasAux=new ArrayList<ActividadEconomica>();
						actividadeconomicasAux.addAll(actividadeconomicaLogic.getActividadEconomicas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							actividadeconomicasAux=new ArrayList<ActividadEconomica>();
							actividadeconomicasAux.addAll(actividadeconomicas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							actividadeconomicaLogic.getActividadEconomicasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ActividadEconomicaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ActividadEconomicaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteActividadEconomicas("FK_IdEmpresa",actividadeconomicaLogic.getActividadEconomicas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteActividadEconomicas("FK_IdEmpresa",actividadeconomicas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						actividadeconomicaLogic.setActividadEconomicas(new ArrayList<ActividadEconomica>());
						actividadeconomicaLogic.getActividadEconomicas().addAll(actividadeconomicasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							actividadeconomicas=new ArrayList<ActividadEconomica>();
							actividadeconomicas.addAll(actividadeconomicasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=ActividadEconomicaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					actividadeconomicaLogic.getActividadEconomicasFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ActividadEconomicaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ActividadEconomicaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=actividadeconomicaLogic.getActividadEconomicas()==null||actividadeconomicaLogic.getActividadEconomicas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=actividadeconomicas==null|| actividadeconomicas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						actividadeconomicasAux=new ArrayList<ActividadEconomica>();
						actividadeconomicasAux.addAll(actividadeconomicaLogic.getActividadEconomicas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							actividadeconomicasAux=new ArrayList<ActividadEconomica>();
							actividadeconomicasAux.addAll(actividadeconomicas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							actividadeconomicaLogic.getActividadEconomicasFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ActividadEconomicaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ActividadEconomicaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteActividadEconomicas("FK_IdPais",actividadeconomicaLogic.getActividadEconomicas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteActividadEconomicas("FK_IdPais",actividadeconomicas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						actividadeconomicaLogic.setActividadEconomicas(new ArrayList<ActividadEconomica>());
						actividadeconomicaLogic.getActividadEconomicas().addAll(actividadeconomicasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							actividadeconomicas=new ArrayList<ActividadEconomica>();
							actividadeconomicas.addAll(actividadeconomicasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesActividadEconomica();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessActividadEconomica();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=actividadeconomicaLogic.getActividadEconomicas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=actividadeconomicas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=actividadeconomicaLogic.getActividadEconomicas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=actividadeconomicas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ActividadEconomica actividadeconomica) {
		Boolean permite=true;
		
		if(this.actividadeconomica.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ActividadEconomicaConstantesFunciones.getOrderByListaActividadEconomica();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ActividadEconomicaConstantesFunciones.getOrderByListaActividadEconomica();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ActividadEconomica actividadeconomica:actividadeconomicaLogic.getActividadEconomicas()) {
				if(actividadeconomica.getsType().equals(Constantes2.S_TOTALES)) {
					actividadeconomicaTotales=actividadeconomica;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ActividadEconomica actividadeconomica:this.actividadeconomicas) {
				if(actividadeconomica.getsType().equals(Constantes2.S_TOTALES)) {
					actividadeconomicaTotales=actividadeconomica;
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
			this.actividadeconomicaAux=new ActividadEconomica();
			this.actividadeconomicaAux.setsType(Constantes2.S_TOTALES);
			this.actividadeconomicaAux.setIsNew(false);
			this.actividadeconomicaAux.setIsChanged(false);
			this.actividadeconomicaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ActividadEconomicaConstantesFunciones.TotalizarValoresFilaActividadEconomica(this.actividadeconomicaLogic.getActividadEconomicas(),this.actividadeconomicaAux);
				
				this.actividadeconomicaLogic.getActividadEconomicas().add(this.actividadeconomicaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ActividadEconomicaConstantesFunciones.TotalizarValoresFilaActividadEconomica(this.actividadeconomicas,this.actividadeconomicaAux);
				
				this.actividadeconomicas.add(this.actividadeconomicaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		actividadeconomicaTotales=new ActividadEconomica();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.actividadeconomicaLogic.getActividadEconomicas().remove(actividadeconomicaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.actividadeconomicas.remove(actividadeconomicaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		actividadeconomicaTotales=new ActividadEconomica();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ActividadEconomica actividadeconomica:actividadeconomicaLogic.getActividadEconomicas()) {
				if(actividadeconomica.getsType().equals(Constantes2.S_TOTALES)) {
					actividadeconomicaTotales=actividadeconomica;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ActividadEconomicaConstantesFunciones.TotalizarValoresFilaActividadEconomica(this.actividadeconomicaLogic.getActividadEconomicas(),actividadeconomicaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ActividadEconomica actividadeconomica:this.actividadeconomicas) {
				if(actividadeconomica.getsType().equals(Constantes2.S_TOTALES)) {
					actividadeconomicaTotales=actividadeconomica;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ActividadEconomicaConstantesFunciones.TotalizarValoresFilaActividadEconomica(this.actividadeconomicas,actividadeconomicaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getActividadEconomicasFK_IdCiudad()throws Exception {
		try {
			sAccionBusqueda="FK_IdCiudad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getActividadEconomicasFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getActividadEconomicasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getActividadEconomicasFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getActividadEconomicasFK_IdCiudad(String sFinalQuery,Long id_ciudad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actividadeconomicaLogic.getActividadEconomicasFK_IdCiudad(sFinalQuery,this.pagination,id_ciudad);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getActividadEconomicasFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actividadeconomicaLogic.getActividadEconomicasFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getActividadEconomicasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actividadeconomicaLogic.getActividadEconomicasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getActividadEconomicasFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actividadeconomicaLogic.getActividadEconomicasFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
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
	
	public void inicializarPermisosActividadEconomica() {
		this.isPermisoTodoActividadEconomica=false;
		this.isPermisoNuevoActividadEconomica=false;
		this.isPermisoActualizarActividadEconomica=false;
		this.isPermisoActualizarOriginalActividadEconomica=false;
		this.isPermisoEliminarActividadEconomica=false;
		this.isPermisoGuardarCambiosActividadEconomica=false;
		this.isPermisoConsultaActividadEconomica=false;
		this.isPermisoBusquedaActividadEconomica=false;
		this.isPermisoReporteActividadEconomica=false;		
		this.isPermisoOrdenActividadEconomica=false;		
		this.isPermisoPaginacionMedioActividadEconomica=false;		
		this.isPermisoPaginacionAltoActividadEconomica=false;
		this.isPermisoPaginacionTodoActividadEconomica=false;
		this.isPermisoCopiarActividadEconomica=false;		
		this.isPermisoVerFormActividadEconomica=false;		
		this.isPermisoDuplicarActividadEconomica=false;		
		this.isPermisoOrdenActividadEconomica=false;		
	}
	
	public void setPermisosUsuarioActividadEconomica(Boolean isPermiso) {
		this.isPermisoTodoActividadEconomica=isPermiso;
		this.isPermisoNuevoActividadEconomica=isPermiso;
		this.isPermisoActualizarActividadEconomica=isPermiso;
		this.isPermisoActualizarOriginalActividadEconomica=isPermiso;
		this.isPermisoEliminarActividadEconomica=isPermiso;
		this.isPermisoGuardarCambiosActividadEconomica=isPermiso;
		this.isPermisoConsultaActividadEconomica=isPermiso;
		this.isPermisoBusquedaActividadEconomica=isPermiso;
		this.isPermisoReporteActividadEconomica=isPermiso;
		this.isPermisoOrdenActividadEconomica=isPermiso;		
		this.isPermisoPaginacionMedioActividadEconomica=isPermiso;		
		this.isPermisoPaginacionAltoActividadEconomica=isPermiso;		
		this.isPermisoPaginacionTodoActividadEconomica=isPermiso;		
		this.isPermisoCopiarActividadEconomica=isPermiso;		
		this.isPermisoVerFormActividadEconomica=isPermiso;		
		this.isPermisoDuplicarActividadEconomica=isPermiso;
		this.isPermisoOrdenActividadEconomica=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioActividadEconomica(Boolean isPermiso) {
		//this.isPermisoTodoActividadEconomica=isPermiso;
		this.isPermisoNuevoActividadEconomica=isPermiso;
		this.isPermisoActualizarActividadEconomica=isPermiso;
		this.isPermisoActualizarOriginalActividadEconomica=isPermiso;
		this.isPermisoEliminarActividadEconomica=isPermiso;
		this.isPermisoGuardarCambiosActividadEconomica=isPermiso;
		//this.isPermisoConsultaActividadEconomica=isPermiso;
		//this.isPermisoBusquedaActividadEconomica=isPermiso;
		//this.isPermisoReporteActividadEconomica=isPermiso;
		//this.isPermisoOrdenActividadEconomica=isPermiso;		
		//this.isPermisoPaginacionMedioActividadEconomica=isPermiso;		
		//this.isPermisoPaginacionAltoActividadEconomica=isPermiso;		
		//this.isPermisoPaginacionTodoActividadEconomica=isPermiso;		
		//this.isPermisoCopiarActividadEconomica=isPermiso;		
		//this.isPermisoDuplicarActividadEconomica=isPermiso;
		//this.isPermisoOrdenActividadEconomica=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioActividadEconomicaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ActividadEconomicaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebActividadEconomica(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioActividadEconomicaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioActividadEconomicaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionActividadEconomicaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioActividadEconomicaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioActividadEconomica() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ActividadEconomicaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ActividadEconomicaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoActividadEconomica=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarActividadEconomica=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalActividadEconomica=this.isPermisoActualizarActividadEconomica;
			this.isPermisoEliminarActividadEconomica=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosActividadEconomica=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaActividadEconomica=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaActividadEconomica=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoActividadEconomica=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteActividadEconomica=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenActividadEconomica=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioActividadEconomica=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoActividadEconomica=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoActividadEconomica=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarActividadEconomica=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormActividadEconomica=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarActividadEconomica=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenActividadEconomica=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosActividadEconomica.setToolTipText(this.jTableDatosActividadEconomica.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioActividadEconomica(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioActividadEconomica(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ActividadEconomicaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ActividadEconomicaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioActividadEconomica() throws Exception {
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
	public void inicializarCombosForeignKeyActividadEconomicaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.paissForeignKey=new ArrayList();
				this.ciudadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyActividadEconomicaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ActividadEconomicaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyActividadEconomicaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCiudadListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyPaisListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.paissForeignKey==null||this.paissForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PaisConstantesFunciones.SFINALQUERY;

				this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCiudadListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ciudadsForeignKey==null||this.ciudadsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CiudadConstantesFunciones.getArrayColumnasGlobalesCiudad(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CiudadConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CiudadConstantesFunciones.SFINALQUERY;

				this.cargarCombosCiudadsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyActividadEconomicaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ActividadEconomicaParameterReturnGeneral actividadeconomicaReturnGeneral=new ActividadEconomicaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.actividadeconomicaConstantesFunciones.cargarid_empresaActividadEconomica)
					 || (this.esRecargarFks && this.actividadeconomicaConstantesFunciones.cargarid_empresaActividadEconomica)) {

					if(!this.actividadeconomicaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+actividadeconomicaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.actividadeconomicaConstantesFunciones.cargarid_clienteActividadEconomica)
					 || (this.esRecargarFks && this.actividadeconomicaConstantesFunciones.cargarid_clienteActividadEconomica)) {

					if(!this.actividadeconomicaSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+actividadeconomicaSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.actividadeconomicaConstantesFunciones.cargarid_paisActividadEconomica)
					 || (this.esRecargarFks && this.actividadeconomicaConstantesFunciones.cargarid_paisActividadEconomica)) {

					if(!this.actividadeconomicaSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+actividadeconomicaSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}


				String finalQueryGlobalCiudad="";

				if(((this.ciudadsForeignKey==null||this.ciudadsForeignKey.size()<=0) && this.actividadeconomicaConstantesFunciones.cargarid_ciudadActividadEconomica)
					 || (this.esRecargarFks && this.actividadeconomicaConstantesFunciones.cargarid_ciudadActividadEconomica)) {

					if(!this.actividadeconomicaSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CiudadConstantesFunciones.getArrayColumnasGlobalesCiudad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCiudad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CiudadConstantesFunciones.TABLENAME);

						finalQueryGlobalCiudad=Funciones.GetFinalQueryAppend(finalQueryGlobalCiudad, "");
						finalQueryGlobalCiudad+=CiudadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCiudadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCiudad=" WHERE " + ConstantesSql.ID + "="+actividadeconomicaSessionBean.getlidCiudadActual();
					}
				} else {
					finalQueryGlobalCiudad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				actividadeconomicaReturnGeneral=actividadeconomicaLogic.cargarCombosLoteForeignKeyActividadEconomica(finalQueryGlobalEmpresa,finalQueryGlobalCliente,finalQueryGlobalPais,finalQueryGlobalCiudad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=actividadeconomicaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=actividadeconomicaReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=actividadeconomicaReturnGeneral.getpaissForeignKey();
			}

			if(!finalQueryGlobalCiudad.equals("NONE")) {
				this.ciudadsForeignKey=actividadeconomicaReturnGeneral.getciudadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyActividadEconomica()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyPais();
			this.addItemDefectoCombosForeignKeyCiudad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.actividadeconomicaSessionBean==null) {
				this.actividadeconomicaSessionBean=new ActividadEconomicaSessionBean();
			}

			if(!this.actividadeconomicaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.actividadeconomicaSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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

	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {

			if(!this.actividadeconomicaSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				Pais pais=new Pais();
				PaisConstantesFunciones.setPaisDescripcion(pais,Constantes.SMENSAJE_ESCOJA_OPCION);
				pais.setId(null);

				if(!PaisConstantesFunciones.ExisteEnLista(this.paissForeignKey,pais,true)) {

					this.paissForeignKey.add(0,pais);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCiudad()throws Exception {
		try {

			if(!this.actividadeconomicaSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
				Ciudad ciudad=new Ciudad();
				CiudadConstantesFunciones.setCiudadDescripcion(ciudad,Constantes.SMENSAJE_ESCOJA_OPCION);
				ciudad.setId(null);

				if(!CiudadConstantesFunciones.ExisteEnLista(this.ciudadsForeignKey,ciudad,true)) {

					this.ciudadsForeignKey.add(0,ciudad);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyActividadEconomica()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyActividadEconomica(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyActividadEconomica()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyActividadEconomica();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyActividadEconomica(ActividadEconomica actividadeconomica)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(actividadeconomica.getid_cliente(),false,"Formulario");
			this.setActualPaisForeignKey(actividadeconomica.getid_pais(),false,"Formulario");
			this.setActualCiudadForeignKey(actividadeconomica.getid_ciudad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyActividadEconomica(ActividadEconomica actividadeconomica,String sTipoEvento)throws Exception {	
		try {
			
			

				if(actividadeconomica.getCliente()!=null && !sTipoEvento.equals("id_clienteActividadEconomica")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(actividadeconomica.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyActividadEconomica()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.actividadeconomicaConstantesFunciones.getid_cliente(),false,"Formulario");
			this.setActualPaisForeignKey(this.actividadeconomicaConstantesFunciones.getid_pais(),false,"Formulario");
			this.setActualCiudadForeignKey(this.actividadeconomicaConstantesFunciones.getid_ciudad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyActividadEconomica()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyActividadEconomica()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyActividadEconomica()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroActividadEconomica()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyActividadEconomica()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFramePaissForeignKey("Todos");
			this.cargarCombosFrameCiudadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyActividadEconomica(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyActividadEconomica()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_empresaActividadEconomica!=null && this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_empresaActividadEconomica.getItemCount()>0) {
				this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_empresaActividadEconomica.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_clienteActividadEconomica!=null && this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_clienteActividadEconomica.getItemCount()>0) {
				this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_clienteActividadEconomica.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_paisActividadEconomica!=null && this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_paisActividadEconomica.getItemCount()>0) {
				this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_paisActividadEconomica.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_ciudadActividadEconomica!=null && this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_ciudadActividadEconomica.getItemCount()>0) {
				this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_ciudadActividadEconomica.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public ActividadEconomicaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ActividadEconomicaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ActividadEconomicaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.actividadeconomicaSessionBean=new ActividadEconomicaSessionBean(); 
		this.actividadeconomicaConstantesFunciones=new ActividadEconomicaConstantesFunciones(); 
		this.actividadeconomicaBean=new ActividadEconomica();//(this.actividadeconomicaConstantesFunciones); 		
		this.actividadeconomicaReturnGeneral=new ActividadEconomicaParameterReturnGeneral(); 
		
		this.actividadeconomicaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.actividadeconomicaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ActividadEconomicaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ActividadEconomicaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ActividadEconomicaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessActividadEconomica(true);
			
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
			
			this.actividadeconomicaConstantesFunciones=new ActividadEconomicaConstantesFunciones(); 
			this.actividadeconomicaBean=new ActividadEconomica();//this.actividadeconomicaConstantesFunciones); 			
			this.actividadeconomicaReturnGeneral=new ActividadEconomicaParameterReturnGeneral(); 
		
			ActividadEconomicaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Actividad Economica Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.actividadeconomica=new ActividadEconomica();
			this.actividadeconomicas = new ArrayList<ActividadEconomica>();
			this.actividadeconomicasAux = new ArrayList<ActividadEconomica>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic=new ActividadEconomicaLogic();
				this.actividadeconomicaLogic.getNewConnexionToDeep("");
			}
			
			//this.actividadeconomicaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.actividadeconomicaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormActividadEconomica);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoActividadEconomica!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoActividadEconomica);	
					}
					
					if(this.jInternalFrameImportacionActividadEconomica!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionActividadEconomica);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByActividadEconomica!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByActividadEconomica);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormActividadEconomica!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormActividadEconomica);
				this.jInternalFrameDetalleFormActividadEconomica.setVisible(false);
				this.jInternalFrameDetalleFormActividadEconomica.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoActividadEconomica!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoActividadEconomica);
					this.jInternalFrameReporteDinamicoActividadEconomica.setVisible(false);
					this.jInternalFrameReporteDinamicoActividadEconomica.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionActividadEconomica!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionActividadEconomica);
					this.jInternalFrameImportacionActividadEconomica.setVisible(false);
					this.jInternalFrameImportacionActividadEconomica.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByActividadEconomica!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByActividadEconomica);
					this.jInternalFrameOrderByActividadEconomica.setVisible(false);
					this.jInternalFrameOrderByActividadEconomica.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idActividadEconomicaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ActividadEconomicaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.actividadeconomicaReturnGeneral=new ActividadEconomicaParameterReturnGeneral();
			
			this.actividadeconomicaParameterGeneral=new ActividadEconomicaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.actividadeconomicaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ActividadEconomicaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ActividadEconomicaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.actividadeconomicaSessionBean.getEsGuardarRelacionado(),this.actividadeconomicaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ActividadEconomicaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.actividadeconomicaSessionBean.getEsGuardarRelacionado(),this.actividadeconomicaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoActividadEconomica=false;
			this.isVisibilidadCeldaDuplicarActividadEconomica=true;
			this.isVisibilidadCeldaCopiarActividadEconomica=true;
			this.isVisibilidadCeldaVerFormActividadEconomica=true;
			this.isVisibilidadCeldaOrdenActividadEconomica=true;
			this.isVisibilidadCeldaNuevoRelacionesActividadEconomica=false;
			this.isVisibilidadCeldaModificarActividadEconomica=false;
			this.isVisibilidadCeldaActualizarActividadEconomica=false;
			this.isVisibilidadCeldaEliminarActividadEconomica=false;
			this.isVisibilidadCeldaCancelarActividadEconomica=false;
			this.isVisibilidadCeldaGuardarActividadEconomica=false;
			this.isVisibilidadCeldaGuardarCambiosActividadEconomica=false;
			
			
			this.isVisibilidadFK_IdCiudad=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPais=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesActividadEconomica("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosActividadEconomica();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioActividadEconomica(false);
			
			this.setPermisosUsuarioActividadEconomica();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.actividadeconomicaSessionBean.getEsGuardarRelacionado() 
				|| (this.actividadeconomicaSessionBean.getEsGuardarRelacionado() && this.actividadeconomicaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioActividadEconomicaClasesRelacionadas();
			}
			
			if(this.actividadeconomicaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioActividadEconomicaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ActividadEconomicaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosActividadEconomica();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualActividadEconomica();
			}
			
			if(!this.isPermisoBusquedaActividadEconomica) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasActividadEconomica.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioActividadEconomica,this.isPermisoPaginacionMedioActividadEconomica,this.isPermisoPaginacionTodoActividadEconomica);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ActividadEconomicaConstantesFunciones.getTiposSeleccionarActividadEconomica());
				
				this.tiposColumnasSelect=ActividadEconomicaConstantesFunciones.getTiposSeleccionarActividadEconomica(true);
				
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
			//if(!this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioActividadEconomica();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioActividadEconomica(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioActividadEconomica(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesActividadEconomica() ;
			
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
			this.clienteLogic=new ClienteLogic();
			this.paisLogic=new PaisLogic();
			this.ciudadLogic=new CiudadLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				actividadeconomicaImplementable= (ActividadEconomicaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ActividadEconomicaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				actividadeconomicaImplementableHome= (ActividadEconomicaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ActividadEconomicaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.actividadeconomicas= new ArrayList<ActividadEconomica>();
			this.actividadeconomicasEliminados= new ArrayList<ActividadEconomica>();
						
			this.isEsNuevoActividadEconomica=false;
			this.esParaAccionDesdeFormularioActividadEconomica=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.paissForeignKey=new ArrayList<Pais>() ;
			this.ciudadsForeignKey=new ArrayList<Ciudad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyActividadEconomica(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroActividadEconomica();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ActividadEconomicaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ActividadEconomicaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesActividadEconomica("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingActividadEconomica(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormActividadEconomica!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioActividadEconomica();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioActividadEconomica();
			}
			
			ActividadEconomicaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasActividadEconomica.getTabCount(); i++) {
					this.jTabbedPaneBusquedasActividadEconomica.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasActividadEconomica.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessActividadEconomica(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ActividadEconomica: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectActividadEconomica() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesActividadEconomica")) {
				iIndex=this.jInternalFrameDetalleFormActividadEconomica.jTabbedPaneRelacionesActividadEconomica.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormActividadEconomica.jTabbedPaneRelacionesActividadEconomica.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessActividadEconomica();	
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
	
	public void cargarCombosForeignKeyActividadEconomica(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyActividadEconomica(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyActividadEconomica(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyActividadEconomicaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyActividadEconomica();
		
		this.cargarCombosFrameForeignKeyActividadEconomica();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyActividadEconomica();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyActividadEconomica();
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

	public void cargarCombosForeignKeyPais(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPais(this.paissForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCiudad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCiudadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCiudad();
				this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCiudad(this.ciudadsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoActividadEconomicaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.actividadeconomicaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormActividadEconomica==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
			
			
			if(jTableDatosActividadEconomica.getRowCount()>=1) {
				jTableDatosActividadEconomica.removeRowSelectionInterval(0, jTableDatosActividadEconomica.getRowCount()-1);						
			}
			
			this.isEsNuevoActividadEconomica=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoActividadEconomica(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesActividadEconomica(true);			
			//this.actividadeconomica=new ActividadEconomica();
			//this.actividadeconomica.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesActividadEconomica(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualActividadEconomica() ;
			
			if(ActividadEconomicaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleActividadEconomica(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.actividadeconomica);	
			this.actualizarInformacion("INFO_PADRE",false,this.actividadeconomica);				
			
			ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
			
			if(this.actividadeconomicaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ActividadEconomica: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarActividadEconomicaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ActividadEconomica> actividadeconomicasSeleccionados=new ArrayList<ActividadEconomica>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosActividadEconomica.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosActividadEconomica.getSelectedRows().length;			
			}
			
			actividadeconomicasSeleccionados=this.getActividadEconomicasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoActividadEconomica--;			
				//ActividadEconomica actividadeconomicaAux= new ActividadEconomica();			
				//actividadeconomicaAux.setId(this.iIdNuevoActividadEconomica);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ActividadEconomica actividadeconomicaOrigen=new ActividadEconomica();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ActividadEconomica actividadeconomicaOrigen : actividadeconomicasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							actividadeconomicaOrigen =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							actividadeconomicaOrigen =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaActividadEconomica();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.actividadeconomica.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosActividadEconomica(actividadeconomicaOrigen,this.actividadeconomica,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.actividadeconomicaLogic.getActividadEconomicas().add(this.actividadeconomicaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.actividadeconomicas.add(this.actividadeconomicaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaActividadEconomica(false);
				
				this.jTableDatosActividadEconomica.setRowSelectionInterval(this.getIndiceNuevoActividadEconomica(), this.getIndiceNuevoActividadEconomica());
				
				int iLastRow =  this.jTableDatosActividadEconomica.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosActividadEconomica.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosActividadEconomica.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaActividadEconomica(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarActividadEconomicaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ActividadEconomica> actividadeconomicasSeleccionados=new ArrayList<ActividadEconomica>();									
		
			ActividadEconomica actividadeconomicaOrigen=new ActividadEconomica();
			ActividadEconomica actividadeconomicaDestino=new ActividadEconomica();
				
			actividadeconomicasSeleccionados=this.getActividadEconomicasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosActividadEconomica.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || actividadeconomicasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosActividadEconomica.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						actividadeconomicaOrigen =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						actividadeconomicaOrigen =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						actividadeconomicaDestino =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						actividadeconomicaDestino =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				actividadeconomicaOrigen =actividadeconomicasSeleccionados.get(0);
				actividadeconomicaDestino =actividadeconomicasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosActividadEconomica(actividadeconomicaOrigen,actividadeconomicaDestino,true,false);
				
				actividadeconomicaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(actividadeconomicaDestino,actividadeconomicaLogic.getActividadEconomicas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(actividadeconomicaDestino,actividadeconomicas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaActividadEconomica(false);
				
				//this.jTableDatosActividadEconomica.setRowSelectionInterval(this.getIndiceNuevoActividadEconomica(), this.getIndiceNuevoActividadEconomica());
				
				int iLastRow =  this.jTableDatosActividadEconomica.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosActividadEconomica.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosActividadEconomica.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaActividadEconomica(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormActividadEconomicaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormActividadEconomica==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormActividadEconomica.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarActividadEconomicaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesActividadEconomica.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasActividadEconomica.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesActividadEconomica.setVisible(!isVisible);
			this.jPanelPaginacionActividadEconomica.setVisible(!isVisible);
			this.jPanelAccionesActividadEconomica.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarActividadEconomicaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameActividadEconomica();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoActividadEconomicaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoActividadEconomica();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionActividadEconomicaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionActividadEconomica();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByActividadEconomicaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByActividadEconomica();
			
			this.abrirFrameOrderByActividadEconomica();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByActividadEconomicaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByActividadEconomica();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleActividadEconomica(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormActividadEconomica);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormActividadEconomica.isMaximum()) {
					this.jInternalFrameDetalleFormActividadEconomica.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormActividadEconomica.setSize(this.jInternalFrameDetalleFormActividadEconomica.iWidthFormulario,this.jInternalFrameDetalleFormActividadEconomica.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormActividadEconomica.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormActividadEconomica.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormActividadEconomica.isMaximum()) {
						this.jInternalFrameDetalleFormActividadEconomica.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormActividadEconomica.jContentPaneDetalleActividadEconomica.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormActividadEconomica.jTabbedPaneRelacionesActividadEconomica.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormActividadEconomica.jContentPaneDetalleActividadEconomica.getWidth(),ActividadEconomicaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormActividadEconomica.jTabbedPaneRelacionesActividadEconomica.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormActividadEconomica.jContentPaneDetalleActividadEconomica.getWidth(),ActividadEconomicaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormActividadEconomica.jTabbedPaneRelacionesActividadEconomica.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormActividadEconomica.jContentPaneDetalleActividadEconomica.getWidth(),ActividadEconomicaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormActividadEconomica.setVisible(true);
	        this.jInternalFrameDetalleFormActividadEconomica.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByActividadEconomica() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByActividadEconomica==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByActividadEconomica=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByActividadEconomica,false,this);
				} else {
					this.jInternalFrameOrderByActividadEconomica=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByActividadEconomica,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByActividadEconomica);
				this.jInternalFrameOrderByActividadEconomica.setVisible(false);
				this.jInternalFrameOrderByActividadEconomica.setSelected(false);
				
				this.jInternalFrameOrderByActividadEconomica.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByActividadEconomica"));
				
				this.inicializarActualizarBindingTablaOrderByActividadEconomica();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionActividadEconomica() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionActividadEconomica==null) {
				
				this.jInternalFrameImportacionActividadEconomica=new ImportacionJInternalFrame(ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionActividadEconomica);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionActividadEconomica);
				this.jInternalFrameImportacionActividadEconomica.setVisible(false);
				this.jInternalFrameImportacionActividadEconomica.setSelected(false);


				this.jInternalFrameImportacionActividadEconomica.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionActividadEconomica"));
				this.jInternalFrameImportacionActividadEconomica.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionActividadEconomica"));
				this.jInternalFrameImportacionActividadEconomica.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionActividadEconomica"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoActividadEconomica() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoActividadEconomica==null) {
				this.jInternalFrameReporteDinamicoActividadEconomica=new ReporteDinamicoJInternalFrame(ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoActividadEconomica);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoActividadEconomica);
				this.jInternalFrameReporteDinamicoActividadEconomica.setVisible(false);
				this.jInternalFrameReporteDinamicoActividadEconomica.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoActividadEconomica.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoActividadEconomica"));
				this.jInternalFrameReporteDinamicoActividadEconomica.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoActividadEconomica"));
				this.jInternalFrameReporteDinamicoActividadEconomica.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoActividadEconomica"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualActividadEconomica();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleActividadEconomica() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormActividadEconomica);
			
	       	this.jInternalFrameDetalleFormActividadEconomica.setVisible(false);
	        this.jInternalFrameDetalleFormActividadEconomica.setSelected(false);
			
			//this.jInternalFrameDetalleFormActividadEconomica.dispose();
			//this.jInternalFrameDetalleFormActividadEconomica=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoActividadEconomica() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoActividadEconomica.setVisible(true);
	        this.jInternalFrameReporteDinamicoActividadEconomica.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionActividadEconomica() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionActividadEconomica.setVisible(true);
	        this.jInternalFrameImportacionActividadEconomica.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByActividadEconomica() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByActividadEconomica.setVisible(true);
	        this.jInternalFrameOrderByActividadEconomica.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByActividadEconomica() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByActividadEconomica.setVisible(false);
	        this.jInternalFrameOrderByActividadEconomica.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoActividadEconomica() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoActividadEconomica.setVisible(false);
	        this.jInternalFrameReporteDinamicoActividadEconomica.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionActividadEconomica() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionActividadEconomica.setVisible(false);
	        this.jInternalFrameImportacionActividadEconomica.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarActividadEconomicaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarActividadEconomica(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarActividadEconomica(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesActividadEconomica(true);
			//this.isEsNuevoActividadEconomica=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomica =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.actividadeconomica =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesActividadEconomica("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesActividadEconomica(false) ;
			
			if(actividadeconomicaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ActividadEconomicaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleActividadEconomica(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualActividadEconomica(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaActividadEconomicaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomica =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.actividadeconomica =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarActividadEconomica(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormActividadEconomica==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesActividadEconomica(true);
			//this.isEsNuevoActividadEconomica=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomica =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.actividadeconomica =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.actividadeconomica.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesActividadEconomica("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesActividadEconomica(false) ;
			
			if(ActividadEconomicaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleActividadEconomica(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualActividadEconomica(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.actividadeconomicaConstantesFunciones.cargarid_clienteActividadEconomica) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingActividadEconomica(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosActividadEconomica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActividadEconomica,ActividadEconomicaConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosActividadEconomica.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosActividadEconomica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActividadEconomica,ActividadEconomicaConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosActividadEconomica.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCiudad(List<Ciudad> ciudadsForeignKey)throws Exception{
		TableColumn tableColumnCiudad=this.jTableDatosActividadEconomica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActividadEconomica,ActividadEconomicaConstantesFunciones.LABEL_IDCIUDAD));
		TableCellEditor tableCellEditorCiudad =tableColumnCiudad.getCellEditor();

		CiudadTableCell ciudadTableCellFk=(CiudadTableCell)tableCellEditorCiudad;

		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.setciudadsForeignKey(ciudadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosActividadEconomica.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ciudadTableCellFk.setRowActual(intSelectedRow);
			//ciudadTableCellFk.setciudadsForeignKeyActual(ciudadsForeignKey);
		//}


		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.RecargarCiudadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarActividadEconomicaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesActividadEconomica(false);
			
			//if(!this.isEsNuevoActividadEconomica) {								
				int intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomica =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.actividadeconomica =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ActividadEconomicaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualActividadEconomica(this.actividadeconomica,true);
				this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);
				
			}
			
			if(this.permiteMantenimiento(this.actividadeconomica)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoActividadEconomica=true;
					this.inicializarActualizarBindingTablaActividadEconomica(false);
					this.isEsNuevoActividadEconomica=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoActividadEconomica=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoActividadEconomica=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesActividadEconomica(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualActividadEconomica(false);
				
				this.habilitarDeshabilitarControlesActividadEconomica(false);
			
												
				
				if(ActividadEconomicaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleActividadEconomica();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoActividadEconomicaActionPerformed(evt,actividadeconomicaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualActividadEconomica(this.actividadeconomica,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosActividadEconomica.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,actividadeconomicaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.actividadeconomica.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ActividadEconomica.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActividadEconomica.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarActividadEconomicaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomica =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
				this.actividadeconomica.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.actividadeconomica =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
				this.actividadeconomica.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.actividadeconomica)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ActividadEconomicaModel) this.jTableDatosActividadEconomica.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoActividadEconomica=true;
				this.inicializarActualizarBindingTablaActividadEconomica(false);
				this.isEsNuevoActividadEconomica=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesActividadEconomica(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualActividadEconomica(false);
				
				this.habilitarDeshabilitarControlesActividadEconomica(false);
				
				
				
				if(ActividadEconomicaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleActividadEconomica();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarActividadEconomicaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosActividadEconomica.getRowCount()>=1) {
				jTableDatosActividadEconomica.removeRowSelectionInterval(0, jTableDatosActividadEconomica.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesActividadEconomica(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaActividadEconomica(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesActividadEconomica(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualActividadEconomica(false) ;
			
			this.isEsNuevoActividadEconomica=false;
			
			if(ActividadEconomicaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleActividadEconomica();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosActividadEconomicaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingActividadEconomica(false);
				
				//SI ES MANUAL
				if(ActividadEconomicaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualActividadEconomica();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosActividadEconomicaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoActividadEconomica--;			
			//ActividadEconomica actividadeconomicaAux= new ActividadEconomica();			
			//actividadeconomicaAux.setId(this.iIdNuevoActividadEconomica);
			
			if(this.jInternalFrameDetalleFormActividadEconomica==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaActividadEconomica();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);
			
			this.actividadeconomica.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.actividadeconomicaLogic.getActividadEconomicas().add(this.actividadeconomicaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.actividadeconomicas.add(this.actividadeconomicaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaActividadEconomica(false);
			
			this.jTableDatosActividadEconomica.setRowSelectionInterval(this.getIndiceNuevoActividadEconomica(), this.getIndiceNuevoActividadEconomica());
			
			int iLastRow =  this.jTableDatosActividadEconomica.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosActividadEconomica.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosActividadEconomica.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaActividadEconomica(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionActividadEconomicaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingActividadEconomica(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingActividadEconomica(false);
			
			//SI ES MANUAL
			if(ActividadEconomicaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualActividadEconomica();
			}
			
			//this.abrirFrameTreeActividadEconomica();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionActividadEconomicaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Actividad EconomicaS ?", "MANTENIMIENTO DE Actividad Economica", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionActividadEconomica.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralActividadEconomica();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.actividadeconomicaReturnGeneral=actividadeconomicaLogic.procesarImportacionActividadEconomicasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.actividadeconomicaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarActividadEconomicaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionActividadEconomicaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionActividadEconomica.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionActividadEconomica.setFileImportacion(this.jInternalFrameImportacionActividadEconomica.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionActividadEconomica.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionActividadEconomica.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionActividadEconomica.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionActividadEconomica.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoActividadEconomicaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ActividadEconomica> actividadeconomicasSeleccionados=new ArrayList<ActividadEconomica>();		

		actividadeconomicasSeleccionados=this.getActividadEconomicasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoActividadEconomica.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoActividadEconomica.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ActividadEconomicaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ActividadEconomicaBaseDesign.jrxml";
			
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
			
			this.generarReporteActividadEconomicas("Todos",actividadeconomicasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Actividad Economica",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoActividadEconomica.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoActividadEconomica.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ActividadEconomicaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActividadEconomicaConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActividadEconomicaConstantesFunciones.LABEL_NOMBRENEGOCIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreNegocio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreNegocio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreNegocio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreNegocio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActividadEconomicaConstantesFunciones.LABEL_ACTIVIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tividad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tividad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tividad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tividad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActividadEconomicaConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActividadEconomicaConstantesFunciones.LABEL_IDCIUDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ciudad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ciudad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ciudad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ciudad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActividadEconomicaConstantesFunciones.LABEL_DIRECCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActividadEconomicaConstantesFunciones.LABEL_TELEFONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefono_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefono_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefono_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefono_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActividadEconomicaConstantesFunciones.LABEL_INGRESONETO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_gresoNeto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_gresoNeto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_gresoNeto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_gresoNeto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActividadEconomicaConstantesFunciones.LABEL_INGRESOBRUTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_gresoBruto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_gresoBruto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_gresoBruto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_gresoBruto_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoActividadEconomica.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoActividadEconomica.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoActividadEconomica.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ActividadEconomicaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_NOMBRENEGOCIO:
					sNombreCampoCategoria="nombre_negocio";
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_ACTIVIDAD:
					sNombreCampoCategoria="actividad";
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_IDCIUDAD:
					sNombreCampoCategoria="id_ciudad";
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoria="direccion";
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoria="telefono";
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_INGRESONETO:
					sNombreCampoCategoria="ingreso_neto";
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_INGRESOBRUTO:
					sNombreCampoCategoria="ingreso_bruto";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoActividadEconomica.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ActividadEconomicaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_NOMBRENEGOCIO:
					sNombreCampoCategoriaValor="nombre_negocio";
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_ACTIVIDAD:
					sNombreCampoCategoriaValor="actividad";
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_IDCIUDAD:
					sNombreCampoCategoriaValor="id_ciudad";
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoriaValor="direccion";
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoriaValor="telefono";
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_INGRESONETO:
					sNombreCampoCategoriaValor="ingreso_neto";
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_INGRESOBRUTO:
					sNombreCampoCategoriaValor="ingreso_bruto";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoActividadEconomica.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoActividadEconomica.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ActividadEconomicaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_NOMBRENEGOCIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Negocio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_negocio");
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_ACTIVIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Actividad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"actividad");
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_IDCIUDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ciudad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ciudad");
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_DIRECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion");
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_TELEFONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono");
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_INGRESONETO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ingreso Neto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ingreso_neto");
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_INGRESOBRUTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ingreso Bruto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ingreso_bruto");
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
	
	public void jButtonGenerarExcelReporteDinamicoActividadEconomicaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ActividadEconomica> actividadeconomicasSeleccionados=new ArrayList<ActividadEconomica>();		
		
		actividadeconomicasSeleccionados=this.getActividadEconomicasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"actividadeconomica";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ActividadEconomicas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoActividadEconomica.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoActividadEconomica.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ActividadEconomicaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ActividadEconomica actividadeconomica:actividadeconomicasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(actividadeconomica.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(ActividadEconomica actividadeconomica:actividadeconomicasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(actividadeconomica.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_NOMBRENEGOCIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_NOMBRENEGOCIO);
					iRow++;

					for(ActividadEconomica actividadeconomica:actividadeconomicasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(actividadeconomica.getnombre_negocio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_ACTIVIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_ACTIVIDAD);
					iRow++;

					for(ActividadEconomica actividadeconomica:actividadeconomicasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(actividadeconomica.getactividad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(ActividadEconomica actividadeconomica:actividadeconomicasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(actividadeconomica.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_IDCIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_IDCIUDAD);
					iRow++;

					for(ActividadEconomica actividadeconomica:actividadeconomicasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(actividadeconomica.getciudad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_DIRECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_DIRECCION);
					iRow++;

					for(ActividadEconomica actividadeconomica:actividadeconomicasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(actividadeconomica.getdireccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_TELEFONO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_TELEFONO);
					iRow++;

					for(ActividadEconomica actividadeconomica:actividadeconomicasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(actividadeconomica.gettelefono());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_INGRESONETO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_INGRESONETO);
					iRow++;

					for(ActividadEconomica actividadeconomica:actividadeconomicasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(actividadeconomica.getingreso_neto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActividadEconomicaConstantesFunciones.LABEL_INGRESOBRUTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_INGRESOBRUTO);
					iRow++;

					for(ActividadEconomica actividadeconomica:actividadeconomicasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(actividadeconomica.getingreso_bruto());
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
			//	this.getFilaCabeceraExportarExcelActividadEconomica(row);				
			//	iRow++;
			//}				
			
			//for(ActividadEconomica actividadeconomicaAux:actividadeconomicasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelActividadEconomica(actividadeconomicaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Actividad Economica",JOptionPane.INFORMATION_MESSAGE);
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
				this.actividadeconomicaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingActividadEconomica(false);
			
			//SI ES MANUAL
			if(ActividadEconomicaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualActividadEconomica();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresActividadEconomicaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingActividadEconomica(false);
			
			//SI ES MANUAL
			if(ActividadEconomicaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualActividadEconomica();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesActividadEconomicaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingActividadEconomica(false);
			
			//SI ES MANUAL
			if(ActividadEconomicaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualActividadEconomica();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaActividadEconomica() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosActividadEconomica.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosActividadEconomica.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosActividadEconomica.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosActividadEconomica.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosActividadEconomica.setMinimumSize(dimensionMinimum);
		this.jTableDatosActividadEconomica.setMaximumSize(dimensionMaximum);
		this.jTableDatosActividadEconomica.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingActividadEconomica(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingActividadEconomica(esInicializar,true);
	}
	
	public void inicializarActualizarBindingActividadEconomica(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaActividadEconomica(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesActividadEconomica(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasActividadEconomica(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesActividadEconomica(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesActividadEconomica(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ActividadEconomicaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ActividadEconomicaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualActividadEconomica() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaActividadEconomica();
		
		this.inicializarActualizarBindingBotonesManualActividadEconomica(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualActividadEconomica();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesActividadEconomica() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualActividadEconomica(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualActividadEconomica(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosActividadEconomica.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosActividadEconomica.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteActividadEconomica.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormActividadEconomica.jCheckBoxPostAccionNuevoActividadEconomica.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormActividadEconomica.jCheckBoxPostAccionSinCerrarActividadEconomica.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormActividadEconomica.jCheckBoxPostAccionSinMensajeActividadEconomica.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosActividadEconomica.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosActividadEconomica.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteActividadEconomica.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
				this.jInternalFrameDetalleFormActividadEconomica.jCheckBoxPostAccionNuevoActividadEconomica.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormActividadEconomica.jCheckBoxPostAccionSinCerrarActividadEconomica.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormActividadEconomica.jCheckBoxPostAccionSinMensajeActividadEconomica.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionActividadEconomica.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionActividadEconomica.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormActividadEconomica.jComboBoxTiposAccionesFormularioActividadEconomica.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesActividadEconomica.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoActividadEconomica!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoActividadEconomica.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesActividadEconomica.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesActividadEconomica.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarActividadEconomica.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesActividadEconomica.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoActividadEconomica!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoActividadEconomica.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesActividadEconomica.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralActividadEconomica.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesActividadEconomica(Boolean esInicializar) throws Exception {
		try	{	
			if(ActividadEconomicaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualActividadEconomica(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesActividadEconomica() throws Exception {
		try	{
			if(ActividadEconomicaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualActividadEconomica();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleActividadEconomica() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormActividadEconomica.jComboBoxTiposAccionesFormularioActividadEconomica.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormActividadEconomica.jComboBoxTiposAccionesFormularioActividadEconomica.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualActividadEconomica() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesActividadEconomica.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesActividadEconomica.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesActividadEconomica.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesActividadEconomica.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesActividadEconomica.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesActividadEconomica.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionActividadEconomica.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionActividadEconomica.addItem(reporte);
			}
			
			
			if(!this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionActividadEconomica.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionActividadEconomica.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesActividadEconomica.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesActividadEconomica.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesActividadEconomica.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesActividadEconomica.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormActividadEconomica!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormActividadEconomica.jComboBoxTiposAccionesFormularioActividadEconomica.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormActividadEconomica.jComboBoxTiposAccionesFormularioActividadEconomica.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarActividadEconomica.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarActividadEconomica.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarActividadEconomica.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualActividadEconomica();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualActividadEconomica() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoActividadEconomica!=null) {
				this.jInternalFrameReporteDinamicoActividadEconomica.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoActividadEconomica.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoActividadEconomica!=null) {
				this.jInternalFrameReporteDinamicoActividadEconomica.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoActividadEconomica.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoActividadEconomica!=null) {
				
				if(this.jInternalFrameReporteDinamicoActividadEconomica.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoActividadEconomica.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoActividadEconomica.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoActividadEconomica.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoActividadEconomica.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoActividadEconomica.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoActividadEconomica.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoActividadEconomica.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ActividadEconomicaConstantesFunciones.getTiposSeleccionarActividadEconomica(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoActividadEconomica.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoActividadEconomica.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoActividadEconomica.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ActividadEconomicaConstantesFunciones.getTiposSeleccionarActividadEconomica(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoActividadEconomica.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoActividadEconomica.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoActividadEconomica.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ActividadEconomicaConstantesFunciones.getTiposSeleccionarActividadEconomica(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoActividadEconomica.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoActividadEconomica.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoActividadEconomica.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoActividadEconomica.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualActividadEconomica()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ciudadFK_IdCiudadActividadEconomica.getSelectedItem()!=null){this.id_ciudadFK_IdCiudad=((Ciudad)this.jComboBoxid_ciudadFK_IdCiudadActividadEconomica.getSelectedItem()).getId();}
		if(this.jComboBoxid_clienteFK_IdClienteActividadEconomica.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteActividadEconomica.getSelectedItem()).getId();}
		if(this.jComboBoxid_paisFK_IdPaisActividadEconomica.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisActividadEconomica.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasActividadEconomica(Boolean esInicializar) throws Exception {				
		if(ActividadEconomicaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualActividadEconomica();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaActividadEconomica() throws Exception {
		this.inicializarActualizarBindingTablaActividadEconomica(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByActividadEconomica() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByActividadEconomica.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByActividadEconomica.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByActividadEconomica.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ActividadEconomicaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByActividadEconomica.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByActividadEconomica.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ActividadEconomicaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosActividadEconomicaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActividadEconomicaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ActividadEconomicaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByActividadEconomica.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByActividadEconomica.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ActividadEconomicaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByActividadEconomica.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaActividadEconomica(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=actividadeconomicaLogic.getActividadEconomicas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=actividadeconomicas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ActividadEconomicaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosActividadEconomica.setModel(new ActividadEconomicaModel(this.actividadeconomicaLogic.getActividadEconomicas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosActividadEconomica.setModel(new ActividadEconomicaModel(this.actividadeconomicas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByActividadEconomica!=null && this.jInternalFrameOrderByActividadEconomica.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByActividadEconomica();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosActividadEconomica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActividadEconomica,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ActividadEconomicaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO,actividadeconomicaConstantesFunciones.resaltarSeleccionarActividadEconomica,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ActividadEconomicaConstantesFunciones.SCLASSWEBTITULO,actividadeconomicaConstantesFunciones.resaltarSeleccionarActividadEconomica,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosActividadEconomica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActividadEconomica,ActividadEconomicaConstantesFunciones.LABEL_ID));

		if(this.actividadeconomicaConstantesFunciones.mostraridActividadEconomica && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActividadEconomicaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.actividadeconomicaConstantesFunciones.resaltaridActividadEconomica,this.actividadeconomicaConstantesFunciones.activaridActividadEconomica,iSizeTabla,this,true,"idActividadEconomica","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.actividadeconomicaConstantesFunciones.resaltaridActividadEconomica,this.actividadeconomicaConstantesFunciones.activaridActividadEconomica,this,true,"idActividadEconomica","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActividadEconomica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActividadEconomica,ActividadEconomicaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.actividadeconomicaConstantesFunciones.mostrarid_empresaActividadEconomica && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActividadEconomicaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.actividadeconomicaConstantesFunciones.resaltarid_empresaActividadEconomica,this,this.actividadeconomicaConstantesFunciones.activarid_empresaActividadEconomica,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.actividadeconomicaConstantesFunciones.resaltarid_empresaActividadEconomica,this,this.actividadeconomicaConstantesFunciones.activarid_empresaActividadEconomica,false,"id_empresaActividadEconomica","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ActividadEconomicaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActividadEconomica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActividadEconomica,ActividadEconomicaConstantesFunciones.LABEL_IDCLIENTE));

		if(this.actividadeconomicaConstantesFunciones.mostrarid_clienteActividadEconomica && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActividadEconomicaConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.actividadeconomicaConstantesFunciones.resaltarid_clienteActividadEconomica,this,this.actividadeconomicaConstantesFunciones.activarid_clienteActividadEconomica,iSizeTabla));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.actividadeconomicaConstantesFunciones.resaltarid_clienteActividadEconomica,this,this.actividadeconomicaConstantesFunciones.activarid_clienteActividadEconomica,true,"id_clienteActividadEconomica","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ActividadEconomicaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActividadEconomica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActividadEconomica,ActividadEconomicaConstantesFunciones.LABEL_NOMBRENEGOCIO));

		if(this.actividadeconomicaConstantesFunciones.mostrarnombre_negocioActividadEconomica && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActividadEconomicaConstantesFunciones.LABEL_NOMBRENEGOCIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.actividadeconomicaConstantesFunciones.resaltarnombre_negocioActividadEconomica,this.actividadeconomicaConstantesFunciones.activarnombre_negocioActividadEconomica,iSizeTabla,this,true,"nombre_negocioActividadEconomica","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.actividadeconomicaConstantesFunciones.resaltarnombre_negocioActividadEconomica,this.actividadeconomicaConstantesFunciones.activarnombre_negocioActividadEconomica,this,true,"nombre_negocioActividadEconomica","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ActividadEconomicaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActividadEconomica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActividadEconomica,ActividadEconomicaConstantesFunciones.LABEL_ACTIVIDAD));

		if(this.actividadeconomicaConstantesFunciones.mostraractividadActividadEconomica && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActividadEconomicaConstantesFunciones.LABEL_ACTIVIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.actividadeconomicaConstantesFunciones.resaltaractividadActividadEconomica,this.actividadeconomicaConstantesFunciones.activaractividadActividadEconomica,iSizeTabla,this,true,"actividadActividadEconomica","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.actividadeconomicaConstantesFunciones.resaltaractividadActividadEconomica,this.actividadeconomicaConstantesFunciones.activaractividadActividadEconomica,this,true,"actividadActividadEconomica","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ActividadEconomicaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActividadEconomica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActividadEconomica,ActividadEconomicaConstantesFunciones.LABEL_IDPAIS));

		if(this.actividadeconomicaConstantesFunciones.mostrarid_paisActividadEconomica && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActividadEconomicaConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.actividadeconomicaConstantesFunciones.resaltarid_paisActividadEconomica,this,this.actividadeconomicaConstantesFunciones.activarid_paisActividadEconomica,iSizeTabla));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.actividadeconomicaConstantesFunciones.resaltarid_paisActividadEconomica,this,this.actividadeconomicaConstantesFunciones.activarid_paisActividadEconomica,true,"id_paisActividadEconomica","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ActividadEconomicaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActividadEconomica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActividadEconomica,ActividadEconomicaConstantesFunciones.LABEL_IDCIUDAD));

		if(this.actividadeconomicaConstantesFunciones.mostrarid_ciudadActividadEconomica && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActividadEconomicaConstantesFunciones.LABEL_IDCIUDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CiudadTableCell(this.ciudadsForeignKey,this.actividadeconomicaConstantesFunciones.resaltarid_ciudadActividadEconomica,this,this.actividadeconomicaConstantesFunciones.activarid_ciudadActividadEconomica,iSizeTabla));
			tableColumn.setCellEditor(new CiudadTableCell(this.ciudadsForeignKey,this.actividadeconomicaConstantesFunciones.resaltarid_ciudadActividadEconomica,this,this.actividadeconomicaConstantesFunciones.activarid_ciudadActividadEconomica,true,"id_ciudadActividadEconomica","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ActividadEconomicaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActividadEconomica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActividadEconomica,ActividadEconomicaConstantesFunciones.LABEL_DIRECCION));

		if(this.actividadeconomicaConstantesFunciones.mostrardireccionActividadEconomica && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActividadEconomicaConstantesFunciones.LABEL_DIRECCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.actividadeconomicaConstantesFunciones.resaltardireccionActividadEconomica,this.actividadeconomicaConstantesFunciones.activardireccionActividadEconomica,iSizeTabla,this,true,"direccionActividadEconomica","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.actividadeconomicaConstantesFunciones.resaltardireccionActividadEconomica,this.actividadeconomicaConstantesFunciones.activardireccionActividadEconomica,this,true,"direccionActividadEconomica","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ActividadEconomicaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActividadEconomica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActividadEconomica,ActividadEconomicaConstantesFunciones.LABEL_TELEFONO));

		if(this.actividadeconomicaConstantesFunciones.mostrartelefonoActividadEconomica && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActividadEconomicaConstantesFunciones.LABEL_TELEFONO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.actividadeconomicaConstantesFunciones.resaltartelefonoActividadEconomica,this.actividadeconomicaConstantesFunciones.activartelefonoActividadEconomica,iSizeTabla,this,true,"telefonoActividadEconomica","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.actividadeconomicaConstantesFunciones.resaltartelefonoActividadEconomica,this.actividadeconomicaConstantesFunciones.activartelefonoActividadEconomica,this,true,"telefonoActividadEconomica","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ActividadEconomicaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActividadEconomica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActividadEconomica,ActividadEconomicaConstantesFunciones.LABEL_INGRESONETO));

		if(this.actividadeconomicaConstantesFunciones.mostraringreso_netoActividadEconomica && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActividadEconomicaConstantesFunciones.LABEL_INGRESONETO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.actividadeconomicaConstantesFunciones.resaltaringreso_netoActividadEconomica,this.actividadeconomicaConstantesFunciones.activaringreso_netoActividadEconomica,iSizeTabla,this,true,"ingreso_netoActividadEconomica","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.actividadeconomicaConstantesFunciones.resaltaringreso_netoActividadEconomica,this.actividadeconomicaConstantesFunciones.activaringreso_netoActividadEconomica,this,true,"ingreso_netoActividadEconomica","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ActividadEconomicaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActividadEconomica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActividadEconomica,ActividadEconomicaConstantesFunciones.LABEL_INGRESOBRUTO));

		if(this.actividadeconomicaConstantesFunciones.mostraringreso_brutoActividadEconomica && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActividadEconomicaConstantesFunciones.LABEL_INGRESOBRUTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.actividadeconomicaConstantesFunciones.resaltaringreso_brutoActividadEconomica,this.actividadeconomicaConstantesFunciones.activaringreso_brutoActividadEconomica,iSizeTabla,this,true,"ingreso_brutoActividadEconomica","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.actividadeconomicaConstantesFunciones.resaltaringreso_brutoActividadEconomica,this.actividadeconomicaConstantesFunciones.activaringreso_brutoActividadEconomica,this,true,"ingreso_brutoActividadEconomica","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ActividadEconomicaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.actividadeconomicaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.actividadeconomicaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.actividadeconomicaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosActividadEconomica.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.actividadeconomicaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.actividadeconomicaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosActividadEconomica.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarActividadEconomica && this.isPermisoGuardarCambiosActividadEconomica) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.actividadeconomicaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.actividadeconomicaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosActividadEconomica.addColumn(tableColumn);
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
			
			this.jTableDatosActividadEconomica.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarActividadEconomica && this.isPermisoGuardarCambiosActividadEconomica) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarActividadEconomica && this.isPermisoGuardarCambiosActividadEconomica) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosActividadEconomica.moveColumn(this.jTableDatosActividadEconomica.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosActividadEconomica.moveColumn(this.jTableDatosActividadEconomica.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosActividadEconomica.moveColumn(this.jTableDatosActividadEconomica.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosActividadEconomica.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosActividadEconomica.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosActividadEconomica,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ActividadEconomicaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosActividadEconomica.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosActividadEconomica.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ActividadEconomicaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ActividadEconomicaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosActividadEconomica.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosActividadEconomica.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosActividadEconomica.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=actividadeconomicaLogic.getActividadEconomicas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=actividadeconomicas.size()-1;
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
		//this.jTableDatosActividadEconomica.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosActividadEconomica.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosActividadEconomica();
			
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
				
				//this.isEsNuevoActividadEconomica=false;
					
				ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
			
				if(this.actividadeconomicaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormActividadEconomica==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosActividadEconomica.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosActividadEconomica.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomica =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.actividadeconomica =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.actividadeconomica.getsType().equals("DUPLICADO")
				   || this.actividadeconomica.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoActividadEconomica=true;
				
				} else {
					this.isEsNuevoActividadEconomica=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {
					if(this.actividadeconomica.getId()>=0 && !this.actividadeconomica.getIsNew()) {						
						this.isEsNuevoActividadEconomica=false;
						
					} else {
						this.isEsNuevoActividadEconomica=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoActividadEconomica(esRelaciones);						
				
				this.seleccionarActividadEconomica(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.actividadeconomica.getId()<0) {
					this.isEsNuevoActividadEconomica=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarActividadEconomica(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarActividadEconomica(evt,rowIndex);
				}	
				
				if(this.actividadeconomicaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ActividadEconomica: " + this.dDif); 
					}
				}								
				
				ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarActividadEconomica(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.actividadeconomica)) {
					if(this.actividadeconomica.getId()>0) {
						this.actividadeconomica.setIsDeleted(true);
						
						this.actividadeconomicasEliminados.add(this.actividadeconomica);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.actividadeconomicaLogic.getActividadEconomicas().remove(this.actividadeconomica);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.actividadeconomicas.remove(this.actividadeconomica);				
					}
					
					
					((ActividadEconomicaModel) this.jTableDatosActividadEconomica.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaActividadEconomica(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarActividadEconomica(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoActividadEconomica) {
			
			if(this.jInternalFrameDetalleFormActividadEconomica==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosActividadEconomica.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosActividadEconomica.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomica =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.actividadeconomica =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ActividadEconomicaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioActividadEconomica(this.actividadeconomica);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.actividadeconomicaConstantesFunciones.cargarid_empresaActividadEconomica || this.actividadeconomicaConstantesFunciones.event_dependid_empresaActividadEconomica) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.actividadeconomica.getid_empresa());
									//this.inicializarActualizarBindingActividadEconomica(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(actividadeconomica.getEmpresa()!=null) {
							this.empresasForeignKey.add(actividadeconomica.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.actividadeconomica.getid_empresa(),false,"Formulario");

					//Cliente
					if(!this.actividadeconomicaConstantesFunciones.cargarid_clienteActividadEconomica || this.actividadeconomicaConstantesFunciones.event_dependid_clienteActividadEconomica) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.actividadeconomica.getid_cliente());
									//this.inicializarActualizarBindingActividadEconomica(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(actividadeconomica.getCliente()!=null) {
							this.clientesForeignKey.add(actividadeconomica.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.actividadeconomica.getid_cliente(),false,"Formulario");

					//Pais
					if(!this.actividadeconomicaConstantesFunciones.cargarid_paisActividadEconomica || this.actividadeconomicaConstantesFunciones.event_dependid_paisActividadEconomica) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.actividadeconomica.getid_pais());
									//this.inicializarActualizarBindingActividadEconomica(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(actividadeconomica.getPais()!=null) {
							this.paissForeignKey.add(actividadeconomica.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.actividadeconomica.getid_pais(),false,"Formulario");

					//Ciudad
					if(!this.actividadeconomicaConstantesFunciones.cargarid_ciudadActividadEconomica || this.actividadeconomicaConstantesFunciones.event_dependid_ciudadActividadEconomica) {
						//this.cargarCombosCiudadsForeignKeyLista(" where id="+this.actividadeconomica.getid_ciudad());
									//this.inicializarActualizarBindingActividadEconomica(false,false);
						this.ciudadsForeignKey=new ArrayList<Ciudad>();

						if(actividadeconomica.getCiudad()!=null) {
							this.ciudadsForeignKey.add(actividadeconomica.getCiudad());
						}

						this.addItemDefectoCombosForeignKeyCiudad();
						this.cargarCombosFrameCiudadsForeignKey("Todos");
					}
					this.setActualCiudadForeignKey(this.actividadeconomica.getid_ciudad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesActividadEconomica("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesActividadEconomica(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualActividadEconomica() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoActividadEconomica(ActividadEconomica actividadeconomica) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoActividadEconomica(actividadeconomica,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoActividadEconomica(ActividadEconomica actividadeconomica,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioActividadEconomica(actividadeconomica);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyActividadEconomica(actividadeconomica,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyActividadEconomica(actividadeconomica);
	}
	
	public void setVariablesObjetoActualToFormularioActividadEconomica(ActividadEconomica actividadeconomica) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormActividadEconomica==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormActividadEconomica.jLabelidActividadEconomica.setText(actividadeconomica.getId().toString());
			this.jInternalFrameDetalleFormActividadEconomica.jTextAreanombre_negocioActividadEconomica.setText(actividadeconomica.getnombre_negocio());
			this.jInternalFrameDetalleFormActividadEconomica.jTextAreaactividadActividadEconomica.setText(actividadeconomica.getactividad());
			this.jInternalFrameDetalleFormActividadEconomica.jTextAreadireccionActividadEconomica.setText(actividadeconomica.getdireccion());
			this.jInternalFrameDetalleFormActividadEconomica.jTextAreatelefonoActividadEconomica.setText(actividadeconomica.gettelefono());
			this.jInternalFrameDetalleFormActividadEconomica.jTextFieldingreso_netoActividadEconomica.setText(actividadeconomica.getingreso_neto().toString());
			this.jInternalFrameDetalleFormActividadEconomica.jTextFieldingreso_brutoActividadEconomica.setText(actividadeconomica.getingreso_bruto().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ActividadEconomica actividadeconomicaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,actividadeconomicaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ActividadEconomica actividadeconomicaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				actividadeconomicaLocal=this.actividadeconomica;
			} else {
				actividadeconomicaLocal=this.actividadeconomicaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(actividadeconomicaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoActividadEconomica(actividadeconomicaLocal,true);
					
					if(actividadeconomicaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(actividadeconomicaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(actividadeconomicaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoActividadEconomica(ActividadEconomica actividadeconomica,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualActividadEconomica(actividadeconomica,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(actividadeconomica);
	}
	
	public void setVariablesFormularioToObjetoActualActividadEconomica(ActividadEconomica actividadeconomica,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualActividadEconomica(actividadeconomica,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualActividadEconomica(ActividadEconomica actividadeconomica,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormActividadEconomica==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormActividadEconomica.jLabelidActividadEconomica.getText()==null || this.jInternalFrameDetalleFormActividadEconomica.jLabelidActividadEconomica.getText()=="" || this.jInternalFrameDetalleFormActividadEconomica.jLabelidActividadEconomica.getText()=="Id") {
				this.jInternalFrameDetalleFormActividadEconomica.jLabelidActividadEconomica.setText("0");
			}

			if(conColumnasBase) {actividadeconomica.setId(Long.parseLong(this.jInternalFrameDetalleFormActividadEconomica.jLabelidActividadEconomica.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActividadEconomicaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActividadEconomica.jLabelIdActividadEconomica,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			actividadeconomica.setnombre_negocio(this.jInternalFrameDetalleFormActividadEconomica.jTextAreanombre_negocioActividadEconomica.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActividadEconomicaConstantesFunciones.LABEL_NOMBRENEGOCIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActividadEconomica.jLabelnombre_negocioActividadEconomica,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			actividadeconomica.setactividad(this.jInternalFrameDetalleFormActividadEconomica.jTextAreaactividadActividadEconomica.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActividadEconomicaConstantesFunciones.LABEL_ACTIVIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActividadEconomica.jLabelactividadActividadEconomica,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			actividadeconomica.setdireccion(this.jInternalFrameDetalleFormActividadEconomica.jTextAreadireccionActividadEconomica.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActividadEconomicaConstantesFunciones.LABEL_DIRECCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActividadEconomica.jLabeldireccionActividadEconomica,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			actividadeconomica.settelefono(this.jInternalFrameDetalleFormActividadEconomica.jTextAreatelefonoActividadEconomica.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActividadEconomicaConstantesFunciones.LABEL_TELEFONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActividadEconomica.jLabeltelefonoActividadEconomica,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			actividadeconomica.setingreso_neto(Double.parseDouble(this.jInternalFrameDetalleFormActividadEconomica.jTextFieldingreso_netoActividadEconomica.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActividadEconomicaConstantesFunciones.LABEL_INGRESONETO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActividadEconomica.jLabelingreso_netoActividadEconomica,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			actividadeconomica.setingreso_bruto(Double.parseDouble(this.jInternalFrameDetalleFormActividadEconomica.jTextFieldingreso_brutoActividadEconomica.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActividadEconomicaConstantesFunciones.LABEL_INGRESOBRUTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActividadEconomica.jLabelingreso_brutoActividadEconomica,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualActividadEconomica(ActividadEconomica actividadeconomicaBean,ActividadEconomica actividadeconomica,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && actividadeconomicaBean.getid_cliente()!=null && !actividadeconomicaBean.getid_cliente().equals(-1L))) {actividadeconomica.setid_cliente(actividadeconomicaBean.getid_cliente());}
			if(conDefault || (!conDefault && actividadeconomicaBean.getid_pais()!=null && !actividadeconomicaBean.getid_pais().equals(-1L))) {actividadeconomica.setid_pais(actividadeconomicaBean.getid_pais());}
			if(conDefault || (!conDefault && actividadeconomicaBean.getid_ciudad()!=null && !actividadeconomicaBean.getid_ciudad().equals(-1L))) {actividadeconomica.setid_ciudad(actividadeconomicaBean.getid_ciudad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosActividadEconomica(ActividadEconomica actividadeconomicaOrigen,ActividadEconomica actividadeconomica,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && actividadeconomicaOrigen.getId()!=null && !actividadeconomicaOrigen.getId().equals(0L))) {actividadeconomica.setId(actividadeconomicaOrigen.getId());}}
			if(conDefault || (!conDefault && actividadeconomicaOrigen.getid_cliente()!=null && !actividadeconomicaOrigen.getid_cliente().equals(-1L))) {actividadeconomica.setid_cliente(actividadeconomicaOrigen.getid_cliente());}
			if(conDefault || (!conDefault && actividadeconomicaOrigen.getnombre_negocio()!=null && !actividadeconomicaOrigen.getnombre_negocio().equals(""))) {actividadeconomica.setnombre_negocio(actividadeconomicaOrigen.getnombre_negocio());}
			if(conDefault || (!conDefault && actividadeconomicaOrigen.getactividad()!=null && !actividadeconomicaOrigen.getactividad().equals(""))) {actividadeconomica.setactividad(actividadeconomicaOrigen.getactividad());}
			if(conDefault || (!conDefault && actividadeconomicaOrigen.getid_pais()!=null && !actividadeconomicaOrigen.getid_pais().equals(-1L))) {actividadeconomica.setid_pais(actividadeconomicaOrigen.getid_pais());}
			if(conDefault || (!conDefault && actividadeconomicaOrigen.getid_ciudad()!=null && !actividadeconomicaOrigen.getid_ciudad().equals(-1L))) {actividadeconomica.setid_ciudad(actividadeconomicaOrigen.getid_ciudad());}
			if(conDefault || (!conDefault && actividadeconomicaOrigen.getdireccion()!=null && !actividadeconomicaOrigen.getdireccion().equals(""))) {actividadeconomica.setdireccion(actividadeconomicaOrigen.getdireccion());}
			if(conDefault || (!conDefault && actividadeconomicaOrigen.gettelefono()!=null && !actividadeconomicaOrigen.gettelefono().equals(""))) {actividadeconomica.settelefono(actividadeconomicaOrigen.gettelefono());}
			if(conDefault || (!conDefault && actividadeconomicaOrigen.getingreso_neto()!=null && !actividadeconomicaOrigen.getingreso_neto().equals(0.0))) {actividadeconomica.setingreso_neto(actividadeconomicaOrigen.getingreso_neto());}
			if(conDefault || (!conDefault && actividadeconomicaOrigen.getingreso_bruto()!=null && !actividadeconomicaOrigen.getingreso_bruto().equals(0.0))) {actividadeconomica.setingreso_bruto(actividadeconomicaOrigen.getingreso_bruto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioActividadEconomica(ActividadEconomica actividadeconomica) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormActividadEconomica.jLabelidActividadEconomica.setText(actividadeconomica.getId().toString());
			this.jInternalFrameDetalleFormActividadEconomica.jTextAreanombre_negocioActividadEconomica.setText(actividadeconomica.getnombre_negocio());
			this.jInternalFrameDetalleFormActividadEconomica.jTextAreaactividadActividadEconomica.setText(actividadeconomica.getactividad());
			this.jInternalFrameDetalleFormActividadEconomica.jTextAreadireccionActividadEconomica.setText(actividadeconomica.getdireccion());
			this.jInternalFrameDetalleFormActividadEconomica.jTextAreatelefonoActividadEconomica.setText(actividadeconomica.gettelefono());
			this.jInternalFrameDetalleFormActividadEconomica.jTextFieldingreso_netoActividadEconomica.setText(actividadeconomica.getingreso_neto().toString());
			this.jInternalFrameDetalleFormActividadEconomica.jTextFieldingreso_brutoActividadEconomica.setText(actividadeconomica.getingreso_bruto().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioActividadEconomica(ActividadEconomicaBean actividadeconomicaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormActividadEconomica.jLabelidActividadEconomica.setText(actividadeconomicaBean.getId().toString());
			this.jInternalFrameDetalleFormActividadEconomica.jTextAreanombre_negocioActividadEconomica.setText(actividadeconomicaBean.getnombre_negocio());
			this.jInternalFrameDetalleFormActividadEconomica.jTextAreaactividadActividadEconomica.setText(actividadeconomicaBean.getactividad());
			this.jInternalFrameDetalleFormActividadEconomica.jTextAreadireccionActividadEconomica.setText(actividadeconomicaBean.getdireccion());
			this.jInternalFrameDetalleFormActividadEconomica.jTextAreatelefonoActividadEconomica.setText(actividadeconomicaBean.gettelefono());
			this.jInternalFrameDetalleFormActividadEconomica.jTextFieldingreso_netoActividadEconomica.setText(actividadeconomicaBean.getingreso_neto().toString());
			this.jInternalFrameDetalleFormActividadEconomica.jTextFieldingreso_brutoActividadEconomica.setText(actividadeconomicaBean.getingreso_bruto().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanActividadEconomica(ActividadEconomicaParameterReturnGeneral actividadeconomicaReturnGeneral,ActividadEconomicaBean actividadeconomicaBean,Boolean conDefault) throws Exception { 
		try {
			ActividadEconomica actividadeconomicaLocal=new ActividadEconomica();
			
			actividadeconomicaLocal=actividadeconomicaReturnGeneral.getActividadEconomica();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && actividadeconomicaLocal.getId()!=null && !actividadeconomicaLocal.getId().equals(0L))) {actividadeconomicaBean.setId(actividadeconomicaLocal.getId());}}
			if(conDefault || (!conDefault && actividadeconomicaLocal.getid_cliente()!=null && !actividadeconomicaLocal.getid_cliente().equals(-1L))) {actividadeconomicaBean.setid_cliente(actividadeconomicaLocal.getid_cliente());}
			if(conDefault || (!conDefault && actividadeconomicaLocal.getnombre_negocio()!=null && !actividadeconomicaLocal.getnombre_negocio().equals(""))) {actividadeconomicaBean.setnombre_negocio(actividadeconomicaLocal.getnombre_negocio());}
			if(conDefault || (!conDefault && actividadeconomicaLocal.getactividad()!=null && !actividadeconomicaLocal.getactividad().equals(""))) {actividadeconomicaBean.setactividad(actividadeconomicaLocal.getactividad());}
			if(conDefault || (!conDefault && actividadeconomicaLocal.getid_pais()!=null && !actividadeconomicaLocal.getid_pais().equals(-1L))) {actividadeconomicaBean.setid_pais(actividadeconomicaLocal.getid_pais());}
			if(conDefault || (!conDefault && actividadeconomicaLocal.getid_ciudad()!=null && !actividadeconomicaLocal.getid_ciudad().equals(-1L))) {actividadeconomicaBean.setid_ciudad(actividadeconomicaLocal.getid_ciudad());}
			if(conDefault || (!conDefault && actividadeconomicaLocal.getdireccion()!=null && !actividadeconomicaLocal.getdireccion().equals(""))) {actividadeconomicaBean.setdireccion(actividadeconomicaLocal.getdireccion());}
			if(conDefault || (!conDefault && actividadeconomicaLocal.gettelefono()!=null && !actividadeconomicaLocal.gettelefono().equals(""))) {actividadeconomicaBean.settelefono(actividadeconomicaLocal.gettelefono());}
			if(conDefault || (!conDefault && actividadeconomicaLocal.getingreso_neto()!=null && !actividadeconomicaLocal.getingreso_neto().equals(0.0))) {actividadeconomicaBean.setingreso_neto(actividadeconomicaLocal.getingreso_neto());}
			if(conDefault || (!conDefault && actividadeconomicaLocal.getingreso_bruto()!=null && !actividadeconomicaLocal.getingreso_bruto().equals(0.0))) {actividadeconomicaBean.setingreso_bruto(actividadeconomicaLocal.getingreso_bruto());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxActividadEconomicaGenerico(Long idActividadEconomicaSeleccionado,JComboBox jComboBoxActividadEconomica,List<ActividadEconomica> actividadeconomicasLocal)throws Exception {
		try {
			ActividadEconomica  actividadeconomicaTemp=null;

			for(ActividadEconomica actividadeconomicaAux:actividadeconomicasLocal) {
				if(actividadeconomicaAux.getId()!=null && actividadeconomicaAux.getId().equals(idActividadEconomicaSeleccionado)) {
					actividadeconomicaTemp=actividadeconomicaAux;
					break;
				}
			}

			jComboBoxActividadEconomica.setSelectedItem(actividadeconomicaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxActividadEconomicaGenerico(JComboBox jComboBoxActividadEconomica,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxActividadEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxActividadEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxActividadEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxActividadEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxActividadEconomica.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxActividadEconomica.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxActividadEconomica.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxActividadEconomica.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxActividadEconomica.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxActividadEconomica.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			actividadeconomica=(ActividadEconomica) actividadeconomicaLogic.getActividadEconomicas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			actividadeconomica =(ActividadEconomica) actividadeconomicas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!actividadeconomica.getIsNew() && !actividadeconomica.getIsChanged() && !actividadeconomica.getIsDeleted()) {
				sDescripcion=actividadeconomica.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=actividadeconomica.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!actividadeconomica.getIsNew() && !actividadeconomica.getIsChanged() && !actividadeconomica.getIsDeleted()) {
				sDescripcion=actividadeconomica.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=actividadeconomica.getcliente_descripcion();
			}
		}

		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!actividadeconomica.getIsNew() && !actividadeconomica.getIsChanged() && !actividadeconomica.getIsDeleted()) {
				sDescripcion=actividadeconomica.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=actividadeconomica.getpais_descripcion();
			}
		}

		if(sTipo.equals("Ciudad")) {
			//sDescripcion=this.getActualCiudadForeignKeyDescripcion((Long)value);
			if(!actividadeconomica.getIsNew() && !actividadeconomica.getIsChanged() && !actividadeconomica.getIsDeleted()) {
				sDescripcion=actividadeconomica.getciudad_descripcion();
			} else {
				//sDescripcion=this.getActualCiudadForeignKeyDescripcion((Long)value);
				sDescripcion=actividadeconomica.getciudad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ActividadEconomica actividadeconomicaRow=new ActividadEconomica();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			actividadeconomicaRow=(ActividadEconomica) actividadeconomicaLogic.getActividadEconomicas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			actividadeconomicaRow=(ActividadEconomica) actividadeconomicas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualActividadEconomica(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoActividadEconomica.setVisible((this.isVisibilidadCeldaNuevoActividadEconomica && this.isPermisoNuevoActividadEconomica));			
			this.jButtonDuplicarActividadEconomica.setVisible((this.isVisibilidadCeldaDuplicarActividadEconomica && this.isPermisoDuplicarActividadEconomica));			
			this.jButtonCopiarActividadEconomica.setVisible((this.isVisibilidadCeldaCopiarActividadEconomica && this.isPermisoCopiarActividadEconomica));
			this.jButtonVerFormActividadEconomica.setVisible((this.isVisibilidadCeldaVerFormActividadEconomica && this.isPermisoVerFormActividadEconomica));
			
			this.jButtonAbrirOrderByActividadEconomica.setVisible((this.isVisibilidadCeldaOrdenActividadEconomica && this.isPermisoOrdenActividadEconomica));			
			
			this.jButtonNuevoRelacionesActividadEconomica.setVisible((this.isVisibilidadCeldaNuevoRelacionesActividadEconomica && this.isPermisoNuevoActividadEconomica));			
			this.jButtonNuevoGuardarCambiosActividadEconomica.setVisible((this.isVisibilidadCeldaNuevoActividadEconomica && this.isPermisoNuevoActividadEconomica && this.isPermisoGuardarCambiosActividadEconomica));
			
			if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
			this.jInternalFrameDetalleFormActividadEconomica.jButtonModificarActividadEconomica.setVisible((this.isVisibilidadCeldaModificarActividadEconomica && this.isPermisoActualizarActividadEconomica));	
			this.jInternalFrameDetalleFormActividadEconomica.jButtonActualizarActividadEconomica.setVisible((this.isVisibilidadCeldaActualizarActividadEconomica && this.isPermisoActualizarActividadEconomica));	
			this.jInternalFrameDetalleFormActividadEconomica.jButtonEliminarActividadEconomica.setVisible((this.isVisibilidadCeldaEliminarActividadEconomica && this.isPermisoEliminarActividadEconomica));
			this.jInternalFrameDetalleFormActividadEconomica.jButtonCancelarActividadEconomica.setVisible(this.isVisibilidadCeldaCancelarActividadEconomica);							
			this.jInternalFrameDetalleFormActividadEconomica.jButtonGuardarCambiosActividadEconomica.setVisible((this.isVisibilidadCeldaGuardarActividadEconomica && this.isPermisoGuardarCambiosActividadEconomica));			
			
			}
						
			this.jButtonGuardarCambiosTablaActividadEconomica.setVisible((this.isVisibilidadCeldaGuardarCambiosActividadEconomica && this.isPermisoGuardarCambiosActividadEconomica));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarActividadEconomica.setVisible((this.isVisibilidadCeldaNuevoActividadEconomica && this.isPermisoNuevoActividadEconomica));						
			this.jButtonDuplicarToolBarActividadEconomica.setVisible((this.isVisibilidadCeldaDuplicarActividadEconomica && this.isPermisoDuplicarActividadEconomica));						
			this.jButtonCopiarToolBarActividadEconomica.setVisible((this.isVisibilidadCeldaCopiarActividadEconomica && this.isPermisoCopiarActividadEconomica));			
			this.jButtonVerFormToolBarActividadEconomica.setVisible((this.isVisibilidadCeldaVerFormActividadEconomica && this.isPermisoVerFormActividadEconomica));			
			this.jButtonAbrirOrderByToolBarActividadEconomica.setVisible((this.isVisibilidadCeldaOrdenActividadEconomica && this.isPermisoOrdenActividadEconomica));
			this.jButtonNuevoRelacionesToolBarActividadEconomica.setVisible((this.isVisibilidadCeldaNuevoRelacionesActividadEconomica && this.isPermisoNuevoActividadEconomica));			
			this.jButtonNuevoGuardarCambiosToolBarActividadEconomica.setVisible((this.isVisibilidadCeldaNuevoActividadEconomica && this.isPermisoNuevoActividadEconomica && this.isPermisoGuardarCambiosActividadEconomica));			
			
			if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
			this.jInternalFrameDetalleFormActividadEconomica.jButtonModificarToolBarActividadEconomica.setVisible((this.isVisibilidadCeldaModificarActividadEconomica && this.isPermisoActualizarActividadEconomica));	
			this.jInternalFrameDetalleFormActividadEconomica.jButtonActualizarToolBarActividadEconomica.setVisible((this.isVisibilidadCeldaActualizarActividadEconomica  && this.isPermisoActualizarActividadEconomica));	
			this.jInternalFrameDetalleFormActividadEconomica.jButtonEliminarToolBarActividadEconomica.setVisible((this.isVisibilidadCeldaEliminarActividadEconomica && this.isPermisoEliminarActividadEconomica));
			this.jInternalFrameDetalleFormActividadEconomica.jButtonCancelarToolBarActividadEconomica.setVisible(this.isVisibilidadCeldaCancelarActividadEconomica);				
			this.jInternalFrameDetalleFormActividadEconomica.jButtonGuardarCambiosToolBarActividadEconomica.setVisible((this.isVisibilidadCeldaGuardarActividadEconomica && this.isPermisoGuardarCambiosActividadEconomica));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarActividadEconomica.setVisible((this.isVisibilidadCeldaGuardarCambiosActividadEconomica && this.isPermisoGuardarCambiosActividadEconomica));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoActividadEconomica.setVisible((this.isVisibilidadCeldaNuevoActividadEconomica && this.isPermisoNuevoActividadEconomica));			
			this.jMenuItemDuplicarActividadEconomica.setVisible((this.isVisibilidadCeldaDuplicarActividadEconomica && this.isPermisoDuplicarActividadEconomica));			
			this.jMenuItemCopiarActividadEconomica.setVisible((this.isVisibilidadCeldaCopiarActividadEconomica && this.isPermisoCopiarActividadEconomica));			
			this.jMenuItemVerFormActividadEconomica.setVisible((this.isVisibilidadCeldaVerFormActividadEconomica && this.isPermisoVerFormActividadEconomica));			
			this.jMenuItemAbrirOrderByActividadEconomica.setVisible((this.isVisibilidadCeldaOrdenActividadEconomica && this.isPermisoOrdenActividadEconomica));			
			//this.jMenuItemMostrarOcultarActividadEconomica.setVisible((this.isVisibilidadCeldaOrdenActividadEconomica && this.isPermisoOrdenActividadEconomica));
			this.jMenuItemDetalleAbrirOrderByActividadEconomica.setVisible((this.isVisibilidadCeldaOrdenActividadEconomica && this.isPermisoOrdenActividadEconomica));			
			//this.jMenuItemDetalleMostrarOcultarActividadEconomica.setVisible((this.isVisibilidadCeldaOrdenActividadEconomica && this.isPermisoOrdenActividadEconomica));			
			this.jMenuItemNuevoRelacionesActividadEconomica.setVisible((this.isVisibilidadCeldaNuevoRelacionesActividadEconomica && this.isPermisoNuevoActividadEconomica));			
			this.jMenuItemNuevoGuardarCambiosActividadEconomica.setVisible((this.isVisibilidadCeldaNuevoActividadEconomica && this.isPermisoNuevoActividadEconomica && this.isPermisoGuardarCambiosActividadEconomica));									
			
			if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
			this.jInternalFrameDetalleFormActividadEconomica.jMenuItemModificarActividadEconomica.setVisible((this.isVisibilidadCeldaModificarActividadEconomica && this.isPermisoActualizarActividadEconomica));	
			this.jInternalFrameDetalleFormActividadEconomica.jMenuItemActualizarActividadEconomica.setVisible((this.isVisibilidadCeldaActualizarActividadEconomica && this.isPermisoActualizarActividadEconomica));	
			this.jInternalFrameDetalleFormActividadEconomica.jMenuItemEliminarActividadEconomica.setVisible((this.isVisibilidadCeldaEliminarActividadEconomica && this.isPermisoEliminarActividadEconomica));
			this.jInternalFrameDetalleFormActividadEconomica.jMenuItemCancelarActividadEconomica.setVisible(this.isVisibilidadCeldaCancelarActividadEconomica);				
			}
			
			this.jMenuItemGuardarCambiosActividadEconomica.setVisible((this.isVisibilidadCeldaGuardarActividadEconomica && this.isPermisoGuardarCambiosActividadEconomica));						
			this.jMenuItemGuardarCambiosTablaActividadEconomica.setVisible((this.isVisibilidadCeldaGuardarCambiosActividadEconomica && this.isPermisoGuardarCambiosActividadEconomica));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoActividadEconomica=this.jButtonNuevoActividadEconomica.isVisible();
			this.isVisibilidadCeldaDuplicarActividadEconomica=this.jButtonDuplicarActividadEconomica.isVisible();
			this.isVisibilidadCeldaCopiarActividadEconomica=this.jButtonCopiarActividadEconomica.isVisible();
			this.isVisibilidadCeldaVerFormActividadEconomica=this.jButtonVerFormActividadEconomica.isVisible();
			
			this.isVisibilidadCeldaOrdenActividadEconomica=this.jButtonAbrirOrderByActividadEconomica.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesActividadEconomica=this.jButtonNuevoRelacionesActividadEconomica.isVisible();
			this.isVisibilidadCeldaModificarActividadEconomica=this.jButtonModificarActividadEconomica.isVisible();
			
			if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
			this.isVisibilidadCeldaActualizarActividadEconomica=this.jInternalFrameDetalleFormActividadEconomica.jButtonActualizarActividadEconomica.isVisible();
			this.isVisibilidadCeldaEliminarActividadEconomica=this.jInternalFrameDetalleFormActividadEconomica.jButtonEliminarActividadEconomica.isVisible();
			this.isVisibilidadCeldaCancelarActividadEconomica=this.jInternalFrameDetalleFormActividadEconomica.jButtonCancelarActividadEconomica.isVisible();
			this.isVisibilidadCeldaGuardarActividadEconomica=this.jInternalFrameDetalleFormActividadEconomica.jButtonGuardarCambiosActividadEconomica.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosActividadEconomica=this.jButtonGuardarCambiosTablaActividadEconomica.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoActividadEconomica=this.jButtonNuevoToolBarActividadEconomica.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesActividadEconomica=this.jButtonNuevoRelacionesToolBarActividadEconomica.isVisible();
			
			if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
			this.isVisibilidadCeldaModificarActividadEconomica=this.jInternalFrameDetalleFormActividadEconomica.jButtonModificarToolBarActividadEconomica.isVisible();
			this.isVisibilidadCeldaActualizarActividadEconomica=this.jInternalFrameDetalleFormActividadEconomica.jButtonActualizarToolBarActividadEconomica.isVisible();
			this.isVisibilidadCeldaEliminarActividadEconomica=this.jInternalFrameDetalleFormActividadEconomica.jButtonEliminarToolBarActividadEconomica.isVisible();
			this.isVisibilidadCeldaCancelarActividadEconomica=this.jInternalFrameDetalleFormActividadEconomica.jButtonCancelarToolBarActividadEconomica.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarActividadEconomica=this.jButtonGuardarCambiosToolBarActividadEconomica.isVisible();
			this.isVisibilidadCeldaGuardarCambiosActividadEconomica=this.jButtonGuardarCambiosTablaToolBarActividadEconomica.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoActividadEconomica=this.jMenuItemNuevoActividadEconomica.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesActividadEconomica=this.jMenuItemNuevoRelacionesActividadEconomica.isVisible();
			
			if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
			this.isVisibilidadCeldaModificarActividadEconomica=this.jInternalFrameDetalleFormActividadEconomica.jMenuItemModificarActividadEconomica.isVisible();
			this.isVisibilidadCeldaActualizarActividadEconomica=this.jInternalFrameDetalleFormActividadEconomica.jMenuItemActualizarActividadEconomica.isVisible();
			this.isVisibilidadCeldaEliminarActividadEconomica=this.jInternalFrameDetalleFormActividadEconomica.jMenuItemEliminarActividadEconomica.isVisible();
			this.isVisibilidadCeldaCancelarActividadEconomica=this.jInternalFrameDetalleFormActividadEconomica.jMenuItemCancelarActividadEconomica.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarActividadEconomica=this.jMenuItemGuardarCambiosActividadEconomica.isVisible();
			this.isVisibilidadCeldaGuardarCambiosActividadEconomica=this.jMenuItemGuardarCambiosTablaActividadEconomica.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesActividadEconomica(Boolean esInicializar) {
		if(ActividadEconomicaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.actividadeconomicaSessionBean.getConGuardarRelaciones()) {
				//if(this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesActividadEconomica();
			}
			
			this.inicializarActualizarBindingBotonesManualActividadEconomica(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualActividadEconomica() {
		this.jButtonNuevoActividadEconomica.setVisible(this.isPermisoNuevoActividadEconomica);			
		this.jButtonDuplicarActividadEconomica.setVisible(this.isPermisoDuplicarActividadEconomica);			
		this.jButtonCopiarActividadEconomica.setVisible(this.isPermisoCopiarActividadEconomica);			
		this.jButtonVerFormActividadEconomica.setVisible(this.isPermisoVerFormActividadEconomica);			
		
		this.jButtonAbrirOrderByActividadEconomica.setVisible(this.isPermisoOrdenActividadEconomica);					
		
		this.jButtonNuevoRelacionesActividadEconomica.setVisible(this.isPermisoNuevoActividadEconomica);			
		
		if(this.jInternalFrameDetalleFormActividadEconomica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActividadEconomica.jButtonModificarActividadEconomica.setVisible(this.isPermisoActualizarActividadEconomica);	
			this.jInternalFrameDetalleFormActividadEconomica.jButtonActualizarActividadEconomica.setVisible(this.isPermisoActualizarActividadEconomica);	
			this.jInternalFrameDetalleFormActividadEconomica.jButtonEliminarActividadEconomica.setVisible(this.isPermisoEliminarActividadEconomica);
			this.jInternalFrameDetalleFormActividadEconomica.jButtonCancelarActividadEconomica.setVisible(this.isVisibilidadCeldaCancelarActividadEconomica);						
			this.jInternalFrameDetalleFormActividadEconomica.jButtonGuardarCambiosActividadEconomica.setVisible(this.isPermisoGuardarCambiosActividadEconomica);							
		}
		
		this.jButtonGuardarCambiosTablaActividadEconomica.setVisible(this.isPermisoActualizarActividadEconomica);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleActividadEconomica() {
		this.jInternalFrameDetalleFormActividadEconomica.jButtonModificarActividadEconomica.setVisible(this.isPermisoActualizarActividadEconomica);	
		this.jInternalFrameDetalleFormActividadEconomica.jButtonActualizarActividadEconomica.setVisible(this.isPermisoActualizarActividadEconomica);	
		this.jInternalFrameDetalleFormActividadEconomica.jButtonEliminarActividadEconomica.setVisible(this.isPermisoEliminarActividadEconomica);
		this.jInternalFrameDetalleFormActividadEconomica.jButtonCancelarActividadEconomica.setVisible(this.isVisibilidadCeldaCancelarActividadEconomica);							
		this.jInternalFrameDetalleFormActividadEconomica.jButtonGuardarCambiosActividadEconomica.setVisible((this.isVisibilidadCeldaGuardarActividadEconomica && this.isPermisoGuardarCambiosActividadEconomica));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosActividadEconomica() {
		if(ActividadEconomicaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualActividadEconomica();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesActividadEconomica() {
	}
	
	public void jTableDatosActividadEconomicaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarActividadEconomica(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidActividadEconomicaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActividadEconomica(this.getactividadeconomica(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.actividadeconomica =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.actividadeconomica =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.actividadeconomica==null) {
						this.actividadeconomica = new ActividadEconomica();
					}

					this.setVariablesFormularioToObjetoActualActividadEconomica(this.actividadeconomica,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);
				}

				if(this.actividadeconomica.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.actividadeconomica.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActividadEconomica(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaActividadEconomicaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebActividadEconomica(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosActividadEconomica.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosActividadEconomica.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomica =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.actividadeconomica =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualActividadEconomica(this.getactividadeconomica(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.actividadeconomicaLogic.getConnexion());

				if(this.actividadeconomica.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.actividadeconomica.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderActividadEconomica=(TitledBorder)this.jScrollPanelDatosActividadEconomica.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderActividadEconomica.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaActividadEconomicaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActividadEconomica(this.getactividadeconomica(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.actividadeconomica =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.actividadeconomica =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.actividadeconomica==null) {
						this.actividadeconomica = new ActividadEconomica();
					}

					this.setVariablesFormularioToObjetoActualActividadEconomica(this.actividadeconomica,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);
				}

				if(this.actividadeconomica.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.actividadeconomica.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActividadEconomica(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteActividadEconomicaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderActividadEconomica=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosActividadEconomica.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderActividadEconomica=(TitledBorder)this.jScrollPanelDatosActividadEconomica.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderActividadEconomica.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteActividadEconomicaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebActividadEconomica(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosActividadEconomica.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosActividadEconomica.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomica =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.actividadeconomica =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualActividadEconomica(this.getactividadeconomica(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.actividadeconomicaLogic.getConnexion());

				if(this.actividadeconomica.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.actividadeconomica.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderActividadEconomica=(TitledBorder)this.jScrollPanelDatosActividadEconomica.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderActividadEconomica.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteActividadEconomicaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActividadEconomica(this.getactividadeconomica(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.actividadeconomica =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.actividadeconomica =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.actividadeconomica==null) {
						this.actividadeconomica = new ActividadEconomica();
					}

					this.setVariablesFormularioToObjetoActualActividadEconomica(this.actividadeconomica,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);
				}

				if(this.actividadeconomica.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.actividadeconomica.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActividadEconomica(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_negocioActividadEconomicaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActividadEconomica(this.getactividadeconomica(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.actividadeconomica =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.actividadeconomica =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.actividadeconomica==null) {
						this.actividadeconomica = new ActividadEconomica();
					}

					this.setVariablesFormularioToObjetoActualActividadEconomica(this.actividadeconomica,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);
				}

				if(this.actividadeconomica.getnombre_negocio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_negocio like '%"+this.actividadeconomica.getnombre_negocio()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActividadEconomica(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonactividadActividadEconomicaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActividadEconomica(this.getactividadeconomica(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.actividadeconomica =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.actividadeconomica =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.actividadeconomica==null) {
						this.actividadeconomica = new ActividadEconomica();
					}

					this.setVariablesFormularioToObjetoActualActividadEconomica(this.actividadeconomica,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);
				}

				if(this.actividadeconomica.getactividad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where actividad like '%"+this.actividadeconomica.getactividad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActividadEconomica(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisActividadEconomicaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebActividadEconomica(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosActividadEconomica.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosActividadEconomica.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomica =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.actividadeconomica =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualActividadEconomica(this.getactividadeconomica(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.actividadeconomicaLogic.getConnexion());

				if(this.actividadeconomica.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.actividadeconomica.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderActividadEconomica=(TitledBorder)this.jScrollPanelDatosActividadEconomica.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderActividadEconomica.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisActividadEconomicaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActividadEconomica(this.getactividadeconomica(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.actividadeconomica =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.actividadeconomica =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.actividadeconomica==null) {
						this.actividadeconomica = new ActividadEconomica();
					}

					this.setVariablesFormularioToObjetoActualActividadEconomica(this.actividadeconomica,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);
				}

				if(this.actividadeconomica.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.actividadeconomica.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActividadEconomica(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ciudadActividadEconomicaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisociudad=true;

			idTienePermisociudad=this.tienePermisosUsuarioEnPaginaWebActividadEconomica(CiudadConstantesFunciones.CLASSNAME);

			if(idTienePermisociudad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosActividadEconomica.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosActividadEconomica.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomica =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.actividadeconomica =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualActividadEconomica(this.getactividadeconomica(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);

				this.ciudadBeanSwingJInternalFrame=new CiudadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ciudadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ciudadBeanSwingJInternalFrame.getCiudadLogic().setConnexion(this.actividadeconomicaLogic.getConnexion());

				if(this.actividadeconomica.getid_ciudad()!=null) {
					this.ciudadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ciudadBeanSwingJInternalFrame.setIdActual(this.actividadeconomica.getid_ciudad());
					this.ciudadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.inicializarActualizarBindingTablaCiudad();
				}

				JInternalFrameBase jinternalFrame =this.ciudadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderActividadEconomica=(TitledBorder)this.jScrollPanelDatosActividadEconomica.getBorder();
				TitledBorder titledBorderciudad=(TitledBorder)this.ciudadBeanSwingJInternalFrame.jScrollPanelDatosCiudad.getBorder();

				titledBorderciudad.setTitle(titledBorderActividadEconomica.getTitle() + " -> Ciudad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ciudadActividadEconomicaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActividadEconomica(this.getactividadeconomica(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.actividadeconomica =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.actividadeconomica =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.actividadeconomica==null) {
						this.actividadeconomica = new ActividadEconomica();
					}

					this.setVariablesFormularioToObjetoActualActividadEconomica(this.actividadeconomica,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);
				}

				if(this.actividadeconomica.getid_ciudad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ciudad = "+this.actividadeconomica.getid_ciudad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActividadEconomica(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccionActividadEconomicaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActividadEconomica(this.getactividadeconomica(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.actividadeconomica =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.actividadeconomica =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.actividadeconomica==null) {
						this.actividadeconomica = new ActividadEconomica();
					}

					this.setVariablesFormularioToObjetoActualActividadEconomica(this.actividadeconomica,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);
				}

				if(this.actividadeconomica.getdireccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion like '%"+this.actividadeconomica.getdireccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActividadEconomica(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefonoActividadEconomicaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActividadEconomica(this.getactividadeconomica(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.actividadeconomica =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.actividadeconomica =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.actividadeconomica==null) {
						this.actividadeconomica = new ActividadEconomica();
					}

					this.setVariablesFormularioToObjetoActualActividadEconomica(this.actividadeconomica,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);
				}

				if(this.actividadeconomica.gettelefono()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono like '%"+this.actividadeconomica.gettelefono()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActividadEconomica(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoningreso_netoActividadEconomicaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActividadEconomica(this.getactividadeconomica(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.actividadeconomica =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.actividadeconomica =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.actividadeconomica==null) {
						this.actividadeconomica = new ActividadEconomica();
					}

					this.setVariablesFormularioToObjetoActualActividadEconomica(this.actividadeconomica,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);
				}

				if(this.actividadeconomica.getingreso_neto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ingreso_neto = "+this.actividadeconomica.getingreso_neto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActividadEconomica(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoningreso_brutoActividadEconomicaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActividadEconomica(this.getactividadeconomica(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.actividadeconomica =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.actividadeconomica =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.actividadeconomica==null) {
						this.actividadeconomica = new ActividadEconomica();
					}

					this.setVariablesFormularioToObjetoActualActividadEconomica(this.actividadeconomica,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);
				}

				if(this.actividadeconomica.getingreso_bruto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ingreso_bruto = "+this.actividadeconomica.getingreso_bruto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActividadEconomica(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCiudadActividadEconomicaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingActividadEconomica(false,false);

			this.getActividadEconomicasFK_IdCiudad();

			this.inicializarActualizarBindingActividadEconomica(false);

			//if(ActividadEconomicaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingActividadEconomica(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteActividadEconomicaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingActividadEconomica(false,false);

			this.getActividadEconomicasFK_IdCliente();

			this.inicializarActualizarBindingActividadEconomica(false);

			//if(ActividadEconomicaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingActividadEconomica(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaActividadEconomicaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingActividadEconomica(false,false);

			this.getActividadEconomicasFK_IdEmpresa();

			this.inicializarActualizarBindingActividadEconomica(false);

			//if(ActividadEconomicaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingActividadEconomica(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPaisActividadEconomicaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingActividadEconomica(false,false);

			this.getActividadEconomicasFK_IdPais();

			this.inicializarActualizarBindingActividadEconomica(false);

			//if(ActividadEconomicaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingActividadEconomica(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.actividadeconomicaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameActividadEconomica() {
		if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
			this.jInternalFrameDetalleFormActividadEconomica.setVisible(false);	    			
			this.jInternalFrameDetalleFormActividadEconomica.dispose();
			this.jInternalFrameDetalleFormActividadEconomica=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoActividadEconomica!=null) {
			this.jInternalFrameReporteDinamicoActividadEconomica.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoActividadEconomica.dispose();
			this.jInternalFrameReporteDinamicoActividadEconomica=null;
		}
		
		if(this.jInternalFrameImportacionActividadEconomica!=null) {
			this.jInternalFrameImportacionActividadEconomica.setVisible(false);	    			
			this.jInternalFrameImportacionActividadEconomica.dispose();
			this.jInternalFrameImportacionActividadEconomica=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessActividadEconomica();
			
			ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
			
			
			if(sTipo.equals("NuevoActividadEconomica")) {
				jButtonNuevoActividadEconomicaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarActividadEconomica")) {
				jButtonDuplicarActividadEconomicaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarActividadEconomica")) {
				jButtonCopiarActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("VerFormActividadEconomica")) {
				jButtonVerFormActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarActividadEconomica")) {
				jButtonNuevoActividadEconomicaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarActividadEconomica")) {
				jButtonDuplicarActividadEconomicaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoActividadEconomica")) {
				jButtonNuevoActividadEconomicaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarActividadEconomica")) {
				jButtonDuplicarActividadEconomicaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesActividadEconomica")) {
				jButtonNuevoActividadEconomicaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarActividadEconomica")) {
				jButtonNuevoActividadEconomicaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesActividadEconomica")) {
				jButtonNuevoActividadEconomicaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarActividadEconomica")) {
				jButtonModificarActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarActividadEconomica")) {
				jButtonModificarActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarActividadEconomica")) {
				jButtonModificarActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarActividadEconomica")) {
				jButtonActualizarActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarActividadEconomica")) {
				jButtonActualizarActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarActividadEconomica")) {
				jButtonActualizarActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("EliminarActividadEconomica")) {
				jButtonEliminarActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarActividadEconomica")) {
				jButtonEliminarActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarActividadEconomica")) {
				jButtonEliminarActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("CancelarActividadEconomica")) {
				jButtonCancelarActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarActividadEconomica")) {
				jButtonCancelarActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarActividadEconomica")) {
				jButtonCancelarActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("CerrarActividadEconomica")) {
				jButtonCerrarActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarActividadEconomica")) {
				jButtonCerrarActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarActividadEconomica")) {
				jButtonCerrarActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarActividadEconomica")) {
				jButtonMostrarOcultarActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarActividadEconomica")) {
				jButtonCancelarActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosActividadEconomica")) {
				jButtonGuardarCambiosActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarActividadEconomica")) {
				jButtonGuardarCambiosActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarActividadEconomica")) {
				jButtonCopiarActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarActividadEconomica")) {
				jButtonVerFormActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosActividadEconomica")) {
				jButtonGuardarCambiosActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarActividadEconomica")) {
				jButtonCopiarActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormActividadEconomica")) {
				jButtonVerFormActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaActividadEconomica")) {
				jButtonGuardarCambiosActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarActividadEconomica")) {
				jButtonGuardarCambiosActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaActividadEconomica")) {
				jButtonGuardarCambiosActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionActividadEconomica")) {
				jButtonRecargarInformacionActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarActividadEconomica")) {
				jButtonRecargarInformacionActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionActividadEconomica")) {
				jButtonRecargarInformacionActividadEconomicaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresActividadEconomica")) {
				jButtonAnterioresActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarActividadEconomica")) {
				jButtonAnterioresActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreActividadEconomica")) {
				jButtonAnterioresActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesActividadEconomica")) {
				jButtonSiguientesActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarActividadEconomica")) {
				jButtonSiguientesActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesActividadEconomica")) {
				jButtonSiguientesActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByActividadEconomica") || sTipo.equals("MenuItemDetalleAbrirOrderByActividadEconomica")) {
				jButtonAbrirOrderByActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarActividadEconomica") || sTipo.equals("MenuItemDetalleMostrarOcultarActividadEconomica")) {
				jButtonMostrarOcultarActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosActividadEconomica")) {
				jButtonNuevoGuardarCambiosActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarActividadEconomica")) {
				jButtonNuevoGuardarCambiosActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosActividadEconomica")) {
				jButtonNuevoGuardarCambiosActividadEconomicaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoActividadEconomica")) {
				jButtonCerrarReporteDinamicoActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoActividadEconomica")) {
				jButtonGenerarReporteDinamicoActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoActividadEconomica")) {
				
				jButtonGenerarExcelReporteDinamicoActividadEconomicaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionActividadEconomica")) {
				jButtonCerrarImportacionActividadEconomicaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionActividadEconomica")) {
				
				jButtonGenerarImportacionActividadEconomicaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionActividadEconomica")) {
				
				jButtonAbrirImportacionActividadEconomicaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesActividadEconomica")) {
				jComboBoxTiposAccionesActividadEconomicaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesActividadEconomica")) {
				jComboBoxTiposRelacionesActividadEconomicaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioActividadEconomica")) {
				jComboBoxTiposAccionesActividadEconomicaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarActividadEconomica")) {
				
				jComboBoxTiposSeleccionarActividadEconomicaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralActividadEconomica")) {
				jTextFieldValorCampoGeneralActividadEconomicaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByActividadEconomica")) {
				jButtonAbrirOrderByActividadEconomicaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarActividadEconomica")) {
				jButtonAbrirOrderByActividadEconomicaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByActividadEconomica")) {
				jButtonCerrarOrderByActividadEconomicaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idActividadEconomicaBusqueda")) {
				this.jButtonidActividadEconomicaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaActividadEconomicaUpdate")) {
				this.jButtonid_empresaActividadEconomicaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaActividadEconomicaBusqueda")) {
				this.jButtonid_empresaActividadEconomicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteActividadEconomica")) {
				this.jButtonid_clienteActividadEconomicaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteActividadEconomicaUpdate")) {
				this.jButtonid_clienteActividadEconomicaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteActividadEconomicaBusqueda")) {
				this.jButtonid_clienteActividadEconomicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_negocioActividadEconomicaBusqueda")) {
				this.jButtonnombre_negocioActividadEconomicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("actividadActividadEconomicaBusqueda")) {
				this.jButtonactividadActividadEconomicaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisActividadEconomicaUpdate")) {
				this.jButtonid_paisActividadEconomicaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisActividadEconomicaBusqueda")) {
				this.jButtonid_paisActividadEconomicaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadActividadEconomicaUpdate")) {
				this.jButtonid_ciudadActividadEconomicaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadActividadEconomicaBusqueda")) {
				this.jButtonid_ciudadActividadEconomicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionActividadEconomicaBusqueda")) {
				this.jButtondireccionActividadEconomicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoActividadEconomicaBusqueda")) {
				this.jButtontelefonoActividadEconomicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ingreso_netoActividadEconomicaBusqueda")) {
				this.jButtoningreso_netoActividadEconomicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ingreso_brutoActividadEconomicaBusqueda")) {
				this.jButtoningreso_brutoActividadEconomicaBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteActividadEconomica")) {
				this.jButtonid_clienteActividadEconomicaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdCiudadActividadEconomica")) {
				this.jButtonFK_IdCiudadActividadEconomicaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdClienteActividadEconomica")) {
				this.jButtonFK_IdClienteActividadEconomicaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPaisActividadEconomica")) {
				this.jButtonFK_IdPaisActividadEconomicaActionPerformed(evt);
			}
			
			;
			
			
			ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessActividadEconomica();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActividadEconomicaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.actividadeconomica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.actividadeconomica);
				
				ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
				
				


				
				ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActividadEconomica.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActividadEconomica.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ActividadEconomica actividadeconomicaLocal=null;
			
			if(!this.getEsControlTabla()) {
				actividadeconomicaLocal=this.actividadeconomica;
			} else {
				actividadeconomicaLocal=this.actividadeconomicaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.actividadeconomica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.actividadeconomica);
				
				ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
							
				
				


				
				ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActividadEconomica.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActividadEconomica.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActividadEconomicaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaAnterior =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.actividadeconomicaAnterior =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
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
			
			ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
			
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
			
			


			
			ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActividadEconomicaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.actividadeconomica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.actividadeconomica);
				
				ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
								
						
				


				
				ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActividadEconomica.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActividadEconomica.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.actividadeconomica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.actividadeconomica);
				
				ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
								
				
				


				
				ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActividadEconomica.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActividadEconomica.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActividadEconomicaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaAnterior =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.actividadeconomicaAnterior =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.actividadeconomica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.actividadeconomica);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActividadEconomicaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaAnterior =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.actividadeconomicaAnterior =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActividadEconomicaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.actividadeconomica);
			
			this.actualizarInformacion("INFO_PADRE",false,this.actividadeconomica);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.actividadeconomica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.actividadeconomica);
				
				ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
							
				
				


				
				ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActividadEconomica.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActividadEconomica.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActividadEconomicaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.actividadeconomicaAnterior =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.actividadeconomicaAnterior =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
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
			
			ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
			
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
			
			


			
			ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActividadEconomicaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.actividadeconomica);
			
			this.actualizarInformacion("INFO_PADRE",false,this.actividadeconomica);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.actividadeconomica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.actividadeconomica);
				
				ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
								
				
				


				
				ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActividadEconomica.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActividadEconomica.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActividadEconomicaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaAnterior =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.actividadeconomicaAnterior =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActividadEconomicaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.actividadeconomica);
			
			this.actualizarInformacion("INFO_PADRE",false,this.actividadeconomica);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActividadEconomicaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.actividadeconomica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.actividadeconomica);
				
				ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosActividadEconomica")) {
					jCheckBoxSeleccionarTodosActividadEconomicaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosActividadEconomica")) {
					jCheckBoxSeleccionadosActividadEconomicaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarActividadEconomica")) {
					
				}
				
				


				
				
				ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActividadEconomica.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActividadEconomica.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.actividadeconomica);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.actividadeconomica);
				
				ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
												
				
				


				
				
				ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActividadEconomica.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActividadEconomica.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActividadEconomicaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.actividadeconomicaAnterior =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.actividadeconomicaAnterior =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActividadEconomicaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.actividadeconomica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.actividadeconomica);
				
				ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
				
				
				ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
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
			
			ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
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
			
			


			
			ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActividadEconomicaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.actividadeconomica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.actividadeconomica);
				
				ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActividadEconomica.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActividadEconomica.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.actividadeconomica);
				
				this.actualizarInformacion("INFO_PADRE",false,this.actividadeconomica);
				
				ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
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
				
				


				
				ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActividadEconomica.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActividadEconomica.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActividadEconomicaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.actividadeconomicaAnterior =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.actividadeconomicaAnterior =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarActividadEconomica")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosActividadEconomicaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosActividadEconomica.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.actividadeconomica =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.actividadeconomica =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.actividadeconomica);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarActividadEconomica")) {
				
				}
				
				ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarActividadEconomica")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosActividadEconomica.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarActividadEconomica")) {
			
			}
			
			ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessActividadEconomica();
			
			ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
			
			if(sTipo.equals("NuevoActividadEconomica")) {
				jButtonNuevoActividadEconomicaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarActividadEconomica")) {
				jButtonDuplicarActividadEconomicaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarActividadEconomica")) {
				jButtonCopiarActividadEconomicaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormActividadEconomica")) {
				jButtonVerFormActividadEconomicaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesActividadEconomica")) {
				jButtonNuevoActividadEconomicaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarActividadEconomica")) {
				jButtonModificarActividadEconomicaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarActividadEconomica")) {
				jButtonActualizarActividadEconomicaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarActividadEconomica")) {
				jButtonEliminarActividadEconomicaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaActividadEconomica")) {
				jButtonGuardarCambiosActividadEconomicaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarActividadEconomica")) {
				jButtonCancelarActividadEconomicaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarActividadEconomica")) {
				jButtonCerrarActividadEconomicaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosActividadEconomica")) {
				jButtonGuardarCambiosActividadEconomicaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosActividadEconomica")) {
				jButtonNuevoGuardarCambiosActividadEconomicaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByActividadEconomica")) {
				jButtonAbrirOrderByActividadEconomicaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionActividadEconomica")) {
				jButtonRecargarInformacionActividadEconomicaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresActividadEconomica")) {
				jButtonAnterioresActividadEconomicaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesActividadEconomica")) {
				jButtonSiguientesActividadEconomicaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idActividadEconomicaBusqueda")) {
				this.jButtonidActividadEconomicaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaActividadEconomicaUpdate")) {
				this.jButtonid_empresaActividadEconomicaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaActividadEconomicaBusqueda")) {
				this.jButtonid_empresaActividadEconomicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteActividadEconomica")) {
				this.jButtonid_clienteActividadEconomicaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteActividadEconomicaUpdate")) {
				this.jButtonid_clienteActividadEconomicaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteActividadEconomicaBusqueda")) {
				this.jButtonid_clienteActividadEconomicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_negocioActividadEconomicaBusqueda")) {
				this.jButtonnombre_negocioActividadEconomicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("actividadActividadEconomicaBusqueda")) {
				this.jButtonactividadActividadEconomicaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisActividadEconomicaUpdate")) {
				this.jButtonid_paisActividadEconomicaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisActividadEconomicaBusqueda")) {
				this.jButtonid_paisActividadEconomicaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadActividadEconomicaUpdate")) {
				this.jButtonid_ciudadActividadEconomicaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadActividadEconomicaBusqueda")) {
				this.jButtonid_ciudadActividadEconomicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionActividadEconomicaBusqueda")) {
				this.jButtondireccionActividadEconomicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoActividadEconomicaBusqueda")) {
				this.jButtontelefonoActividadEconomicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ingreso_netoActividadEconomicaBusqueda")) {
				this.jButtoningreso_netoActividadEconomicaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ingreso_brutoActividadEconomicaBusqueda")) {
				this.jButtoningreso_brutoActividadEconomicaBusquedaActionPerformed(evt);
			}
			
			ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessActividadEconomica();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameActividadEconomica")) {
				closingInternalFrameActividadEconomica();
				
			} else if(sTipo.equals("jButtonCancelarActividadEconomica")) {
				JInternalFrameBase jInternalFrameDetalleFormActividadEconomica = (JInternalFrameBase)evt.getSource();
	            	
	            ActividadEconomicaBeanSwingJInternalFrame jInternalFrameParent=(ActividadEconomicaBeanSwingJInternalFrame)jInternalFrameDetalleFormActividadEconomica.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarActividadEconomicaActionPerformed(null);
			}
			
			ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.actividadeconomica,new Object(),this.actividadeconomicaParameterGeneral,this.actividadeconomicaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormActividadEconomica(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormActividadEconomica(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormActividadEconomica(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.actividadeconomica)) {
			if(!esControlTabla) {
				if(ActividadEconomicaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualActividadEconomica(this.actividadeconomica,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);			
				}
				
				if(this.actividadeconomicaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualActividadEconomica(this.actividadeconomica,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.actividadeconomicaReturnGeneral=actividadeconomicaLogic.procesarEventosActividadEconomicasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.actividadeconomicaLogic.getActividadEconomicas(),this.actividadeconomica,this.actividadeconomicaParameterGeneral,this.isEsNuevoActividadEconomica,classes);//this.actividadeconomicaLogic.getActividadEconomica()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanActividadEconomica(this.actividadeconomicaReturnGeneral,this.actividadeconomicaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.actividadeconomicaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanActividadEconomica(classes,this.actividadeconomicaReturnGeneral,this.actividadeconomicaBean,false);
					}
						
					if(this.actividadeconomicaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyActividadEconomica(this.actividadeconomicaReturnGeneral.getActividadEconomica());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioActividadEconomica(this.actividadeconomicaReturnGeneral.getActividadEconomica());	
					}
						
					if(this.actividadeconomicaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioActividadEconomica(this.actividadeconomicaReturnGeneral.getActividadEconomica(),classes);//this.actividadeconomicaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioActividadEconomica(this.actividadeconomica,classes);//this.actividadeconomicaBean);									
				}
			
				if(ActividadEconomicaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualActividadEconomica(this.actividadeconomica,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysActividadEconomica(this.actividadeconomica);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.actividadeconomicaAnterior!=null) {
						this.actividadeconomica=this.actividadeconomicaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.actividadeconomicaReturnGeneral=actividadeconomicaLogic.procesarEventosActividadEconomicasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.actividadeconomicaLogic.getActividadEconomicas(),this.actividadeconomica,this.actividadeconomicaParameterGeneral,this.isEsNuevoActividadEconomica,classes);//this.actividadeconomicaLogic.getActividadEconomica()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.actividadeconomicaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.actividadeconomicaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.actividadeconomicaReturnGeneral.getActividadEconomica(),actividadeconomicaLogic.getActividadEconomicas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.actividadeconomicaReturnGeneral.getActividadEconomica(),this.actividadeconomicas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosActividadEconomica.repaint();
				
				//((AbstractTableModel) this.jTableDatosActividadEconomica.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosActividadEconomica();
			}
		}
	}
	
	public void actualizarVisualTableDatosActividadEconomica() throws Exception {
		
		ActividadEconomicaModel actividadeconomicaModel=(ActividadEconomicaModel)this.jTableDatosActividadEconomica.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			actividadeconomicaModel.actividadeconomicas=this.actividadeconomicaLogic.getActividadEconomicas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			actividadeconomicaModel.actividadeconomicas=this.actividadeconomicas;
		}
		
		
		((ActividadEconomicaModel) this.jTableDatosActividadEconomica.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaActividadEconomica() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getactividadeconomicaAnterior(),this.actividadeconomicaLogic.getActividadEconomicas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getactividadeconomicaAnterior(),this.actividadeconomicas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosActividadEconomica();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioActividadEconomica(ActividadEconomica actividadeconomica,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
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
										
				ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.actividadeconomica,new Object(),generalEntityParameterGeneral,this.actividadeconomicaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.actividadeconomicaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ActividadEconomicaConstantesFunciones.getClassesRelationshipsOfActividadEconomica(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ActividadEconomicaConstantesFunciones.getClassesRelationshipsFromStringsOfActividadEconomica(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormActividadEconomica(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ActividadEconomicaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.actividadeconomica,new Object(),generalEntityParameterGeneral,this.actividadeconomicaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioActividadEconomica(ActividadEconomicaBean actividadeconomicaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanActividadEconomica(ArrayList<Classe> classes,ActividadEconomicaReturnGeneral actividadeconomicaReturnGeneral,ActividadEconomicaBean actividadeconomicaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualActividadEconomica(ActividadEconomica actividadeconomica,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.actividadeconomica)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormActividadEconomica = new ActividadEconomicaDetalleFormJInternalFrame(jDesktopPane,this.actividadeconomicaSessionBean.getConGuardarRelaciones(),this.actividadeconomicaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormActividadEconomica);
		this.jInternalFrameDetalleFormActividadEconomica.setVisible(false);
		this.jInternalFrameDetalleFormActividadEconomica.setSelected(false);						
		
		this.jInternalFrameDetalleFormActividadEconomica.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormActividadEconomica.actividadeconomicaLogic=this.actividadeconomicaLogic;
		
		this.cargarCombosFrameForeignKeyActividadEconomica("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleActividadEconomica();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleActividadEconomica();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyActividadEconomica("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyActividadEconomica();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormActividadEconomica.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarActividadEconomica"));
		
		this.jInternalFrameDetalleFormActividadEconomica.jButtonModificarActividadEconomica.addActionListener(new ButtonActionListener(this,"ModificarActividadEconomica"));

		
		this.jInternalFrameDetalleFormActividadEconomica.jButtonModificarToolBarActividadEconomica.addActionListener(new ButtonActionListener(this,"ModificarToolBarActividadEconomica"));
					
		this.jInternalFrameDetalleFormActividadEconomica.jMenuItemModificarActividadEconomica.addActionListener(new ButtonActionListener(this,"MenuItemModificarActividadEconomica"));		
		
		
		
		this.jInternalFrameDetalleFormActividadEconomica.jButtonActualizarActividadEconomica.addActionListener (new ButtonActionListener(this,"ActualizarActividadEconomica"));
		
		
		this.jInternalFrameDetalleFormActividadEconomica.jButtonActualizarToolBarActividadEconomica.addActionListener(new ButtonActionListener(this,"ActualizarToolBarActividadEconomica"));
						
		this.jInternalFrameDetalleFormActividadEconomica.jMenuItemActualizarActividadEconomica.addActionListener (new ButtonActionListener(this,"MenuItemActualizarActividadEconomica"));		
		
		
		
		this.jInternalFrameDetalleFormActividadEconomica.jButtonEliminarActividadEconomica.addActionListener (new ButtonActionListener(this,"EliminarActividadEconomica"));
		
		
		this.jInternalFrameDetalleFormActividadEconomica.jButtonEliminarToolBarActividadEconomica.addActionListener (new ButtonActionListener(this,"EliminarToolBarActividadEconomica"));
								
		this.jInternalFrameDetalleFormActividadEconomica.jMenuItemEliminarActividadEconomica.addActionListener (new ButtonActionListener(this,"MenuItemEliminarActividadEconomica"));		
		
		
		
		this.jInternalFrameDetalleFormActividadEconomica.jButtonCancelarActividadEconomica.addActionListener (new ButtonActionListener(this,"CancelarActividadEconomica"));
		
		
		this.jInternalFrameDetalleFormActividadEconomica.jButtonCancelarToolBarActividadEconomica.addActionListener (new ButtonActionListener(this,"CancelarToolBarActividadEconomica"));
					
		this.jInternalFrameDetalleFormActividadEconomica.jMenuItemCancelarActividadEconomica.addActionListener (new ButtonActionListener(this,"MenuItemCancelarActividadEconomica"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormActividadEconomica.jMenuItemDetalleCerrarActividadEconomica.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarActividadEconomica"));		
		
		
		
		this.jInternalFrameDetalleFormActividadEconomica.jButtonGuardarCambiosToolBarActividadEconomica.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarActividadEconomica"));
		
		
		
		this.jInternalFrameDetalleFormActividadEconomica.jButtonGuardarCambiosToolBarActividadEconomica.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarActividadEconomica"));
		
		
		
		this.jInternalFrameDetalleFormActividadEconomica.jComboBoxTiposAccionesFormularioActividadEconomica.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioActividadEconomica"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtonidActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"idActividadEconomicaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormActividadEconomica.jButtonid_empresaActividadEconomicaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaActividadEconomicaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtonid_empresaActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaActividadEconomicaBusqueda"));
		//jButtonid_clienteActividadEconomica.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteActividadEconomicaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormActividadEconomica.jButtonid_clienteActividadEconomica.addActionListener(new ButtonActionListener(this,"id_clienteActividadEconomica"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormActividadEconomica.jButtonid_clienteActividadEconomicaUpdate.addActionListener(new ButtonActionListener(this,"id_clienteActividadEconomicaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtonid_clienteActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteActividadEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtonnombre_negocioActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_negocioActividadEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtonactividadActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"actividadActividadEconomicaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormActividadEconomica.jButtonid_paisActividadEconomicaUpdate.addActionListener(new ButtonActionListener(this,"id_paisActividadEconomicaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtonid_paisActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"id_paisActividadEconomicaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormActividadEconomica.jButtonid_ciudadActividadEconomicaUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadActividadEconomicaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtonid_ciudadActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadActividadEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtondireccionActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"direccionActividadEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtontelefonoActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"telefonoActividadEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtoningreso_netoActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"ingreso_netoActividadEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtoningreso_brutoActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"ingreso_brutoActividadEconomicaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormActividadEconomica.jTabbedPaneRelacionesActividadEconomica.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesActividadEconomica"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameActividadEconomica"));
		
		if(this.jInternalFrameDetalleFormActividadEconomica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActividadEconomica.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarActividadEconomica"));
		}
		
		this.jTableDatosActividadEconomica.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarActividadEconomica"));
		
		this.jTableDatosActividadEconomica.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarActividadEconomica"));
		
		this.jButtonNuevoActividadEconomica.addActionListener(new ButtonActionListener(this,"NuevoActividadEconomica"));
		
		this.jButtonDuplicarActividadEconomica.addActionListener(new ButtonActionListener(this,"DuplicarActividadEconomica"));
		
		this.jButtonCopiarActividadEconomica.addActionListener(new ButtonActionListener(this,"CopiarActividadEconomica"));
		
		this.jButtonVerFormActividadEconomica.addActionListener(new ButtonActionListener(this,"VerFormActividadEconomica"));
		
		
		this.jButtonNuevoToolBarActividadEconomica.addActionListener(new ButtonActionListener(this,"NuevoToolBarActividadEconomica"));
			
		this.jButtonDuplicarToolBarActividadEconomica.addActionListener(new ButtonActionListener(this,"DuplicarToolBarActividadEconomica"));
			
		this.jMenuItemNuevoActividadEconomica.addActionListener (new ButtonActionListener(this,"MenuItemNuevoActividadEconomica"));
			
		this.jMenuItemDuplicarActividadEconomica.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarActividadEconomica"));		
		
		
		this.jButtonNuevoRelacionesActividadEconomica.addActionListener (new ButtonActionListener(this,"NuevoRelacionesActividadEconomica"));
		
		
		this.jButtonNuevoRelacionesToolBarActividadEconomica.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarActividadEconomica"));
			
		this.jMenuItemNuevoRelacionesActividadEconomica.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesActividadEconomica"));		
		
		
		if(this.jInternalFrameDetalleFormActividadEconomica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActividadEconomica.jButtonModificarActividadEconomica.addActionListener(new ButtonActionListener(this,"ModificarActividadEconomica"));
		}
		
		
		if(this.jInternalFrameDetalleFormActividadEconomica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActividadEconomica.jButtonModificarToolBarActividadEconomica.addActionListener(new ButtonActionListener(this,"ModificarToolBarActividadEconomica"));
			
			this.jInternalFrameDetalleFormActividadEconomica.jMenuItemModificarActividadEconomica.addActionListener(new ButtonActionListener(this,"MenuItemModificarActividadEconomica"));		
		}
		
		
		if(this.jInternalFrameDetalleFormActividadEconomica!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormActividadEconomica.jButtonActualizarActividadEconomica.addActionListener (new ButtonActionListener(this,"ActualizarActividadEconomica"));
		}
		
		
		if(this.jInternalFrameDetalleFormActividadEconomica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActividadEconomica.jButtonActualizarToolBarActividadEconomica.addActionListener(new ButtonActionListener(this,"ActualizarToolBarActividadEconomica"));
				
			this.jInternalFrameDetalleFormActividadEconomica.jMenuItemActualizarActividadEconomica.addActionListener (new ButtonActionListener(this,"MenuItemActualizarActividadEconomica"));		
		}
		
		
		if(this.jInternalFrameDetalleFormActividadEconomica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActividadEconomica.jButtonEliminarActividadEconomica.addActionListener (new ButtonActionListener(this,"EliminarActividadEconomica"));
		}
		
		
		if(this.jInternalFrameDetalleFormActividadEconomica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActividadEconomica.jButtonEliminarToolBarActividadEconomica.addActionListener (new ButtonActionListener(this,"EliminarToolBarActividadEconomica"));
						
			this.jInternalFrameDetalleFormActividadEconomica.jMenuItemEliminarActividadEconomica.addActionListener (new ButtonActionListener(this,"MenuItemEliminarActividadEconomica"));		
		}
		
		
		if(this.jInternalFrameDetalleFormActividadEconomica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActividadEconomica.jButtonCancelarActividadEconomica.addActionListener (new ButtonActionListener(this,"CancelarActividadEconomica"));
		}
		
		
		if(this.jInternalFrameDetalleFormActividadEconomica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActividadEconomica.jButtonCancelarToolBarActividadEconomica.addActionListener (new ButtonActionListener(this,"CancelarToolBarActividadEconomica"));
			
			this.jInternalFrameDetalleFormActividadEconomica.jMenuItemCancelarActividadEconomica.addActionListener (new ButtonActionListener(this,"MenuItemCancelarActividadEconomica"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarActividadEconomica.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarActividadEconomica"));		
		
		
		this.jButtonCerrarActividadEconomica.addActionListener (new ButtonActionListener(this,"CerrarActividadEconomica"));
		
		
		this.jButtonCerrarToolBarActividadEconomica.addActionListener (new ButtonActionListener(this,"CerrarToolBarActividadEconomica"));
			
		this.jMenuItemCerrarActividadEconomica.addActionListener (new ButtonActionListener(this,"MenuItemCerrarActividadEconomica"));
			
		if(this.jInternalFrameDetalleFormActividadEconomica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActividadEconomica.jMenuItemDetalleCerrarActividadEconomica.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarActividadEconomica"));		
		}
		
		
		if(this.jInternalFrameDetalleFormActividadEconomica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActividadEconomica.jButtonGuardarCambiosActividadEconomica.addActionListener (new ButtonActionListener(this,"GuardarCambiosActividadEconomica"));
		}
		
		
		if(this.jInternalFrameDetalleFormActividadEconomica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActividadEconomica.jButtonGuardarCambiosToolBarActividadEconomica.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarActividadEconomica"));
		}
		
		this.jButtonCopiarToolBarActividadEconomica.addActionListener (new ButtonActionListener(this,"CopiarToolBarActividadEconomica"));
			
		this.jButtonVerFormToolBarActividadEconomica.addActionListener (new ButtonActionListener(this,"VerFormToolBarActividadEconomica"));
		
		this.jMenuItemGuardarCambiosActividadEconomica.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosActividadEconomica"));
			
		this.jMenuItemCopiarActividadEconomica.addActionListener (new ButtonActionListener(this,"MenuItemCopiarActividadEconomica"));		
		
		this.jMenuItemVerFormActividadEconomica.addActionListener (new ButtonActionListener(this,"MenuItemVerFormActividadEconomica"));		
		
		
		this.jButtonGuardarCambiosTablaActividadEconomica.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaActividadEconomica"));
		
		
		this.jButtonGuardarCambiosTablaToolBarActividadEconomica.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarActividadEconomica"));
			
		this.jMenuItemGuardarCambiosTablaActividadEconomica.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaActividadEconomica"));		
		
		
		
		this.jButtonRecargarInformacionActividadEconomica.addActionListener (new ButtonActionListener(this,"RecargarInformacionActividadEconomica"));
					
		this.jButtonRecargarInformacionToolBarActividadEconomica.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarActividadEconomica"));
		
		this.jMenuItemRecargarInformacionActividadEconomica.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionActividadEconomica"));		
		
		
		
		this.jButtonAnterioresActividadEconomica.addActionListener (new ButtonActionListener(this,"AnterioresActividadEconomica"));
		
		
		this.jButtonAnterioresToolBarActividadEconomica.addActionListener (new ButtonActionListener(this,"AnterioresToolBarActividadEconomica"));
		
		this.jMenuItemAnterioresActividadEconomica.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresActividadEconomica"));		
		
		
		this.jButtonSiguientesActividadEconomica.addActionListener (new ButtonActionListener(this,"SiguientesActividadEconomica"));
		
		
		this.jButtonSiguientesToolBarActividadEconomica.addActionListener (new ButtonActionListener(this,"SiguientesToolBarActividadEconomica"));
			
		this.jMenuItemSiguientesActividadEconomica.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesActividadEconomica"));
			
		this.jMenuItemAbrirOrderByActividadEconomica.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByActividadEconomica"));
			
		this.jMenuItemMostrarOcultarActividadEconomica.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarActividadEconomica"));
			
		this.jMenuItemDetalleAbrirOrderByActividadEconomica.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByActividadEconomica"));
			
		this.jMenuItemDetalleMostarOcultarActividadEconomica.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarActividadEconomica"));		
		
		
		this.jButtonNuevoGuardarCambiosActividadEconomica.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosActividadEconomica"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarActividadEconomica.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarActividadEconomica"));
			
		this.jMenuItemNuevoGuardarCambiosActividadEconomica.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosActividadEconomica"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosActividadEconomica.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosActividadEconomica"));

		this.jCheckBoxSeleccionadosActividadEconomica.addItemListener(new CheckBoxItemListener(this,"SeleccionadosActividadEconomica"));
		
		if(this.jInternalFrameDetalleFormActividadEconomica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActividadEconomica.jComboBoxTiposAccionesFormularioActividadEconomica.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioActividadEconomica"));
		}
		
		
		this.jComboBoxTiposRelacionesActividadEconomica.addActionListener (new ButtonActionListener(this,"TiposRelacionesActividadEconomica"));
			
		this.jComboBoxTiposAccionesActividadEconomica.addActionListener (new ButtonActionListener(this,"TiposAccionesActividadEconomica"));
					
		this.jComboBoxTiposSeleccionarActividadEconomica.addActionListener (new ButtonActionListener(this,"TiposSeleccionarActividadEconomica"));
			
		this.jTextFieldValorCampoGeneralActividadEconomica.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralActividadEconomica"));		
		
		
		if(this.jInternalFrameDetalleFormActividadEconomica!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtonidActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"idActividadEconomicaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormActividadEconomica.jButtonid_empresaActividadEconomicaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaActividadEconomicaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtonid_empresaActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaActividadEconomicaBusqueda"));
		//jButtonid_clienteActividadEconomica.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteActividadEconomicaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormActividadEconomica.jButtonid_clienteActividadEconomica.addActionListener(new ButtonActionListener(this,"id_clienteActividadEconomica"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormActividadEconomica.jButtonid_clienteActividadEconomicaUpdate.addActionListener(new ButtonActionListener(this,"id_clienteActividadEconomicaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtonid_clienteActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteActividadEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtonnombre_negocioActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_negocioActividadEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtonactividadActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"actividadActividadEconomicaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormActividadEconomica.jButtonid_paisActividadEconomicaUpdate.addActionListener(new ButtonActionListener(this,"id_paisActividadEconomicaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtonid_paisActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"id_paisActividadEconomicaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormActividadEconomica.jButtonid_ciudadActividadEconomicaUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadActividadEconomicaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtonid_ciudadActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadActividadEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtondireccionActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"direccionActividadEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtontelefonoActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"telefonoActividadEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtoningreso_netoActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"ingreso_netoActividadEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtoningreso_brutoActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"ingreso_brutoActividadEconomicaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCiudadActividadEconomica.addActionListener(new ButtonActionListener(this,"FK_IdCiudadActividadEconomica"));

			this.jButtonFK_IdClienteActividadEconomica.addActionListener(new ButtonActionListener(this,"FK_IdClienteActividadEconomica"));

			this.jButtonBuscarFK_IdClienteid_clienteActividadEconomica.addActionListener(new ButtonActionListener(this,"id_clienteActividadEconomica"));

			this.jButtonFK_IdPaisActividadEconomica.addActionListener(new ButtonActionListener(this,"FK_IdPaisActividadEconomica"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoActividadEconomica!=null) {
				this.jInternalFrameReporteDinamicoActividadEconomica.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoActividadEconomica"));
				this.jInternalFrameReporteDinamicoActividadEconomica.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoActividadEconomica"));
				this.jInternalFrameReporteDinamicoActividadEconomica.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoActividadEconomica"));
			}
			
			//this.jButtonCerrarReporteDinamicoActividadEconomica.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoActividadEconomica"));				
			//this.jButtonGenerarReporteDinamicoActividadEconomica.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoActividadEconomica"));
			//this.jButtonGenerarExcelReporteDinamicoActividadEconomica.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoActividadEconomica"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionActividadEconomica!=null) {
				this.jInternalFrameImportacionActividadEconomica.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionActividadEconomica"));
				this.jInternalFrameImportacionActividadEconomica.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionActividadEconomica"));
				this.jInternalFrameImportacionActividadEconomica.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionActividadEconomica"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByActividadEconomica.addActionListener (new ButtonActionListener(this,"AbrirOrderByActividadEconomica"));
			
			this.jButtonAbrirOrderByToolBarActividadEconomica.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarActividadEconomica"));			
			
			if(this.jInternalFrameOrderByActividadEconomica!=null) {
				this.jInternalFrameOrderByActividadEconomica.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByActividadEconomica"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormActividadEconomica!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormActividadEconomica!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActividadEconomica.jTabbedPaneRelacionesActividadEconomica.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesActividadEconomica"));
		
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
            		closingInternalFrameActividadEconomica();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormActividadEconomica.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormActividadEconomica = (JInternalFrameBase)event.getSource();
	            	
	            ActividadEconomicaBeanSwingJInternalFrame jInternalFrameParent=(ActividadEconomicaBeanSwingJInternalFrame)jInternalFrameDetalleFormActividadEconomica.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarActividadEconomicaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosActividadEconomica.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosActividadEconomicaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosActividadEconomica.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosActividadEconomica.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoActividadEconomicaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoActividadEconomicaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoActividadEconomicaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoActividadEconomica";
		inputMap = this.jButtonNuevoActividadEconomica.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoActividadEconomica.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoActividadEconomicaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoActividadEconomicaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoActividadEconomicaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoActividadEconomicaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesActividadEconomica";
		inputMap = this.jButtonNuevoRelacionesActividadEconomica.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesActividadEconomica.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoActividadEconomicaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarActividadEconomica";
		inputMap = this.jButtonModificarActividadEconomica.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarActividadEconomica.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarActividadEconomicaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarActividadEconomica";
		inputMap = this.jButtonActualizarActividadEconomica.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarActividadEconomica.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarActividadEconomicaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarActividadEconomica";
		inputMap = this.jButtonEliminarActividadEconomica.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarActividadEconomica.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarActividadEconomicaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarActividadEconomica";
		inputMap = this.jButtonCancelarActividadEconomica.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarActividadEconomica.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarActividadEconomicaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarActividadEconomica";
		inputMap = this.jButtonCerrarActividadEconomica.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarActividadEconomica.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarActividadEconomicaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormActividadEconomica.jButtonGuardarCambiosActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosActividadEconomica";
		inputMap = this.jInternalFrameDetalleFormActividadEconomica.jButtonGuardarCambiosActividadEconomica.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormActividadEconomica.jButtonGuardarCambiosActividadEconomica.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosActividadEconomicaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosActividadEconomica.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosActividadEconomicaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesActividadEconomica.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesActividadEconomicaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarActividadEconomica.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarActividadEconomicaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralActividadEconomica.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralActividadEconomicaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtonidActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"idActividadEconomicaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormActividadEconomica.jButtonid_empresaActividadEconomicaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaActividadEconomicaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtonid_empresaActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaActividadEconomicaBusqueda"));
		//jButtonid_clienteActividadEconomica.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteActividadEconomicaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormActividadEconomica.jButtonid_clienteActividadEconomica.addActionListener(new ButtonActionListener(this,"id_clienteActividadEconomica"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormActividadEconomica.jButtonid_clienteActividadEconomicaUpdate.addActionListener(new ButtonActionListener(this,"id_clienteActividadEconomicaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtonid_clienteActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteActividadEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtonnombre_negocioActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_negocioActividadEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtonactividadActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"actividadActividadEconomicaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormActividadEconomica.jButtonid_paisActividadEconomicaUpdate.addActionListener(new ButtonActionListener(this,"id_paisActividadEconomicaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtonid_paisActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"id_paisActividadEconomicaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormActividadEconomica.jButtonid_ciudadActividadEconomicaUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadActividadEconomicaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtonid_ciudadActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadActividadEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtondireccionActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"direccionActividadEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtontelefonoActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"telefonoActividadEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtoningreso_netoActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"ingreso_netoActividadEconomicaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActividadEconomica.jButtoningreso_brutoActividadEconomicaBusqueda.addActionListener(new ButtonActionListener(this,"ingreso_brutoActividadEconomicaBusqueda"));
		
		
		this.jButtonFK_IdCiudadActividadEconomica.addActionListener(new ButtonActionListener(this,"FK_IdCiudadActividadEconomica"));

		this.jButtonFK_IdClienteActividadEconomica.addActionListener(new ButtonActionListener(this,"FK_IdClienteActividadEconomica"));

		this.jButtonBuscarFK_IdClienteid_clienteActividadEconomica.addActionListener(new ButtonActionListener(this,"id_clienteActividadEconomica"));

		this.jButtonFK_IdPaisActividadEconomica.addActionListener(new ButtonActionListener(this,"FK_IdPaisActividadEconomica"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionActividadEconomica.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionActividadEconomicaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarActividadEconomicaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarActividadEconomica.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosActividadEconomica(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ActividadEconomica actividadeconomicaAux:this.actividadeconomicaLogic.getActividadEconomicas()) {
					actividadeconomicaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ActividadEconomica actividadeconomicaAux:actividadeconomicas) {
					actividadeconomicaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosActividadEconomicaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingActividadEconomica(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ActividadEconomica actividadeconomicaAux:this.actividadeconomicaLogic.getActividadEconomicas()) {
						actividadeconomicaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ActividadEconomica actividadeconomicaAux:actividadeconomicas) {
						actividadeconomicaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ActividadEconomica actividadeconomicaAux:this.actividadeconomicaLogic.getActividadEconomicas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ActividadEconomica actividadeconomicaAux:actividadeconomicas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaActividadEconomica(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosActividadEconomica.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosActividadEconomica.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosActividadEconomica,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosActividadEconomicaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingActividadEconomica(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosActividadEconomica.getSelectedRows();
			
			ActividadEconomica actividadeconomicaLocal=new ActividadEconomica();
			
			//this.seleccionarTodosActividadEconomica(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actividadeconomicaLocal =(ActividadEconomica) this.actividadeconomicaLogic.getActividadEconomicas().toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					actividadeconomicaLocal =(ActividadEconomica) this.actividadeconomicas.toArray()[this.jTableDatosActividadEconomica.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				actividadeconomicaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ActividadEconomica actividadeconomicaAux:this.actividadeconomicaLogic.getActividadEconomicas()) {
						actividadeconomicaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ActividadEconomica actividadeconomicaAux:actividadeconomicas) {
						actividadeconomicaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaActividadEconomica(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosActividadEconomica.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosActividadEconomica.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosActividadEconomica,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualActividadEconomicaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarActividadEconomicaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralActividadEconomicaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingActividadEconomica(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralActividadEconomica.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ActividadEconomica actividadeconomicaAux:this.actividadeconomicaLogic.getActividadEconomicas()) {
				
						if(sTipoSeleccionar.equals(ActividadEconomicaConstantesFunciones.LABEL_NOMBRENEGOCIO)) {
							existe=true;
							actividadeconomicaAux.setnombre_negocio(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActividadEconomicaConstantesFunciones.LABEL_ACTIVIDAD)) {
							existe=true;
							actividadeconomicaAux.setactividad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActividadEconomicaConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							actividadeconomicaAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActividadEconomicaConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							actividadeconomicaAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActividadEconomicaConstantesFunciones.LABEL_INGRESONETO)) {
							existe=true;
							actividadeconomicaAux.setingreso_neto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ActividadEconomicaConstantesFunciones.LABEL_INGRESOBRUTO)) {
							existe=true;
							actividadeconomicaAux.setingreso_bruto(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ActividadEconomica actividadeconomicaAux:actividadeconomicas) {
					
						if(sTipoSeleccionar.equals(ActividadEconomicaConstantesFunciones.LABEL_NOMBRENEGOCIO)) {
							existe=true;
							actividadeconomicaAux.setnombre_negocio(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActividadEconomicaConstantesFunciones.LABEL_ACTIVIDAD)) {
							existe=true;
							actividadeconomicaAux.setactividad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActividadEconomicaConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							actividadeconomicaAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActividadEconomicaConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							actividadeconomicaAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActividadEconomicaConstantesFunciones.LABEL_INGRESONETO)) {
							existe=true;
							actividadeconomicaAux.setingreso_neto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ActividadEconomicaConstantesFunciones.LABEL_INGRESOBRUTO)) {
							existe=true;
							actividadeconomicaAux.setingreso_bruto(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaActividadEconomica(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesActividadEconomicaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingActividadEconomica(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioActividadEconomica=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesActividadEconomica.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormActividadEconomica.jComboBoxTiposAccionesFormularioActividadEconomica.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteActividadEconomica) {				
					conSplash=true;//false;										
					
					//this.startProcessActividadEconomica(conSplash);
				
					this.generarReporteActividadEconomicasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesActividadEconomica.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormActividadEconomica.jComboBoxTiposAccionesFormularioActividadEconomica.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoActividadEconomicasSeleccionados();
				//this.jComboBoxTiposAccionesActividadEconomica.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoActividadEconomicasSeleccionados(false);
				//this.jComboBoxTiposAccionesActividadEconomica.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoActividadEconomicasSeleccionados(true);
				//this.jComboBoxTiposAccionesActividadEconomica.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessActividadEconomica();
				
				this.exportarActividadEconomicasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesActividadEconomica.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormActividadEconomica.jComboBoxTiposAccionesFormularioActividadEconomica.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionActividadEconomicas();
				//this.importarActividadEconomicas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesActividadEconomica.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormActividadEconomica.jComboBoxTiposAccionesFormularioActividadEconomica.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessActividadEconomica();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelActividadEconomicasSeleccionados();
				//this.jComboBoxTiposAccionesActividadEconomica.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Actividad Economica", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessActividadEconomica();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoActividadEconomica)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyActividadEconomica(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Actividad Economica",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesActividadEconomica.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormActividadEconomica.jComboBoxTiposAccionesFormularioActividadEconomica.setSelectedIndex(0);					
				}	
			} 			
			else if(ActividadEconomicaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteActividadEconomica) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessActividadEconomica(conSplash);
					
						//this.actualizarParametrosGeneralActividadEconomica();
						
						this.generarReporteProcesoAccionActividadEconomicasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesActividadEconomica.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormActividadEconomica.jComboBoxTiposAccionesFormularioActividadEconomica.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ActividadEconomicaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Actividad EconomicaS SELECCIONADOS?", "MANTENIMIENTO DE Actividad Economica", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessActividadEconomica();
				
						this.actualizarParametrosGeneralActividadEconomica();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.actividadeconomicaReturnGeneral=actividadeconomicaLogic.procesarAccionActividadEconomicasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.actividadeconomicaLogic.getActividadEconomicas(),this.actividadeconomicaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarActividadEconomicaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesActividadEconomica.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormActividadEconomica.jComboBoxTiposAccionesFormularioActividadEconomica.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralActividadEconomica();
					
					ActividadEconomicaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarActividadEconomicaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesActividadEconomica.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormActividadEconomica.jComboBoxTiposAccionesFormularioActividadEconomica.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessActividadEconomica(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesActividadEconomicaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessActividadEconomica();
			
			if(this.jInternalFrameDetalleFormActividadEconomica==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ActividadEconomica> actividadeconomicasSeleccionados=new ArrayList<ActividadEconomica>();		
			ActividadEconomica actividadeconomica=new ActividadEconomica();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingActividadEconomica(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesActividadEconomica.getSelectedItem();
			
			
			
			
			actividadeconomicasSeleccionados=this.getActividadEconomicasSeleccionados(true);
			//this.sTipoAccion;
			
			if(actividadeconomicasSeleccionados.size()==1) {
				for(ActividadEconomica actividadeconomicaAux:actividadeconomicasSeleccionados) {
					actividadeconomica=actividadeconomicaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessActividadEconomica();
			
      		//this.finishProcessActividadEconomica(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarActividadEconomicaReturnGeneral() throws Exception {
		if(this.actividadeconomicaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.actividadeconomicaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.actividadeconomicaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.actividadeconomicaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.actividadeconomicaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.actividadeconomicaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingActividadEconomica(false);
		}
		
		if(this.actividadeconomicaReturnGeneral.getConRetornoLista() || this.actividadeconomicaReturnGeneral.getConRetornoObjeto()) {
			if(this.actividadeconomicaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.actividadeconomicaLogic.setActividadEconomicas(this.actividadeconomicaReturnGeneral.getActividadEconomicas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.actividadeconomicaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.actividadeconomicaLogic.setActividadEconomica(this.actividadeconomicaReturnGeneral.getActividadEconomica());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingActividadEconomica(false);
		}
	}
	
	public void actualizarParametrosGeneralActividadEconomica() throws Exception {
		
		
	}
	
	public ArrayList<ActividadEconomica> getActividadEconomicasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ActividadEconomica> actividadeconomicasSeleccionados=new ArrayList<ActividadEconomica>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioActividadEconomica) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ActividadEconomica actividadeconomicaAux:actividadeconomicaLogic.getActividadEconomicas()) {
					if(actividadeconomicaAux.getIsSelected()) {
						actividadeconomicasSeleccionados.add(actividadeconomicaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ActividadEconomica actividadeconomicaAux:this.actividadeconomicas) {
					if(actividadeconomicaAux.getIsSelected()) {
						actividadeconomicasSeleccionados.add(actividadeconomicaAux);				
					}
				}
			}
			
			if(actividadeconomicasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						actividadeconomicasSeleccionados.addAll(this.actividadeconomicaLogic.getActividadEconomicas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						actividadeconomicasSeleccionados.addAll(this.actividadeconomicas);				
					}
				}
			}
		} else {
			actividadeconomicasSeleccionados.add(this.actividadeconomica);
		}
		
		return actividadeconomicasSeleccionados;
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
	
	public void generarReporteActividadEconomicasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalActividadEconomicasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoActividadEconomicasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoActividadEconomicasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoActividadEconomicasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Actividad Economica",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesActividadEconomicasSeleccionados() throws Exception {
		ArrayList<ActividadEconomica> actividadeconomicasSeleccionados=new ArrayList<ActividadEconomica>();		
		
		actividadeconomicasSeleccionados=this.getActividadEconomicasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteActividadEconomicas("Todos",actividadeconomicasSeleccionados);
		
	}	
	
	public void generarReporteNormalActividadEconomicasSeleccionados() throws Exception {
		ArrayList<ActividadEconomica> actividadeconomicasSeleccionados=new ArrayList<ActividadEconomica>();		
		
		actividadeconomicasSeleccionados=this.getActividadEconomicasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteActividadEconomicas("Todos",actividadeconomicasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionActividadEconomicasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ActividadEconomica> actividadeconomicasSeleccionados=new ArrayList<ActividadEconomica>();
		
		actividadeconomicasSeleccionados=this.getActividadEconomicasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteActividadEconomicas("Todos",actividadeconomicasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoActividadEconomicasSeleccionados() throws Exception {
		ArrayList<ActividadEconomica> actividadeconomicasSeleccionados=new ArrayList<ActividadEconomica>();		
		
		
		this.abrirInicializarFrameReporteDinamicoActividadEconomica();
		
		
		actividadeconomicasSeleccionados=this.getActividadEconomicasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoActividadEconomica();
		
		
		//this.generarReporteActividadEconomicas("Todos",actividadeconomicasSeleccionados ,actividadeconomicaImplementable,actividadeconomicaImplementableHome);
	}
	
	public void mostrarImportacionActividadEconomicas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionActividadEconomica();
		
		this.abrirFrameImportacionActividadEconomica();		
		
			
		//this.generarReporteActividadEconomicas("Todos",actividadeconomicasSeleccionados ,actividadeconomicaImplementable,actividadeconomicaImplementableHome);
	}
	
	public void importarActividadEconomicas() throws Exception {		
	
	}
	
	public void exportarActividadEconomicasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelActividadEconomicasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoActividadEconomicasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlActividadEconomicasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Actividad Economica",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoActividadEconomicasSeleccionados() throws Exception {
		ArrayList<ActividadEconomica> actividadeconomicasSeleccionados=new ArrayList<ActividadEconomica>();		
		
		actividadeconomicasSeleccionados=this.getActividadEconomicasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"actividadeconomica."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarActividadEconomica(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ActividadEconomica actividadeconomicaAux:actividadeconomicasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarActividadEconomica(actividadeconomicaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//actividadeconomicaAux.setsDetalleGeneralEntityReporte(actividadeconomicaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Actividad Economica",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarActividadEconomica(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ActividadEconomicaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActividadEconomicaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActividadEconomicaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActividadEconomicaConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActividadEconomicaConstantesFunciones.LABEL_NOMBRENEGOCIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActividadEconomicaConstantesFunciones.LABEL_ACTIVIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActividadEconomicaConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActividadEconomicaConstantesFunciones.LABEL_IDCIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActividadEconomicaConstantesFunciones.LABEL_DIRECCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActividadEconomicaConstantesFunciones.LABEL_TELEFONO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActividadEconomicaConstantesFunciones.LABEL_INGRESONETO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActividadEconomicaConstantesFunciones.LABEL_INGRESOBRUTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarActividadEconomica(ActividadEconomica actividadeconomica,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=actividadeconomica.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=actividadeconomica.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=actividadeconomica.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=actividadeconomica.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=actividadeconomica.getnombre_negocio();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=actividadeconomica.getactividad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=actividadeconomica.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=actividadeconomica.getciudad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=actividadeconomica.getdireccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=actividadeconomica.gettelefono();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=actividadeconomica.getingreso_neto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=actividadeconomica.getingreso_bruto().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelActividadEconomicasSeleccionados() throws Exception {
		ArrayList<ActividadEconomica> actividadeconomicasSeleccionados=new ArrayList<ActividadEconomica>();		
		
		actividadeconomicasSeleccionados=this.getActividadEconomicasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"actividadeconomica.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ActividadEconomicas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelActividadEconomica(row);				
				iRow++;
			}				
			
			for(ActividadEconomica actividadeconomicaAux:actividadeconomicasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelActividadEconomica(actividadeconomicaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Actividad Economica",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlActividadEconomicasSeleccionados() throws Exception {
		ArrayList<ActividadEconomica> actividadeconomicasSeleccionados=new ArrayList<ActividadEconomica>();		
		
		actividadeconomicasSeleccionados=this.getActividadEconomicasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"actividadeconomica.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("actividadeconomicas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("actividadeconomica");
			//elementRoot.appendChild(element);
		
			for(ActividadEconomica actividadeconomicaAux:actividadeconomicasSeleccionados) {
				element = document.createElement("actividadeconomica");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlActividadEconomica(actividadeconomicaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Actividad Economica",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelActividadEconomica(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_NOMBRENEGOCIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_ACTIVIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_IDCIUDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_DIRECCION);
		cell = row.createCell(iColumn++);cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_TELEFONO);
		cell = row.createCell(iColumn++);cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_INGRESONETO);
		cell = row.createCell(iColumn++);cell.setCellValue(ActividadEconomicaConstantesFunciones.LABEL_INGRESOBRUTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelActividadEconomica(ActividadEconomica actividadeconomica,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(actividadeconomica.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(actividadeconomica.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(actividadeconomica.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(actividadeconomica.getnombre_negocio());
		cell = row.createCell(iColumn++);cell.setCellValue(actividadeconomica.getactividad());
		cell = row.createCell(iColumn++);cell.setCellValue(actividadeconomica.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(actividadeconomica.getciudad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(actividadeconomica.getdireccion());
		cell = row.createCell(iColumn++);cell.setCellValue(actividadeconomica.gettelefono());
		cell = row.createCell(iColumn++);cell.setCellValue(actividadeconomica.getingreso_neto());
		cell = row.createCell(iColumn++);cell.setCellValue(actividadeconomica.getingreso_bruto());				
	}
	
	public void setFilaDatosExportarXmlActividadEconomica(ActividadEconomica actividadeconomica,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ActividadEconomicaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(actividadeconomica.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ActividadEconomicaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(actividadeconomica.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ActividadEconomicaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(actividadeconomica.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcliente_descripcion = document.createElement(ActividadEconomicaConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(actividadeconomica.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementnombre_negocio = document.createElement(ActividadEconomicaConstantesFunciones.NOMBRENEGOCIO);
		elementnombre_negocio.appendChild(document.createTextNode(actividadeconomica.getnombre_negocio().trim()));
		element.appendChild(elementnombre_negocio);

		Element elementactividad = document.createElement(ActividadEconomicaConstantesFunciones.ACTIVIDAD);
		elementactividad.appendChild(document.createTextNode(actividadeconomica.getactividad().trim()));
		element.appendChild(elementactividad);

		Element elementpais_descripcion = document.createElement(ActividadEconomicaConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(actividadeconomica.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementciudad_descripcion = document.createElement(ActividadEconomicaConstantesFunciones.IDCIUDAD);
		elementciudad_descripcion.appendChild(document.createTextNode(actividadeconomica.getciudad_descripcion()));
		element.appendChild(elementciudad_descripcion);

		Element elementdireccion = document.createElement(ActividadEconomicaConstantesFunciones.DIRECCION);
		elementdireccion.appendChild(document.createTextNode(actividadeconomica.getdireccion().trim()));
		element.appendChild(elementdireccion);

		Element elementtelefono = document.createElement(ActividadEconomicaConstantesFunciones.TELEFONO);
		elementtelefono.appendChild(document.createTextNode(actividadeconomica.gettelefono().trim()));
		element.appendChild(elementtelefono);

		Element elementingreso_neto = document.createElement(ActividadEconomicaConstantesFunciones.INGRESONETO);
		elementingreso_neto.appendChild(document.createTextNode(actividadeconomica.getingreso_neto().toString().trim()));
		element.appendChild(elementingreso_neto);

		Element elementingreso_bruto = document.createElement(ActividadEconomicaConstantesFunciones.INGRESOBRUTO);
		elementingreso_bruto.appendChild(document.createTextNode(actividadeconomica.getingreso_bruto().toString().trim()));
		element.appendChild(elementingreso_bruto);
	}
	
	public void generarReporteGroupGenericoActividadEconomicasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ActividadEconomica> actividadeconomicasSeleccionados=new ArrayList<ActividadEconomica>();
		
		actividadeconomicasSeleccionados=this.getActividadEconomicasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoActividadEconomica(actividadeconomicasSeleccionados);
		
		this.generarReporteActividadEconomicas("Todos",actividadeconomicasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoActividadEconomica(ArrayList<ActividadEconomica> actividadeconomicasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ActividadEconomica actividadeconomicaAux:actividadeconomicasSeleccionados) {
				actividadeconomicaAux.setsDetalleGeneralEntityReporte(actividadeconomicaAux.toString());
			
				if(sTipoSeleccionar.equals(ActividadEconomicaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					actividadeconomicaAux.setsDescripcionGeneralEntityReporte1(actividadeconomicaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ActividadEconomicaConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					actividadeconomicaAux.setsDescripcionGeneralEntityReporte1(actividadeconomicaAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ActividadEconomicaConstantesFunciones.LABEL_NOMBRENEGOCIO)) {
					existe=true;
					actividadeconomicaAux.setsDescripcionGeneralEntityReporte1(actividadeconomicaAux.getnombre_negocio());
				}
				 else if(sTipoSeleccionar.equals(ActividadEconomicaConstantesFunciones.LABEL_ACTIVIDAD)) {
					existe=true;
					actividadeconomicaAux.setsDescripcionGeneralEntityReporte1(actividadeconomicaAux.getactividad());
				}
				 else if(sTipoSeleccionar.equals(ActividadEconomicaConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					actividadeconomicaAux.setsDescripcionGeneralEntityReporte1(actividadeconomicaAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ActividadEconomicaConstantesFunciones.LABEL_IDCIUDAD)) {
					existe=true;
					actividadeconomicaAux.setsDescripcionGeneralEntityReporte1(actividadeconomicaAux.getciudad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ActividadEconomicaConstantesFunciones.LABEL_DIRECCION)) {
					existe=true;
					actividadeconomicaAux.setsDescripcionGeneralEntityReporte1(actividadeconomicaAux.getdireccion());
				}
				 else if(sTipoSeleccionar.equals(ActividadEconomicaConstantesFunciones.LABEL_TELEFONO)) {
					existe=true;
					actividadeconomicaAux.setsDescripcionGeneralEntityReporte1(actividadeconomicaAux.gettelefono());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActividadEconomicaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesActividadEconomica(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoActividadEconomica=true;
				this.isVisibilidadCeldaNuevoRelacionesActividadEconomica=true;
				this.isVisibilidadCeldaGuardarCambiosActividadEconomica=true;
			}
			
			this.isVisibilidadCeldaModificarActividadEconomica=false;
			this.isVisibilidadCeldaActualizarActividadEconomica=false;
			this.isVisibilidadCeldaEliminarActividadEconomica=false;
			this.isVisibilidadCeldaCancelarActividadEconomica=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarActividadEconomica=true;
				} else {
					this.isVisibilidadCeldaGuardarActividadEconomica=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoActividadEconomica=false;
			this.isVisibilidadCeldaNuevoRelacionesActividadEconomica=false;
			this.isVisibilidadCeldaGuardarCambiosActividadEconomica=false;
			this.isVisibilidadCeldaModificarActividadEconomica=false;
			this.isVisibilidadCeldaActualizarActividadEconomica=true;
			this.isVisibilidadCeldaEliminarActividadEconomica=false;
			this.isVisibilidadCeldaCancelarActividadEconomica=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarActividadEconomica=true;
				} else {
					this.isVisibilidadCeldaGuardarActividadEconomica=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoActividadEconomica=false;
			this.isVisibilidadCeldaNuevoRelacionesActividadEconomica=false;
			this.isVisibilidadCeldaGuardarCambiosActividadEconomica=false;
			this.isVisibilidadCeldaModificarActividadEconomica=false;
			this.isVisibilidadCeldaActualizarActividadEconomica=true;
			this.isVisibilidadCeldaEliminarActividadEconomica=true;
			this.isVisibilidadCeldaCancelarActividadEconomica=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarActividadEconomica=true;
				} else {
					this.isVisibilidadCeldaGuardarActividadEconomica=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoActividadEconomica=false;
			this.isVisibilidadCeldaNuevoRelacionesActividadEconomica=false;
			this.isVisibilidadCeldaGuardarCambiosActividadEconomica=false;
			this.isVisibilidadCeldaModificarActividadEconomica=false;
			this.isVisibilidadCeldaActualizarActividadEconomica=true;
			this.isVisibilidadCeldaEliminarActividadEconomica=false;
			this.isVisibilidadCeldaCancelarActividadEconomica=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarActividadEconomica=false;
				} else {
					this.isVisibilidadCeldaGuardarActividadEconomica=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoActividadEconomica=true;
			this.isVisibilidadCeldaNuevoRelacionesActividadEconomica=true;
			this.isVisibilidadCeldaGuardarCambiosActividadEconomica=true;
			this.isVisibilidadCeldaModificarActividadEconomica=false;
			this.isVisibilidadCeldaActualizarActividadEconomica=false;
			this.isVisibilidadCeldaEliminarActividadEconomica=false;
			this.isVisibilidadCeldaCancelarActividadEconomica=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarActividadEconomica=true;
				} else {
					this.isVisibilidadCeldaGuardarActividadEconomica=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoActividadEconomica=false;
			this.isVisibilidadCeldaNuevoRelacionesActividadEconomica=false;
			this.isVisibilidadCeldaGuardarCambiosActividadEconomica=false;
			this.isVisibilidadCeldaActualizarActividadEconomica=false;
			this.isVisibilidadCeldaEliminarActividadEconomica=false;
			this.isVisibilidadCeldaCancelarActividadEconomica=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarActividadEconomica=false;
				} else {
					this.isVisibilidadCeldaGuardarActividadEconomica=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoActividadEconomica=false;
			this.isVisibilidadCeldaNuevoRelacionesActividadEconomica=false;
			this.isVisibilidadCeldaGuardarCambiosActividadEconomica=false;
			this.isVisibilidadCeldaModificarActividadEconomica=true;
			this.isVisibilidadCeldaActualizarActividadEconomica=false;
			this.isVisibilidadCeldaEliminarActividadEconomica=false;
			this.isVisibilidadCeldaCancelarActividadEconomica=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarActividadEconomica=false;
				} else {
					this.isVisibilidadCeldaGuardarActividadEconomica=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ActividadEconomicaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoActividadEconomica=true;
			this.isVisibilidadCeldaNuevoRelacionesActividadEconomica=true;
			this.isVisibilidadCeldaGuardarCambiosActividadEconomica=true;
		} else {
			this.actualizarEstadoPanelsActividadEconomica(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarActividadEconomica=false;
			//this.isVisibilidadCeldaVerFormActividadEconomica=false;
			this.isVisibilidadCeldaDuplicarActividadEconomica=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!actividadeconomicaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesActividadEconomica=false;
		} else {
			this.isVisibilidadCeldaNuevoActividadEconomica=false;
			this.isVisibilidadCeldaGuardarCambiosActividadEconomica=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(actividadeconomicaSessionBean.getEsGuardarRelacionado()) {
			if(!actividadeconomicaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesActividadEconomica=false;												
			}
			
			this.jButtonCerrarActividadEconomica.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesActividadEconomica=false;
		}
		
		if(!this.permiteMantenimiento(this.actividadeconomica)) {
			this.isVisibilidadCeldaActualizarActividadEconomica=false;
			this.isVisibilidadCeldaEliminarActividadEconomica=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesActividadEconomica() {
	}
	
	public void actualizarEstadoPanelsActividadEconomica(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionActividadEconomica!=null) {
				this.jScrollPanelDatosEdicionActividadEconomica.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasActividadEconomica!=null) {
				this.jTabbedPaneBusquedasActividadEconomica.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosActividadEconomica!=null) {
				this.jScrollPanelDatosActividadEconomica.setVisible(true);
			}
			
			if(this.jPanelPaginacionActividadEconomica!=null) {
				this.jPanelPaginacionActividadEconomica.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesActividadEconomica!=null) {
				this.jPanelParametrosReportesActividadEconomica.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionActividadEconomica!=null) {
				this.jScrollPanelDatosEdicionActividadEconomica.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasActividadEconomica!=null) {
				this.jTabbedPaneBusquedasActividadEconomica.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosActividadEconomica!=null) {
				this.jScrollPanelDatosActividadEconomica.setVisible(false);
			}
			
			if(this.jPanelPaginacionActividadEconomica!=null) {
				this.jPanelPaginacionActividadEconomica.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesActividadEconomica!=null) {
				this.jPanelParametrosReportesActividadEconomica.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionActividadEconomica!=null) {
				this.jScrollPanelDatosEdicionActividadEconomica.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasActividadEconomica!=null) {
				this.jTabbedPaneBusquedasActividadEconomica.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosActividadEconomica!=null) {
				this.jScrollPanelDatosActividadEconomica.setVisible(false);
			}
			
			if(this.jPanelPaginacionActividadEconomica!=null) {
				this.jPanelPaginacionActividadEconomica.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesActividadEconomica!=null) {
				this.jPanelParametrosReportesActividadEconomica.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionActividadEconomica!=null) {
				this.jScrollPanelDatosEdicionActividadEconomica.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasActividadEconomica!=null) {
				this.jTabbedPaneBusquedasActividadEconomica.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosActividadEconomica!=null) {
				this.jScrollPanelDatosActividadEconomica.setVisible(false);
			}
			
			if(this.jPanelPaginacionActividadEconomica!=null) {
				this.jPanelPaginacionActividadEconomica.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesActividadEconomica!=null) {
				this.jPanelParametrosReportesActividadEconomica.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionActividadEconomica!=null) {
				this.jScrollPanelDatosEdicionActividadEconomica.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasActividadEconomica!=null) {
				this.jTabbedPaneBusquedasActividadEconomica.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosActividadEconomica!=null) {
				this.jScrollPanelDatosActividadEconomica.setVisible(true);
			}
			
			if(this.jPanelPaginacionActividadEconomica!=null) {
				this.jPanelPaginacionActividadEconomica.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesActividadEconomica!=null) {
				this.jPanelParametrosReportesActividadEconomica.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionActividadEconomica!=null) {
				this.jScrollPanelDatosEdicionActividadEconomica.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasActividadEconomica!=null) {
				this.jTabbedPaneBusquedasActividadEconomica.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosActividadEconomica!=null) {
				this.jScrollPanelDatosActividadEconomica.setVisible(true);
			}
			
			if(this.jPanelPaginacionActividadEconomica!=null) {
				this.jPanelPaginacionActividadEconomica.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesActividadEconomica!=null) {
				this.jPanelParametrosReportesActividadEconomica.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionActividadEconomica!=null) {
				this.jScrollPanelDatosEdicionActividadEconomica.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasActividadEconomica!=null) {
				this.jTabbedPaneBusquedasActividadEconomica.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosActividadEconomica!=null) {
				this.jScrollPanelDatosActividadEconomica.setVisible(true);
			}
			
			if(this.jPanelPaginacionActividadEconomica!=null) {
				this.jPanelPaginacionActividadEconomica.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesActividadEconomica!=null) {
				this.jPanelParametrosReportesActividadEconomica.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasActividadEconomica!=null) {
					this.jTabbedPaneBusquedasActividadEconomica.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesActividadEconomica!=null) {
				this.jPanelParametrosReportesActividadEconomica.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.actividadeconomicaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasActividadEconomica!=null) {
				this.jTabbedPaneBusquedasActividadEconomica.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesActividadEconomica!=null) {
				this.jPanelParametrosReportesActividadEconomica.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCiudad=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasActividadEconomica.remove(jPanelFK_IdCiudadActividadEconomica);}

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasActividadEconomica.remove(jPanelFK_IdClienteActividadEconomica);}

			this.isVisibilidadFK_IdPais=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasActividadEconomica.remove(jPanelFK_IdPaisActividadEconomica);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCiudad=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasActividadEconomica.remove(jPanelFK_IdCiudadActividadEconomica);}

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasActividadEconomica.remove(jPanelFK_IdClienteActividadEconomica);}

			this.isVisibilidadFK_IdPais=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasActividadEconomica.remove(jPanelFK_IdPaisActividadEconomica);}
		}
		
	}

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadFK_IdCiudad=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasActividadEconomica.remove(jPanelFK_IdCiudadActividadEconomica);}

			this.isVisibilidadFK_IdCliente=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasActividadEconomica.remove(jPanelFK_IdClienteActividadEconomica);}

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasActividadEconomica.remove(jPanelFK_IdPaisActividadEconomica);}
		}
		
	}

	public void setVisibilidadBusquedasParaCiudad(Boolean isParaCiudad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCiudadNegation=!isParaCiudad;

			this.isVisibilidadFK_IdCiudad=isParaCiudad;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasActividadEconomica.remove(jPanelFK_IdCiudadActividadEconomica);}

			this.isVisibilidadFK_IdCliente=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasActividadEconomica.remove(jPanelFK_IdClienteActividadEconomica);}

			this.isVisibilidadFK_IdPais=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasActividadEconomica.remove(jPanelFK_IdPaisActividadEconomica);}
		}
		
	}
	
	
	
	

	public String registrarSesionActividadEconomicaParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(actividadeconomicaSessionBean==null) {
				actividadeconomicaSessionBean=new ActividadEconomicaSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(actividadeconomicaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.actividadeconomicaFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(ActividadEconomicaConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionActividadEconomica(true);
			//clienteSessionBean.setlidActividadEconomicaActual(this.idActividadEconomicaActual);

			actividadeconomicaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyActividadEconomica(true);
			actividadeconomicaSessionBean.setlIdActividadEconomicaActualForeignKey(this.idActividadEconomicaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ActividadEconomicaSessionBean actividadeconomicaSessionBean=new ActividadEconomicaSessionBean();
		
		if(this.actividadeconomicaSessionBean==null) {
			this.actividadeconomicaSessionBean=new ActividadEconomicaSessionBean();
		}
		
		this.actividadeconomicaSessionBean.setsUltimaBusquedaActividadEconomica(this.getsAccionBusqueda());
		this.actividadeconomicaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.actividadeconomicaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCiudad")) {
			actividadeconomicaSessionBean.setid_ciudad(this.getid_ciudadFK_IdCiudad());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			actividadeconomicaSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			actividadeconomicaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			actividadeconomicaSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ActividadEconomicaSessionBean actividadeconomicaSessionBean=new ActividadEconomicaSessionBean();
		
		if(this.actividadeconomicaSessionBean==null) {
			this.actividadeconomicaSessionBean=new ActividadEconomicaSessionBean();
		}
		
		if(this.actividadeconomicaSessionBean.getsUltimaBusquedaActividadEconomica()!=null&&!this.actividadeconomicaSessionBean.getsUltimaBusquedaActividadEconomica().equals("")) {
			this.setsAccionBusqueda(actividadeconomicaSessionBean.getsUltimaBusquedaActividadEconomica());
			this.setiNumeroPaginacion(actividadeconomicaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(actividadeconomicaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCiudad")) {
				this.setid_ciudadFK_IdCiudad(actividadeconomicaSessionBean.getid_ciudad());
				actividadeconomicaSessionBean.setid_ciudad(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(actividadeconomicaSessionBean.getid_cliente());
				actividadeconomicaSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(actividadeconomicaSessionBean.getid_empresa());
				actividadeconomicaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(actividadeconomicaSessionBean.getid_pais());
				actividadeconomicaSessionBean.setid_pais(-1L);
			}
		}
		
		this.actividadeconomicaSessionBean.setsUltimaBusquedaActividadEconomica("");
		this.actividadeconomicaSessionBean.setiNumeroPaginacion(ActividadEconomicaConstantesFunciones.INUMEROPAGINACION);
		this.actividadeconomicaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaActividadEconomica(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioActividadEconomica() {
		this.updateBorderResaltarBusquedasFormularioActividadEconomica();
		this.updateVisibilidadBusquedasFormularioActividadEconomica();
		this.updateHabilitarBusquedasFormularioActividadEconomica();
	}
	
	public void updateBorderResaltarBusquedasFormularioActividadEconomica() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasActividadEconomica.getComponents().length>0) {
	

		if(this.actividadeconomicaConstantesFunciones.resaltarFK_IdCiudadActividadEconomica!=null) {
			index= this.jTabbedPaneBusquedasActividadEconomica.indexOfComponent(this.jPanelFK_IdCiudadActividadEconomica);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasActividadEconomica.getComponent(index);
				jPanel.setBorder(this.actividadeconomicaConstantesFunciones.resaltarFK_IdCiudadActividadEconomica);
			}
		}

		if(this.actividadeconomicaConstantesFunciones.resaltarFK_IdClienteActividadEconomica!=null) {
			index= this.jTabbedPaneBusquedasActividadEconomica.indexOfComponent(this.jPanelFK_IdClienteActividadEconomica);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasActividadEconomica.getComponent(index);
				jPanel.setBorder(this.actividadeconomicaConstantesFunciones.resaltarFK_IdClienteActividadEconomica);
			}
		}

		if(this.actividadeconomicaConstantesFunciones.resaltarFK_IdPaisActividadEconomica!=null) {
			index= this.jTabbedPaneBusquedasActividadEconomica.indexOfComponent(this.jPanelFK_IdPaisActividadEconomica);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasActividadEconomica.getComponent(index);
				jPanel.setBorder(this.actividadeconomicaConstantesFunciones.resaltarFK_IdPaisActividadEconomica);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioActividadEconomica() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasActividadEconomica.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasActividadEconomica.indexOfComponent(this.jPanelFK_IdCiudadActividadEconomica);
			jPanel=(JPanel)this.jTabbedPaneBusquedasActividadEconomica.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.actividadeconomicaConstantesFunciones.mostrarFK_IdCiudadActividadEconomica);
			if(!this.actividadeconomicaConstantesFunciones.mostrarFK_IdCiudadActividadEconomica && index>-1) {
				this.jTabbedPaneBusquedasActividadEconomica.remove(index);
			}

			index= this.jTabbedPaneBusquedasActividadEconomica.indexOfComponent(this.jPanelFK_IdClienteActividadEconomica);
			jPanel=(JPanel)this.jTabbedPaneBusquedasActividadEconomica.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.actividadeconomicaConstantesFunciones.mostrarFK_IdClienteActividadEconomica);
			if(!this.actividadeconomicaConstantesFunciones.mostrarFK_IdClienteActividadEconomica && index>-1) {
				this.jTabbedPaneBusquedasActividadEconomica.remove(index);
			}

			index= this.jTabbedPaneBusquedasActividadEconomica.indexOfComponent(this.jPanelFK_IdPaisActividadEconomica);
			jPanel=(JPanel)this.jTabbedPaneBusquedasActividadEconomica.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.actividadeconomicaConstantesFunciones.mostrarFK_IdPaisActividadEconomica);
			if(!this.actividadeconomicaConstantesFunciones.mostrarFK_IdPaisActividadEconomica && index>-1) {
				this.jTabbedPaneBusquedasActividadEconomica.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioActividadEconomica() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasActividadEconomica.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasActividadEconomica.indexOfComponent(this.jPanelFK_IdCiudadActividadEconomica);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasActividadEconomica.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.actividadeconomicaConstantesFunciones.activarFK_IdCiudadActividadEconomica);
				this.jTabbedPaneBusquedasActividadEconomica.setEnabledAt(index,this.actividadeconomicaConstantesFunciones.activarFK_IdCiudadActividadEconomica);
			}

			index= this.jTabbedPaneBusquedasActividadEconomica.indexOfComponent(this.jPanelFK_IdClienteActividadEconomica);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasActividadEconomica.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.actividadeconomicaConstantesFunciones.activarFK_IdClienteActividadEconomica);
				this.jTabbedPaneBusquedasActividadEconomica.setEnabledAt(index,this.actividadeconomicaConstantesFunciones.activarFK_IdClienteActividadEconomica);
			}

			index= this.jTabbedPaneBusquedasActividadEconomica.indexOfComponent(this.jPanelFK_IdPaisActividadEconomica);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasActividadEconomica.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.actividadeconomicaConstantesFunciones.activarFK_IdPaisActividadEconomica);
				this.jTabbedPaneBusquedasActividadEconomica.setEnabledAt(index,this.actividadeconomicaConstantesFunciones.activarFK_IdPaisActividadEconomica);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaActividadEconomica(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCiudad")) {
			index= this.jTabbedPaneBusquedasActividadEconomica.indexOfComponent(this.jPanelFK_IdCiudadActividadEconomica);

			this.jTabbedPaneBusquedasActividadEconomica.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasActividadEconomica.getComponent(index);

			this.actividadeconomicaConstantesFunciones.setResaltarFK_IdCiudadActividadEconomica(resaltar);

			jPanel.setBorder(this.actividadeconomicaConstantesFunciones.resaltarFK_IdCiudadActividadEconomica);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasActividadEconomica.indexOfComponent(this.jPanelFK_IdClienteActividadEconomica);

			this.jTabbedPaneBusquedasActividadEconomica.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasActividadEconomica.getComponent(index);

			this.actividadeconomicaConstantesFunciones.setResaltarFK_IdClienteActividadEconomica(resaltar);

			jPanel.setBorder(this.actividadeconomicaConstantesFunciones.resaltarFK_IdClienteActividadEconomica);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasActividadEconomica.indexOfComponent(this.jPanelFK_IdPaisActividadEconomica);

			this.jTabbedPaneBusquedasActividadEconomica.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasActividadEconomica.getComponent(index);

			this.actividadeconomicaConstantesFunciones.setResaltarFK_IdPaisActividadEconomica(resaltar);

			jPanel.setBorder(this.actividadeconomicaConstantesFunciones.resaltarFK_IdPaisActividadEconomica);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarActividadEconomica.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioActividadEconomica() throws Exception {

		if(this.jInternalFrameDetalleFormActividadEconomica==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioActividadEconomica();
		this.updateVisibilidadResaltarControlesFormularioActividadEconomica();
		this.updateHabilitarResaltarControlesFormularioActividadEconomica();
		
	}
	
	public void updateBorderResaltarControlesFormularioActividadEconomica() throws Exception {
		if(this.jInternalFrameDetalleFormActividadEconomica==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.actividadeconomicaConstantesFunciones.resaltaridActividadEconomica!=null && this.jInternalFrameDetalleFormActividadEconomica!=null) {this.jInternalFrameDetalleFormActividadEconomica.jLabelidActividadEconomica.setBorder(this.actividadeconomicaConstantesFunciones.resaltaridActividadEconomica);}
		if(this.actividadeconomicaConstantesFunciones.resaltarid_empresaActividadEconomica!=null && this.jInternalFrameDetalleFormActividadEconomica!=null) {this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_empresaActividadEconomica.setBorder(this.actividadeconomicaConstantesFunciones.resaltarid_empresaActividadEconomica);}
		if(this.actividadeconomicaConstantesFunciones.resaltarid_clienteActividadEconomica!=null && this.jInternalFrameDetalleFormActividadEconomica!=null) {this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_clienteActividadEconomica.setBorder(this.actividadeconomicaConstantesFunciones.resaltarid_clienteActividadEconomica);}
		if(this.actividadeconomicaConstantesFunciones.resaltarnombre_negocioActividadEconomica!=null && this.jInternalFrameDetalleFormActividadEconomica!=null) {this.jInternalFrameDetalleFormActividadEconomica.jTextAreanombre_negocioActividadEconomica.setBorder(this.actividadeconomicaConstantesFunciones.resaltarnombre_negocioActividadEconomica);}
		if(this.actividadeconomicaConstantesFunciones.resaltaractividadActividadEconomica!=null && this.jInternalFrameDetalleFormActividadEconomica!=null) {this.jInternalFrameDetalleFormActividadEconomica.jTextAreaactividadActividadEconomica.setBorder(this.actividadeconomicaConstantesFunciones.resaltaractividadActividadEconomica);}
		if(this.actividadeconomicaConstantesFunciones.resaltarid_paisActividadEconomica!=null && this.jInternalFrameDetalleFormActividadEconomica!=null) {this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_paisActividadEconomica.setBorder(this.actividadeconomicaConstantesFunciones.resaltarid_paisActividadEconomica);}
		if(this.actividadeconomicaConstantesFunciones.resaltarid_ciudadActividadEconomica!=null && this.jInternalFrameDetalleFormActividadEconomica!=null) {this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_ciudadActividadEconomica.setBorder(this.actividadeconomicaConstantesFunciones.resaltarid_ciudadActividadEconomica);}
		if(this.actividadeconomicaConstantesFunciones.resaltardireccionActividadEconomica!=null && this.jInternalFrameDetalleFormActividadEconomica!=null) {this.jInternalFrameDetalleFormActividadEconomica.jTextAreadireccionActividadEconomica.setBorder(this.actividadeconomicaConstantesFunciones.resaltardireccionActividadEconomica);}
		if(this.actividadeconomicaConstantesFunciones.resaltartelefonoActividadEconomica!=null && this.jInternalFrameDetalleFormActividadEconomica!=null) {this.jInternalFrameDetalleFormActividadEconomica.jTextAreatelefonoActividadEconomica.setBorder(this.actividadeconomicaConstantesFunciones.resaltartelefonoActividadEconomica);}
		if(this.actividadeconomicaConstantesFunciones.resaltaringreso_netoActividadEconomica!=null && this.jInternalFrameDetalleFormActividadEconomica!=null) {this.jInternalFrameDetalleFormActividadEconomica.jTextFieldingreso_netoActividadEconomica.setBorder(this.actividadeconomicaConstantesFunciones.resaltaringreso_netoActividadEconomica);}
		if(this.actividadeconomicaConstantesFunciones.resaltaringreso_brutoActividadEconomica!=null && this.jInternalFrameDetalleFormActividadEconomica!=null) {this.jInternalFrameDetalleFormActividadEconomica.jTextFieldingreso_brutoActividadEconomica.setBorder(this.actividadeconomicaConstantesFunciones.resaltaringreso_brutoActividadEconomica);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioActividadEconomica() throws Exception {		
		if(this.jInternalFrameDetalleFormActividadEconomica==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
	
		//this.jInternalFrameDetalleFormActividadEconomica.jLabelidActividadEconomica.setVisible(this.actividadeconomicaConstantesFunciones.mostraridActividadEconomica);
		this.jInternalFrameDetalleFormActividadEconomica.jPanelidActividadEconomica.setVisible(this.actividadeconomicaConstantesFunciones.mostraridActividadEconomica);
		//this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_empresaActividadEconomica.setVisible(this.actividadeconomicaConstantesFunciones.mostrarid_empresaActividadEconomica);
		this.jInternalFrameDetalleFormActividadEconomica.jPanelid_empresaActividadEconomica.setVisible(this.actividadeconomicaConstantesFunciones.mostrarid_empresaActividadEconomica);
		//this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_clienteActividadEconomica.setVisible(this.actividadeconomicaConstantesFunciones.mostrarid_clienteActividadEconomica);
		this.jInternalFrameDetalleFormActividadEconomica.jPanelid_clienteActividadEconomica.setVisible(this.actividadeconomicaConstantesFunciones.mostrarid_clienteActividadEconomica);
			this.jInternalFrameDetalleFormActividadEconomica.jButtonid_clienteActividadEconomica.setVisible(this.actividadeconomicaConstantesFunciones.mostrarid_clienteActividadEconomica);
		//this.jInternalFrameDetalleFormActividadEconomica.jTextAreanombre_negocioActividadEconomica.setVisible(this.actividadeconomicaConstantesFunciones.mostrarnombre_negocioActividadEconomica);
		this.jInternalFrameDetalleFormActividadEconomica.jPanelnombre_negocioActividadEconomica.setVisible(this.actividadeconomicaConstantesFunciones.mostrarnombre_negocioActividadEconomica);
		//this.jInternalFrameDetalleFormActividadEconomica.jTextAreaactividadActividadEconomica.setVisible(this.actividadeconomicaConstantesFunciones.mostraractividadActividadEconomica);
		this.jInternalFrameDetalleFormActividadEconomica.jPanelactividadActividadEconomica.setVisible(this.actividadeconomicaConstantesFunciones.mostraractividadActividadEconomica);
		//this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_paisActividadEconomica.setVisible(this.actividadeconomicaConstantesFunciones.mostrarid_paisActividadEconomica);
		this.jInternalFrameDetalleFormActividadEconomica.jPanelid_paisActividadEconomica.setVisible(this.actividadeconomicaConstantesFunciones.mostrarid_paisActividadEconomica);
		//this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_ciudadActividadEconomica.setVisible(this.actividadeconomicaConstantesFunciones.mostrarid_ciudadActividadEconomica);
		this.jInternalFrameDetalleFormActividadEconomica.jPanelid_ciudadActividadEconomica.setVisible(this.actividadeconomicaConstantesFunciones.mostrarid_ciudadActividadEconomica);
		//this.jInternalFrameDetalleFormActividadEconomica.jTextAreadireccionActividadEconomica.setVisible(this.actividadeconomicaConstantesFunciones.mostrardireccionActividadEconomica);
		this.jInternalFrameDetalleFormActividadEconomica.jPaneldireccionActividadEconomica.setVisible(this.actividadeconomicaConstantesFunciones.mostrardireccionActividadEconomica);
		//this.jInternalFrameDetalleFormActividadEconomica.jTextAreatelefonoActividadEconomica.setVisible(this.actividadeconomicaConstantesFunciones.mostrartelefonoActividadEconomica);
		this.jInternalFrameDetalleFormActividadEconomica.jPaneltelefonoActividadEconomica.setVisible(this.actividadeconomicaConstantesFunciones.mostrartelefonoActividadEconomica);
		//this.jInternalFrameDetalleFormActividadEconomica.jTextFieldingreso_netoActividadEconomica.setVisible(this.actividadeconomicaConstantesFunciones.mostraringreso_netoActividadEconomica);
		this.jInternalFrameDetalleFormActividadEconomica.jPanelingreso_netoActividadEconomica.setVisible(this.actividadeconomicaConstantesFunciones.mostraringreso_netoActividadEconomica);
		//this.jInternalFrameDetalleFormActividadEconomica.jTextFieldingreso_brutoActividadEconomica.setVisible(this.actividadeconomicaConstantesFunciones.mostraringreso_brutoActividadEconomica);
		this.jInternalFrameDetalleFormActividadEconomica.jPanelingreso_brutoActividadEconomica.setVisible(this.actividadeconomicaConstantesFunciones.mostraringreso_brutoActividadEconomica);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioActividadEconomica() throws Exception {
		if(this.jInternalFrameDetalleFormActividadEconomica==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormActividadEconomica!=null) {
	
		this.jInternalFrameDetalleFormActividadEconomica.jLabelidActividadEconomica.setEnabled(this.actividadeconomicaConstantesFunciones.activaridActividadEconomica);
		this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_empresaActividadEconomica.setEnabled(this.actividadeconomicaConstantesFunciones.activarid_empresaActividadEconomica);
		this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_clienteActividadEconomica.setEnabled(this.actividadeconomicaConstantesFunciones.activarid_clienteActividadEconomica);
			this.jInternalFrameDetalleFormActividadEconomica.jButtonid_clienteActividadEconomica.setEnabled(this.actividadeconomicaConstantesFunciones.activarid_clienteActividadEconomica);
		this.jInternalFrameDetalleFormActividadEconomica.jTextAreanombre_negocioActividadEconomica.setEnabled(this.actividadeconomicaConstantesFunciones.activarnombre_negocioActividadEconomica);
		this.jInternalFrameDetalleFormActividadEconomica.jTextAreaactividadActividadEconomica.setEnabled(this.actividadeconomicaConstantesFunciones.activaractividadActividadEconomica);
		this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_paisActividadEconomica.setEnabled(this.actividadeconomicaConstantesFunciones.activarid_paisActividadEconomica);
		this.jInternalFrameDetalleFormActividadEconomica.jComboBoxid_ciudadActividadEconomica.setEnabled(this.actividadeconomicaConstantesFunciones.activarid_ciudadActividadEconomica);
		this.jInternalFrameDetalleFormActividadEconomica.jTextAreadireccionActividadEconomica.setEnabled(this.actividadeconomicaConstantesFunciones.activardireccionActividadEconomica);
		this.jInternalFrameDetalleFormActividadEconomica.jTextAreatelefonoActividadEconomica.setEnabled(this.actividadeconomicaConstantesFunciones.activartelefonoActividadEconomica);
		this.jInternalFrameDetalleFormActividadEconomica.jTextFieldingreso_netoActividadEconomica.setEnabled(this.actividadeconomicaConstantesFunciones.activaringreso_netoActividadEconomica);
		this.jInternalFrameDetalleFormActividadEconomica.jTextFieldingreso_brutoActividadEconomica.setEnabled(this.actividadeconomicaConstantesFunciones.activaringreso_brutoActividadEconomica);
		}
	}
	
		
}