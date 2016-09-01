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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.inventario.util.AutorizarRequisicionesConstantesFunciones;
import com.bydan.erp.inventario.util.report.AutorizarRequisicionesParameterReturnGeneral;
//import com.bydan.erp.inventario.util.report.AutorizarRequisicionesParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.report.AutorizarRequisicionesBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.inventario.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.inventario.util.*;

import com.bydan.erp.inventario.util.report.*;
import com.bydan.erp.inventario.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.business.entity.report.*;
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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;

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
public class AutorizarRequisicionesBeanSwingJInternalFrame extends AutorizarRequisicionesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(AutorizarRequisicionesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<AutorizarRequisiciones> autorizarrequisicionesValidator = new ClassValidator<AutorizarRequisiciones>(AutorizarRequisiciones.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public AutorizarRequisiciones autorizarrequisiciones;	
	public AutorizarRequisiciones autorizarrequisicionesAux;
	public AutorizarRequisiciones autorizarrequisicionesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public AutorizarRequisiciones autorizarrequisicionesTotales;
	public Long idAutorizarRequisicionesActual;
	public Long iIdNuevoAutorizarRequisiciones=0L;
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

	public String sFinalQueryComboSucursal="";

	public List<Sucursal> sucursalsForeignKey;

	public List<Sucursal> getsucursalsForeignKey() {
		return sucursalsForeignKey;
	}

	public void setsucursalsForeignKey(List<Sucursal> sucursalsForeignKey) {
		this.sucursalsForeignKey = sucursalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sucursal sucursalForeignKey;

	public Sucursal getsucursalForeignKey() {
		return sucursalForeignKey;
	}

	public void setsucursalForeignKey(Sucursal sucursalForeignKey) {
		this.sucursalForeignKey = sucursalForeignKey;
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
	
	public Boolean isPermisoTodoAutorizarRequisiciones;
	public Boolean isPermisoNuevoAutorizarRequisiciones;
	public Boolean isPermisoActualizarAutorizarRequisiciones;
	public Boolean isPermisoActualizarOriginalAutorizarRequisiciones;
	public Boolean isPermisoEliminarAutorizarRequisiciones;
	public Boolean isPermisoGuardarCambiosAutorizarRequisiciones;
	public Boolean isPermisoConsultaAutorizarRequisiciones;
	public Boolean isPermisoBusquedaAutorizarRequisiciones;
	public Boolean isPermisoReporteAutorizarRequisiciones;
	public Boolean isPermisoPaginacionMedioAutorizarRequisiciones;
	public Boolean isPermisoPaginacionAltoAutorizarRequisiciones;
	public Boolean isPermisoPaginacionTodoAutorizarRequisiciones;
	public Boolean isPermisoCopiarAutorizarRequisiciones;
	public Boolean isPermisoVerFormAutorizarRequisiciones;
	public Boolean isPermisoDuplicarAutorizarRequisiciones;
	public Boolean isPermisoOrdenAutorizarRequisiciones;
	
	
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
	
	public AutorizarRequisicionesParameterReturnGeneral autorizarrequisicionesReturnGeneral;
	public AutorizarRequisicionesParameterReturnGeneral autorizarrequisicionesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoAutorizarRequisiciones=false;
	public Boolean esParaAccionDesdeFormularioAutorizarRequisiciones=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected AutorizarRequisicionesSessionBeanAdditional autorizarrequisicionesSessionBeanAdditional=null;
	
	public AutorizarRequisicionesSessionBeanAdditional getAutorizarRequisicionesSessionBeanAdditional() {
		return this.autorizarrequisicionesSessionBeanAdditional;
	}
	
	public void setAutorizarRequisicionesSessionBeanAdditional(AutorizarRequisicionesSessionBeanAdditional autorizarrequisicionesSessionBeanAdditional) {
		try {
			this.autorizarrequisicionesSessionBeanAdditional=autorizarrequisicionesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected AutorizarRequisicionesBeanSwingJInternalFrameAdditional autorizarrequisicionesBeanSwingJInternalFrameAdditional=null;
	//public class AutorizarRequisicionesBeanSwingJInternalFrame
	
	public AutorizarRequisicionesBeanSwingJInternalFrameAdditional getAutorizarRequisicionesBeanSwingJInternalFrameAdditional() {
		return this.autorizarrequisicionesBeanSwingJInternalFrameAdditional;
	}
	
	public void setAutorizarRequisicionesBeanSwingJInternalFrameAdditional(AutorizarRequisicionesBeanSwingJInternalFrameAdditional autorizarrequisicionesBeanSwingJInternalFrameAdditional) {
		try {
			this.autorizarrequisicionesBeanSwingJInternalFrameAdditional=autorizarrequisicionesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public AutorizarRequisicionesLogic autorizarrequisicionesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public AutorizarRequisiciones autorizarrequisicionesBean;
	public AutorizarRequisicionesConstantesFunciones autorizarrequisicionesConstantesFunciones;
	//public AutorizarRequisicionesParameterReturnGeneral autorizarrequisicionesReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	
	//PARAMETROS
	
	
	//public List<AutorizarRequisiciones> autorizarrequisicioness;	
	//public List<AutorizarRequisiciones> autorizarrequisicionessEliminados;
	//public List<AutorizarRequisiciones> autorizarrequisicionessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoAutorizarRequisiciones=false;
	public Boolean isVisibilidadCeldaDuplicarAutorizarRequisiciones=true;
	public Boolean isVisibilidadCeldaCopiarAutorizarRequisiciones=true;
	public Boolean isVisibilidadCeldaVerFormAutorizarRequisiciones=true;
	public Boolean isVisibilidadCeldaOrdenAutorizarRequisiciones=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesAutorizarRequisiciones=false;
	public Boolean isVisibilidadCeldaModificarAutorizarRequisiciones=false;
	public Boolean isVisibilidadCeldaActualizarAutorizarRequisiciones=false;
	public Boolean isVisibilidadCeldaEliminarAutorizarRequisiciones=false;
	public Boolean isVisibilidadCeldaCancelarAutorizarRequisiciones=false;
	public Boolean isVisibilidadCeldaGuardarAutorizarRequisiciones=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosAutorizarRequisiciones=false;	
	
	
	public Boolean isVisibilidadBusquedaAutorizarRequisiciones=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoAutorizarRequisiciones() {
		return this.iIdNuevoAutorizarRequisiciones;
	}

	public void setiIdNuevoAutorizarRequisiciones(Long iIdNuevoAutorizarRequisiciones) {
		this.iIdNuevoAutorizarRequisiciones = iIdNuevoAutorizarRequisiciones;
	}
	
	public Long getidAutorizarRequisicionesActual() {
		return this.idAutorizarRequisicionesActual;
	}

	public void setidAutorizarRequisicionesActual(Long idAutorizarRequisicionesActual) {
		this.idAutorizarRequisicionesActual = idAutorizarRequisicionesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public AutorizarRequisiciones getautorizarrequisiciones() {
		return this.autorizarrequisiciones;
	}

	public void setautorizarrequisiciones(AutorizarRequisiciones autorizarrequisiciones) {
		this.autorizarrequisiciones = autorizarrequisiciones;
	}
	
	public AutorizarRequisiciones getautorizarrequisicionesAux() {
		return this.autorizarrequisicionesAux;
	}

	public void setautorizarrequisicionesAux(AutorizarRequisiciones autorizarrequisicionesAux) {
		this.autorizarrequisicionesAux = autorizarrequisicionesAux;
	}				
	
	public AutorizarRequisiciones getautorizarrequisicionesAnterior() {
		return this.autorizarrequisicionesAnterior;
	}

	public void setautorizarrequisicionesAnterior(AutorizarRequisiciones autorizarrequisicionesAnterior) {
		this.autorizarrequisicionesAnterior = autorizarrequisicionesAnterior;
	}	
	
	public AutorizarRequisiciones getautorizarrequisicionesTotales() {
		return this.autorizarrequisicionesTotales;
	}

	public void setautorizarrequisicionesTotales(AutorizarRequisiciones autorizarrequisicionesTotales) {
		this.autorizarrequisicionesTotales = autorizarrequisicionesTotales;
	}	
	
	public AutorizarRequisiciones getautorizarrequisicionesBean() {
		return this.autorizarrequisicionesBean;
	}

	public void setautorizarrequisicionesBean(AutorizarRequisiciones autorizarrequisicionesBean) {
		this.autorizarrequisicionesBean = autorizarrequisicionesBean;
	}	
	
	public AutorizarRequisicionesParameterReturnGeneral getautorizarrequisicionesReturnGeneral() {
		return this.autorizarrequisicionesReturnGeneral;
	}

	public void setautorizarrequisicionesReturnGeneral(AutorizarRequisicionesParameterReturnGeneral autorizarrequisicionesReturnGeneral) {
		this.autorizarrequisicionesReturnGeneral = autorizarrequisicionesReturnGeneral;
	}	
	
	
	public Date fecha_desdeBusquedaAutorizarRequisiciones=new Date();

	public Date getfecha_desdeBusquedaAutorizarRequisiciones() {
		return this.fecha_desdeBusquedaAutorizarRequisiciones;
	}

	public void setfecha_desdeBusquedaAutorizarRequisiciones(Date fecha_desdeBusquedaAutorizarRequisiciones) {
		this.fecha_desdeBusquedaAutorizarRequisiciones = fecha_desdeBusquedaAutorizarRequisiciones;
	}

;
	public Date fecha_hastaBusquedaAutorizarRequisiciones=new Date();

	public Date getfecha_hastaBusquedaAutorizarRequisiciones() {
		return this.fecha_hastaBusquedaAutorizarRequisiciones;
	}

	public void setfecha_hastaBusquedaAutorizarRequisiciones(Date fecha_hastaBusquedaAutorizarRequisiciones) {
		this.fecha_hastaBusquedaAutorizarRequisiciones = fecha_hastaBusquedaAutorizarRequisiciones;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public AutorizarRequisicionesLogic getAutorizarRequisicionesLogic()	{		
		return autorizarrequisicionesLogic;
	}

	public void setAutorizarRequisicionesLogic(AutorizarRequisicionesLogic autorizarrequisicionesLogic) {
		this.autorizarrequisicionesLogic = autorizarrequisicionesLogic;
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
	
	public Boolean getIsEsNuevoAutorizarRequisiciones() {
		return isEsNuevoAutorizarRequisiciones;
	}

	public void setIsEsNuevoAutorizarRequisiciones(Boolean isEsNuevoAutorizarRequisiciones) {
		this.isEsNuevoAutorizarRequisiciones = isEsNuevoAutorizarRequisiciones;
	}

	public Boolean getEsParaAccionDesdeFormularioAutorizarRequisiciones() {
		return esParaAccionDesdeFormularioAutorizarRequisiciones;
	}
	
	public void setEsParaAccionDesdeFormularioAutorizarRequisiciones(Boolean esParaAccionDesdeFormularioAutorizarRequisiciones) {
		this.esParaAccionDesdeFormularioAutorizarRequisiciones = esParaAccionDesdeFormularioAutorizarRequisiciones;
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

			if(this.autorizarrequisicionesSessionBean==null) {
				this.autorizarrequisicionesSessionBean=new AutorizarRequisicionesSessionBean();
			}

			if(!this.autorizarrequisicionesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(autorizarrequisicionesSessionBean.getlidEmpresaActual());
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

	public void cargarCombosSucursalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sucursalsForeignKey=new ArrayList<Sucursal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SucursalLogic sucursalLogic=new SucursalLogic();

			//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

			if(this.autorizarrequisicionesSessionBean==null) {
				this.autorizarrequisicionesSessionBean=new AutorizarRequisicionesSessionBean();
			}

			if(!this.autorizarrequisicionesSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

					sucursalLogic.getTodosSucursalsWithConnection(sFinalQuery,new Pagination());

					this.sucursalsForeignKey=sucursalLogic.getSucursals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSucursal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getEntityWithConnection(autorizarrequisicionesSessionBean.getlidSucursalActual());
					this.sucursalsForeignKey.add(sucursalLogic.getSucursal());
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

					if(this.autorizarrequisiciones!=null) {
						this.autorizarrequisiciones.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {
						this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxid_empresaAutorizarRequisiciones.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaAutorizarRequisiciones.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {
						if(this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxid_empresaAutorizarRequisiciones.getItemCount()>0) {
							this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxid_empresaAutorizarRequisiciones.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaAutorizarRequisicionesGenerico)throws Exception
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
				jComboBoxid_empresaAutorizarRequisicionesGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaAutorizarRequisicionesGenerico!=null && jComboBoxid_empresaAutorizarRequisicionesGenerico.getItemCount()>0) {
					jComboBoxid_empresaAutorizarRequisicionesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSucursalForeignKey(Long idSucursalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sucursalTemp!=null) {

					if(this.autorizarrequisiciones!=null) {
						this.autorizarrequisiciones.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {
						this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxid_sucursalAutorizarRequisiciones.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalAutorizarRequisiciones.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {
						if(this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxid_sucursalAutorizarRequisiciones.getItemCount()>0) {
							this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxid_sucursalAutorizarRequisiciones.setSelectedIndex(0);
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

	public String getActualSucursalForeignKeyDescripcion(Long idSucursalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}


			sDescripcion=SucursalConstantesFunciones.getSucursalDescripcion(sucursalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalAutorizarRequisicionesGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sucursalTemp!=null) {
				jComboBoxid_sucursalAutorizarRequisicionesGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalAutorizarRequisicionesGenerico!=null && jComboBoxid_sucursalAutorizarRequisicionesGenerico.getItemCount()>0) {
					jComboBoxid_sucursalAutorizarRequisicionesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(AutorizarRequisiciones autorizarrequisiciones,JComboBox jComboBoxid_empresaAutorizarRequisicionesGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaAutorizarRequisicionesGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxid_empresaAutorizarRequisiciones.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaAutorizarRequisicionesGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				autorizarrequisiciones.setid_empresa(empresaAux.getId());
				autorizarrequisiciones.setempresa_descripcion(AutorizarRequisicionesConstantesFunciones.getEmpresaDescripcion(empresaAux));
				autorizarrequisiciones.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(AutorizarRequisiciones autorizarrequisiciones,JComboBox jComboBoxid_sucursalAutorizarRequisicionesGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalAutorizarRequisicionesGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxid_sucursalAutorizarRequisiciones.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalAutorizarRequisicionesGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				autorizarrequisiciones.setid_sucursal(sucursalAux.getId());
				autorizarrequisiciones.setsucursal_descripcion(AutorizarRequisicionesConstantesFunciones.getSucursalDescripcion(sucursalAux));
				autorizarrequisiciones.setSucursal(sucursalAux);			}
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

					if(!AutorizarRequisicionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) { 
							this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxid_empresaAutorizarRequisiciones.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxid_empresaAutorizarRequisiciones.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) { 
					}

					if(!AutorizarRequisicionesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSucursalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSucursal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!AutorizarRequisicionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) { 
							this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxid_sucursalAutorizarRequisiciones.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxid_sucursalAutorizarRequisiciones.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) { 
					}

					if(!AutorizarRequisicionesJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {
							this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxid_empresaAutorizarRequisiciones.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {
							this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxid_empresaAutorizarRequisiciones.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameSucursalForeignKey(Sucursal sucursal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {
							this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxid_sucursalAutorizarRequisiciones.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {
							this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxid_sucursalAutorizarRequisiciones.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesAutorizarRequisiciones() throws Exception {
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
		
	public AutorizarRequisicionesParameterReturnGeneral getAutorizarRequisicionesParameterGeneral() {
		return this.autorizarrequisicionesParameterGeneral;
	}
	
	public void setAutorizarRequisicionesParameterGeneral(AutorizarRequisicionesParameterReturnGeneral autorizarrequisicionesParameterGeneral) {
		this.autorizarrequisicionesParameterGeneral = autorizarrequisicionesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoAutorizarRequisiciones() {
		return isPermisoTodoAutorizarRequisiciones;
	}

	public void setIsPermisoTodoAutorizarRequisiciones(Boolean isPermisoTodoAutorizarRequisiciones) {
		this.isPermisoTodoAutorizarRequisiciones = isPermisoTodoAutorizarRequisiciones;
	}

	public Boolean getIsPermisoNuevoAutorizarRequisiciones() {
		return isPermisoNuevoAutorizarRequisiciones;
	}

	public void setIsPermisoNuevoAutorizarRequisiciones(Boolean isPermisoNuevoAutorizarRequisiciones) {
		this.isPermisoNuevoAutorizarRequisiciones = isPermisoNuevoAutorizarRequisiciones;
	}

	public Boolean getIsPermisoActualizarAutorizarRequisiciones() {
		return isPermisoActualizarAutorizarRequisiciones;
	}

	public void setIsPermisoActualizarAutorizarRequisiciones(Boolean isPermisoActualizarAutorizarRequisiciones) {
		this.isPermisoActualizarAutorizarRequisiciones = isPermisoActualizarAutorizarRequisiciones;
	}

	public Boolean getIsPermisoEliminarAutorizarRequisiciones() {
		return isPermisoEliminarAutorizarRequisiciones;
	}

	public void setIsPermisoEliminarAutorizarRequisiciones(Boolean isPermisoEliminarAutorizarRequisiciones) {
		this.isPermisoEliminarAutorizarRequisiciones = isPermisoEliminarAutorizarRequisiciones;
	}

	public Boolean getIsPermisoGuardarCambiosAutorizarRequisiciones() {
		return isPermisoGuardarCambiosAutorizarRequisiciones;
	}

	public void setIsPermisoGuardarCambiosAutorizarRequisiciones(Boolean isPermisoGuardarCambiosAutorizarRequisiciones) {
		this.isPermisoGuardarCambiosAutorizarRequisiciones = isPermisoGuardarCambiosAutorizarRequisiciones;
	}
	
	public Boolean getIsPermisoConsultaAutorizarRequisiciones() {
		return isPermisoConsultaAutorizarRequisiciones;
	}

	public void setIsPermisoConsultaAutorizarRequisiciones(Boolean isPermisoConsultaAutorizarRequisiciones) {
		this.isPermisoConsultaAutorizarRequisiciones = isPermisoConsultaAutorizarRequisiciones;
	}

	public Boolean getIsPermisoBusquedaAutorizarRequisiciones() {
		return isPermisoBusquedaAutorizarRequisiciones;
	}

	public void setIsPermisoBusquedaAutorizarRequisiciones(Boolean isPermisoBusquedaAutorizarRequisiciones) {
		this.isPermisoBusquedaAutorizarRequisiciones = isPermisoBusquedaAutorizarRequisiciones;
	}

	public Boolean getIsPermisoReporteAutorizarRequisiciones() {
		return isPermisoReporteAutorizarRequisiciones;
	}

	public void setIsPermisoReporteAutorizarRequisiciones(Boolean isPermisoReporteAutorizarRequisiciones) {
		this.isPermisoReporteAutorizarRequisiciones = isPermisoReporteAutorizarRequisiciones;
	}
	
	public Boolean getIsPermisoPaginacionMedioAutorizarRequisiciones() {
		return isPermisoPaginacionMedioAutorizarRequisiciones;
	}

	public void setIsPermisoPaginacionMedioAutorizarRequisiciones(Boolean isPermisoPaginacionMedioAutorizarRequisiciones) {
		this.isPermisoPaginacionMedioAutorizarRequisiciones = isPermisoPaginacionMedioAutorizarRequisiciones;
	}
	
	public Boolean getIsPermisoPaginacionTodoAutorizarRequisiciones() {
		return isPermisoPaginacionTodoAutorizarRequisiciones;
	}

	public void setIsPermisoPaginacionTodoAutorizarRequisiciones(Boolean isPermisoPaginacionTodoAutorizarRequisiciones) {
		this.isPermisoPaginacionTodoAutorizarRequisiciones = isPermisoPaginacionTodoAutorizarRequisiciones;
	}
	
	public Boolean getIsPermisoPaginacionAltoAutorizarRequisiciones() {
		return isPermisoPaginacionAltoAutorizarRequisiciones;
	}

	public void setIsPermisoPaginacionAltoAutorizarRequisiciones(Boolean isPermisoPaginacionAltoAutorizarRequisiciones) {
		this.isPermisoPaginacionAltoAutorizarRequisiciones = isPermisoPaginacionAltoAutorizarRequisiciones;
	}
	
	public Boolean getIsPermisoCopiarAutorizarRequisiciones() {
		return isPermisoCopiarAutorizarRequisiciones;
	}

	public void setIsPermisoCopiarAutorizarRequisiciones(Boolean isPermisoCopiarAutorizarRequisiciones) {
		this.isPermisoCopiarAutorizarRequisiciones = isPermisoCopiarAutorizarRequisiciones;
	}
	
	public Boolean getIsPermisoVerFormAutorizarRequisiciones() {
		return isPermisoVerFormAutorizarRequisiciones;
	}

	public void setIsPermisoVerFormAutorizarRequisiciones(Boolean isPermisoVerFormAutorizarRequisiciones) {
		this.isPermisoVerFormAutorizarRequisiciones = isPermisoVerFormAutorizarRequisiciones;
	}
	
	public Boolean getIsPermisoDuplicarAutorizarRequisiciones() {
		return isPermisoDuplicarAutorizarRequisiciones;
	}

	public void setIsPermisoDuplicarAutorizarRequisiciones(Boolean isPermisoDuplicarAutorizarRequisiciones) {
		this.isPermisoDuplicarAutorizarRequisiciones = isPermisoDuplicarAutorizarRequisiciones;
	}
	
	public Boolean getIsPermisoOrdenAutorizarRequisiciones() {
		return isPermisoOrdenAutorizarRequisiciones;
	}

	public void setIsPermisoOrdenAutorizarRequisiciones(Boolean isPermisoOrdenAutorizarRequisiciones) {
		this.isPermisoOrdenAutorizarRequisiciones = isPermisoOrdenAutorizarRequisiciones;
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
	
	public Boolean getIsVisibilidadCeldaNuevoAutorizarRequisiciones() {
		return isVisibilidadCeldaNuevoAutorizarRequisiciones;
	}

	public void setIsVisibilidadCeldaNuevoAutorizarRequisiciones(Boolean isVisibilidadCeldaNuevoAutorizarRequisiciones) {
		this.isVisibilidadCeldaNuevoAutorizarRequisiciones = isVisibilidadCeldaNuevoAutorizarRequisiciones;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarAutorizarRequisiciones() {
		return isVisibilidadCeldaDuplicarAutorizarRequisiciones;
	}

	public void setIsVisibilidadCeldaDuplicarAutorizarRequisiciones(Boolean isVisibilidadCeldaDuplicarAutorizarRequisiciones) {
		this.isVisibilidadCeldaDuplicarAutorizarRequisiciones = isVisibilidadCeldaDuplicarAutorizarRequisiciones;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarAutorizarRequisiciones() {
		return isVisibilidadCeldaCopiarAutorizarRequisiciones;
	}

	public void setIsVisibilidadCeldaCopiarAutorizarRequisiciones(Boolean isVisibilidadCeldaCopiarAutorizarRequisiciones) {
		this.isVisibilidadCeldaCopiarAutorizarRequisiciones = isVisibilidadCeldaCopiarAutorizarRequisiciones;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormAutorizarRequisiciones() {
		return isVisibilidadCeldaVerFormAutorizarRequisiciones;
	}

	public void setIsVisibilidadCeldaVerFormAutorizarRequisiciones(Boolean isVisibilidadCeldaVerFormAutorizarRequisiciones) {
		this.isVisibilidadCeldaVerFormAutorizarRequisiciones = isVisibilidadCeldaVerFormAutorizarRequisiciones;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenAutorizarRequisiciones() {
		return isVisibilidadCeldaOrdenAutorizarRequisiciones;
	}

	public void setIsVisibilidadCeldaOrdenAutorizarRequisiciones(Boolean isVisibilidadCeldaOrdenAutorizarRequisiciones) {
		this.isVisibilidadCeldaOrdenAutorizarRequisiciones = isVisibilidadCeldaOrdenAutorizarRequisiciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesAutorizarRequisiciones() {
		return isVisibilidadCeldaNuevoRelacionesAutorizarRequisiciones;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesAutorizarRequisiciones(Boolean isVisibilidadCeldaNuevoRelacionesAutorizarRequisiciones) {
		this.isVisibilidadCeldaNuevoRelacionesAutorizarRequisiciones = isVisibilidadCeldaNuevoRelacionesAutorizarRequisiciones;
	}
	
	public Boolean getIsVisibilidadCeldaModificarAutorizarRequisiciones() {
		return isVisibilidadCeldaModificarAutorizarRequisiciones;
	}

	public void setIsVisibilidadCeldaModificarAutorizarRequisiciones(Boolean isVisibilidadCeldaModificarAutorizarRequisiciones) {
		this.isVisibilidadCeldaModificarAutorizarRequisiciones = isVisibilidadCeldaModificarAutorizarRequisiciones;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarAutorizarRequisiciones() {
		return isVisibilidadCeldaActualizarAutorizarRequisiciones;
	}

	public void setIsVisibilidadCeldaActualizarAutorizarRequisiciones(Boolean isVisibilidadCeldaActualizarAutorizarRequisiciones) {
		this.isVisibilidadCeldaActualizarAutorizarRequisiciones = isVisibilidadCeldaActualizarAutorizarRequisiciones;
	}

	public Boolean getIsVisibilidadCeldaEliminarAutorizarRequisiciones() {
		return isVisibilidadCeldaEliminarAutorizarRequisiciones;
	}

	public void setIsVisibilidadCeldaEliminarAutorizarRequisiciones(Boolean isVisibilidadCeldaEliminarAutorizarRequisiciones) {
		this.isVisibilidadCeldaEliminarAutorizarRequisiciones = isVisibilidadCeldaEliminarAutorizarRequisiciones;
	}

	public Boolean getIsVisibilidadCeldaCancelarAutorizarRequisiciones() {
		return isVisibilidadCeldaCancelarAutorizarRequisiciones;
	}

	public void setIsVisibilidadCeldaCancelarAutorizarRequisiciones(Boolean isVisibilidadCeldaCancelarAutorizarRequisiciones) {
		this.isVisibilidadCeldaCancelarAutorizarRequisiciones = isVisibilidadCeldaCancelarAutorizarRequisiciones;
	}

	public Boolean getIsVisibilidadCeldaGuardarAutorizarRequisiciones() {
		return isVisibilidadCeldaGuardarAutorizarRequisiciones;
	}

	public void setIsVisibilidadCeldaGuardarAutorizarRequisiciones(Boolean isVisibilidadCeldaGuardarAutorizarRequisiciones) {
		this.isVisibilidadCeldaGuardarAutorizarRequisiciones = isVisibilidadCeldaGuardarAutorizarRequisiciones;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosAutorizarRequisiciones() {
		return isVisibilidadCeldaGuardarCambiosAutorizarRequisiciones;
	}

	public void setIsVisibilidadCeldaGuardarCambiosAutorizarRequisiciones(Boolean isVisibilidadCeldaGuardarCambiosAutorizarRequisiciones) {
		this.isVisibilidadCeldaGuardarCambiosAutorizarRequisiciones = isVisibilidadCeldaGuardarCambiosAutorizarRequisiciones;
	}
		
	public AutorizarRequisicionesSessionBean getautorizarrequisicionesSessionBean() {
		return this.autorizarrequisicionesSessionBean;
	}
	
	public void setautorizarrequisicionesSessionBean(AutorizarRequisicionesSessionBean autorizarrequisicionesSessionBean) {
		this.autorizarrequisicionesSessionBean=autorizarrequisicionesSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaAutorizarRequisiciones() {
		return this.isVisibilidadBusquedaAutorizarRequisiciones;
	}

	public void setisVisibilidadBusquedaAutorizarRequisiciones(Boolean isVisibilidadBusquedaAutorizarRequisiciones) {
		this.isVisibilidadBusquedaAutorizarRequisiciones=isVisibilidadBusquedaAutorizarRequisiciones;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(AutorizarRequisiciones autorizarrequisiciones)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(autorizarrequisiciones,null);
				this.setActualParaGuardarSucursalForeignKey(autorizarrequisiciones,null);
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
	
	public void bugActualizarReferenciaActual(AutorizarRequisiciones autorizarrequisiciones,AutorizarRequisiciones autorizarrequisicionesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalAutorizarRequisiciones(autorizarrequisiciones);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		autorizarrequisicionesAux.setId(autorizarrequisiciones.getId());
		autorizarrequisicionesAux.setVersionRow(autorizarrequisiciones.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(AutorizarRequisiciones autorizarrequisicionesLocal) throws Exception {
		
		if(this.autorizarrequisicionesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(AutorizarRequisiciones autorizarrequisicionesLocal) throws Exception {	
		if(this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				autorizarrequisicionesLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				autorizarrequisicionesLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarAutorizarRequisicionesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosAutorizarRequisiciones.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = autorizarrequisicionesValidator.getInvalidValues(this.autorizarrequisiciones);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(AutorizarRequisiciones autorizarrequisiciones,List<AutorizarRequisiciones> autorizarrequisicioness) throws Exception {
	}		
	
	public void actualizarSelectedLista(AutorizarRequisiciones autorizarrequisiciones,List<AutorizarRequisiciones> autorizarrequisicioness) throws Exception {
		try	{			
			AutorizarRequisicionesConstantesFunciones.actualizarSelectedLista(autorizarrequisiciones,autorizarrequisicioness);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<AutorizarRequisiciones> autorizarrequisicionessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				autorizarrequisicionessLocal=this.autorizarrequisicionesLogic.getAutorizarRequisicioness();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				autorizarrequisicionessLocal=this.autorizarrequisicioness;
			}
			//ARCHITECTURE
		
			for(AutorizarRequisiciones autorizarrequisicionesLocal:autorizarrequisicionessLocal) {
				if(this.permiteMantenimiento(autorizarrequisicionesLocal) && autorizarrequisicionesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+AutorizarRequisicionesConstantesFunciones.getAutorizarRequisicionesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(AutorizarRequisicionesConstantesFunciones.CODIGOTIPOREQUISICION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelcodigo_tipo_requisicionAutorizarRequisiciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutorizarRequisicionesConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelcodigoAutorizarRequisiciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutorizarRequisicionesConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelfechaAutorizarRequisiciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutorizarRequisicionesConstantesFunciones.NOMBRECOMPLETOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelnombre_completo_clienteAutorizarRequisiciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutorizarRequisicionesConstantesFunciones.NOMBREBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelnombre_bodegaAutorizarRequisiciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutorizarRequisicionesConstantesFunciones.NOMBREPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelnombre_productoAutorizarRequisiciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutorizarRequisicionesConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelcantidadAutorizarRequisiciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AutorizarRequisicionesConstantesFunciones.FECHAAUTORIZA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelfecha_autorizaAutorizarRequisiciones,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelcodigo_tipo_requisicionAutorizarRequisiciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelcodigoAutorizarRequisiciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelfechaAutorizarRequisiciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelnombre_completo_clienteAutorizarRequisiciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelnombre_bodegaAutorizarRequisiciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelnombre_productoAutorizarRequisiciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelcantidadAutorizarRequisiciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelfecha_autorizaAutorizarRequisiciones,"");
		
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
		this.iIdNuevoAutorizarRequisiciones--;	
		
		
		this.autorizarrequisicionesAux=new AutorizarRequisiciones();
		
		this.autorizarrequisicionesAux.setId(this.iIdNuevoAutorizarRequisiciones);
		this.autorizarrequisicionesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.autorizarrequisicionesLogic.getAutorizarRequisicioness().add(this.autorizarrequisicionesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.autorizarrequisicioness.add(this.autorizarrequisicionesAux);
		}
		//ARCHITECTURE
		
		this.autorizarrequisiciones=this.autorizarrequisicionesAux;
		
		if(AutorizarRequisicionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioAutorizarRequisiciones(this.autorizarrequisiciones);
			this.setVariablesObjetoActualToFormularioForeignKeyAutorizarRequisiciones(this.autorizarrequisiciones);
		}
				
		//this.setDefaultControlesAutorizarRequisiciones();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyAutorizarRequisiciones();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyAutorizarRequisiciones();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyAutorizarRequisiciones();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAutorizarRequisiciones(this.autorizarrequisicionesBean,this.autorizarrequisiciones,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanAutorizarRequisiciones(this.autorizarrequisicionesReturnGeneral,this.autorizarrequisicionesBean,false);
		
		if(this.autorizarrequisicionesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyAutorizarRequisiciones(this.autorizarrequisicionesReturnGeneral.getAutorizarRequisiciones());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioAutorizarRequisiciones(this.autorizarrequisicionesReturnGeneral.getAutorizarRequisiciones());
		}
		
		if(this.autorizarrequisicionesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioAutorizarRequisiciones(this.autorizarrequisicionesReturnGeneral.getAutorizarRequisiciones(),classes);//this.autorizarrequisicionesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.autorizarrequisiciones,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyAutorizarRequisiciones();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyAutorizarRequisiciones();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AutorizarRequisicionesBeanSwingJInternalFrameAdditional.RecargarFormAutorizarRequisiciones(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingAutorizarRequisiciones(false);
						
			if(autorizarrequisicionesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(AutorizarRequisicionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAutorizarRequisiciones();
			}
			
			this.actualizarVisualTableDatosAutorizarRequisiciones();
			
			this.jTableDatosAutorizarRequisiciones.setRowSelectionInterval(this.getIndiceNuevoAutorizarRequisiciones(), this.getIndiceNuevoAutorizarRequisiciones());
			
			this.seleccionarFilaTablaAutorizarRequisicionesActual();
						
			this.actualizarEstadoCeldasBotonesAutorizarRequisiciones("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesAutorizarRequisiciones(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jDateChooserfecha_desdeAutorizarRequisiciones.setEnabled(isHabilitar && this.autorizarrequisicionesConstantesFunciones.activarfecha_desdeAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jDateChooserfecha_hastaAutorizarRequisiciones.setEnabled(isHabilitar && this.autorizarrequisicionesConstantesFunciones.activarfecha_hastaAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextFieldcodigo_tipo_requisicionAutorizarRequisiciones.setEnabled(isHabilitar && this.autorizarrequisicionesConstantesFunciones.activarcodigo_tipo_requisicionAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextFieldcodigoAutorizarRequisiciones.setEnabled(isHabilitar && this.autorizarrequisicionesConstantesFunciones.activarcodigoAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jDateChooserfechaAutorizarRequisiciones.setEnabled(isHabilitar && this.autorizarrequisicionesConstantesFunciones.activarfechaAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextAreanombre_completo_clienteAutorizarRequisiciones.setEnabled(isHabilitar && this.autorizarrequisicionesConstantesFunciones.activarnombre_completo_clienteAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextAreanombre_bodegaAutorizarRequisiciones.setEnabled(isHabilitar && this.autorizarrequisicionesConstantesFunciones.activarnombre_bodegaAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextAreanombre_productoAutorizarRequisiciones.setEnabled(isHabilitar && this.autorizarrequisicionesConstantesFunciones.activarnombre_productoAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextFieldcantidadAutorizarRequisiciones.setEnabled(isHabilitar && this.autorizarrequisicionesConstantesFunciones.activarcantidadAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jDateChooserfecha_autorizaAutorizarRequisiciones.setEnabled(isHabilitar && this.autorizarrequisicionesConstantesFunciones.activarfecha_autorizaAutorizarRequisiciones);	
		//
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxid_empresaAutorizarRequisiciones.setEnabled(isHabilitar && this.autorizarrequisicionesConstantesFunciones.activarid_empresaAutorizarRequisiciones);//
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxid_sucursalAutorizarRequisiciones.setEnabled(isHabilitar && this.autorizarrequisicionesConstantesFunciones.activarid_sucursalAutorizarRequisiciones);
	};
	
	public void setDefaultControlesAutorizarRequisiciones() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoAutorizarRequisiciones(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.autorizarrequisicionesSessionBean.setConGuardarRelaciones(true);			
			this.autorizarrequisicionesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jTabbedPaneRelacionesAutorizarRequisiciones.setVisible(true);
			
					
		} else {
			//this.autorizarrequisicionesSessionBean.setConGuardarRelaciones(false);			
			this.autorizarrequisicionesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jTabbedPaneRelacionesAutorizarRequisiciones.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoAutorizarRequisiciones() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AutorizarRequisiciones autorizarrequisicionesAux:this.autorizarrequisicionesLogic.getAutorizarRequisicioness()) {
				if(autorizarrequisicionesAux.getId().equals(this.iIdNuevoAutorizarRequisiciones)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AutorizarRequisiciones autorizarrequisicionesAux:this.autorizarrequisicioness) {
				if(autorizarrequisicionesAux.getId().equals(this.iIdNuevoAutorizarRequisiciones)) {
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
	
	public int getIndiceActualAutorizarRequisiciones(AutorizarRequisiciones autorizarrequisiciones,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AutorizarRequisiciones autorizarrequisicionesAux:this.autorizarrequisicionesLogic.getAutorizarRequisicioness()) {
				if(autorizarrequisicionesAux.getId().equals(autorizarrequisiciones.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AutorizarRequisiciones autorizarrequisicionesAux:this.autorizarrequisicioness) {
				if(autorizarrequisicionesAux.getId().equals(autorizarrequisiciones.getId())) {
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
	
	public void setCamposBaseDesdeOriginalAutorizarRequisiciones(AutorizarRequisiciones autorizarrequisicionesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AutorizarRequisiciones autorizarrequisicionesAux:this.autorizarrequisicionesLogic.getAutorizarRequisicioness()) {
				if(autorizarrequisicionesAux.getAutorizarRequisicionesOriginal().getId().equals(autorizarrequisicionesOriginal.getId())) {
					existe=true;
					autorizarrequisicionesOriginal.setId(autorizarrequisicionesAux.getId());
					autorizarrequisicionesOriginal.setVersionRow(autorizarrequisicionesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AutorizarRequisiciones autorizarrequisicionesAux:this.autorizarrequisicioness) {
				if(autorizarrequisicionesAux.getAutorizarRequisicionesOriginal().getId().equals(autorizarrequisicionesOriginal.getId())) {
					existe=true;
					autorizarrequisicionesOriginal.setId(autorizarrequisicionesAux.getId());
					autorizarrequisicionesOriginal.setVersionRow(autorizarrequisicionesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosAutorizarRequisiciones(Boolean esParaCancelar) throws Exception {
		autorizarrequisicionessAux=new ArrayList<AutorizarRequisiciones>();
		autorizarrequisicionesAux=new AutorizarRequisiciones();
		
		if(!this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(AutorizarRequisiciones autorizarrequisicionesAux:this.autorizarrequisicionesLogic.getAutorizarRequisicioness()) {
					if(autorizarrequisicionesAux.getId()<0) {
						autorizarrequisicionessAux.add(autorizarrequisicionesAux);
					}		
				}
				this.iIdNuevoAutorizarRequisiciones=0L;
				this.autorizarrequisicionesLogic.getAutorizarRequisicioness().removeAll(autorizarrequisicionessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AutorizarRequisiciones autorizarrequisicionesAux:this.autorizarrequisicioness) {
					if(autorizarrequisicionesAux.getId()<0) {
						autorizarrequisicionessAux.add(autorizarrequisicionesAux);
					}		
				}
				this.iIdNuevoAutorizarRequisiciones=0L;
				this.autorizarrequisicioness.removeAll(autorizarrequisicionessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoAutorizarRequisiciones 
					&& this.autorizarrequisicionesLogic.getAutorizarRequisicioness().size()>0
					) {
					autorizarrequisicionesAux=this.autorizarrequisicionesLogic.getAutorizarRequisicioness().get(this.autorizarrequisicionesLogic.getAutorizarRequisicioness().size() - 1);
				
					if(autorizarrequisicionesAux.getId()<0) {
						this.autorizarrequisicionesLogic.getAutorizarRequisicioness().remove(autorizarrequisicionesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoAutorizarRequisiciones && this.autorizarrequisicioness.size()>0) {
					autorizarrequisicionesAux=this.autorizarrequisicioness.get(this.autorizarrequisicioness.size() - 1);
				
					if(autorizarrequisicionesAux.getId()<0) {
						this.autorizarrequisicioness.remove(autorizarrequisicionesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoAutorizarRequisiciones(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(autorizarrequisiciones.getId()<0) {
				this.autorizarrequisicionesLogic.getAutorizarRequisicioness().remove(this.autorizarrequisiciones);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(autorizarrequisiciones.getId()<0) {
				this.autorizarrequisicioness.remove(this.autorizarrequisiciones);
			}
		}			
	}
	
	public void setEstadosInicialesAutorizarRequisiciones(List<AutorizarRequisiciones> autorizarrequisicionessAux) throws Exception {
		AutorizarRequisicionesConstantesFunciones.setEstadosInicialesAutorizarRequisiciones(autorizarrequisicionessAux);
	}
	
	public void setEstadosInicialesAutorizarRequisiciones(AutorizarRequisiciones autorizarrequisicionesAux) throws Exception {
		AutorizarRequisicionesConstantesFunciones.setEstadosInicialesAutorizarRequisiciones(autorizarrequisicionesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarAutorizarRequisicionesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesAutorizarRequisiciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarAutorizarRequisicionesActual()) {
				if(!this.isEsNuevoAutorizarRequisiciones) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesAutorizarRequisiciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoAutorizarRequisiciones=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarAutorizarRequisicionesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Autorizar Requisiciones ?", "MANTENIMIENTO DE Autorizar Requisiciones", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesAutorizarRequisiciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(AutorizarRequisiciones autorizarrequisiciones) throws Exception {
		AutorizarRequisicionesConstantesFunciones.seleccionarAsignar(this.autorizarrequisiciones,autorizarrequisiciones);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarAutorizarRequisiciones=this.isPermisoActualizarOriginalAutorizarRequisiciones;
			
			
			this.seleccionarAsignar(autorizarrequisiciones);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesAutorizarRequisiciones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.autorizarrequisicionesSessionBean.setsFuncionBusquedaRapida(this.autorizarrequisicionesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoAutorizarRequisiciones) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosAutorizarRequisiciones(esParaCancelar);				
				this.cancelarNuevoAutorizarRequisiciones(esParaCancelar);								
			}
			
			this.autorizarrequisiciones=new AutorizarRequisiciones();
			
			this.inicializarAutorizarRequisiciones();
			
			this.actualizarEstadoCeldasBotonesAutorizarRequisiciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarAutorizarRequisiciones() throws Exception {
		try {
			AutorizarRequisicionesConstantesFunciones.inicializarAutorizarRequisiciones(this.autorizarrequisiciones);
			
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
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.autorizarrequisicionesLogic.getAutorizarRequisicioness().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteAutorizarRequisicioness(String sAccionBusqueda,List<AutorizarRequisiciones> autorizarrequisicionessParaReportes) throws Exception {
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
					sPathReporteFinal="AutorizarRequisiciones"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="AutorizarRequisicionesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("AutorizarRequisicionesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="AutorizarRequisiciones"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Autorizar Requisicioneses");		
		parameters.put("busquedapor", AutorizarRequisicionesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceAutorizarRequisiciones=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			AutorizarRequisicionesConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			AutorizarRequisicionesConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceAutorizarRequisiciones=new JRBeanArrayDataSource(AutorizarRequisicionesJInternalFrame.TraerAutorizarRequisicionesBeans(autorizarrequisicionessParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceAutorizarRequisiciones);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+AutorizarRequisicionesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+AutorizarRequisicionesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(AutorizarRequisicionesBean.TraerAutorizarRequisicionesBeans(autorizarrequisicionessParaReportes).toArray()));
							
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
				this.generarExcelReporteAutorizarRequisicioness(sAccionBusqueda,sTipoArchivoReporte,autorizarrequisicionessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalAutorizarRequisicioness(sAccionBusqueda,sTipoArchivoReporte,autorizarrequisicionessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoAutorizarRequisicionesActionPerformed(null);
					//this.generarExcelReporteAutorizarRequisicioness(sAccionBusqueda,sTipoArchivoReporte,autorizarrequisicionessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalAutorizarRequisicioness(sAccionBusqueda,sTipoArchivoReporte,autorizarrequisicionessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesAutorizarRequisicioness(sAccionBusqueda,sTipoArchivoReporte,autorizarrequisicionessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesAutorizarRequisicioness(sAccionBusqueda,sTipoArchivoReporte,autorizarrequisicionessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteAutorizarRequisicioness(String sAccionBusqueda,String sTipoArchivoReporte,List<AutorizarRequisiciones> autorizarrequisicionessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"autorizarrequisiciones";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AutorizarRequisicioness");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAutorizarRequisiciones("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(AutorizarRequisiciones autorizarrequisiciones : autorizarrequisicionessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			AutorizarRequisicionesConstantesFunciones.generarExcelReporteDataAutorizarRequisiciones("NORMAL",row,workbook,autorizarrequisiciones,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autorizar Requisiciones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderAutorizarRequisiciones(String sTipo,Row row,Workbook workbook) {
		
		AutorizarRequisicionesConstantesFunciones.generarExcelReporteHeaderAutorizarRequisiciones(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalAutorizarRequisicioness(String sAccionBusqueda,String sTipoArchivoReporte,List<AutorizarRequisiciones> autorizarrequisicionessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"autorizarrequisiciones_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AutorizarRequisicioness");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(AutorizarRequisiciones autorizarrequisiciones : autorizarrequisicionessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(AutorizarRequisicionesConstantesFunciones.getAutorizarRequisicionesDescripcion(autorizarrequisiciones));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutorizarRequisicionesConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autorizarrequisiciones.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutorizarRequisicionesConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autorizarrequisiciones.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutorizarRequisicionesConstantesFunciones.LABEL_FECHADESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_FECHADESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autorizarrequisiciones.getfecha_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutorizarRequisicionesConstantesFunciones.LABEL_FECHAHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_FECHAHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autorizarrequisiciones.getfecha_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutorizarRequisicionesConstantesFunciones.LABEL_CODIGOTIPOREQUISICION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_CODIGOTIPOREQUISICION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autorizarrequisiciones.getcodigo_tipo_requisicion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutorizarRequisicionesConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autorizarrequisiciones.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutorizarRequisicionesConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autorizarrequisiciones.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutorizarRequisicionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autorizarrequisiciones.getnombre_completo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autorizarrequisiciones.getnombre_bodega());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autorizarrequisiciones.getnombre_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutorizarRequisicionesConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autorizarrequisiciones.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AutorizarRequisicionesConstantesFunciones.LABEL_FECHAAUTORIZA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_FECHAAUTORIZA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(autorizarrequisiciones.getfecha_autoriza());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autorizar Requisiciones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesAutorizarRequisicioness(String sAccionBusqueda,String sTipoArchivoReporte,List<AutorizarRequisiciones> autorizarrequisicionessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<AutorizarRequisiciones> autorizarrequisicionessRespaldo=null;
		
		classes=AutorizarRequisicionesConstantesFunciones.getClassesRelationshipsOfAutorizarRequisiciones(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.autorizarrequisicionesLogic.setDatosCliente(this.datosCliente);
		this.autorizarrequisicionesLogic.setDatosDeep(this.datosDeep);
		this.autorizarrequisicionesLogic.setIsConDeep(true);
		
		autorizarrequisicionessRespaldo=this.autorizarrequisicionesLogic.getAutorizarRequisicioness();
		
		this.autorizarrequisicionesLogic.setAutorizarRequisicioness(autorizarrequisicionessParaReportes);	
		this.autorizarrequisicionesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		autorizarrequisicionessParaReportes=this.autorizarrequisicionesLogic.getAutorizarRequisicioness();
		this.autorizarrequisicionesLogic.setAutorizarRequisicioness(autorizarrequisicionessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"autorizarrequisiciones_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AutorizarRequisicioness");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAutorizarRequisiciones("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(AutorizarRequisiciones autorizarrequisiciones : autorizarrequisicionessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderAutorizarRequisiciones("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			AutorizarRequisicionesConstantesFunciones.generarExcelReporteDataAutorizarRequisiciones("NORMAL",row,workbook,autorizarrequisiciones,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(AutorizarRequisicionesConstantesFunciones.getAutorizarRequisicionesDescripcion(autorizarrequisiciones));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autorizar Requisiciones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessAutorizarRequisiciones() throws Exception {		
		this.startProcessAutorizarRequisiciones(true);
	}
	
	public void startProcessAutorizarRequisiciones(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasAutorizarRequisiciones ,this.jPanelParametrosReportesAutorizarRequisiciones, this.jScrollPanelDatosAutorizarRequisiciones,this.jPanelPaginacionAutorizarRequisiciones, this.jScrollPanelDatosEdicionAutorizarRequisiciones, this.jPanelAccionesAutorizarRequisiciones,this.jPanelAccionesFormularioAutorizarRequisiciones,this.jmenuBarAutorizarRequisiciones,this.jmenuBarDetalleAutorizarRequisiciones,this.jTtoolBarAutorizarRequisiciones,this.jTtoolBarDetalleAutorizarRequisiciones);		
		
		final JTabbedPane jTabbedPaneBusquedasAutorizarRequisiciones=this.jTabbedPaneBusquedasAutorizarRequisiciones; 
		
		final JPanel jPanelParametrosReportesAutorizarRequisiciones=this.jPanelParametrosReportesAutorizarRequisiciones;
		//final JScrollPane jScrollPanelDatosAutorizarRequisiciones=this.jScrollPanelDatosAutorizarRequisiciones;
		final JTable jTableDatosAutorizarRequisiciones=this.jTableDatosAutorizarRequisiciones;		
		final JPanel jPanelPaginacionAutorizarRequisiciones=this.jPanelPaginacionAutorizarRequisiciones;
		//final JScrollPane jScrollPanelDatosEdicionAutorizarRequisiciones=this.jScrollPanelDatosEdicionAutorizarRequisiciones;
		final JPanel jPanelAccionesAutorizarRequisiciones=this.jPanelAccionesAutorizarRequisiciones;
		
		JPanel jPanelCamposAuxiliarAutorizarRequisiciones=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarAutorizarRequisiciones=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {
			jPanelCamposAuxiliarAutorizarRequisiciones=this.jInternalFrameDetalleFormAutorizarRequisiciones.jPanelCamposAutorizarRequisiciones;
			jPanelAccionesFormularioAuxiliarAutorizarRequisiciones=this.jInternalFrameDetalleFormAutorizarRequisiciones.jPanelAccionesFormularioAutorizarRequisiciones;
		}
		
		final JPanel jPanelCamposAutorizarRequisiciones=jPanelCamposAuxiliarAutorizarRequisiciones;
		final JPanel jPanelAccionesFormularioAutorizarRequisiciones=jPanelAccionesFormularioAuxiliarAutorizarRequisiciones;
		
		
		final JMenuBar jmenuBarAutorizarRequisiciones=this.jmenuBarAutorizarRequisiciones;
		final JToolBar jTtoolBarAutorizarRequisiciones=this.jTtoolBarAutorizarRequisiciones;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarAutorizarRequisiciones=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAutorizarRequisiciones=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {
			jmenuBarDetalleAuxiliarAutorizarRequisiciones=this.jInternalFrameDetalleFormAutorizarRequisiciones.jmenuBarDetalleAutorizarRequisiciones;
			jTtoolBarDetalleAuxiliarAutorizarRequisiciones=this.jInternalFrameDetalleFormAutorizarRequisiciones.jTtoolBarDetalleAutorizarRequisiciones;
		}
		
		final JMenuBar jmenuBarDetalleAutorizarRequisiciones=jmenuBarDetalleAuxiliarAutorizarRequisiciones;
		final JToolBar jTtoolBarDetalleAutorizarRequisiciones=jTtoolBarDetalleAuxiliarAutorizarRequisiciones;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAutorizarRequisiciones;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAutorizarRequisiciones;
			processRunnable.jTableDatos=jTableDatosAutorizarRequisiciones;
			processRunnable.jPanelCampos=jPanelCamposAutorizarRequisiciones;
			processRunnable.jPanelPaginacion=jPanelPaginacionAutorizarRequisiciones;
			processRunnable.jPanelAcciones=jPanelAccionesAutorizarRequisiciones;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAutorizarRequisiciones;
			
			
			processRunnable.jmenuBar=jmenuBarAutorizarRequisiciones;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAutorizarRequisiciones;
			processRunnable.jTtoolBar=jTtoolBarAutorizarRequisiciones;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAutorizarRequisiciones;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAutorizarRequisiciones ,jPanelParametrosReportesAutorizarRequisiciones,jTableDatosAutorizarRequisiciones, /*jScrollPanelDatosAutorizarRequisiciones,*/jPanelCamposAutorizarRequisiciones,jPanelPaginacionAutorizarRequisiciones, /*jScrollPanelDatosEdicionAutorizarRequisiciones,*/ jPanelAccionesAutorizarRequisiciones,jPanelAccionesFormularioAutorizarRequisiciones,jmenuBarAutorizarRequisiciones,jmenuBarDetalleAutorizarRequisiciones,jTtoolBarAutorizarRequisiciones,jTtoolBarDetalleAutorizarRequisiciones);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAutorizarRequisiciones ,jPanelParametrosReportesAutorizarRequisiciones, jScrollPanelDatosAutorizarRequisiciones,jPanelPaginacionAutorizarRequisiciones, jScrollPanelDatosEdicionAutorizarRequisiciones, jPanelAccionesAutorizarRequisiciones,jPanelAccionesFormularioAutorizarRequisiciones,jmenuBarAutorizarRequisiciones,jmenuBarDetalleAutorizarRequisiciones,jTtoolBarAutorizarRequisiciones,jTtoolBarDetalleAutorizarRequisiciones);
						
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
	
	public void finishProcessAutorizarRequisiciones() {// throws Exception 
		this.finishProcessAutorizarRequisiciones(true);
	}
	
	public void finishProcessAutorizarRequisiciones(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasAutorizarRequisiciones ,this.jPanelParametrosReportesAutorizarRequisiciones, this.jScrollPanelDatosAutorizarRequisiciones,this.jPanelPaginacionAutorizarRequisiciones, this.jScrollPanelDatosEdicionAutorizarRequisiciones, this.jPanelAccionesAutorizarRequisiciones,this.jPanelAccionesFormularioAutorizarRequisiciones,this.jmenuBarAutorizarRequisiciones,this.jmenuBarDetalleAutorizarRequisiciones,this.jTtoolBarAutorizarRequisiciones,this.jTtoolBarDetalleAutorizarRequisiciones);		
		
		final JTabbedPane jTabbedPaneBusquedasAutorizarRequisiciones=this.jTabbedPaneBusquedasAutorizarRequisiciones; 
		
		final JPanel jPanelParametrosReportesAutorizarRequisiciones=this.jPanelParametrosReportesAutorizarRequisiciones;
		//final JScrollPane jScrollPanelDatosAutorizarRequisiciones=this.jScrollPanelDatosAutorizarRequisiciones;
		final JTable jTableDatosAutorizarRequisiciones=this.jTableDatosAutorizarRequisiciones;		
		final JPanel jPanelPaginacionAutorizarRequisiciones=this.jPanelPaginacionAutorizarRequisiciones;
		//final JScrollPane jScrollPanelDatosEdicionAutorizarRequisiciones=this.jScrollPanelDatosEdicionAutorizarRequisiciones;
		final JPanel jPanelAccionesAutorizarRequisiciones=this.jPanelAccionesAutorizarRequisiciones;
		
		JPanel jPanelCamposAuxiliarAutorizarRequisiciones=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarAutorizarRequisiciones=new JPanel();
		
		if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {
			jPanelCamposAuxiliarAutorizarRequisiciones=this.jInternalFrameDetalleFormAutorizarRequisiciones.jPanelCamposAutorizarRequisiciones;
			jPanelAccionesFormularioAuxiliarAutorizarRequisiciones=this.jInternalFrameDetalleFormAutorizarRequisiciones.jPanelAccionesFormularioAutorizarRequisiciones;
		}
		
		final JPanel jPanelCamposAutorizarRequisiciones=jPanelCamposAuxiliarAutorizarRequisiciones;
		final JPanel jPanelAccionesFormularioAutorizarRequisiciones=jPanelAccionesFormularioAuxiliarAutorizarRequisiciones;
		
		
		final JMenuBar jmenuBarAutorizarRequisiciones=this.jmenuBarAutorizarRequisiciones;		
		final JToolBar jTtoolBarAutorizarRequisiciones=this.jTtoolBarAutorizarRequisiciones;
				
		JMenuBar jmenuBarDetalleAuxiliarAutorizarRequisiciones=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAutorizarRequisiciones=new JToolBar();
		
		if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {
			jmenuBarDetalleAuxiliarAutorizarRequisiciones=this.jInternalFrameDetalleFormAutorizarRequisiciones.jmenuBarDetalleAutorizarRequisiciones;
			jTtoolBarDetalleAuxiliarAutorizarRequisiciones=this.jInternalFrameDetalleFormAutorizarRequisiciones.jTtoolBarDetalleAutorizarRequisiciones;		
		}
		
		final JMenuBar jmenuBarDetalleAutorizarRequisiciones=jmenuBarDetalleAuxiliarAutorizarRequisiciones;
		final JToolBar jTtoolBarDetalleAutorizarRequisiciones=jTtoolBarDetalleAuxiliarAutorizarRequisiciones;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAutorizarRequisiciones;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAutorizarRequisiciones;
			processRunnable.jTableDatos=jTableDatosAutorizarRequisiciones;
			processRunnable.jPanelCampos=jPanelCamposAutorizarRequisiciones;
			processRunnable.jPanelPaginacion=jPanelPaginacionAutorizarRequisiciones;
			processRunnable.jPanelAcciones=jPanelAccionesAutorizarRequisiciones;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAutorizarRequisiciones;
			
			
			processRunnable.jmenuBar=jmenuBarAutorizarRequisiciones;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAutorizarRequisiciones;
			processRunnable.jTtoolBar=jTtoolBarAutorizarRequisiciones;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAutorizarRequisiciones;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasAutorizarRequisiciones ,jPanelParametrosReportesAutorizarRequisiciones, jTableDatosAutorizarRequisiciones,/*jScrollPanelDatosAutorizarRequisiciones,*/jPanelCamposAutorizarRequisiciones,jPanelPaginacionAutorizarRequisiciones, /*jScrollPanelDatosEdicionAutorizarRequisiciones,*/ jPanelAccionesAutorizarRequisiciones,jPanelAccionesFormularioAutorizarRequisiciones,jmenuBarAutorizarRequisiciones,jmenuBarDetalleAutorizarRequisiciones,jTtoolBarAutorizarRequisiciones,jTtoolBarDetalleAutorizarRequisiciones));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesAutorizarRequisiciones(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarAutorizarRequisiciones(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuAutorizarRequisiciones(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarAutorizarRequisiciones(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarAutorizarRequisiciones,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleAutorizarRequisiciones,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuAutorizarRequisiciones(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarAutorizarRequisiciones,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleAutorizarRequisiciones,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.autorizarrequisicionesConstantesFunciones.getsFinalQueryAutorizarRequisiciones();
		String  finalQueryPaginacionTodos=this.autorizarrequisicionesConstantesFunciones.getsFinalQueryAutorizarRequisiciones();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=AutorizarRequisicionesConstantesFunciones.getArrayColumnasGlobalesNoAutorizarRequisiciones(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=AutorizarRequisicionesConstantesFunciones.getArrayColumnasGlobalesAutorizarRequisiciones(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,AutorizarRequisicionesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.autorizarrequisicionessEliminados= new ArrayList<AutorizarRequisiciones>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessAutorizarRequisiciones();
		
				///*AutorizarRequisicionesSessionBean*/this.autorizarrequisicionesSessionBean=new AutorizarRequisicionesSessionBean();
			
			if(this.autorizarrequisicionesSessionBean==null) {
				this.autorizarrequisicionesSessionBean=new AutorizarRequisicionesSessionBean();
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
					this.iNumeroPaginacion=AutorizarRequisicionesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=AutorizarRequisicionesConstantesFunciones.getClassesForeignKeysOfAutorizarRequisiciones(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/autorizarrequisiciones."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			autorizarrequisicionessAux= new ArrayList<AutorizarRequisiciones>();
			
				
			autorizarrequisicionesLogic.setDatosCliente(this.datosCliente);
			autorizarrequisicionesLogic.setDatosDeep(this.datosDeep);
			autorizarrequisicionesLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaAutorizarRequisiciones")) {
				this.sDetalleReporte=AutorizarRequisicionesConstantesFunciones.getDetalleIndiceBusquedaAutorizarRequisiciones(fecha_desdeBusquedaAutorizarRequisiciones,fecha_hastaBusquedaAutorizarRequisiciones);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					autorizarrequisicionesLogic.getAutorizarRequisicionessBusquedaAutorizarRequisiciones(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_desdeBusquedaAutorizarRequisiciones,fecha_hastaBusquedaAutorizarRequisiciones);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutorizarRequisicionesConstantesFunciones.getDetalleIndiceBusquedaAutorizarRequisiciones(fecha_desdeBusquedaAutorizarRequisiciones,fecha_hastaBusquedaAutorizarRequisiciones);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutorizarRequisicionesConstantesFunciones.getDetalleIndiceBusquedaAutorizarRequisiciones(fecha_desdeBusquedaAutorizarRequisiciones,fecha_hastaBusquedaAutorizarRequisiciones);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=autorizarrequisicionesLogic.getAutorizarRequisicioness()==null||autorizarrequisicionesLogic.getAutorizarRequisicioness().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=autorizarrequisicioness==null|| autorizarrequisicioness.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						autorizarrequisicionessAux=new ArrayList<AutorizarRequisiciones>();
						autorizarrequisicionessAux.addAll(autorizarrequisicionesLogic.getAutorizarRequisicioness());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autorizarrequisicionessAux=new ArrayList<AutorizarRequisiciones>();
							autorizarrequisicionessAux.addAll(autorizarrequisicioness);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							autorizarrequisicionesLogic.getAutorizarRequisicionessBusquedaAutorizarRequisiciones(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_desdeBusquedaAutorizarRequisiciones,fecha_hastaBusquedaAutorizarRequisiciones);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AutorizarRequisicionesConstantesFunciones.getDetalleIndiceBusquedaAutorizarRequisiciones(fecha_desdeBusquedaAutorizarRequisiciones,fecha_hastaBusquedaAutorizarRequisiciones);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AutorizarRequisicionesConstantesFunciones.getDetalleIndiceBusquedaAutorizarRequisiciones(fecha_desdeBusquedaAutorizarRequisiciones,fecha_hastaBusquedaAutorizarRequisiciones);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAutorizarRequisicioness("BusquedaAutorizarRequisiciones",autorizarrequisicionesLogic.getAutorizarRequisicioness());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAutorizarRequisicioness("BusquedaAutorizarRequisiciones",autorizarrequisicioness);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						autorizarrequisicionesLogic.setAutorizarRequisicioness(new ArrayList<AutorizarRequisiciones>());
						autorizarrequisicionesLogic.getAutorizarRequisicioness().addAll(autorizarrequisicionessAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autorizarrequisicioness=new ArrayList<AutorizarRequisiciones>();
							autorizarrequisicioness.addAll(autorizarrequisicionessAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesAutorizarRequisiciones();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessAutorizarRequisiciones();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=autorizarrequisicionesLogic.getAutorizarRequisicioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=autorizarrequisicioness.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=autorizarrequisicionesLogic.getAutorizarRequisicioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=autorizarrequisicioness.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(AutorizarRequisiciones autorizarrequisiciones) {
		Boolean permite=true;
		
		if(this.autorizarrequisiciones.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=AutorizarRequisicionesConstantesFunciones.getOrderByListaAutorizarRequisiciones();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=AutorizarRequisicionesConstantesFunciones.getOrderByListaAutorizarRequisiciones();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AutorizarRequisiciones autorizarrequisiciones:autorizarrequisicionesLogic.getAutorizarRequisicioness()) {
				if(autorizarrequisiciones.getsType().equals(Constantes2.S_TOTALES)) {
					autorizarrequisicionesTotales=autorizarrequisiciones;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AutorizarRequisiciones autorizarrequisiciones:this.autorizarrequisicioness) {
				if(autorizarrequisiciones.getsType().equals(Constantes2.S_TOTALES)) {
					autorizarrequisicionesTotales=autorizarrequisiciones;
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
			this.autorizarrequisicionesAux=new AutorizarRequisiciones();
			this.autorizarrequisicionesAux.setsType(Constantes2.S_TOTALES);
			this.autorizarrequisicionesAux.setIsNew(false);
			this.autorizarrequisicionesAux.setIsChanged(false);
			this.autorizarrequisicionesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//AutorizarRequisicionesConstantesFunciones.TotalizarValoresFilaAutorizarRequisiciones(this.autorizarrequisicionesLogic.getAutorizarRequisicioness(),this.autorizarrequisicionesAux);
				
				//this.autorizarrequisicionesLogic.getAutorizarRequisicioness().add(this.autorizarrequisicionesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				AutorizarRequisicionesConstantesFunciones.TotalizarValoresFilaAutorizarRequisiciones(this.autorizarrequisicioness,this.autorizarrequisicionesAux);
				
				this.autorizarrequisicioness.add(this.autorizarrequisicionesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		autorizarrequisicionesTotales=new AutorizarRequisiciones();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.autorizarrequisicionesLogic.getAutorizarRequisicioness().remove(autorizarrequisicionesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.autorizarrequisicioness.remove(autorizarrequisicionesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		autorizarrequisicionesTotales=new AutorizarRequisiciones();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AutorizarRequisiciones autorizarrequisiciones:autorizarrequisicionesLogic.getAutorizarRequisicioness()) {
				if(autorizarrequisiciones.getsType().equals(Constantes2.S_TOTALES)) {
					autorizarrequisicionesTotales=autorizarrequisiciones;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AutorizarRequisicionesConstantesFunciones.TotalizarValoresFilaAutorizarRequisiciones(this.autorizarrequisicionesLogic.getAutorizarRequisicioness(),autorizarrequisicionesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AutorizarRequisiciones autorizarrequisiciones:this.autorizarrequisicioness) {
				if(autorizarrequisiciones.getsType().equals(Constantes2.S_TOTALES)) {
					autorizarrequisicionesTotales=autorizarrequisiciones;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AutorizarRequisicionesConstantesFunciones.TotalizarValoresFilaAutorizarRequisiciones(this.autorizarrequisicioness,autorizarrequisicionesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getAutorizarRequisicionessBusquedaAutorizarRequisiciones()throws Exception {
		try {
			sAccionBusqueda="BusquedaAutorizarRequisiciones";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAutorizarRequisicionessFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAutorizarRequisicionessFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getAutorizarRequisicionessBusquedaAutorizarRequisiciones(String sFinalQuery,Date fecha_desde,Date fecha_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//autorizarrequisicionesLogic.getAutorizarRequisicionessBusquedaAutorizarRequisiciones(sFinalQuery,this.pagination,fecha_desde,fecha_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAutorizarRequisicionessFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//autorizarrequisicionesLogic.getAutorizarRequisicionessFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAutorizarRequisicionessFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//autorizarrequisicionesLogic.getAutorizarRequisicionessFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosAutorizarRequisiciones() {
		this.isPermisoTodoAutorizarRequisiciones=false;
		this.isPermisoNuevoAutorizarRequisiciones=false;
		this.isPermisoActualizarAutorizarRequisiciones=false;
		this.isPermisoActualizarOriginalAutorizarRequisiciones=false;
		this.isPermisoEliminarAutorizarRequisiciones=false;
		this.isPermisoGuardarCambiosAutorizarRequisiciones=false;
		this.isPermisoConsultaAutorizarRequisiciones=true;
		this.isPermisoBusquedaAutorizarRequisiciones=true;
		this.isPermisoReporteAutorizarRequisiciones=true;
		this.isPermisoOrdenAutorizarRequisiciones=false;		
		this.isPermisoPaginacionMedioAutorizarRequisiciones=false;		
		this.isPermisoPaginacionAltoAutorizarRequisiciones=false;		
		this.isPermisoPaginacionTodoAutorizarRequisiciones=false;		
		this.isPermisoCopiarAutorizarRequisiciones=false;		
		this.isPermisoVerFormAutorizarRequisiciones=false;		
		this.isPermisoDuplicarAutorizarRequisiciones=false;
		this.isPermisoOrdenAutorizarRequisiciones=false;
	}
	
	public void setPermisosUsuarioAutorizarRequisiciones(Boolean isPermiso) {
		this.isPermisoTodoAutorizarRequisiciones=isPermiso;
		this.isPermisoNuevoAutorizarRequisiciones=isPermiso;
		this.isPermisoActualizarAutorizarRequisiciones=isPermiso;
		this.isPermisoActualizarOriginalAutorizarRequisiciones=isPermiso;
		this.isPermisoEliminarAutorizarRequisiciones=isPermiso;
		this.isPermisoGuardarCambiosAutorizarRequisiciones=isPermiso;
		this.isPermisoConsultaAutorizarRequisiciones=isPermiso;
		this.isPermisoBusquedaAutorizarRequisiciones=isPermiso;
		this.isPermisoReporteAutorizarRequisiciones=isPermiso;
		this.isPermisoOrdenAutorizarRequisiciones=isPermiso;		
		this.isPermisoPaginacionMedioAutorizarRequisiciones=isPermiso;		
		this.isPermisoPaginacionAltoAutorizarRequisiciones=isPermiso;		
		this.isPermisoPaginacionTodoAutorizarRequisiciones=isPermiso;		
		this.isPermisoCopiarAutorizarRequisiciones=isPermiso;		
		this.isPermisoVerFormAutorizarRequisiciones=isPermiso;		
		this.isPermisoDuplicarAutorizarRequisiciones=isPermiso;
		this.isPermisoOrdenAutorizarRequisiciones=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioAutorizarRequisiciones(Boolean isPermiso) {
		//this.isPermisoTodoAutorizarRequisiciones=isPermiso;
		this.isPermisoNuevoAutorizarRequisiciones=isPermiso;
		this.isPermisoActualizarAutorizarRequisiciones=isPermiso;
		this.isPermisoActualizarOriginalAutorizarRequisiciones=isPermiso;
		this.isPermisoEliminarAutorizarRequisiciones=isPermiso;
		this.isPermisoGuardarCambiosAutorizarRequisiciones=isPermiso;
		//this.isPermisoConsultaAutorizarRequisiciones=isPermiso;
		//this.isPermisoBusquedaAutorizarRequisiciones=isPermiso;
		//this.isPermisoReporteAutorizarRequisiciones=isPermiso;
		//this.isPermisoOrdenAutorizarRequisiciones=isPermiso;		
		//this.isPermisoPaginacionMedioAutorizarRequisiciones=isPermiso;		
		//this.isPermisoPaginacionAltoAutorizarRequisiciones=isPermiso;		
		//this.isPermisoPaginacionTodoAutorizarRequisiciones=isPermiso;		
		//this.isPermisoCopiarAutorizarRequisiciones=isPermiso;		
		//this.isPermisoDuplicarAutorizarRequisiciones=isPermiso;
		//this.isPermisoOrdenAutorizarRequisiciones=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioAutorizarRequisicionesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(AutorizarRequisicionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebAutorizarRequisiciones(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioAutorizarRequisicionesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioAutorizarRequisicionesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionAutorizarRequisicionesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioAutorizarRequisicionesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioAutorizarRequisiciones() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(AutorizarRequisicionesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, AutorizarRequisicionesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoAutorizarRequisiciones=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarAutorizarRequisiciones=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalAutorizarRequisiciones=this.isPermisoActualizarAutorizarRequisiciones;
			this.isPermisoEliminarAutorizarRequisiciones=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosAutorizarRequisiciones=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaAutorizarRequisiciones=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaAutorizarRequisiciones=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoAutorizarRequisiciones=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteAutorizarRequisiciones=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAutorizarRequisiciones=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioAutorizarRequisiciones=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoAutorizarRequisiciones=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoAutorizarRequisiciones=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarAutorizarRequisiciones=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormAutorizarRequisiciones=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarAutorizarRequisiciones=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAutorizarRequisiciones=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosAutorizarRequisiciones.setToolTipText(this.jTableDatosAutorizarRequisiciones.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioAutorizarRequisiciones(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioAutorizarRequisiciones(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(AutorizarRequisicionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(AutorizarRequisicionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioAutorizarRequisiciones() throws Exception {
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
	public void inicializarCombosForeignKeyAutorizarRequisicionesListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyAutorizarRequisicionesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(AutorizarRequisicionesJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeySucursalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SucursalConstantesFunciones.SFINALQUERY;

				this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyAutorizarRequisiciones()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.autorizarrequisicionesSessionBean==null) {
				this.autorizarrequisicionesSessionBean=new AutorizarRequisicionesSessionBean();
			}

			if(!this.autorizarrequisicionesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeySucursal()throws Exception {
		try {

			if(!this.autorizarrequisicionesSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				Sucursal sucursal=new Sucursal();
				SucursalConstantesFunciones.setSucursalDescripcion(sucursal,Constantes.SMENSAJE_ESCOJA_OPCION);
				sucursal.setId(null);

				if(!SucursalConstantesFunciones.ExisteEnLista(this.sucursalsForeignKey,sucursal,true)) {

					this.sucursalsForeignKey.add(0,sucursal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyAutorizarRequisiciones()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyAutorizarRequisiciones(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyAutorizarRequisiciones()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyAutorizarRequisiciones();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyAutorizarRequisiciones(AutorizarRequisiciones autorizarrequisiciones)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyAutorizarRequisiciones(AutorizarRequisiciones autorizarrequisiciones,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyAutorizarRequisiciones()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyAutorizarRequisiciones()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyAutorizarRequisiciones()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyAutorizarRequisiciones()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroAutorizarRequisiciones()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyAutorizarRequisiciones()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyAutorizarRequisiciones(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyAutorizarRequisiciones()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxid_empresaAutorizarRequisiciones!=null && this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxid_empresaAutorizarRequisiciones.getItemCount()>0) {
				this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxid_empresaAutorizarRequisiciones.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxid_sucursalAutorizarRequisiciones!=null && this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxid_sucursalAutorizarRequisiciones.getItemCount()>0) {
				this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxid_sucursalAutorizarRequisiciones.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public AutorizarRequisicionesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public AutorizarRequisicionesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public AutorizarRequisicionesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.autorizarrequisicionesSessionBean=new AutorizarRequisicionesSessionBean(); 
		this.autorizarrequisicionesConstantesFunciones=new AutorizarRequisicionesConstantesFunciones(); 
		this.autorizarrequisicionesBean=new AutorizarRequisiciones();//(this.autorizarrequisicionesConstantesFunciones); 		
		this.autorizarrequisicionesReturnGeneral=new AutorizarRequisicionesParameterReturnGeneral(); 
		
		this.autorizarrequisicionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.autorizarrequisicionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public AutorizarRequisicionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public AutorizarRequisicionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public AutorizarRequisicionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessAutorizarRequisiciones(true);
			
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
			
			this.autorizarrequisicionesConstantesFunciones=new AutorizarRequisicionesConstantesFunciones(); 
			this.autorizarrequisicionesBean=new AutorizarRequisiciones();//this.autorizarrequisicionesConstantesFunciones); 			
			this.autorizarrequisicionesReturnGeneral=new AutorizarRequisicionesParameterReturnGeneral(); 
		
			AutorizarRequisicionesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Autorizar Requisiciones Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.autorizarrequisiciones=new AutorizarRequisiciones();
			this.autorizarrequisicioness = new ArrayList<AutorizarRequisiciones>();
			this.autorizarrequisicionessAux = new ArrayList<AutorizarRequisiciones>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic=new AutorizarRequisicionesLogic();
				this.autorizarrequisicionesLogic.getNewConnexionToDeep("");
			}
			
			//this.autorizarrequisicionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.autorizarrequisicionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormAutorizarRequisiciones);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoAutorizarRequisiciones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAutorizarRequisiciones);	
					}
					
					if(this.jInternalFrameImportacionAutorizarRequisiciones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAutorizarRequisiciones);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByAutorizarRequisiciones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByAutorizarRequisiciones);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormAutorizarRequisiciones);
				this.jInternalFrameDetalleFormAutorizarRequisiciones.setVisible(false);
				this.jInternalFrameDetalleFormAutorizarRequisiciones.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoAutorizarRequisiciones!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAutorizarRequisiciones);
					this.jInternalFrameReporteDinamicoAutorizarRequisiciones.setVisible(false);
					this.jInternalFrameReporteDinamicoAutorizarRequisiciones.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionAutorizarRequisiciones!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionAutorizarRequisiciones);
					this.jInternalFrameImportacionAutorizarRequisiciones.setVisible(false);
					this.jInternalFrameImportacionAutorizarRequisiciones.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByAutorizarRequisiciones!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByAutorizarRequisiciones);
					this.jInternalFrameOrderByAutorizarRequisiciones.setVisible(false);
					this.jInternalFrameOrderByAutorizarRequisiciones.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idAutorizarRequisicionesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=AutorizarRequisicionesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.autorizarrequisicionesReturnGeneral=new AutorizarRequisicionesParameterReturnGeneral();
			
			this.autorizarrequisicionesParameterGeneral=new AutorizarRequisicionesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.autorizarrequisicionesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(AutorizarRequisicionesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AutorizarRequisicionesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado(),this.autorizarrequisicionesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AutorizarRequisicionesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado(),this.autorizarrequisicionesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoAutorizarRequisiciones=false;
			this.isVisibilidadCeldaDuplicarAutorizarRequisiciones=true;
			this.isVisibilidadCeldaCopiarAutorizarRequisiciones=true;
			this.isVisibilidadCeldaVerFormAutorizarRequisiciones=true;
			this.isVisibilidadCeldaOrdenAutorizarRequisiciones=true;
			this.isVisibilidadCeldaNuevoRelacionesAutorizarRequisiciones=false;
			this.isVisibilidadCeldaModificarAutorizarRequisiciones=false;
			this.isVisibilidadCeldaActualizarAutorizarRequisiciones=false;
			this.isVisibilidadCeldaEliminarAutorizarRequisiciones=false;
			this.isVisibilidadCeldaCancelarAutorizarRequisiciones=false;
			this.isVisibilidadCeldaGuardarAutorizarRequisiciones=false;
			this.isVisibilidadCeldaGuardarCambiosAutorizarRequisiciones=false;
			
			
			this.isVisibilidadBusquedaAutorizarRequisiciones=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesAutorizarRequisiciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosAutorizarRequisiciones();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioAutorizarRequisiciones(false);
			
			this.setPermisosUsuarioAutorizarRequisiciones();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado() 
				|| (this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado() && this.autorizarrequisicionesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioAutorizarRequisicionesClasesRelacionadas();
			}
			
			if(this.autorizarrequisicionesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioAutorizarRequisicionesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!AutorizarRequisicionesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosAutorizarRequisiciones();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualAutorizarRequisiciones();
			}
			
			if(!this.isPermisoBusquedaAutorizarRequisiciones) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasAutorizarRequisiciones.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(AutorizarRequisicionesConstantesFunciones.getTiposSeleccionarAutorizarRequisiciones());
				
				this.tiposColumnasSelect=AutorizarRequisicionesConstantesFunciones.getTiposSeleccionarAutorizarRequisiciones(true);
				
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
			//if(!this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioAutorizarRequisiciones();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioAutorizarRequisiciones(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioAutorizarRequisiciones(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesAutorizarRequisiciones() ;
			
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
			this.sucursalLogic=new SucursalLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				autorizarrequisicionesImplementable= (AutorizarRequisicionesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AutorizarRequisicionesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				autorizarrequisicionesImplementableHome= (AutorizarRequisicionesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AutorizarRequisicionesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.autorizarrequisicioness= new ArrayList<AutorizarRequisiciones>();
			this.autorizarrequisicionessEliminados= new ArrayList<AutorizarRequisiciones>();
						
			this.isEsNuevoAutorizarRequisiciones=false;
			this.esParaAccionDesdeFormularioAutorizarRequisiciones=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyAutorizarRequisiciones(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroAutorizarRequisiciones();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			AutorizarRequisicionesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=AutorizarRequisicionesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesAutorizarRequisiciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingAutorizarRequisiciones(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioAutorizarRequisiciones();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioAutorizarRequisiciones();
			}
			
			AutorizarRequisicionesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasAutorizarRequisiciones.getTabCount(); i++) {
					this.jTabbedPaneBusquedasAutorizarRequisiciones.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasAutorizarRequisiciones.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessAutorizarRequisiciones(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga AutorizarRequisiciones: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectAutorizarRequisiciones() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesAutorizarRequisiciones")) {
				iIndex=this.jInternalFrameDetalleFormAutorizarRequisiciones.jTabbedPaneRelacionesAutorizarRequisiciones.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormAutorizarRequisiciones.jTabbedPaneRelacionesAutorizarRequisiciones.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosAutorizarRequisiciones.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessAutorizarRequisiciones();	
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
	
	public void cargarCombosForeignKeyAutorizarRequisiciones(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyAutorizarRequisiciones(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyAutorizarRequisiciones(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyAutorizarRequisicionesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyAutorizarRequisiciones();
		
		this.cargarCombosFrameForeignKeyAutorizarRequisiciones();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyAutorizarRequisiciones();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyAutorizarRequisiciones();
		}
	}
	
	
	
	public void jButtonNuevoAutorizarRequisicionesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.autorizarrequisicionesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormAutorizarRequisiciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
			
			
			if(jTableDatosAutorizarRequisiciones.getRowCount()>=1) {
				jTableDatosAutorizarRequisiciones.removeRowSelectionInterval(0, jTableDatosAutorizarRequisiciones.getRowCount()-1);						
			}
			
			this.isEsNuevoAutorizarRequisiciones=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoAutorizarRequisiciones(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesAutorizarRequisiciones(true);			
			//this.autorizarrequisiciones=new AutorizarRequisiciones();
			//this.autorizarrequisiciones.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAutorizarRequisiciones(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAutorizarRequisiciones() ;
			
			if(AutorizarRequisicionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAutorizarRequisiciones(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.autorizarrequisiciones);	
			this.actualizarInformacion("INFO_PADRE",false,this.autorizarrequisiciones);				
			
			AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
			
			if(this.autorizarrequisicionesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar AutorizarRequisiciones: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarAutorizarRequisicionesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<AutorizarRequisiciones> autorizarrequisicionessSeleccionados=new ArrayList<AutorizarRequisiciones>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosAutorizarRequisiciones.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosAutorizarRequisiciones.getSelectedRows().length;			
			}
			
			autorizarrequisicionessSeleccionados=this.getAutorizarRequisicionessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoAutorizarRequisiciones--;			
				//AutorizarRequisiciones autorizarrequisicionesAux= new AutorizarRequisiciones();			
				//autorizarrequisicionesAux.setId(this.iIdNuevoAutorizarRequisiciones);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//AutorizarRequisiciones autorizarrequisicionesOrigen=new AutorizarRequisiciones();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(AutorizarRequisiciones autorizarrequisicionesOrigen : autorizarrequisicionessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosAutorizarRequisiciones.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							autorizarrequisicionesOrigen =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							autorizarrequisicionesOrigen =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaAutorizarRequisiciones();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.autorizarrequisiciones.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosAutorizarRequisiciones(autorizarrequisicionesOrigen,this.autorizarrequisiciones,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.autorizarrequisicionesLogic.getAutorizarRequisicioness().add(this.autorizarrequisicionesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.autorizarrequisicioness.add(this.autorizarrequisicionesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaAutorizarRequisiciones(false);
				
				this.jTableDatosAutorizarRequisiciones.setRowSelectionInterval(this.getIndiceNuevoAutorizarRequisiciones(), this.getIndiceNuevoAutorizarRequisiciones());
				
				int iLastRow =  this.jTableDatosAutorizarRequisiciones.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAutorizarRequisiciones.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAutorizarRequisiciones.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAutorizarRequisiciones(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarAutorizarRequisicionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<AutorizarRequisiciones> autorizarrequisicionessSeleccionados=new ArrayList<AutorizarRequisiciones>();									
		
			AutorizarRequisiciones autorizarrequisicionesOrigen=new AutorizarRequisiciones();
			AutorizarRequisiciones autorizarrequisicionesDestino=new AutorizarRequisiciones();
				
			autorizarrequisicionessSeleccionados=this.getAutorizarRequisicionessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosAutorizarRequisiciones.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || autorizarrequisicionessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosAutorizarRequisiciones.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						autorizarrequisicionesOrigen =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						autorizarrequisicionesOrigen =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						autorizarrequisicionesDestino =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						autorizarrequisicionesDestino =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				autorizarrequisicionesOrigen =autorizarrequisicionessSeleccionados.get(0);
				autorizarrequisicionesDestino =autorizarrequisicionessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosAutorizarRequisiciones(autorizarrequisicionesOrigen,autorizarrequisicionesDestino,true,false);
				
				autorizarrequisicionesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(autorizarrequisicionesDestino,autorizarrequisicionesLogic.getAutorizarRequisicioness());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(autorizarrequisicionesDestino,autorizarrequisicioness);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaAutorizarRequisiciones(false);
				
				//this.jTableDatosAutorizarRequisiciones.setRowSelectionInterval(this.getIndiceNuevoAutorizarRequisiciones(), this.getIndiceNuevoAutorizarRequisiciones());
				
				int iLastRow =  this.jTableDatosAutorizarRequisiciones.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAutorizarRequisiciones.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAutorizarRequisiciones.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAutorizarRequisiciones(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormAutorizarRequisicionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAutorizarRequisiciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormAutorizarRequisiciones.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarAutorizarRequisicionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesAutorizarRequisiciones.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasAutorizarRequisiciones.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesAutorizarRequisiciones.setVisible(!isVisible);
			this.jPanelPaginacionAutorizarRequisiciones.setVisible(!isVisible);
			this.jPanelAccionesAutorizarRequisiciones.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarAutorizarRequisicionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameAutorizarRequisiciones();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoAutorizarRequisicionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoAutorizarRequisiciones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionAutorizarRequisicionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionAutorizarRequisiciones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByAutorizarRequisicionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByAutorizarRequisiciones();
			
			this.abrirFrameOrderByAutorizarRequisiciones();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByAutorizarRequisicionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByAutorizarRequisiciones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleAutorizarRequisiciones(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormAutorizarRequisiciones);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormAutorizarRequisiciones.isMaximum()) {
					this.jInternalFrameDetalleFormAutorizarRequisiciones.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormAutorizarRequisiciones.setSize(this.jInternalFrameDetalleFormAutorizarRequisiciones.iWidthFormulario,this.jInternalFrameDetalleFormAutorizarRequisiciones.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormAutorizarRequisiciones.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormAutorizarRequisiciones.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormAutorizarRequisiciones.isMaximum()) {
						this.jInternalFrameDetalleFormAutorizarRequisiciones.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormAutorizarRequisiciones.jContentPaneDetalleAutorizarRequisiciones.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormAutorizarRequisiciones.jTabbedPaneRelacionesAutorizarRequisiciones.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormAutorizarRequisiciones.jContentPaneDetalleAutorizarRequisiciones.getWidth(),AutorizarRequisicionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAutorizarRequisiciones.jTabbedPaneRelacionesAutorizarRequisiciones.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormAutorizarRequisiciones.jContentPaneDetalleAutorizarRequisiciones.getWidth(),AutorizarRequisicionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAutorizarRequisiciones.jTabbedPaneRelacionesAutorizarRequisiciones.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormAutorizarRequisiciones.jContentPaneDetalleAutorizarRequisiciones.getWidth(),AutorizarRequisicionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormAutorizarRequisiciones.setVisible(true);
	        this.jInternalFrameDetalleFormAutorizarRequisiciones.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByAutorizarRequisiciones() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByAutorizarRequisiciones==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByAutorizarRequisiciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAutorizarRequisiciones,false,this);
				} else {
					this.jInternalFrameOrderByAutorizarRequisiciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAutorizarRequisiciones,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByAutorizarRequisiciones);
				this.jInternalFrameOrderByAutorizarRequisiciones.setVisible(false);
				this.jInternalFrameOrderByAutorizarRequisiciones.setSelected(false);
				
				this.jInternalFrameOrderByAutorizarRequisiciones.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAutorizarRequisiciones"));
				
				this.inicializarActualizarBindingTablaOrderByAutorizarRequisiciones();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionAutorizarRequisiciones() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionAutorizarRequisiciones==null) {
				
				this.jInternalFrameImportacionAutorizarRequisiciones=new ImportacionJInternalFrame(AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAutorizarRequisiciones);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionAutorizarRequisiciones);
				this.jInternalFrameImportacionAutorizarRequisiciones.setVisible(false);
				this.jInternalFrameImportacionAutorizarRequisiciones.setSelected(false);


				this.jInternalFrameImportacionAutorizarRequisiciones.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAutorizarRequisiciones"));
				this.jInternalFrameImportacionAutorizarRequisiciones.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAutorizarRequisiciones"));
				this.jInternalFrameImportacionAutorizarRequisiciones.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAutorizarRequisiciones"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoAutorizarRequisiciones() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoAutorizarRequisiciones==null) {
				this.jInternalFrameReporteDinamicoAutorizarRequisiciones=new ReporteDinamicoJInternalFrame(AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAutorizarRequisiciones);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAutorizarRequisiciones);
				this.jInternalFrameReporteDinamicoAutorizarRequisiciones.setVisible(false);
				this.jInternalFrameReporteDinamicoAutorizarRequisiciones.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAutorizarRequisiciones"));
				this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAutorizarRequisiciones"));
				this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAutorizarRequisiciones"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAutorizarRequisiciones();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleAutorizarRequisiciones() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormAutorizarRequisiciones);
			
	       	this.jInternalFrameDetalleFormAutorizarRequisiciones.setVisible(false);
	        this.jInternalFrameDetalleFormAutorizarRequisiciones.setSelected(false);
			
			//this.jInternalFrameDetalleFormAutorizarRequisiciones.dispose();
			//this.jInternalFrameDetalleFormAutorizarRequisiciones=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoAutorizarRequisiciones() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoAutorizarRequisiciones.setVisible(true);
	        this.jInternalFrameReporteDinamicoAutorizarRequisiciones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionAutorizarRequisiciones() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionAutorizarRequisiciones.setVisible(true);
	        this.jInternalFrameImportacionAutorizarRequisiciones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByAutorizarRequisiciones() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByAutorizarRequisiciones.setVisible(true);
	        this.jInternalFrameOrderByAutorizarRequisiciones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByAutorizarRequisiciones() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByAutorizarRequisiciones.setVisible(false);
	        this.jInternalFrameOrderByAutorizarRequisiciones.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoAutorizarRequisiciones() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoAutorizarRequisiciones.setVisible(false);
	        this.jInternalFrameReporteDinamicoAutorizarRequisiciones.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionAutorizarRequisiciones() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionAutorizarRequisiciones.setVisible(false);
	        this.jInternalFrameImportacionAutorizarRequisiciones.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarAutorizarRequisicionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarAutorizarRequisiciones(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarAutorizarRequisiciones(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAutorizarRequisiciones.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesAutorizarRequisiciones(true);
			//this.isEsNuevoAutorizarRequisiciones=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesAutorizarRequisiciones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAutorizarRequisiciones(false) ;
			
			if(autorizarrequisicionesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(AutorizarRequisicionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAutorizarRequisiciones(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAutorizarRequisiciones(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaAutorizarRequisicionesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosAutorizarRequisiciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarAutorizarRequisiciones(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAutorizarRequisiciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAutorizarRequisiciones.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesAutorizarRequisiciones(true);
			//this.isEsNuevoAutorizarRequisiciones=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.autorizarrequisiciones.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesAutorizarRequisiciones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesAutorizarRequisiciones(false) ;
			
			if(AutorizarRequisicionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAutorizarRequisiciones(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAutorizarRequisiciones(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	
	public void jButtonActualizarAutorizarRequisicionesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesAutorizarRequisiciones(false);
			
			//if(!this.isEsNuevoAutorizarRequisiciones) {								
				int intSelectedRow = this.jTableDatosAutorizarRequisiciones.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(AutorizarRequisicionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.autorizarrequisiciones,true);
				this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);
				
			}
			
			if(this.permiteMantenimiento(this.autorizarrequisiciones)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoAutorizarRequisiciones=true;
					this.inicializarActualizarBindingTablaAutorizarRequisiciones(false);
					this.isEsNuevoAutorizarRequisiciones=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoAutorizarRequisiciones=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoAutorizarRequisiciones=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAutorizarRequisiciones(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAutorizarRequisiciones(false);
				
				this.habilitarDeshabilitarControlesAutorizarRequisiciones(false);
			
												
				
				if(AutorizarRequisicionesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleAutorizarRequisiciones();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoAutorizarRequisicionesActionPerformed(evt,autorizarrequisicionesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualAutorizarRequisiciones(this.autorizarrequisiciones,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosAutorizarRequisiciones.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,autorizarrequisicionesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.autorizarrequisiciones.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(AutorizarRequisiciones.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutorizarRequisiciones.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarAutorizarRequisicionesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosAutorizarRequisiciones.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
				this.autorizarrequisiciones.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
				this.autorizarrequisiciones.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.autorizarrequisiciones)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((AutorizarRequisicionesModel) this.jTableDatosAutorizarRequisiciones.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoAutorizarRequisiciones=true;
				this.inicializarActualizarBindingTablaAutorizarRequisiciones(false);
				this.isEsNuevoAutorizarRequisiciones=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAutorizarRequisiciones(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAutorizarRequisiciones(false);
				
				this.habilitarDeshabilitarControlesAutorizarRequisiciones(false);
				
				
				
				if(AutorizarRequisicionesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleAutorizarRequisiciones();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarAutorizarRequisicionesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosAutorizarRequisiciones.getRowCount()>=1) {
				jTableDatosAutorizarRequisiciones.removeRowSelectionInterval(0, jTableDatosAutorizarRequisiciones.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesAutorizarRequisiciones(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaAutorizarRequisiciones(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAutorizarRequisiciones(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAutorizarRequisiciones(false) ;
			
			this.isEsNuevoAutorizarRequisiciones=false;
			
			if(AutorizarRequisicionesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleAutorizarRequisiciones();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosAutorizarRequisicionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingAutorizarRequisiciones(false);
				
				//SI ES MANUAL
				if(AutorizarRequisicionesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualAutorizarRequisiciones();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosAutorizarRequisicionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoAutorizarRequisiciones--;			
			//AutorizarRequisiciones autorizarrequisicionesAux= new AutorizarRequisiciones();			
			//autorizarrequisicionesAux.setId(this.iIdNuevoAutorizarRequisiciones);
			
			if(this.jInternalFrameDetalleFormAutorizarRequisiciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaAutorizarRequisiciones();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);
			
			this.autorizarrequisiciones.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.autorizarrequisicionesLogic.getAutorizarRequisicioness().add(this.autorizarrequisicionesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.autorizarrequisicioness.add(this.autorizarrequisicionesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaAutorizarRequisiciones(false);
			
			this.jTableDatosAutorizarRequisiciones.setRowSelectionInterval(this.getIndiceNuevoAutorizarRequisiciones(), this.getIndiceNuevoAutorizarRequisiciones());
			
			int iLastRow =  this.jTableDatosAutorizarRequisiciones.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosAutorizarRequisiciones.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosAutorizarRequisiciones.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaAutorizarRequisiciones(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionAutorizarRequisicionesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingAutorizarRequisiciones(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAutorizarRequisiciones(false);
			
			//SI ES MANUAL
			if(AutorizarRequisicionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAutorizarRequisiciones();
			}
			
			//this.abrirFrameTreeAutorizarRequisiciones();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionAutorizarRequisicionesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionAutorizarRequisicionesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionAutorizarRequisiciones.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionAutorizarRequisiciones.setFileImportacion(this.jInternalFrameImportacionAutorizarRequisiciones.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionAutorizarRequisiciones.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionAutorizarRequisiciones.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionAutorizarRequisiciones.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionAutorizarRequisiciones.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoAutorizarRequisicionesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<AutorizarRequisiciones> autorizarrequisicionessSeleccionados=new ArrayList<AutorizarRequisiciones>();		

		autorizarrequisicionessSeleccionados=this.getAutorizarRequisicionessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("AutorizarRequisicionesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"AutorizarRequisicionesBaseDesign.jrxml";
			
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
			
			this.generarReporteAutorizarRequisicioness("Todos",autorizarrequisicionessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autorizar Requisiciones",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AutorizarRequisicionesConstantesFunciones.LABEL_CODIGOTIPOREQUISICION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoTipoRequisicion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoTipoRequisicion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoTipoRequisicion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoTipoRequisicion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompletoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompletoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompletoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompletoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreBodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreBodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreBodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreBodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_FECHAAUTORIZA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaAutoriza_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaAutoriza_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaAutoriza_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaAutoriza_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case AutorizarRequisicionesConstantesFunciones.LABEL_CODIGOTIPOREQUISICION:
					sNombreCampoCategoria="codigo_tipo_requisicion";
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoria="nombre_completo_cliente";
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREBODEGA:
					sNombreCampoCategoria="nombre_bodega";
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoria="nombre_producto";
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_FECHAAUTORIZA:
					sNombreCampoCategoria="fecha_autoriza";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case AutorizarRequisicionesConstantesFunciones.LABEL_CODIGOTIPOREQUISICION:
					sNombreCampoCategoriaValor="codigo_tipo_requisicion";
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoriaValor="nombre_completo_cliente";
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREBODEGA:
					sNombreCampoCategoriaValor="nombre_bodega";
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoriaValor="nombre_producto";
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_FECHAAUTORIZA:
					sNombreCampoCategoriaValor="fecha_autoriza";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AutorizarRequisicionesConstantesFunciones.LABEL_CODIGOTIPOREQUISICION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Tipo Requisicion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_tipo_requisicion");
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo_cliente");
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_bodega");
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_producto");
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_FECHAAUTORIZA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Autoriza",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_autoriza");
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
	
	public void jButtonGenerarExcelReporteDinamicoAutorizarRequisicionesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<AutorizarRequisiciones> autorizarrequisicionessSeleccionados=new ArrayList<AutorizarRequisiciones>();		
		
		autorizarrequisicionessSeleccionados=this.getAutorizarRequisicionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"autorizarrequisiciones";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("AutorizarRequisicioness");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case AutorizarRequisicionesConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(AutorizarRequisiciones autorizarrequisiciones:autorizarrequisicionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autorizarrequisiciones.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(AutorizarRequisiciones autorizarrequisiciones:autorizarrequisicionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autorizarrequisiciones.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_FECHADESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_FECHADESDE);
					iRow++;

					for(AutorizarRequisiciones autorizarrequisiciones:autorizarrequisicionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autorizarrequisiciones.getfecha_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_FECHAHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_FECHAHASTA);
					iRow++;

					for(AutorizarRequisiciones autorizarrequisiciones:autorizarrequisicionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autorizarrequisiciones.getfecha_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_CODIGOTIPOREQUISICION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_CODIGOTIPOREQUISICION);
					iRow++;

					for(AutorizarRequisiciones autorizarrequisiciones:autorizarrequisicionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autorizarrequisiciones.getcodigo_tipo_requisicion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(AutorizarRequisiciones autorizarrequisiciones:autorizarrequisicionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autorizarrequisiciones.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(AutorizarRequisiciones autorizarrequisiciones:autorizarrequisicionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autorizarrequisiciones.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
					iRow++;

					for(AutorizarRequisiciones autorizarrequisiciones:autorizarrequisicionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autorizarrequisiciones.getnombre_completo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREBODEGA);
					iRow++;

					for(AutorizarRequisiciones autorizarrequisiciones:autorizarrequisicionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autorizarrequisiciones.getnombre_bodega());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREPRODUCTO);
					iRow++;

					for(AutorizarRequisiciones autorizarrequisiciones:autorizarrequisicionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autorizarrequisiciones.getnombre_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(AutorizarRequisiciones autorizarrequisiciones:autorizarrequisicionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autorizarrequisiciones.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AutorizarRequisicionesConstantesFunciones.LABEL_FECHAAUTORIZA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_FECHAAUTORIZA);
					iRow++;

					for(AutorizarRequisiciones autorizarrequisiciones:autorizarrequisicionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(autorizarrequisiciones.getfecha_autoriza());
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
			//	this.getFilaCabeceraExportarExcelAutorizarRequisiciones(row);				
			//	iRow++;
			//}				
			
			//for(AutorizarRequisiciones autorizarrequisicionesAux:autorizarrequisicionessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelAutorizarRequisiciones(autorizarrequisicionesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autorizar Requisiciones",JOptionPane.INFORMATION_MESSAGE);
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
				this.autorizarrequisicionesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAutorizarRequisiciones(false);
			
			//SI ES MANUAL
			if(AutorizarRequisicionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAutorizarRequisiciones();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresAutorizarRequisicionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAutorizarRequisiciones(false);
			
			//SI ES MANUAL
			if(AutorizarRequisicionesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAutorizarRequisiciones();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesAutorizarRequisicionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAutorizarRequisiciones(false);
			
			//SI ES MANUAL
			if(AutorizarRequisicionesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAutorizarRequisiciones();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaAutorizarRequisiciones() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosAutorizarRequisiciones.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosAutorizarRequisiciones.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosAutorizarRequisiciones.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosAutorizarRequisiciones.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosAutorizarRequisiciones.setMinimumSize(dimensionMinimum);
		this.jTableDatosAutorizarRequisiciones.setMaximumSize(dimensionMaximum);
		this.jTableDatosAutorizarRequisiciones.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingAutorizarRequisiciones(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingAutorizarRequisiciones(esInicializar,true);
	}
	
	public void inicializarActualizarBindingAutorizarRequisiciones(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaAutorizarRequisiciones(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesAutorizarRequisiciones(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasAutorizarRequisiciones(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAutorizarRequisiciones(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesAutorizarRequisiciones(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !AutorizarRequisicionesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!AutorizarRequisicionesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualAutorizarRequisiciones() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaAutorizarRequisiciones();
		
		this.inicializarActualizarBindingBotonesManualAutorizarRequisiciones(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualAutorizarRequisiciones();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAutorizarRequisiciones() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualAutorizarRequisiciones(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualAutorizarRequisiciones(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosAutorizarRequisiciones.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosAutorizarRequisiciones.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteAutorizarRequisiciones.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormAutorizarRequisiciones.jCheckBoxPostAccionNuevoAutorizarRequisiciones.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormAutorizarRequisiciones.jCheckBoxPostAccionSinCerrarAutorizarRequisiciones.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormAutorizarRequisiciones.jCheckBoxPostAccionSinMensajeAutorizarRequisiciones.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosAutorizarRequisiciones.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosAutorizarRequisiciones.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteAutorizarRequisiciones.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {
				this.jInternalFrameDetalleFormAutorizarRequisiciones.jCheckBoxPostAccionNuevoAutorizarRequisiciones.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormAutorizarRequisiciones.jCheckBoxPostAccionSinCerrarAutorizarRequisiciones.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormAutorizarRequisiciones.jCheckBoxPostAccionSinMensajeAutorizarRequisiciones.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionAutorizarRequisiciones.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionAutorizarRequisiciones.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxTiposAccionesFormularioAutorizarRequisiciones.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesAutorizarRequisiciones.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoAutorizarRequisiciones!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesAutorizarRequisiciones.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesAutorizarRequisiciones.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarAutorizarRequisiciones.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesAutorizarRequisiciones.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoAutorizarRequisiciones!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesAutorizarRequisiciones.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralAutorizarRequisiciones.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesAutorizarRequisiciones(Boolean esInicializar) throws Exception {
		try	{	
			if(AutorizarRequisicionesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualAutorizarRequisiciones(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesAutorizarRequisiciones() throws Exception {
		try	{
			if(AutorizarRequisicionesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualAutorizarRequisiciones();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAutorizarRequisiciones() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxTiposAccionesFormularioAutorizarRequisiciones.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxTiposAccionesFormularioAutorizarRequisiciones.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualAutorizarRequisiciones() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesAutorizarRequisiciones.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesAutorizarRequisiciones.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesAutorizarRequisiciones.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesAutorizarRequisiciones.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesAutorizarRequisiciones.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesAutorizarRequisiciones.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionAutorizarRequisiciones.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionAutorizarRequisiciones.addItem(reporte);
			}
			
			
			if(!this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionAutorizarRequisiciones.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionAutorizarRequisiciones.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesAutorizarRequisiciones.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesAutorizarRequisiciones.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesAutorizarRequisiciones.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesAutorizarRequisiciones.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxTiposAccionesFormularioAutorizarRequisiciones.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxTiposAccionesFormularioAutorizarRequisiciones.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarAutorizarRequisiciones.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarAutorizarRequisiciones.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarAutorizarRequisiciones.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAutorizarRequisiciones();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAutorizarRequisiciones() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAutorizarRequisiciones!=null) {
				this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAutorizarRequisiciones!=null) {
				this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoAutorizarRequisiciones!=null) {
				
				if(this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualAutorizarRequisiciones()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_desdeBusquedaAutorizarRequisiciones=new Date(this.jDateChooserfecha_desdeBusquedaAutorizarRequisicionesAutorizarRequisiciones.getDate().getTime());
		this.fecha_hastaBusquedaAutorizarRequisiciones=new Date(this.jDateChooserfecha_hastaBusquedaAutorizarRequisicionesAutorizarRequisiciones.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasAutorizarRequisiciones(Boolean esInicializar) throws Exception {				
		if(AutorizarRequisicionesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualAutorizarRequisiciones();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaAutorizarRequisiciones() throws Exception {
		this.inicializarActualizarBindingTablaAutorizarRequisiciones(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByAutorizarRequisiciones() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByAutorizarRequisiciones.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByAutorizarRequisiciones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAutorizarRequisiciones.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new AutorizarRequisicionesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByAutorizarRequisiciones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAutorizarRequisiciones.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new AutorizarRequisicionesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosAutorizarRequisicionesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutorizarRequisicionesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new AutorizarRequisicionesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByAutorizarRequisiciones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAutorizarRequisiciones.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new AutorizarRequisicionesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByAutorizarRequisiciones.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaAutorizarRequisiciones(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=autorizarrequisicionesLogic.getAutorizarRequisicioness().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=autorizarrequisicioness.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(AutorizarRequisicionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosAutorizarRequisiciones.setModel(new AutorizarRequisicionesModel(this.autorizarrequisicionesLogic.getAutorizarRequisicioness(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosAutorizarRequisiciones.setModel(new AutorizarRequisicionesModel(this.autorizarrequisicioness,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByAutorizarRequisiciones!=null && this.jInternalFrameOrderByAutorizarRequisiciones.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByAutorizarRequisiciones();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosAutorizarRequisiciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutorizarRequisiciones,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new AutorizarRequisicionesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO,autorizarrequisicionesConstantesFunciones.resaltarSeleccionarAutorizarRequisiciones,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+AutorizarRequisicionesConstantesFunciones.SCLASSWEBTITULO,autorizarrequisicionesConstantesFunciones.resaltarSeleccionarAutorizarRequisiciones,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosAutorizarRequisiciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutorizarRequisiciones,AutorizarRequisicionesConstantesFunciones.LABEL_ID));

		if(this.autorizarrequisicionesConstantesFunciones.mostraridAutorizarRequisiciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutorizarRequisicionesConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.autorizarrequisicionesConstantesFunciones.resaltaridAutorizarRequisiciones,this.autorizarrequisicionesConstantesFunciones.activaridAutorizarRequisiciones,this,true,"idAutorizarRequisiciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.autorizarrequisicionesConstantesFunciones.resaltaridAutorizarRequisiciones,this.autorizarrequisicionesConstantesFunciones.activaridAutorizarRequisiciones,this,true,"idAutorizarRequisiciones","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutorizarRequisiciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutorizarRequisiciones,AutorizarRequisicionesConstantesFunciones.LABEL_CODIGOTIPOREQUISICION));

		if(this.autorizarrequisicionesConstantesFunciones.mostrarcodigo_tipo_requisicionAutorizarRequisiciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutorizarRequisicionesConstantesFunciones.LABEL_CODIGOTIPOREQUISICION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.autorizarrequisicionesConstantesFunciones.resaltarcodigo_tipo_requisicionAutorizarRequisiciones,this.autorizarrequisicionesConstantesFunciones.activarcodigo_tipo_requisicionAutorizarRequisiciones,this,true,"codigo_tipo_requisicionAutorizarRequisiciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.autorizarrequisicionesConstantesFunciones.resaltarcodigo_tipo_requisicionAutorizarRequisiciones,this.autorizarrequisicionesConstantesFunciones.activarcodigo_tipo_requisicionAutorizarRequisiciones,this,true,"codigo_tipo_requisicionAutorizarRequisiciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AutorizarRequisicionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutorizarRequisiciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutorizarRequisiciones,AutorizarRequisicionesConstantesFunciones.LABEL_CODIGO));

		if(this.autorizarrequisicionesConstantesFunciones.mostrarcodigoAutorizarRequisiciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutorizarRequisicionesConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.autorizarrequisicionesConstantesFunciones.resaltarcodigoAutorizarRequisiciones,this.autorizarrequisicionesConstantesFunciones.activarcodigoAutorizarRequisiciones,this,true,"codigoAutorizarRequisiciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.autorizarrequisicionesConstantesFunciones.resaltarcodigoAutorizarRequisiciones,this.autorizarrequisicionesConstantesFunciones.activarcodigoAutorizarRequisiciones,this,true,"codigoAutorizarRequisiciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AutorizarRequisicionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutorizarRequisiciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutorizarRequisiciones,AutorizarRequisicionesConstantesFunciones.LABEL_FECHA));

		if(this.autorizarrequisicionesConstantesFunciones.mostrarfechaAutorizarRequisiciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutorizarRequisicionesConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.autorizarrequisicionesConstantesFunciones.resaltarfechaAutorizarRequisiciones,this.autorizarrequisicionesConstantesFunciones.activarfechaAutorizarRequisiciones,this,true,"fechaAutorizarRequisiciones","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.autorizarrequisicionesConstantesFunciones.resaltarfechaAutorizarRequisiciones,this.autorizarrequisicionesConstantesFunciones.activarfechaAutorizarRequisiciones,this,true,"fechaAutorizarRequisiciones","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new AutorizarRequisicionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutorizarRequisiciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutorizarRequisiciones,AutorizarRequisicionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE));

		if(this.autorizarrequisicionesConstantesFunciones.mostrarnombre_completo_clienteAutorizarRequisiciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutorizarRequisicionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.autorizarrequisicionesConstantesFunciones.resaltarnombre_completo_clienteAutorizarRequisiciones,this.autorizarrequisicionesConstantesFunciones.activarnombre_completo_clienteAutorizarRequisiciones,this,true,"nombre_completo_clienteAutorizarRequisiciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.autorizarrequisicionesConstantesFunciones.resaltarnombre_completo_clienteAutorizarRequisiciones,this.autorizarrequisicionesConstantesFunciones.activarnombre_completo_clienteAutorizarRequisiciones,this,true,"nombre_completo_clienteAutorizarRequisiciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AutorizarRequisicionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutorizarRequisiciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutorizarRequisiciones,AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREBODEGA));

		if(this.autorizarrequisicionesConstantesFunciones.mostrarnombre_bodegaAutorizarRequisiciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREBODEGA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.autorizarrequisicionesConstantesFunciones.resaltarnombre_bodegaAutorizarRequisiciones,this.autorizarrequisicionesConstantesFunciones.activarnombre_bodegaAutorizarRequisiciones,this,true,"nombre_bodegaAutorizarRequisiciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.autorizarrequisicionesConstantesFunciones.resaltarnombre_bodegaAutorizarRequisiciones,this.autorizarrequisicionesConstantesFunciones.activarnombre_bodegaAutorizarRequisiciones,this,true,"nombre_bodegaAutorizarRequisiciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AutorizarRequisicionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutorizarRequisiciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutorizarRequisiciones,AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREPRODUCTO));

		if(this.autorizarrequisicionesConstantesFunciones.mostrarnombre_productoAutorizarRequisiciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.autorizarrequisicionesConstantesFunciones.resaltarnombre_productoAutorizarRequisiciones,this.autorizarrequisicionesConstantesFunciones.activarnombre_productoAutorizarRequisiciones,this,true,"nombre_productoAutorizarRequisiciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.autorizarrequisicionesConstantesFunciones.resaltarnombre_productoAutorizarRequisiciones,this.autorizarrequisicionesConstantesFunciones.activarnombre_productoAutorizarRequisiciones,this,true,"nombre_productoAutorizarRequisiciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AutorizarRequisicionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutorizarRequisiciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutorizarRequisiciones,AutorizarRequisicionesConstantesFunciones.LABEL_CANTIDAD));

		if(this.autorizarrequisicionesConstantesFunciones.mostrarcantidadAutorizarRequisiciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutorizarRequisicionesConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.autorizarrequisicionesConstantesFunciones.resaltarcantidadAutorizarRequisiciones,this.autorizarrequisicionesConstantesFunciones.activarcantidadAutorizarRequisiciones,this,true,"cantidadAutorizarRequisiciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.autorizarrequisicionesConstantesFunciones.resaltarcantidadAutorizarRequisiciones,this.autorizarrequisicionesConstantesFunciones.activarcantidadAutorizarRequisiciones,this,true,"cantidadAutorizarRequisiciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AutorizarRequisicionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAutorizarRequisiciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAutorizarRequisiciones,AutorizarRequisicionesConstantesFunciones.LABEL_FECHAAUTORIZA));

		if(this.autorizarrequisicionesConstantesFunciones.mostrarfecha_autorizaAutorizarRequisiciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AutorizarRequisicionesConstantesFunciones.LABEL_FECHAAUTORIZA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.autorizarrequisicionesConstantesFunciones.resaltarfecha_autorizaAutorizarRequisiciones,this.autorizarrequisicionesConstantesFunciones.activarfecha_autorizaAutorizarRequisiciones,this,true,"fecha_autorizaAutorizarRequisiciones","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.autorizarrequisicionesConstantesFunciones.resaltarfecha_autorizaAutorizarRequisiciones,this.autorizarrequisicionesConstantesFunciones.activarfecha_autorizaAutorizarRequisiciones,this,true,"fecha_autorizaAutorizarRequisiciones","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new AutorizarRequisicionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAutorizarRequisiciones.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAutorizarRequisiciones.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarAutorizarRequisiciones && this.isPermisoGuardarCambiosAutorizarRequisiciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosAutorizarRequisiciones.addColumn(tableColumn);
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
			
			this.jTableDatosAutorizarRequisiciones.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAutorizarRequisiciones && this.isPermisoGuardarCambiosAutorizarRequisiciones) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAutorizarRequisiciones && this.isPermisoGuardarCambiosAutorizarRequisiciones) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosAutorizarRequisiciones.moveColumn(this.jTableDatosAutorizarRequisiciones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosAutorizarRequisiciones.moveColumn(this.jTableDatosAutorizarRequisiciones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosAutorizarRequisiciones.moveColumn(this.jTableDatosAutorizarRequisiciones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosAutorizarRequisiciones.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosAutorizarRequisiciones.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosAutorizarRequisiciones,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!AutorizarRequisicionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosAutorizarRequisiciones.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosAutorizarRequisiciones.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!AutorizarRequisicionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!AutorizarRequisicionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosAutorizarRequisiciones.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosAutorizarRequisiciones.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosAutorizarRequisiciones.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=autorizarrequisicionesLogic.getAutorizarRequisicioness().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=autorizarrequisicioness.size()-1;
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
		//this.jTableDatosAutorizarRequisiciones.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosAutorizarRequisiciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosAutorizarRequisiciones();
			
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
				
				//this.isEsNuevoAutorizarRequisiciones=false;
					
				AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
			
				if(this.autorizarrequisicionesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormAutorizarRequisiciones==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAutorizarRequisiciones.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAutorizarRequisiciones.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.autorizarrequisiciones.getsType().equals("DUPLICADO")
				   || this.autorizarrequisiciones.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoAutorizarRequisiciones=true;
				
				} else {
					this.isEsNuevoAutorizarRequisiciones=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {
					if(this.autorizarrequisiciones.getId()>=0 && !this.autorizarrequisiciones.getIsNew()) {						
						this.isEsNuevoAutorizarRequisiciones=false;
						
					} else {
						this.isEsNuevoAutorizarRequisiciones=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoAutorizarRequisiciones(esRelaciones);						
				
				this.seleccionarAutorizarRequisiciones(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.autorizarrequisiciones.getId()<0) {
					this.isEsNuevoAutorizarRequisiciones=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarAutorizarRequisiciones(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarAutorizarRequisiciones(evt,rowIndex);
				}	
				
				if(this.autorizarrequisicionesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion AutorizarRequisiciones: " + this.dDif); 
					}
				}								
				
				AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarAutorizarRequisiciones(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.autorizarrequisiciones)) {
					if(this.autorizarrequisiciones.getId()>0) {
						this.autorizarrequisiciones.setIsDeleted(true);
						
						this.autorizarrequisicionessEliminados.add(this.autorizarrequisiciones);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.autorizarrequisicionesLogic.getAutorizarRequisicioness().remove(this.autorizarrequisiciones);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.autorizarrequisicioness.remove(this.autorizarrequisiciones);				
					}
					
					
					((AutorizarRequisicionesModel) this.jTableDatosAutorizarRequisiciones.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaAutorizarRequisiciones(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarAutorizarRequisiciones(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoAutorizarRequisiciones) {
			
			if(this.jInternalFrameDetalleFormAutorizarRequisiciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAutorizarRequisiciones.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAutorizarRequisiciones.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(AutorizarRequisicionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioAutorizarRequisiciones(this.autorizarrequisiciones);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesAutorizarRequisiciones("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesAutorizarRequisiciones(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAutorizarRequisiciones() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoAutorizarRequisiciones(AutorizarRequisiciones autorizarrequisiciones) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoAutorizarRequisiciones(autorizarrequisiciones,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoAutorizarRequisiciones(AutorizarRequisiciones autorizarrequisiciones,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioAutorizarRequisiciones(autorizarrequisiciones);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyAutorizarRequisiciones(autorizarrequisiciones,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyAutorizarRequisiciones(autorizarrequisiciones);
	}
	
	public void setVariablesObjetoActualToFormularioAutorizarRequisiciones(AutorizarRequisiciones autorizarrequisiciones) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormAutorizarRequisiciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelidAutorizarRequisiciones.setText(autorizarrequisiciones.getId().toString());
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextFieldcodigo_tipo_requisicionAutorizarRequisiciones.setText(autorizarrequisiciones.getcodigo_tipo_requisicion());
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextFieldcodigoAutorizarRequisiciones.setText(autorizarrequisiciones.getcodigo());
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jDateChooserfechaAutorizarRequisiciones.setDate(autorizarrequisiciones.getfecha());
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextAreanombre_completo_clienteAutorizarRequisiciones.setText(autorizarrequisiciones.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextAreanombre_bodegaAutorizarRequisiciones.setText(autorizarrequisiciones.getnombre_bodega());
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextAreanombre_productoAutorizarRequisiciones.setText(autorizarrequisiciones.getnombre_producto());
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextFieldcantidadAutorizarRequisiciones.setText(autorizarrequisiciones.getcantidad().toString());
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jDateChooserfecha_autorizaAutorizarRequisiciones.setDate(autorizarrequisiciones.getfecha_autoriza());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,AutorizarRequisiciones autorizarrequisicionesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,autorizarrequisicionesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,AutorizarRequisiciones autorizarrequisicionesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				autorizarrequisicionesLocal=this.autorizarrequisiciones;
			} else {
				autorizarrequisicionesLocal=this.autorizarrequisicionesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(autorizarrequisicionesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoAutorizarRequisiciones(autorizarrequisicionesLocal,true);
					
					if(autorizarrequisicionesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(autorizarrequisicionesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(autorizarrequisicionesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoAutorizarRequisiciones(AutorizarRequisiciones autorizarrequisiciones,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(autorizarrequisiciones,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(autorizarrequisiciones);
	}
	
	public void setVariablesFormularioToObjetoActualAutorizarRequisiciones(AutorizarRequisiciones autorizarrequisiciones,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(autorizarrequisiciones,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualAutorizarRequisiciones(AutorizarRequisiciones autorizarrequisiciones,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormAutorizarRequisiciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelidAutorizarRequisiciones.getText()==null || this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelidAutorizarRequisiciones.getText()=="" || this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelidAutorizarRequisiciones.getText()=="Id") {
				this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelidAutorizarRequisiciones.setText("0");
			}

			if(conColumnasBase) {autorizarrequisiciones.setId(Long.parseLong(this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelidAutorizarRequisiciones.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AutorizarRequisicionesConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelIdAutorizarRequisiciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			autorizarrequisiciones.setcodigo_tipo_requisicion(this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextFieldcodigo_tipo_requisicionAutorizarRequisiciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AutorizarRequisicionesConstantesFunciones.LABEL_CODIGOTIPOREQUISICION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelcodigo_tipo_requisicionAutorizarRequisiciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			autorizarrequisiciones.setcodigo(this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextFieldcodigoAutorizarRequisiciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AutorizarRequisicionesConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelcodigoAutorizarRequisiciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			autorizarrequisiciones.setfecha(this.jInternalFrameDetalleFormAutorizarRequisiciones.jDateChooserfechaAutorizarRequisiciones.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AutorizarRequisicionesConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelfechaAutorizarRequisiciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			autorizarrequisiciones.setnombre_completo_cliente(this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextAreanombre_completo_clienteAutorizarRequisiciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AutorizarRequisicionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelnombre_completo_clienteAutorizarRequisiciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			autorizarrequisiciones.setnombre_bodega(this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextAreanombre_bodegaAutorizarRequisiciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREBODEGA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelnombre_bodegaAutorizarRequisiciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			autorizarrequisiciones.setnombre_producto(this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextAreanombre_productoAutorizarRequisiciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelnombre_productoAutorizarRequisiciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			autorizarrequisiciones.setcantidad(Long.parseLong(this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextFieldcantidadAutorizarRequisiciones.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AutorizarRequisicionesConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelcantidadAutorizarRequisiciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			autorizarrequisiciones.setfecha_autoriza(this.jInternalFrameDetalleFormAutorizarRequisiciones.jDateChooserfecha_autorizaAutorizarRequisiciones.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AutorizarRequisicionesConstantesFunciones.LABEL_FECHAAUTORIZA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelfecha_autorizaAutorizarRequisiciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAutorizarRequisiciones(AutorizarRequisiciones autorizarrequisicionesBean,AutorizarRequisiciones autorizarrequisiciones,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosAutorizarRequisiciones(AutorizarRequisiciones autorizarrequisicionesOrigen,AutorizarRequisiciones autorizarrequisiciones,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && autorizarrequisicionesOrigen.getId()!=null && !autorizarrequisicionesOrigen.getId().equals(0L))) {autorizarrequisiciones.setId(autorizarrequisicionesOrigen.getId());}}
			if(conDefault || (!conDefault && autorizarrequisicionesOrigen.getfecha_desde()!=null && !autorizarrequisicionesOrigen.getfecha_desde().equals(new Date()))) {autorizarrequisiciones.setfecha_desde(autorizarrequisicionesOrigen.getfecha_desde());}
			if(conDefault || (!conDefault && autorizarrequisicionesOrigen.getfecha_hasta()!=null && !autorizarrequisicionesOrigen.getfecha_hasta().equals(new Date()))) {autorizarrequisiciones.setfecha_hasta(autorizarrequisicionesOrigen.getfecha_hasta());}
			if(conDefault || (!conDefault && autorizarrequisicionesOrigen.getcodigo_tipo_requisicion()!=null && !autorizarrequisicionesOrigen.getcodigo_tipo_requisicion().equals(""))) {autorizarrequisiciones.setcodigo_tipo_requisicion(autorizarrequisicionesOrigen.getcodigo_tipo_requisicion());}
			if(conDefault || (!conDefault && autorizarrequisicionesOrigen.getcodigo()!=null && !autorizarrequisicionesOrigen.getcodigo().equals(""))) {autorizarrequisiciones.setcodigo(autorizarrequisicionesOrigen.getcodigo());}
			if(conDefault || (!conDefault && autorizarrequisicionesOrigen.getfecha()!=null && !autorizarrequisicionesOrigen.getfecha().equals(new Date()))) {autorizarrequisiciones.setfecha(autorizarrequisicionesOrigen.getfecha());}
			if(conDefault || (!conDefault && autorizarrequisicionesOrigen.getnombre_completo_cliente()!=null && !autorizarrequisicionesOrigen.getnombre_completo_cliente().equals(""))) {autorizarrequisiciones.setnombre_completo_cliente(autorizarrequisicionesOrigen.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && autorizarrequisicionesOrigen.getnombre_bodega()!=null && !autorizarrequisicionesOrigen.getnombre_bodega().equals(""))) {autorizarrequisiciones.setnombre_bodega(autorizarrequisicionesOrigen.getnombre_bodega());}
			if(conDefault || (!conDefault && autorizarrequisicionesOrigen.getnombre_producto()!=null && !autorizarrequisicionesOrigen.getnombre_producto().equals(""))) {autorizarrequisiciones.setnombre_producto(autorizarrequisicionesOrigen.getnombre_producto());}
			if(conDefault || (!conDefault && autorizarrequisicionesOrigen.getcantidad()!=null && !autorizarrequisicionesOrigen.getcantidad().equals(0L))) {autorizarrequisiciones.setcantidad(autorizarrequisicionesOrigen.getcantidad());}
			if(conDefault || (!conDefault && autorizarrequisicionesOrigen.getfecha_autoriza()!=null && !autorizarrequisicionesOrigen.getfecha_autoriza().equals(new Date()))) {autorizarrequisiciones.setfecha_autoriza(autorizarrequisicionesOrigen.getfecha_autoriza());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAutorizarRequisiciones(AutorizarRequisiciones autorizarrequisiciones) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelidAutorizarRequisiciones.setText(autorizarrequisiciones.getId().toString());
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextFieldcodigo_tipo_requisicionAutorizarRequisiciones.setText(autorizarrequisiciones.getcodigo_tipo_requisicion());
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextFieldcodigoAutorizarRequisiciones.setText(autorizarrequisiciones.getcodigo());
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jDateChooserfechaAutorizarRequisiciones.setDate(autorizarrequisiciones.getfecha());
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextAreanombre_completo_clienteAutorizarRequisiciones.setText(autorizarrequisiciones.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextAreanombre_bodegaAutorizarRequisiciones.setText(autorizarrequisiciones.getnombre_bodega());
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextAreanombre_productoAutorizarRequisiciones.setText(autorizarrequisiciones.getnombre_producto());
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextFieldcantidadAutorizarRequisiciones.setText(autorizarrequisiciones.getcantidad().toString());
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jDateChooserfecha_autorizaAutorizarRequisiciones.setDate(autorizarrequisiciones.getfecha_autoriza());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAutorizarRequisiciones(AutorizarRequisicionesBean autorizarrequisicionesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelidAutorizarRequisiciones.setText(autorizarrequisicionesBean.getId().toString());
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextFieldcodigo_tipo_requisicionAutorizarRequisiciones.setText(autorizarrequisicionesBean.getcodigo_tipo_requisicion());
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextFieldcodigoAutorizarRequisiciones.setText(autorizarrequisicionesBean.getcodigo());
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jDateChooserfechaAutorizarRequisiciones.setDate(autorizarrequisicionesBean.getfecha());
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextAreanombre_completo_clienteAutorizarRequisiciones.setText(autorizarrequisicionesBean.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextAreanombre_bodegaAutorizarRequisiciones.setText(autorizarrequisicionesBean.getnombre_bodega());
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextAreanombre_productoAutorizarRequisiciones.setText(autorizarrequisicionesBean.getnombre_producto());
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextFieldcantidadAutorizarRequisiciones.setText(autorizarrequisicionesBean.getcantidad().toString());
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jDateChooserfecha_autorizaAutorizarRequisiciones.setDate(autorizarrequisicionesBean.getfecha_autoriza());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanAutorizarRequisiciones(AutorizarRequisicionesParameterReturnGeneral autorizarrequisicionesReturnGeneral,AutorizarRequisicionesBean autorizarrequisicionesBean,Boolean conDefault) throws Exception { 
		try {
			AutorizarRequisiciones autorizarrequisicionesLocal=new AutorizarRequisiciones();
			
			autorizarrequisicionesLocal=autorizarrequisicionesReturnGeneral.getAutorizarRequisiciones();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && autorizarrequisicionesLocal.getId()!=null && !autorizarrequisicionesLocal.getId().equals(0L))) {autorizarrequisicionesBean.setId(autorizarrequisicionesLocal.getId());}}
			if(conDefault || (!conDefault && autorizarrequisicionesLocal.getcodigo_tipo_requisicion()!=null && !autorizarrequisicionesLocal.getcodigo_tipo_requisicion().equals(""))) {autorizarrequisicionesBean.setcodigo_tipo_requisicion(autorizarrequisicionesLocal.getcodigo_tipo_requisicion());}
			if(conDefault || (!conDefault && autorizarrequisicionesLocal.getcodigo()!=null && !autorizarrequisicionesLocal.getcodigo().equals(""))) {autorizarrequisicionesBean.setcodigo(autorizarrequisicionesLocal.getcodigo());}
			if(conDefault || (!conDefault && autorizarrequisicionesLocal.getfecha()!=null && !autorizarrequisicionesLocal.getfecha().equals(new Date()))) {autorizarrequisicionesBean.setfecha(autorizarrequisicionesLocal.getfecha());}
			if(conDefault || (!conDefault && autorizarrequisicionesLocal.getnombre_completo_cliente()!=null && !autorizarrequisicionesLocal.getnombre_completo_cliente().equals(""))) {autorizarrequisicionesBean.setnombre_completo_cliente(autorizarrequisicionesLocal.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && autorizarrequisicionesLocal.getnombre_bodega()!=null && !autorizarrequisicionesLocal.getnombre_bodega().equals(""))) {autorizarrequisicionesBean.setnombre_bodega(autorizarrequisicionesLocal.getnombre_bodega());}
			if(conDefault || (!conDefault && autorizarrequisicionesLocal.getnombre_producto()!=null && !autorizarrequisicionesLocal.getnombre_producto().equals(""))) {autorizarrequisicionesBean.setnombre_producto(autorizarrequisicionesLocal.getnombre_producto());}
			if(conDefault || (!conDefault && autorizarrequisicionesLocal.getcantidad()!=null && !autorizarrequisicionesLocal.getcantidad().equals(0L))) {autorizarrequisicionesBean.setcantidad(autorizarrequisicionesLocal.getcantidad());}
			if(conDefault || (!conDefault && autorizarrequisicionesLocal.getfecha_autoriza()!=null && !autorizarrequisicionesLocal.getfecha_autoriza().equals(new Date()))) {autorizarrequisicionesBean.setfecha_autoriza(autorizarrequisicionesLocal.getfecha_autoriza());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxAutorizarRequisicionesGenerico(Long idAutorizarRequisicionesSeleccionado,JComboBox jComboBoxAutorizarRequisiciones,List<AutorizarRequisiciones> autorizarrequisicionessLocal)throws Exception {
		try {
			AutorizarRequisiciones  autorizarrequisicionesTemp=null;

			for(AutorizarRequisiciones autorizarrequisicionesAux:autorizarrequisicionessLocal) {
				if(autorizarrequisicionesAux.getId()!=null && autorizarrequisicionesAux.getId().equals(idAutorizarRequisicionesSeleccionado)) {
					autorizarrequisicionesTemp=autorizarrequisicionesAux;
					break;
				}
			}

			jComboBoxAutorizarRequisiciones.setSelectedItem(autorizarrequisicionesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxAutorizarRequisicionesGenerico(JComboBox jComboBoxAutorizarRequisiciones,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxAutorizarRequisiciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAutorizarRequisiciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxAutorizarRequisiciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAutorizarRequisiciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAutorizarRequisiciones.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxAutorizarRequisiciones.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAutorizarRequisiciones.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxAutorizarRequisiciones.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxAutorizarRequisiciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxAutorizarRequisiciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			autorizarrequisiciones=(AutorizarRequisiciones) autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			autorizarrequisiciones =(AutorizarRequisiciones) autorizarrequisicioness.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!autorizarrequisiciones.getIsNew() && !autorizarrequisiciones.getIsChanged() && !autorizarrequisiciones.getIsDeleted()) {
				sDescripcion=autorizarrequisiciones.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=autorizarrequisiciones.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!autorizarrequisiciones.getIsNew() && !autorizarrequisiciones.getIsChanged() && !autorizarrequisiciones.getIsDeleted()) {
				sDescripcion=autorizarrequisiciones.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=autorizarrequisiciones.getsucursal_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		AutorizarRequisiciones autorizarrequisicionesRow=new AutorizarRequisiciones();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			autorizarrequisicionesRow=(AutorizarRequisiciones) autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			autorizarrequisicionesRow=(AutorizarRequisiciones) autorizarrequisicioness.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualAutorizarRequisiciones(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaNuevoAutorizarRequisiciones && this.isPermisoNuevoAutorizarRequisiciones));			
			this.jButtonDuplicarAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaDuplicarAutorizarRequisiciones && this.isPermisoDuplicarAutorizarRequisiciones));			
			this.jButtonCopiarAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaCopiarAutorizarRequisiciones && this.isPermisoCopiarAutorizarRequisiciones));
			this.jButtonVerFormAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaVerFormAutorizarRequisiciones && this.isPermisoVerFormAutorizarRequisiciones));
			
			this.jButtonAbrirOrderByAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaOrdenAutorizarRequisiciones && this.isPermisoOrdenAutorizarRequisiciones));			
			
			this.jButtonNuevoRelacionesAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaNuevoRelacionesAutorizarRequisiciones && this.isPermisoNuevoAutorizarRequisiciones));			
			this.jButtonNuevoGuardarCambiosAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaNuevoAutorizarRequisiciones && this.isPermisoNuevoAutorizarRequisiciones && this.isPermisoGuardarCambiosAutorizarRequisiciones));
			
			if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonModificarAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaModificarAutorizarRequisiciones && this.isPermisoActualizarAutorizarRequisiciones));	
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonActualizarAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaActualizarAutorizarRequisiciones && this.isPermisoActualizarAutorizarRequisiciones));	
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonEliminarAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaEliminarAutorizarRequisiciones && this.isPermisoEliminarAutorizarRequisiciones));
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonCancelarAutorizarRequisiciones.setVisible(this.isVisibilidadCeldaCancelarAutorizarRequisiciones);							
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonGuardarCambiosAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaGuardarAutorizarRequisiciones && this.isPermisoGuardarCambiosAutorizarRequisiciones));			
			
			}
						
			this.jButtonGuardarCambiosTablaAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaGuardarCambiosAutorizarRequisiciones && this.isPermisoGuardarCambiosAutorizarRequisiciones));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaNuevoAutorizarRequisiciones && this.isPermisoNuevoAutorizarRequisiciones));						
			this.jButtonDuplicarToolBarAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaDuplicarAutorizarRequisiciones && this.isPermisoDuplicarAutorizarRequisiciones));						
			this.jButtonCopiarToolBarAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaCopiarAutorizarRequisiciones && this.isPermisoCopiarAutorizarRequisiciones));			
			this.jButtonVerFormToolBarAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaVerFormAutorizarRequisiciones && this.isPermisoVerFormAutorizarRequisiciones));			
			this.jButtonAbrirOrderByToolBarAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaOrdenAutorizarRequisiciones && this.isPermisoOrdenAutorizarRequisiciones));
			this.jButtonNuevoRelacionesToolBarAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaNuevoRelacionesAutorizarRequisiciones && this.isPermisoNuevoAutorizarRequisiciones));			
			this.jButtonNuevoGuardarCambiosToolBarAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaNuevoAutorizarRequisiciones && this.isPermisoNuevoAutorizarRequisiciones && this.isPermisoGuardarCambiosAutorizarRequisiciones));			
			
			if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonModificarToolBarAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaModificarAutorizarRequisiciones && this.isPermisoActualizarAutorizarRequisiciones));	
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonActualizarToolBarAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaActualizarAutorizarRequisiciones  && this.isPermisoActualizarAutorizarRequisiciones));	
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonEliminarToolBarAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaEliminarAutorizarRequisiciones && this.isPermisoEliminarAutorizarRequisiciones));
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonCancelarToolBarAutorizarRequisiciones.setVisible(this.isVisibilidadCeldaCancelarAutorizarRequisiciones);				
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonGuardarCambiosToolBarAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaGuardarAutorizarRequisiciones && this.isPermisoGuardarCambiosAutorizarRequisiciones));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaGuardarCambiosAutorizarRequisiciones && this.isPermisoGuardarCambiosAutorizarRequisiciones));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaNuevoAutorizarRequisiciones && this.isPermisoNuevoAutorizarRequisiciones));			
			this.jMenuItemDuplicarAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaDuplicarAutorizarRequisiciones && this.isPermisoDuplicarAutorizarRequisiciones));			
			this.jMenuItemCopiarAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaCopiarAutorizarRequisiciones && this.isPermisoCopiarAutorizarRequisiciones));			
			this.jMenuItemVerFormAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaVerFormAutorizarRequisiciones && this.isPermisoVerFormAutorizarRequisiciones));			
			this.jMenuItemAbrirOrderByAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaOrdenAutorizarRequisiciones && this.isPermisoOrdenAutorizarRequisiciones));			
			//this.jMenuItemMostrarOcultarAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaOrdenAutorizarRequisiciones && this.isPermisoOrdenAutorizarRequisiciones));
			this.jMenuItemDetalleAbrirOrderByAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaOrdenAutorizarRequisiciones && this.isPermisoOrdenAutorizarRequisiciones));			
			//this.jMenuItemDetalleMostrarOcultarAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaOrdenAutorizarRequisiciones && this.isPermisoOrdenAutorizarRequisiciones));			
			this.jMenuItemNuevoRelacionesAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaNuevoRelacionesAutorizarRequisiciones && this.isPermisoNuevoAutorizarRequisiciones));			
			this.jMenuItemNuevoGuardarCambiosAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaNuevoAutorizarRequisiciones && this.isPermisoNuevoAutorizarRequisiciones && this.isPermisoGuardarCambiosAutorizarRequisiciones));									
			
			if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jMenuItemModificarAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaModificarAutorizarRequisiciones && this.isPermisoActualizarAutorizarRequisiciones));	
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jMenuItemActualizarAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaActualizarAutorizarRequisiciones && this.isPermisoActualizarAutorizarRequisiciones));	
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jMenuItemEliminarAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaEliminarAutorizarRequisiciones && this.isPermisoEliminarAutorizarRequisiciones));
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jMenuItemCancelarAutorizarRequisiciones.setVisible(this.isVisibilidadCeldaCancelarAutorizarRequisiciones);				
			}
			
			this.jMenuItemGuardarCambiosAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaGuardarAutorizarRequisiciones && this.isPermisoGuardarCambiosAutorizarRequisiciones));						
			this.jMenuItemGuardarCambiosTablaAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaGuardarCambiosAutorizarRequisiciones && this.isPermisoGuardarCambiosAutorizarRequisiciones));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoAutorizarRequisiciones=this.jButtonNuevoAutorizarRequisiciones.isVisible();
			this.isVisibilidadCeldaDuplicarAutorizarRequisiciones=this.jButtonDuplicarAutorizarRequisiciones.isVisible();
			this.isVisibilidadCeldaCopiarAutorizarRequisiciones=this.jButtonCopiarAutorizarRequisiciones.isVisible();
			this.isVisibilidadCeldaVerFormAutorizarRequisiciones=this.jButtonVerFormAutorizarRequisiciones.isVisible();
			
			this.isVisibilidadCeldaOrdenAutorizarRequisiciones=this.jButtonAbrirOrderByAutorizarRequisiciones.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesAutorizarRequisiciones=this.jButtonNuevoRelacionesAutorizarRequisiciones.isVisible();
			this.isVisibilidadCeldaModificarAutorizarRequisiciones=this.jButtonModificarAutorizarRequisiciones.isVisible();
			
			if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {
			this.isVisibilidadCeldaActualizarAutorizarRequisiciones=this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonActualizarAutorizarRequisiciones.isVisible();
			this.isVisibilidadCeldaEliminarAutorizarRequisiciones=this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonEliminarAutorizarRequisiciones.isVisible();
			this.isVisibilidadCeldaCancelarAutorizarRequisiciones=this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonCancelarAutorizarRequisiciones.isVisible();
			this.isVisibilidadCeldaGuardarAutorizarRequisiciones=this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonGuardarCambiosAutorizarRequisiciones.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosAutorizarRequisiciones=this.jButtonGuardarCambiosTablaAutorizarRequisiciones.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoAutorizarRequisiciones=this.jButtonNuevoToolBarAutorizarRequisiciones.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAutorizarRequisiciones=this.jButtonNuevoRelacionesToolBarAutorizarRequisiciones.isVisible();
			
			if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {
			this.isVisibilidadCeldaModificarAutorizarRequisiciones=this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonModificarToolBarAutorizarRequisiciones.isVisible();
			this.isVisibilidadCeldaActualizarAutorizarRequisiciones=this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonActualizarToolBarAutorizarRequisiciones.isVisible();
			this.isVisibilidadCeldaEliminarAutorizarRequisiciones=this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonEliminarToolBarAutorizarRequisiciones.isVisible();
			this.isVisibilidadCeldaCancelarAutorizarRequisiciones=this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonCancelarToolBarAutorizarRequisiciones.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAutorizarRequisiciones=this.jButtonGuardarCambiosToolBarAutorizarRequisiciones.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAutorizarRequisiciones=this.jButtonGuardarCambiosTablaToolBarAutorizarRequisiciones.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoAutorizarRequisiciones=this.jMenuItemNuevoAutorizarRequisiciones.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAutorizarRequisiciones=this.jMenuItemNuevoRelacionesAutorizarRequisiciones.isVisible();
			
			if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {
			this.isVisibilidadCeldaModificarAutorizarRequisiciones=this.jInternalFrameDetalleFormAutorizarRequisiciones.jMenuItemModificarAutorizarRequisiciones.isVisible();
			this.isVisibilidadCeldaActualizarAutorizarRequisiciones=this.jInternalFrameDetalleFormAutorizarRequisiciones.jMenuItemActualizarAutorizarRequisiciones.isVisible();
			this.isVisibilidadCeldaEliminarAutorizarRequisiciones=this.jInternalFrameDetalleFormAutorizarRequisiciones.jMenuItemEliminarAutorizarRequisiciones.isVisible();
			this.isVisibilidadCeldaCancelarAutorizarRequisiciones=this.jInternalFrameDetalleFormAutorizarRequisiciones.jMenuItemCancelarAutorizarRequisiciones.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAutorizarRequisiciones=this.jMenuItemGuardarCambiosAutorizarRequisiciones.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAutorizarRequisiciones=this.jMenuItemGuardarCambiosTablaAutorizarRequisiciones.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesAutorizarRequisiciones(Boolean esInicializar) {
		if(AutorizarRequisicionesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.autorizarrequisicionesSessionBean.getConGuardarRelaciones()) {
				//if(this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesAutorizarRequisiciones();
			}
			
			this.inicializarActualizarBindingBotonesManualAutorizarRequisiciones(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualAutorizarRequisiciones() {
		this.jButtonNuevoAutorizarRequisiciones.setVisible(this.isPermisoNuevoAutorizarRequisiciones);			
		this.jButtonDuplicarAutorizarRequisiciones.setVisible(this.isPermisoDuplicarAutorizarRequisiciones);			
		this.jButtonCopiarAutorizarRequisiciones.setVisible(this.isPermisoCopiarAutorizarRequisiciones);			
		this.jButtonVerFormAutorizarRequisiciones.setVisible(this.isPermisoVerFormAutorizarRequisiciones);			
		
		this.jButtonAbrirOrderByAutorizarRequisiciones.setVisible(this.isPermisoOrdenAutorizarRequisiciones);					
		
		this.jButtonNuevoRelacionesAutorizarRequisiciones.setVisible(this.isPermisoNuevoAutorizarRequisiciones);			
		
		if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonModificarAutorizarRequisiciones.setVisible(this.isPermisoActualizarAutorizarRequisiciones);	
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonActualizarAutorizarRequisiciones.setVisible(this.isPermisoActualizarAutorizarRequisiciones);	
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonEliminarAutorizarRequisiciones.setVisible(this.isPermisoEliminarAutorizarRequisiciones);
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonCancelarAutorizarRequisiciones.setVisible(this.isVisibilidadCeldaCancelarAutorizarRequisiciones);						
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonGuardarCambiosAutorizarRequisiciones.setVisible(this.isPermisoGuardarCambiosAutorizarRequisiciones);							
		}
		
		this.jButtonGuardarCambiosTablaAutorizarRequisiciones.setVisible(this.isPermisoActualizarAutorizarRequisiciones);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleAutorizarRequisiciones() {
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonModificarAutorizarRequisiciones.setVisible(this.isPermisoActualizarAutorizarRequisiciones);	
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonActualizarAutorizarRequisiciones.setVisible(this.isPermisoActualizarAutorizarRequisiciones);	
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonEliminarAutorizarRequisiciones.setVisible(this.isPermisoEliminarAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonCancelarAutorizarRequisiciones.setVisible(this.isVisibilidadCeldaCancelarAutorizarRequisiciones);							
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonGuardarCambiosAutorizarRequisiciones.setVisible((this.isVisibilidadCeldaGuardarAutorizarRequisiciones && this.isPermisoGuardarCambiosAutorizarRequisiciones));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosAutorizarRequisiciones() {
		if(AutorizarRequisicionesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualAutorizarRequisiciones();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesAutorizarRequisiciones() {
	}
	
	public void jTableDatosAutorizarRequisicionesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarAutorizarRequisiciones(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidAutorizarRequisicionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutorizarRequisiciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.getautorizarrequisiciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autorizarrequisiciones==null) {
						this.autorizarrequisiciones = new AutorizarRequisiciones();
					}

					this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.autorizarrequisiciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);
				}

				if(this.autorizarrequisiciones.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.autorizarrequisiciones.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutorizarRequisiciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaAutorizarRequisicionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebAutorizarRequisiciones(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutorizarRequisiciones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAutorizarRequisiciones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAutorizarRequisiciones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.getautorizarrequisiciones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.autorizarrequisicionesLogic.getConnexion());

				if(this.autorizarrequisiciones.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.autorizarrequisiciones.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAutorizarRequisiciones=(TitledBorder)this.jScrollPanelDatosAutorizarRequisiciones.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderAutorizarRequisiciones.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaAutorizarRequisicionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutorizarRequisiciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.getautorizarrequisiciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autorizarrequisiciones==null) {
						this.autorizarrequisiciones = new AutorizarRequisiciones();
					}

					this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.autorizarrequisiciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);
				}

				if(this.autorizarrequisiciones.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.autorizarrequisiciones.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutorizarRequisiciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalAutorizarRequisicionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebAutorizarRequisiciones(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutorizarRequisiciones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAutorizarRequisiciones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAutorizarRequisiciones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.getautorizarrequisiciones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.autorizarrequisicionesLogic.getConnexion());

				if(this.autorizarrequisiciones.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.autorizarrequisiciones.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAutorizarRequisiciones=(TitledBorder)this.jScrollPanelDatosAutorizarRequisiciones.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderAutorizarRequisiciones.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalAutorizarRequisicionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutorizarRequisiciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.getautorizarrequisiciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autorizarrequisiciones==null) {
						this.autorizarrequisiciones = new AutorizarRequisiciones();
					}

					this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.autorizarrequisiciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);
				}

				if(this.autorizarrequisiciones.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.autorizarrequisiciones.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutorizarRequisiciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_desdeAutorizarRequisicionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutorizarRequisiciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.getautorizarrequisiciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autorizarrequisiciones==null) {
						this.autorizarrequisiciones = new AutorizarRequisiciones();
					}

					this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.autorizarrequisiciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);
				}

				if(this.autorizarrequisiciones.getfecha_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_desde = '"+Funciones2.getStringPostgresDate(this.autorizarrequisiciones.getfecha_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutorizarRequisiciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_hastaAutorizarRequisicionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutorizarRequisiciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.getautorizarrequisiciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autorizarrequisiciones==null) {
						this.autorizarrequisiciones = new AutorizarRequisiciones();
					}

					this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.autorizarrequisiciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);
				}

				if(this.autorizarrequisiciones.getfecha_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_hasta = '"+Funciones2.getStringPostgresDate(this.autorizarrequisiciones.getfecha_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutorizarRequisiciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_tipo_requisicionAutorizarRequisicionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutorizarRequisiciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.getautorizarrequisiciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autorizarrequisiciones==null) {
						this.autorizarrequisiciones = new AutorizarRequisiciones();
					}

					this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.autorizarrequisiciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);
				}

				if(this.autorizarrequisiciones.getcodigo_tipo_requisicion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_tipo_requisicion like '%"+this.autorizarrequisiciones.getcodigo_tipo_requisicion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutorizarRequisiciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoAutorizarRequisicionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutorizarRequisiciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.getautorizarrequisiciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autorizarrequisiciones==null) {
						this.autorizarrequisiciones = new AutorizarRequisiciones();
					}

					this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.autorizarrequisiciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);
				}

				if(this.autorizarrequisiciones.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.autorizarrequisiciones.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutorizarRequisiciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaAutorizarRequisicionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutorizarRequisiciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.getautorizarrequisiciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autorizarrequisiciones==null) {
						this.autorizarrequisiciones = new AutorizarRequisiciones();
					}

					this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.autorizarrequisiciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);
				}

				if(this.autorizarrequisiciones.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.autorizarrequisiciones.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutorizarRequisiciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completo_clienteAutorizarRequisicionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutorizarRequisiciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.getautorizarrequisiciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autorizarrequisiciones==null) {
						this.autorizarrequisiciones = new AutorizarRequisiciones();
					}

					this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.autorizarrequisiciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);
				}

				if(this.autorizarrequisiciones.getnombre_completo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo_cliente like '%"+this.autorizarrequisiciones.getnombre_completo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutorizarRequisiciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_bodegaAutorizarRequisicionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutorizarRequisiciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.getautorizarrequisiciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autorizarrequisiciones==null) {
						this.autorizarrequisiciones = new AutorizarRequisiciones();
					}

					this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.autorizarrequisiciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);
				}

				if(this.autorizarrequisiciones.getnombre_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_bodega like '%"+this.autorizarrequisiciones.getnombre_bodega()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutorizarRequisiciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_productoAutorizarRequisicionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutorizarRequisiciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.getautorizarrequisiciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autorizarrequisiciones==null) {
						this.autorizarrequisiciones = new AutorizarRequisiciones();
					}

					this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.autorizarrequisiciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);
				}

				if(this.autorizarrequisiciones.getnombre_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_producto like '%"+this.autorizarrequisiciones.getnombre_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutorizarRequisiciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadAutorizarRequisicionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutorizarRequisiciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.getautorizarrequisiciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autorizarrequisiciones==null) {
						this.autorizarrequisiciones = new AutorizarRequisiciones();
					}

					this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.autorizarrequisiciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);
				}

				if(this.autorizarrequisiciones.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.autorizarrequisiciones.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutorizarRequisiciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_autorizaAutorizarRequisicionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAutorizarRequisiciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.getautorizarrequisiciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.autorizarrequisiciones==null) {
						this.autorizarrequisiciones = new AutorizarRequisiciones();
					}

					this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.autorizarrequisiciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);
				}

				if(this.autorizarrequisiciones.getfecha_autoriza()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_autoriza = '"+Funciones2.getStringPostgresDate(this.autorizarrequisiciones.getfecha_autoriza())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAutorizarRequisiciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaAutorizarRequisicionesAutorizarRequisicionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAutorizarRequisiciones(false,false);

			this.getAutorizarRequisicionessBusquedaAutorizarRequisiciones();

			this.inicializarActualizarBindingAutorizarRequisiciones(false);

			//if(AutorizarRequisicionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAutorizarRequisiciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaAutorizarRequisicionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAutorizarRequisiciones(false,false);

			this.getAutorizarRequisicionessFK_IdEmpresa();

			this.inicializarActualizarBindingAutorizarRequisiciones(false);

			//if(AutorizarRequisicionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAutorizarRequisiciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalAutorizarRequisicionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAutorizarRequisiciones(false,false);

			this.getAutorizarRequisicionessFK_IdSucursal();

			this.inicializarActualizarBindingAutorizarRequisiciones(false);

			//if(AutorizarRequisicionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAutorizarRequisiciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.autorizarrequisicionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameAutorizarRequisiciones() {
		if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {
			this.jInternalFrameDetalleFormAutorizarRequisiciones.setVisible(false);	    			
			this.jInternalFrameDetalleFormAutorizarRequisiciones.dispose();
			this.jInternalFrameDetalleFormAutorizarRequisiciones=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoAutorizarRequisiciones!=null) {
			this.jInternalFrameReporteDinamicoAutorizarRequisiciones.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoAutorizarRequisiciones.dispose();
			this.jInternalFrameReporteDinamicoAutorizarRequisiciones=null;
		}
		
		if(this.jInternalFrameImportacionAutorizarRequisiciones!=null) {
			this.jInternalFrameImportacionAutorizarRequisiciones.setVisible(false);	    			
			this.jInternalFrameImportacionAutorizarRequisiciones.dispose();
			this.jInternalFrameImportacionAutorizarRequisiciones=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessAutorizarRequisiciones();
			
			AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
			
			
			if(sTipo.equals("NuevoAutorizarRequisiciones")) {
				jButtonNuevoAutorizarRequisicionesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarAutorizarRequisiciones")) {
				jButtonDuplicarAutorizarRequisicionesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarAutorizarRequisiciones")) {
				jButtonCopiarAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("VerFormAutorizarRequisiciones")) {
				jButtonVerFormAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarAutorizarRequisiciones")) {
				jButtonNuevoAutorizarRequisicionesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarAutorizarRequisiciones")) {
				jButtonDuplicarAutorizarRequisicionesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoAutorizarRequisiciones")) {
				jButtonNuevoAutorizarRequisicionesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarAutorizarRequisiciones")) {
				jButtonDuplicarAutorizarRequisicionesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesAutorizarRequisiciones")) {
				jButtonNuevoAutorizarRequisicionesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarAutorizarRequisiciones")) {
				jButtonNuevoAutorizarRequisicionesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesAutorizarRequisiciones")) {
				jButtonNuevoAutorizarRequisicionesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarAutorizarRequisiciones")) {
				jButtonModificarAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarAutorizarRequisiciones")) {
				jButtonModificarAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarAutorizarRequisiciones")) {
				jButtonModificarAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarAutorizarRequisiciones")) {
				jButtonActualizarAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarAutorizarRequisiciones")) {
				jButtonActualizarAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarAutorizarRequisiciones")) {
				jButtonActualizarAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("EliminarAutorizarRequisiciones")) {
				jButtonEliminarAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarAutorizarRequisiciones")) {
				jButtonEliminarAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarAutorizarRequisiciones")) {
				jButtonEliminarAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("CancelarAutorizarRequisiciones")) {
				jButtonCancelarAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarAutorizarRequisiciones")) {
				jButtonCancelarAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarAutorizarRequisiciones")) {
				jButtonCancelarAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("CerrarAutorizarRequisiciones")) {
				jButtonCerrarAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarAutorizarRequisiciones")) {
				jButtonCerrarAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarAutorizarRequisiciones")) {
				jButtonCerrarAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarAutorizarRequisiciones")) {
				jButtonMostrarOcultarAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarAutorizarRequisiciones")) {
				jButtonCancelarAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosAutorizarRequisiciones")) {
				jButtonGuardarCambiosAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarAutorizarRequisiciones")) {
				jButtonGuardarCambiosAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarAutorizarRequisiciones")) {
				jButtonCopiarAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarAutorizarRequisiciones")) {
				jButtonVerFormAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosAutorizarRequisiciones")) {
				jButtonGuardarCambiosAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarAutorizarRequisiciones")) {
				jButtonCopiarAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormAutorizarRequisiciones")) {
				jButtonVerFormAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaAutorizarRequisiciones")) {
				jButtonGuardarCambiosAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarAutorizarRequisiciones")) {
				jButtonGuardarCambiosAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaAutorizarRequisiciones")) {
				jButtonGuardarCambiosAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionAutorizarRequisiciones")) {
				jButtonRecargarInformacionAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarAutorizarRequisiciones")) {
				jButtonRecargarInformacionAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionAutorizarRequisiciones")) {
				jButtonRecargarInformacionAutorizarRequisicionesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresAutorizarRequisiciones")) {
				jButtonAnterioresAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarAutorizarRequisiciones")) {
				jButtonAnterioresAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreAutorizarRequisiciones")) {
				jButtonAnterioresAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesAutorizarRequisiciones")) {
				jButtonSiguientesAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarAutorizarRequisiciones")) {
				jButtonSiguientesAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesAutorizarRequisiciones")) {
				jButtonSiguientesAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByAutorizarRequisiciones") || sTipo.equals("MenuItemDetalleAbrirOrderByAutorizarRequisiciones")) {
				jButtonAbrirOrderByAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarAutorizarRequisiciones") || sTipo.equals("MenuItemDetalleMostrarOcultarAutorizarRequisiciones")) {
				jButtonMostrarOcultarAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosAutorizarRequisiciones")) {
				jButtonNuevoGuardarCambiosAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarAutorizarRequisiciones")) {
				jButtonNuevoGuardarCambiosAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosAutorizarRequisiciones")) {
				jButtonNuevoGuardarCambiosAutorizarRequisicionesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoAutorizarRequisiciones")) {
				jButtonCerrarReporteDinamicoAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoAutorizarRequisiciones")) {
				jButtonGenerarReporteDinamicoAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoAutorizarRequisiciones")) {
				
				jButtonGenerarExcelReporteDinamicoAutorizarRequisicionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionAutorizarRequisiciones")) {
				jButtonCerrarImportacionAutorizarRequisicionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionAutorizarRequisiciones")) {
				
				jButtonGenerarImportacionAutorizarRequisicionesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionAutorizarRequisiciones")) {
				
				jButtonAbrirImportacionAutorizarRequisicionesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesAutorizarRequisiciones")) {
				jComboBoxTiposAccionesAutorizarRequisicionesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesAutorizarRequisiciones")) {
				jComboBoxTiposRelacionesAutorizarRequisicionesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioAutorizarRequisiciones")) {
				jComboBoxTiposAccionesAutorizarRequisicionesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarAutorizarRequisiciones")) {
				
				jComboBoxTiposSeleccionarAutorizarRequisicionesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralAutorizarRequisiciones")) {
				jTextFieldValorCampoGeneralAutorizarRequisicionesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByAutorizarRequisiciones")) {
				jButtonAbrirOrderByAutorizarRequisicionesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarAutorizarRequisiciones")) {
				jButtonAbrirOrderByAutorizarRequisicionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByAutorizarRequisiciones")) {
				jButtonCerrarOrderByAutorizarRequisicionesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAutorizarRequisicionesBusqueda")) {
				this.jButtonidAutorizarRequisicionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaAutorizarRequisicionesUpdate")) {
				this.jButtonid_empresaAutorizarRequisicionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaAutorizarRequisicionesBusqueda")) {
				this.jButtonid_empresaAutorizarRequisicionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalAutorizarRequisicionesUpdate")) {
				this.jButtonid_sucursalAutorizarRequisicionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalAutorizarRequisicionesBusqueda")) {
				this.jButtonid_sucursalAutorizarRequisicionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeAutorizarRequisicionesBusqueda")) {
				this.jButtonfecha_desdeAutorizarRequisicionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaAutorizarRequisicionesBusqueda")) {
				this.jButtonfecha_hastaAutorizarRequisicionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_tipo_requisicionAutorizarRequisicionesBusqueda")) {
				this.jButtoncodigo_tipo_requisicionAutorizarRequisicionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoAutorizarRequisicionesBusqueda")) {
				this.jButtoncodigoAutorizarRequisicionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaAutorizarRequisicionesBusqueda")) {
				this.jButtonfechaAutorizarRequisicionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteAutorizarRequisicionesBusqueda")) {
				this.jButtonnombre_completo_clienteAutorizarRequisicionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bodegaAutorizarRequisicionesBusqueda")) {
				this.jButtonnombre_bodegaAutorizarRequisicionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoAutorizarRequisicionesBusqueda")) {
				this.jButtonnombre_productoAutorizarRequisicionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadAutorizarRequisicionesBusqueda")) {
				this.jButtoncantidadAutorizarRequisicionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_autorizaAutorizarRequisicionesBusqueda")) {
				this.jButtonfecha_autorizaAutorizarRequisicionesBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaAutorizarRequisicionesAutorizarRequisiciones")) {
				this.jButtonBusquedaAutorizarRequisicionesAutorizarRequisicionesActionPerformed(evt);
			}
			
			;
			
			
			AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessAutorizarRequisiciones();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAutorizarRequisicionesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autorizarrequisiciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autorizarrequisiciones);
				
				AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
				
				


				
				AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutorizarRequisiciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutorizarRequisiciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			AutorizarRequisiciones autorizarrequisicionesLocal=null;
			
			if(!this.getEsControlTabla()) {
				autorizarrequisicionesLocal=this.autorizarrequisiciones;
			} else {
				autorizarrequisicionesLocal=this.autorizarrequisicionesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autorizarrequisiciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autorizarrequisiciones);
				
				AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
							
				
				


				
				AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutorizarRequisiciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutorizarRequisiciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutorizarRequisicionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAutorizarRequisiciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesAnterior =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autorizarrequisicionesAnterior =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
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
			
			AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
			
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
			
			


			
			AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAutorizarRequisicionesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autorizarrequisiciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autorizarrequisiciones);
				
				AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
								
						
				


				
				AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutorizarRequisiciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutorizarRequisiciones.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autorizarrequisiciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autorizarrequisiciones);
				
				AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
								
				
				


				
				AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutorizarRequisiciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutorizarRequisiciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutorizarRequisicionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAutorizarRequisiciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesAnterior =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autorizarrequisicionesAnterior =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autorizarrequisiciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autorizarrequisiciones);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutorizarRequisicionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAutorizarRequisiciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesAnterior =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autorizarrequisicionesAnterior =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutorizarRequisicionesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.autorizarrequisiciones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.autorizarrequisiciones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autorizarrequisiciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autorizarrequisiciones);
				
				AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
							
				
				


				
				AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutorizarRequisiciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutorizarRequisiciones.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAutorizarRequisicionesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAutorizarRequisiciones.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autorizarrequisicionesAnterior =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.autorizarrequisicionesAnterior =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
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
			
			AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
			
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
			
			


			
			AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutorizarRequisicionesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.autorizarrequisiciones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.autorizarrequisiciones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autorizarrequisiciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autorizarrequisiciones);
				
				AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
								
				
				


				
				AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutorizarRequisiciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutorizarRequisiciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutorizarRequisicionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAutorizarRequisiciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesAnterior =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autorizarrequisicionesAnterior =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutorizarRequisicionesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.autorizarrequisiciones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.autorizarrequisiciones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAutorizarRequisicionesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autorizarrequisiciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autorizarrequisiciones);
				
				AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosAutorizarRequisiciones")) {
					jCheckBoxSeleccionarTodosAutorizarRequisicionesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosAutorizarRequisiciones")) {
					jCheckBoxSeleccionadosAutorizarRequisicionesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarAutorizarRequisiciones")) {
					
				}
				
				


				
				
				AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutorizarRequisiciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutorizarRequisiciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.autorizarrequisiciones);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.autorizarrequisiciones);
				
				AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
												
				
				


				
				
				AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutorizarRequisiciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutorizarRequisiciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAutorizarRequisicionesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAutorizarRequisiciones.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.autorizarrequisicionesAnterior =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.autorizarrequisicionesAnterior =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAutorizarRequisicionesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autorizarrequisiciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autorizarrequisiciones);
				
				AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
				
				
				AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
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
			
			AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
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
			
			


			
			AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAutorizarRequisicionesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autorizarrequisiciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autorizarrequisiciones);
				
				AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutorizarRequisiciones.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutorizarRequisiciones.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.autorizarrequisiciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.autorizarrequisiciones);
				
				AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
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
				
				


				
				AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AutorizarRequisiciones.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AutorizarRequisiciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAutorizarRequisicionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAutorizarRequisiciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.autorizarrequisicionesAnterior =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.autorizarrequisicionesAnterior =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarAutorizarRequisiciones")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosAutorizarRequisicionesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosAutorizarRequisiciones.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.autorizarrequisiciones =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.autorizarrequisiciones);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarAutorizarRequisiciones")) {
				
				}
				
				AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarAutorizarRequisiciones")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosAutorizarRequisiciones.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarAutorizarRequisiciones")) {
			
			}
			
			AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessAutorizarRequisiciones();
			
			AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
			
			if(sTipo.equals("NuevoAutorizarRequisiciones")) {
				jButtonNuevoAutorizarRequisicionesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarAutorizarRequisiciones")) {
				jButtonDuplicarAutorizarRequisicionesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarAutorizarRequisiciones")) {
				jButtonCopiarAutorizarRequisicionesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormAutorizarRequisiciones")) {
				jButtonVerFormAutorizarRequisicionesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesAutorizarRequisiciones")) {
				jButtonNuevoAutorizarRequisicionesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarAutorizarRequisiciones")) {
				jButtonModificarAutorizarRequisicionesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarAutorizarRequisiciones")) {
				jButtonActualizarAutorizarRequisicionesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarAutorizarRequisiciones")) {
				jButtonEliminarAutorizarRequisicionesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaAutorizarRequisiciones")) {
				jButtonGuardarCambiosAutorizarRequisicionesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarAutorizarRequisiciones")) {
				jButtonCancelarAutorizarRequisicionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarAutorizarRequisiciones")) {
				jButtonCerrarAutorizarRequisicionesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosAutorizarRequisiciones")) {
				jButtonGuardarCambiosAutorizarRequisicionesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosAutorizarRequisiciones")) {
				jButtonNuevoGuardarCambiosAutorizarRequisicionesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByAutorizarRequisiciones")) {
				jButtonAbrirOrderByAutorizarRequisicionesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionAutorizarRequisiciones")) {
				jButtonRecargarInformacionAutorizarRequisicionesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresAutorizarRequisiciones")) {
				jButtonAnterioresAutorizarRequisicionesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesAutorizarRequisiciones")) {
				jButtonSiguientesAutorizarRequisicionesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAutorizarRequisicionesBusqueda")) {
				this.jButtonidAutorizarRequisicionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaAutorizarRequisicionesUpdate")) {
				this.jButtonid_empresaAutorizarRequisicionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaAutorizarRequisicionesBusqueda")) {
				this.jButtonid_empresaAutorizarRequisicionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalAutorizarRequisicionesUpdate")) {
				this.jButtonid_sucursalAutorizarRequisicionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalAutorizarRequisicionesBusqueda")) {
				this.jButtonid_sucursalAutorizarRequisicionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeAutorizarRequisicionesBusqueda")) {
				this.jButtonfecha_desdeAutorizarRequisicionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaAutorizarRequisicionesBusqueda")) {
				this.jButtonfecha_hastaAutorizarRequisicionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_tipo_requisicionAutorizarRequisicionesBusqueda")) {
				this.jButtoncodigo_tipo_requisicionAutorizarRequisicionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoAutorizarRequisicionesBusqueda")) {
				this.jButtoncodigoAutorizarRequisicionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaAutorizarRequisicionesBusqueda")) {
				this.jButtonfechaAutorizarRequisicionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteAutorizarRequisicionesBusqueda")) {
				this.jButtonnombre_completo_clienteAutorizarRequisicionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bodegaAutorizarRequisicionesBusqueda")) {
				this.jButtonnombre_bodegaAutorizarRequisicionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoAutorizarRequisicionesBusqueda")) {
				this.jButtonnombre_productoAutorizarRequisicionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadAutorizarRequisicionesBusqueda")) {
				this.jButtoncantidadAutorizarRequisicionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_autorizaAutorizarRequisicionesBusqueda")) {
				this.jButtonfecha_autorizaAutorizarRequisicionesBusquedaActionPerformed(evt);
			}
			
			AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessAutorizarRequisiciones();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameAutorizarRequisiciones")) {
				closingInternalFrameAutorizarRequisiciones();
				
			} else if(sTipo.equals("jButtonCancelarAutorizarRequisiciones")) {
				JInternalFrameBase jInternalFrameDetalleFormAutorizarRequisiciones = (JInternalFrameBase)evt.getSource();
	            	
	            AutorizarRequisicionesBeanSwingJInternalFrame jInternalFrameParent=(AutorizarRequisicionesBeanSwingJInternalFrame)jInternalFrameDetalleFormAutorizarRequisiciones.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarAutorizarRequisicionesActionPerformed(null);
			}
			
			AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.autorizarrequisiciones,new Object(),this.autorizarrequisicionesParameterGeneral,this.autorizarrequisicionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormAutorizarRequisiciones(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormAutorizarRequisiciones(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormAutorizarRequisiciones(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.autorizarrequisiciones)) {
			if(!esControlTabla) {
				if(AutorizarRequisicionesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.autorizarrequisiciones,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);			
				}
				
				if(this.autorizarrequisicionesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualAutorizarRequisiciones(this.autorizarrequisiciones,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanAutorizarRequisiciones(this.autorizarrequisicionesReturnGeneral,this.autorizarrequisicionesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.autorizarrequisicionesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanAutorizarRequisiciones(classes,this.autorizarrequisicionesReturnGeneral,this.autorizarrequisicionesBean,false);
					}
						
					if(this.autorizarrequisicionesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyAutorizarRequisiciones(this.autorizarrequisicionesReturnGeneral.getAutorizarRequisiciones());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioAutorizarRequisiciones(this.autorizarrequisicionesReturnGeneral.getAutorizarRequisiciones());	
					}
						
					if(this.autorizarrequisicionesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioAutorizarRequisiciones(this.autorizarrequisicionesReturnGeneral.getAutorizarRequisiciones(),classes);//this.autorizarrequisicionesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioAutorizarRequisiciones(this.autorizarrequisiciones,classes);//this.autorizarrequisicionesBean);									
				}
			
				if(AutorizarRequisicionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualAutorizarRequisiciones(this.autorizarrequisiciones,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAutorizarRequisiciones(this.autorizarrequisiciones);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.autorizarrequisicionesAnterior!=null) {
						this.autorizarrequisiciones=this.autorizarrequisicionesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.autorizarrequisicionesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.autorizarrequisicionesReturnGeneral.getAutorizarRequisiciones(),autorizarrequisicionesLogic.getAutorizarRequisicioness());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.autorizarrequisicionesReturnGeneral.getAutorizarRequisiciones(),this.autorizarrequisicioness);
				}
				//ARCHITECTURE
				
				//this.jTableDatosAutorizarRequisiciones.repaint();
				
				//((AbstractTableModel) this.jTableDatosAutorizarRequisiciones.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosAutorizarRequisiciones();
			}
		}
	}
	
	public void actualizarVisualTableDatosAutorizarRequisiciones() throws Exception {
		
		AutorizarRequisicionesModel autorizarrequisicionesModel=(AutorizarRequisicionesModel)this.jTableDatosAutorizarRequisiciones.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			autorizarrequisicionesModel.autorizarrequisicioness=this.autorizarrequisicionesLogic.getAutorizarRequisicioness();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			autorizarrequisicionesModel.autorizarrequisicioness=this.autorizarrequisicioness;
		}
		
		
		((AutorizarRequisicionesModel) this.jTableDatosAutorizarRequisiciones.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaAutorizarRequisiciones() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getautorizarrequisicionesAnterior(),this.autorizarrequisicionesLogic.getAutorizarRequisicioness());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getautorizarrequisicionesAnterior(),this.autorizarrequisicioness);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosAutorizarRequisiciones();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioAutorizarRequisiciones(AutorizarRequisiciones autorizarrequisiciones,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
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
										
				AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.autorizarrequisiciones,new Object(),generalEntityParameterGeneral,this.autorizarrequisicionesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.autorizarrequisicionesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=AutorizarRequisicionesConstantesFunciones.getClassesRelationshipsOfAutorizarRequisiciones(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=AutorizarRequisicionesConstantesFunciones.getClassesRelationshipsFromStringsOfAutorizarRequisiciones(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormAutorizarRequisiciones(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				AutorizarRequisicionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.autorizarrequisiciones,new Object(),generalEntityParameterGeneral,this.autorizarrequisicionesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioAutorizarRequisiciones(AutorizarRequisicionesBean autorizarrequisicionesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanAutorizarRequisiciones(ArrayList<Classe> classes,AutorizarRequisicionesReturnGeneral autorizarrequisicionesReturnGeneral,AutorizarRequisicionesBean autorizarrequisicionesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualAutorizarRequisiciones(AutorizarRequisiciones autorizarrequisiciones,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.autorizarrequisiciones)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormAutorizarRequisiciones = new AutorizarRequisicionesDetalleFormJInternalFrame(jDesktopPane,this.autorizarrequisicionesSessionBean.getConGuardarRelaciones(),this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.setVisible(false);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.setSelected(false);						
		
		this.jInternalFrameDetalleFormAutorizarRequisiciones.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormAutorizarRequisiciones.autorizarrequisicionesLogic=this.autorizarrequisicionesLogic;
		
		this.cargarCombosFrameForeignKeyAutorizarRequisiciones("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleAutorizarRequisiciones();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAutorizarRequisiciones();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyAutorizarRequisiciones("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyAutorizarRequisiciones();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormAutorizarRequisiciones.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAutorizarRequisiciones"));
		
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonModificarAutorizarRequisiciones.addActionListener(new ButtonActionListener(this,"ModificarAutorizarRequisiciones"));

		
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonModificarToolBarAutorizarRequisiciones.addActionListener(new ButtonActionListener(this,"ModificarToolBarAutorizarRequisiciones"));
					
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jMenuItemModificarAutorizarRequisiciones.addActionListener(new ButtonActionListener(this,"MenuItemModificarAutorizarRequisiciones"));		
		
		
		
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonActualizarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"ActualizarAutorizarRequisiciones"));
		
		
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonActualizarToolBarAutorizarRequisiciones.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAutorizarRequisiciones"));
						
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jMenuItemActualizarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAutorizarRequisiciones"));		
		
		
		
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonEliminarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"EliminarAutorizarRequisiciones"));
		
		
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonEliminarToolBarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"EliminarToolBarAutorizarRequisiciones"));
								
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jMenuItemEliminarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAutorizarRequisiciones"));		
		
		
		
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonCancelarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"CancelarAutorizarRequisiciones"));
		
		
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonCancelarToolBarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"CancelarToolBarAutorizarRequisiciones"));
					
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jMenuItemCancelarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAutorizarRequisiciones"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jMenuItemDetalleCerrarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAutorizarRequisiciones"));		
		
		
		
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonGuardarCambiosToolBarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAutorizarRequisiciones"));
		
		
		
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonGuardarCambiosToolBarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAutorizarRequisiciones"));
		
		
		
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxTiposAccionesFormularioAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAutorizarRequisiciones"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonidAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"idAutorizarRequisicionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonid_empresaAutorizarRequisicionesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAutorizarRequisicionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonid_empresaAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAutorizarRequisicionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonid_sucursalAutorizarRequisicionesUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalAutorizarRequisicionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonid_sucursalAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalAutorizarRequisicionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonfecha_desdeAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeAutorizarRequisicionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonfecha_hastaAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaAutorizarRequisicionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtoncodigo_tipo_requisicionAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tipo_requisicionAutorizarRequisicionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtoncodigoAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"codigoAutorizarRequisicionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonfechaAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"fechaAutorizarRequisicionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonnombre_completo_clienteAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteAutorizarRequisicionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonnombre_bodegaAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaAutorizarRequisicionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonnombre_productoAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoAutorizarRequisicionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtoncantidadAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"cantidadAutorizarRequisicionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonfecha_autorizaAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_autorizaAutorizarRequisicionesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jTabbedPaneRelacionesAutorizarRequisiciones.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAutorizarRequisiciones"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameAutorizarRequisiciones"));
		
		if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutorizarRequisiciones.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAutorizarRequisiciones"));
		}
		
		this.jTableDatosAutorizarRequisiciones.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarAutorizarRequisiciones"));
		
		this.jTableDatosAutorizarRequisiciones.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarAutorizarRequisiciones"));
		
		this.jButtonNuevoAutorizarRequisiciones.addActionListener(new ButtonActionListener(this,"NuevoAutorizarRequisiciones"));
		
		this.jButtonDuplicarAutorizarRequisiciones.addActionListener(new ButtonActionListener(this,"DuplicarAutorizarRequisiciones"));
		
		this.jButtonCopiarAutorizarRequisiciones.addActionListener(new ButtonActionListener(this,"CopiarAutorizarRequisiciones"));
		
		this.jButtonVerFormAutorizarRequisiciones.addActionListener(new ButtonActionListener(this,"VerFormAutorizarRequisiciones"));
		
		
		this.jButtonNuevoToolBarAutorizarRequisiciones.addActionListener(new ButtonActionListener(this,"NuevoToolBarAutorizarRequisiciones"));
			
		this.jButtonDuplicarToolBarAutorizarRequisiciones.addActionListener(new ButtonActionListener(this,"DuplicarToolBarAutorizarRequisiciones"));
			
		this.jMenuItemNuevoAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"MenuItemNuevoAutorizarRequisiciones"));
			
		this.jMenuItemDuplicarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarAutorizarRequisiciones"));		
		
		
		this.jButtonNuevoRelacionesAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"NuevoRelacionesAutorizarRequisiciones"));
		
		
		this.jButtonNuevoRelacionesToolBarAutorizarRequisiciones.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarAutorizarRequisiciones"));
			
		this.jMenuItemNuevoRelacionesAutorizarRequisiciones.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesAutorizarRequisiciones"));		
		
		
		if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonModificarAutorizarRequisiciones.addActionListener(new ButtonActionListener(this,"ModificarAutorizarRequisiciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonModificarToolBarAutorizarRequisiciones.addActionListener(new ButtonActionListener(this,"ModificarToolBarAutorizarRequisiciones"));
			
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jMenuItemModificarAutorizarRequisiciones.addActionListener(new ButtonActionListener(this,"MenuItemModificarAutorizarRequisiciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonActualizarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"ActualizarAutorizarRequisiciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonActualizarToolBarAutorizarRequisiciones.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAutorizarRequisiciones"));
				
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jMenuItemActualizarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAutorizarRequisiciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonEliminarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"EliminarAutorizarRequisiciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonEliminarToolBarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"EliminarToolBarAutorizarRequisiciones"));
						
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jMenuItemEliminarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAutorizarRequisiciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonCancelarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"CancelarAutorizarRequisiciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonCancelarToolBarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"CancelarToolBarAutorizarRequisiciones"));
			
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jMenuItemCancelarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAutorizarRequisiciones"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarAutorizarRequisiciones"));		
		
		
		this.jButtonCerrarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"CerrarAutorizarRequisiciones"));
		
		
		this.jButtonCerrarToolBarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"CerrarToolBarAutorizarRequisiciones"));
			
		this.jMenuItemCerrarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"MenuItemCerrarAutorizarRequisiciones"));
			
		if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jMenuItemDetalleCerrarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAutorizarRequisiciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonGuardarCambiosAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosAutorizarRequisiciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonGuardarCambiosToolBarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAutorizarRequisiciones"));
		}
		
		this.jButtonCopiarToolBarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"CopiarToolBarAutorizarRequisiciones"));
			
		this.jButtonVerFormToolBarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"VerFormToolBarAutorizarRequisiciones"));
		
		this.jMenuItemGuardarCambiosAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosAutorizarRequisiciones"));
			
		this.jMenuItemCopiarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"MenuItemCopiarAutorizarRequisiciones"));		
		
		this.jMenuItemVerFormAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"MenuItemVerFormAutorizarRequisiciones"));		
		
		
		this.jButtonGuardarCambiosTablaAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAutorizarRequisiciones"));
		
		
		this.jButtonGuardarCambiosTablaToolBarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarAutorizarRequisiciones"));
			
		this.jMenuItemGuardarCambiosTablaAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAutorizarRequisiciones"));		
		
		
		
		this.jButtonRecargarInformacionAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"RecargarInformacionAutorizarRequisiciones"));
					
		this.jButtonRecargarInformacionToolBarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarAutorizarRequisiciones"));
		
		this.jMenuItemRecargarInformacionAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionAutorizarRequisiciones"));		
		
		
		
		this.jButtonAnterioresAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"AnterioresAutorizarRequisiciones"));
		
		
		this.jButtonAnterioresToolBarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"AnterioresToolBarAutorizarRequisiciones"));
		
		this.jMenuItemAnterioresAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresAutorizarRequisiciones"));		
		
		
		this.jButtonSiguientesAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"SiguientesAutorizarRequisiciones"));
		
		
		this.jButtonSiguientesToolBarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"SiguientesToolBarAutorizarRequisiciones"));
			
		this.jMenuItemSiguientesAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesAutorizarRequisiciones"));
			
		this.jMenuItemAbrirOrderByAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByAutorizarRequisiciones"));
			
		this.jMenuItemMostrarOcultarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarAutorizarRequisiciones"));
			
		this.jMenuItemDetalleAbrirOrderByAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByAutorizarRequisiciones"));
			
		this.jMenuItemDetalleMostarOcultarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarAutorizarRequisiciones"));		
		
		
		this.jButtonNuevoGuardarCambiosAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosAutorizarRequisiciones"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarAutorizarRequisiciones"));
			
		this.jMenuItemNuevoGuardarCambiosAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosAutorizarRequisiciones"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosAutorizarRequisiciones.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosAutorizarRequisiciones"));

		this.jCheckBoxSeleccionadosAutorizarRequisiciones.addItemListener(new CheckBoxItemListener(this,"SeleccionadosAutorizarRequisiciones"));
		
		if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxTiposAccionesFormularioAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAutorizarRequisiciones"));
		}
		
		
		this.jComboBoxTiposRelacionesAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"TiposRelacionesAutorizarRequisiciones"));
			
		this.jComboBoxTiposAccionesAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"TiposAccionesAutorizarRequisiciones"));
					
		this.jComboBoxTiposSeleccionarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"TiposSeleccionarAutorizarRequisiciones"));
			
		this.jTextFieldValorCampoGeneralAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralAutorizarRequisiciones"));		
		
		
		if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonidAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"idAutorizarRequisicionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonid_empresaAutorizarRequisicionesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAutorizarRequisicionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonid_empresaAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAutorizarRequisicionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonid_sucursalAutorizarRequisicionesUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalAutorizarRequisicionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonid_sucursalAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalAutorizarRequisicionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonfecha_desdeAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeAutorizarRequisicionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonfecha_hastaAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaAutorizarRequisicionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtoncodigo_tipo_requisicionAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tipo_requisicionAutorizarRequisicionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtoncodigoAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"codigoAutorizarRequisicionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonfechaAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"fechaAutorizarRequisicionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonnombre_completo_clienteAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteAutorizarRequisicionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonnombre_bodegaAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaAutorizarRequisicionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonnombre_productoAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoAutorizarRequisicionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtoncantidadAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"cantidadAutorizarRequisicionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonfecha_autorizaAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_autorizaAutorizarRequisicionesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaAutorizarRequisicionesAutorizarRequisiciones.addActionListener(new ButtonActionListener(this,"BusquedaAutorizarRequisicionesAutorizarRequisiciones"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoAutorizarRequisiciones!=null) {
				this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAutorizarRequisiciones"));
				this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAutorizarRequisiciones"));
				this.jInternalFrameReporteDinamicoAutorizarRequisiciones.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAutorizarRequisiciones"));
			}
			
			//this.jButtonCerrarReporteDinamicoAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAutorizarRequisiciones"));				
			//this.jButtonGenerarReporteDinamicoAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAutorizarRequisiciones"));
			//this.jButtonGenerarExcelReporteDinamicoAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAutorizarRequisiciones"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionAutorizarRequisiciones!=null) {
				this.jInternalFrameImportacionAutorizarRequisiciones.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAutorizarRequisiciones"));
				this.jInternalFrameImportacionAutorizarRequisiciones.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAutorizarRequisiciones"));
				this.jInternalFrameImportacionAutorizarRequisiciones.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAutorizarRequisiciones"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"AbrirOrderByAutorizarRequisiciones"));
			
			this.jButtonAbrirOrderByToolBarAutorizarRequisiciones.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarAutorizarRequisiciones"));			
			
			if(this.jInternalFrameOrderByAutorizarRequisiciones!=null) {
				this.jInternalFrameOrderByAutorizarRequisiciones.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAutorizarRequisiciones"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAutorizarRequisiciones.jTabbedPaneRelacionesAutorizarRequisiciones.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAutorizarRequisiciones"));
		
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
            		closingInternalFrameAutorizarRequisiciones();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormAutorizarRequisiciones.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormAutorizarRequisiciones = (JInternalFrameBase)event.getSource();
	            	
	            AutorizarRequisicionesBeanSwingJInternalFrame jInternalFrameParent=(AutorizarRequisicionesBeanSwingJInternalFrame)jInternalFrameDetalleFormAutorizarRequisiciones.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarAutorizarRequisicionesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosAutorizarRequisiciones.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosAutorizarRequisicionesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosAutorizarRequisiciones.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosAutorizarRequisiciones.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAutorizarRequisicionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAutorizarRequisicionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAutorizarRequisicionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoAutorizarRequisiciones";
		inputMap = this.jButtonNuevoAutorizarRequisiciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoAutorizarRequisiciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAutorizarRequisicionesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAutorizarRequisicionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAutorizarRequisicionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAutorizarRequisicionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesAutorizarRequisiciones";
		inputMap = this.jButtonNuevoRelacionesAutorizarRequisiciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesAutorizarRequisiciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAutorizarRequisicionesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarAutorizarRequisiciones";
		inputMap = this.jButtonModificarAutorizarRequisiciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarAutorizarRequisiciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarAutorizarRequisicionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarAutorizarRequisiciones";
		inputMap = this.jButtonActualizarAutorizarRequisiciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarAutorizarRequisiciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarAutorizarRequisicionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarAutorizarRequisiciones";
		inputMap = this.jButtonEliminarAutorizarRequisiciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarAutorizarRequisiciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarAutorizarRequisicionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarAutorizarRequisiciones";
		inputMap = this.jButtonCancelarAutorizarRequisiciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarAutorizarRequisiciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarAutorizarRequisicionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarAutorizarRequisiciones";
		inputMap = this.jButtonCerrarAutorizarRequisiciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarAutorizarRequisiciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarAutorizarRequisicionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonGuardarCambiosAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosAutorizarRequisiciones";
		inputMap = this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonGuardarCambiosAutorizarRequisiciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonGuardarCambiosAutorizarRequisiciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosAutorizarRequisicionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosAutorizarRequisiciones.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosAutorizarRequisicionesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesAutorizarRequisiciones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesAutorizarRequisicionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarAutorizarRequisiciones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarAutorizarRequisicionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralAutorizarRequisiciones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralAutorizarRequisicionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonidAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"idAutorizarRequisicionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonid_empresaAutorizarRequisicionesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAutorizarRequisicionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonid_empresaAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAutorizarRequisicionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonid_sucursalAutorizarRequisicionesUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalAutorizarRequisicionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonid_sucursalAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalAutorizarRequisicionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonfecha_desdeAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeAutorizarRequisicionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonfecha_hastaAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaAutorizarRequisicionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtoncodigo_tipo_requisicionAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tipo_requisicionAutorizarRequisicionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtoncodigoAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"codigoAutorizarRequisicionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonfechaAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"fechaAutorizarRequisicionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonnombre_completo_clienteAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteAutorizarRequisicionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonnombre_bodegaAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaAutorizarRequisicionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonnombre_productoAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoAutorizarRequisicionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtoncantidadAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"cantidadAutorizarRequisicionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jButtonfecha_autorizaAutorizarRequisicionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_autorizaAutorizarRequisicionesBusqueda"));
		
		
		this.jButtonBusquedaAutorizarRequisicionesAutorizarRequisiciones.addActionListener(new ButtonActionListener(this,"BusquedaAutorizarRequisicionesAutorizarRequisiciones"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionAutorizarRequisiciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionAutorizarRequisicionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarAutorizarRequisicionesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarAutorizarRequisiciones.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosAutorizarRequisiciones(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(AutorizarRequisiciones autorizarrequisicionesAux:this.autorizarrequisicionesLogic.getAutorizarRequisicioness()) {
					autorizarrequisicionesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AutorizarRequisiciones autorizarrequisicionesAux:autorizarrequisicioness) {
					autorizarrequisicionesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosAutorizarRequisicionesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAutorizarRequisiciones(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(AutorizarRequisiciones autorizarrequisicionesAux:this.autorizarrequisicionesLogic.getAutorizarRequisicioness()) {
						autorizarrequisicionesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AutorizarRequisiciones autorizarrequisicionesAux:autorizarrequisicioness) {
						autorizarrequisicionesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(AutorizarRequisiciones autorizarrequisicionesAux:this.autorizarrequisicionesLogic.getAutorizarRequisicioness()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AutorizarRequisiciones autorizarrequisicionesAux:autorizarrequisicioness) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaAutorizarRequisiciones(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAutorizarRequisiciones.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAutorizarRequisiciones.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAutorizarRequisiciones,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosAutorizarRequisicionesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAutorizarRequisiciones(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosAutorizarRequisiciones.getSelectedRows();
			
			AutorizarRequisiciones autorizarrequisicionesLocal=new AutorizarRequisiciones();
			
			//this.seleccionarTodosAutorizarRequisiciones(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					autorizarrequisicionesLocal =(AutorizarRequisiciones) this.autorizarrequisicionesLogic.getAutorizarRequisicioness().toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					autorizarrequisicionesLocal =(AutorizarRequisiciones) this.autorizarrequisicioness.toArray()[this.jTableDatosAutorizarRequisiciones.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				autorizarrequisicionesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(AutorizarRequisiciones autorizarrequisicionesAux:this.autorizarrequisicionesLogic.getAutorizarRequisicioness()) {
						autorizarrequisicionesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AutorizarRequisiciones autorizarrequisicionesAux:autorizarrequisicioness) {
						autorizarrequisicionesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaAutorizarRequisiciones(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAutorizarRequisiciones.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAutorizarRequisiciones.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAutorizarRequisiciones,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualAutorizarRequisicionesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarAutorizarRequisicionesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralAutorizarRequisicionesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingAutorizarRequisiciones(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralAutorizarRequisiciones.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(AutorizarRequisiciones autorizarrequisicionesAux:this.autorizarrequisicionesLogic.getAutorizarRequisicioness()) {
				
						if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							autorizarrequisicionesAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							autorizarrequisicionesAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_CODIGOTIPOREQUISICION)) {
							existe=true;
							autorizarrequisicionesAux.setcodigo_tipo_requisicion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							autorizarrequisicionesAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							autorizarrequisicionesAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							autorizarrequisicionesAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREBODEGA)) {
							existe=true;
							autorizarrequisicionesAux.setnombre_bodega(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							autorizarrequisicionesAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							autorizarrequisicionesAux.setcantidad(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_FECHAAUTORIZA)) {
							existe=true;
							autorizarrequisicionesAux.setfecha_autoriza(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AutorizarRequisiciones autorizarrequisicionesAux:autorizarrequisicioness) {
					
						if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							autorizarrequisicionesAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							autorizarrequisicionesAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_CODIGOTIPOREQUISICION)) {
							existe=true;
							autorizarrequisicionesAux.setcodigo_tipo_requisicion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							autorizarrequisicionesAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							autorizarrequisicionesAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							autorizarrequisicionesAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREBODEGA)) {
							existe=true;
							autorizarrequisicionesAux.setnombre_bodega(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							autorizarrequisicionesAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							autorizarrequisicionesAux.setcantidad(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_FECHAAUTORIZA)) {
							existe=true;
							autorizarrequisicionesAux.setfecha_autoriza(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaAutorizarRequisiciones(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesAutorizarRequisicionesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingAutorizarRequisiciones(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioAutorizarRequisiciones=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesAutorizarRequisiciones.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxTiposAccionesFormularioAutorizarRequisiciones.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteAutorizarRequisiciones) {				
					conSplash=true;//false;										
					
					//this.startProcessAutorizarRequisiciones(conSplash);
				
					this.generarReporteAutorizarRequisicionessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAutorizarRequisiciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxTiposAccionesFormularioAutorizarRequisiciones.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoAutorizarRequisicionessSeleccionados();
				//this.jComboBoxTiposAccionesAutorizarRequisiciones.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAutorizarRequisicionessSeleccionados(false);
				//this.jComboBoxTiposAccionesAutorizarRequisiciones.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAutorizarRequisicionessSeleccionados(true);
				//this.jComboBoxTiposAccionesAutorizarRequisiciones.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAutorizarRequisiciones();
				
				this.exportarAutorizarRequisicionessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAutorizarRequisiciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxTiposAccionesFormularioAutorizarRequisiciones.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionAutorizarRequisicioness();
				//this.importarAutorizarRequisicioness();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAutorizarRequisiciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxTiposAccionesFormularioAutorizarRequisiciones.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAutorizarRequisiciones();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelAutorizarRequisicionessSeleccionados();
				//this.jComboBoxTiposAccionesAutorizarRequisiciones.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Autorizar Requisiciones", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessAutorizarRequisiciones();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoAutorizarRequisiciones)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyAutorizarRequisiciones(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Autorizar Requisiciones",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAutorizarRequisiciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxTiposAccionesFormularioAutorizarRequisiciones.setSelectedIndex(0);					
				}	
			} 			
			else if(AutorizarRequisicionesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteAutorizarRequisiciones) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessAutorizarRequisiciones(conSplash);
					
						//this.actualizarParametrosGeneralAutorizarRequisiciones();
						
						this.generarReporteProcesoAccionAutorizarRequisicionessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesAutorizarRequisiciones.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxTiposAccionesFormularioAutorizarRequisiciones.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(AutorizarRequisicionesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Autorizar RequisicionesES SELECCIONADOS?", "MANTENIMIENTO DE Autorizar Requisiciones", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessAutorizarRequisiciones();
				
						this.actualizarParametrosGeneralAutorizarRequisiciones();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.autorizarrequisicionesReturnGeneral=autorizarrequisicionesLogic.procesarAccionAutorizarRequisicionessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.autorizarrequisicionesLogic.getAutorizarRequisicioness(),this.autorizarrequisicionesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarAutorizarRequisicionesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAutorizarRequisiciones.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxTiposAccionesFormularioAutorizarRequisiciones.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralAutorizarRequisiciones();
					
					AutorizarRequisicionesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarAutorizarRequisicionesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAutorizarRequisiciones.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxTiposAccionesFormularioAutorizarRequisiciones.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessAutorizarRequisiciones(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesAutorizarRequisicionesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessAutorizarRequisiciones();
			
			if(this.jInternalFrameDetalleFormAutorizarRequisiciones==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<AutorizarRequisiciones> autorizarrequisicionessSeleccionados=new ArrayList<AutorizarRequisiciones>();		
			AutorizarRequisiciones autorizarrequisiciones=new AutorizarRequisiciones();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingAutorizarRequisiciones(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesAutorizarRequisiciones.getSelectedItem();
			
			
			
			
			autorizarrequisicionessSeleccionados=this.getAutorizarRequisicionessSeleccionados(true);
			//this.sTipoAccion;
			
			if(autorizarrequisicionessSeleccionados.size()==1) {
				for(AutorizarRequisiciones autorizarrequisicionesAux:autorizarrequisicionessSeleccionados) {
					autorizarrequisiciones=autorizarrequisicionesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessAutorizarRequisiciones();
			
      		//this.finishProcessAutorizarRequisiciones(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarAutorizarRequisicionesReturnGeneral() throws Exception {
		if(this.autorizarrequisicionesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.autorizarrequisicionesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.autorizarrequisicionesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.autorizarrequisicionesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.autorizarrequisicionesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.autorizarrequisicionesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingAutorizarRequisiciones(false);
		}
		
		if(this.autorizarrequisicionesReturnGeneral.getConRetornoLista() || this.autorizarrequisicionesReturnGeneral.getConRetornoObjeto()) {
			if(this.autorizarrequisicionesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.autorizarrequisicionesLogic.setAutorizarRequisicioness(this.autorizarrequisicionesReturnGeneral.getAutorizarRequisicioness());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingAutorizarRequisiciones(false);
		}
	}
	
	public void actualizarParametrosGeneralAutorizarRequisiciones() throws Exception {
		
		
	}
	
	public ArrayList<AutorizarRequisiciones> getAutorizarRequisicionessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<AutorizarRequisiciones> autorizarrequisicionessSeleccionados=new ArrayList<AutorizarRequisiciones>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioAutorizarRequisiciones) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(AutorizarRequisiciones autorizarrequisicionesAux:autorizarrequisicionesLogic.getAutorizarRequisicioness()) {
					if(autorizarrequisicionesAux.getIsSelected()) {
						autorizarrequisicionessSeleccionados.add(autorizarrequisicionesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AutorizarRequisiciones autorizarrequisicionesAux:this.autorizarrequisicioness) {
					if(autorizarrequisicionesAux.getIsSelected()) {
						autorizarrequisicionessSeleccionados.add(autorizarrequisicionesAux);				
					}
				}
			}
			
			if(autorizarrequisicionessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						autorizarrequisicionessSeleccionados.addAll(this.autorizarrequisicionesLogic.getAutorizarRequisicioness());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						autorizarrequisicionessSeleccionados.addAll(this.autorizarrequisicioness);				
					}
				}
			}
		} else {
			autorizarrequisicionessSeleccionados.add(this.autorizarrequisiciones);
		}
		
		return autorizarrequisicionessSeleccionados;
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
	
	public void generarReporteAutorizarRequisicionessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalAutorizarRequisicionessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoAutorizarRequisicionessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAutorizarRequisicionessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAutorizarRequisicionessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Autorizar Requisiciones",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesAutorizarRequisicionessSeleccionados() throws Exception {
		ArrayList<AutorizarRequisiciones> autorizarrequisicionessSeleccionados=new ArrayList<AutorizarRequisiciones>();		
		
		autorizarrequisicionessSeleccionados=this.getAutorizarRequisicionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteAutorizarRequisicioness("Todos",autorizarrequisicionessSeleccionados);
		
	}	
	
	public void generarReporteNormalAutorizarRequisicionessSeleccionados() throws Exception {
		ArrayList<AutorizarRequisiciones> autorizarrequisicionessSeleccionados=new ArrayList<AutorizarRequisiciones>();		
		
		autorizarrequisicionessSeleccionados=this.getAutorizarRequisicionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteAutorizarRequisicioness("Todos",autorizarrequisicionessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionAutorizarRequisicionessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<AutorizarRequisiciones> autorizarrequisicionessSeleccionados=new ArrayList<AutorizarRequisiciones>();
		
		autorizarrequisicionessSeleccionados=this.getAutorizarRequisicionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteAutorizarRequisicioness("Todos",autorizarrequisicionessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoAutorizarRequisicionessSeleccionados() throws Exception {
		ArrayList<AutorizarRequisiciones> autorizarrequisicionessSeleccionados=new ArrayList<AutorizarRequisiciones>();		
		
		
		this.abrirInicializarFrameReporteDinamicoAutorizarRequisiciones();
		
		
		autorizarrequisicionessSeleccionados=this.getAutorizarRequisicionessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoAutorizarRequisiciones();
		
		
		//this.generarReporteAutorizarRequisicioness("Todos",autorizarrequisicionessSeleccionados ,autorizarrequisicionesImplementable,autorizarrequisicionesImplementableHome);
	}
	
	public void mostrarImportacionAutorizarRequisicioness() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionAutorizarRequisiciones();
		
		this.abrirFrameImportacionAutorizarRequisiciones();		
		
			
		//this.generarReporteAutorizarRequisicioness("Todos",autorizarrequisicionessSeleccionados ,autorizarrequisicionesImplementable,autorizarrequisicionesImplementableHome);
	}
	
	public void importarAutorizarRequisicioness() throws Exception {		
	
	}
	
	public void exportarAutorizarRequisicionessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelAutorizarRequisicionessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoAutorizarRequisicionessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlAutorizarRequisicionessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Autorizar Requisiciones",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoAutorizarRequisicionessSeleccionados() throws Exception {
		ArrayList<AutorizarRequisiciones> autorizarrequisicionessSeleccionados=new ArrayList<AutorizarRequisiciones>();		
		
		autorizarrequisicionessSeleccionados=this.getAutorizarRequisicionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"autorizarrequisiciones."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarAutorizarRequisiciones(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(AutorizarRequisiciones autorizarrequisicionesAux:autorizarrequisicionessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarAutorizarRequisiciones(autorizarrequisicionesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//autorizarrequisicionesAux.setsDetalleGeneralEntityReporte(autorizarrequisicionesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autorizar Requisiciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarAutorizarRequisiciones(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=AutorizarRequisicionesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutorizarRequisicionesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutorizarRequisicionesConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutorizarRequisicionesConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutorizarRequisicionesConstantesFunciones.LABEL_FECHADESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutorizarRequisicionesConstantesFunciones.LABEL_FECHAHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutorizarRequisicionesConstantesFunciones.LABEL_CODIGOTIPOREQUISICION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutorizarRequisicionesConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutorizarRequisicionesConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutorizarRequisicionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutorizarRequisicionesConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AutorizarRequisicionesConstantesFunciones.LABEL_FECHAAUTORIZA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarAutorizarRequisiciones(AutorizarRequisiciones autorizarrequisiciones,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=autorizarrequisiciones.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=autorizarrequisiciones.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=autorizarrequisiciones.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autorizarrequisiciones.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autorizarrequisiciones.getfecha_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autorizarrequisiciones.getfecha_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autorizarrequisiciones.getcodigo_tipo_requisicion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autorizarrequisiciones.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autorizarrequisiciones.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autorizarrequisiciones.getnombre_completo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autorizarrequisiciones.getnombre_bodega();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autorizarrequisiciones.getnombre_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autorizarrequisiciones.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=autorizarrequisiciones.getfecha_autoriza().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelAutorizarRequisicionessSeleccionados() throws Exception {
		ArrayList<AutorizarRequisiciones> autorizarrequisicionessSeleccionados=new ArrayList<AutorizarRequisiciones>();		
		
		autorizarrequisicionessSeleccionados=this.getAutorizarRequisicionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"autorizarrequisiciones.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("AutorizarRequisicioness");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelAutorizarRequisiciones(row);				
				iRow++;
			}				
			
			for(AutorizarRequisiciones autorizarrequisicionesAux:autorizarrequisicionessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelAutorizarRequisiciones(autorizarrequisicionesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autorizar Requisiciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlAutorizarRequisicionessSeleccionados() throws Exception {
		ArrayList<AutorizarRequisiciones> autorizarrequisicionessSeleccionados=new ArrayList<AutorizarRequisiciones>();		
		
		autorizarrequisicionessSeleccionados=this.getAutorizarRequisicionessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"autorizarrequisiciones.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("autorizarrequisicioness");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("autorizarrequisiciones");
			//elementRoot.appendChild(element);
		
			for(AutorizarRequisiciones autorizarrequisicionesAux:autorizarrequisicionessSeleccionados) {
				element = document.createElement("autorizarrequisiciones");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlAutorizarRequisiciones(autorizarrequisicionesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Autorizar Requisiciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelAutorizarRequisiciones(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_FECHADESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_FECHAHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_CODIGOTIPOREQUISICION);
		cell = row.createCell(iColumn++);cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(AutorizarRequisicionesConstantesFunciones.LABEL_FECHAAUTORIZA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelAutorizarRequisiciones(AutorizarRequisiciones autorizarrequisiciones,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(autorizarrequisiciones.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(autorizarrequisiciones.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(autorizarrequisiciones.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(autorizarrequisiciones.getfecha_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(autorizarrequisiciones.getfecha_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(autorizarrequisiciones.getcodigo_tipo_requisicion());
		cell = row.createCell(iColumn++);cell.setCellValue(autorizarrequisiciones.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(autorizarrequisiciones.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(autorizarrequisiciones.getnombre_completo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(autorizarrequisiciones.getnombre_bodega());
		cell = row.createCell(iColumn++);cell.setCellValue(autorizarrequisiciones.getnombre_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(autorizarrequisiciones.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(autorizarrequisiciones.getfecha_autoriza());				
	}
	
	public void setFilaDatosExportarXmlAutorizarRequisiciones(AutorizarRequisiciones autorizarrequisiciones,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(AutorizarRequisicionesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(autorizarrequisiciones.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(AutorizarRequisicionesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(autorizarrequisiciones.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(AutorizarRequisicionesConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(autorizarrequisiciones.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(AutorizarRequisicionesConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(autorizarrequisiciones.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementfecha_desde = document.createElement(AutorizarRequisicionesConstantesFunciones.FECHADESDE);
		elementfecha_desde.appendChild(document.createTextNode(autorizarrequisiciones.getfecha_desde().toString().trim()));
		element.appendChild(elementfecha_desde);

		Element elementfecha_hasta = document.createElement(AutorizarRequisicionesConstantesFunciones.FECHAHASTA);
		elementfecha_hasta.appendChild(document.createTextNode(autorizarrequisiciones.getfecha_hasta().toString().trim()));
		element.appendChild(elementfecha_hasta);

		Element elementcodigo_tipo_requisicion = document.createElement(AutorizarRequisicionesConstantesFunciones.CODIGOTIPOREQUISICION);
		elementcodigo_tipo_requisicion.appendChild(document.createTextNode(autorizarrequisiciones.getcodigo_tipo_requisicion().trim()));
		element.appendChild(elementcodigo_tipo_requisicion);

		Element elementcodigo = document.createElement(AutorizarRequisicionesConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(autorizarrequisiciones.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementfecha = document.createElement(AutorizarRequisicionesConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(autorizarrequisiciones.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementnombre_completo_cliente = document.createElement(AutorizarRequisicionesConstantesFunciones.NOMBRECOMPLETOCLIENTE);
		elementnombre_completo_cliente.appendChild(document.createTextNode(autorizarrequisiciones.getnombre_completo_cliente().trim()));
		element.appendChild(elementnombre_completo_cliente);

		Element elementnombre_bodega = document.createElement(AutorizarRequisicionesConstantesFunciones.NOMBREBODEGA);
		elementnombre_bodega.appendChild(document.createTextNode(autorizarrequisiciones.getnombre_bodega().trim()));
		element.appendChild(elementnombre_bodega);

		Element elementnombre_producto = document.createElement(AutorizarRequisicionesConstantesFunciones.NOMBREPRODUCTO);
		elementnombre_producto.appendChild(document.createTextNode(autorizarrequisiciones.getnombre_producto().trim()));
		element.appendChild(elementnombre_producto);

		Element elementcantidad = document.createElement(AutorizarRequisicionesConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(autorizarrequisiciones.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementfecha_autoriza = document.createElement(AutorizarRequisicionesConstantesFunciones.FECHAAUTORIZA);
		elementfecha_autoriza.appendChild(document.createTextNode(autorizarrequisiciones.getfecha_autoriza().toString().trim()));
		element.appendChild(elementfecha_autoriza);
	}
	
	public void generarReporteGroupGenericoAutorizarRequisicionessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<AutorizarRequisiciones> autorizarrequisicionessSeleccionados=new ArrayList<AutorizarRequisiciones>();
		
		autorizarrequisicionessSeleccionados=this.getAutorizarRequisicionessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoAutorizarRequisiciones(autorizarrequisicionessSeleccionados);
		
		this.generarReporteAutorizarRequisicioness("Todos",autorizarrequisicionessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoAutorizarRequisiciones(ArrayList<AutorizarRequisiciones> autorizarrequisicionessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(AutorizarRequisiciones autorizarrequisicionesAux:autorizarrequisicionessSeleccionados) {
				autorizarrequisicionesAux.setsDetalleGeneralEntityReporte(autorizarrequisicionesAux.toString());
			
				if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					autorizarrequisicionesAux.setsDescripcionGeneralEntityReporte1(autorizarrequisicionesAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					autorizarrequisicionesAux.setsDescripcionGeneralEntityReporte1(autorizarrequisicionesAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_FECHADESDE)) {
					existe=true;
					autorizarrequisicionesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(autorizarrequisicionesAux.getfecha_desde()));
				}
				 else if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_FECHAHASTA)) {
					existe=true;
					autorizarrequisicionesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(autorizarrequisicionesAux.getfecha_hasta()));
				}
				 else if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_CODIGOTIPOREQUISICION)) {
					existe=true;
					autorizarrequisicionesAux.setsDescripcionGeneralEntityReporte1(autorizarrequisicionesAux.getcodigo_tipo_requisicion());
				}
				 else if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					autorizarrequisicionesAux.setsDescripcionGeneralEntityReporte1(autorizarrequisicionesAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					autorizarrequisicionesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(autorizarrequisicionesAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
					existe=true;
					autorizarrequisicionesAux.setsDescripcionGeneralEntityReporte1(autorizarrequisicionesAux.getnombre_completo_cliente());
				}
				 else if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREBODEGA)) {
					existe=true;
					autorizarrequisicionesAux.setsDescripcionGeneralEntityReporte1(autorizarrequisicionesAux.getnombre_bodega());
				}
				 else if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
					existe=true;
					autorizarrequisicionesAux.setsDescripcionGeneralEntityReporte1(autorizarrequisicionesAux.getnombre_producto());
				}
				 else if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					autorizarrequisicionesAux.setsDescripcionGeneralEntityReporte1(autorizarrequisicionesAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(AutorizarRequisicionesConstantesFunciones.LABEL_FECHAAUTORIZA)) {
					existe=true;
					autorizarrequisicionesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(autorizarrequisicionesAux.getfecha_autoriza()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AutorizarRequisicionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesAutorizarRequisiciones(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoAutorizarRequisiciones=true;
				this.isVisibilidadCeldaNuevoRelacionesAutorizarRequisiciones=true;
				this.isVisibilidadCeldaGuardarCambiosAutorizarRequisiciones=true;
			}
			
			this.isVisibilidadCeldaModificarAutorizarRequisiciones=false;
			this.isVisibilidadCeldaActualizarAutorizarRequisiciones=false;
			this.isVisibilidadCeldaEliminarAutorizarRequisiciones=false;
			this.isVisibilidadCeldaCancelarAutorizarRequisiciones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAutorizarRequisiciones=true;
				} else {
					this.isVisibilidadCeldaGuardarAutorizarRequisiciones=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoAutorizarRequisiciones=false;
			this.isVisibilidadCeldaNuevoRelacionesAutorizarRequisiciones=false;
			this.isVisibilidadCeldaGuardarCambiosAutorizarRequisiciones=false;
			this.isVisibilidadCeldaModificarAutorizarRequisiciones=false;
			this.isVisibilidadCeldaActualizarAutorizarRequisiciones=true;
			this.isVisibilidadCeldaEliminarAutorizarRequisiciones=false;
			this.isVisibilidadCeldaCancelarAutorizarRequisiciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAutorizarRequisiciones=true;
				} else {
					this.isVisibilidadCeldaGuardarAutorizarRequisiciones=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoAutorizarRequisiciones=false;
			this.isVisibilidadCeldaNuevoRelacionesAutorizarRequisiciones=false;
			this.isVisibilidadCeldaGuardarCambiosAutorizarRequisiciones=false;
			this.isVisibilidadCeldaModificarAutorizarRequisiciones=false;
			this.isVisibilidadCeldaActualizarAutorizarRequisiciones=true;
			this.isVisibilidadCeldaEliminarAutorizarRequisiciones=true;
			this.isVisibilidadCeldaCancelarAutorizarRequisiciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAutorizarRequisiciones=true;
				} else {
					this.isVisibilidadCeldaGuardarAutorizarRequisiciones=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoAutorizarRequisiciones=false;
			this.isVisibilidadCeldaNuevoRelacionesAutorizarRequisiciones=false;
			this.isVisibilidadCeldaGuardarCambiosAutorizarRequisiciones=false;
			this.isVisibilidadCeldaModificarAutorizarRequisiciones=false;
			this.isVisibilidadCeldaActualizarAutorizarRequisiciones=true;
			this.isVisibilidadCeldaEliminarAutorizarRequisiciones=false;
			this.isVisibilidadCeldaCancelarAutorizarRequisiciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAutorizarRequisiciones=false;
				} else {
					this.isVisibilidadCeldaGuardarAutorizarRequisiciones=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoAutorizarRequisiciones=true;
			this.isVisibilidadCeldaNuevoRelacionesAutorizarRequisiciones=true;
			this.isVisibilidadCeldaGuardarCambiosAutorizarRequisiciones=true;
			this.isVisibilidadCeldaModificarAutorizarRequisiciones=false;
			this.isVisibilidadCeldaActualizarAutorizarRequisiciones=false;
			this.isVisibilidadCeldaEliminarAutorizarRequisiciones=false;
			this.isVisibilidadCeldaCancelarAutorizarRequisiciones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAutorizarRequisiciones=true;
				} else {
					this.isVisibilidadCeldaGuardarAutorizarRequisiciones=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoAutorizarRequisiciones=false;
			this.isVisibilidadCeldaNuevoRelacionesAutorizarRequisiciones=false;
			this.isVisibilidadCeldaGuardarCambiosAutorizarRequisiciones=false;
			this.isVisibilidadCeldaActualizarAutorizarRequisiciones=false;
			this.isVisibilidadCeldaEliminarAutorizarRequisiciones=false;
			this.isVisibilidadCeldaCancelarAutorizarRequisiciones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAutorizarRequisiciones=false;
				} else {
					this.isVisibilidadCeldaGuardarAutorizarRequisiciones=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoAutorizarRequisiciones=false;
			this.isVisibilidadCeldaNuevoRelacionesAutorizarRequisiciones=false;
			this.isVisibilidadCeldaGuardarCambiosAutorizarRequisiciones=false;
			this.isVisibilidadCeldaModificarAutorizarRequisiciones=true;
			this.isVisibilidadCeldaActualizarAutorizarRequisiciones=false;
			this.isVisibilidadCeldaEliminarAutorizarRequisiciones=false;
			this.isVisibilidadCeldaCancelarAutorizarRequisiciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAutorizarRequisiciones=false;
				} else {
					this.isVisibilidadCeldaGuardarAutorizarRequisiciones=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(AutorizarRequisicionesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoAutorizarRequisiciones=true;
			this.isVisibilidadCeldaNuevoRelacionesAutorizarRequisiciones=true;
			this.isVisibilidadCeldaGuardarCambiosAutorizarRequisiciones=true;
		} else {
			this.actualizarEstadoPanelsAutorizarRequisiciones(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarAutorizarRequisiciones=false;
			//this.isVisibilidadCeldaVerFormAutorizarRequisiciones=false;
			this.isVisibilidadCeldaDuplicarAutorizarRequisiciones=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!autorizarrequisicionesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesAutorizarRequisiciones=false;
		} else {
			this.isVisibilidadCeldaNuevoAutorizarRequisiciones=false;
			this.isVisibilidadCeldaGuardarCambiosAutorizarRequisiciones=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {
			if(!autorizarrequisicionesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesAutorizarRequisiciones=false;												
			}
			
			this.jButtonCerrarAutorizarRequisiciones.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesAutorizarRequisiciones=false;
		}
		
		if(!this.permiteMantenimiento(this.autorizarrequisiciones)) {
			this.isVisibilidadCeldaActualizarAutorizarRequisiciones=false;
			this.isVisibilidadCeldaEliminarAutorizarRequisiciones=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoAutorizarRequisiciones=false;
		this.isVisibilidadCeldaNuevoRelacionesAutorizarRequisiciones=false;
		this.isVisibilidadCeldaGuardarCambiosAutorizarRequisiciones=false;
		//this.isVisibilidadCeldaModificarAutorizarRequisiciones=true;
		this.isVisibilidadCeldaActualizarAutorizarRequisiciones=false;
		this.isVisibilidadCeldaEliminarAutorizarRequisiciones=false;
		//this.isVisibilidadCeldaCancelarAutorizarRequisiciones=true;			
		this.isVisibilidadCeldaGuardarAutorizarRequisiciones=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesAutorizarRequisiciones() {
	}
	
	public void actualizarEstadoPanelsAutorizarRequisiciones(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionAutorizarRequisiciones!=null) {
				this.jScrollPanelDatosEdicionAutorizarRequisiciones.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutorizarRequisiciones!=null) {
				this.jTabbedPaneBusquedasAutorizarRequisiciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAutorizarRequisiciones!=null) {
				this.jScrollPanelDatosAutorizarRequisiciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionAutorizarRequisiciones!=null) {
				this.jPanelPaginacionAutorizarRequisiciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAutorizarRequisiciones!=null) {
				this.jPanelParametrosReportesAutorizarRequisiciones.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionAutorizarRequisiciones!=null) {
				this.jScrollPanelDatosEdicionAutorizarRequisiciones.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutorizarRequisiciones!=null) {
				this.jTabbedPaneBusquedasAutorizarRequisiciones.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosAutorizarRequisiciones!=null) {
				this.jScrollPanelDatosAutorizarRequisiciones.setVisible(false);
			}
			
			if(this.jPanelPaginacionAutorizarRequisiciones!=null) {
				this.jPanelPaginacionAutorizarRequisiciones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAutorizarRequisiciones!=null) {
				this.jPanelParametrosReportesAutorizarRequisiciones.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionAutorizarRequisiciones!=null) {
				this.jScrollPanelDatosEdicionAutorizarRequisiciones.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutorizarRequisiciones!=null) {
				this.jTabbedPaneBusquedasAutorizarRequisiciones.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAutorizarRequisiciones!=null) {
				this.jScrollPanelDatosAutorizarRequisiciones.setVisible(false);
			}
			
			if(this.jPanelPaginacionAutorizarRequisiciones!=null) {
				this.jPanelPaginacionAutorizarRequisiciones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAutorizarRequisiciones!=null) {
				this.jPanelParametrosReportesAutorizarRequisiciones.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionAutorizarRequisiciones!=null) {
				this.jScrollPanelDatosEdicionAutorizarRequisiciones.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutorizarRequisiciones!=null) {
				this.jTabbedPaneBusquedasAutorizarRequisiciones.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAutorizarRequisiciones!=null) {
				this.jScrollPanelDatosAutorizarRequisiciones.setVisible(false);
			}
			
			if(this.jPanelPaginacionAutorizarRequisiciones!=null) {
				this.jPanelPaginacionAutorizarRequisiciones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAutorizarRequisiciones!=null) {
				this.jPanelParametrosReportesAutorizarRequisiciones.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionAutorizarRequisiciones!=null) {
				this.jScrollPanelDatosEdicionAutorizarRequisiciones.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutorizarRequisiciones!=null) {
				this.jTabbedPaneBusquedasAutorizarRequisiciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAutorizarRequisiciones!=null) {
				this.jScrollPanelDatosAutorizarRequisiciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionAutorizarRequisiciones!=null) {
				this.jPanelPaginacionAutorizarRequisiciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAutorizarRequisiciones!=null) {
				this.jPanelParametrosReportesAutorizarRequisiciones.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionAutorizarRequisiciones!=null) {
				this.jScrollPanelDatosEdicionAutorizarRequisiciones.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutorizarRequisiciones!=null) {
				this.jTabbedPaneBusquedasAutorizarRequisiciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAutorizarRequisiciones!=null) {
				this.jScrollPanelDatosAutorizarRequisiciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionAutorizarRequisiciones!=null) {
				this.jPanelPaginacionAutorizarRequisiciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAutorizarRequisiciones!=null) {
				this.jPanelParametrosReportesAutorizarRequisiciones.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionAutorizarRequisiciones!=null) {
				this.jScrollPanelDatosEdicionAutorizarRequisiciones.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutorizarRequisiciones!=null) {
				this.jTabbedPaneBusquedasAutorizarRequisiciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAutorizarRequisiciones!=null) {
				this.jScrollPanelDatosAutorizarRequisiciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionAutorizarRequisiciones!=null) {
				this.jPanelPaginacionAutorizarRequisiciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAutorizarRequisiciones!=null) {
				this.jPanelParametrosReportesAutorizarRequisiciones.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasAutorizarRequisiciones!=null) {
					this.jTabbedPaneBusquedasAutorizarRequisiciones.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesAutorizarRequisiciones!=null) {
				this.jPanelParametrosReportesAutorizarRequisiciones.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.autorizarrequisicionesSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAutorizarRequisiciones!=null) {
				this.jTabbedPaneBusquedasAutorizarRequisiciones.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesAutorizarRequisiciones!=null) {
				this.jPanelParametrosReportesAutorizarRequisiciones.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaAutorizarRequisiciones=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaAutorizarRequisiciones) {this.jTabbedPaneBusquedasAutorizarRequisiciones.remove(jPanelBusquedaAutorizarRequisicionesAutorizarRequisiciones);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaAutorizarRequisiciones=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaAutorizarRequisiciones) {this.jTabbedPaneBusquedasAutorizarRequisiciones.remove(jPanelBusquedaAutorizarRequisicionesAutorizarRequisiciones);}
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
			
			this.inicializarActualizarBindingTablaAutorizarRequisiciones(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioAutorizarRequisiciones() {
		this.updateBorderResaltarBusquedasFormularioAutorizarRequisiciones();
		this.updateVisibilidadBusquedasFormularioAutorizarRequisiciones();
		this.updateHabilitarBusquedasFormularioAutorizarRequisiciones();
	}
	
	public void updateBorderResaltarBusquedasFormularioAutorizarRequisiciones() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasAutorizarRequisiciones.getComponents().length>0) {
	

		if(this.autorizarrequisicionesConstantesFunciones.resaltarBusquedaAutorizarRequisicionesAutorizarRequisiciones!=null) {
			index= this.jTabbedPaneBusquedasAutorizarRequisiciones.indexOfComponent(this.jPanelBusquedaAutorizarRequisicionesAutorizarRequisiciones);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAutorizarRequisiciones.getComponent(index);
				jPanel.setBorder(this.autorizarrequisicionesConstantesFunciones.resaltarBusquedaAutorizarRequisicionesAutorizarRequisiciones);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioAutorizarRequisiciones() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasAutorizarRequisiciones.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAutorizarRequisiciones.indexOfComponent(this.jPanelBusquedaAutorizarRequisicionesAutorizarRequisiciones);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAutorizarRequisiciones.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.autorizarrequisicionesConstantesFunciones.mostrarBusquedaAutorizarRequisicionesAutorizarRequisiciones);
			if(!this.autorizarrequisicionesConstantesFunciones.mostrarBusquedaAutorizarRequisicionesAutorizarRequisiciones && index>-1) {
				this.jTabbedPaneBusquedasAutorizarRequisiciones.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioAutorizarRequisiciones() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasAutorizarRequisiciones.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAutorizarRequisiciones.indexOfComponent(this.jPanelBusquedaAutorizarRequisicionesAutorizarRequisiciones);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAutorizarRequisiciones.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.autorizarrequisicionesConstantesFunciones.activarBusquedaAutorizarRequisicionesAutorizarRequisiciones);
				this.jTabbedPaneBusquedasAutorizarRequisiciones.setEnabledAt(index,this.autorizarrequisicionesConstantesFunciones.activarBusquedaAutorizarRequisicionesAutorizarRequisiciones);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaAutorizarRequisiciones(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaAutorizarRequisiciones")) {
			index= this.jTabbedPaneBusquedasAutorizarRequisiciones.indexOfComponent(this.jPanelBusquedaAutorizarRequisicionesAutorizarRequisiciones);

			this.jTabbedPaneBusquedasAutorizarRequisiciones.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAutorizarRequisiciones.getComponent(index);

			this.autorizarrequisicionesConstantesFunciones.setResaltarBusquedaAutorizarRequisicionesAutorizarRequisiciones(resaltar);

			jPanel.setBorder(this.autorizarrequisicionesConstantesFunciones.resaltarBusquedaAutorizarRequisicionesAutorizarRequisiciones);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarAutorizarRequisiciones.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioAutorizarRequisiciones() throws Exception {

		if(this.jInternalFrameDetalleFormAutorizarRequisiciones==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioAutorizarRequisiciones();
		this.updateVisibilidadResaltarControlesFormularioAutorizarRequisiciones();
		this.updateHabilitarResaltarControlesFormularioAutorizarRequisiciones();
		
	}
	
	public void updateBorderResaltarControlesFormularioAutorizarRequisiciones() throws Exception {
		if(this.jInternalFrameDetalleFormAutorizarRequisiciones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.autorizarrequisicionesConstantesFunciones.resaltaridAutorizarRequisiciones!=null && this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelidAutorizarRequisiciones.setBorder(this.autorizarrequisicionesConstantesFunciones.resaltaridAutorizarRequisiciones);}
		if(this.autorizarrequisicionesConstantesFunciones.resaltarid_empresaAutorizarRequisiciones!=null && this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxid_empresaAutorizarRequisiciones.setBorder(this.autorizarrequisicionesConstantesFunciones.resaltarid_empresaAutorizarRequisiciones);}
		if(this.autorizarrequisicionesConstantesFunciones.resaltarid_sucursalAutorizarRequisiciones!=null && this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxid_sucursalAutorizarRequisiciones.setBorder(this.autorizarrequisicionesConstantesFunciones.resaltarid_sucursalAutorizarRequisiciones);}
		if(this.autorizarrequisicionesConstantesFunciones.resaltarfecha_desdeAutorizarRequisiciones!=null && this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {this.jInternalFrameDetalleFormAutorizarRequisiciones.jDateChooserfecha_desdeAutorizarRequisiciones.setBorder(this.autorizarrequisicionesConstantesFunciones.resaltarfecha_desdeAutorizarRequisiciones);}
		if(this.autorizarrequisicionesConstantesFunciones.resaltarfecha_hastaAutorizarRequisiciones!=null && this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {this.jInternalFrameDetalleFormAutorizarRequisiciones.jDateChooserfecha_hastaAutorizarRequisiciones.setBorder(this.autorizarrequisicionesConstantesFunciones.resaltarfecha_hastaAutorizarRequisiciones);}
		if(this.autorizarrequisicionesConstantesFunciones.resaltarcodigo_tipo_requisicionAutorizarRequisiciones!=null && this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextFieldcodigo_tipo_requisicionAutorizarRequisiciones.setBorder(this.autorizarrequisicionesConstantesFunciones.resaltarcodigo_tipo_requisicionAutorizarRequisiciones);}
		if(this.autorizarrequisicionesConstantesFunciones.resaltarcodigoAutorizarRequisiciones!=null && this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextFieldcodigoAutorizarRequisiciones.setBorder(this.autorizarrequisicionesConstantesFunciones.resaltarcodigoAutorizarRequisiciones);}
		if(this.autorizarrequisicionesConstantesFunciones.resaltarfechaAutorizarRequisiciones!=null && this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {this.jInternalFrameDetalleFormAutorizarRequisiciones.jDateChooserfechaAutorizarRequisiciones.setBorder(this.autorizarrequisicionesConstantesFunciones.resaltarfechaAutorizarRequisiciones);}
		if(this.autorizarrequisicionesConstantesFunciones.resaltarnombre_completo_clienteAutorizarRequisiciones!=null && this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextAreanombre_completo_clienteAutorizarRequisiciones.setBorder(this.autorizarrequisicionesConstantesFunciones.resaltarnombre_completo_clienteAutorizarRequisiciones);}
		if(this.autorizarrequisicionesConstantesFunciones.resaltarnombre_bodegaAutorizarRequisiciones!=null && this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextAreanombre_bodegaAutorizarRequisiciones.setBorder(this.autorizarrequisicionesConstantesFunciones.resaltarnombre_bodegaAutorizarRequisiciones);}
		if(this.autorizarrequisicionesConstantesFunciones.resaltarnombre_productoAutorizarRequisiciones!=null && this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextAreanombre_productoAutorizarRequisiciones.setBorder(this.autorizarrequisicionesConstantesFunciones.resaltarnombre_productoAutorizarRequisiciones);}
		if(this.autorizarrequisicionesConstantesFunciones.resaltarcantidadAutorizarRequisiciones!=null && this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextFieldcantidadAutorizarRequisiciones.setBorder(this.autorizarrequisicionesConstantesFunciones.resaltarcantidadAutorizarRequisiciones);}
		if(this.autorizarrequisicionesConstantesFunciones.resaltarfecha_autorizaAutorizarRequisiciones!=null && this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {this.jInternalFrameDetalleFormAutorizarRequisiciones.jDateChooserfecha_autorizaAutorizarRequisiciones.setBorder(this.autorizarrequisicionesConstantesFunciones.resaltarfecha_autorizaAutorizarRequisiciones);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioAutorizarRequisiciones() throws Exception {		
		if(this.jInternalFrameDetalleFormAutorizarRequisiciones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {
	
		//this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelidAutorizarRequisiciones.setVisible(this.autorizarrequisicionesConstantesFunciones.mostraridAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jPanelidAutorizarRequisiciones.setVisible(this.autorizarrequisicionesConstantesFunciones.mostraridAutorizarRequisiciones);
		//this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxid_empresaAutorizarRequisiciones.setVisible(this.autorizarrequisicionesConstantesFunciones.mostrarid_empresaAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jPanelid_empresaAutorizarRequisiciones.setVisible(this.autorizarrequisicionesConstantesFunciones.mostrarid_empresaAutorizarRequisiciones);
		//this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxid_sucursalAutorizarRequisiciones.setVisible(this.autorizarrequisicionesConstantesFunciones.mostrarid_sucursalAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jPanelid_sucursalAutorizarRequisiciones.setVisible(this.autorizarrequisicionesConstantesFunciones.mostrarid_sucursalAutorizarRequisiciones);
		//this.jInternalFrameDetalleFormAutorizarRequisiciones.jDateChooserfecha_desdeAutorizarRequisiciones.setVisible(this.autorizarrequisicionesConstantesFunciones.mostrarfecha_desdeAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jPanelfecha_desdeAutorizarRequisiciones.setVisible(this.autorizarrequisicionesConstantesFunciones.mostrarfecha_desdeAutorizarRequisiciones);
		//this.jInternalFrameDetalleFormAutorizarRequisiciones.jDateChooserfecha_hastaAutorizarRequisiciones.setVisible(this.autorizarrequisicionesConstantesFunciones.mostrarfecha_hastaAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jPanelfecha_hastaAutorizarRequisiciones.setVisible(this.autorizarrequisicionesConstantesFunciones.mostrarfecha_hastaAutorizarRequisiciones);
		//this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextFieldcodigo_tipo_requisicionAutorizarRequisiciones.setVisible(this.autorizarrequisicionesConstantesFunciones.mostrarcodigo_tipo_requisicionAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jPanelcodigo_tipo_requisicionAutorizarRequisiciones.setVisible(this.autorizarrequisicionesConstantesFunciones.mostrarcodigo_tipo_requisicionAutorizarRequisiciones);
		//this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextFieldcodigoAutorizarRequisiciones.setVisible(this.autorizarrequisicionesConstantesFunciones.mostrarcodigoAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jPanelcodigoAutorizarRequisiciones.setVisible(this.autorizarrequisicionesConstantesFunciones.mostrarcodigoAutorizarRequisiciones);
		//this.jInternalFrameDetalleFormAutorizarRequisiciones.jDateChooserfechaAutorizarRequisiciones.setVisible(this.autorizarrequisicionesConstantesFunciones.mostrarfechaAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jPanelfechaAutorizarRequisiciones.setVisible(this.autorizarrequisicionesConstantesFunciones.mostrarfechaAutorizarRequisiciones);
		//this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextAreanombre_completo_clienteAutorizarRequisiciones.setVisible(this.autorizarrequisicionesConstantesFunciones.mostrarnombre_completo_clienteAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jPanelnombre_completo_clienteAutorizarRequisiciones.setVisible(this.autorizarrequisicionesConstantesFunciones.mostrarnombre_completo_clienteAutorizarRequisiciones);
		//this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextAreanombre_bodegaAutorizarRequisiciones.setVisible(this.autorizarrequisicionesConstantesFunciones.mostrarnombre_bodegaAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jPanelnombre_bodegaAutorizarRequisiciones.setVisible(this.autorizarrequisicionesConstantesFunciones.mostrarnombre_bodegaAutorizarRequisiciones);
		//this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextAreanombre_productoAutorizarRequisiciones.setVisible(this.autorizarrequisicionesConstantesFunciones.mostrarnombre_productoAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jPanelnombre_productoAutorizarRequisiciones.setVisible(this.autorizarrequisicionesConstantesFunciones.mostrarnombre_productoAutorizarRequisiciones);
		//this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextFieldcantidadAutorizarRequisiciones.setVisible(this.autorizarrequisicionesConstantesFunciones.mostrarcantidadAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jPanelcantidadAutorizarRequisiciones.setVisible(this.autorizarrequisicionesConstantesFunciones.mostrarcantidadAutorizarRequisiciones);
		//this.jInternalFrameDetalleFormAutorizarRequisiciones.jDateChooserfecha_autorizaAutorizarRequisiciones.setVisible(this.autorizarrequisicionesConstantesFunciones.mostrarfecha_autorizaAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jPanelfecha_autorizaAutorizarRequisiciones.setVisible(this.autorizarrequisicionesConstantesFunciones.mostrarfecha_autorizaAutorizarRequisiciones);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioAutorizarRequisiciones() throws Exception {
		if(this.jInternalFrameDetalleFormAutorizarRequisiciones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAutorizarRequisiciones!=null) {
	
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jLabelidAutorizarRequisiciones.setEnabled(this.autorizarrequisicionesConstantesFunciones.activaridAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxid_empresaAutorizarRequisiciones.setEnabled(this.autorizarrequisicionesConstantesFunciones.activarid_empresaAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jComboBoxid_sucursalAutorizarRequisiciones.setEnabled(this.autorizarrequisicionesConstantesFunciones.activarid_sucursalAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jDateChooserfecha_desdeAutorizarRequisiciones.setEnabled(this.autorizarrequisicionesConstantesFunciones.activarfecha_desdeAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jDateChooserfecha_hastaAutorizarRequisiciones.setEnabled(this.autorizarrequisicionesConstantesFunciones.activarfecha_hastaAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextFieldcodigo_tipo_requisicionAutorizarRequisiciones.setEnabled(this.autorizarrequisicionesConstantesFunciones.activarcodigo_tipo_requisicionAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextFieldcodigoAutorizarRequisiciones.setEnabled(this.autorizarrequisicionesConstantesFunciones.activarcodigoAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jDateChooserfechaAutorizarRequisiciones.setEnabled(this.autorizarrequisicionesConstantesFunciones.activarfechaAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextAreanombre_completo_clienteAutorizarRequisiciones.setEnabled(this.autorizarrequisicionesConstantesFunciones.activarnombre_completo_clienteAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextAreanombre_bodegaAutorizarRequisiciones.setEnabled(this.autorizarrequisicionesConstantesFunciones.activarnombre_bodegaAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextAreanombre_productoAutorizarRequisiciones.setEnabled(this.autorizarrequisicionesConstantesFunciones.activarnombre_productoAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jTextFieldcantidadAutorizarRequisiciones.setEnabled(this.autorizarrequisicionesConstantesFunciones.activarcantidadAutorizarRequisiciones);
		this.jInternalFrameDetalleFormAutorizarRequisiciones.jDateChooserfecha_autorizaAutorizarRequisiciones.setEnabled(this.autorizarrequisicionesConstantesFunciones.activarfecha_autorizaAutorizarRequisiciones);
		}
	}
	
		
}