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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.facturacion.util.InformesDevolucionesConstantesFunciones;
import com.bydan.erp.facturacion.util.report.InformesDevolucionesParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.report.InformesDevolucionesParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.report.InformesDevolucionesBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.facturacion.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.facturacion.util.*;

import com.bydan.erp.facturacion.util.report.*;
import com.bydan.erp.facturacion.business.logic.report.*;

import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;

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


import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class InformesDevolucionesBeanSwingJInternalFrame extends InformesDevolucionesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(InformesDevolucionesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<InformesDevoluciones> informesdevolucionesValidator = new ClassValidator<InformesDevoluciones>(InformesDevoluciones.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public InformesDevoluciones informesdevoluciones;	
	public InformesDevoluciones informesdevolucionesAux;
	public InformesDevoluciones informesdevolucionesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public InformesDevoluciones informesdevolucionesTotales;
	public Long idInformesDevolucionesActual;
	public Long iIdNuevoInformesDevoluciones=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboProducto="";

	public List<Producto> productosForeignKey;

	public List<Producto> getproductosForeignKey() {
		return productosForeignKey;
	}

	public void setproductosForeignKey(List<Producto> productosForeignKey) {
		this.productosForeignKey = productosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Producto productoForeignKey;

	public Producto getproductoForeignKey() {
		return productoForeignKey;
	}

	public void setproductoForeignKey(Producto productoForeignKey) {
		this.productoForeignKey = productoForeignKey;
	}

	public String sFinalQueryComboTipoDevolucionEmpresa="";

	public List<TipoDevolucionEmpresa> tipodevolucionempresasForeignKey;

	public List<TipoDevolucionEmpresa> gettipodevolucionempresasForeignKey() {
		return tipodevolucionempresasForeignKey;
	}

	public void settipodevolucionempresasForeignKey(List<TipoDevolucionEmpresa> tipodevolucionempresasForeignKey) {
		this.tipodevolucionempresasForeignKey = tipodevolucionempresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoDevolucionEmpresa tipodevolucionempresaForeignKey;

	public TipoDevolucionEmpresa gettipodevolucionempresaForeignKey() {
		return tipodevolucionempresaForeignKey;
	}

	public void settipodevolucionempresaForeignKey(TipoDevolucionEmpresa tipodevolucionempresaForeignKey) {
		this.tipodevolucionempresaForeignKey = tipodevolucionempresaForeignKey;
	}

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
	
	public Boolean isPermisoTodoInformesDevoluciones;
	public Boolean isPermisoNuevoInformesDevoluciones;
	public Boolean isPermisoActualizarInformesDevoluciones;
	public Boolean isPermisoActualizarOriginalInformesDevoluciones;
	public Boolean isPermisoEliminarInformesDevoluciones;
	public Boolean isPermisoGuardarCambiosInformesDevoluciones;
	public Boolean isPermisoConsultaInformesDevoluciones;
	public Boolean isPermisoBusquedaInformesDevoluciones;
	public Boolean isPermisoReporteInformesDevoluciones;
	public Boolean isPermisoPaginacionMedioInformesDevoluciones;
	public Boolean isPermisoPaginacionAltoInformesDevoluciones;
	public Boolean isPermisoPaginacionTodoInformesDevoluciones;
	public Boolean isPermisoCopiarInformesDevoluciones;
	public Boolean isPermisoVerFormInformesDevoluciones;
	public Boolean isPermisoDuplicarInformesDevoluciones;
	public Boolean isPermisoOrdenInformesDevoluciones;
	
	
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
	
	public InformesDevolucionesParameterReturnGeneral informesdevolucionesReturnGeneral;
	public InformesDevolucionesParameterReturnGeneral informesdevolucionesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoInformesDevoluciones=false;
	public Boolean esParaAccionDesdeFormularioInformesDevoluciones=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected InformesDevolucionesSessionBeanAdditional informesdevolucionesSessionBeanAdditional=null;
	
	public InformesDevolucionesSessionBeanAdditional getInformesDevolucionesSessionBeanAdditional() {
		return this.informesdevolucionesSessionBeanAdditional;
	}
	
	public void setInformesDevolucionesSessionBeanAdditional(InformesDevolucionesSessionBeanAdditional informesdevolucionesSessionBeanAdditional) {
		try {
			this.informesdevolucionesSessionBeanAdditional=informesdevolucionesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected InformesDevolucionesBeanSwingJInternalFrameAdditional informesdevolucionesBeanSwingJInternalFrameAdditional=null;
	//public class InformesDevolucionesBeanSwingJInternalFrame
	
	public InformesDevolucionesBeanSwingJInternalFrameAdditional getInformesDevolucionesBeanSwingJInternalFrameAdditional() {
		return this.informesdevolucionesBeanSwingJInternalFrameAdditional;
	}
	
	public void setInformesDevolucionesBeanSwingJInternalFrameAdditional(InformesDevolucionesBeanSwingJInternalFrameAdditional informesdevolucionesBeanSwingJInternalFrameAdditional) {
		try {
			this.informesdevolucionesBeanSwingJInternalFrameAdditional=informesdevolucionesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public InformesDevolucionesLogic informesdevolucionesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public InformesDevoluciones informesdevolucionesBean;
	public InformesDevolucionesConstantesFunciones informesdevolucionesConstantesFunciones;
	//public InformesDevolucionesParameterReturnGeneral informesdevolucionesReturnGeneral;
	
	//FK
	
	public ProductoLogic productoLogic;
	public TipoDevolucionEmpresaLogic tipodevolucionempresaLogic;
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	
	//PARAMETROS
	
	
	//public List<InformesDevoluciones> informesdevolucioness;	
	//public List<InformesDevoluciones> informesdevolucionessEliminados;
	//public List<InformesDevoluciones> informesdevolucionessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoInformesDevoluciones=false;
	public Boolean isVisibilidadCeldaDuplicarInformesDevoluciones=true;
	public Boolean isVisibilidadCeldaCopiarInformesDevoluciones=true;
	public Boolean isVisibilidadCeldaVerFormInformesDevoluciones=true;
	public Boolean isVisibilidadCeldaOrdenInformesDevoluciones=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesInformesDevoluciones=false;
	public Boolean isVisibilidadCeldaModificarInformesDevoluciones=false;
	public Boolean isVisibilidadCeldaActualizarInformesDevoluciones=false;
	public Boolean isVisibilidadCeldaEliminarInformesDevoluciones=false;
	public Boolean isVisibilidadCeldaCancelarInformesDevoluciones=false;
	public Boolean isVisibilidadCeldaGuardarInformesDevoluciones=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosInformesDevoluciones=false;	
	
	
	public Boolean isVisibilidadBusquedaInformesDevoluciones=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoDevolucionEmpresa=false;
	
	public Long getiIdNuevoInformesDevoluciones() {
		return this.iIdNuevoInformesDevoluciones;
	}

	public void setiIdNuevoInformesDevoluciones(Long iIdNuevoInformesDevoluciones) {
		this.iIdNuevoInformesDevoluciones = iIdNuevoInformesDevoluciones;
	}
	
	public Long getidInformesDevolucionesActual() {
		return this.idInformesDevolucionesActual;
	}

	public void setidInformesDevolucionesActual(Long idInformesDevolucionesActual) {
		this.idInformesDevolucionesActual = idInformesDevolucionesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public InformesDevoluciones getinformesdevoluciones() {
		return this.informesdevoluciones;
	}

	public void setinformesdevoluciones(InformesDevoluciones informesdevoluciones) {
		this.informesdevoluciones = informesdevoluciones;
	}
	
	public InformesDevoluciones getinformesdevolucionesAux() {
		return this.informesdevolucionesAux;
	}

	public void setinformesdevolucionesAux(InformesDevoluciones informesdevolucionesAux) {
		this.informesdevolucionesAux = informesdevolucionesAux;
	}				
	
	public InformesDevoluciones getinformesdevolucionesAnterior() {
		return this.informesdevolucionesAnterior;
	}

	public void setinformesdevolucionesAnterior(InformesDevoluciones informesdevolucionesAnterior) {
		this.informesdevolucionesAnterior = informesdevolucionesAnterior;
	}	
	
	public InformesDevoluciones getinformesdevolucionesTotales() {
		return this.informesdevolucionesTotales;
	}

	public void setinformesdevolucionesTotales(InformesDevoluciones informesdevolucionesTotales) {
		this.informesdevolucionesTotales = informesdevolucionesTotales;
	}	
	
	public InformesDevoluciones getinformesdevolucionesBean() {
		return this.informesdevolucionesBean;
	}

	public void setinformesdevolucionesBean(InformesDevoluciones informesdevolucionesBean) {
		this.informesdevolucionesBean = informesdevolucionesBean;
	}	
	
	public InformesDevolucionesParameterReturnGeneral getinformesdevolucionesReturnGeneral() {
		return this.informesdevolucionesReturnGeneral;
	}

	public void setinformesdevolucionesReturnGeneral(InformesDevolucionesParameterReturnGeneral informesdevolucionesReturnGeneral) {
		this.informesdevolucionesReturnGeneral = informesdevolucionesReturnGeneral;
	}	
	
	
	public Long id_productoBusquedaInformesDevoluciones=-1L;

	public Long getid_productoBusquedaInformesDevoluciones() {
		return this.id_productoBusquedaInformesDevoluciones;
	}

	public void setid_productoBusquedaInformesDevoluciones(Long id_productoBusquedaInformesDevoluciones) {
		this.id_productoBusquedaInformesDevoluciones = id_productoBusquedaInformesDevoluciones;
	}

;
	public Long id_tipo_devolucion_empresaBusquedaInformesDevoluciones=-1L;

	public Long getid_tipo_devolucion_empresaBusquedaInformesDevoluciones() {
		return this.id_tipo_devolucion_empresaBusquedaInformesDevoluciones;
	}

	public void setid_tipo_devolucion_empresaBusquedaInformesDevoluciones(Long id_tipo_devolucion_empresaBusquedaInformesDevoluciones) {
		this.id_tipo_devolucion_empresaBusquedaInformesDevoluciones = id_tipo_devolucion_empresaBusquedaInformesDevoluciones;
	}

;
	public Date fecha_emision_desdeBusquedaInformesDevoluciones=new Date();

	public Date getfecha_emision_desdeBusquedaInformesDevoluciones() {
		return this.fecha_emision_desdeBusquedaInformesDevoluciones;
	}

	public void setfecha_emision_desdeBusquedaInformesDevoluciones(Date fecha_emision_desdeBusquedaInformesDevoluciones) {
		this.fecha_emision_desdeBusquedaInformesDevoluciones = fecha_emision_desdeBusquedaInformesDevoluciones;
	}

;
	public Date fecha_emision_hastaBusquedaInformesDevoluciones=new Date();

	public Date getfecha_emision_hastaBusquedaInformesDevoluciones() {
		return this.fecha_emision_hastaBusquedaInformesDevoluciones;
	}

	public void setfecha_emision_hastaBusquedaInformesDevoluciones(Date fecha_emision_hastaBusquedaInformesDevoluciones) {
		this.fecha_emision_hastaBusquedaInformesDevoluciones = fecha_emision_hastaBusquedaInformesDevoluciones;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_productoFK_IdProducto=-1L;

	public Long getid_productoFK_IdProducto() {
		return this.id_productoFK_IdProducto;
	}

	public void setid_productoFK_IdProducto(Long id_productoFK_IdProducto) {
		this.id_productoFK_IdProducto = id_productoFK_IdProducto;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresa=-1L;

	public Long getid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresa() {
		return this.id_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresa;
	}

	public void setid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresa(Long id_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresa) {
		this.id_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresa = id_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public InformesDevolucionesLogic getInformesDevolucionesLogic()	{		
		return informesdevolucionesLogic;
	}

	public void setInformesDevolucionesLogic(InformesDevolucionesLogic informesdevolucionesLogic) {
		this.informesdevolucionesLogic = informesdevolucionesLogic;
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
	
	public Boolean getIsEsNuevoInformesDevoluciones() {
		return isEsNuevoInformesDevoluciones;
	}

	public void setIsEsNuevoInformesDevoluciones(Boolean isEsNuevoInformesDevoluciones) {
		this.isEsNuevoInformesDevoluciones = isEsNuevoInformesDevoluciones;
	}

	public Boolean getEsParaAccionDesdeFormularioInformesDevoluciones() {
		return esParaAccionDesdeFormularioInformesDevoluciones;
	}
	
	public void setEsParaAccionDesdeFormularioInformesDevoluciones(Boolean esParaAccionDesdeFormularioInformesDevoluciones) {
		this.esParaAccionDesdeFormularioInformesDevoluciones = esParaAccionDesdeFormularioInformesDevoluciones;
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
	
	
	public void cargarCombosProductosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.productosForeignKey=new ArrayList<Producto>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ProductoLogic productoLogic=new ProductoLogic();

			productoLogic.getProductoDataAccess().setIsForForeingKeyData(true);

			if(this.informesdevolucionesSessionBean==null) {
				this.informesdevolucionesSessionBean=new InformesDevolucionesSessionBean();
			}

			if(!this.informesdevolucionesSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoLogic.getProductoDataAccess().setIsForForeingKeyData(true);

					productoLogic.getTodosProductosWithConnection(sFinalQuery,new Pagination());

					this.productosForeignKey=productoLogic.getProductos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaProducto(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoLogic.getEntityWithConnection(informesdevolucionesSessionBean.getlidProductoActual());
					this.productosForeignKey.add(productoLogic.getProducto());
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

	public void cargarCombosTipoDevolucionEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipodevolucionempresasForeignKey=new ArrayList<TipoDevolucionEmpresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoDevolucionEmpresaLogic tipodevolucionempresaLogic=new TipoDevolucionEmpresaLogic();

			tipodevolucionempresaLogic.getTipoDevolucionEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.informesdevolucionesSessionBean==null) {
				this.informesdevolucionesSessionBean=new InformesDevolucionesSessionBean();
			}

			if(!this.informesdevolucionesSessionBean.getisBusquedaDesdeForeignKeySesionTipoDevolucionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodevolucionempresaLogic.getTipoDevolucionEmpresaDataAccess().setIsForForeingKeyData(true);

					tipodevolucionempresaLogic.getTodosTipoDevolucionEmpresasWithConnection(sFinalQuery,new Pagination());

					this.tipodevolucionempresasForeignKey=tipodevolucionempresaLogic.getTipoDevolucionEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoDevolucionEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodevolucionempresaLogic.getEntityWithConnection(informesdevolucionesSessionBean.getlidTipoDevolucionEmpresaActual());
					this.tipodevolucionempresasForeignKey.add(tipodevolucionempresaLogic.getTipoDevolucionEmpresa());
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

			if(this.informesdevolucionesSessionBean==null) {
				this.informesdevolucionesSessionBean=new InformesDevolucionesSessionBean();
			}

			if(!this.informesdevolucionesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(informesdevolucionesSessionBean.getlidEmpresaActual());
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

			if(this.informesdevolucionesSessionBean==null) {
				this.informesdevolucionesSessionBean=new InformesDevolucionesSessionBean();
			}

			if(!this.informesdevolucionesSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(informesdevolucionesSessionBean.getlidSucursalActual());
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

	
	
	public void setActualProductoForeignKey(Long idProductoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Producto  productoTemp=null;

			for(Producto productoAux:productosForeignKey) {
				if(productoAux.getId()!=null && productoAux.getId().equals(idProductoSeleccionado)) {
					productoTemp=productoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(productoTemp!=null) {

					if(this.informesdevoluciones!=null) {
						this.informesdevoluciones.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
						this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_productoInformesDevoluciones.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoInformesDevoluciones.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
						if(this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_productoInformesDevoluciones.getItemCount()>0) {
							this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_productoInformesDevoluciones.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaInformesDevoluciones") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoBusquedaInformesDevolucionesInformesDevoluciones!=null) {
						jComboBoxid_productoBusquedaInformesDevolucionesInformesDevoluciones.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoBusquedaInformesDevolucionesInformesDevoluciones!=null) {
							//jComboBoxid_productoBusquedaInformesDevolucionesInformesDevoluciones.setSelectedItem(productoTemp);
							if(jComboBoxid_productoBusquedaInformesDevolucionesInformesDevoluciones.getItemCount()>0) {
								jComboBoxid_productoBusquedaInformesDevolucionesInformesDevoluciones.setSelectedIndex(0);
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

	public String getActualProductoForeignKeyDescripcion(Long idProductoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Producto  productoTemp=null;

			for(Producto productoAux:productosForeignKey) {
				if(productoAux.getId()!=null && productoAux.getId().equals(idProductoSeleccionado)) {
					productoTemp=productoAux;
					break;
				}
			}


			sDescripcion=ProductoConstantesFunciones.getProductoDescripcion(productoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoInformesDevolucionesGenerico)throws Exception
	{
		try
		{
			Producto  productoTemp=null;

			for(Producto productoAux:productosForeignKey) {
				if(productoAux.getId()!=null && productoAux.getId().equals(idProductoSeleccionado)) {
					productoTemp=productoAux;
					break;
				}
			}

			if(productoTemp!=null) {
				jComboBoxid_productoInformesDevolucionesGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoInformesDevolucionesGenerico!=null && jComboBoxid_productoInformesDevolucionesGenerico.getItemCount()>0) {
					jComboBoxid_productoInformesDevolucionesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoDevolucionEmpresaForeignKey(Long idTipoDevolucionEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoDevolucionEmpresa  tipodevolucionempresaTemp=null;

			for(TipoDevolucionEmpresa tipodevolucionempresaAux:tipodevolucionempresasForeignKey) {
				if(tipodevolucionempresaAux.getId()!=null && tipodevolucionempresaAux.getId().equals(idTipoDevolucionEmpresaSeleccionado)) {
					tipodevolucionempresaTemp=tipodevolucionempresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipodevolucionempresaTemp!=null) {

					if(this.informesdevoluciones!=null) {
						this.informesdevoluciones.setTipoDevolucionEmpresa(tipodevolucionempresaTemp);
					}

					if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
						this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_tipo_devolucion_empresaInformesDevoluciones.setSelectedItem(tipodevolucionempresaTemp);
					}
				} else {
					//jComboBoxid_tipo_devolucion_empresaInformesDevoluciones.setSelectedItem(tipodevolucionempresaTemp);
					if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
						if(this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_tipo_devolucion_empresaInformesDevoluciones.getItemCount()>0) {
							this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_tipo_devolucion_empresaInformesDevoluciones.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaInformesDevoluciones") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipodevolucionempresaTemp!=null && jComboBoxid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevoluciones!=null) {
						jComboBoxid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevoluciones.setSelectedItem(tipodevolucionempresaTemp);
					} else {
						if(jComboBoxid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevoluciones!=null) {
							//jComboBoxid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevoluciones.setSelectedItem(tipodevolucionempresaTemp);
							if(jComboBoxid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevoluciones.getItemCount()>0) {
								jComboBoxid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevoluciones.setSelectedIndex(0);
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

	public String getActualTipoDevolucionEmpresaForeignKeyDescripcion(Long idTipoDevolucionEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoDevolucionEmpresa  tipodevolucionempresaTemp=null;

			for(TipoDevolucionEmpresa tipodevolucionempresaAux:tipodevolucionempresasForeignKey) {
				if(tipodevolucionempresaAux.getId()!=null && tipodevolucionempresaAux.getId().equals(idTipoDevolucionEmpresaSeleccionado)) {
					tipodevolucionempresaTemp=tipodevolucionempresaAux;
					break;
				}
			}


			sDescripcion=TipoDevolucionEmpresaConstantesFunciones.getTipoDevolucionEmpresaDescripcion(tipodevolucionempresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoDevolucionEmpresaForeignKeyGenerico(Long idTipoDevolucionEmpresaSeleccionado,JComboBox jComboBoxid_tipo_devolucion_empresaInformesDevolucionesGenerico)throws Exception
	{
		try
		{
			TipoDevolucionEmpresa  tipodevolucionempresaTemp=null;

			for(TipoDevolucionEmpresa tipodevolucionempresaAux:tipodevolucionempresasForeignKey) {
				if(tipodevolucionempresaAux.getId()!=null && tipodevolucionempresaAux.getId().equals(idTipoDevolucionEmpresaSeleccionado)) {
					tipodevolucionempresaTemp=tipodevolucionempresaAux;
					break;
				}
			}

			if(tipodevolucionempresaTemp!=null) {
				jComboBoxid_tipo_devolucion_empresaInformesDevolucionesGenerico.setSelectedItem(tipodevolucionempresaTemp);
			} else {
				if(jComboBoxid_tipo_devolucion_empresaInformesDevolucionesGenerico!=null && jComboBoxid_tipo_devolucion_empresaInformesDevolucionesGenerico.getItemCount()>0) {
					jComboBoxid_tipo_devolucion_empresaInformesDevolucionesGenerico.setSelectedIndex(0);
				}
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

					if(this.informesdevoluciones!=null) {
						this.informesdevoluciones.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
						this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_empresaInformesDevoluciones.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaInformesDevoluciones.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
						if(this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_empresaInformesDevoluciones.getItemCount()>0) {
							this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_empresaInformesDevoluciones.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaInformesDevolucionesGenerico)throws Exception
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
				jComboBoxid_empresaInformesDevolucionesGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaInformesDevolucionesGenerico!=null && jComboBoxid_empresaInformesDevolucionesGenerico.getItemCount()>0) {
					jComboBoxid_empresaInformesDevolucionesGenerico.setSelectedIndex(0);
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

					if(this.informesdevoluciones!=null) {
						this.informesdevoluciones.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
						this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_sucursalInformesDevoluciones.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalInformesDevoluciones.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
						if(this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_sucursalInformesDevoluciones.getItemCount()>0) {
							this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_sucursalInformesDevoluciones.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalInformesDevolucionesGenerico)throws Exception
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
				jComboBoxid_sucursalInformesDevolucionesGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalInformesDevolucionesGenerico!=null && jComboBoxid_sucursalInformesDevolucionesGenerico.getItemCount()>0) {
					jComboBoxid_sucursalInformesDevolucionesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(InformesDevoluciones informesdevoluciones,JComboBox jComboBoxid_productoInformesDevolucionesGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoInformesDevolucionesGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_productoInformesDevoluciones.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoInformesDevolucionesGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				informesdevoluciones.setid_producto(productoAux.getId());
				informesdevoluciones.setproducto_descripcion(InformesDevolucionesConstantesFunciones.getProductoDescripcion(productoAux));
				informesdevoluciones.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoDevolucionEmpresaForeignKey(InformesDevoluciones informesdevoluciones,JComboBox jComboBoxid_tipo_devolucion_empresaInformesDevolucionesGenerico)throws Exception
	{
		try
		{
			TipoDevolucionEmpresa  tipodevolucionempresaAux=new TipoDevolucionEmpresa();

			if(jComboBoxid_tipo_devolucion_empresaInformesDevolucionesGenerico==null) {
				tipodevolucionempresaAux=(TipoDevolucionEmpresa)this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_tipo_devolucion_empresaInformesDevoluciones.getSelectedItem();
			} else {
				tipodevolucionempresaAux=(TipoDevolucionEmpresa)jComboBoxid_tipo_devolucion_empresaInformesDevolucionesGenerico.getSelectedItem();
			}

			if(tipodevolucionempresaAux!=null && tipodevolucionempresaAux.getId()!=null) {
				informesdevoluciones.setid_tipo_devolucion_empresa(tipodevolucionempresaAux.getId());
				informesdevoluciones.settipodevolucionempresa_descripcion(InformesDevolucionesConstantesFunciones.getTipoDevolucionEmpresaDescripcion(tipodevolucionempresaAux));
				informesdevoluciones.setTipoDevolucionEmpresa(tipodevolucionempresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(InformesDevoluciones informesdevoluciones,JComboBox jComboBoxid_empresaInformesDevolucionesGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaInformesDevolucionesGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_empresaInformesDevoluciones.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaInformesDevolucionesGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				informesdevoluciones.setid_empresa(empresaAux.getId());
				informesdevoluciones.setempresa_descripcion(InformesDevolucionesConstantesFunciones.getEmpresaDescripcion(empresaAux));
				informesdevoluciones.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(InformesDevoluciones informesdevoluciones,JComboBox jComboBoxid_sucursalInformesDevolucionesGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalInformesDevolucionesGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_sucursalInformesDevoluciones.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalInformesDevolucionesGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				informesdevoluciones.setid_sucursal(sucursalAux.getId());
				informesdevoluciones.setsucursal_descripcion(InformesDevolucionesConstantesFunciones.getSucursalDescripcion(sucursalAux));
				informesdevoluciones.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameProductosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingProducto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!InformesDevolucionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) { 
							this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_productoInformesDevoluciones.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_productoInformesDevoluciones.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) { 
					}

					if(!InformesDevolucionesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaInformesDevoluciones") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!InformesDevolucionesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoBusquedaInformesDevolucionesInformesDevoluciones.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoBusquedaInformesDevolucionesInformesDevoluciones.addItem(producto);
							}
						}

						if(!InformesDevolucionesJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoDevolucionEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoDevolucionEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!InformesDevolucionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) { 
							this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_tipo_devolucion_empresaInformesDevoluciones.removeAllItems();

							for(TipoDevolucionEmpresa tipodevolucionempresa:this.tipodevolucionempresasForeignKey) {
								this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_tipo_devolucion_empresaInformesDevoluciones.addItem(tipodevolucionempresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) { 
					}

					if(!InformesDevolucionesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaInformesDevoluciones") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!InformesDevolucionesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevoluciones.removeAllItems();

							for(TipoDevolucionEmpresa tipodevolucionempresa:this.tipodevolucionempresasForeignKey) {
								this.jComboBoxid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevoluciones.addItem(tipodevolucionempresa);
							}
						}

						if(!InformesDevolucionesJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!InformesDevolucionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) { 
							this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_empresaInformesDevoluciones.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_empresaInformesDevoluciones.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) { 
					}

					if(!InformesDevolucionesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!InformesDevolucionesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) { 
							this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_sucursalInformesDevoluciones.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_sucursalInformesDevoluciones.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) { 
					}

					if(!InformesDevolucionesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameProductoForeignKey(Producto producto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
							this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_productoInformesDevoluciones.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
							this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_productoInformesDevoluciones.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoBusquedaInformesDevolucionesInformesDevoluciones.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoBusquedaInformesDevolucionesInformesDevoluciones.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoDevolucionEmpresaForeignKey(TipoDevolucionEmpresa tipodevolucionempresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
							this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_tipo_devolucion_empresaInformesDevoluciones.setSelectedItem(tipodevolucionempresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
							this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_tipo_devolucion_empresaInformesDevoluciones.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevoluciones.setSelectedItem(tipodevolucionempresa);
						} else {
							this.jComboBoxid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevoluciones.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
							this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_empresaInformesDevoluciones.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
							this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_empresaInformesDevoluciones.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
							this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_sucursalInformesDevoluciones.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
							this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_sucursalInformesDevoluciones.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesInformesDevoluciones() throws Exception {
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
		
	public InformesDevolucionesParameterReturnGeneral getInformesDevolucionesParameterGeneral() {
		return this.informesdevolucionesParameterGeneral;
	}
	
	public void setInformesDevolucionesParameterGeneral(InformesDevolucionesParameterReturnGeneral informesdevolucionesParameterGeneral) {
		this.informesdevolucionesParameterGeneral = informesdevolucionesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoInformesDevoluciones() {
		return isPermisoTodoInformesDevoluciones;
	}

	public void setIsPermisoTodoInformesDevoluciones(Boolean isPermisoTodoInformesDevoluciones) {
		this.isPermisoTodoInformesDevoluciones = isPermisoTodoInformesDevoluciones;
	}

	public Boolean getIsPermisoNuevoInformesDevoluciones() {
		return isPermisoNuevoInformesDevoluciones;
	}

	public void setIsPermisoNuevoInformesDevoluciones(Boolean isPermisoNuevoInformesDevoluciones) {
		this.isPermisoNuevoInformesDevoluciones = isPermisoNuevoInformesDevoluciones;
	}

	public Boolean getIsPermisoActualizarInformesDevoluciones() {
		return isPermisoActualizarInformesDevoluciones;
	}

	public void setIsPermisoActualizarInformesDevoluciones(Boolean isPermisoActualizarInformesDevoluciones) {
		this.isPermisoActualizarInformesDevoluciones = isPermisoActualizarInformesDevoluciones;
	}

	public Boolean getIsPermisoEliminarInformesDevoluciones() {
		return isPermisoEliminarInformesDevoluciones;
	}

	public void setIsPermisoEliminarInformesDevoluciones(Boolean isPermisoEliminarInformesDevoluciones) {
		this.isPermisoEliminarInformesDevoluciones = isPermisoEliminarInformesDevoluciones;
	}

	public Boolean getIsPermisoGuardarCambiosInformesDevoluciones() {
		return isPermisoGuardarCambiosInformesDevoluciones;
	}

	public void setIsPermisoGuardarCambiosInformesDevoluciones(Boolean isPermisoGuardarCambiosInformesDevoluciones) {
		this.isPermisoGuardarCambiosInformesDevoluciones = isPermisoGuardarCambiosInformesDevoluciones;
	}
	
	public Boolean getIsPermisoConsultaInformesDevoluciones() {
		return isPermisoConsultaInformesDevoluciones;
	}

	public void setIsPermisoConsultaInformesDevoluciones(Boolean isPermisoConsultaInformesDevoluciones) {
		this.isPermisoConsultaInformesDevoluciones = isPermisoConsultaInformesDevoluciones;
	}

	public Boolean getIsPermisoBusquedaInformesDevoluciones() {
		return isPermisoBusquedaInformesDevoluciones;
	}

	public void setIsPermisoBusquedaInformesDevoluciones(Boolean isPermisoBusquedaInformesDevoluciones) {
		this.isPermisoBusquedaInformesDevoluciones = isPermisoBusquedaInformesDevoluciones;
	}

	public Boolean getIsPermisoReporteInformesDevoluciones() {
		return isPermisoReporteInformesDevoluciones;
	}

	public void setIsPermisoReporteInformesDevoluciones(Boolean isPermisoReporteInformesDevoluciones) {
		this.isPermisoReporteInformesDevoluciones = isPermisoReporteInformesDevoluciones;
	}
	
	public Boolean getIsPermisoPaginacionMedioInformesDevoluciones() {
		return isPermisoPaginacionMedioInformesDevoluciones;
	}

	public void setIsPermisoPaginacionMedioInformesDevoluciones(Boolean isPermisoPaginacionMedioInformesDevoluciones) {
		this.isPermisoPaginacionMedioInformesDevoluciones = isPermisoPaginacionMedioInformesDevoluciones;
	}
	
	public Boolean getIsPermisoPaginacionTodoInformesDevoluciones() {
		return isPermisoPaginacionTodoInformesDevoluciones;
	}

	public void setIsPermisoPaginacionTodoInformesDevoluciones(Boolean isPermisoPaginacionTodoInformesDevoluciones) {
		this.isPermisoPaginacionTodoInformesDevoluciones = isPermisoPaginacionTodoInformesDevoluciones;
	}
	
	public Boolean getIsPermisoPaginacionAltoInformesDevoluciones() {
		return isPermisoPaginacionAltoInformesDevoluciones;
	}

	public void setIsPermisoPaginacionAltoInformesDevoluciones(Boolean isPermisoPaginacionAltoInformesDevoluciones) {
		this.isPermisoPaginacionAltoInformesDevoluciones = isPermisoPaginacionAltoInformesDevoluciones;
	}
	
	public Boolean getIsPermisoCopiarInformesDevoluciones() {
		return isPermisoCopiarInformesDevoluciones;
	}

	public void setIsPermisoCopiarInformesDevoluciones(Boolean isPermisoCopiarInformesDevoluciones) {
		this.isPermisoCopiarInformesDevoluciones = isPermisoCopiarInformesDevoluciones;
	}
	
	public Boolean getIsPermisoVerFormInformesDevoluciones() {
		return isPermisoVerFormInformesDevoluciones;
	}

	public void setIsPermisoVerFormInformesDevoluciones(Boolean isPermisoVerFormInformesDevoluciones) {
		this.isPermisoVerFormInformesDevoluciones = isPermisoVerFormInformesDevoluciones;
	}
	
	public Boolean getIsPermisoDuplicarInformesDevoluciones() {
		return isPermisoDuplicarInformesDevoluciones;
	}

	public void setIsPermisoDuplicarInformesDevoluciones(Boolean isPermisoDuplicarInformesDevoluciones) {
		this.isPermisoDuplicarInformesDevoluciones = isPermisoDuplicarInformesDevoluciones;
	}
	
	public Boolean getIsPermisoOrdenInformesDevoluciones() {
		return isPermisoOrdenInformesDevoluciones;
	}

	public void setIsPermisoOrdenInformesDevoluciones(Boolean isPermisoOrdenInformesDevoluciones) {
		this.isPermisoOrdenInformesDevoluciones = isPermisoOrdenInformesDevoluciones;
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
	
	public Boolean getIsVisibilidadCeldaNuevoInformesDevoluciones() {
		return isVisibilidadCeldaNuevoInformesDevoluciones;
	}

	public void setIsVisibilidadCeldaNuevoInformesDevoluciones(Boolean isVisibilidadCeldaNuevoInformesDevoluciones) {
		this.isVisibilidadCeldaNuevoInformesDevoluciones = isVisibilidadCeldaNuevoInformesDevoluciones;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarInformesDevoluciones() {
		return isVisibilidadCeldaDuplicarInformesDevoluciones;
	}

	public void setIsVisibilidadCeldaDuplicarInformesDevoluciones(Boolean isVisibilidadCeldaDuplicarInformesDevoluciones) {
		this.isVisibilidadCeldaDuplicarInformesDevoluciones = isVisibilidadCeldaDuplicarInformesDevoluciones;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarInformesDevoluciones() {
		return isVisibilidadCeldaCopiarInformesDevoluciones;
	}

	public void setIsVisibilidadCeldaCopiarInformesDevoluciones(Boolean isVisibilidadCeldaCopiarInformesDevoluciones) {
		this.isVisibilidadCeldaCopiarInformesDevoluciones = isVisibilidadCeldaCopiarInformesDevoluciones;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormInformesDevoluciones() {
		return isVisibilidadCeldaVerFormInformesDevoluciones;
	}

	public void setIsVisibilidadCeldaVerFormInformesDevoluciones(Boolean isVisibilidadCeldaVerFormInformesDevoluciones) {
		this.isVisibilidadCeldaVerFormInformesDevoluciones = isVisibilidadCeldaVerFormInformesDevoluciones;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenInformesDevoluciones() {
		return isVisibilidadCeldaOrdenInformesDevoluciones;
	}

	public void setIsVisibilidadCeldaOrdenInformesDevoluciones(Boolean isVisibilidadCeldaOrdenInformesDevoluciones) {
		this.isVisibilidadCeldaOrdenInformesDevoluciones = isVisibilidadCeldaOrdenInformesDevoluciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesInformesDevoluciones() {
		return isVisibilidadCeldaNuevoRelacionesInformesDevoluciones;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesInformesDevoluciones(Boolean isVisibilidadCeldaNuevoRelacionesInformesDevoluciones) {
		this.isVisibilidadCeldaNuevoRelacionesInformesDevoluciones = isVisibilidadCeldaNuevoRelacionesInformesDevoluciones;
	}
	
	public Boolean getIsVisibilidadCeldaModificarInformesDevoluciones() {
		return isVisibilidadCeldaModificarInformesDevoluciones;
	}

	public void setIsVisibilidadCeldaModificarInformesDevoluciones(Boolean isVisibilidadCeldaModificarInformesDevoluciones) {
		this.isVisibilidadCeldaModificarInformesDevoluciones = isVisibilidadCeldaModificarInformesDevoluciones;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarInformesDevoluciones() {
		return isVisibilidadCeldaActualizarInformesDevoluciones;
	}

	public void setIsVisibilidadCeldaActualizarInformesDevoluciones(Boolean isVisibilidadCeldaActualizarInformesDevoluciones) {
		this.isVisibilidadCeldaActualizarInformesDevoluciones = isVisibilidadCeldaActualizarInformesDevoluciones;
	}

	public Boolean getIsVisibilidadCeldaEliminarInformesDevoluciones() {
		return isVisibilidadCeldaEliminarInformesDevoluciones;
	}

	public void setIsVisibilidadCeldaEliminarInformesDevoluciones(Boolean isVisibilidadCeldaEliminarInformesDevoluciones) {
		this.isVisibilidadCeldaEliminarInformesDevoluciones = isVisibilidadCeldaEliminarInformesDevoluciones;
	}

	public Boolean getIsVisibilidadCeldaCancelarInformesDevoluciones() {
		return isVisibilidadCeldaCancelarInformesDevoluciones;
	}

	public void setIsVisibilidadCeldaCancelarInformesDevoluciones(Boolean isVisibilidadCeldaCancelarInformesDevoluciones) {
		this.isVisibilidadCeldaCancelarInformesDevoluciones = isVisibilidadCeldaCancelarInformesDevoluciones;
	}

	public Boolean getIsVisibilidadCeldaGuardarInformesDevoluciones() {
		return isVisibilidadCeldaGuardarInformesDevoluciones;
	}

	public void setIsVisibilidadCeldaGuardarInformesDevoluciones(Boolean isVisibilidadCeldaGuardarInformesDevoluciones) {
		this.isVisibilidadCeldaGuardarInformesDevoluciones = isVisibilidadCeldaGuardarInformesDevoluciones;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosInformesDevoluciones() {
		return isVisibilidadCeldaGuardarCambiosInformesDevoluciones;
	}

	public void setIsVisibilidadCeldaGuardarCambiosInformesDevoluciones(Boolean isVisibilidadCeldaGuardarCambiosInformesDevoluciones) {
		this.isVisibilidadCeldaGuardarCambiosInformesDevoluciones = isVisibilidadCeldaGuardarCambiosInformesDevoluciones;
	}
		
	public InformesDevolucionesSessionBean getinformesdevolucionesSessionBean() {
		return this.informesdevolucionesSessionBean;
	}
	
	public void setinformesdevolucionesSessionBean(InformesDevolucionesSessionBean informesdevolucionesSessionBean) {
		this.informesdevolucionesSessionBean=informesdevolucionesSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaInformesDevoluciones() {
		return this.isVisibilidadBusquedaInformesDevoluciones;
	}

	public void setisVisibilidadBusquedaInformesDevoluciones(Boolean isVisibilidadBusquedaInformesDevoluciones) {
		this.isVisibilidadBusquedaInformesDevoluciones=isVisibilidadBusquedaInformesDevoluciones;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdProducto() {
		return this.isVisibilidadFK_IdProducto;
	}

	public void setisVisibilidadFK_IdProducto(Boolean isVisibilidadFK_IdProducto) {
		this.isVisibilidadFK_IdProducto=isVisibilidadFK_IdProducto;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTipoDevolucionEmpresa() {
		return this.isVisibilidadFK_IdTipoDevolucionEmpresa;
	}

	public void setisVisibilidadFK_IdTipoDevolucionEmpresa(Boolean isVisibilidadFK_IdTipoDevolucionEmpresa) {
		this.isVisibilidadFK_IdTipoDevolucionEmpresa=isVisibilidadFK_IdTipoDevolucionEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(InformesDevoluciones informesdevoluciones)throws Exception {
		try {
			
				this.setActualParaGuardarProductoForeignKey(informesdevoluciones,null);
				this.setActualParaGuardarTipoDevolucionEmpresaForeignKey(informesdevoluciones,null);
				this.setActualParaGuardarEmpresaForeignKey(informesdevoluciones,null);
				this.setActualParaGuardarSucursalForeignKey(informesdevoluciones,null);
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
	
	public void bugActualizarReferenciaActual(InformesDevoluciones informesdevoluciones,InformesDevoluciones informesdevolucionesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalInformesDevoluciones(informesdevoluciones);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		informesdevolucionesAux.setId(informesdevoluciones.getId());
		informesdevolucionesAux.setVersionRow(informesdevoluciones.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(InformesDevoluciones informesdevolucionesLocal) throws Exception {
		
		if(this.informesdevolucionesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(InformesDevoluciones informesdevolucionesLocal) throws Exception {	
		if(this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				informesdevolucionesLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoDevolucionEmpresaDetalleFormJInternalFrame.class)) {
				TipoDevolucionEmpresaBeanSwingJInternalFrame tipodevolucionempresaBeanSwingJInternalFrameLocal=(TipoDevolucionEmpresaBeanSwingJInternalFrame) ((TipoDevolucionEmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipodevolucionempresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoDevolucionEmpresa(tipodevolucionempresaBeanSwingJInternalFrameLocal.gettipodevolucionempresa(),true);
				tipodevolucionempresaBeanSwingJInternalFrameLocal.actualizarLista(tipodevolucionempresaBeanSwingJInternalFrameLocal.tipodevolucionempresa,this.tipodevolucionempresasForeignKey);

				tipodevolucionempresaBeanSwingJInternalFrameLocal.actualizarRelaciones(tipodevolucionempresaBeanSwingJInternalFrameLocal.tipodevolucionempresa);

				informesdevolucionesLocal.setTipoDevolucionEmpresa(tipodevolucionempresaBeanSwingJInternalFrameLocal.tipodevolucionempresa);

				this.addItemDefectoCombosForeignKeyTipoDevolucionEmpresa();
				this.cargarCombosFrameTipoDevolucionEmpresasForeignKey("Formulario");
				this.setActualTipoDevolucionEmpresaForeignKey(tipodevolucionempresaBeanSwingJInternalFrameLocal.tipodevolucionempresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				informesdevolucionesLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				informesdevolucionesLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarInformesDevolucionesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = informesdevolucionesValidator.getInvalidValues(this.informesdevoluciones);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(InformesDevoluciones informesdevoluciones,List<InformesDevoluciones> informesdevolucioness) throws Exception {
	}		
	
	public void actualizarSelectedLista(InformesDevoluciones informesdevoluciones,List<InformesDevoluciones> informesdevolucioness) throws Exception {
		try	{			
			InformesDevolucionesConstantesFunciones.actualizarSelectedLista(informesdevoluciones,informesdevolucioness);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<InformesDevoluciones> informesdevolucionessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				informesdevolucionessLocal=this.informesdevolucionesLogic.getInformesDevolucioness();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				informesdevolucionessLocal=this.informesdevolucioness;
			}
			//ARCHITECTURE
		
			for(InformesDevoluciones informesdevolucionesLocal:informesdevolucionessLocal) {
				if(this.permiteMantenimiento(informesdevolucionesLocal) && informesdevolucionesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+InformesDevolucionesConstantesFunciones.getInformesDevolucionesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(InformesDevolucionesConstantesFunciones.USERNAMEUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformesDevoluciones.jLabeluser_name_usuarioInformesDevoluciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformesDevolucionesConstantesFunciones.NOMBRECOMPLETOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformesDevoluciones.jLabelnombre_completo_clienteInformesDevoluciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformesDevolucionesConstantesFunciones.NUMEROPREIMPRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformesDevoluciones.jLabelnumero_pre_impresoInformesDevoluciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformesDevolucionesConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformesDevoluciones.jLabelfecha_emisionInformesDevoluciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformesDevolucionesConstantesFunciones.NOMBREBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformesDevoluciones.jLabelnombre_bodegaInformesDevoluciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformesDevolucionesConstantesFunciones.NOMBREPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformesDevoluciones.jLabelnombre_productoInformesDevoluciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformesDevolucionesConstantesFunciones.NOMBRETIPODEVOLUCIONEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformesDevoluciones.jLabelnombre_tipo_devolucion_empresaInformesDevoluciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformesDevolucionesConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformesDevoluciones.jLabelcantidadInformesDevoluciones,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(InformesDevolucionesConstantesFunciones.CODIGOPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformesDevoluciones.jLabelcodigo_productoInformesDevoluciones,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformesDevoluciones.jLabeluser_name_usuarioInformesDevoluciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformesDevoluciones.jLabelnombre_completo_clienteInformesDevoluciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformesDevoluciones.jLabelnumero_pre_impresoInformesDevoluciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformesDevoluciones.jLabelfecha_emisionInformesDevoluciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformesDevoluciones.jLabelnombre_bodegaInformesDevoluciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformesDevoluciones.jLabelnombre_productoInformesDevoluciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformesDevoluciones.jLabelnombre_tipo_devolucion_empresaInformesDevoluciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformesDevoluciones.jLabelcantidadInformesDevoluciones,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormInformesDevoluciones.jLabelcodigo_productoInformesDevoluciones,"");
		
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
		this.iIdNuevoInformesDevoluciones--;	
		
		
		this.informesdevolucionesAux=new InformesDevoluciones();
		
		this.informesdevolucionesAux.setId(this.iIdNuevoInformesDevoluciones);
		this.informesdevolucionesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.informesdevolucionesLogic.getInformesDevolucioness().add(this.informesdevolucionesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.informesdevolucioness.add(this.informesdevolucionesAux);
		}
		//ARCHITECTURE
		
		this.informesdevoluciones=this.informesdevolucionesAux;
		
		if(InformesDevolucionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioInformesDevoluciones(this.informesdevoluciones);
			this.setVariablesObjetoActualToFormularioForeignKeyInformesDevoluciones(this.informesdevoluciones);
		}
				
		//this.setDefaultControlesInformesDevoluciones();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyInformesDevoluciones();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyInformesDevoluciones();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyInformesDevoluciones();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualInformesDevoluciones(this.informesdevolucionesBean,this.informesdevoluciones,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanInformesDevoluciones(this.informesdevolucionesReturnGeneral,this.informesdevolucionesBean,false);
		
		if(this.informesdevolucionesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyInformesDevoluciones(this.informesdevolucionesReturnGeneral.getInformesDevoluciones());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioInformesDevoluciones(this.informesdevolucionesReturnGeneral.getInformesDevoluciones());
		}
		
		if(this.informesdevolucionesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioInformesDevoluciones(this.informesdevolucionesReturnGeneral.getInformesDevoluciones(),classes);//this.informesdevolucionesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.informesdevoluciones,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyInformesDevoluciones();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyInformesDevoluciones();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			InformesDevolucionesBeanSwingJInternalFrameAdditional.RecargarFormInformesDevoluciones(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingInformesDevoluciones(false);
						
			if(informesdevolucionesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(InformesDevolucionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualInformesDevoluciones();
			}
			
			this.actualizarVisualTableDatosInformesDevoluciones();
			
			this.jTableDatosInformesDevoluciones.setRowSelectionInterval(this.getIndiceNuevoInformesDevoluciones(), this.getIndiceNuevoInformesDevoluciones());
			
			this.seleccionarFilaTablaInformesDevolucionesActual();
						
			this.actualizarEstadoCeldasBotonesInformesDevoluciones("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesInformesDevoluciones(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormInformesDevoluciones.jDateChooserfecha_emision_desdeInformesDevoluciones.setEnabled(isHabilitar && this.informesdevolucionesConstantesFunciones.activarfecha_emision_desdeInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jDateChooserfecha_emision_hastaInformesDevoluciones.setEnabled(isHabilitar && this.informesdevolucionesConstantesFunciones.activarfecha_emision_hastaInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jTextFielduser_name_usuarioInformesDevoluciones.setEnabled(isHabilitar && this.informesdevolucionesConstantesFunciones.activaruser_name_usuarioInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_completo_clienteInformesDevoluciones.setEnabled(isHabilitar && this.informesdevolucionesConstantesFunciones.activarnombre_completo_clienteInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jTextFieldnumero_pre_impresoInformesDevoluciones.setEnabled(isHabilitar && this.informesdevolucionesConstantesFunciones.activarnumero_pre_impresoInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jDateChooserfecha_emisionInformesDevoluciones.setEnabled(isHabilitar && this.informesdevolucionesConstantesFunciones.activarfecha_emisionInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_bodegaInformesDevoluciones.setEnabled(isHabilitar && this.informesdevolucionesConstantesFunciones.activarnombre_bodegaInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_productoInformesDevoluciones.setEnabled(isHabilitar && this.informesdevolucionesConstantesFunciones.activarnombre_productoInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_tipo_devolucion_empresaInformesDevoluciones.setEnabled(isHabilitar && this.informesdevolucionesConstantesFunciones.activarnombre_tipo_devolucion_empresaInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jTextFieldcantidadInformesDevoluciones.setEnabled(isHabilitar && this.informesdevolucionesConstantesFunciones.activarcantidadInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jTextFieldcodigo_productoInformesDevoluciones.setEnabled(isHabilitar && this.informesdevolucionesConstantesFunciones.activarcodigo_productoInformesDevoluciones);	
		
		this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_productoInformesDevoluciones.setEnabled(isHabilitar && this.informesdevolucionesConstantesFunciones.activarid_productoInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_tipo_devolucion_empresaInformesDevoluciones.setEnabled(isHabilitar && this.informesdevolucionesConstantesFunciones.activarid_tipo_devolucion_empresaInformesDevoluciones);//
		this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_empresaInformesDevoluciones.setEnabled(isHabilitar && this.informesdevolucionesConstantesFunciones.activarid_empresaInformesDevoluciones);//
		this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_sucursalInformesDevoluciones.setEnabled(isHabilitar && this.informesdevolucionesConstantesFunciones.activarid_sucursalInformesDevoluciones);
	};
	
	public void setDefaultControlesInformesDevoluciones() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoInformesDevoluciones(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.informesdevolucionesSessionBean.setConGuardarRelaciones(true);			
			this.informesdevolucionesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormInformesDevoluciones.jTabbedPaneRelacionesInformesDevoluciones.setVisible(true);
			
					
		} else {
			//this.informesdevolucionesSessionBean.setConGuardarRelaciones(false);			
			this.informesdevolucionesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormInformesDevoluciones.jTabbedPaneRelacionesInformesDevoluciones.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoInformesDevoluciones() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(InformesDevoluciones informesdevolucionesAux:this.informesdevolucionesLogic.getInformesDevolucioness()) {
				if(informesdevolucionesAux.getId().equals(this.iIdNuevoInformesDevoluciones)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(InformesDevoluciones informesdevolucionesAux:this.informesdevolucioness) {
				if(informesdevolucionesAux.getId().equals(this.iIdNuevoInformesDevoluciones)) {
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
	
	public int getIndiceActualInformesDevoluciones(InformesDevoluciones informesdevoluciones,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(InformesDevoluciones informesdevolucionesAux:this.informesdevolucionesLogic.getInformesDevolucioness()) {
				if(informesdevolucionesAux.getId().equals(informesdevoluciones.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(InformesDevoluciones informesdevolucionesAux:this.informesdevolucioness) {
				if(informesdevolucionesAux.getId().equals(informesdevoluciones.getId())) {
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
	
	public void setCamposBaseDesdeOriginalInformesDevoluciones(InformesDevoluciones informesdevolucionesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(InformesDevoluciones informesdevolucionesAux:this.informesdevolucionesLogic.getInformesDevolucioness()) {
				if(informesdevolucionesAux.getInformesDevolucionesOriginal().getId().equals(informesdevolucionesOriginal.getId())) {
					existe=true;
					informesdevolucionesOriginal.setId(informesdevolucionesAux.getId());
					informesdevolucionesOriginal.setVersionRow(informesdevolucionesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(InformesDevoluciones informesdevolucionesAux:this.informesdevolucioness) {
				if(informesdevolucionesAux.getInformesDevolucionesOriginal().getId().equals(informesdevolucionesOriginal.getId())) {
					existe=true;
					informesdevolucionesOriginal.setId(informesdevolucionesAux.getId());
					informesdevolucionesOriginal.setVersionRow(informesdevolucionesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosInformesDevoluciones(Boolean esParaCancelar) throws Exception {
		informesdevolucionessAux=new ArrayList<InformesDevoluciones>();
		informesdevolucionesAux=new InformesDevoluciones();
		
		if(!this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(InformesDevoluciones informesdevolucionesAux:this.informesdevolucionesLogic.getInformesDevolucioness()) {
					if(informesdevolucionesAux.getId()<0) {
						informesdevolucionessAux.add(informesdevolucionesAux);
					}		
				}
				this.iIdNuevoInformesDevoluciones=0L;
				this.informesdevolucionesLogic.getInformesDevolucioness().removeAll(informesdevolucionessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(InformesDevoluciones informesdevolucionesAux:this.informesdevolucioness) {
					if(informesdevolucionesAux.getId()<0) {
						informesdevolucionessAux.add(informesdevolucionesAux);
					}		
				}
				this.iIdNuevoInformesDevoluciones=0L;
				this.informesdevolucioness.removeAll(informesdevolucionessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoInformesDevoluciones 
					&& this.informesdevolucionesLogic.getInformesDevolucioness().size()>0
					) {
					informesdevolucionesAux=this.informesdevolucionesLogic.getInformesDevolucioness().get(this.informesdevolucionesLogic.getInformesDevolucioness().size() - 1);
				
					if(informesdevolucionesAux.getId()<0) {
						this.informesdevolucionesLogic.getInformesDevolucioness().remove(informesdevolucionesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoInformesDevoluciones && this.informesdevolucioness.size()>0) {
					informesdevolucionesAux=this.informesdevolucioness.get(this.informesdevolucioness.size() - 1);
				
					if(informesdevolucionesAux.getId()<0) {
						this.informesdevolucioness.remove(informesdevolucionesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoInformesDevoluciones(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(informesdevoluciones.getId()<0) {
				this.informesdevolucionesLogic.getInformesDevolucioness().remove(this.informesdevoluciones);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(informesdevoluciones.getId()<0) {
				this.informesdevolucioness.remove(this.informesdevoluciones);
			}
		}			
	}
	
	public void setEstadosInicialesInformesDevoluciones(List<InformesDevoluciones> informesdevolucionessAux) throws Exception {
		InformesDevolucionesConstantesFunciones.setEstadosInicialesInformesDevoluciones(informesdevolucionessAux);
	}
	
	public void setEstadosInicialesInformesDevoluciones(InformesDevoluciones informesdevolucionesAux) throws Exception {
		InformesDevolucionesConstantesFunciones.setEstadosInicialesInformesDevoluciones(informesdevolucionesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarInformesDevolucionesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesInformesDevoluciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarInformesDevolucionesActual()) {
				if(!this.isEsNuevoInformesDevoluciones) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesInformesDevoluciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoInformesDevoluciones=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarInformesDevolucionesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Informes Devoluciones ?", "MANTENIMIENTO DE Informes Devoluciones", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesInformesDevoluciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(InformesDevoluciones informesdevoluciones) throws Exception {
		InformesDevolucionesConstantesFunciones.seleccionarAsignar(this.informesdevoluciones,informesdevoluciones);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarInformesDevoluciones=this.isPermisoActualizarOriginalInformesDevoluciones;
			
			
			this.seleccionarAsignar(informesdevoluciones);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesInformesDevoluciones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.informesdevolucionesSessionBean.setsFuncionBusquedaRapida(this.informesdevolucionesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoInformesDevoluciones) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosInformesDevoluciones(esParaCancelar);				
				this.cancelarNuevoInformesDevoluciones(esParaCancelar);								
			}
			
			this.informesdevoluciones=new InformesDevoluciones();
			
			this.inicializarInformesDevoluciones();
			
			this.actualizarEstadoCeldasBotonesInformesDevoluciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarInformesDevoluciones() throws Exception {
		try {
			InformesDevolucionesConstantesFunciones.inicializarInformesDevoluciones(this.informesdevoluciones);
			
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
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.informesdevolucionesLogic.getInformesDevolucioness().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteInformesDevolucioness(String sAccionBusqueda,List<InformesDevoluciones> informesdevolucionessParaReportes) throws Exception {
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
					sPathReporteFinal="InformesDevoluciones"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="InformesDevolucionesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("InformesDevolucionesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="InformesDevoluciones"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Informes Devolucioneses");		
		parameters.put("busquedapor", InformesDevolucionesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceInformesDevoluciones=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			InformesDevolucionesConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			InformesDevolucionesConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceInformesDevoluciones=new JRBeanArrayDataSource(InformesDevolucionesJInternalFrame.TraerInformesDevolucionesBeans(informesdevolucionessParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceInformesDevoluciones);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+InformesDevolucionesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+InformesDevolucionesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(InformesDevolucionesBean.TraerInformesDevolucionesBeans(informesdevolucionessParaReportes).toArray()));
							
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
				this.generarExcelReporteInformesDevolucioness(sAccionBusqueda,sTipoArchivoReporte,informesdevolucionessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalInformesDevolucioness(sAccionBusqueda,sTipoArchivoReporte,informesdevolucionessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoInformesDevolucionesActionPerformed(null);
					//this.generarExcelReporteInformesDevolucioness(sAccionBusqueda,sTipoArchivoReporte,informesdevolucionessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalInformesDevolucioness(sAccionBusqueda,sTipoArchivoReporte,informesdevolucionessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesInformesDevolucioness(sAccionBusqueda,sTipoArchivoReporte,informesdevolucionessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesInformesDevolucioness(sAccionBusqueda,sTipoArchivoReporte,informesdevolucionessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteInformesDevolucioness(String sAccionBusqueda,String sTipoArchivoReporte,List<InformesDevoluciones> informesdevolucionessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"informesdevoluciones";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("InformesDevolucioness");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderInformesDevoluciones("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(InformesDevoluciones informesdevoluciones : informesdevolucionessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			InformesDevolucionesConstantesFunciones.generarExcelReporteDataInformesDevoluciones("NORMAL",row,workbook,informesdevoluciones,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informes Devoluciones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderInformesDevoluciones(String sTipo,Row row,Workbook workbook) {
		
		InformesDevolucionesConstantesFunciones.generarExcelReporteHeaderInformesDevoluciones(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalInformesDevolucioness(String sAccionBusqueda,String sTipoArchivoReporte,List<InformesDevoluciones> informesdevolucionessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"informesdevoluciones_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("InformesDevolucioness");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(InformesDevoluciones informesdevoluciones : informesdevolucionessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(InformesDevolucionesConstantesFunciones.getInformesDevolucionesDescripcion(informesdevoluciones));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformesDevolucionesConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informesdevoluciones.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformesDevolucionesConstantesFunciones.LABEL_IDTIPODEVOLUCIONEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_IDTIPODEVOLUCIONEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informesdevoluciones.gettipodevolucionempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformesDevolucionesConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informesdevoluciones.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformesDevolucionesConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informesdevoluciones.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informesdevoluciones.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informesdevoluciones.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformesDevolucionesConstantesFunciones.LABEL_USERNAMEUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_USERNAMEUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informesdevoluciones.getuser_name_usuario());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformesDevolucionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informesdevoluciones.getnombre_completo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformesDevolucionesConstantesFunciones.LABEL_NUMEROPREIMPRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_NUMEROPREIMPRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informesdevoluciones.getnumero_pre_impreso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informesdevoluciones.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformesDevolucionesConstantesFunciones.LABEL_NOMBREBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_NOMBREBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informesdevoluciones.getnombre_bodega());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformesDevolucionesConstantesFunciones.LABEL_NOMBREPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_NOMBREPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informesdevoluciones.getnombre_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformesDevolucionesConstantesFunciones.LABEL_NOMBRETIPODEVOLUCIONEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_NOMBRETIPODEVOLUCIONEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informesdevoluciones.getnombre_tipo_devolucion_empresa());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformesDevolucionesConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informesdevoluciones.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(InformesDevolucionesConstantesFunciones.LABEL_CODIGOPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_CODIGOPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(informesdevoluciones.getcodigo_producto());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informes Devoluciones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesInformesDevolucioness(String sAccionBusqueda,String sTipoArchivoReporte,List<InformesDevoluciones> informesdevolucionessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<InformesDevoluciones> informesdevolucionessRespaldo=null;
		
		classes=InformesDevolucionesConstantesFunciones.getClassesRelationshipsOfInformesDevoluciones(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.informesdevolucionesLogic.setDatosCliente(this.datosCliente);
		this.informesdevolucionesLogic.setDatosDeep(this.datosDeep);
		this.informesdevolucionesLogic.setIsConDeep(true);
		
		informesdevolucionessRespaldo=this.informesdevolucionesLogic.getInformesDevolucioness();
		
		this.informesdevolucionesLogic.setInformesDevolucioness(informesdevolucionessParaReportes);	
		this.informesdevolucionesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		informesdevolucionessParaReportes=this.informesdevolucionesLogic.getInformesDevolucioness();
		this.informesdevolucionesLogic.setInformesDevolucioness(informesdevolucionessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"informesdevoluciones_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("InformesDevolucioness");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderInformesDevoluciones("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(InformesDevoluciones informesdevoluciones : informesdevolucionessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderInformesDevoluciones("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			InformesDevolucionesConstantesFunciones.generarExcelReporteDataInformesDevoluciones("NORMAL",row,workbook,informesdevoluciones,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(InformesDevolucionesConstantesFunciones.getInformesDevolucionesDescripcion(informesdevoluciones));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informes Devoluciones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoInformesDevoluciones.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoInformesDevoluciones.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoInformesDevoluciones.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoInformesDevoluciones.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessInformesDevoluciones() throws Exception {		
		this.startProcessInformesDevoluciones(true);
	}
	
	public void startProcessInformesDevoluciones(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasInformesDevoluciones ,this.jPanelParametrosReportesInformesDevoluciones, this.jScrollPanelDatosInformesDevoluciones,this.jPanelPaginacionInformesDevoluciones, this.jScrollPanelDatosEdicionInformesDevoluciones, this.jPanelAccionesInformesDevoluciones,this.jPanelAccionesFormularioInformesDevoluciones,this.jmenuBarInformesDevoluciones,this.jmenuBarDetalleInformesDevoluciones,this.jTtoolBarInformesDevoluciones,this.jTtoolBarDetalleInformesDevoluciones);		
		
		final JTabbedPane jTabbedPaneBusquedasInformesDevoluciones=this.jTabbedPaneBusquedasInformesDevoluciones; 
		
		final JPanel jPanelParametrosReportesInformesDevoluciones=this.jPanelParametrosReportesInformesDevoluciones;
		//final JScrollPane jScrollPanelDatosInformesDevoluciones=this.jScrollPanelDatosInformesDevoluciones;
		final JTable jTableDatosInformesDevoluciones=this.jTableDatosInformesDevoluciones;		
		final JPanel jPanelPaginacionInformesDevoluciones=this.jPanelPaginacionInformesDevoluciones;
		//final JScrollPane jScrollPanelDatosEdicionInformesDevoluciones=this.jScrollPanelDatosEdicionInformesDevoluciones;
		final JPanel jPanelAccionesInformesDevoluciones=this.jPanelAccionesInformesDevoluciones;
		
		JPanel jPanelCamposAuxiliarInformesDevoluciones=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarInformesDevoluciones=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
			jPanelCamposAuxiliarInformesDevoluciones=this.jInternalFrameDetalleFormInformesDevoluciones.jPanelCamposInformesDevoluciones;
			jPanelAccionesFormularioAuxiliarInformesDevoluciones=this.jInternalFrameDetalleFormInformesDevoluciones.jPanelAccionesFormularioInformesDevoluciones;
		}
		
		final JPanel jPanelCamposInformesDevoluciones=jPanelCamposAuxiliarInformesDevoluciones;
		final JPanel jPanelAccionesFormularioInformesDevoluciones=jPanelAccionesFormularioAuxiliarInformesDevoluciones;
		
		
		final JMenuBar jmenuBarInformesDevoluciones=this.jmenuBarInformesDevoluciones;
		final JToolBar jTtoolBarInformesDevoluciones=this.jTtoolBarInformesDevoluciones;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarInformesDevoluciones=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarInformesDevoluciones=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
			jmenuBarDetalleAuxiliarInformesDevoluciones=this.jInternalFrameDetalleFormInformesDevoluciones.jmenuBarDetalleInformesDevoluciones;
			jTtoolBarDetalleAuxiliarInformesDevoluciones=this.jInternalFrameDetalleFormInformesDevoluciones.jTtoolBarDetalleInformesDevoluciones;
		}
		
		final JMenuBar jmenuBarDetalleInformesDevoluciones=jmenuBarDetalleAuxiliarInformesDevoluciones;
		final JToolBar jTtoolBarDetalleInformesDevoluciones=jTtoolBarDetalleAuxiliarInformesDevoluciones;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasInformesDevoluciones;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesInformesDevoluciones;
			processRunnable.jTableDatos=jTableDatosInformesDevoluciones;
			processRunnable.jPanelCampos=jPanelCamposInformesDevoluciones;
			processRunnable.jPanelPaginacion=jPanelPaginacionInformesDevoluciones;
			processRunnable.jPanelAcciones=jPanelAccionesInformesDevoluciones;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioInformesDevoluciones;
			
			
			processRunnable.jmenuBar=jmenuBarInformesDevoluciones;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleInformesDevoluciones;
			processRunnable.jTtoolBar=jTtoolBarInformesDevoluciones;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleInformesDevoluciones;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasInformesDevoluciones ,jPanelParametrosReportesInformesDevoluciones,jTableDatosInformesDevoluciones, /*jScrollPanelDatosInformesDevoluciones,*/jPanelCamposInformesDevoluciones,jPanelPaginacionInformesDevoluciones, /*jScrollPanelDatosEdicionInformesDevoluciones,*/ jPanelAccionesInformesDevoluciones,jPanelAccionesFormularioInformesDevoluciones,jmenuBarInformesDevoluciones,jmenuBarDetalleInformesDevoluciones,jTtoolBarInformesDevoluciones,jTtoolBarDetalleInformesDevoluciones);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasInformesDevoluciones ,jPanelParametrosReportesInformesDevoluciones, jScrollPanelDatosInformesDevoluciones,jPanelPaginacionInformesDevoluciones, jScrollPanelDatosEdicionInformesDevoluciones, jPanelAccionesInformesDevoluciones,jPanelAccionesFormularioInformesDevoluciones,jmenuBarInformesDevoluciones,jmenuBarDetalleInformesDevoluciones,jTtoolBarInformesDevoluciones,jTtoolBarDetalleInformesDevoluciones);
						
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
	
	public void finishProcessInformesDevoluciones() {// throws Exception 
		this.finishProcessInformesDevoluciones(true);
	}
	
	public void finishProcessInformesDevoluciones(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasInformesDevoluciones ,this.jPanelParametrosReportesInformesDevoluciones, this.jScrollPanelDatosInformesDevoluciones,this.jPanelPaginacionInformesDevoluciones, this.jScrollPanelDatosEdicionInformesDevoluciones, this.jPanelAccionesInformesDevoluciones,this.jPanelAccionesFormularioInformesDevoluciones,this.jmenuBarInformesDevoluciones,this.jmenuBarDetalleInformesDevoluciones,this.jTtoolBarInformesDevoluciones,this.jTtoolBarDetalleInformesDevoluciones);		
		
		final JTabbedPane jTabbedPaneBusquedasInformesDevoluciones=this.jTabbedPaneBusquedasInformesDevoluciones; 
		
		final JPanel jPanelParametrosReportesInformesDevoluciones=this.jPanelParametrosReportesInformesDevoluciones;
		//final JScrollPane jScrollPanelDatosInformesDevoluciones=this.jScrollPanelDatosInformesDevoluciones;
		final JTable jTableDatosInformesDevoluciones=this.jTableDatosInformesDevoluciones;		
		final JPanel jPanelPaginacionInformesDevoluciones=this.jPanelPaginacionInformesDevoluciones;
		//final JScrollPane jScrollPanelDatosEdicionInformesDevoluciones=this.jScrollPanelDatosEdicionInformesDevoluciones;
		final JPanel jPanelAccionesInformesDevoluciones=this.jPanelAccionesInformesDevoluciones;
		
		JPanel jPanelCamposAuxiliarInformesDevoluciones=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarInformesDevoluciones=new JPanel();
		
		if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
			jPanelCamposAuxiliarInformesDevoluciones=this.jInternalFrameDetalleFormInformesDevoluciones.jPanelCamposInformesDevoluciones;
			jPanelAccionesFormularioAuxiliarInformesDevoluciones=this.jInternalFrameDetalleFormInformesDevoluciones.jPanelAccionesFormularioInformesDevoluciones;
		}
		
		final JPanel jPanelCamposInformesDevoluciones=jPanelCamposAuxiliarInformesDevoluciones;
		final JPanel jPanelAccionesFormularioInformesDevoluciones=jPanelAccionesFormularioAuxiliarInformesDevoluciones;
		
		
		final JMenuBar jmenuBarInformesDevoluciones=this.jmenuBarInformesDevoluciones;		
		final JToolBar jTtoolBarInformesDevoluciones=this.jTtoolBarInformesDevoluciones;
				
		JMenuBar jmenuBarDetalleAuxiliarInformesDevoluciones=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarInformesDevoluciones=new JToolBar();
		
		if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
			jmenuBarDetalleAuxiliarInformesDevoluciones=this.jInternalFrameDetalleFormInformesDevoluciones.jmenuBarDetalleInformesDevoluciones;
			jTtoolBarDetalleAuxiliarInformesDevoluciones=this.jInternalFrameDetalleFormInformesDevoluciones.jTtoolBarDetalleInformesDevoluciones;		
		}
		
		final JMenuBar jmenuBarDetalleInformesDevoluciones=jmenuBarDetalleAuxiliarInformesDevoluciones;
		final JToolBar jTtoolBarDetalleInformesDevoluciones=jTtoolBarDetalleAuxiliarInformesDevoluciones;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasInformesDevoluciones;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesInformesDevoluciones;
			processRunnable.jTableDatos=jTableDatosInformesDevoluciones;
			processRunnable.jPanelCampos=jPanelCamposInformesDevoluciones;
			processRunnable.jPanelPaginacion=jPanelPaginacionInformesDevoluciones;
			processRunnable.jPanelAcciones=jPanelAccionesInformesDevoluciones;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioInformesDevoluciones;
			
			
			processRunnable.jmenuBar=jmenuBarInformesDevoluciones;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleInformesDevoluciones;
			processRunnable.jTtoolBar=jTtoolBarInformesDevoluciones;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleInformesDevoluciones;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasInformesDevoluciones ,jPanelParametrosReportesInformesDevoluciones, jTableDatosInformesDevoluciones,/*jScrollPanelDatosInformesDevoluciones,*/jPanelCamposInformesDevoluciones,jPanelPaginacionInformesDevoluciones, /*jScrollPanelDatosEdicionInformesDevoluciones,*/ jPanelAccionesInformesDevoluciones,jPanelAccionesFormularioInformesDevoluciones,jmenuBarInformesDevoluciones,jmenuBarDetalleInformesDevoluciones,jTtoolBarInformesDevoluciones,jTtoolBarDetalleInformesDevoluciones));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesInformesDevoluciones(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarInformesDevoluciones(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuInformesDevoluciones(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarInformesDevoluciones(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarInformesDevoluciones,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleInformesDevoluciones,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuInformesDevoluciones(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarInformesDevoluciones,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleInformesDevoluciones,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.informesdevolucionesConstantesFunciones.getsFinalQueryInformesDevoluciones();
		String  finalQueryPaginacionTodos=this.informesdevolucionesConstantesFunciones.getsFinalQueryInformesDevoluciones();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=InformesDevolucionesConstantesFunciones.getArrayColumnasGlobalesNoInformesDevoluciones(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=InformesDevolucionesConstantesFunciones.getArrayColumnasGlobalesInformesDevoluciones(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,InformesDevolucionesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.informesdevolucionessEliminados= new ArrayList<InformesDevoluciones>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessInformesDevoluciones();
		
				///*InformesDevolucionesSessionBean*/this.informesdevolucionesSessionBean=new InformesDevolucionesSessionBean();
			
			if(this.informesdevolucionesSessionBean==null) {
				this.informesdevolucionesSessionBean=new InformesDevolucionesSessionBean();
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
					this.iNumeroPaginacion=InformesDevolucionesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=InformesDevolucionesConstantesFunciones.getClassesForeignKeysOfInformesDevoluciones(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/informesdevoluciones."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			informesdevolucionessAux= new ArrayList<InformesDevoluciones>();
			
				
			informesdevolucionesLogic.setDatosCliente(this.datosCliente);
			informesdevolucionesLogic.setDatosDeep(this.datosDeep);
			informesdevolucionesLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaInformesDevoluciones")) {
				this.sDetalleReporte=InformesDevolucionesConstantesFunciones.getDetalleIndiceBusquedaInformesDevoluciones(id_productoBusquedaInformesDevoluciones,id_tipo_devolucion_empresaBusquedaInformesDevoluciones,fecha_emision_desdeBusquedaInformesDevoluciones,fecha_emision_hastaBusquedaInformesDevoluciones);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					informesdevolucionesLogic.getInformesDevolucionessBusquedaInformesDevoluciones(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_productoBusquedaInformesDevoluciones,id_tipo_devolucion_empresaBusquedaInformesDevoluciones,fecha_emision_desdeBusquedaInformesDevoluciones,fecha_emision_hastaBusquedaInformesDevoluciones);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=InformesDevolucionesConstantesFunciones.getDetalleIndiceBusquedaInformesDevoluciones(id_productoBusquedaInformesDevoluciones,id_tipo_devolucion_empresaBusquedaInformesDevoluciones,fecha_emision_desdeBusquedaInformesDevoluciones,fecha_emision_hastaBusquedaInformesDevoluciones);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=InformesDevolucionesConstantesFunciones.getDetalleIndiceBusquedaInformesDevoluciones(id_productoBusquedaInformesDevoluciones,id_tipo_devolucion_empresaBusquedaInformesDevoluciones,fecha_emision_desdeBusquedaInformesDevoluciones,fecha_emision_hastaBusquedaInformesDevoluciones);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=informesdevolucionesLogic.getInformesDevolucioness()==null||informesdevolucionesLogic.getInformesDevolucioness().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=informesdevolucioness==null|| informesdevolucioness.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						informesdevolucionessAux=new ArrayList<InformesDevoluciones>();
						informesdevolucionessAux.addAll(informesdevolucionesLogic.getInformesDevolucioness());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informesdevolucionessAux=new ArrayList<InformesDevoluciones>();
							informesdevolucionessAux.addAll(informesdevolucioness);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							informesdevolucionesLogic.getInformesDevolucionessBusquedaInformesDevoluciones(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_productoBusquedaInformesDevoluciones,id_tipo_devolucion_empresaBusquedaInformesDevoluciones,fecha_emision_desdeBusquedaInformesDevoluciones,fecha_emision_hastaBusquedaInformesDevoluciones);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=InformesDevolucionesConstantesFunciones.getDetalleIndiceBusquedaInformesDevoluciones(id_productoBusquedaInformesDevoluciones,id_tipo_devolucion_empresaBusquedaInformesDevoluciones,fecha_emision_desdeBusquedaInformesDevoluciones,fecha_emision_hastaBusquedaInformesDevoluciones);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=InformesDevolucionesConstantesFunciones.getDetalleIndiceBusquedaInformesDevoluciones(id_productoBusquedaInformesDevoluciones,id_tipo_devolucion_empresaBusquedaInformesDevoluciones,fecha_emision_desdeBusquedaInformesDevoluciones,fecha_emision_hastaBusquedaInformesDevoluciones);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteInformesDevolucioness("BusquedaInformesDevoluciones",informesdevolucionesLogic.getInformesDevolucioness());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteInformesDevolucioness("BusquedaInformesDevoluciones",informesdevolucioness);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						informesdevolucionesLogic.setInformesDevolucioness(new ArrayList<InformesDevoluciones>());
						informesdevolucionesLogic.getInformesDevolucioness().addAll(informesdevolucionessAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informesdevolucioness=new ArrayList<InformesDevoluciones>();
							informesdevolucioness.addAll(informesdevolucionessAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesInformesDevoluciones();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessInformesDevoluciones();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=informesdevolucionesLogic.getInformesDevolucioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=informesdevolucioness.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=informesdevolucionesLogic.getInformesDevolucioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=informesdevolucioness.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(InformesDevoluciones informesdevoluciones) {
		Boolean permite=true;
		
		if(this.informesdevoluciones.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=InformesDevolucionesConstantesFunciones.getOrderByListaInformesDevoluciones();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=InformesDevolucionesConstantesFunciones.getOrderByListaInformesDevoluciones();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(InformesDevoluciones informesdevoluciones:informesdevolucionesLogic.getInformesDevolucioness()) {
				if(informesdevoluciones.getsType().equals(Constantes2.S_TOTALES)) {
					informesdevolucionesTotales=informesdevoluciones;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(InformesDevoluciones informesdevoluciones:this.informesdevolucioness) {
				if(informesdevoluciones.getsType().equals(Constantes2.S_TOTALES)) {
					informesdevolucionesTotales=informesdevoluciones;
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
			this.informesdevolucionesAux=new InformesDevoluciones();
			this.informesdevolucionesAux.setsType(Constantes2.S_TOTALES);
			this.informesdevolucionesAux.setIsNew(false);
			this.informesdevolucionesAux.setIsChanged(false);
			this.informesdevolucionesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//InformesDevolucionesConstantesFunciones.TotalizarValoresFilaInformesDevoluciones(this.informesdevolucionesLogic.getInformesDevolucioness(),this.informesdevolucionesAux);
				
				//this.informesdevolucionesLogic.getInformesDevolucioness().add(this.informesdevolucionesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				InformesDevolucionesConstantesFunciones.TotalizarValoresFilaInformesDevoluciones(this.informesdevolucioness,this.informesdevolucionesAux);
				
				this.informesdevolucioness.add(this.informesdevolucionesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		informesdevolucionesTotales=new InformesDevoluciones();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.informesdevolucionesLogic.getInformesDevolucioness().remove(informesdevolucionesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.informesdevolucioness.remove(informesdevolucionesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		informesdevolucionesTotales=new InformesDevoluciones();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(InformesDevoluciones informesdevoluciones:informesdevolucionesLogic.getInformesDevolucioness()) {
				if(informesdevoluciones.getsType().equals(Constantes2.S_TOTALES)) {
					informesdevolucionesTotales=informesdevoluciones;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				InformesDevolucionesConstantesFunciones.TotalizarValoresFilaInformesDevoluciones(this.informesdevolucionesLogic.getInformesDevolucioness(),informesdevolucionesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(InformesDevoluciones informesdevoluciones:this.informesdevolucioness) {
				if(informesdevoluciones.getsType().equals(Constantes2.S_TOTALES)) {
					informesdevolucionesTotales=informesdevoluciones;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				InformesDevolucionesConstantesFunciones.TotalizarValoresFilaInformesDevoluciones(this.informesdevolucioness,informesdevolucionesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getInformesDevolucionessBusquedaInformesDevoluciones()throws Exception {
		try {
			sAccionBusqueda="BusquedaInformesDevoluciones";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getInformesDevolucionessFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getInformesDevolucionessFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getInformesDevolucionessFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getInformesDevolucionessFK_IdTipoDevolucionEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoDevolucionEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getInformesDevolucionessBusquedaInformesDevoluciones(String sFinalQuery,Long id_producto,Long id_tipo_devolucion_empresa,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//informesdevolucionesLogic.getInformesDevolucionessBusquedaInformesDevoluciones(sFinalQuery,this.pagination,id_producto,id_tipo_devolucion_empresa,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getInformesDevolucionessFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//informesdevolucionesLogic.getInformesDevolucionessFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getInformesDevolucionessFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//informesdevolucionesLogic.getInformesDevolucionessFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getInformesDevolucionessFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//informesdevolucionesLogic.getInformesDevolucionessFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getInformesDevolucionessFK_IdTipoDevolucionEmpresa(String sFinalQuery,Long id_tipo_devolucion_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//informesdevolucionesLogic.getInformesDevolucionessFK_IdTipoDevolucionEmpresa(sFinalQuery,this.pagination,id_tipo_devolucion_empresa);
				
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
	
	public void inicializarPermisosInformesDevoluciones() {
		this.isPermisoTodoInformesDevoluciones=false;
		this.isPermisoNuevoInformesDevoluciones=false;
		this.isPermisoActualizarInformesDevoluciones=false;
		this.isPermisoActualizarOriginalInformesDevoluciones=false;
		this.isPermisoEliminarInformesDevoluciones=false;
		this.isPermisoGuardarCambiosInformesDevoluciones=false;
		this.isPermisoConsultaInformesDevoluciones=true;
		this.isPermisoBusquedaInformesDevoluciones=true;
		this.isPermisoReporteInformesDevoluciones=true;
		this.isPermisoOrdenInformesDevoluciones=false;		
		this.isPermisoPaginacionMedioInformesDevoluciones=false;		
		this.isPermisoPaginacionAltoInformesDevoluciones=false;		
		this.isPermisoPaginacionTodoInformesDevoluciones=false;		
		this.isPermisoCopiarInformesDevoluciones=false;		
		this.isPermisoVerFormInformesDevoluciones=false;		
		this.isPermisoDuplicarInformesDevoluciones=false;
		this.isPermisoOrdenInformesDevoluciones=false;
	}
	
	public void setPermisosUsuarioInformesDevoluciones(Boolean isPermiso) {
		this.isPermisoTodoInformesDevoluciones=isPermiso;
		this.isPermisoNuevoInformesDevoluciones=isPermiso;
		this.isPermisoActualizarInformesDevoluciones=isPermiso;
		this.isPermisoActualizarOriginalInformesDevoluciones=isPermiso;
		this.isPermisoEliminarInformesDevoluciones=isPermiso;
		this.isPermisoGuardarCambiosInformesDevoluciones=isPermiso;
		this.isPermisoConsultaInformesDevoluciones=isPermiso;
		this.isPermisoBusquedaInformesDevoluciones=isPermiso;
		this.isPermisoReporteInformesDevoluciones=isPermiso;
		this.isPermisoOrdenInformesDevoluciones=isPermiso;		
		this.isPermisoPaginacionMedioInformesDevoluciones=isPermiso;		
		this.isPermisoPaginacionAltoInformesDevoluciones=isPermiso;		
		this.isPermisoPaginacionTodoInformesDevoluciones=isPermiso;		
		this.isPermisoCopiarInformesDevoluciones=isPermiso;		
		this.isPermisoVerFormInformesDevoluciones=isPermiso;		
		this.isPermisoDuplicarInformesDevoluciones=isPermiso;
		this.isPermisoOrdenInformesDevoluciones=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioInformesDevoluciones(Boolean isPermiso) {
		//this.isPermisoTodoInformesDevoluciones=isPermiso;
		this.isPermisoNuevoInformesDevoluciones=isPermiso;
		this.isPermisoActualizarInformesDevoluciones=isPermiso;
		this.isPermisoActualizarOriginalInformesDevoluciones=isPermiso;
		this.isPermisoEliminarInformesDevoluciones=isPermiso;
		this.isPermisoGuardarCambiosInformesDevoluciones=isPermiso;
		//this.isPermisoConsultaInformesDevoluciones=isPermiso;
		//this.isPermisoBusquedaInformesDevoluciones=isPermiso;
		//this.isPermisoReporteInformesDevoluciones=isPermiso;
		//this.isPermisoOrdenInformesDevoluciones=isPermiso;		
		//this.isPermisoPaginacionMedioInformesDevoluciones=isPermiso;		
		//this.isPermisoPaginacionAltoInformesDevoluciones=isPermiso;		
		//this.isPermisoPaginacionTodoInformesDevoluciones=isPermiso;		
		//this.isPermisoCopiarInformesDevoluciones=isPermiso;		
		//this.isPermisoDuplicarInformesDevoluciones=isPermiso;
		//this.isPermisoOrdenInformesDevoluciones=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioInformesDevolucionesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(InformesDevolucionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebInformesDevoluciones(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioInformesDevolucionesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioInformesDevolucionesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionInformesDevolucionesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioInformesDevolucionesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioInformesDevoluciones() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(InformesDevolucionesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, InformesDevolucionesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoInformesDevoluciones=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarInformesDevoluciones=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalInformesDevoluciones=this.isPermisoActualizarInformesDevoluciones;
			this.isPermisoEliminarInformesDevoluciones=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosInformesDevoluciones=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaInformesDevoluciones=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaInformesDevoluciones=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoInformesDevoluciones=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteInformesDevoluciones=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenInformesDevoluciones=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioInformesDevoluciones=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoInformesDevoluciones=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoInformesDevoluciones=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarInformesDevoluciones=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormInformesDevoluciones=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarInformesDevoluciones=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenInformesDevoluciones=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosInformesDevoluciones.setToolTipText(this.jTableDatosInformesDevoluciones.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioInformesDevoluciones(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioInformesDevoluciones(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(InformesDevolucionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(InformesDevolucionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioInformesDevoluciones() throws Exception {
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
	public void inicializarCombosForeignKeyInformesDevolucionesListas()throws Exception {
		try	{						
			
				this.productosForeignKey=new ArrayList();
				this.tipodevolucionempresasForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyInformesDevolucionesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(InformesDevolucionesJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoDevolucionEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyProductoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.productosForeignKey==null||this.productosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ProductoConstantesFunciones.SFINALQUERY;

				this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoDevolucionEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipodevolucionempresasForeignKey==null||this.tipodevolucionempresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoDevolucionEmpresaConstantesFunciones.getArrayColumnasGlobalesTipoDevolucionEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoDevolucionEmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoDevolucionEmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoDevolucionEmpresasForeignKeyLista(finalQueryGlobal);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyInformesDevoluciones()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyTipoDevolucionEmpresa();
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyProducto()throws Exception {
		try {
			if(this.informesdevolucionesSessionBean==null) {
				this.informesdevolucionesSessionBean=new InformesDevolucionesSessionBean();
			}

			if(!this.informesdevolucionesSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
				Producto producto=new Producto();
				ProductoConstantesFunciones.setProductoDescripcion(producto,Constantes.SMENSAJE_ESCOJA_OPCION);
				producto.setId(null);

				if(!ProductoConstantesFunciones.ExisteEnLista(this.productosForeignKey,producto,true)) {

					this.productosForeignKey.add(0,producto);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoDevolucionEmpresa()throws Exception {
		try {

			if(!this.informesdevolucionesSessionBean.getisBusquedaDesdeForeignKeySesionTipoDevolucionEmpresa()) {
				TipoDevolucionEmpresa tipodevolucionempresa=new TipoDevolucionEmpresa();
				TipoDevolucionEmpresaConstantesFunciones.setTipoDevolucionEmpresaDescripcion(tipodevolucionempresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipodevolucionempresa.setId(null);

				if(!TipoDevolucionEmpresaConstantesFunciones.ExisteEnLista(this.tipodevolucionempresasForeignKey,tipodevolucionempresa,true)) {

					this.tipodevolucionempresasForeignKey.add(0,tipodevolucionempresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {

			if(!this.informesdevolucionesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.informesdevolucionesSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
	
	public void initActionsCombosTodosForeignKeyInformesDevoluciones()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyInformesDevoluciones(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyInformesDevoluciones()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyInformesDevoluciones();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyInformesDevoluciones(InformesDevoluciones informesdevoluciones)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyInformesDevoluciones(InformesDevoluciones informesdevoluciones,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyInformesDevoluciones()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyInformesDevoluciones()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyInformesDevoluciones()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyInformesDevoluciones()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroInformesDevoluciones()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyInformesDevoluciones()throws Exception {
		try {
			

			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameTipoDevolucionEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyInformesDevoluciones(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoDevolucionEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyInformesDevoluciones()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_productoInformesDevoluciones!=null && this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_productoInformesDevoluciones.getItemCount()>0) {
				this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_productoInformesDevoluciones.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_tipo_devolucion_empresaInformesDevoluciones!=null && this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_tipo_devolucion_empresaInformesDevoluciones.getItemCount()>0) {
				this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_tipo_devolucion_empresaInformesDevoluciones.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_empresaInformesDevoluciones!=null && this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_empresaInformesDevoluciones.getItemCount()>0) {
				this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_empresaInformesDevoluciones.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_sucursalInformesDevoluciones!=null && this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_sucursalInformesDevoluciones.getItemCount()>0) {
				this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_sucursalInformesDevoluciones.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public InformesDevolucionesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public InformesDevolucionesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public InformesDevolucionesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.informesdevolucionesSessionBean=new InformesDevolucionesSessionBean(); 
		this.informesdevolucionesConstantesFunciones=new InformesDevolucionesConstantesFunciones(); 
		this.informesdevolucionesBean=new InformesDevoluciones();//(this.informesdevolucionesConstantesFunciones); 		
		this.informesdevolucionesReturnGeneral=new InformesDevolucionesParameterReturnGeneral(); 
		
		this.informesdevolucionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.informesdevolucionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public InformesDevolucionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public InformesDevolucionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public InformesDevolucionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessInformesDevoluciones(true);
			
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
			
			this.informesdevolucionesConstantesFunciones=new InformesDevolucionesConstantesFunciones(); 
			this.informesdevolucionesBean=new InformesDevoluciones();//this.informesdevolucionesConstantesFunciones); 			
			this.informesdevolucionesReturnGeneral=new InformesDevolucionesParameterReturnGeneral(); 
		
			InformesDevolucionesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Informes Devoluciones Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.informesdevoluciones=new InformesDevoluciones();
			this.informesdevolucioness = new ArrayList<InformesDevoluciones>();
			this.informesdevolucionessAux = new ArrayList<InformesDevoluciones>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic=new InformesDevolucionesLogic();
				this.informesdevolucionesLogic.getNewConnexionToDeep("");
			}
			
			//this.informesdevolucionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.informesdevolucionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormInformesDevoluciones);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoInformesDevoluciones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoInformesDevoluciones);	
					}
					
					if(this.jInternalFrameImportacionInformesDevoluciones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionInformesDevoluciones);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByInformesDevoluciones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByInformesDevoluciones);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormInformesDevoluciones);
				this.jInternalFrameDetalleFormInformesDevoluciones.setVisible(false);
				this.jInternalFrameDetalleFormInformesDevoluciones.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoInformesDevoluciones!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoInformesDevoluciones);
					this.jInternalFrameReporteDinamicoInformesDevoluciones.setVisible(false);
					this.jInternalFrameReporteDinamicoInformesDevoluciones.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionInformesDevoluciones!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionInformesDevoluciones);
					this.jInternalFrameImportacionInformesDevoluciones.setVisible(false);
					this.jInternalFrameImportacionInformesDevoluciones.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByInformesDevoluciones!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByInformesDevoluciones);
					this.jInternalFrameOrderByInformesDevoluciones.setVisible(false);
					this.jInternalFrameOrderByInformesDevoluciones.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idInformesDevolucionesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=InformesDevolucionesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.informesdevolucionesReturnGeneral=new InformesDevolucionesParameterReturnGeneral();
			
			this.informesdevolucionesParameterGeneral=new InformesDevolucionesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.informesdevolucionesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(InformesDevolucionesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,InformesDevolucionesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.informesdevolucionesSessionBean.getEsGuardarRelacionado(),this.informesdevolucionesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,InformesDevolucionesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.informesdevolucionesSessionBean.getEsGuardarRelacionado(),this.informesdevolucionesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoInformesDevoluciones=false;
			this.isVisibilidadCeldaDuplicarInformesDevoluciones=true;
			this.isVisibilidadCeldaCopiarInformesDevoluciones=true;
			this.isVisibilidadCeldaVerFormInformesDevoluciones=true;
			this.isVisibilidadCeldaOrdenInformesDevoluciones=true;
			this.isVisibilidadCeldaNuevoRelacionesInformesDevoluciones=false;
			this.isVisibilidadCeldaModificarInformesDevoluciones=false;
			this.isVisibilidadCeldaActualizarInformesDevoluciones=false;
			this.isVisibilidadCeldaEliminarInformesDevoluciones=false;
			this.isVisibilidadCeldaCancelarInformesDevoluciones=false;
			this.isVisibilidadCeldaGuardarInformesDevoluciones=false;
			this.isVisibilidadCeldaGuardarCambiosInformesDevoluciones=false;
			
			
			this.isVisibilidadBusquedaInformesDevoluciones=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoDevolucionEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesInformesDevoluciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosInformesDevoluciones();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioInformesDevoluciones(false);
			
			this.setPermisosUsuarioInformesDevoluciones();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.informesdevolucionesSessionBean.getEsGuardarRelacionado() 
				|| (this.informesdevolucionesSessionBean.getEsGuardarRelacionado() && this.informesdevolucionesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioInformesDevolucionesClasesRelacionadas();
			}
			
			if(this.informesdevolucionesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioInformesDevolucionesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!InformesDevolucionesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosInformesDevoluciones();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualInformesDevoluciones();
			}
			
			if(!this.isPermisoBusquedaInformesDevoluciones) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasInformesDevoluciones.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(InformesDevolucionesConstantesFunciones.getTiposSeleccionarInformesDevoluciones());
				
				this.tiposColumnasSelect=InformesDevolucionesConstantesFunciones.getTiposSeleccionarInformesDevoluciones(true);
				
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
			//if(!this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioInformesDevoluciones();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioInformesDevoluciones(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioInformesDevoluciones(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesInformesDevoluciones() ;
			
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
			
			this.productoLogic=new ProductoLogic();
			this.tipodevolucionempresaLogic=new TipoDevolucionEmpresaLogic();
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
				informesdevolucionesImplementable= (InformesDevolucionesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+InformesDevolucionesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				informesdevolucionesImplementableHome= (InformesDevolucionesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+InformesDevolucionesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.informesdevolucioness= new ArrayList<InformesDevoluciones>();
			this.informesdevolucionessEliminados= new ArrayList<InformesDevoluciones>();
						
			this.isEsNuevoInformesDevoluciones=false;
			this.esParaAccionDesdeFormularioInformesDevoluciones=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.tipodevolucionempresasForeignKey=new ArrayList<TipoDevolucionEmpresa>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyInformesDevoluciones(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroInformesDevoluciones();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			InformesDevolucionesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=InformesDevolucionesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesInformesDevoluciones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingInformesDevoluciones(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioInformesDevoluciones();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioInformesDevoluciones();
			}
			
			InformesDevolucionesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasInformesDevoluciones.getTabCount(); i++) {
					this.jTabbedPaneBusquedasInformesDevoluciones.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasInformesDevoluciones.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessInformesDevoluciones(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga InformesDevoluciones: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectInformesDevoluciones() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesInformesDevoluciones")) {
				iIndex=this.jInternalFrameDetalleFormInformesDevoluciones.jTabbedPaneRelacionesInformesDevoluciones.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormInformesDevoluciones.jTabbedPaneRelacionesInformesDevoluciones.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessInformesDevoluciones();	
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
	
	public void cargarCombosForeignKeyInformesDevoluciones(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyInformesDevoluciones(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyInformesDevoluciones(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyInformesDevolucionesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyInformesDevoluciones();
		
		this.cargarCombosFrameForeignKeyInformesDevoluciones();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyInformesDevoluciones();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyInformesDevoluciones();
		}
	}
	
	

	public void cargarCombosForeignKeyProducto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaProducto(this.productosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoDevolucionEmpresa(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoDevolucionEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoDevolucionEmpresa();
				this.cargarCombosFrameTipoDevolucionEmpresasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoDevolucionEmpresa(this.tipodevolucionempresasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoInformesDevolucionesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.informesdevolucionesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormInformesDevoluciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
			
			
			if(jTableDatosInformesDevoluciones.getRowCount()>=1) {
				jTableDatosInformesDevoluciones.removeRowSelectionInterval(0, jTableDatosInformesDevoluciones.getRowCount()-1);						
			}
			
			this.isEsNuevoInformesDevoluciones=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoInformesDevoluciones(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesInformesDevoluciones(true);			
			//this.informesdevoluciones=new InformesDevoluciones();
			//this.informesdevoluciones.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesInformesDevoluciones(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualInformesDevoluciones() ;
			
			if(InformesDevolucionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleInformesDevoluciones(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.informesdevoluciones);	
			this.actualizarInformacion("INFO_PADRE",false,this.informesdevoluciones);				
			
			InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
			
			if(this.informesdevolucionesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar InformesDevoluciones: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarInformesDevolucionesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<InformesDevoluciones> informesdevolucionessSeleccionados=new ArrayList<InformesDevoluciones>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosInformesDevoluciones.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosInformesDevoluciones.getSelectedRows().length;			
			}
			
			informesdevolucionessSeleccionados=this.getInformesDevolucionessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoInformesDevoluciones--;			
				//InformesDevoluciones informesdevolucionesAux= new InformesDevoluciones();			
				//informesdevolucionesAux.setId(this.iIdNuevoInformesDevoluciones);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//InformesDevoluciones informesdevolucionesOrigen=new InformesDevoluciones();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(InformesDevoluciones informesdevolucionesOrigen : informesdevolucionessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							informesdevolucionesOrigen =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							informesdevolucionesOrigen =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaInformesDevoluciones();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.informesdevoluciones.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosInformesDevoluciones(informesdevolucionesOrigen,this.informesdevoluciones,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.informesdevolucionesLogic.getInformesDevolucioness().add(this.informesdevolucionesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.informesdevolucioness.add(this.informesdevolucionesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaInformesDevoluciones(false);
				
				this.jTableDatosInformesDevoluciones.setRowSelectionInterval(this.getIndiceNuevoInformesDevoluciones(), this.getIndiceNuevoInformesDevoluciones());
				
				int iLastRow =  this.jTableDatosInformesDevoluciones.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosInformesDevoluciones.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosInformesDevoluciones.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaInformesDevoluciones(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarInformesDevolucionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<InformesDevoluciones> informesdevolucionessSeleccionados=new ArrayList<InformesDevoluciones>();									
		
			InformesDevoluciones informesdevolucionesOrigen=new InformesDevoluciones();
			InformesDevoluciones informesdevolucionesDestino=new InformesDevoluciones();
				
			informesdevolucionessSeleccionados=this.getInformesDevolucionessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosInformesDevoluciones.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || informesdevolucionessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosInformesDevoluciones.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						informesdevolucionesOrigen =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						informesdevolucionesOrigen =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						informesdevolucionesDestino =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						informesdevolucionesDestino =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				informesdevolucionesOrigen =informesdevolucionessSeleccionados.get(0);
				informesdevolucionesDestino =informesdevolucionessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosInformesDevoluciones(informesdevolucionesOrigen,informesdevolucionesDestino,true,false);
				
				informesdevolucionesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(informesdevolucionesDestino,informesdevolucionesLogic.getInformesDevolucioness());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(informesdevolucionesDestino,informesdevolucioness);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaInformesDevoluciones(false);
				
				//this.jTableDatosInformesDevoluciones.setRowSelectionInterval(this.getIndiceNuevoInformesDevoluciones(), this.getIndiceNuevoInformesDevoluciones());
				
				int iLastRow =  this.jTableDatosInformesDevoluciones.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosInformesDevoluciones.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosInformesDevoluciones.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaInformesDevoluciones(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormInformesDevolucionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormInformesDevoluciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormInformesDevoluciones.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarInformesDevolucionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesInformesDevoluciones.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasInformesDevoluciones.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesInformesDevoluciones.setVisible(!isVisible);
			this.jPanelPaginacionInformesDevoluciones.setVisible(!isVisible);
			this.jPanelAccionesInformesDevoluciones.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarInformesDevolucionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameInformesDevoluciones();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoInformesDevolucionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoInformesDevoluciones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionInformesDevolucionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionInformesDevoluciones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByInformesDevolucionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByInformesDevoluciones();
			
			this.abrirFrameOrderByInformesDevoluciones();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByInformesDevolucionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByInformesDevoluciones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleInformesDevoluciones(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormInformesDevoluciones);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormInformesDevoluciones.isMaximum()) {
					this.jInternalFrameDetalleFormInformesDevoluciones.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormInformesDevoluciones.setSize(this.jInternalFrameDetalleFormInformesDevoluciones.iWidthFormulario,this.jInternalFrameDetalleFormInformesDevoluciones.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormInformesDevoluciones.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormInformesDevoluciones.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormInformesDevoluciones.isMaximum()) {
						this.jInternalFrameDetalleFormInformesDevoluciones.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormInformesDevoluciones.jContentPaneDetalleInformesDevoluciones.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormInformesDevoluciones.jTabbedPaneRelacionesInformesDevoluciones.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormInformesDevoluciones.jContentPaneDetalleInformesDevoluciones.getWidth(),InformesDevolucionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormInformesDevoluciones.jTabbedPaneRelacionesInformesDevoluciones.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormInformesDevoluciones.jContentPaneDetalleInformesDevoluciones.getWidth(),InformesDevolucionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormInformesDevoluciones.jTabbedPaneRelacionesInformesDevoluciones.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormInformesDevoluciones.jContentPaneDetalleInformesDevoluciones.getWidth(),InformesDevolucionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormInformesDevoluciones.setVisible(true);
	        this.jInternalFrameDetalleFormInformesDevoluciones.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByInformesDevoluciones() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByInformesDevoluciones==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByInformesDevoluciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByInformesDevoluciones,false,this);
				} else {
					this.jInternalFrameOrderByInformesDevoluciones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByInformesDevoluciones,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByInformesDevoluciones);
				this.jInternalFrameOrderByInformesDevoluciones.setVisible(false);
				this.jInternalFrameOrderByInformesDevoluciones.setSelected(false);
				
				this.jInternalFrameOrderByInformesDevoluciones.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByInformesDevoluciones"));
				
				this.inicializarActualizarBindingTablaOrderByInformesDevoluciones();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionInformesDevoluciones() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionInformesDevoluciones==null) {
				
				this.jInternalFrameImportacionInformesDevoluciones=new ImportacionJInternalFrame(InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionInformesDevoluciones);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionInformesDevoluciones);
				this.jInternalFrameImportacionInformesDevoluciones.setVisible(false);
				this.jInternalFrameImportacionInformesDevoluciones.setSelected(false);


				this.jInternalFrameImportacionInformesDevoluciones.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionInformesDevoluciones"));
				this.jInternalFrameImportacionInformesDevoluciones.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionInformesDevoluciones"));
				this.jInternalFrameImportacionInformesDevoluciones.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionInformesDevoluciones"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoInformesDevoluciones() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoInformesDevoluciones==null) {
				this.jInternalFrameReporteDinamicoInformesDevoluciones=new ReporteDinamicoJInternalFrame(InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoInformesDevoluciones);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoInformesDevoluciones);
				this.jInternalFrameReporteDinamicoInformesDevoluciones.setVisible(false);
				this.jInternalFrameReporteDinamicoInformesDevoluciones.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoInformesDevoluciones.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoInformesDevoluciones"));
				this.jInternalFrameReporteDinamicoInformesDevoluciones.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoInformesDevoluciones"));
				this.jInternalFrameReporteDinamicoInformesDevoluciones.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoInformesDevoluciones"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualInformesDevoluciones();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleInformesDevoluciones() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormInformesDevoluciones);
			
	       	this.jInternalFrameDetalleFormInformesDevoluciones.setVisible(false);
	        this.jInternalFrameDetalleFormInformesDevoluciones.setSelected(false);
			
			//this.jInternalFrameDetalleFormInformesDevoluciones.dispose();
			//this.jInternalFrameDetalleFormInformesDevoluciones=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoInformesDevoluciones() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoInformesDevoluciones.setVisible(true);
	        this.jInternalFrameReporteDinamicoInformesDevoluciones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionInformesDevoluciones() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionInformesDevoluciones.setVisible(true);
	        this.jInternalFrameImportacionInformesDevoluciones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByInformesDevoluciones() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByInformesDevoluciones.setVisible(true);
	        this.jInternalFrameOrderByInformesDevoluciones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByInformesDevoluciones() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByInformesDevoluciones.setVisible(false);
	        this.jInternalFrameOrderByInformesDevoluciones.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoInformesDevoluciones() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoInformesDevoluciones.setVisible(false);
	        this.jInternalFrameReporteDinamicoInformesDevoluciones.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionInformesDevoluciones() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionInformesDevoluciones.setVisible(false);
	        this.jInternalFrameImportacionInformesDevoluciones.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarInformesDevolucionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarInformesDevoluciones(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarInformesDevoluciones(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesInformesDevoluciones(true);
			//this.isEsNuevoInformesDevoluciones=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesInformesDevoluciones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesInformesDevoluciones(false) ;
			
			if(informesdevolucionesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(InformesDevolucionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleInformesDevoluciones(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualInformesDevoluciones(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaInformesDevolucionesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarInformesDevoluciones(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormInformesDevoluciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesInformesDevoluciones(true);
			//this.isEsNuevoInformesDevoluciones=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.informesdevoluciones.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesInformesDevoluciones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesInformesDevoluciones(false) ;
			
			if(InformesDevolucionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleInformesDevoluciones(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualInformesDevoluciones(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaProducto(List<Producto> productosForeignKey)throws Exception{
		TableColumn tableColumnProducto=this.jTableDatosInformesDevoluciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformesDevoluciones,InformesDevolucionesConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosInformesDevoluciones.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoDevolucionEmpresa(List<TipoDevolucionEmpresa> tipodevolucionempresasForeignKey)throws Exception{
		TableColumn tableColumnTipoDevolucionEmpresa=this.jTableDatosInformesDevoluciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformesDevoluciones,InformesDevolucionesConstantesFunciones.LABEL_IDTIPODEVOLUCIONEMPRESA));
		TableCellEditor tableCellEditorTipoDevolucionEmpresa =tableColumnTipoDevolucionEmpresa.getCellEditor();

		TipoDevolucionEmpresaTableCell tipodevolucionempresaTableCellFk=(TipoDevolucionEmpresaTableCell)tableCellEditorTipoDevolucionEmpresa;

		if(tipodevolucionempresaTableCellFk!=null) {
			tipodevolucionempresaTableCellFk.settipodevolucionempresasForeignKey(tipodevolucionempresasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosInformesDevoluciones.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipodevolucionempresaTableCellFk.setRowActual(intSelectedRow);
			//tipodevolucionempresaTableCellFk.settipodevolucionempresasForeignKeyActual(tipodevolucionempresasForeignKey);
		//}


		if(tipodevolucionempresaTableCellFk!=null) {
			tipodevolucionempresaTableCellFk.RecargarTipoDevolucionEmpresasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
			
	
	
	public void jButtonActualizarInformesDevolucionesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesInformesDevoluciones(false);
			
			//if(!this.isEsNuevoInformesDevoluciones) {								
				int intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(InformesDevolucionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.informesdevoluciones,true);
				this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
				
			}
			
			if(this.permiteMantenimiento(this.informesdevoluciones)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoInformesDevoluciones=true;
					this.inicializarActualizarBindingTablaInformesDevoluciones(false);
					this.isEsNuevoInformesDevoluciones=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoInformesDevoluciones=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoInformesDevoluciones=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesInformesDevoluciones(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualInformesDevoluciones(false);
				
				this.habilitarDeshabilitarControlesInformesDevoluciones(false);
			
												
				
				if(InformesDevolucionesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleInformesDevoluciones();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoInformesDevolucionesActionPerformed(evt,informesdevolucionesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualInformesDevoluciones(this.informesdevoluciones,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosInformesDevoluciones.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,informesdevolucionesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.informesdevoluciones.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(InformesDevoluciones.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformesDevoluciones.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarInformesDevolucionesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
				this.informesdevoluciones.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
				this.informesdevoluciones.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.informesdevoluciones)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((InformesDevolucionesModel) this.jTableDatosInformesDevoluciones.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoInformesDevoluciones=true;
				this.inicializarActualizarBindingTablaInformesDevoluciones(false);
				this.isEsNuevoInformesDevoluciones=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesInformesDevoluciones(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualInformesDevoluciones(false);
				
				this.habilitarDeshabilitarControlesInformesDevoluciones(false);
				
				
				
				if(InformesDevolucionesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleInformesDevoluciones();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarInformesDevolucionesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosInformesDevoluciones.getRowCount()>=1) {
				jTableDatosInformesDevoluciones.removeRowSelectionInterval(0, jTableDatosInformesDevoluciones.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesInformesDevoluciones(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaInformesDevoluciones(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesInformesDevoluciones(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualInformesDevoluciones(false) ;
			
			this.isEsNuevoInformesDevoluciones=false;
			
			if(InformesDevolucionesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleInformesDevoluciones();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosInformesDevolucionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingInformesDevoluciones(false);
				
				//SI ES MANUAL
				if(InformesDevolucionesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualInformesDevoluciones();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosInformesDevolucionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoInformesDevoluciones--;			
			//InformesDevoluciones informesdevolucionesAux= new InformesDevoluciones();			
			//informesdevolucionesAux.setId(this.iIdNuevoInformesDevoluciones);
			
			if(this.jInternalFrameDetalleFormInformesDevoluciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaInformesDevoluciones();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
			
			this.informesdevoluciones.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.informesdevolucionesLogic.getInformesDevolucioness().add(this.informesdevolucionesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.informesdevolucioness.add(this.informesdevolucionesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaInformesDevoluciones(false);
			
			this.jTableDatosInformesDevoluciones.setRowSelectionInterval(this.getIndiceNuevoInformesDevoluciones(), this.getIndiceNuevoInformesDevoluciones());
			
			int iLastRow =  this.jTableDatosInformesDevoluciones.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosInformesDevoluciones.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosInformesDevoluciones.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaInformesDevoluciones(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionInformesDevolucionesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingInformesDevoluciones(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingInformesDevoluciones(false);
			
			//SI ES MANUAL
			if(InformesDevolucionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualInformesDevoluciones();
			}
			
			//this.abrirFrameTreeInformesDevoluciones();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionInformesDevolucionesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionInformesDevolucionesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionInformesDevoluciones.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionInformesDevoluciones.setFileImportacion(this.jInternalFrameImportacionInformesDevoluciones.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionInformesDevoluciones.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionInformesDevoluciones.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionInformesDevoluciones.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionInformesDevoluciones.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoInformesDevolucionesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<InformesDevoluciones> informesdevolucionessSeleccionados=new ArrayList<InformesDevoluciones>();		

		informesdevolucionessSeleccionados=this.getInformesDevolucionessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoInformesDevoluciones.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoInformesDevoluciones.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("InformesDevolucionesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"InformesDevolucionesBaseDesign.jrxml";
			
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
			
			this.generarReporteInformesDevolucioness("Todos",informesdevolucionessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informes Devoluciones",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoInformesDevoluciones.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoInformesDevoluciones.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case InformesDevolucionesConstantesFunciones.LABEL_USERNAMEUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_erNameUsuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_erNameUsuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_erNameUsuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_erNameUsuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformesDevolucionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompletoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompletoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompletoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompletoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformesDevolucionesConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroPreImpreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroPreImpreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroPreImpreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroPreImpreso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformesDevolucionesConstantesFunciones.LABEL_NOMBREBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreBodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreBodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreBodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreBodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformesDevolucionesConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformesDevolucionesConstantesFunciones.LABEL_NOMBRETIPODEVOLUCIONEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreTipoDevolucionEmpresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreTipoDevolucionEmpresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreTipoDevolucionEmpresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreTipoDevolucionEmpresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformesDevolucionesConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case InformesDevolucionesConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoProducto_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoInformesDevoluciones.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoInformesDevoluciones.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoInformesDevoluciones.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case InformesDevolucionesConstantesFunciones.LABEL_USERNAMEUSUARIO:
					sNombreCampoCategoria="user_name_usuario";
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoria="nombre_completo_cliente";
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					sNombreCampoCategoria="numero_pre_impreso";
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_NOMBREBODEGA:
					sNombreCampoCategoria="nombre_bodega";
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoria="nombre_producto";
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_NOMBRETIPODEVOLUCIONEMPRESA:
					sNombreCampoCategoria="nombre_tipo_devolucion_empresa";
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoria="codigo_producto";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoInformesDevoluciones.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case InformesDevolucionesConstantesFunciones.LABEL_USERNAMEUSUARIO:
					sNombreCampoCategoriaValor="user_name_usuario";
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoriaValor="nombre_completo_cliente";
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					sNombreCampoCategoriaValor="numero_pre_impreso";
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_NOMBREBODEGA:
					sNombreCampoCategoriaValor="nombre_bodega";
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoriaValor="nombre_producto";
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_NOMBRETIPODEVOLUCIONEMPRESA:
					sNombreCampoCategoriaValor="nombre_tipo_devolucion_empresa";
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoriaValor="codigo_producto";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoInformesDevoluciones.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoInformesDevoluciones.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case InformesDevolucionesConstantesFunciones.LABEL_USERNAMEUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"User Name Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"user_name_usuario");
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo_cliente");
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Pre Impreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_pre_impreso");
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_NOMBREBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_bodega");
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_NOMBREPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_producto");
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_NOMBRETIPODEVOLUCIONEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Tipo Devolucion Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_tipo_devolucion_empresa");
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_CODIGOPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_producto");
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
	
	public void jButtonGenerarExcelReporteDinamicoInformesDevolucionesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<InformesDevoluciones> informesdevolucionessSeleccionados=new ArrayList<InformesDevoluciones>();		
		
		informesdevolucionessSeleccionados=this.getInformesDevolucionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"informesdevoluciones";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("InformesDevolucioness");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoInformesDevoluciones.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoInformesDevoluciones.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case InformesDevolucionesConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(InformesDevoluciones informesdevoluciones:informesdevolucionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informesdevoluciones.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_IDTIPODEVOLUCIONEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_IDTIPODEVOLUCIONEMPRESA);
					iRow++;

					for(InformesDevoluciones informesdevoluciones:informesdevolucionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informesdevoluciones.gettipodevolucionempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(InformesDevoluciones informesdevoluciones:informesdevolucionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informesdevoluciones.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(InformesDevoluciones informesdevoluciones:informesdevolucionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informesdevoluciones.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(InformesDevoluciones informesdevoluciones:informesdevolucionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informesdevoluciones.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(InformesDevoluciones informesdevoluciones:informesdevolucionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informesdevoluciones.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_USERNAMEUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_USERNAMEUSUARIO);
					iRow++;

					for(InformesDevoluciones informesdevoluciones:informesdevolucionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informesdevoluciones.getuser_name_usuario());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
					iRow++;

					for(InformesDevoluciones informesdevoluciones:informesdevolucionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informesdevoluciones.getnombre_completo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_NUMEROPREIMPRESO);
					iRow++;

					for(InformesDevoluciones informesdevoluciones:informesdevolucionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informesdevoluciones.getnumero_pre_impreso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(InformesDevoluciones informesdevoluciones:informesdevolucionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informesdevoluciones.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_NOMBREBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_NOMBREBODEGA);
					iRow++;

					for(InformesDevoluciones informesdevoluciones:informesdevolucionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informesdevoluciones.getnombre_bodega());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_NOMBREPRODUCTO);
					iRow++;

					for(InformesDevoluciones informesdevoluciones:informesdevolucionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informesdevoluciones.getnombre_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_NOMBRETIPODEVOLUCIONEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_NOMBRETIPODEVOLUCIONEMPRESA);
					iRow++;

					for(InformesDevoluciones informesdevoluciones:informesdevolucionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informesdevoluciones.getnombre_tipo_devolucion_empresa());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(InformesDevoluciones informesdevoluciones:informesdevolucionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informesdevoluciones.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case InformesDevolucionesConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_CODIGOPRODUCTO);
					iRow++;

					for(InformesDevoluciones informesdevoluciones:informesdevolucionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(informesdevoluciones.getcodigo_producto());
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
			//	this.getFilaCabeceraExportarExcelInformesDevoluciones(row);				
			//	iRow++;
			//}				
			
			//for(InformesDevoluciones informesdevolucionesAux:informesdevolucionessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelInformesDevoluciones(informesdevolucionesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informes Devoluciones",JOptionPane.INFORMATION_MESSAGE);
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
				this.informesdevolucionesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingInformesDevoluciones(false);
			
			//SI ES MANUAL
			if(InformesDevolucionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualInformesDevoluciones();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresInformesDevolucionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingInformesDevoluciones(false);
			
			//SI ES MANUAL
			if(InformesDevolucionesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualInformesDevoluciones();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesInformesDevolucionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingInformesDevoluciones(false);
			
			//SI ES MANUAL
			if(InformesDevolucionesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualInformesDevoluciones();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaInformesDevoluciones() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosInformesDevoluciones.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosInformesDevoluciones.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosInformesDevoluciones.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosInformesDevoluciones.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosInformesDevoluciones.setMinimumSize(dimensionMinimum);
		this.jTableDatosInformesDevoluciones.setMaximumSize(dimensionMaximum);
		this.jTableDatosInformesDevoluciones.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingInformesDevoluciones(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingInformesDevoluciones(esInicializar,true);
	}
	
	public void inicializarActualizarBindingInformesDevoluciones(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaInformesDevoluciones(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesInformesDevoluciones(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasInformesDevoluciones(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesInformesDevoluciones(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesInformesDevoluciones(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !InformesDevolucionesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!InformesDevolucionesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualInformesDevoluciones() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaInformesDevoluciones();
		
		this.inicializarActualizarBindingBotonesManualInformesDevoluciones(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualInformesDevoluciones();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesInformesDevoluciones() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualInformesDevoluciones(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualInformesDevoluciones(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosInformesDevoluciones.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosInformesDevoluciones.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteInformesDevoluciones.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormInformesDevoluciones.jCheckBoxPostAccionNuevoInformesDevoluciones.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormInformesDevoluciones.jCheckBoxPostAccionSinCerrarInformesDevoluciones.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormInformesDevoluciones.jCheckBoxPostAccionSinMensajeInformesDevoluciones.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosInformesDevoluciones.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosInformesDevoluciones.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteInformesDevoluciones.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
				this.jInternalFrameDetalleFormInformesDevoluciones.jCheckBoxPostAccionNuevoInformesDevoluciones.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormInformesDevoluciones.jCheckBoxPostAccionSinCerrarInformesDevoluciones.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormInformesDevoluciones.jCheckBoxPostAccionSinMensajeInformesDevoluciones.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionInformesDevoluciones.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionInformesDevoluciones.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxTiposAccionesFormularioInformesDevoluciones.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesInformesDevoluciones.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoInformesDevoluciones!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoInformesDevoluciones.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesInformesDevoluciones.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesInformesDevoluciones.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarInformesDevoluciones.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesInformesDevoluciones.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoInformesDevoluciones!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoInformesDevoluciones.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesInformesDevoluciones.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralInformesDevoluciones.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesInformesDevoluciones(Boolean esInicializar) throws Exception {
		try	{	
			if(InformesDevolucionesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualInformesDevoluciones(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesInformesDevoluciones() throws Exception {
		try	{
			if(InformesDevolucionesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualInformesDevoluciones();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleInformesDevoluciones() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxTiposAccionesFormularioInformesDevoluciones.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxTiposAccionesFormularioInformesDevoluciones.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualInformesDevoluciones() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesInformesDevoluciones.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesInformesDevoluciones.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesInformesDevoluciones.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesInformesDevoluciones.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesInformesDevoluciones.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesInformesDevoluciones.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionInformesDevoluciones.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionInformesDevoluciones.addItem(reporte);
			}
			
			
			if(!this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionInformesDevoluciones.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionInformesDevoluciones.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesInformesDevoluciones.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesInformesDevoluciones.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesInformesDevoluciones.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesInformesDevoluciones.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxTiposAccionesFormularioInformesDevoluciones.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxTiposAccionesFormularioInformesDevoluciones.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarInformesDevoluciones.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarInformesDevoluciones.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarInformesDevoluciones.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualInformesDevoluciones();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualInformesDevoluciones() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoInformesDevoluciones!=null) {
				this.jInternalFrameReporteDinamicoInformesDevoluciones.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoInformesDevoluciones.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoInformesDevoluciones!=null) {
				this.jInternalFrameReporteDinamicoInformesDevoluciones.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoInformesDevoluciones.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoInformesDevoluciones!=null) {
				
				if(this.jInternalFrameReporteDinamicoInformesDevoluciones.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoInformesDevoluciones.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoInformesDevoluciones.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoInformesDevoluciones.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoInformesDevoluciones.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoInformesDevoluciones.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualInformesDevoluciones()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_productoBusquedaInformesDevolucionesInformesDevoluciones.getSelectedItem()!=null){this.id_productoBusquedaInformesDevoluciones=((Producto)this.jComboBoxid_productoBusquedaInformesDevolucionesInformesDevoluciones.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevoluciones.getSelectedItem()!=null){this.id_tipo_devolucion_empresaBusquedaInformesDevoluciones=((TipoDevolucionEmpresa)this.jComboBoxid_tipo_devolucion_empresaBusquedaInformesDevolucionesInformesDevoluciones.getSelectedItem()).getId();}
		this.fecha_emision_desdeBusquedaInformesDevoluciones=new Date(this.jDateChooserfecha_emision_desdeBusquedaInformesDevolucionesInformesDevoluciones.getDate().getTime());
		this.fecha_emision_hastaBusquedaInformesDevoluciones=new Date(this.jDateChooserfecha_emision_hastaBusquedaInformesDevolucionesInformesDevoluciones.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasInformesDevoluciones(Boolean esInicializar) throws Exception {				
		if(InformesDevolucionesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualInformesDevoluciones();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaInformesDevoluciones() throws Exception {
		this.inicializarActualizarBindingTablaInformesDevoluciones(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByInformesDevoluciones() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByInformesDevoluciones.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByInformesDevoluciones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByInformesDevoluciones.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new InformesDevolucionesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByInformesDevoluciones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByInformesDevoluciones.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new InformesDevolucionesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosInformesDevolucionesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformesDevolucionesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new InformesDevolucionesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByInformesDevoluciones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByInformesDevoluciones.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new InformesDevolucionesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByInformesDevoluciones.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaInformesDevoluciones(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=informesdevolucionesLogic.getInformesDevolucioness().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=informesdevolucioness.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(InformesDevolucionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosInformesDevoluciones.setModel(new InformesDevolucionesModel(this.informesdevolucionesLogic.getInformesDevolucioness(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosInformesDevoluciones.setModel(new InformesDevolucionesModel(this.informesdevolucioness,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByInformesDevoluciones!=null && this.jInternalFrameOrderByInformesDevoluciones.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByInformesDevoluciones();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosInformesDevoluciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformesDevoluciones,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new InformesDevolucionesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO,informesdevolucionesConstantesFunciones.resaltarSeleccionarInformesDevoluciones,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+InformesDevolucionesConstantesFunciones.SCLASSWEBTITULO,informesdevolucionesConstantesFunciones.resaltarSeleccionarInformesDevoluciones,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosInformesDevoluciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformesDevoluciones,InformesDevolucionesConstantesFunciones.LABEL_ID));

		if(this.informesdevolucionesConstantesFunciones.mostraridInformesDevoluciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformesDevolucionesConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.informesdevolucionesConstantesFunciones.resaltaridInformesDevoluciones,this.informesdevolucionesConstantesFunciones.activaridInformesDevoluciones,this,true,"idInformesDevoluciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.informesdevolucionesConstantesFunciones.resaltaridInformesDevoluciones,this.informesdevolucionesConstantesFunciones.activaridInformesDevoluciones,this,true,"idInformesDevoluciones","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformesDevoluciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformesDevoluciones,InformesDevolucionesConstantesFunciones.LABEL_USERNAMEUSUARIO));

		if(this.informesdevolucionesConstantesFunciones.mostraruser_name_usuarioInformesDevoluciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformesDevolucionesConstantesFunciones.LABEL_USERNAMEUSUARIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.informesdevolucionesConstantesFunciones.resaltaruser_name_usuarioInformesDevoluciones,this.informesdevolucionesConstantesFunciones.activaruser_name_usuarioInformesDevoluciones,this,true,"user_name_usuarioInformesDevoluciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.informesdevolucionesConstantesFunciones.resaltaruser_name_usuarioInformesDevoluciones,this.informesdevolucionesConstantesFunciones.activaruser_name_usuarioInformesDevoluciones,this,true,"user_name_usuarioInformesDevoluciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new InformesDevolucionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformesDevoluciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformesDevoluciones,InformesDevolucionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE));

		if(this.informesdevolucionesConstantesFunciones.mostrarnombre_completo_clienteInformesDevoluciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformesDevolucionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.informesdevolucionesConstantesFunciones.resaltarnombre_completo_clienteInformesDevoluciones,this.informesdevolucionesConstantesFunciones.activarnombre_completo_clienteInformesDevoluciones,this,true,"nombre_completo_clienteInformesDevoluciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.informesdevolucionesConstantesFunciones.resaltarnombre_completo_clienteInformesDevoluciones,this.informesdevolucionesConstantesFunciones.activarnombre_completo_clienteInformesDevoluciones,this,true,"nombre_completo_clienteInformesDevoluciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new InformesDevolucionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformesDevoluciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformesDevoluciones,InformesDevolucionesConstantesFunciones.LABEL_NUMEROPREIMPRESO));

		if(this.informesdevolucionesConstantesFunciones.mostrarnumero_pre_impresoInformesDevoluciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformesDevolucionesConstantesFunciones.LABEL_NUMEROPREIMPRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.informesdevolucionesConstantesFunciones.resaltarnumero_pre_impresoInformesDevoluciones,this.informesdevolucionesConstantesFunciones.activarnumero_pre_impresoInformesDevoluciones,this,true,"numero_pre_impresoInformesDevoluciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.informesdevolucionesConstantesFunciones.resaltarnumero_pre_impresoInformesDevoluciones,this.informesdevolucionesConstantesFunciones.activarnumero_pre_impresoInformesDevoluciones,this,true,"numero_pre_impresoInformesDevoluciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new InformesDevolucionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformesDevoluciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformesDevoluciones,InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISION));

		if(this.informesdevolucionesConstantesFunciones.mostrarfecha_emisionInformesDevoluciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.informesdevolucionesConstantesFunciones.resaltarfecha_emisionInformesDevoluciones,this.informesdevolucionesConstantesFunciones.activarfecha_emisionInformesDevoluciones,this,true,"fecha_emisionInformesDevoluciones","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.informesdevolucionesConstantesFunciones.resaltarfecha_emisionInformesDevoluciones,this.informesdevolucionesConstantesFunciones.activarfecha_emisionInformesDevoluciones,this,true,"fecha_emisionInformesDevoluciones","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new InformesDevolucionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformesDevoluciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformesDevoluciones,InformesDevolucionesConstantesFunciones.LABEL_NOMBREBODEGA));

		if(this.informesdevolucionesConstantesFunciones.mostrarnombre_bodegaInformesDevoluciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformesDevolucionesConstantesFunciones.LABEL_NOMBREBODEGA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.informesdevolucionesConstantesFunciones.resaltarnombre_bodegaInformesDevoluciones,this.informesdevolucionesConstantesFunciones.activarnombre_bodegaInformesDevoluciones,this,true,"nombre_bodegaInformesDevoluciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.informesdevolucionesConstantesFunciones.resaltarnombre_bodegaInformesDevoluciones,this.informesdevolucionesConstantesFunciones.activarnombre_bodegaInformesDevoluciones,this,true,"nombre_bodegaInformesDevoluciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new InformesDevolucionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformesDevoluciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformesDevoluciones,InformesDevolucionesConstantesFunciones.LABEL_NOMBREPRODUCTO));

		if(this.informesdevolucionesConstantesFunciones.mostrarnombre_productoInformesDevoluciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformesDevolucionesConstantesFunciones.LABEL_NOMBREPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.informesdevolucionesConstantesFunciones.resaltarnombre_productoInformesDevoluciones,this.informesdevolucionesConstantesFunciones.activarnombre_productoInformesDevoluciones,this,true,"nombre_productoInformesDevoluciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.informesdevolucionesConstantesFunciones.resaltarnombre_productoInformesDevoluciones,this.informesdevolucionesConstantesFunciones.activarnombre_productoInformesDevoluciones,this,true,"nombre_productoInformesDevoluciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new InformesDevolucionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformesDevoluciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformesDevoluciones,InformesDevolucionesConstantesFunciones.LABEL_NOMBRETIPODEVOLUCIONEMPRESA));

		if(this.informesdevolucionesConstantesFunciones.mostrarnombre_tipo_devolucion_empresaInformesDevoluciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformesDevolucionesConstantesFunciones.LABEL_NOMBRETIPODEVOLUCIONEMPRESA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.informesdevolucionesConstantesFunciones.resaltarnombre_tipo_devolucion_empresaInformesDevoluciones,this.informesdevolucionesConstantesFunciones.activarnombre_tipo_devolucion_empresaInformesDevoluciones,this,true,"nombre_tipo_devolucion_empresaInformesDevoluciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.informesdevolucionesConstantesFunciones.resaltarnombre_tipo_devolucion_empresaInformesDevoluciones,this.informesdevolucionesConstantesFunciones.activarnombre_tipo_devolucion_empresaInformesDevoluciones,this,true,"nombre_tipo_devolucion_empresaInformesDevoluciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new InformesDevolucionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformesDevoluciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformesDevoluciones,InformesDevolucionesConstantesFunciones.LABEL_CANTIDAD));

		if(this.informesdevolucionesConstantesFunciones.mostrarcantidadInformesDevoluciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformesDevolucionesConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.informesdevolucionesConstantesFunciones.resaltarcantidadInformesDevoluciones,this.informesdevolucionesConstantesFunciones.activarcantidadInformesDevoluciones,this,true,"cantidadInformesDevoluciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.informesdevolucionesConstantesFunciones.resaltarcantidadInformesDevoluciones,this.informesdevolucionesConstantesFunciones.activarcantidadInformesDevoluciones,this,true,"cantidadInformesDevoluciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new InformesDevolucionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosInformesDevoluciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosInformesDevoluciones,InformesDevolucionesConstantesFunciones.LABEL_CODIGOPRODUCTO));

		if(this.informesdevolucionesConstantesFunciones.mostrarcodigo_productoInformesDevoluciones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,InformesDevolucionesConstantesFunciones.LABEL_CODIGOPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.informesdevolucionesConstantesFunciones.resaltarcodigo_productoInformesDevoluciones,this.informesdevolucionesConstantesFunciones.activarcodigo_productoInformesDevoluciones,this,true,"codigo_productoInformesDevoluciones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.informesdevolucionesConstantesFunciones.resaltarcodigo_productoInformesDevoluciones,this.informesdevolucionesConstantesFunciones.activarcodigo_productoInformesDevoluciones,this,true,"codigo_productoInformesDevoluciones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new InformesDevolucionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.informesdevolucionesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.informesdevolucionesSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.informesdevolucionesSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosInformesDevoluciones.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.informesdevolucionesSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.informesdevolucionesSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosInformesDevoluciones.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarInformesDevoluciones && this.isPermisoGuardarCambiosInformesDevoluciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.informesdevolucionesSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.informesdevolucionesSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosInformesDevoluciones.addColumn(tableColumn);
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
			
			this.jTableDatosInformesDevoluciones.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarInformesDevoluciones && this.isPermisoGuardarCambiosInformesDevoluciones) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarInformesDevoluciones && this.isPermisoGuardarCambiosInformesDevoluciones) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosInformesDevoluciones.moveColumn(this.jTableDatosInformesDevoluciones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosInformesDevoluciones.moveColumn(this.jTableDatosInformesDevoluciones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosInformesDevoluciones.moveColumn(this.jTableDatosInformesDevoluciones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosInformesDevoluciones.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosInformesDevoluciones.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosInformesDevoluciones,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!InformesDevolucionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosInformesDevoluciones.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosInformesDevoluciones.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!InformesDevolucionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!InformesDevolucionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosInformesDevoluciones.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosInformesDevoluciones.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosInformesDevoluciones.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=informesdevolucionesLogic.getInformesDevolucioness().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=informesdevolucioness.size()-1;
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
		//this.jTableDatosInformesDevoluciones.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosInformesDevoluciones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosInformesDevoluciones();
			
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
				
				//this.isEsNuevoInformesDevoluciones=false;
					
				InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
			
				if(this.informesdevolucionesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormInformesDevoluciones==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosInformesDevoluciones.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosInformesDevoluciones.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.informesdevoluciones.getsType().equals("DUPLICADO")
				   || this.informesdevoluciones.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoInformesDevoluciones=true;
				
				} else {
					this.isEsNuevoInformesDevoluciones=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {
					if(this.informesdevoluciones.getId()>=0 && !this.informesdevoluciones.getIsNew()) {						
						this.isEsNuevoInformesDevoluciones=false;
						
					} else {
						this.isEsNuevoInformesDevoluciones=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoInformesDevoluciones(esRelaciones);						
				
				this.seleccionarInformesDevoluciones(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.informesdevoluciones.getId()<0) {
					this.isEsNuevoInformesDevoluciones=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarInformesDevoluciones(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarInformesDevoluciones(evt,rowIndex);
				}	
				
				if(this.informesdevolucionesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion InformesDevoluciones: " + this.dDif); 
					}
				}								
				
				InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarInformesDevoluciones(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.informesdevoluciones)) {
					if(this.informesdevoluciones.getId()>0) {
						this.informesdevoluciones.setIsDeleted(true);
						
						this.informesdevolucionessEliminados.add(this.informesdevoluciones);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.informesdevolucionesLogic.getInformesDevolucioness().remove(this.informesdevoluciones);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.informesdevolucioness.remove(this.informesdevoluciones);				
					}
					
					
					((InformesDevolucionesModel) this.jTableDatosInformesDevoluciones.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaInformesDevoluciones(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarInformesDevoluciones(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoInformesDevoluciones) {
			
			if(this.jInternalFrameDetalleFormInformesDevoluciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosInformesDevoluciones.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosInformesDevoluciones.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(InformesDevolucionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioInformesDevoluciones(this.informesdevoluciones);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesInformesDevoluciones("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesInformesDevoluciones(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualInformesDevoluciones() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoInformesDevoluciones(InformesDevoluciones informesdevoluciones) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoInformesDevoluciones(informesdevoluciones,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoInformesDevoluciones(InformesDevoluciones informesdevoluciones,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioInformesDevoluciones(informesdevoluciones);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyInformesDevoluciones(informesdevoluciones,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyInformesDevoluciones(informesdevoluciones);
	}
	
	public void setVariablesObjetoActualToFormularioInformesDevoluciones(InformesDevoluciones informesdevoluciones) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormInformesDevoluciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormInformesDevoluciones.jLabelidInformesDevoluciones.setText(informesdevoluciones.getId().toString());
			this.jInternalFrameDetalleFormInformesDevoluciones.jTextFielduser_name_usuarioInformesDevoluciones.setText(informesdevoluciones.getuser_name_usuario());
			this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_completo_clienteInformesDevoluciones.setText(informesdevoluciones.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormInformesDevoluciones.jTextFieldnumero_pre_impresoInformesDevoluciones.setText(informesdevoluciones.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormInformesDevoluciones.jDateChooserfecha_emisionInformesDevoluciones.setDate(informesdevoluciones.getfecha_emision());
			this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_bodegaInformesDevoluciones.setText(informesdevoluciones.getnombre_bodega());
			this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_productoInformesDevoluciones.setText(informesdevoluciones.getnombre_producto());
			this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_tipo_devolucion_empresaInformesDevoluciones.setText(informesdevoluciones.getnombre_tipo_devolucion_empresa());
			this.jInternalFrameDetalleFormInformesDevoluciones.jTextFieldcantidadInformesDevoluciones.setText(informesdevoluciones.getcantidad().toString());
			this.jInternalFrameDetalleFormInformesDevoluciones.jTextFieldcodigo_productoInformesDevoluciones.setText(informesdevoluciones.getcodigo_producto());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,InformesDevoluciones informesdevolucionesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,informesdevolucionesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,InformesDevoluciones informesdevolucionesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				informesdevolucionesLocal=this.informesdevoluciones;
			} else {
				informesdevolucionesLocal=this.informesdevolucionesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(informesdevolucionesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoInformesDevoluciones(informesdevolucionesLocal,true);
					
					if(informesdevolucionesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(informesdevolucionesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(informesdevolucionesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoInformesDevoluciones(InformesDevoluciones informesdevoluciones,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualInformesDevoluciones(informesdevoluciones,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(informesdevoluciones);
	}
	
	public void setVariablesFormularioToObjetoActualInformesDevoluciones(InformesDevoluciones informesdevoluciones,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualInformesDevoluciones(informesdevoluciones,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualInformesDevoluciones(InformesDevoluciones informesdevoluciones,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormInformesDevoluciones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormInformesDevoluciones.jLabelidInformesDevoluciones.getText()==null || this.jInternalFrameDetalleFormInformesDevoluciones.jLabelidInformesDevoluciones.getText()=="" || this.jInternalFrameDetalleFormInformesDevoluciones.jLabelidInformesDevoluciones.getText()=="Id") {
				this.jInternalFrameDetalleFormInformesDevoluciones.jLabelidInformesDevoluciones.setText("0");
			}

			if(conColumnasBase) {informesdevoluciones.setId(Long.parseLong(this.jInternalFrameDetalleFormInformesDevoluciones.jLabelidInformesDevoluciones.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformesDevolucionesConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformesDevoluciones.jLabelIdInformesDevoluciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			informesdevoluciones.setuser_name_usuario(this.jInternalFrameDetalleFormInformesDevoluciones.jTextFielduser_name_usuarioInformesDevoluciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformesDevolucionesConstantesFunciones.LABEL_USERNAMEUSUARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformesDevoluciones.jLabeluser_name_usuarioInformesDevoluciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			informesdevoluciones.setnombre_completo_cliente(this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_completo_clienteInformesDevoluciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformesDevolucionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformesDevoluciones.jLabelnombre_completo_clienteInformesDevoluciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			informesdevoluciones.setnumero_pre_impreso(this.jInternalFrameDetalleFormInformesDevoluciones.jTextFieldnumero_pre_impresoInformesDevoluciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformesDevolucionesConstantesFunciones.LABEL_NUMEROPREIMPRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformesDevoluciones.jLabelnumero_pre_impresoInformesDevoluciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			informesdevoluciones.setfecha_emision(this.jInternalFrameDetalleFormInformesDevoluciones.jDateChooserfecha_emisionInformesDevoluciones.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformesDevoluciones.jLabelfecha_emisionInformesDevoluciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			informesdevoluciones.setnombre_bodega(this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_bodegaInformesDevoluciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformesDevolucionesConstantesFunciones.LABEL_NOMBREBODEGA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformesDevoluciones.jLabelnombre_bodegaInformesDevoluciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			informesdevoluciones.setnombre_producto(this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_productoInformesDevoluciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformesDevolucionesConstantesFunciones.LABEL_NOMBREPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformesDevoluciones.jLabelnombre_productoInformesDevoluciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			informesdevoluciones.setnombre_tipo_devolucion_empresa(this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_tipo_devolucion_empresaInformesDevoluciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformesDevolucionesConstantesFunciones.LABEL_NOMBRETIPODEVOLUCIONEMPRESA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformesDevoluciones.jLabelnombre_tipo_devolucion_empresaInformesDevoluciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			informesdevoluciones.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormInformesDevoluciones.jTextFieldcantidadInformesDevoluciones.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformesDevolucionesConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformesDevoluciones.jLabelcantidadInformesDevoluciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			informesdevoluciones.setcodigo_producto(this.jInternalFrameDetalleFormInformesDevoluciones.jTextFieldcodigo_productoInformesDevoluciones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+InformesDevolucionesConstantesFunciones.LABEL_CODIGOPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormInformesDevoluciones.jLabelcodigo_productoInformesDevoluciones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualInformesDevoluciones(InformesDevoluciones informesdevolucionesBean,InformesDevoluciones informesdevoluciones,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosInformesDevoluciones(InformesDevoluciones informesdevolucionesOrigen,InformesDevoluciones informesdevoluciones,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && informesdevolucionesOrigen.getId()!=null && !informesdevolucionesOrigen.getId().equals(0L))) {informesdevoluciones.setId(informesdevolucionesOrigen.getId());}}
			if(conDefault || (!conDefault && informesdevolucionesOrigen.getfecha_emision_desde()!=null && !informesdevolucionesOrigen.getfecha_emision_desde().equals(new Date()))) {informesdevoluciones.setfecha_emision_desde(informesdevolucionesOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && informesdevolucionesOrigen.getfecha_emision_hasta()!=null && !informesdevolucionesOrigen.getfecha_emision_hasta().equals(new Date()))) {informesdevoluciones.setfecha_emision_hasta(informesdevolucionesOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && informesdevolucionesOrigen.getuser_name_usuario()!=null && !informesdevolucionesOrigen.getuser_name_usuario().equals(""))) {informesdevoluciones.setuser_name_usuario(informesdevolucionesOrigen.getuser_name_usuario());}
			if(conDefault || (!conDefault && informesdevolucionesOrigen.getnombre_completo_cliente()!=null && !informesdevolucionesOrigen.getnombre_completo_cliente().equals(""))) {informesdevoluciones.setnombre_completo_cliente(informesdevolucionesOrigen.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && informesdevolucionesOrigen.getnumero_pre_impreso()!=null && !informesdevolucionesOrigen.getnumero_pre_impreso().equals(""))) {informesdevoluciones.setnumero_pre_impreso(informesdevolucionesOrigen.getnumero_pre_impreso());}
			if(conDefault || (!conDefault && informesdevolucionesOrigen.getfecha_emision()!=null && !informesdevolucionesOrigen.getfecha_emision().equals(new Date()))) {informesdevoluciones.setfecha_emision(informesdevolucionesOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && informesdevolucionesOrigen.getnombre_bodega()!=null && !informesdevolucionesOrigen.getnombre_bodega().equals(""))) {informesdevoluciones.setnombre_bodega(informesdevolucionesOrigen.getnombre_bodega());}
			if(conDefault || (!conDefault && informesdevolucionesOrigen.getnombre_producto()!=null && !informesdevolucionesOrigen.getnombre_producto().equals(""))) {informesdevoluciones.setnombre_producto(informesdevolucionesOrigen.getnombre_producto());}
			if(conDefault || (!conDefault && informesdevolucionesOrigen.getnombre_tipo_devolucion_empresa()!=null && !informesdevolucionesOrigen.getnombre_tipo_devolucion_empresa().equals(""))) {informesdevoluciones.setnombre_tipo_devolucion_empresa(informesdevolucionesOrigen.getnombre_tipo_devolucion_empresa());}
			if(conDefault || (!conDefault && informesdevolucionesOrigen.getcantidad()!=null && !informesdevolucionesOrigen.getcantidad().equals(0))) {informesdevoluciones.setcantidad(informesdevolucionesOrigen.getcantidad());}
			if(conDefault || (!conDefault && informesdevolucionesOrigen.getcodigo_producto()!=null && !informesdevolucionesOrigen.getcodigo_producto().equals(""))) {informesdevoluciones.setcodigo_producto(informesdevolucionesOrigen.getcodigo_producto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioInformesDevoluciones(InformesDevoluciones informesdevoluciones) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormInformesDevoluciones.jLabelidInformesDevoluciones.setText(informesdevoluciones.getId().toString());
			this.jInternalFrameDetalleFormInformesDevoluciones.jTextFielduser_name_usuarioInformesDevoluciones.setText(informesdevoluciones.getuser_name_usuario());
			this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_completo_clienteInformesDevoluciones.setText(informesdevoluciones.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormInformesDevoluciones.jTextFieldnumero_pre_impresoInformesDevoluciones.setText(informesdevoluciones.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormInformesDevoluciones.jDateChooserfecha_emisionInformesDevoluciones.setDate(informesdevoluciones.getfecha_emision());
			this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_bodegaInformesDevoluciones.setText(informesdevoluciones.getnombre_bodega());
			this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_productoInformesDevoluciones.setText(informesdevoluciones.getnombre_producto());
			this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_tipo_devolucion_empresaInformesDevoluciones.setText(informesdevoluciones.getnombre_tipo_devolucion_empresa());
			this.jInternalFrameDetalleFormInformesDevoluciones.jTextFieldcantidadInformesDevoluciones.setText(informesdevoluciones.getcantidad().toString());
			this.jInternalFrameDetalleFormInformesDevoluciones.jTextFieldcodigo_productoInformesDevoluciones.setText(informesdevoluciones.getcodigo_producto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioInformesDevoluciones(InformesDevolucionesBean informesdevolucionesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormInformesDevoluciones.jLabelidInformesDevoluciones.setText(informesdevolucionesBean.getId().toString());
			this.jInternalFrameDetalleFormInformesDevoluciones.jTextFielduser_name_usuarioInformesDevoluciones.setText(informesdevolucionesBean.getuser_name_usuario());
			this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_completo_clienteInformesDevoluciones.setText(informesdevolucionesBean.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormInformesDevoluciones.jTextFieldnumero_pre_impresoInformesDevoluciones.setText(informesdevolucionesBean.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormInformesDevoluciones.jDateChooserfecha_emisionInformesDevoluciones.setDate(informesdevolucionesBean.getfecha_emision());
			this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_bodegaInformesDevoluciones.setText(informesdevolucionesBean.getnombre_bodega());
			this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_productoInformesDevoluciones.setText(informesdevolucionesBean.getnombre_producto());
			this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_tipo_devolucion_empresaInformesDevoluciones.setText(informesdevolucionesBean.getnombre_tipo_devolucion_empresa());
			this.jInternalFrameDetalleFormInformesDevoluciones.jTextFieldcantidadInformesDevoluciones.setText(informesdevolucionesBean.getcantidad().toString());
			this.jInternalFrameDetalleFormInformesDevoluciones.jTextFieldcodigo_productoInformesDevoluciones.setText(informesdevolucionesBean.getcodigo_producto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanInformesDevoluciones(InformesDevolucionesParameterReturnGeneral informesdevolucionesReturnGeneral,InformesDevolucionesBean informesdevolucionesBean,Boolean conDefault) throws Exception { 
		try {
			InformesDevoluciones informesdevolucionesLocal=new InformesDevoluciones();
			
			informesdevolucionesLocal=informesdevolucionesReturnGeneral.getInformesDevoluciones();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && informesdevolucionesLocal.getId()!=null && !informesdevolucionesLocal.getId().equals(0L))) {informesdevolucionesBean.setId(informesdevolucionesLocal.getId());}}
			if(conDefault || (!conDefault && informesdevolucionesLocal.getuser_name_usuario()!=null && !informesdevolucionesLocal.getuser_name_usuario().equals(""))) {informesdevolucionesBean.setuser_name_usuario(informesdevolucionesLocal.getuser_name_usuario());}
			if(conDefault || (!conDefault && informesdevolucionesLocal.getnombre_completo_cliente()!=null && !informesdevolucionesLocal.getnombre_completo_cliente().equals(""))) {informesdevolucionesBean.setnombre_completo_cliente(informesdevolucionesLocal.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && informesdevolucionesLocal.getnumero_pre_impreso()!=null && !informesdevolucionesLocal.getnumero_pre_impreso().equals(""))) {informesdevolucionesBean.setnumero_pre_impreso(informesdevolucionesLocal.getnumero_pre_impreso());}
			if(conDefault || (!conDefault && informesdevolucionesLocal.getfecha_emision()!=null && !informesdevolucionesLocal.getfecha_emision().equals(new Date()))) {informesdevolucionesBean.setfecha_emision(informesdevolucionesLocal.getfecha_emision());}
			if(conDefault || (!conDefault && informesdevolucionesLocal.getnombre_bodega()!=null && !informesdevolucionesLocal.getnombre_bodega().equals(""))) {informesdevolucionesBean.setnombre_bodega(informesdevolucionesLocal.getnombre_bodega());}
			if(conDefault || (!conDefault && informesdevolucionesLocal.getnombre_producto()!=null && !informesdevolucionesLocal.getnombre_producto().equals(""))) {informesdevolucionesBean.setnombre_producto(informesdevolucionesLocal.getnombre_producto());}
			if(conDefault || (!conDefault && informesdevolucionesLocal.getnombre_tipo_devolucion_empresa()!=null && !informesdevolucionesLocal.getnombre_tipo_devolucion_empresa().equals(""))) {informesdevolucionesBean.setnombre_tipo_devolucion_empresa(informesdevolucionesLocal.getnombre_tipo_devolucion_empresa());}
			if(conDefault || (!conDefault && informesdevolucionesLocal.getcantidad()!=null && !informesdevolucionesLocal.getcantidad().equals(0))) {informesdevolucionesBean.setcantidad(informesdevolucionesLocal.getcantidad());}
			if(conDefault || (!conDefault && informesdevolucionesLocal.getcodigo_producto()!=null && !informesdevolucionesLocal.getcodigo_producto().equals(""))) {informesdevolucionesBean.setcodigo_producto(informesdevolucionesLocal.getcodigo_producto());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxInformesDevolucionesGenerico(Long idInformesDevolucionesSeleccionado,JComboBox jComboBoxInformesDevoluciones,List<InformesDevoluciones> informesdevolucionessLocal)throws Exception {
		try {
			InformesDevoluciones  informesdevolucionesTemp=null;

			for(InformesDevoluciones informesdevolucionesAux:informesdevolucionessLocal) {
				if(informesdevolucionesAux.getId()!=null && informesdevolucionesAux.getId().equals(idInformesDevolucionesSeleccionado)) {
					informesdevolucionesTemp=informesdevolucionesAux;
					break;
				}
			}

			jComboBoxInformesDevoluciones.setSelectedItem(informesdevolucionesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxInformesDevolucionesGenerico(JComboBox jComboBoxInformesDevoluciones,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxInformesDevoluciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxInformesDevoluciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxInformesDevoluciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxInformesDevoluciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxInformesDevoluciones.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxInformesDevoluciones.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxInformesDevoluciones.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxInformesDevoluciones.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxInformesDevoluciones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxInformesDevoluciones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			informesdevoluciones=(InformesDevoluciones) informesdevolucionesLogic.getInformesDevolucioness().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			informesdevoluciones =(InformesDevoluciones) informesdevolucioness.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!informesdevoluciones.getIsNew() && !informesdevoluciones.getIsChanged() && !informesdevoluciones.getIsDeleted()) {
				sDescripcion=informesdevoluciones.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=informesdevoluciones.getproducto_descripcion();
			}
		}

		if(sTipo.equals("TipoDevolucionEmpresa")) {
			//sDescripcion=this.getActualTipoDevolucionEmpresaForeignKeyDescripcion((Long)value);
			if(!informesdevoluciones.getIsNew() && !informesdevoluciones.getIsChanged() && !informesdevoluciones.getIsDeleted()) {
				sDescripcion=informesdevoluciones.gettipodevolucionempresa_descripcion();
			} else {
				//sDescripcion=this.getActualTipoDevolucionEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=informesdevoluciones.gettipodevolucionempresa_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!informesdevoluciones.getIsNew() && !informesdevoluciones.getIsChanged() && !informesdevoluciones.getIsDeleted()) {
				sDescripcion=informesdevoluciones.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=informesdevoluciones.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!informesdevoluciones.getIsNew() && !informesdevoluciones.getIsChanged() && !informesdevoluciones.getIsDeleted()) {
				sDescripcion=informesdevoluciones.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=informesdevoluciones.getsucursal_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		InformesDevoluciones informesdevolucionesRow=new InformesDevoluciones();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			informesdevolucionesRow=(InformesDevoluciones) informesdevolucionesLogic.getInformesDevolucioness().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			informesdevolucionesRow=(InformesDevoluciones) informesdevolucioness.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualInformesDevoluciones(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoInformesDevoluciones.setVisible((this.isVisibilidadCeldaNuevoInformesDevoluciones && this.isPermisoNuevoInformesDevoluciones));			
			this.jButtonDuplicarInformesDevoluciones.setVisible((this.isVisibilidadCeldaDuplicarInformesDevoluciones && this.isPermisoDuplicarInformesDevoluciones));			
			this.jButtonCopiarInformesDevoluciones.setVisible((this.isVisibilidadCeldaCopiarInformesDevoluciones && this.isPermisoCopiarInformesDevoluciones));
			this.jButtonVerFormInformesDevoluciones.setVisible((this.isVisibilidadCeldaVerFormInformesDevoluciones && this.isPermisoVerFormInformesDevoluciones));
			
			this.jButtonAbrirOrderByInformesDevoluciones.setVisible((this.isVisibilidadCeldaOrdenInformesDevoluciones && this.isPermisoOrdenInformesDevoluciones));			
			
			this.jButtonNuevoRelacionesInformesDevoluciones.setVisible((this.isVisibilidadCeldaNuevoRelacionesInformesDevoluciones && this.isPermisoNuevoInformesDevoluciones));			
			this.jButtonNuevoGuardarCambiosInformesDevoluciones.setVisible((this.isVisibilidadCeldaNuevoInformesDevoluciones && this.isPermisoNuevoInformesDevoluciones && this.isPermisoGuardarCambiosInformesDevoluciones));
			
			if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
			this.jInternalFrameDetalleFormInformesDevoluciones.jButtonModificarInformesDevoluciones.setVisible((this.isVisibilidadCeldaModificarInformesDevoluciones && this.isPermisoActualizarInformesDevoluciones));	
			this.jInternalFrameDetalleFormInformesDevoluciones.jButtonActualizarInformesDevoluciones.setVisible((this.isVisibilidadCeldaActualizarInformesDevoluciones && this.isPermisoActualizarInformesDevoluciones));	
			this.jInternalFrameDetalleFormInformesDevoluciones.jButtonEliminarInformesDevoluciones.setVisible((this.isVisibilidadCeldaEliminarInformesDevoluciones && this.isPermisoEliminarInformesDevoluciones));
			this.jInternalFrameDetalleFormInformesDevoluciones.jButtonCancelarInformesDevoluciones.setVisible(this.isVisibilidadCeldaCancelarInformesDevoluciones);							
			this.jInternalFrameDetalleFormInformesDevoluciones.jButtonGuardarCambiosInformesDevoluciones.setVisible((this.isVisibilidadCeldaGuardarInformesDevoluciones && this.isPermisoGuardarCambiosInformesDevoluciones));			
			
			}
						
			this.jButtonGuardarCambiosTablaInformesDevoluciones.setVisible((this.isVisibilidadCeldaGuardarCambiosInformesDevoluciones && this.isPermisoGuardarCambiosInformesDevoluciones));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarInformesDevoluciones.setVisible((this.isVisibilidadCeldaNuevoInformesDevoluciones && this.isPermisoNuevoInformesDevoluciones));						
			this.jButtonDuplicarToolBarInformesDevoluciones.setVisible((this.isVisibilidadCeldaDuplicarInformesDevoluciones && this.isPermisoDuplicarInformesDevoluciones));						
			this.jButtonCopiarToolBarInformesDevoluciones.setVisible((this.isVisibilidadCeldaCopiarInformesDevoluciones && this.isPermisoCopiarInformesDevoluciones));			
			this.jButtonVerFormToolBarInformesDevoluciones.setVisible((this.isVisibilidadCeldaVerFormInformesDevoluciones && this.isPermisoVerFormInformesDevoluciones));			
			this.jButtonAbrirOrderByToolBarInformesDevoluciones.setVisible((this.isVisibilidadCeldaOrdenInformesDevoluciones && this.isPermisoOrdenInformesDevoluciones));
			this.jButtonNuevoRelacionesToolBarInformesDevoluciones.setVisible((this.isVisibilidadCeldaNuevoRelacionesInformesDevoluciones && this.isPermisoNuevoInformesDevoluciones));			
			this.jButtonNuevoGuardarCambiosToolBarInformesDevoluciones.setVisible((this.isVisibilidadCeldaNuevoInformesDevoluciones && this.isPermisoNuevoInformesDevoluciones && this.isPermisoGuardarCambiosInformesDevoluciones));			
			
			if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
			this.jInternalFrameDetalleFormInformesDevoluciones.jButtonModificarToolBarInformesDevoluciones.setVisible((this.isVisibilidadCeldaModificarInformesDevoluciones && this.isPermisoActualizarInformesDevoluciones));	
			this.jInternalFrameDetalleFormInformesDevoluciones.jButtonActualizarToolBarInformesDevoluciones.setVisible((this.isVisibilidadCeldaActualizarInformesDevoluciones  && this.isPermisoActualizarInformesDevoluciones));	
			this.jInternalFrameDetalleFormInformesDevoluciones.jButtonEliminarToolBarInformesDevoluciones.setVisible((this.isVisibilidadCeldaEliminarInformesDevoluciones && this.isPermisoEliminarInformesDevoluciones));
			this.jInternalFrameDetalleFormInformesDevoluciones.jButtonCancelarToolBarInformesDevoluciones.setVisible(this.isVisibilidadCeldaCancelarInformesDevoluciones);				
			this.jInternalFrameDetalleFormInformesDevoluciones.jButtonGuardarCambiosToolBarInformesDevoluciones.setVisible((this.isVisibilidadCeldaGuardarInformesDevoluciones && this.isPermisoGuardarCambiosInformesDevoluciones));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarInformesDevoluciones.setVisible((this.isVisibilidadCeldaGuardarCambiosInformesDevoluciones && this.isPermisoGuardarCambiosInformesDevoluciones));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoInformesDevoluciones.setVisible((this.isVisibilidadCeldaNuevoInformesDevoluciones && this.isPermisoNuevoInformesDevoluciones));			
			this.jMenuItemDuplicarInformesDevoluciones.setVisible((this.isVisibilidadCeldaDuplicarInformesDevoluciones && this.isPermisoDuplicarInformesDevoluciones));			
			this.jMenuItemCopiarInformesDevoluciones.setVisible((this.isVisibilidadCeldaCopiarInformesDevoluciones && this.isPermisoCopiarInformesDevoluciones));			
			this.jMenuItemVerFormInformesDevoluciones.setVisible((this.isVisibilidadCeldaVerFormInformesDevoluciones && this.isPermisoVerFormInformesDevoluciones));			
			this.jMenuItemAbrirOrderByInformesDevoluciones.setVisible((this.isVisibilidadCeldaOrdenInformesDevoluciones && this.isPermisoOrdenInformesDevoluciones));			
			//this.jMenuItemMostrarOcultarInformesDevoluciones.setVisible((this.isVisibilidadCeldaOrdenInformesDevoluciones && this.isPermisoOrdenInformesDevoluciones));
			this.jMenuItemDetalleAbrirOrderByInformesDevoluciones.setVisible((this.isVisibilidadCeldaOrdenInformesDevoluciones && this.isPermisoOrdenInformesDevoluciones));			
			//this.jMenuItemDetalleMostrarOcultarInformesDevoluciones.setVisible((this.isVisibilidadCeldaOrdenInformesDevoluciones && this.isPermisoOrdenInformesDevoluciones));			
			this.jMenuItemNuevoRelacionesInformesDevoluciones.setVisible((this.isVisibilidadCeldaNuevoRelacionesInformesDevoluciones && this.isPermisoNuevoInformesDevoluciones));			
			this.jMenuItemNuevoGuardarCambiosInformesDevoluciones.setVisible((this.isVisibilidadCeldaNuevoInformesDevoluciones && this.isPermisoNuevoInformesDevoluciones && this.isPermisoGuardarCambiosInformesDevoluciones));									
			
			if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
			this.jInternalFrameDetalleFormInformesDevoluciones.jMenuItemModificarInformesDevoluciones.setVisible((this.isVisibilidadCeldaModificarInformesDevoluciones && this.isPermisoActualizarInformesDevoluciones));	
			this.jInternalFrameDetalleFormInformesDevoluciones.jMenuItemActualizarInformesDevoluciones.setVisible((this.isVisibilidadCeldaActualizarInformesDevoluciones && this.isPermisoActualizarInformesDevoluciones));	
			this.jInternalFrameDetalleFormInformesDevoluciones.jMenuItemEliminarInformesDevoluciones.setVisible((this.isVisibilidadCeldaEliminarInformesDevoluciones && this.isPermisoEliminarInformesDevoluciones));
			this.jInternalFrameDetalleFormInformesDevoluciones.jMenuItemCancelarInformesDevoluciones.setVisible(this.isVisibilidadCeldaCancelarInformesDevoluciones);				
			}
			
			this.jMenuItemGuardarCambiosInformesDevoluciones.setVisible((this.isVisibilidadCeldaGuardarInformesDevoluciones && this.isPermisoGuardarCambiosInformesDevoluciones));						
			this.jMenuItemGuardarCambiosTablaInformesDevoluciones.setVisible((this.isVisibilidadCeldaGuardarCambiosInformesDevoluciones && this.isPermisoGuardarCambiosInformesDevoluciones));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoInformesDevoluciones=this.jButtonNuevoInformesDevoluciones.isVisible();
			this.isVisibilidadCeldaDuplicarInformesDevoluciones=this.jButtonDuplicarInformesDevoluciones.isVisible();
			this.isVisibilidadCeldaCopiarInformesDevoluciones=this.jButtonCopiarInformesDevoluciones.isVisible();
			this.isVisibilidadCeldaVerFormInformesDevoluciones=this.jButtonVerFormInformesDevoluciones.isVisible();
			
			this.isVisibilidadCeldaOrdenInformesDevoluciones=this.jButtonAbrirOrderByInformesDevoluciones.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesInformesDevoluciones=this.jButtonNuevoRelacionesInformesDevoluciones.isVisible();
			this.isVisibilidadCeldaModificarInformesDevoluciones=this.jButtonModificarInformesDevoluciones.isVisible();
			
			if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
			this.isVisibilidadCeldaActualizarInformesDevoluciones=this.jInternalFrameDetalleFormInformesDevoluciones.jButtonActualizarInformesDevoluciones.isVisible();
			this.isVisibilidadCeldaEliminarInformesDevoluciones=this.jInternalFrameDetalleFormInformesDevoluciones.jButtonEliminarInformesDevoluciones.isVisible();
			this.isVisibilidadCeldaCancelarInformesDevoluciones=this.jInternalFrameDetalleFormInformesDevoluciones.jButtonCancelarInformesDevoluciones.isVisible();
			this.isVisibilidadCeldaGuardarInformesDevoluciones=this.jInternalFrameDetalleFormInformesDevoluciones.jButtonGuardarCambiosInformesDevoluciones.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosInformesDevoluciones=this.jButtonGuardarCambiosTablaInformesDevoluciones.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoInformesDevoluciones=this.jButtonNuevoToolBarInformesDevoluciones.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesInformesDevoluciones=this.jButtonNuevoRelacionesToolBarInformesDevoluciones.isVisible();
			
			if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
			this.isVisibilidadCeldaModificarInformesDevoluciones=this.jInternalFrameDetalleFormInformesDevoluciones.jButtonModificarToolBarInformesDevoluciones.isVisible();
			this.isVisibilidadCeldaActualizarInformesDevoluciones=this.jInternalFrameDetalleFormInformesDevoluciones.jButtonActualizarToolBarInformesDevoluciones.isVisible();
			this.isVisibilidadCeldaEliminarInformesDevoluciones=this.jInternalFrameDetalleFormInformesDevoluciones.jButtonEliminarToolBarInformesDevoluciones.isVisible();
			this.isVisibilidadCeldaCancelarInformesDevoluciones=this.jInternalFrameDetalleFormInformesDevoluciones.jButtonCancelarToolBarInformesDevoluciones.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarInformesDevoluciones=this.jButtonGuardarCambiosToolBarInformesDevoluciones.isVisible();
			this.isVisibilidadCeldaGuardarCambiosInformesDevoluciones=this.jButtonGuardarCambiosTablaToolBarInformesDevoluciones.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoInformesDevoluciones=this.jMenuItemNuevoInformesDevoluciones.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesInformesDevoluciones=this.jMenuItemNuevoRelacionesInformesDevoluciones.isVisible();
			
			if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
			this.isVisibilidadCeldaModificarInformesDevoluciones=this.jInternalFrameDetalleFormInformesDevoluciones.jMenuItemModificarInformesDevoluciones.isVisible();
			this.isVisibilidadCeldaActualizarInformesDevoluciones=this.jInternalFrameDetalleFormInformesDevoluciones.jMenuItemActualizarInformesDevoluciones.isVisible();
			this.isVisibilidadCeldaEliminarInformesDevoluciones=this.jInternalFrameDetalleFormInformesDevoluciones.jMenuItemEliminarInformesDevoluciones.isVisible();
			this.isVisibilidadCeldaCancelarInformesDevoluciones=this.jInternalFrameDetalleFormInformesDevoluciones.jMenuItemCancelarInformesDevoluciones.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarInformesDevoluciones=this.jMenuItemGuardarCambiosInformesDevoluciones.isVisible();
			this.isVisibilidadCeldaGuardarCambiosInformesDevoluciones=this.jMenuItemGuardarCambiosTablaInformesDevoluciones.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesInformesDevoluciones(Boolean esInicializar) {
		if(InformesDevolucionesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.informesdevolucionesSessionBean.getConGuardarRelaciones()) {
				//if(this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesInformesDevoluciones();
			}
			
			this.inicializarActualizarBindingBotonesManualInformesDevoluciones(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualInformesDevoluciones() {
		this.jButtonNuevoInformesDevoluciones.setVisible(this.isPermisoNuevoInformesDevoluciones);			
		this.jButtonDuplicarInformesDevoluciones.setVisible(this.isPermisoDuplicarInformesDevoluciones);			
		this.jButtonCopiarInformesDevoluciones.setVisible(this.isPermisoCopiarInformesDevoluciones);			
		this.jButtonVerFormInformesDevoluciones.setVisible(this.isPermisoVerFormInformesDevoluciones);			
		
		this.jButtonAbrirOrderByInformesDevoluciones.setVisible(this.isPermisoOrdenInformesDevoluciones);					
		
		this.jButtonNuevoRelacionesInformesDevoluciones.setVisible(this.isPermisoNuevoInformesDevoluciones);			
		
		if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformesDevoluciones.jButtonModificarInformesDevoluciones.setVisible(this.isPermisoActualizarInformesDevoluciones);	
			this.jInternalFrameDetalleFormInformesDevoluciones.jButtonActualizarInformesDevoluciones.setVisible(this.isPermisoActualizarInformesDevoluciones);	
			this.jInternalFrameDetalleFormInformesDevoluciones.jButtonEliminarInformesDevoluciones.setVisible(this.isPermisoEliminarInformesDevoluciones);
			this.jInternalFrameDetalleFormInformesDevoluciones.jButtonCancelarInformesDevoluciones.setVisible(this.isVisibilidadCeldaCancelarInformesDevoluciones);						
			this.jInternalFrameDetalleFormInformesDevoluciones.jButtonGuardarCambiosInformesDevoluciones.setVisible(this.isPermisoGuardarCambiosInformesDevoluciones);							
		}
		
		this.jButtonGuardarCambiosTablaInformesDevoluciones.setVisible(this.isPermisoActualizarInformesDevoluciones);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleInformesDevoluciones() {
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonModificarInformesDevoluciones.setVisible(this.isPermisoActualizarInformesDevoluciones);	
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonActualizarInformesDevoluciones.setVisible(this.isPermisoActualizarInformesDevoluciones);	
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonEliminarInformesDevoluciones.setVisible(this.isPermisoEliminarInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonCancelarInformesDevoluciones.setVisible(this.isVisibilidadCeldaCancelarInformesDevoluciones);							
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonGuardarCambiosInformesDevoluciones.setVisible((this.isVisibilidadCeldaGuardarInformesDevoluciones && this.isPermisoGuardarCambiosInformesDevoluciones));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosInformesDevoluciones() {
		if(InformesDevolucionesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualInformesDevoluciones();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesInformesDevoluciones() {
	}
	
	public void jTableDatosInformesDevolucionesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarInformesDevoluciones(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidInformesDevolucionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.getinformesdevoluciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informesdevoluciones==null) {
						this.informesdevoluciones = new InformesDevoluciones();
					}

					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.informesdevoluciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
				}

				if(this.informesdevoluciones.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.informesdevoluciones.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformesDevoluciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoInformesDevolucionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebInformesDevoluciones(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosInformesDevoluciones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosInformesDevoluciones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.getinformesdevoluciones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.informesdevolucionesLogic.getConnexion());

				if(this.informesdevoluciones.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.informesdevoluciones.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderInformesDevoluciones=(TitledBorder)this.jScrollPanelDatosInformesDevoluciones.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderInformesDevoluciones.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoInformesDevolucionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.getinformesdevoluciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informesdevoluciones==null) {
						this.informesdevoluciones = new InformesDevoluciones();
					}

					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.informesdevoluciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
				}

				if(this.informesdevoluciones.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.informesdevoluciones.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformesDevoluciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_devolucion_empresaInformesDevolucionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipodevolucionempresa=true;

			idTienePermisotipodevolucionempresa=this.tienePermisosUsuarioEnPaginaWebInformesDevoluciones(TipoDevolucionEmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisotipodevolucionempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosInformesDevoluciones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosInformesDevoluciones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.getinformesdevoluciones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);

				this.tipodevolucionempresaBeanSwingJInternalFrame=new TipoDevolucionEmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipodevolucionempresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipodevolucionempresaBeanSwingJInternalFrame.getTipoDevolucionEmpresaLogic().setConnexion(this.informesdevolucionesLogic.getConnexion());

				if(this.informesdevoluciones.getid_tipo_devolucion_empresa()!=null) {
					this.tipodevolucionempresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipodevolucionempresaBeanSwingJInternalFrame.setIdActual(this.informesdevoluciones.getid_tipo_devolucion_empresa());
					this.tipodevolucionempresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipodevolucionempresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipodevolucionempresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoDevolucionEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.tipodevolucionempresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderInformesDevoluciones=(TitledBorder)this.jScrollPanelDatosInformesDevoluciones.getBorder();
				TitledBorder titledBordertipodevolucionempresa=(TitledBorder)this.tipodevolucionempresaBeanSwingJInternalFrame.jScrollPanelDatosTipoDevolucionEmpresa.getBorder();

				titledBordertipodevolucionempresa.setTitle(titledBorderInformesDevoluciones.getTitle() + " -> TIPODEVOLUCIONEMPRESA");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_devolucion_empresaInformesDevolucionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.getinformesdevoluciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informesdevoluciones==null) {
						this.informesdevoluciones = new InformesDevoluciones();
					}

					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.informesdevoluciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
				}

				if(this.informesdevoluciones.getid_tipo_devolucion_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_devolucion_empresa = "+this.informesdevoluciones.getid_tipo_devolucion_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformesDevoluciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaInformesDevolucionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebInformesDevoluciones(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosInformesDevoluciones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosInformesDevoluciones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.getinformesdevoluciones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.informesdevolucionesLogic.getConnexion());

				if(this.informesdevoluciones.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.informesdevoluciones.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderInformesDevoluciones=(TitledBorder)this.jScrollPanelDatosInformesDevoluciones.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderInformesDevoluciones.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaInformesDevolucionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.getinformesdevoluciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informesdevoluciones==null) {
						this.informesdevoluciones = new InformesDevoluciones();
					}

					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.informesdevoluciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
				}

				if(this.informesdevoluciones.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.informesdevoluciones.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformesDevoluciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalInformesDevolucionesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebInformesDevoluciones(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosInformesDevoluciones.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosInformesDevoluciones.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.getinformesdevoluciones(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.informesdevolucionesLogic.getConnexion());

				if(this.informesdevoluciones.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.informesdevoluciones.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderInformesDevoluciones=(TitledBorder)this.jScrollPanelDatosInformesDevoluciones.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderInformesDevoluciones.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalInformesDevolucionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.getinformesdevoluciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informesdevoluciones==null) {
						this.informesdevoluciones = new InformesDevoluciones();
					}

					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.informesdevoluciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
				}

				if(this.informesdevoluciones.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.informesdevoluciones.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformesDevoluciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeInformesDevolucionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.getinformesdevoluciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informesdevoluciones==null) {
						this.informesdevoluciones = new InformesDevoluciones();
					}

					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.informesdevoluciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
				}

				if(this.informesdevoluciones.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.informesdevoluciones.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformesDevoluciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaInformesDevolucionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.getinformesdevoluciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informesdevoluciones==null) {
						this.informesdevoluciones = new InformesDevoluciones();
					}

					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.informesdevoluciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
				}

				if(this.informesdevoluciones.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.informesdevoluciones.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformesDevoluciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonuser_name_usuarioInformesDevolucionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.getinformesdevoluciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informesdevoluciones==null) {
						this.informesdevoluciones = new InformesDevoluciones();
					}

					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.informesdevoluciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
				}

				if(this.informesdevoluciones.getuser_name_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where user_name_usuario like '%"+this.informesdevoluciones.getuser_name_usuario()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformesDevoluciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completo_clienteInformesDevolucionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.getinformesdevoluciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informesdevoluciones==null) {
						this.informesdevoluciones = new InformesDevoluciones();
					}

					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.informesdevoluciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
				}

				if(this.informesdevoluciones.getnombre_completo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo_cliente like '%"+this.informesdevoluciones.getnombre_completo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformesDevoluciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_pre_impresoInformesDevolucionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.getinformesdevoluciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informesdevoluciones==null) {
						this.informesdevoluciones = new InformesDevoluciones();
					}

					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.informesdevoluciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
				}

				if(this.informesdevoluciones.getnumero_pre_impreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_pre_impreso like '%"+this.informesdevoluciones.getnumero_pre_impreso()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformesDevoluciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionInformesDevolucionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.getinformesdevoluciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informesdevoluciones==null) {
						this.informesdevoluciones = new InformesDevoluciones();
					}

					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.informesdevoluciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
				}

				if(this.informesdevoluciones.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.informesdevoluciones.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformesDevoluciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_bodegaInformesDevolucionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.getinformesdevoluciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informesdevoluciones==null) {
						this.informesdevoluciones = new InformesDevoluciones();
					}

					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.informesdevoluciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
				}

				if(this.informesdevoluciones.getnombre_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_bodega like '%"+this.informesdevoluciones.getnombre_bodega()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformesDevoluciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_productoInformesDevolucionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.getinformesdevoluciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informesdevoluciones==null) {
						this.informesdevoluciones = new InformesDevoluciones();
					}

					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.informesdevoluciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
				}

				if(this.informesdevoluciones.getnombre_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_producto like '%"+this.informesdevoluciones.getnombre_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformesDevoluciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_tipo_devolucion_empresaInformesDevolucionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.getinformesdevoluciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informesdevoluciones==null) {
						this.informesdevoluciones = new InformesDevoluciones();
					}

					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.informesdevoluciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
				}

				if(this.informesdevoluciones.getnombre_tipo_devolucion_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_tipo_devolucion_empresa like '%"+this.informesdevoluciones.getnombre_tipo_devolucion_empresa()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformesDevoluciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadInformesDevolucionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.getinformesdevoluciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informesdevoluciones==null) {
						this.informesdevoluciones = new InformesDevoluciones();
					}

					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.informesdevoluciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
				}

				if(this.informesdevoluciones.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.informesdevoluciones.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformesDevoluciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_productoInformesDevolucionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.getinformesdevoluciones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.informesdevoluciones==null) {
						this.informesdevoluciones = new InformesDevoluciones();
					}

					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.informesdevoluciones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);
				}

				if(this.informesdevoluciones.getcodigo_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_producto like '%"+this.informesdevoluciones.getcodigo_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingInformesDevoluciones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaInformesDevolucionesInformesDevolucionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingInformesDevoluciones(false,false);

			this.getInformesDevolucionessBusquedaInformesDevoluciones();

			this.inicializarActualizarBindingInformesDevoluciones(false);

			//if(InformesDevolucionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingInformesDevoluciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaInformesDevolucionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingInformesDevoluciones(false,false);

			this.getInformesDevolucionessFK_IdEmpresa();

			this.inicializarActualizarBindingInformesDevoluciones(false);

			//if(InformesDevolucionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingInformesDevoluciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoInformesDevolucionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingInformesDevoluciones(false,false);

			this.getInformesDevolucionessFK_IdProducto();

			this.inicializarActualizarBindingInformesDevoluciones(false);

			//if(InformesDevolucionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingInformesDevoluciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalInformesDevolucionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingInformesDevoluciones(false,false);

			this.getInformesDevolucionessFK_IdSucursal();

			this.inicializarActualizarBindingInformesDevoluciones(false);

			//if(InformesDevolucionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingInformesDevoluciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoDevolucionEmpresaInformesDevolucionesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingInformesDevoluciones(false,false);

			this.getInformesDevolucionessFK_IdTipoDevolucionEmpresa();

			this.inicializarActualizarBindingInformesDevoluciones(false);

			//if(InformesDevolucionesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingInformesDevoluciones(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.informesdevolucionesLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameInformesDevoluciones() {
		if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
			this.jInternalFrameDetalleFormInformesDevoluciones.setVisible(false);	    			
			this.jInternalFrameDetalleFormInformesDevoluciones.dispose();
			this.jInternalFrameDetalleFormInformesDevoluciones=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoInformesDevoluciones!=null) {
			this.jInternalFrameReporteDinamicoInformesDevoluciones.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoInformesDevoluciones.dispose();
			this.jInternalFrameReporteDinamicoInformesDevoluciones=null;
		}
		
		if(this.jInternalFrameImportacionInformesDevoluciones!=null) {
			this.jInternalFrameImportacionInformesDevoluciones.setVisible(false);	    			
			this.jInternalFrameImportacionInformesDevoluciones.dispose();
			this.jInternalFrameImportacionInformesDevoluciones=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessInformesDevoluciones();
			
			InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
			
			
			if(sTipo.equals("NuevoInformesDevoluciones")) {
				jButtonNuevoInformesDevolucionesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarInformesDevoluciones")) {
				jButtonDuplicarInformesDevolucionesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarInformesDevoluciones")) {
				jButtonCopiarInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("VerFormInformesDevoluciones")) {
				jButtonVerFormInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarInformesDevoluciones")) {
				jButtonNuevoInformesDevolucionesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarInformesDevoluciones")) {
				jButtonDuplicarInformesDevolucionesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoInformesDevoluciones")) {
				jButtonNuevoInformesDevolucionesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarInformesDevoluciones")) {
				jButtonDuplicarInformesDevolucionesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesInformesDevoluciones")) {
				jButtonNuevoInformesDevolucionesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarInformesDevoluciones")) {
				jButtonNuevoInformesDevolucionesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesInformesDevoluciones")) {
				jButtonNuevoInformesDevolucionesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarInformesDevoluciones")) {
				jButtonModificarInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarInformesDevoluciones")) {
				jButtonModificarInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarInformesDevoluciones")) {
				jButtonModificarInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarInformesDevoluciones")) {
				jButtonActualizarInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarInformesDevoluciones")) {
				jButtonActualizarInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarInformesDevoluciones")) {
				jButtonActualizarInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("EliminarInformesDevoluciones")) {
				jButtonEliminarInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarInformesDevoluciones")) {
				jButtonEliminarInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarInformesDevoluciones")) {
				jButtonEliminarInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("CancelarInformesDevoluciones")) {
				jButtonCancelarInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarInformesDevoluciones")) {
				jButtonCancelarInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarInformesDevoluciones")) {
				jButtonCancelarInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("CerrarInformesDevoluciones")) {
				jButtonCerrarInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarInformesDevoluciones")) {
				jButtonCerrarInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarInformesDevoluciones")) {
				jButtonCerrarInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarInformesDevoluciones")) {
				jButtonMostrarOcultarInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarInformesDevoluciones")) {
				jButtonCancelarInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosInformesDevoluciones")) {
				jButtonGuardarCambiosInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarInformesDevoluciones")) {
				jButtonGuardarCambiosInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarInformesDevoluciones")) {
				jButtonCopiarInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarInformesDevoluciones")) {
				jButtonVerFormInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosInformesDevoluciones")) {
				jButtonGuardarCambiosInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarInformesDevoluciones")) {
				jButtonCopiarInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormInformesDevoluciones")) {
				jButtonVerFormInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaInformesDevoluciones")) {
				jButtonGuardarCambiosInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarInformesDevoluciones")) {
				jButtonGuardarCambiosInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaInformesDevoluciones")) {
				jButtonGuardarCambiosInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionInformesDevoluciones")) {
				jButtonRecargarInformacionInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarInformesDevoluciones")) {
				jButtonRecargarInformacionInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionInformesDevoluciones")) {
				jButtonRecargarInformacionInformesDevolucionesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresInformesDevoluciones")) {
				jButtonAnterioresInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarInformesDevoluciones")) {
				jButtonAnterioresInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreInformesDevoluciones")) {
				jButtonAnterioresInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesInformesDevoluciones")) {
				jButtonSiguientesInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarInformesDevoluciones")) {
				jButtonSiguientesInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesInformesDevoluciones")) {
				jButtonSiguientesInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByInformesDevoluciones") || sTipo.equals("MenuItemDetalleAbrirOrderByInformesDevoluciones")) {
				jButtonAbrirOrderByInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarInformesDevoluciones") || sTipo.equals("MenuItemDetalleMostrarOcultarInformesDevoluciones")) {
				jButtonMostrarOcultarInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosInformesDevoluciones")) {
				jButtonNuevoGuardarCambiosInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarInformesDevoluciones")) {
				jButtonNuevoGuardarCambiosInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosInformesDevoluciones")) {
				jButtonNuevoGuardarCambiosInformesDevolucionesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoInformesDevoluciones")) {
				jButtonCerrarReporteDinamicoInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoInformesDevoluciones")) {
				jButtonGenerarReporteDinamicoInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoInformesDevoluciones")) {
				
				jButtonGenerarExcelReporteDinamicoInformesDevolucionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionInformesDevoluciones")) {
				jButtonCerrarImportacionInformesDevolucionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionInformesDevoluciones")) {
				
				jButtonGenerarImportacionInformesDevolucionesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionInformesDevoluciones")) {
				
				jButtonAbrirImportacionInformesDevolucionesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesInformesDevoluciones")) {
				jComboBoxTiposAccionesInformesDevolucionesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesInformesDevoluciones")) {
				jComboBoxTiposRelacionesInformesDevolucionesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioInformesDevoluciones")) {
				jComboBoxTiposAccionesInformesDevolucionesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarInformesDevoluciones")) {
				
				jComboBoxTiposSeleccionarInformesDevolucionesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralInformesDevoluciones")) {
				jTextFieldValorCampoGeneralInformesDevolucionesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByInformesDevoluciones")) {
				jButtonAbrirOrderByInformesDevolucionesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarInformesDevoluciones")) {
				jButtonAbrirOrderByInformesDevolucionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByInformesDevoluciones")) {
				jButtonCerrarOrderByInformesDevolucionesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idInformesDevolucionesBusqueda")) {
				this.jButtonidInformesDevolucionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoInformesDevolucionesUpdate")) {
				this.jButtonid_productoInformesDevolucionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoInformesDevolucionesBusqueda")) {
				this.jButtonid_productoInformesDevolucionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_devolucion_empresaInformesDevolucionesUpdate")) {
				this.jButtonid_tipo_devolucion_empresaInformesDevolucionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_devolucion_empresaInformesDevolucionesBusqueda")) {
				this.jButtonid_tipo_devolucion_empresaInformesDevolucionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaInformesDevolucionesUpdate")) {
				this.jButtonid_empresaInformesDevolucionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaInformesDevolucionesBusqueda")) {
				this.jButtonid_empresaInformesDevolucionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalInformesDevolucionesUpdate")) {
				this.jButtonid_sucursalInformesDevolucionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalInformesDevolucionesBusqueda")) {
				this.jButtonid_sucursalInformesDevolucionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeInformesDevolucionesBusqueda")) {
				this.jButtonfecha_emision_desdeInformesDevolucionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaInformesDevolucionesBusqueda")) {
				this.jButtonfecha_emision_hastaInformesDevolucionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("user_name_usuarioInformesDevolucionesBusqueda")) {
				this.jButtonuser_name_usuarioInformesDevolucionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteInformesDevolucionesBusqueda")) {
				this.jButtonnombre_completo_clienteInformesDevolucionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impresoInformesDevolucionesBusqueda")) {
				this.jButtonnumero_pre_impresoInformesDevolucionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionInformesDevolucionesBusqueda")) {
				this.jButtonfecha_emisionInformesDevolucionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bodegaInformesDevolucionesBusqueda")) {
				this.jButtonnombre_bodegaInformesDevolucionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoInformesDevolucionesBusqueda")) {
				this.jButtonnombre_productoInformesDevolucionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_devolucion_empresaInformesDevolucionesBusqueda")) {
				this.jButtonnombre_tipo_devolucion_empresaInformesDevolucionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadInformesDevolucionesBusqueda")) {
				this.jButtoncantidadInformesDevolucionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoInformesDevolucionesBusqueda")) {
				this.jButtoncodigo_productoInformesDevolucionesBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaInformesDevolucionesInformesDevoluciones")) {
				this.jButtonBusquedaInformesDevolucionesInformesDevolucionesActionPerformed(evt);
			}
			
			;
			
			
			InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessInformesDevoluciones();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInformesDevolucionesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informesdevoluciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informesdevoluciones);
				
				InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
				
				


				
				InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformesDevoluciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformesDevoluciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			InformesDevoluciones informesdevolucionesLocal=null;
			
			if(!this.getEsControlTabla()) {
				informesdevolucionesLocal=this.informesdevoluciones;
			} else {
				informesdevolucionesLocal=this.informesdevolucionesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informesdevoluciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informesdevoluciones);
				
				InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
							
				
				


				
				InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformesDevoluciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformesDevoluciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformesDevolucionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesAnterior =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informesdevolucionesAnterior =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
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
			
			InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
			
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
			
			


			
			InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInformesDevolucionesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informesdevoluciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informesdevoluciones);
				
				InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
								
						
				


				
				InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformesDevoluciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformesDevoluciones.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informesdevoluciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informesdevoluciones);
				
				InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
								
				
				


				
				InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformesDevoluciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformesDevoluciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformesDevolucionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesAnterior =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informesdevolucionesAnterior =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informesdevoluciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informesdevoluciones);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformesDevolucionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesAnterior =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informesdevolucionesAnterior =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformesDevolucionesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.informesdevoluciones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.informesdevoluciones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informesdevoluciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informesdevoluciones);
				
				InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
							
				
				


				
				InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformesDevoluciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformesDevoluciones.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInformesDevolucionesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informesdevolucionesAnterior =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.informesdevolucionesAnterior =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
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
			
			InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
			
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
			
			


			
			InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformesDevolucionesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.informesdevoluciones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.informesdevoluciones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informesdevoluciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informesdevoluciones);
				
				InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
								
				
				


				
				InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformesDevoluciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformesDevoluciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformesDevolucionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesAnterior =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informesdevolucionesAnterior =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformesDevolucionesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.informesdevoluciones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.informesdevoluciones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInformesDevolucionesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informesdevoluciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informesdevoluciones);
				
				InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosInformesDevoluciones")) {
					jCheckBoxSeleccionarTodosInformesDevolucionesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosInformesDevoluciones")) {
					jCheckBoxSeleccionadosInformesDevolucionesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarInformesDevoluciones")) {
					
				}
				
				


				
				
				InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformesDevoluciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformesDevoluciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.informesdevoluciones);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.informesdevoluciones);
				
				InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
												
				
				


				
				
				InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformesDevoluciones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformesDevoluciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInformesDevolucionesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.informesdevolucionesAnterior =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.informesdevolucionesAnterior =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInformesDevolucionesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informesdevoluciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informesdevoluciones);
				
				InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
				
				
				InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
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
			
			InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
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
			
			


			
			InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaInformesDevolucionesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informesdevoluciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informesdevoluciones);
				
				InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformesDevoluciones.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformesDevoluciones.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.informesdevoluciones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.informesdevoluciones);
				
				InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
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
				
				


				
				InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(InformesDevoluciones.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",InformesDevoluciones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaInformesDevolucionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.informesdevolucionesAnterior =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.informesdevolucionesAnterior =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarInformesDevoluciones")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosInformesDevolucionesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosInformesDevoluciones.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.informesdevoluciones =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.informesdevoluciones);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarInformesDevoluciones")) {
				
				}
				
				InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarInformesDevoluciones")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosInformesDevoluciones.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarInformesDevoluciones")) {
			
			}
			
			InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessInformesDevoluciones();
			
			InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
			
			if(sTipo.equals("NuevoInformesDevoluciones")) {
				jButtonNuevoInformesDevolucionesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarInformesDevoluciones")) {
				jButtonDuplicarInformesDevolucionesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarInformesDevoluciones")) {
				jButtonCopiarInformesDevolucionesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormInformesDevoluciones")) {
				jButtonVerFormInformesDevolucionesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesInformesDevoluciones")) {
				jButtonNuevoInformesDevolucionesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarInformesDevoluciones")) {
				jButtonModificarInformesDevolucionesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarInformesDevoluciones")) {
				jButtonActualizarInformesDevolucionesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarInformesDevoluciones")) {
				jButtonEliminarInformesDevolucionesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaInformesDevoluciones")) {
				jButtonGuardarCambiosInformesDevolucionesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarInformesDevoluciones")) {
				jButtonCancelarInformesDevolucionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarInformesDevoluciones")) {
				jButtonCerrarInformesDevolucionesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosInformesDevoluciones")) {
				jButtonGuardarCambiosInformesDevolucionesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosInformesDevoluciones")) {
				jButtonNuevoGuardarCambiosInformesDevolucionesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByInformesDevoluciones")) {
				jButtonAbrirOrderByInformesDevolucionesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionInformesDevoluciones")) {
				jButtonRecargarInformacionInformesDevolucionesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresInformesDevoluciones")) {
				jButtonAnterioresInformesDevolucionesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesInformesDevoluciones")) {
				jButtonSiguientesInformesDevolucionesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idInformesDevolucionesBusqueda")) {
				this.jButtonidInformesDevolucionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoInformesDevolucionesUpdate")) {
				this.jButtonid_productoInformesDevolucionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoInformesDevolucionesBusqueda")) {
				this.jButtonid_productoInformesDevolucionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_devolucion_empresaInformesDevolucionesUpdate")) {
				this.jButtonid_tipo_devolucion_empresaInformesDevolucionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_devolucion_empresaInformesDevolucionesBusqueda")) {
				this.jButtonid_tipo_devolucion_empresaInformesDevolucionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaInformesDevolucionesUpdate")) {
				this.jButtonid_empresaInformesDevolucionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaInformesDevolucionesBusqueda")) {
				this.jButtonid_empresaInformesDevolucionesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalInformesDevolucionesUpdate")) {
				this.jButtonid_sucursalInformesDevolucionesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalInformesDevolucionesBusqueda")) {
				this.jButtonid_sucursalInformesDevolucionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeInformesDevolucionesBusqueda")) {
				this.jButtonfecha_emision_desdeInformesDevolucionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaInformesDevolucionesBusqueda")) {
				this.jButtonfecha_emision_hastaInformesDevolucionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("user_name_usuarioInformesDevolucionesBusqueda")) {
				this.jButtonuser_name_usuarioInformesDevolucionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteInformesDevolucionesBusqueda")) {
				this.jButtonnombre_completo_clienteInformesDevolucionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impresoInformesDevolucionesBusqueda")) {
				this.jButtonnumero_pre_impresoInformesDevolucionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionInformesDevolucionesBusqueda")) {
				this.jButtonfecha_emisionInformesDevolucionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bodegaInformesDevolucionesBusqueda")) {
				this.jButtonnombre_bodegaInformesDevolucionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoInformesDevolucionesBusqueda")) {
				this.jButtonnombre_productoInformesDevolucionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_devolucion_empresaInformesDevolucionesBusqueda")) {
				this.jButtonnombre_tipo_devolucion_empresaInformesDevolucionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadInformesDevolucionesBusqueda")) {
				this.jButtoncantidadInformesDevolucionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoInformesDevolucionesBusqueda")) {
				this.jButtoncodigo_productoInformesDevolucionesBusquedaActionPerformed(evt);
			}
			
			InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessInformesDevoluciones();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameInformesDevoluciones")) {
				closingInternalFrameInformesDevoluciones();
				
			} else if(sTipo.equals("jButtonCancelarInformesDevoluciones")) {
				JInternalFrameBase jInternalFrameDetalleFormInformesDevoluciones = (JInternalFrameBase)evt.getSource();
	            	
	            InformesDevolucionesBeanSwingJInternalFrame jInternalFrameParent=(InformesDevolucionesBeanSwingJInternalFrame)jInternalFrameDetalleFormInformesDevoluciones.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarInformesDevolucionesActionPerformed(null);
			}
			
			InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.informesdevoluciones,new Object(),this.informesdevolucionesParameterGeneral,this.informesdevolucionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormInformesDevoluciones(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormInformesDevoluciones(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormInformesDevoluciones(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.informesdevoluciones)) {
			if(!esControlTabla) {
				if(InformesDevolucionesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.informesdevoluciones,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);			
				}
				
				if(this.informesdevolucionesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualInformesDevoluciones(this.informesdevoluciones,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanInformesDevoluciones(this.informesdevolucionesReturnGeneral,this.informesdevolucionesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.informesdevolucionesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanInformesDevoluciones(classes,this.informesdevolucionesReturnGeneral,this.informesdevolucionesBean,false);
					}
						
					if(this.informesdevolucionesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyInformesDevoluciones(this.informesdevolucionesReturnGeneral.getInformesDevoluciones());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioInformesDevoluciones(this.informesdevolucionesReturnGeneral.getInformesDevoluciones());	
					}
						
					if(this.informesdevolucionesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioInformesDevoluciones(this.informesdevolucionesReturnGeneral.getInformesDevoluciones(),classes);//this.informesdevolucionesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioInformesDevoluciones(this.informesdevoluciones,classes);//this.informesdevolucionesBean);									
				}
			
				if(InformesDevolucionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualInformesDevoluciones(this.informesdevoluciones,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysInformesDevoluciones(this.informesdevoluciones);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.informesdevolucionesAnterior!=null) {
						this.informesdevoluciones=this.informesdevolucionesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.informesdevolucionesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.informesdevolucionesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.informesdevolucionesReturnGeneral.getInformesDevoluciones(),informesdevolucionesLogic.getInformesDevolucioness());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.informesdevolucionesReturnGeneral.getInformesDevoluciones(),this.informesdevolucioness);
				}
				//ARCHITECTURE
				
				//this.jTableDatosInformesDevoluciones.repaint();
				
				//((AbstractTableModel) this.jTableDatosInformesDevoluciones.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosInformesDevoluciones();
			}
		}
	}
	
	public void actualizarVisualTableDatosInformesDevoluciones() throws Exception {
		
		InformesDevolucionesModel informesdevolucionesModel=(InformesDevolucionesModel)this.jTableDatosInformesDevoluciones.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			informesdevolucionesModel.informesdevolucioness=this.informesdevolucionesLogic.getInformesDevolucioness();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			informesdevolucionesModel.informesdevolucioness=this.informesdevolucioness;
		}
		
		
		((InformesDevolucionesModel) this.jTableDatosInformesDevoluciones.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaInformesDevoluciones() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getinformesdevolucionesAnterior(),this.informesdevolucionesLogic.getInformesDevolucioness());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getinformesdevolucionesAnterior(),this.informesdevolucioness);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosInformesDevoluciones();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioInformesDevoluciones(InformesDevoluciones informesdevoluciones,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
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
										
				InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.informesdevoluciones,new Object(),generalEntityParameterGeneral,this.informesdevolucionesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.informesdevolucionesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=InformesDevolucionesConstantesFunciones.getClassesRelationshipsOfInformesDevoluciones(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=InformesDevolucionesConstantesFunciones.getClassesRelationshipsFromStringsOfInformesDevoluciones(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormInformesDevoluciones(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				InformesDevolucionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.informesdevoluciones,new Object(),generalEntityParameterGeneral,this.informesdevolucionesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioInformesDevoluciones(InformesDevolucionesBean informesdevolucionesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanInformesDevoluciones(ArrayList<Classe> classes,InformesDevolucionesReturnGeneral informesdevolucionesReturnGeneral,InformesDevolucionesBean informesdevolucionesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualInformesDevoluciones(InformesDevoluciones informesdevoluciones,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.informesdevoluciones)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormInformesDevoluciones = new InformesDevolucionesDetalleFormJInternalFrame(jDesktopPane,this.informesdevolucionesSessionBean.getConGuardarRelaciones(),this.informesdevolucionesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.setVisible(false);
		this.jInternalFrameDetalleFormInformesDevoluciones.setSelected(false);						
		
		this.jInternalFrameDetalleFormInformesDevoluciones.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormInformesDevoluciones.informesdevolucionesLogic=this.informesdevolucionesLogic;
		
		this.cargarCombosFrameForeignKeyInformesDevoluciones("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleInformesDevoluciones();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleInformesDevoluciones();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyInformesDevoluciones("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyInformesDevoluciones();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormInformesDevoluciones.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarInformesDevoluciones"));
		
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonModificarInformesDevoluciones.addActionListener(new ButtonActionListener(this,"ModificarInformesDevoluciones"));

		
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonModificarToolBarInformesDevoluciones.addActionListener(new ButtonActionListener(this,"ModificarToolBarInformesDevoluciones"));
					
		this.jInternalFrameDetalleFormInformesDevoluciones.jMenuItemModificarInformesDevoluciones.addActionListener(new ButtonActionListener(this,"MenuItemModificarInformesDevoluciones"));		
		
		
		
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonActualizarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"ActualizarInformesDevoluciones"));
		
		
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonActualizarToolBarInformesDevoluciones.addActionListener(new ButtonActionListener(this,"ActualizarToolBarInformesDevoluciones"));
						
		this.jInternalFrameDetalleFormInformesDevoluciones.jMenuItemActualizarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"MenuItemActualizarInformesDevoluciones"));		
		
		
		
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonEliminarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"EliminarInformesDevoluciones"));
		
		
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonEliminarToolBarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"EliminarToolBarInformesDevoluciones"));
								
		this.jInternalFrameDetalleFormInformesDevoluciones.jMenuItemEliminarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"MenuItemEliminarInformesDevoluciones"));		
		
		
		
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonCancelarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"CancelarInformesDevoluciones"));
		
		
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonCancelarToolBarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"CancelarToolBarInformesDevoluciones"));
					
		this.jInternalFrameDetalleFormInformesDevoluciones.jMenuItemCancelarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"MenuItemCancelarInformesDevoluciones"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormInformesDevoluciones.jMenuItemDetalleCerrarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarInformesDevoluciones"));		
		
		
		
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonGuardarCambiosToolBarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarInformesDevoluciones"));
		
		
		
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonGuardarCambiosToolBarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarInformesDevoluciones"));
		
		
		
		this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxTiposAccionesFormularioInformesDevoluciones.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioInformesDevoluciones"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonidInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"idInformesDevolucionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonid_productoInformesDevolucionesUpdate.addActionListener(new ButtonActionListener(this,"id_productoInformesDevolucionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonid_productoInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"id_productoInformesDevolucionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonid_tipo_devolucion_empresaInformesDevolucionesUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_devolucion_empresaInformesDevolucionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonid_tipo_devolucion_empresaInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_devolucion_empresaInformesDevolucionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonid_empresaInformesDevolucionesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaInformesDevolucionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonid_empresaInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaInformesDevolucionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonid_sucursalInformesDevolucionesUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalInformesDevolucionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonid_sucursalInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonfecha_emision_desdeInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonfecha_emision_hastaInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonuser_name_usuarioInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"user_name_usuarioInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonnombre_completo_clienteInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonnumero_pre_impresoInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonfecha_emisionInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonnombre_bodegaInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonnombre_productoInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonnombre_tipo_devolucion_empresaInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_devolucion_empresaInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtoncantidadInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"cantidadInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtoncodigo_productoInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoInformesDevolucionesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormInformesDevoluciones.jTabbedPaneRelacionesInformesDevoluciones.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesInformesDevoluciones"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameInformesDevoluciones"));
		
		if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformesDevoluciones.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarInformesDevoluciones"));
		}
		
		this.jTableDatosInformesDevoluciones.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarInformesDevoluciones"));
		
		this.jTableDatosInformesDevoluciones.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarInformesDevoluciones"));
		
		this.jButtonNuevoInformesDevoluciones.addActionListener(new ButtonActionListener(this,"NuevoInformesDevoluciones"));
		
		this.jButtonDuplicarInformesDevoluciones.addActionListener(new ButtonActionListener(this,"DuplicarInformesDevoluciones"));
		
		this.jButtonCopiarInformesDevoluciones.addActionListener(new ButtonActionListener(this,"CopiarInformesDevoluciones"));
		
		this.jButtonVerFormInformesDevoluciones.addActionListener(new ButtonActionListener(this,"VerFormInformesDevoluciones"));
		
		
		this.jButtonNuevoToolBarInformesDevoluciones.addActionListener(new ButtonActionListener(this,"NuevoToolBarInformesDevoluciones"));
			
		this.jButtonDuplicarToolBarInformesDevoluciones.addActionListener(new ButtonActionListener(this,"DuplicarToolBarInformesDevoluciones"));
			
		this.jMenuItemNuevoInformesDevoluciones.addActionListener (new ButtonActionListener(this,"MenuItemNuevoInformesDevoluciones"));
			
		this.jMenuItemDuplicarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarInformesDevoluciones"));		
		
		
		this.jButtonNuevoRelacionesInformesDevoluciones.addActionListener (new ButtonActionListener(this,"NuevoRelacionesInformesDevoluciones"));
		
		
		this.jButtonNuevoRelacionesToolBarInformesDevoluciones.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarInformesDevoluciones"));
			
		this.jMenuItemNuevoRelacionesInformesDevoluciones.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesInformesDevoluciones"));		
		
		
		if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformesDevoluciones.jButtonModificarInformesDevoluciones.addActionListener(new ButtonActionListener(this,"ModificarInformesDevoluciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformesDevoluciones.jButtonModificarToolBarInformesDevoluciones.addActionListener(new ButtonActionListener(this,"ModificarToolBarInformesDevoluciones"));
			
			this.jInternalFrameDetalleFormInformesDevoluciones.jMenuItemModificarInformesDevoluciones.addActionListener(new ButtonActionListener(this,"MenuItemModificarInformesDevoluciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormInformesDevoluciones.jButtonActualizarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"ActualizarInformesDevoluciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformesDevoluciones.jButtonActualizarToolBarInformesDevoluciones.addActionListener(new ButtonActionListener(this,"ActualizarToolBarInformesDevoluciones"));
				
			this.jInternalFrameDetalleFormInformesDevoluciones.jMenuItemActualizarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"MenuItemActualizarInformesDevoluciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformesDevoluciones.jButtonEliminarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"EliminarInformesDevoluciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformesDevoluciones.jButtonEliminarToolBarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"EliminarToolBarInformesDevoluciones"));
						
			this.jInternalFrameDetalleFormInformesDevoluciones.jMenuItemEliminarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"MenuItemEliminarInformesDevoluciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformesDevoluciones.jButtonCancelarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"CancelarInformesDevoluciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformesDevoluciones.jButtonCancelarToolBarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"CancelarToolBarInformesDevoluciones"));
			
			this.jInternalFrameDetalleFormInformesDevoluciones.jMenuItemCancelarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"MenuItemCancelarInformesDevoluciones"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarInformesDevoluciones"));		
		
		
		this.jButtonCerrarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"CerrarInformesDevoluciones"));
		
		
		this.jButtonCerrarToolBarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"CerrarToolBarInformesDevoluciones"));
			
		this.jMenuItemCerrarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"MenuItemCerrarInformesDevoluciones"));
			
		if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformesDevoluciones.jMenuItemDetalleCerrarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarInformesDevoluciones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformesDevoluciones.jButtonGuardarCambiosInformesDevoluciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosInformesDevoluciones"));
		}
		
		
		if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformesDevoluciones.jButtonGuardarCambiosToolBarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarInformesDevoluciones"));
		}
		
		this.jButtonCopiarToolBarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"CopiarToolBarInformesDevoluciones"));
			
		this.jButtonVerFormToolBarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"VerFormToolBarInformesDevoluciones"));
		
		this.jMenuItemGuardarCambiosInformesDevoluciones.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosInformesDevoluciones"));
			
		this.jMenuItemCopiarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"MenuItemCopiarInformesDevoluciones"));		
		
		this.jMenuItemVerFormInformesDevoluciones.addActionListener (new ButtonActionListener(this,"MenuItemVerFormInformesDevoluciones"));		
		
		
		this.jButtonGuardarCambiosTablaInformesDevoluciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaInformesDevoluciones"));
		
		
		this.jButtonGuardarCambiosTablaToolBarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarInformesDevoluciones"));
			
		this.jMenuItemGuardarCambiosTablaInformesDevoluciones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaInformesDevoluciones"));		
		
		
		
		this.jButtonRecargarInformacionInformesDevoluciones.addActionListener (new ButtonActionListener(this,"RecargarInformacionInformesDevoluciones"));
					
		this.jButtonRecargarInformacionToolBarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarInformesDevoluciones"));
		
		this.jMenuItemRecargarInformacionInformesDevoluciones.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionInformesDevoluciones"));		
		
		
		
		this.jButtonAnterioresInformesDevoluciones.addActionListener (new ButtonActionListener(this,"AnterioresInformesDevoluciones"));
		
		
		this.jButtonAnterioresToolBarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"AnterioresToolBarInformesDevoluciones"));
		
		this.jMenuItemAnterioresInformesDevoluciones.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresInformesDevoluciones"));		
		
		
		this.jButtonSiguientesInformesDevoluciones.addActionListener (new ButtonActionListener(this,"SiguientesInformesDevoluciones"));
		
		
		this.jButtonSiguientesToolBarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"SiguientesToolBarInformesDevoluciones"));
			
		this.jMenuItemSiguientesInformesDevoluciones.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesInformesDevoluciones"));
			
		this.jMenuItemAbrirOrderByInformesDevoluciones.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByInformesDevoluciones"));
			
		this.jMenuItemMostrarOcultarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarInformesDevoluciones"));
			
		this.jMenuItemDetalleAbrirOrderByInformesDevoluciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByInformesDevoluciones"));
			
		this.jMenuItemDetalleMostarOcultarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarInformesDevoluciones"));		
		
		
		this.jButtonNuevoGuardarCambiosInformesDevoluciones.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosInformesDevoluciones"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarInformesDevoluciones"));
			
		this.jMenuItemNuevoGuardarCambiosInformesDevoluciones.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosInformesDevoluciones"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosInformesDevoluciones.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosInformesDevoluciones"));

		this.jCheckBoxSeleccionadosInformesDevoluciones.addItemListener(new CheckBoxItemListener(this,"SeleccionadosInformesDevoluciones"));
		
		if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxTiposAccionesFormularioInformesDevoluciones.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioInformesDevoluciones"));
		}
		
		
		this.jComboBoxTiposRelacionesInformesDevoluciones.addActionListener (new ButtonActionListener(this,"TiposRelacionesInformesDevoluciones"));
			
		this.jComboBoxTiposAccionesInformesDevoluciones.addActionListener (new ButtonActionListener(this,"TiposAccionesInformesDevoluciones"));
					
		this.jComboBoxTiposSeleccionarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"TiposSeleccionarInformesDevoluciones"));
			
		this.jTextFieldValorCampoGeneralInformesDevoluciones.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralInformesDevoluciones"));		
		
		
		if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonidInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"idInformesDevolucionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonid_productoInformesDevolucionesUpdate.addActionListener(new ButtonActionListener(this,"id_productoInformesDevolucionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonid_productoInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"id_productoInformesDevolucionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonid_tipo_devolucion_empresaInformesDevolucionesUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_devolucion_empresaInformesDevolucionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonid_tipo_devolucion_empresaInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_devolucion_empresaInformesDevolucionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonid_empresaInformesDevolucionesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaInformesDevolucionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonid_empresaInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaInformesDevolucionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonid_sucursalInformesDevolucionesUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalInformesDevolucionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonid_sucursalInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonfecha_emision_desdeInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonfecha_emision_hastaInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonuser_name_usuarioInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"user_name_usuarioInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonnombre_completo_clienteInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonnumero_pre_impresoInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonfecha_emisionInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonnombre_bodegaInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonnombre_productoInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonnombre_tipo_devolucion_empresaInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_devolucion_empresaInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtoncantidadInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"cantidadInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtoncodigo_productoInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoInformesDevolucionesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaInformesDevolucionesInformesDevoluciones.addActionListener(new ButtonActionListener(this,"BusquedaInformesDevolucionesInformesDevoluciones"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoInformesDevoluciones!=null) {
				this.jInternalFrameReporteDinamicoInformesDevoluciones.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoInformesDevoluciones"));
				this.jInternalFrameReporteDinamicoInformesDevoluciones.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoInformesDevoluciones"));
				this.jInternalFrameReporteDinamicoInformesDevoluciones.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoInformesDevoluciones"));
			}
			
			//this.jButtonCerrarReporteDinamicoInformesDevoluciones.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoInformesDevoluciones"));				
			//this.jButtonGenerarReporteDinamicoInformesDevoluciones.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoInformesDevoluciones"));
			//this.jButtonGenerarExcelReporteDinamicoInformesDevoluciones.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoInformesDevoluciones"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionInformesDevoluciones!=null) {
				this.jInternalFrameImportacionInformesDevoluciones.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionInformesDevoluciones"));
				this.jInternalFrameImportacionInformesDevoluciones.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionInformesDevoluciones"));
				this.jInternalFrameImportacionInformesDevoluciones.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionInformesDevoluciones"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByInformesDevoluciones.addActionListener (new ButtonActionListener(this,"AbrirOrderByInformesDevoluciones"));
			
			this.jButtonAbrirOrderByToolBarInformesDevoluciones.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarInformesDevoluciones"));			
			
			if(this.jInternalFrameOrderByInformesDevoluciones!=null) {
				this.jInternalFrameOrderByInformesDevoluciones.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByInformesDevoluciones"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormInformesDevoluciones.jTabbedPaneRelacionesInformesDevoluciones.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesInformesDevoluciones"));
		
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
            		closingInternalFrameInformesDevoluciones();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormInformesDevoluciones.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormInformesDevoluciones = (JInternalFrameBase)event.getSource();
	            	
	            InformesDevolucionesBeanSwingJInternalFrame jInternalFrameParent=(InformesDevolucionesBeanSwingJInternalFrame)jInternalFrameDetalleFormInformesDevoluciones.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarInformesDevolucionesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosInformesDevoluciones.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosInformesDevolucionesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosInformesDevoluciones.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosInformesDevoluciones.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoInformesDevolucionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoInformesDevolucionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoInformesDevolucionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoInformesDevoluciones";
		inputMap = this.jButtonNuevoInformesDevoluciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoInformesDevoluciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoInformesDevolucionesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoInformesDevolucionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoInformesDevolucionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoInformesDevolucionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesInformesDevoluciones";
		inputMap = this.jButtonNuevoRelacionesInformesDevoluciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesInformesDevoluciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoInformesDevolucionesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarInformesDevoluciones";
		inputMap = this.jButtonModificarInformesDevoluciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarInformesDevoluciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarInformesDevolucionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarInformesDevoluciones";
		inputMap = this.jButtonActualizarInformesDevoluciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarInformesDevoluciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarInformesDevolucionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarInformesDevoluciones";
		inputMap = this.jButtonEliminarInformesDevoluciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarInformesDevoluciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarInformesDevolucionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarInformesDevoluciones";
		inputMap = this.jButtonCancelarInformesDevoluciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarInformesDevoluciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarInformesDevolucionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarInformesDevoluciones";
		inputMap = this.jButtonCerrarInformesDevoluciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarInformesDevoluciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarInformesDevolucionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonGuardarCambiosInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosInformesDevoluciones";
		inputMap = this.jInternalFrameDetalleFormInformesDevoluciones.jButtonGuardarCambiosInformesDevoluciones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonGuardarCambiosInformesDevoluciones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosInformesDevolucionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosInformesDevoluciones.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosInformesDevolucionesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesInformesDevoluciones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesInformesDevolucionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarInformesDevoluciones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarInformesDevolucionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralInformesDevoluciones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralInformesDevolucionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonidInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"idInformesDevolucionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonid_productoInformesDevolucionesUpdate.addActionListener(new ButtonActionListener(this,"id_productoInformesDevolucionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonid_productoInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"id_productoInformesDevolucionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonid_tipo_devolucion_empresaInformesDevolucionesUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_devolucion_empresaInformesDevolucionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonid_tipo_devolucion_empresaInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_devolucion_empresaInformesDevolucionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonid_empresaInformesDevolucionesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaInformesDevolucionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonid_empresaInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaInformesDevolucionesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonid_sucursalInformesDevolucionesUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalInformesDevolucionesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonid_sucursalInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonfecha_emision_desdeInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonfecha_emision_hastaInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonuser_name_usuarioInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"user_name_usuarioInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonnombre_completo_clienteInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonnumero_pre_impresoInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonfecha_emisionInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonnombre_bodegaInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonnombre_productoInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtonnombre_tipo_devolucion_empresaInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_devolucion_empresaInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtoncantidadInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"cantidadInformesDevolucionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormInformesDevoluciones.jButtoncodigo_productoInformesDevolucionesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoInformesDevolucionesBusqueda"));
		
		
		this.jButtonBusquedaInformesDevolucionesInformesDevoluciones.addActionListener(new ButtonActionListener(this,"BusquedaInformesDevolucionesInformesDevoluciones"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionInformesDevoluciones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionInformesDevolucionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarInformesDevolucionesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarInformesDevoluciones.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosInformesDevoluciones(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(InformesDevoluciones informesdevolucionesAux:this.informesdevolucionesLogic.getInformesDevolucioness()) {
					informesdevolucionesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(InformesDevoluciones informesdevolucionesAux:informesdevolucioness) {
					informesdevolucionesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosInformesDevolucionesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingInformesDevoluciones(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(InformesDevoluciones informesdevolucionesAux:this.informesdevolucionesLogic.getInformesDevolucioness()) {
						informesdevolucionesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(InformesDevoluciones informesdevolucionesAux:informesdevolucioness) {
						informesdevolucionesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(InformesDevoluciones informesdevolucionesAux:this.informesdevolucionesLogic.getInformesDevolucioness()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(InformesDevoluciones informesdevolucionesAux:informesdevolucioness) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaInformesDevoluciones(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosInformesDevoluciones.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosInformesDevoluciones.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosInformesDevoluciones,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosInformesDevolucionesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingInformesDevoluciones(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosInformesDevoluciones.getSelectedRows();
			
			InformesDevoluciones informesdevolucionesLocal=new InformesDevoluciones();
			
			//this.seleccionarTodosInformesDevoluciones(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					informesdevolucionesLocal =(InformesDevoluciones) this.informesdevolucionesLogic.getInformesDevolucioness().toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					informesdevolucionesLocal =(InformesDevoluciones) this.informesdevolucioness.toArray()[this.jTableDatosInformesDevoluciones.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				informesdevolucionesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(InformesDevoluciones informesdevolucionesAux:this.informesdevolucionesLogic.getInformesDevolucioness()) {
						informesdevolucionesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(InformesDevoluciones informesdevolucionesAux:informesdevolucioness) {
						informesdevolucionesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaInformesDevoluciones(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosInformesDevoluciones.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosInformesDevoluciones.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosInformesDevoluciones,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualInformesDevolucionesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarInformesDevolucionesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralInformesDevolucionesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingInformesDevoluciones(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralInformesDevoluciones.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(InformesDevoluciones informesdevolucionesAux:this.informesdevolucionesLogic.getInformesDevolucioness()) {
				
						if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							informesdevolucionesAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							informesdevolucionesAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_USERNAMEUSUARIO)) {
							existe=true;
							informesdevolucionesAux.setuser_name_usuario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							informesdevolucionesAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
							existe=true;
							informesdevolucionesAux.setnumero_pre_impreso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							informesdevolucionesAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_NOMBREBODEGA)) {
							existe=true;
							informesdevolucionesAux.setnombre_bodega(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							informesdevolucionesAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_NOMBRETIPODEVOLUCIONEMPRESA)) {
							existe=true;
							informesdevolucionesAux.setnombre_tipo_devolucion_empresa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							informesdevolucionesAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							informesdevolucionesAux.setcodigo_producto(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(InformesDevoluciones informesdevolucionesAux:informesdevolucioness) {
					
						if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							informesdevolucionesAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							informesdevolucionesAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_USERNAMEUSUARIO)) {
							existe=true;
							informesdevolucionesAux.setuser_name_usuario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							informesdevolucionesAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
							existe=true;
							informesdevolucionesAux.setnumero_pre_impreso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							informesdevolucionesAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_NOMBREBODEGA)) {
							existe=true;
							informesdevolucionesAux.setnombre_bodega(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							informesdevolucionesAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_NOMBRETIPODEVOLUCIONEMPRESA)) {
							existe=true;
							informesdevolucionesAux.setnombre_tipo_devolucion_empresa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							informesdevolucionesAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							informesdevolucionesAux.setcodigo_producto(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaInformesDevoluciones(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesInformesDevolucionesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingInformesDevoluciones(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioInformesDevoluciones=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesInformesDevoluciones.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxTiposAccionesFormularioInformesDevoluciones.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteInformesDevoluciones) {				
					conSplash=true;//false;										
					
					//this.startProcessInformesDevoluciones(conSplash);
				
					this.generarReporteInformesDevolucionessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesInformesDevoluciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxTiposAccionesFormularioInformesDevoluciones.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoInformesDevolucionessSeleccionados();
				//this.jComboBoxTiposAccionesInformesDevoluciones.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoInformesDevolucionessSeleccionados(false);
				//this.jComboBoxTiposAccionesInformesDevoluciones.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoInformesDevolucionessSeleccionados(true);
				//this.jComboBoxTiposAccionesInformesDevoluciones.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessInformesDevoluciones();
				
				this.exportarInformesDevolucionessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesInformesDevoluciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxTiposAccionesFormularioInformesDevoluciones.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionInformesDevolucioness();
				//this.importarInformesDevolucioness();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesInformesDevoluciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxTiposAccionesFormularioInformesDevoluciones.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessInformesDevoluciones();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelInformesDevolucionessSeleccionados();
				//this.jComboBoxTiposAccionesInformesDevoluciones.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Informes Devoluciones", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessInformesDevoluciones();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoInformesDevoluciones)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyInformesDevoluciones(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Informes Devoluciones",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesInformesDevoluciones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxTiposAccionesFormularioInformesDevoluciones.setSelectedIndex(0);					
				}	
			} 			
			else if(InformesDevolucionesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteInformesDevoluciones) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessInformesDevoluciones(conSplash);
					
						//this.actualizarParametrosGeneralInformesDevoluciones();
						
						this.generarReporteProcesoAccionInformesDevolucionessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesInformesDevoluciones.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxTiposAccionesFormularioInformesDevoluciones.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(InformesDevolucionesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Informes DevolucionesES SELECCIONADOS?", "MANTENIMIENTO DE Informes Devoluciones", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessInformesDevoluciones();
				
						this.actualizarParametrosGeneralInformesDevoluciones();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.informesdevolucionesReturnGeneral=informesdevolucionesLogic.procesarAccionInformesDevolucionessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.informesdevolucionesLogic.getInformesDevolucioness(),this.informesdevolucionesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarInformesDevolucionesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesInformesDevoluciones.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxTiposAccionesFormularioInformesDevoluciones.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralInformesDevoluciones();
					
					InformesDevolucionesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarInformesDevolucionesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesInformesDevoluciones.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxTiposAccionesFormularioInformesDevoluciones.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessInformesDevoluciones(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesInformesDevolucionesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessInformesDevoluciones();
			
			if(this.jInternalFrameDetalleFormInformesDevoluciones==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<InformesDevoluciones> informesdevolucionessSeleccionados=new ArrayList<InformesDevoluciones>();		
			InformesDevoluciones informesdevoluciones=new InformesDevoluciones();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingInformesDevoluciones(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesInformesDevoluciones.getSelectedItem();
			
			
			
			
			informesdevolucionessSeleccionados=this.getInformesDevolucionessSeleccionados(true);
			//this.sTipoAccion;
			
			if(informesdevolucionessSeleccionados.size()==1) {
				for(InformesDevoluciones informesdevolucionesAux:informesdevolucionessSeleccionados) {
					informesdevoluciones=informesdevolucionesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessInformesDevoluciones();
			
      		//this.finishProcessInformesDevoluciones(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarInformesDevolucionesReturnGeneral() throws Exception {
		if(this.informesdevolucionesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.informesdevolucionesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.informesdevolucionesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.informesdevolucionesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.informesdevolucionesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.informesdevolucionesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingInformesDevoluciones(false);
		}
		
		if(this.informesdevolucionesReturnGeneral.getConRetornoLista() || this.informesdevolucionesReturnGeneral.getConRetornoObjeto()) {
			if(this.informesdevolucionesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.informesdevolucionesLogic.setInformesDevolucioness(this.informesdevolucionesReturnGeneral.getInformesDevolucioness());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingInformesDevoluciones(false);
		}
	}
	
	public void actualizarParametrosGeneralInformesDevoluciones() throws Exception {
		
		
	}
	
	public ArrayList<InformesDevoluciones> getInformesDevolucionessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<InformesDevoluciones> informesdevolucionessSeleccionados=new ArrayList<InformesDevoluciones>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioInformesDevoluciones) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(InformesDevoluciones informesdevolucionesAux:informesdevolucionesLogic.getInformesDevolucioness()) {
					if(informesdevolucionesAux.getIsSelected()) {
						informesdevolucionessSeleccionados.add(informesdevolucionesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(InformesDevoluciones informesdevolucionesAux:this.informesdevolucioness) {
					if(informesdevolucionesAux.getIsSelected()) {
						informesdevolucionessSeleccionados.add(informesdevolucionesAux);				
					}
				}
			}
			
			if(informesdevolucionessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						informesdevolucionessSeleccionados.addAll(this.informesdevolucionesLogic.getInformesDevolucioness());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						informesdevolucionessSeleccionados.addAll(this.informesdevolucioness);				
					}
				}
			}
		} else {
			informesdevolucionessSeleccionados.add(this.informesdevoluciones);
		}
		
		return informesdevolucionessSeleccionados;
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
	
	public void generarReporteInformesDevolucionessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalInformesDevolucionessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoInformesDevolucionessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoInformesDevolucionessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoInformesDevolucionessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Informes Devoluciones",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesInformesDevolucionessSeleccionados() throws Exception {
		ArrayList<InformesDevoluciones> informesdevolucionessSeleccionados=new ArrayList<InformesDevoluciones>();		
		
		informesdevolucionessSeleccionados=this.getInformesDevolucionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteInformesDevolucioness("Todos",informesdevolucionessSeleccionados);
		
	}	
	
	public void generarReporteNormalInformesDevolucionessSeleccionados() throws Exception {
		ArrayList<InformesDevoluciones> informesdevolucionessSeleccionados=new ArrayList<InformesDevoluciones>();		
		
		informesdevolucionessSeleccionados=this.getInformesDevolucionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteInformesDevolucioness("Todos",informesdevolucionessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionInformesDevolucionessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<InformesDevoluciones> informesdevolucionessSeleccionados=new ArrayList<InformesDevoluciones>();
		
		informesdevolucionessSeleccionados=this.getInformesDevolucionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteInformesDevolucioness("Todos",informesdevolucionessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoInformesDevolucionessSeleccionados() throws Exception {
		ArrayList<InformesDevoluciones> informesdevolucionessSeleccionados=new ArrayList<InformesDevoluciones>();		
		
		
		this.abrirInicializarFrameReporteDinamicoInformesDevoluciones();
		
		
		informesdevolucionessSeleccionados=this.getInformesDevolucionessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoInformesDevoluciones();
		
		
		//this.generarReporteInformesDevolucioness("Todos",informesdevolucionessSeleccionados ,informesdevolucionesImplementable,informesdevolucionesImplementableHome);
	}
	
	public void mostrarImportacionInformesDevolucioness() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionInformesDevoluciones();
		
		this.abrirFrameImportacionInformesDevoluciones();		
		
			
		//this.generarReporteInformesDevolucioness("Todos",informesdevolucionessSeleccionados ,informesdevolucionesImplementable,informesdevolucionesImplementableHome);
	}
	
	public void importarInformesDevolucioness() throws Exception {		
	
	}
	
	public void exportarInformesDevolucionessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelInformesDevolucionessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoInformesDevolucionessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlInformesDevolucionessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Informes Devoluciones",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoInformesDevolucionessSeleccionados() throws Exception {
		ArrayList<InformesDevoluciones> informesdevolucionessSeleccionados=new ArrayList<InformesDevoluciones>();		
		
		informesdevolucionessSeleccionados=this.getInformesDevolucionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"informesdevoluciones."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarInformesDevoluciones(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(InformesDevoluciones informesdevolucionesAux:informesdevolucionessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarInformesDevoluciones(informesdevolucionesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//informesdevolucionesAux.setsDetalleGeneralEntityReporte(informesdevolucionesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informes Devoluciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarInformesDevoluciones(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=InformesDevolucionesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformesDevolucionesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformesDevolucionesConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformesDevolucionesConstantesFunciones.LABEL_IDTIPODEVOLUCIONEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformesDevolucionesConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformesDevolucionesConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformesDevolucionesConstantesFunciones.LABEL_USERNAMEUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformesDevolucionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformesDevolucionesConstantesFunciones.LABEL_NUMEROPREIMPRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformesDevolucionesConstantesFunciones.LABEL_NOMBREBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformesDevolucionesConstantesFunciones.LABEL_NOMBREPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformesDevolucionesConstantesFunciones.LABEL_NOMBRETIPODEVOLUCIONEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformesDevolucionesConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=InformesDevolucionesConstantesFunciones.LABEL_CODIGOPRODUCTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarInformesDevoluciones(InformesDevoluciones informesdevoluciones,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=informesdevoluciones.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=informesdevoluciones.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=informesdevoluciones.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informesdevoluciones.gettipodevolucionempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informesdevoluciones.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informesdevoluciones.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informesdevoluciones.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informesdevoluciones.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informesdevoluciones.getuser_name_usuario();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informesdevoluciones.getnombre_completo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informesdevoluciones.getnumero_pre_impreso();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informesdevoluciones.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informesdevoluciones.getnombre_bodega();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informesdevoluciones.getnombre_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informesdevoluciones.getnombre_tipo_devolucion_empresa();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informesdevoluciones.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=informesdevoluciones.getcodigo_producto();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelInformesDevolucionessSeleccionados() throws Exception {
		ArrayList<InformesDevoluciones> informesdevolucionessSeleccionados=new ArrayList<InformesDevoluciones>();		
		
		informesdevolucionessSeleccionados=this.getInformesDevolucionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"informesdevoluciones.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("InformesDevolucioness");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelInformesDevoluciones(row);				
				iRow++;
			}				
			
			for(InformesDevoluciones informesdevolucionesAux:informesdevolucionessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelInformesDevoluciones(informesdevolucionesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informes Devoluciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlInformesDevolucionessSeleccionados() throws Exception {
		ArrayList<InformesDevoluciones> informesdevolucionessSeleccionados=new ArrayList<InformesDevoluciones>();		
		
		informesdevolucionessSeleccionados=this.getInformesDevolucionessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"informesdevoluciones.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("informesdevolucioness");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("informesdevoluciones");
			//elementRoot.appendChild(element);
		
			for(InformesDevoluciones informesdevolucionesAux:informesdevolucionessSeleccionados) {
				element = document.createElement("informesdevoluciones");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlInformesDevoluciones(informesdevolucionesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Informes Devoluciones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelInformesDevoluciones(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_IDTIPODEVOLUCIONEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_USERNAMEUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_NOMBREBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_NOMBREPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_NOMBRETIPODEVOLUCIONEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(InformesDevolucionesConstantesFunciones.LABEL_CODIGOPRODUCTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelInformesDevoluciones(InformesDevoluciones informesdevoluciones,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(informesdevoluciones.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(informesdevoluciones.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(informesdevoluciones.gettipodevolucionempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(informesdevoluciones.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(informesdevoluciones.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(informesdevoluciones.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(informesdevoluciones.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(informesdevoluciones.getuser_name_usuario());
		cell = row.createCell(iColumn++);cell.setCellValue(informesdevoluciones.getnombre_completo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(informesdevoluciones.getnumero_pre_impreso());
		cell = row.createCell(iColumn++);cell.setCellValue(informesdevoluciones.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(informesdevoluciones.getnombre_bodega());
		cell = row.createCell(iColumn++);cell.setCellValue(informesdevoluciones.getnombre_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(informesdevoluciones.getnombre_tipo_devolucion_empresa());
		cell = row.createCell(iColumn++);cell.setCellValue(informesdevoluciones.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(informesdevoluciones.getcodigo_producto());				
	}
	
	public void setFilaDatosExportarXmlInformesDevoluciones(InformesDevoluciones informesdevoluciones,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(InformesDevolucionesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(informesdevoluciones.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(InformesDevolucionesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(informesdevoluciones.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementproducto_descripcion = document.createElement(InformesDevolucionesConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(informesdevoluciones.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementtipodevolucionempresa_descripcion = document.createElement(InformesDevolucionesConstantesFunciones.IDTIPODEVOLUCIONEMPRESA);
		elementtipodevolucionempresa_descripcion.appendChild(document.createTextNode(informesdevoluciones.gettipodevolucionempresa_descripcion()));
		element.appendChild(elementtipodevolucionempresa_descripcion);

		Element elementempresa_descripcion = document.createElement(InformesDevolucionesConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(informesdevoluciones.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(InformesDevolucionesConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(informesdevoluciones.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementfecha_emision_desde = document.createElement(InformesDevolucionesConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(informesdevoluciones.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(InformesDevolucionesConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(informesdevoluciones.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementuser_name_usuario = document.createElement(InformesDevolucionesConstantesFunciones.USERNAMEUSUARIO);
		elementuser_name_usuario.appendChild(document.createTextNode(informesdevoluciones.getuser_name_usuario().trim()));
		element.appendChild(elementuser_name_usuario);

		Element elementnombre_completo_cliente = document.createElement(InformesDevolucionesConstantesFunciones.NOMBRECOMPLETOCLIENTE);
		elementnombre_completo_cliente.appendChild(document.createTextNode(informesdevoluciones.getnombre_completo_cliente().trim()));
		element.appendChild(elementnombre_completo_cliente);

		Element elementnumero_pre_impreso = document.createElement(InformesDevolucionesConstantesFunciones.NUMEROPREIMPRESO);
		elementnumero_pre_impreso.appendChild(document.createTextNode(informesdevoluciones.getnumero_pre_impreso().trim()));
		element.appendChild(elementnumero_pre_impreso);

		Element elementfecha_emision = document.createElement(InformesDevolucionesConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(informesdevoluciones.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementnombre_bodega = document.createElement(InformesDevolucionesConstantesFunciones.NOMBREBODEGA);
		elementnombre_bodega.appendChild(document.createTextNode(informesdevoluciones.getnombre_bodega().trim()));
		element.appendChild(elementnombre_bodega);

		Element elementnombre_producto = document.createElement(InformesDevolucionesConstantesFunciones.NOMBREPRODUCTO);
		elementnombre_producto.appendChild(document.createTextNode(informesdevoluciones.getnombre_producto().trim()));
		element.appendChild(elementnombre_producto);

		Element elementnombre_tipo_devolucion_empresa = document.createElement(InformesDevolucionesConstantesFunciones.NOMBRETIPODEVOLUCIONEMPRESA);
		elementnombre_tipo_devolucion_empresa.appendChild(document.createTextNode(informesdevoluciones.getnombre_tipo_devolucion_empresa().trim()));
		element.appendChild(elementnombre_tipo_devolucion_empresa);

		Element elementcantidad = document.createElement(InformesDevolucionesConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(informesdevoluciones.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementcodigo_producto = document.createElement(InformesDevolucionesConstantesFunciones.CODIGOPRODUCTO);
		elementcodigo_producto.appendChild(document.createTextNode(informesdevoluciones.getcodigo_producto().trim()));
		element.appendChild(elementcodigo_producto);
	}
	
	public void generarReporteGroupGenericoInformesDevolucionessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<InformesDevoluciones> informesdevolucionessSeleccionados=new ArrayList<InformesDevoluciones>();
		
		informesdevolucionessSeleccionados=this.getInformesDevolucionessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoInformesDevoluciones(informesdevolucionessSeleccionados);
		
		this.generarReporteInformesDevolucioness("Todos",informesdevolucionessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoInformesDevoluciones(ArrayList<InformesDevoluciones> informesdevolucionessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(InformesDevoluciones informesdevolucionesAux:informesdevolucionessSeleccionados) {
				informesdevolucionesAux.setsDetalleGeneralEntityReporte(informesdevolucionesAux.toString());
			
				if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					informesdevolucionesAux.setsDescripcionGeneralEntityReporte1(informesdevolucionesAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_IDTIPODEVOLUCIONEMPRESA)) {
					existe=true;
					informesdevolucionesAux.setsDescripcionGeneralEntityReporte1(informesdevolucionesAux.gettipodevolucionempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					informesdevolucionesAux.setsDescripcionGeneralEntityReporte1(informesdevolucionesAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					informesdevolucionesAux.setsDescripcionGeneralEntityReporte1(informesdevolucionesAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					informesdevolucionesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(informesdevolucionesAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					informesdevolucionesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(informesdevolucionesAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_USERNAMEUSUARIO)) {
					existe=true;
					informesdevolucionesAux.setsDescripcionGeneralEntityReporte1(informesdevolucionesAux.getuser_name_usuario());
				}
				 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
					existe=true;
					informesdevolucionesAux.setsDescripcionGeneralEntityReporte1(informesdevolucionesAux.getnombre_completo_cliente());
				}
				 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
					existe=true;
					informesdevolucionesAux.setsDescripcionGeneralEntityReporte1(informesdevolucionesAux.getnumero_pre_impreso());
				}
				 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					informesdevolucionesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(informesdevolucionesAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_NOMBREBODEGA)) {
					existe=true;
					informesdevolucionesAux.setsDescripcionGeneralEntityReporte1(informesdevolucionesAux.getnombre_bodega());
				}
				 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
					existe=true;
					informesdevolucionesAux.setsDescripcionGeneralEntityReporte1(informesdevolucionesAux.getnombre_producto());
				}
				 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_NOMBRETIPODEVOLUCIONEMPRESA)) {
					existe=true;
					informesdevolucionesAux.setsDescripcionGeneralEntityReporte1(informesdevolucionesAux.getnombre_tipo_devolucion_empresa());
				}
				 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					informesdevolucionesAux.setsDescripcionGeneralEntityReporte1(informesdevolucionesAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(InformesDevolucionesConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
					existe=true;
					informesdevolucionesAux.setsDescripcionGeneralEntityReporte1(informesdevolucionesAux.getcodigo_producto());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,InformesDevolucionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesInformesDevoluciones(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoInformesDevoluciones=true;
				this.isVisibilidadCeldaNuevoRelacionesInformesDevoluciones=true;
				this.isVisibilidadCeldaGuardarCambiosInformesDevoluciones=true;
			}
			
			this.isVisibilidadCeldaModificarInformesDevoluciones=false;
			this.isVisibilidadCeldaActualizarInformesDevoluciones=false;
			this.isVisibilidadCeldaEliminarInformesDevoluciones=false;
			this.isVisibilidadCeldaCancelarInformesDevoluciones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInformesDevoluciones=true;
				} else {
					this.isVisibilidadCeldaGuardarInformesDevoluciones=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoInformesDevoluciones=false;
			this.isVisibilidadCeldaNuevoRelacionesInformesDevoluciones=false;
			this.isVisibilidadCeldaGuardarCambiosInformesDevoluciones=false;
			this.isVisibilidadCeldaModificarInformesDevoluciones=false;
			this.isVisibilidadCeldaActualizarInformesDevoluciones=true;
			this.isVisibilidadCeldaEliminarInformesDevoluciones=false;
			this.isVisibilidadCeldaCancelarInformesDevoluciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInformesDevoluciones=true;
				} else {
					this.isVisibilidadCeldaGuardarInformesDevoluciones=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoInformesDevoluciones=false;
			this.isVisibilidadCeldaNuevoRelacionesInformesDevoluciones=false;
			this.isVisibilidadCeldaGuardarCambiosInformesDevoluciones=false;
			this.isVisibilidadCeldaModificarInformesDevoluciones=false;
			this.isVisibilidadCeldaActualizarInformesDevoluciones=true;
			this.isVisibilidadCeldaEliminarInformesDevoluciones=true;
			this.isVisibilidadCeldaCancelarInformesDevoluciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInformesDevoluciones=true;
				} else {
					this.isVisibilidadCeldaGuardarInformesDevoluciones=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoInformesDevoluciones=false;
			this.isVisibilidadCeldaNuevoRelacionesInformesDevoluciones=false;
			this.isVisibilidadCeldaGuardarCambiosInformesDevoluciones=false;
			this.isVisibilidadCeldaModificarInformesDevoluciones=false;
			this.isVisibilidadCeldaActualizarInformesDevoluciones=true;
			this.isVisibilidadCeldaEliminarInformesDevoluciones=false;
			this.isVisibilidadCeldaCancelarInformesDevoluciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInformesDevoluciones=false;
				} else {
					this.isVisibilidadCeldaGuardarInformesDevoluciones=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoInformesDevoluciones=true;
			this.isVisibilidadCeldaNuevoRelacionesInformesDevoluciones=true;
			this.isVisibilidadCeldaGuardarCambiosInformesDevoluciones=true;
			this.isVisibilidadCeldaModificarInformesDevoluciones=false;
			this.isVisibilidadCeldaActualizarInformesDevoluciones=false;
			this.isVisibilidadCeldaEliminarInformesDevoluciones=false;
			this.isVisibilidadCeldaCancelarInformesDevoluciones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInformesDevoluciones=true;
				} else {
					this.isVisibilidadCeldaGuardarInformesDevoluciones=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoInformesDevoluciones=false;
			this.isVisibilidadCeldaNuevoRelacionesInformesDevoluciones=false;
			this.isVisibilidadCeldaGuardarCambiosInformesDevoluciones=false;
			this.isVisibilidadCeldaActualizarInformesDevoluciones=false;
			this.isVisibilidadCeldaEliminarInformesDevoluciones=false;
			this.isVisibilidadCeldaCancelarInformesDevoluciones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInformesDevoluciones=false;
				} else {
					this.isVisibilidadCeldaGuardarInformesDevoluciones=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoInformesDevoluciones=false;
			this.isVisibilidadCeldaNuevoRelacionesInformesDevoluciones=false;
			this.isVisibilidadCeldaGuardarCambiosInformesDevoluciones=false;
			this.isVisibilidadCeldaModificarInformesDevoluciones=true;
			this.isVisibilidadCeldaActualizarInformesDevoluciones=false;
			this.isVisibilidadCeldaEliminarInformesDevoluciones=false;
			this.isVisibilidadCeldaCancelarInformesDevoluciones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarInformesDevoluciones=false;
				} else {
					this.isVisibilidadCeldaGuardarInformesDevoluciones=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(InformesDevolucionesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoInformesDevoluciones=true;
			this.isVisibilidadCeldaNuevoRelacionesInformesDevoluciones=true;
			this.isVisibilidadCeldaGuardarCambiosInformesDevoluciones=true;
		} else {
			this.actualizarEstadoPanelsInformesDevoluciones(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarInformesDevoluciones=false;
			//this.isVisibilidadCeldaVerFormInformesDevoluciones=false;
			this.isVisibilidadCeldaDuplicarInformesDevoluciones=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!informesdevolucionesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesInformesDevoluciones=false;
		} else {
			this.isVisibilidadCeldaNuevoInformesDevoluciones=false;
			this.isVisibilidadCeldaGuardarCambiosInformesDevoluciones=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(informesdevolucionesSessionBean.getEsGuardarRelacionado()) {
			if(!informesdevolucionesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesInformesDevoluciones=false;												
			}
			
			this.jButtonCerrarInformesDevoluciones.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesInformesDevoluciones=false;
		}
		
		if(!this.permiteMantenimiento(this.informesdevoluciones)) {
			this.isVisibilidadCeldaActualizarInformesDevoluciones=false;
			this.isVisibilidadCeldaEliminarInformesDevoluciones=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoInformesDevoluciones=false;
		this.isVisibilidadCeldaNuevoRelacionesInformesDevoluciones=false;
		this.isVisibilidadCeldaGuardarCambiosInformesDevoluciones=false;
		//this.isVisibilidadCeldaModificarInformesDevoluciones=true;
		this.isVisibilidadCeldaActualizarInformesDevoluciones=false;
		this.isVisibilidadCeldaEliminarInformesDevoluciones=false;
		//this.isVisibilidadCeldaCancelarInformesDevoluciones=true;			
		this.isVisibilidadCeldaGuardarInformesDevoluciones=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesInformesDevoluciones() {
	}
	
	public void actualizarEstadoPanelsInformesDevoluciones(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionInformesDevoluciones!=null) {
				this.jScrollPanelDatosEdicionInformesDevoluciones.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformesDevoluciones!=null) {
				this.jTabbedPaneBusquedasInformesDevoluciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosInformesDevoluciones!=null) {
				this.jScrollPanelDatosInformesDevoluciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionInformesDevoluciones!=null) {
				this.jPanelPaginacionInformesDevoluciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesInformesDevoluciones!=null) {
				this.jPanelParametrosReportesInformesDevoluciones.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionInformesDevoluciones!=null) {
				this.jScrollPanelDatosEdicionInformesDevoluciones.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformesDevoluciones!=null) {
				this.jTabbedPaneBusquedasInformesDevoluciones.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosInformesDevoluciones!=null) {
				this.jScrollPanelDatosInformesDevoluciones.setVisible(false);
			}
			
			if(this.jPanelPaginacionInformesDevoluciones!=null) {
				this.jPanelPaginacionInformesDevoluciones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesInformesDevoluciones!=null) {
				this.jPanelParametrosReportesInformesDevoluciones.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionInformesDevoluciones!=null) {
				this.jScrollPanelDatosEdicionInformesDevoluciones.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformesDevoluciones!=null) {
				this.jTabbedPaneBusquedasInformesDevoluciones.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosInformesDevoluciones!=null) {
				this.jScrollPanelDatosInformesDevoluciones.setVisible(false);
			}
			
			if(this.jPanelPaginacionInformesDevoluciones!=null) {
				this.jPanelPaginacionInformesDevoluciones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesInformesDevoluciones!=null) {
				this.jPanelParametrosReportesInformesDevoluciones.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionInformesDevoluciones!=null) {
				this.jScrollPanelDatosEdicionInformesDevoluciones.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformesDevoluciones!=null) {
				this.jTabbedPaneBusquedasInformesDevoluciones.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosInformesDevoluciones!=null) {
				this.jScrollPanelDatosInformesDevoluciones.setVisible(false);
			}
			
			if(this.jPanelPaginacionInformesDevoluciones!=null) {
				this.jPanelPaginacionInformesDevoluciones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesInformesDevoluciones!=null) {
				this.jPanelParametrosReportesInformesDevoluciones.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionInformesDevoluciones!=null) {
				this.jScrollPanelDatosEdicionInformesDevoluciones.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformesDevoluciones!=null) {
				this.jTabbedPaneBusquedasInformesDevoluciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosInformesDevoluciones!=null) {
				this.jScrollPanelDatosInformesDevoluciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionInformesDevoluciones!=null) {
				this.jPanelPaginacionInformesDevoluciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesInformesDevoluciones!=null) {
				this.jPanelParametrosReportesInformesDevoluciones.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionInformesDevoluciones!=null) {
				this.jScrollPanelDatosEdicionInformesDevoluciones.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformesDevoluciones!=null) {
				this.jTabbedPaneBusquedasInformesDevoluciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosInformesDevoluciones!=null) {
				this.jScrollPanelDatosInformesDevoluciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionInformesDevoluciones!=null) {
				this.jPanelPaginacionInformesDevoluciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesInformesDevoluciones!=null) {
				this.jPanelParametrosReportesInformesDevoluciones.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionInformesDevoluciones!=null) {
				this.jScrollPanelDatosEdicionInformesDevoluciones.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformesDevoluciones!=null) {
				this.jTabbedPaneBusquedasInformesDevoluciones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosInformesDevoluciones!=null) {
				this.jScrollPanelDatosInformesDevoluciones.setVisible(true);
			}
			
			if(this.jPanelPaginacionInformesDevoluciones!=null) {
				this.jPanelPaginacionInformesDevoluciones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesInformesDevoluciones!=null) {
				this.jPanelParametrosReportesInformesDevoluciones.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasInformesDevoluciones!=null) {
					this.jTabbedPaneBusquedasInformesDevoluciones.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesInformesDevoluciones!=null) {
				this.jPanelParametrosReportesInformesDevoluciones.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.informesdevolucionesSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasInformesDevoluciones!=null) {
				this.jTabbedPaneBusquedasInformesDevoluciones.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesInformesDevoluciones!=null) {
				this.jPanelParametrosReportesInformesDevoluciones.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadBusquedaInformesDevoluciones=isParaProducto;
			if(!this.isVisibilidadBusquedaInformesDevoluciones) {this.jTabbedPaneBusquedasInformesDevoluciones.remove(jPanelBusquedaInformesDevolucionesInformesDevoluciones);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoDevolucionEmpresa(Boolean isParaTipoDevolucionEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoDevolucionEmpresaNegation=!isParaTipoDevolucionEmpresa;

			this.isVisibilidadBusquedaInformesDevoluciones=isParaTipoDevolucionEmpresa;
			if(!this.isVisibilidadBusquedaInformesDevoluciones) {this.jTabbedPaneBusquedasInformesDevoluciones.remove(jPanelBusquedaInformesDevolucionesInformesDevoluciones);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaInformesDevoluciones=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaInformesDevoluciones) {this.jTabbedPaneBusquedasInformesDevoluciones.remove(jPanelBusquedaInformesDevolucionesInformesDevoluciones);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaInformesDevoluciones=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaInformesDevoluciones) {this.jTabbedPaneBusquedasInformesDevoluciones.remove(jPanelBusquedaInformesDevolucionesInformesDevoluciones);}
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
			
			this.inicializarActualizarBindingTablaInformesDevoluciones(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioInformesDevoluciones() {
		this.updateBorderResaltarBusquedasFormularioInformesDevoluciones();
		this.updateVisibilidadBusquedasFormularioInformesDevoluciones();
		this.updateHabilitarBusquedasFormularioInformesDevoluciones();
	}
	
	public void updateBorderResaltarBusquedasFormularioInformesDevoluciones() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasInformesDevoluciones.getComponents().length>0) {
	

		if(this.informesdevolucionesConstantesFunciones.resaltarBusquedaInformesDevolucionesInformesDevoluciones!=null) {
			index= this.jTabbedPaneBusquedasInformesDevoluciones.indexOfComponent(this.jPanelBusquedaInformesDevolucionesInformesDevoluciones);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasInformesDevoluciones.getComponent(index);
				jPanel.setBorder(this.informesdevolucionesConstantesFunciones.resaltarBusquedaInformesDevolucionesInformesDevoluciones);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioInformesDevoluciones() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasInformesDevoluciones.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasInformesDevoluciones.indexOfComponent(this.jPanelBusquedaInformesDevolucionesInformesDevoluciones);
			jPanel=(JPanel)this.jTabbedPaneBusquedasInformesDevoluciones.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.informesdevolucionesConstantesFunciones.mostrarBusquedaInformesDevolucionesInformesDevoluciones);
			if(!this.informesdevolucionesConstantesFunciones.mostrarBusquedaInformesDevolucionesInformesDevoluciones && index>-1) {
				this.jTabbedPaneBusquedasInformesDevoluciones.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioInformesDevoluciones() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasInformesDevoluciones.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasInformesDevoluciones.indexOfComponent(this.jPanelBusquedaInformesDevolucionesInformesDevoluciones);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasInformesDevoluciones.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.informesdevolucionesConstantesFunciones.activarBusquedaInformesDevolucionesInformesDevoluciones);
				this.jTabbedPaneBusquedasInformesDevoluciones.setEnabledAt(index,this.informesdevolucionesConstantesFunciones.activarBusquedaInformesDevolucionesInformesDevoluciones);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaInformesDevoluciones(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaInformesDevoluciones")) {
			index= this.jTabbedPaneBusquedasInformesDevoluciones.indexOfComponent(this.jPanelBusquedaInformesDevolucionesInformesDevoluciones);

			this.jTabbedPaneBusquedasInformesDevoluciones.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasInformesDevoluciones.getComponent(index);

			this.informesdevolucionesConstantesFunciones.setResaltarBusquedaInformesDevolucionesInformesDevoluciones(resaltar);

			jPanel.setBorder(this.informesdevolucionesConstantesFunciones.resaltarBusquedaInformesDevolucionesInformesDevoluciones);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarInformesDevoluciones.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioInformesDevoluciones() throws Exception {

		if(this.jInternalFrameDetalleFormInformesDevoluciones==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioInformesDevoluciones();
		this.updateVisibilidadResaltarControlesFormularioInformesDevoluciones();
		this.updateHabilitarResaltarControlesFormularioInformesDevoluciones();
		
	}
	
	public void updateBorderResaltarControlesFormularioInformesDevoluciones() throws Exception {
		if(this.jInternalFrameDetalleFormInformesDevoluciones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.informesdevolucionesConstantesFunciones.resaltaridInformesDevoluciones!=null && this.jInternalFrameDetalleFormInformesDevoluciones!=null) {this.jInternalFrameDetalleFormInformesDevoluciones.jLabelidInformesDevoluciones.setBorder(this.informesdevolucionesConstantesFunciones.resaltaridInformesDevoluciones);}
		if(this.informesdevolucionesConstantesFunciones.resaltarid_productoInformesDevoluciones!=null && this.jInternalFrameDetalleFormInformesDevoluciones!=null) {this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_productoInformesDevoluciones.setBorder(this.informesdevolucionesConstantesFunciones.resaltarid_productoInformesDevoluciones);}
		if(this.informesdevolucionesConstantesFunciones.resaltarid_tipo_devolucion_empresaInformesDevoluciones!=null && this.jInternalFrameDetalleFormInformesDevoluciones!=null) {this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_tipo_devolucion_empresaInformesDevoluciones.setBorder(this.informesdevolucionesConstantesFunciones.resaltarid_tipo_devolucion_empresaInformesDevoluciones);}
		if(this.informesdevolucionesConstantesFunciones.resaltarid_empresaInformesDevoluciones!=null && this.jInternalFrameDetalleFormInformesDevoluciones!=null) {this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_empresaInformesDevoluciones.setBorder(this.informesdevolucionesConstantesFunciones.resaltarid_empresaInformesDevoluciones);}
		if(this.informesdevolucionesConstantesFunciones.resaltarid_sucursalInformesDevoluciones!=null && this.jInternalFrameDetalleFormInformesDevoluciones!=null) {this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_sucursalInformesDevoluciones.setBorder(this.informesdevolucionesConstantesFunciones.resaltarid_sucursalInformesDevoluciones);}
		if(this.informesdevolucionesConstantesFunciones.resaltarfecha_emision_desdeInformesDevoluciones!=null && this.jInternalFrameDetalleFormInformesDevoluciones!=null) {this.jInternalFrameDetalleFormInformesDevoluciones.jDateChooserfecha_emision_desdeInformesDevoluciones.setBorder(this.informesdevolucionesConstantesFunciones.resaltarfecha_emision_desdeInformesDevoluciones);}
		if(this.informesdevolucionesConstantesFunciones.resaltarfecha_emision_hastaInformesDevoluciones!=null && this.jInternalFrameDetalleFormInformesDevoluciones!=null) {this.jInternalFrameDetalleFormInformesDevoluciones.jDateChooserfecha_emision_hastaInformesDevoluciones.setBorder(this.informesdevolucionesConstantesFunciones.resaltarfecha_emision_hastaInformesDevoluciones);}
		if(this.informesdevolucionesConstantesFunciones.resaltaruser_name_usuarioInformesDevoluciones!=null && this.jInternalFrameDetalleFormInformesDevoluciones!=null) {this.jInternalFrameDetalleFormInformesDevoluciones.jTextFielduser_name_usuarioInformesDevoluciones.setBorder(this.informesdevolucionesConstantesFunciones.resaltaruser_name_usuarioInformesDevoluciones);}
		if(this.informesdevolucionesConstantesFunciones.resaltarnombre_completo_clienteInformesDevoluciones!=null && this.jInternalFrameDetalleFormInformesDevoluciones!=null) {this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_completo_clienteInformesDevoluciones.setBorder(this.informesdevolucionesConstantesFunciones.resaltarnombre_completo_clienteInformesDevoluciones);}
		if(this.informesdevolucionesConstantesFunciones.resaltarnumero_pre_impresoInformesDevoluciones!=null && this.jInternalFrameDetalleFormInformesDevoluciones!=null) {this.jInternalFrameDetalleFormInformesDevoluciones.jTextFieldnumero_pre_impresoInformesDevoluciones.setBorder(this.informesdevolucionesConstantesFunciones.resaltarnumero_pre_impresoInformesDevoluciones);}
		if(this.informesdevolucionesConstantesFunciones.resaltarfecha_emisionInformesDevoluciones!=null && this.jInternalFrameDetalleFormInformesDevoluciones!=null) {this.jInternalFrameDetalleFormInformesDevoluciones.jDateChooserfecha_emisionInformesDevoluciones.setBorder(this.informesdevolucionesConstantesFunciones.resaltarfecha_emisionInformesDevoluciones);}
		if(this.informesdevolucionesConstantesFunciones.resaltarnombre_bodegaInformesDevoluciones!=null && this.jInternalFrameDetalleFormInformesDevoluciones!=null) {this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_bodegaInformesDevoluciones.setBorder(this.informesdevolucionesConstantesFunciones.resaltarnombre_bodegaInformesDevoluciones);}
		if(this.informesdevolucionesConstantesFunciones.resaltarnombre_productoInformesDevoluciones!=null && this.jInternalFrameDetalleFormInformesDevoluciones!=null) {this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_productoInformesDevoluciones.setBorder(this.informesdevolucionesConstantesFunciones.resaltarnombre_productoInformesDevoluciones);}
		if(this.informesdevolucionesConstantesFunciones.resaltarnombre_tipo_devolucion_empresaInformesDevoluciones!=null && this.jInternalFrameDetalleFormInformesDevoluciones!=null) {this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_tipo_devolucion_empresaInformesDevoluciones.setBorder(this.informesdevolucionesConstantesFunciones.resaltarnombre_tipo_devolucion_empresaInformesDevoluciones);}
		if(this.informesdevolucionesConstantesFunciones.resaltarcantidadInformesDevoluciones!=null && this.jInternalFrameDetalleFormInformesDevoluciones!=null) {this.jInternalFrameDetalleFormInformesDevoluciones.jTextFieldcantidadInformesDevoluciones.setBorder(this.informesdevolucionesConstantesFunciones.resaltarcantidadInformesDevoluciones);}
		if(this.informesdevolucionesConstantesFunciones.resaltarcodigo_productoInformesDevoluciones!=null && this.jInternalFrameDetalleFormInformesDevoluciones!=null) {this.jInternalFrameDetalleFormInformesDevoluciones.jTextFieldcodigo_productoInformesDevoluciones.setBorder(this.informesdevolucionesConstantesFunciones.resaltarcodigo_productoInformesDevoluciones);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioInformesDevoluciones() throws Exception {		
		if(this.jInternalFrameDetalleFormInformesDevoluciones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
	
		//this.jInternalFrameDetalleFormInformesDevoluciones.jLabelidInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostraridInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jPanelidInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostraridInformesDevoluciones);
		//this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_productoInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostrarid_productoInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jPanelid_productoInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostrarid_productoInformesDevoluciones);
		//this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_tipo_devolucion_empresaInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostrarid_tipo_devolucion_empresaInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jPanelid_tipo_devolucion_empresaInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostrarid_tipo_devolucion_empresaInformesDevoluciones);
		//this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_empresaInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostrarid_empresaInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jPanelid_empresaInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostrarid_empresaInformesDevoluciones);
		//this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_sucursalInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostrarid_sucursalInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jPanelid_sucursalInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostrarid_sucursalInformesDevoluciones);
		//this.jInternalFrameDetalleFormInformesDevoluciones.jDateChooserfecha_emision_desdeInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostrarfecha_emision_desdeInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jPanelfecha_emision_desdeInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostrarfecha_emision_desdeInformesDevoluciones);
		//this.jInternalFrameDetalleFormInformesDevoluciones.jDateChooserfecha_emision_hastaInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostrarfecha_emision_hastaInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jPanelfecha_emision_hastaInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostrarfecha_emision_hastaInformesDevoluciones);
		//this.jInternalFrameDetalleFormInformesDevoluciones.jTextFielduser_name_usuarioInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostraruser_name_usuarioInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jPaneluser_name_usuarioInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostraruser_name_usuarioInformesDevoluciones);
		//this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_completo_clienteInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostrarnombre_completo_clienteInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jPanelnombre_completo_clienteInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostrarnombre_completo_clienteInformesDevoluciones);
		//this.jInternalFrameDetalleFormInformesDevoluciones.jTextFieldnumero_pre_impresoInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostrarnumero_pre_impresoInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jPanelnumero_pre_impresoInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostrarnumero_pre_impresoInformesDevoluciones);
		//this.jInternalFrameDetalleFormInformesDevoluciones.jDateChooserfecha_emisionInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostrarfecha_emisionInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jPanelfecha_emisionInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostrarfecha_emisionInformesDevoluciones);
		//this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_bodegaInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostrarnombre_bodegaInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jPanelnombre_bodegaInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostrarnombre_bodegaInformesDevoluciones);
		//this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_productoInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostrarnombre_productoInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jPanelnombre_productoInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostrarnombre_productoInformesDevoluciones);
		//this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_tipo_devolucion_empresaInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostrarnombre_tipo_devolucion_empresaInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jPanelnombre_tipo_devolucion_empresaInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostrarnombre_tipo_devolucion_empresaInformesDevoluciones);
		//this.jInternalFrameDetalleFormInformesDevoluciones.jTextFieldcantidadInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostrarcantidadInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jPanelcantidadInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostrarcantidadInformesDevoluciones);
		//this.jInternalFrameDetalleFormInformesDevoluciones.jTextFieldcodigo_productoInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostrarcodigo_productoInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jPanelcodigo_productoInformesDevoluciones.setVisible(this.informesdevolucionesConstantesFunciones.mostrarcodigo_productoInformesDevoluciones);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioInformesDevoluciones() throws Exception {
		if(this.jInternalFrameDetalleFormInformesDevoluciones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormInformesDevoluciones!=null) {
	
		this.jInternalFrameDetalleFormInformesDevoluciones.jLabelidInformesDevoluciones.setEnabled(this.informesdevolucionesConstantesFunciones.activaridInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_productoInformesDevoluciones.setEnabled(this.informesdevolucionesConstantesFunciones.activarid_productoInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_tipo_devolucion_empresaInformesDevoluciones.setEnabled(this.informesdevolucionesConstantesFunciones.activarid_tipo_devolucion_empresaInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_empresaInformesDevoluciones.setEnabled(this.informesdevolucionesConstantesFunciones.activarid_empresaInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jComboBoxid_sucursalInformesDevoluciones.setEnabled(this.informesdevolucionesConstantesFunciones.activarid_sucursalInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jDateChooserfecha_emision_desdeInformesDevoluciones.setEnabled(this.informesdevolucionesConstantesFunciones.activarfecha_emision_desdeInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jDateChooserfecha_emision_hastaInformesDevoluciones.setEnabled(this.informesdevolucionesConstantesFunciones.activarfecha_emision_hastaInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jTextFielduser_name_usuarioInformesDevoluciones.setEnabled(this.informesdevolucionesConstantesFunciones.activaruser_name_usuarioInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_completo_clienteInformesDevoluciones.setEnabled(this.informesdevolucionesConstantesFunciones.activarnombre_completo_clienteInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jTextFieldnumero_pre_impresoInformesDevoluciones.setEnabled(this.informesdevolucionesConstantesFunciones.activarnumero_pre_impresoInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jDateChooserfecha_emisionInformesDevoluciones.setEnabled(this.informesdevolucionesConstantesFunciones.activarfecha_emisionInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_bodegaInformesDevoluciones.setEnabled(this.informesdevolucionesConstantesFunciones.activarnombre_bodegaInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_productoInformesDevoluciones.setEnabled(this.informesdevolucionesConstantesFunciones.activarnombre_productoInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jTextAreanombre_tipo_devolucion_empresaInformesDevoluciones.setEnabled(this.informesdevolucionesConstantesFunciones.activarnombre_tipo_devolucion_empresaInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jTextFieldcantidadInformesDevoluciones.setEnabled(this.informesdevolucionesConstantesFunciones.activarcantidadInformesDevoluciones);
		this.jInternalFrameDetalleFormInformesDevoluciones.jTextFieldcodigo_productoInformesDevoluciones.setEnabled(this.informesdevolucionesConstantesFunciones.activarcodigo_productoInformesDevoluciones);
		}
	}
	
		
}